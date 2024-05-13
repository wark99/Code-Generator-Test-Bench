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
import org.openapitools.client.model.SubmissionsAttachmentIds;
import org.openapitools.client.model.SubmissionsBody;
import org.openapitools.client.model.SubmissionsLtiUserId;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Submissions
 */
@JsonPropertyOrder({
  Submissions.JSON_PROPERTY_ID,
  Submissions.JSON_PROPERTY_ATTACHMENT_ID,
  Submissions.JSON_PROPERTY_COURSE_ID,
  Submissions.JSON_PROPERTY_USER_ID,
  Submissions.JSON_PROPERTY_CREATED_AT,
  Submissions.JSON_PROPERTY_UPDATED_AT,
  Submissions.JSON_PROPERTY_WORKFLOW_STATE,
  Submissions.JSON_PROPERTY_ASSIGNMENT_ID,
  Submissions.JSON_PROPERTY_MEDIA_COMMENT_ID,
  Submissions.JSON_PROPERTY_MEDIA_COMMENT_TYPE,
  Submissions.JSON_PROPERTY_ATTACHMENT_IDS,
  Submissions.JSON_PROPERTY_POSTED_AT,
  Submissions.JSON_PROPERTY_GROUP_ID,
  Submissions.JSON_PROPERTY_SCORE,
  Submissions.JSON_PROPERTY_ATTEMPT,
  Submissions.JSON_PROPERTY_SUBMITTED_AT,
  Submissions.JSON_PROPERTY_QUIZ_SUBMISSION_ID,
  Submissions.JSON_PROPERTY_EXTRA_ATTEMPTS,
  Submissions.JSON_PROPERTY_GRADING_PERIOD_ID,
  Submissions.JSON_PROPERTY_GRADE,
  Submissions.JSON_PROPERTY_SUBMISSION_TYPE,
  Submissions.JSON_PROPERTY_PROCESSED,
  Submissions.JSON_PROPERTY_GRADE_MATCHES_CURRENT_SUBMISSION,
  Submissions.JSON_PROPERTY_PUBLISHED_SCORE,
  Submissions.JSON_PROPERTY_PUBLISHED_GRADE,
  Submissions.JSON_PROPERTY_GRADED_AT,
  Submissions.JSON_PROPERTY_STUDENT_ENTERED_SCORE,
  Submissions.JSON_PROPERTY_GRADER_ID,
  Submissions.JSON_PROPERTY_SUBMISSION_COMMENTS_COUNT,
  Submissions.JSON_PROPERTY_MEDIA_OBJECT_ID,
  Submissions.JSON_PROPERTY_TURNITIN_DATA,
  Submissions.JSON_PROPERTY_CACHED_DUE_DATE,
  Submissions.JSON_PROPERTY_EXCUSED,
  Submissions.JSON_PROPERTY_GRADED_ANONYMOUSLY,
  Submissions.JSON_PROPERTY_LATE_POLICY_STATUS,
  Submissions.JSON_PROPERTY_POINTS_DEDUCTED,
  Submissions.JSON_PROPERTY_SECONDS_LATE_OVERRIDE,
  Submissions.JSON_PROPERTY_LTI_USER_ID,
  Submissions.JSON_PROPERTY_ANONYMOUS_ID,
  Submissions.JSON_PROPERTY_LAST_COMMENT_AT,
  Submissions.JSON_PROPERTY_CACHED_QUIZ_LTI,
  Submissions.JSON_PROPERTY_CACHED_TARDINESS,
  Submissions.JSON_PROPERTY_RESOURCE_LINK_LOOKUP_UUID,
  Submissions.JSON_PROPERTY_REDO_REQUEST,
  Submissions.JSON_PROPERTY_BODY,
  Submissions.JSON_PROPERTY_URL
})
@JsonTypeName("submissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Submissions {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachment_id";
  private JsonNullable<Object> attachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_ID = "course_id";
  private Object courseId = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Object userId = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Object> createdAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  /**
   * Life-cycle state for the submission.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    GRADED("graded"),
    
    PENDING_REVIEW("pending_review"),
    
    SUBMITTED("submitted"),
    
    UNSUBMITTED("unsubmitted"),
    
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

  public static final String JSON_PROPERTY_ASSIGNMENT_ID = "assignment_id";
  private Object assignmentId = null;

  public static final String JSON_PROPERTY_MEDIA_COMMENT_ID = "media_comment_id";
  private JsonNullable<Object> mediaCommentId = JsonNullable.<Object>of(null);

  /**
   * For media comments, the type of the media object associated with this comment.
   */
  public enum MediaCommentTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    AUDIO("audio"),
    
    AUDIO_("audio/_*"),
    
    VIDEO("video"),
    
    VIDEO_("video/_*");

    private Object value;

    MediaCommentTypeEnum(Object value) {
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
    public static MediaCommentTypeEnum fromValue(Object value) {
      for (MediaCommentTypeEnum b : MediaCommentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_MEDIA_COMMENT_TYPE = "media_comment_type";
  private JsonNullable<MediaCommentTypeEnum> mediaCommentType = JsonNullable.<MediaCommentTypeEnum>of(null);

  public static final String JSON_PROPERTY_ATTACHMENT_IDS = "attachment_ids";
  private SubmissionsAttachmentIds attachmentIds;

  public static final String JSON_PROPERTY_POSTED_AT = "posted_at";
  private JsonNullable<Object> postedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private JsonNullable<Object> groupId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCORE = "score";
  private JsonNullable<Object> score = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ATTEMPT = "attempt";
  private JsonNullable<Object> attempt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMITTED_AT = "submitted_at";
  private JsonNullable<Object> submittedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUIZ_SUBMISSION_ID = "quiz_submission_id";
  private JsonNullable<Object> quizSubmissionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXTRA_ATTEMPTS = "extra_attempts";
  private JsonNullable<Object> extraAttempts = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADING_PERIOD_ID = "grading_period_id";
  private JsonNullable<Object> gradingPeriodId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADE = "grade";
  private JsonNullable<Object> grade = JsonNullable.<Object>of(null);

  /**
   * The type of submission.
   */
  public enum SubmissionTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    BASIC_LTI_LAUNCH("basic_lti_launch"),
    
    DISCUSSION_TOPIC("discussion_topic"),
    
    EXTERNAL_TOOL("external_tool"),
    
    MEDIA_RECORDING("media_recording"),
    
    ONLINE_FILE_UPLOAD("online_file_upload"),
    
    ONLINE_QUIZ("online_quiz"),
    
    ONLINE_TEXT_ENTRY("online_text_entry"),
    
    ONLINE_UPLOAD("online_upload"),
    
    ONLINE_URL("online_url"),
    
    STUDENT_ANNOTATION("student_annotation");

    private Object value;

    SubmissionTypeEnum(Object value) {
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
    public static SubmissionTypeEnum fromValue(Object value) {
      for (SubmissionTypeEnum b : SubmissionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SUBMISSION_TYPE = "submission_type";
  private JsonNullable<SubmissionTypeEnum> submissionType = JsonNullable.<SubmissionTypeEnum>of(null);

  public static final String JSON_PROPERTY_PROCESSED = "processed";
  private JsonNullable<Object> processed = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADE_MATCHES_CURRENT_SUBMISSION = "grade_matches_current_submission";
  private JsonNullable<Object> gradeMatchesCurrentSubmission = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLISHED_SCORE = "published_score";
  private JsonNullable<Object> publishedScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLISHED_GRADE = "published_grade";
  private JsonNullable<Object> publishedGrade = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADED_AT = "graded_at";
  private JsonNullable<Object> gradedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STUDENT_ENTERED_SCORE = "student_entered_score";
  private JsonNullable<Object> studentEnteredScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADER_ID = "grader_id";
  private JsonNullable<Object> graderId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMISSION_COMMENTS_COUNT = "submission_comments_count";
  private JsonNullable<Object> submissionCommentsCount = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MEDIA_OBJECT_ID = "media_object_id";
  private JsonNullable<Object> mediaObjectId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TURNITIN_DATA = "turnitin_data";
  private JsonNullable<Object> turnitinData = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CACHED_DUE_DATE = "cached_due_date";
  private JsonNullable<Object> cachedDueDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXCUSED = "excused";
  private JsonNullable<Object> excused = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADED_ANONYMOUSLY = "graded_anonymously";
  private JsonNullable<Object> gradedAnonymously = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LATE_POLICY_STATUS = "late_policy_status";
  private JsonNullable<Object> latePolicyStatus = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POINTS_DEDUCTED = "points_deducted";
  private JsonNullable<Object> pointsDeducted = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SECONDS_LATE_OVERRIDE = "seconds_late_override";
  private JsonNullable<Object> secondsLateOverride = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LTI_USER_ID = "lti_user_id";
  private SubmissionsLtiUserId ltiUserId;

  public static final String JSON_PROPERTY_ANONYMOUS_ID = "anonymous_id";
  private JsonNullable<Object> anonymousId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_COMMENT_AT = "last_comment_at";
  private JsonNullable<Object> lastCommentAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CACHED_QUIZ_LTI = "cached_quiz_lti";
  private Object cachedQuizLti = null;

  public static final String JSON_PROPERTY_CACHED_TARDINESS = "cached_tardiness";
  private JsonNullable<Object> cachedTardiness = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESOURCE_LINK_LOOKUP_UUID = "resource_link_lookup_uuid";
  private JsonNullable<Object> resourceLinkLookupUuid = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REDO_REQUEST = "redo_request";
  private Object redoRequest = null;

  public static final String JSON_PROPERTY_BODY = "body";
  private SubmissionsBody body;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<Object> url = JsonNullable.<Object>of(null);

  public Submissions() {
  }

  public Submissions id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Primary key of this record in the Canvas submissions dataset.
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


  public Submissions attachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
    
    return this;
  }

   /**
   * The ID of an attachment belonging to this submission if &#x60;submission_type&#x60; is &#x60;online_url&#x60;. Generally superseded by &#x60;attachment_ids&#x60;.
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


  public Submissions courseId(Object courseId) {
    
    this.courseId = courseId;
    return this;
  }

   /**
   * The ID of the associated assignment&#39;s course.
   * @return courseId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCourseId() {
    return courseId;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourseId(Object courseId) {
    this.courseId = courseId;
  }


  public Submissions userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user who created the submission.
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


  public Submissions createdAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
    
    return this;
  }

   /**
   * Timestamp of when the submission was created.
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


  public Submissions updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Timestamp of when the submission was last updated.
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


  public Submissions workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the submission.
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


  public Submissions assignmentId(Object assignmentId) {
    
    this.assignmentId = assignmentId;
    return this;
  }

   /**
   * The ID of the associated assignment.
   * @return assignmentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAssignmentId() {
    return assignmentId;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignmentId(Object assignmentId) {
    this.assignmentId = assignmentId;
  }


  public Submissions mediaCommentId(Object mediaCommentId) {
    this.mediaCommentId = JsonNullable.<Object>of(mediaCommentId);
    
    return this;
  }

   /**
   * For media comments, the ID of the media object associated with this comment, as a string.
   * @return mediaCommentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMediaCommentId() {
        return mediaCommentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMediaCommentId_JsonNullable() {
    return mediaCommentId;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_ID)
  public void setMediaCommentId_JsonNullable(JsonNullable<Object> mediaCommentId) {
    this.mediaCommentId = mediaCommentId;
  }

  public void setMediaCommentId(Object mediaCommentId) {
    this.mediaCommentId = JsonNullable.<Object>of(mediaCommentId);
  }


  public Submissions mediaCommentType(MediaCommentTypeEnum mediaCommentType) {
    this.mediaCommentType = JsonNullable.<MediaCommentTypeEnum>of(mediaCommentType);
    
    return this;
  }

   /**
   * For media comments, the type of the media object associated with this comment.
   * @return mediaCommentType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MediaCommentTypeEnum getMediaCommentType() {
        return mediaCommentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MediaCommentTypeEnum> getMediaCommentType_JsonNullable() {
    return mediaCommentType;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_TYPE)
  public void setMediaCommentType_JsonNullable(JsonNullable<MediaCommentTypeEnum> mediaCommentType) {
    this.mediaCommentType = mediaCommentType;
  }

  public void setMediaCommentType(MediaCommentTypeEnum mediaCommentType) {
    this.mediaCommentType = JsonNullable.<MediaCommentTypeEnum>of(mediaCommentType);
  }


  public Submissions attachmentIds(SubmissionsAttachmentIds attachmentIds) {
    
    this.attachmentIds = attachmentIds;
    return this;
  }

   /**
   * Get attachmentIds
   * @return attachmentIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubmissionsAttachmentIds getAttachmentIds() {
    return attachmentIds;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentIds(SubmissionsAttachmentIds attachmentIds) {
    this.attachmentIds = attachmentIds;
  }


  public Submissions postedAt(Object postedAt) {
    this.postedAt = JsonNullable.<Object>of(postedAt);
    
    return this;
  }

   /**
   * The date this submission was posted to the student, or NULL if it has not been posted.
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


  public Submissions groupId(Object groupId) {
    this.groupId = JsonNullable.<Object>of(groupId);
    
    return this;
  }

   /**
   * Foreign key to the &#x60;groups&#x60; table.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGroupId() {
        return groupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGroupId_JsonNullable() {
    return groupId;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  public void setGroupId_JsonNullable(JsonNullable<Object> groupId) {
    this.groupId = groupId;
  }

  public void setGroupId(Object groupId) {
    this.groupId = JsonNullable.<Object>of(groupId);
  }


  public Submissions score(Object score) {
    this.score = JsonNullable.<Object>of(score);
    
    return this;
  }

   /**
   * The raw score.
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


  public Submissions attempt(Object attempt) {
    this.attempt = JsonNullable.<Object>of(attempt);
    
    return this;
  }

   /**
   * The number of attempts made including this one.
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


  public Submissions submittedAt(Object submittedAt) {
    this.submittedAt = JsonNullable.<Object>of(submittedAt);
    
    return this;
  }

   /**
   * The timestamp when the assignment was submitted. Note: this date may be missing even though the assignment was submitted and graded (example scenarios: paper assignments, submissions through external tools, no submission required, etc.); additionally, if the student failed to submit an assignment by the due date, the assignment can be graded by the instructor (and will be missing a &#x60;submitted_at&#x60; date).
   * @return submittedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmittedAt() {
        return submittedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMITTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmittedAt_JsonNullable() {
    return submittedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMITTED_AT)
  public void setSubmittedAt_JsonNullable(JsonNullable<Object> submittedAt) {
    this.submittedAt = submittedAt;
  }

  public void setSubmittedAt(Object submittedAt) {
    this.submittedAt = JsonNullable.<Object>of(submittedAt);
  }


  public Submissions quizSubmissionId(Object quizSubmissionId) {
    this.quizSubmissionId = JsonNullable.<Object>of(quizSubmissionId);
    
    return this;
  }

   /**
   * Foreign key to the &#x60;quiz_submissions&#x60; dataset (if &#x60;submission_type&#x60; is &#x60;online_quiz&#x60;). If this field contains a value it means that the assignment is a quiz.
   * @return quizSubmissionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizSubmissionId() {
        return quizSubmissionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizSubmissionId_JsonNullable() {
    return quizSubmissionId;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_SUBMISSION_ID)
  public void setQuizSubmissionId_JsonNullable(JsonNullable<Object> quizSubmissionId) {
    this.quizSubmissionId = quizSubmissionId;
  }

  public void setQuizSubmissionId(Object quizSubmissionId) {
    this.quizSubmissionId = JsonNullable.<Object>of(quizSubmissionId);
  }


  public Submissions extraAttempts(Object extraAttempts) {
    this.extraAttempts = JsonNullable.<Object>of(extraAttempts);
    
    return this;
  }

   /**
   * Extra submission attempts allowed for the given user and assignment.
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


  public Submissions gradingPeriodId(Object gradingPeriodId) {
    this.gradingPeriodId = JsonNullable.<Object>of(gradingPeriodId);
    
    return this;
  }

   /**
   * The ID of the grading period that this submission&#39;s assignment belongs to.
   * @return gradingPeriodId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradingPeriodId() {
        return gradingPeriodId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADING_PERIOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradingPeriodId_JsonNullable() {
    return gradingPeriodId;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADING_PERIOD_ID)
  public void setGradingPeriodId_JsonNullable(JsonNullable<Object> gradingPeriodId) {
    this.gradingPeriodId = gradingPeriodId;
  }

  public void setGradingPeriodId(Object gradingPeriodId) {
    this.gradingPeriodId = JsonNullable.<Object>of(gradingPeriodId);
  }


  public Submissions grade(Object grade) {
    this.grade = JsonNullable.<Object>of(grade);
    
    return this;
  }

   /**
   * Letter grade mapped from the score by the grading scheme.
   * @return grade
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGrade() {
        return grade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGrade_JsonNullable() {
    return grade;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADE)
  public void setGrade_JsonNullable(JsonNullable<Object> grade) {
    this.grade = grade;
  }

  public void setGrade(Object grade) {
    this.grade = JsonNullable.<Object>of(grade);
  }


  public Submissions submissionType(SubmissionTypeEnum submissionType) {
    this.submissionType = JsonNullable.<SubmissionTypeEnum>of(submissionType);
    
    return this;
  }

   /**
   * The type of submission.
   * @return submissionType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public SubmissionTypeEnum getSubmissionType() {
        return submissionType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SubmissionTypeEnum> getSubmissionType_JsonNullable() {
    return submissionType;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_TYPE)
  public void setSubmissionType_JsonNullable(JsonNullable<SubmissionTypeEnum> submissionType) {
    this.submissionType = submissionType;
  }

  public void setSubmissionType(SubmissionTypeEnum submissionType) {
    this.submissionType = JsonNullable.<SubmissionTypeEnum>of(submissionType);
  }


  public Submissions processed(Object processed) {
    this.processed = JsonNullable.<Object>of(processed);
    
    return this;
  }

   /**
   * Valid only when there is a file/attachment associated with the submission. By default, this attribute is set to *false* when making the assignment submission. When a submission has a file/attachment associated with it, upon submitting the assignment a snapshot is saved and its value is set to *true*. Defaults to NULL.
   * @return processed
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getProcessed() {
        return processed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getProcessed_JsonNullable() {
    return processed;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESSED)
  public void setProcessed_JsonNullable(JsonNullable<Object> processed) {
    this.processed = processed;
  }

  public void setProcessed(Object processed) {
    this.processed = JsonNullable.<Object>of(processed);
  }


  public Submissions gradeMatchesCurrentSubmission(Object gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = JsonNullable.<Object>of(gradeMatchesCurrentSubmission);
    
    return this;
  }

   /**
   * A boolean flag which is false if the student has re-submitted since the submission was last graded. Valid only when a score has been assigned to a submission. This is set to *false* if a student makes a new submission to an already graded assignment. This is done to indicate that the current grade given by the teacher is not for the most recent submission by the student. It is set to *true* if a score has been given and there is no new submission. Defaults to NULL.
   * @return gradeMatchesCurrentSubmission
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradeMatchesCurrentSubmission() {
        return gradeMatchesCurrentSubmission.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADE_MATCHES_CURRENT_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradeMatchesCurrentSubmission_JsonNullable() {
    return gradeMatchesCurrentSubmission;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADE_MATCHES_CURRENT_SUBMISSION)
  public void setGradeMatchesCurrentSubmission_JsonNullable(JsonNullable<Object> gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
  }

  public void setGradeMatchesCurrentSubmission(Object gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = JsonNullable.<Object>of(gradeMatchesCurrentSubmission);
  }


  public Submissions publishedScore(Object publishedScore) {
    this.publishedScore = JsonNullable.<Object>of(publishedScore);
    
    return this;
  }

   /**
   * The raw score (identical to score).
   * @return publishedScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPublishedScore() {
        return publishedScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLISHED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPublishedScore_JsonNullable() {
    return publishedScore;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLISHED_SCORE)
  public void setPublishedScore_JsonNullable(JsonNullable<Object> publishedScore) {
    this.publishedScore = publishedScore;
  }

  public void setPublishedScore(Object publishedScore) {
    this.publishedScore = JsonNullable.<Object>of(publishedScore);
  }


  public Submissions publishedGrade(Object publishedGrade) {
    this.publishedGrade = JsonNullable.<Object>of(publishedGrade);
    
    return this;
  }

   /**
   * Valid only for a graded submission. The values are strings that reflect the grading type used. For example, a scoring method of &#x60;points&#x60; will show &#x60;4&#x60; if given a &#x60;4&#x60; out of &#x60;5&#x60;, and a scoring method of &#x60;letter grade&#x60; will show &#x60;B&#x60; for the same score (assuming a grading scale where 80-90% is a &#x60;B&#x60;). Defaults to NULL.
   * @return publishedGrade
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPublishedGrade() {
        return publishedGrade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLISHED_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPublishedGrade_JsonNullable() {
    return publishedGrade;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLISHED_GRADE)
  public void setPublishedGrade_JsonNullable(JsonNullable<Object> publishedGrade) {
    this.publishedGrade = publishedGrade;
  }

  public void setPublishedGrade(Object publishedGrade) {
    this.publishedGrade = JsonNullable.<Object>of(publishedGrade);
  }


  public Submissions gradedAt(Object gradedAt) {
    this.gradedAt = JsonNullable.<Object>of(gradedAt);
    
    return this;
  }

   /**
   * Timestamp of when the submission was graded.
   * @return gradedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradedAt() {
        return gradedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradedAt_JsonNullable() {
    return gradedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADED_AT)
  public void setGradedAt_JsonNullable(JsonNullable<Object> gradedAt) {
    this.gradedAt = gradedAt;
  }

  public void setGradedAt(Object gradedAt) {
    this.gradedAt = JsonNullable.<Object>of(gradedAt);
  }


  public Submissions studentEnteredScore(Object studentEnteredScore) {
    this.studentEnteredScore = JsonNullable.<Object>of(studentEnteredScore);
    
    return this;
  }

   /**
   * A \&quot;what-if\&quot; score that the student has entered for this submission.
   * @return studentEnteredScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStudentEnteredScore() {
        return studentEnteredScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STUDENT_ENTERED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStudentEnteredScore_JsonNullable() {
    return studentEnteredScore;
  }
  
  @JsonProperty(JSON_PROPERTY_STUDENT_ENTERED_SCORE)
  public void setStudentEnteredScore_JsonNullable(JsonNullable<Object> studentEnteredScore) {
    this.studentEnteredScore = studentEnteredScore;
  }

  public void setStudentEnteredScore(Object studentEnteredScore) {
    this.studentEnteredScore = JsonNullable.<Object>of(studentEnteredScore);
  }


  public Submissions graderId(Object graderId) {
    this.graderId = JsonNullable.<Object>of(graderId);
    
    return this;
  }

   /**
   * The ID of the user who graded the submission. This will be NULL for submissions that haven&#39;t been graded yet. It will be a positive number if a real user has graded the submission and a negative number if the submission was graded by a process (e.g. Quiz auto-grader and auto-grading LTI tools). Specifically auto-graded quizzes set &#x60;grader_id&#x60; to the negative of the quiz ID. Submissions auto-graded by LTI tools set &#x60;grader_id&#x60; to the negative of the tool ID.
   * @return graderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGraderId() {
        return graderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGraderId_JsonNullable() {
    return graderId;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADER_ID)
  public void setGraderId_JsonNullable(JsonNullable<Object> graderId) {
    this.graderId = graderId;
  }

  public void setGraderId(Object graderId) {
    this.graderId = JsonNullable.<Object>of(graderId);
  }


  public Submissions submissionCommentsCount(Object submissionCommentsCount) {
    this.submissionCommentsCount = JsonNullable.<Object>of(submissionCommentsCount);
    
    return this;
  }

   /**
   * A count of the number of comments made on this submission.
   * @return submissionCommentsCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmissionCommentsCount() {
        return submissionCommentsCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_COMMENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmissionCommentsCount_JsonNullable() {
    return submissionCommentsCount;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_COMMENTS_COUNT)
  public void setSubmissionCommentsCount_JsonNullable(JsonNullable<Object> submissionCommentsCount) {
    this.submissionCommentsCount = submissionCommentsCount;
  }

  public void setSubmissionCommentsCount(Object submissionCommentsCount) {
    this.submissionCommentsCount = JsonNullable.<Object>of(submissionCommentsCount);
  }


  public Submissions mediaObjectId(Object mediaObjectId) {
    this.mediaObjectId = JsonNullable.<Object>of(mediaObjectId);
    
    return this;
  }

   /**
   * The ID of the associated MediaObject.
   * @return mediaObjectId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMediaObjectId() {
        return mediaObjectId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMediaObjectId_JsonNullable() {
    return mediaObjectId;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_OBJECT_ID)
  public void setMediaObjectId_JsonNullable(JsonNullable<Object> mediaObjectId) {
    this.mediaObjectId = mediaObjectId;
  }

  public void setMediaObjectId(Object mediaObjectId) {
    this.mediaObjectId = JsonNullable.<Object>of(mediaObjectId);
  }


  public Submissions turnitinData(Object turnitinData) {
    this.turnitinData = JsonNullable.<Object>of(turnitinData);
    
    return this;
  }

   /**
   * A YAML string representing plagiarism data associated with this submission.
   * @return turnitinData
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTurnitinData() {
        return turnitinData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TURNITIN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTurnitinData_JsonNullable() {
    return turnitinData;
  }
  
  @JsonProperty(JSON_PROPERTY_TURNITIN_DATA)
  public void setTurnitinData_JsonNullable(JsonNullable<Object> turnitinData) {
    this.turnitinData = turnitinData;
  }

  public void setTurnitinData(Object turnitinData) {
    this.turnitinData = JsonNullable.<Object>of(turnitinData);
  }


  public Submissions cachedDueDate(Object cachedDueDate) {
    this.cachedDueDate = JsonNullable.<Object>of(cachedDueDate);
    
    return this;
  }

   /**
   * The de-normalized cached due date for this submission.
   * @return cachedDueDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCachedDueDate() {
        return cachedDueDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CACHED_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCachedDueDate_JsonNullable() {
    return cachedDueDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CACHED_DUE_DATE)
  public void setCachedDueDate_JsonNullable(JsonNullable<Object> cachedDueDate) {
    this.cachedDueDate = cachedDueDate;
  }

  public void setCachedDueDate(Object cachedDueDate) {
    this.cachedDueDate = JsonNullable.<Object>of(cachedDueDate);
  }


  public Submissions excused(Object excused) {
    this.excused = JsonNullable.<Object>of(excused);
    
    return this;
  }

   /**
   * Whether the assignment is excused. Excused assignments have no impact on a user&#39;s grade.
   * @return excused
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExcused() {
        return excused.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExcused_JsonNullable() {
    return excused;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCUSED)
  public void setExcused_JsonNullable(JsonNullable<Object> excused) {
    this.excused = excused;
  }

  public void setExcused(Object excused) {
    this.excused = JsonNullable.<Object>of(excused);
  }


  public Submissions gradedAnonymously(Object gradedAnonymously) {
    this.gradedAnonymously = JsonNullable.<Object>of(gradedAnonymously);
    
    return this;
  }

   /**
   * Denotes how the grading has been performed. Possible values are &#x60;graded_anonymously&#x60; and &#x60;not_graded_anonymously&#x60;.
   * @return gradedAnonymously
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradedAnonymously() {
        return gradedAnonymously.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADED_ANONYMOUSLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradedAnonymously_JsonNullable() {
    return gradedAnonymously;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADED_ANONYMOUSLY)
  public void setGradedAnonymously_JsonNullable(JsonNullable<Object> gradedAnonymously) {
    this.gradedAnonymously = gradedAnonymously;
  }

  public void setGradedAnonymously(Object gradedAnonymously) {
    this.gradedAnonymously = JsonNullable.<Object>of(gradedAnonymously);
  }


  public Submissions latePolicyStatus(Object latePolicyStatus) {
    this.latePolicyStatus = JsonNullable.<Object>of(latePolicyStatus);
    
    return this;
  }

   /**
   * The status of the submission in relation to the late policy. Only reflects statuses manually applied by a grader. Can be late, missing, none, or NULL.
   * @return latePolicyStatus
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLatePolicyStatus() {
        return latePolicyStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LATE_POLICY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLatePolicyStatus_JsonNullable() {
    return latePolicyStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_LATE_POLICY_STATUS)
  public void setLatePolicyStatus_JsonNullable(JsonNullable<Object> latePolicyStatus) {
    this.latePolicyStatus = latePolicyStatus;
  }

  public void setLatePolicyStatus(Object latePolicyStatus) {
    this.latePolicyStatus = JsonNullable.<Object>of(latePolicyStatus);
  }


  public Submissions pointsDeducted(Object pointsDeducted) {
    this.pointsDeducted = JsonNullable.<Object>of(pointsDeducted);
    
    return this;
  }

   /**
   * The amount of points automatically deducted from the score by the missing/late policy for a late or missing assignment.
   * @return pointsDeducted
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPointsDeducted() {
        return pointsDeducted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POINTS_DEDUCTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPointsDeducted_JsonNullable() {
    return pointsDeducted;
  }
  
  @JsonProperty(JSON_PROPERTY_POINTS_DEDUCTED)
  public void setPointsDeducted_JsonNullable(JsonNullable<Object> pointsDeducted) {
    this.pointsDeducted = pointsDeducted;
  }

  public void setPointsDeducted(Object pointsDeducted) {
    this.pointsDeducted = JsonNullable.<Object>of(pointsDeducted);
  }


  public Submissions secondsLateOverride(Object secondsLateOverride) {
    this.secondsLateOverride = JsonNullable.<Object>of(secondsLateOverride);
    
    return this;
  }

   /**
   * For late submissions, the amount of time (in seconds) the submission is late by.
   * @return secondsLateOverride
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSecondsLateOverride() {
        return secondsLateOverride.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECONDS_LATE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSecondsLateOverride_JsonNullable() {
    return secondsLateOverride;
  }
  
  @JsonProperty(JSON_PROPERTY_SECONDS_LATE_OVERRIDE)
  public void setSecondsLateOverride_JsonNullable(JsonNullable<Object> secondsLateOverride) {
    this.secondsLateOverride = secondsLateOverride;
  }

  public void setSecondsLateOverride(Object secondsLateOverride) {
    this.secondsLateOverride = JsonNullable.<Object>of(secondsLateOverride);
  }


  public Submissions ltiUserId(SubmissionsLtiUserId ltiUserId) {
    
    this.ltiUserId = ltiUserId;
    return this;
  }

   /**
   * Get ltiUserId
   * @return ltiUserId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LTI_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubmissionsLtiUserId getLtiUserId() {
    return ltiUserId;
  }


  @JsonProperty(JSON_PROPERTY_LTI_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLtiUserId(SubmissionsLtiUserId ltiUserId) {
    this.ltiUserId = ltiUserId;
  }


  public Submissions anonymousId(Object anonymousId) {
    this.anonymousId = JsonNullable.<Object>of(anonymousId);
    
    return this;
  }

   /**
   * A unique short ID identifying this submission without reference to the owning user.
   * @return anonymousId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAnonymousId() {
        return anonymousId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANONYMOUS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnonymousId_JsonNullable() {
    return anonymousId;
  }
  
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_ID)
  public void setAnonymousId_JsonNullable(JsonNullable<Object> anonymousId) {
    this.anonymousId = anonymousId;
  }

  public void setAnonymousId(Object anonymousId) {
    this.anonymousId = JsonNullable.<Object>of(anonymousId);
  }


  public Submissions lastCommentAt(Object lastCommentAt) {
    this.lastCommentAt = JsonNullable.<Object>of(lastCommentAt);
    
    return this;
  }

   /**
   * The date of the last non-draft comment on this submission by a user other than the submitter.
   * @return lastCommentAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastCommentAt() {
        return lastCommentAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_COMMENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastCommentAt_JsonNullable() {
    return lastCommentAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_COMMENT_AT)
  public void setLastCommentAt_JsonNullable(JsonNullable<Object> lastCommentAt) {
    this.lastCommentAt = lastCommentAt;
  }

  public void setLastCommentAt(Object lastCommentAt) {
    this.lastCommentAt = JsonNullable.<Object>of(lastCommentAt);
  }


  public Submissions cachedQuizLti(Object cachedQuizLti) {
    
    this.cachedQuizLti = cachedQuizLti;
    return this;
  }

   /**
   * True if the associated assignment is a Quizzes.Next assignment.
   * @return cachedQuizLti
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACHED_QUIZ_LTI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCachedQuizLti() {
    return cachedQuizLti;
  }


  @JsonProperty(JSON_PROPERTY_CACHED_QUIZ_LTI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCachedQuizLti(Object cachedQuizLti) {
    this.cachedQuizLti = cachedQuizLti;
  }


  public Submissions cachedTardiness(Object cachedTardiness) {
    this.cachedTardiness = JsonNullable.<Object>of(cachedTardiness);
    
    return this;
  }

   /**
   * The status of the submission in relation to the late policy, including automatically- applied statuses. Can be &#x60;late&#x60;, &#x60;missing&#x60; or NULL.
   * @return cachedTardiness
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCachedTardiness() {
        return cachedTardiness.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CACHED_TARDINESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCachedTardiness_JsonNullable() {
    return cachedTardiness;
  }
  
  @JsonProperty(JSON_PROPERTY_CACHED_TARDINESS)
  public void setCachedTardiness_JsonNullable(JsonNullable<Object> cachedTardiness) {
    this.cachedTardiness = cachedTardiness;
  }

  public void setCachedTardiness(Object cachedTardiness) {
    this.cachedTardiness = JsonNullable.<Object>of(cachedTardiness);
  }


  public Submissions resourceLinkLookupUuid(Object resourceLinkLookupUuid) {
    this.resourceLinkLookupUuid = JsonNullable.<Object>of(resourceLinkLookupUuid);
    
    return this;
  }

   /**
   * When the submission is from an LTI tool, the resource link lookup ID is assigned to the submission in order to recover the custom parameters.
   * @return resourceLinkLookupUuid
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getResourceLinkLookupUuid() {
        return resourceLinkLookupUuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_LINK_LOOKUP_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getResourceLinkLookupUuid_JsonNullable() {
    return resourceLinkLookupUuid;
  }
  
  @JsonProperty(JSON_PROPERTY_RESOURCE_LINK_LOOKUP_UUID)
  public void setResourceLinkLookupUuid_JsonNullable(JsonNullable<Object> resourceLinkLookupUuid) {
    this.resourceLinkLookupUuid = resourceLinkLookupUuid;
  }

  public void setResourceLinkLookupUuid(Object resourceLinkLookupUuid) {
    this.resourceLinkLookupUuid = JsonNullable.<Object>of(resourceLinkLookupUuid);
  }


  public Submissions redoRequest(Object redoRequest) {
    
    this.redoRequest = redoRequest;
    return this;
  }

   /**
   * True if the assignment has been reassigned to the student for resubmission.
   * @return redoRequest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDO_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRedoRequest() {
    return redoRequest;
  }


  @JsonProperty(JSON_PROPERTY_REDO_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedoRequest(Object redoRequest) {
    this.redoRequest = redoRequest;
  }


  public Submissions body(SubmissionsBody body) {
    
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

  public SubmissionsBody getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(SubmissionsBody body) {
    this.body = body;
  }


  public Submissions url(Object url) {
    this.url = JsonNullable.<Object>of(url);
    
    return this;
  }

   /**
   * URL content for the submission.
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<Object> url) {
    this.url = url;
  }

  public void setUrl(Object url) {
    this.url = JsonNullable.<Object>of(url);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submissions submissions = (Submissions) o;
    return Objects.equals(this.id, submissions.id) &&
        equalsNullable(this.attachmentId, submissions.attachmentId) &&
        Objects.equals(this.courseId, submissions.courseId) &&
        Objects.equals(this.userId, submissions.userId) &&
        equalsNullable(this.createdAt, submissions.createdAt) &&
        equalsNullable(this.updatedAt, submissions.updatedAt) &&
        Objects.equals(this.workflowState, submissions.workflowState) &&
        Objects.equals(this.assignmentId, submissions.assignmentId) &&
        equalsNullable(this.mediaCommentId, submissions.mediaCommentId) &&
        equalsNullable(this.mediaCommentType, submissions.mediaCommentType) &&
        Objects.equals(this.attachmentIds, submissions.attachmentIds) &&
        equalsNullable(this.postedAt, submissions.postedAt) &&
        equalsNullable(this.groupId, submissions.groupId) &&
        equalsNullable(this.score, submissions.score) &&
        equalsNullable(this.attempt, submissions.attempt) &&
        equalsNullable(this.submittedAt, submissions.submittedAt) &&
        equalsNullable(this.quizSubmissionId, submissions.quizSubmissionId) &&
        equalsNullable(this.extraAttempts, submissions.extraAttempts) &&
        equalsNullable(this.gradingPeriodId, submissions.gradingPeriodId) &&
        equalsNullable(this.grade, submissions.grade) &&
        equalsNullable(this.submissionType, submissions.submissionType) &&
        equalsNullable(this.processed, submissions.processed) &&
        equalsNullable(this.gradeMatchesCurrentSubmission, submissions.gradeMatchesCurrentSubmission) &&
        equalsNullable(this.publishedScore, submissions.publishedScore) &&
        equalsNullable(this.publishedGrade, submissions.publishedGrade) &&
        equalsNullable(this.gradedAt, submissions.gradedAt) &&
        equalsNullable(this.studentEnteredScore, submissions.studentEnteredScore) &&
        equalsNullable(this.graderId, submissions.graderId) &&
        equalsNullable(this.submissionCommentsCount, submissions.submissionCommentsCount) &&
        equalsNullable(this.mediaObjectId, submissions.mediaObjectId) &&
        equalsNullable(this.turnitinData, submissions.turnitinData) &&
        equalsNullable(this.cachedDueDate, submissions.cachedDueDate) &&
        equalsNullable(this.excused, submissions.excused) &&
        equalsNullable(this.gradedAnonymously, submissions.gradedAnonymously) &&
        equalsNullable(this.latePolicyStatus, submissions.latePolicyStatus) &&
        equalsNullable(this.pointsDeducted, submissions.pointsDeducted) &&
        equalsNullable(this.secondsLateOverride, submissions.secondsLateOverride) &&
        Objects.equals(this.ltiUserId, submissions.ltiUserId) &&
        equalsNullable(this.anonymousId, submissions.anonymousId) &&
        equalsNullable(this.lastCommentAt, submissions.lastCommentAt) &&
        Objects.equals(this.cachedQuizLti, submissions.cachedQuizLti) &&
        equalsNullable(this.cachedTardiness, submissions.cachedTardiness) &&
        equalsNullable(this.resourceLinkLookupUuid, submissions.resourceLinkLookupUuid) &&
        Objects.equals(this.redoRequest, submissions.redoRequest) &&
        Objects.equals(this.body, submissions.body) &&
        equalsNullable(this.url, submissions.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(attachmentId), courseId, userId, hashCodeNullable(createdAt), hashCodeNullable(updatedAt), workflowState, assignmentId, hashCodeNullable(mediaCommentId), hashCodeNullable(mediaCommentType), attachmentIds, hashCodeNullable(postedAt), hashCodeNullable(groupId), hashCodeNullable(score), hashCodeNullable(attempt), hashCodeNullable(submittedAt), hashCodeNullable(quizSubmissionId), hashCodeNullable(extraAttempts), hashCodeNullable(gradingPeriodId), hashCodeNullable(grade), hashCodeNullable(submissionType), hashCodeNullable(processed), hashCodeNullable(gradeMatchesCurrentSubmission), hashCodeNullable(publishedScore), hashCodeNullable(publishedGrade), hashCodeNullable(gradedAt), hashCodeNullable(studentEnteredScore), hashCodeNullable(graderId), hashCodeNullable(submissionCommentsCount), hashCodeNullable(mediaObjectId), hashCodeNullable(turnitinData), hashCodeNullable(cachedDueDate), hashCodeNullable(excused), hashCodeNullable(gradedAnonymously), hashCodeNullable(latePolicyStatus), hashCodeNullable(pointsDeducted), hashCodeNullable(secondsLateOverride), ltiUserId, hashCodeNullable(anonymousId), hashCodeNullable(lastCommentAt), cachedQuizLti, hashCodeNullable(cachedTardiness), hashCodeNullable(resourceLinkLookupUuid), redoRequest, body, hashCodeNullable(url));
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
    sb.append("class Submissions {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    mediaCommentId: ").append(toIndentedString(mediaCommentId)).append("\n");
    sb.append("    mediaCommentType: ").append(toIndentedString(mediaCommentType)).append("\n");
    sb.append("    attachmentIds: ").append(toIndentedString(attachmentIds)).append("\n");
    sb.append("    postedAt: ").append(toIndentedString(postedAt)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    quizSubmissionId: ").append(toIndentedString(quizSubmissionId)).append("\n");
    sb.append("    extraAttempts: ").append(toIndentedString(extraAttempts)).append("\n");
    sb.append("    gradingPeriodId: ").append(toIndentedString(gradingPeriodId)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    submissionType: ").append(toIndentedString(submissionType)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    gradeMatchesCurrentSubmission: ").append(toIndentedString(gradeMatchesCurrentSubmission)).append("\n");
    sb.append("    publishedScore: ").append(toIndentedString(publishedScore)).append("\n");
    sb.append("    publishedGrade: ").append(toIndentedString(publishedGrade)).append("\n");
    sb.append("    gradedAt: ").append(toIndentedString(gradedAt)).append("\n");
    sb.append("    studentEnteredScore: ").append(toIndentedString(studentEnteredScore)).append("\n");
    sb.append("    graderId: ").append(toIndentedString(graderId)).append("\n");
    sb.append("    submissionCommentsCount: ").append(toIndentedString(submissionCommentsCount)).append("\n");
    sb.append("    mediaObjectId: ").append(toIndentedString(mediaObjectId)).append("\n");
    sb.append("    turnitinData: ").append(toIndentedString(turnitinData)).append("\n");
    sb.append("    cachedDueDate: ").append(toIndentedString(cachedDueDate)).append("\n");
    sb.append("    excused: ").append(toIndentedString(excused)).append("\n");
    sb.append("    gradedAnonymously: ").append(toIndentedString(gradedAnonymously)).append("\n");
    sb.append("    latePolicyStatus: ").append(toIndentedString(latePolicyStatus)).append("\n");
    sb.append("    pointsDeducted: ").append(toIndentedString(pointsDeducted)).append("\n");
    sb.append("    secondsLateOverride: ").append(toIndentedString(secondsLateOverride)).append("\n");
    sb.append("    ltiUserId: ").append(toIndentedString(ltiUserId)).append("\n");
    sb.append("    anonymousId: ").append(toIndentedString(anonymousId)).append("\n");
    sb.append("    lastCommentAt: ").append(toIndentedString(lastCommentAt)).append("\n");
    sb.append("    cachedQuizLti: ").append(toIndentedString(cachedQuizLti)).append("\n");
    sb.append("    cachedTardiness: ").append(toIndentedString(cachedTardiness)).append("\n");
    sb.append("    resourceLinkLookupUuid: ").append(toIndentedString(resourceLinkLookupUuid)).append("\n");
    sb.append("    redoRequest: ").append(toIndentedString(redoRequest)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

