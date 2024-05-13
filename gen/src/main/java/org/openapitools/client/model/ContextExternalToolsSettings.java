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
 * ContextExternalToolsSettings
 */
@JsonPropertyOrder({
  ContextExternalToolsSettings.JSON_PROPERTY_COURSE_HOME_SUB_NAVIGATION,
  ContextExternalToolsSettings.JSON_PROPERTY_COURSE_SETTINGS_SUB_NAVIGATION,
  ContextExternalToolsSettings.JSON_PROPERTY_CUSTOM_FIELDS,
  ContextExternalToolsSettings.JSON_PROPERTY_DISCUSSION_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_DISCUSSION_TOPIC_INDEX_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_DISCUSSION_TOPIC_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_EDITOR_BUTTON,
  ContextExternalToolsSettings.JSON_PROPERTY_ENABLED,
  ContextExternalToolsSettings.JSON_PROPERTY_FILE_INDEX_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_FILE_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_GLOBAL_NAVIGATION,
  ContextExternalToolsSettings.JSON_PROPERTY_GRADE_PASSBACK,
  ContextExternalToolsSettings.JSON_PROPERTY_HOMEWORK_SELECTION,
  ContextExternalToolsSettings.JSON_PROPERTY_HOMEWORK_SUBMISSION,
  ContextExternalToolsSettings.JSON_PROPERTY_LAUNCH_PRESENTATION_DOCUMENT_TARGET,
  ContextExternalToolsSettings.JSON_PROPERTY_LINK_SELECTION,
  ContextExternalToolsSettings.JSON_PROPERTY_MIGRATION_SELECTION,
  ContextExternalToolsSettings.JSON_PROPERTY_MODULE_GROUP_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_MODULE_INDEX_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_ACCOUNT_NAVIGATION,
  ContextExternalToolsSettings.JSON_PROPERTY_ASSIGNMENT_GROUP_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_ASSIGNMENT_INDEX_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_ASSIGNMENT_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_ASSIGNMENT_SELECTION,
  ContextExternalToolsSettings.JSON_PROPERTY_CANVAS_CALIPER_URL,
  ContextExternalToolsSettings.JSON_PROPERTY_COLLABORATION,
  ContextExternalToolsSettings.JSON_PROPERTY_CONTENT_MIGRATION,
  ContextExternalToolsSettings.JSON_PROPERTY_COURSE_ASSIGNMENTS_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_COURSE_NAVIGATION,
  ContextExternalToolsSettings.JSON_PROPERTY_MODULE_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_POST_GRADES,
  ContextExternalToolsSettings.JSON_PROPERTY_QUIZ_INDEX_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_QUIZ_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_SIMILARITY_DETECTION,
  ContextExternalToolsSettings.JSON_PROPERTY_STUDENT_CONTEXT_CARD,
  ContextExternalToolsSettings.JSON_PROPERTY_TEXT,
  ContextExternalToolsSettings.JSON_PROPERTY_TOOL_CONFIGURATION,
  ContextExternalToolsSettings.JSON_PROPERTY_USE13,
  ContextExternalToolsSettings.JSON_PROPERTY_USER_NAVIGATION,
  ContextExternalToolsSettings.JSON_PROPERTY_VISIBILITY,
  ContextExternalToolsSettings.JSON_PROPERTY_WIKI_INDEX_MENU,
  ContextExternalToolsSettings.JSON_PROPERTY_WIKI_PAGE_MENU
})
@JsonTypeName("context_external_tools__settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContextExternalToolsSettings {
  public static final String JSON_PROPERTY_COURSE_HOME_SUB_NAVIGATION = "course_home_sub_navigation";
  private JsonNullable<Object> courseHomeSubNavigation = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_SETTINGS_SUB_NAVIGATION = "course_settings_sub_navigation";
  private JsonNullable<Object> courseSettingsSubNavigation = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private JsonNullable<Object> customFields = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISCUSSION_MENU = "discussion_menu";
  private JsonNullable<Object> discussionMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISCUSSION_TOPIC_INDEX_MENU = "discussion_topic_index_menu";
  private JsonNullable<Object> discussionTopicIndexMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISCUSSION_TOPIC_MENU = "discussion_topic_menu";
  private JsonNullable<Object> discussionTopicMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EDITOR_BUTTON = "editor_button";
  private JsonNullable<Object> editorButton = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private JsonNullable<Object> enabled = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FILE_INDEX_MENU = "file_index_menu";
  private JsonNullable<Object> fileIndexMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FILE_MENU = "file_menu";
  private JsonNullable<Object> fileMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GLOBAL_NAVIGATION = "global_navigation";
  private JsonNullable<Object> globalNavigation = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GRADE_PASSBACK = "grade_passback";
  private JsonNullable<Object> gradePassback = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HOMEWORK_SELECTION = "homework_selection";
  private JsonNullable<Object> homeworkSelection = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HOMEWORK_SUBMISSION = "homework_submission";
  private JsonNullable<Object> homeworkSubmission = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAUNCH_PRESENTATION_DOCUMENT_TARGET = "launch_presentation_document_target";
  private JsonNullable<Object> launchPresentationDocumentTarget = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LINK_SELECTION = "link_selection";
  private JsonNullable<Object> linkSelection = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIGRATION_SELECTION = "migration_selection";
  private JsonNullable<Object> migrationSelection = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MODULE_GROUP_MENU = "module_group_menu";
  private JsonNullable<Object> moduleGroupMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MODULE_INDEX_MENU = "module_index_menu";
  private JsonNullable<Object> moduleIndexMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ACCOUNT_NAVIGATION = "account_navigation";
  private JsonNullable<Object> accountNavigation = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_MENU = "assignment_group_menu";
  private JsonNullable<Object> assignmentGroupMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_INDEX_MENU = "assignment_index_menu";
  private JsonNullable<Object> assignmentIndexMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_MENU = "assignment_menu";
  private JsonNullable<Object> assignmentMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_SELECTION = "assignment_selection";
  private JsonNullable<Object> assignmentSelection = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CANVAS_CALIPER_URL = "canvas_caliper_url";
  private JsonNullable<Object> canvasCaliperUrl = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COLLABORATION = "collaboration";
  private JsonNullable<Object> collaboration = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTENT_MIGRATION = "content_migration";
  private JsonNullable<Object> contentMigration = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_ASSIGNMENTS_MENU = "course_assignments_menu";
  private JsonNullable<Object> courseAssignmentsMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_NAVIGATION = "course_navigation";
  private JsonNullable<Object> courseNavigation = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MODULE_MENU = "module_menu";
  private JsonNullable<Object> moduleMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_POST_GRADES = "post_grades";
  private JsonNullable<Object> postGrades = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUIZ_INDEX_MENU = "quiz_index_menu";
  private JsonNullable<Object> quizIndexMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUIZ_MENU = "quiz_menu";
  private JsonNullable<Object> quizMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIMILARITY_DETECTION = "similarity_detection";
  private JsonNullable<Object> similarityDetection = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STUDENT_CONTEXT_CARD = "student_context_card";
  private JsonNullable<Object> studentContextCard = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<Object> text = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TOOL_CONFIGURATION = "tool_configuration";
  private JsonNullable<Object> toolConfiguration = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USE13 = "use_1_3";
  private JsonNullable<Object> use13 = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_NAVIGATION = "user_navigation";
  private JsonNullable<Object> userNavigation = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private JsonNullable<Object> visibility = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WIKI_INDEX_MENU = "wiki_index_menu";
  private JsonNullable<Object> wikiIndexMenu = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WIKI_PAGE_MENU = "wiki_page_menu";
  private JsonNullable<Object> wikiPageMenu = JsonNullable.<Object>of(null);

  public ContextExternalToolsSettings() {
  }

  public ContextExternalToolsSettings courseHomeSubNavigation(Object courseHomeSubNavigation) {
    this.courseHomeSubNavigation = JsonNullable.<Object>of(courseHomeSubNavigation);
    
    return this;
  }

   /**
   * Course home sub navigation placement type.
   * @return courseHomeSubNavigation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseHomeSubNavigation() {
        return courseHomeSubNavigation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_HOME_SUB_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseHomeSubNavigation_JsonNullable() {
    return courseHomeSubNavigation;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_HOME_SUB_NAVIGATION)
  public void setCourseHomeSubNavigation_JsonNullable(JsonNullable<Object> courseHomeSubNavigation) {
    this.courseHomeSubNavigation = courseHomeSubNavigation;
  }

  public void setCourseHomeSubNavigation(Object courseHomeSubNavigation) {
    this.courseHomeSubNavigation = JsonNullable.<Object>of(courseHomeSubNavigation);
  }


  public ContextExternalToolsSettings courseSettingsSubNavigation(Object courseSettingsSubNavigation) {
    this.courseSettingsSubNavigation = JsonNullable.<Object>of(courseSettingsSubNavigation);
    
    return this;
  }

   /**
   * Course settings sub navigation placement type.
   * @return courseSettingsSubNavigation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseSettingsSubNavigation() {
        return courseSettingsSubNavigation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_SETTINGS_SUB_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseSettingsSubNavigation_JsonNullable() {
    return courseSettingsSubNavigation;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_SETTINGS_SUB_NAVIGATION)
  public void setCourseSettingsSubNavigation_JsonNullable(JsonNullable<Object> courseSettingsSubNavigation) {
    this.courseSettingsSubNavigation = courseSettingsSubNavigation;
  }

  public void setCourseSettingsSubNavigation(Object courseSettingsSubNavigation) {
    this.courseSettingsSubNavigation = JsonNullable.<Object>of(courseSettingsSubNavigation);
  }


  public ContextExternalToolsSettings customFields(Object customFields) {
    this.customFields = JsonNullable.<Object>of(customFields);
    
    return this;
  }

   /**
   * Custom parameters provider request to share on every single LTI launch, each placement column might have its own set of custom_fields.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCustomFields() {
        return customFields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCustomFields_JsonNullable() {
    return customFields;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  public void setCustomFields_JsonNullable(JsonNullable<Object> customFields) {
    this.customFields = customFields;
  }

  public void setCustomFields(Object customFields) {
    this.customFields = JsonNullable.<Object>of(customFields);
  }


  public ContextExternalToolsSettings discussionMenu(Object discussionMenu) {
    this.discussionMenu = JsonNullable.<Object>of(discussionMenu);
    
    return this;
  }

   /**
   * Discussion menu placement type.
   * @return discussionMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDiscussionMenu() {
        return discussionMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCUSSION_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscussionMenu_JsonNullable() {
    return discussionMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCUSSION_MENU)
  public void setDiscussionMenu_JsonNullable(JsonNullable<Object> discussionMenu) {
    this.discussionMenu = discussionMenu;
  }

  public void setDiscussionMenu(Object discussionMenu) {
    this.discussionMenu = JsonNullable.<Object>of(discussionMenu);
  }


  public ContextExternalToolsSettings discussionTopicIndexMenu(Object discussionTopicIndexMenu) {
    this.discussionTopicIndexMenu = JsonNullable.<Object>of(discussionTopicIndexMenu);
    
    return this;
  }

   /**
   * Discussion topic index menu placement type.
   * @return discussionTopicIndexMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDiscussionTopicIndexMenu() {
        return discussionTopicIndexMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCUSSION_TOPIC_INDEX_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscussionTopicIndexMenu_JsonNullable() {
    return discussionTopicIndexMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCUSSION_TOPIC_INDEX_MENU)
  public void setDiscussionTopicIndexMenu_JsonNullable(JsonNullable<Object> discussionTopicIndexMenu) {
    this.discussionTopicIndexMenu = discussionTopicIndexMenu;
  }

  public void setDiscussionTopicIndexMenu(Object discussionTopicIndexMenu) {
    this.discussionTopicIndexMenu = JsonNullable.<Object>of(discussionTopicIndexMenu);
  }


  public ContextExternalToolsSettings discussionTopicMenu(Object discussionTopicMenu) {
    this.discussionTopicMenu = JsonNullable.<Object>of(discussionTopicMenu);
    
    return this;
  }

   /**
   * Discussion topic menu placement type.
   * @return discussionTopicMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDiscussionTopicMenu() {
        return discussionTopicMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCUSSION_TOPIC_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscussionTopicMenu_JsonNullable() {
    return discussionTopicMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCUSSION_TOPIC_MENU)
  public void setDiscussionTopicMenu_JsonNullable(JsonNullable<Object> discussionTopicMenu) {
    this.discussionTopicMenu = discussionTopicMenu;
  }

  public void setDiscussionTopicMenu(Object discussionTopicMenu) {
    this.discussionTopicMenu = JsonNullable.<Object>of(discussionTopicMenu);
  }


  public ContextExternalToolsSettings editorButton(Object editorButton) {
    this.editorButton = JsonNullable.<Object>of(editorButton);
    
    return this;
  }

   /**
   * RCE placement type.
   * @return editorButton
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEditorButton() {
        return editorButton.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EDITOR_BUTTON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEditorButton_JsonNullable() {
    return editorButton;
  }
  
  @JsonProperty(JSON_PROPERTY_EDITOR_BUTTON)
  public void setEditorButton_JsonNullable(JsonNullable<Object> editorButton) {
    this.editorButton = editorButton;
  }

  public void setEditorButton(Object editorButton) {
    this.editorButton = JsonNullable.<Object>of(editorButton);
  }


  public ContextExternalToolsSettings enabled(Object enabled) {
    this.enabled = JsonNullable.<Object>of(enabled);
    
    return this;
  }

   /**
   * Controls if the tool is disabled for user to click on, typically tool gets removed altogether but sometimes provider uses this setting to just disable it in the UI.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEnabled() {
        return enabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEnabled_JsonNullable() {
    return enabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<Object> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(Object enabled) {
    this.enabled = JsonNullable.<Object>of(enabled);
  }


  public ContextExternalToolsSettings fileIndexMenu(Object fileIndexMenu) {
    this.fileIndexMenu = JsonNullable.<Object>of(fileIndexMenu);
    
    return this;
  }

   /**
   * File index menu placement type.
   * @return fileIndexMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFileIndexMenu() {
        return fileIndexMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_INDEX_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFileIndexMenu_JsonNullable() {
    return fileIndexMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_INDEX_MENU)
  public void setFileIndexMenu_JsonNullable(JsonNullable<Object> fileIndexMenu) {
    this.fileIndexMenu = fileIndexMenu;
  }

  public void setFileIndexMenu(Object fileIndexMenu) {
    this.fileIndexMenu = JsonNullable.<Object>of(fileIndexMenu);
  }


  public ContextExternalToolsSettings fileMenu(Object fileMenu) {
    this.fileMenu = JsonNullable.<Object>of(fileMenu);
    
    return this;
  }

   /**
   * File menu placement type.
   * @return fileMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFileMenu() {
        return fileMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFileMenu_JsonNullable() {
    return fileMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_MENU)
  public void setFileMenu_JsonNullable(JsonNullable<Object> fileMenu) {
    this.fileMenu = fileMenu;
  }

  public void setFileMenu(Object fileMenu) {
    this.fileMenu = JsonNullable.<Object>of(fileMenu);
  }


  public ContextExternalToolsSettings globalNavigation(Object globalNavigation) {
    this.globalNavigation = JsonNullable.<Object>of(globalNavigation);
    
    return this;
  }

   /**
   * Global navigation placement type.
   * @return globalNavigation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGlobalNavigation() {
        return globalNavigation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGlobalNavigation_JsonNullable() {
    return globalNavigation;
  }
  
  @JsonProperty(JSON_PROPERTY_GLOBAL_NAVIGATION)
  public void setGlobalNavigation_JsonNullable(JsonNullable<Object> globalNavigation) {
    this.globalNavigation = globalNavigation;
  }

  public void setGlobalNavigation(Object globalNavigation) {
    this.globalNavigation = JsonNullable.<Object>of(globalNavigation);
  }


  public ContextExternalToolsSettings gradePassback(Object gradePassback) {
    this.gradePassback = JsonNullable.<Object>of(gradePassback);
    
    return this;
  }

   /**
   * Grade pass-back placement type.
   * @return gradePassback
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGradePassback() {
        return gradePassback.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GRADE_PASSBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGradePassback_JsonNullable() {
    return gradePassback;
  }
  
  @JsonProperty(JSON_PROPERTY_GRADE_PASSBACK)
  public void setGradePassback_JsonNullable(JsonNullable<Object> gradePassback) {
    this.gradePassback = gradePassback;
  }

  public void setGradePassback(Object gradePassback) {
    this.gradePassback = JsonNullable.<Object>of(gradePassback);
  }


  public ContextExternalToolsSettings homeworkSelection(Object homeworkSelection) {
    this.homeworkSelection = JsonNullable.<Object>of(homeworkSelection);
    
    return this;
  }

   /**
   * Homework selection placement type.
   * @return homeworkSelection
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHomeworkSelection() {
        return homeworkSelection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOMEWORK_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHomeworkSelection_JsonNullable() {
    return homeworkSelection;
  }
  
  @JsonProperty(JSON_PROPERTY_HOMEWORK_SELECTION)
  public void setHomeworkSelection_JsonNullable(JsonNullable<Object> homeworkSelection) {
    this.homeworkSelection = homeworkSelection;
  }

  public void setHomeworkSelection(Object homeworkSelection) {
    this.homeworkSelection = JsonNullable.<Object>of(homeworkSelection);
  }


  public ContextExternalToolsSettings homeworkSubmission(Object homeworkSubmission) {
    this.homeworkSubmission = JsonNullable.<Object>of(homeworkSubmission);
    
    return this;
  }

   /**
   * Homework submission placement type.
   * @return homeworkSubmission
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHomeworkSubmission() {
        return homeworkSubmission.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOMEWORK_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHomeworkSubmission_JsonNullable() {
    return homeworkSubmission;
  }
  
  @JsonProperty(JSON_PROPERTY_HOMEWORK_SUBMISSION)
  public void setHomeworkSubmission_JsonNullable(JsonNullable<Object> homeworkSubmission) {
    this.homeworkSubmission = homeworkSubmission;
  }

  public void setHomeworkSubmission(Object homeworkSubmission) {
    this.homeworkSubmission = JsonNullable.<Object>of(homeworkSubmission);
  }


  public ContextExternalToolsSettings launchPresentationDocumentTarget(Object launchPresentationDocumentTarget) {
    this.launchPresentationDocumentTarget = JsonNullable.<Object>of(launchPresentationDocumentTarget);
    
    return this;
  }

   /**
   * Tells us if it should be opened in another window.
   * @return launchPresentationDocumentTarget
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLaunchPresentationDocumentTarget() {
        return launchPresentationDocumentTarget.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAUNCH_PRESENTATION_DOCUMENT_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLaunchPresentationDocumentTarget_JsonNullable() {
    return launchPresentationDocumentTarget;
  }
  
  @JsonProperty(JSON_PROPERTY_LAUNCH_PRESENTATION_DOCUMENT_TARGET)
  public void setLaunchPresentationDocumentTarget_JsonNullable(JsonNullable<Object> launchPresentationDocumentTarget) {
    this.launchPresentationDocumentTarget = launchPresentationDocumentTarget;
  }

  public void setLaunchPresentationDocumentTarget(Object launchPresentationDocumentTarget) {
    this.launchPresentationDocumentTarget = JsonNullable.<Object>of(launchPresentationDocumentTarget);
  }


  public ContextExternalToolsSettings linkSelection(Object linkSelection) {
    this.linkSelection = JsonNullable.<Object>of(linkSelection);
    
    return this;
  }

   /**
   * Link selection placement type.
   * @return linkSelection
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLinkSelection() {
        return linkSelection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLinkSelection_JsonNullable() {
    return linkSelection;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK_SELECTION)
  public void setLinkSelection_JsonNullable(JsonNullable<Object> linkSelection) {
    this.linkSelection = linkSelection;
  }

  public void setLinkSelection(Object linkSelection) {
    this.linkSelection = JsonNullable.<Object>of(linkSelection);
  }


  public ContextExternalToolsSettings migrationSelection(Object migrationSelection) {
    this.migrationSelection = JsonNullable.<Object>of(migrationSelection);
    
    return this;
  }

   /**
   * Migration selection placement type.
   * @return migrationSelection
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMigrationSelection() {
        return migrationSelection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMigrationSelection_JsonNullable() {
    return migrationSelection;
  }
  
  @JsonProperty(JSON_PROPERTY_MIGRATION_SELECTION)
  public void setMigrationSelection_JsonNullable(JsonNullable<Object> migrationSelection) {
    this.migrationSelection = migrationSelection;
  }

  public void setMigrationSelection(Object migrationSelection) {
    this.migrationSelection = JsonNullable.<Object>of(migrationSelection);
  }


  public ContextExternalToolsSettings moduleGroupMenu(Object moduleGroupMenu) {
    this.moduleGroupMenu = JsonNullable.<Object>of(moduleGroupMenu);
    
    return this;
  }

   /**
   * Module group menu placement type.
   * @return moduleGroupMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getModuleGroupMenu() {
        return moduleGroupMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE_GROUP_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getModuleGroupMenu_JsonNullable() {
    return moduleGroupMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE_GROUP_MENU)
  public void setModuleGroupMenu_JsonNullable(JsonNullable<Object> moduleGroupMenu) {
    this.moduleGroupMenu = moduleGroupMenu;
  }

  public void setModuleGroupMenu(Object moduleGroupMenu) {
    this.moduleGroupMenu = JsonNullable.<Object>of(moduleGroupMenu);
  }


  public ContextExternalToolsSettings moduleIndexMenu(Object moduleIndexMenu) {
    this.moduleIndexMenu = JsonNullable.<Object>of(moduleIndexMenu);
    
    return this;
  }

   /**
   * Module index menu placement type.
   * @return moduleIndexMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getModuleIndexMenu() {
        return moduleIndexMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE_INDEX_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getModuleIndexMenu_JsonNullable() {
    return moduleIndexMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE_INDEX_MENU)
  public void setModuleIndexMenu_JsonNullable(JsonNullable<Object> moduleIndexMenu) {
    this.moduleIndexMenu = moduleIndexMenu;
  }

  public void setModuleIndexMenu(Object moduleIndexMenu) {
    this.moduleIndexMenu = JsonNullable.<Object>of(moduleIndexMenu);
  }


  public ContextExternalToolsSettings accountNavigation(Object accountNavigation) {
    this.accountNavigation = JsonNullable.<Object>of(accountNavigation);
    
    return this;
  }

   /**
   * account navigation placement type.
   * @return accountNavigation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAccountNavigation() {
        return accountNavigation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAccountNavigation_JsonNullable() {
    return accountNavigation;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAVIGATION)
  public void setAccountNavigation_JsonNullable(JsonNullable<Object> accountNavigation) {
    this.accountNavigation = accountNavigation;
  }

  public void setAccountNavigation(Object accountNavigation) {
    this.accountNavigation = JsonNullable.<Object>of(accountNavigation);
  }


  public ContextExternalToolsSettings assignmentGroupMenu(Object assignmentGroupMenu) {
    this.assignmentGroupMenu = JsonNullable.<Object>of(assignmentGroupMenu);
    
    return this;
  }

   /**
   * Assignment group menu placement type.
   * @return assignmentGroupMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentGroupMenu() {
        return assignmentGroupMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentGroupMenu_JsonNullable() {
    return assignmentGroupMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_MENU)
  public void setAssignmentGroupMenu_JsonNullable(JsonNullable<Object> assignmentGroupMenu) {
    this.assignmentGroupMenu = assignmentGroupMenu;
  }

  public void setAssignmentGroupMenu(Object assignmentGroupMenu) {
    this.assignmentGroupMenu = JsonNullable.<Object>of(assignmentGroupMenu);
  }


  public ContextExternalToolsSettings assignmentIndexMenu(Object assignmentIndexMenu) {
    this.assignmentIndexMenu = JsonNullable.<Object>of(assignmentIndexMenu);
    
    return this;
  }

   /**
   * Assignment index menu placement type.
   * @return assignmentIndexMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentIndexMenu() {
        return assignmentIndexMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_INDEX_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentIndexMenu_JsonNullable() {
    return assignmentIndexMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_INDEX_MENU)
  public void setAssignmentIndexMenu_JsonNullable(JsonNullable<Object> assignmentIndexMenu) {
    this.assignmentIndexMenu = assignmentIndexMenu;
  }

  public void setAssignmentIndexMenu(Object assignmentIndexMenu) {
    this.assignmentIndexMenu = JsonNullable.<Object>of(assignmentIndexMenu);
  }


  public ContextExternalToolsSettings assignmentMenu(Object assignmentMenu) {
    this.assignmentMenu = JsonNullable.<Object>of(assignmentMenu);
    
    return this;
  }

   /**
   * Assignment menu placement type.
   * @return assignmentMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentMenu() {
        return assignmentMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentMenu_JsonNullable() {
    return assignmentMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_MENU)
  public void setAssignmentMenu_JsonNullable(JsonNullable<Object> assignmentMenu) {
    this.assignmentMenu = assignmentMenu;
  }

  public void setAssignmentMenu(Object assignmentMenu) {
    this.assignmentMenu = JsonNullable.<Object>of(assignmentMenu);
  }


  public ContextExternalToolsSettings assignmentSelection(Object assignmentSelection) {
    this.assignmentSelection = JsonNullable.<Object>of(assignmentSelection);
    
    return this;
  }

   /**
   * Assignment selection placement type.
   * @return assignmentSelection
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentSelection() {
        return assignmentSelection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentSelection_JsonNullable() {
    return assignmentSelection;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SELECTION)
  public void setAssignmentSelection_JsonNullable(JsonNullable<Object> assignmentSelection) {
    this.assignmentSelection = assignmentSelection;
  }

  public void setAssignmentSelection(Object assignmentSelection) {
    this.assignmentSelection = JsonNullable.<Object>of(assignmentSelection);
  }


  public ContextExternalToolsSettings canvasCaliperUrl(Object canvasCaliperUrl) {
    this.canvasCaliperUrl = JsonNullable.<Object>of(canvasCaliperUrl);
    
    return this;
  }

   /**
   * URL to caliper endpoint if supported by the tool.
   * @return canvasCaliperUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCanvasCaliperUrl() {
        return canvasCaliperUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CANVAS_CALIPER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCanvasCaliperUrl_JsonNullable() {
    return canvasCaliperUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_CANVAS_CALIPER_URL)
  public void setCanvasCaliperUrl_JsonNullable(JsonNullable<Object> canvasCaliperUrl) {
    this.canvasCaliperUrl = canvasCaliperUrl;
  }

  public void setCanvasCaliperUrl(Object canvasCaliperUrl) {
    this.canvasCaliperUrl = JsonNullable.<Object>of(canvasCaliperUrl);
  }


  public ContextExternalToolsSettings collaboration(Object collaboration) {
    this.collaboration = JsonNullable.<Object>of(collaboration);
    
    return this;
  }

   /**
   * Collaboration placement type.
   * @return collaboration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCollaboration() {
        return collaboration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLLABORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCollaboration_JsonNullable() {
    return collaboration;
  }
  
  @JsonProperty(JSON_PROPERTY_COLLABORATION)
  public void setCollaboration_JsonNullable(JsonNullable<Object> collaboration) {
    this.collaboration = collaboration;
  }

  public void setCollaboration(Object collaboration) {
    this.collaboration = JsonNullable.<Object>of(collaboration);
  }


  public ContextExternalToolsSettings contentMigration(Object contentMigration) {
    this.contentMigration = JsonNullable.<Object>of(contentMigration);
    
    return this;
  }

   /**
   * Content migration placement type.
   * @return contentMigration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContentMigration() {
        return contentMigration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT_MIGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContentMigration_JsonNullable() {
    return contentMigration;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT_MIGRATION)
  public void setContentMigration_JsonNullable(JsonNullable<Object> contentMigration) {
    this.contentMigration = contentMigration;
  }

  public void setContentMigration(Object contentMigration) {
    this.contentMigration = JsonNullable.<Object>of(contentMigration);
  }


  public ContextExternalToolsSettings courseAssignmentsMenu(Object courseAssignmentsMenu) {
    this.courseAssignmentsMenu = JsonNullable.<Object>of(courseAssignmentsMenu);
    
    return this;
  }

   /**
   * Course assignments menu placement type.
   * @return courseAssignmentsMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseAssignmentsMenu() {
        return courseAssignmentsMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_ASSIGNMENTS_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseAssignmentsMenu_JsonNullable() {
    return courseAssignmentsMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_ASSIGNMENTS_MENU)
  public void setCourseAssignmentsMenu_JsonNullable(JsonNullable<Object> courseAssignmentsMenu) {
    this.courseAssignmentsMenu = courseAssignmentsMenu;
  }

  public void setCourseAssignmentsMenu(Object courseAssignmentsMenu) {
    this.courseAssignmentsMenu = JsonNullable.<Object>of(courseAssignmentsMenu);
  }


  public ContextExternalToolsSettings courseNavigation(Object courseNavigation) {
    this.courseNavigation = JsonNullable.<Object>of(courseNavigation);
    
    return this;
  }

   /**
   * Course navigation placement type.
   * @return courseNavigation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseNavigation() {
        return courseNavigation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseNavigation_JsonNullable() {
    return courseNavigation;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_NAVIGATION)
  public void setCourseNavigation_JsonNullable(JsonNullable<Object> courseNavigation) {
    this.courseNavigation = courseNavigation;
  }

  public void setCourseNavigation(Object courseNavigation) {
    this.courseNavigation = JsonNullable.<Object>of(courseNavigation);
  }


  public ContextExternalToolsSettings moduleMenu(Object moduleMenu) {
    this.moduleMenu = JsonNullable.<Object>of(moduleMenu);
    
    return this;
  }

   /**
   * Module menu placement type.
   * @return moduleMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getModuleMenu() {
        return moduleMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getModuleMenu_JsonNullable() {
    return moduleMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE_MENU)
  public void setModuleMenu_JsonNullable(JsonNullable<Object> moduleMenu) {
    this.moduleMenu = moduleMenu;
  }

  public void setModuleMenu(Object moduleMenu) {
    this.moduleMenu = JsonNullable.<Object>of(moduleMenu);
  }


  public ContextExternalToolsSettings postGrades(Object postGrades) {
    this.postGrades = JsonNullable.<Object>of(postGrades);
    
    return this;
  }

   /**
   * Post grades placement type.
   * @return postGrades
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPostGrades() {
        return postGrades.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POST_GRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPostGrades_JsonNullable() {
    return postGrades;
  }
  
  @JsonProperty(JSON_PROPERTY_POST_GRADES)
  public void setPostGrades_JsonNullable(JsonNullable<Object> postGrades) {
    this.postGrades = postGrades;
  }

  public void setPostGrades(Object postGrades) {
    this.postGrades = JsonNullable.<Object>of(postGrades);
  }


  public ContextExternalToolsSettings quizIndexMenu(Object quizIndexMenu) {
    this.quizIndexMenu = JsonNullable.<Object>of(quizIndexMenu);
    
    return this;
  }

   /**
   * Quiz index menu placement type.
   * @return quizIndexMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizIndexMenu() {
        return quizIndexMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_INDEX_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizIndexMenu_JsonNullable() {
    return quizIndexMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_INDEX_MENU)
  public void setQuizIndexMenu_JsonNullable(JsonNullable<Object> quizIndexMenu) {
    this.quizIndexMenu = quizIndexMenu;
  }

  public void setQuizIndexMenu(Object quizIndexMenu) {
    this.quizIndexMenu = JsonNullable.<Object>of(quizIndexMenu);
  }


  public ContextExternalToolsSettings quizMenu(Object quizMenu) {
    this.quizMenu = JsonNullable.<Object>of(quizMenu);
    
    return this;
  }

   /**
   * Quiz menu placement type.
   * @return quizMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizMenu() {
        return quizMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizMenu_JsonNullable() {
    return quizMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_MENU)
  public void setQuizMenu_JsonNullable(JsonNullable<Object> quizMenu) {
    this.quizMenu = quizMenu;
  }

  public void setQuizMenu(Object quizMenu) {
    this.quizMenu = JsonNullable.<Object>of(quizMenu);
  }


  public ContextExternalToolsSettings similarityDetection(Object similarityDetection) {
    this.similarityDetection = JsonNullable.<Object>of(similarityDetection);
    
    return this;
  }

   /**
   * Plagiarism platform placement.
   * @return similarityDetection
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSimilarityDetection() {
        return similarityDetection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIMILARITY_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSimilarityDetection_JsonNullable() {
    return similarityDetection;
  }
  
  @JsonProperty(JSON_PROPERTY_SIMILARITY_DETECTION)
  public void setSimilarityDetection_JsonNullable(JsonNullable<Object> similarityDetection) {
    this.similarityDetection = similarityDetection;
  }

  public void setSimilarityDetection(Object similarityDetection) {
    this.similarityDetection = JsonNullable.<Object>of(similarityDetection);
  }


  public ContextExternalToolsSettings studentContextCard(Object studentContextCard) {
    this.studentContextCard = JsonNullable.<Object>of(studentContextCard);
    
    return this;
  }

   /**
   * Student context card placement type.
   * @return studentContextCard
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStudentContextCard() {
        return studentContextCard.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STUDENT_CONTEXT_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStudentContextCard_JsonNullable() {
    return studentContextCard;
  }
  
  @JsonProperty(JSON_PROPERTY_STUDENT_CONTEXT_CARD)
  public void setStudentContextCard_JsonNullable(JsonNullable<Object> studentContextCard) {
    this.studentContextCard = studentContextCard;
  }

  public void setStudentContextCard(Object studentContextCard) {
    this.studentContextCard = JsonNullable.<Object>of(studentContextCard);
  }


  public ContextExternalToolsSettings text(Object text) {
    this.text = JsonNullable.<Object>of(text);
    
    return this;
  }

   /**
   * Identifies the name of the tool, default what the user can see if no label is set.
   * @return text
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<Object> text) {
    this.text = text;
  }

  public void setText(Object text) {
    this.text = JsonNullable.<Object>of(text);
  }


  public ContextExternalToolsSettings toolConfiguration(Object toolConfiguration) {
    this.toolConfiguration = JsonNullable.<Object>of(toolConfiguration);
    
    return this;
  }

   /**
   * Identifies the LTI tool configuration dataset.
   * @return toolConfiguration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getToolConfiguration() {
        return toolConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOOL_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getToolConfiguration_JsonNullable() {
    return toolConfiguration;
  }
  
  @JsonProperty(JSON_PROPERTY_TOOL_CONFIGURATION)
  public void setToolConfiguration_JsonNullable(JsonNullable<Object> toolConfiguration) {
    this.toolConfiguration = toolConfiguration;
  }

  public void setToolConfiguration(Object toolConfiguration) {
    this.toolConfiguration = JsonNullable.<Object>of(toolConfiguration);
  }


  public ContextExternalToolsSettings use13(Object use13) {
    this.use13 = JsonNullable.<Object>of(use13);
    
    return this;
  }

   /**
   * LTI 1.3 compliant tool.
   * @return use13
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUse13() {
        return use13.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USE13)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUse13_JsonNullable() {
    return use13;
  }
  
  @JsonProperty(JSON_PROPERTY_USE13)
  public void setUse13_JsonNullable(JsonNullable<Object> use13) {
    this.use13 = use13;
  }

  public void setUse13(Object use13) {
    this.use13 = JsonNullable.<Object>of(use13);
  }


  public ContextExternalToolsSettings userNavigation(Object userNavigation) {
    this.userNavigation = JsonNullable.<Object>of(userNavigation);
    
    return this;
  }

   /**
   * User navigation placement type.
   * @return userNavigation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserNavigation() {
        return userNavigation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserNavigation_JsonNullable() {
    return userNavigation;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_NAVIGATION)
  public void setUserNavigation_JsonNullable(JsonNullable<Object> userNavigation) {
    this.userNavigation = userNavigation;
  }

  public void setUserNavigation(Object userNavigation) {
    this.userNavigation = JsonNullable.<Object>of(userNavigation);
  }


  public ContextExternalToolsSettings visibility(Object visibility) {
    this.visibility = JsonNullable.<Object>of(visibility);
    
    return this;
  }

   /**
   * Controls if it is an admin only tool, takes values of &#x60;admin&#x60; and &#x60;members&#x60;.
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getVisibility() {
        return visibility.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getVisibility_JsonNullable() {
    return visibility;
  }
  
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  public void setVisibility_JsonNullable(JsonNullable<Object> visibility) {
    this.visibility = visibility;
  }

  public void setVisibility(Object visibility) {
    this.visibility = JsonNullable.<Object>of(visibility);
  }


  public ContextExternalToolsSettings wikiIndexMenu(Object wikiIndexMenu) {
    this.wikiIndexMenu = JsonNullable.<Object>of(wikiIndexMenu);
    
    return this;
  }

   /**
   * Wiki index menu placement type.
   * @return wikiIndexMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWikiIndexMenu() {
        return wikiIndexMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIKI_INDEX_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWikiIndexMenu_JsonNullable() {
    return wikiIndexMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_WIKI_INDEX_MENU)
  public void setWikiIndexMenu_JsonNullable(JsonNullable<Object> wikiIndexMenu) {
    this.wikiIndexMenu = wikiIndexMenu;
  }

  public void setWikiIndexMenu(Object wikiIndexMenu) {
    this.wikiIndexMenu = JsonNullable.<Object>of(wikiIndexMenu);
  }


  public ContextExternalToolsSettings wikiPageMenu(Object wikiPageMenu) {
    this.wikiPageMenu = JsonNullable.<Object>of(wikiPageMenu);
    
    return this;
  }

   /**
   * Wiki page menu placement type.
   * @return wikiPageMenu
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWikiPageMenu() {
        return wikiPageMenu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIKI_PAGE_MENU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWikiPageMenu_JsonNullable() {
    return wikiPageMenu;
  }
  
  @JsonProperty(JSON_PROPERTY_WIKI_PAGE_MENU)
  public void setWikiPageMenu_JsonNullable(JsonNullable<Object> wikiPageMenu) {
    this.wikiPageMenu = wikiPageMenu;
  }

  public void setWikiPageMenu(Object wikiPageMenu) {
    this.wikiPageMenu = JsonNullable.<Object>of(wikiPageMenu);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextExternalToolsSettings contextExternalToolsSettings = (ContextExternalToolsSettings) o;
    return equalsNullable(this.courseHomeSubNavigation, contextExternalToolsSettings.courseHomeSubNavigation) &&
        equalsNullable(this.courseSettingsSubNavigation, contextExternalToolsSettings.courseSettingsSubNavigation) &&
        equalsNullable(this.customFields, contextExternalToolsSettings.customFields) &&
        equalsNullable(this.discussionMenu, contextExternalToolsSettings.discussionMenu) &&
        equalsNullable(this.discussionTopicIndexMenu, contextExternalToolsSettings.discussionTopicIndexMenu) &&
        equalsNullable(this.discussionTopicMenu, contextExternalToolsSettings.discussionTopicMenu) &&
        equalsNullable(this.editorButton, contextExternalToolsSettings.editorButton) &&
        equalsNullable(this.enabled, contextExternalToolsSettings.enabled) &&
        equalsNullable(this.fileIndexMenu, contextExternalToolsSettings.fileIndexMenu) &&
        equalsNullable(this.fileMenu, contextExternalToolsSettings.fileMenu) &&
        equalsNullable(this.globalNavigation, contextExternalToolsSettings.globalNavigation) &&
        equalsNullable(this.gradePassback, contextExternalToolsSettings.gradePassback) &&
        equalsNullable(this.homeworkSelection, contextExternalToolsSettings.homeworkSelection) &&
        equalsNullable(this.homeworkSubmission, contextExternalToolsSettings.homeworkSubmission) &&
        equalsNullable(this.launchPresentationDocumentTarget, contextExternalToolsSettings.launchPresentationDocumentTarget) &&
        equalsNullable(this.linkSelection, contextExternalToolsSettings.linkSelection) &&
        equalsNullable(this.migrationSelection, contextExternalToolsSettings.migrationSelection) &&
        equalsNullable(this.moduleGroupMenu, contextExternalToolsSettings.moduleGroupMenu) &&
        equalsNullable(this.moduleIndexMenu, contextExternalToolsSettings.moduleIndexMenu) &&
        equalsNullable(this.accountNavigation, contextExternalToolsSettings.accountNavigation) &&
        equalsNullable(this.assignmentGroupMenu, contextExternalToolsSettings.assignmentGroupMenu) &&
        equalsNullable(this.assignmentIndexMenu, contextExternalToolsSettings.assignmentIndexMenu) &&
        equalsNullable(this.assignmentMenu, contextExternalToolsSettings.assignmentMenu) &&
        equalsNullable(this.assignmentSelection, contextExternalToolsSettings.assignmentSelection) &&
        equalsNullable(this.canvasCaliperUrl, contextExternalToolsSettings.canvasCaliperUrl) &&
        equalsNullable(this.collaboration, contextExternalToolsSettings.collaboration) &&
        equalsNullable(this.contentMigration, contextExternalToolsSettings.contentMigration) &&
        equalsNullable(this.courseAssignmentsMenu, contextExternalToolsSettings.courseAssignmentsMenu) &&
        equalsNullable(this.courseNavigation, contextExternalToolsSettings.courseNavigation) &&
        equalsNullable(this.moduleMenu, contextExternalToolsSettings.moduleMenu) &&
        equalsNullable(this.postGrades, contextExternalToolsSettings.postGrades) &&
        equalsNullable(this.quizIndexMenu, contextExternalToolsSettings.quizIndexMenu) &&
        equalsNullable(this.quizMenu, contextExternalToolsSettings.quizMenu) &&
        equalsNullable(this.similarityDetection, contextExternalToolsSettings.similarityDetection) &&
        equalsNullable(this.studentContextCard, contextExternalToolsSettings.studentContextCard) &&
        equalsNullable(this.text, contextExternalToolsSettings.text) &&
        equalsNullable(this.toolConfiguration, contextExternalToolsSettings.toolConfiguration) &&
        equalsNullable(this.use13, contextExternalToolsSettings.use13) &&
        equalsNullable(this.userNavigation, contextExternalToolsSettings.userNavigation) &&
        equalsNullable(this.visibility, contextExternalToolsSettings.visibility) &&
        equalsNullable(this.wikiIndexMenu, contextExternalToolsSettings.wikiIndexMenu) &&
        equalsNullable(this.wikiPageMenu, contextExternalToolsSettings.wikiPageMenu);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(courseHomeSubNavigation), hashCodeNullable(courseSettingsSubNavigation), hashCodeNullable(customFields), hashCodeNullable(discussionMenu), hashCodeNullable(discussionTopicIndexMenu), hashCodeNullable(discussionTopicMenu), hashCodeNullable(editorButton), hashCodeNullable(enabled), hashCodeNullable(fileIndexMenu), hashCodeNullable(fileMenu), hashCodeNullable(globalNavigation), hashCodeNullable(gradePassback), hashCodeNullable(homeworkSelection), hashCodeNullable(homeworkSubmission), hashCodeNullable(launchPresentationDocumentTarget), hashCodeNullable(linkSelection), hashCodeNullable(migrationSelection), hashCodeNullable(moduleGroupMenu), hashCodeNullable(moduleIndexMenu), hashCodeNullable(accountNavigation), hashCodeNullable(assignmentGroupMenu), hashCodeNullable(assignmentIndexMenu), hashCodeNullable(assignmentMenu), hashCodeNullable(assignmentSelection), hashCodeNullable(canvasCaliperUrl), hashCodeNullable(collaboration), hashCodeNullable(contentMigration), hashCodeNullable(courseAssignmentsMenu), hashCodeNullable(courseNavigation), hashCodeNullable(moduleMenu), hashCodeNullable(postGrades), hashCodeNullable(quizIndexMenu), hashCodeNullable(quizMenu), hashCodeNullable(similarityDetection), hashCodeNullable(studentContextCard), hashCodeNullable(text), hashCodeNullable(toolConfiguration), hashCodeNullable(use13), hashCodeNullable(userNavigation), hashCodeNullable(visibility), hashCodeNullable(wikiIndexMenu), hashCodeNullable(wikiPageMenu));
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
    sb.append("class ContextExternalToolsSettings {\n");
    sb.append("    courseHomeSubNavigation: ").append(toIndentedString(courseHomeSubNavigation)).append("\n");
    sb.append("    courseSettingsSubNavigation: ").append(toIndentedString(courseSettingsSubNavigation)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    discussionMenu: ").append(toIndentedString(discussionMenu)).append("\n");
    sb.append("    discussionTopicIndexMenu: ").append(toIndentedString(discussionTopicIndexMenu)).append("\n");
    sb.append("    discussionTopicMenu: ").append(toIndentedString(discussionTopicMenu)).append("\n");
    sb.append("    editorButton: ").append(toIndentedString(editorButton)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fileIndexMenu: ").append(toIndentedString(fileIndexMenu)).append("\n");
    sb.append("    fileMenu: ").append(toIndentedString(fileMenu)).append("\n");
    sb.append("    globalNavigation: ").append(toIndentedString(globalNavigation)).append("\n");
    sb.append("    gradePassback: ").append(toIndentedString(gradePassback)).append("\n");
    sb.append("    homeworkSelection: ").append(toIndentedString(homeworkSelection)).append("\n");
    sb.append("    homeworkSubmission: ").append(toIndentedString(homeworkSubmission)).append("\n");
    sb.append("    launchPresentationDocumentTarget: ").append(toIndentedString(launchPresentationDocumentTarget)).append("\n");
    sb.append("    linkSelection: ").append(toIndentedString(linkSelection)).append("\n");
    sb.append("    migrationSelection: ").append(toIndentedString(migrationSelection)).append("\n");
    sb.append("    moduleGroupMenu: ").append(toIndentedString(moduleGroupMenu)).append("\n");
    sb.append("    moduleIndexMenu: ").append(toIndentedString(moduleIndexMenu)).append("\n");
    sb.append("    accountNavigation: ").append(toIndentedString(accountNavigation)).append("\n");
    sb.append("    assignmentGroupMenu: ").append(toIndentedString(assignmentGroupMenu)).append("\n");
    sb.append("    assignmentIndexMenu: ").append(toIndentedString(assignmentIndexMenu)).append("\n");
    sb.append("    assignmentMenu: ").append(toIndentedString(assignmentMenu)).append("\n");
    sb.append("    assignmentSelection: ").append(toIndentedString(assignmentSelection)).append("\n");
    sb.append("    canvasCaliperUrl: ").append(toIndentedString(canvasCaliperUrl)).append("\n");
    sb.append("    collaboration: ").append(toIndentedString(collaboration)).append("\n");
    sb.append("    contentMigration: ").append(toIndentedString(contentMigration)).append("\n");
    sb.append("    courseAssignmentsMenu: ").append(toIndentedString(courseAssignmentsMenu)).append("\n");
    sb.append("    courseNavigation: ").append(toIndentedString(courseNavigation)).append("\n");
    sb.append("    moduleMenu: ").append(toIndentedString(moduleMenu)).append("\n");
    sb.append("    postGrades: ").append(toIndentedString(postGrades)).append("\n");
    sb.append("    quizIndexMenu: ").append(toIndentedString(quizIndexMenu)).append("\n");
    sb.append("    quizMenu: ").append(toIndentedString(quizMenu)).append("\n");
    sb.append("    similarityDetection: ").append(toIndentedString(similarityDetection)).append("\n");
    sb.append("    studentContextCard: ").append(toIndentedString(studentContextCard)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    toolConfiguration: ").append(toIndentedString(toolConfiguration)).append("\n");
    sb.append("    use13: ").append(toIndentedString(use13)).append("\n");
    sb.append("    userNavigation: ").append(toIndentedString(userNavigation)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    wikiIndexMenu: ").append(toIndentedString(wikiIndexMenu)).append("\n");
    sb.append("    wikiPageMenu: ").append(toIndentedString(wikiPageMenu)).append("\n");
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

