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
import org.openapitools.client.model.ConversationsTags;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Conversations
 */
@JsonPropertyOrder({
  Conversations.JSON_PROPERTY_ID,
  Conversations.JSON_PROPERTY_UPDATED_AT,
  Conversations.JSON_PROPERTY_CONTEXT_ID,
  Conversations.JSON_PROPERTY_CONTEXT_TYPE,
  Conversations.JSON_PROPERTY_HAS_ATTACHMENTS,
  Conversations.JSON_PROPERTY_HAS_MEDIA_OBJECTS,
  Conversations.JSON_PROPERTY_SUBJECT,
  Conversations.JSON_PROPERTY_TAGS
})
@JsonTypeName("conversations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Conversations {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private JsonNullable<Object> contextId = JsonNullable.<Object>of(null);

  /**
   * The type of the object represented by context_id.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COURSE("Course"),
    
    GROUP("Group"),
    
    ACCOUNT("Account");

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
  private JsonNullable<ContextTypeEnum> contextType = JsonNullable.<ContextTypeEnum>of(null);

  public static final String JSON_PROPERTY_HAS_ATTACHMENTS = "has_attachments";
  private Object hasAttachments = null;

  public static final String JSON_PROPERTY_HAS_MEDIA_OBJECTS = "has_media_objects";
  private Object hasMediaObjects = null;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private JsonNullable<Object> subject = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TAGS = "tags";
  private ConversationsTags tags;

  public Conversations() {
  }

  public Conversations id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a conversations record. Links to &#x60;conversation_messages.conversation_id&#x60;.
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


  public Conversations updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Timestamp of when a conversations record was updated.
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


  public Conversations contextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
    
    return this;
  }

   /**
   * The unique identifier for the conversations&#39;s context (account, course, user). ID associated with the &#x60;context_type&#x60;.
   * @return contextId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContextId() {
        return contextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContextId_JsonNullable() {
    return contextId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  public void setContextId_JsonNullable(JsonNullable<Object> contextId) {
    this.contextId = contextId;
  }

  public void setContextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
  }


  public Conversations contextType(ContextTypeEnum contextType) {
    this.contextType = JsonNullable.<ContextTypeEnum>of(contextType);
    
    return this;
  }

   /**
   * The type of the object represented by context_id.
   * @return contextType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ContextTypeEnum getContextType() {
        return contextType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContextTypeEnum> getContextType_JsonNullable() {
    return contextType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  public void setContextType_JsonNullable(JsonNullable<ContextTypeEnum> contextType) {
    this.contextType = contextType;
  }

  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = JsonNullable.<ContextTypeEnum>of(contextType);
  }


  public Conversations hasAttachments(Object hasAttachments) {
    
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


  public Conversations hasMediaObjects(Object hasMediaObjects) {
    
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


  public Conversations subject(Object subject) {
    this.subject = JsonNullable.<Object>of(subject);
    
    return this;
  }

   /**
   * The subject line of the conversation.
   * @return subject
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubject() {
        return subject.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubject_JsonNullable() {
    return subject;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  public void setSubject_JsonNullable(JsonNullable<Object> subject) {
    this.subject = subject;
  }

  public void setSubject(Object subject) {
    this.subject = JsonNullable.<Object>of(subject);
  }


  public Conversations tags(ConversationsTags tags) {
    
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

  public ConversationsTags getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(ConversationsTags tags) {
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
    Conversations conversations = (Conversations) o;
    return Objects.equals(this.id, conversations.id) &&
        equalsNullable(this.updatedAt, conversations.updatedAt) &&
        equalsNullable(this.contextId, conversations.contextId) &&
        equalsNullable(this.contextType, conversations.contextType) &&
        Objects.equals(this.hasAttachments, conversations.hasAttachments) &&
        Objects.equals(this.hasMediaObjects, conversations.hasMediaObjects) &&
        equalsNullable(this.subject, conversations.subject) &&
        Objects.equals(this.tags, conversations.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(updatedAt), hashCodeNullable(contextId), hashCodeNullable(contextType), hasAttachments, hasMediaObjects, hashCodeNullable(subject), tags);
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
    sb.append("class Conversations {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    hasMediaObjects: ").append(toIndentedString(hasMediaObjects)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

