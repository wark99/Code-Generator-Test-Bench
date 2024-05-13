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
import org.openapitools.client.model.AttachmentsDisplayName;
import org.openapitools.client.model.AttachmentsFilename;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Attachments
 */
@JsonPropertyOrder({
  Attachments.JSON_PROPERTY_ID,
  Attachments.JSON_PROPERTY_DELETED_AT,
  Attachments.JSON_PROPERTY_USER_ID,
  Attachments.JSON_PROPERTY_CREATED_AT,
  Attachments.JSON_PROPERTY_UPDATED_AT,
  Attachments.JSON_PROPERTY_WORKFLOW_STATE,
  Attachments.JSON_PROPERTY_UNLOCK_AT,
  Attachments.JSON_PROPERTY_LOCK_AT,
  Attachments.JSON_PROPERTY_CONTEXT_ID,
  Attachments.JSON_PROPERTY_CONTEXT_TYPE,
  Attachments.JSON_PROPERTY_FOLDER_ID,
  Attachments.JSON_PROPERTY_FILENAME,
  Attachments.JSON_PROPERTY_LOCKED,
  Attachments.JSON_PROPERTY_FILE_STATE,
  Attachments.JSON_PROPERTY_MEDIA_ENTRY_ID,
  Attachments.JSON_PROPERTY_MD5,
  Attachments.JSON_PROPERTY_REPLACEMENT_ATTACHMENT_ID,
  Attachments.JSON_PROPERTY_USAGE_RIGHTS_ID,
  Attachments.JSON_PROPERTY_MODIFIED_AT,
  Attachments.JSON_PROPERTY_VIEWED_AT,
  Attachments.JSON_PROPERTY_COULD_BE_LOCKED,
  Attachments.JSON_PROPERTY_MIGRATION_ID,
  Attachments.JSON_PROPERTY_NAMESPACE,
  Attachments.JSON_PROPERTY_SIZE,
  Attachments.JSON_PROPERTY_DISPLAY_NAME,
  Attachments.JSON_PROPERTY_CONTENT_TYPE,
  Attachments.JSON_PROPERTY_UUID,
  Attachments.JSON_PROPERTY_ROOT_ATTACHMENT_ID
})
@JsonTypeName("attachments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Attachments {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Object> createdAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  /**
   * Current workflow state of the attachment.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    DELETED("deleted"),
    
    ERRORED("errored"),
    
    PENDING_UPLOAD("pending_upload"),
    
    PROCESSED("processed"),
    
    PROCESSING("processing"),
    
    TO_BE_ZIPPED("to_be_zipped"),
    
    UNATTACHED("unattached"),
    
    UNATTACHED_TEMPORARY("unattached_temporary"),
    
    ZIPPED("zipped"),
    
    ZIPPING("zipping");

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
  private JsonNullable<WorkflowStateEnum> workflowState = JsonNullable.<WorkflowStateEnum>of(null);

  public static final String JSON_PROPERTY_UNLOCK_AT = "unlock_at";
  private JsonNullable<Object> unlockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOCK_AT = "lock_at";
  private JsonNullable<Object> lockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private JsonNullable<Object> contextId = JsonNullable.<Object>of(null);

  /**
   * The type of the object represented by context_id.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    ASSESSMENTQUESTION("AssessmentQuestion"),
    
    ASSIGNMENT("Assignment"),
    
    ATTACHMENT("Attachment"),
    
    CONTENTEXPORT("ContentExport"),
    
    CONTENTMIGRATION("ContentMigration"),
    
    COURSE("Course"),
    
    EPORTFOLIO("Eportfolio"),
    
    EPUBEXPORT("EpubExport"),
    
    FOLDER("Folder"),
    
    GRADEBOOKUPLOAD("GradebookUpload"),
    
    GROUP("Group"),
    
    GROUPANDMEMBERSHIPIMPORTER("GroupAndMembershipImporter"),
    
    OUTCOMEIMPORT("OutcomeImport"),
    
    PURGATORY("Purgatory"),
    
    QUIZZES_QUIZ("Quizzes::Quiz"),
    
    QUIZZES_QUIZSTATISTICS("Quizzes::QuizStatistics"),
    
    QUIZZES_QUIZSUBMISSION("Quizzes::QuizSubmission"),
    
    SISBATCH("SisBatch"),
    
    SUBMISSION("Submission"),
    
    USER("User");

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

  public static final String JSON_PROPERTY_FOLDER_ID = "folder_id";
  private JsonNullable<Object> folderId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private AttachmentsFilename filename;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private Object locked = null;

  /**
   * Similar to &#x60;workflow_state&#x60; but for the file itself.
   */
  public enum FileStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    UNPUBLISHED("unpublished"),
    
    PUBLISHED("published"),
    
    DELETED("deleted"),
    
    AVAILABLE("available"),
    
    HIDDEN("hidden"),
    
    ERRORED("errored"),
    
    BROKEN("broken");

    private Object value;

    FileStateEnum(Object value) {
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
    public static FileStateEnum fromValue(Object value) {
      for (FileStateEnum b : FileStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_FILE_STATE = "file_state";
  private FileStateEnum fileState = null;

  public static final String JSON_PROPERTY_MEDIA_ENTRY_ID = "media_entry_id";
  private JsonNullable<Object> mediaEntryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MD5 = "md5";
  private JsonNullable<Object> md5 = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REPLACEMENT_ATTACHMENT_ID = "replacement_attachment_id";
  private JsonNullable<Object> replacementAttachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USAGE_RIGHTS_ID = "usage_rights_id";
  private JsonNullable<Object> usageRightsId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private JsonNullable<Object> modifiedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_VIEWED_AT = "viewed_at";
  private JsonNullable<Object> viewedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COULD_BE_LOCKED = "could_be_locked";
  private JsonNullable<Object> couldBeLocked = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private JsonNullable<Object> namespace = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIZE = "size";
  private JsonNullable<Object> size = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private AttachmentsDisplayName displayName;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private JsonNullable<Object> contentType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UUID = "uuid";
  private JsonNullable<Object> uuid = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ROOT_ATTACHMENT_ID = "root_attachment_id";
  private JsonNullable<Object> rootAttachmentId = JsonNullable.<Object>of(null);

  public Attachments() {
  }

  public Attachments id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of an attachment record.
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


  public Attachments deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp showing when this record was deleted. If the record has not been deleted the value will be NULL.
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


  public Attachments userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The unique ID of a user.
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


  public Attachments createdAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
    
    return this;
  }

   /**
   * Timestamp showing when an attachments record was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCreatedAt() {
        return createdAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCreatedAt_JsonNullable() {
    return createdAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  public void setCreatedAt_JsonNullable(JsonNullable<Object> createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
  }


  public Attachments updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Timestamp showing when an attachments record was updated.
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


  public Attachments workflowState(WorkflowStateEnum workflowState) {
    this.workflowState = JsonNullable.<WorkflowStateEnum>of(workflowState);
    
    return this;
  }

   /**
   * Current workflow state of the attachment.
   * @return workflowState
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WorkflowStateEnum getWorkflowState() {
        return workflowState.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORKFLOW_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkflowStateEnum> getWorkflowState_JsonNullable() {
    return workflowState;
  }
  
  @JsonProperty(JSON_PROPERTY_WORKFLOW_STATE)
  public void setWorkflowState_JsonNullable(JsonNullable<WorkflowStateEnum> workflowState) {
    this.workflowState = workflowState;
  }

  public void setWorkflowState(WorkflowStateEnum workflowState) {
    this.workflowState = JsonNullable.<WorkflowStateEnum>of(workflowState);
  }


  public Attachments unlockAt(Object unlockAt) {
    this.unlockAt = JsonNullable.<Object>of(unlockAt);
    
    return this;
  }

   /**
   * The date-time to unlock the file at.
   * @return unlockAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUnlockAt() {
        return unlockAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNLOCK_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUnlockAt_JsonNullable() {
    return unlockAt;
  }
  
  @JsonProperty(JSON_PROPERTY_UNLOCK_AT)
  public void setUnlockAt_JsonNullable(JsonNullable<Object> unlockAt) {
    this.unlockAt = unlockAt;
  }

  public void setUnlockAt(Object unlockAt) {
    this.unlockAt = JsonNullable.<Object>of(unlockAt);
  }


  public Attachments lockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
    
    return this;
  }

   /**
   * The date-time to lock the file at.
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


  public Attachments contextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
    
    return this;
  }

   /**
   * The unique identifier of the attachments&#39;s context.
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


  public Attachments contextType(ContextTypeEnum contextType) {
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


  public Attachments folderId(Object folderId) {
    this.folderId = JsonNullable.<Object>of(folderId);
    
    return this;
  }

   /**
   * The unique identifier of a folder record.
   * @return folderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFolderId() {
        return folderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFolderId_JsonNullable() {
    return folderId;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  public void setFolderId_JsonNullable(JsonNullable<Object> folderId) {
    this.folderId = folderId;
  }

  public void setFolderId(Object folderId) {
    this.folderId = JsonNullable.<Object>of(folderId);
  }


  public Attachments filename(AttachmentsFilename filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachmentsFilename getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilename(AttachmentsFilename filename) {
    this.filename = filename;
  }


  public Attachments locked(Object locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Flag if file is locked or available.
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


  public Attachments fileState(FileStateEnum fileState) {
    
    this.fileState = fileState;
    return this;
  }

   /**
   * Similar to &#x60;workflow_state&#x60; but for the file itself.
   * @return fileState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileStateEnum getFileState() {
    return fileState;
  }


  @JsonProperty(JSON_PROPERTY_FILE_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileState(FileStateEnum fileState) {
    this.fileState = fileState;
  }


  public Attachments mediaEntryId(Object mediaEntryId) {
    this.mediaEntryId = JsonNullable.<Object>of(mediaEntryId);
    
    return this;
  }

   /**
   * The ID of a Kaltura/Notorious media entry associated with the file.
   * @return mediaEntryId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMediaEntryId() {
        return mediaEntryId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_ENTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMediaEntryId_JsonNullable() {
    return mediaEntryId;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_ENTRY_ID)
  public void setMediaEntryId_JsonNullable(JsonNullable<Object> mediaEntryId) {
    this.mediaEntryId = mediaEntryId;
  }

  public void setMediaEntryId(Object mediaEntryId) {
    this.mediaEntryId = JsonNullable.<Object>of(mediaEntryId);
  }


  public Attachments md5(Object md5) {
    this.md5 = JsonNullable.<Object>of(md5);
    
    return this;
  }

   /**
   * A hash of the file. Historically this was MD5 in Canvas Data 1 and API but newer records store a SHA512 in this column.
   * @return md5
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMd5() {
        return md5.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMd5_JsonNullable() {
    return md5;
  }
  
  @JsonProperty(JSON_PROPERTY_MD5)
  public void setMd5_JsonNullable(JsonNullable<Object> md5) {
    this.md5 = md5;
  }

  public void setMd5(Object md5) {
    this.md5 = JsonNullable.<Object>of(md5);
  }


  public Attachments replacementAttachmentId(Object replacementAttachmentId) {
    this.replacementAttachmentId = JsonNullable.<Object>of(replacementAttachmentId);
    
    return this;
  }

   /**
   * The unique identifier of the attachment that this record replaced.
   * @return replacementAttachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getReplacementAttachmentId() {
        return replacementAttachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPLACEMENT_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getReplacementAttachmentId_JsonNullable() {
    return replacementAttachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_ATTACHMENT_ID)
  public void setReplacementAttachmentId_JsonNullable(JsonNullable<Object> replacementAttachmentId) {
    this.replacementAttachmentId = replacementAttachmentId;
  }

  public void setReplacementAttachmentId(Object replacementAttachmentId) {
    this.replacementAttachmentId = JsonNullable.<Object>of(replacementAttachmentId);
  }


  public Attachments usageRightsId(Object usageRightsId) {
    this.usageRightsId = JsonNullable.<Object>of(usageRightsId);
    
    return this;
  }

   /**
   * The unique identifier for the &#x60;usage_rights&#x60; record.
   * @return usageRightsId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUsageRightsId() {
        return usageRightsId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USAGE_RIGHTS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUsageRightsId_JsonNullable() {
    return usageRightsId;
  }
  
  @JsonProperty(JSON_PROPERTY_USAGE_RIGHTS_ID)
  public void setUsageRightsId_JsonNullable(JsonNullable<Object> usageRightsId) {
    this.usageRightsId = usageRightsId;
  }

  public void setUsageRightsId(Object usageRightsId) {
    this.usageRightsId = JsonNullable.<Object>of(usageRightsId);
  }


  public Attachments modifiedAt(Object modifiedAt) {
    this.modifiedAt = JsonNullable.<Object>of(modifiedAt);
    
    return this;
  }

   /**
   * Timestamp showing when an attachment record was updated.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getModifiedAt() {
        return modifiedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getModifiedAt_JsonNullable() {
    return modifiedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  public void setModifiedAt_JsonNullable(JsonNullable<Object> modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public void setModifiedAt(Object modifiedAt) {
    this.modifiedAt = JsonNullable.<Object>of(modifiedAt);
  }


  public Attachments viewedAt(Object viewedAt) {
    this.viewedAt = JsonNullable.<Object>of(viewedAt);
    
    return this;
  }

   /**
   * Timestamp showing when an attachment record was last viewed.
   * @return viewedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getViewedAt() {
        return viewedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getViewedAt_JsonNullable() {
    return viewedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEWED_AT)
  public void setViewedAt_JsonNullable(JsonNullable<Object> viewedAt) {
    this.viewedAt = viewedAt;
  }

  public void setViewedAt(Object viewedAt) {
    this.viewedAt = JsonNullable.<Object>of(viewedAt);
  }


  public Attachments couldBeLocked(Object couldBeLocked) {
    this.couldBeLocked = JsonNullable.<Object>of(couldBeLocked);
    
    return this;
  }

   /**
   * True if the file is in a lockable module item.
   * @return couldBeLocked
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCouldBeLocked() {
        return couldBeLocked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COULD_BE_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCouldBeLocked_JsonNullable() {
    return couldBeLocked;
  }
  
  @JsonProperty(JSON_PROPERTY_COULD_BE_LOCKED)
  public void setCouldBeLocked_JsonNullable(JsonNullable<Object> couldBeLocked) {
    this.couldBeLocked = couldBeLocked;
  }

  public void setCouldBeLocked(Object couldBeLocked) {
    this.couldBeLocked = JsonNullable.<Object>of(couldBeLocked);
  }


  public Attachments migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * Only applicable for files which have been imported via a content migration, an opaque identifier for the file in its source. This field is used by Canvas to identify when a file is being re-imported, and can also be used to identify multiple files that have been copied from the same source.
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


  public Attachments namespace(Object namespace) {
    this.namespace = JsonNullable.<Object>of(namespace);
    
    return this;
  }

   /**
   * The asset string of the root account associated with the file&#39;s storage.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNamespace() {
        return namespace.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNamespace_JsonNullable() {
    return namespace;
  }
  
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  public void setNamespace_JsonNullable(JsonNullable<Object> namespace) {
    this.namespace = namespace;
  }

  public void setNamespace(Object namespace) {
    this.namespace = JsonNullable.<Object>of(namespace);
  }


  public Attachments size(Object size) {
    this.size = JsonNullable.<Object>of(size);
    
    return this;
  }

   /**
   * The size of the file in bytes.
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSize() {
        return size.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSize_JsonNullable() {
    return size;
  }
  
  @JsonProperty(JSON_PROPERTY_SIZE)
  public void setSize_JsonNullable(JsonNullable<Object> size) {
    this.size = size;
  }

  public void setSize(Object size) {
    this.size = JsonNullable.<Object>of(size);
  }


  public Attachments displayName(AttachmentsDisplayName displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachmentsDisplayName getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(AttachmentsDisplayName displayName) {
    this.displayName = displayName;
  }


  public Attachments contentType(Object contentType) {
    this.contentType = JsonNullable.<Object>of(contentType);
    
    return this;
  }

   /**
   * MIME type of the associated file.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContentType() {
        return contentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContentType_JsonNullable() {
    return contentType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  public void setContentType_JsonNullable(JsonNullable<Object> contentType) {
    this.contentType = contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = JsonNullable.<Object>of(contentType);
  }


  public Attachments uuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
    
    return this;
  }

   /**
   * The UUID of the attachment.
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


  public Attachments rootAttachmentId(Object rootAttachmentId) {
    this.rootAttachmentId = JsonNullable.<Object>of(rootAttachmentId);
    
    return this;
  }

   /**
   * Identifier of the source file from which this file was copied and created. Defaults to &#x60;NULL&#x60; when this is the only copy.
   * @return rootAttachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRootAttachmentId() {
        return rootAttachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOT_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRootAttachmentId_JsonNullable() {
    return rootAttachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOT_ATTACHMENT_ID)
  public void setRootAttachmentId_JsonNullable(JsonNullable<Object> rootAttachmentId) {
    this.rootAttachmentId = rootAttachmentId;
  }

  public void setRootAttachmentId(Object rootAttachmentId) {
    this.rootAttachmentId = JsonNullable.<Object>of(rootAttachmentId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachments attachments = (Attachments) o;
    return Objects.equals(this.id, attachments.id) &&
        equalsNullable(this.deletedAt, attachments.deletedAt) &&
        equalsNullable(this.userId, attachments.userId) &&
        equalsNullable(this.createdAt, attachments.createdAt) &&
        equalsNullable(this.updatedAt, attachments.updatedAt) &&
        equalsNullable(this.workflowState, attachments.workflowState) &&
        equalsNullable(this.unlockAt, attachments.unlockAt) &&
        equalsNullable(this.lockAt, attachments.lockAt) &&
        equalsNullable(this.contextId, attachments.contextId) &&
        equalsNullable(this.contextType, attachments.contextType) &&
        equalsNullable(this.folderId, attachments.folderId) &&
        Objects.equals(this.filename, attachments.filename) &&
        Objects.equals(this.locked, attachments.locked) &&
        Objects.equals(this.fileState, attachments.fileState) &&
        equalsNullable(this.mediaEntryId, attachments.mediaEntryId) &&
        equalsNullable(this.md5, attachments.md5) &&
        equalsNullable(this.replacementAttachmentId, attachments.replacementAttachmentId) &&
        equalsNullable(this.usageRightsId, attachments.usageRightsId) &&
        equalsNullable(this.modifiedAt, attachments.modifiedAt) &&
        equalsNullable(this.viewedAt, attachments.viewedAt) &&
        equalsNullable(this.couldBeLocked, attachments.couldBeLocked) &&
        equalsNullable(this.migrationId, attachments.migrationId) &&
        equalsNullable(this.namespace, attachments.namespace) &&
        equalsNullable(this.size, attachments.size) &&
        Objects.equals(this.displayName, attachments.displayName) &&
        equalsNullable(this.contentType, attachments.contentType) &&
        equalsNullable(this.uuid, attachments.uuid) &&
        equalsNullable(this.rootAttachmentId, attachments.rootAttachmentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(deletedAt), hashCodeNullable(userId), hashCodeNullable(createdAt), hashCodeNullable(updatedAt), hashCodeNullable(workflowState), hashCodeNullable(unlockAt), hashCodeNullable(lockAt), hashCodeNullable(contextId), hashCodeNullable(contextType), hashCodeNullable(folderId), filename, locked, fileState, hashCodeNullable(mediaEntryId), hashCodeNullable(md5), hashCodeNullable(replacementAttachmentId), hashCodeNullable(usageRightsId), hashCodeNullable(modifiedAt), hashCodeNullable(viewedAt), hashCodeNullable(couldBeLocked), hashCodeNullable(migrationId), hashCodeNullable(namespace), hashCodeNullable(size), displayName, hashCodeNullable(contentType), hashCodeNullable(uuid), hashCodeNullable(rootAttachmentId));
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
    sb.append("class Attachments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    mediaEntryId: ").append(toIndentedString(mediaEntryId)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    replacementAttachmentId: ").append(toIndentedString(replacementAttachmentId)).append("\n");
    sb.append("    usageRightsId: ").append(toIndentedString(usageRightsId)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    viewedAt: ").append(toIndentedString(viewedAt)).append("\n");
    sb.append("    couldBeLocked: ").append(toIndentedString(couldBeLocked)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    rootAttachmentId: ").append(toIndentedString(rootAttachmentId)).append("\n");
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

