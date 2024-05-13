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
 * An enrollment represents a user&#39;s association with a specific course and section. There may be multiple records associated with a &#x60;course_id&#x60; and &#x60;user_id&#x60; combination (records are unique on: &#x60;course_id&#x60;, &#x60;user_id&#x60;, &#x60;course_section_id&#x60;, &#x60;role_id&#x60;, &#x60;workflow_state&#x60;, &#x60;associated_user_id&#x60;).
 */
@JsonPropertyOrder({
  Enrollments.JSON_PROPERTY_ID,
  Enrollments.JSON_PROPERTY_SIS_BATCH_ID,
  Enrollments.JSON_PROPERTY_USER_ID,
  Enrollments.JSON_PROPERTY_CREATED_AT,
  Enrollments.JSON_PROPERTY_UPDATED_AT,
  Enrollments.JSON_PROPERTY_WORKFLOW_STATE,
  Enrollments.JSON_PROPERTY_ROLE_ID,
  Enrollments.JSON_PROPERTY_START_AT,
  Enrollments.JSON_PROPERTY_END_AT,
  Enrollments.JSON_PROPERTY_COURSE_ID,
  Enrollments.JSON_PROPERTY_COMPLETED_AT,
  Enrollments.JSON_PROPERTY_COURSE_SECTION_ID,
  Enrollments.JSON_PROPERTY_GRADE_PUBLISHING_STATUS,
  Enrollments.JSON_PROPERTY_ASSOCIATED_USER_ID,
  Enrollments.JSON_PROPERTY_SELF_ENROLLED,
  Enrollments.JSON_PROPERTY_LIMIT_PRIVILEGES_TO_COURSE_SECTION,
  Enrollments.JSON_PROPERTY_LAST_ACTIVITY_AT,
  Enrollments.JSON_PROPERTY_TOTAL_ACTIVITY_TIME,
  Enrollments.JSON_PROPERTY_SIS_PSEUDONYM_ID,
  Enrollments.JSON_PROPERTY_LAST_ATTENDED_AT,
  Enrollments.JSON_PROPERTY_TYPE
})
@JsonTypeName("enrollments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Enrollments {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_SIS_BATCH_ID = "sis_batch_id";
  private JsonNullable<Object> sisBatchId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Object userId = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the user&#39;s enrollment in the course.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    CREATION_PENDING("creation_pending"),
    
    INVITED("invited"),
    
    REJECTED("rejected"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    COMPLETED("completed"),
    
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

  public static final String JSON_PROPERTY_ROLE_ID = "role_id";
  private Object roleId = null;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private JsonNullable<Object> startAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private JsonNullable<Object> endAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_ID = "course_id";
  private Object courseId = null;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private JsonNullable<Object> completedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_SECTION_ID = "course_section_id";
  private Object courseSectionId = null;

  public static final String JSON_PROPERTY_GRADE_PUBLISHING_STATUS = "grade_publishing_status";
  private Object gradePublishingStatus = null;

  public static final String JSON_PROPERTY_ASSOCIATED_USER_ID = "associated_user_id";
  private JsonNullable<Object> associatedUserId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SELF_ENROLLED = "self_enrolled";
  private JsonNullable<Object> selfEnrolled = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LIMIT_PRIVILEGES_TO_COURSE_SECTION = "limit_privileges_to_course_section";
  private Object limitPrivilegesToCourseSection = null;

  public static final String JSON_PROPERTY_LAST_ACTIVITY_AT = "last_activity_at";
  private JsonNullable<Object> lastActivityAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TOTAL_ACTIVITY_TIME = "total_activity_time";
  private JsonNullable<Object> totalActivityTime = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_PSEUDONYM_ID = "sis_pseudonym_id";
  private JsonNullable<Object> sisPseudonymId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_ATTENDED_AT = "last_attended_at";
  private JsonNullable<Object> lastAttendedAt = JsonNullable.<Object>of(null);

  /**
   * The base enrollment type.
   */
  public enum TypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    STUDENTENROLLMENT("StudentEnrollment"),
    
    TEACHERENROLLMENT("TeacherEnrollment"),
    
    TAENROLLMENT("TaEnrollment"),
    
    DESIGNERENROLLMENT("DesignerEnrollment"),
    
    OBSERVERENROLLMENT("ObserverEnrollment"),
    
    STUDENTVIEWENROLLMENT("StudentViewEnrollment");

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
  private TypeEnum type = null;

  public Enrollments() {
  }

  public Enrollments id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the enrollment.
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


  public Enrollments sisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
    
    return this;
  }

   /**
   * The unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information.
   * @return sisBatchId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSisBatchId() {
        return sisBatchId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIS_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSisBatchId_JsonNullable() {
    return sisBatchId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIS_BATCH_ID)
  public void setSisBatchId_JsonNullable(JsonNullable<Object> sisBatchId) {
    this.sisBatchId = sisBatchId;
  }

  public void setSisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
  }


  public Enrollments userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The unique ID of the user.
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


  public Enrollments createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The created time of the enrollment.
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


  public Enrollments updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The updated time of the enrollment.
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


  public Enrollments workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the user&#39;s enrollment in the course.
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


  public Enrollments roleId(Object roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * The ID of the enrollment role.
   * @return roleId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleId(Object roleId) {
    this.roleId = roleId;
  }


  public Enrollments startAt(Object startAt) {
    this.startAt = JsonNullable.<Object>of(startAt);
    
    return this;
  }

   /**
   * The start time of the enrollment, in ISO8601 format.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStartAt() {
        return startAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStartAt_JsonNullable() {
    return startAt;
  }
  
  @JsonProperty(JSON_PROPERTY_START_AT)
  public void setStartAt_JsonNullable(JsonNullable<Object> startAt) {
    this.startAt = startAt;
  }

  public void setStartAt(Object startAt) {
    this.startAt = JsonNullable.<Object>of(startAt);
  }


  public Enrollments endAt(Object endAt) {
    this.endAt = JsonNullable.<Object>of(endAt);
    
    return this;
  }

   /**
   * The end time of the enrollment, in ISO8601 format.
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


  public Enrollments courseId(Object courseId) {
    
    this.courseId = courseId;
    return this;
  }

   /**
   * The unique ID of the course.
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


  public Enrollments completedAt(Object completedAt) {
    this.completedAt = JsonNullable.<Object>of(completedAt);
    
    return this;
  }

   /**
   * Enrollment completed date.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCompletedAt() {
        return completedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCompletedAt_JsonNullable() {
    return completedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  public void setCompletedAt_JsonNullable(JsonNullable<Object> completedAt) {
    this.completedAt = completedAt;
  }

  public void setCompletedAt(Object completedAt) {
    this.completedAt = JsonNullable.<Object>of(completedAt);
  }


  public Enrollments courseSectionId(Object courseSectionId) {
    
    this.courseSectionId = courseSectionId;
    return this;
  }

   /**
   * The Section Integration ID in which the enrollment is associated. This field is only included if the user has permission to view SIS information.
   * @return courseSectionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCourseSectionId() {
    return courseSectionId;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourseSectionId(Object courseSectionId) {
    this.courseSectionId = courseSectionId;
  }


  public Enrollments gradePublishingStatus(Object gradePublishingStatus) {
    
    this.gradePublishingStatus = gradePublishingStatus;
    return this;
  }

   /**
   * Used internally with grade passback functionality.
   * @return gradePublishingStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADE_PUBLISHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGradePublishingStatus() {
    return gradePublishingStatus;
  }


  @JsonProperty(JSON_PROPERTY_GRADE_PUBLISHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGradePublishingStatus(Object gradePublishingStatus) {
    this.gradePublishingStatus = gradePublishingStatus;
  }


  public Enrollments associatedUserId(Object associatedUserId) {
    this.associatedUserId = JsonNullable.<Object>of(associatedUserId);
    
    return this;
  }

   /**
   * The unique ID of the associated user. Will be NULL unless type is ObserverEnrollment.
   * @return associatedUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssociatedUserId() {
        return associatedUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSOCIATED_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssociatedUserId_JsonNullable() {
    return associatedUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_USER_ID)
  public void setAssociatedUserId_JsonNullable(JsonNullable<Object> associatedUserId) {
    this.associatedUserId = associatedUserId;
  }

  public void setAssociatedUserId(Object associatedUserId) {
    this.associatedUserId = JsonNullable.<Object>of(associatedUserId);
  }


  public Enrollments selfEnrolled(Object selfEnrolled) {
    this.selfEnrolled = JsonNullable.<Object>of(selfEnrolled);
    
    return this;
  }

   /**
   * Enrollment was created via self-enrollment.
   * @return selfEnrolled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSelfEnrolled() {
        return selfEnrolled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELF_ENROLLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSelfEnrolled_JsonNullable() {
    return selfEnrolled;
  }
  
  @JsonProperty(JSON_PROPERTY_SELF_ENROLLED)
  public void setSelfEnrolled_JsonNullable(JsonNullable<Object> selfEnrolled) {
    this.selfEnrolled = selfEnrolled;
  }

  public void setSelfEnrolled(Object selfEnrolled) {
    this.selfEnrolled = JsonNullable.<Object>of(selfEnrolled);
  }


  public Enrollments limitPrivilegesToCourseSection(Object limitPrivilegesToCourseSection) {
    
    this.limitPrivilegesToCourseSection = limitPrivilegesToCourseSection;
    return this;
  }

   /**
   * User can only access his or her own course section.
   * @return limitPrivilegesToCourseSection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_PRIVILEGES_TO_COURSE_SECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getLimitPrivilegesToCourseSection() {
    return limitPrivilegesToCourseSection;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_PRIVILEGES_TO_COURSE_SECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimitPrivilegesToCourseSection(Object limitPrivilegesToCourseSection) {
    this.limitPrivilegesToCourseSection = limitPrivilegesToCourseSection;
  }


  public Enrollments lastActivityAt(Object lastActivityAt) {
    this.lastActivityAt = JsonNullable.<Object>of(lastActivityAt);
    
    return this;
  }

   /**
   * The last activity time of the user for the enrollment. This time stamp updates when a user navigates through the course using the Course Navigation menu, replies to a discussion or submits an assignment or quiz, and when they access course files and pages (does not include mobile interactions or group participation).
   * @return lastActivityAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastActivityAt() {
        return lastActivityAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastActivityAt_JsonNullable() {
    return lastActivityAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_AT)
  public void setLastActivityAt_JsonNullable(JsonNullable<Object> lastActivityAt) {
    this.lastActivityAt = lastActivityAt;
  }

  public void setLastActivityAt(Object lastActivityAt) {
    this.lastActivityAt = JsonNullable.<Object>of(lastActivityAt);
  }


  public Enrollments totalActivityTime(Object totalActivityTime) {
    this.totalActivityTime = JsonNullable.<Object>of(totalActivityTime);
    
    return this;
  }

   /**
   * The total activity time of the user for the enrollment, in seconds. If user is viewing a page and is enrolled in that particular course, then the time is incremented. Requires at least 2 minutes, but not more than 10 (for ex: if a student just checks their grade or due date and was on the page for less than 2 min, it doesn&#39;t get counted). May not be incremented for page views through mobile app (will get incremented for page views through mobile browser); does not include group activity or page views for videos that do not include intermediate page requests, such as a half-hour recorded lecture.
   * @return totalActivityTime
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTotalActivityTime() {
        return totalActivityTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_ACTIVITY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTotalActivityTime_JsonNullable() {
    return totalActivityTime;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_ACTIVITY_TIME)
  public void setTotalActivityTime_JsonNullable(JsonNullable<Object> totalActivityTime) {
    this.totalActivityTime = totalActivityTime;
  }

  public void setTotalActivityTime(Object totalActivityTime) {
    this.totalActivityTime = JsonNullable.<Object>of(totalActivityTime);
  }


  public Enrollments sisPseudonymId(Object sisPseudonymId) {
    this.sisPseudonymId = JsonNullable.<Object>of(sisPseudonymId);
    
    return this;
  }

   /**
   * If enrolled via SIS import, which pseudonym was referenced to create this enrollment. It&#39;s the user ID that was referenced when an enrollment was created via SIS. it&#39;s used for some LTI calls to try and send consistent IDs. also used for splitting accidentally-merged-users to decide which way the enrollments should go.
   * @return sisPseudonymId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSisPseudonymId() {
        return sisPseudonymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIS_PSEUDONYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSisPseudonymId_JsonNullable() {
    return sisPseudonymId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIS_PSEUDONYM_ID)
  public void setSisPseudonymId_JsonNullable(JsonNullable<Object> sisPseudonymId) {
    this.sisPseudonymId = sisPseudonymId;
  }

  public void setSisPseudonymId(Object sisPseudonymId) {
    this.sisPseudonymId = JsonNullable.<Object>of(sisPseudonymId);
  }


  public Enrollments lastAttendedAt(Object lastAttendedAt) {
    this.lastAttendedAt = JsonNullable.<Object>of(lastAttendedAt);
    
    return this;
  }

   /**
   * The last attended date of the user for the enrollment in a course. The UI facing field that could be set by an end user or API call.
   * @return lastAttendedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastAttendedAt() {
        return lastAttendedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ATTENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastAttendedAt_JsonNullable() {
    return lastAttendedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_ATTENDED_AT)
  public void setLastAttendedAt_JsonNullable(JsonNullable<Object> lastAttendedAt) {
    this.lastAttendedAt = lastAttendedAt;
  }

  public void setLastAttendedAt(Object lastAttendedAt) {
    this.lastAttendedAt = JsonNullable.<Object>of(lastAttendedAt);
  }


  public Enrollments type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The base enrollment type.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrollments enrollments = (Enrollments) o;
    return Objects.equals(this.id, enrollments.id) &&
        equalsNullable(this.sisBatchId, enrollments.sisBatchId) &&
        Objects.equals(this.userId, enrollments.userId) &&
        Objects.equals(this.createdAt, enrollments.createdAt) &&
        Objects.equals(this.updatedAt, enrollments.updatedAt) &&
        Objects.equals(this.workflowState, enrollments.workflowState) &&
        Objects.equals(this.roleId, enrollments.roleId) &&
        equalsNullable(this.startAt, enrollments.startAt) &&
        equalsNullable(this.endAt, enrollments.endAt) &&
        Objects.equals(this.courseId, enrollments.courseId) &&
        equalsNullable(this.completedAt, enrollments.completedAt) &&
        Objects.equals(this.courseSectionId, enrollments.courseSectionId) &&
        Objects.equals(this.gradePublishingStatus, enrollments.gradePublishingStatus) &&
        equalsNullable(this.associatedUserId, enrollments.associatedUserId) &&
        equalsNullable(this.selfEnrolled, enrollments.selfEnrolled) &&
        Objects.equals(this.limitPrivilegesToCourseSection, enrollments.limitPrivilegesToCourseSection) &&
        equalsNullable(this.lastActivityAt, enrollments.lastActivityAt) &&
        equalsNullable(this.totalActivityTime, enrollments.totalActivityTime) &&
        equalsNullable(this.sisPseudonymId, enrollments.sisPseudonymId) &&
        equalsNullable(this.lastAttendedAt, enrollments.lastAttendedAt) &&
        Objects.equals(this.type, enrollments.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(sisBatchId), userId, createdAt, updatedAt, workflowState, roleId, hashCodeNullable(startAt), hashCodeNullable(endAt), courseId, hashCodeNullable(completedAt), courseSectionId, gradePublishingStatus, hashCodeNullable(associatedUserId), hashCodeNullable(selfEnrolled), limitPrivilegesToCourseSection, hashCodeNullable(lastActivityAt), hashCodeNullable(totalActivityTime), hashCodeNullable(sisPseudonymId), hashCodeNullable(lastAttendedAt), type);
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
    sb.append("class Enrollments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sisBatchId: ").append(toIndentedString(sisBatchId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    courseSectionId: ").append(toIndentedString(courseSectionId)).append("\n");
    sb.append("    gradePublishingStatus: ").append(toIndentedString(gradePublishingStatus)).append("\n");
    sb.append("    associatedUserId: ").append(toIndentedString(associatedUserId)).append("\n");
    sb.append("    selfEnrolled: ").append(toIndentedString(selfEnrolled)).append("\n");
    sb.append("    limitPrivilegesToCourseSection: ").append(toIndentedString(limitPrivilegesToCourseSection)).append("\n");
    sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
    sb.append("    totalActivityTime: ").append(toIndentedString(totalActivityTime)).append("\n");
    sb.append("    sisPseudonymId: ").append(toIndentedString(sisPseudonymId)).append("\n");
    sb.append("    lastAttendedAt: ").append(toIndentedString(lastAttendedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

