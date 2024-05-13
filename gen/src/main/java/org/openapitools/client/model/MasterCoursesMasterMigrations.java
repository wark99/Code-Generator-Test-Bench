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
import org.openapitools.client.model.MasterCoursesMasterMigrationsComment;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MasterCoursesMasterMigrations
 */
@JsonPropertyOrder({
  MasterCoursesMasterMigrations.JSON_PROPERTY_ID,
  MasterCoursesMasterMigrations.JSON_PROPERTY_COMMENT,
  MasterCoursesMasterMigrations.JSON_PROPERTY_USER_ID,
  MasterCoursesMasterMigrations.JSON_PROPERTY_CREATED_AT,
  MasterCoursesMasterMigrations.JSON_PROPERTY_UPDATED_AT,
  MasterCoursesMasterMigrations.JSON_PROPERTY_WORKFLOW_STATE,
  MasterCoursesMasterMigrations.JSON_PROPERTY_MIGRATION_SETTINGS,
  MasterCoursesMasterMigrations.JSON_PROPERTY_EXPORT_RESULTS,
  MasterCoursesMasterMigrations.JSON_PROPERTY_EXPORTS_STARTED_AT,
  MasterCoursesMasterMigrations.JSON_PROPERTY_IMPORTS_QUEUED_AT,
  MasterCoursesMasterMigrations.JSON_PROPERTY_IMPORTS_COMPLETED_AT,
  MasterCoursesMasterMigrations.JSON_PROPERTY_SEND_NOTIFICATION,
  MasterCoursesMasterMigrations.JSON_PROPERTY_MASTER_TEMPLATE_ID
})
@JsonTypeName("master_courses_master_migrations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MasterCoursesMasterMigrations {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private MasterCoursesMasterMigrationsComment comment;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Current state of the sync event.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COMPLETED("completed"),
    
    CREATED("created"),
    
    EXPORTING("exporting"),
    
    EXPORTS_FAILED("exports_failed"),
    
    IMPORTS_FAILED("imports_failed"),
    
    IMPORTS_QUEUED("imports_queued"),
    
    QUEUED("queued");

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

  public static final String JSON_PROPERTY_MIGRATION_SETTINGS = "migration_settings";
  private JsonNullable<Object> migrationSettings = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXPORT_RESULTS = "export_results";
  private JsonNullable<Object> exportResults = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXPORTS_STARTED_AT = "exports_started_at";
  private JsonNullable<Object> exportsStartedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IMPORTS_QUEUED_AT = "imports_queued_at";
  private JsonNullable<Object> importsQueuedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IMPORTS_COMPLETED_AT = "imports_completed_at";
  private JsonNullable<Object> importsCompletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SEND_NOTIFICATION = "send_notification";
  private Object sendNotification = null;

  public static final String JSON_PROPERTY_MASTER_TEMPLATE_ID = "master_template_id";
  private Object masterTemplateId = null;

  public MasterCoursesMasterMigrations() {
  }

  public MasterCoursesMasterMigrations id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a master courses master migrations record.
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


  public MasterCoursesMasterMigrations comment(MasterCoursesMasterMigrationsComment comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MasterCoursesMasterMigrationsComment getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(MasterCoursesMasterMigrationsComment comment) {
    this.comment = comment;
  }


  public MasterCoursesMasterMigrations userId(Object userId) {
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


  public MasterCoursesMasterMigrations createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp showing when a master_courses_master_migrations record was created.
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


  public MasterCoursesMasterMigrations updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp showing when a master_courses_master_migrations record was updated.
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


  public MasterCoursesMasterMigrations workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Current state of the sync event.
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


  public MasterCoursesMasterMigrations migrationSettings(Object migrationSettings) {
    this.migrationSettings = JsonNullable.<Object>of(migrationSettings);
    
    return this;
  }

   /**
   * Optional settings for the sync event (such as whether to include course settings).
   * @return migrationSettings
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMigrationSettings() {
        return migrationSettings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMigrationSettings_JsonNullable() {
    return migrationSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_MIGRATION_SETTINGS)
  public void setMigrationSettings_JsonNullable(JsonNullable<Object> migrationSettings) {
    this.migrationSettings = migrationSettings;
  }

  public void setMigrationSettings(Object migrationSettings) {
    this.migrationSettings = JsonNullable.<Object>of(migrationSettings);
  }


  public MasterCoursesMasterMigrations exportResults(Object exportResults) {
    this.exportResults = JsonNullable.<Object>of(exportResults);
    
    return this;
  }

   /**
   * Record of which associated courses received full exports and which ones received partial (selective) ones.
   * @return exportResults
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExportResults() {
        return exportResults.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPORT_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExportResults_JsonNullable() {
    return exportResults;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPORT_RESULTS)
  public void setExportResults_JsonNullable(JsonNullable<Object> exportResults) {
    this.exportResults = exportResults;
  }

  public void setExportResults(Object exportResults) {
    this.exportResults = JsonNullable.<Object>of(exportResults);
  }


  public MasterCoursesMasterMigrations exportsStartedAt(Object exportsStartedAt) {
    this.exportsStartedAt = JsonNullable.<Object>of(exportsStartedAt);
    
    return this;
  }

   /**
   * Timestamp showing when exports started being generated from the blueprint course.
   * @return exportsStartedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExportsStartedAt() {
        return exportsStartedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPORTS_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExportsStartedAt_JsonNullable() {
    return exportsStartedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPORTS_STARTED_AT)
  public void setExportsStartedAt_JsonNullable(JsonNullable<Object> exportsStartedAt) {
    this.exportsStartedAt = exportsStartedAt;
  }

  public void setExportsStartedAt(Object exportsStartedAt) {
    this.exportsStartedAt = JsonNullable.<Object>of(exportsStartedAt);
  }


  public MasterCoursesMasterMigrations importsQueuedAt(Object importsQueuedAt) {
    this.importsQueuedAt = JsonNullable.<Object>of(importsQueuedAt);
    
    return this;
  }

   /**
   * Timestamp showing when imports started being queued into the associated courses.
   * @return importsQueuedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getImportsQueuedAt() {
        return importsQueuedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMPORTS_QUEUED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getImportsQueuedAt_JsonNullable() {
    return importsQueuedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_IMPORTS_QUEUED_AT)
  public void setImportsQueuedAt_JsonNullable(JsonNullable<Object> importsQueuedAt) {
    this.importsQueuedAt = importsQueuedAt;
  }

  public void setImportsQueuedAt(Object importsQueuedAt) {
    this.importsQueuedAt = JsonNullable.<Object>of(importsQueuedAt);
  }


  public MasterCoursesMasterMigrations importsCompletedAt(Object importsCompletedAt) {
    this.importsCompletedAt = JsonNullable.<Object>of(importsCompletedAt);
    
    return this;
  }

   /**
   * Timestamp showing when all imports into associated courses completed.
   * @return importsCompletedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getImportsCompletedAt() {
        return importsCompletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMPORTS_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getImportsCompletedAt_JsonNullable() {
    return importsCompletedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_IMPORTS_COMPLETED_AT)
  public void setImportsCompletedAt_JsonNullable(JsonNullable<Object> importsCompletedAt) {
    this.importsCompletedAt = importsCompletedAt;
  }

  public void setImportsCompletedAt(Object importsCompletedAt) {
    this.importsCompletedAt = JsonNullable.<Object>of(importsCompletedAt);
  }


  public MasterCoursesMasterMigrations sendNotification(Object sendNotification) {
    
    this.sendNotification = sendNotification;
    return this;
  }

   /**
   * Whether to generate notifications around the sync event.
   * @return sendNotification
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSendNotification() {
    return sendNotification;
  }


  @JsonProperty(JSON_PROPERTY_SEND_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSendNotification(Object sendNotification) {
    this.sendNotification = sendNotification;
  }


  public MasterCoursesMasterMigrations masterTemplateId(Object masterTemplateId) {
    
    this.masterTemplateId = masterTemplateId;
    return this;
  }

   /**
   * The ID of a template that belongs to the blueprint course.
   * @return masterTemplateId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMasterTemplateId() {
    return masterTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMasterTemplateId(Object masterTemplateId) {
    this.masterTemplateId = masterTemplateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterCoursesMasterMigrations masterCoursesMasterMigrations = (MasterCoursesMasterMigrations) o;
    return Objects.equals(this.id, masterCoursesMasterMigrations.id) &&
        Objects.equals(this.comment, masterCoursesMasterMigrations.comment) &&
        equalsNullable(this.userId, masterCoursesMasterMigrations.userId) &&
        Objects.equals(this.createdAt, masterCoursesMasterMigrations.createdAt) &&
        Objects.equals(this.updatedAt, masterCoursesMasterMigrations.updatedAt) &&
        Objects.equals(this.workflowState, masterCoursesMasterMigrations.workflowState) &&
        equalsNullable(this.migrationSettings, masterCoursesMasterMigrations.migrationSettings) &&
        equalsNullable(this.exportResults, masterCoursesMasterMigrations.exportResults) &&
        equalsNullable(this.exportsStartedAt, masterCoursesMasterMigrations.exportsStartedAt) &&
        equalsNullable(this.importsQueuedAt, masterCoursesMasterMigrations.importsQueuedAt) &&
        equalsNullable(this.importsCompletedAt, masterCoursesMasterMigrations.importsCompletedAt) &&
        Objects.equals(this.sendNotification, masterCoursesMasterMigrations.sendNotification) &&
        Objects.equals(this.masterTemplateId, masterCoursesMasterMigrations.masterTemplateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comment, hashCodeNullable(userId), createdAt, updatedAt, workflowState, hashCodeNullable(migrationSettings), hashCodeNullable(exportResults), hashCodeNullable(exportsStartedAt), hashCodeNullable(importsQueuedAt), hashCodeNullable(importsCompletedAt), sendNotification, masterTemplateId);
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
    sb.append("class MasterCoursesMasterMigrations {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    migrationSettings: ").append(toIndentedString(migrationSettings)).append("\n");
    sb.append("    exportResults: ").append(toIndentedString(exportResults)).append("\n");
    sb.append("    exportsStartedAt: ").append(toIndentedString(exportsStartedAt)).append("\n");
    sb.append("    importsQueuedAt: ").append(toIndentedString(importsQueuedAt)).append("\n");
    sb.append("    importsCompletedAt: ").append(toIndentedString(importsCompletedAt)).append("\n");
    sb.append("    sendNotification: ").append(toIndentedString(sendNotification)).append("\n");
    sb.append("    masterTemplateId: ").append(toIndentedString(masterTemplateId)).append("\n");
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

