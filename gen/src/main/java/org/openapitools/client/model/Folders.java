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
import org.openapitools.client.model.FoldersFullName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Folders
 */
@JsonPropertyOrder({
  Folders.JSON_PROPERTY_ID,
  Folders.JSON_PROPERTY_NAME,
  Folders.JSON_PROPERTY_FULL_NAME,
  Folders.JSON_PROPERTY_DELETED_AT,
  Folders.JSON_PROPERTY_CREATED_AT,
  Folders.JSON_PROPERTY_UPDATED_AT,
  Folders.JSON_PROPERTY_WORKFLOW_STATE,
  Folders.JSON_PROPERTY_UNLOCK_AT,
  Folders.JSON_PROPERTY_LOCK_AT,
  Folders.JSON_PROPERTY_CONTEXT_ID,
  Folders.JSON_PROPERTY_CONTEXT_TYPE,
  Folders.JSON_PROPERTY_LOCKED,
  Folders.JSON_PROPERTY_CLONED_ITEM_ID,
  Folders.JSON_PROPERTY_SUBMISSION_CONTEXT_CODE,
  Folders.JSON_PROPERTY_PARENT_FOLDER_ID,
  Folders.JSON_PROPERTY_UNIQUE_TYPE,
  Folders.JSON_PROPERTY_POSITION
})
@JsonTypeName("folders")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Folders {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private FoldersFullName fullName;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * In this context the workflow state indicates the visibility of the folder.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted"),
    
    HIDDEN("hidden"),
    
    PRIVATE("private"),
    
    VISIBLE("visible");

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

  public static final String JSON_PROPERTY_UNLOCK_AT = "unlock_at";
  private JsonNullable<Object> unlockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOCK_AT = "lock_at";
  private JsonNullable<Object> lockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of the object represented by context_id.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    COURSE("Course"),
    
    GROUP("Group"),
    
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
  private ContextTypeEnum contextType = null;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private JsonNullable<Object> locked = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CLONED_ITEM_ID = "cloned_item_id";
  private JsonNullable<Object> clonedItemId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMISSION_CONTEXT_CODE = "submission_context_code";
  private JsonNullable<Object> submissionContextCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PARENT_FOLDER_ID = "parent_folder_id";
  private JsonNullable<Object> parentFolderId = JsonNullable.<Object>of(null);

  /**
   * Value indicating what kind of files are stored in this folder. NULL is the most common value, meaning this is a standard folder. &#x60;media&#x60; is a special case where media files are stored.
   */
  public enum UniqueTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    MEDIA("media"),
    
    STUDENT_ANNOTATION_DOCUMENTS("student annotation documents"),
    
    ICON_MAKER_ICONS("icon maker icons"),
    
    BUTTONS_AND_ICONS("buttons and icons");

    private Object value;

    UniqueTypeEnum(Object value) {
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
    public static UniqueTypeEnum fromValue(Object value) {
      for (UniqueTypeEnum b : UniqueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_UNIQUE_TYPE = "unique_type";
  private JsonNullable<UniqueTypeEnum> uniqueType = JsonNullable.<UniqueTypeEnum>of(null);

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public Folders() {
  }

  public Folders id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a folder record.
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


  public Folders name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * Name of the folder.
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


  public Folders fullName(FoldersFullName fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FoldersFullName getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(FoldersFullName fullName) {
    this.fullName = fullName;
  }


  public Folders deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp when this record was deleted. If the record has not been deleted the value will be NULL.
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


  public Folders createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when a folders record was created.
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


  public Folders updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a folders record was updated.
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


  public Folders workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * In this context the workflow state indicates the visibility of the folder.
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


  public Folders unlockAt(Object unlockAt) {
    this.unlockAt = JsonNullable.<Object>of(unlockAt);
    
    return this;
  }

   /**
   * Indicates the date at which this folder should become accessible.
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


  public Folders lockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
    
    return this;
  }

   /**
   * Indicates the date at which this folder should no longer be accessible.
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


  public Folders contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The unique identifier for the folders&#39;s context (account, course, user).
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


  public Folders contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of the object represented by context_id.
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


  public Folders locked(Object locked) {
    this.locked = JsonNullable.<Object>of(locked);
    
    return this;
  }

   /**
   * Indicates if the folder is currently accessible [NULL&#x3D;false].
   * @return locked
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLocked() {
        return locked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLocked_JsonNullable() {
    return locked;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED)
  public void setLocked_JsonNullable(JsonNullable<Object> locked) {
    this.locked = locked;
  }

  public void setLocked(Object locked) {
    this.locked = JsonNullable.<Object>of(locked);
  }


  public Folders clonedItemId(Object clonedItemId) {
    this.clonedItemId = JsonNullable.<Object>of(clonedItemId);
    
    return this;
  }

   /**
   * Unique identifier of the folder that this folder was cloned from.
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


  public Folders submissionContextCode(Object submissionContextCode) {
    this.submissionContextCode = JsonNullable.<Object>of(submissionContextCode);
    
    return this;
  }

   /**
   * A value indicating the context to which this folder should be submitted if it is for a submission.
   * @return submissionContextCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmissionContextCode() {
        return submissionContextCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_CONTEXT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmissionContextCode_JsonNullable() {
    return submissionContextCode;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_CONTEXT_CODE)
  public void setSubmissionContextCode_JsonNullable(JsonNullable<Object> submissionContextCode) {
    this.submissionContextCode = submissionContextCode;
  }

  public void setSubmissionContextCode(Object submissionContextCode) {
    this.submissionContextCode = JsonNullable.<Object>of(submissionContextCode);
  }


  public Folders parentFolderId(Object parentFolderId) {
    this.parentFolderId = JsonNullable.<Object>of(parentFolderId);
    
    return this;
  }

   /**
   * Id of the parent folder.
   * @return parentFolderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getParentFolderId() {
        return parentFolderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getParentFolderId_JsonNullable() {
    return parentFolderId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_ID)
  public void setParentFolderId_JsonNullable(JsonNullable<Object> parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public void setParentFolderId(Object parentFolderId) {
    this.parentFolderId = JsonNullable.<Object>of(parentFolderId);
  }


  public Folders uniqueType(UniqueTypeEnum uniqueType) {
    this.uniqueType = JsonNullable.<UniqueTypeEnum>of(uniqueType);
    
    return this;
  }

   /**
   * Value indicating what kind of files are stored in this folder. NULL is the most common value, meaning this is a standard folder. &#x60;media&#x60; is a special case where media files are stored.
   * @return uniqueType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UniqueTypeEnum getUniqueType() {
        return uniqueType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIQUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UniqueTypeEnum> getUniqueType_JsonNullable() {
    return uniqueType;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIQUE_TYPE)
  public void setUniqueType_JsonNullable(JsonNullable<UniqueTypeEnum> uniqueType) {
    this.uniqueType = uniqueType;
  }

  public void setUniqueType(UniqueTypeEnum uniqueType) {
    this.uniqueType = JsonNullable.<UniqueTypeEnum>of(uniqueType);
  }


  public Folders position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * An integer value used for sorting the order in which the folder is listed.
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
    Folders folders = (Folders) o;
    return Objects.equals(this.id, folders.id) &&
        equalsNullable(this.name, folders.name) &&
        Objects.equals(this.fullName, folders.fullName) &&
        equalsNullable(this.deletedAt, folders.deletedAt) &&
        Objects.equals(this.createdAt, folders.createdAt) &&
        Objects.equals(this.updatedAt, folders.updatedAt) &&
        Objects.equals(this.workflowState, folders.workflowState) &&
        equalsNullable(this.unlockAt, folders.unlockAt) &&
        equalsNullable(this.lockAt, folders.lockAt) &&
        Objects.equals(this.contextId, folders.contextId) &&
        Objects.equals(this.contextType, folders.contextType) &&
        equalsNullable(this.locked, folders.locked) &&
        equalsNullable(this.clonedItemId, folders.clonedItemId) &&
        equalsNullable(this.submissionContextCode, folders.submissionContextCode) &&
        equalsNullable(this.parentFolderId, folders.parentFolderId) &&
        equalsNullable(this.uniqueType, folders.uniqueType) &&
        equalsNullable(this.position, folders.position);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), fullName, hashCodeNullable(deletedAt), createdAt, updatedAt, workflowState, hashCodeNullable(unlockAt), hashCodeNullable(lockAt), contextId, contextType, hashCodeNullable(locked), hashCodeNullable(clonedItemId), hashCodeNullable(submissionContextCode), hashCodeNullable(parentFolderId), hashCodeNullable(uniqueType), hashCodeNullable(position));
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
    sb.append("class Folders {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    clonedItemId: ").append(toIndentedString(clonedItemId)).append("\n");
    sb.append("    submissionContextCode: ").append(toIndentedString(submissionContextCode)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    uniqueType: ").append(toIndentedString(uniqueType)).append("\n");
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

