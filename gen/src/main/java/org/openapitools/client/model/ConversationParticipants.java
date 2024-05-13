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
import org.openapitools.client.model.ConversationParticipantsTags;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConversationParticipants
 */
@JsonPropertyOrder({
  ConversationParticipants.JSON_PROPERTY_ID,
  ConversationParticipants.JSON_PROPERTY_USER_ID,
  ConversationParticipants.JSON_PROPERTY_UPDATED_AT,
  ConversationParticipants.JSON_PROPERTY_WORKFLOW_STATE,
  ConversationParticipants.JSON_PROPERTY_HAS_ATTACHMENTS,
  ConversationParticipants.JSON_PROPERTY_HAS_MEDIA_OBJECTS,
  ConversationParticipants.JSON_PROPERTY_LAST_MESSAGE_AT,
  ConversationParticipants.JSON_PROPERTY_SUBSCRIBED,
  ConversationParticipants.JSON_PROPERTY_MESSAGE_COUNT,
  ConversationParticipants.JSON_PROPERTY_LABEL,
  ConversationParticipants.JSON_PROPERTY_TAGS
})
@JsonTypeName("conversation_participants")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversationParticipants {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Object userId = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  /**
   * The workflow state of the message.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    READ("read"),
    
    UNREAD("unread"),
    
    ARCHIVED("archived"),
    
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

  public static final String JSON_PROPERTY_HAS_ATTACHMENTS = "has_attachments";
  private Object hasAttachments = null;

  public static final String JSON_PROPERTY_HAS_MEDIA_OBJECTS = "has_media_objects";
  private Object hasMediaObjects = null;

  public static final String JSON_PROPERTY_LAST_MESSAGE_AT = "last_message_at";
  private JsonNullable<Object> lastMessageAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBSCRIBED = "subscribed";
  private Object subscribed = null;

  public static final String JSON_PROPERTY_MESSAGE_COUNT = "message_count";
  private Object messageCount = null;

  public static final String JSON_PROPERTY_LABEL = "label";
  private JsonNullable<Object> label = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TAGS = "tags";
  private ConversationParticipantsTags tags;

  public ConversationParticipants() {
  }

  public ConversationParticipants id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a conversation message participants record.
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


  public ConversationParticipants userId(Object userId) {
    
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


  public ConversationParticipants updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Timestamp of when a &#x60;conversation_participants&#x60; record was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUpdatedAt() {
        return updatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUpdatedAt_JsonNullable() {
    return updatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  public void setUpdatedAt_JsonNullable(JsonNullable<Object> updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setUpdatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
  }


  public ConversationParticipants workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * The workflow state of the message.
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


  public ConversationParticipants hasAttachments(Object hasAttachments) {
    
    this.hasAttachments = hasAttachments;
    return this;
  }

   /**
   * If the conversation has attachments.
   * @return hasAttachments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHasAttachments() {
    return hasAttachments;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasAttachments(Object hasAttachments) {
    this.hasAttachments = hasAttachments;
  }


  public ConversationParticipants hasMediaObjects(Object hasMediaObjects) {
    
    this.hasMediaObjects = hasMediaObjects;
    return this;
  }

   /**
   * If the conversation has media objects associated.
   * @return hasMediaObjects
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MEDIA_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHasMediaObjects() {
    return hasMediaObjects;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MEDIA_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMediaObjects(Object hasMediaObjects) {
    this.hasMediaObjects = hasMediaObjects;
  }


  public ConversationParticipants lastMessageAt(Object lastMessageAt) {
    this.lastMessageAt = JsonNullable.<Object>of(lastMessageAt);
    
    return this;
  }

   /**
   * The timestamp of the latest message.
   * @return lastMessageAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastMessageAt() {
        return lastMessageAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_MESSAGE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastMessageAt_JsonNullable() {
    return lastMessageAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_MESSAGE_AT)
  public void setLastMessageAt_JsonNullable(JsonNullable<Object> lastMessageAt) {
    this.lastMessageAt = lastMessageAt;
  }

  public void setLastMessageAt(Object lastMessageAt) {
    this.lastMessageAt = JsonNullable.<Object>of(lastMessageAt);
  }


  public ConversationParticipants subscribed(Object subscribed) {
    
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Indicates whether the current user is subscribed to the conversation.
   * @return subscribed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSubscribed() {
    return subscribed;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscribed(Object subscribed) {
    this.subscribed = subscribed;
  }


  public ConversationParticipants messageCount(Object messageCount) {
    
    this.messageCount = messageCount;
    return this;
  }

   /**
   * The number of messages in the conversation.
   * @return messageCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMessageCount() {
    return messageCount;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageCount(Object messageCount) {
    this.messageCount = messageCount;
  }


  public ConversationParticipants label(Object label) {
    this.label = JsonNullable.<Object>of(label);
    
    return this;
  }

   /**
   * Any label applied to the conversation, such as *starred*.
   * @return label
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLabel() {
        return label.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLabel_JsonNullable() {
    return label;
  }
  
  @JsonProperty(JSON_PROPERTY_LABEL)
  public void setLabel_JsonNullable(JsonNullable<Object> label) {
    this.label = label;
  }

  public void setLabel(Object label) {
    this.label = JsonNullable.<Object>of(label);
  }


  public ConversationParticipants tags(ConversationParticipantsTags tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationParticipantsTags getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(ConversationParticipantsTags tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationParticipants conversationParticipants = (ConversationParticipants) o;
    return Objects.equals(this.id, conversationParticipants.id) &&
        Objects.equals(this.userId, conversationParticipants.userId) &&
        equalsNullable(this.updatedAt, conversationParticipants.updatedAt) &&
        Objects.equals(this.workflowState, conversationParticipants.workflowState) &&
        Objects.equals(this.hasAttachments, conversationParticipants.hasAttachments) &&
        Objects.equals(this.hasMediaObjects, conversationParticipants.hasMediaObjects) &&
        equalsNullable(this.lastMessageAt, conversationParticipants.lastMessageAt) &&
        Objects.equals(this.subscribed, conversationParticipants.subscribed) &&
        Objects.equals(this.messageCount, conversationParticipants.messageCount) &&
        equalsNullable(this.label, conversationParticipants.label) &&
        Objects.equals(this.tags, conversationParticipants.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, hashCodeNullable(updatedAt), workflowState, hasAttachments, hasMediaObjects, hashCodeNullable(lastMessageAt), subscribed, messageCount, hashCodeNullable(label), tags);
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
    sb.append("class ConversationParticipants {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    hasMediaObjects: ").append(toIndentedString(hasMediaObjects)).append("\n");
    sb.append("    lastMessageAt: ").append(toIndentedString(lastMessageAt)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
