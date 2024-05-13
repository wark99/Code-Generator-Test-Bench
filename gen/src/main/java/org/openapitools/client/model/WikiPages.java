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
import org.openapitools.client.model.WikiPagesBody;
import org.openapitools.client.model.WikiPagesUrl;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Also known as Pages. Pages store content and educational resources that are part of a course or group but don&#39;t necessarily belong in an assignment. Pages can include text, video, and links to files and other course or group content. Pages can also be linked to other pages. They can also be used as a collaboration tool for course or group wikis where only specific users can have access. Canvas keeps the entire history of the page to account for changes over time.
 */
@JsonPropertyOrder({
  WikiPages.JSON_PROPERTY_ID,
  WikiPages.JSON_PROPERTY_USER_ID,
  WikiPages.JSON_PROPERTY_CREATED_AT,
  WikiPages.JSON_PROPERTY_UPDATED_AT,
  WikiPages.JSON_PROPERTY_WORKFLOW_STATE,
  WikiPages.JSON_PROPERTY_CONTEXT_ID,
  WikiPages.JSON_PROPERTY_CONTEXT_TYPE,
  WikiPages.JSON_PROPERTY_ASSIGNMENT_ID,
  WikiPages.JSON_PROPERTY_MIGRATION_ID,
  WikiPages.JSON_PROPERTY_WIKI_ID,
  WikiPages.JSON_PROPERTY_OLD_ASSIGNMENT_ID,
  WikiPages.JSON_PROPERTY_TODO_DATE,
  WikiPages.JSON_PROPERTY_EDITING_ROLES,
  WikiPages.JSON_PROPERTY_REVISED_AT,
  WikiPages.JSON_PROPERTY_BODY,
  WikiPages.JSON_PROPERTY_URL,
  WikiPages.JSON_PROPERTY_TITLE,
  WikiPages.JSON_PROPERTY_PROTECTED_EDITING,
  WikiPages.JSON_PROPERTY_COULD_BE_LOCKED
})
@JsonTypeName("wiki_pages")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WikiPages {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * The state of a wiki page.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted"),
    
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

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of the object represented by &#x60;context_id&#x60;.
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

  public static final String JSON_PROPERTY_ASSIGNMENT_ID = "assignment_id";
  private JsonNullable<Object> assignmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WIKI_ID = "wiki_id";
  private Object wikiId = null;

  public static final String JSON_PROPERTY_OLD_ASSIGNMENT_ID = "old_assignment_id";
  private JsonNullable<Object> oldAssignmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TODO_DATE = "todo_date";
  private JsonNullable<Object> todoDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EDITING_ROLES = "editing_roles";
  private JsonNullable<Object> editingRoles = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REVISED_AT = "revised_at";
  private JsonNullable<Object> revisedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_BODY = "body";
  private WikiPagesBody body;

  public static final String JSON_PROPERTY_URL = "url";
  private WikiPagesUrl url;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<Object> title = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PROTECTED_EDITING = "protected_editing";
  private Object protectedEditing = null;

  public static final String JSON_PROPERTY_COULD_BE_LOCKED = "could_be_locked";
  private JsonNullable<Object> couldBeLocked = JsonNullable.<Object>of(null);

  public WikiPages() {
  }

  public WikiPages id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a wiki page record.
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


  public WikiPages userId(Object userId) {
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


  public WikiPages createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp showing when a &#x60;wiki_pages&#x60; record was created.
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


  public WikiPages updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp showing when a &#x60;wiki_pages&#x60; record was updated.
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


  public WikiPages workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * The state of a wiki page.
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


  public WikiPages contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The unique identifier for the context of &#x60;wiki_pages&#x60; (account, course, user).
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


  public WikiPages contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of the object represented by &#x60;context_id&#x60;.
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


  public WikiPages assignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
    
    return this;
  }

   /**
   * Assignment identifier when using &#x60;wiki_page&#x60; assignment type for an assignment.
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


  public WikiPages migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * An identifier used by the Blueprint system to match with the blueprint content.
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


  public WikiPages wikiId(Object wikiId) {
    
    this.wikiId = wikiId;
    return this;
  }

   /**
   * The unique identifier of an associated wiki record.
   * @return wikiId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIKI_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getWikiId() {
    return wikiId;
  }


  @JsonProperty(JSON_PROPERTY_WIKI_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWikiId(Object wikiId) {
    this.wikiId = wikiId;
  }


  public WikiPages oldAssignmentId(Object oldAssignmentId) {
    this.oldAssignmentId = JsonNullable.<Object>of(oldAssignmentId);
    
    return this;
  }

   /**
   * An old assignment identifier.
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


  public WikiPages todoDate(Object todoDate) {
    this.todoDate = JsonNullable.<Object>of(todoDate);
    
    return this;
  }

   /**
   * Date to set when setting this page as student to-do.
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


  public WikiPages editingRoles(Object editingRoles) {
    this.editingRoles = JsonNullable.<Object>of(editingRoles);
    
    return this;
  }

   /**
   * CSV list of the roles that are allowed to edit this page. Possible values are &#x60;teachers&#x60;, &#x60;students&#x60;, &#x60;public&#x60;.
   * @return editingRoles
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEditingRoles() {
        return editingRoles.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EDITING_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEditingRoles_JsonNullable() {
    return editingRoles;
  }
  
  @JsonProperty(JSON_PROPERTY_EDITING_ROLES)
  public void setEditingRoles_JsonNullable(JsonNullable<Object> editingRoles) {
    this.editingRoles = editingRoles;
  }

  public void setEditingRoles(Object editingRoles) {
    this.editingRoles = JsonNullable.<Object>of(editingRoles);
  }


  public WikiPages revisedAt(Object revisedAt) {
    this.revisedAt = JsonNullable.<Object>of(revisedAt);
    
    return this;
  }

   /**
   * Timestamp showing when page was last revised.
   * @return revisedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRevisedAt() {
        return revisedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REVISED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRevisedAt_JsonNullable() {
    return revisedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_REVISED_AT)
  public void setRevisedAt_JsonNullable(JsonNullable<Object> revisedAt) {
    this.revisedAt = revisedAt;
  }

  public void setRevisedAt(Object revisedAt) {
    this.revisedAt = JsonNullable.<Object>of(revisedAt);
  }


  public WikiPages body(WikiPagesBody body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WikiPagesBody getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(WikiPagesBody body) {
    this.body = body;
  }


  public WikiPages url(WikiPagesUrl url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WikiPagesUrl getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(WikiPagesUrl url) {
    this.url = url;
  }


  public WikiPages title(Object title) {
    this.title = JsonNullable.<Object>of(title);
    
    return this;
  }

   /**
   * The name of the wiki page record.
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


  public WikiPages protectedEditing(Object protectedEditing) {
    
    this.protectedEditing = protectedEditing;
    return this;
  }

   /**
   * Editing protection for the wiki page. It is false by default.
   * @return protectedEditing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTECTED_EDITING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getProtectedEditing() {
    return protectedEditing;
  }


  @JsonProperty(JSON_PROPERTY_PROTECTED_EDITING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProtectedEditing(Object protectedEditing) {
    this.protectedEditing = protectedEditing;
  }


  public WikiPages couldBeLocked(Object couldBeLocked) {
    this.couldBeLocked = JsonNullable.<Object>of(couldBeLocked);
    
    return this;
  }

   /**
   * True if the wiki page can be locked. This prevents it from being visible to others until ready.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiPages wikiPages = (WikiPages) o;
    return Objects.equals(this.id, wikiPages.id) &&
        equalsNullable(this.userId, wikiPages.userId) &&
        Objects.equals(this.createdAt, wikiPages.createdAt) &&
        Objects.equals(this.updatedAt, wikiPages.updatedAt) &&
        Objects.equals(this.workflowState, wikiPages.workflowState) &&
        Objects.equals(this.contextId, wikiPages.contextId) &&
        Objects.equals(this.contextType, wikiPages.contextType) &&
        equalsNullable(this.assignmentId, wikiPages.assignmentId) &&
        equalsNullable(this.migrationId, wikiPages.migrationId) &&
        Objects.equals(this.wikiId, wikiPages.wikiId) &&
        equalsNullable(this.oldAssignmentId, wikiPages.oldAssignmentId) &&
        equalsNullable(this.todoDate, wikiPages.todoDate) &&
        equalsNullable(this.editingRoles, wikiPages.editingRoles) &&
        equalsNullable(this.revisedAt, wikiPages.revisedAt) &&
        Objects.equals(this.body, wikiPages.body) &&
        Objects.equals(this.url, wikiPages.url) &&
        equalsNullable(this.title, wikiPages.title) &&
        Objects.equals(this.protectedEditing, wikiPages.protectedEditing) &&
        equalsNullable(this.couldBeLocked, wikiPages.couldBeLocked);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(userId), createdAt, updatedAt, workflowState, contextId, contextType, hashCodeNullable(assignmentId), hashCodeNullable(migrationId), wikiId, hashCodeNullable(oldAssignmentId), hashCodeNullable(todoDate), hashCodeNullable(editingRoles), hashCodeNullable(revisedAt), body, url, hashCodeNullable(title), protectedEditing, hashCodeNullable(couldBeLocked));
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
    sb.append("class WikiPages {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    wikiId: ").append(toIndentedString(wikiId)).append("\n");
    sb.append("    oldAssignmentId: ").append(toIndentedString(oldAssignmentId)).append("\n");
    sb.append("    todoDate: ").append(toIndentedString(todoDate)).append("\n");
    sb.append("    editingRoles: ").append(toIndentedString(editingRoles)).append("\n");
    sb.append("    revisedAt: ").append(toIndentedString(revisedAt)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    protectedEditing: ").append(toIndentedString(protectedEditing)).append("\n");
    sb.append("    couldBeLocked: ").append(toIndentedString(couldBeLocked)).append("\n");
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

