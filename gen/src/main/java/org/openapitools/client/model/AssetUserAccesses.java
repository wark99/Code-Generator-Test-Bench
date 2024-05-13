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
import org.openapitools.client.model.AssetUserAccessesDisplayName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Supports canvas page views feature.  Logs view and participation counts for a user + asset combination. Contains information on users&#39; usage of assets (assignments, files, etc.).
 */
@JsonPropertyOrder({
  AssetUserAccesses.JSON_PROPERTY_ID,
  AssetUserAccesses.JSON_PROPERTY_DISPLAY_NAME,
  AssetUserAccesses.JSON_PROPERTY_USER_ID,
  AssetUserAccesses.JSON_PROPERTY_CREATED_AT,
  AssetUserAccesses.JSON_PROPERTY_UPDATED_AT,
  AssetUserAccesses.JSON_PROPERTY_ASSET_CODE,
  AssetUserAccesses.JSON_PROPERTY_ASSET_GROUP_CODE,
  AssetUserAccesses.JSON_PROPERTY_CONTEXT_ID,
  AssetUserAccesses.JSON_PROPERTY_CONTEXT_TYPE,
  AssetUserAccesses.JSON_PROPERTY_LAST_ACCESS,
  AssetUserAccesses.JSON_PROPERTY_ASSET_CATEGORY,
  AssetUserAccesses.JSON_PROPERTY_VIEW_SCORE,
  AssetUserAccesses.JSON_PROPERTY_PARTICIPATE_SCORE,
  AssetUserAccesses.JSON_PROPERTY_ACTION_LEVEL,
  AssetUserAccesses.JSON_PROPERTY_MEMBERSHIP_TYPE
})
@JsonTypeName("asset_user_accesses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AssetUserAccesses {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private AssetUserAccessesDisplayName displayName;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Object> createdAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<Object> updatedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSET_CODE = "asset_code";
  private JsonNullable<Object> assetCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSET_GROUP_CODE = "asset_group_code";
  private JsonNullable<Object> assetGroupCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private JsonNullable<Object> contextId = JsonNullable.<Object>of(null);

  /**
   * The type of the object represented by &#x60;context_id&#x60;.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    ASSESSMENTQUESTION("AssessmentQuestion"),
    
    COURSE("Course"),
    
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

  public static final String JSON_PROPERTY_LAST_ACCESS = "last_access";
  private JsonNullable<Object> lastAccess = JsonNullable.<Object>of(null);

  /**
   * Category of asset accessed.
   */
  public enum AssetCategoryEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ANNOUNCEMENTS("announcements"),
    
    ASSIGNMENTS("assignments"),
    
    CALENDAR_FEED("calendar_feed"),
    
    COLLABORATIONS("collaborations"),
    
    CONFERENCES("conferences"),
    
    FILES("files"),
    
    GRADES("grades"),
    
    HOME("home"),
    
    MODULES("modules"),
    
    OUTCOMES("outcomes"),
    
    PAGES("pages"),
    
    QUIZZES("quizzes"),
    
    ROSTER("roster"),
    
    SPEED_GRADER("speed_grader"),
    
    SYLLABUS("syllabus"),
    
    TOPICS("topics"),
    
    CALENDAR("calendar"),
    
    EXTERNAL_TOOLS("external_tools"),
    
    WIKI("wiki"),
    
    EXTERNAL_URLS("external_urls");

    private Object value;

    AssetCategoryEnum(Object value) {
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
    public static AssetCategoryEnum fromValue(Object value) {
      for (AssetCategoryEnum b : AssetCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ASSET_CATEGORY = "asset_category";
  private JsonNullable<AssetCategoryEnum> assetCategory = JsonNullable.<AssetCategoryEnum>of(null);

  public static final String JSON_PROPERTY_VIEW_SCORE = "view_score";
  private JsonNullable<Object> viewScore = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PARTICIPATE_SCORE = "participate_score";
  private JsonNullable<Object> participateScore = JsonNullable.<Object>of(null);

  /**
   * If this access was viewed or participated with.
   */
  public enum ActionLevelEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    VIEW("view"),
    
    PARTICIPATE("participate");

    private Object value;

    ActionLevelEnum(Object value) {
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
    public static ActionLevelEnum fromValue(Object value) {
      for (ActionLevelEnum b : ActionLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ACTION_LEVEL = "action_level";
  private JsonNullable<ActionLevelEnum> actionLevel = JsonNullable.<ActionLevelEnum>of(null);

  /**
   * The role type of user/enrollment accessing this asset.
   */
  public enum MembershipTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    TEACHERENROLLMENT("TeacherEnrollment"),
    
    ACCOUNTUSER("AccountUser"),
    
    OTHER("Other"),
    
    USER("User"),
    
    NILCLASS("NilClass"),
    
    TAENROLLMENT("TaEnrollment"),
    
    DESIGNERENROLLMENT("DesignerEnrollment"),
    
    OBSERVERENROLLMENT("ObserverEnrollment"),
    
    GROUPMEMBERSHIP("GroupMembership"),
    
    STUDENTENROLLMENT("StudentEnrollment"),
    
    STUDENTVIEWENROLLMENT("StudentViewEnrollment");

    private Object value;

    MembershipTypeEnum(Object value) {
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
    public static MembershipTypeEnum fromValue(Object value) {
      for (MembershipTypeEnum b : MembershipTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_MEMBERSHIP_TYPE = "membership_type";
  private JsonNullable<MembershipTypeEnum> membershipType = JsonNullable.<MembershipTypeEnum>of(null);

  public AssetUserAccesses() {
  }

  public AssetUserAccesses id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a user resource access record.
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


  public AssetUserAccesses displayName(AssetUserAccessesDisplayName displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssetUserAccessesDisplayName getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(AssetUserAccessesDisplayName displayName) {
    this.displayName = displayName;
  }


  public AssetUserAccesses userId(Object userId) {
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


  public AssetUserAccesses createdAt(Object createdAt) {
    this.createdAt = JsonNullable.<Object>of(createdAt);
    
    return this;
  }

   /**
   * Timestamp of when an &#x60;asset_user_accesses&#x60; record was created.
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


  public AssetUserAccesses updatedAt(Object updatedAt) {
    this.updatedAt = JsonNullable.<Object>of(updatedAt);
    
    return this;
  }

   /**
   * Timestamp of when an &#x60;asset_user_accesses&#x60; record was updated.
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


  public AssetUserAccesses assetCode(Object assetCode) {
    this.assetCode = JsonNullable.<Object>of(assetCode);
    
    return this;
  }

   /**
   * It is used to specify the *asset* or the idea of being accessed. For example, &#x60;attachment_{id}&#x60; or &#x60;roster:course_{id}&#x60;.
   * @return assetCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssetCode() {
        return assetCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSET_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssetCode_JsonNullable() {
    return assetCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSET_CODE)
  public void setAssetCode_JsonNullable(JsonNullable<Object> assetCode) {
    this.assetCode = assetCode;
  }

  public void setAssetCode(Object assetCode) {
    this.assetCode = JsonNullable.<Object>of(assetCode);
  }


  public AssetUserAccesses assetGroupCode(Object assetGroupCode) {
    this.assetGroupCode = JsonNullable.<Object>of(assetGroupCode);
    
    return this;
  }

   /**
   * asset_group_code is for the group. For example: calendar_event_{id}.
   * @return assetGroupCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssetGroupCode() {
        return assetGroupCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSET_GROUP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssetGroupCode_JsonNullable() {
    return assetGroupCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSET_GROUP_CODE)
  public void setAssetGroupCode_JsonNullable(JsonNullable<Object> assetGroupCode) {
    this.assetGroupCode = assetGroupCode;
  }

  public void setAssetGroupCode(Object assetGroupCode) {
    this.assetGroupCode = JsonNullable.<Object>of(assetGroupCode);
  }


  public AssetUserAccesses contextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
    
    return this;
  }

   /**
   * The unique identifier for the asset_user_accesses&#39;s context (account, course, user).
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


  public AssetUserAccesses contextType(ContextTypeEnum contextType) {
    
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


  public AssetUserAccesses lastAccess(Object lastAccess) {
    this.lastAccess = JsonNullable.<Object>of(lastAccess);
    
    return this;
  }

   /**
   * Timestamp of last access for a particular asset.
   * @return lastAccess
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastAccess() {
        return lastAccess.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastAccess_JsonNullable() {
    return lastAccess;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_ACCESS)
  public void setLastAccess_JsonNullable(JsonNullable<Object> lastAccess) {
    this.lastAccess = lastAccess;
  }

  public void setLastAccess(Object lastAccess) {
    this.lastAccess = JsonNullable.<Object>of(lastAccess);
  }


  public AssetUserAccesses assetCategory(AssetCategoryEnum assetCategory) {
    this.assetCategory = JsonNullable.<AssetCategoryEnum>of(assetCategory);
    
    return this;
  }

   /**
   * Category of asset accessed.
   * @return assetCategory
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public AssetCategoryEnum getAssetCategory() {
        return assetCategory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSET_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AssetCategoryEnum> getAssetCategory_JsonNullable() {
    return assetCategory;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSET_CATEGORY)
  public void setAssetCategory_JsonNullable(JsonNullable<AssetCategoryEnum> assetCategory) {
    this.assetCategory = assetCategory;
  }

  public void setAssetCategory(AssetCategoryEnum assetCategory) {
    this.assetCategory = JsonNullable.<AssetCategoryEnum>of(assetCategory);
  }


  public AssetUserAccesses viewScore(Object viewScore) {
    this.viewScore = JsonNullable.<Object>of(viewScore);
    
    return this;
  }

   /**
   * The number of times this asset has been viewed by this user.
   * @return viewScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getViewScore() {
        return viewScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEW_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getViewScore_JsonNullable() {
    return viewScore;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEW_SCORE)
  public void setViewScore_JsonNullable(JsonNullable<Object> viewScore) {
    this.viewScore = viewScore;
  }

  public void setViewScore(Object viewScore) {
    this.viewScore = JsonNullable.<Object>of(viewScore);
  }


  public AssetUserAccesses participateScore(Object participateScore) {
    this.participateScore = JsonNullable.<Object>of(participateScore);
    
    return this;
  }

   /**
   * The number of times this asset has been interacted with by this user.
   * @return participateScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getParticipateScore() {
        return participateScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARTICIPATE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getParticipateScore_JsonNullable() {
    return participateScore;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTICIPATE_SCORE)
  public void setParticipateScore_JsonNullable(JsonNullable<Object> participateScore) {
    this.participateScore = participateScore;
  }

  public void setParticipateScore(Object participateScore) {
    this.participateScore = JsonNullable.<Object>of(participateScore);
  }


  public AssetUserAccesses actionLevel(ActionLevelEnum actionLevel) {
    this.actionLevel = JsonNullable.<ActionLevelEnum>of(actionLevel);
    
    return this;
  }

   /**
   * If this access was viewed or participated with.
   * @return actionLevel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ActionLevelEnum getActionLevel() {
        return actionLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ActionLevelEnum> getActionLevel_JsonNullable() {
    return actionLevel;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION_LEVEL)
  public void setActionLevel_JsonNullable(JsonNullable<ActionLevelEnum> actionLevel) {
    this.actionLevel = actionLevel;
  }

  public void setActionLevel(ActionLevelEnum actionLevel) {
    this.actionLevel = JsonNullable.<ActionLevelEnum>of(actionLevel);
  }


  public AssetUserAccesses membershipType(MembershipTypeEnum membershipType) {
    this.membershipType = JsonNullable.<MembershipTypeEnum>of(membershipType);
    
    return this;
  }

   /**
   * The role type of user/enrollment accessing this asset.
   * @return membershipType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MembershipTypeEnum getMembershipType() {
        return membershipType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEMBERSHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MembershipTypeEnum> getMembershipType_JsonNullable() {
    return membershipType;
  }
  
  @JsonProperty(JSON_PROPERTY_MEMBERSHIP_TYPE)
  public void setMembershipType_JsonNullable(JsonNullable<MembershipTypeEnum> membershipType) {
    this.membershipType = membershipType;
  }

  public void setMembershipType(MembershipTypeEnum membershipType) {
    this.membershipType = JsonNullable.<MembershipTypeEnum>of(membershipType);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetUserAccesses assetUserAccesses = (AssetUserAccesses) o;
    return Objects.equals(this.id, assetUserAccesses.id) &&
        Objects.equals(this.displayName, assetUserAccesses.displayName) &&
        equalsNullable(this.userId, assetUserAccesses.userId) &&
        equalsNullable(this.createdAt, assetUserAccesses.createdAt) &&
        equalsNullable(this.updatedAt, assetUserAccesses.updatedAt) &&
        equalsNullable(this.assetCode, assetUserAccesses.assetCode) &&
        equalsNullable(this.assetGroupCode, assetUserAccesses.assetGroupCode) &&
        equalsNullable(this.contextId, assetUserAccesses.contextId) &&
        Objects.equals(this.contextType, assetUserAccesses.contextType) &&
        equalsNullable(this.lastAccess, assetUserAccesses.lastAccess) &&
        equalsNullable(this.assetCategory, assetUserAccesses.assetCategory) &&
        equalsNullable(this.viewScore, assetUserAccesses.viewScore) &&
        equalsNullable(this.participateScore, assetUserAccesses.participateScore) &&
        equalsNullable(this.actionLevel, assetUserAccesses.actionLevel) &&
        equalsNullable(this.membershipType, assetUserAccesses.membershipType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, hashCodeNullable(userId), hashCodeNullable(createdAt), hashCodeNullable(updatedAt), hashCodeNullable(assetCode), hashCodeNullable(assetGroupCode), hashCodeNullable(contextId), contextType, hashCodeNullable(lastAccess), hashCodeNullable(assetCategory), hashCodeNullable(viewScore), hashCodeNullable(participateScore), hashCodeNullable(actionLevel), hashCodeNullable(membershipType));
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
    sb.append("class AssetUserAccesses {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    assetCode: ").append(toIndentedString(assetCode)).append("\n");
    sb.append("    assetGroupCode: ").append(toIndentedString(assetGroupCode)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    lastAccess: ").append(toIndentedString(lastAccess)).append("\n");
    sb.append("    assetCategory: ").append(toIndentedString(assetCategory)).append("\n");
    sb.append("    viewScore: ").append(toIndentedString(viewScore)).append("\n");
    sb.append("    participateScore: ").append(toIndentedString(participateScore)).append("\n");
    sb.append("    actionLevel: ").append(toIndentedString(actionLevel)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
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

