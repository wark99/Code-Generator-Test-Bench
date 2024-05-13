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
import org.openapitools.client.model.AssessmentQuestionsName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The column &#x60;question_data&#x60; stores a variety of question data related points such as:     * &#x60;question_type&#x60; denotes the type of the question. Possible values are:             - &#x60;calculated_question&#x60;             - &#x60;essay_question&#x60;             - &#x60;file_upload_question&#x60;             - &#x60;fill_in_multiple_blanks_question&#x60;             - &#x60;matching_question&#x60;             - &#x60;multiple_answers_question&#x60;             - &#x60;multiple_choice_question&#x60;             - &#x60;multiple_dropdowns_question&#x60;             - &#x60;numerical_question&#x60;,             - &#x60;short_answer_question&#x60;             - &#x60;text_only_question&#x60;             - &#x60;true_false_question&#x60;     * &#x60;question_text&#x60; is the text of the question.     * &#x60;regrade_option&#x60; denotes if regrading is available for the question. Possible values are: &#x60;available&#x60;       and &#x60;unavailable&#x60; for question types &#x60;multiple_answers_question&#x60;, &#x60;multiple_choice_question&#x60;,       &#x60;true_false_question&#x60;, and NULL for others. Defaults to &#x60;available&#x60; for the allowed question types, and NULL       for the rest.     * &#x60;correct_comments&#x60; are comments to be displayed if the student answers the question correctly.     * &#x60;incorrect_comments&#x60; are comments to be displayed if the student answers the question incorrectly.     * &#x60;neutral_comments&#x60; are comments to be displayed regardless of how the student answers the question.     * &#x60;answers&#x60; is a JSON array of all possible answers.
 */
