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
import org.openapitools.client.model.LearningOutcomeQuestionResultsTitle;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LearningOutcomeQuestionResults
 */
@JsonPropertyOrder({
  LearningOutcomeQuestionResults.JSON_PROPERTY_ID,
  LearningOutcomeQuestionResults.JSON_PROPERTY_CREATED_AT,
  LearningOutcomeQuestionResults.JSON_PROPERTY_UPDATED_AT,
  LearningOutcomeQuestionResults.JSON_PROPERTY_LEARNING_OUTCOME_ID,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ASSOCIATED_ASSET_ID,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ASSOCIATED_ASSET_TYPE,
  LearningOutcomeQuestionResults.JSON_PROPERTY_LEARNING_OUTCOME_RESULT_ID,
  LearningOutcomeQuestionResults.JSON_PROPERTY_SCORE,
  LearningOutcomeQuestionResults.JSON_PROPERTY_POSSIBLE,
  LearningOutcomeQuestionResults.JSON_PROPERTY_MASTERY,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ATTEMPT,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ORIGINAL_SCORE,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ORIGINAL_POSSIBLE,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ORIGINAL_MASTERY,
  LearningOutcomeQuestionResults.JSON_PROPERTY_ASSESSED_AT,
  LearningOutcomeQuestionResults.JSON_PROPERTY_SUBMITTED_AT,
  LearningOutcomeQuestionResults.JSON_PROPERTY_PERCENT,
  LearningOutcomeQuestionResults.JSON_PROPERTY_TITLE
})
@JsonTypeName("learning_outcome_question_results")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LearningOutcomeQuestionResults {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_LEARNING_OUTCOME_ID = "learning_outcome_id";
  private JsonNullable<Object> learningOutcomeId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSOCIATED_ASSET_ID = "associated_asset_id";
  private JsonNullable<Object> associatedAssetId = JsonNullable.<Object>of(null);

  /**
   * Type of the associated asset (currently always Assessment Question).
   */
  public enum AssociatedAssetTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ASSESSMENTQUESTION("AssessmentQuestion");

    private Object value;

    AssociatedAssetTypeEnum(Object value) {
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
    public static AssociatedAssetTypeEnum fromValue(Object value) {
      for (AssociatedAssetTypeEnum b : AssociatedAssetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ASSOCIATED_ASSET_TYPE = "associated_asset_type";
  private AssociatedAssetTypeEnum associatedAssetType = null;

  public static final String JSON_PROPERTY_LEARNING_OUTCOME_RESULT_ID = "learning_outcome_result_id";
  private JsonNullable<Object> learningOutcomeResultId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCORE = "score";
  private JsonNullable<Object> score = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POSSIBLE = "possible";
  private JsonNullable<Object> possible = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MASTERY = "mastery";
  private JsonNullable<Object> mastery = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ATTEMPT = "attempt";
  private JsonNullable<Object> attempt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ORIGINAL_SCORE = "original_score";
  private JsonNullable<Object> originalScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ORIGINAL_POSSIBLE = "original_possible";
  private JsonNullable<Object> originalPossible = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ORIGINAL_MASTERY = "original_mastery";
  private JsonNullable<Object> originalMastery = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSESSED_AT = "assessed_at";
  private JsonNullable<Object> assessedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMITTED_AT = "submitted_at";
  private JsonNullable<Object> submittedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PERCENT = "percent";
  private JsonNullable<Object> percent = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TITLE = "title";
  private LearningOutcomeQuestionResultsTitle title;

  public LearningOutcomeQuestionResults() {
  }

  public LearningOutcomeQuestionResults id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a learning outcome question result record.
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


  public LearningOutcomeQuestionResults createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when a learning_outcome_question_results record was created.
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


  public LearningOutcomeQuestionResults updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a learning_outcome_question_results record was updated.
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


  public LearningOutcomeQuestionResults learningOutcomeId(Object learningOutcomeId) {
    this.learningOutcomeId = JsonNullable.<Object>of(learningOutcomeId);
    
    return this;
  }

   /**
   * Foreign key to the learning outcome this record is associated with.
   * @return learningOutcomeId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLearningOutcomeId() {
        return learningOutcomeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEARNING_OUTCOME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLearningOutcomeId_JsonNullable() {
    return learningOutcomeId;
  }
  
  @JsonProperty(JSON_PROPERTY_LEARNING_OUTCOME_ID)
  public void setLearningOutcomeId_JsonNullable(JsonNullable<Object> learningOutcomeId) {
    this.learningOutcomeId = learningOutcomeId;
  }

  public void setLearningOutcomeId(Object learningOutcomeId) {
    this.learningOutcomeId = JsonNullable.<Object>of(learningOutcomeId);
  }


  public LearningOutcomeQuestionResults associatedAssetId(Object associatedAssetId) {
    this.associatedAssetId = JsonNullable.<Object>of(associatedAssetId);
    
    return this;
  }

   /**
   * Polymorphic foreign key to the associated asset (currently always Assessment Question) used to generate this result.
   * @return associatedAssetId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssociatedAssetId() {
        return associatedAssetId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssociatedAssetId_JsonNullable() {
    return associatedAssetId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ASSET_ID)
  public void setAssociatedAssetId_JsonNullable(JsonNullable<Object> associatedAssetId) {
    this.associatedAssetId = associatedAssetId;
  }

  public void setAssociatedAssetId(Object associatedAssetId) {
    this.associatedAssetId = JsonNullable.<Object>of(associatedAssetId);
  }


  public LearningOutcomeQuestionResults associatedAssetType(AssociatedAssetTypeEnum associatedAssetType) {
    
    this.associatedAssetType = associatedAssetType;
    return this;
  }

   /**
   * Type of the associated asset (currently always Assessment Question).
   * @return associatedAssetType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AssociatedAssetTypeEnum getAssociatedAssetType() {
    return associatedAssetType;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssociatedAssetType(AssociatedAssetTypeEnum associatedAssetType) {
    this.associatedAssetType = associatedAssetType;
  }


  public LearningOutcomeQuestionResults learningOutcomeResultId(Object learningOutcomeResultId) {
    this.learningOutcomeResultId = JsonNullable.<Object>of(learningOutcomeResultId);
    
    return this;
  }

   /**
   * Identifies the learning outcome result.
   * @return learningOutcomeResultId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLearningOutcomeResultId() {
        return learningOutcomeResultId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEARNING_OUTCOME_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLearningOutcomeResultId_JsonNullable() {
    return learningOutcomeResultId;
  }
  
  @JsonProperty(JSON_PROPERTY_LEARNING_OUTCOME_RESULT_ID)
  public void setLearningOutcomeResultId_JsonNullable(JsonNullable<Object> learningOutcomeResultId) {
    this.learningOutcomeResultId = learningOutcomeResultId;
  }

  public void setLearningOutcomeResultId(Object learningOutcomeResultId) {
    this.learningOutcomeResultId = JsonNullable.<Object>of(learningOutcomeResultId);
  }


  public LearningOutcomeQuestionResults score(Object score) {
    this.score = JsonNullable.<Object>of(score);
    
    return this;
  }

   /**
   * The student&#39;s score.
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


  public LearningOutcomeQuestionResults possible(Object possible) {
    this.possible = JsonNullable.<Object>of(possible);
    
    return this;
  }

   /**
   * Total number of points possible.
   * @return possible
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPossible() {
        return possible.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPossible_JsonNullable() {
    return possible;
  }
  
  @JsonProperty(JSON_PROPERTY_POSSIBLE)
  public void setPossible_JsonNullable(JsonNullable<Object> possible) {
    this.possible = possible;
  }

  public void setPossible(Object possible) {
    this.possible = JsonNullable.<Object>of(possible);
  }


  public LearningOutcomeQuestionResults mastery(Object mastery) {
    this.mastery = JsonNullable.<Object>of(mastery);
    
    return this;
  }

   /**
   * Boolean indicating whether user achieved mastery.
   * @return mastery
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMastery() {
        return mastery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MASTERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMastery_JsonNullable() {
    return mastery;
  }
  
  @JsonProperty(JSON_PROPERTY_MASTERY)
  public void setMastery_JsonNullable(JsonNullable<Object> mastery) {
    this.mastery = mastery;
  }

  public void setMastery(Object mastery) {
    this.mastery = JsonNullable.<Object>of(mastery);
  }


  public LearningOutcomeQuestionResults attempt(Object attempt) {
    this.attempt = JsonNullable.<Object>of(attempt);
    
    return this;
  }

   /**
   * The total number of attempts, or submissions.
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


  public LearningOutcomeQuestionResults originalScore(Object originalScore) {
    this.originalScore = JsonNullable.<Object>of(originalScore);
    
    return this;
  }

   /**
   * Score on the first attempt.
   * @return originalScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOriginalScore() {
        return originalScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINAL_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOriginalScore_JsonNullable() {
    return originalScore;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL_SCORE)
  public void setOriginalScore_JsonNullable(JsonNullable<Object> originalScore) {
    this.originalScore = originalScore;
  }

  public void setOriginalScore(Object originalScore) {
    this.originalScore = JsonNullable.<Object>of(originalScore);
  }


  public LearningOutcomeQuestionResults originalPossible(Object originalPossible) {
    this.originalPossible = JsonNullable.<Object>of(originalPossible);
    
    return this;
  }

   /**
   * Possible points on the first attempt.
   * @return originalPossible
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOriginalPossible() {
        return originalPossible.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINAL_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOriginalPossible_JsonNullable() {
    return originalPossible;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL_POSSIBLE)
  public void setOriginalPossible_JsonNullable(JsonNullable<Object> originalPossible) {
    this.originalPossible = originalPossible;
  }

  public void setOriginalPossible(Object originalPossible) {
    this.originalPossible = JsonNullable.<Object>of(originalPossible);
  }


  public LearningOutcomeQuestionResults originalMastery(Object originalMastery) {
    this.originalMastery = JsonNullable.<Object>of(originalMastery);
    
    return this;
  }

   /**
   * Boolean indicating whether user achieved mastery.
   * @return originalMastery
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOriginalMastery() {
        return originalMastery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINAL_MASTERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOriginalMastery_JsonNullable() {
    return originalMastery;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MASTERY)
  public void setOriginalMastery_JsonNullable(JsonNullable<Object> originalMastery) {
    this.originalMastery = originalMastery;
  }

  public void setOriginalMastery(Object originalMastery) {
    this.originalMastery = JsonNullable.<Object>of(originalMastery);
  }


  public LearningOutcomeQuestionResults assessedAt(Object assessedAt) {
    this.assessedAt = JsonNullable.<Object>of(assessedAt);
    
    return this;
  }

   /**
   * Time when answer was assessed.
   * @return assessedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssessedAt() {
        return assessedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSESSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssessedAt_JsonNullable() {
    return assessedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSESSED_AT)
  public void setAssessedAt_JsonNullable(JsonNullable<Object> assessedAt) {
    this.assessedAt = assessedAt;
  }

  public void setAssessedAt(Object assessedAt) {
    this.assessedAt = JsonNullable.<Object>of(assessedAt);
  }


  public LearningOutcomeQuestionResults submittedAt(Object submittedAt) {
    this.submittedAt = JsonNullable.<Object>of(submittedAt);
    
    return this;
  }

   /**
   * Time when answer was submitted.
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


  public LearningOutcomeQuestionResults percent(Object percent) {
    this.percent = JsonNullable.<Object>of(percent);
    
    return this;
  }

   /**
   * Score&#39;s percent of maximum points possible for outcome, scaled to reflect any custom mastery levels that differ from the learning outcome.
   * @return percent
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPercent() {
        return percent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPercent_JsonNullable() {
    return percent;
  }
  
  @JsonProperty(JSON_PROPERTY_PERCENT)
  public void setPercent_JsonNullable(JsonNullable<Object> percent) {
    this.percent = percent;
  }

  public void setPercent(Object percent) {
    this.percent = JsonNullable.<Object>of(percent);
  }


  public LearningOutcomeQuestionResults title(LearningOutcomeQuestionResultsTitle title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LearningOutcomeQuestionResultsTitle getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(LearningOutcomeQuestionResultsTitle title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningOutcomeQuestionResults learningOutcomeQuestionResults = (LearningOutcomeQuestionResults) o;
    return Objects.equals(this.id, learningOutcomeQuestionResults.id) &&
        Objects.equals(this.createdAt, learningOutcomeQuestionResults.createdAt) &&
        Objects.equals(this.updatedAt, learningOutcomeQuestionResults.updatedAt) &&
        equalsNullable(this.learningOutcomeId, learningOutcomeQuestionResults.learningOutcomeId) &&
        equalsNullable(this.associatedAssetId, learningOutcomeQuestionResults.associatedAssetId) &&
        Objects.equals(this.associatedAssetType, learningOutcomeQuestionResults.associatedAssetType) &&
        equalsNullable(this.learningOutcomeResultId, learningOutcomeQuestionResults.learningOutcomeResultId) &&
        equalsNullable(this.score, learningOutcomeQuestionResults.score) &&
        equalsNullable(this.possible, learningOutcomeQuestionResults.possible) &&
        equalsNullable(this.mastery, learningOutcomeQuestionResults.mastery) &&
        equalsNullable(this.attempt, learningOutcomeQuestionResults.attempt) &&
        equalsNullable(this.originalScore, learningOutcomeQuestionResults.originalScore) &&
        equalsNullable(this.originalPossible, learningOutcomeQuestionResults.originalPossible) &&
        equalsNullable(this.originalMastery, learningOutcomeQuestionResults.originalMastery) &&
        equalsNullable(this.assessedAt, learningOutcomeQuestionResults.assessedAt) &&
        equalsNullable(this.submittedAt, learningOutcomeQuestionResults.submittedAt) &&
        equalsNullable(this.percent, learningOutcomeQuestionResults.percent) &&
        Objects.equals(this.title, learningOutcomeQuestionResults.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, hashCodeNullable(learningOutcomeId), hashCodeNullable(associatedAssetId), associatedAssetType, hashCodeNullable(learningOutcomeResultId), hashCodeNullable(score), hashCodeNullable(possible), hashCodeNullable(mastery), hashCodeNullable(attempt), hashCodeNullable(originalScore), hashCodeNullable(originalPossible), hashCodeNullable(originalMastery), hashCodeNullable(assessedAt), hashCodeNullable(submittedAt), hashCodeNullable(percent), title);
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
    sb.append("class LearningOutcomeQuestionResults {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    learningOutcomeId: ").append(toIndentedString(learningOutcomeId)).append("\n");
    sb.append("    associatedAssetId: ").append(toIndentedString(associatedAssetId)).append("\n");
    sb.append("    associatedAssetType: ").append(toIndentedString(associatedAssetType)).append("\n");
    sb.append("    learningOutcomeResultId: ").append(toIndentedString(learningOutcomeResultId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    possible: ").append(toIndentedString(possible)).append("\n");
    sb.append("    mastery: ").append(toIndentedString(mastery)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    originalScore: ").append(toIndentedString(originalScore)).append("\n");
    sb.append("    originalPossible: ").append(toIndentedString(originalPossible)).append("\n");
    sb.append("    originalMastery: ").append(toIndentedString(originalMastery)).append("\n");
    sb.append("    assessedAt: ").append(toIndentedString(assessedAt)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

