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
import org.openapitools.client.model.ContentTagsComments;
import org.openapitools.client.model.ContentTagsLinkSettings;
import org.openapitools.client.model.ContentTagsTitle;
import org.openapitools.client.model.ContentTagsUrl;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Some of the ways to use this table would be to: identify the external tool that is used to submit an assignment, identify the items that are in modules (the IDs in this table are also referred to as &#x60;module_item_id&#x60;), identify the learning outcome group that an outcome is part of.
 */
@JsonPropertyOrder({
  ContentTags.JSON_PROPERTY_ID,
  ContentTags.JSON_PROPERTY_CREATED_AT,
  ContentTags.JSON_PROPERTY_UPDATED_AT,
  ContentTags.JSON_PROPERTY_WORKFLOW_STATE,
  ContentTags.JSON_PROPERTY_CONTEXT_ID,
  ContentTags.JSON_PROPERTY_CONTEXT_TYPE,
  ContentTags.JSON_PROPERTY_CONTEXT_CODE,
  ContentTags.JSON_PROPERTY_COMMENTS,
  ContentTags.JSON_PROPERTY_MIGRATION_ID,
  ContentTags.JSON_PROPERTY_CONTENT_ID,
  ContentTags.JSON_PROPERTY_TAG_TYPE,
  ContentTags.JSON_PROPERTY_CONTEXT_MODULE_ID,
  ContentTags.JSON_PROPERTY_LEARNING_OUTCOME_ID,
  ContentTags.JSON_PROPERTY_MASTERY_SCORE,
  ContentTags.JSON_PROPERTY_RUBRIC_ASSOCIATION_ID,
  ContentTags.JSON_PROPERTY_ASSOCIATED_ASSET_ID,
  ContentTags.JSON_PROPERTY_ASSOCIATED_ASSET_TYPE,
  ContentTags.JSON_PROPERTY_LINK_SETTINGS,
  ContentTags.JSON_PROPERTY_NEW_TAB,
  ContentTags.JSON_PROPERTY_POSITION,
  ContentTags.JSON_PROPERTY_CONTENT_TYPE,
  ContentTags.JSON_PROPERTY_URL,
  ContentTags.JSON_PROPERTY_TITLE
})
@JsonTypeName("content_tags")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContentTags {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * The workflow state of the content tag.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    UNPUBLISHED("unpublished"),
    
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

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60; or &#x60;Account&#x60; or &#x60;User&#x60;.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    ASSIGNMENT("Assignment"),
    
    COURSE("Course"),
    
    LEARNINGOUTCOMEGROUP("LearningOutcomeGroup"),
    
    QUIZZES_QUIZ("Quizzes::Quiz"),
    
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

  public static final String JSON_PROPERTY_CONTEXT_CODE = "context_code";
  private JsonNullable<Object> contextCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private ContentTagsComments comments;

  public static final String JSON_PROPERTY_MIGRATION_ID = "migration_id";
  private JsonNullable<Object> migrationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private Object contentId = null;

  /**
   * Identifies the type of tag.
   */
  public enum TagTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    CONTEXT_MODULE("context_module"),
    
    DEFAULT("default"),
    
    LEARNING_OUTCOME("learning_outcome"),
    
    LEARNING_OUTCOME_ASSOCIATION("learning_outcome_association");

    private Object value;

    TagTypeEnum(Object value) {
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
    public static TagTypeEnum fromValue(Object value) {
      for (TagTypeEnum b : TagTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TAG_TYPE = "tag_type";
  private TagTypeEnum tagType = null;

  public static final String JSON_PROPERTY_CONTEXT_MODULE_ID = "context_module_id";
  private JsonNullable<Object> contextModuleId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LEARNING_OUTCOME_ID = "learning_outcome_id";
  private JsonNullable<Object> learningOutcomeId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MASTERY_SCORE = "mastery_score";
  private JsonNullable<Object> masteryScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RUBRIC_ASSOCIATION_ID = "rubric_association_id";
  private JsonNullable<Object> rubricAssociationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSOCIATED_ASSET_ID = "associated_asset_id";
  private JsonNullable<Object> associatedAssetId = JsonNullable.<Object>of(null);

  /**
   * when &#x60;tag_type&#x60; is &#x60;learning_outcome_association&#x60;, then &#x60;content_type&#x60; is &#x60;LearningOutcome&#x60; and &#x60;associated_asset_type&#x60; is &#x60;learning_outcome_group&#x60; and indicates the *LearningOutcome* (&#x60;content_id&#x60;) is displayed within the *LearningOutcomeGroup* (&#x60;associated_asset_id&#x60;).
   */
  public enum AssociatedAssetTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    LEARNINGOUTCOMEGROUP("LearningOutcomeGroup"),
    
    LTI_RESOURCELINK("Lti::ResourceLink");

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
  private JsonNullable<AssociatedAssetTypeEnum> associatedAssetType = JsonNullable.<AssociatedAssetTypeEnum>of(null);

  public static final String JSON_PROPERTY_LINK_SETTINGS = "link_settings";
  private ContentTagsLinkSettings linkSettings;

  public static final String JSON_PROPERTY_NEW_TAB = "new_tab";
  private JsonNullable<Object> newTab = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Object> position = JsonNullable.<Object>of(null);

  /**
   * The type of the tag&#39;s content. Corresponds to the tables that &#x60;content_id&#x60; is a foreign key for, the exceptions being: &#x60;Announcement&#x60; (for which &#x60;content_id&#x60; references the &#x60;discussion_topics&#x60; table) and &#x60;ContextModuleSubheader&#x60; and &#x60;ExternalUrl&#x60; (which have no tables).
   */
  public enum ContentTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ANNOUNCEMENT("Announcement"),
    
    ASSESSMENTQUESTIONBANK("AssessmentQuestionBank"),
    
    ASSIGNMENT("Assignment"),
    
    ATTACHMENT("Attachment"),
    
    CONTEXTEXTERNALTOOL("ContextExternalTool"),
    
    CONTEXTMODULESUBHEADER("ContextModuleSubHeader"),
    
    DISCUSSIONTOPIC("DiscussionTopic"),
    
    EXTERNALURL("ExternalUrl"),
    
    LEARNINGOUTCOME("LearningOutcome"),
    
    LEARNINGOUTCOMEGROUP("LearningOutcomeGroup"),
    
    LIVEASSESSMENTS_ASSESSMENT("LiveAssessments::Assessment"),
    
    LTI_MESSAGEHANDLER("Lti::MessageHandler"),
    
    QUIZZES_QUIZ("Quizzes::Quiz"),
    
    RUBRIC("Rubric"),
    
    WIKIPAGE("WikiPage");

    private Object value;

    ContentTypeEnum(Object value) {
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
    public static ContentTypeEnum fromValue(Object value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private JsonNullable<ContentTypeEnum> contentType = JsonNullable.<ContentTypeEnum>of(null);

  public static final String JSON_PROPERTY_URL = "url";
  private ContentTagsUrl url;

  public static final String JSON_PROPERTY_TITLE = "title";
  private ContentTagsTitle title;

  public ContentTags() {
  }

  public ContentTags id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a content tag record.
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


  public ContentTags createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;content_tags&#x60; record was created.
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


  public ContentTags updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;content_tags&#x60; record was updated.
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


  public ContentTags workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * The workflow state of the content tag.
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


  public ContentTags contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The unique identifier for the &#x60;content_tags&#x60; context (account, course, user). Depends on &#x60;context_type&#x60; value: &#x60;Course&#x60;: &#x60;courses.id&#x60;, &#x60;Assignment&#x60;: &#x60;assignments.id&#x60;.
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


  public ContentTags contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60; or &#x60;Account&#x60; or &#x60;User&#x60;.
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


  public ContentTags contextCode(Object contextCode) {
    this.contextCode = JsonNullable.<Object>of(contextCode);
    
    return this;
  }

   /**
   * An asset string describing the content tag context (for example: &#x60;assignment_3&#x60;).
   * @return contextCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContextCode() {
        return contextCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContextCode_JsonNullable() {
    return contextCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_CODE)
  public void setContextCode_JsonNullable(JsonNullable<Object> contextCode) {
    this.contextCode = contextCode;
  }

  public void setContextCode(Object contextCode) {
    this.contextCode = JsonNullable.<Object>of(contextCode);
  }


  public ContentTags comments(ContentTagsComments comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentTagsComments getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(ContentTagsComments comments) {
    this.comments = comments;
  }


  public ContentTags migrationId(Object migrationId) {
    this.migrationId = JsonNullable.<Object>of(migrationId);
    
    return this;
  }

   /**
   * The ID of the migration that created the content tag.
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


  public ContentTags contentId(Object contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * Refers to the ID of the object that is linked to another object (&#x60;context_type&#x60;).
   * @return contentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getContentId() {
    return contentId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentId(Object contentId) {
    this.contentId = contentId;
  }


  public ContentTags tagType(TagTypeEnum tagType) {
    
    this.tagType = tagType;
    return this;
  }

   /**
   * Identifies the type of tag.
   * @return tagType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TagTypeEnum getTagType() {
    return tagType;
  }


  @JsonProperty(JSON_PROPERTY_TAG_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTagType(TagTypeEnum tagType) {
    this.tagType = tagType;
  }


  public ContentTags contextModuleId(Object contextModuleId) {
    this.contextModuleId = JsonNullable.<Object>of(contextModuleId);
    
    return this;
  }

   /**
   * The ID of the context module the content tag belongs to (if &#x60;tag_type&#x60; is &#x60;context_module&#x60;).
   * @return contextModuleId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContextModuleId() {
        return contextModuleId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT_MODULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContextModuleId_JsonNullable() {
    return contextModuleId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_MODULE_ID)
  public void setContextModuleId_JsonNullable(JsonNullable<Object> contextModuleId) {
    this.contextModuleId = contextModuleId;
  }

  public void setContextModuleId(Object contextModuleId) {
    this.contextModuleId = JsonNullable.<Object>of(contextModuleId);
  }


  public ContentTags learningOutcomeId(Object learningOutcomeId) {
    this.learningOutcomeId = JsonNullable.<Object>of(learningOutcomeId);
    
    return this;
  }

   /**
   * Has a value if &#x60;tag_type&#x60; is &#x60;learning_outcome&#x60;, indicates that the content (&#x60;content_type&#x60;, &#x60;content_id&#x60;) is aligned with the given LearningOutcome.
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


  public ContentTags masteryScore(Object masteryScore) {
    this.masteryScore = JsonNullable.<Object>of(masteryScore);
    
    return this;
  }

   /**
   * when &#x60;tag_type&#x60; is &#x60;learning_outcome&#x60; and &#x60;content_type&#x60; is &#x60;AssessmentQuestionBank&#x60;, indicates the required score on a set of bank questions to show mastery.
   * @return masteryScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMasteryScore() {
        return masteryScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MASTERY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMasteryScore_JsonNullable() {
    return masteryScore;
  }
  
  @JsonProperty(JSON_PROPERTY_MASTERY_SCORE)
  public void setMasteryScore_JsonNullable(JsonNullable<Object> masteryScore) {
    this.masteryScore = masteryScore;
  }

  public void setMasteryScore(Object masteryScore) {
    this.masteryScore = JsonNullable.<Object>of(masteryScore);
  }


  public ContentTags rubricAssociationId(Object rubricAssociationId) {
    this.rubricAssociationId = JsonNullable.<Object>of(rubricAssociationId);
    
    return this;
  }

   /**
   * (deprecated) when &#x60;tag_type&#x60; is &#x60;learning_outcome&#x60; and &#x60;content_type&#x60; is &#x60;Assignment&#x60;, indicates the *RubricAssociation* which aligns the *LearningOutcome* to the *Assignment*.
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


  public ContentTags associatedAssetId(Object associatedAssetId) {
    this.associatedAssetId = JsonNullable.<Object>of(associatedAssetId);
    
    return this;
  }

   /**
   * Associated asset, whose use varies by ContentTag use. When &#x60;tag_type&#x60; is &#x60;learning_outcome_association&#x60;, then &#x60;content_type&#x60; is &#x60;LearningOutcome&#x60; and &#x60;associated_asset_type&#x60; is &#x60;learning_outcome_group&#x60; and indicates the *LearningOutcome* (&#x60;content_id&#x60;) is displayed within the *LearningOutcomeGroup* (&#x60;associated_asset_id&#x60;). When &#x60;content_type&#x60; is &#x60;ContextExternalTool&#x60; and &#x60;associated_asset_type&#x60; is &#x60;Lti::ResourceLink&#x60;, indicates the resource link associated with an LTI tool link.
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


  public ContentTags associatedAssetType(AssociatedAssetTypeEnum associatedAssetType) {
    this.associatedAssetType = JsonNullable.<AssociatedAssetTypeEnum>of(associatedAssetType);
    
    return this;
  }

   /**
   * when &#x60;tag_type&#x60; is &#x60;learning_outcome_association&#x60;, then &#x60;content_type&#x60; is &#x60;LearningOutcome&#x60; and &#x60;associated_asset_type&#x60; is &#x60;learning_outcome_group&#x60; and indicates the *LearningOutcome* (&#x60;content_id&#x60;) is displayed within the *LearningOutcomeGroup* (&#x60;associated_asset_id&#x60;).
   * @return associatedAssetType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public AssociatedAssetTypeEnum getAssociatedAssetType() {
        return associatedAssetType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AssociatedAssetTypeEnum> getAssociatedAssetType_JsonNullable() {
    return associatedAssetType;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_ASSET_TYPE)
  public void setAssociatedAssetType_JsonNullable(JsonNullable<AssociatedAssetTypeEnum> associatedAssetType) {
    this.associatedAssetType = associatedAssetType;
  }

  public void setAssociatedAssetType(AssociatedAssetTypeEnum associatedAssetType) {
    this.associatedAssetType = JsonNullable.<AssociatedAssetTypeEnum>of(associatedAssetType);
  }


  public ContentTags linkSettings(ContentTagsLinkSettings linkSettings) {
    
    this.linkSettings = linkSettings;
    return this;
  }

   /**
   * Get linkSettings
   * @return linkSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentTagsLinkSettings getLinkSettings() {
    return linkSettings;
  }


  @JsonProperty(JSON_PROPERTY_LINK_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkSettings(ContentTagsLinkSettings linkSettings) {
    this.linkSettings = linkSettings;
  }


  public ContentTags newTab(Object newTab) {
    this.newTab = JsonNullable.<Object>of(newTab);
    
    return this;
  }

   /**
   * Whether or not the content should open in a new tab.
   * @return newTab
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNewTab() {
        return newTab.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNewTab_JsonNullable() {
    return newTab;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_TAB)
  public void setNewTab_JsonNullable(JsonNullable<Object> newTab) {
    this.newTab = newTab;
  }

  public void setNewTab(Object newTab) {
    this.newTab = JsonNullable.<Object>of(newTab);
  }


  public ContentTags position(Object position) {
    this.position = JsonNullable.<Object>of(position);
    
    return this;
  }

   /**
   * The position of the content tag relative to other content tags when listed in a UI.
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


  public ContentTags contentType(ContentTypeEnum contentType) {
    this.contentType = JsonNullable.<ContentTypeEnum>of(contentType);
    
    return this;
  }

   /**
   * The type of the tag&#39;s content. Corresponds to the tables that &#x60;content_id&#x60; is a foreign key for, the exceptions being: &#x60;Announcement&#x60; (for which &#x60;content_id&#x60; references the &#x60;discussion_topics&#x60; table) and &#x60;ContextModuleSubheader&#x60; and &#x60;ExternalUrl&#x60; (which have no tables).
   * @return contentType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ContentTypeEnum getContentType() {
        return contentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ContentTypeEnum> getContentType_JsonNullable() {
    return contentType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  public void setContentType_JsonNullable(JsonNullable<ContentTypeEnum> contentType) {
    this.contentType = contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = JsonNullable.<ContentTypeEnum>of(contentType);
  }


  public ContentTags url(ContentTagsUrl url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentTagsUrl getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(ContentTagsUrl url) {
    this.url = url;
  }


  public ContentTags title(ContentTagsTitle title) {
    
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

  public ContentTagsTitle getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(ContentTagsTitle title) {
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
    ContentTags contentTags = (ContentTags) o;
    return Objects.equals(this.id, contentTags.id) &&
        Objects.equals(this.createdAt, contentTags.createdAt) &&
        Objects.equals(this.updatedAt, contentTags.updatedAt) &&
        Objects.equals(this.workflowState, contentTags.workflowState) &&
        Objects.equals(this.contextId, contentTags.contextId) &&
        Objects.equals(this.contextType, contentTags.contextType) &&
        equalsNullable(this.contextCode, contentTags.contextCode) &&
        Objects.equals(this.comments, contentTags.comments) &&
        equalsNullable(this.migrationId, contentTags.migrationId) &&
        Objects.equals(this.contentId, contentTags.contentId) &&
        Objects.equals(this.tagType, contentTags.tagType) &&
        equalsNullable(this.contextModuleId, contentTags.contextModuleId) &&
        equalsNullable(this.learningOutcomeId, contentTags.learningOutcomeId) &&
        equalsNullable(this.masteryScore, contentTags.masteryScore) &&
        equalsNullable(this.rubricAssociationId, contentTags.rubricAssociationId) &&
        equalsNullable(this.associatedAssetId, contentTags.associatedAssetId) &&
        equalsNullable(this.associatedAssetType, contentTags.associatedAssetType) &&
        Objects.equals(this.linkSettings, contentTags.linkSettings) &&
        equalsNullable(this.newTab, contentTags.newTab) &&
        equalsNullable(this.position, contentTags.position) &&
        equalsNullable(this.contentType, contentTags.contentType) &&
        Objects.equals(this.url, contentTags.url) &&
        Objects.equals(this.title, contentTags.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, workflowState, contextId, contextType, hashCodeNullable(contextCode), comments, hashCodeNullable(migrationId), contentId, tagType, hashCodeNullable(contextModuleId), hashCodeNullable(learningOutcomeId), hashCodeNullable(masteryScore), hashCodeNullable(rubricAssociationId), hashCodeNullable(associatedAssetId), hashCodeNullable(associatedAssetType), linkSettings, hashCodeNullable(newTab), hashCodeNullable(position), hashCodeNullable(contentType), url, title);
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
    sb.append("class ContentTags {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    contextCode: ").append(toIndentedString(contextCode)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
    sb.append("    contextModuleId: ").append(toIndentedString(contextModuleId)).append("\n");
    sb.append("    learningOutcomeId: ").append(toIndentedString(learningOutcomeId)).append("\n");
    sb.append("    masteryScore: ").append(toIndentedString(masteryScore)).append("\n");
    sb.append("    rubricAssociationId: ").append(toIndentedString(rubricAssociationId)).append("\n");
    sb.append("    associatedAssetId: ").append(toIndentedString(associatedAssetId)).append("\n");
    sb.append("    associatedAssetType: ").append(toIndentedString(associatedAssetType)).append("\n");
    sb.append("    linkSettings: ").append(toIndentedString(linkSettings)).append("\n");
    sb.append("    newTab: ").append(toIndentedString(newTab)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

