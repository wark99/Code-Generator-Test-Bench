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
import org.openapitools.client.model.OriginalityReportsErrorMessage;
import org.openapitools.client.model.OriginalityReportsLinkId;
import org.openapitools.client.model.OriginalityReportsOriginalityReportLtiUrl;
import org.openapitools.client.model.OriginalityReportsOriginalityReportUrl;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rows in this table are managed solely by LTI 2 tool providers that leverage the Canvas plagiarism detection platform.
 */
@JsonPropertyOrder({
  OriginalityReports.JSON_PROPERTY_ID,
  OriginalityReports.JSON_PROPERTY_ERROR_MESSAGE,
  OriginalityReports.JSON_PROPERTY_ATTACHMENT_ID,
  OriginalityReports.JSON_PROPERTY_SUBMISSION_ID,
  OriginalityReports.JSON_PROPERTY_CREATED_AT,
  OriginalityReports.JSON_PROPERTY_UPDATED_AT,
  OriginalityReports.JSON_PROPERTY_WORKFLOW_STATE,
  OriginalityReports.JSON_PROPERTY_ORIGINALITY_SCORE,
  OriginalityReports.JSON_PROPERTY_ORIGINALITY_REPORT_URL,
  OriginalityReports.JSON_PROPERTY_ORIGINALITY_REPORT_LTI_URL,
  OriginalityReports.JSON_PROPERTY_LINK_ID,
  OriginalityReports.JSON_PROPERTY_SUBMISSION_TIME
})
@JsonTypeName("originality_reports")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OriginalityReports {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private OriginalityReportsErrorMessage errorMessage;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachment_id";
  private JsonNullable<Object> attachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submission_id";
  private Object submissionId = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Workflow state of the originality report.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ERROR("error"),
    
    PENDING("pending"),
    
    SCORED("scored");

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

  public static final String JSON_PROPERTY_ORIGINALITY_SCORE = "originality_score";
  private JsonNullable<Object> originalityScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ORIGINALITY_REPORT_URL = "originality_report_url";
  private OriginalityReportsOriginalityReportUrl originalityReportUrl;

  public static final String JSON_PROPERTY_ORIGINALITY_REPORT_LTI_URL = "originality_report_lti_url";
  private OriginalityReportsOriginalityReportLtiUrl originalityReportLtiUrl;

  public static final String JSON_PROPERTY_LINK_ID = "link_id";
  private OriginalityReportsLinkId linkId;

  public static final String JSON_PROPERTY_SUBMISSION_TIME = "submission_time";
  private JsonNullable<Object> submissionTime = JsonNullable.<Object>of(null);

  public OriginalityReports() {
  }

  public OriginalityReports id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for an originality report record.
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


  public OriginalityReports errorMessage(OriginalityReportsErrorMessage errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OriginalityReportsErrorMessage getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(OriginalityReportsErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }


  public OriginalityReports attachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
    
    return this;
  }

   /**
   * The is of the attachment associated with the originality report.
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAttachmentId() {
        return attachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAttachmentId_JsonNullable() {
    return attachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  public void setAttachmentId_JsonNullable(JsonNullable<Object> attachmentId) {
    this.attachmentId = attachmentId;
  }

  public void setAttachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
  }


  public OriginalityReports submissionId(Object submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * ID of the submission associated with the originality report.
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSubmissionId() {
    return submissionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmissionId(Object submissionId) {
    this.submissionId = submissionId;
  }


  public OriginalityReports createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when an &#x60;originality_reports&#x60; record was created.
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


  public OriginalityReports updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when an &#x60;originality_reports&#x60; record was updated.
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


  public OriginalityReports workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Workflow state of the originality report.
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


  public OriginalityReports originalityScore(Object originalityScore) {
    this.originalityScore = JsonNullable.<Object>of(originalityScore);
    
    return this;
  }

   /**
   * A number ranging from 0-100 indicating the level of potential plagiarism.
   * @return originalityScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOriginalityScore() {
        return originalityScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINALITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOriginalityScore_JsonNullable() {
    return originalityScore;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINALITY_SCORE)
  public void setOriginalityScore_JsonNullable(JsonNullable<Object> originalityScore) {
    this.originalityScore = originalityScore;
  }

  public void setOriginalityScore(Object originalityScore) {
    this.originalityScore = JsonNullable.<Object>of(originalityScore);
  }


  public OriginalityReports originalityReportUrl(OriginalityReportsOriginalityReportUrl originalityReportUrl) {
    
    this.originalityReportUrl = originalityReportUrl;
    return this;
  }

   /**
   * Get originalityReportUrl
   * @return originalityReportUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINALITY_REPORT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OriginalityReportsOriginalityReportUrl getOriginalityReportUrl() {
    return originalityReportUrl;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINALITY_REPORT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalityReportUrl(OriginalityReportsOriginalityReportUrl originalityReportUrl) {
    this.originalityReportUrl = originalityReportUrl;
  }


  public OriginalityReports originalityReportLtiUrl(OriginalityReportsOriginalityReportLtiUrl originalityReportLtiUrl) {
    
    this.originalityReportLtiUrl = originalityReportLtiUrl;
    return this;
  }

   /**
   * Get originalityReportLtiUrl
   * @return originalityReportLtiUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINALITY_REPORT_LTI_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OriginalityReportsOriginalityReportLtiUrl getOriginalityReportLtiUrl() {
    return originalityReportLtiUrl;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINALITY_REPORT_LTI_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalityReportLtiUrl(OriginalityReportsOriginalityReportLtiUrl originalityReportLtiUrl) {
    this.originalityReportLtiUrl = originalityReportLtiUrl;
  }


  public OriginalityReports linkId(OriginalityReportsLinkId linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * Get linkId
   * @return linkId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OriginalityReportsLinkId getLinkId() {
    return linkId;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkId(OriginalityReportsLinkId linkId) {
    this.linkId = linkId;
  }


  public OriginalityReports submissionTime(Object submissionTime) {
    this.submissionTime = JsonNullable.<Object>of(submissionTime);
    
    return this;
  }

   /**
   * Time the submission was submitted.
   * @return submissionTime
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmissionTime() {
        return submissionTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmissionTime_JsonNullable() {
    return submissionTime;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_TIME)
  public void setSubmissionTime_JsonNullable(JsonNullable<Object> submissionTime) {
    this.submissionTime = submissionTime;
  }

  public void setSubmissionTime(Object submissionTime) {
    this.submissionTime = JsonNullable.<Object>of(submissionTime);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalityReports originalityReports = (OriginalityReports) o;
    return Objects.equals(this.id, originalityReports.id) &&
        Objects.equals(this.errorMessage, originalityReports.errorMessage) &&
        equalsNullable(this.attachmentId, originalityReports.attachmentId) &&
        Objects.equals(this.submissionId, originalityReports.submissionId) &&
        Objects.equals(this.createdAt, originalityReports.createdAt) &&
        Objects.equals(this.updatedAt, originalityReports.updatedAt) &&
        Objects.equals(this.workflowState, originalityReports.workflowState) &&
        equalsNullable(this.originalityScore, originalityReports.originalityScore) &&
        Objects.equals(this.originalityReportUrl, originalityReports.originalityReportUrl) &&
        Objects.equals(this.originalityReportLtiUrl, originalityReports.originalityReportLtiUrl) &&
        Objects.equals(this.linkId, originalityReports.linkId) &&
        equalsNullable(this.submissionTime, originalityReports.submissionTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, errorMessage, hashCodeNullable(attachmentId), submissionId, createdAt, updatedAt, workflowState, hashCodeNullable(originalityScore), originalityReportUrl, originalityReportLtiUrl, linkId, hashCodeNullable(submissionTime));
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
    sb.append("class OriginalityReports {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    originalityScore: ").append(toIndentedString(originalityScore)).append("\n");
    sb.append("    originalityReportUrl: ").append(toIndentedString(originalityReportUrl)).append("\n");
    sb.append("    originalityReportLtiUrl: ").append(toIndentedString(originalityReportLtiUrl)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
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

