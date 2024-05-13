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
import org.openapitools.client.model.DeveloperKeysClientCredentialsAudience;
import org.openapitools.client.model.DeveloperKeysNotes;
import org.openapitools.client.model.DeveloperKeysPublicJwk;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Contains both normal API keys and the LTI keys used in LTI 1.3 apps.
 */
@JsonPropertyOrder({
  DeveloperKeys.JSON_PROPERTY_ID,
  DeveloperKeys.JSON_PROPERTY_NAME,
  DeveloperKeys.JSON_PROPERTY_USER_ID,
  DeveloperKeys.JSON_PROPERTY_CREATED_AT,
  DeveloperKeys.JSON_PROPERTY_UPDATED_AT,
  DeveloperKeys.JSON_PROPERTY_SCOPES,
  DeveloperKeys.JSON_PROPERTY_WORKFLOW_STATE,
  DeveloperKeys.JSON_PROPERTY_ACCOUNT_ID,
  DeveloperKeys.JSON_PROPERTY_REDIRECT_URI,
  DeveloperKeys.JSON_PROPERTY_ICON_URL,
  DeveloperKeys.JSON_PROPERTY_REDIRECT_URIS,
  DeveloperKeys.JSON_PROPERTY_NOTES,
  DeveloperKeys.JSON_PROPERTY_ACCESS_TOKEN_COUNT,
  DeveloperKeys.JSON_PROPERTY_REQUIRE_SCOPES,
  DeveloperKeys.JSON_PROPERTY_TEST_CLUSTER_ONLY,
  DeveloperKeys.JSON_PROPERTY_PUBLIC_JWK,
  DeveloperKeys.JSON_PROPERTY_ALLOW_INCLUDES,
  DeveloperKeys.JSON_PROPERTY_IS_LTI_KEY,
  DeveloperKeys.JSON_PROPERTY_CLIENT_CREDENTIALS_AUDIENCE,
  DeveloperKeys.JSON_PROPERTY_EMAIL,
  DeveloperKeys.JSON_PROPERTY_USER_NAME
})
@JsonTypeName("developer_keys")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeveloperKeys {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private JsonNullable<Object> scopes = JsonNullable.<Object>of(null);

  /**
   * The workflow state of the developer key.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted"),
    
    INACTIVE("inactive");

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

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private JsonNullable<Object> accountId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REDIRECT_URI = "redirect_uri";
  private JsonNullable<Object> redirectUri = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private JsonNullable<Object> iconUrl = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirect_uris";
  private Object redirectUris = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private DeveloperKeysNotes notes;

  public static final String JSON_PROPERTY_ACCESS_TOKEN_COUNT = "access_token_count";
  private Object accessTokenCount = null;

  public static final String JSON_PROPERTY_REQUIRE_SCOPES = "require_scopes";
  private Object requireScopes = null;

  public static final String JSON_PROPERTY_TEST_CLUSTER_ONLY = "test_cluster_only";
  private Object testClusterOnly = null;

  public static final String JSON_PROPERTY_PUBLIC_JWK = "public_jwk";
  private DeveloperKeysPublicJwk publicJwk;

  public static final String JSON_PROPERTY_ALLOW_INCLUDES = "allow_includes";
  private Object allowIncludes = null;

  public static final String JSON_PROPERTY_IS_LTI_KEY = "is_lti_key";
  private Object isLtiKey = null;

  public static final String JSON_PROPERTY_CLIENT_CREDENTIALS_AUDIENCE = "client_credentials_audience";
  private DeveloperKeysClientCredentialsAudience clientCredentialsAudience;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<Object> email = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private JsonNullable<Object> userName = JsonNullable.<Object>of(null);

  public DeveloperKeys() {
  }

  public DeveloperKeys id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a developer key record.
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


  public DeveloperKeys name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * The name of the developer key.
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


  public DeveloperKeys userId(Object userId) {
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


  public DeveloperKeys createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;developer_keys&#x60; record was created.
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


  public DeveloperKeys updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a &#x60;developer_keys&#x60; record was updated.
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


  public DeveloperKeys scopes(Object scopes) {
    this.scopes = JsonNullable.<Object>of(scopes);
    
    return this;
  }

   /**
   * The list of scopes the developer key&#39;s access tokens may use.
   * @return scopes
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getScopes() {
        return scopes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getScopes_JsonNullable() {
    return scopes;
  }
  
  @JsonProperty(JSON_PROPERTY_SCOPES)
  public void setScopes_JsonNullable(JsonNullable<Object> scopes) {
    this.scopes = scopes;
  }

  public void setScopes(Object scopes) {
    this.scopes = JsonNullable.<Object>of(scopes);
  }


  public DeveloperKeys workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * The workflow state of the developer key.
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


  public DeveloperKeys accountId(Object accountId) {
    this.accountId = JsonNullable.<Object>of(accountId);
    
    return this;
  }

   /**
   * Points to the account associated with the course. Could be Canvas root account or sub-account ID.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAccountId() {
        return accountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAccountId_JsonNullable() {
    return accountId;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  public void setAccountId_JsonNullable(JsonNullable<Object> accountId) {
    this.accountId = accountId;
  }

  public void setAccountId(Object accountId) {
    this.accountId = JsonNullable.<Object>of(accountId);
  }


  public DeveloperKeys redirectUri(Object redirectUri) {
    this.redirectUri = JsonNullable.<Object>of(redirectUri);
    
    return this;
  }

   /**
   * (legacy) The valid redirect URI for the developer key.
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRedirectUri() {
        return redirectUri.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRedirectUri_JsonNullable() {
    return redirectUri;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  public void setRedirectUri_JsonNullable(JsonNullable<Object> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public void setRedirectUri(Object redirectUri) {
    this.redirectUri = JsonNullable.<Object>of(redirectUri);
  }


  public DeveloperKeys iconUrl(Object iconUrl) {
    this.iconUrl = JsonNullable.<Object>of(iconUrl);
    
    return this;
  }

   /**
   * A URL pointing to the icon of the developer key.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIconUrl() {
        return iconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIconUrl_JsonNullable() {
    return iconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  public void setIconUrl_JsonNullable(JsonNullable<Object> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setIconUrl(Object iconUrl) {
    this.iconUrl = JsonNullable.<Object>of(iconUrl);
  }


  public DeveloperKeys redirectUris(Object redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

   /**
   * The list of valid redirect URIs for the developer key.
   * @return redirectUris
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRedirectUris() {
    return redirectUris;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirectUris(Object redirectUris) {
    this.redirectUris = redirectUris;
  }


  public DeveloperKeys notes(DeveloperKeysNotes notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeveloperKeysNotes getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(DeveloperKeysNotes notes) {
    this.notes = notes;
  }


  public DeveloperKeys accessTokenCount(Object accessTokenCount) {
    
    this.accessTokenCount = accessTokenCount;
    return this;
  }

   /**
   * The number of times the developer key has been used.
   * @return accessTokenCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAccessTokenCount() {
    return accessTokenCount;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessTokenCount(Object accessTokenCount) {
    this.accessTokenCount = accessTokenCount;
  }


  public DeveloperKeys requireScopes(Object requireScopes) {
    
    this.requireScopes = requireScopes;
    return this;
  }

   /**
   * Whether or not access token for the developer key are required to be scoped.
   * @return requireScopes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRequireScopes() {
    return requireScopes;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireScopes(Object requireScopes) {
    this.requireScopes = requireScopes;
  }


  public DeveloperKeys testClusterOnly(Object testClusterOnly) {
    
    this.testClusterOnly = testClusterOnly;
    return this;
  }

   /**
   * If true, the developer key&#39;s access tokens are only valid on Canvas test and beta instances.
   * @return testClusterOnly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CLUSTER_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTestClusterOnly() {
    return testClusterOnly;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CLUSTER_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestClusterOnly(Object testClusterOnly) {
    this.testClusterOnly = testClusterOnly;
  }


  public DeveloperKeys publicJwk(DeveloperKeysPublicJwk publicJwk) {
    
    this.publicJwk = publicJwk;
    return this;
  }

   /**
   * Get publicJwk
   * @return publicJwk
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_JWK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeveloperKeysPublicJwk getPublicJwk() {
    return publicJwk;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_JWK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicJwk(DeveloperKeysPublicJwk publicJwk) {
    this.publicJwk = publicJwk;
  }


  public DeveloperKeys allowIncludes(Object allowIncludes) {
    
    this.allowIncludes = allowIncludes;
    return this;
  }

   /**
   * If true, requests made with this key&#39;s access token can use \&quot;includes\&quot; parameters to retrieve additional data in each request.
   * @return allowIncludes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_INCLUDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAllowIncludes() {
    return allowIncludes;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_INCLUDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowIncludes(Object allowIncludes) {
    this.allowIncludes = allowIncludes;
  }


  public DeveloperKeys isLtiKey(Object isLtiKey) {
    
    this.isLtiKey = isLtiKey;
    return this;
  }

   /**
   * If true, the developer key is intended to be used with LTI 1.3 tools.
   * @return isLtiKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_LTI_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIsLtiKey() {
    return isLtiKey;
  }


  @JsonProperty(JSON_PROPERTY_IS_LTI_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsLtiKey(Object isLtiKey) {
    this.isLtiKey = isLtiKey;
  }


  public DeveloperKeys clientCredentialsAudience(DeveloperKeysClientCredentialsAudience clientCredentialsAudience) {
    
    this.clientCredentialsAudience = clientCredentialsAudience;
    return this;
  }

   /**
   * Get clientCredentialsAudience
   * @return clientCredentialsAudience
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_CREDENTIALS_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeveloperKeysClientCredentialsAudience getClientCredentialsAudience() {
    return clientCredentialsAudience;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_CREDENTIALS_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientCredentialsAudience(DeveloperKeysClientCredentialsAudience clientCredentialsAudience) {
    this.clientCredentialsAudience = clientCredentialsAudience;
  }


  public DeveloperKeys email(Object email) {
    this.email = JsonNullable.<Object>of(email);
    
    return this;
  }

   /**
   * The email address of the developer key&#39;s owner.
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<Object> email) {
    this.email = email;
  }

  public void setEmail(Object email) {
    this.email = JsonNullable.<Object>of(email);
  }


  public DeveloperKeys userName(Object userName) {
    this.userName = JsonNullable.<Object>of(userName);
    
    return this;
  }

   /**
   * the login ID of the user who originated developer key.
   * @return userName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserName() {
        return userName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserName_JsonNullable() {
    return userName;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  public void setUserName_JsonNullable(JsonNullable<Object> userName) {
    this.userName = userName;
  }

  public void setUserName(Object userName) {
    this.userName = JsonNullable.<Object>of(userName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeveloperKeys developerKeys = (DeveloperKeys) o;
    return Objects.equals(this.id, developerKeys.id) &&
        equalsNullable(this.name, developerKeys.name) &&
        equalsNullable(this.userId, developerKeys.userId) &&
        Objects.equals(this.createdAt, developerKeys.createdAt) &&
        Objects.equals(this.updatedAt, developerKeys.updatedAt) &&
        equalsNullable(this.scopes, developerKeys.scopes) &&
        Objects.equals(this.workflowState, developerKeys.workflowState) &&
        equalsNullable(this.accountId, developerKeys.accountId) &&
        equalsNullable(this.redirectUri, developerKeys.redirectUri) &&
        equalsNullable(this.iconUrl, developerKeys.iconUrl) &&
        Objects.equals(this.redirectUris, developerKeys.redirectUris) &&
        Objects.equals(this.notes, developerKeys.notes) &&
        Objects.equals(this.accessTokenCount, developerKeys.accessTokenCount) &&
        Objects.equals(this.requireScopes, developerKeys.requireScopes) &&
        Objects.equals(this.testClusterOnly, developerKeys.testClusterOnly) &&
        Objects.equals(this.publicJwk, developerKeys.publicJwk) &&
        Objects.equals(this.allowIncludes, developerKeys.allowIncludes) &&
        Objects.equals(this.isLtiKey, developerKeys.isLtiKey) &&
        Objects.equals(this.clientCredentialsAudience, developerKeys.clientCredentialsAudience) &&
        equalsNullable(this.email, developerKeys.email) &&
        equalsNullable(this.userName, developerKeys.userName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(userId), createdAt, updatedAt, hashCodeNullable(scopes), workflowState, hashCodeNullable(accountId), hashCodeNullable(redirectUri), hashCodeNullable(iconUrl), redirectUris, notes, accessTokenCount, requireScopes, testClusterOnly, publicJwk, allowIncludes, isLtiKey, clientCredentialsAudience, hashCodeNullable(email), hashCodeNullable(userName));
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
    sb.append("class DeveloperKeys {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    accessTokenCount: ").append(toIndentedString(accessTokenCount)).append("\n");
    sb.append("    requireScopes: ").append(toIndentedString(requireScopes)).append("\n");
    sb.append("    testClusterOnly: ").append(toIndentedString(testClusterOnly)).append("\n");
    sb.append("    publicJwk: ").append(toIndentedString(publicJwk)).append("\n");
    sb.append("    allowIncludes: ").append(toIndentedString(allowIncludes)).append("\n");
    sb.append("    isLtiKey: ").append(toIndentedString(isLtiKey)).append("\n");
    sb.append("    clientCredentialsAudience: ").append(toIndentedString(clientCredentialsAudience)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

