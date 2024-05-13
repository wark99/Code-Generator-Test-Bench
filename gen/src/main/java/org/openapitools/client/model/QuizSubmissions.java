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
 * This tables persists one record per &#x60;user_id&#x60; and &#x60;quiz_id&#x60;.
 */
@JsonPropertyOrder({
  QuizSubmissions.JSON_PROPERTY_ID,
  QuizSubmissions.JSON_PROPERTY_SUBMISSION_ID,
  QuizSubmissions.JSON_PROPERTY_USER_ID,
  QuizSubmissions.JSON_PROPERTY_CREATED_AT,
  QuizSubmissions.JSON_PROPERTY_UPDATED_AT,
  QuizSubmissions.JSON_PROPERTY_WORKFLOW_STATE,
  QuizSubmissions.JSON_PROPERTY_QUIZ_ID,
  QuizSubmissions.JSON_PROPERTY_QUIZ_VERSION,
  QuizSubmissions.JSON_PROPERTY_STARTED_AT,
  QuizSubmissions.JSON_PROPERTY_FINISHED_AT,
  QuizSubmissions.JSON_PROPERTY_END_AT,
  QuizSubmissions.JSON_PROPERTY_SCORE,
  QuizSubmissions.JSON_PROPERTY_ATTEMPT,
  QuizSubmissions.JSON_PROPERTY_SUBMISSION_DATA,
  QuizSubmissions.JSON_PROPERTY_KEPT_SCORE,
  QuizSubmissions.JSON_PROPERTY_FUDGE_POINTS,
  QuizSubmissions.JSON_PROPERTY_QUIZ_POINTS_POSSIBLE,
  QuizSubmissions.JSON_PROPERTY_EXTRA_ATTEMPTS,
  QuizSubmissions.JSON_PROPERTY_TEMPORARY_USER_CODE,
  QuizSubmissions.JSON_PROPERTY_EXTRA_TIME,
  QuizSubmissions.JSON_PROPERTY_MANUALLY_SCORED,
  QuizSubmissions.JSON_PROPERTY_MANUALLY_UNLOCKED,
  QuizSubmissions.JSON_PROPERTY_WAS_PREVIEW,
  QuizSubmissions.JSON_PROPERTY_SCORE_BEFORE_REGRADE,
  QuizSubmissions.JSON_PROPERTY_HAS_SEEN_RESULTS
})
@JsonTypeName("quiz_submissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizSubmissions {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submission_id";
  private JsonNullable<Object> submissionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the quiz submission.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COMPLETE("complete"),
    
    PENDING_REVIEW("pending_review"),
    
    PREVIEW("preview"),
    
    SETTINGS_ONLY("settings_only"),
    
    UNTAKEN("untaken");

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

  public static final String JSON_PROPERTY_QUIZ_ID = "quiz_id";
  private Object quizId = null;

  public static final String JSON_PROPERTY_QUIZ_VERSION = "quiz_version";
  private JsonNullable<Object> quizVersion = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private JsonNullable<Object> startedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private JsonNullable<Object> finishedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private JsonNullable<Object> endAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCORE = "score";
  private JsonNullable<Object> score = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ATTEMPT = "attempt";
  private JsonNullable<Object> attempt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMISSION_DATA = "submission_data";
  private JsonNullable<Object> submissionData = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_KEPT_SCORE = "kept_score";
  private JsonNullable<Object> keptScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FUDGE_POINTS = "fudge_points";
  private Object fudgePoints = null;

  public static final String JSON_PROPERTY_QUIZ_POINTS_POSSIBLE = "quiz_points_possible";
  private JsonNullable<Object> quizPointsPossible = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXTRA_ATTEMPTS = "extra_attempts";
  private JsonNullable<Object> extraAttempts = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEMPORARY_USER_CODE = "temporary_user_code";
  private JsonNullable<Object> temporaryUserCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXTRA_TIME = "extra_time";
  private JsonNullable<Object> extraTime = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MANUALLY_SCORED = "manually_scored";
  private JsonNullable<Object> manuallyScored = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MANUALLY_UNLOCKED = "manually_unlocked";
  private JsonNullable<Object> manuallyUnlocked = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WAS_PREVIEW = "was_preview";
  private JsonNullable<Object> wasPreview = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCORE_BEFORE_REGRADE = "score_before_regrade";
  private JsonNullable<Object> scoreBeforeRegrade = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HAS_SEEN_RESULTS = "has_seen_results";
  private JsonNullable<Object> hasSeenResults = JsonNullable.<Object>of(null);

  public QuizSubmissions() {
  }

  public QuizSubmissions id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the quiz submission.
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


  public QuizSubmissions submissionId(Object submissionId) {
    this.submissionId = JsonNullable.<Object>of(submissionId);
    
    return this;
  }

   /**
   * The ID of the Submission the quiz submission represents.
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmissionId() {
        return submissionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmissionId_JsonNullable() {
    return submissionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  public void setSubmissionId_JsonNullable(JsonNullable<Object> submissionId) {
    this.submissionId = submissionId;
  }

  public void setSubmissionId(Object submissionId) {
    this.submissionId = JsonNullable.<Object>of(submissionId);
  }


  public QuizSubmissions userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The ID of the Student that made the quiz submission.
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


  public QuizSubmissions createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time when the quiz submission was created.
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


  public QuizSubmissions updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time when the quiz submission was last updated.
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


  public QuizSubmissions workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the quiz submission.
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


  public QuizSubmissions quizId(Object quizId) {
    
    this.quizId = quizId;
    return this;
  }

   /**
   * The ID of the Quiz the quiz submission belongs to.
   * @return quizId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUIZ_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getQuizId() {
    return quizId;
  }


  @JsonProperty(JSON_PROPERTY_QUIZ_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuizId(Object quizId) {
    this.quizId = quizId;
  }


  public QuizSubmissions quizVersion(Object quizVersion) {
    this.quizVersion = JsonNullable.<Object>of(quizVersion);
    
    return this;
  }

   /**
   * The version of the quiz this submission is related to.
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


  public QuizSubmissions startedAt(Object startedAt) {
    this.startedAt = JsonNullable.<Object>of(startedAt);
    
    return this;
  }

   /**
   * The time at which the student started the quiz submission.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStartedAt() {
        return startedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStartedAt_JsonNullable() {
    return startedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  public void setStartedAt_JsonNullable(JsonNullable<Object> startedAt) {
    this.startedAt = startedAt;
  }

  public void setStartedAt(Object startedAt) {
    this.startedAt = JsonNullable.<Object>of(startedAt);
  }


  public QuizSubmissions finishedAt(Object finishedAt) {
    this.finishedAt = JsonNullable.<Object>of(finishedAt);
    
    return this;
  }

   /**
   * The time at which the student submitted the quiz submission.
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFinishedAt() {
        return finishedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFinishedAt_JsonNullable() {
    return finishedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  public void setFinishedAt_JsonNullable(JsonNullable<Object> finishedAt) {
    this.finishedAt = finishedAt;
  }

  public void setFinishedAt(Object finishedAt) {
    this.finishedAt = JsonNullable.<Object>of(finishedAt);
  }


  public QuizSubmissions endAt(Object endAt) {
    this.endAt = JsonNullable.<Object>of(endAt);
    
    return this;
  }

   /**
   * The time at which the quiz submission will be overdue, and be flagged as a late submission.
   * @return endAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEndAt() {
        return endAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEndAt_JsonNullable() {
    return endAt;
  }
  
  @JsonProperty(JSON_PROPERTY_END_AT)
  public void setEndAt_JsonNullable(JsonNullable<Object> endAt) {
    this.endAt = endAt;
  }

  public void setEndAt(Object endAt) {
    this.endAt = JsonNullable.<Object>of(endAt);
  }


  public QuizSubmissions score(Object score) {
    this.score = JsonNullable.<Object>of(score);
    
    return this;
  }

   /**
   * The score of the quiz submission, if graded.
   * @return score
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getScore() {
        return score.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getScore_JsonNullable() {
    return score;
  }
  
  @JsonProperty(JSON_PROPERTY_SCORE)
  public void setScore_JsonNullable(JsonNullable<Object> score) {
    this.score = score;
  }

  public void setScore(Object score) {
    this.score = JsonNullable.<Object>of(score);
  }


  public QuizSubmissions attempt(Object attempt) {
    this.attempt = JsonNullable.<Object>of(attempt);
    
    return this;
  }

   /**
   * For quizzes that allow multiple attempts, this field specifies the quiz submission attempt number.
   * @return attempt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAttempt() {
        return attempt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAttempt_JsonNullable() {
    return attempt;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTEMPT)
  public void setAttempt_JsonNullable(JsonNullable<Object> attempt) {
    this.attempt = attempt;
  }

  public void setAttempt(Object attempt) {
    this.attempt = JsonNullable.<Object>of(attempt);
  }


  public QuizSubmissions submissionData(Object submissionData) {
    this.submissionData = JsonNullable.<Object>of(submissionData);
    
    return this;
  }

   /**
   * Student answers to quiz, it shares JSON array of answers for only graded quiz submissions, it has NULL if quiz hasn&#39;t been graded yet. Contains the &#x60;question_id&#x60;, whether the question was answered correctly, the &#x60;answer_id&#x60; and answer text.
   * @return submissionData
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmissionData() {
        return submissionData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmissionData_JsonNullable() {
    return submissionData;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_DATA)
  public void setSubmissionData_JsonNullable(JsonNullable<Object> submissionData) {
    this.submissionData = submissionData;
  }

  public void setSubmissionData(Object submissionData) {
    this.submissionData = JsonNullable.<Object>of(submissionData);
  }


  public QuizSubmissions keptScore(Object keptScore) {
    this.keptScore = JsonNullable.<Object>of(keptScore);
    
    return this;
  }

   /**
   * For quizzes that allow multiple attempts, this is the score that will be used, which might be the score of the latest, or the highest, quiz submission.
   * @return keptScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getKeptScore() {
        return keptScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEPT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getKeptScore_JsonNullable() {
    return keptScore;
  }
  
  @JsonProperty(JSON_PROPERTY_KEPT_SCORE)
  public void setKeptScore_JsonNullable(JsonNullable<Object> keptScore) {
    this.keptScore = keptScore;
  }

  public void setKeptScore(Object keptScore) {
    this.keptScore = JsonNullable.<Object>of(keptScore);
  }


  public QuizSubmissions fudgePoints(Object fudgePoints) {
    
    this.fudgePoints = fudgePoints;
    return this;
  }

   /**
   * Number of points the quiz submissions score was fudged by.
   * @return fudgePoints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUDGE_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFudgePoints() {
    return fudgePoints;
  }


  @JsonProperty(JSON_PROPERTY_FUDGE_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFudgePoints(Object fudgePoints) {
    this.fudgePoints = fudgePoints;
  }


  public QuizSubmissions quizPointsPossible(Object quizPointsPossible) {
    this.quizPointsPossible = JsonNullable.<Object>of(quizPointsPossible);
    
    return this;
  }

   /**
   * The amount of points possible for the quiz.
   * @return quizPointsPossible
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizPointsPossible() {
        return quizPointsPossible.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_POINTS_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizPointsPossible_JsonNullable() {
    return quizPointsPossible;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_POINTS_POSSIBLE)
  public void setQuizPointsPossible_JsonNullable(JsonNullable<Object> quizPointsPossible) {
    this.quizPointsPossible = quizPointsPossible;
  }

  public void setQuizPointsPossible(Object quizPointsPossible) {
    this.quizPointsPossible = JsonNullable.<Object>of(quizPointsPossible);
  }


  public QuizSubmissions extraAttempts(Object extraAttempts) {
    this.extraAttempts = JsonNullable.<Object>of(extraAttempts);
    
    return this;
  }

   /**
   * Number of times the student was allowed to retake the quiz over the multiple-attempt limit.
   * @return extraAttempts
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExtraAttempts() {
        return extraAttempts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTRA_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExtraAttempts_JsonNullable() {
    return extraAttempts;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTRA_ATTEMPTS)
  public void setExtraAttempts_JsonNullable(JsonNullable<Object> extraAttempts) {
    this.extraAttempts = extraAttempts;
  }

  public void setExtraAttempts(Object extraAttempts) {
    this.extraAttempts = JsonNullable.<Object>of(extraAttempts);
  }


  public QuizSubmissions temporaryUserCode(Object temporaryUserCode) {
    this.temporaryUserCode = JsonNullable.<Object>of(temporaryUserCode);
    
    return this;
  }

   /**
   * Construct for previewing a quiz.
   * @return temporaryUserCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTemporaryUserCode() {
        return temporaryUserCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPORARY_USER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTemporaryUserCode_JsonNullable() {
    return temporaryUserCode;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPORARY_USER_CODE)
  public void setTemporaryUserCode_JsonNullable(JsonNullable<Object> temporaryUserCode) {
    this.temporaryUserCode = temporaryUserCode;
  }

  public void setTemporaryUserCode(Object temporaryUserCode) {
    this.temporaryUserCode = JsonNullable.<Object>of(temporaryUserCode);
  }


  public QuizSubmissions extraTime(Object extraTime) {
    this.extraTime = JsonNullable.<Object>of(extraTime);
    
    return this;
  }

   /**
   * Amount of extra time allowed for the quiz submission, in minutes.
   * @return extraTime
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExtraTime() {
        return extraTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTRA_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExtraTime_JsonNullable() {
    return extraTime;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTRA_TIME)
  public void setExtraTime_JsonNullable(JsonNullable<Object> extraTime) {
    this.extraTime = extraTime;
  }

  public void setExtraTime(Object extraTime) {
    this.extraTime = JsonNullable.<Object>of(extraTime);
  }


  public QuizSubmissions manuallyScored(Object manuallyScored) {
    this.manuallyScored = JsonNullable.<Object>of(manuallyScored);
    
    return this;
  }

   /**
   * Indicates if this submission was graded by the teacher.
   * @return manuallyScored
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getManuallyScored() {
        return manuallyScored.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANUALLY_SCORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getManuallyScored_JsonNullable() {
    return manuallyScored;
  }
  
  @JsonProperty(JSON_PROPERTY_MANUALLY_SCORED)
  public void setManuallyScored_JsonNullable(JsonNullable<Object> manuallyScored) {
    this.manuallyScored = manuallyScored;
  }

  public void setManuallyScored(Object manuallyScored) {
    this.manuallyScored = JsonNullable.<Object>of(manuallyScored);
  }


  public QuizSubmissions manuallyUnlocked(Object manuallyUnlocked) {
    this.manuallyUnlocked = JsonNullable.<Object>of(manuallyUnlocked);
    
    return this;
  }

   /**
   * The student can take the quiz even if it&#39;s locked for everyone else.
   * @return manuallyUnlocked
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getManuallyUnlocked() {
        return manuallyUnlocked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANUALLY_UNLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getManuallyUnlocked_JsonNullable() {
    return manuallyUnlocked;
  }
  
  @JsonProperty(JSON_PROPERTY_MANUALLY_UNLOCKED)
  public void setManuallyUnlocked_JsonNullable(JsonNullable<Object> manuallyUnlocked) {
    this.manuallyUnlocked = manuallyUnlocked;
  }

  public void setManuallyUnlocked(Object manuallyUnlocked) {
    this.manuallyUnlocked = JsonNullable.<Object>of(manuallyUnlocked);
  }


  public QuizSubmissions wasPreview(Object wasPreview) {
    this.wasPreview = JsonNullable.<Object>of(wasPreview);
    
    return this;
  }

   /**
   * Indicates if this submission was created from a teacher preview.
   * @return wasPreview
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWasPreview() {
        return wasPreview.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WAS_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWasPreview_JsonNullable() {
    return wasPreview;
  }
  
  @JsonProperty(JSON_PROPERTY_WAS_PREVIEW)
  public void setWasPreview_JsonNullable(JsonNullable<Object> wasPreview) {
    this.wasPreview = wasPreview;
  }

  public void setWasPreview(Object wasPreview) {
    this.wasPreview = JsonNullable.<Object>of(wasPreview);
  }


  public QuizSubmissions scoreBeforeRegrade(Object scoreBeforeRegrade) {
    this.scoreBeforeRegrade = JsonNullable.<Object>of(scoreBeforeRegrade);
    
    return this;
  }

   /**
   * The original score of the quiz submission prior to any re-grading.
   * @return scoreBeforeRegrade
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getScoreBeforeRegrade() {
        return scoreBeforeRegrade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCORE_BEFORE_REGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getScoreBeforeRegrade_JsonNullable() {
    return scoreBeforeRegrade;
  }
  
  @JsonProperty(JSON_PROPERTY_SCORE_BEFORE_REGRADE)
  public void setScoreBeforeRegrade_JsonNullable(JsonNullable<Object> scoreBeforeRegrade) {
    this.scoreBeforeRegrade = scoreBeforeRegrade;
  }

  public void setScoreBeforeRegrade(Object scoreBeforeRegrade) {
    this.scoreBeforeRegrade = JsonNullable.<Object>of(scoreBeforeRegrade);
  }


  public QuizSubmissions hasSeenResults(Object hasSeenResults) {
    this.hasSeenResults = JsonNullable.<Object>of(hasSeenResults);
    
    return this;
  }

   /**
   * Whether the student has viewed their results to the quiz.
   * @return hasSeenResults
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHasSeenResults() {
        return hasSeenResults.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_SEEN_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHasSeenResults_JsonNullable() {
    return hasSeenResults;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_SEEN_RESULTS)
  public void setHasSeenResults_JsonNullable(JsonNullable<Object> hasSeenResults) {
    this.hasSeenResults = hasSeenResults;
  }

  public void setHasSeenResults(Object hasSeenResults) {
    this.hasSeenResults = JsonNullable.<Object>of(hasSeenResults);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizSubmissions quizSubmissions = (QuizSubmissions) o;
    return Objects.equals(this.id, quizSubmissions.id) &&
        equalsNullable(this.submissionId, quizSubmissions.submissionId) &&
        equalsNullable(this.userId, quizSubmissions.userId) &&
        Objects.equals(this.createdAt, quizSubmissions.createdAt) &&
        Objects.equals(this.updatedAt, quizSubmissions.updatedAt) &&
        Objects.equals(this.workflowState, quizSubmissions.workflowState) &&
        Objects.equals(this.quizId, quizSubmissions.quizId) &&
        equalsNullable(this.quizVersion, quizSubmissions.quizVersion) &&
        equalsNullable(this.startedAt, quizSubmissions.startedAt) &&
        equalsNullable(this.finishedAt, quizSubmissions.finishedAt) &&
        equalsNullable(this.endAt, quizSubmissions.endAt) &&
        equalsNullable(this.score, quizSubmissions.score) &&
        equalsNullable(this.attempt, quizSubmissions.attempt) &&
        equalsNullable(this.submissionData, quizSubmissions.submissionData) &&
        equalsNullable(this.keptScore, quizSubmissions.keptScore) &&
        Objects.equals(this.fudgePoints, quizSubmissions.fudgePoints) &&
        equalsNullable(this.quizPointsPossible, quizSubmissions.quizPointsPossible) &&
        equalsNullable(this.extraAttempts, quizSubmissions.extraAttempts) &&
        equalsNullable(this.temporaryUserCode, quizSubmissions.temporaryUserCode) &&
        equalsNullable(this.extraTime, quizSubmissions.extraTime) &&
        equalsNullable(this.manuallyScored, quizSubmissions.manuallyScored) &&
        equalsNullable(this.manuallyUnlocked, quizSubmissions.manuallyUnlocked) &&
        equalsNullable(this.wasPreview, quizSubmissions.wasPreview) &&
        equalsNullable(this.scoreBeforeRegrade, quizSubmissions.scoreBeforeRegrade) &&
        equalsNullable(this.hasSeenResults, quizSubmissions.hasSeenResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(submissionId), hashCodeNullable(userId), createdAt, updatedAt, workflowState, quizId, hashCodeNullable(quizVersion), hashCodeNullable(startedAt), hashCodeNullable(finishedAt), hashCodeNullable(endAt), hashCodeNullable(score), hashCodeNullable(attempt), hashCodeNullable(submissionData), hashCodeNullable(keptScore), fudgePoints, hashCodeNullable(quizPointsPossible), hashCodeNullable(extraAttempts), hashCodeNullable(temporaryUserCode), hashCodeNullable(extraTime), hashCodeNullable(manuallyScored), hashCodeNullable(manuallyUnlocked), hashCodeNullable(wasPreview), hashCodeNullable(scoreBeforeRegrade), hashCodeNullable(hasSeenResults));
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
    sb.append("class QuizSubmissions {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    quizId: ").append(toIndentedString(quizId)).append("\n");
    sb.append("    quizVersion: ").append(toIndentedString(quizVersion)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    submissionData: ").append(toIndentedString(submissionData)).append("\n");
    sb.append("    keptScore: ").append(toIndentedString(keptScore)).append("\n");
    sb.append("    fudgePoints: ").append(toIndentedString(fudgePoints)).append("\n");
    sb.append("    quizPointsPossible: ").append(toIndentedString(quizPointsPossible)).append("\n");
    sb.append("    extraAttempts: ").append(toIndentedString(extraAttempts)).append("\n");
    sb.append("    temporaryUserCode: ").append(toIndentedString(temporaryUserCode)).append("\n");
    sb.append("    extraTime: ").append(toIndentedString(extraTime)).append("\n");
    sb.append("    manuallyScored: ").append(toIndentedString(manuallyScored)).append("\n");
    sb.append("    manuallyUnlocked: ").append(toIndentedString(manuallyUnlocked)).append("\n");
    sb.append("    wasPreview: ").append(toIndentedString(wasPreview)).append("\n");
    sb.append("    scoreBeforeRegrade: ").append(toIndentedString(scoreBeforeRegrade)).append("\n");
    sb.append("    hasSeenResults: ").append(toIndentedString(hasSeenResults)).append("\n");
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

