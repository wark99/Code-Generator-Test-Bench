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
 * Examples include an email address, a phone number, a mobile device token for push notifications, etc.
 */
@JsonPropertyOrder({
  CommunicationChannels.JSON_PROPERTY_ID,
  CommunicationChannels.JSON_PROPERTY_PATH,
  CommunicationChannels.JSON_PROPERTY_PATH_TYPE,
  CommunicationChannels.JSON_PROPERTY_PSEUDONYM_ID,
  CommunicationChannels.JSON_PROPERTY_BOUNCE_COUNT,
  CommunicationChannels.JSON_PROPERTY_CONFIRMATION_CODE_EXPIRES_AT,
  CommunicationChannels.JSON_PROPERTY_CONFIRMATION_SENT_COUNT,
  CommunicationChannels.JSON_PROPERTY_USER_ID,
  CommunicationChannels.JSON_PROPERTY_CREATED_AT,
  CommunicationChannels.JSON_PROPERTY_UPDATED_AT,
  CommunicationChannels.JSON_PROPERTY_WORKFLOW_STATE,
  CommunicationChannels.JSON_PROPERTY_POSITION
})
@JsonTypeName("communication_channels")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CommunicationChannels {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_PATH = "path";
  private Object path = null;

  public static final String JSON_PROPERTY_PATH_TYPE = "path_type";
  private Object pathType = null;

  public static final String JSON_PROPERTY_PSEUDONYM_ID = "pseudonym_id";
  private JsonNullable<Object> pseudonymId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_BOUNCE_COUNT = "bounce_count";
  private Object bounceCount = null;

  public static final String JSON_PROPERTY_CONFIRMATION_CODE_EXPIRES_AT = "confirmation_code_expires_at";
  private JsonNullable<Object> confirmationCodeExpiresAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONFIRMATION_SENT_COUNT = "confirmation_sent_count";
  private Object confirmationSentCount = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Object userId = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Current state of the communication channel.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    UNCONFIRMED("unconfirmed"),
    
    ACTIVE("active"),
    
    RETIRED("retired");

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

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public CommunicationChannels() {
  }

  public CommunicationChannels id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a user communication channel record.
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


  public CommunicationChannels path(Object path) {
    
    this.path = path;
    return this;
  }

   /**
   * The address of the communication channel e.g. an email address or a phone number.
   * @return path
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPath(Object path) {
    this.path = path;
  }


  public CommunicationChannels pathType(Object pathType) {
    
    this.pathType = pathType;
    return this;
  }

   /**
   * The type of communication channel being described. This field determines the type of value seen in &#x60;address&#x60;.
   * @return pathType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPathType() {
    return pathType;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPathType(Object pathType) {
    this.pathType = pathType;
  }


  public CommunicationChannels pseudonymId(Object pseudonymId) {
    this.pseudonymId = JsonNullable.<Object>of(pseudonymId);
    
    return this;
  }

   /**
   * The unique ID of a user&#39;s pseudonym record.
   * @return pseudonymId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPseudonymId() {
        return pseudonymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PSEUDONYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPseudonymId_JsonNullable() {
    return pseudonymId;
  }
  
  @JsonProperty(JSON_PROPERTY_PSEUDONYM_ID)
  public void setPseudonymId_JsonNullable(JsonNullable<Object> pseudonymId) {
    this.pseudonymId = pseudonymId;
  }

  public void setPseudonymId(Object pseudonymId) {
    this.pseudonymId = JsonNullable.<Object>of(pseudonymId);
  }


  public CommunicationChannels bounceCount(Object bounceCount) {
    
    this.bounceCount = bounceCount;
    return this;
  }

   /**
   * The number of times a communication channel has bounced when trying to deliver messages.
   * @return bounceCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBounceCount() {
    return bounceCount;
  }


  @JsonProperty(JSON_PROPERTY_BOUNCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBounceCount(Object bounceCount) {
    this.bounceCount = bounceCount;
  }


  public CommunicationChannels confirmationCodeExpiresAt(Object confirmationCodeExpiresAt) {
    this.confirmationCodeExpiresAt = JsonNullable.<Object>of(confirmationCodeExpiresAt);
    
    return this;
  }

   /**
   * The date-time when the issued confirmation code will expire.
   * @return confirmationCodeExpiresAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConfirmationCodeExpiresAt() {
        return confirmationCodeExpiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIRMATION_CODE_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConfirmationCodeExpiresAt_JsonNullable() {
    return confirmationCodeExpiresAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_CODE_EXPIRES_AT)
  public void setConfirmationCodeExpiresAt_JsonNullable(JsonNullable<Object> confirmationCodeExpiresAt) {
    this.confirmationCodeExpiresAt = confirmationCodeExpiresAt;
  }

  public void setConfirmationCodeExpiresAt(Object confirmationCodeExpiresAt) {
    this.confirmationCodeExpiresAt = JsonNullable.<Object>of(confirmationCodeExpiresAt);
  }


  public CommunicationChannels confirmationSentCount(Object confirmationSentCount) {
    
    this.confirmationSentCount = confirmationSentCount;
    return this;
  }

   /**
   * The number of confirmations sent for the channel.
   * @return confirmationSentCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_SENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getConfirmationSentCount() {
    return confirmationSentCount;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRMATION_SENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfirmationSentCount(Object confirmationSentCount) {
    this.confirmationSentCount = confirmationSentCount;
  }


  public CommunicationChannels userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The unique ID of a user.
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


  public CommunicationChannels createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;communication_channels&#x60; record was created.
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


  public CommunicationChannels updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;communication_channels&#x60; record was updated.
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


  public CommunicationChannels workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Current state of the communication channel.
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


  public CommunicationChannels position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * The position of this communication channel relative to the user&#39;s other channels when they are ordered.
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
    CommunicationChannels communicationChannels = (CommunicationChannels) o;
    return Objects.equals(this.id, communicationChannels.id) &&
        Objects.equals(this.path, communicationChannels.path) &&
        Objects.equals(this.pathType, communicationChannels.pathType) &&
        equalsNullable(this.pseudonymId, communicationChannels.pseudonymId) &&
        Objects.equals(this.bounceCount, communicationChannels.bounceCount) &&
        equalsNullable(this.confirmationCodeExpiresAt, communicationChannels.confirmationCodeExpiresAt) &&
        Objects.equals(this.confirmationSentCount, communicationChannels.confirmationSentCount) &&
        Objects.equals(this.userId, communicationChannels.userId) &&
        Objects.equals(this.createdAt, communicationChannels.createdAt) &&
        Objects.equals(this.updatedAt, communicationChannels.updatedAt) &&
        Objects.equals(this.workflowState, communicationChannels.workflowState) &&
        equalsNullable(this.position, communicationChannels.position);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, pathType, hashCodeNullable(pseudonymId), bounceCount, hashCodeNullable(confirmationCodeExpiresAt), confirmationSentCount, userId, createdAt, updatedAt, workflowState, hashCodeNullable(position));
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
    sb.append("class CommunicationChannels {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathType: ").append(toIndentedString(pathType)).append("\n");
    sb.append("    pseudonymId: ").append(toIndentedString(pseudonymId)).append("\n");
    sb.append("    bounceCount: ").append(toIndentedString(bounceCount)).append("\n");
    sb.append("    confirmationCodeExpiresAt: ").append(toIndentedString(confirmationCodeExpiresAt)).append("\n");
    sb.append("    confirmationSentCount: ").append(toIndentedString(confirmationSentCount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
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

