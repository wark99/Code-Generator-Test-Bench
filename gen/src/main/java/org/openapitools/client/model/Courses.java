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
import org.openapitools.client.model.CoursesPublicDescription;
import org.openapitools.client.model.CoursesSyllabusBody;
import org.openapitools.client.model.CoursesTurnitinComments;
import org.openapitools.client.model.TypeExtractedFromColumnCoursesSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Courses
 */
@JsonPropertyOrder({
  Courses.JSON_PROPERTY_ID,
  Courses.JSON_PROPERTY_STORAGE_QUOTA,
  Courses.JSON_PROPERTY_INTEGRATION_ID,
  Courses.JSON_PROPERTY_LTI_CONTEXT_ID,
  Courses.JSON_PROPERTY_SIS_BATCH_ID,
  Courses.JSON_PROPERTY_CREATED_AT,
  Courses.JSON_PROPERTY_UPDATED_AT,
  Courses.JSON_PROPERTY_WORKFLOW_STATE,
  Courses.JSON_PROPERTY_ACCOUNT_ID,
  Courses.JSON_PROPERTY_GRADING_STANDARD_ID,
  Courses.JSON_PROPERTY_START_AT,
  Courses.JSON_PROPERTY_SIS_SOURCE_ID,
  Courses.JSON_PROPERTY_GROUP_WEIGHTING_SCHEME,
  Courses.JSON_PROPERTY_CONCLUDE_AT,
  Courses.JSON_PROPERTY_IS_PUBLIC,
  Courses.JSON_PROPERTY_ALLOW_STUDENT_WIKI_EDITS,
  Courses.JSON_PROPERTY_SYLLABUS_BODY,
  Courses.JSON_PROPERTY_DEFAULT_WIKI_EDITING_ROLES,
  Courses.JSON_PROPERTY_WIKI_ID,
  Courses.JSON_PROPERTY_ALLOW_STUDENT_ORGANIZED_GROUPS,
  Courses.JSON_PROPERTY_COURSE_CODE,
  Courses.JSON_PROPERTY_DEFAULT_VIEW,
  Courses.JSON_PROPERTY_ABSTRACT_COURSE_ID,
  Courses.JSON_PROPERTY_ENROLLMENT_TERM_ID,
  Courses.JSON_PROPERTY_OPEN_ENROLLMENT,
  Courses.JSON_PROPERTY_TAB_CONFIGURATION,
  Courses.JSON_PROPERTY_TURNITIN_COMMENTS,
  Courses.JSON_PROPERTY_SELF_ENROLLMENT,
  Courses.JSON_PROPERTY_LICENSE,
  Courses.JSON_PROPERTY_INDEXED,
  Courses.JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_COURSE_DATES,
  Courses.JSON_PROPERTY_TEMPLATE_COURSE_ID,
  Courses.JSON_PROPERTY_REPLACEMENT_COURSE_ID,
  Courses.JSON_PROPERTY_PUBLIC_DESCRIPTION,
  Courses.JSON_PROPERTY_SELF_ENROLLMENT_CODE,
  Courses.JSON_PROPERTY_SELF_ENROLLMENT_LIMIT,
  Courses.JSON_PROPERTY_TURNITIN_ID,
  Courses.JSON_PROPERTY_SHOW_ANNOUNCEMENTS_ON_HOME_PAGE,
  Courses.JSON_PROPERTY_HOME_PAGE_ANNOUNCEMENT_LIMIT,
  Courses.JSON_PROPERTY_LATEST_OUTCOME_IMPORT_ID,
  Courses.JSON_PROPERTY_GRADE_PASSBACK_SETTING,
  Courses.JSON_PROPERTY_TEMPLATE,
  Courses.JSON_PROPERTY_HOMEROOM_COURSE,
  Courses.JSON_PROPERTY_SYNC_ENROLLMENTS_FROM_HOMEROOM,
  Courses.JSON_PROPERTY_HOMEROOM_COURSE_ID,
  Courses.JSON_PROPERTY_LOCALE,
  Courses.JSON_PROPERTY_NAME,
  Courses.JSON_PROPERTY_TIME_ZONE,
  Courses.JSON_PROPERTY_UUID,
  Courses.JSON_PROPERTY_SETTINGS
})
@JsonTypeName("courses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Courses {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_STORAGE_QUOTA = "storage_quota";
  private JsonNullable<Object> storageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private JsonNullable<Object> integrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LTI_CONTEXT_ID = "lti_context_id";
  private JsonNullable<Object> ltiContextId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_BATCH_ID = "sis_batch_id";
  private JsonNullable<Object> sisBatchId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Life-cycle state for the course.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    CREATED("created"),
    
    CLAIMED("claimed"),
    
    AVAILABLE("available"),
    
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

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private Object accountId = null;

  public static final String JSON_PROPERTY_GRADING_STANDARD_ID = "grading_standard_id";
  private JsonNullable<Object> gradingStandardId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private JsonNullable<Object> startAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIS_SOURCE_ID = "sis_source_id";
  private JsonNullable<Object> sisSourceId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_WEIGHTING_SCHEME = "group_weighting_scheme";
  private JsonNullable<Object> groupWeightingScheme = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONCLUDE_AT = "conclude_at";
  private JsonNullable<Object> concludeAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  private JsonNullable<Object> isPublic = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALLOW_STUDENT_WIKI_EDITS = "allow_student_wiki_edits";
  private JsonNullable<Object> allowStudentWikiEdits = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SYLLABUS_BODY = "syllabus_body";
  private CoursesSyllabusBody syllabusBody;

  public static final String JSON_PROPERTY_DEFAULT_WIKI_EDITING_ROLES = "default_wiki_editing_roles";
  private JsonNullable<Object> defaultWikiEditingRoles = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WIKI_ID = "wiki_id";
  private JsonNullable<Object> wikiId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALLOW_STUDENT_ORGANIZED_GROUPS = "allow_student_organized_groups";
  private Object allowStudentOrganizedGroups = null;

  public static final String JSON_PROPERTY_COURSE_CODE = "course_code";
  private JsonNullable<Object> courseCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_VIEW = "default_view";
  private JsonNullable<Object> defaultView = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ABSTRACT_COURSE_ID = "abstract_course_id";
  private JsonNullable<Object> abstractCourseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ENROLLMENT_TERM_ID = "enrollment_term_id";
  private Object enrollmentTermId = null;

  public static final String JSON_PROPERTY_OPEN_ENROLLMENT = "open_enrollment";
  private JsonNullable<Object> openEnrollment = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TAB_CONFIGURATION = "tab_configuration";
  private JsonNullable<Object> tabConfiguration = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TURNITIN_COMMENTS = "turnitin_comments";
  private CoursesTurnitinComments turnitinComments;

  public static final String JSON_PROPERTY_SELF_ENROLLMENT = "self_enrollment";
  private JsonNullable<Object> selfEnrollment = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LICENSE = "license";
  private JsonNullable<Object> license = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INDEXED = "indexed";
  private JsonNullable<Object> indexed = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_COURSE_DATES = "restrict_enrollments_to_course_dates";
  private JsonNullable<Object> restrictEnrollmentsToCourseDates = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEMPLATE_COURSE_ID = "template_course_id";
  private JsonNullable<Object> templateCourseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REPLACEMENT_COURSE_ID = "replacement_course_id";
  private JsonNullable<Object> replacementCourseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLIC_DESCRIPTION = "public_description";
  private CoursesPublicDescription publicDescription;

  public static final String JSON_PROPERTY_SELF_ENROLLMENT_CODE = "self_enrollment_code";
  private JsonNullable<Object> selfEnrollmentCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SELF_ENROLLMENT_LIMIT = "self_enrollment_limit";
  private JsonNullable<Object> selfEnrollmentLimit = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TURNITIN_ID = "turnitin_id";
  private JsonNullable<Object> turnitinId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SHOW_ANNOUNCEMENTS_ON_HOME_PAGE = "show_announcements_on_home_page";
  private JsonNullable<Object> showAnnouncementsOnHomePage = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HOME_PAGE_ANNOUNCEMENT_LIMIT = "home_page_announcement_limit";
  private JsonNullable<Object> homePageAnnouncementLimit = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LATEST_OUTCOME_IMPORT_ID = "latest_outcome_import_id";
  private JsonNullable<Object> latestOutcomeImportId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADE_PASSBACK_SETTING = "grade_passback_setting";
  private JsonNullable<Object> gradePassbackSetting = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Object template = null;

  public static final String JSON_PROPERTY_HOMEROOM_COURSE = "homeroom_course";
  private Object homeroomCourse = null;

  public static final String JSON_PROPERTY_SYNC_ENROLLMENTS_FROM_HOMEROOM = "sync_enrollments_from_homeroom";
  private Object syncEnrollmentsFromHomeroom = null;

  public static final String JSON_PROPERTY_HOMEROOM_COURSE_ID = "homeroom_course_id";
  private JsonNullable<Object> homeroomCourseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<Object> locale = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private JsonNullable<Object> timeZone = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UUID = "uuid";
  private JsonNullable<Object> uuid = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private TypeExtractedFromColumnCoursesSettings settings;

  public Courses() {
  }

  public Courses id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the course.
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


  public Courses storageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
    
    return this;
  }

   /**
   * The total amount of storage space (in bytes) allowed to be used by files in the course.
   * @return storageQuota
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStorageQuota() {
        return storageQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STORAGE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStorageQuota_JsonNullable() {
    return storageQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_STORAGE_QUOTA)
  public void setStorageQuota_JsonNullable(JsonNullable<Object> storageQuota) {
    this.storageQuota = storageQuota;
  }

  public void setStorageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
  }


  public Courses integrationId(Object integrationId) {
    this.integrationId = JsonNullable.<Object>of(integrationId);
    
    return this;
  }

   /**
   * the integration identifier for the course, if defined.
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


  public Courses ltiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
    
    return this;
  }

   /**
   * UUID of the Canvas context in LTI standard. secondary ID for this context, could be used in API to identify resource as well.
   * @return ltiContextId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLtiContextId() {
        return ltiContextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLtiContextId_JsonNullable() {
    return ltiContextId;
  }
  
  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  public void setLtiContextId_JsonNullable(JsonNullable<Object> ltiContextId) {
    this.ltiContextId = ltiContextId;
  }

  public void setLtiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
  }


  public Courses sisBatchId(Object sisBatchId) {
    this.sisBatchId = JsonNullable.<Object>of(sisBatchId);
    
    return this;
  }

   /**
   * The unique identifier for the SIS import.
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


  public Courses createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date the course was created.
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


  public Courses updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time the course was last updated.
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


  public Courses workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the course.
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


  public Courses accountId(Object accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Points to the account associated with the course.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Object accountId) {
    this.accountId = accountId;
  }


  public Courses gradingStandardId(Object gradingStandardId) {
    this.gradingStandardId = JsonNullable.<Object>of(gradingStandardId);
    
    return this;
  }

   /**
   * The grading standard associated with the course.
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


  public Courses startAt(Object startAt) {
    this.startAt = JsonNullable.<Object>of(startAt);
    
    return this;
  }

   /**
   * The start date for the course, if applicable. If NULL, then use &#x60;start_at&#x60; value from &#x60;enrollment_terms&#x60; table. Enrollment term dates, course dates, and course section dates flow together in all aspects of Canvas. Various dates allow different users to participate in the course. The hierarchy of dates are: course section dates override course dates, course dates override term dates.
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


  public Courses sisSourceId(Object sisSourceId) {
    this.sisSourceId = JsonNullable.<Object>of(sisSourceId);
    
    return this;
  }

   /**
   * The SIS identifier for the course, if defined.
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


  public Courses groupWeightingScheme(Object groupWeightingScheme) {
    this.groupWeightingScheme = JsonNullable.<Object>of(groupWeightingScheme);
    
    return this;
  }

   /**
   * Whether final grades will be weighted based on the &#x60;group_weight&#x60; value of assignment groups &#x60;percent&#x60; if weighted &#x60;equal&#x60; or NULL otherwise.
   * @return groupWeightingScheme
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGroupWeightingScheme() {
        return groupWeightingScheme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_WEIGHTING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGroupWeightingScheme_JsonNullable() {
    return groupWeightingScheme;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_WEIGHTING_SCHEME)
  public void setGroupWeightingScheme_JsonNullable(JsonNullable<Object> groupWeightingScheme) {
    this.groupWeightingScheme = groupWeightingScheme;
  }

  public void setGroupWeightingScheme(Object groupWeightingScheme) {
    this.groupWeightingScheme = JsonNullable.<Object>of(groupWeightingScheme);
  }


  public Courses concludeAt(Object concludeAt) {
    this.concludeAt = JsonNullable.<Object>of(concludeAt);
    
    return this;
  }

   /**
   * The end date for the course, if applicable. If NULL, then use &#x60;start_at&#x60; value from &#x60;enrollment_terms&#x60; table.
   * @return concludeAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConcludeAt() {
        return concludeAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONCLUDE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConcludeAt_JsonNullable() {
    return concludeAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONCLUDE_AT)
  public void setConcludeAt_JsonNullable(JsonNullable<Object> concludeAt) {
    this.concludeAt = concludeAt;
  }

  public void setConcludeAt(Object concludeAt) {
    this.concludeAt = JsonNullable.<Object>of(concludeAt);
  }


  public Courses isPublic(Object isPublic) {
    this.isPublic = JsonNullable.<Object>of(isPublic);
    
    return this;
  }

   /**
   * True if the course is publicly visible.
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIsPublic() {
        return isPublic.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIsPublic_JsonNullable() {
    return isPublic;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  public void setIsPublic_JsonNullable(JsonNullable<Object> isPublic) {
    this.isPublic = isPublic;
  }

  public void setIsPublic(Object isPublic) {
    this.isPublic = JsonNullable.<Object>of(isPublic);
  }


  public Courses allowStudentWikiEdits(Object allowStudentWikiEdits) {
    this.allowStudentWikiEdits = JsonNullable.<Object>of(allowStudentWikiEdits);
    
    return this;
  }

   /**
   * Whether Pages in the course can be created and are editable by students.
   * @return allowStudentWikiEdits
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowStudentWikiEdits() {
        return allowStudentWikiEdits.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_WIKI_EDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowStudentWikiEdits_JsonNullable() {
    return allowStudentWikiEdits;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_WIKI_EDITS)
  public void setAllowStudentWikiEdits_JsonNullable(JsonNullable<Object> allowStudentWikiEdits) {
    this.allowStudentWikiEdits = allowStudentWikiEdits;
  }

  public void setAllowStudentWikiEdits(Object allowStudentWikiEdits) {
    this.allowStudentWikiEdits = JsonNullable.<Object>of(allowStudentWikiEdits);
  }


  public Courses syllabusBody(CoursesSyllabusBody syllabusBody) {
    
    this.syllabusBody = syllabusBody;
    return this;
  }

   /**
   * Get syllabusBody
   * @return syllabusBody
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYLLABUS_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoursesSyllabusBody getSyllabusBody() {
    return syllabusBody;
  }


  @JsonProperty(JSON_PROPERTY_SYLLABUS_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyllabusBody(CoursesSyllabusBody syllabusBody) {
    this.syllabusBody = syllabusBody;
  }


  public Courses defaultWikiEditingRoles(Object defaultWikiEditingRoles) {
    this.defaultWikiEditingRoles = JsonNullable.<Object>of(defaultWikiEditingRoles);
    
    return this;
  }

   /**
   * Comma-separated list used as the default &#x60;editing_roles&#x60; value for new &#x60;wiki_pages&#x60; in the course.
   * @return defaultWikiEditingRoles
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultWikiEditingRoles() {
        return defaultWikiEditingRoles.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_WIKI_EDITING_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultWikiEditingRoles_JsonNullable() {
    return defaultWikiEditingRoles;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_WIKI_EDITING_ROLES)
  public void setDefaultWikiEditingRoles_JsonNullable(JsonNullable<Object> defaultWikiEditingRoles) {
    this.defaultWikiEditingRoles = defaultWikiEditingRoles;
  }

  public void setDefaultWikiEditingRoles(Object defaultWikiEditingRoles) {
    this.defaultWikiEditingRoles = JsonNullable.<Object>of(defaultWikiEditingRoles);
  }


  public Courses wikiId(Object wikiId) {
    this.wikiId = JsonNullable.<Object>of(wikiId);
    
    return this;
  }

   /**
   * Foreign key to the &#x60;wikis&#x60; dataset.
   * @return wikiId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWikiId() {
        return wikiId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIKI_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWikiId_JsonNullable() {
    return wikiId;
  }
  
  @JsonProperty(JSON_PROPERTY_WIKI_ID)
  public void setWikiId_JsonNullable(JsonNullable<Object> wikiId) {
    this.wikiId = wikiId;
  }

  public void setWikiId(Object wikiId) {
    this.wikiId = JsonNullable.<Object>of(wikiId);
  }


  public Courses allowStudentOrganizedGroups(Object allowStudentOrganizedGroups) {
    
    this.allowStudentOrganizedGroups = allowStudentOrganizedGroups;
    return this;
  }

   /**
   * Whether students are able to organize their own groups.
   * @return allowStudentOrganizedGroups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_ORGANIZED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAllowStudentOrganizedGroups() {
    return allowStudentOrganizedGroups;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_ORGANIZED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowStudentOrganizedGroups(Object allowStudentOrganizedGroups) {
    this.allowStudentOrganizedGroups = allowStudentOrganizedGroups;
  }


  public Courses courseCode(Object courseCode) {
    this.courseCode = JsonNullable.<Object>of(courseCode);
    
    return this;
  }

   /**
   * The course code.
   * @return courseCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseCode() {
        return courseCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseCode_JsonNullable() {
    return courseCode;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_CODE)
  public void setCourseCode_JsonNullable(JsonNullable<Object> courseCode) {
    this.courseCode = courseCode;
  }

  public void setCourseCode(Object courseCode) {
    this.courseCode = JsonNullable.<Object>of(courseCode);
  }


  public Courses defaultView(Object defaultView) {
    this.defaultView = JsonNullable.<Object>of(defaultView);
    
    return this;
  }

   /**
   * the type of page that users will see when they first visit the course - &#x60;feed&#x60;: Recent Activity Dashboard - &#x60;wiki&#x60;: Wiki Front Page - &#x60;modules&#x60;: Course Modules/Sections Page - &#x60;assignments&#x60;: Course Assignments List - &#x60;syllabus&#x60;: Course Syllabus Page other types may be added in the future.
   * @return defaultView
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultView() {
        return defaultView.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultView_JsonNullable() {
    return defaultView;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_VIEW)
  public void setDefaultView_JsonNullable(JsonNullable<Object> defaultView) {
    this.defaultView = defaultView;
  }

  public void setDefaultView(Object defaultView) {
    this.defaultView = JsonNullable.<Object>of(defaultView);
  }


  public Courses abstractCourseId(Object abstractCourseId) {
    this.abstractCourseId = JsonNullable.<Object>of(abstractCourseId);
    
    return this;
  }

   /**
   * Foreign key to the &#x60;abstract_courses&#x60; table.
   * @return abstractCourseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAbstractCourseId() {
        return abstractCourseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ABSTRACT_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAbstractCourseId_JsonNullable() {
    return abstractCourseId;
  }
  
  @JsonProperty(JSON_PROPERTY_ABSTRACT_COURSE_ID)
  public void setAbstractCourseId_JsonNullable(JsonNullable<Object> abstractCourseId) {
    this.abstractCourseId = abstractCourseId;
  }

  public void setAbstractCourseId(Object abstractCourseId) {
    this.abstractCourseId = JsonNullable.<Object>of(abstractCourseId);
  }


  public Courses enrollmentTermId(Object enrollmentTermId) {
    
    this.enrollmentTermId = enrollmentTermId;
    return this;
  }

   /**
   * The enrollment term associated with the course.
   * @return enrollmentTermId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENROLLMENT_TERM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getEnrollmentTermId() {
    return enrollmentTermId;
  }


  @JsonProperty(JSON_PROPERTY_ENROLLMENT_TERM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnrollmentTermId(Object enrollmentTermId) {
    this.enrollmentTermId = enrollmentTermId;
  }


  public Courses openEnrollment(Object openEnrollment) {
    this.openEnrollment = JsonNullable.<Object>of(openEnrollment);
    
    return this;
  }

   /**
   * Whether the course has enabled open enrollment.
   * @return openEnrollment
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOpenEnrollment() {
        return openEnrollment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPEN_ENROLLMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOpenEnrollment_JsonNullable() {
    return openEnrollment;
  }
  
  @JsonProperty(JSON_PROPERTY_OPEN_ENROLLMENT)
  public void setOpenEnrollment_JsonNullable(JsonNullable<Object> openEnrollment) {
    this.openEnrollment = openEnrollment;
  }

  public void setOpenEnrollment(Object openEnrollment) {
    this.openEnrollment = JsonNullable.<Object>of(openEnrollment);
  }


  public Courses tabConfiguration(Object tabConfiguration) {
    this.tabConfiguration = JsonNullable.<Object>of(tabConfiguration);
    
    return this;
  }

   /**
   * A YAML serialized list detailing the order and visibility status of tabs in the left-hand navigation for the course.
   * @return tabConfiguration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTabConfiguration() {
        return tabConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAB_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTabConfiguration_JsonNullable() {
    return tabConfiguration;
  }
  
  @JsonProperty(JSON_PROPERTY_TAB_CONFIGURATION)
  public void setTabConfiguration_JsonNullable(JsonNullable<Object> tabConfiguration) {
    this.tabConfiguration = tabConfiguration;
  }

  public void setTabConfiguration(Object tabConfiguration) {
    this.tabConfiguration = JsonNullable.<Object>of(tabConfiguration);
  }


  public Courses turnitinComments(CoursesTurnitinComments turnitinComments) {
    
    this.turnitinComments = turnitinComments;
    return this;
  }

   /**
   * Get turnitinComments
   * @return turnitinComments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TURNITIN_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoursesTurnitinComments getTurnitinComments() {
    return turnitinComments;
  }


  @JsonProperty(JSON_PROPERTY_TURNITIN_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTurnitinComments(CoursesTurnitinComments turnitinComments) {
    this.turnitinComments = turnitinComments;
  }


  public Courses selfEnrollment(Object selfEnrollment) {
    this.selfEnrollment = JsonNullable.<Object>of(selfEnrollment);
    
    return this;
  }

   /**
   * Whether the course has enabled self enrollment.
   * @return selfEnrollment
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSelfEnrollment() {
        return selfEnrollment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELF_ENROLLMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSelfEnrollment_JsonNullable() {
    return selfEnrollment;
  }
  
  @JsonProperty(JSON_PROPERTY_SELF_ENROLLMENT)
  public void setSelfEnrollment_JsonNullable(JsonNullable<Object> selfEnrollment) {
    this.selfEnrollment = selfEnrollment;
  }

  public void setSelfEnrollment(Object selfEnrollment) {
    this.selfEnrollment = JsonNullable.<Object>of(selfEnrollment);
  }


  public Courses license(Object license) {
    this.license = JsonNullable.<Object>of(license);
    
    return this;
  }

   /**
   * The default license for content in the course; &#x60;private&#x60;: Private (Copyrighted), &#x60;public_domain&#x60;: Public Domain, &#x60;cc_by&#x60;: CC Attribution, &#x60;cc_by_sa&#x60;: CC Attribution Share Alike, &#x60;cc_by_nc&#x60;: CC Attribution Noncommercial, &#x60;cc_by_nc_sa&#x60;: CC Attribution Noncommercial Share Alike, &#x60;cc_by_nd&#x60;: CC Attribution No Derivatives, &#x60;cc_by_nc_nd&#x60;: CC Attribution Noncommercial No Derivatives.
   * @return license
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLicense() {
        return license.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLicense_JsonNullable() {
    return license;
  }
  
  @JsonProperty(JSON_PROPERTY_LICENSE)
  public void setLicense_JsonNullable(JsonNullable<Object> license) {
    this.license = license;
  }

  public void setLicense(Object license) {
    this.license = JsonNullable.<Object>of(license);
  }


  public Courses indexed(Object indexed) {
    this.indexed = JsonNullable.<Object>of(indexed);
    
    return this;
  }

   /**
   * Whether the course is included in the public course index.
   * @return indexed
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIndexed() {
        return indexed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INDEXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIndexed_JsonNullable() {
    return indexed;
  }
  
  @JsonProperty(JSON_PROPERTY_INDEXED)
  public void setIndexed_JsonNullable(JsonNullable<Object> indexed) {
    this.indexed = indexed;
  }

  public void setIndexed(Object indexed) {
    this.indexed = JsonNullable.<Object>of(indexed);
  }


  public Courses restrictEnrollmentsToCourseDates(Object restrictEnrollmentsToCourseDates) {
    this.restrictEnrollmentsToCourseDates = JsonNullable.<Object>of(restrictEnrollmentsToCourseDates);
    
    return this;
  }

   /**
   * Whether the course&#39;s start and end dates will override dates from the term when determining user access.
   * @return restrictEnrollmentsToCourseDates
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRestrictEnrollmentsToCourseDates() {
        return restrictEnrollmentsToCourseDates.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_COURSE_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRestrictEnrollmentsToCourseDates_JsonNullable() {
    return restrictEnrollmentsToCourseDates;
  }
  
  @JsonProperty(JSON_PROPERTY_RESTRICT_ENROLLMENTS_TO_COURSE_DATES)
  public void setRestrictEnrollmentsToCourseDates_JsonNullable(JsonNullable<Object> restrictEnrollmentsToCourseDates) {
    this.restrictEnrollmentsToCourseDates = restrictEnrollmentsToCourseDates;
  }

  public void setRestrictEnrollmentsToCourseDates(Object restrictEnrollmentsToCourseDates) {
    this.restrictEnrollmentsToCourseDates = JsonNullable.<Object>of(restrictEnrollmentsToCourseDates);
  }


  public Courses templateCourseId(Object templateCourseId) {
    this.templateCourseId = JsonNullable.<Object>of(templateCourseId);
    
    return this;
  }

   /**
   * If set, this course was originally created via SIS when a section was marked to be cross listed to a non-existent course, using attributes from the original section&#39;s course and setting that course ID here.
   * @return templateCourseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTemplateCourseId() {
        return templateCourseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTemplateCourseId_JsonNullable() {
    return templateCourseId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_COURSE_ID)
  public void setTemplateCourseId_JsonNullable(JsonNullable<Object> templateCourseId) {
    this.templateCourseId = templateCourseId;
  }

  public void setTemplateCourseId(Object templateCourseId) {
    this.templateCourseId = JsonNullable.<Object>of(templateCourseId);
  }


  public Courses replacementCourseId(Object replacementCourseId) {
    this.replacementCourseId = JsonNullable.<Object>of(replacementCourseId);
    
    return this;
  }

   /**
   * The ID of the course created to replace this one when it had its content reset.
   * @return replacementCourseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getReplacementCourseId() {
        return replacementCourseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPLACEMENT_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getReplacementCourseId_JsonNullable() {
    return replacementCourseId;
  }
  
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_COURSE_ID)
  public void setReplacementCourseId_JsonNullable(JsonNullable<Object> replacementCourseId) {
    this.replacementCourseId = replacementCourseId;
  }

  public void setReplacementCourseId(Object replacementCourseId) {
    this.replacementCourseId = JsonNullable.<Object>of(replacementCourseId);
  }


  public Courses publicDescription(CoursesPublicDescription publicDescription) {
    
    this.publicDescription = publicDescription;
    return this;
  }

   /**
   * Get publicDescription
   * @return publicDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoursesPublicDescription getPublicDescription() {
    return publicDescription;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicDescription(CoursesPublicDescription publicDescription) {
    this.publicDescription = publicDescription;
  }


  public Courses selfEnrollmentCode(Object selfEnrollmentCode) {
    this.selfEnrollmentCode = JsonNullable.<Object>of(selfEnrollmentCode);
    
    return this;
  }

   /**
   * The alpha-numeric code students can use to enroll in the course through self enrollment.
   * @return selfEnrollmentCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSelfEnrollmentCode() {
        return selfEnrollmentCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELF_ENROLLMENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSelfEnrollmentCode_JsonNullable() {
    return selfEnrollmentCode;
  }
  
  @JsonProperty(JSON_PROPERTY_SELF_ENROLLMENT_CODE)
  public void setSelfEnrollmentCode_JsonNullable(JsonNullable<Object> selfEnrollmentCode) {
    this.selfEnrollmentCode = selfEnrollmentCode;
  }

  public void setSelfEnrollmentCode(Object selfEnrollmentCode) {
    this.selfEnrollmentCode = JsonNullable.<Object>of(selfEnrollmentCode);
  }


  public Courses selfEnrollmentLimit(Object selfEnrollmentLimit) {
    this.selfEnrollmentLimit = JsonNullable.<Object>of(selfEnrollmentLimit);
    
    return this;
  }

   /**
   * The number of students that can enroll in the course through self enrollment.
   * @return selfEnrollmentLimit
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSelfEnrollmentLimit() {
        return selfEnrollmentLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELF_ENROLLMENT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSelfEnrollmentLimit_JsonNullable() {
    return selfEnrollmentLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_SELF_ENROLLMENT_LIMIT)
  public void setSelfEnrollmentLimit_JsonNullable(JsonNullable<Object> selfEnrollmentLimit) {
    this.selfEnrollmentLimit = selfEnrollmentLimit;
  }

  public void setSelfEnrollmentLimit(Object selfEnrollmentLimit) {
    this.selfEnrollmentLimit = JsonNullable.<Object>of(selfEnrollmentLimit);
  }


  public Courses turnitinId(Object turnitinId) {
    this.turnitinId = JsonNullable.<Object>of(turnitinId);
    
    return this;
  }

   /**
   * A unique identifier for use with Turnitin.
   * @return turnitinId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTurnitinId() {
        return turnitinId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TURNITIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTurnitinId_JsonNullable() {
    return turnitinId;
  }
  
  @JsonProperty(JSON_PROPERTY_TURNITIN_ID)
  public void setTurnitinId_JsonNullable(JsonNullable<Object> turnitinId) {
    this.turnitinId = turnitinId;
  }

  public void setTurnitinId(Object turnitinId) {
    this.turnitinId = JsonNullable.<Object>of(turnitinId);
  }


  public Courses showAnnouncementsOnHomePage(Object showAnnouncementsOnHomePage) {
    this.showAnnouncementsOnHomePage = JsonNullable.<Object>of(showAnnouncementsOnHomePage);
    
    return this;
  }

   /**
   * Whether announcements will be shown on the course home page.
   * @return showAnnouncementsOnHomePage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getShowAnnouncementsOnHomePage() {
        return showAnnouncementsOnHomePage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOW_ANNOUNCEMENTS_ON_HOME_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getShowAnnouncementsOnHomePage_JsonNullable() {
    return showAnnouncementsOnHomePage;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOW_ANNOUNCEMENTS_ON_HOME_PAGE)
  public void setShowAnnouncementsOnHomePage_JsonNullable(JsonNullable<Object> showAnnouncementsOnHomePage) {
    this.showAnnouncementsOnHomePage = showAnnouncementsOnHomePage;
  }

  public void setShowAnnouncementsOnHomePage(Object showAnnouncementsOnHomePage) {
    this.showAnnouncementsOnHomePage = JsonNullable.<Object>of(showAnnouncementsOnHomePage);
  }


  public Courses homePageAnnouncementLimit(Object homePageAnnouncementLimit) {
    this.homePageAnnouncementLimit = JsonNullable.<Object>of(homePageAnnouncementLimit);
    
    return this;
  }

   /**
   * The maximum number of announcements to show on the course home page.
   * @return homePageAnnouncementLimit
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHomePageAnnouncementLimit() {
        return homePageAnnouncementLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOME_PAGE_ANNOUNCEMENT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHomePageAnnouncementLimit_JsonNullable() {
    return homePageAnnouncementLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_HOME_PAGE_ANNOUNCEMENT_LIMIT)
  public void setHomePageAnnouncementLimit_JsonNullable(JsonNullable<Object> homePageAnnouncementLimit) {
    this.homePageAnnouncementLimit = homePageAnnouncementLimit;
  }

  public void setHomePageAnnouncementLimit(Object homePageAnnouncementLimit) {
    this.homePageAnnouncementLimit = JsonNullable.<Object>of(homePageAnnouncementLimit);
  }


  public Courses latestOutcomeImportId(Object latestOutcomeImportId) {
    this.latestOutcomeImportId = JsonNullable.<Object>of(latestOutcomeImportId);
    
    return this;
  }

   /**
   * The ID of the most recent Outcome Import for the course.
   * @return latestOutcomeImportId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLatestOutcomeImportId() {
        return latestOutcomeImportId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LATEST_OUTCOME_IMPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLatestOutcomeImportId_JsonNullable() {
    return latestOutcomeImportId;
  }
  
  @JsonProperty(JSON_PROPERTY_LATEST_OUTCOME_IMPORT_ID)
  public void setLatestOutcomeImportId_JsonNullable(JsonNullable<Object> latestOutcomeImportId) {
    this.latestOutcomeImportId = latestOutcomeImportId;
  }

  public void setLatestOutcomeImportId(Object latestOutcomeImportId) {
    this.latestOutcomeImportId = JsonNullable.<Object>of(latestOutcomeImportId);
  }


  public Courses gradePassbackSetting(Object gradePassbackSetting) {
    this.gradePassbackSetting = JsonNullable.<Object>of(gradePassbackSetting);
    
    return this;
  }

   /**
   * The grade_passback_setting set on the course.
   * @return gradePassbackSetting
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradePassbackSetting() {
        return gradePassbackSetting.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADE_PASSBACK_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradePassbackSetting_JsonNullable() {
    return gradePassbackSetting;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADE_PASSBACK_SETTING)
  public void setGradePassbackSetting_JsonNullable(JsonNullable<Object> gradePassbackSetting) {
    this.gradePassbackSetting = gradePassbackSetting;
  }

  public void setGradePassbackSetting(Object gradePassbackSetting) {
    this.gradePassbackSetting = JsonNullable.<Object>of(gradePassbackSetting);
  }


  public Courses template(Object template) {
    
    this.template = template;
    return this;
  }

   /**
   * Course is marked as a template for accounts to use.
   * @return template
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplate(Object template) {
    this.template = template;
  }


  public Courses homeroomCourse(Object homeroomCourse) {
    
    this.homeroomCourse = homeroomCourse;
    return this;
  }

   /**
   * Course is marked as a homeroom course.
   * @return homeroomCourse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOMEROOM_COURSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHomeroomCourse() {
    return homeroomCourse;
  }


  @JsonProperty(JSON_PROPERTY_HOMEROOM_COURSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHomeroomCourse(Object homeroomCourse) {
    this.homeroomCourse = homeroomCourse;
  }


  public Courses syncEnrollmentsFromHomeroom(Object syncEnrollmentsFromHomeroom) {
    
    this.syncEnrollmentsFromHomeroom = syncEnrollmentsFromHomeroom;
    return this;
  }

   /**
   * Enrollments for this course will be synced from the associated homeroom.
   * @return syncEnrollmentsFromHomeroom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_ENROLLMENTS_FROM_HOMEROOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSyncEnrollmentsFromHomeroom() {
    return syncEnrollmentsFromHomeroom;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_ENROLLMENTS_FROM_HOMEROOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSyncEnrollmentsFromHomeroom(Object syncEnrollmentsFromHomeroom) {
    this.syncEnrollmentsFromHomeroom = syncEnrollmentsFromHomeroom;
  }


  public Courses homeroomCourseId(Object homeroomCourseId) {
    this.homeroomCourseId = JsonNullable.<Object>of(homeroomCourseId);
    
    return this;
  }

   /**
   * Points to the homeroom course from which this course receives its enrollments.
   * @return homeroomCourseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHomeroomCourseId() {
        return homeroomCourseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOMEROOM_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHomeroomCourseId_JsonNullable() {
    return homeroomCourseId;
  }
  
  @JsonProperty(JSON_PROPERTY_HOMEROOM_COURSE_ID)
  public void setHomeroomCourseId_JsonNullable(JsonNullable<Object> homeroomCourseId) {
    this.homeroomCourseId = homeroomCourseId;
  }

  public void setHomeroomCourseId(Object homeroomCourseId) {
    this.homeroomCourseId = JsonNullable.<Object>of(homeroomCourseId);
  }


  public Courses locale(Object locale) {
    this.locale = JsonNullable.<Object>of(locale);
    
    return this;
  }

   /**
   * The course-set locale, if applicable.
   * @return locale
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLocale() {
        return locale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLocale_JsonNullable() {
    return locale;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCALE)
  public void setLocale_JsonNullable(JsonNullable<Object> locale) {
    this.locale = locale;
  }

  public void setLocale(Object locale) {
    this.locale = JsonNullable.<Object>of(locale);
  }


  public Courses name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * The full name of the course.
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


  public Courses timeZone(Object timeZone) {
    this.timeZone = JsonNullable.<Object>of(timeZone);
    
    return this;
  }

   /**
   * The course&#39;s IANA time zone name.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTimeZone() {
        return timeZone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTimeZone_JsonNullable() {
    return timeZone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  public void setTimeZone_JsonNullable(JsonNullable<Object> timeZone) {
    this.timeZone = timeZone;
  }

  public void setTimeZone(Object timeZone) {
    this.timeZone = JsonNullable.<Object>of(timeZone);
  }


  public Courses uuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
    
    return this;
  }

   /**
   * The UUID of the course.
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


  public Courses settings(TypeExtractedFromColumnCoursesSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeExtractedFromColumnCoursesSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(TypeExtractedFromColumnCoursesSettings settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Courses courses = (Courses) o;
    return Objects.equals(this.id, courses.id) &&
        equalsNullable(this.storageQuota, courses.storageQuota) &&
        equalsNullable(this.integrationId, courses.integrationId) &&
        equalsNullable(this.ltiContextId, courses.ltiContextId) &&
        equalsNullable(this.sisBatchId, courses.sisBatchId) &&
        Objects.equals(this.createdAt, courses.createdAt) &&
        Objects.equals(this.updatedAt, courses.updatedAt) &&
        Objects.equals(this.workflowState, courses.workflowState) &&
        Objects.equals(this.accountId, courses.accountId) &&
        equalsNullable(this.gradingStandardId, courses.gradingStandardId) &&
        equalsNullable(this.startAt, courses.startAt) &&
        equalsNullable(this.sisSourceId, courses.sisSourceId) &&
        equalsNullable(this.groupWeightingScheme, courses.groupWeightingScheme) &&
        equalsNullable(this.concludeAt, courses.concludeAt) &&
        equalsNullable(this.isPublic, courses.isPublic) &&
        equalsNullable(this.allowStudentWikiEdits, courses.allowStudentWikiEdits) &&
        Objects.equals(this.syllabusBody, courses.syllabusBody) &&
        equalsNullable(this.defaultWikiEditingRoles, courses.defaultWikiEditingRoles) &&
        equalsNullable(this.wikiId, courses.wikiId) &&
        Objects.equals(this.allowStudentOrganizedGroups, courses.allowStudentOrganizedGroups) &&
        equalsNullable(this.courseCode, courses.courseCode) &&
        equalsNullable(this.defaultView, courses.defaultView) &&
        equalsNullable(this.abstractCourseId, courses.abstractCourseId) &&
        Objects.equals(this.enrollmentTermId, courses.enrollmentTermId) &&
        equalsNullable(this.openEnrollment, courses.openEnrollment) &&
        equalsNullable(this.tabConfiguration, courses.tabConfiguration) &&
        Objects.equals(this.turnitinComments, courses.turnitinComments) &&
        equalsNullable(this.selfEnrollment, courses.selfEnrollment) &&
        equalsNullable(this.license, courses.license) &&
        equalsNullable(this.indexed, courses.indexed) &&
        equalsNullable(this.restrictEnrollmentsToCourseDates, courses.restrictEnrollmentsToCourseDates) &&
        equalsNullable(this.templateCourseId, courses.templateCourseId) &&
        equalsNullable(this.replacementCourseId, courses.replacementCourseId) &&
        Objects.equals(this.publicDescription, courses.publicDescription) &&
        equalsNullable(this.selfEnrollmentCode, courses.selfEnrollmentCode) &&
        equalsNullable(this.selfEnrollmentLimit, courses.selfEnrollmentLimit) &&
        equalsNullable(this.turnitinId, courses.turnitinId) &&
        equalsNullable(this.showAnnouncementsOnHomePage, courses.showAnnouncementsOnHomePage) &&
        equalsNullable(this.homePageAnnouncementLimit, courses.homePageAnnouncementLimit) &&
        equalsNullable(this.latestOutcomeImportId, courses.latestOutcomeImportId) &&
        equalsNullable(this.gradePassbackSetting, courses.gradePassbackSetting) &&
        Objects.equals(this.template, courses.template) &&
        Objects.equals(this.homeroomCourse, courses.homeroomCourse) &&
        Objects.equals(this.syncEnrollmentsFromHomeroom, courses.syncEnrollmentsFromHomeroom) &&
        equalsNullable(this.homeroomCourseId, courses.homeroomCourseId) &&
        equalsNullable(this.locale, courses.locale) &&
        equalsNullable(this.name, courses.name) &&
        equalsNullable(this.timeZone, courses.timeZone) &&
        equalsNullable(this.uuid, courses.uuid) &&
        Objects.equals(this.settings, courses.settings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(storageQuota), hashCodeNullable(integrationId), hashCodeNullable(ltiContextId), hashCodeNullable(sisBatchId), createdAt, updatedAt, workflowState, accountId, hashCodeNullable(gradingStandardId), hashCodeNullable(startAt), hashCodeNullable(sisSourceId), hashCodeNullable(groupWeightingScheme), hashCodeNullable(concludeAt), hashCodeNullable(isPublic), hashCodeNullable(allowStudentWikiEdits), syllabusBody, hashCodeNullable(defaultWikiEditingRoles), hashCodeNullable(wikiId), allowStudentOrganizedGroups, hashCodeNullable(courseCode), hashCodeNullable(defaultView), hashCodeNullable(abstractCourseId), enrollmentTermId, hashCodeNullable(openEnrollment), hashCodeNullable(tabConfiguration), turnitinComments, hashCodeNullable(selfEnrollment), hashCodeNullable(license), hashCodeNullable(indexed), hashCodeNullable(restrictEnrollmentsToCourseDates), hashCodeNullable(templateCourseId), hashCodeNullable(replacementCourseId), publicDescription, hashCodeNullable(selfEnrollmentCode), hashCodeNullable(selfEnrollmentLimit), hashCodeNullable(turnitinId), hashCodeNullable(showAnnouncementsOnHomePage), hashCodeNullable(homePageAnnouncementLimit), hashCodeNullable(latestOutcomeImportId), hashCodeNullable(gradePassbackSetting), template, homeroomCourse, syncEnrollmentsFromHomeroom, hashCodeNullable(homeroomCourseId), hashCodeNullable(locale), hashCodeNullable(name), hashCodeNullable(timeZone), hashCodeNullable(uuid), settings);
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
    sb.append("class Courses {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    ltiContextId: ").append(toIndentedString(ltiContextId)).append("\n");
    sb.append("    sisBatchId: ").append(toIndentedString(sisBatchId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    gradingStandardId: ").append(toIndentedString(gradingStandardId)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    sisSourceId: ").append(toIndentedString(sisSourceId)).append("\n");
    sb.append("    groupWeightingScheme: ").append(toIndentedString(groupWeightingScheme)).append("\n");
    sb.append("    concludeAt: ").append(toIndentedString(concludeAt)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    allowStudentWikiEdits: ").append(toIndentedString(allowStudentWikiEdits)).append("\n");
    sb.append("    syllabusBody: ").append(toIndentedString(syllabusBody)).append("\n");
    sb.append("    defaultWikiEditingRoles: ").append(toIndentedString(defaultWikiEditingRoles)).append("\n");
    sb.append("    wikiId: ").append(toIndentedString(wikiId)).append("\n");
    sb.append("    allowStudentOrganizedGroups: ").append(toIndentedString(allowStudentOrganizedGroups)).append("\n");
    sb.append("    courseCode: ").append(toIndentedString(courseCode)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
    sb.append("    abstractCourseId: ").append(toIndentedString(abstractCourseId)).append("\n");
    sb.append("    enrollmentTermId: ").append(toIndentedString(enrollmentTermId)).append("\n");
    sb.append("    openEnrollment: ").append(toIndentedString(openEnrollment)).append("\n");
    sb.append("    tabConfiguration: ").append(toIndentedString(tabConfiguration)).append("\n");
    sb.append("    turnitinComments: ").append(toIndentedString(turnitinComments)).append("\n");
    sb.append("    selfEnrollment: ").append(toIndentedString(selfEnrollment)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    indexed: ").append(toIndentedString(indexed)).append("\n");
    sb.append("    restrictEnrollmentsToCourseDates: ").append(toIndentedString(restrictEnrollmentsToCourseDates)).append("\n");
    sb.append("    templateCourseId: ").append(toIndentedString(templateCourseId)).append("\n");
    sb.append("    replacementCourseId: ").append(toIndentedString(replacementCourseId)).append("\n");
    sb.append("    publicDescription: ").append(toIndentedString(publicDescription)).append("\n");
    sb.append("    selfEnrollmentCode: ").append(toIndentedString(selfEnrollmentCode)).append("\n");
    sb.append("    selfEnrollmentLimit: ").append(toIndentedString(selfEnrollmentLimit)).append("\n");
    sb.append("    turnitinId: ").append(toIndentedString(turnitinId)).append("\n");
    sb.append("    showAnnouncementsOnHomePage: ").append(toIndentedString(showAnnouncementsOnHomePage)).append("\n");
    sb.append("    homePageAnnouncementLimit: ").append(toIndentedString(homePageAnnouncementLimit)).append("\n");
    sb.append("    latestOutcomeImportId: ").append(toIndentedString(latestOutcomeImportId)).append("\n");
    sb.append("    gradePassbackSetting: ").append(toIndentedString(gradePassbackSetting)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    homeroomCourse: ").append(toIndentedString(homeroomCourse)).append("\n");
    sb.append("    syncEnrollmentsFromHomeroom: ").append(toIndentedString(syncEnrollmentsFromHomeroom)).append("\n");
    sb.append("    homeroomCourseId: ").append(toIndentedString(homeroomCourseId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

