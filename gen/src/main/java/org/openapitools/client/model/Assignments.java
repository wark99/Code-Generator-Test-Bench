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
import org.openapitools.client.model.AssignmentsDescription;
import org.openapitools.client.model.AssignmentsLtiContextId;
import org.openapitools.client.model.AssignmentsSisSourceId;
import org.openapitools.client.model.TypeExtractedFromColumnAssignmentsTurnitinSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * There is one record in this table for each assignment.
 */
@JsonPropertyOrder({
  Assignments.JSON_PROPERTY_ID,
  Assignments.JSON_PROPERTY_INTEGRATION_ID,
  Assignments.JSON_PROPERTY_LTI_CONTEXT_ID,
  Assignments.JSON_PROPERTY_CREATED_AT,
  Assignments.JSON_PROPERTY_UPDATED_AT,
  Assignments.JSON_PROPERTY_WORKFLOW_STATE,
  Assignments.JSON_PROPERTY_DUE_AT,
  Assignments.JSON_PROPERTY_UNLOCK_AT,
  Assignments.JSON_PROPERTY_LOCK_AT,
  Assignments.JSON_PROPERTY_POINTS_POSSIBLE,
  Assignments.JSON_PROPERTY_GRADING_TYPE,
  Assignments.JSON_PROPERTY_SUBMISSION_TYPES,
  Assignments.JSON_PROPERTY_ASSIGNMENT_GROUP_ID,
  Assignments.JSON_PROPERTY_GRADING_STANDARD_ID,
  Assignments.JSON_PROPERTY_SUBMISSIONS_DOWNLOADS,
  Assignments.JSON_PROPERTY_PEER_REVIEW_COUNT,
  Assignments.JSON_PROPERTY_PEER_REVIEWS_DUE_AT,
  Assignments.JSON_PROPERTY_PEER_REVIEWS_ASSIGNED,
  Assignments.JSON_PROPERTY_PEER_REVIEWS,
  Assignments.JSON_PROPERTY_CONTEXT_ID,
  Assignments.JSON_PROPERTY_CONTEXT_TYPE,
  Assignments.JSON_PROPERTY_AUTOMATIC_PEER_REVIEWS,
  Assignments.JSON_PROPERTY_ALL_DAY,
  Assignments.JSON_PROPERTY_ALL_DAY_DATE,
  Assignments.JSON_PROPERTY_COULD_BE_LOCKED,
  Assignments.JSON_PROPERTY_MIGRATION_ID,
  Assignments.JSON_PROPERTY_GRADE_GROUP_STUDENTS_INDIVIDUALLY,
  Assignments.JSON_PROPERTY_ANONYMOUS_PEER_REVIEWS,
  Assignments.JSON_PROPERTY_TURNITIN_ENABLED,
  Assignments.JSON_PROPERTY_ALLOWED_EXTENSIONS,
  Assignments.JSON_PROPERTY_GROUP_CATEGORY_ID,
  Assignments.JSON_PROPERTY_FREEZE_ON_COPY,
  Assignments.JSON_PROPERTY_ONLY_VISIBLE_TO_OVERRIDES,
  Assignments.JSON_PROPERTY_POST_TO_SIS,
  Assignments.JSON_PROPERTY_MODERATED_GRADING,
  Assignments.JSON_PROPERTY_GRADES_PUBLISHED_AT,
  Assignments.JSON_PROPERTY_OMIT_FROM_FINAL_GRADE,
  Assignments.JSON_PROPERTY_INTRA_GROUP_PEER_REVIEWS,
  Assignments.JSON_PROPERTY_VERICITE_ENABLED,
  Assignments.JSON_PROPERTY_ANONYMOUS_INSTRUCTOR_ANNOTATIONS,
  Assignments.JSON_PROPERTY_DUPLICATE_OF_ID,
  Assignments.JSON_PROPERTY_ANONYMOUS_GRADING,
  Assignments.JSON_PROPERTY_GRADERS_ANONYMOUS_TO_GRADERS,
  Assignments.JSON_PROPERTY_GRADER_COUNT,
  Assignments.JSON_PROPERTY_GRADER_COMMENTS_VISIBLE_TO_GRADERS,
  Assignments.JSON_PROPERTY_GRADER_SECTION_ID,
  Assignments.JSON_PROPERTY_FINAL_GRADER_ID,
  Assignments.JSON_PROPERTY_GRADER_NAMES_VISIBLE_TO_FINAL_GRADER,
  Assignments.JSON_PROPERTY_ALLOWED_ATTEMPTS,
  Assignments.JSON_PROPERTY_SIS_SOURCE_ID,
  Assignments.JSON_PROPERTY_ANNOTATABLE_ATTACHMENT_ID,
  Assignments.JSON_PROPERTY_IMPORTANT_DATES,
  Assignments.JSON_PROPERTY_DESCRIPTION,
  Assignments.JSON_PROPERTY_POSITION,
  Assignments.JSON_PROPERTY_TITLE,
  Assignments.JSON_PROPERTY_TURNITIN_SETTINGS
})
@JsonTypeName("assignments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Assignments {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private JsonNullable<Object> integrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LTI_CONTEXT_ID = "lti_context_id";
  private AssignmentsLtiContextId ltiContextId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Object> createdAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  /**
   * Current workflow state of the assignment.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    UNPUBLISHED("unpublished"),
    
    PUBLISHED("published"),
    
    DELETED("deleted"),
    
    DUPLICATING("duplicating"),
    
    FAIL_TO_IMPORT("fail_to_import"),
    
    FAILED_TO_DUPLICATE("failed_to_duplicate"),
    
    FAILED_TO_IMPORT("failed_to_import"),
    
    FAILED_TO_MIGRATE("failed_to_migrate"),
    
    IMPORTING("importing"),
    
    MIGRATING("migrating");

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

  /**
   * The type of grading the assignment receives.
   */
  public enum GradingTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    GPA_SCALE("gpa_scale"),
    
    LETTER_GRADE("letter_grade"),
    
    NOT_GRADED("not_graded"),
    
    PASS_FAIL("pass_fail"),
    
    PERCENT("percent"),
    
    POINTS("points"),
    
    DEFAULT("default");

    private Object value;

    GradingTypeEnum(Object value) {
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
    public static GradingTypeEnum fromValue(Object value) {
      for (GradingTypeEnum b : GradingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_GRADING_TYPE = "grading_type";
  private JsonNullable<GradingTypeEnum> gradingType = JsonNullable.<GradingTypeEnum>of(null);

  public static final String JSON_PROPERTY_SUBMISSION_TYPES = "submission_types";
  private Object submissionTypes = null;

  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_ID = "assignment_group_id";
  private JsonNullable<Object> assignmentGroupId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADING_STANDARD_ID = "grading_standard_id";
  private JsonNullable<Object> gradingStandardId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMISSIONS_DOWNLOADS = "submissions_downloads";
  private Object submissionsDownloads = null;

  public static final String JSON_PROPERTY_PEER_REVIEW_COUNT = "peer_review_count";
  private Object peerReviewCount = null;

  public static final String JSON_PROPERTY_PEER_REVIEWS_DUE_AT = "peer_reviews_due_at";
  private JsonNullable<Object> peerReviewsDueAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PEER_REVIEWS_ASSIGNED = "peer_reviews_assigned";
  private Object peerReviewsAssigned = null;

  public static final String JSON_PROPERTY_PEER_REVIEWS = "peer_reviews";
  private Object peerReviews = null;

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of object this assignment belongs to.
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

  public static final String JSON_PROPERTY_AUTOMATIC_PEER_REVIEWS = "automatic_peer_reviews";
  private Object automaticPeerReviews = null;

  public static final String JSON_PROPERTY_ALL_DAY = "all_day";
  private Object allDay = null;

  public static final String JSON_PROPERTY_ALL_DAY_DATE = "all_day_date";
  private JsonNullable<Object> allDayDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COULD_BE_LOCKED = "could_be_locked";
  private Object couldBeLocked = null;

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADE_GROUP_STUDENTS_INDIVIDUALLY = "grade_group_students_individually";
  private Object gradeGroupStudentsIndividually = null;

  public static final String JSON_PROPERTY_ANONYMOUS_PEER_REVIEWS = "anonymous_peer_reviews";
  private Object anonymousPeerReviews = null;

  public static final String JSON_PROPERTY_TURNITIN_ENABLED = "turnitin_enabled";
  private Object turnitinEnabled = null;

  public static final String JSON_PROPERTY_ALLOWED_EXTENSIONS = "allowed_extensions";
  private JsonNullable<Object> allowedExtensions = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_CATEGORY_ID = "group_category_id";
  private JsonNullable<Object> groupCategoryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FREEZE_ON_COPY = "freeze_on_copy";
  private Object freezeOnCopy = null;

  public static final String JSON_PROPERTY_ONLY_VISIBLE_TO_OVERRIDES = "only_visible_to_overrides";
  private Object onlyVisibleToOverrides = null;

  public static final String JSON_PROPERTY_POST_TO_SIS = "post_to_sis";
  private Object postToSis = null;

  public static final String JSON_PROPERTY_MODERATED_GRADING = "moderated_grading";
  private Object moderatedGrading = null;

  public static final String JSON_PROPERTY_GRADES_PUBLISHED_AT = "grades_published_at";
  private JsonNullable<Object> gradesPublishedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_OMIT_FROM_FINAL_GRADE = "omit_from_final_grade";
  private Object omitFromFinalGrade = null;

  public static final String JSON_PROPERTY_INTRA_GROUP_PEER_REVIEWS = "intra_group_peer_reviews";
  private Object intraGroupPeerReviews = null;

  public static final String JSON_PROPERTY_VERICITE_ENABLED = "vericite_enabled";
  private Object vericiteEnabled = null;

  public static final String JSON_PROPERTY_ANONYMOUS_INSTRUCTOR_ANNOTATIONS = "anonymous_instructor_annotations";
  private Object anonymousInstructorAnnotations = null;

  public static final String JSON_PROPERTY_DUPLICATE_OF_ID = "duplicate_of_id";
  private JsonNullable<Object> duplicateOfId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ANONYMOUS_GRADING = "anonymous_grading";
  private Object anonymousGrading = null;

  public static final String JSON_PROPERTY_GRADERS_ANONYMOUS_TO_GRADERS = "graders_anonymous_to_graders";
  private Object gradersAnonymousToGraders = null;

  public static final String JSON_PROPERTY_GRADER_COUNT = "grader_count";
  private Object graderCount = null;

  public static final String JSON_PROPERTY_GRADER_COMMENTS_VISIBLE_TO_GRADERS = "grader_comments_visible_to_graders";
  private Object graderCommentsVisibleToGraders = null;

  public static final String JSON_PROPERTY_GRADER_SECTION_ID = "grader_section_id";
  private JsonNullable<Object> graderSectionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FINAL_GRADER_ID = "final_grader_id";
  private JsonNullable<Object> finalGraderId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADER_NAMES_VISIBLE_TO_FINAL_GRADER = "grader_names_visible_to_final_grader";
  private Object graderNamesVisibleToFinalGrader = null;

  public static final String JSON_PROPERTY_ALLOWED_ATTEMPTS = "allowed_attempts";
  private JsonNullable<Object> allowedAttempts = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_SOURCE_ID = "sis_source_id";
  private AssignmentsSisSourceId sisSourceId;

  public static final String JSON_PROPERTY_ANNOTATABLE_ATTACHMENT_ID = "annotatable_attachment_id";
  private JsonNullable<Object> annotatableAttachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IMPORTANT_DATES = "important_dates";
  private Object importantDates = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private AssignmentsDescription description;

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<Object> title = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TURNITIN_SETTINGS = "turnitin_settings";
  private TypeExtractedFromColumnAssignmentsTurnitinSettings turnitinSettings;

  public Assignments() {
  }

  public Assignments id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Primary key for this record in the Canvas assignments table.
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


  public Assignments integrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
    
    return this;
  }

   /**
   * Third Party unique identifier for Assignments.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIntegrationId() {
        return integrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIntegrationId_JsonNullable() {
    return integrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  public void setIntegrationId_JsonNullable(JsonNullable<Object> integrationId) {
    this.integrationId = integrationId;
  }

  public void setIntegrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
  }


  public Assignments ltiContextId(AssignmentsLtiContextId ltiContextId) {
    
    this.ltiContextId = ltiContextId;
    return this;
  }

   /**
   * Get ltiContextId
   * @return ltiContextId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssignmentsLtiContextId getLtiContextId() {
    return ltiContextId;
  }


  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLtiContextId(AssignmentsLtiContextId ltiContextId) {
    this.ltiContextId = ltiContextId;
  }


  public Assignments createdAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
    
    return this;
  }

   /**
   * The time at which this assignment was originally created.
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


  public Assignments updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * The time at which this assignment was last modified.
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


  public Assignments workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Current workflow state of the assignment.
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


  public Assignments dueAt(Object dueAt) {
    this.dueAt = JsonNullable.<Object>of(dueAt);
    
    return this;
  }

   /**
   * The due date for the assignment. Returns NULL if not present.
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


  public Assignments unlockAt(Object unlockAt) {
    this.unlockAt = JsonNullable.<Object>of(unlockAt);
    
    return this;
  }

   /**
   * The unlock date, meaning that the assignment is unlocked after this date. Returns NULL if not present.
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


  public Assignments lockAt(Object lockAt) {
    this.lockAt = JsonNullable.<Object>of(lockAt);
    
    return this;
  }

   /**
   * The lock date, meaning that the assignment is locked after this date. Returns NULL if not present.
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


  public Assignments pointsPossible(Object pointsPossible) {
    this.pointsPossible = JsonNullable.<Object>of(pointsPossible);
    
    return this;
  }

   /**
   * The maximum points possible for the assignment.
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


  public Assignments gradingType(GradingTypeEnum gradingType) {
    this.gradingType = JsonNullable.<GradingTypeEnum>of(gradingType);
    
    return this;
  }

   /**
   * The type of grading the assignment receives.
   * @return gradingType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public GradingTypeEnum getGradingType() {
        return gradingType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<GradingTypeEnum> getGradingType_JsonNullable() {
    return gradingType;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADING_TYPE)
  public void setGradingType_JsonNullable(JsonNullable<GradingTypeEnum> gradingType) {
    this.gradingType = gradingType;
  }

  public void setGradingType(GradingTypeEnum gradingType) {
    this.gradingType = JsonNullable.<GradingTypeEnum>of(gradingType);
  }


  public Assignments submissionTypes(Object submissionTypes) {
    
    this.submissionTypes = submissionTypes;
    return this;
  }

   /**
   * The types of submissions allowed for this assignment.
   * @return submissionTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSubmissionTypes() {
    return submissionTypes;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmissionTypes(Object submissionTypes) {
    this.submissionTypes = submissionTypes;
  }


  public Assignments assignmentGroupId(Object assignmentGroupId) {
    this.assignmentGroupId = JsonNullable.<Object>of(assignmentGroupId);
    
    return this;
  }

   /**
   * Identifies which assignment grouping the particular assignment is part of (assignment groups may have a scoring weight to determine how much of the assignment group contributes to the total grade).
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


  public Assignments gradingStandardId(Object gradingStandardId) {
    this.gradingStandardId = JsonNullable.<Object>of(gradingStandardId);
    
    return this;
  }

   /**
   * The ID of the grading standard being applied to this assignment. Valid if &#x60;grading_type&#x60; is &#x60;letter_grade&#x60; or &#x60;gpa_scale&#x60;.
   * @return gradingStandardId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradingStandardId() {
        return gradingStandardId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADING_STANDARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradingStandardId_JsonNullable() {
    return gradingStandardId;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADING_STANDARD_ID)
  public void setGradingStandardId_JsonNullable(JsonNullable<Object> gradingStandardId) {
    this.gradingStandardId = gradingStandardId;
  }

  public void setGradingStandardId(Object gradingStandardId) {
    this.gradingStandardId = JsonNullable.<Object>of(gradingStandardId);
  }


  public Assignments submissionsDownloads(Object submissionsDownloads) {
    
    this.submissionsDownloads = submissionsDownloads;
    return this;
  }

   /**
   * Number of times submissions have been downloaded in a zip bundle.
   * @return submissionsDownloads
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSIONS_DOWNLOADS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSubmissionsDownloads() {
    return submissionsDownloads;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSIONS_DOWNLOADS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmissionsDownloads(Object submissionsDownloads) {
    this.submissionsDownloads = submissionsDownloads;
  }


  public Assignments peerReviewCount(Object peerReviewCount) {
    
    this.peerReviewCount = peerReviewCount;
    return this;
  }

   /**
   * Represents the amount of reviews each user is assigned. NOTE: This key is NOT present unless you have automatic_peer_reviews set to true.
   * @return peerReviewCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEER_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPeerReviewCount() {
    return peerReviewCount;
  }


  @JsonProperty(JSON_PROPERTY_PEER_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeerReviewCount(Object peerReviewCount) {
    this.peerReviewCount = peerReviewCount;
  }


  public Assignments peerReviewsDueAt(Object peerReviewsDueAt) {
    this.peerReviewsDueAt = JsonNullable.<Object>of(peerReviewsDueAt);
    
    return this;
  }

   /**
   * Timestamp for when peer reviews should be completed.
   * @return peerReviewsDueAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPeerReviewsDueAt() {
        return peerReviewsDueAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PEER_REVIEWS_DUE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPeerReviewsDueAt_JsonNullable() {
    return peerReviewsDueAt;
  }
  
  @JsonProperty(JSON_PROPERTY_PEER_REVIEWS_DUE_AT)
  public void setPeerReviewsDueAt_JsonNullable(JsonNullable<Object> peerReviewsDueAt) {
    this.peerReviewsDueAt = peerReviewsDueAt;
  }

  public void setPeerReviewsDueAt(Object peerReviewsDueAt) {
    this.peerReviewsDueAt = JsonNullable.<Object>of(peerReviewsDueAt);
  }


  public Assignments peerReviewsAssigned(Object peerReviewsAssigned) {
    
    this.peerReviewsAssigned = peerReviewsAssigned;
    return this;
  }

   /**
   * True if all peer reviews have been assigned.
   * @return peerReviewsAssigned
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEER_REVIEWS_ASSIGNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPeerReviewsAssigned() {
    return peerReviewsAssigned;
  }


  @JsonProperty(JSON_PROPERTY_PEER_REVIEWS_ASSIGNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeerReviewsAssigned(Object peerReviewsAssigned) {
    this.peerReviewsAssigned = peerReviewsAssigned;
  }


  public Assignments peerReviews(Object peerReviews) {
    
    this.peerReviews = peerReviews;
    return this;
  }

   /**
   * Indicates if peer reviews are required for this assignment.
   * @return peerReviews
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPeerReviews() {
    return peerReviews;
  }


  @JsonProperty(JSON_PROPERTY_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeerReviews(Object peerReviews) {
    this.peerReviews = peerReviews;
  }


  public Assignments contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the object this assignment belongs to. Typically course.
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


  public Assignments contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of object this assignment belongs to.
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


  public Assignments automaticPeerReviews(Object automaticPeerReviews) {
    
    this.automaticPeerReviews = automaticPeerReviews;
    return this;
  }

   /**
   * Indicates if peer reviews are assigned automatically. If false, the teacher is expected to manually assign peer reviews.
   * @return automaticPeerReviews
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATIC_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAutomaticPeerReviews() {
    return automaticPeerReviews;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATIC_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutomaticPeerReviews(Object automaticPeerReviews) {
    this.automaticPeerReviews = automaticPeerReviews;
  }


  public Assignments allDay(Object allDay) {
    
    this.allDay = allDay;
    return this;
  }

   /**
   * True if a specific time for when the assignment is due was not given. The effective due time will be 11:59pm.
   * @return allDay
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAllDay() {
    return allDay;
  }


  @JsonProperty(JSON_PROPERTY_ALL_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllDay(Object allDay) {
    this.allDay = allDay;
  }


  public Assignments allDayDate(Object allDayDate) {
    this.allDayDate = JsonNullable.<Object>of(allDayDate);
    
    return this;
  }

   /**
   * The date version of the due date if the &#x60;all_day&#x60; flag is true.
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


  public Assignments couldBeLocked(Object couldBeLocked) {
    
    this.couldBeLocked = couldBeLocked;
    return this;
  }

   /**
   * True if the assignment is under a module that can be locked.
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


  public Assignments migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported this assignment. For assignments which have been imported via a content migration, an opaque identifier for the assignment in its source. This field is used by Canvas to identify when an assignment is being re-imported, and can also be used to identify multiple assignments that have been copied from the same source.
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


  public Assignments gradeGroupStudentsIndividually(Object gradeGroupStudentsIndividually) {
    
    this.gradeGroupStudentsIndividually = gradeGroupStudentsIndividually;
    return this;
  }

   /**
   * If this is a group assignment, boolean flag indicating whether or not students will be graded individually.
   * @return gradeGroupStudentsIndividually
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADE_GROUP_STUDENTS_INDIVIDUALLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGradeGroupStudentsIndividually() {
    return gradeGroupStudentsIndividually;
  }


  @JsonProperty(JSON_PROPERTY_GRADE_GROUP_STUDENTS_INDIVIDUALLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGradeGroupStudentsIndividually(Object gradeGroupStudentsIndividually) {
    this.gradeGroupStudentsIndividually = gradeGroupStudentsIndividually;
  }


  public Assignments anonymousPeerReviews(Object anonymousPeerReviews) {
    
    this.anonymousPeerReviews = anonymousPeerReviews;
    return this;
  }

   /**
   * If true, hide the identities of peer-reviewing and peer-reviewed students. Only relevant if &#x60;peer_reviews&#x60; is true.
   * @return anonymousPeerReviews
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAnonymousPeerReviews() {
    return anonymousPeerReviews;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMOUS_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnonymousPeerReviews(Object anonymousPeerReviews) {
    this.anonymousPeerReviews = anonymousPeerReviews;
  }


  public Assignments turnitinEnabled(Object turnitinEnabled) {
    
    this.turnitinEnabled = turnitinEnabled;
    return this;
  }

   /**
   * Flag indicating whether or not Turnitin has been enabled for the assignment. NOTE: This flag will not appear unless your account has the Turnitin plugin available.
   * @return turnitinEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TURNITIN_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTurnitinEnabled() {
    return turnitinEnabled;
  }


  @JsonProperty(JSON_PROPERTY_TURNITIN_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTurnitinEnabled(Object turnitinEnabled) {
    this.turnitinEnabled = turnitinEnabled;
  }


  public Assignments allowedExtensions(Object allowedExtensions) {
    this.allowedExtensions = JsonNullable.<Object>of(allowedExtensions);
    
    return this;
  }

   /**
   * Allowed file extensions, which take effect if &#x60;submission_types&#x60; includes &#x60;online_upload&#x60;.
   * @return allowedExtensions
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowedExtensions() {
        return allowedExtensions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowedExtensions_JsonNullable() {
    return allowedExtensions;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOWED_EXTENSIONS)
  public void setAllowedExtensions_JsonNullable(JsonNullable<Object> allowedExtensions) {
    this.allowedExtensions = allowedExtensions;
  }

  public void setAllowedExtensions(Object allowedExtensions) {
    this.allowedExtensions = JsonNullable.<Object>of(allowedExtensions);
  }


  public Assignments groupCategoryId(Object groupCategoryId) {
    this.groupCategoryId = JsonNullable.<Object>of(groupCategoryId);
    
    return this;
  }

   /**
   * The ID of the assignment’s group set, if this is a group assignment. For group discussions, set &#x60;group_category_id&#x60; on the discussion topic, not the linked assignment.
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


  public Assignments freezeOnCopy(Object freezeOnCopy) {
    
    this.freezeOnCopy = freezeOnCopy;
    return this;
  }

   /**
   * Indicates if assignment will be frozen when it is copied. NOTE: This field will only be present if the AssignmentFreezer plugin is available for your account.
   * @return freezeOnCopy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREEZE_ON_COPY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFreezeOnCopy() {
    return freezeOnCopy;
  }


  @JsonProperty(JSON_PROPERTY_FREEZE_ON_COPY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFreezeOnCopy(Object freezeOnCopy) {
    this.freezeOnCopy = freezeOnCopy;
  }


  public Assignments onlyVisibleToOverrides(Object onlyVisibleToOverrides) {
    
    this.onlyVisibleToOverrides = onlyVisibleToOverrides;
    return this;
  }

   /**
   * Indicates whether the assignment is only visible to overrides.
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


  public Assignments postToSis(Object postToSis) {
    
    this.postToSis = postToSis;
    return this;
  }

   /**
   * Present if Sync Grades to Student Information System feature is enabled.
   * @return postToSis
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_TO_SIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPostToSis() {
    return postToSis;
  }


  @JsonProperty(JSON_PROPERTY_POST_TO_SIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostToSis(Object postToSis) {
    this.postToSis = postToSis;
  }


  public Assignments moderatedGrading(Object moderatedGrading) {
    
    this.moderatedGrading = moderatedGrading;
    return this;
  }

   /**
   * Indicates if the assignment is moderated.
   * @return moderatedGrading
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODERATED_GRADING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getModeratedGrading() {
    return moderatedGrading;
  }


  @JsonProperty(JSON_PROPERTY_MODERATED_GRADING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModeratedGrading(Object moderatedGrading) {
    this.moderatedGrading = moderatedGrading;
  }


  public Assignments gradesPublishedAt(Object gradesPublishedAt) {
    this.gradesPublishedAt = JsonNullable.<Object>of(gradesPublishedAt);
    
    return this;
  }

   /**
   * For assignments with moderated grading, a timestamp identifying when provisional grades were published.
   * @return gradesPublishedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradesPublishedAt() {
        return gradesPublishedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADES_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradesPublishedAt_JsonNullable() {
    return gradesPublishedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADES_PUBLISHED_AT)
  public void setGradesPublishedAt_JsonNullable(JsonNullable<Object> gradesPublishedAt) {
    this.gradesPublishedAt = gradesPublishedAt;
  }

  public void setGradesPublishedAt(Object gradesPublishedAt) {
    this.gradesPublishedAt = JsonNullable.<Object>of(gradesPublishedAt);
  }


  public Assignments omitFromFinalGrade(Object omitFromFinalGrade) {
    
    this.omitFromFinalGrade = omitFromFinalGrade;
    return this;
  }

   /**
   * If true, the assignment will be omitted from the student&#39;s final grade.
   * @return omitFromFinalGrade
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OMIT_FROM_FINAL_GRADE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getOmitFromFinalGrade() {
    return omitFromFinalGrade;
  }


  @JsonProperty(JSON_PROPERTY_OMIT_FROM_FINAL_GRADE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOmitFromFinalGrade(Object omitFromFinalGrade) {
    this.omitFromFinalGrade = omitFromFinalGrade;
  }


  public Assignments intraGroupPeerReviews(Object intraGroupPeerReviews) {
    
    this.intraGroupPeerReviews = intraGroupPeerReviews;
    return this;
  }

   /**
   * Indicates whether or not members from within the same group on a group assignment can be assigned to peer review their own group&#39;s work.
   * @return intraGroupPeerReviews
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTRA_GROUP_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIntraGroupPeerReviews() {
    return intraGroupPeerReviews;
  }


  @JsonProperty(JSON_PROPERTY_INTRA_GROUP_PEER_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntraGroupPeerReviews(Object intraGroupPeerReviews) {
    this.intraGroupPeerReviews = intraGroupPeerReviews;
  }


  public Assignments vericiteEnabled(Object vericiteEnabled) {
    
    this.vericiteEnabled = vericiteEnabled;
    return this;
  }

   /**
   * Flag indicating whether or not VeriCite has been enabled for the assignment. NOTE: This flag will not appear unless your account has the VeriCite plugin available.
   * @return vericiteEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERICITE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getVericiteEnabled() {
    return vericiteEnabled;
  }


  @JsonProperty(JSON_PROPERTY_VERICITE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVericiteEnabled(Object vericiteEnabled) {
    this.vericiteEnabled = vericiteEnabled;
  }


  public Assignments anonymousInstructorAnnotations(Object anonymousInstructorAnnotations) {
    
    this.anonymousInstructorAnnotations = anonymousInstructorAnnotations;
    return this;
  }

   /**
   * Flag indicating whether instructor annotations in document submissions for this assignment should be anonymous.
   * @return anonymousInstructorAnnotations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_INSTRUCTOR_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAnonymousInstructorAnnotations() {
    return anonymousInstructorAnnotations;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMOUS_INSTRUCTOR_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnonymousInstructorAnnotations(Object anonymousInstructorAnnotations) {
    this.anonymousInstructorAnnotations = anonymousInstructorAnnotations;
  }


  public Assignments duplicateOfId(Object duplicateOfId) {
    this.duplicateOfId = JsonNullable.<Object>of(duplicateOfId);
    
    return this;
  }

   /**
   * If the assignment is a duplicate, the ID of the original assignment.
   * @return duplicateOfId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDuplicateOfId() {
        return duplicateOfId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUPLICATE_OF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDuplicateOfId_JsonNullable() {
    return duplicateOfId;
  }
  
  @JsonProperty(JSON_PROPERTY_DUPLICATE_OF_ID)
  public void setDuplicateOfId_JsonNullable(JsonNullable<Object> duplicateOfId) {
    this.duplicateOfId = duplicateOfId;
  }

  public void setDuplicateOfId(Object duplicateOfId) {
    this.duplicateOfId = JsonNullable.<Object>of(duplicateOfId);
  }


  public Assignments anonymousGrading(Object anonymousGrading) {
    
    this.anonymousGrading = anonymousGrading;
    return this;
  }

   /**
   * Indicates if the assignment is graded anonymously. If true, graders cannot see student identities.
   * @return anonymousGrading
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_GRADING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAnonymousGrading() {
    return anonymousGrading;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMOUS_GRADING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnonymousGrading(Object anonymousGrading) {
    this.anonymousGrading = anonymousGrading;
  }


  public Assignments gradersAnonymousToGraders(Object gradersAnonymousToGraders) {
    
    this.gradersAnonymousToGraders = gradersAnonymousToGraders;
    return this;
  }

   /**
   * Indicates if provisional graders&#39; identities are hidden from other provisional graders. Only relevant for moderated assignments with grader_comments_visible_to_graders set to true.
   * @return gradersAnonymousToGraders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADERS_ANONYMOUS_TO_GRADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGradersAnonymousToGraders() {
    return gradersAnonymousToGraders;
  }


  @JsonProperty(JSON_PROPERTY_GRADERS_ANONYMOUS_TO_GRADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGradersAnonymousToGraders(Object gradersAnonymousToGraders) {
    this.gradersAnonymousToGraders = gradersAnonymousToGraders;
  }


  public Assignments graderCount(Object graderCount) {
    
    this.graderCount = graderCount;
    return this;
  }

   /**
   * The maximum number of provisional graders who may issue grades for this assignment. Only relevant for moderated assignments. Must be a positive value, and must be set to 1 if the course has fewer than two active instructors. Otherwise, the maximum value is the number of active instructors in the course minus one, or 10 if the course has more than 11 active instructors.
   * @return graderCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGraderCount() {
    return graderCount;
  }


  @JsonProperty(JSON_PROPERTY_GRADER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGraderCount(Object graderCount) {
    this.graderCount = graderCount;
  }


  public Assignments graderCommentsVisibleToGraders(Object graderCommentsVisibleToGraders) {
    
    this.graderCommentsVisibleToGraders = graderCommentsVisibleToGraders;
    return this;
  }

   /**
   * Indicates if provisional graders&#39; comments are visible to other provisional graders. Only relevant for moderated assignments.
   * @return graderCommentsVisibleToGraders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADER_COMMENTS_VISIBLE_TO_GRADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGraderCommentsVisibleToGraders() {
    return graderCommentsVisibleToGraders;
  }


  @JsonProperty(JSON_PROPERTY_GRADER_COMMENTS_VISIBLE_TO_GRADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGraderCommentsVisibleToGraders(Object graderCommentsVisibleToGraders) {
    this.graderCommentsVisibleToGraders = graderCommentsVisibleToGraders;
  }


  public Assignments graderSectionId(Object graderSectionId) {
    this.graderSectionId = JsonNullable.<Object>of(graderSectionId);
    
    return this;
  }

   /**
   * Graders for an assignment with anonymous moderated marking are assigned from this section if provided, or all sections otherwise.
   * @return graderSectionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGraderSectionId() {
        return graderSectionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADER_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGraderSectionId_JsonNullable() {
    return graderSectionId;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADER_SECTION_ID)
  public void setGraderSectionId_JsonNullable(JsonNullable<Object> graderSectionId) {
    this.graderSectionId = graderSectionId;
  }

  public void setGraderSectionId(Object graderSectionId) {
    this.graderSectionId = JsonNullable.<Object>of(graderSectionId);
  }


  public Assignments finalGraderId(Object finalGraderId) {
    this.finalGraderId = JsonNullable.<Object>of(finalGraderId);
    
    return this;
  }

   /**
   * User ID of the final grader.
   * @return finalGraderId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFinalGraderId() {
        return finalGraderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINAL_GRADER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFinalGraderId_JsonNullable() {
    return finalGraderId;
  }
  
  @JsonProperty(JSON_PROPERTY_FINAL_GRADER_ID)
  public void setFinalGraderId_JsonNullable(JsonNullable<Object> finalGraderId) {
    this.finalGraderId = finalGraderId;
  }

  public void setFinalGraderId(Object finalGraderId) {
    this.finalGraderId = JsonNullable.<Object>of(finalGraderId);
  }


  public Assignments graderNamesVisibleToFinalGrader(Object graderNamesVisibleToFinalGrader) {
    
    this.graderNamesVisibleToFinalGrader = graderNamesVisibleToFinalGrader;
    return this;
  }

   /**
   * Indicates if provisional grader identities are visible to the final grader. Only relevant for moderated assignments.
   * @return graderNamesVisibleToFinalGrader
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADER_NAMES_VISIBLE_TO_FINAL_GRADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGraderNamesVisibleToFinalGrader() {
    return graderNamesVisibleToFinalGrader;
  }


  @JsonProperty(JSON_PROPERTY_GRADER_NAMES_VISIBLE_TO_FINAL_GRADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGraderNamesVisibleToFinalGrader(Object graderNamesVisibleToFinalGrader) {
    this.graderNamesVisibleToFinalGrader = graderNamesVisibleToFinalGrader;
  }


  public Assignments allowedAttempts(Object allowedAttempts) {
    this.allowedAttempts = JsonNullable.<Object>of(allowedAttempts);
    
    return this;
  }

   /**
   * The number of submission attempts a student can make for this assignment. -1 is considered unlimited.
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


  public Assignments sisSourceId(AssignmentsSisSourceId sisSourceId) {
    
    this.sisSourceId = sisSourceId;
    return this;
  }

   /**
   * Get sisSourceId
   * @return sisSourceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIS_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssignmentsSisSourceId getSisSourceId() {
    return sisSourceId;
  }


  @JsonProperty(JSON_PROPERTY_SIS_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSisSourceId(AssignmentsSisSourceId sisSourceId) {
    this.sisSourceId = sisSourceId;
  }


  public Assignments annotatableAttachmentId(Object annotatableAttachmentId) {
    this.annotatableAttachmentId = JsonNullable.<Object>of(annotatableAttachmentId);
    
    return this;
  }

   /**
   * For an &#x60;Annotated Document&#x60; type assignment, the ID of the annotatable attachment.
   * @return annotatableAttachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAnnotatableAttachmentId() {
        return annotatableAttachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANNOTATABLE_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnnotatableAttachmentId_JsonNullable() {
    return annotatableAttachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ANNOTATABLE_ATTACHMENT_ID)
  public void setAnnotatableAttachmentId_JsonNullable(JsonNullable<Object> annotatableAttachmentId) {
    this.annotatableAttachmentId = annotatableAttachmentId;
  }

  public void setAnnotatableAttachmentId(Object annotatableAttachmentId) {
    this.annotatableAttachmentId = JsonNullable.<Object>of(annotatableAttachmentId);
  }


  public Assignments importantDates(Object importantDates) {
    
    this.importantDates = importantDates;
    return this;
  }

   /**
   * Indicates if the assignment has important dates.
   * @return importantDates
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTANT_DATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getImportantDates() {
    return importantDates;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTANT_DATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImportantDates(Object importantDates) {
    this.importantDates = importantDates;
  }


  public Assignments description(AssignmentsDescription description) {
    
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

  public AssignmentsDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(AssignmentsDescription description) {
    this.description = description;
  }


  public Assignments position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * The sorting order of the assignment in the group.
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


  public Assignments title(Object title) {
    this.title = JsonNullable.<Object>of(title);
    
    return this;
  }

   /**
   * Title of the assignment.
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


  public Assignments turnitinSettings(TypeExtractedFromColumnAssignmentsTurnitinSettings turnitinSettings) {
    
    this.turnitinSettings = turnitinSettings;
    return this;
  }

   /**
   * Get turnitinSettings
   * @return turnitinSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TURNITIN_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeExtractedFromColumnAssignmentsTurnitinSettings getTurnitinSettings() {
    return turnitinSettings;
  }


  @JsonProperty(JSON_PROPERTY_TURNITIN_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTurnitinSettings(TypeExtractedFromColumnAssignmentsTurnitinSettings turnitinSettings) {
    this.turnitinSettings = turnitinSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assignments assignments = (Assignments) o;
    return Objects.equals(this.id, assignments.id) &&
        equalsNullable(this.integrationId, assignments.integrationId) &&
        Objects.equals(this.ltiContextId, assignments.ltiContextId) &&
        equalsNullable(this.createdAt, assignments.createdAt) &&
        equalsNullable(this.updatedAt, assignments.updatedAt) &&
        Objects.equals(this.workflowState, assignments.workflowState) &&
        equalsNullable(this.dueAt, assignments.dueAt) &&
        equalsNullable(this.unlockAt, assignments.unlockAt) &&
        equalsNullable(this.lockAt, assignments.lockAt) &&
        equalsNullable(this.pointsPossible, assignments.pointsPossible) &&
        equalsNullable(this.gradingType, assignments.gradingType) &&
        Objects.equals(this.submissionTypes, assignments.submissionTypes) &&
        equalsNullable(this.assignmentGroupId, assignments.assignmentGroupId) &&
        equalsNullable(this.gradingStandardId, assignments.gradingStandardId) &&
        Objects.equals(this.submissionsDownloads, assignments.submissionsDownloads) &&
        Objects.equals(this.peerReviewCount, assignments.peerReviewCount) &&
        equalsNullable(this.peerReviewsDueAt, assignments.peerReviewsDueAt) &&
        Objects.equals(this.peerReviewsAssigned, assignments.peerReviewsAssigned) &&
        Objects.equals(this.peerReviews, assignments.peerReviews) &&
        Objects.equals(this.contextId, assignments.contextId) &&
        Objects.equals(this.contextType, assignments.contextType) &&
        Objects.equals(this.automaticPeerReviews, assignments.automaticPeerReviews) &&
        Objects.equals(this.allDay, assignments.allDay) &&
        equalsNullable(this.allDayDate, assignments.allDayDate) &&
        Objects.equals(this.couldBeLocked, assignments.couldBeLocked) &&
        equalsNullable(this.migrationId, assignments.migrationId) &&
        Objects.equals(this.gradeGroupStudentsIndividually, assignments.gradeGroupStudentsIndividually) &&
        Objects.equals(this.anonymousPeerReviews, assignments.anonymousPeerReviews) &&
        Objects.equals(this.turnitinEnabled, assignments.turnitinEnabled) &&
        equalsNullable(this.allowedExtensions, assignments.allowedExtensions) &&
        equalsNullable(this.groupCategoryId, assignments.groupCategoryId) &&
        Objects.equals(this.freezeOnCopy, assignments.freezeOnCopy) &&
        Objects.equals(this.onlyVisibleToOverrides, assignments.onlyVisibleToOverrides) &&
        Objects.equals(this.postToSis, assignments.postToSis) &&
        Objects.equals(this.moderatedGrading, assignments.moderatedGrading) &&
        equalsNullable(this.gradesPublishedAt, assignments.gradesPublishedAt) &&
        Objects.equals(this.omitFromFinalGrade, assignments.omitFromFinalGrade) &&
        Objects.equals(this.intraGroupPeerReviews, assignments.intraGroupPeerReviews) &&
        Objects.equals(this.vericiteEnabled, assignments.vericiteEnabled) &&
        Objects.equals(this.anonymousInstructorAnnotations, assignments.anonymousInstructorAnnotations) &&
        equalsNullable(this.duplicateOfId, assignments.duplicateOfId) &&
        Objects.equals(this.anonymousGrading, assignments.anonymousGrading) &&
        Objects.equals(this.gradersAnonymousToGraders, assignments.gradersAnonymousToGraders) &&
        Objects.equals(this.graderCount, assignments.graderCount) &&
        Objects.equals(this.graderCommentsVisibleToGraders, assignments.graderCommentsVisibleToGraders) &&
        equalsNullable(this.graderSectionId, assignments.graderSectionId) &&
        equalsNullable(this.finalGraderId, assignments.finalGraderId) &&
        Objects.equals(this.graderNamesVisibleToFinalGrader, assignments.graderNamesVisibleToFinalGrader) &&
        equalsNullable(this.allowedAttempts, assignments.allowedAttempts) &&
        Objects.equals(this.sisSourceId, assignments.sisSourceId) &&
        equalsNullable(this.annotatableAttachmentId, assignments.annotatableAttachmentId) &&
        Objects.equals(this.importantDates, assignments.importantDates) &&
        Objects.equals(this.description, assignments.description) &&
        equalsNullable(this.position, assignments.position) &&
        equalsNullable(this.title, assignments.title) &&
        Objects.equals(this.turnitinSettings, assignments.turnitinSettings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(integrationId), ltiContextId, hashCodeNullable(createdAt), hashCodeNullable(updatedAt), workflowState, hashCodeNullable(dueAt), hashCodeNullable(unlockAt), hashCodeNullable(lockAt), hashCodeNullable(pointsPossible), hashCodeNullable(gradingType), submissionTypes, hashCodeNullable(assignmentGroupId), hashCodeNullable(gradingStandardId), submissionsDownloads, peerReviewCount, hashCodeNullable(peerReviewsDueAt), peerReviewsAssigned, peerReviews, contextId, contextType, automaticPeerReviews, allDay, hashCodeNullable(allDayDate), couldBeLocked, hashCodeNullable(migrationId), gradeGroupStudentsIndividually, anonymousPeerReviews, turnitinEnabled, hashCodeNullable(allowedExtensions), hashCodeNullable(groupCategoryId), freezeOnCopy, onlyVisibleToOverrides, postToSis, moderatedGrading, hashCodeNullable(gradesPublishedAt), omitFromFinalGrade, intraGroupPeerReviews, vericiteEnabled, anonymousInstructorAnnotations, hashCodeNullable(duplicateOfId), anonymousGrading, gradersAnonymousToGraders, graderCount, graderCommentsVisibleToGraders, hashCodeNullable(graderSectionId), hashCodeNullable(finalGraderId), graderNamesVisibleToFinalGrader, hashCodeNullable(allowedAttempts), sisSourceId, hashCodeNullable(annotatableAttachmentId), importantDates, description, hashCodeNullable(position), hashCodeNullable(title), turnitinSettings);
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
    sb.append("class Assignments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    ltiContextId: ").append(toIndentedString(ltiContextId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    pointsPossible: ").append(toIndentedString(pointsPossible)).append("\n");
    sb.append("    gradingType: ").append(toIndentedString(gradingType)).append("\n");
    sb.append("    submissionTypes: ").append(toIndentedString(submissionTypes)).append("\n");
    sb.append("    assignmentGroupId: ").append(toIndentedString(assignmentGroupId)).append("\n");
    sb.append("    gradingStandardId: ").append(toIndentedString(gradingStandardId)).append("\n");
    sb.append("    submissionsDownloads: ").append(toIndentedString(submissionsDownloads)).append("\n");
    sb.append("    peerReviewCount: ").append(toIndentedString(peerReviewCount)).append("\n");
    sb.append("    peerReviewsDueAt: ").append(toIndentedString(peerReviewsDueAt)).append("\n");
    sb.append("    peerReviewsAssigned: ").append(toIndentedString(peerReviewsAssigned)).append("\n");
    sb.append("    peerReviews: ").append(toIndentedString(peerReviews)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    automaticPeerReviews: ").append(toIndentedString(automaticPeerReviews)).append("\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    allDayDate: ").append(toIndentedString(allDayDate)).append("\n");
    sb.append("    couldBeLocked: ").append(toIndentedString(couldBeLocked)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    gradeGroupStudentsIndividually: ").append(toIndentedString(gradeGroupStudentsIndividually)).append("\n");
    sb.append("    anonymousPeerReviews: ").append(toIndentedString(anonymousPeerReviews)).append("\n");
    sb.append("    turnitinEnabled: ").append(toIndentedString(turnitinEnabled)).append("\n");
    sb.append("    allowedExtensions: ").append(toIndentedString(allowedExtensions)).append("\n");
    sb.append("    groupCategoryId: ").append(toIndentedString(groupCategoryId)).append("\n");
    sb.append("    freezeOnCopy: ").append(toIndentedString(freezeOnCopy)).append("\n");
    sb.append("    onlyVisibleToOverrides: ").append(toIndentedString(onlyVisibleToOverrides)).append("\n");
    sb.append("    postToSis: ").append(toIndentedString(postToSis)).append("\n");
    sb.append("    moderatedGrading: ").append(toIndentedString(moderatedGrading)).append("\n");
    sb.append("    gradesPublishedAt: ").append(toIndentedString(gradesPublishedAt)).append("\n");
    sb.append("    omitFromFinalGrade: ").append(toIndentedString(omitFromFinalGrade)).append("\n");
    sb.append("    intraGroupPeerReviews: ").append(toIndentedString(intraGroupPeerReviews)).append("\n");
    sb.append("    vericiteEnabled: ").append(toIndentedString(vericiteEnabled)).append("\n");
    sb.append("    anonymousInstructorAnnotations: ").append(toIndentedString(anonymousInstructorAnnotations)).append("\n");
    sb.append("    duplicateOfId: ").append(toIndentedString(duplicateOfId)).append("\n");
    sb.append("    anonymousGrading: ").append(toIndentedString(anonymousGrading)).append("\n");
    sb.append("    gradersAnonymousToGraders: ").append(toIndentedString(gradersAnonymousToGraders)).append("\n");
    sb.append("    graderCount: ").append(toIndentedString(graderCount)).append("\n");
    sb.append("    graderCommentsVisibleToGraders: ").append(toIndentedString(graderCommentsVisibleToGraders)).append("\n");
    sb.append("    graderSectionId: ").append(toIndentedString(graderSectionId)).append("\n");
    sb.append("    finalGraderId: ").append(toIndentedString(finalGraderId)).append("\n");
    sb.append("    graderNamesVisibleToFinalGrader: ").append(toIndentedString(graderNamesVisibleToFinalGrader)).append("\n");
    sb.append("    allowedAttempts: ").append(toIndentedString(allowedAttempts)).append("\n");
    sb.append("    sisSourceId: ").append(toIndentedString(sisSourceId)).append("\n");
    sb.append("    annotatableAttachmentId: ").append(toIndentedString(annotatableAttachmentId)).append("\n");
    sb.append("    importantDates: ").append(toIndentedString(importantDates)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    turnitinSettings: ").append(toIndentedString(turnitinSettings)).append("\n");
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

