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
import org.openapitools.client.model.DiscussionTopicsMessage;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Discussion topics are logical discussion threads. They can have many discussion entries. They also have their own message text for the message that started the topic.
 */
@JsonPropertyOrder({
  DiscussionTopics.JSON_PROPERTY_ID,
  DiscussionTopics.JSON_PROPERTY_MESSAGE,
  DiscussionTopics.JSON_PROPERTY_TYPE,
  DiscussionTopics.JSON_PROPERTY_ATTACHMENT_ID,
  DiscussionTopics.JSON_PROPERTY_DELETED_AT,
  DiscussionTopics.JSON_PROPERTY_USER_ID,
  DiscussionTopics.JSON_PROPERTY_CREATED_AT,
  DiscussionTopics.JSON_PROPERTY_UPDATED_AT,
  DiscussionTopics.JSON_PROPERTY_WORKFLOW_STATE,
  DiscussionTopics.JSON_PROPERTY_LOCK_AT,
  DiscussionTopics.JSON_PROPERTY_CONTEXT_ID,
  DiscussionTopics.JSON_PROPERTY_CONTEXT_TYPE,
  DiscussionTopics.JSON_PROPERTY_LOCKED,
  DiscussionTopics.JSON_PROPERTY_ASSIGNMENT_ID,
  DiscussionTopics.JSON_PROPERTY_MIGRATION_ID,
  DiscussionTopics.JSON_PROPERTY_GROUP_CATEGORY_ID,
  DiscussionTopics.JSON_PROPERTY_CLONED_ITEM_ID,
  DiscussionTopics.JSON_PROPERTY_LAST_REPLY_AT,
  DiscussionTopics.JSON_PROPERTY_DELAYED_POST_AT,
  DiscussionTopics.JSON_PROPERTY_POSTED_AT,
  DiscussionTopics.JSON_PROPERTY_ROOT_TOPIC_ID,
  DiscussionTopics.JSON_PROPERTY_OLD_ASSIGNMENT_ID,
  DiscussionTopics.JSON_PROPERTY_SUBTOPICS_REFRESHED_AT,
  DiscussionTopics.JSON_PROPERTY_EXTERNAL_FEED_ID,
  DiscussionTopics.JSON_PROPERTY_PODCAST_ENABLED,
  DiscussionTopics.JSON_PROPERTY_PODCAST_HAS_STUDENT_POSTS,
  DiscussionTopics.JSON_PROPERTY_REQUIRE_INITIAL_POST,
  DiscussionTopics.JSON_PROPERTY_EDITOR_ID,
  DiscussionTopics.JSON_PROPERTY_DISCUSSION_TYPE,
  DiscussionTopics.JSON_PROPERTY_PINNED,
  DiscussionTopics.JSON_PROPERTY_ALLOW_RATING,
  DiscussionTopics.JSON_PROPERTY_ONLY_GRADERS_CAN_RATE,
  DiscussionTopics.JSON_PROPERTY_SORT_BY_RATING,
  DiscussionTopics.JSON_PROPERTY_TODO_DATE,
  DiscussionTopics.JSON_PROPERTY_IS_SECTION_SPECIFIC,
  DiscussionTopics.JSON_PROPERTY_POSITION,
  DiscussionTopics.JSON_PROPERTY_TITLE
})
@JsonTypeName("discussion_topics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DiscussionTopics {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private DiscussionTopicsMessage message;

  /**
   * Discussion topic type. Two types are default (blank) and Announcement.
   */
  public enum TypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ANNOUNCEMENT("Announcement");

    private Object value;

    TypeEnum(Object value) {
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
    public static TypeEnum fromValue(Object value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<TypeEnum> type = JsonNullable.<TypeEnum>of(null);

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
   * Life-cycle state for the discussion topic.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted"),
    
    LOCKED("locked"),
    
    POST_DELAYED("post_delayed"),
    
    UNPUBLISHED("unpublished");

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

  public static final String JSON_PROPERTY_LOCK_AT = "lock_at";
  private JsonNullable<Object> lockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of context this discussion is used with.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COURSE("Course"),
    
    GROUP("Group");

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

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private Object locked = null;

  public static final String JSON_PROPERTY_ASSIGNMENT_ID = "assignment_id";
  private JsonNullable<Object> assignmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_CATEGORY_ID = "group_category_id";
  private JsonNullable<Object> groupCategoryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CLONED_ITEM_ID = "cloned_item_id";
  private JsonNullable<Object> clonedItemId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_REPLY_AT = "last_reply_at";
  private JsonNullable<Object> lastReplyAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DELAYED_POST_AT = "delayed_post_at";
  private JsonNullable<Object> delayedPostAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POSTED_AT = "posted_at";
  private JsonNullable<Object> postedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ROOT_TOPIC_ID = "root_topic_id";
  private JsonNullable<Object> rootTopicId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_OLD_ASSIGNMENT_ID = "old_assignment_id";
  private JsonNullable<Object> oldAssignmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBTOPICS_REFRESHED_AT = "subtopics_refreshed_at";
  private JsonNullable<Object> subtopicsRefreshedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXTERNAL_FEED_ID = "external_feed_id";
  private JsonNullable<Object> externalFeedId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PODCAST_ENABLED = "podcast_enabled";
  private Object podcastEnabled = null;

  public static final String JSON_PROPERTY_PODCAST_HAS_STUDENT_POSTS = "podcast_has_student_posts";
  private Object podcastHasStudentPosts = null;

  public static final String JSON_PROPERTY_REQUIRE_INITIAL_POST = "require_initial_post";
  private Object requireInitialPost = null;

  public static final String JSON_PROPERTY_EDITOR_ID = "editor_id";
  private JsonNullable<Object> editorId = JsonNullable.<Object>of(null);

  /**
   * The type of discussion.
   */
  public enum DiscussionTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    SIDE_COMMENT("side_comment"),
    
    THREADED("threaded");

    private Object value;

    DiscussionTypeEnum(Object value) {
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
    public static DiscussionTypeEnum fromValue(Object value) {
      for (DiscussionTypeEnum b : DiscussionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_DISCUSSION_TYPE = "discussion_type";
  private JsonNullable<DiscussionTypeEnum> discussionType = JsonNullable.<DiscussionTypeEnum>of(null);

  public static final String JSON_PROPERTY_PINNED = "pinned";
  private Object pinned = null;

  public static final String JSON_PROPERTY_ALLOW_RATING = "allow_rating";
  private Object allowRating = null;

  public static final String JSON_PROPERTY_ONLY_GRADERS_CAN_RATE = "only_graders_can_rate";
  private Object onlyGradersCanRate = null;

  public static final String JSON_PROPERTY_SORT_BY_RATING = "sort_by_rating";
  private Object sortByRating = null;

  public static final String JSON_PROPERTY_TODO_DATE = "todo_date";
  private JsonNullable<Object> todoDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IS_SECTION_SPECIFIC = "is_section_specific";
  private Object isSectionSpecific = null;

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<Object> title = JsonNullable.<Object>of(null);

  public DiscussionTopics() {
  }

  public DiscussionTopics id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of this topic.
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


  public DiscussionTopics message(DiscussionTopicsMessage message) {
    
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

  public DiscussionTopicsMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(DiscussionTopicsMessage message) {
    this.message = message;
  }


  public DiscussionTopics type(TypeEnum type) {
    this.type = JsonNullable.<TypeEnum>of(type);
    
    return this;
  }

   /**
   * Discussion topic type. Two types are default (blank) and Announcement.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public TypeEnum getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TypeEnum> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<TypeEnum> type) {
    this.type = type;
  }

  public void setType(TypeEnum type) {
    this.type = JsonNullable.<TypeEnum>of(type);
  }


  public DiscussionTopics attachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
    
    return this;
  }

   /**
   * Has a value if the discussion topic is associated with an attachment (file).
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


  public DiscussionTopics deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp when the discussion topic was deleted.
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


  public DiscussionTopics userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The username of the topic creator.
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


  public DiscussionTopics createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date the discussion topic was made.
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


  public DiscussionTopics updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date the discussion topic was updated.
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


  public DiscussionTopics workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the discussion topic.
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


  public DiscussionTopics lockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
    
    return this;
  }

   /**
   * The datetime to lock the topic (if ever).
   * @return lockAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLockAt() {
        return lockAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCK_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLockAt_JsonNullable() {
    return lockAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCK_AT)
  public void setLockAt_JsonNullable(JsonNullable<Object> lockAt) {
    this.lockAt = lockAt;
  }

  public void setLockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
  }


  public DiscussionTopics contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context that this discussion is used in, e.g. &#x60;courses&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Course&#x60;.
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


  public DiscussionTopics contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of context this discussion is used with.
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


  public DiscussionTopics locked(Object locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Whether or not the discussion is *closed for comments*.
   * @return locked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getLocked() {
    return locked;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocked(Object locked) {
    this.locked = locked;
  }


  public DiscussionTopics assignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
    
    return this;
  }

   /**
   * The unique identifier of the assignment if the topic is for grading, otherwise NULL.
   * @return assignmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentId() {
        return assignmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentId_JsonNullable() {
    return assignmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  public void setAssignmentId_JsonNullable(JsonNullable<Object> assignmentId) {
    this.assignmentId = assignmentId;
  }

  public void setAssignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
  }


  public DiscussionTopics migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported this discussion topic.
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


  public DiscussionTopics groupCategoryId(Object groupCategoryId) {
    this.groupCategoryId = JsonNullable.<Object>of(groupCategoryId);
    
    return this;
  }

   /**
   * The unique identifier of the group category if the topic is a group discussion, otherwise NULL.
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


  public DiscussionTopics clonedItemId(Object clonedItemId) {
    this.clonedItemId = JsonNullable.<Object>of(clonedItemId);
    
    return this;
  }

   /**
   * The ID of the item in which this discussion topic was cloned from.
   * @return clonedItemId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getClonedItemId() {
        return clonedItemId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLONED_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getClonedItemId_JsonNullable() {
    return clonedItemId;
  }
  
  @JsonProperty(JSON_PROPERTY_CLONED_ITEM_ID)
  public void setClonedItemId_JsonNullable(JsonNullable<Object> clonedItemId) {
    this.clonedItemId = clonedItemId;
  }

  public void setClonedItemId(Object clonedItemId) {
    this.clonedItemId = JsonNullable.<Object>of(clonedItemId);
  }


  public DiscussionTopics lastReplyAt(Object lastReplyAt) {
    this.lastReplyAt = JsonNullable.<Object>of(lastReplyAt);
    
    return this;
  }

   /**
   * The datetime for when the last reply was in the topic.
   * @return lastReplyAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastReplyAt() {
        return lastReplyAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_REPLY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastReplyAt_JsonNullable() {
    return lastReplyAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_REPLY_AT)
  public void setLastReplyAt_JsonNullable(JsonNullable<Object> lastReplyAt) {
    this.lastReplyAt = lastReplyAt;
  }

  public void setLastReplyAt(Object lastReplyAt) {
    this.lastReplyAt = JsonNullable.<Object>of(lastReplyAt);
  }


  public DiscussionTopics delayedPostAt(Object delayedPostAt) {
    this.delayedPostAt = JsonNullable.<Object>of(delayedPostAt);
    
    return this;
  }

   /**
   * The datetime to publish the topic (if not right away).
   * @return delayedPostAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDelayedPostAt() {
        return delayedPostAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELAYED_POST_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDelayedPostAt_JsonNullable() {
    return delayedPostAt;
  }
  
  @JsonProperty(JSON_PROPERTY_DELAYED_POST_AT)
  public void setDelayedPostAt_JsonNullable(JsonNullable<Object> delayedPostAt) {
    this.delayedPostAt = delayedPostAt;
  }

  public void setDelayedPostAt(Object delayedPostAt) {
    this.delayedPostAt = JsonNullable.<Object>of(delayedPostAt);
  }


  public DiscussionTopics postedAt(Object postedAt) {
    this.postedAt = JsonNullable.<Object>of(postedAt);
    
    return this;
  }

   /**
   * The datetime the topic was posted. If it is NULL it hasn&#39;t been posted yet.
   * @return postedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPostedAt() {
        return postedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPostedAt_JsonNullable() {
    return postedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTED_AT)
  public void setPostedAt_JsonNullable(JsonNullable<Object> postedAt) {
    this.postedAt = postedAt;
  }

  public void setPostedAt(Object postedAt) {
    this.postedAt = JsonNullable.<Object>of(postedAt);
  }


  public DiscussionTopics rootTopicId(Object rootTopicId) {
    this.rootTopicId = JsonNullable.<Object>of(rootTopicId);
    
    return this;
  }

   /**
   * If the topic is for grading and a group assignment this will point to the original topic in the course.
   * @return rootTopicId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRootTopicId() {
        return rootTopicId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOT_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRootTopicId_JsonNullable() {
    return rootTopicId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOT_TOPIC_ID)
  public void setRootTopicId_JsonNullable(JsonNullable<Object> rootTopicId) {
    this.rootTopicId = rootTopicId;
  }

  public void setRootTopicId(Object rootTopicId) {
    this.rootTopicId = JsonNullable.<Object>of(rootTopicId);
  }


  public DiscussionTopics oldAssignmentId(Object oldAssignmentId) {
    this.oldAssignmentId = JsonNullable.<Object>of(oldAssignmentId);
    
    return this;
  }

   /**
   * the assignment ID after you change a topic from graded to ungraded, then restores the old one if it goes back to graded.
   * @return oldAssignmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOldAssignmentId() {
        return oldAssignmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOldAssignmentId_JsonNullable() {
    return oldAssignmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_ASSIGNMENT_ID)
  public void setOldAssignmentId_JsonNullable(JsonNullable<Object> oldAssignmentId) {
    this.oldAssignmentId = oldAssignmentId;
  }

  public void setOldAssignmentId(Object oldAssignmentId) {
    this.oldAssignmentId = JsonNullable.<Object>of(oldAssignmentId);
  }


  public DiscussionTopics subtopicsRefreshedAt(Object subtopicsRefreshedAt) {
    this.subtopicsRefreshedAt = JsonNullable.<Object>of(subtopicsRefreshedAt);
    
    return this;
  }

   /**
   * The time at which the subtopics for a group category discussion was refreshed at.
   * @return subtopicsRefreshedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubtopicsRefreshedAt() {
        return subtopicsRefreshedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBTOPICS_REFRESHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubtopicsRefreshedAt_JsonNullable() {
    return subtopicsRefreshedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBTOPICS_REFRESHED_AT)
  public void setSubtopicsRefreshedAt_JsonNullable(JsonNullable<Object> subtopicsRefreshedAt) {
    this.subtopicsRefreshedAt = subtopicsRefreshedAt;
  }

  public void setSubtopicsRefreshedAt(Object subtopicsRefreshedAt) {
    this.subtopicsRefreshedAt = JsonNullable.<Object>of(subtopicsRefreshedAt);
  }


  public DiscussionTopics externalFeedId(Object externalFeedId) {
    this.externalFeedId = JsonNullable.<Object>of(externalFeedId);
    
    return this;
  }

   /**
   * The ID of the external feed that this discussion topic was created from.
   * @return externalFeedId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExternalFeedId() {
        return externalFeedId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExternalFeedId_JsonNullable() {
    return externalFeedId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_FEED_ID)
  public void setExternalFeedId_JsonNullable(JsonNullable<Object> externalFeedId) {
    this.externalFeedId = externalFeedId;
  }

  public void setExternalFeedId(Object externalFeedId) {
    this.externalFeedId = JsonNullable.<Object>of(externalFeedId);
  }


  public DiscussionTopics podcastEnabled(Object podcastEnabled) {
    
    this.podcastEnabled = podcastEnabled;
    return this;
  }

   /**
   * Boolean to determine if the podcast is enabled.
   * @return podcastEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PODCAST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPodcastEnabled() {
    return podcastEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PODCAST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPodcastEnabled(Object podcastEnabled) {
    this.podcastEnabled = podcastEnabled;
  }


  public DiscussionTopics podcastHasStudentPosts(Object podcastHasStudentPosts) {
    
    this.podcastHasStudentPosts = podcastHasStudentPosts;
    return this;
  }

   /**
   * If true, the podcast will include posts from students as well. Implies podcast_enabled.
   * @return podcastHasStudentPosts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PODCAST_HAS_STUDENT_POSTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPodcastHasStudentPosts() {
    return podcastHasStudentPosts;
  }


  @JsonProperty(JSON_PROPERTY_PODCAST_HAS_STUDENT_POSTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPodcastHasStudentPosts(Object podcastHasStudentPosts) {
    this.podcastHasStudentPosts = podcastHasStudentPosts;
  }


  public DiscussionTopics requireInitialPost(Object requireInitialPost) {
    
    this.requireInitialPost = requireInitialPost;
    return this;
  }

   /**
   * If true then a user may not respond to other replies until that user has made an initial reply.
   * @return requireInitialPost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_INITIAL_POST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRequireInitialPost() {
    return requireInitialPost;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_INITIAL_POST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireInitialPost(Object requireInitialPost) {
    this.requireInitialPost = requireInitialPost;
  }


  public DiscussionTopics editorId(Object editorId) {
    this.editorId = JsonNullable.<Object>of(editorId);
    
    return this;
  }

   /**
   * The ID of the editor of the discussion.
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


  public DiscussionTopics discussionType(DiscussionTypeEnum discussionType) {
    this.discussionType = JsonNullable.<DiscussionTypeEnum>of(discussionType);
    
    return this;
  }

   /**
   * The type of discussion.
   * @return discussionType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public DiscussionTypeEnum getDiscussionType() {
        return discussionType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCUSSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DiscussionTypeEnum> getDiscussionType_JsonNullable() {
    return discussionType;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCUSSION_TYPE)
  public void setDiscussionType_JsonNullable(JsonNullable<DiscussionTypeEnum> discussionType) {
    this.discussionType = discussionType;
  }

  public void setDiscussionType(DiscussionTypeEnum discussionType) {
    this.discussionType = JsonNullable.<DiscussionTypeEnum>of(discussionType);
  }


  public DiscussionTopics pinned(Object pinned) {
    
    this.pinned = pinned;
    return this;
  }

   /**
   * Whether or not the discussion has been *pinned* by an instructor.
   * @return pinned
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPinned() {
    return pinned;
  }


  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPinned(Object pinned) {
    this.pinned = pinned;
  }


  public DiscussionTopics allowRating(Object allowRating) {
    
    this.allowRating = allowRating;
    return this;
  }

   /**
   * Whether or not users can rate entries in this topic.
   * @return allowRating
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_RATING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAllowRating() {
    return allowRating;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_RATING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowRating(Object allowRating) {
    this.allowRating = allowRating;
  }


  public DiscussionTopics onlyGradersCanRate(Object onlyGradersCanRate) {
    
    this.onlyGradersCanRate = onlyGradersCanRate;
    return this;
  }

   /**
   * Whether or not grade permissions are required to rate entries.
   * @return onlyGradersCanRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLY_GRADERS_CAN_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getOnlyGradersCanRate() {
    return onlyGradersCanRate;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_GRADERS_CAN_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlyGradersCanRate(Object onlyGradersCanRate) {
    this.onlyGradersCanRate = onlyGradersCanRate;
  }


  public DiscussionTopics sortByRating(Object sortByRating) {
    
    this.sortByRating = sortByRating;
    return this;
  }

   /**
   * Whether or not entries should be sorted by rating.
   * @return sortByRating
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_BY_RATING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSortByRating() {
    return sortByRating;
  }


  @JsonProperty(JSON_PROPERTY_SORT_BY_RATING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSortByRating(Object sortByRating) {
    this.sortByRating = sortByRating;
  }


  public DiscussionTopics todoDate(Object todoDate) {
    this.todoDate = JsonNullable.<Object>of(todoDate);
    
    return this;
  }

   /**
   * Date in which discussion topic will show up in the student planner feature.
   * @return todoDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTodoDate() {
        return todoDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TODO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTodoDate_JsonNullable() {
    return todoDate;
  }
  
  @JsonProperty(JSON_PROPERTY_TODO_DATE)
  public void setTodoDate_JsonNullable(JsonNullable<Object> todoDate) {
    this.todoDate = todoDate;
  }

  public void setTodoDate(Object todoDate) {
    this.todoDate = JsonNullable.<Object>of(todoDate);
  }


  public DiscussionTopics isSectionSpecific(Object isSectionSpecific) {
    
    this.isSectionSpecific = isSectionSpecific;
    return this;
  }

   /**
   * Boolean distinguishing if the topic is a section specific topic or not.
   * @return isSectionSpecific
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SECTION_SPECIFIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIsSectionSpecific() {
    return isSectionSpecific;
  }


  @JsonProperty(JSON_PROPERTY_IS_SECTION_SPECIFIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSectionSpecific(Object isSectionSpecific) {
    this.isSectionSpecific = isSectionSpecific;
  }


  public DiscussionTopics position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * The position on the discussions index page under pinned items.
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


  public DiscussionTopics title(Object title) {
    this.title = JsonNullable.<Object>of(title);
    
    return this;
  }

   /**
   * The topic title.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<Object> title) {
    this.title = title;
  }

  public void setTitle(Object title) {
    this.title = JsonNullable.<Object>of(title);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionTopics discussionTopics = (DiscussionTopics) o;
    return Objects.equals(this.id, discussionTopics.id) &&
        Objects.equals(this.message, discussionTopics.message) &&
        equalsNullable(this.type, discussionTopics.type) &&
        equalsNullable(this.attachmentId, discussionTopics.attachmentId) &&
        equalsNullable(this.deletedAt, discussionTopics.deletedAt) &&
        equalsNullable(this.userId, discussionTopics.userId) &&
        Objects.equals(this.createdAt, discussionTopics.createdAt) &&
        Objects.equals(this.updatedAt, discussionTopics.updatedAt) &&
        Objects.equals(this.workflowState, discussionTopics.workflowState) &&
        equalsNullable(this.lockAt, discussionTopics.lockAt) &&
        Objects.equals(this.contextId, discussionTopics.contextId) &&
        Objects.equals(this.contextType, discussionTopics.contextType) &&
        Objects.equals(this.locked, discussionTopics.locked) &&
        equalsNullable(this.assignmentId, discussionTopics.assignmentId) &&
        equalsNullable(this.migrationId, discussionTopics.migrationId) &&
        equalsNullable(this.groupCategoryId, discussionTopics.groupCategoryId) &&
        equalsNullable(this.clonedItemId, discussionTopics.clonedItemId) &&
        equalsNullable(this.lastReplyAt, discussionTopics.lastReplyAt) &&
        equalsNullable(this.delayedPostAt, discussionTopics.delayedPostAt) &&
        equalsNullable(this.postedAt, discussionTopics.postedAt) &&
        equalsNullable(this.rootTopicId, discussionTopics.rootTopicId) &&
        equalsNullable(this.oldAssignmentId, discussionTopics.oldAssignmentId) &&
        equalsNullable(this.subtopicsRefreshedAt, discussionTopics.subtopicsRefreshedAt) &&
        equalsNullable(this.externalFeedId, discussionTopics.externalFeedId) &&
        Objects.equals(this.podcastEnabled, discussionTopics.podcastEnabled) &&
        Objects.equals(this.podcastHasStudentPosts, discussionTopics.podcastHasStudentPosts) &&
        Objects.equals(this.requireInitialPost, discussionTopics.requireInitialPost) &&
        equalsNullable(this.editorId, discussionTopics.editorId) &&
        equalsNullable(this.discussionType, discussionTopics.discussionType) &&
        Objects.equals(this.pinned, discussionTopics.pinned) &&
        Objects.equals(this.allowRating, discussionTopics.allowRating) &&
        Objects.equals(this.onlyGradersCanRate, discussionTopics.onlyGradersCanRate) &&
        Objects.equals(this.sortByRating, discussionTopics.sortByRating) &&
        equalsNullable(this.todoDate, discussionTopics.todoDate) &&
        Objects.equals(this.isSectionSpecific, discussionTopics.isSectionSpecific) &&
        equalsNullable(this.position, discussionTopics.position) &&
        equalsNullable(this.title, discussionTopics.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, hashCodeNullable(type), hashCodeNullable(attachmentId), hashCodeNullable(deletedAt), hashCodeNullable(userId), createdAt, updatedAt, workflowState, hashCodeNullable(lockAt), contextId, contextType, locked, hashCodeNullable(assignmentId), hashCodeNullable(migrationId), hashCodeNullable(groupCategoryId), hashCodeNullable(clonedItemId), hashCodeNullable(lastReplyAt), hashCodeNullable(delayedPostAt), hashCodeNullable(postedAt), hashCodeNullable(rootTopicId), hashCodeNullable(oldAssignmentId), hashCodeNullable(subtopicsRefreshedAt), hashCodeNullable(externalFeedId), podcastEnabled, podcastHasStudentPosts, requireInitialPost, hashCodeNullable(editorId), hashCodeNullable(discussionType), pinned, allowRating, onlyGradersCanRate, sortByRating, hashCodeNullable(todoDate), isSectionSpecific, hashCodeNullable(position), hashCodeNullable(title));
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
    sb.append("class DiscussionTopics {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    groupCategoryId: ").append(toIndentedString(groupCategoryId)).append("\n");
    sb.append("    clonedItemId: ").append(toIndentedString(clonedItemId)).append("\n");
    sb.append("    lastReplyAt: ").append(toIndentedString(lastReplyAt)).append("\n");
    sb.append("    delayedPostAt: ").append(toIndentedString(delayedPostAt)).append("\n");
    sb.append("    postedAt: ").append(toIndentedString(postedAt)).append("\n");
    sb.append("    rootTopicId: ").append(toIndentedString(rootTopicId)).append("\n");
    sb.append("    oldAssignmentId: ").append(toIndentedString(oldAssignmentId)).append("\n");
    sb.append("    subtopicsRefreshedAt: ").append(toIndentedString(subtopicsRefreshedAt)).append("\n");
    sb.append("    externalFeedId: ").append(toIndentedString(externalFeedId)).append("\n");
    sb.append("    podcastEnabled: ").append(toIndentedString(podcastEnabled)).append("\n");
    sb.append("    podcastHasStudentPosts: ").append(toIndentedString(podcastHasStudentPosts)).append("\n");
    sb.append("    requireInitialPost: ").append(toIndentedString(requireInitialPost)).append("\n");
    sb.append("    editorId: ").append(toIndentedString(editorId)).append("\n");
    sb.append("    discussionType: ").append(toIndentedString(discussionType)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    allowRating: ").append(toIndentedString(allowRating)).append("\n");
    sb.append("    onlyGradersCanRate: ").append(toIndentedString(onlyGradersCanRate)).append("\n");
    sb.append("    sortByRating: ").append(toIndentedString(sortByRating)).append("\n");
    sb.append("    todoDate: ").append(toIndentedString(todoDate)).append("\n");
    sb.append("    isSectionSpecific: ").append(toIndentedString(isSectionSpecific)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

