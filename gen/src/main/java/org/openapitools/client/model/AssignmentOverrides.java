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
 * There may be many records in this table for each assignment. Use the data in this table to calculate actual due, all day, lock and unlock dates/times.
 */
@JsonPropertyOrder({
  AssignmentOverrides.JSON_PROPERTY_ID,
  AssignmentOverrides.JSON_PROPERTY_CREATED_AT,
  AssignmentOverrides.JSON_PROPERTY_UPDATED_AT,
  AssignmentOverrides.JSON_PROPERTY_WORKFLOW_STATE,
  AssignmentOverrides.JSON_PROPERTY_DUE_AT,
  AssignmentOverrides.JSON_PROPERTY_UNLOCK_AT,
  AssignmentOverrides.JSON_PROPERTY_LOCK_AT,
  AssignmentOverrides.JSON_PROPERTY_ALL_DAY,
  AssignmentOverrides.JSON_PROPERTY_ASSIGNMENT_VERSION,
  AssignmentOverrides.JSON_PROPERTY_SET_TYPE,
  AssignmentOverrides.JSON_PROPERTY_SET_ID,
  AssignmentOverrides.JSON_PROPERTY_DUE_AT_OVERRIDDEN,
  AssignmentOverrides.JSON_PROPERTY_UNLOCK_AT_OVERRIDDEN,
  AssignmentOverrides.JSON_PROPERTY_LOCK_AT_OVERRIDDEN,
  AssignmentOverrides.JSON_PROPERTY_QUIZ_ID,
  AssignmentOverrides.JSON_PROPERTY_QUIZ_VERSION,
  AssignmentOverrides.JSON_PROPERTY_ASSIGNMENT_ID,
  AssignmentOverrides.JSON_PROPERTY_ALL_DAY_DATE,
  AssignmentOverrides.JSON_PROPERTY_TITLE
})
@JsonTypeName("assignment_overrides")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AssignmentOverrides {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Gives the workflow state of this record.
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

  public static final String JSON_PROPERTY_DUE_AT = "due_at";
  private JsonNullable<Object> dueAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UNLOCK_AT = "unlock_at";
  private JsonNullable<Object> unlockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOCK_AT = "lock_at";
  private JsonNullable<Object> lockAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALL_DAY = "all_day";
  private JsonNullable<Object> allDay = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_VERSION = "assignment_version";
  private JsonNullable<Object> assignmentVersion = JsonNullable.<Object>of(null);

  /**
   * Used in conjunction with &#x60;set_id&#x60;, this field tells us what type of foreign relation is used.
   */
  public enum SetTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    GROUP("Group"),
    
    COURSESECTION("CourseSection"),
    
    ADHOC("ADHOC"),
    
    NOOP("Noop");

    private Object value;

    SetTypeEnum(Object value) {
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
    public static SetTypeEnum fromValue(Object value) {
      for (SetTypeEnum b : SetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SET_TYPE = "set_type";
  private SetTypeEnum setType = null;

  public static final String JSON_PROPERTY_SET_ID = "set_id";
  private JsonNullable<Object> setId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DUE_AT_OVERRIDDEN = "due_at_overridden";
  private Object dueAtOverridden = null;

  public static final String JSON_PROPERTY_UNLOCK_AT_OVERRIDDEN = "unlock_at_overridden";
  private Object unlockAtOverridden = null;

  public static final String JSON_PROPERTY_LOCK_AT_OVERRIDDEN = "lock_at_overridden";
  private Object lockAtOverridden = null;

  public static final String JSON_PROPERTY_QUIZ_ID = "quiz_id";
  private JsonNullable<Object> quizId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUIZ_VERSION = "quiz_version";
  private JsonNullable<Object> quizVersion = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_ID = "assignment_id";
  private JsonNullable<Object> assignmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALL_DAY_DATE = "all_day_date";
  private JsonNullable<Object> allDayDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TITLE = "title";
  private Object title = null;

  public AssignmentOverrides() {
  }

  public AssignmentOverrides id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;assignment_override&#x60;.
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


  public AssignmentOverrides createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the &#x60;assignment_override&#x60; was created.
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


  public AssignmentOverrides updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the &#x60;assignment_override&#x60; was last updated.
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


  public AssignmentOverrides workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Gives the workflow state of this record.
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


  public AssignmentOverrides dueAt(Object dueAt) {
    this.dueAt = JsonNullable.<Object>of(dueAt);
    
    return this;
  }

   /**
   * The new *due at* date-time for this group of users.
   * @return dueAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDueAt() {
        return dueAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDueAt_JsonNullable() {
    return dueAt;
  }
  
  @JsonProperty(JSON_PROPERTY_DUE_AT)
  public void setDueAt_JsonNullable(JsonNullable<Object> dueAt) {
    this.dueAt = dueAt;
  }

  public void setDueAt(Object dueAt) {
    this.dueAt = JsonNullable.<Object>of(dueAt);
  }


  public AssignmentOverrides unlockAt(Object unlockAt) {
    this.unlockAt = JsonNullable.<Object>of(unlockAt);
    
    return this;
  }

   /**
   * The new *unlock at* date-time for this group of users.
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


  public AssignmentOverrides lockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
    
    return this;
  }

   /**
   * The new *lock at* date-time for this group of users.
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


  public AssignmentOverrides allDay(Object allDay) {
    this.allDay = JsonNullable.<Object>of(allDay);
    
    return this;
  }

   /**
   * Indicates if the &#x60;all_day&#x60; field overrides the original &#x60;all_day&#x60; field in the table &#x60;assignment&#x60; for this group of users.
   * @return allDay
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllDay() {
        return allDay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALL_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllDay_JsonNullable() {
    return allDay;
  }
  
  @JsonProperty(JSON_PROPERTY_ALL_DAY)
  public void setAllDay_JsonNullable(JsonNullable<Object> allDay) {
    this.allDay = allDay;
  }

  public void setAllDay(Object allDay) {
    this.allDay = JsonNullable.<Object>of(allDay);
  }


  public AssignmentOverrides assignmentVersion(Object assignmentVersion) {
    this.assignmentVersion = JsonNullable.<Object>of(assignmentVersion);
    
    return this;
  }

   /**
   * The version of the assignment this override is applied to.
   * @return assignmentVersion
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentVersion() {
        return assignmentVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentVersion_JsonNullable() {
    return assignmentVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_VERSION)
  public void setAssignmentVersion_JsonNullable(JsonNullable<Object> assignmentVersion) {
    this.assignmentVersion = assignmentVersion;
  }

  public void setAssignmentVersion(Object assignmentVersion) {
    this.assignmentVersion = JsonNullable.<Object>of(assignmentVersion);
  }


  public AssignmentOverrides setType(SetTypeEnum setType) {
    
    this.setType = setType;
    return this;
  }

   /**
   * Used in conjunction with &#x60;set_id&#x60;, this field tells us what type of foreign relation is used.
   * @return setType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SetTypeEnum getSetType() {
    return setType;
  }


  @JsonProperty(JSON_PROPERTY_SET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSetType(SetTypeEnum setType) {
    this.setType = setType;
  }


  public AssignmentOverrides setId(Object setId) {
    this.setId = JsonNullable.<Object>of(setId);
    
    return this;
  }

   /**
   * The primary key for the object type described in &#x60;set_id&#x60;.
   * @return setId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSetId() {
        return setId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSetId_JsonNullable() {
    return setId;
  }
  
  @JsonProperty(JSON_PROPERTY_SET_ID)
  public void setSetId_JsonNullable(JsonNullable<Object> setId) {
    this.setId = setId;
  }

  public void setSetId(Object setId) {
    this.setId = JsonNullable.<Object>of(setId);
  }


  public AssignmentOverrides dueAtOverridden(Object dueAtOverridden) {
    
    this.dueAtOverridden = dueAtOverridden;
    return this;
  }

   /**
   * Indicates if the &#x60;unlock_at&#x60; field overrides the original.
   * @return dueAtOverridden
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_AT_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDueAtOverridden() {
    return dueAtOverridden;
  }


  @JsonProperty(JSON_PROPERTY_DUE_AT_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDueAtOverridden(Object dueAtOverridden) {
    this.dueAtOverridden = dueAtOverridden;
  }


  public AssignmentOverrides unlockAtOverridden(Object unlockAtOverridden) {
    
    this.unlockAtOverridden = unlockAtOverridden;
    return this;
  }

   /**
   * Indicates if the &#x60;unlock_at&#x60; field overrides the original &#x60;unlock_at&#x60; field in the table &#x60;assignment&#x60; for this group of users.
   * @return unlockAtOverridden
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLOCK_AT_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUnlockAtOverridden() {
    return unlockAtOverridden;
  }


  @JsonProperty(JSON_PROPERTY_UNLOCK_AT_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnlockAtOverridden(Object unlockAtOverridden) {
    this.unlockAtOverridden = unlockAtOverridden;
  }


  public AssignmentOverrides lockAtOverridden(Object lockAtOverridden) {
    
    this.lockAtOverridden = lockAtOverridden;
    return this;
  }

   /**
   * Indicates if the &#x60;lock_at&#x60; field overrides the original &#x60;lock_at&#x60; field in the table &#x60;assignment&#x60; for this group of users.
   * @return lockAtOverridden
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCK_AT_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getLockAtOverridden() {
    return lockAtOverridden;
  }


  @JsonProperty(JSON_PROPERTY_LOCK_AT_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLockAtOverridden(Object lockAtOverridden) {
    this.lockAtOverridden = lockAtOverridden;
  }


  public AssignmentOverrides quizId(Object quizId) {
    this.quizId = JsonNullable.<Object>of(quizId);
    
    return this;
  }

   /**
   * Identifies the quiz the override is associated with.
   * @return quizId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizId() {
        return quizId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizId_JsonNullable() {
    return quizId;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_ID)
  public void setQuizId_JsonNullable(JsonNullable<Object> quizId) {
    this.quizId = quizId;
  }

  public void setQuizId(Object quizId) {
    this.quizId = JsonNullable.<Object>of(quizId);
  }


  public AssignmentOverrides quizVersion(Object quizVersion) {
    this.quizVersion = JsonNullable.<Object>of(quizVersion);
    
    return this;
  }

   /**
   * The version of the quiz this override is applied to.
   * @return quizVersion
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizVersion() {
        return quizVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizVersion_JsonNullable() {
    return quizVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_VERSION)
  public void setQuizVersion_JsonNullable(JsonNullable<Object> quizVersion) {
    this.quizVersion = quizVersion;
  }

  public void setQuizVersion(Object quizVersion) {
    this.quizVersion = JsonNullable.<Object>of(quizVersion);
  }


  public AssignmentOverrides assignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
    
    return this;
  }

   /**
   * Identifies the assignment the override is associated with.
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


  public AssignmentOverrides allDayDate(Object allDayDate) {
    this.allDayDate = JsonNullable.<Object>of(allDayDate);
    
    return this;
  }

   /**
   * The new date version of the due date if the &#x60;all_day&#x60; flag is true.
   * @return allDayDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllDayDate() {
        return allDayDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALL_DAY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllDayDate_JsonNullable() {
    return allDayDate;
  }
  
  @JsonProperty(JSON_PROPERTY_ALL_DAY_DATE)
  public void setAllDayDate_JsonNullable(JsonNullable<Object> allDayDate) {
    this.allDayDate = allDayDate;
  }

  public void setAllDayDate(Object allDayDate) {
    this.allDayDate = JsonNullable.<Object>of(allDayDate);
  }


  public AssignmentOverrides title(Object title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title for this &#x60;assignment_override&#x60;.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(Object title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentOverrides assignmentOverrides = (AssignmentOverrides) o;
    return Objects.equals(this.id, assignmentOverrides.id) &&
        Objects.equals(this.createdAt, assignmentOverrides.createdAt) &&
        Objects.equals(this.updatedAt, assignmentOverrides.updatedAt) &&
        Objects.equals(this.workflowState, assignmentOverrides.workflowState) &&
        equalsNullable(this.dueAt, assignmentOverrides.dueAt) &&
        equalsNullable(this.unlockAt, assignmentOverrides.unlockAt) &&
        equalsNullable(this.lockAt, assignmentOverrides.lockAt) &&
        equalsNullable(this.allDay, assignmentOverrides.allDay) &&
        equalsNullable(this.assignmentVersion, assignmentOverrides.assignmentVersion) &&
        Objects.equals(this.setType, assignmentOverrides.setType) &&
        equalsNullable(this.setId, assignmentOverrides.setId) &&
        Objects.equals(this.dueAtOverridden, assignmentOverrides.dueAtOverridden) &&
        Objects.equals(this.unlockAtOverridden, assignmentOverrides.unlockAtOverridden) &&
        Objects.equals(this.lockAtOverridden, assignmentOverrides.lockAtOverridden) &&
        equalsNullable(this.quizId, assignmentOverrides.quizId) &&
        equalsNullable(this.quizVersion, assignmentOverrides.quizVersion) &&
        equalsNullable(this.assignmentId, assignmentOverrides.assignmentId) &&
        equalsNullable(this.allDayDate, assignmentOverrides.allDayDate) &&
        Objects.equals(this.title, assignmentOverrides.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, workflowState, hashCodeNullable(dueAt), hashCodeNullable(unlockAt), hashCodeNullable(lockAt), hashCodeNullable(allDay), hashCodeNullable(assignmentVersion), setType, hashCodeNullable(setId), dueAtOverridden, unlockAtOverridden, lockAtOverridden, hashCodeNullable(quizId), hashCodeNullable(quizVersion), hashCodeNullable(assignmentId), hashCodeNullable(allDayDate), title);
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
    sb.append("class AssignmentOverrides {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    assignmentVersion: ").append(toIndentedString(assignmentVersion)).append("\n");
    sb.append("    setType: ").append(toIndentedString(setType)).append("\n");
    sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
    sb.append("    dueAtOverridden: ").append(toIndentedString(dueAtOverridden)).append("\n");
    sb.append("    unlockAtOverridden: ").append(toIndentedString(unlockAtOverridden)).append("\n");
    sb.append("    lockAtOverridden: ").append(toIndentedString(lockAtOverridden)).append("\n");
    sb.append("    quizId: ").append(toIndentedString(quizId)).append("\n");
    sb.append("    quizVersion: ").append(toIndentedString(quizVersion)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    allDayDate: ").append(toIndentedString(allDayDate)).append("\n");
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

