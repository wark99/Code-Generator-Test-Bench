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
import org.openapitools.client.model.GroupsDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Groups contain two or more students enrolled in a particular course working on an assignment or project together.
 */
@JsonPropertyOrder({
  Groups.JSON_PROPERTY_ID,
  Groups.JSON_PROPERTY_NAME,
  Groups.JSON_PROPERTY_DELETED_AT,
  Groups.JSON_PROPERTY_STORAGE_QUOTA,
  Groups.JSON_PROPERTY_LTI_CONTEXT_ID,
  Groups.JSON_PROPERTY_CREATED_AT,
  Groups.JSON_PROPERTY_UPDATED_AT,
  Groups.JSON_PROPERTY_WORKFLOW_STATE,
  Groups.JSON_PROPERTY_ACCOUNT_ID,
  Groups.JSON_PROPERTY_SIS_BATCH_ID,
  Groups.JSON_PROPERTY_CONTEXT_ID,
  Groups.JSON_PROPERTY_CONTEXT_TYPE,
  Groups.JSON_PROPERTY_MIGRATION_ID,
  Groups.JSON_PROPERTY_GROUP_CATEGORY_ID,
  Groups.JSON_PROPERTY_SIS_SOURCE_ID,
  Groups.JSON_PROPERTY_IS_PUBLIC,
  Groups.JSON_PROPERTY_WIKI_ID,
  Groups.JSON_PROPERTY_MAX_MEMBERSHIP,
  Groups.JSON_PROPERTY_JOIN_LEVEL,
  Groups.JSON_PROPERTY_AVATAR_ATTACHMENT_ID,
  Groups.JSON_PROPERTY_LEADER_ID,
  Groups.JSON_PROPERTY_DESCRIPTION,
  Groups.JSON_PROPERTY_UUID,
  Groups.JSON_PROPERTY_DEFAULT_VIEW
})
@JsonTypeName("groups")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Groups {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STORAGE_QUOTA = "storage_quota";
  private JsonNullable<Object> storageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LTI_CONTEXT_ID = "lti_context_id";
  private JsonNullable<Object> ltiContextId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the group.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    AVAILABLE("available"),
    
    DELETED("deleted"),
    
    ACTIVE("active");

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

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private Object accountId = null;

  public static final String JSON_PROPERTY_SIS_BATCH_ID = "sis_batch_id";
  private JsonNullable<Object> sisBatchId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The course or account that the group belongs to. The pattern here is that whatever the &#x60;context_type&#x60; is, there will be an &#x60;_id&#x60; field named after that type. So if instead &#x60;context_type&#x60; was &#x60;account&#x60;, the &#x60;course_id&#x60; field would be replaced by an &#x60;account_id&#x60; field.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    COURSE("Course");

    private Object value;

    ContextTypeEnum(Object value) {
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
    public static ContextTypeEnum fromValue(Object value) {
      for (ContextTypeEnum b : ContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CONTEXT_TYPE = "context_type";
  private ContextTypeEnum contextType = null;

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_CATEGORY_ID = "group_category_id";
  private JsonNullable<Object> groupCategoryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_SOURCE_ID = "sis_source_id";
  private JsonNullable<Object> sisSourceId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  private JsonNullable<Object> isPublic = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WIKI_ID = "wiki_id";
  private JsonNullable<Object> wikiId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MAX_MEMBERSHIP = "max_membership";
  private JsonNullable<Object> maxMembership = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_JOIN_LEVEL = "join_level";
  private JsonNullable<Object> joinLevel = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AVATAR_ATTACHMENT_ID = "avatar_attachment_id";
  private JsonNullable<Object> avatarAttachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LEADER_ID = "leader_id";
  private JsonNullable<Object> leaderId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private GroupsDescription description;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private Object uuid = null;

  /**
   * Default view for groups is the feed.
   */
  public enum DefaultViewEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    FEED("feed");

    private Object value;

    DefaultViewEnum(Object value) {
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
    public static DefaultViewEnum fromValue(Object value) {
      for (DefaultViewEnum b : DefaultViewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_DEFAULT_VIEW = "default_view";
  private JsonNullable<DefaultViewEnum> defaultView = JsonNullable.<DefaultViewEnum>of(null);

  public Groups() {
  }

  public Groups id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the group.
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


  public Groups name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * The display name of the group.
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


  public Groups deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp when the group was deleted.
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


  public Groups storageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
    
    return this;
  }

   /**
   * The storage quota for the group.
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


  public Groups ltiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
    
    return this;
  }

   /**
   * UUID of the Canvas context in LTI standard. secondary ID for this context, could be used in API to identify resource as well.
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


  public Groups createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the group was first saved in the system.
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


  public Groups updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp when the group was last updated in the system.
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


  public Groups workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the group.
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


  public Groups accountId(Object accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifies the associated account, groups could be owned by sub-accounts.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Object accountId) {
    this.accountId = accountId;
  }


  public Groups sisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
    
    return this;
  }

   /**
   * The ID of the SIS import if created through SIS.
   * @return sisBatchId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSisBatchId() {
        return sisBatchId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIS_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSisBatchId_JsonNullable() {
    return sisBatchId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIS_BATCH_ID)
  public void setSisBatchId_JsonNullable(JsonNullable<Object> sisBatchId) {
    this.sisBatchId = sisBatchId;
  }

  public void setSisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
  }


  public Groups contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context (account or course) this group belongs too. See also: context_type.
   * @return contextId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContextId(Object contextId) {
    this.contextId = contextId;
  }


  public Groups contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The course or account that the group belongs to. The pattern here is that whatever the &#x60;context_type&#x60; is, there will be an &#x60;_id&#x60; field named after that type. So if instead &#x60;context_type&#x60; was &#x60;account&#x60;, the &#x60;course_id&#x60; field would be replaced by an &#x60;account_id&#x60; field.
   * @return contextType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContextTypeEnum getContextType() {
    return contextType;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
  }


  public Groups migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported this group.
   * @return migrationId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMigrationId() {
        return migrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMigrationId_JsonNullable() {
    return migrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_MIGRATION_ID)
  public void setMigrationId_JsonNullable(JsonNullable<Object> migrationId) {
    this.migrationId = migrationId;
  }

  public void setMigrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
  }


  public Groups groupCategoryId(Object groupCategoryId) {
    this.groupCategoryId = JsonNullable.<Object>of(groupCategoryId);
    
    return this;
  }

   /**
   * The ID of the group&#39;s category.
   * @return groupCategoryId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGroupCategoryId() {
        return groupCategoryId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGroupCategoryId_JsonNullable() {
    return groupCategoryId;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_CATEGORY_ID)
  public void setGroupCategoryId_JsonNullable(JsonNullable<Object> groupCategoryId) {
    this.groupCategoryId = groupCategoryId;
  }

  public void setGroupCategoryId(Object groupCategoryId) {
    this.groupCategoryId = JsonNullable.<Object>of(groupCategoryId);
  }


  public Groups sisSourceId(Object sisSourceId) {
    this.sisSourceId = JsonNullable.<Object>of(sisSourceId);
    
    return this;
  }

   /**
   * The SIS ID of the group.
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


  public Groups isPublic(Object isPublic) {
    this.isPublic = JsonNullable.<Object>of(isPublic);
    
    return this;
  }

   /**
   * Whether or not the group is public. Currently only community groups can be made public. Also, once a group has been set to public, it cannot be changed back to private.
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIsPublic() {
        return isPublic.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIsPublic_JsonNullable() {
    return isPublic;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  public void setIsPublic_JsonNullable(JsonNullable<Object> isPublic) {
    this.isPublic = isPublic;
  }

  public void setIsPublic(Object isPublic) {
    this.isPublic = JsonNullable.<Object>of(isPublic);
  }


  public Groups wikiId(Object wikiId) {
    this.wikiId = JsonNullable.<Object>of(wikiId);
    
    return this;
  }

   /**
   * The ID of an associated wiki page.
   * @return wikiId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWikiId() {
        return wikiId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIKI_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWikiId_JsonNullable() {
    return wikiId;
  }
  
  @JsonProperty(JSON_PROPERTY_WIKI_ID)
  public void setWikiId_JsonNullable(JsonNullable<Object> wikiId) {
    this.wikiId = wikiId;
  }

  public void setWikiId(Object wikiId) {
    this.wikiId = JsonNullable.<Object>of(wikiId);
  }


  public Groups maxMembership(Object maxMembership) {
    this.maxMembership = JsonNullable.<Object>of(maxMembership);
    
    return this;
  }

   /**
   * The maximum number of participating users in the group.
   * @return maxMembership
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMaxMembership() {
        return maxMembership.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMaxMembership_JsonNullable() {
    return maxMembership;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_MEMBERSHIP)
  public void setMaxMembership_JsonNullable(JsonNullable<Object> maxMembership) {
    this.maxMembership = maxMembership;
  }

  public void setMaxMembership(Object maxMembership) {
    this.maxMembership = JsonNullable.<Object>of(maxMembership);
  }


  public Groups joinLevel(Object joinLevel) {
    this.joinLevel = JsonNullable.<Object>of(joinLevel);
    
    return this;
  }

   /**
   * How people are allowed to join the group. For all groups except for community groups, the user must share the group&#39;s parent course or account. For student organized or community groups, where a user can be a member of as many or few as they want, the applicable levels are &#x60;parent_context_auto_join&#x60;, &#x60;parent_context_request&#x60;, and &#x60;invitation_only&#x60;. For class groups, where students are divided up and should only be part of one group of the category, this value will always be &#x60;invitation_only&#x60;, and is not relevant. If &#x60;parent_context_auto_join&#x60;, anyone can join and will be automatically accepted. If &#x60;parent_context_request&#x60;, anyone can request to join, which must be approved by a group moderator. If &#x60;invitation_only&#x60;, only those how have received an invitation my join the group, by accepting that invitation.
   * @return joinLevel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getJoinLevel() {
        return joinLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOIN_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getJoinLevel_JsonNullable() {
    return joinLevel;
  }
  
  @JsonProperty(JSON_PROPERTY_JOIN_LEVEL)
  public void setJoinLevel_JsonNullable(JsonNullable<Object> joinLevel) {
    this.joinLevel = joinLevel;
  }

  public void setJoinLevel(Object joinLevel) {
    this.joinLevel = JsonNullable.<Object>of(joinLevel);
  }


  public Groups avatarAttachmentId(Object avatarAttachmentId) {
    this.avatarAttachmentId = JsonNullable.<Object>of(avatarAttachmentId);
    
    return this;
  }

   /**
   * Foreign key to the &#x60;attachments&#x60; table for the avatar of this group.
   * @return avatarAttachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAvatarAttachmentId() {
        return avatarAttachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAvatarAttachmentId_JsonNullable() {
    return avatarAttachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_ATTACHMENT_ID)
  public void setAvatarAttachmentId_JsonNullable(JsonNullable<Object> avatarAttachmentId) {
    this.avatarAttachmentId = avatarAttachmentId;
  }

  public void setAvatarAttachmentId(Object avatarAttachmentId) {
    this.avatarAttachmentId = JsonNullable.<Object>of(avatarAttachmentId);
  }


  public Groups leaderId(Object leaderId) {
    this.leaderId = JsonNullable.<Object>of(leaderId);
    
    return this;
  }

   /**
   * Foreign key to the &#x60;users&#x60; table for the leader of this group.
   * @return leaderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLeaderId() {
        return leaderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEADER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLeaderId_JsonNullable() {
    return leaderId;
  }
  
  @JsonProperty(JSON_PROPERTY_LEADER_ID)
  public void setLeaderId_JsonNullable(JsonNullable<Object> leaderId) {
    this.leaderId = leaderId;
  }

  public void setLeaderId(Object leaderId) {
    this.leaderId = JsonNullable.<Object>of(leaderId);
  }


  public Groups description(GroupsDescription description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupsDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(GroupsDescription description) {
    this.description = description;
  }


  public Groups uuid(Object uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The UUID of the group.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUuid(Object uuid) {
    this.uuid = uuid;
  }


  public Groups defaultView(DefaultViewEnum defaultView) {
    this.defaultView = JsonNullable.<DefaultViewEnum>of(defaultView);
    
    return this;
  }

   /**
   * Default view for groups is the feed.
   * @return defaultView
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public DefaultViewEnum getDefaultView() {
        return defaultView.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DefaultViewEnum> getDefaultView_JsonNullable() {
    return defaultView;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_VIEW)
  public void setDefaultView_JsonNullable(JsonNullable<DefaultViewEnum> defaultView) {
    this.defaultView = defaultView;
  }

  public void setDefaultView(DefaultViewEnum defaultView) {
    this.defaultView = JsonNullable.<DefaultViewEnum>of(defaultView);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groups groups = (Groups) o;
    return Objects.equals(this.id, groups.id) &&
        equalsNullable(this.name, groups.name) &&
        equalsNullable(this.deletedAt, groups.deletedAt) &&
        equalsNullable(this.storageQuota, groups.storageQuota) &&
        equalsNullable(this.ltiContextId, groups.ltiContextId) &&
        Objects.equals(this.createdAt, groups.createdAt) &&
        Objects.equals(this.updatedAt, groups.updatedAt) &&
        Objects.equals(this.workflowState, groups.workflowState) &&
        Objects.equals(this.accountId, groups.accountId) &&
        equalsNullable(this.sisBatchId, groups.sisBatchId) &&
        Objects.equals(this.contextId, groups.contextId) &&
        Objects.equals(this.contextType, groups.contextType) &&
        equalsNullable(this.migrationId, groups.migrationId) &&
        equalsNullable(this.groupCategoryId, groups.groupCategoryId) &&
        equalsNullable(this.sisSourceId, groups.sisSourceId) &&
        equalsNullable(this.isPublic, groups.isPublic) &&
        equalsNullable(this.wikiId, groups.wikiId) &&
        equalsNullable(this.maxMembership, groups.maxMembership) &&
        equalsNullable(this.joinLevel, groups.joinLevel) &&
        equalsNullable(this.avatarAttachmentId, groups.avatarAttachmentId) &&
        equalsNullable(this.leaderId, groups.leaderId) &&
        Objects.equals(this.description, groups.description) &&
        Objects.equals(this.uuid, groups.uuid) &&
        equalsNullable(this.defaultView, groups.defaultView);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(deletedAt), hashCodeNullable(storageQuota), hashCodeNullable(ltiContextId), createdAt, updatedAt, workflowState, accountId, hashCodeNullable(sisBatchId), contextId, contextType, hashCodeNullable(migrationId), hashCodeNullable(groupCategoryId), hashCodeNullable(sisSourceId), hashCodeNullable(isPublic), hashCodeNullable(wikiId), hashCodeNullable(maxMembership), hashCodeNullable(joinLevel), hashCodeNullable(avatarAttachmentId), hashCodeNullable(leaderId), description, uuid, hashCodeNullable(defaultView));
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
    sb.append("class Groups {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    ltiContextId: ").append(toIndentedString(ltiContextId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    sisBatchId: ").append(toIndentedString(sisBatchId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    groupCategoryId: ").append(toIndentedString(groupCategoryId)).append("\n");
    sb.append("    sisSourceId: ").append(toIndentedString(sisSourceId)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    wikiId: ").append(toIndentedString(wikiId)).append("\n");
    sb.append("    maxMembership: ").append(toIndentedString(maxMembership)).append("\n");
    sb.append("    joinLevel: ").append(toIndentedString(joinLevel)).append("\n");
    sb.append("    avatarAttachmentId: ").append(toIndentedString(avatarAttachmentId)).append("\n");
    sb.append("    leaderId: ").append(toIndentedString(leaderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
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

