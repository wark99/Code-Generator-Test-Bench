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
 * ContentMigrations
 */
@JsonPropertyOrder({
  ContentMigrations.JSON_PROPERTY_ID,
  ContentMigrations.JSON_PROPERTY_ATTACHMENT_ID,
  ContentMigrations.JSON_PROPERTY_USER_ID,
  ContentMigrations.JSON_PROPERTY_CREATED_AT,
  ContentMigrations.JSON_PROPERTY_UPDATED_AT,
  ContentMigrations.JSON_PROPERTY_WORKFLOW_STATE,
  ContentMigrations.JSON_PROPERTY_CONTEXT_ID,
  ContentMigrations.JSON_PROPERTY_CONTEXT_TYPE,
  ContentMigrations.JSON_PROPERTY_OVERVIEW_ATTACHMENT_ID,
  ContentMigrations.JSON_PROPERTY_EXPORTED_ATTACHMENT_ID,
  ContentMigrations.JSON_PROPERTY_SOURCE_COURSE_ID,
  ContentMigrations.JSON_PROPERTY_MIGRATION_TYPE,
  ContentMigrations.JSON_PROPERTY_CHILD_SUBSCRIPTION_ID,
  ContentMigrations.JSON_PROPERTY_MIGRATION_SETTINGS,
  ContentMigrations.JSON_PROPERTY_STARTED_AT,
  ContentMigrations.JSON_PROPERTY_FINISHED_AT,
  ContentMigrations.JSON_PROPERTY_PROGRESS
})
@JsonTypeName("content_migrations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContentMigrations {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachment_id";
  private JsonNullable<Object> attachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Current state of the content migration.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    CREATED("created"),
    
    EXPORTED("exported"),
    
    EXPORTING("exporting"),
    
    FAILED("failed"),
    
    IMPORTED("imported"),
    
    IMPORTING("importing"),
    
    PRE_PROCESS_ERROR("pre_process_error"),
    
    PRE_PROCESSED("pre_processed"),
    
    PRE_PROCESSING("pre_processing"),
    
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

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of the object represented by &#x60;context_id&#x60;.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COURSE("Course"),
    
    ACCOUNT("Account"),
    
    GROUP("Group"),
    
    USER("User");

    private Object value;

    ContextTypeEnum(Object value) {
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
    public static ContextTypeEnum fromValue(Object value) {
      for (ContextTypeEnum b : ContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CONTEXT_TYPE = "context_type";
  private ContextTypeEnum contextType = null;

  public static final String JSON_PROPERTY_OVERVIEW_ATTACHMENT_ID = "overview_attachment_id";
  private JsonNullable<Object> overviewAttachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXPORTED_ATTACHMENT_ID = "exported_attachment_id";
  private JsonNullable<Object> exportedAttachmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SOURCE_COURSE_ID = "source_course_id";
  private JsonNullable<Object> sourceCourseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_TYPE = "migration_type";
  private JsonNullable<Object> migrationType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CHILD_SUBSCRIPTION_ID = "child_subscription_id";
  private JsonNullable<Object> childSubscriptionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_SETTINGS = "migration_settings";
  private JsonNullable<Object> migrationSettings = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private JsonNullable<Object> startedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private JsonNullable<Object> finishedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private JsonNullable<Object> progress = JsonNullable.<Object>of(null);

  public ContentMigrations() {
  }

  public ContentMigrations id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a content migration record.
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


  public ContentMigrations attachmentId(Object attachmentId) {
    this.attachmentId = JsonNullable.<Object>of(attachmentId);
    
    return this;
  }

   /**
   * The unique ID of the package being imported.
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


  public ContentMigrations userId(Object userId) {
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


  public ContentMigrations createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp showing when a &#x60;content_migrations&#x60; record was created.
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


  public ContentMigrations updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;content_migrations&#x60; record was updated.
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


  public ContentMigrations workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Current state of the content migration.
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


  public ContentMigrations contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The unique identifier of a &#x60;content_migrations&#x60; context.
   * @return contextId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContextId(Object contextId) {
    this.contextId = contextId;
  }


  public ContentMigrations contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of the object represented by &#x60;context_id&#x60;.
   * @return contextType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContextTypeEnum getContextType() {
    return contextType;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
  }


  public ContentMigrations overviewAttachmentId(Object overviewAttachmentId) {
    this.overviewAttachmentId = JsonNullable.<Object>of(overviewAttachmentId);
    
    return this;
  }

   /**
   * The unique ID of the packages overview.json file.
   * @return overviewAttachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOverviewAttachmentId() {
        return overviewAttachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OVERVIEW_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOverviewAttachmentId_JsonNullable() {
    return overviewAttachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_OVERVIEW_ATTACHMENT_ID)
  public void setOverviewAttachmentId_JsonNullable(JsonNullable<Object> overviewAttachmentId) {
    this.overviewAttachmentId = overviewAttachmentId;
  }

  public void setOverviewAttachmentId(Object overviewAttachmentId) {
    this.overviewAttachmentId = JsonNullable.<Object>of(overviewAttachmentId);
  }


  public ContentMigrations exportedAttachmentId(Object exportedAttachmentId) {
    this.exportedAttachmentId = JsonNullable.<Object>of(exportedAttachmentId);
    
    return this;
  }

   /**
   * The unique ID of the resulting exported package.
   * @return exportedAttachmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExportedAttachmentId() {
        return exportedAttachmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPORTED_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExportedAttachmentId_JsonNullable() {
    return exportedAttachmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPORTED_ATTACHMENT_ID)
  public void setExportedAttachmentId_JsonNullable(JsonNullable<Object> exportedAttachmentId) {
    this.exportedAttachmentId = exportedAttachmentId;
  }

  public void setExportedAttachmentId(Object exportedAttachmentId) {
    this.exportedAttachmentId = JsonNullable.<Object>of(exportedAttachmentId);
  }


  public ContentMigrations sourceCourseId(Object sourceCourseId) {
    this.sourceCourseId = JsonNullable.<Object>of(sourceCourseId);
    
    return this;
  }

   /**
   * The course to copy from for a course copy migration (required if doing course copy).
   * @return sourceCourseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSourceCourseId() {
        return sourceCourseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSourceCourseId_JsonNullable() {
    return sourceCourseId;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_COURSE_ID)
  public void setSourceCourseId_JsonNullable(JsonNullable<Object> sourceCourseId) {
    this.sourceCourseId = sourceCourseId;
  }

  public void setSourceCourseId(Object sourceCourseId) {
    this.sourceCourseId = JsonNullable.<Object>of(sourceCourseId);
  }


  public ContentMigrations migrationType(Object migrationType) {
    this.migrationType = JsonNullable.<Object>of(migrationType);
    
    return this;
  }

   /**
   * The type of the migration. Use the Migrator endpoint to see all available migrators. Examples include: &#x60;academic_benchmark_importer&#x60;, &#x60;angel_exporter&#x60;, &#x60;blackboard_exporter&#x60;, &#x60;canvas_cartridge_importer&#x60;, &#x60;common_cartridge_importer&#x60;, &#x60;course_copy_importer&#x60;, &#x60;d2l_exporter&#x60;, &#x60;master_course_import&#x60;, &#x60;moodle_converter&#x60;, &#x60;qti_converter&#x60;, &#x60;webct_scraper&#x60;, &#x60;zip_file_importer&#x60;, &#x60;context_external_tool_1234&#x60;.
   * @return migrationType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMigrationType() {
        return migrationType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMigrationType_JsonNullable() {
    return migrationType;
  }
  
  @JsonProperty(JSON_PROPERTY_MIGRATION_TYPE)
  public void setMigrationType_JsonNullable(JsonNullable<Object> migrationType) {
    this.migrationType = migrationType;
  }

  public void setMigrationType(Object migrationType) {
    this.migrationType = JsonNullable.<Object>of(migrationType);
  }


  public ContentMigrations childSubscriptionId(Object childSubscriptionId) {
    this.childSubscriptionId = JsonNullable.<Object>of(childSubscriptionId);
    
    return this;
  }

   /**
   * The unique ID of the &#x60;master_courses_child_subscription&#x60; record indicating a blueprint association.
   * @return childSubscriptionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getChildSubscriptionId() {
        return childSubscriptionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHILD_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getChildSubscriptionId_JsonNullable() {
    return childSubscriptionId;
  }
  
  @JsonProperty(JSON_PROPERTY_CHILD_SUBSCRIPTION_ID)
  public void setChildSubscriptionId_JsonNullable(JsonNullable<Object> childSubscriptionId) {
    this.childSubscriptionId = childSubscriptionId;
  }

  public void setChildSubscriptionId(Object childSubscriptionId) {
    this.childSubscriptionId = JsonNullable.<Object>of(childSubscriptionId);
  }


  public ContentMigrations migrationSettings(Object migrationSettings) {
    this.migrationSettings = JsonNullable.<Object>of(migrationSettings);
    
    return this;
  }

   /**
   * Ruby hash of settings that determine what data will get imported for this migration.
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


  public ContentMigrations startedAt(Object startedAt) {
    this.startedAt = JsonNullable.<Object>of(startedAt);
    
    return this;
  }

   /**
   * Timestamp showing when a content migration started.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStartedAt() {
        return startedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStartedAt_JsonNullable() {
    return startedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  public void setStartedAt_JsonNullable(JsonNullable<Object> startedAt) {
    this.startedAt = startedAt;
  }

  public void setStartedAt(Object startedAt) {
    this.startedAt = JsonNullable.<Object>of(startedAt);
  }


  public ContentMigrations finishedAt(Object finishedAt) {
    this.finishedAt = JsonNullable.<Object>of(finishedAt);
    
    return this;
  }

   /**
   * Timestamp showing when a content migration finished.
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFinishedAt() {
        return finishedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFinishedAt_JsonNullable() {
    return finishedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  public void setFinishedAt_JsonNullable(JsonNullable<Object> finishedAt) {
    this.finishedAt = finishedAt;
  }

  public void setFinishedAt(Object finishedAt) {
    this.finishedAt = JsonNullable.<Object>of(finishedAt);
  }


  public ContentMigrations progress(Object progress) {
    this.progress = JsonNullable.<Object>of(progress);
    
    return this;
  }

   /**
   * Current migration progress. 100 indicates done at 100%.
   * @return progress
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getProgress() {
        return progress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getProgress_JsonNullable() {
    return progress;
  }
  
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  public void setProgress_JsonNullable(JsonNullable<Object> progress) {
    this.progress = progress;
  }

  public void setProgress(Object progress) {
    this.progress = JsonNullable.<Object>of(progress);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMigrations contentMigrations = (ContentMigrations) o;
    return Objects.equals(this.id, contentMigrations.id) &&
        equalsNullable(this.attachmentId, contentMigrations.attachmentId) &&
        equalsNullable(this.userId, contentMigrations.userId) &&
        Objects.equals(this.createdAt, contentMigrations.createdAt) &&
        Objects.equals(this.updatedAt, contentMigrations.updatedAt) &&
        Objects.equals(this.workflowState, contentMigrations.workflowState) &&
        Objects.equals(this.contextId, contentMigrations.contextId) &&
        Objects.equals(this.contextType, contentMigrations.contextType) &&
        equalsNullable(this.overviewAttachmentId, contentMigrations.overviewAttachmentId) &&
        equalsNullable(this.exportedAttachmentId, contentMigrations.exportedAttachmentId) &&
        equalsNullable(this.sourceCourseId, contentMigrations.sourceCourseId) &&
        equalsNullable(this.migrationType, contentMigrations.migrationType) &&
        equalsNullable(this.childSubscriptionId, contentMigrations.childSubscriptionId) &&
        equalsNullable(this.migrationSettings, contentMigrations.migrationSettings) &&
        equalsNullable(this.startedAt, contentMigrations.startedAt) &&
        equalsNullable(this.finishedAt, contentMigrations.finishedAt) &&
        equalsNullable(this.progress, contentMigrations.progress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(attachmentId), hashCodeNullable(userId), createdAt, updatedAt, workflowState, contextId, contextType, hashCodeNullable(overviewAttachmentId), hashCodeNullable(exportedAttachmentId), hashCodeNullable(sourceCourseId), hashCodeNullable(migrationType), hashCodeNullable(childSubscriptionId), hashCodeNullable(migrationSettings), hashCodeNullable(startedAt), hashCodeNullable(finishedAt), hashCodeNullable(progress));
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
    sb.append("class ContentMigrations {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    overviewAttachmentId: ").append(toIndentedString(overviewAttachmentId)).append("\n");
    sb.append("    exportedAttachmentId: ").append(toIndentedString(exportedAttachmentId)).append("\n");
    sb.append("    sourceCourseId: ").append(toIndentedString(sourceCourseId)).append("\n");
    sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
    sb.append("    childSubscriptionId: ").append(toIndentedString(childSubscriptionId)).append("\n");
    sb.append("    migrationSettings: ").append(toIndentedString(migrationSettings)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

