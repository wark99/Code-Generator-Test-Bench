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
 * RubricAssessments
 */
@JsonPropertyOrder({
  RubricAssessments.JSON_PROPERTY_ID,
  RubricAssessments.JSON_PROPERTY_USER_ID,
  RubricAssessments.JSON_PROPERTY_CREATED_AT,
  RubricAssessments.JSON_PROPERTY_UPDATED_AT,
  RubricAssessments.JSON_PROPERTY_RUBRIC_ASSOCIATION_ID,
  RubricAssessments.JSON_PROPERTY_ARTIFACT_ID,
  RubricAssessments.JSON_PROPERTY_ARTIFACT_TYPE,
  RubricAssessments.JSON_PROPERTY_HIDE_POINTS,
  RubricAssessments.JSON_PROPERTY_SCORE,
  RubricAssessments.JSON_PROPERTY_RUBRIC_ID,
  RubricAssessments.JSON_PROPERTY_ASSESSMENT_TYPE,
  RubricAssessments.JSON_PROPERTY_ASSESSOR_ID,
  RubricAssessments.JSON_PROPERTY_ARTIFACT_ATTEMPT,
  RubricAssessments.JSON_PROPERTY_DATA
})
@JsonTypeName("rubric_assessments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RubricAssessments {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_RUBRIC_ASSOCIATION_ID = "rubric_association_id";
  private JsonNullable<Object> rubricAssociationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ARTIFACT_ID = "artifact_id";
  private Object artifactId = null;

  /**
   * The artifact type.
   */
  public enum ArtifactTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    SUBMISSION("Submission"),
    
    ASSIGNMENT("Assignment"),
    
    MODERATEDGRADING_PROVISIONALGRADE("ModeratedGrading::ProvisionalGrade");

    private Object value;

    ArtifactTypeEnum(Object value) {
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
    public static ArtifactTypeEnum fromValue(Object value) {
      for (ArtifactTypeEnum b : ArtifactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ARTIFACT_TYPE = "artifact_type";
  private ArtifactTypeEnum artifactType = null;

  public static final String JSON_PROPERTY_HIDE_POINTS = "hide_points";
  private Object hidePoints = null;

  public static final String JSON_PROPERTY_SCORE = "score";
  private JsonNullable<Object> score = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RUBRIC_ID = "rubric_id";
  private Object rubricId = null;

  /**
   * Type of assessment.
   */
  public enum AssessmentTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    GRADING("grading"),
    
    INVITED_ASSESSMENT("invited_assessment"),
    
    PEER_REVIEW("peer_review");

    private Object value;

    AssessmentTypeEnum(Object value) {
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
    public static AssessmentTypeEnum fromValue(Object value) {
      for (AssessmentTypeEnum b : AssessmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ASSESSMENT_TYPE = "assessment_type";
  private AssessmentTypeEnum assessmentType = null;

  public static final String JSON_PROPERTY_ASSESSOR_ID = "assessor_id";
  private JsonNullable<Object> assessorId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ARTIFACT_ATTEMPT = "artifact_attempt";
  private JsonNullable<Object> artifactAttempt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<Object> data = JsonNullable.<Object>of(null);

  public RubricAssessments() {
  }

  public RubricAssessments id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a rubric assessment record.
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


  public RubricAssessments userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The unique ID of a user.
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


  public RubricAssessments createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp showing when a &#x60;rubric_assessment&#x60; record was created.
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


  public RubricAssessments updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp showing when a &#x60;rubric_assessment&#x60; record was updated.
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


  public RubricAssessments rubricAssociationId(Object rubricAssociationId) {
    this.rubricAssociationId = JsonNullable.<Object>of(rubricAssociationId);
    
    return this;
  }

   /**
   * The ID of a rubric association (which links the rubric to an assignment that uses the rubric).
   * @return rubricAssociationId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRubricAssociationId() {
        return rubricAssociationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUBRIC_ASSOCIATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRubricAssociationId_JsonNullable() {
    return rubricAssociationId;
  }
  
  @JsonProperty(JSON_PROPERTY_RUBRIC_ASSOCIATION_ID)
  public void setRubricAssociationId_JsonNullable(JsonNullable<Object> rubricAssociationId) {
    this.rubricAssociationId = rubricAssociationId;
  }

  public void setRubricAssociationId(Object rubricAssociationId) {
    this.rubricAssociationId = JsonNullable.<Object>of(rubricAssociationId);
  }


  public RubricAssessments artifactId(Object artifactId) {
    
    this.artifactId = artifactId;
    return this;
  }

   /**
   * The submission or assignment identifier.
   * @return artifactId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIFACT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getArtifactId() {
    return artifactId;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArtifactId(Object artifactId) {
    this.artifactId = artifactId;
  }


  public RubricAssessments artifactType(ArtifactTypeEnum artifactType) {
    
    this.artifactType = artifactType;
    return this;
  }

   /**
   * The artifact type.
   * @return artifactType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIFACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ArtifactTypeEnum getArtifactType() {
    return artifactType;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArtifactType(ArtifactTypeEnum artifactType) {
    this.artifactType = artifactType;
  }


  public RubricAssessments hidePoints(Object hidePoints) {
    
    this.hidePoints = hidePoints;
    return this;
  }

   /**
   * Flag indicating a non-scoring rubric assessment.
   * @return hidePoints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHidePoints() {
    return hidePoints;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHidePoints(Object hidePoints) {
    this.hidePoints = hidePoints;
  }


  public RubricAssessments score(Object score) {
    this.score = JsonNullable.<Object>of(score);
    
    return this;
  }

   /**
   * Score of the assessment.
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


  public RubricAssessments rubricId(Object rubricId) {
    
    this.rubricId = rubricId;
    return this;
  }

   /**
   * The unique ID of a rubric.
   * @return rubricId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUBRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRubricId() {
    return rubricId;
  }


  @JsonProperty(JSON_PROPERTY_RUBRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRubricId(Object rubricId) {
    this.rubricId = rubricId;
  }


  public RubricAssessments assessmentType(AssessmentTypeEnum assessmentType) {
    
    this.assessmentType = assessmentType;
    return this;
  }

   /**
   * Type of assessment.
   * @return assessmentType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AssessmentTypeEnum getAssessmentType() {
    return assessmentType;
  }


  @JsonProperty(JSON_PROPERTY_ASSESSMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssessmentType(AssessmentTypeEnum assessmentType) {
    this.assessmentType = assessmentType;
  }


  public RubricAssessments assessorId(Object assessorId) {
    this.assessorId = JsonNullable.<Object>of(assessorId);
    
    return this;
  }

   /**
   * The unique ID of a user who assessed the submission.
   * @return assessorId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssessorId() {
        return assessorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSESSOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssessorId_JsonNullable() {
    return assessorId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSESSOR_ID)
  public void setAssessorId_JsonNullable(JsonNullable<Object> assessorId) {
    this.assessorId = assessorId;
  }

  public void setAssessorId(Object assessorId) {
    this.assessorId = JsonNullable.<Object>of(assessorId);
  }


  public RubricAssessments artifactAttempt(Object artifactAttempt) {
    this.artifactAttempt = JsonNullable.<Object>of(artifactAttempt);
    
    return this;
  }

   /**
   * The current number of attempts made on the object of the assessment.
   * @return artifactAttempt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getArtifactAttempt() {
        return artifactAttempt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARTIFACT_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getArtifactAttempt_JsonNullable() {
    return artifactAttempt;
  }
  
  @JsonProperty(JSON_PROPERTY_ARTIFACT_ATTEMPT)
  public void setArtifactAttempt_JsonNullable(JsonNullable<Object> artifactAttempt) {
    this.artifactAttempt = artifactAttempt;
  }

  public void setArtifactAttempt(Object artifactAttempt) {
    this.artifactAttempt = JsonNullable.<Object>of(artifactAttempt);
  }


  public RubricAssessments data(Object data) {
    this.data = JsonNullable.<Object>of(data);
    
    return this;
  }

   /**
   * Object containing all data related to assessment including score-break down and comments for each criterion.
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getData() {
        return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getData_JsonNullable() {
    return data;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<Object> data) {
    this.data = data;
  }

  public void setData(Object data) {
    this.data = JsonNullable.<Object>of(data);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RubricAssessments rubricAssessments = (RubricAssessments) o;
    return Objects.equals(this.id, rubricAssessments.id) &&
        equalsNullable(this.userId, rubricAssessments.userId) &&
        Objects.equals(this.createdAt, rubricAssessments.createdAt) &&
        Objects.equals(this.updatedAt, rubricAssessments.updatedAt) &&
        equalsNullable(this.rubricAssociationId, rubricAssessments.rubricAssociationId) &&
        Objects.equals(this.artifactId, rubricAssessments.artifactId) &&
        Objects.equals(this.artifactType, rubricAssessments.artifactType) &&
        Objects.equals(this.hidePoints, rubricAssessments.hidePoints) &&
        equalsNullable(this.score, rubricAssessments.score) &&
        Objects.equals(this.rubricId, rubricAssessments.rubricId) &&
        Objects.equals(this.assessmentType, rubricAssessments.assessmentType) &&
        equalsNullable(this.assessorId, rubricAssessments.assessorId) &&
        equalsNullable(this.artifactAttempt, rubricAssessments.artifactAttempt) &&
        equalsNullable(this.data, rubricAssessments.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(userId), createdAt, updatedAt, hashCodeNullable(rubricAssociationId), artifactId, artifactType, hidePoints, hashCodeNullable(score), rubricId, assessmentType, hashCodeNullable(assessorId), hashCodeNullable(artifactAttempt), hashCodeNullable(data));
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
    sb.append("class RubricAssessments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    rubricAssociationId: ").append(toIndentedString(rubricAssociationId)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
    sb.append("    hidePoints: ").append(toIndentedString(hidePoints)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    rubricId: ").append(toIndentedString(rubricId)).append("\n");
    sb.append("    assessmentType: ").append(toIndentedString(assessmentType)).append("\n");
    sb.append("    assessorId: ").append(toIndentedString(assessorId)).append("\n");
    sb.append("    artifactAttempt: ").append(toIndentedString(artifactAttempt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

