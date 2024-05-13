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
 * This table in Canvas Data 2 will only share developer tool specific token metadata. All users have an option to create an access token based on their role and level of data access.
 */
@JsonPropertyOrder({
  AccessTokens.JSON_PROPERTY_ID,
  AccessTokens.JSON_PROPERTY_DEVELOPER_KEY_ID,
  AccessTokens.JSON_PROPERTY_USER_ID,
  AccessTokens.JSON_PROPERTY_REAL_USER_ID,
  AccessTokens.JSON_PROPERTY_LAST_USED_AT,
  AccessTokens.JSON_PROPERTY_EXPIRES_AT,
  AccessTokens.JSON_PROPERTY_PURPOSE,
  AccessTokens.JSON_PROPERTY_CREATED_AT,
  AccessTokens.JSON_PROPERTY_UPDATED_AT,
  AccessTokens.JSON_PROPERTY_SCOPES,
  AccessTokens.JSON_PROPERTY_WORKFLOW_STATE
})
@JsonTypeName("access_tokens")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccessTokens {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DEVELOPER_KEY_ID = "developer_key_id";
  private Object developerKeyId = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REAL_USER_ID = "real_user_id";
  private JsonNullable<Object> realUserId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_USED_AT = "last_used_at";
  private JsonNullable<Object> lastUsedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<Object> expiresAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private JsonNullable<Object> purpose = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private JsonNullable<Object> scopes = JsonNullable.<Object>of(null);

  /**
   * The current state of the access token record.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted");

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

  public AccessTokens() {
  }

  public AccessTokens id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for an access token record.
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


  public AccessTokens developerKeyId(Object developerKeyId) {
    
    this.developerKeyId = developerKeyId;
    return this;
  }

   /**
   * The unique identifier of a developer key.
   * @return developerKeyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVELOPER_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeveloperKeyId() {
    return developerKeyId;
  }


  @JsonProperty(JSON_PROPERTY_DEVELOPER_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeveloperKeyId(Object developerKeyId) {
    this.developerKeyId = developerKeyId;
  }


  public AccessTokens userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The unique ID of the user the token acts as.
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<Object> userId) {
    this.userId = userId;
  }

  public void setUserId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
  }


  public AccessTokens realUserId(Object realUserId) {
    this.realUserId = JsonNullable.<Object>of(realUserId);
    
    return this;
  }

   /**
   * If the token was created while masquerading, this is the real user doing the masquerading. Used for auditing.
   * @return realUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRealUserId() {
        return realUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REAL_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRealUserId_JsonNullable() {
    return realUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_REAL_USER_ID)
  public void setRealUserId_JsonNullable(JsonNullable<Object> realUserId) {
    this.realUserId = realUserId;
  }

  public void setRealUserId(Object realUserId) {
    this.realUserId = JsonNullable.<Object>of(realUserId);
  }


  public AccessTokens lastUsedAt(Object lastUsedAt) {
    this.lastUsedAt = JsonNullable.<Object>of(lastUsedAt);
    
    return this;
  }

   /**
   * Timestamp of last access using this access token.
   * @return lastUsedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastUsedAt() {
        return lastUsedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastUsedAt_JsonNullable() {
    return lastUsedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  public void setLastUsedAt_JsonNullable(JsonNullable<Object> lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public void setLastUsedAt(Object lastUsedAt) {
    this.lastUsedAt = JsonNullable.<Object>of(lastUsedAt);
  }


  public AccessTokens expiresAt(Object expiresAt) {
    this.expiresAt = JsonNullable.<Object>of(expiresAt);
    
    return this;
  }

   /**
   * The expiration date/time for this token. This may be a NULL value.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExpiresAt() {
        return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExpiresAt_JsonNullable() {
    return expiresAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  public void setExpiresAt_JsonNullable(JsonNullable<Object> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setExpiresAt(Object expiresAt) {
    this.expiresAt = JsonNullable.<Object>of(expiresAt);
  }


  public AccessTokens purpose(Object purpose) {
    this.purpose = JsonNullable.<Object>of(purpose);
    
    return this;
  }

   /**
   * For user-generated tokens, purpose can be manually set. For app-generated tokens, this should be generated based on the scope defined in the authentication process.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPurpose() {
        return purpose.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPurpose_JsonNullable() {
    return purpose;
  }
  
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  public void setPurpose_JsonNullable(JsonNullable<Object> purpose) {
    this.purpose = purpose;
  }

  public void setPurpose(Object purpose) {
    this.purpose = JsonNullable.<Object>of(purpose);
  }


  public AccessTokens createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when an &#x60;access_tokens&#x60; record was created.
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


  public AccessTokens updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when an &#x60;access_tokens&#x60; record was updated.
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


  public AccessTokens scopes(Object scopes) {
    this.scopes = JsonNullable.<Object>of(scopes);
    
    return this;
  }

   /**
   * A list of scopes that can be applied to access tokens. i.e.: courses.
   * @return scopes
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getScopes() {
        return scopes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getScopes_JsonNullable() {
    return scopes;
  }
  
  @JsonProperty(JSON_PROPERTY_SCOPES)
  public void setScopes_JsonNullable(JsonNullable<Object> scopes) {
    this.scopes = scopes;
  }

  public void setScopes(Object scopes) {
    this.scopes = JsonNullable.<Object>of(scopes);
  }


  public AccessTokens workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * The current state of the access token record.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokens accessTokens = (AccessTokens) o;
    return Objects.equals(this.id, accessTokens.id) &&
        Objects.equals(this.developerKeyId, accessTokens.developerKeyId) &&
        equalsNullable(this.userId, accessTokens.userId) &&
        equalsNullable(this.realUserId, accessTokens.realUserId) &&
        equalsNullable(this.lastUsedAt, accessTokens.lastUsedAt) &&
        equalsNullable(this.expiresAt, accessTokens.expiresAt) &&
        equalsNullable(this.purpose, accessTokens.purpose) &&
        Objects.equals(this.createdAt, accessTokens.createdAt) &&
        Objects.equals(this.updatedAt, accessTokens.updatedAt) &&
        equalsNullable(this.scopes, accessTokens.scopes) &&
        Objects.equals(this.workflowState, accessTokens.workflowState);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, developerKeyId, hashCodeNullable(userId), hashCodeNullable(realUserId), hashCodeNullable(lastUsedAt), hashCodeNullable(expiresAt), hashCodeNullable(purpose), createdAt, updatedAt, hashCodeNullable(scopes), workflowState);
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
    sb.append("class AccessTokens {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    developerKeyId: ").append(toIndentedString(developerKeyId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    realUserId: ").append(toIndentedString(realUserId)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
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

