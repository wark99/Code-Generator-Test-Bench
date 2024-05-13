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
 * Pseudonyms are login profiles associated with users. Contains user / account relationship (may contain multiple records per &#x60;user_id&#x60; if that &#x60;user_id&#x60; is associated with multiple accounts); note: not all users can be found in the pseudonyms table.
 */
@JsonPropertyOrder({
  Pseudonyms.JSON_PROPERTY_ID,
  Pseudonyms.JSON_PROPERTY_DELETED_AT,
  Pseudonyms.JSON_PROPERTY_INTEGRATION_ID,
  Pseudonyms.JSON_PROPERTY_USER_ID,
  Pseudonyms.JSON_PROPERTY_CREATED_AT,
  Pseudonyms.JSON_PROPERTY_UPDATED_AT,
  Pseudonyms.JSON_PROPERTY_WORKFLOW_STATE,
  Pseudonyms.JSON_PROPERTY_ACCOUNT_ID,
  Pseudonyms.JSON_PROPERTY_SIS_BATCH_ID,
  Pseudonyms.JSON_PROPERTY_UNIQUE_ID,
  Pseudonyms.JSON_PROPERTY_LOGIN_COUNT,
  Pseudonyms.JSON_PROPERTY_FAILED_LOGIN_COUNT,
  Pseudonyms.JSON_PROPERTY_LAST_REQUEST_AT,
  Pseudonyms.JSON_PROPERTY_LAST_LOGIN_AT,
  Pseudonyms.JSON_PROPERTY_CURRENT_LOGIN_AT,
  Pseudonyms.JSON_PROPERTY_LAST_LOGIN_IP,
  Pseudonyms.JSON_PROPERTY_CURRENT_LOGIN_IP,
  Pseudonyms.JSON_PROPERTY_SIS_USER_ID,
  Pseudonyms.JSON_PROPERTY_AUTHENTICATION_PROVIDER_ID,
  Pseudonyms.JSON_PROPERTY_POSITION
})
@JsonTypeName("pseudonyms")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Pseudonyms {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private JsonNullable<Object> integrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Object userId = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the pseudonym.
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

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private Object accountId = null;

  public static final String JSON_PROPERTY_SIS_BATCH_ID = "sis_batch_id";
  private JsonNullable<Object> sisBatchId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private Object uniqueId = null;

  public static final String JSON_PROPERTY_LOGIN_COUNT = "login_count";
  private Object loginCount = null;

  public static final String JSON_PROPERTY_FAILED_LOGIN_COUNT = "failed_login_count";
  private Object failedLoginCount = null;

  public static final String JSON_PROPERTY_LAST_REQUEST_AT = "last_request_at";
  private JsonNullable<Object> lastRequestAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_LOGIN_AT = "last_login_at";
  private JsonNullable<Object> lastLoginAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CURRENT_LOGIN_AT = "current_login_at";
  private JsonNullable<Object> currentLoginAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_LOGIN_IP = "last_login_ip";
  private JsonNullable<Object> lastLoginIp = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CURRENT_LOGIN_IP = "current_login_ip";
  private JsonNullable<Object> currentLoginIp = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_USER_ID = "sis_user_id";
  private JsonNullable<Object> sisUserId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AUTHENTICATION_PROVIDER_ID = "authentication_provider_id";
  private JsonNullable<Object> authenticationProviderId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public Pseudonyms() {
  }

  public Pseudonyms id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Primary key for this pseudonym in the the Canvas database.
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


  public Pseudonyms deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp when the pseudonym was deleted (NULL if the pseudonym is still active).
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


  public Pseudonyms integrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
    
    return this;
  }

   /**
   * The &#x60;integration_id&#x60; associated with the user.
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


  public Pseudonyms userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Id for the user associated with this pseudonym.
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(Object userId) {
    this.userId = userId;
  }


  public Pseudonyms createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when this pseudonym was created in Canvas.
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


  public Pseudonyms updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp when this pseudonym was last updated in Canvas.
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


  public Pseudonyms workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the pseudonym.
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


  public Pseudonyms accountId(Object accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifies the account associated with this pseudonym. Typically root account ID unless account user belongs to trust/consortium based Canvas accounts.
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


  public Pseudonyms sisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
    
    return this;
  }

   /**
   * The ID of the SIS import.
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


  public Pseudonyms uniqueId(Object uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * The unique login ID for the user. This is what the user uses to log in to Canvas.
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueId(Object uniqueId) {
    this.uniqueId = uniqueId;
  }


  public Pseudonyms loginCount(Object loginCount) {
    
    this.loginCount = loginCount;
    return this;
  }

   /**
   * The count of all user logins.
   * @return loginCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getLoginCount() {
    return loginCount;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoginCount(Object loginCount) {
    this.loginCount = loginCount;
  }


  public Pseudonyms failedLoginCount(Object failedLoginCount) {
    
    this.failedLoginCount = failedLoginCount;
    return this;
  }

   /**
   * Only applies to accounts that use Canvas authentication settings.
   * @return failedLoginCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_LOGIN_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFailedLoginCount() {
    return failedLoginCount;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_LOGIN_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFailedLoginCount(Object failedLoginCount) {
    this.failedLoginCount = failedLoginCount;
  }


  public Pseudonyms lastRequestAt(Object lastRequestAt) {
    this.lastRequestAt = JsonNullable.<Object>of(lastRequestAt);
    
    return this;
  }

   /**
   * Timestamp of when the user last logged in with this pseudonym.
   * @return lastRequestAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastRequestAt() {
        return lastRequestAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_REQUEST_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastRequestAt_JsonNullable() {
    return lastRequestAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_REQUEST_AT)
  public void setLastRequestAt_JsonNullable(JsonNullable<Object> lastRequestAt) {
    this.lastRequestAt = lastRequestAt;
  }

  public void setLastRequestAt(Object lastRequestAt) {
    this.lastRequestAt = JsonNullable.<Object>of(lastRequestAt);
  }


  public Pseudonyms lastLoginAt(Object lastLoginAt) {
    this.lastLoginAt = JsonNullable.<Object>of(lastLoginAt);
    
    return this;
  }

   /**
   * Timestamp of last time a user logged in with this pseudonym.
   * @return lastLoginAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastLoginAt() {
        return lastLoginAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastLoginAt_JsonNullable() {
    return lastLoginAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_AT)
  public void setLastLoginAt_JsonNullable(JsonNullable<Object> lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  public void setLastLoginAt(Object lastLoginAt) {
    this.lastLoginAt = JsonNullable.<Object>of(lastLoginAt);
  }


  public Pseudonyms currentLoginAt(Object currentLoginAt) {
    this.currentLoginAt = JsonNullable.<Object>of(currentLoginAt);
    
    return this;
  }

   /**
   * Timestamp of when the user logged in.
   * @return currentLoginAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCurrentLoginAt() {
        return currentLoginAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENT_LOGIN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCurrentLoginAt_JsonNullable() {
    return currentLoginAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_LOGIN_AT)
  public void setCurrentLoginAt_JsonNullable(JsonNullable<Object> currentLoginAt) {
    this.currentLoginAt = currentLoginAt;
  }

  public void setCurrentLoginAt(Object currentLoginAt) {
    this.currentLoginAt = JsonNullable.<Object>of(currentLoginAt);
  }


  public Pseudonyms lastLoginIp(Object lastLoginIp) {
    this.lastLoginIp = JsonNullable.<Object>of(lastLoginIp);
    
    return this;
  }

   /**
   * IP address recorded the last time a user logged in with this pseudonym.
   * @return lastLoginIp
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastLoginIp() {
        return lastLoginIp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastLoginIp_JsonNullable() {
    return lastLoginIp;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_IP)
  public void setLastLoginIp_JsonNullable(JsonNullable<Object> lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }

  public void setLastLoginIp(Object lastLoginIp) {
    this.lastLoginIp = JsonNullable.<Object>of(lastLoginIp);
  }


  public Pseudonyms currentLoginIp(Object currentLoginIp) {
    this.currentLoginIp = JsonNullable.<Object>of(currentLoginIp);
    
    return this;
  }

   /**
   * IP address of user&#39;s previous login id, this value could be the same as last_login_ip.
   * @return currentLoginIp
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCurrentLoginIp() {
        return currentLoginIp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENT_LOGIN_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCurrentLoginIp_JsonNullable() {
    return currentLoginIp;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_LOGIN_IP)
  public void setCurrentLoginIp_JsonNullable(JsonNullable<Object> currentLoginIp) {
    this.currentLoginIp = currentLoginIp;
  }

  public void setCurrentLoginIp(Object currentLoginIp) {
    this.currentLoginIp = JsonNullable.<Object>of(currentLoginIp);
  }


  public Pseudonyms sisUserId(Object sisUserId) {
    this.sisUserId = JsonNullable.<Object>of(sisUserId);
    
    return this;
  }

   /**
   * The SIS ID associated with the user.
   * @return sisUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSisUserId() {
        return sisUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIS_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSisUserId_JsonNullable() {
    return sisUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIS_USER_ID)
  public void setSisUserId_JsonNullable(JsonNullable<Object> sisUserId) {
    this.sisUserId = sisUserId;
  }

  public void setSisUserId(Object sisUserId) {
    this.sisUserId = JsonNullable.<Object>of(sisUserId);
  }


  public Pseudonyms authenticationProviderId(Object authenticationProviderId) {
    this.authenticationProviderId = JsonNullable.<Object>of(authenticationProviderId);
    
    return this;
  }

   /**
   * The authentication provider this login is associated with. This can be the integer ID of the provider, or the type of the provider (in which case, it will find the first matching provider).
   * @return authenticationProviderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAuthenticationProviderId() {
        return authenticationProviderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAuthenticationProviderId_JsonNullable() {
    return authenticationProviderId;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_PROVIDER_ID)
  public void setAuthenticationProviderId_JsonNullable(JsonNullable<Object> authenticationProviderId) {
    this.authenticationProviderId = authenticationProviderId;
  }

  public void setAuthenticationProviderId(Object authenticationProviderId) {
    this.authenticationProviderId = JsonNullable.<Object>of(authenticationProviderId);
  }


  public Pseudonyms position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * Position of user&#39;s login credentials.
   * @return position
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPosition() {
        return position.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPosition_JsonNullable() {
    return position;
  }
  
  @JsonProperty(JSON_PROPERTY_POSITION)
  public void setPosition_JsonNullable(JsonNullable<Object> position) {
    this.position = position;
  }

  public void setPosition(Object position) {
    this.position = JsonNullable.<Object>of(position);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pseudonyms pseudonyms = (Pseudonyms) o;
    return Objects.equals(this.id, pseudonyms.id) &&
        equalsNullable(this.deletedAt, pseudonyms.deletedAt) &&
        equalsNullable(this.integrationId, pseudonyms.integrationId) &&
        Objects.equals(this.userId, pseudonyms.userId) &&
        Objects.equals(this.createdAt, pseudonyms.createdAt) &&
        Objects.equals(this.updatedAt, pseudonyms.updatedAt) &&
        Objects.equals(this.workflowState, pseudonyms.workflowState) &&
        Objects.equals(this.accountId, pseudonyms.accountId) &&
        equalsNullable(this.sisBatchId, pseudonyms.sisBatchId) &&
        Objects.equals(this.uniqueId, pseudonyms.uniqueId) &&
        Objects.equals(this.loginCount, pseudonyms.loginCount) &&
        Objects.equals(this.failedLoginCount, pseudonyms.failedLoginCount) &&
        equalsNullable(this.lastRequestAt, pseudonyms.lastRequestAt) &&
        equalsNullable(this.lastLoginAt, pseudonyms.lastLoginAt) &&
        equalsNullable(this.currentLoginAt, pseudonyms.currentLoginAt) &&
        equalsNullable(this.lastLoginIp, pseudonyms.lastLoginIp) &&
        equalsNullable(this.currentLoginIp, pseudonyms.currentLoginIp) &&
        equalsNullable(this.sisUserId, pseudonyms.sisUserId) &&
        equalsNullable(this.authenticationProviderId, pseudonyms.authenticationProviderId) &&
        equalsNullable(this.position, pseudonyms.position);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(deletedAt), hashCodeNullable(integrationId), userId, createdAt, updatedAt, workflowState, accountId, hashCodeNullable(sisBatchId), uniqueId, loginCount, failedLoginCount, hashCodeNullable(lastRequestAt), hashCodeNullable(lastLoginAt), hashCodeNullable(currentLoginAt), hashCodeNullable(lastLoginIp), hashCodeNullable(currentLoginIp), hashCodeNullable(sisUserId), hashCodeNullable(authenticationProviderId), hashCodeNullable(position));
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
    sb.append("class Pseudonyms {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    sisBatchId: ").append(toIndentedString(sisBatchId)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    loginCount: ").append(toIndentedString(loginCount)).append("\n");
    sb.append("    failedLoginCount: ").append(toIndentedString(failedLoginCount)).append("\n");
    sb.append("    lastRequestAt: ").append(toIndentedString(lastRequestAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    currentLoginAt: ").append(toIndentedString(currentLoginAt)).append("\n");
    sb.append("    lastLoginIp: ").append(toIndentedString(lastLoginIp)).append("\n");
    sb.append("    currentLoginIp: ").append(toIndentedString(currentLoginIp)).append("\n");
    sb.append("    sisUserId: ").append(toIndentedString(sisUserId)).append("\n");
    sb.append("    authenticationProviderId: ").append(toIndentedString(authenticationProviderId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

