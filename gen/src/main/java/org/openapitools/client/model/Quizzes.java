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
import org.openapitools.client.model.QuizzesDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Quizzes can also be assignments (&#x60;assignment_id&#x60; field will have a value).
 */
@JsonPropertyOrder({
  Quizzes.JSON_PROPERTY_ID,
  Quizzes.JSON_PROPERTY_DELETED_AT,
  Quizzes.JSON_PROPERTY_CREATED_AT,
  Quizzes.JSON_PROPERTY_UPDATED_AT,
  Quizzes.JSON_PROPERTY_WORKFLOW_STATE,
  Quizzes.JSON_PROPERTY_DUE_AT,
  Quizzes.JSON_PROPERTY_UNLOCK_AT,
  Quizzes.JSON_PROPERTY_LOCK_AT,
  Quizzes.JSON_PROPERTY_POINTS_POSSIBLE,
  Quizzes.JSON_PROPERTY_ASSIGNMENT_GROUP_ID,
  Quizzes.JSON_PROPERTY_CONTEXT_ID,
  Quizzes.JSON_PROPERTY_CONTEXT_TYPE,
  Quizzes.JSON_PROPERTY_ASSIGNMENT_ID,
  Quizzes.JSON_PROPERTY_COULD_BE_LOCKED,
  Quizzes.JSON_PROPERTY_MIGRATION_ID,
  Quizzes.JSON_PROPERTY_ONLY_VISIBLE_TO_OVERRIDES,
  Quizzes.JSON_PROPERTY_ALLOWED_ATTEMPTS,
  Quizzes.JSON_PROPERTY_PUBLISHED_AT,
  Quizzes.JSON_PROPERTY_SHUFFLE_ANSWERS,
  Quizzes.JSON_PROPERTY_SHOW_CORRECT_ANSWERS,
  Quizzes.JSON_PROPERTY_TIME_LIMIT,
  Quizzes.JSON_PROPERTY_SCORING_POLICY,
  Quizzes.JSON_PROPERTY_QUIZ_TYPE,
  Quizzes.JSON_PROPERTY_ACCESS_CODE,
  Quizzes.JSON_PROPERTY_QUESTION_COUNT,
  Quizzes.JSON_PROPERTY_ANONYMOUS_SUBMISSIONS,
  Quizzes.JSON_PROPERTY_HIDE_RESULTS,
  Quizzes.JSON_PROPERTY_IP_FILTER,
  Quizzes.JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER,
  Quizzes.JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_FOR_RESULTS,
  Quizzes.JSON_PROPERTY_ONE_QUESTION_AT_A_TIME,
  Quizzes.JSON_PROPERTY_CANT_GO_BACK,
  Quizzes.JSON_PROPERTY_SHOW_CORRECT_ANSWERS_AT,
  Quizzes.JSON_PROPERTY_HIDE_CORRECT_ANSWERS_AT,
  Quizzes.JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_MONITOR,
  Quizzes.JSON_PROPERTY_ONE_TIME_RESULTS,
  Quizzes.JSON_PROPERTY_SHOW_CORRECT_ANSWERS_LAST_ATTEMPT,
  Quizzes.JSON_PROPERTY_UNPUBLISHED_QUESTION_COUNT,
  Quizzes.JSON_PROPERTY_DESCRIPTION,
  Quizzes.JSON_PROPERTY_TITLE
})
@JsonTypeName("quizzes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Quizzes {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Denotes where the quiz is in the workflow. Possible values are &#x60;unpublished&#x60;, &#x60;published&#x60; and &#x60;deleted&#x60;. Defaults to &#x60;unpublished&#x60;.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    CREATED("created"),
    
    EDITED("edited"),
    
    UNPUBLISHED("unpublished"),
    
    DELETED("deleted"),
    
    AVAILABLE("available");

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

  public static final String JSON_PROPERTY_POINTS_POSSIBLE = "points_possible";
  private JsonNullable<Object> pointsPossible = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_ID = "assignment_group_id";
  private JsonNullable<Object> assignmentGroupId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of the context object (typically &#x60;Course&#x60;).
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COURSE("Course");

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

  public static final String JSON_PROPERTY_COULD_BE_LOCKED = "could_be_locked";
  private Object couldBeLocked = null;

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ONLY_VISIBLE_TO_OVERRIDES = "only_visible_to_overrides";
  private Object onlyVisibleToOverrides = null;

  public static final String JSON_PROPERTY_ALLOWED_ATTEMPTS = "allowed_attempts";
  private JsonNullable<Object> allowedAttempts = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLISHED_AT = "published_at";
  private JsonNullable<Object> publishedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SHUFFLE_ANSWERS = "shuffle_answers";
  private Object shuffleAnswers = null;

  public static final String JSON_PROPERTY_SHOW_CORRECT_ANSWERS = "show_correct_answers";
  private Object showCorrectAnswers = null;

  public static final String JSON_PROPERTY_TIME_LIMIT = "time_limit";
  private JsonNullable<Object> timeLimit = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCORING_POLICY = "scoring_policy";
  private JsonNullable<Object> scoringPolicy = JsonNullable.<Object>of(null);

  /**
   * type of quiz.
   */
  public enum QuizTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ASSIGNMENT("assignment"),
    
    PRACTICE_QUIZ("practice_quiz"),
    
    GRADED_SURVEY("graded_survey"),
    
    SURVEY("survey");

    private Object value;

    QuizTypeEnum(Object value) {
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
    public static QuizTypeEnum fromValue(Object value) {
      for (QuizTypeEnum b : QuizTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_QUIZ_TYPE = "quiz_type";
  private JsonNullable<QuizTypeEnum> quizType = JsonNullable.<QuizTypeEnum>of(null);

  public static final String JSON_PROPERTY_ACCESS_CODE = "access_code";
  private JsonNullable<Object> accessCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUESTION_COUNT = "question_count";
  private JsonNullable<Object> questionCount = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ANONYMOUS_SUBMISSIONS = "anonymous_submissions";
  private Object anonymousSubmissions = null;

  public static final String JSON_PROPERTY_HIDE_RESULTS = "hide_results";
  private JsonNullable<Object> hideResults = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IP_FILTER = "ip_filter";
  private JsonNullable<Object> ipFilter = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER = "require_lockdown_browser";
  private Object requireLockdownBrowser = null;

  public static final String JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_FOR_RESULTS = "require_lockdown_browser_for_results";
  private Object requireLockdownBrowserForResults = null;

  public static final String JSON_PROPERTY_ONE_QUESTION_AT_A_TIME = "one_question_at_a_time";
  private Object oneQuestionAtATime = null;

  public static final String JSON_PROPERTY_CANT_GO_BACK = "cant_go_back";
  private Object cantGoBack = null;

  public static final String JSON_PROPERTY_SHOW_CORRECT_ANSWERS_AT = "show_correct_answers_at";
  private JsonNullable<Object> showCorrectAnswersAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HIDE_CORRECT_ANSWERS_AT = "hide_correct_answers_at";
  private JsonNullable<Object> hideCorrectAnswersAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_MONITOR = "require_lockdown_browser_monitor";
  private Object requireLockdownBrowserMonitor = null;

  public static final String JSON_PROPERTY_ONE_TIME_RESULTS = "one_time_results";
  private Object oneTimeResults = null;

  public static final String JSON_PROPERTY_SHOW_CORRECT_ANSWERS_LAST_ATTEMPT = "show_correct_answers_last_attempt";
  private Object showCorrectAnswersLastAttempt = null;

  public static final String JSON_PROPERTY_UNPUBLISHED_QUESTION_COUNT = "unpublished_question_count";
  private Object unpublishedQuestionCount = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private QuizzesDescription description;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<Object> title = JsonNullable.<Object>of(null);

  public Quizzes() {
  }

  public Quizzes id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * the ID of the quiz.
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


  public Quizzes deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp when the quiz was deleted.
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


  public Quizzes createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time when the quiz was created.
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


  public Quizzes updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time when the quiz was last updated.
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


  public Quizzes workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Denotes where the quiz is in the workflow. Possible values are &#x60;unpublished&#x60;, &#x60;published&#x60; and &#x60;deleted&#x60;. Defaults to &#x60;unpublished&#x60;.
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


  public Quizzes dueAt(Object dueAt) {
    this.dueAt = JsonNullable.<Object>of(dueAt);
    
    return this;
  }

   /**
   * when the quiz is due.
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


  public Quizzes unlockAt(Object unlockAt) {
    this.unlockAt = JsonNullable.<Object>of(unlockAt);
    
    return this;
  }

   /**
   * when to unlock the quiz.
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


  public Quizzes lockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
    
    return this;
  }

   /**
   * when to lock the quiz.
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


  public Quizzes pointsPossible(Object pointsPossible) {
    this.pointsPossible = JsonNullable.<Object>of(pointsPossible);
    
    return this;
  }

   /**
   * The total point value given to the quiz.
   * @return pointsPossible
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPointsPossible() {
        return pointsPossible.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POINTS_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPointsPossible_JsonNullable() {
    return pointsPossible;
  }
  
  @JsonProperty(JSON_PROPERTY_POINTS_POSSIBLE)
  public void setPointsPossible_JsonNullable(JsonNullable<Object> pointsPossible) {
    this.pointsPossible = pointsPossible;
  }

  public void setPointsPossible(Object pointsPossible) {
    this.pointsPossible = JsonNullable.<Object>of(pointsPossible);
  }


  public Quizzes assignmentGroupId(Object assignmentGroupId) {
    this.assignmentGroupId = JsonNullable.<Object>of(assignmentGroupId);
    
    return this;
  }

   /**
   * the ID of the quizzes assignment group:.
   * @return assignmentGroupId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentGroupId() {
        return assignmentGroupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentGroupId_JsonNullable() {
    return assignmentGroupId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_ID)
  public void setAssignmentGroupId_JsonNullable(JsonNullable<Object> assignmentGroupId) {
    this.assignmentGroupId = assignmentGroupId;
  }

  public void setAssignmentGroupId(Object assignmentGroupId) {
    this.assignmentGroupId = JsonNullable.<Object>of(assignmentGroupId);
  }


  public Quizzes contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context (account or course) this group belongs too. See also: context_type.
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


  public Quizzes contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of the context object (typically &#x60;Course&#x60;).
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


  public Quizzes assignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
    
    return this;
  }

   /**
   * Identifies the assignment the quiz belongs to (NULL if not an assignment).
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


  public Quizzes couldBeLocked(Object couldBeLocked) {
    
    this.couldBeLocked = couldBeLocked;
    return this;
  }

   /**
   * Dictates if the quiz can be locked or not. Possible values are &#x60;allow_locking&#x60; and &#x60;disallow_locking&#x60;. Defaults to &#x60;disallow_locking&#x60;.
   * @return couldBeLocked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COULD_BE_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCouldBeLocked() {
    return couldBeLocked;
  }


  @JsonProperty(JSON_PROPERTY_COULD_BE_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCouldBeLocked(Object couldBeLocked) {
    this.couldBeLocked = couldBeLocked;
  }


  public Quizzes migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported the quiz.
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


  public Quizzes onlyVisibleToOverrides(Object onlyVisibleToOverrides) {
    
    this.onlyVisibleToOverrides = onlyVisibleToOverrides;
    return this;
  }

   /**
   * This indicates the quiz is not visible to everyone in the course, but only to those with an override.
   * @return onlyVisibleToOverrides
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLY_VISIBLE_TO_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getOnlyVisibleToOverrides() {
    return onlyVisibleToOverrides;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_VISIBLE_TO_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlyVisibleToOverrides(Object onlyVisibleToOverrides) {
    this.onlyVisibleToOverrides = onlyVisibleToOverrides;
  }


  public Quizzes allowedAttempts(Object allowedAttempts) {
    this.allowedAttempts = JsonNullable.<Object>of(allowedAttempts);
    
    return this;
  }

   /**
   * how many times a student can take the quiz -1 &#x3D; unlimited attempts.
   * @return allowedAttempts
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowedAttempts() {
        return allowedAttempts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowedAttempts_JsonNullable() {
    return allowedAttempts;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOWED_ATTEMPTS)
  public void setAllowedAttempts_JsonNullable(JsonNullable<Object> allowedAttempts) {
    this.allowedAttempts = allowedAttempts;
  }

  public void setAllowedAttempts(Object allowedAttempts) {
    this.allowedAttempts = JsonNullable.<Object>of(allowedAttempts);
  }


  public Quizzes publishedAt(Object publishedAt) {
    this.publishedAt = JsonNullable.<Object>of(publishedAt);
    
    return this;
  }

   /**
   * whether the quiz has a published or unpublished draft state.
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPublishedAt() {
        return publishedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPublishedAt_JsonNullable() {
    return publishedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  public void setPublishedAt_JsonNullable(JsonNullable<Object> publishedAt) {
    this.publishedAt = publishedAt;
  }

  public void setPublishedAt(Object publishedAt) {
    this.publishedAt = JsonNullable.<Object>of(publishedAt);
  }


  public Quizzes shuffleAnswers(Object shuffleAnswers) {
    
    this.shuffleAnswers = shuffleAnswers;
    return this;
  }

   /**
   * shuffle answers for students.
   * @return shuffleAnswers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHUFFLE_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getShuffleAnswers() {
    return shuffleAnswers;
  }


  @JsonProperty(JSON_PROPERTY_SHUFFLE_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShuffleAnswers(Object shuffleAnswers) {
    this.shuffleAnswers = shuffleAnswers;
  }


  public Quizzes showCorrectAnswers(Object showCorrectAnswers) {
    
    this.showCorrectAnswers = showCorrectAnswers;
    return this;
  }

   /**
   * show which answers were correct when results are shown? only valid if &#x60;hide_results&#x60; is NULL.
   * @return showCorrectAnswers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_CORRECT_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getShowCorrectAnswers() {
    return showCorrectAnswers;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_CORRECT_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShowCorrectAnswers(Object showCorrectAnswers) {
    this.showCorrectAnswers = showCorrectAnswers;
  }


  public Quizzes timeLimit(Object timeLimit) {
    this.timeLimit = JsonNullable.<Object>of(timeLimit);
    
    return this;
  }

   /**
   * quiz time limit in minutes.
   * @return timeLimit
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTimeLimit() {
        return timeLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTimeLimit_JsonNullable() {
    return timeLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  public void setTimeLimit_JsonNullable(JsonNullable<Object> timeLimit) {
    this.timeLimit = timeLimit;
  }

  public void setTimeLimit(Object timeLimit) {
    this.timeLimit = JsonNullable.<Object>of(timeLimit);
  }


  public Quizzes scoringPolicy(Object scoringPolicy) {
    this.scoringPolicy = JsonNullable.<Object>of(scoringPolicy);
    
    return this;
  }

   /**
   * which quiz score to keep (only if &#x60;allowed_attempts&#x60; !&#x3D; 1) possible values: &#x60;keep_highest&#x60;, &#x60;keep_latest&#x60;.
   * @return scoringPolicy
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getScoringPolicy() {
        return scoringPolicy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCORING_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getScoringPolicy_JsonNullable() {
    return scoringPolicy;
  }
  
  @JsonProperty(JSON_PROPERTY_SCORING_POLICY)
  public void setScoringPolicy_JsonNullable(JsonNullable<Object> scoringPolicy) {
    this.scoringPolicy = scoringPolicy;
  }

  public void setScoringPolicy(Object scoringPolicy) {
    this.scoringPolicy = JsonNullable.<Object>of(scoringPolicy);
  }


  public Quizzes quizType(QuizTypeEnum quizType) {
    this.quizType = JsonNullable.<QuizTypeEnum>of(quizType);
    
    return this;
  }

   /**
   * type of quiz.
   * @return quizType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public QuizTypeEnum getQuizType() {
        return quizType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QuizTypeEnum> getQuizType_JsonNullable() {
    return quizType;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_TYPE)
  public void setQuizType_JsonNullable(JsonNullable<QuizTypeEnum> quizType) {
    this.quizType = quizType;
  }

  public void setQuizType(QuizTypeEnum quizType) {
    this.quizType = JsonNullable.<QuizTypeEnum>of(quizType);
  }


  public Quizzes accessCode(Object accessCode) {
    this.accessCode = JsonNullable.<Object>of(accessCode);
    
    return this;
  }

   /**
   * access code to restrict quiz access.
   * @return accessCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAccessCode() {
        return accessCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAccessCode_JsonNullable() {
    return accessCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  public void setAccessCode_JsonNullable(JsonNullable<Object> accessCode) {
    this.accessCode = accessCode;
  }

  public void setAccessCode(Object accessCode) {
    this.accessCode = JsonNullable.<Object>of(accessCode);
  }


  public Quizzes questionCount(Object questionCount) {
    this.questionCount = JsonNullable.<Object>of(questionCount);
    
    return this;
  }

   /**
   * the number of questions in the quiz.
   * @return questionCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuestionCount() {
        return questionCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUESTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuestionCount_JsonNullable() {
    return questionCount;
  }
  
  @JsonProperty(JSON_PROPERTY_QUESTION_COUNT)
  public void setQuestionCount_JsonNullable(JsonNullable<Object> questionCount) {
    this.questionCount = questionCount;
  }

  public void setQuestionCount(Object questionCount) {
    this.questionCount = JsonNullable.<Object>of(questionCount);
  }


  public Quizzes anonymousSubmissions(Object anonymousSubmissions) {
    
    this.anonymousSubmissions = anonymousSubmissions;
    return this;
  }

   /**
   * Dictates whether students are allowed to submit the quiz anonymously.
   * @return anonymousSubmissions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAnonymousSubmissions() {
    return anonymousSubmissions;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMOUS_SUBMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnonymousSubmissions(Object anonymousSubmissions) {
    this.anonymousSubmissions = anonymousSubmissions;
  }


  public Quizzes hideResults(Object hideResults) {
    this.hideResults = JsonNullable.<Object>of(hideResults);
    
    return this;
  }

   /**
   * let students see their quiz responses? possible values: NULL, &#x60;always&#x60;, &#x60;until_after_last_attempt&#x60;.
   * @return hideResults
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHideResults() {
        return hideResults.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIDE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHideResults_JsonNullable() {
    return hideResults;
  }
  
  @JsonProperty(JSON_PROPERTY_HIDE_RESULTS)
  public void setHideResults_JsonNullable(JsonNullable<Object> hideResults) {
    this.hideResults = hideResults;
  }

  public void setHideResults(Object hideResults) {
    this.hideResults = JsonNullable.<Object>of(hideResults);
  }


  public Quizzes ipFilter(Object ipFilter) {
    this.ipFilter = JsonNullable.<Object>of(ipFilter);
    
    return this;
  }

   /**
   * IP address or range that quiz access is limited to.
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIpFilter() {
        return ipFilter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIpFilter_JsonNullable() {
    return ipFilter;
  }
  
  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  public void setIpFilter_JsonNullable(JsonNullable<Object> ipFilter) {
    this.ipFilter = ipFilter;
  }

  public void setIpFilter(Object ipFilter) {
    this.ipFilter = JsonNullable.<Object>of(ipFilter);
  }


  public Quizzes requireLockdownBrowser(Object requireLockdownBrowser) {
    
    this.requireLockdownBrowser = requireLockdownBrowser;
    return this;
  }

   /**
   * Dictates whether the browser has locked-down when the quiz is being taken. Possible values are &#x60;required&#x60; and &#x60;not_required&#x60;. Defaults to &#x60;not_required&#x60;.
   * @return requireLockdownBrowser
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRequireLockdownBrowser() {
    return requireLockdownBrowser;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireLockdownBrowser(Object requireLockdownBrowser) {
    this.requireLockdownBrowser = requireLockdownBrowser;
  }


  public Quizzes requireLockdownBrowserForResults(Object requireLockdownBrowserForResults) {
    
    this.requireLockdownBrowserForResults = requireLockdownBrowserForResults;
    return this;
  }

   /**
   * Dictates whether the browser has to be locked-down to display the results. Is valid only if &#x60;hide_results&#x60; is set to &#x60;never&#x60; or &#x60;until_after_last_attempt&#x60; (for the results to be displayed after the last attempt). Possible values are &#x60;required&#x60; and &#x60;not_required&#x60;. Defaults to &#x60;not_required&#x60;.
   * @return requireLockdownBrowserForResults
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_FOR_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRequireLockdownBrowserForResults() {
    return requireLockdownBrowserForResults;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_FOR_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireLockdownBrowserForResults(Object requireLockdownBrowserForResults) {
    this.requireLockdownBrowserForResults = requireLockdownBrowserForResults;
  }


  public Quizzes oneQuestionAtATime(Object oneQuestionAtATime) {
    
    this.oneQuestionAtATime = oneQuestionAtATime;
    return this;
  }

   /**
   * show one question at a time?
   * @return oneQuestionAtATime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_QUESTION_AT_A_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getOneQuestionAtATime() {
    return oneQuestionAtATime;
  }


  @JsonProperty(JSON_PROPERTY_ONE_QUESTION_AT_A_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOneQuestionAtATime(Object oneQuestionAtATime) {
    this.oneQuestionAtATime = oneQuestionAtATime;
  }


  public Quizzes cantGoBack(Object cantGoBack) {
    
    this.cantGoBack = cantGoBack;
    return this;
  }

   /**
   * lock questions after answering? only valid if one_question_at_a_time&#x3D;true.
   * @return cantGoBack
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANT_GO_BACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCantGoBack() {
    return cantGoBack;
  }


  @JsonProperty(JSON_PROPERTY_CANT_GO_BACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCantGoBack(Object cantGoBack) {
    this.cantGoBack = cantGoBack;
  }


  public Quizzes showCorrectAnswersAt(Object showCorrectAnswersAt) {
    this.showCorrectAnswersAt = JsonNullable.<Object>of(showCorrectAnswersAt);
    
    return this;
  }

   /**
   * when should the correct answers be visible by students? only valid if show_correct_answers&#x3D;true.
   * @return showCorrectAnswersAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getShowCorrectAnswersAt() {
        return showCorrectAnswersAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOW_CORRECT_ANSWERS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getShowCorrectAnswersAt_JsonNullable() {
    return showCorrectAnswersAt;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOW_CORRECT_ANSWERS_AT)
  public void setShowCorrectAnswersAt_JsonNullable(JsonNullable<Object> showCorrectAnswersAt) {
    this.showCorrectAnswersAt = showCorrectAnswersAt;
  }

  public void setShowCorrectAnswersAt(Object showCorrectAnswersAt) {
    this.showCorrectAnswersAt = JsonNullable.<Object>of(showCorrectAnswersAt);
  }


  public Quizzes hideCorrectAnswersAt(Object hideCorrectAnswersAt) {
    this.hideCorrectAnswersAt = JsonNullable.<Object>of(hideCorrectAnswersAt);
    
    return this;
  }

   /**
   * prevent the students from seeing correct answers after the specified date has passed. only valid if show_correct_answers&#x3D;true.
   * @return hideCorrectAnswersAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHideCorrectAnswersAt() {
        return hideCorrectAnswersAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIDE_CORRECT_ANSWERS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHideCorrectAnswersAt_JsonNullable() {
    return hideCorrectAnswersAt;
  }
  
  @JsonProperty(JSON_PROPERTY_HIDE_CORRECT_ANSWERS_AT)
  public void setHideCorrectAnswersAt_JsonNullable(JsonNullable<Object> hideCorrectAnswersAt) {
    this.hideCorrectAnswersAt = hideCorrectAnswersAt;
  }

  public void setHideCorrectAnswersAt(Object hideCorrectAnswersAt) {
    this.hideCorrectAnswersAt = JsonNullable.<Object>of(hideCorrectAnswersAt);
  }


  public Quizzes requireLockdownBrowserMonitor(Object requireLockdownBrowserMonitor) {
    
    this.requireLockdownBrowserMonitor = requireLockdownBrowserMonitor;
    return this;
  }

   /**
   * Dictates whether a browser lockdown monitor is required. Possible values are &#x60;required&#x60; and &#x60;not_required&#x60;. Defaults to &#x60;not_required&#x60;.
   * @return requireLockdownBrowserMonitor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_MONITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRequireLockdownBrowserMonitor() {
    return requireLockdownBrowserMonitor;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_LOCKDOWN_BROWSER_MONITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireLockdownBrowserMonitor(Object requireLockdownBrowserMonitor) {
    this.requireLockdownBrowserMonitor = requireLockdownBrowserMonitor;
  }


  public Quizzes oneTimeResults(Object oneTimeResults) {
    
    this.oneTimeResults = oneTimeResults;
    return this;
  }

   /**
   * prevent the students from seeing their results more than once (right after they submit the quiz).
   * @return oneTimeResults
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_TIME_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getOneTimeResults() {
    return oneTimeResults;
  }


  @JsonProperty(JSON_PROPERTY_ONE_TIME_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOneTimeResults(Object oneTimeResults) {
    this.oneTimeResults = oneTimeResults;
  }


  public Quizzes showCorrectAnswersLastAttempt(Object showCorrectAnswersLastAttempt) {
    
    this.showCorrectAnswersLastAttempt = showCorrectAnswersLastAttempt;
    return this;
  }

   /**
   * restrict the show_correct_answers option above to apply only to the last submitted attempt of a quiz that allows multiple attempts. only valid if show_correct_answers&#x3D;true and &#x60;allowed_attempts&#x60; &gt; 1.
   * @return showCorrectAnswersLastAttempt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_CORRECT_ANSWERS_LAST_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getShowCorrectAnswersLastAttempt() {
    return showCorrectAnswersLastAttempt;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_CORRECT_ANSWERS_LAST_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShowCorrectAnswersLastAttempt(Object showCorrectAnswersLastAttempt) {
    this.showCorrectAnswersLastAttempt = showCorrectAnswersLastAttempt;
  }


  public Quizzes unpublishedQuestionCount(Object unpublishedQuestionCount) {
    
    this.unpublishedQuestionCount = unpublishedQuestionCount;
    return this;
  }

   /**
   * The number of questions that have not been published.
   * @return unpublishedQuestionCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNPUBLISHED_QUESTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUnpublishedQuestionCount() {
    return unpublishedQuestionCount;
  }


  @JsonProperty(JSON_PROPERTY_UNPUBLISHED_QUESTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnpublishedQuestionCount(Object unpublishedQuestionCount) {
    this.unpublishedQuestionCount = unpublishedQuestionCount;
  }


  public Quizzes description(QuizzesDescription description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuizzesDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(QuizzesDescription description) {
    this.description = description;
  }


  public Quizzes title(Object title) {
    this.title = JsonNullable.<Object>of(title);
    
    return this;
  }

   /**
   * the title of the quiz.
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
    Quizzes quizzes = (Quizzes) o;
    return Objects.equals(this.id, quizzes.id) &&
        equalsNullable(this.deletedAt, quizzes.deletedAt) &&
        Objects.equals(this.createdAt, quizzes.createdAt) &&
        Objects.equals(this.updatedAt, quizzes.updatedAt) &&
        Objects.equals(this.workflowState, quizzes.workflowState) &&
        equalsNullable(this.dueAt, quizzes.dueAt) &&
        equalsNullable(this.unlockAt, quizzes.unlockAt) &&
        equalsNullable(this.lockAt, quizzes.lockAt) &&
        equalsNullable(this.pointsPossible, quizzes.pointsPossible) &&
        equalsNullable(this.assignmentGroupId, quizzes.assignmentGroupId) &&
        Objects.equals(this.contextId, quizzes.contextId) &&
        Objects.equals(this.contextType, quizzes.contextType) &&
        equalsNullable(this.assignmentId, quizzes.assignmentId) &&
        Objects.equals(this.couldBeLocked, quizzes.couldBeLocked) &&
        equalsNullable(this.migrationId, quizzes.migrationId) &&
        Objects.equals(this.onlyVisibleToOverrides, quizzes.onlyVisibleToOverrides) &&
        equalsNullable(this.allowedAttempts, quizzes.allowedAttempts) &&
        equalsNullable(this.publishedAt, quizzes.publishedAt) &&
        Objects.equals(this.shuffleAnswers, quizzes.shuffleAnswers) &&
        Objects.equals(this.showCorrectAnswers, quizzes.showCorrectAnswers) &&
        equalsNullable(this.timeLimit, quizzes.timeLimit) &&
        equalsNullable(this.scoringPolicy, quizzes.scoringPolicy) &&
        equalsNullable(this.quizType, quizzes.quizType) &&
        equalsNullable(this.accessCode, quizzes.accessCode) &&
        equalsNullable(this.questionCount, quizzes.questionCount) &&
        Objects.equals(this.anonymousSubmissions, quizzes.anonymousSubmissions) &&
        equalsNullable(this.hideResults, quizzes.hideResults) &&
        equalsNullable(this.ipFilter, quizzes.ipFilter) &&
        Objects.equals(this.requireLockdownBrowser, quizzes.requireLockdownBrowser) &&
        Objects.equals(this.requireLockdownBrowserForResults, quizzes.requireLockdownBrowserForResults) &&
        Objects.equals(this.oneQuestionAtATime, quizzes.oneQuestionAtATime) &&
        Objects.equals(this.cantGoBack, quizzes.cantGoBack) &&
        equalsNullable(this.showCorrectAnswersAt, quizzes.showCorrectAnswersAt) &&
        equalsNullable(this.hideCorrectAnswersAt, quizzes.hideCorrectAnswersAt) &&
        Objects.equals(this.requireLockdownBrowserMonitor, quizzes.requireLockdownBrowserMonitor) &&
        Objects.equals(this.oneTimeResults, quizzes.oneTimeResults) &&
        Objects.equals(this.showCorrectAnswersLastAttempt, quizzes.showCorrectAnswersLastAttempt) &&
        Objects.equals(this.unpublishedQuestionCount, quizzes.unpublishedQuestionCount) &&
        Objects.equals(this.description, quizzes.description) &&
        equalsNullable(this.title, quizzes.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(deletedAt), createdAt, updatedAt, workflowState, hashCodeNullable(dueAt), hashCodeNullable(unlockAt), hashCodeNullable(lockAt), hashCodeNullable(pointsPossible), hashCodeNullable(assignmentGroupId), contextId, contextType, hashCodeNullable(assignmentId), couldBeLocked, hashCodeNullable(migrationId), onlyVisibleToOverrides, hashCodeNullable(allowedAttempts), hashCodeNullable(publishedAt), shuffleAnswers, showCorrectAnswers, hashCodeNullable(timeLimit), hashCodeNullable(scoringPolicy), hashCodeNullable(quizType), hashCodeNullable(accessCode), hashCodeNullable(questionCount), anonymousSubmissions, hashCodeNullable(hideResults), hashCodeNullable(ipFilter), requireLockdownBrowser, requireLockdownBrowserForResults, oneQuestionAtATime, cantGoBack, hashCodeNullable(showCorrectAnswersAt), hashCodeNullable(hideCorrectAnswersAt), requireLockdownBrowserMonitor, oneTimeResults, showCorrectAnswersLastAttempt, unpublishedQuestionCount, description, hashCodeNullable(title));
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
    sb.append("class Quizzes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    pointsPossible: ").append(toIndentedString(pointsPossible)).append("\n");
    sb.append("    assignmentGroupId: ").append(toIndentedString(assignmentGroupId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    couldBeLocked: ").append(toIndentedString(couldBeLocked)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    onlyVisibleToOverrides: ").append(toIndentedString(onlyVisibleToOverrides)).append("\n");
    sb.append("    allowedAttempts: ").append(toIndentedString(allowedAttempts)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    shuffleAnswers: ").append(toIndentedString(shuffleAnswers)).append("\n");
    sb.append("    showCorrectAnswers: ").append(toIndentedString(showCorrectAnswers)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    scoringPolicy: ").append(toIndentedString(scoringPolicy)).append("\n");
    sb.append("    quizType: ").append(toIndentedString(quizType)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
    sb.append("    anonymousSubmissions: ").append(toIndentedString(anonymousSubmissions)).append("\n");
    sb.append("    hideResults: ").append(toIndentedString(hideResults)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    requireLockdownBrowser: ").append(toIndentedString(requireLockdownBrowser)).append("\n");
    sb.append("    requireLockdownBrowserForResults: ").append(toIndentedString(requireLockdownBrowserForResults)).append("\n");
    sb.append("    oneQuestionAtATime: ").append(toIndentedString(oneQuestionAtATime)).append("\n");
    sb.append("    cantGoBack: ").append(toIndentedString(cantGoBack)).append("\n");
    sb.append("    showCorrectAnswersAt: ").append(toIndentedString(showCorrectAnswersAt)).append("\n");
    sb.append("    hideCorrectAnswersAt: ").append(toIndentedString(hideCorrectAnswersAt)).append("\n");
    sb.append("    requireLockdownBrowserMonitor: ").append(toIndentedString(requireLockdownBrowserMonitor)).append("\n");
    sb.append("    oneTimeResults: ").append(toIndentedString(oneTimeResults)).append("\n");
    sb.append("    showCorrectAnswersLastAttempt: ").append(toIndentedString(showCorrectAnswersLastAttempt)).append("\n");
    sb.append("    unpublishedQuestionCount: ").append(toIndentedString(unpublishedQuestionCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

