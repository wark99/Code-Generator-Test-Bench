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
import org.openapitools.client.model.DiscussionEntriesMessage;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Discussion entries are replies in a discussion topic.
 */
@JsonPropertyOrder({
  DiscussionEntries.JSON_PROPERTY_ID,
  DiscussionEntries.JSON_PROPERTY_MESSAGE,
  DiscussionEntries.JSON_PROPERTY_ATTACHMENT_ID,
  DiscussionEntries.JSON_PROPERTY_DELETED_AT,
  DiscussionEntries.JSON_PROPERTY_USER_ID,
  DiscussionEntries.JSON_PROPERTY_CREATED_AT,
  DiscussionEntries.JSON_PROPERTY_UPDATED_AT,
  DiscussionEntries.JSON_PROPERTY_WORKFLOW_STATE,
  DiscussionEntries.JSON_PROPERTY_MIGRATION_ID,
  DiscussionEntries.JSON_PROPERTY_DISCUSSION_TOPIC_ID,
  DiscussionEntries.JSON_PROPERTY_PARENT_ID,
  DiscussionEntries.JSON_PROPERTY_EDITOR_ID,
  DiscussionEntries.JSON_PROPERTY_ROOT_ENTRY_ID,
  DiscussionEntries.JSON_PROPERTY_DEPTH,
  DiscussionEntries.JSON_PROPERTY_RATING_COUNT,
  DiscussionEntries.JSON_PROPERTY_RATING_SUM
})
@JsonTypeName("discussion_entries")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DiscussionEntries {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private DiscussionEntriesMessage message;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachment_id";
  private JsonNullable<Object> attachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the discussion message.
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

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISCUSSION_TOPIC_ID = "discussion_topic_id";
  private JsonNullable<Object> discussionTopicId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private JsonNullable<Object> parentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EDITOR_ID = "editor_id";
  private JsonNullable<Object> editorId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ROOT_ENTRY_ID = "root_entry_id";
  private JsonNullable<Object> rootEntryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEPTH = "depth";
  private JsonNullable<Object> depth = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RATING_COUNT = "rating_count";
  private JsonNullable<Object> ratingCount = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RATING_SUM = "rating_sum";
  private JsonNullable<Object> ratingSum = JsonNullable.<Object>of(null);

  public DiscussionEntries() {
  }

  public DiscussionEntries id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the entry.
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


  public DiscussionEntries message(DiscussionEntriesMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiscussionEntriesMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(DiscussionEntriesMessage message) {
    this.message = message;
  }


  public DiscussionEntries attachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
    
    return this;
  }

   /**
   * Representation of the attachment for the entry, if any. Present only if there is an attachment.
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAttachmentId() {
        return attachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAttachmentId_JsonNullable() {
    return attachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  public void setAttachmentId_JsonNullable(JsonNullable<Object> attachmentId) {
    this.attachmentId = attachmentId;
  }

  public void setAttachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
  }


  public DiscussionEntries deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp when the discussion entry was deleted.
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


  public DiscussionEntries userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The unique identifier for the author of the entry.
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


  public DiscussionEntries createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation time of the entry.
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


  public DiscussionEntries updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The updated time of the entry, in ISO8601 format.
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


  public DiscussionEntries workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the discussion message.
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


  public DiscussionEntries migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported the entry.
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


  public DiscussionEntries discussionTopicId(Object discussionTopicId) {
    this.discussionTopicId = JsonNullable.<Object>of(discussionTopicId);
    
    return this;
  }

   /**
   * The ID of the discussion topic that this entry is part of.
   * @return discussionTopicId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDiscussionTopicId() {
        return discussionTopicId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCUSSION_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscussionTopicId_JsonNullable() {
    return discussionTopicId;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCUSSION_TOPIC_ID)
  public void setDiscussionTopicId_JsonNullable(JsonNullable<Object> discussionTopicId) {
    this.discussionTopicId = discussionTopicId;
  }

  public void setDiscussionTopicId(Object discussionTopicId) {
    this.discussionTopicId = JsonNullable.<Object>of(discussionTopicId);
  }


  public DiscussionEntries parentId(Object parentId) {
    this.parentId = JsonNullable.<Object>of(parentId);
    
    return this;
  }

   /**
   * The parent discussion entry ID of this discussion entry. Has a value if the entry is a reply to another entry.
   * @return parentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getParentId() {
        return parentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getParentId_JsonNullable() {
    return parentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<Object> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(Object parentId) {
    this.parentId = JsonNullable.<Object>of(parentId);
  }


  public DiscussionEntries editorId(Object editorId) {
    this.editorId = JsonNullable.<Object>of(editorId);
    
    return this;
  }

   /**
   * The unique user ID of the person to last edit the entry, if different than user_id.
   * @return editorId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEditorId() {
        return editorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EDITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEditorId_JsonNullable() {
    return editorId;
  }
  
  @JsonProperty(JSON_PROPERTY_EDITOR_ID)
  public void setEditorId_JsonNullable(JsonNullable<Object> editorId) {
    this.editorId = editorId;
  }

  public void setEditorId(Object editorId) {
    this.editorId = JsonNullable.<Object>of(editorId);
  }


  public DiscussionEntries rootEntryId(Object rootEntryId) {
    this.rootEntryId = JsonNullable.<Object>of(rootEntryId);
    
    return this;
  }

   /**
   * The root discussion entry ID that this entry is a part of. Has a value if the entry is a reply to another entry.
   * @return rootEntryId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRootEntryId() {
        return rootEntryId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOT_ENTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRootEntryId_JsonNullable() {
    return rootEntryId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOT_ENTRY_ID)
  public void setRootEntryId_JsonNullable(JsonNullable<Object> rootEntryId) {
    this.rootEntryId = rootEntryId;
  }

  public void setRootEntryId(Object rootEntryId) {
    this.rootEntryId = JsonNullable.<Object>of(rootEntryId);
  }


  public DiscussionEntries depth(Object depth) {
    this.depth = JsonNullable.<Object>of(depth);
    
    return this;
  }

   /**
   * Reply depth for this entry.
   * @return depth
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDepth() {
        return depth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDepth_JsonNullable() {
    return depth;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPTH)
  public void setDepth_JsonNullable(JsonNullable<Object> depth) {
    this.depth = depth;
  }

  public void setDepth(Object depth) {
    this.depth = JsonNullable.<Object>of(depth);
  }


  public DiscussionEntries ratingCount(Object ratingCount) {
    this.ratingCount = JsonNullable.<Object>of(ratingCount);
    
    return this;
  }

   /**
   * Rating count is the amount of people who have submitted a rating on a given discussion with the only rating being \&quot;like\&quot;.
   * @return ratingCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRatingCount() {
        return ratingCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RATING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRatingCount_JsonNullable() {
    return ratingCount;
  }
  
  @JsonProperty(JSON_PROPERTY_RATING_COUNT)
  public void setRatingCount_JsonNullable(JsonNullable<Object> ratingCount) {
    this.ratingCount = ratingCount;
  }

  public void setRatingCount(Object ratingCount) {
    this.ratingCount = JsonNullable.<Object>of(ratingCount);
  }


  public DiscussionEntries ratingSum(Object ratingSum) {
    this.ratingSum = JsonNullable.<Object>of(ratingSum);
    
    return this;
  }

   /**
   * The rating sum is the sum of the ratings which occurred.
   * @return ratingSum
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRatingSum() {
        return ratingSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RATING_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRatingSum_JsonNullable() {
    return ratingSum;
  }
  
  @JsonProperty(JSON_PROPERTY_RATING_SUM)
  public void setRatingSum_JsonNullable(JsonNullable<Object> ratingSum) {
    this.ratingSum = ratingSum;
  }

  public void setRatingSum(Object ratingSum) {
    this.ratingSum = JsonNullable.<Object>of(ratingSum);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionEntries discussionEntries = (DiscussionEntries) o;
    return Objects.equals(this.id, discussionEntries.id) &&
        Objects.equals(this.message, discussionEntries.message) &&
        equalsNullable(this.attachmentId, discussionEntries.attachmentId) &&
        equalsNullable(this.deletedAt, discussionEntries.deletedAt) &&
        equalsNullable(this.userId, discussionEntries.userId) &&
        Objects.equals(this.createdAt, discussionEntries.createdAt) &&
        Objects.equals(this.updatedAt, discussionEntries.updatedAt) &&
        Objects.equals(this.workflowState, discussionEntries.workflowState) &&
        equalsNullable(this.migrationId, discussionEntries.migrationId) &&
        equalsNullable(this.discussionTopicId, discussionEntries.discussionTopicId) &&
        equalsNullable(this.parentId, discussionEntries.parentId) &&
        equalsNullable(this.editorId, discussionEntries.editorId) &&
        equalsNullable(this.rootEntryId, discussionEntries.rootEntryId) &&
        equalsNullable(this.depth, discussionEntries.depth) &&
        equalsNullable(this.ratingCount, discussionEntries.ratingCount) &&
        equalsNullable(this.ratingSum, discussionEntries.ratingSum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, hashCodeNullable(attachmentId), hashCodeNullable(deletedAt), hashCodeNullable(userId), createdAt, updatedAt, workflowState, hashCodeNullable(migrationId), hashCodeNullable(discussionTopicId), hashCodeNullable(parentId), hashCodeNullable(editorId), hashCodeNullable(rootEntryId), hashCodeNullable(depth), hashCodeNullable(ratingCount), hashCodeNullable(ratingSum));
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
    sb.append("class DiscussionEntries {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    discussionTopicId: ").append(toIndentedString(discussionTopicId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    editorId: ").append(toIndentedString(editorId)).append("\n");
    sb.append("    rootEntryId: ").append(toIndentedString(rootEntryId)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    ratingSum: ").append(toIndentedString(ratingSum)).append("\n");
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

