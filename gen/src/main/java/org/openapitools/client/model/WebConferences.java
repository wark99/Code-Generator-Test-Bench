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
import org.openapitools.client.model.WebConferencesDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Integrates with external conferencing solutions like BigBlueButton.
 */
@JsonPropertyOrder({
  WebConferences.JSON_PROPERTY_ID,
  WebConferences.JSON_PROPERTY_USER_ID,
  WebConferences.JSON_PROPERTY_CREATED_AT,
  WebConferences.JSON_PROPERTY_UPDATED_AT,
  WebConferences.JSON_PROPERTY_CONTEXT_ID,
  WebConferences.JSON_PROPERTY_CONTEXT_TYPE,
  WebConferences.JSON_PROPERTY_START_AT,
  WebConferences.JSON_PROPERTY_END_AT,
  WebConferences.JSON_PROPERTY_CONTEXT_CODE,
  WebConferences.JSON_PROPERTY_STARTED_AT,
  WebConferences.JSON_PROPERTY_USER_IDS,
  WebConferences.JSON_PROPERTY_ENDED_AT,
  WebConferences.JSON_PROPERTY_RECORDING_READY,
  WebConferences.JSON_PROPERTY_CONFERENCE_TYPE,
  WebConferences.JSON_PROPERTY_CONFERENCE_KEY,
  WebConferences.JSON_PROPERTY_DESCRIPTION,
  WebConferences.JSON_PROPERTY_DURATION,
  WebConferences.JSON_PROPERTY_SETTINGS,
  WebConferences.JSON_PROPERTY_TITLE,
  WebConferences.JSON_PROPERTY_UUID
})
@JsonTypeName("web_conferences")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WebConferences {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Object userId = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private Object contextId = null;

  /**
   * The type of this conference&#39;s context.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACCOUNT("Account"),
    
    COURSE("Course"),
    
    GROUP("Group");

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

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private JsonNullable<Object> startAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private JsonNullable<Object> endAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONTEXT_CODE = "context_code";
  private JsonNullable<Object> contextCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private JsonNullable<Object> startedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private JsonNullable<Object> userIds = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private JsonNullable<Object> endedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RECORDING_READY = "recording_ready";
  private JsonNullable<Object> recordingReady = JsonNullable.<Object>of(null);

  /**
   * The type of conference.
   */
  public enum ConferenceTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ADOBECONNECT("AdobeConnect"),
    
    BIGBLUEBUTTON("BigBlueButton"),
    
    CISCOWEBEX("CiscoWebex"),
    
    DIMDIM("DimDim"),
    
    WIMBA("Wimba"),
    
    WIZIQ("Wiziq"),
    
    DIMDIM2("dimdim");

    private Object value;

    ConferenceTypeEnum(Object value) {
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
    public static ConferenceTypeEnum fromValue(Object value) {
      for (ConferenceTypeEnum b : ConferenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CONFERENCE_TYPE = "conference_type";
  private ConferenceTypeEnum conferenceType = null;

  public static final String JSON_PROPERTY_CONFERENCE_KEY = "conference_key";
  private JsonNullable<Object> conferenceKey = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private WebConferencesDescription description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<Object> duration = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private JsonNullable<Object> settings = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TITLE = "title";
  private Object title = null;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private JsonNullable<Object> uuid = JsonNullable.<Object>of(null);

  public WebConferences() {
  }

  public WebConferences id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the conference.
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


  public WebConferences userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user that created the conference.
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(Object userId) {
    this.userId = userId;
  }


  public WebConferences createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when record was created.
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


  public WebConferences updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp when record was updated.
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


  public WebConferences contextId(Object contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of this conference&#39;s context.
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


  public WebConferences contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of this conference&#39;s context.
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


  public WebConferences startAt(Object startAt) {
    this.startAt = JsonNullable.<Object>of(startAt);
    
    return this;
  }

   /**
   * The date the conference started at, NULL if it hasn&#39;t started.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStartAt() {
        return startAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStartAt_JsonNullable() {
    return startAt;
  }
  
  @JsonProperty(JSON_PROPERTY_START_AT)
  public void setStartAt_JsonNullable(JsonNullable<Object> startAt) {
    this.startAt = startAt;
  }

  public void setStartAt(Object startAt) {
    this.startAt = JsonNullable.<Object>of(startAt);
  }


  public WebConferences endAt(Object endAt) {
    this.endAt = JsonNullable.<Object>of(endAt);
    
    return this;
  }

   /**
   * The date that the conference ended at, NULL if it hasn&#39;t ended.
   * @return endAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEndAt() {
        return endAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEndAt_JsonNullable() {
    return endAt;
  }
  
  @JsonProperty(JSON_PROPERTY_END_AT)
  public void setEndAt_JsonNullable(JsonNullable<Object> endAt) {
    this.endAt = endAt;
  }

  public void setEndAt(Object endAt) {
    this.endAt = JsonNullable.<Object>of(endAt);
  }


  public WebConferences contextCode(Object contextCode) {
    this.contextCode = JsonNullable.<Object>of(contextCode);
    
    return this;
  }

   /**
   * A string identifying the context.
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


  public WebConferences startedAt(Object startedAt) {
    this.startedAt = JsonNullable.<Object>of(startedAt);
    
    return this;
  }

   /**
   * The time at which this conference actually started at, NULL if it hasn&#39;t started.
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


  public WebConferences userIds(Object userIds) {
    this.userIds = JsonNullable.<Object>of(userIds);
    
    return this;
  }

   /**
   * Array of user ids that are participants in the conference.
   * @return userIds
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserIds() {
        return userIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserIds_JsonNullable() {
    return userIds;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  public void setUserIds_JsonNullable(JsonNullable<Object> userIds) {
    this.userIds = userIds;
  }

  public void setUserIds(Object userIds) {
    this.userIds = JsonNullable.<Object>of(userIds);
  }


  public WebConferences endedAt(Object endedAt) {
    this.endedAt = JsonNullable.<Object>of(endedAt);
    
    return this;
  }

   /**
   * The time at which this conference actually ended, NULL if it hasn&#39;t ended.
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEndedAt() {
        return endedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEndedAt_JsonNullable() {
    return endedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  public void setEndedAt_JsonNullable(JsonNullable<Object> endedAt) {
    this.endedAt = endedAt;
  }

  public void setEndedAt(Object endedAt) {
    this.endedAt = JsonNullable.<Object>of(endedAt);
  }


  public WebConferences recordingReady(Object recordingReady) {
    this.recordingReady = JsonNullable.<Object>of(recordingReady);
    
    return this;
  }

   /**
   * Whether the conference&#39;s recording has been processed.
   * @return recordingReady
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRecordingReady() {
        return recordingReady.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECORDING_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRecordingReady_JsonNullable() {
    return recordingReady;
  }
  
  @JsonProperty(JSON_PROPERTY_RECORDING_READY)
  public void setRecordingReady_JsonNullable(JsonNullable<Object> recordingReady) {
    this.recordingReady = recordingReady;
  }

  public void setRecordingReady(Object recordingReady) {
    this.recordingReady = JsonNullable.<Object>of(recordingReady);
  }


  public WebConferences conferenceType(ConferenceTypeEnum conferenceType) {
    
    this.conferenceType = conferenceType;
    return this;
  }

   /**
   * The type of conference.
   * @return conferenceType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConferenceTypeEnum getConferenceType() {
    return conferenceType;
  }


  @JsonProperty(JSON_PROPERTY_CONFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConferenceType(ConferenceTypeEnum conferenceType) {
    this.conferenceType = conferenceType;
  }


  public WebConferences conferenceKey(Object conferenceKey) {
    this.conferenceKey = JsonNullable.<Object>of(conferenceKey);
    
    return this;
  }

   /**
   * The 3rd party&#39;s ID for the conference.
   * @return conferenceKey
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConferenceKey() {
        return conferenceKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFERENCE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConferenceKey_JsonNullable() {
    return conferenceKey;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFERENCE_KEY)
  public void setConferenceKey_JsonNullable(JsonNullable<Object> conferenceKey) {
    this.conferenceKey = conferenceKey;
  }

  public void setConferenceKey(Object conferenceKey) {
    this.conferenceKey = JsonNullable.<Object>of(conferenceKey);
  }


  public WebConferences description(WebConferencesDescription description) {
    
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

  public WebConferencesDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(WebConferencesDescription description) {
    this.description = description;
  }


  public WebConferences duration(Object duration) {
    this.duration = JsonNullable.<Object>of(duration);
    
    return this;
  }

   /**
   * The expected duration the conference is supposed to last.
   * @return duration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDuration() {
        return duration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDuration_JsonNullable() {
    return duration;
  }
  
  @JsonProperty(JSON_PROPERTY_DURATION)
  public void setDuration_JsonNullable(JsonNullable<Object> duration) {
    this.duration = duration;
  }

  public void setDuration(Object duration) {
    this.duration = JsonNullable.<Object>of(duration);
  }


  public WebConferences settings(Object settings) {
    this.settings = JsonNullable.<Object>of(settings);
    
    return this;
  }

   /**
   * Settings for the given conference.
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSettings() {
        return settings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSettings_JsonNullable() {
    return settings;
  }
  
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  public void setSettings_JsonNullable(JsonNullable<Object> settings) {
    this.settings = settings;
  }

  public void setSettings(Object settings) {
    this.settings = JsonNullable.<Object>of(settings);
  }


  public WebConferences title(Object title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the conference.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(Object title) {
    this.title = title;
  }


  public WebConferences uuid(Object uuid) {
    this.uuid = JsonNullable.<Object>of(uuid);
    
    return this;
  }

   /**
   * A unique ID used for integrations.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebConferences webConferences = (WebConferences) o;
    return Objects.equals(this.id, webConferences.id) &&
        Objects.equals(this.userId, webConferences.userId) &&
        Objects.equals(this.createdAt, webConferences.createdAt) &&
        Objects.equals(this.updatedAt, webConferences.updatedAt) &&
        Objects.equals(this.contextId, webConferences.contextId) &&
        Objects.equals(this.contextType, webConferences.contextType) &&
        equalsNullable(this.startAt, webConferences.startAt) &&
        equalsNullable(this.endAt, webConferences.endAt) &&
        equalsNullable(this.contextCode, webConferences.contextCode) &&
        equalsNullable(this.startedAt, webConferences.startedAt) &&
        equalsNullable(this.userIds, webConferences.userIds) &&
        equalsNullable(this.endedAt, webConferences.endedAt) &&
        equalsNullable(this.recordingReady, webConferences.recordingReady) &&
        Objects.equals(this.conferenceType, webConferences.conferenceType) &&
        equalsNullable(this.conferenceKey, webConferences.conferenceKey) &&
        Objects.equals(this.description, webConferences.description) &&
        equalsNullable(this.duration, webConferences.duration) &&
        equalsNullable(this.settings, webConferences.settings) &&
        Objects.equals(this.title, webConferences.title) &&
        equalsNullable(this.uuid, webConferences.uuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, createdAt, updatedAt, contextId, contextType, hashCodeNullable(startAt), hashCodeNullable(endAt), hashCodeNullable(contextCode), hashCodeNullable(startedAt), hashCodeNullable(userIds), hashCodeNullable(endedAt), hashCodeNullable(recordingReady), conferenceType, hashCodeNullable(conferenceKey), description, hashCodeNullable(duration), hashCodeNullable(settings), title, hashCodeNullable(uuid));
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
    sb.append("class WebConferences {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    contextCode: ").append(toIndentedString(contextCode)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    recordingReady: ").append(toIndentedString(recordingReady)).append("\n");
    sb.append("    conferenceType: ").append(toIndentedString(conferenceType)).append("\n");
    sb.append("    conferenceKey: ").append(toIndentedString(conferenceKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