@JsonPropertyOrder({
  AssessmentQuestions.JSON_PROPERTY_ID,
  AssessmentQuestions.JSON_PROPERTY_NAME,
  AssessmentQuestions.JSON_PROPERTY_DELETED_AT,
  AssessmentQuestions.JSON_PROPERTY_CREATED_AT,
  AssessmentQuestions.JSON_PROPERTY_UPDATED_AT,
  AssessmentQuestions.JSON_PROPERTY_WORKFLOW_STATE,
  AssessmentQuestions.JSON_PROPERTY_CONTEXT_ID,
  AssessmentQuestions.JSON_PROPERTY_CONTEXT_TYPE,
  AssessmentQuestions.JSON_PROPERTY_QUESTION_DATA,
  AssessmentQuestions.JSON_PROPERTY_ASSESSMENT_QUESTION_BANK_ID,
  AssessmentQuestions.JSON_PROPERTY_MIGRATION_ID,
  AssessmentQuestions.JSON_PROPERTY_POSITION
})
@JsonTypeName("assessment_questions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AssessmentQuestions {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private AssessmentQuestionsName name;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Object> createdAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  /**
   * Life-cycle state for the quiz question.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    INDEPENDENTLY_EDITED("independently_edited"),
    
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
  private JsonNullable<WorkflowStateEnum> workflowState = JsonNullable.<WorkflowStateEnum>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private JsonNullable<Object> contextId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_TYPE = "context_type";
  private JsonNullable<Object> contextType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUESTION_DATA = "question_data";
  private JsonNullable<Object> questionData = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSESSMENT_QUESTION_BANK_ID = "assessment_question_bank_id";
  private JsonNullable<Object> assessmentQuestionBankId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  public AssessmentQuestions() {
  }

  public AssessmentQuestions id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the Assessment Question.
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


  public AssessmentQuestions name(AssessmentQuestionsName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssessmentQuestionsName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(AssessmentQuestionsName name) {
    this.name = name;
  }


  public AssessmentQuestions deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * The time the question was deleted. If the question has not been deleted the value will be NULL.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDeletedAt() {
        return deletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDeletedAt_JsonNullable() {
    return deletedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  public void setDeletedAt_JsonNullable(JsonNullable<Object> deletedAt) {
    this.deletedAt = deletedAt;
  }

  public void setDeletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
  }


  public AssessmentQuestions createdAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
    
    return this;
  }

   /**
   * Time when the quiz question was created.
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


  public AssessmentQuestions updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Time when the quiz question was last updated.
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


  public AssessmentQuestions workflowState(WorkflowStateEnum workflowState) {
    this.workflowState = JsonNullable.<WorkflowStateEnum>of(workflowState);
    
    return this;
  }

   /**
   * Life-cycle state for the quiz question.
   * @return workflowState
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WorkflowStateEnum getWorkflowState() {
        return workflowState.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORKFLOW_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkflowStateEnum> getWorkflowState_JsonNullable() {
    return workflowState;
  }
  
  @JsonProperty(JSON_PROPERTY_WORKFLOW_STATE)
  public void setWorkflowState_JsonNullable(JsonNullable<WorkflowStateEnum> workflowState) {
    this.workflowState = workflowState;
  }

  public void setWorkflowState(WorkflowStateEnum workflowState) {
    this.workflowState = JsonNullable.<WorkflowStateEnum>of(workflowState);
  }


  public AssessmentQuestions contextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
    
    return this;
  }

   /**
   * The unique identifier for the question bank&#39;s context (account or course). No longer used as Canvas delegates to &#x60;context_id&#x60; of the associated AssessmentQuestion.
   * @return contextId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContextId() {
        return contextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContextId_JsonNullable() {
    return contextId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  public void setContextId_JsonNullable(JsonNullable<Object> contextId) {
    this.contextId = contextId;
  }

  public void setContextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
  }


  public AssessmentQuestions contextType(Object contextType) {
    this.contextType = JsonNullable.<Object>of(contextType);
    
    return this;
  }

   /**
   * The type of context the question bank is associated with. No longer used as Canvas delegates to the context of the associated AssessmentQuestion.
   * @return contextType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContextType() {
        return contextType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContextType_JsonNullable() {
    return contextType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  public void setContextType_JsonNullable(JsonNullable<Object> contextType) {
    this.contextType = contextType;
  }

  public void setContextType(Object contextType) {
    this.contextType = JsonNullable.<Object>of(contextType);
  }


  public AssessmentQuestions questionData(Object questionData) {
    this.questionData = JsonNullable.<Object>of(questionData);
    
    return this;
  }

   /**
   * A variety of question data related points.
   * @return questionData
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuestionData() {
        return questionData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUESTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuestionData_JsonNullable() {
    return questionData;
  }
  
  @JsonProperty(JSON_PROPERTY_QUESTION_DATA)
  public void setQuestionData_JsonNullable(JsonNullable<Object> questionData) {
    this.questionData = questionData;
  }

  public void setQuestionData(Object questionData) {
    this.questionData = JsonNullable.<Object>of(questionData);
  }


  public AssessmentQuestions assessmentQuestionBankId(Object assessmentQuestionBankId) {
    this.assessmentQuestionBankId = JsonNullable.<Object>of(assessmentQuestionBankId);
    
    return this;
  }

   /**
   * The unique identifier for the assessment question bank this question is associated with.
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


  public AssessmentQuestions migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported this assessment question.
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


  public AssessmentQuestions position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * The position of the question.
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
    AssessmentQuestions assessmentQuestions = (AssessmentQuestions) o;
    return Objects.equals(this.id, assessmentQuestions.id) &&
        Objects.equals(this.name, assessmentQuestions.name) &&
        equalsNullable(this.deletedAt, assessmentQuestions.deletedAt) &&
        equalsNullable(this.createdAt, assessmentQuestions.createdAt) &&
        equalsNullable(this.updatedAt, assessmentQuestions.updatedAt) &&
        equalsNullable(this.workflowState, assessmentQuestions.workflowState) &&
        equalsNullable(this.contextId, assessmentQuestions.contextId) &&
        equalsNullable(this.contextType, assessmentQuestions.contextType) &&
        equalsNullable(this.questionData, assessmentQuestions.questionData) &&
        equalsNullable(this.assessmentQuestionBankId, assessmentQuestions.assessmentQuestionBankId) &&
        equalsNullable(this.migrationId, assessmentQuestions.migrationId) &&
        equalsNullable(this.position, assessmentQuestions.position);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(deletedAt), hashCodeNullable(createdAt), hashCodeNullable(updatedAt), hashCodeNullable(workflowState), hashCodeNullable(contextId), hashCodeNullable(contextType), hashCodeNullable(questionData), hashCodeNullable(assessmentQuestionBankId), hashCodeNullable(migrationId), hashCodeNullable(position));
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
    sb.append("class AssessmentQuestions {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    questionData: ").append(toIndentedString(questionData)).append("\n");
    sb.append("    assessmentQuestionBankId: ").append(toIndentedString(assessmentQuestionBankId)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
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

