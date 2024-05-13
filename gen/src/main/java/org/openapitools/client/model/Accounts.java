/*
 * Data Access Platform Query API
 * [Datasets](tables/index.html) | [Entity relationship diagram](erd/index.html) | [PostgreSQL schema](sql/postgresql.sql) | [MySQL schema](sql/mysql.sql) | [JSON schema](schema.json)  # Data representation  Snapshot and incremental queries in Data Access Platform (DAP) write output to AWS S3 buckets, and return pre-signed URLs to files (objects) in S3. Output comprises of records exported from data tables, and optional metadata associated with them.  ## Data formats  DAP API supports several output data formats, including text (TSV), CSV and JSON. Data in all formats is transferred with GZIP compression.  ### Text (TSV)  Text format is a simple tabular format in which each record (table row) occupies a single line.  * Output always begins with a header row, which lists all metadata and data field names. * Fields (table columns) are delimited by *tab* characters. * Non-printable characters and special values are escaped with *backslash* (`\\`), as shown below:  | Escape | Interpretation               | | ------ | ---------------------------- | | `\\N`   | NULL value                   | | `\\b`   | Backspace (ASCII 8)          | | `\\f`   | Form feed (ASCII 12)         | | `\\n`   | Newline (ASCII 10)           | | `\\r`   | Carriage return (ASCII 13)   | | `\\t`   | Tab (ASCII 9)                | | `\\v`   | Vertical tab (ASCII 11)      | | `\\\\`   | Backslash (single character) |  This format allows data to be easily imported into a database engine, e.g. with PostgreSQL [COPY](https://www.postgresql.org/docs/current/sql-copy.html).  Output in this format is transmitted as media type `text/plain` in UTF-8 encoding.  ### Comma-separated values (CSV)  Comma-separated values (CSV) output follows [RFC 4180](https://www.ietf.org/rfc/rfc4180.html) with a few extensions:  * Output always begins with a header row, which lists all metadata and data field names. * Strings are quoted with double quotes (`\"`) if they contain special characters such as the double quote itself, the comma delimiter, a newline, a carriage return, a tab character, etc. * Empty strings are always represented as `\"\"` to avoid ambiguity with missing values. * Missing values (a.k.a. `NULL`) are represented with no data (no characters between delimiters). * Each row has the same number of fields.  These extensions allow differentiating empty strings (`\"\"`) from missing values (a.k.a. `NULL`, represented as no data), for which RFC 4180 defines no rules. If a field is missing, the comma separators are still included, i.e. multiple comma separators may follow one another in a row if there is no data in subsequent fields.  Double quotes act as escape sequences inside a quoted string. If there are two consecutive double quote characters (i.e. `\"\"`), the sequence is interpreted as a single double quote character (`\"`). If a string contains newline or carriage return characters, they are emitted verbatim (in compliance with RFC 4180). As such, a record may be broken into several lines if the data contains newlines. (Some applications might not interpret these flawlessly, double-check your integration when you deal with CSV files.)  The following example demonstrates some of the above: ```csv meta.action,key.pkey,value.prop1,value.prop2 U,1,a string,42 U,2,\"a string, but in \"\"quotes\"\".\", D,3,, U,4,\"a multi-line string\", ```  Output in this format is transmitted as media type `text/csv` in UTF-8 encoding.  ### JSON Lines  When the output data is represented in the [JSON Lines](https://jsonlines.org/) format, each record (table row) occupies a single line. Each line is a JSON object, which can be validated against the JSON schema returned by DAP API.  Output in this format is transmitted as media type `application/jsonlines` in UTF-8 encoding.  ## Metadata  Output of DAP API may include record-level metadata in addition to table data.  In tabular formats (such as text and CSV), metadata are included in the output as additional columns. Consider the following example: ```csv meta.action,key.pkey,value.prop1,value.prop2 U,1,\"value1\",42 U,2,\"value2\",NULL D,3,, ```  This CSV output has a metadata section (`meta`), a primary key section (`key`) and a record value section (`value`). The metadata section contains a single field called `action`. The key and value sections comprise of several fields: `pkey`, `prop1` and `prop2`.  In the JSON Lines format, metadata, key and value sections are top-level properties `meta`, `key` and `value`, and have properties of their own: ```json { \"meta\": { \"action\": \"U\", ... }, \"key\": { \"pkey\": 1 }, \"value\": { \"prop1\": \"value1\", \"prop2\": 42 } } { \"meta\": { \"action\": \"U\", ... }, \"key\": { \"pkey\": 2 }, \"value\": { \"prop1\": \"value2\", \"prop2\": null } } { \"meta\": { \"action\": \"D\", ... }, \"key\": { \"pkey\": 3 } } ```  The set of metadata fields returned depends on the context. Some contexts may produce fields that other contexts do not. If output would contain no metadata fields, the section is omitted entirely.  ### Action  The metadata field `action` identifies whether a record is *upserted* (inserted or updated) or *(hard) deleted* for an incremental query. In the result of a snapshot query, all records are to be understood as upserted.  * Upserted records (denoted by `U`) have all fields present in the data. * Deleted records (denoted by `D`) only have the primary key field in their data, other field values are missing.  Occasionally, the term *soft delete* is used, which in this context is equivalent to an update, and is denoted with a `U`, and all field values are included in the output.  ### Timestamp  The metadata field `ts` indicates when a record was last updated in the underlying transactional data lake table. For an incremental query with `since` and `until` timestamp parameters, `ts` for all returned records is always strictly greater than `since`, and always less than or equal to `until`.  The timestamp may correlate to but does not correspond to the real time when the event took place (e.g. when a student enrolled to a course). If you need to know when the event happened, use the timestamp embedded in the data. Specifically, many tables have timestamp data columns such as `created_at` or `updated_at`, which are controlled by the product or application that generates the event (e.g. Canvas).  Timestamps are stored in fields of JSON type `string`, are formatted as per ISO-8601, and are to be understood as in time zone UTC. This is aligned with how timestamps are represented in the OpenAPI format `date-time` as per [RFC 3339](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14).  ## Format transformations  Tabular data formats such as CSV cannot capture the hierarchy that JSON can represent easily. Nested JSON objects are flattened before they are included in the output. For example, consider the JSON data: ```json {     \"id\": 1,     \"question\": {         \"headline\": \"title\",         \"text\": \"some text\"     },     \"answers\": [         { \"answer\": \"A\", \"score\": 0 },         { \"answer\": \"B\", \"score\": 1 },         { \"answer\": \"C\", \"score\": 0 }     ] } ``` Here, the property `question` with two fixed sub-properties can be flattened into CSV columns `question.headline` and `question.text`. However, the property `answers` cannot be flattened because the list has an indeterminate cardinality. Items with indeterminate cardinality are transmitted as a JSON string. (Cardinality check is performed on the data (JSON) schema, not the actual data.)  This is how text output would look like after flattening (tabs are shown as four spaces): ``` data.id    data.question.headline    data.question.text    data.answers 1    title    some text    [{\"answer\":\"A\",\"score\":0},{\"answer\":\"B\",\"score\":1},{\"answer\":\"C\",\"score\":0}] ```  In a similar fashion, this is how CSV output would look after flattening: ```csv data.id,data.question.headline,data.question.text,data.answers 1,title,some text,\"[{\"\"answer\"\":\"\"A\"\",\"\"score\"\":0},{\"\"answer\"\":\"\"B\"\",\"\"score\"\":1},{\"\"answer\"\":\"\"C\"\",\"\"score\"\":0}]\" ```  If you wish to avoid format transformations entirely, use the JSON Lines data format. 
 *
 * The version of the OpenAPI document: 0.9.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Accounts are most often used to represent a hierarchy of colleges, schools, departments, campuses.
 */
