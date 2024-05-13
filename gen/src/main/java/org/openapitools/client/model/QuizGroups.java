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
 * QuizGroups
 */
@JsonPropertyOrder({
  QuizGroups.JSON_PROPERTY_ID,
  QuizGroups.JSON_PROPERTY_NAME,
  QuizGroups.JSON_PROPERTY_CREATED_AT,
  QuizGroups.JSON_PROPERTY_UPDATED_AT,
  QuizGroups.JSON_PROPERTY_ASSESSMENT_QUESTION_BANK_ID,
  QuizGroups.JSON_PROPERTY_QUIZ_ID,
  QuizGroups.JSON_PROPERTY_MIGRATION_ID,
  QuizGroups.JSON_PROPERTY_PICK_COUNT,
  QuizGroups.JSON_PROPERTY_QUESTION_POINTS,
  QuizGroups.JSON_PROPERTY_POSITION
})
@JsonTypeName("quiz_groups")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizGroups {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_ASSESSMENT_QUESTION_BANK_ID = "assessment_question_bank_id";
  private JsonNullable<Object> assessmentQuestionBankId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUIZ_ID = "quiz_id";
  private Object quizId = null;

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PICK_COUNT = "pick_count";
  private JsonNullable<Object> pickCount = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUESTION_POINTS = "question_points";
  private JsonNullable<Object> questionPoints = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public QuizGroups() {
  }

  public QuizGroups id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the question group.
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


  public QuizGroups name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * The name of the question group.
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


  public QuizGroups createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time when the quiz question was created.
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


  public QuizGroups updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time when the quiz question was last updated.
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


  public QuizGroups assessmentQuestionBankId(Object assessmentQuestionBankId) {
    this.assessmentQuestionBankId = JsonNullable.<Object>of(assessmentQuestionBankId);
    
    return this;
  }

   /**
   * The ID of the Assessment question bank to pull questions from.
   * @return assessmentQuestionBankId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssessmentQuestionBankId() {
        return assessmentQuestionBankId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSESSMENT_QUESTION_BANK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssessmentQuestionBankId_JsonNullable() {
    return assessmentQuestionBankId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSESSMENT_QUESTION_BANK_ID)
  public void setAssessmentQuestionBankId_JsonNullable(JsonNullable<Object> assessmentQuestionBankId) {
    this.assessmentQuestionBankId = assessmentQuestionBankId;
  }

  public void setAssessmentQuestionBankId(Object assessmentQuestionBankId) {
    this.assessmentQuestionBankId = JsonNullable.<Object>of(assessmentQuestionBankId);
  }


  public QuizGroups quizId(Object quizId) {
    
    this.quizId = quizId;
    return this;
  }

   /**
   * The ID of the Quiz the question group belongs to.
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


  public QuizGroups migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported the quiz group.
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


  public QuizGroups pickCount(Object pickCount) {
    this.pickCount = JsonNullable.<Object>of(pickCount);
    
    return this;
  }

   /**
   * The number of questions to pick from the group to display to the student.
   * @return pickCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPickCount() {
        return pickCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PICK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPickCount_JsonNullable() {
    return pickCount;
  }
  
  @JsonProperty(JSON_PROPERTY_PICK_COUNT)
  public void setPickCount_JsonNullable(JsonNullable<Object> pickCount) {
    this.pickCount = pickCount;
  }

  public void setPickCount(Object pickCount) {
    this.pickCount = JsonNullable.<Object>of(pickCount);
  }


  public QuizGroups questionPoints(Object questionPoints) {
    this.questionPoints = JsonNullable.<Object>of(questionPoints);
    
    return this;
  }

   /**
   * The amount of points allotted to each question in the group.
   * @return questionPoints
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuestionPoints() {
        return questionPoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUESTION_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuestionPoints_JsonNullable() {
    return questionPoints;
  }
  
  @JsonProperty(JSON_PROPERTY_QUESTION_POINTS)
  public void setQuestionPoints_JsonNullable(JsonNullable<Object> questionPoints) {
    this.questionPoints = questionPoints;
  }

  public void setQuestionPoints(Object questionPoints) {
    this.questionPoints = JsonNullable.<Object>of(questionPoints);
  }


  public QuizGroups position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * The order in which the question group will be retrieved and displayed.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizGroups quizGroups = (QuizGroups) o;
    return Objects.equals(this.id, quizGroups.id) &&
        equalsNullable(this.name, quizGroups.name) &&
        Objects.equals(this.createdAt, quizGroups.createdAt) &&
        Objects.equals(this.updatedAt, quizGroups.updatedAt) &&
        equalsNullable(this.assessmentQuestionBankId, quizGroups.assessmentQuestionBankId) &&
        Objects.equals(this.quizId, quizGroups.quizId) &&
        equalsNullable(this.migrationId, quizGroups.migrationId) &&
        equalsNullable(this.pickCount, quizGroups.pickCount) &&
        equalsNullable(this.questionPoints, quizGroups.questionPoints) &&
        equalsNullable(this.position, quizGroups.position);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), createdAt, updatedAt, hashCodeNullable(assessmentQuestionBankId), quizId, hashCodeNullable(migrationId), hashCodeNullable(pickCount), hashCodeNullable(questionPoints), hashCodeNullable(position));
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
    sb.append("class QuizGroups {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    assessmentQuestionBankId: ").append(toIndentedString(assessmentQuestionBankId)).append("\n");
    sb.append("    quizId: ").append(toIndentedString(quizId)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    pickCount: ").append(toIndentedString(pickCount)).append("\n");
    sb.append("    questionPoints: ").append(toIndentedString(questionPoints)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

