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
 * Scores
 */
@JsonPropertyOrder({
  Scores.JSON_PROPERTY_ID,
  Scores.JSON_PROPERTY_CREATED_AT,
  Scores.JSON_PROPERTY_UPDATED_AT,
  Scores.JSON_PROPERTY_WORKFLOW_STATE,
  Scores.JSON_PROPERTY_ASSIGNMENT_GROUP_ID,
  Scores.JSON_PROPERTY_ENROLLMENT_ID,
  Scores.JSON_PROPERTY_GRADING_PERIOD_ID,
  Scores.JSON_PROPERTY_CURRENT_SCORE,
  Scores.JSON_PROPERTY_FINAL_SCORE,
  Scores.JSON_PROPERTY_COURSE_SCORE,
  Scores.JSON_PROPERTY_UNPOSTED_CURRENT_SCORE,
  Scores.JSON_PROPERTY_UNPOSTED_FINAL_SCORE,
  Scores.JSON_PROPERTY_CURRENT_POINTS,
  Scores.JSON_PROPERTY_UNPOSTED_CURRENT_POINTS,
  Scores.JSON_PROPERTY_FINAL_POINTS,
  Scores.JSON_PROPERTY_UNPOSTED_FINAL_POINTS,
  Scores.JSON_PROPERTY_OVERRIDE_SCORE
})
@JsonTypeName("scores")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Scores {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Object> createdAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  /**
   * Life-cycle state for the score.
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

  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_ID = "assignment_group_id";
  private JsonNullable<Object> assignmentGroupId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ENROLLMENT_ID = "enrollment_id";
  private Object enrollmentId = null;

  public static final String JSON_PROPERTY_GRADING_PERIOD_ID = "grading_period_id";
  private JsonNullable<Object> gradingPeriodId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CURRENT_SCORE = "current_score";
  private JsonNullable<Object> currentScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FINAL_SCORE = "final_score";
  private JsonNullable<Object> finalScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_SCORE = "course_score";
  private Object courseScore = null;

  public static final String JSON_PROPERTY_UNPOSTED_CURRENT_SCORE = "unposted_current_score";
  private JsonNullable<Object> unpostedCurrentScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UNPOSTED_FINAL_SCORE = "unposted_final_score";
  private JsonNullable<Object> unpostedFinalScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CURRENT_POINTS = "current_points";
  private JsonNullable<Object> currentPoints = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UNPOSTED_CURRENT_POINTS = "unposted_current_points";
  private JsonNullable<Object> unpostedCurrentPoints = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FINAL_POINTS = "final_points";
  private JsonNullable<Object> finalPoints = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UNPOSTED_FINAL_POINTS = "unposted_final_points";
  private JsonNullable<Object> unpostedFinalPoints = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_OVERRIDE_SCORE = "override_score";
  private JsonNullable<Object> overrideScore = JsonNullable.<Object>of(null);

  public Scores() {
  }

  public Scores id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the score.
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


  public Scores createdAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
    
    return this;
  }

   /**
   * Time when the score was created.
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


  public Scores updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Time when the score was updated.
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


  public Scores workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Life-cycle state for the score.
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


  public Scores assignmentGroupId(Object assignmentGroupId) {
    this.assignmentGroupId = JsonNullable.<Object>of(assignmentGroupId);
    
    return this;
  }

   /**
   * The ID of the assignment group this score refers to, or NULL if it does not refer to a particular assignment group.
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


  public Scores enrollmentId(Object enrollmentId) {
    
    this.enrollmentId = enrollmentId;
    return this;
  }

   /**
   * The ID of the enrollment object this score refers to.
   * @return enrollmentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENROLLMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getEnrollmentId() {
    return enrollmentId;
  }


  @JsonProperty(JSON_PROPERTY_ENROLLMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnrollmentId(Object enrollmentId) {
    this.enrollmentId = enrollmentId;
  }


  public Scores gradingPeriodId(Object gradingPeriodId) {
    this.gradingPeriodId = JsonNullable.<Object>of(gradingPeriodId);
    
    return this;
  }

   /**
   * The ID of the grading period covered by this score, or NULL if it does not apply to a specific grading period. If this is NULL, this is the overall score for the course.
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


  public Scores currentScore(Object currentScore) {
    this.currentScore = JsonNullable.<Object>of(currentScore);
    
    return this;
  }

   /**
   * The current score for the assignments represented by this Score object.
   * @return currentScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCurrentScore() {
        return currentScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCurrentScore_JsonNullable() {
    return currentScore;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_SCORE)
  public void setCurrentScore_JsonNullable(JsonNullable<Object> currentScore) {
    this.currentScore = currentScore;
  }

  public void setCurrentScore(Object currentScore) {
    this.currentScore = JsonNullable.<Object>of(currentScore);
  }


  public Scores finalScore(Object finalScore) {
    this.finalScore = JsonNullable.<Object>of(finalScore);
    
    return this;
  }

   /**
   * The final score for the assignments represented by this Score object, calculated by treating ungraded assignments as though they received zero points.
   * @return finalScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFinalScore() {
        return finalScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINAL_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFinalScore_JsonNullable() {
    return finalScore;
  }
  
  @JsonProperty(JSON_PROPERTY_FINAL_SCORE)
  public void setFinalScore_JsonNullable(JsonNullable<Object> finalScore) {
    this.finalScore = finalScore;
  }

  public void setFinalScore(Object finalScore) {
    this.finalScore = JsonNullable.<Object>of(finalScore);
  }


  public Scores courseScore(Object courseScore) {
    
    this.courseScore = courseScore;
    return this;
  }

   /**
   * True if this score does not refer to a particular grading period or assignment group (in other words, if it represents the overall score for the course referred to in the enrollment).
   * @return courseScore
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COURSE_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCourseScore() {
    return courseScore;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourseScore(Object courseScore) {
    this.courseScore = courseScore;
  }


  public Scores unpostedCurrentScore(Object unpostedCurrentScore) {
    this.unpostedCurrentScore = JsonNullable.<Object>of(unpostedCurrentScore);
    
    return this;
  }

   /**
   * The current score, with muted/unposted assignments included.
   * @return unpostedCurrentScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUnpostedCurrentScore() {
        return unpostedCurrentScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNPOSTED_CURRENT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUnpostedCurrentScore_JsonNullable() {
    return unpostedCurrentScore;
  }
  
  @JsonProperty(JSON_PROPERTY_UNPOSTED_CURRENT_SCORE)
  public void setUnpostedCurrentScore_JsonNullable(JsonNullable<Object> unpostedCurrentScore) {
    this.unpostedCurrentScore = unpostedCurrentScore;
  }

  public void setUnpostedCurrentScore(Object unpostedCurrentScore) {
    this.unpostedCurrentScore = JsonNullable.<Object>of(unpostedCurrentScore);
  }


  public Scores unpostedFinalScore(Object unpostedFinalScore) {
    this.unpostedFinalScore = JsonNullable.<Object>of(unpostedFinalScore);
    
    return this;
  }

   /**
   * The final score, with muted/unposted assignments included.
   * @return unpostedFinalScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUnpostedFinalScore() {
        return unpostedFinalScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNPOSTED_FINAL_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUnpostedFinalScore_JsonNullable() {
    return unpostedFinalScore;
  }
  
  @JsonProperty(JSON_PROPERTY_UNPOSTED_FINAL_SCORE)
  public void setUnpostedFinalScore_JsonNullable(JsonNullable<Object> unpostedFinalScore) {
    this.unpostedFinalScore = unpostedFinalScore;
  }

  public void setUnpostedFinalScore(Object unpostedFinalScore) {
    this.unpostedFinalScore = JsonNullable.<Object>of(unpostedFinalScore);
  }


  public Scores currentPoints(Object currentPoints) {
    this.currentPoints = JsonNullable.<Object>of(currentPoints);
    
    return this;
  }

   /**
   * The number of points earned over all assignments covered by this score, with dropped assignments excluded.
   * @return currentPoints
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCurrentPoints() {
        return currentPoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENT_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCurrentPoints_JsonNullable() {
    return currentPoints;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_POINTS)
  public void setCurrentPoints_JsonNullable(JsonNullable<Object> currentPoints) {
    this.currentPoints = currentPoints;
  }

  public void setCurrentPoints(Object currentPoints) {
    this.currentPoints = JsonNullable.<Object>of(currentPoints);
  }


  public Scores unpostedCurrentPoints(Object unpostedCurrentPoints) {
    this.unpostedCurrentPoints = JsonNullable.<Object>of(unpostedCurrentPoints);
    
    return this;
  }

   /**
   * The total number of points earned over all assignments covered by this score, including muted/unposted assignments.
   * @return unpostedCurrentPoints
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUnpostedCurrentPoints() {
        return unpostedCurrentPoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNPOSTED_CURRENT_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUnpostedCurrentPoints_JsonNullable() {
    return unpostedCurrentPoints;
  }
  
  @JsonProperty(JSON_PROPERTY_UNPOSTED_CURRENT_POINTS)
  public void setUnpostedCurrentPoints_JsonNullable(JsonNullable<Object> unpostedCurrentPoints) {
    this.unpostedCurrentPoints = unpostedCurrentPoints;
  }

  public void setUnpostedCurrentPoints(Object unpostedCurrentPoints) {
    this.unpostedCurrentPoints = JsonNullable.<Object>of(unpostedCurrentPoints);
  }


  public Scores finalPoints(Object finalPoints) {
    this.finalPoints = JsonNullable.<Object>of(finalPoints);
    
    return this;
  }

   /**
   * The number of points earned over all assignments covered by this score, with dropped assignments excluded and unposted submissions treated as 0.
   * @return finalPoints
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFinalPoints() {
        return finalPoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINAL_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFinalPoints_JsonNullable() {
    return finalPoints;
  }
  
  @JsonProperty(JSON_PROPERTY_FINAL_POINTS)
  public void setFinalPoints_JsonNullable(JsonNullable<Object> finalPoints) {
    this.finalPoints = finalPoints;
  }

  public void setFinalPoints(Object finalPoints) {
    this.finalPoints = JsonNullable.<Object>of(finalPoints);
  }


  public Scores unpostedFinalPoints(Object unpostedFinalPoints) {
    this.unpostedFinalPoints = JsonNullable.<Object>of(unpostedFinalPoints);
    
    return this;
  }

   /**
   * The number of points earned over all assignments covered by this score, with dropped assignments excluded and unposted submissions treated as 0, including muted/unposted assignments.
   * @return unpostedFinalPoints
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUnpostedFinalPoints() {
        return unpostedFinalPoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNPOSTED_FINAL_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUnpostedFinalPoints_JsonNullable() {
    return unpostedFinalPoints;
  }
  
  @JsonProperty(JSON_PROPERTY_UNPOSTED_FINAL_POINTS)
  public void setUnpostedFinalPoints_JsonNullable(JsonNullable<Object> unpostedFinalPoints) {
    this.unpostedFinalPoints = unpostedFinalPoints;
  }

  public void setUnpostedFinalPoints(Object unpostedFinalPoints) {
    this.unpostedFinalPoints = JsonNullable.<Object>of(unpostedFinalPoints);
  }


  public Scores overrideScore(Object overrideScore) {
    this.overrideScore = JsonNullable.<Object>of(overrideScore);
    
    return this;
  }

   /**
   * The override score, if one has been set.
   * @return overrideScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOverrideScore() {
        return overrideScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OVERRIDE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOverrideScore_JsonNullable() {
    return overrideScore;
  }
  
  @JsonProperty(JSON_PROPERTY_OVERRIDE_SCORE)
  public void setOverrideScore_JsonNullable(JsonNullable<Object> overrideScore) {
    this.overrideScore = overrideScore;
  }

  public void setOverrideScore(Object overrideScore) {
    this.overrideScore = JsonNullable.<Object>of(overrideScore);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scores scores = (Scores) o;
    return Objects.equals(this.id, scores.id) &&
        equalsNullable(this.createdAt, scores.createdAt) &&
        equalsNullable(this.updatedAt, scores.updatedAt) &&
        Objects.equals(this.workflowState, scores.workflowState) &&
        equalsNullable(this.assignmentGroupId, scores.assignmentGroupId) &&
        Objects.equals(this.enrollmentId, scores.enrollmentId) &&
        equalsNullable(this.gradingPeriodId, scores.gradingPeriodId) &&
        equalsNullable(this.currentScore, scores.currentScore) &&
        equalsNullable(this.finalScore, scores.finalScore) &&
        Objects.equals(this.courseScore, scores.courseScore) &&
        equalsNullable(this.unpostedCurrentScore, scores.unpostedCurrentScore) &&
        equalsNullable(this.unpostedFinalScore, scores.unpostedFinalScore) &&
        equalsNullable(this.currentPoints, scores.currentPoints) &&
        equalsNullable(this.unpostedCurrentPoints, scores.unpostedCurrentPoints) &&
        equalsNullable(this.finalPoints, scores.finalPoints) &&
        equalsNullable(this.unpostedFinalPoints, scores.unpostedFinalPoints) &&
        equalsNullable(this.overrideScore, scores.overrideScore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(createdAt), hashCodeNullable(updatedAt), workflowState, hashCodeNullable(assignmentGroupId), enrollmentId, hashCodeNullable(gradingPeriodId), hashCodeNullable(currentScore), hashCodeNullable(finalScore), courseScore, hashCodeNullable(unpostedCurrentScore), hashCodeNullable(unpostedFinalScore), hashCodeNullable(currentPoints), hashCodeNullable(unpostedCurrentPoints), hashCodeNullable(finalPoints), hashCodeNullable(unpostedFinalPoints), hashCodeNullable(overrideScore));
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
    sb.append("class Scores {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    assignmentGroupId: ").append(toIndentedString(assignmentGroupId)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    gradingPeriodId: ").append(toIndentedString(gradingPeriodId)).append("\n");
    sb.append("    currentScore: ").append(toIndentedString(currentScore)).append("\n");
    sb.append("    finalScore: ").append(toIndentedString(finalScore)).append("\n");
    sb.append("    courseScore: ").append(toIndentedString(courseScore)).append("\n");
    sb.append("    unpostedCurrentScore: ").append(toIndentedString(unpostedCurrentScore)).append("\n");
    sb.append("    unpostedFinalScore: ").append(toIndentedString(unpostedFinalScore)).append("\n");
    sb.append("    currentPoints: ").append(toIndentedString(currentPoints)).append("\n");
    sb.append("    unpostedCurrentPoints: ").append(toIndentedString(unpostedCurrentPoints)).append("\n");
    sb.append("    finalPoints: ").append(toIndentedString(finalPoints)).append("\n");
    sb.append("    unpostedFinalPoints: ").append(toIndentedString(unpostedFinalPoints)).append("\n");
    sb.append("    overrideScore: ").append(toIndentedString(overrideScore)).append("\n");
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

