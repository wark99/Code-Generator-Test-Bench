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
import org.openapitools.client.model.ContextExternalToolsConsumerKey;
import org.openapitools.client.model.ContextExternalToolsDescription;
import org.openapitools.client.model.TypeExtractedFromColumnContextExternalToolsSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContextExternalTools
 */
@JsonPropertyOrder({
  ContextExternalTools.JSON_PROPERTY_ID,
  ContextExternalTools.JSON_PROPERTY_DEVELOPER_KEY_ID,
  ContextExternalTools.JSON_PROPERTY_CREATED_AT,
  ContextExternalTools.JSON_PROPERTY_UPDATED_AT,
  ContextExternalTools.JSON_PROPERTY_WORKFLOW_STATE,
  ContextExternalTools.JSON_PROPERTY_CONTEXT_ID,
  ContextExternalTools.JSON_PROPERTY_CONTEXT_TYPE,
  ContextExternalTools.JSON_PROPERTY_MIGRATION_ID,
  ContextExternalTools.JSON_PROPERTY_CONSUMER_KEY,
  ContextExternalTools.JSON_PROPERTY_CLONED_ITEM_ID,
  ContextExternalTools.JSON_PROPERTY_TOOL_ID,
  ContextExternalTools.JSON_PROPERTY_NOT_SELECTABLE,
  ContextExternalTools.JSON_PROPERTY_APP_CENTER_ID,
  ContextExternalTools.JSON_PROPERTY_ALLOW_MEMBERSHIP_SERVICE_ACCESS,
  ContextExternalTools.JSON_PROPERTY_DESCRIPTION,
  ContextExternalTools.JSON_PROPERTY_NAME,
  ContextExternalTools.JSON_PROPERTY_DOMAIN,
  ContextExternalTools.JSON_PROPERTY_URL,
  ContextExternalTools.JSON_PROPERTY_SETTINGS
})
@JsonTypeName("context_external_tools")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContextExternalTools {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DEVELOPER_KEY_ID = "developer_key_id";
  private JsonNullable<Object> developerKeyId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Workflow state for activation (active, deleted).
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ANONYMOUS("anonymous"),
    
    DELETED("deleted"),
    
    DISABLED("disabled"),
    
    EMAIL_ONLY("email_only"),
    
    NAME_ONLY("name_only"),
    
    PUBLIC("public");

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
  private JsonNullable<Object> contextId = JsonNullable.<Object>of(null);

  /**
   * The type of object the tool was activated in.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    COURSE("Course");

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
  private JsonNullable<ContextTypeEnum> contextType = JsonNullable.<ContextTypeEnum>of(null);

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONSUMER_KEY = "consumer_key";
  private ContextExternalToolsConsumerKey consumerKey;

  public static final String JSON_PROPERTY_CLONED_ITEM_ID = "cloned_item_id";
  private JsonNullable<Object> clonedItemId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TOOL_ID = "tool_id";
  private JsonNullable<Object> toolId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NOT_SELECTABLE = "not_selectable";
  private JsonNullable<Object> notSelectable = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_APP_CENTER_ID = "app_center_id";
  private JsonNullable<Object> appCenterId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALLOW_MEMBERSHIP_SERVICE_ACCESS = "allow_membership_service_access";
  private Object allowMembershipServiceAccess = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private ContextExternalToolsDescription description;

  public static final String JSON_PROPERTY_NAME = "name";
  private Object name = null;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private JsonNullable<Object> domain = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<Object> url = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private TypeExtractedFromColumnContextExternalToolsSettings settings;

  public ContextExternalTools() {
  }

  public ContextExternalTools id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Primary key for this record in the &#x60;context_external_tools&#x60; table in the Canvas database.
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


  public ContextExternalTools developerKeyId(Object developerKeyId) {
    this.developerKeyId = JsonNullable.<Object>of(developerKeyId);
    
    return this;
  }

   /**
   * The client ID of the tool provider. LTI 1.3 only.
   * @return developerKeyId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDeveloperKeyId() {
        return developerKeyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEVELOPER_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDeveloperKeyId_JsonNullable() {
    return developerKeyId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEVELOPER_KEY_ID)
  public void setDeveloperKeyId_JsonNullable(JsonNullable<Object> developerKeyId) {
    this.developerKeyId = developerKeyId;
  }

  public void setDeveloperKeyId(Object developerKeyId) {
    this.developerKeyId = JsonNullable.<Object>of(developerKeyId);
  }


  public ContextExternalTools createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the activation was created.
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


  public ContextExternalTools updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time at which the tool was last updated.
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


  public ContextExternalTools workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Workflow state for activation (active, deleted).
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


  public ContextExternalTools contextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
    
    return this;
  }

   /**
   * The ID of the context the tool is deployed to. Identifies either a course (&#x60;courses&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Course&#x60;) or an account (&#x60;accounts&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Account&#x60;).
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


  public ContextExternalTools contextType(ContextTypeEnum contextType) {
    this.contextType = JsonNullable.<ContextTypeEnum>of(contextType);
    
    return this;
  }

   /**
   * The type of object the tool was activated in.
   * @return contextType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ContextTypeEnum getContextType() {
        return contextType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContextTypeEnum> getContextType_JsonNullable() {
    return contextType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
  public void setContextType_JsonNullable(JsonNullable<ContextTypeEnum> contextType) {
    this.contextType = contextType;
  }

  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = JsonNullable.<ContextTypeEnum>of(contextType);
  }


  public ContextExternalTools migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The unique identifier of the migration that imported the tool.
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


  public ContextExternalTools consumerKey(ContextExternalToolsConsumerKey consumerKey) {
    
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * Get consumerKey
   * @return consumerKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContextExternalToolsConsumerKey getConsumerKey() {
    return consumerKey;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumerKey(ContextExternalToolsConsumerKey consumerKey) {
    this.consumerKey = consumerKey;
  }


  public ContextExternalTools clonedItemId(Object clonedItemId) {
    this.clonedItemId = JsonNullable.<Object>of(clonedItemId);
    
    return this;
  }

   /**
   * The Id of the item in which this context_external_tool was cloned from.
   * @return clonedItemId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getClonedItemId() {
        return clonedItemId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLONED_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getClonedItemId_JsonNullable() {
    return clonedItemId;
  }
  
  @JsonProperty(JSON_PROPERTY_CLONED_ITEM_ID)
  public void setClonedItemId_JsonNullable(JsonNullable<Object> clonedItemId) {
    this.clonedItemId = clonedItemId;
  }

  public void setClonedItemId(Object clonedItemId) {
    this.clonedItemId = JsonNullable.<Object>of(clonedItemId);
  }


  public ContextExternalTools toolId(Object toolId) {
    this.toolId = JsonNullable.<Object>of(toolId);
    
    return this;
  }

   /**
   * The tool ID received from the external tool. May be missing if the tool does not send an ID.
   * @return toolId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getToolId() {
        return toolId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getToolId_JsonNullable() {
    return toolId;
  }
  
  @JsonProperty(JSON_PROPERTY_TOOL_ID)
  public void setToolId_JsonNullable(JsonNullable<Object> toolId) {
    this.toolId = toolId;
  }

  public void setToolId(Object toolId) {
    this.toolId = JsonNullable.<Object>of(toolId);
  }


  public ContextExternalTools notSelectable(Object notSelectable) {
    this.notSelectable = JsonNullable.<Object>of(notSelectable);
    
    return this;
  }

   /**
   * true - tool is selectable in all scenarios. false - not selectable for assignment or module selection menu.
   * @return notSelectable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNotSelectable() {
        return notSelectable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NOT_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNotSelectable_JsonNullable() {
    return notSelectable;
  }
  
  @JsonProperty(JSON_PROPERTY_NOT_SELECTABLE)
  public void setNotSelectable_JsonNullable(JsonNullable<Object> notSelectable) {
    this.notSelectable = notSelectable;
  }

  public void setNotSelectable(Object notSelectable) {
    this.notSelectable = JsonNullable.<Object>of(notSelectable);
  }


  public ContextExternalTools appCenterId(Object appCenterId) {
    this.appCenterId = JsonNullable.<Object>of(appCenterId);
    
    return this;
  }

   /**
   * The tool ID from eduappcenter.com.
   * @return appCenterId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAppCenterId() {
        return appCenterId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_CENTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAppCenterId_JsonNullable() {
    return appCenterId;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_CENTER_ID)
  public void setAppCenterId_JsonNullable(JsonNullable<Object> appCenterId) {
    this.appCenterId = appCenterId;
  }

  public void setAppCenterId(Object appCenterId) {
    this.appCenterId = JsonNullable.<Object>of(appCenterId);
  }


  public ContextExternalTools allowMembershipServiceAccess(Object allowMembershipServiceAccess) {
    
    this.allowMembershipServiceAccess = allowMembershipServiceAccess;
    return this;
  }

   /**
   * Indicates that the tool has access to the legacy membership service. LTI 1 only. This setting is set by the Canvas user who installs the tool.
   * @return allowMembershipServiceAccess
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_MEMBERSHIP_SERVICE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAllowMembershipServiceAccess() {
    return allowMembershipServiceAccess;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_MEMBERSHIP_SERVICE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowMembershipServiceAccess(Object allowMembershipServiceAccess) {
    this.allowMembershipServiceAccess = allowMembershipServiceAccess;
  }


  public ContextExternalTools description(ContextExternalToolsDescription description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContextExternalToolsDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(ContextExternalToolsDescription description) {
    this.description = description;
  }


  public ContextExternalTools name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of tool activation as entered by the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(Object name) {
    this.name = name;
  }


  public ContextExternalTools domain(Object domain) {
    this.domain = JsonNullable.<Object>of(domain);
    
    return this;
  }

   /**
   * The domain for the tool launch URL (optional field). Canvas uses this domain to lookup the correct tool to launch when the tool ID is unknown.
   * @return domain
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDomain() {
        return domain.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDomain_JsonNullable() {
    return domain;
  }
  
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  public void setDomain_JsonNullable(JsonNullable<Object> domain) {
    this.domain = domain;
  }

  public void setDomain(Object domain) {
    this.domain = JsonNullable.<Object>of(domain);
  }


  public ContextExternalTools url(Object url) {
    this.url = JsonNullable.<Object>of(url);
    
    return this;
  }

   /**
   * The URL to where the tool may launch to (if this value is NULL, use the &#x60;domain&#x60; field).
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<Object> url) {
    this.url = url;
  }

  public void setUrl(Object url) {
    this.url = JsonNullable.<Object>of(url);
  }


  public ContextExternalTools settings(TypeExtractedFromColumnContextExternalToolsSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeExtractedFromColumnContextExternalToolsSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(TypeExtractedFromColumnContextExternalToolsSettings settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextExternalTools contextExternalTools = (ContextExternalTools) o;
    return Objects.equals(this.id, contextExternalTools.id) &&
        equalsNullable(this.developerKeyId, contextExternalTools.developerKeyId) &&
        Objects.equals(this.createdAt, contextExternalTools.createdAt) &&
        Objects.equals(this.updatedAt, contextExternalTools.updatedAt) &&
        Objects.equals(this.workflowState, contextExternalTools.workflowState) &&
        equalsNullable(this.contextId, contextExternalTools.contextId) &&
        equalsNullable(this.contextType, contextExternalTools.contextType) &&
        equalsNullable(this.migrationId, contextExternalTools.migrationId) &&
        Objects.equals(this.consumerKey, contextExternalTools.consumerKey) &&
        equalsNullable(this.clonedItemId, contextExternalTools.clonedItemId) &&
        equalsNullable(this.toolId, contextExternalTools.toolId) &&
        equalsNullable(this.notSelectable, contextExternalTools.notSelectable) &&
        equalsNullable(this.appCenterId, contextExternalTools.appCenterId) &&
        Objects.equals(this.allowMembershipServiceAccess, contextExternalTools.allowMembershipServiceAccess) &&
        Objects.equals(this.description, contextExternalTools.description) &&
        Objects.equals(this.name, contextExternalTools.name) &&
        equalsNullable(this.domain, contextExternalTools.domain) &&
        equalsNullable(this.url, contextExternalTools.url) &&
        Objects.equals(this.settings, contextExternalTools.settings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(developerKeyId), createdAt, updatedAt, workflowState, hashCodeNullable(contextId), hashCodeNullable(contextType), hashCodeNullable(migrationId), consumerKey, hashCodeNullable(clonedItemId), hashCodeNullable(toolId), hashCodeNullable(notSelectable), hashCodeNullable(appCenterId), allowMembershipServiceAccess, description, name, hashCodeNullable(domain), hashCodeNullable(url), settings);
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
    sb.append("class ContextExternalTools {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    developerKeyId: ").append(toIndentedString(developerKeyId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    clonedItemId: ").append(toIndentedString(clonedItemId)).append("\n");
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
    sb.append("    notSelectable: ").append(toIndentedString(notSelectable)).append("\n");
    sb.append("    appCenterId: ").append(toIndentedString(appCenterId)).append("\n");
    sb.append("    allowMembershipServiceAccess: ").append(toIndentedString(allowMembershipServiceAccess)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

