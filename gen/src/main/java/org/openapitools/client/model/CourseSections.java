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
 * Sections are a group of students that have been organized for administrative purposes.  When users are enrolled in a course, they are actually enrolled in one of the sections of that course. It is possible to place more than one section in course, but it is not possible to put sections within sections. All sections of a course share the same content. If a course is taught by one instructor, sections can remain under one course. However, if each section is taught by a different instructor, those sections will need to be housed under separate courses. Each section can have its own varied due dates for assignments, quizzes, and discussions. For example, a course may have sections that meet on different days of the week or in different formats (online vs. face-to-face). Sections are also beneficial when Teacher Assistants are assigned to help manage courses and oversee grading for a portion of a course enrollment. As part of SIS or manual enrollments, you can limit students to only see students in their section. Instructors can also limit students if you allow them to manually enroll users in their own courses.
 */
@JsonPropertyOrder({
  CourseSections.JSON_PROPERTY_ID,
  CourseSections.JSON_PROPERTY_NAME,
  CourseSections.JSON_PROPERTY_COURSE_ID,
  CourseSections.JSON_PROPERTY_INTEGRATION_ID,
  CourseSections.JSON_PROPERTY_CREATED_AT,
  CourseSections.JSON_PROPERTY_UPDATED_AT,
  CourseSections.JSON_PROPERTY_WORKFLOW_STATE,
  CourseSections.JSON_PROPERTY_SIS_BATCH_ID,
  CourseSections.JSON_PROPERTY_START_AT,
  CourseSections.JSON_PROPERTY_END_AT,
  CourseSections.JSON_PROPERTY_SIS_SOURCE_ID,
  CourseSections.JSON_PROPERTY_DEFAULT_SECTION,
  CourseSections.JSON_PROPERTY_ACCEPTING_ENROLLMENTS,
  CourseSections.JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_SECTION_DATES,
  CourseSections.JSON_PROPERTY_NONXLIST_COURSE_ID,
  CourseSections.JSON_PROPERTY_ENROLLMENT_TERM_ID
})
@JsonTypeName("course_sections")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CourseSections {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private Object name = null;

  public static final String JSON_PROPERTY_COURSE_ID = "course_id";
  private Object courseId = null;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private JsonNullable<Object> integrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the section.
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

  public static final String JSON_PROPERTY_SIS_BATCH_ID = "sis_batch_id";
  private JsonNullable<Object> sisBatchId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private JsonNullable<Object> startAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private JsonNullable<Object> endAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_SOURCE_ID = "sis_source_id";
  private JsonNullable<Object> sisSourceId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_SECTION = "default_section";
  private JsonNullable<Object> defaultSection = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ACCEPTING_ENROLLMENTS = "accepting_enrollments";
  private JsonNullable<Object> acceptingEnrollments = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_SECTION_DATES = "restrict_enrollments_to_section_dates";
  private JsonNullable<Object> restrictEnrollmentsToSectionDates = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NONXLIST_COURSE_ID = "nonxlist_course_id";
  private JsonNullable<Object> nonxlistCourseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ENROLLMENT_TERM_ID = "enrollment_term_id";
  private JsonNullable<Object> enrollmentTermId = JsonNullable.<Object>of(null);

  public CourseSections() {
  }

  public CourseSections id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the section.
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


  public CourseSections name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the section.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(Object name) {
    this.name = name;
  }


  public CourseSections courseId(Object courseId) {
    
    this.courseId = courseId;
    return this;
  }

   /**
   * The unique Canvas identifier for the course in which the section belongs.
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


  public CourseSections integrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
    
    return this;
  }

   /**
   * The integration ID of the section. This field is only included if there is an integration set up between Canvas and SIS.
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


  public CourseSections createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp for when this section was entered into the system.
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


  public CourseSections updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp for when the last time the section was updated.
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


  public CourseSections workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the section.
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


  public CourseSections sisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
    
    return this;
  }

   /**
   * The unique identifier for the SIS import if created through SIS.
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


  public CourseSections startAt(Object startAt) {
    this.startAt = JsonNullable.<Object>of(startAt);
    
    return this;
  }

   /**
   * The start date for the section, if applicable. When a user is allowed to participate in a course. enrollment term dates, course dates, and course section dates flow together in all aspects of Canvas. Various dates allow different users to participate in the course. The hierarchy of dates are: course section dates override course dates, course dates override term dates.
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


  public CourseSections endAt(Object endAt) {
    this.endAt = JsonNullable.<Object>of(endAt);
    
    return this;
  }

   /**
   * The end date for the section, if applicable. When a user is allowed to participate in a course.
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


  public CourseSections sisSourceId(Object sisSourceId) {
    this.sisSourceId = JsonNullable.<Object>of(sisSourceId);
    
    return this;
  }

   /**
   * Id for the correlated record for the section in the SIS (assuming SIS integration has been properly configured).
   * @return sisSourceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSisSourceId() {
        return sisSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIS_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSisSourceId_JsonNullable() {
    return sisSourceId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIS_SOURCE_ID)
  public void setSisSourceId_JsonNullable(JsonNullable<Object> sisSourceId) {
    this.sisSourceId = sisSourceId;
  }

  public void setSisSourceId(Object sisSourceId) {
    this.sisSourceId = JsonNullable.<Object>of(sisSourceId);
  }


  public CourseSections defaultSection(Object defaultSection) {
    this.defaultSection = JsonNullable.<Object>of(defaultSection);
    
    return this;
  }

   /**
   * True if this is the default section.
   * @return defaultSection
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultSection() {
        return defaultSection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_SECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultSection_JsonNullable() {
    return defaultSection;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SECTION)
  public void setDefaultSection_JsonNullable(JsonNullable<Object> defaultSection) {
    this.defaultSection = defaultSection;
  }

  public void setDefaultSection(Object defaultSection) {
    this.defaultSection = JsonNullable.<Object>of(defaultSection);
  }


  public CourseSections acceptingEnrollments(Object acceptingEnrollments) {
    this.acceptingEnrollments = JsonNullable.<Object>of(acceptingEnrollments);
    
    return this;
  }

   /**
   * True if this section is open for enrollment.
   * @return acceptingEnrollments
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAcceptingEnrollments() {
        return acceptingEnrollments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCEPTING_ENROLLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAcceptingEnrollments_JsonNullable() {
    return acceptingEnrollments;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCEPTING_ENROLLMENTS)
  public void setAcceptingEnrollments_JsonNullable(JsonNullable<Object> acceptingEnrollments) {
    this.acceptingEnrollments = acceptingEnrollments;
  }

  public void setAcceptingEnrollments(Object acceptingEnrollments) {
    this.acceptingEnrollments = JsonNullable.<Object>of(acceptingEnrollments);
  }


  public CourseSections restrictEnrollmentsToSectionDates(Object restrictEnrollmentsToSectionDates) {
    this.restrictEnrollmentsToSectionDates = JsonNullable.<Object>of(restrictEnrollmentsToSectionDates);
    
    return this;
  }

   /**
   * Restrict user enrollments to the start and end dates of the section. True when \&quot;Users can only participate in the course between these dates\&quot; is checked.
   * @return restrictEnrollmentsToSectionDates
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRestrictEnrollmentsToSectionDates() {
        return restrictEnrollmentsToSectionDates.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_SECTION_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRestrictEnrollmentsToSectionDates_JsonNullable() {
    return restrictEnrollmentsToSectionDates;
  }
  
  @JsonProperty(JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_SECTION_DATES)
  public void setRestrictEnrollmentsToSectionDates_JsonNullable(JsonNullable<Object> restrictEnrollmentsToSectionDates) {
    this.restrictEnrollmentsToSectionDates = restrictEnrollmentsToSectionDates;
  }

  public void setRestrictEnrollmentsToSectionDates(Object restrictEnrollmentsToSectionDates) {
    this.restrictEnrollmentsToSectionDates = JsonNullable.<Object>of(restrictEnrollmentsToSectionDates);
  }


  public CourseSections nonxlistCourseId(Object nonxlistCourseId) {
    this.nonxlistCourseId = JsonNullable.<Object>of(nonxlistCourseId);
    
    return this;
  }

   /**
   * The unique identifier of the original course of a cross-listed section.
   * @return nonxlistCourseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNonxlistCourseId() {
        return nonxlistCourseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NONXLIST_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNonxlistCourseId_JsonNullable() {
    return nonxlistCourseId;
  }
  
  @JsonProperty(JSON_PROPERTY_NONXLIST_COURSE_ID)
  public void setNonxlistCourseId_JsonNullable(JsonNullable<Object> nonxlistCourseId) {
    this.nonxlistCourseId = nonxlistCourseId;
  }

  public void setNonxlistCourseId(Object nonxlistCourseId) {
    this.nonxlistCourseId = JsonNullable.<Object>of(nonxlistCourseId);
  }


  public CourseSections enrollmentTermId(Object enrollmentTermId) {
    this.enrollmentTermId = JsonNullable.<Object>of(enrollmentTermId);
    
    return this;
  }

   /**
   * Identifies the associated enrollment term.
   * @return enrollmentTermId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEnrollmentTermId() {
        return enrollmentTermId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENROLLMENT_TERM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEnrollmentTermId_JsonNullable() {
    return enrollmentTermId;
  }
  
  @JsonProperty(JSON_PROPERTY_ENROLLMENT_TERM_ID)
  public void setEnrollmentTermId_JsonNullable(JsonNullable<Object> enrollmentTermId) {
    this.enrollmentTermId = enrollmentTermId;
  }

  public void setEnrollmentTermId(Object enrollmentTermId) {
    this.enrollmentTermId = JsonNullable.<Object>of(enrollmentTermId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseSections courseSections = (CourseSections) o;
    return Objects.equals(this.id, courseSections.id) &&
        Objects.equals(this.name, courseSections.name) &&
        Objects.equals(this.courseId, courseSections.courseId) &&
        equalsNullable(this.integrationId, courseSections.integrationId) &&
        Objects.equals(this.createdAt, courseSections.createdAt) &&
        Objects.equals(this.updatedAt, courseSections.updatedAt) &&
        Objects.equals(this.workflowState, courseSections.workflowState) &&
        equalsNullable(this.sisBatchId, courseSections.sisBatchId) &&
        equalsNullable(this.startAt, courseSections.startAt) &&
        equalsNullable(this.endAt, courseSections.endAt) &&
        equalsNullable(this.sisSourceId, courseSections.sisSourceId) &&
        equalsNullable(this.defaultSection, courseSections.defaultSection) &&
        equalsNullable(this.acceptingEnrollments, courseSections.acceptingEnrollments) &&
        equalsNullable(this.restrictEnrollmentsToSectionDates, courseSections.restrictEnrollmentsToSectionDates) &&
        equalsNullable(this.nonxlistCourseId, courseSections.nonxlistCourseId) &&
        equalsNullable(this.enrollmentTermId, courseSections.enrollmentTermId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, courseId, hashCodeNullable(integrationId), createdAt, updatedAt, workflowState, hashCodeNullable(sisBatchId), hashCodeNullable(startAt), hashCodeNullable(endAt), hashCodeNullable(sisSourceId), hashCodeNullable(defaultSection), hashCodeNullable(acceptingEnrollments), hashCodeNullable(restrictEnrollmentsToSectionDates), hashCodeNullable(nonxlistCourseId), hashCodeNullable(enrollmentTermId));
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
    sb.append("class CourseSections {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    sisBatchId: ").append(toIndentedString(sisBatchId)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    sisSourceId: ").append(toIndentedString(sisSourceId)).append("\n");
    sb.append("    defaultSection: ").append(toIndentedString(defaultSection)).append("\n");
    sb.append("    acceptingEnrollments: ").append(toIndentedString(acceptingEnrollments)).append("\n");
    sb.append("    restrictEnrollmentsToSectionDates: ").append(toIndentedString(restrictEnrollmentsToSectionDates)).append("\n");
    sb.append("    nonxlistCourseId: ").append(toIndentedString(nonxlistCourseId)).append("\n");
    sb.append("    enrollmentTermId: ").append(toIndentedString(enrollmentTermId)).append("\n");
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

