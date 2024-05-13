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
 * TypeExtractedFromColumnQuizQuestionsQuestionData
 */
@JsonPropertyOrder({
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_NEUTRAL_COMMENTS,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_ANSWERS,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_NAME,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_QUESTION_TYPE,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_QUESTION_TEXT,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_REGRADE_OPTION,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_CORRECT_COMMENTS,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_INCORRECT_COMMENTS,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_TEXT_AFTER_ANSWERS,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_MATCHING_ANSWER_INCORRECT_MATCHES,
  TypeExtractedFromColumnQuizQuestionsQuestionData.JSON_PROPERTY_POINTS_POSSIBLE
})
@JsonTypeName("Type_extracted_from_column__quiz_questions_question_data__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TypeExtractedFromColumnQuizQuestionsQuestionData {
  public static final String JSON_PROPERTY_NEUTRAL_COMMENTS = "neutral_comments";
  private JsonNullable<Object> neutralComments = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ANSWERS = "answers";
  private JsonNullable<Object> answers = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUESTION_TYPE = "question_type";
  private JsonNullable<Object> questionType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUESTION_TEXT = "question_text";
  private JsonNullable<Object> questionText = JsonNullable.<Object>of(null);

  /**
   * Denotes if regrading is available for the question. Possible values are &#x60;available&#x60; and &#x60;unavailable&#x60; for question types. Defaults to &#x60;available&#x60; for the allowed question types and NULL for the rest.
   */
  public enum RegradeOptionEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    AVAILABLE("available"),
    
    UNAVAILABLE("unavailable"),
    
    MULTIPLE_ANSWERS_QUESTION("multiple_answers_question"),
    
    MULTIPLE_CHOICE_QUESTION("multiple_choice_question"),
    
    TRUE_FALSE_QUESTION("true_false_question"),
    
    CURRENT_AND_PREVIOUS_CORRECT("current_and_previous_correct"),
    
    NO_REGRADE("no_regrade"),
    
    CURRENT_CORRECT_ONLY("current_correct_only"),
    
    FULL_CREDIT("full_credit"),
    
    DISABLED("disabled");

    private Object value;

    RegradeOptionEnum(Object value) {
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
    public static RegradeOptionEnum fromValue(Object value) {
      for (RegradeOptionEnum b : RegradeOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_REGRADE_OPTION = "regrade_option";
  private JsonNullable<RegradeOptionEnum> regradeOption = JsonNullable.<RegradeOptionEnum>of(null);

  public static final String JSON_PROPERTY_CORRECT_COMMENTS = "correct_comments";
  private JsonNullable<Object> correctComments = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INCORRECT_COMMENTS = "incorrect_comments";
  private JsonNullable<Object> incorrectComments = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEXT_AFTER_ANSWERS = "text_after_answers";
  private JsonNullable<Object> textAfterAnswers = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MATCHING_ANSWER_INCORRECT_MATCHES = "matching_answer_incorrect_matches";
  private JsonNullable<Object> matchingAnswerIncorrectMatches = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POINTS_POSSIBLE = "points_possible";
  private JsonNullable<Object> pointsPossible = JsonNullable.<Object>of(null);

  public TypeExtractedFromColumnQuizQuestionsQuestionData() {
  }

  public TypeExtractedFromColumnQuizQuestionsQuestionData neutralComments(Object neutralComments) {
    this.neutralComments = JsonNullable.<Object>of(neutralComments);
    
    return this;
  }

   /**
   * Comments to be displayed regardless of how the student answers the question.
   * @return neutralComments
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNeutralComments() {
        return neutralComments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEUTRAL_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNeutralComments_JsonNullable() {
    return neutralComments;
  }
  
  @JsonProperty(JSON_PROPERTY_NEUTRAL_COMMENTS)
  public void setNeutralComments_JsonNullable(JsonNullable<Object> neutralComments) {
    this.neutralComments = neutralComments;
  }

  public void setNeutralComments(Object neutralComments) {
    this.neutralComments = JsonNullable.<Object>of(neutralComments);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData answers(Object answers) {
    this.answers = JsonNullable.<Object>of(answers);
    
    return this;
  }

   /**
   * Collection of possible answers.
   * @return answers
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAnswers() {
        return answers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnswers_JsonNullable() {
    return answers;
  }
  
  @JsonProperty(JSON_PROPERTY_ANSWERS)
  public void setAnswers_JsonNullable(JsonNullable<Object> answers) {
    this.answers = answers;
  }

  public void setAnswers(Object answers) {
    this.answers = JsonNullable.<Object>of(answers);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * Name of the question.
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


  public TypeExtractedFromColumnQuizQuestionsQuestionData questionType(Object questionType) {
    this.questionType = JsonNullable.<Object>of(questionType);
    
    return this;
  }

   /**
   * Denotes the type of the question.
   * @return questionType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuestionType() {
        return questionType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuestionType_JsonNullable() {
    return questionType;
  }
  
  @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
  public void setQuestionType_JsonNullable(JsonNullable<Object> questionType) {
    this.questionType = questionType;
  }

  public void setQuestionType(Object questionType) {
    this.questionType = JsonNullable.<Object>of(questionType);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData questionText(Object questionText) {
    this.questionText = JsonNullable.<Object>of(questionText);
    
    return this;
  }

   /**
   * Text of the question.
   * @return questionText
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuestionText() {
        return questionText.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUESTION_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuestionText_JsonNullable() {
    return questionText;
  }
  
  @JsonProperty(JSON_PROPERTY_QUESTION_TEXT)
  public void setQuestionText_JsonNullable(JsonNullable<Object> questionText) {
    this.questionText = questionText;
  }

  public void setQuestionText(Object questionText) {
    this.questionText = JsonNullable.<Object>of(questionText);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData regradeOption(RegradeOptionEnum regradeOption) {
    this.regradeOption = JsonNullable.<RegradeOptionEnum>of(regradeOption);
    
    return this;
  }

   /**
   * Denotes if regrading is available for the question. Possible values are &#x60;available&#x60; and &#x60;unavailable&#x60; for question types. Defaults to &#x60;available&#x60; for the allowed question types and NULL for the rest.
   * @return regradeOption
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public RegradeOptionEnum getRegradeOption() {
        return regradeOption.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGRADE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RegradeOptionEnum> getRegradeOption_JsonNullable() {
    return regradeOption;
  }
  
  @JsonProperty(JSON_PROPERTY_REGRADE_OPTION)
  public void setRegradeOption_JsonNullable(JsonNullable<RegradeOptionEnum> regradeOption) {
    this.regradeOption = regradeOption;
  }

  public void setRegradeOption(RegradeOptionEnum regradeOption) {
    this.regradeOption = JsonNullable.<RegradeOptionEnum>of(regradeOption);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData correctComments(Object correctComments) {
    this.correctComments = JsonNullable.<Object>of(correctComments);
    
    return this;
  }

   /**
   * Comments to be displayed if the student answers the question correctly.
   * @return correctComments
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCorrectComments() {
        return correctComments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CORRECT_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCorrectComments_JsonNullable() {
    return correctComments;
  }
  
  @JsonProperty(JSON_PROPERTY_CORRECT_COMMENTS)
  public void setCorrectComments_JsonNullable(JsonNullable<Object> correctComments) {
    this.correctComments = correctComments;
  }

  public void setCorrectComments(Object correctComments) {
    this.correctComments = JsonNullable.<Object>of(correctComments);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData incorrectComments(Object incorrectComments) {
    this.incorrectComments = JsonNullable.<Object>of(incorrectComments);
    
    return this;
  }

   /**
   * Comments to be displayed if the student answers the question incorrectly neutral_comments: Comments to be displayed regardless of how the student answers the question.
   * @return incorrectComments
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIncorrectComments() {
        return incorrectComments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCORRECT_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIncorrectComments_JsonNullable() {
    return incorrectComments;
  }
  
  @JsonProperty(JSON_PROPERTY_INCORRECT_COMMENTS)
  public void setIncorrectComments_JsonNullable(JsonNullable<Object> incorrectComments) {
    this.incorrectComments = incorrectComments;
  }

  public void setIncorrectComments(Object incorrectComments) {
    this.incorrectComments = JsonNullable.<Object>of(incorrectComments);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData textAfterAnswers(Object textAfterAnswers) {
    this.textAfterAnswers = JsonNullable.<Object>of(textAfterAnswers);
    
    return this;
  }

   /**
   * (Used in *short_answer_question*, also known as *fill_in_the_blank*. Omitted for other question types) Text following the missing word.
   * @return textAfterAnswers
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTextAfterAnswers() {
        return textAfterAnswers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT_AFTER_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTextAfterAnswers_JsonNullable() {
    return textAfterAnswers;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT_AFTER_ANSWERS)
  public void setTextAfterAnswers_JsonNullable(JsonNullable<Object> textAfterAnswers) {
    this.textAfterAnswers = textAfterAnswers;
  }

  public void setTextAfterAnswers(Object textAfterAnswers) {
    this.textAfterAnswers = JsonNullable.<Object>of(textAfterAnswers);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData matchingAnswerIncorrectMatches(Object matchingAnswerIncorrectMatches) {
    this.matchingAnswerIncorrectMatches = JsonNullable.<Object>of(matchingAnswerIncorrectMatches);
    
    return this;
  }

   /**
   * (Used in *matching_question*. Omitted for other question types) List of distractors (incorrect answers), delimited by new lines, that will be seeded with all the *answer_match_right* values.
   * @return matchingAnswerIncorrectMatches
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMatchingAnswerIncorrectMatches() {
        return matchingAnswerIncorrectMatches.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATCHING_ANSWER_INCORRECT_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMatchingAnswerIncorrectMatches_JsonNullable() {
    return matchingAnswerIncorrectMatches;
  }
  
  @JsonProperty(JSON_PROPERTY_MATCHING_ANSWER_INCORRECT_MATCHES)
  public void setMatchingAnswerIncorrectMatches_JsonNullable(JsonNullable<Object> matchingAnswerIncorrectMatches) {
    this.matchingAnswerIncorrectMatches = matchingAnswerIncorrectMatches;
  }

  public void setMatchingAnswerIncorrectMatches(Object matchingAnswerIncorrectMatches) {
    this.matchingAnswerIncorrectMatches = JsonNullable.<Object>of(matchingAnswerIncorrectMatches);
  }


  public TypeExtractedFromColumnQuizQuestionsQuestionData pointsPossible(Object pointsPossible) {
    this.pointsPossible = JsonNullable.<Object>of(pointsPossible);
    
    return this;
  }

   /**
   * Maximum number of points that can be awarded for answering the question correctly.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeExtractedFromColumnQuizQuestionsQuestionData typeExtractedFromColumnQuizQuestionsQuestionData = (TypeExtractedFromColumnQuizQuestionsQuestionData) o;
    return equalsNullable(this.neutralComments, typeExtractedFromColumnQuizQuestionsQuestionData.neutralComments) &&
        equalsNullable(this.answers, typeExtractedFromColumnQuizQuestionsQuestionData.answers) &&
        equalsNullable(this.name, typeExtractedFromColumnQuizQuestionsQuestionData.name) &&
        equalsNullable(this.questionType, typeExtractedFromColumnQuizQuestionsQuestionData.questionType) &&
        equalsNullable(this.questionText, typeExtractedFromColumnQuizQuestionsQuestionData.questionText) &&
        equalsNullable(this.regradeOption, typeExtractedFromColumnQuizQuestionsQuestionData.regradeOption) &&
        equalsNullable(this.correctComments, typeExtractedFromColumnQuizQuestionsQuestionData.correctComments) &&
        equalsNullable(this.incorrectComments, typeExtractedFromColumnQuizQuestionsQuestionData.incorrectComments) &&
        equalsNullable(this.textAfterAnswers, typeExtractedFromColumnQuizQuestionsQuestionData.textAfterAnswers) &&
        equalsNullable(this.matchingAnswerIncorrectMatches, typeExtractedFromColumnQuizQuestionsQuestionData.matchingAnswerIncorrectMatches) &&
        equalsNullable(this.pointsPossible, typeExtractedFromColumnQuizQuestionsQuestionData.pointsPossible);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(neutralComments), hashCodeNullable(answers), hashCodeNullable(name), hashCodeNullable(questionType), hashCodeNullable(questionText), hashCodeNullable(regradeOption), hashCodeNullable(correctComments), hashCodeNullable(incorrectComments), hashCodeNullable(textAfterAnswers), hashCodeNullable(matchingAnswerIncorrectMatches), hashCodeNullable(pointsPossible));
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
    sb.append("class TypeExtractedFromColumnQuizQuestionsQuestionData {\n");
    sb.append("    neutralComments: ").append(toIndentedString(neutralComments)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    regradeOption: ").append(toIndentedString(regradeOption)).append("\n");
    sb.append("    correctComments: ").append(toIndentedString(correctComments)).append("\n");
    sb.append("    incorrectComments: ").append(toIndentedString(incorrectComments)).append("\n");
    sb.append("    textAfterAnswers: ").append(toIndentedString(textAfterAnswers)).append("\n");
    sb.append("    matchingAnswerIncorrectMatches: ").append(toIndentedString(matchingAnswerIncorrectMatches)).append("\n");
    sb.append("    pointsPossible: ").append(toIndentedString(pointsPossible)).append("\n");
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