@JsonPropertyOrder({
  Accounts.JSON_PROPERTY_ID,
  Accounts.JSON_PROPERTY_NAME,
  Accounts.JSON_PROPERTY_DELETED_AT,
  Accounts.JSON_PROPERTY_PARENT_ACCOUNT_ID,
  Accounts.JSON_PROPERTY_CURRENT_SIS_BATCH_ID,
  Accounts.JSON_PROPERTY_STORAGE_QUOTA,
  Accounts.JSON_PROPERTY_DEFAULT_STORAGE_QUOTA,
  Accounts.JSON_PROPERTY_DEFAULT_LOCALE,
  Accounts.JSON_PROPERTY_DEFAULT_USER_STORAGE_QUOTA,
  Accounts.JSON_PROPERTY_DEFAULT_GROUP_STORAGE_QUOTA,
  Accounts.JSON_PROPERTY_INTEGRATION_ID,
  Accounts.JSON_PROPERTY_LTI_CONTEXT_ID,
  Accounts.JSON_PROPERTY_CONSORTIUM_PARENT_ACCOUNT_ID,
  Accounts.JSON_PROPERTY_COURSE_TEMPLATE_ID,
  Accounts.JSON_PROPERTY_CREATED_AT,
  Accounts.JSON_PROPERTY_UPDATED_AT,
  Accounts.JSON_PROPERTY_WORKFLOW_STATE,
  Accounts.JSON_PROPERTY_DEFAULT_TIME_ZONE,
  Accounts.JSON_PROPERTY_UUID,
  Accounts.JSON_PROPERTY_SIS_SOURCE_ID
})
@JsonTypeName("accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Accounts {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PARENT_ACCOUNT_ID = "parent_account_id";
  private JsonNullable<Object> parentAccountId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CURRENT_SIS_BATCH_ID = "current_sis_batch_id";
  private JsonNullable<Object> currentSisBatchId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STORAGE_QUOTA = "storage_quota";
  private JsonNullable<Object> storageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_STORAGE_QUOTA = "default_storage_quota";
  private JsonNullable<Object> defaultStorageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_LOCALE = "default_locale";
  private JsonNullable<Object> defaultLocale = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_USER_STORAGE_QUOTA = "default_user_storage_quota";
  private JsonNullable<Object> defaultUserStorageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_GROUP_STORAGE_QUOTA = "default_group_storage_quota";
  private JsonNullable<Object> defaultGroupStorageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private JsonNullable<Object> integrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LTI_CONTEXT_ID = "lti_context_id";
  private JsonNullable<Object> ltiContextId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONSORTIUM_PARENT_ACCOUNT_ID = "consortium_parent_account_id";
  private JsonNullable<Object> consortiumParentAccountId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_TEMPLATE_ID = "course_template_id";
  private JsonNullable<Object> courseTemplateId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for account.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted"),
    
    SUSPENDED("suspended");

    private Object value;

    WorkflowStateEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WorkflowStateEnum fromValue(Object value) {
      for (WorkflowStateEnum b : WorkflowStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_WORKFLOW_STATE = "workflow_state";
  private WorkflowStateEnum workflowState = null;

  public static final String JSON_PROPERTY_DEFAULT_TIME_ZONE = "default_time_zone";
  private JsonNullable<Object> defaultTimeZone = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UUID = "uuid";
  private JsonNullable<Object> uuid = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_SOURCE_ID = "sis_source_id";
  private JsonNullable<Object> sisSourceId = JsonNullable.<Object>of(null);

  public Accounts() {
  }

  public Accounts id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Account object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Object id) {
    this.id = id;
  }


  public Accounts name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * The display name of the account.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<Object> name) {
    this.name = name;
  }

  public void setName(Object name) {
    this.name = JsonNullable.<Object>of(name);
  }


  public Accounts deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp of when the account was deleted. Will only ever be NULL for end customers.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDeletedAt() {
        return deletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDeletedAt_JsonNullable() {
    return deletedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  public void setDeletedAt_JsonNullable(JsonNullable<Object> deletedAt) {
    this.deletedAt = deletedAt;
  }

  public void setDeletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
  }


  public Accounts parentAccountId(Object parentAccountId) {
    this.parentAccountId = JsonNullable.<Object>of(parentAccountId);
    
    return this;
  }

   /**
   * The account&#39;s parent ID, or NULL if this is the root account.
   * @return parentAccountId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getParentAccountId() {
        return parentAccountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getParentAccountId_JsonNullable() {
    return parentAccountId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ACCOUNT_ID)
  public void setParentAccountId_JsonNullable(JsonNullable<Object> parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  public void setParentAccountId(Object parentAccountId) {
    this.parentAccountId = JsonNullable.<Object>of(parentAccountId);
  }


  public Accounts currentSisBatchId(Object currentSisBatchId) {
    this.currentSisBatchId = JsonNullable.<Object>of(currentSisBatchId);
    
    return this;
  }

   /**
   * The ID of the currently processing SIS (Student Information System) batch (if submitted via UI, not API).
   * @return currentSisBatchId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCurrentSisBatchId() {
        return currentSisBatchId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENT_SIS_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCurrentSisBatchId_JsonNullable() {
    return currentSisBatchId;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_SIS_BATCH_ID)
  public void setCurrentSisBatchId_JsonNullable(JsonNullable<Object> currentSisBatchId) {
    this.currentSisBatchId = currentSisBatchId;
  }

  public void setCurrentSisBatchId(Object currentSisBatchId) {
    this.currentSisBatchId = JsonNullable.<Object>of(currentSisBatchId);
  }


  public Accounts storageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
    
    return this;
  }

   /**
   * The storage quote for the account, in megabytes.
   * @return storageQuota
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStorageQuota() {
        return storageQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STORAGE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStorageQuota_JsonNullable() {
    return storageQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_STORAGE_QUOTA)
  public void setStorageQuota_JsonNullable(JsonNullable<Object> storageQuota) {
    this.storageQuota = storageQuota;
  }

  public void setStorageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
  }


  public Accounts defaultStorageQuota(Object defaultStorageQuota) {
    this.defaultStorageQuota = JsonNullable.<Object>of(defaultStorageQuota);
    
    return this;
  }

   /**
   * The storage quota for children accounts in megabytes, if not otherwise specified.
   * @return defaultStorageQuota
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultStorageQuota() {
        return defaultStorageQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_STORAGE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultStorageQuota_JsonNullable() {
    return defaultStorageQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_STORAGE_QUOTA)
  public void setDefaultStorageQuota_JsonNullable(JsonNullable<Object> defaultStorageQuota) {
    this.defaultStorageQuota = defaultStorageQuota;
  }

  public void setDefaultStorageQuota(Object defaultStorageQuota) {
    this.defaultStorageQuota = JsonNullable.<Object>of(defaultStorageQuota);
  }


  public Accounts defaultLocale(Object defaultLocale) {
    this.defaultLocale = JsonNullable.<Object>of(defaultLocale);
    
    return this;
  }

   /**
   * Language for the account.
   * @return defaultLocale
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultLocale() {
        return defaultLocale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultLocale_JsonNullable() {
    return defaultLocale;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_LOCALE)
  public void setDefaultLocale_JsonNullable(JsonNullable<Object> defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public void setDefaultLocale(Object defaultLocale) {
    this.defaultLocale = JsonNullable.<Object>of(defaultLocale);
  }


  public Accounts defaultUserStorageQuota(Object defaultUserStorageQuota) {
    this.defaultUserStorageQuota = JsonNullable.<Object>of(defaultUserStorageQuota);
    
    return this;
  }

   /**
   * The default storage quota for users in the account in megabytes, if not otherwise specified.
   * @return defaultUserStorageQuota
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultUserStorageQuota() {
        return defaultUserStorageQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_USER_STORAGE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultUserStorageQuota_JsonNullable() {
    return defaultUserStorageQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_USER_STORAGE_QUOTA)
  public void setDefaultUserStorageQuota_JsonNullable(JsonNullable<Object> defaultUserStorageQuota) {
    this.defaultUserStorageQuota = defaultUserStorageQuota;
  }

  public void setDefaultUserStorageQuota(Object defaultUserStorageQuota) {
    this.defaultUserStorageQuota = JsonNullable.<Object>of(defaultUserStorageQuota);
  }


  public Accounts defaultGroupStorageQuota(Object defaultGroupStorageQuota) {
    this.defaultGroupStorageQuota = JsonNullable.<Object>of(defaultGroupStorageQuota);
    
    return this;
  }

   /**
   * The storage quota for a group in the account in megabytes, if not otherwise specified.
   * @return defaultGroupStorageQuota
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultGroupStorageQuota() {
        return defaultGroupStorageQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_GROUP_STORAGE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultGroupStorageQuota_JsonNullable() {
    return defaultGroupStorageQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_GROUP_STORAGE_QUOTA)
  public void setDefaultGroupStorageQuota_JsonNullable(JsonNullable<Object> defaultGroupStorageQuota) {
    this.defaultGroupStorageQuota = defaultGroupStorageQuota;
  }

  public void setDefaultGroupStorageQuota(Object defaultGroupStorageQuota) {
    this.defaultGroupStorageQuota = JsonNullable.<Object>of(defaultGroupStorageQuota);
  }


  public Accounts integrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
    
    return this;
  }

   /**
   * The account&#39;s identifier in the Student Information System.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIntegrationId() {
        return integrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIntegrationId_JsonNullable() {
    return integrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  public void setIntegrationId_JsonNullable(JsonNullable<Object> integrationId) {
    this.integrationId = integrationId;
  }

  public void setIntegrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
  }


  public Accounts ltiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
    
    return this;
  }

   /**
   * UUID of the Canvas context in LTI standard. Secondary ID for this context, could be used in API to identify resource as well.
   * @return ltiContextId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLtiContextId() {
        return ltiContextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLtiContextId_JsonNullable() {
    return ltiContextId;
  }
  
  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  public void setLtiContextId_JsonNullable(JsonNullable<Object> ltiContextId) {
    this.ltiContextId = ltiContextId;
  }

  public void setLtiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
  }


  public Accounts consortiumParentAccountId(Object consortiumParentAccountId) {
    this.consortiumParentAccountId = JsonNullable.<Object>of(consortiumParentAccountId);
    
    return this;
  }

   /**
   * The root account of the consortium account, if this root account is part of a consortium.
   * @return consortiumParentAccountId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConsortiumParentAccountId() {
        return consortiumParentAccountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONSORTIUM_PARENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConsortiumParentAccountId_JsonNullable() {
    return consortiumParentAccountId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONSORTIUM_PARENT_ACCOUNT_ID)
  public void setConsortiumParentAccountId_JsonNullable(JsonNullable<Object> consortiumParentAccountId) {
    this.consortiumParentAccountId = consortiumParentAccountId;
  }

  public void setConsortiumParentAccountId(Object consortiumParentAccountId) {
    this.consortiumParentAccountId = JsonNullable.<Object>of(consortiumParentAccountId);
  }


  public Accounts courseTemplateId(Object courseTemplateId) {
    this.courseTemplateId = JsonNullable.<Object>of(courseTemplateId);
    
    return this;
  }

   /**
   * The course selected as a template for new courses created in this account. 0 if a template should not be used, nor inherited.
   * @return courseTemplateId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseTemplateId() {
        return courseTemplateId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseTemplateId_JsonNullable() {
    return courseTemplateId;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_TEMPLATE_ID)
  public void setCourseTemplateId_JsonNullable(JsonNullable<Object> courseTemplateId) {
    this.courseTemplateId = courseTemplateId;
  }

  public void setCourseTemplateId(Object courseTemplateId) {
    this.courseTemplateId = JsonNullable.<Object>of(courseTemplateId);
  }


  public Accounts createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the account was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Object createdAt) {
    this.createdAt = createdAt;
  }


  public Accounts updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the account was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(Object updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Accounts workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for account.
   * @return workflowState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkflowStateEnum getWorkflowState() {
    return workflowState;
  }


  @JsonProperty(JSON_PROPERTY_WORKFLOW_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkflowState(WorkflowStateEnum workflowState) {
    this.workflowState = workflowState;
  }


  public Accounts defaultTimeZone(Object defaultTimeZone) {
    this.defaultTimeZone = JsonNullable.<Object>of(defaultTimeZone);
    
    return this;
  }

   /**
   * The default time zone of the account. Allowed time zones are [IANA time zones](https://www.iana.org/time-zones) or friendlier [Ruby on Rails time zones](https://api.rubyonrails.org/classes/ActiveSupport/TimeZone.html).
   * @return defaultTimeZone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultTimeZone() {
        return defaultTimeZone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultTimeZone_JsonNullable() {
    return defaultTimeZone;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_TIME_ZONE)
  public void setDefaultTimeZone_JsonNullable(JsonNullable<Object> defaultTimeZone) {
    this.defaultTimeZone = defaultTimeZone;
  }

  public void setDefaultTimeZone(Object defaultTimeZone) {
    this.defaultTimeZone = JsonNullable.<Object>of(defaultTimeZone);
  }


  public Accounts uuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
    
    return this;
  }

   /**
   * The UUID of the account.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUuid() {
        return uuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUuid_JsonNullable() {
    return uuid;
  }
  
  @JsonProperty(JSON_PROPERTY_UUID)
  public void setUuid_JsonNullable(JsonNullable<Object> uuid) {
    this.uuid = uuid;
  }

  public void setUuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
  }


  public Accounts sisSourceId(Object sisSourceId) {
    this.sisSourceId = JsonNullable.<Object>of(sisSourceId);
    
    return this;
  }

   /**
   * Correlated id for the record for this course in the SIS system (assuming SIS integration is configured)
   * @return sisSourceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSisSourceId() {
        return sisSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIS_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSisSourceId_JsonNullable() {
    return sisSourceId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIS_SOURCE_ID)
  public void setSisSourceId_JsonNullable(JsonNullable<Object> sisSourceId) {
    this.sisSourceId = sisSourceId;
  }

  public void setSisSourceId(Object sisSourceId) {
    this.sisSourceId = JsonNullable.<Object>of(sisSourceId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accounts accounts = (Accounts) o;
    return Objects.equals(this.id, accounts.id) &&
        equalsNullable(this.name, accounts.name) &&
        equalsNullable(this.deletedAt, accounts.deletedAt) &&
        equalsNullable(this.parentAccountId, accounts.parentAccountId) &&
        equalsNullable(this.currentSisBatchId, accounts.currentSisBatchId) &&
        equalsNullable(this.storageQuota, accounts.storageQuota) &&
        equalsNullable(this.defaultStorageQuota, accounts.defaultStorageQuota) &&
        equalsNullable(this.defaultLocale, accounts.defaultLocale) &&
        equalsNullable(this.defaultUserStorageQuota, accounts.defaultUserStorageQuota) &&
        equalsNullable(this.defaultGroupStorageQuota, accounts.defaultGroupStorageQuota) &&
        equalsNullable(this.integrationId, accounts.integrationId) &&
        equalsNullable(this.ltiContextId, accounts.ltiContextId) &&
        equalsNullable(this.consortiumParentAccountId, accounts.consortiumParentAccountId) &&
        equalsNullable(this.courseTemplateId, accounts.courseTemplateId) &&
        Objects.equals(this.createdAt, accounts.createdAt) &&
        Objects.equals(this.updatedAt, accounts.updatedAt) &&
        Objects.equals(this.workflowState, accounts.workflowState) &&
        equalsNullable(this.defaultTimeZone, accounts.defaultTimeZone) &&
        equalsNullable(this.uuid, accounts.uuid) &&
        equalsNullable(this.sisSourceId, accounts.sisSourceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(deletedAt), hashCodeNullable(parentAccountId), hashCodeNullable(currentSisBatchId), hashCodeNullable(storageQuota), hashCodeNullable(defaultStorageQuota), hashCodeNullable(defaultLocale), hashCodeNullable(defaultUserStorageQuota), hashCodeNullable(defaultGroupStorageQuota), hashCodeNullable(integrationId), hashCodeNullable(ltiContextId), hashCodeNullable(consortiumParentAccountId), hashCodeNullable(courseTemplateId), createdAt, updatedAt, workflowState, hashCodeNullable(defaultTimeZone), hashCodeNullable(uuid), hashCodeNullable(sisSourceId));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accounts {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
    sb.append("    currentSisBatchId: ").append(toIndentedString(currentSisBatchId)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    defaultStorageQuota: ").append(toIndentedString(defaultStorageQuota)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    defaultUserStorageQuota: ").append(toIndentedString(defaultUserStorageQuota)).append("\n");
    sb.append("    defaultGroupStorageQuota: ").append(toIndentedString(defaultGroupStorageQuota)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    ltiContextId: ").append(toIndentedString(ltiContextId)).append("\n");
    sb.append("    consortiumParentAccountId: ").append(toIndentedString(consortiumParentAccountId)).append("\n");
    sb.append("    courseTemplateId: ").append(toIndentedString(courseTemplateId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    defaultTimeZone: ").append(toIndentedString(defaultTimeZone)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    sisSourceId: ").append(toIndentedString(sisSourceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

