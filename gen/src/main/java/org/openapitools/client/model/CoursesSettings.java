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
 * CoursesSettings
 */
@JsonPropertyOrder({
  CoursesSettings.JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_EDITING,
  CoursesSettings.JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_TOPICS,
  CoursesSettings.JSON_PROPERTY_COURSE_FORMAT,
  CoursesSettings.JSON_PROPERTY_FILTER_SPEED_GRADER_BY_STUDENT_GROUP,
  CoursesSettings.JSON_PROPERTY_HIDE_DISTRIBUTION_GRAPHS,
  CoursesSettings.JSON_PROPERTY_HIDE_FINAL_GRADE,
  CoursesSettings.JSON_PROPERTY_IS_PUBLIC_TO_AUTH_USERS,
  CoursesSettings.JSON_PROPERTY_LOCK_ALL_ANNOUNCEMENTS,
  CoursesSettings.JSON_PROPERTY_PUBLIC_SYLLABUS,
  CoursesSettings.JSON_PROPERTY_PUBLIC_SYLLABUS_TO_AUTH,
  CoursesSettings.JSON_PROPERTY_RESTRICT_STUDENT_FUTURE_VIEW,
  CoursesSettings.JSON_PROPERTY_RESTRICT_STUDENT_PAST_VIEW,
  CoursesSettings.JSON_PROPERTY_SYLLABUS_UPDATED_AT,
  CoursesSettings.JSON_PROPERTY_USAGE_RIGHTS_REQUIRED,
  CoursesSettings.JSON_PROPERTY_ALLOW_STUDENT_FORUM_ATTACHMENTS
})
@JsonTypeName("courses__settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CoursesSettings {
  public static final String JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_EDITING = "allow_student_discussion_editing";
  private JsonNullable<Object> allowStudentDiscussionEditing = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_TOPICS = "allow_student_discussion_topics";
  private JsonNullable<Object> allowStudentDiscussionTopics = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_FORMAT = "course_format";
  private JsonNullable<Object> courseFormat = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FILTER_SPEED_GRADER_BY_STUDENT_GROUP = "filter_speed_grader_by_student_group";
  private String filterSpeedGraderByStudentGroup;

  public static final String JSON_PROPERTY_HIDE_DISTRIBUTION_GRAPHS = "hide_distribution_graphs";
  private JsonNullable<Object> hideDistributionGraphs = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HIDE_FINAL_GRADE = "hide_final_grade";
  private JsonNullable<Object> hideFinalGrade = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IS_PUBLIC_TO_AUTH_USERS = "is_public_to_auth_users";
  private JsonNullable<Object> isPublicToAuthUsers = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOCK_ALL_ANNOUNCEMENTS = "lock_all_announcements";
  private JsonNullable<Object> lockAllAnnouncements = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLIC_SYLLABUS = "public_syllabus";
  private JsonNullable<Object> publicSyllabus = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLIC_SYLLABUS_TO_AUTH = "public_syllabus_to_auth";
  private JsonNullable<Object> publicSyllabusToAuth = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESTRICT_STUDENT_FUTURE_VIEW = "restrict_student_future_view";
  private JsonNullable<Object> restrictStudentFutureView = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESTRICT_STUDENT_PAST_VIEW = "restrict_student_past_view";
  private JsonNullable<Object> restrictStudentPastView = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SYLLABUS_UPDATED_AT = "syllabus_updated_at";
  private JsonNullable<Object> syllabusUpdatedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USAGE_RIGHTS_REQUIRED = "usage_rights_required";
  private JsonNullable<Object> usageRightsRequired = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALLOW_STUDENT_FORUM_ATTACHMENTS = "allow_student_forum_attachments";
  private JsonNullable<Object> allowStudentForumAttachments = JsonNullable.<Object>of(null);

  public CoursesSettings() {
  }

  public CoursesSettings allowStudentDiscussionEditing(Object allowStudentDiscussionEditing) {
    this.allowStudentDiscussionEditing = JsonNullable.<Object>of(allowStudentDiscussionEditing);
    
    return this;
  }

   /**
   * Let students edit or delete their own discussion posts.
   * @return allowStudentDiscussionEditing
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowStudentDiscussionEditing() {
        return allowStudentDiscussionEditing.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_EDITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowStudentDiscussionEditing_JsonNullable() {
    return allowStudentDiscussionEditing;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_EDITING)
  public void setAllowStudentDiscussionEditing_JsonNullable(JsonNullable<Object> allowStudentDiscussionEditing) {
    this.allowStudentDiscussionEditing = allowStudentDiscussionEditing;
  }

  public void setAllowStudentDiscussionEditing(Object allowStudentDiscussionEditing) {
    this.allowStudentDiscussionEditing = JsonNullable.<Object>of(allowStudentDiscussionEditing);
  }


  public CoursesSettings allowStudentDiscussionTopics(Object allowStudentDiscussionTopics) {
    this.allowStudentDiscussionTopics = JsonNullable.<Object>of(allowStudentDiscussionTopics);
    
    return this;
  }

   /**
   * Let students create discussion topics.
   * @return allowStudentDiscussionTopics
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowStudentDiscussionTopics() {
        return allowStudentDiscussionTopics.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_TOPICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowStudentDiscussionTopics_JsonNullable() {
    return allowStudentDiscussionTopics;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_DISCUSSION_TOPICS)
  public void setAllowStudentDiscussionTopics_JsonNullable(JsonNullable<Object> allowStudentDiscussionTopics) {
    this.allowStudentDiscussionTopics = allowStudentDiscussionTopics;
  }

  public void setAllowStudentDiscussionTopics(Object allowStudentDiscussionTopics) {
    this.allowStudentDiscussionTopics = JsonNullable.<Object>of(allowStudentDiscussionTopics);
  }


  public CoursesSettings courseFormat(Object courseFormat) {
    this.courseFormat = JsonNullable.<Object>of(courseFormat);
    
    return this;
  }

   /**
   * Format of a course, values include &#x60;blended&#x60;, &#x60;on_campus&#x60;, &#x60;online&#x60;.
   * @return courseFormat
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseFormat() {
        return courseFormat.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseFormat_JsonNullable() {
    return courseFormat;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_FORMAT)
  public void setCourseFormat_JsonNullable(JsonNullable<Object> courseFormat) {
    this.courseFormat = courseFormat;
  }

  public void setCourseFormat(Object courseFormat) {
    this.courseFormat = JsonNullable.<Object>of(courseFormat);
  }


  public CoursesSettings filterSpeedGraderByStudentGroup(String filterSpeedGraderByStudentGroup) {
    
    this.filterSpeedGraderByStudentGroup = filterSpeedGraderByStudentGroup;
    return this;
  }

   /**
   * Get filterSpeedGraderByStudentGroup
   * @return filterSpeedGraderByStudentGroup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_SPEED_GRADER_BY_STUDENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilterSpeedGraderByStudentGroup() {
    return filterSpeedGraderByStudentGroup;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_SPEED_GRADER_BY_STUDENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterSpeedGraderByStudentGroup(String filterSpeedGraderByStudentGroup) {
    this.filterSpeedGraderByStudentGroup = filterSpeedGraderByStudentGroup;
  }


  public CoursesSettings hideDistributionGraphs(Object hideDistributionGraphs) {
    this.hideDistributionGraphs = JsonNullable.<Object>of(hideDistributionGraphs);
    
    return this;
  }

   /**
   * Hide grade distribution graphs from students.
   * @return hideDistributionGraphs
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHideDistributionGraphs() {
        return hideDistributionGraphs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIDE_DISTRIBUTION_GRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHideDistributionGraphs_JsonNullable() {
    return hideDistributionGraphs;
  }
  
  @JsonProperty(JSON_PROPERTY_HIDE_DISTRIBUTION_GRAPHS)
  public void setHideDistributionGraphs_JsonNullable(JsonNullable<Object> hideDistributionGraphs) {
    this.hideDistributionGraphs = hideDistributionGraphs;
  }

  public void setHideDistributionGraphs(Object hideDistributionGraphs) {
    this.hideDistributionGraphs = JsonNullable.<Object>of(hideDistributionGraphs);
  }


  public CoursesSettings hideFinalGrade(Object hideFinalGrade) {
    this.hideFinalGrade = JsonNullable.<Object>of(hideFinalGrade);
    
    return this;
  }

   /**
   * Hide totals in student grades summary.
   * @return hideFinalGrade
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHideFinalGrade() {
        return hideFinalGrade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIDE_FINAL_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHideFinalGrade_JsonNullable() {
    return hideFinalGrade;
  }
  
  @JsonProperty(JSON_PROPERTY_HIDE_FINAL_GRADE)
  public void setHideFinalGrade_JsonNullable(JsonNullable<Object> hideFinalGrade) {
    this.hideFinalGrade = hideFinalGrade;
  }

  public void setHideFinalGrade(Object hideFinalGrade) {
    this.hideFinalGrade = JsonNullable.<Object>of(hideFinalGrade);
  }


  public CoursesSettings isPublicToAuthUsers(Object isPublicToAuthUsers) {
    this.isPublicToAuthUsers = JsonNullable.<Object>of(isPublicToAuthUsers);
    
    return this;
  }

   /**
   * Set to true if course is public only to authenticated users.
   * @return isPublicToAuthUsers
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIsPublicToAuthUsers() {
        return isPublicToAuthUsers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_PUBLIC_TO_AUTH_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIsPublicToAuthUsers_JsonNullable() {
    return isPublicToAuthUsers;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC_TO_AUTH_USERS)
  public void setIsPublicToAuthUsers_JsonNullable(JsonNullable<Object> isPublicToAuthUsers) {
    this.isPublicToAuthUsers = isPublicToAuthUsers;
  }

  public void setIsPublicToAuthUsers(Object isPublicToAuthUsers) {
    this.isPublicToAuthUsers = JsonNullable.<Object>of(isPublicToAuthUsers);
  }


  public CoursesSettings lockAllAnnouncements(Object lockAllAnnouncements) {
    this.lockAllAnnouncements = JsonNullable.<Object>of(lockAllAnnouncements);
    
    return this;
  }

   /**
   * Disable comments on announcements.
   * @return lockAllAnnouncements
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLockAllAnnouncements() {
        return lockAllAnnouncements.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCK_ALL_ANNOUNCEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLockAllAnnouncements_JsonNullable() {
    return lockAllAnnouncements;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCK_ALL_ANNOUNCEMENTS)
  public void setLockAllAnnouncements_JsonNullable(JsonNullable<Object> lockAllAnnouncements) {
    this.lockAllAnnouncements = lockAllAnnouncements;
  }

  public void setLockAllAnnouncements(Object lockAllAnnouncements) {
    this.lockAllAnnouncements = JsonNullable.<Object>of(lockAllAnnouncements);
  }


  public CoursesSettings publicSyllabus(Object publicSyllabus) {
    this.publicSyllabus = JsonNullable.<Object>of(publicSyllabus);
    
    return this;
  }

   /**
   * Set to true to make the course syllabus public. Values include true, false.
   * @return publicSyllabus
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPublicSyllabus() {
        return publicSyllabus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_SYLLABUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPublicSyllabus_JsonNullable() {
    return publicSyllabus;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLIC_SYLLABUS)
  public void setPublicSyllabus_JsonNullable(JsonNullable<Object> publicSyllabus) {
    this.publicSyllabus = publicSyllabus;
  }

  public void setPublicSyllabus(Object publicSyllabus) {
    this.publicSyllabus = JsonNullable.<Object>of(publicSyllabus);
  }


  public CoursesSettings publicSyllabusToAuth(Object publicSyllabusToAuth) {
    this.publicSyllabusToAuth = JsonNullable.<Object>of(publicSyllabusToAuth);
    
    return this;
  }

   /**
   * Set to true to make the course syllabus public for authenticated users.
   * @return publicSyllabusToAuth
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPublicSyllabusToAuth() {
        return publicSyllabusToAuth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_SYLLABUS_TO_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPublicSyllabusToAuth_JsonNullable() {
    return publicSyllabusToAuth;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLIC_SYLLABUS_TO_AUTH)
  public void setPublicSyllabusToAuth_JsonNullable(JsonNullable<Object> publicSyllabusToAuth) {
    this.publicSyllabusToAuth = publicSyllabusToAuth;
  }

  public void setPublicSyllabusToAuth(Object publicSyllabusToAuth) {
    this.publicSyllabusToAuth = JsonNullable.<Object>of(publicSyllabusToAuth);
  }


  public CoursesSettings restrictStudentFutureView(Object restrictStudentFutureView) {
    this.restrictStudentFutureView = JsonNullable.<Object>of(restrictStudentFutureView);
    
    return this;
  }

   /**
   * Restrict students from viewing courses before start date.
   * @return restrictStudentFutureView
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRestrictStudentFutureView() {
        return restrictStudentFutureView.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESTRICT_STUDENT_FUTURE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRestrictStudentFutureView_JsonNullable() {
    return restrictStudentFutureView;
  }
  
  @JsonProperty(JSON_PROPERTY_RESTRICT_STUDENT_FUTURE_VIEW)
  public void setRestrictStudentFutureView_JsonNullable(JsonNullable<Object> restrictStudentFutureView) {
    this.restrictStudentFutureView = restrictStudentFutureView;
  }

  public void setRestrictStudentFutureView(Object restrictStudentFutureView) {
    this.restrictStudentFutureView = JsonNullable.<Object>of(restrictStudentFutureView);
  }


  public CoursesSettings restrictStudentPastView(Object restrictStudentPastView) {
    this.restrictStudentPastView = JsonNullable.<Object>of(restrictStudentPastView);
    
    return this;
  }

   /**
   * Restrict students from viewing courses after end date.
   * @return restrictStudentPastView
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRestrictStudentPastView() {
        return restrictStudentPastView.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESTRICT_STUDENT_PAST_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRestrictStudentPastView_JsonNullable() {
    return restrictStudentPastView;
  }
  
  @JsonProperty(JSON_PROPERTY_RESTRICT_STUDENT_PAST_VIEW)
  public void setRestrictStudentPastView_JsonNullable(JsonNullable<Object> restrictStudentPastView) {
    this.restrictStudentPastView = restrictStudentPastView;
  }

  public void setRestrictStudentPastView(Object restrictStudentPastView) {
    this.restrictStudentPastView = JsonNullable.<Object>of(restrictStudentPastView);
  }


  public CoursesSettings syllabusUpdatedAt(Object syllabusUpdatedAt) {
    this.syllabusUpdatedAt = JsonNullable.<Object>of(syllabusUpdatedAt);
    
    return this;
  }

   /**
   * Timestamp when syllabus was updated in a course.
   * @return syllabusUpdatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSyllabusUpdatedAt() {
        return syllabusUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYLLABUS_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSyllabusUpdatedAt_JsonNullable() {
    return syllabusUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_SYLLABUS_UPDATED_AT)
  public void setSyllabusUpdatedAt_JsonNullable(JsonNullable<Object> syllabusUpdatedAt) {
    this.syllabusUpdatedAt = syllabusUpdatedAt;
  }

  public void setSyllabusUpdatedAt(Object syllabusUpdatedAt) {
    this.syllabusUpdatedAt = JsonNullable.<Object>of(syllabusUpdatedAt);
  }


  public CoursesSettings usageRightsRequired(Object usageRightsRequired) {
    this.usageRightsRequired = JsonNullable.<Object>of(usageRightsRequired);
    
    return this;
  }

   /**
   * Copyright and license information must be provided for files before they are published.
   * @return usageRightsRequired
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUsageRightsRequired() {
        return usageRightsRequired.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USAGE_RIGHTS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUsageRightsRequired_JsonNullable() {
    return usageRightsRequired;
  }
  
  @JsonProperty(JSON_PROPERTY_USAGE_RIGHTS_REQUIRED)
  public void setUsageRightsRequired_JsonNullable(JsonNullable<Object> usageRightsRequired) {
    this.usageRightsRequired = usageRightsRequired;
  }

  public void setUsageRightsRequired(Object usageRightsRequired) {
    this.usageRightsRequired = JsonNullable.<Object>of(usageRightsRequired);
  }


  public CoursesSettings allowStudentForumAttachments(Object allowStudentForumAttachments) {
    this.allowStudentForumAttachments = JsonNullable.<Object>of(allowStudentForumAttachments);
    
    return this;
  }

   /**
   * Whether students can attach files to discussions.
   * @return allowStudentForumAttachments
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowStudentForumAttachments() {
        return allowStudentForumAttachments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_FORUM_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowStudentForumAttachments_JsonNullable() {
    return allowStudentForumAttachments;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOW_STUDENT_FORUM_ATTACHMENTS)
  public void setAllowStudentForumAttachments_JsonNullable(JsonNullable<Object> allowStudentForumAttachments) {
    this.allowStudentForumAttachments = allowStudentForumAttachments;
  }

  public void setAllowStudentForumAttachments(Object allowStudentForumAttachments) {
    this.allowStudentForumAttachments = JsonNullable.<Object>of(allowStudentForumAttachments);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoursesSettings coursesSettings = (CoursesSettings) o;
    return equalsNullable(this.allowStudentDiscussionEditing, coursesSettings.allowStudentDiscussionEditing) &&
        equalsNullable(this.allowStudentDiscussionTopics, coursesSettings.allowStudentDiscussionTopics) &&
        equalsNullable(this.courseFormat, coursesSettings.courseFormat) &&
        Objects.equals(this.filterSpeedGraderByStudentGroup, coursesSettings.filterSpeedGraderByStudentGroup) &&
        equalsNullable(this.hideDistributionGraphs, coursesSettings.hideDistributionGraphs) &&
        equalsNullable(this.hideFinalGrade, coursesSettings.hideFinalGrade) &&
        equalsNullable(this.isPublicToAuthUsers, coursesSettings.isPublicToAuthUsers) &&
        equalsNullable(this.lockAllAnnouncements, coursesSettings.lockAllAnnouncements) &&
        equalsNullable(this.publicSyllabus, coursesSettings.publicSyllabus) &&
        equalsNullable(this.publicSyllabusToAuth, coursesSettings.publicSyllabusToAuth) &&
        equalsNullable(this.restrictStudentFutureView, coursesSettings.restrictStudentFutureView) &&
        equalsNullable(this.restrictStudentPastView, coursesSettings.restrictStudentPastView) &&
        equalsNullable(this.syllabusUpdatedAt, coursesSettings.syllabusUpdatedAt) &&
        equalsNullable(this.usageRightsRequired, coursesSettings.usageRightsRequired) &&
        equalsNullable(this.allowStudentForumAttachments, coursesSettings.allowStudentForumAttachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(allowStudentDiscussionEditing), hashCodeNullable(allowStudentDiscussionTopics), hashCodeNullable(courseFormat), filterSpeedGraderByStudentGroup, hashCodeNullable(hideDistributionGraphs), hashCodeNullable(hideFinalGrade), hashCodeNullable(isPublicToAuthUsers), hashCodeNullable(lockAllAnnouncements), hashCodeNullable(publicSyllabus), hashCodeNullable(publicSyllabusToAuth), hashCodeNullable(restrictStudentFutureView), hashCodeNullable(restrictStudentPastView), hashCodeNullable(syllabusUpdatedAt), hashCodeNullable(usageRightsRequired), hashCodeNullable(allowStudentForumAttachments));
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
    sb.append("class CoursesSettings {\n");
    sb.append("    allowStudentDiscussionEditing: ").append(toIndentedString(allowStudentDiscussionEditing)).append("\n");
    sb.append("    allowStudentDiscussionTopics: ").append(toIndentedString(allowStudentDiscussionTopics)).append("\n");
    sb.append("    courseFormat: ").append(toIndentedString(courseFormat)).append("\n");
    sb.append("    filterSpeedGraderByStudentGroup: ").append(toIndentedString(filterSpeedGraderByStudentGroup)).append("\n");
    sb.append("    hideDistributionGraphs: ").append(toIndentedString(hideDistributionGraphs)).append("\n");
    sb.append("    hideFinalGrade: ").append(toIndentedString(hideFinalGrade)).append("\n");
    sb.append("    isPublicToAuthUsers: ").append(toIndentedString(isPublicToAuthUsers)).append("\n");
    sb.append("    lockAllAnnouncements: ").append(toIndentedString(lockAllAnnouncements)).append("\n");
    sb.append("    publicSyllabus: ").append(toIndentedString(publicSyllabus)).append("\n");
    sb.append("    publicSyllabusToAuth: ").append(toIndentedString(publicSyllabusToAuth)).append("\n");
    sb.append("    restrictStudentFutureView: ").append(toIndentedString(restrictStudentFutureView)).append("\n");
    sb.append("    restrictStudentPastView: ").append(toIndentedString(restrictStudentPastView)).append("\n");
    sb.append("    syllabusUpdatedAt: ").append(toIndentedString(syllabusUpdatedAt)).append("\n");
    sb.append("    usageRightsRequired: ").append(toIndentedString(usageRightsRequired)).append("\n");
    sb.append("    allowStudentForumAttachments: ").append(toIndentedString(allowStudentForumAttachments)).append("\n");
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

