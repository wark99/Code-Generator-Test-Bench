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
import org.openapitools.client.model.UsersPronouns;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Users
 */
@JsonPropertyOrder({
  Users.JSON_PROPERTY_ID,
  Users.JSON_PROPERTY_DELETED_AT,
  Users.JSON_PROPERTY_STORAGE_QUOTA,
  Users.JSON_PROPERTY_LTI_CONTEXT_ID,
  Users.JSON_PROPERTY_CREATED_AT,
  Users.JSON_PROPERTY_UPDATED_AT,
  Users.JSON_PROPERTY_WORKFLOW_STATE,
  Users.JSON_PROPERTY_SORTABLE_NAME,
  Users.JSON_PROPERTY_AVATAR_IMAGE_URL,
  Users.JSON_PROPERTY_AVATAR_IMAGE_SOURCE,
  Users.JSON_PROPERTY_AVATAR_IMAGE_UPDATED_AT,
  Users.JSON_PROPERTY_SHORT_NAME,
  Users.JSON_PROPERTY_LAST_LOGGED_OUT,
  Users.JSON_PROPERTY_PRONOUNS,
  Users.JSON_PROPERTY_MERGED_INTO_USER_ID,
  Users.JSON_PROPERTY_LOCALE,
  Users.JSON_PROPERTY_NAME,
  Users.JSON_PROPERTY_TIME_ZONE,
  Users.JSON_PROPERTY_UUID,
  Users.JSON_PROPERTY_SCHOOL_NAME,
  Users.JSON_PROPERTY_SCHOOL_POSITION,
  Users.JSON_PROPERTY_PUBLIC
})
@JsonTypeName("users")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Users {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<Object> deletedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STORAGE_QUOTA = "storage_quota";
  private JsonNullable<Object> storageQuota = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LTI_CONTEXT_ID = "lti_context_id";
  private JsonNullable<Object> ltiContextId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * Workflow status indicating the status of the user.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    CREATION_PENDING("creation_pending"),
    
    DELETED("deleted"),
    
    PENDING_APPROVAL("pending_approval"),
    
    PRE_REGISTERED("pre_registered"),
    
    REGISTERED("registered");

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

  public static final String JSON_PROPERTY_SORTABLE_NAME = "sortable_name";
  private JsonNullable<Object> sortableName = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AVATAR_IMAGE_URL = "avatar_image_url";
  private JsonNullable<Object> avatarImageUrl = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AVATAR_IMAGE_SOURCE = "avatar_image_source";
  private JsonNullable<Object> avatarImageSource = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AVATAR_IMAGE_UPDATED_AT = "avatar_image_updated_at";
  private JsonNullable<Object> avatarImageUpdatedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private JsonNullable<Object> shortName = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_LOGGED_OUT = "last_logged_out";
  private JsonNullable<Object> lastLoggedOut = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PRONOUNS = "pronouns";
  private UsersPronouns pronouns;

  public static final String JSON_PROPERTY_MERGED_INTO_USER_ID = "merged_into_user_id";
  private JsonNullable<Object> mergedIntoUserId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private JsonNullable<Object> locale = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private JsonNullable<Object> timeZone = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UUID = "uuid";
  private JsonNullable<Object> uuid = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCHOOL_NAME = "school_name";
  private JsonNullable<Object> schoolName = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SCHOOL_POSITION = "school_position";
  private JsonNullable<Object> schoolPosition = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PUBLIC = "public";
  private JsonNullable<Object> _public = JsonNullable.<Object>of(null);

  public Users() {
  }

  public Users id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the user.
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


  public Users deletedAt(Object deletedAt) {
    this.deletedAt = JsonNullable.<Object>of(deletedAt);
    
    return this;
  }

   /**
   * Timestamp that shows when a user was deleted at.
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


  public Users storageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
    
    return this;
  }

   /**
   * The storage quota for the users.
   * @return storageQuota
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStorageQuota() {
        return storageQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STORAGE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStorageQuota_JsonNullable() {
    return storageQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_STORAGE_QUOTA)
  public void setStorageQuota_JsonNullable(JsonNullable<Object> storageQuota) {
    this.storageQuota = storageQuota;
  }

  public void setStorageQuota(Object storageQuota) {
    this.storageQuota = JsonNullable.<Object>of(storageQuota);
  }


  public Users ltiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
    
    return this;
  }

   /**
   * UUID of the Canvas context in LTI standard. secondary ID for this context, could be used in API to identify resource as well.
   * @return ltiContextId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLtiContextId() {
        return ltiContextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLtiContextId_JsonNullable() {
    return ltiContextId;
  }
  
  @JsonProperty(JSON_PROPERTY_LTI_CONTEXT_ID)
  public void setLtiContextId_JsonNullable(JsonNullable<Object> ltiContextId) {
    this.ltiContextId = ltiContextId;
  }

  public void setLtiContextId(Object ltiContextId) {
    this.ltiContextId = JsonNullable.<Object>of(ltiContextId);
  }


  public Users createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the user was created in the Canvas system.
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


  public Users updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp that shows the last time the record was updated.
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


  public Users workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Workflow status indicating the status of the user.
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


  public Users sortableName(Object sortableName) {
    this.sortableName = JsonNullable.<Object>of(sortableName);
    
    return this;
  }

   /**
   * The name of the user that is should be used for sorting groups of users, such as in the gradebook. Format: \&quot;lastname, firstname\&quot;.
   * @return sortableName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSortableName() {
        return sortableName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SORTABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSortableName_JsonNullable() {
    return sortableName;
  }
  
  @JsonProperty(JSON_PROPERTY_SORTABLE_NAME)
  public void setSortableName_JsonNullable(JsonNullable<Object> sortableName) {
    this.sortableName = sortableName;
  }

  public void setSortableName(Object sortableName) {
    this.sortableName = JsonNullable.<Object>of(sortableName);
  }


  public Users avatarImageUrl(Object avatarImageUrl) {
    this.avatarImageUrl = JsonNullable.<Object>of(avatarImageUrl);
    
    return this;
  }

   /**
   * If avatars are enabled, this field will be included and contain a url to retrieve the user&#39;s avatar.
   * @return avatarImageUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAvatarImageUrl() {
        return avatarImageUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAvatarImageUrl_JsonNullable() {
    return avatarImageUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_IMAGE_URL)
  public void setAvatarImageUrl_JsonNullable(JsonNullable<Object> avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
  }

  public void setAvatarImageUrl(Object avatarImageUrl) {
    this.avatarImageUrl = JsonNullable.<Object>of(avatarImageUrl);
  }


  public Users avatarImageSource(Object avatarImageSource) {
    this.avatarImageSource = JsonNullable.<Object>of(avatarImageSource);
    
    return this;
  }

   /**
   * The source of a user avatar image.
   * @return avatarImageSource
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAvatarImageSource() {
        return avatarImageSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_IMAGE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAvatarImageSource_JsonNullable() {
    return avatarImageSource;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_IMAGE_SOURCE)
  public void setAvatarImageSource_JsonNullable(JsonNullable<Object> avatarImageSource) {
    this.avatarImageSource = avatarImageSource;
  }

  public void setAvatarImageSource(Object avatarImageSource) {
    this.avatarImageSource = JsonNullable.<Object>of(avatarImageSource);
  }


  public Users avatarImageUpdatedAt(Object avatarImageUpdatedAt) {
    this.avatarImageUpdatedAt = JsonNullable.<Object>of(avatarImageUpdatedAt);
    
    return this;
  }

   /**
   * Timestamp that shows the last time the avatar image was updated.
   * @return avatarImageUpdatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAvatarImageUpdatedAt() {
        return avatarImageUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_IMAGE_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAvatarImageUpdatedAt_JsonNullable() {
    return avatarImageUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_IMAGE_UPDATED_AT)
  public void setAvatarImageUpdatedAt_JsonNullable(JsonNullable<Object> avatarImageUpdatedAt) {
    this.avatarImageUpdatedAt = avatarImageUpdatedAt;
  }

  public void setAvatarImageUpdatedAt(Object avatarImageUpdatedAt) {
    this.avatarImageUpdatedAt = JsonNullable.<Object>of(avatarImageUpdatedAt);
  }


  public Users shortName(Object shortName) {
    this.shortName = JsonNullable.<Object>of(shortName);
    
    return this;
  }

   /**
   * A short name the user has selected, for use in conversations or other less formal places through the site.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getShortName() {
        return shortName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getShortName_JsonNullable() {
    return shortName;
  }
  
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  public void setShortName_JsonNullable(JsonNullable<Object> shortName) {
    this.shortName = shortName;
  }

  public void setShortName(Object shortName) {
    this.shortName = JsonNullable.<Object>of(shortName);
  }


  public Users lastLoggedOut(Object lastLoggedOut) {
    this.lastLoggedOut = JsonNullable.<Object>of(lastLoggedOut);
    
    return this;
  }

   /**
   * The last time the user explicitly logged out of Canvas.
   * @return lastLoggedOut
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastLoggedOut() {
        return lastLoggedOut.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_LOGGED_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastLoggedOut_JsonNullable() {
    return lastLoggedOut;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_LOGGED_OUT)
  public void setLastLoggedOut_JsonNullable(JsonNullable<Object> lastLoggedOut) {
    this.lastLoggedOut = lastLoggedOut;
  }

  public void setLastLoggedOut(Object lastLoggedOut) {
    this.lastLoggedOut = JsonNullable.<Object>of(lastLoggedOut);
  }


  public Users pronouns(UsersPronouns pronouns) {
    
    this.pronouns = pronouns;
    return this;
  }

   /**
   * Get pronouns
   * @return pronouns
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRONOUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsersPronouns getPronouns() {
    return pronouns;
  }


  @JsonProperty(JSON_PROPERTY_PRONOUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPronouns(UsersPronouns pronouns) {
    this.pronouns = pronouns;
  }


  public Users mergedIntoUserId(Object mergedIntoUserId) {
    this.mergedIntoUserId = JsonNullable.<Object>of(mergedIntoUserId);
    
    return this;
  }

   /**
   * If this user was merged into another one, this is the foreign key to that other user.
   * @return mergedIntoUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMergedIntoUserId() {
        return mergedIntoUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERGED_INTO_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMergedIntoUserId_JsonNullable() {
    return mergedIntoUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERGED_INTO_USER_ID)
  public void setMergedIntoUserId_JsonNullable(JsonNullable<Object> mergedIntoUserId) {
    this.mergedIntoUserId = mergedIntoUserId;
  }

  public void setMergedIntoUserId(Object mergedIntoUserId) {
    this.mergedIntoUserId = JsonNullable.<Object>of(mergedIntoUserId);
  }


  public Users locale(Object locale) {
    this.locale = JsonNullable.<Object>of(locale);
    
    return this;
  }

   /**
   * The user&#39;s locale. This is an optional field and may not be entered by the user.
   * @return locale
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLocale() {
        return locale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLocale_JsonNullable() {
    return locale;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCALE)
  public void setLocale_JsonNullable(JsonNullable<Object> locale) {
    this.locale = locale;
  }

  public void setLocale(Object locale) {
    this.locale = JsonNullable.<Object>of(locale);
  }


  public Users name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * The name of the user (\&quot;firstname lastname\&quot; format).
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


  public Users timeZone(Object timeZone) {
    this.timeZone = JsonNullable.<Object>of(timeZone);
    
    return this;
  }

   /**
   * This field is only returned in certain API calls, and will return the IANA time zone name of the user&#39;s preferred timezone.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTimeZone() {
        return timeZone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTimeZone_JsonNullable() {
    return timeZone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  public void setTimeZone_JsonNullable(JsonNullable<Object> timeZone) {
    this.timeZone = timeZone;
  }

  public void setTimeZone(Object timeZone) {
    this.timeZone = JsonNullable.<Object>of(timeZone);
  }


  public Users uuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
    
    return this;
  }

   /**
   * UUID of the user.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUuid() {
        return uuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUuid_JsonNullable() {
    return uuid;
  }
  
  @JsonProperty(JSON_PROPERTY_UUID)
  public void setUuid_JsonNullable(JsonNullable<Object> uuid) {
    this.uuid = uuid;
  }

  public void setUuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
  }


  public Users schoolName(Object schoolName) {
    this.schoolName = JsonNullable.<Object>of(schoolName);
    
    return this;
  }

   /**
   * Used in Trial Versions of Canvas, the school the user is associated with.
   * @return schoolName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSchoolName() {
        return schoolName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHOOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSchoolName_JsonNullable() {
    return schoolName;
  }
  
  @JsonProperty(JSON_PROPERTY_SCHOOL_NAME)
  public void setSchoolName_JsonNullable(JsonNullable<Object> schoolName) {
    this.schoolName = schoolName;
  }

  public void setSchoolName(Object schoolName) {
    this.schoolName = JsonNullable.<Object>of(schoolName);
  }


  public Users schoolPosition(Object schoolPosition) {
    this.schoolPosition = JsonNullable.<Object>of(schoolPosition);
    
    return this;
  }

   /**
   * Used in Trial Versions of Canvas, the position the user has at the school. E.g. Admin
   * @return schoolPosition
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSchoolPosition() {
        return schoolPosition.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHOOL_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSchoolPosition_JsonNullable() {
    return schoolPosition;
  }
  
  @JsonProperty(JSON_PROPERTY_SCHOOL_POSITION)
  public void setSchoolPosition_JsonNullable(JsonNullable<Object> schoolPosition) {
    this.schoolPosition = schoolPosition;
  }

  public void setSchoolPosition(Object schoolPosition) {
    this.schoolPosition = JsonNullable.<Object>of(schoolPosition);
  }


  public Users _public(Object _public) {
    this._public = JsonNullable.<Object>of(_public);
    
    return this;
  }

   /**
   * Used in Trial Versions of Canvas, the type of school the user is associated with.
   * @return _public
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPublic() {
        return _public.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPublic_JsonNullable() {
    return _public;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLIC)
  public void setPublic_JsonNullable(JsonNullable<Object> _public) {
    this._public = _public;
  }

  public void setPublic(Object _public) {
    this._public = JsonNullable.<Object>of(_public);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Users users = (Users) o;
    return Objects.equals(this.id, users.id) &&
        equalsNullable(this.deletedAt, users.deletedAt) &&
        equalsNullable(this.storageQuota, users.storageQuota) &&
        equalsNullable(this.ltiContextId, users.ltiContextId) &&
        Objects.equals(this.createdAt, users.createdAt) &&
        Objects.equals(this.updatedAt, users.updatedAt) &&
        Objects.equals(this.workflowState, users.workflowState) &&
        equalsNullable(this.sortableName, users.sortableName) &&
        equalsNullable(this.avatarImageUrl, users.avatarImageUrl) &&
        equalsNullable(this.avatarImageSource, users.avatarImageSource) &&
        equalsNullable(this.avatarImageUpdatedAt, users.avatarImageUpdatedAt) &&
        equalsNullable(this.shortName, users.shortName) &&
        equalsNullable(this.lastLoggedOut, users.lastLoggedOut) &&
        Objects.equals(this.pronouns, users.pronouns) &&
        equalsNullable(this.mergedIntoUserId, users.mergedIntoUserId) &&
        equalsNullable(this.locale, users.locale) &&
        equalsNullable(this.name, users.name) &&
        equalsNullable(this.timeZone, users.timeZone) &&
        equalsNullable(this.uuid, users.uuid) &&
        equalsNullable(this.schoolName, users.schoolName) &&
        equalsNullable(this.schoolPosition, users.schoolPosition) &&
        equalsNullable(this._public, users._public);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(deletedAt), hashCodeNullable(storageQuota), hashCodeNullable(ltiContextId), createdAt, updatedAt, workflowState, hashCodeNullable(sortableName), hashCodeNullable(avatarImageUrl), hashCodeNullable(avatarImageSource), hashCodeNullable(avatarImageUpdatedAt), hashCodeNullable(shortName), hashCodeNullable(lastLoggedOut), pronouns, hashCodeNullable(mergedIntoUserId), hashCodeNullable(locale), hashCodeNullable(name), hashCodeNullable(timeZone), hashCodeNullable(uuid), hashCodeNullable(schoolName), hashCodeNullable(schoolPosition), hashCodeNullable(_public));
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
    sb.append("class Users {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    ltiContextId: ").append(toIndentedString(ltiContextId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    sortableName: ").append(toIndentedString(sortableName)).append("\n");
    sb.append("    avatarImageUrl: ").append(toIndentedString(avatarImageUrl)).append("\n");
    sb.append("    avatarImageSource: ").append(toIndentedString(avatarImageSource)).append("\n");
    sb.append("    avatarImageUpdatedAt: ").append(toIndentedString(avatarImageUpdatedAt)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    lastLoggedOut: ").append(toIndentedString(lastLoggedOut)).append("\n");
    sb.append("    pronouns: ").append(toIndentedString(pronouns)).append("\n");
    sb.append("    mergedIntoUserId: ").append(toIndentedString(mergedIntoUserId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
    sb.append("    schoolPosition: ").append(toIndentedString(schoolPosition)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

