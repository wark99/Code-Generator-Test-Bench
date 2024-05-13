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
import org.openapitools.client.model.WebLogsRemoteIp;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Note: Logs older than the retention limit of 30 days are no longer available via DAP API.
 */
@JsonPropertyOrder({
  WebLogs.JSON_PROPERTY_ID,
  WebLogs.JSON_PROPERTY_TIMESTAMP,
  WebLogs.JSON_PROPERTY_USER_ID,
  WebLogs.JSON_PROPERTY_REAL_USER_ID,
  WebLogs.JSON_PROPERTY_COURSE_ID,
  WebLogs.JSON_PROPERTY_QUIZ_ID,
  WebLogs.JSON_PROPERTY_DISCUSSION_ID,
  WebLogs.JSON_PROPERTY_CONVERSATION_ID,
  WebLogs.JSON_PROPERTY_ASSIGNMENT_ID,
  WebLogs.JSON_PROPERTY_URL,
  WebLogs.JSON_PROPERTY_USER_AGENT_ID,
  WebLogs.JSON_PROPERTY_HTTP_METHOD,
  WebLogs.JSON_PROPERTY_HTTP_STATUS,
  WebLogs.JSON_PROPERTY_HTTP_VERSION,
  WebLogs.JSON_PROPERTY_REMOTE_IP,
  WebLogs.JSON_PROPERTY_INTERACTION_MICROS,
  WebLogs.JSON_PROPERTY_WEB_APPLICATION_CONTROLLER,
  WebLogs.JSON_PROPERTY_WEB_APPLICATION_ACTION,
  WebLogs.JSON_PROPERTY_WEB_APPLICATION_CONTEXT_TYPE,
  WebLogs.JSON_PROPERTY_WEB_APPLICATION_CONTEXT_ID,
  WebLogs.JSON_PROPERTY_SESSION_ID,
  WebLogs.JSON_PROPERTY_DEVELOPER_KEY_ID,
  WebLogs.JSON_PROPERTY_PARTICIPATED
})
@JsonTypeName("web_logs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WebLogs {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Object timestamp = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REAL_USER_ID = "real_user_id";
  private JsonNullable<Object> realUserId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COURSE_ID = "course_id";
  private JsonNullable<Object> courseId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_QUIZ_ID = "quiz_id";
  private JsonNullable<Object> quizId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISCUSSION_ID = "discussion_id";
  private JsonNullable<Object> discussionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONVERSATION_ID = "conversation_id";
  private JsonNullable<Object> conversationId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSIGNMENT_ID = "assignment_id";
  private JsonNullable<Object> assignmentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_URL = "url";
  private Object url = null;

  public static final String JSON_PROPERTY_USER_AGENT_ID = "user_agent_id";
  private JsonNullable<Object> userAgentId = JsonNullable.<Object>of(null);

  /**
   * HTTP method/verb (GET, POST, PUT, etc.) that was sent with the request.
   */
  public enum HttpMethodEnum {
    CONNECT("CONNECT"),
    
    DELETE("DELETE"),
    
    GET("GET"),
    
    HEAD("HEAD"),
    
    OPTIONS("OPTIONS"),
    
    PATCH("PATCH"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    TRACE("TRACE"),
    
    SEARCH("SEARCH"),
    
    PROPFIND("PROPFIND"),
    
    LOCK("LOCK"),
    
    REPORT("REPORT"),
    
    PURGE("PURGE"),
    
    MKCOL("MKCOL"),
    
    PROPPATCH("PROPPATCH"),
    
    CHECKOUT("CHECKOUT"),
    
    UNLOCK("UNLOCK");

    private Object value;

    HttpMethodEnum(Object value) {
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
    public static HttpMethodEnum fromValue(Object value) {
      for (HttpMethodEnum b : HttpMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_HTTP_METHOD = "http_method";
  private HttpMethodEnum httpMethod = null;

  /**
   * HTTP status code of the request (e.g. 200 OK).
   */
  public enum HttpStatusEnum {
    _100("100"),
    
    _101("101"),
    
    _102("102"),
    
    _103("103"),
    
    _200("200"),
    
    _201("201"),
    
    _202("202"),
    
    _203("203"),
    
    _204("204"),
    
    _205("205"),
    
    _206("206"),
    
    _207("207"),
    
    _208("208"),
    
    _226("226"),
    
    _300("300"),
    
    _301("301"),
    
    _302("302"),
    
    _303("303"),
    
    _304("304"),
    
    _305("305"),
    
    _307("307"),
    
    _308("308"),
    
    _400("400"),
    
    _401("401"),
    
    _402("402"),
    
    _403("403"),
    
    _404("404"),
    
    _405("405"),
    
    _406("406"),
    
    _407("407"),
    
    _408("408"),
    
    _409("409"),
    
    _410("410"),
    
    _411("411"),
    
    _412("412"),
    
    _413("413"),
    
    _414("414"),
    
    _415("415"),
    
    _416("416"),
    
    _417("417"),
    
    _418("418"),
    
    _421("421"),
    
    _422("422"),
    
    _423("423"),
    
    _424("424"),
    
    _425("425"),
    
    _426("426"),
    
    _428("428"),
    
    _429("429"),
    
    _431("431"),
    
    _451("451"),
    
    _500("500"),
    
    _501("501"),
    
    _502("502"),
    
    _503("503"),
    
    _504("504"),
    
    _505("505"),
    
    _506("506"),
    
    _507("507"),
    
    _508("508"),
    
    _510("510"),
    
    _511("511");

    private Object value;

    HttpStatusEnum(Object value) {
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
    public static HttpStatusEnum fromValue(Object value) {
      for (HttpStatusEnum b : HttpStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_HTTP_STATUS = "http_status";
  private HttpStatusEnum httpStatus = null;

  /**
   * HTTP protocol version (e.g. HTTP/2.0).
   */
  public enum HttpVersionEnum {
    _0_9("0.9"),
    
    _1_0("1.0"),
    
    _1_1("1.1"),
    
    _2_0("2.0");

    private Object value;

    HttpVersionEnum(Object value) {
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
    public static HttpVersionEnum fromValue(Object value) {
      for (HttpVersionEnum b : HttpVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_HTTP_VERSION = "http_version";
  private HttpVersionEnum httpVersion = null;

  public static final String JSON_PROPERTY_REMOTE_IP = "remote_ip";
  private WebLogsRemoteIp remoteIp;

  public static final String JSON_PROPERTY_INTERACTION_MICROS = "interaction_micros";
  private Object interactionMicros = null;

  /**
   * The controller that the Canvas web application used to service this request.
   */
  public enum WebApplicationControllerEnum {
    ACCOUNT_CALENDARS_API("account_calendars_api"),
    
    ACCOUNT_DOMAIN_LOOKUPS("account_domain_lookups"),
    
    ACCOUNT_GRADING_SETTINGS("account_grading_settings"),
    
    ACCOUNT_NOTIFICATIONS("account_notifications"),
    
    ACCOUNT_REPORTS("account_reports"),
    
    ACCOUNTS("accounts"),
    
    ADMINS("admins"),
    
    ALERTS("alerts"),
    
    ANALYTICS("analytics"),
    
    ANALYTICS_API("analytics_api"),
    
    ANNOUNCEMENTS("announcements"),
    
    ANNOUNCEMENTS_API("announcements_api"),
    
    ANONYMOUS_PROVISIONAL_GRADES("anonymous_provisional_grades"),
    
    ANONYMOUS_SUBMISSIONS("anonymous_submissions"),
    
    API_V1_PROVISIONS("api/v1/provisions"),
    
    APP_CENTER("app_center"),
    
    APPOINTMENT_GROUPS("appointment_groups"),
    
    ASSESSMENT_QUESTIONS("assessment_questions"),
    
    ASSIGNMENT_EXTENSIONS("assignment_extensions"),
    
    ASSIGNMENT_GROUPS("assignment_groups"),
    
    ASSIGNMENT_GROUPS_API("assignment_groups_api"),
    
    ASSIGNMENT_OVERRIDES("assignment_overrides"),
    
    ASSIGNMENTS("assignments"),
    
    ASSIGNMENTS_API("assignments_api"),
    
    AUTHENTICATION_AUDIT_API("authentication_audit_api"),
    
    AUTHENTICATION_PROVIDERS("authentication_providers"),
    
    BLACKOUT_DATES("blackout_dates"),
    
    BOOKMARKS_BOOKMARKS("bookmarks/bookmarks"),
    
    BRAND_CONFIGS("brand_configs"),
    
    BRAND_CONFIGS_API("brand_configs_api"),
    
    CALENDAR_EVENTS("calendar_events"),
    
    CALENDAR_EVENTS_API("calendar_events_api"),
    
    CALENDARS("calendars"),
    
    CANVADOC_SESSIONS("canvadoc_sessions"),
    
    CATALOG_ACCOUNTS("catalog_accounts"),
    
    COLLABORATIONS("collaborations"),
    
    COMM_MESSAGES_API("comm_messages_api"),
    
    COMMUNICATION_CHANNELS("communication_channels"),
    
    CONDITIONAL_RELEASE_RULES("conditional_release/rules"),
    
    CONDITIONAL_RELEASE_STATS("conditional_release/stats"),
    
    CONFERENCES("conferences"),
    
    CONTENT_EXPORTS("content_exports"),
    
    CONTENT_EXPORTS_API("content_exports_api"),
    
    CONTENT_IMPORTS("content_imports"),
    
    CONTENT_MIGRATIONS("content_migrations"),
    
    CONTENT_SHARES("content_shares"),
    
    CONTEXT("context"),
    
    CONTEXT_MODULE_ITEMS_API("context_module_items_api"),
    
    CONTEXT_MODULES("context_modules"),
    
    CONTEXT_MODULES_API("context_modules_api"),
    
    CONVERSATIONS("conversations"),
    
    COURSE_AUDIT_API("course_audit_api"),
    
    COURSE_NICKNAMES("course_nicknames"),
    
    COURSE_PACES("course_paces"),
    
    COURSE_PACING_PACE_CONTEXTS_API("course_pacing/pace_contexts_api"),
    
    COURSES("courses"),
    
    CROCODOC_SESSIONS("crocodoc_sessions"),
    
    CSP_SETTINGS("csp_settings"),
    
    CUSTOM_DATA("custom_data"),
    
    CUSTOM_GRADEBOOK_COLUMN_DATA_API("custom_gradebook_column_data_api"),
    
    CUSTOM_GRADEBOOK_COLUMNS_API("custom_gradebook_columns_api"),
    
    DEMO_SNAPSHOTS("demo_snapshots"),
    
    DEVELOPER_KEY_ACCOUNT_BINDINGS("developer_key_account_bindings"),
    
    DEVELOPER_KEYS("developer_keys"),
    
    DISABLE_POST_TO_SIS_API("disable_post_to_sis_api"),
    
    DISCUSSION_ENTRIES("discussion_entries"),
    
    DISCUSSION_TOPICS("discussion_topics"),
    
    DISCUSSION_TOPICS_API("discussion_topics_api"),
    
    DOCVIEWER_AUDIT_EVENTS("docviewer_audit_events"),
    
    ENROLLMENTS_API("enrollments_api"),
    
    EPORTFOLIO_CATEGORIES("eportfolio_categories"),
    
    EPORTFOLIO_ENTRIES("eportfolio_entries"),
    
    EPORTFOLIOS("eportfolios"),
    
    EPORTFOLIOS_API("eportfolios_api"),
    
    EPUB_EXPORTS("epub_exports"),
    
    EQUATION_IMAGES("equation_images"),
    
    ERRORS("errors"),
    
    EXTERNAL_CONTENT("external_content"),
    
    EXTERNAL_FEEDS("external_feeds"),
    
    EXTERNAL_TOOLS("external_tools"),
    
    FAVORITES("favorites"),
    
    FEATURE_FLAGS("feature_flags"),
    
    FILE_PREVIEWS("file_previews"),
    
    FILES("files"),
    
    FOLDERS("folders"),
    
    GRADE_CHANGE_AUDIT_API("grade_change_audit_api"),
    
    GRADEBOOK_CSVS("gradebook_csvs"),
    
    GRADEBOOK_FILTERS_API("gradebook_filters_api"),
    
    GRADEBOOK_HISTORY_API("gradebook_history_api"),
    
    GRADEBOOK_SETTINGS("gradebook_settings"),
    
    GRADEBOOK_UPLOADS("gradebook_uploads"),
    
    GRADEBOOKS("gradebooks"),
    
    GRADING_PERIOD_SETS("grading_period_sets"),
    
    GRADING_PERIODS("grading_periods"),
    
    GRADING_SCHEMES_JSON("grading_schemes_json"),
    
    GRADING_STANDARDS("grading_standards"),
    
    GRADING_STANDARDS_API("grading_standards_api"),
    
    GRAPHQL("graphql"),
    
    GROUP_CATEGORIES("group_categories"),
    
    GROUP_MEMBERSHIPS("group_memberships"),
    
    GROUPS("groups"),
    
    HISTORY("history"),
    
    IMMERSIVE_READER("immersive_reader"),
    
    IMPACT("impact"),
    
    INFO("info"),
    
    INST_ACCESS_TOKENS("inst_access_tokens"),
    
    INTERNAL_ANALYTICS_API("internal_analytics_api"),
    
    INTERNAL_ANALYTICS_DASHBOARDS_API("internal_analytics_dashboards_api"),
    
    JOBS("jobs"),
    
    JOBS_V2("jobs_v2"),
    
    JWTS("jwts"),
    
    LATE_POLICY("late_policy"),
    
    LEGAL_INFORMATION("legal_information"),
    
    LIVE_ASSESSMENTS_ASSESSMENTS("live_assessments/assessments"),
    
    LIVE_ASSESSMENTS_RESULTS("live_assessments/results"),
    
    LOGIN("login"),
    
    LOGIN_APPLE("login/apple"),
    
    LOGIN_CANVAS("login/canvas"),
    
    LOGIN_CAS("login/cas"),
    
    LOGIN_CLEVER("login/clever"),
    
    LOGIN_FACEBOOK("login/facebook"),
    
    LOGIN_GITHUB("login/github"),
    
    LOGIN_GOOGLE("login/google"),
    
    LOGIN_LDAP("login/ldap"),
    
    LOGIN_LINKEDIN("login/linkedin"),
    
    LOGIN_MICROSOFT("login/microsoft"),
    
    LOGIN_OAUTH("login/oauth"),
    
    LOGIN_OAUTH2("login/oauth2"),
    
    LOGIN_OPENID_CONNECT("login/openid_connect"),
    
    LOGIN_OTP("login/otp"),
    
    LOGIN_REDIRECT("login_redirect"),
    
    LOGIN_SAML("login/saml"),
    
    LOGIN_SAML_IDP_DISCOVERY("login/saml_idp_discovery"),
    
    LOGIN_TRUST("login/trust"),
    
    LOGIN_TWITTER("login/twitter"),
    
    LTI_API("lti_api"),
    
    LTI_DATA_SERVICES("lti/data_services"),
    
    LTI_FEATURE_FLAGS("lti/feature_flags"),
    
    LTI_IMS_AUTHENTICATION("lti/ims/authentication"),
    
    LTI_IMS_AUTHORIZATION("lti/ims/authorization"),
    
    LTI_IMS_DEEP_LINKING("lti/ims/deep_linking"),
    
    LTI_IMS_LINE_ITEMS("lti/ims/line_items"),
    
    LTI_IMS_NAMES_AND_ROLES("lti/ims/names_and_roles"),
    
    LTI_IMS_RESULTS("lti/ims/results"),
    
    LTI_IMS_SCORES("lti/ims/scores"),
    
    LTI_IMS_TOOL_CONSUMER_PROFILE("lti/ims/tool_consumer_profile"),
    
    LTI_IMS_TOOL_PROXY("lti/ims/tool_proxy"),
    
    LTI_IMS_TOOL_SETTING("lti/ims/tool_setting"),
    
    LTI_LTI_APPS("lti/lti_apps"),
    
    LTI_MEMBERSHIP_SERVICE("lti/membership_service"),
    
    LTI_MESSAGE("lti/message"),
    
    LTI_ORIGINALITY_REPORTS_API("lti/originality_reports_api"),
    
    LTI_PLAGIARISM_ASSIGNMENTS_API("lti/plagiarism_assignments_api"),
    
    LTI_PLATFORM_STORAGE("lti/platform_storage"),
    
    LTI_SUBMISSIONS_API("lti/submissions_api"),
    
    LTI_SUBSCRIPTIONS_API("lti/subscriptions_api"),
    
    LTI_TOKEN("lti/token"),
    
    LTI_TOOL_CONFIGURATIONS_API("lti/tool_configurations_api"),
    
    LTI_TOOL_PROXY("lti/tool_proxy"),
    
    LTI_USERS_API("lti/users_api"),
    
    MASTER_COURSES_MASTER_TEMPLATES("master_courses/master_templates"),
    
    MEDIA_OBJECTS("media_objects"),
    
    MEDIA_TRACKS("media_tracks"),
    
    MESSAGES("messages"),
    
    MICROSOFT_SYNC_GROUPS("microsoft_sync/groups"),
    
    MIGRATION_ISSUES("migration_issues"),
    
    MODERATION_SET("moderation_set"),
    
    MOBILE_VERIFY("mobile_verify"),
    
    NEW_QUIZZES_QUIZ_ITEMS_API("new_quizzes/quiz_items_api"),
    
    NEW_QUIZZES_QUIZZES_API("new_quizzes/quizzes_api"),
    
    NOTIFICATION_PREFERENCES("notification_preferences"),
    
    OAUTH_PROXY("oauth_proxy"),
    
    OAUTH2_PROVIDER("oauth2_provider"),
    
    OBSERVER_ALERT_THRESHOLDS_API("observer_alert_thresholds_api"),
    
    OBSERVER_ALERTS_API("observer_alerts_api"),
    
    OBSERVER_PAIRING_CODES_API("observer_pairing_codes_api"),
    
    ONE_TIME_PASSWORDS("one_time_passwords"),
    
    OUTCOME_GROUPS_API("outcome_groups_api"),
    
    OUTCOME_IMPORTS_API("outcome_imports_api"),
    
    OUTCOME_PROFICIENCY_API("outcome_proficiency_api"),
    
    OUTCOME_RESULTS("outcome_results"),
    
    OUTCOMES("outcomes"),
    
    OUTCOMES_ACADEMIC_BENCHMARK_IMPORT_API("outcomes_academic_benchmark_import_api"),
    
    OUTCOMES_API("outcomes_api"),
    
    PAGE_COMMENTS("page_comments"),
    
    PAGE_VIEWS("page_views"),
    
    PEER_REVIEWS_API("peer_reviews_api"),
    
    PHONE_HOME("phone_home"),
    
    PLANNER("planner"),
    
    PLANNER_NOTES("planner_notes"),
    
    PLANNER_OVERRIDES("planner_overrides"),
    
    PLUGINS("plugins"),
    
    POLLING_POLL_CHOICES("polling/poll_choices"),
    
    POLLING_POLL_SESSIONS("polling/poll_sessions"),
    
    POLLING_POLL_SUBMISSIONS("polling/poll_submissions"),
    
    POLLING_POLLS("polling/polls"),
    
    PROFILE("profile"),
    
    PROGRESS("progress"),
    
    PROVISIONAL_GRADES("provisional_grades"),
    
    PSEUDONYMS("pseudonyms"),
    
    QUESTION_BANKS("question_banks"),
    
    QUIZZES_COURSE_QUIZ_EXTENSIONS("quizzes/course_quiz_extensions"),
    
    QUIZZES_NEXT_QUIZZES_API("quizzes_next/quizzes_api"),
    
    QUIZZES_OUTSTANDING_QUIZ_SUBMISSIONS("quizzes/outstanding_quiz_submissions"),
    
    QUIZZES_QUIZ_ASSIGNMENT_OVERRIDES("quizzes/quiz_assignment_overrides"),
    
    QUIZZES_QUIZ_EXTENSIONS("quizzes/quiz_extensions"),
    
    QUIZZES_QUIZ_GROUPS("quizzes/quiz_groups"),
    
    QUIZZES_QUIZ_IP_FILTERS("quizzes/quiz_ip_filters"),
    
    QUIZZES_QUIZ_QUESTIONS("quizzes/quiz_questions"),
    
    QUIZZES_QUIZ_REPORTS("quizzes/quiz_reports"),
    
    QUIZZES_QUIZ_STATISTICS("quizzes/quiz_statistics"),
    
    QUIZZES_QUIZ_SUBMISSION_EVENTS("quizzes/quiz_submission_events"),
    
    QUIZZES_QUIZ_SUBMISSION_EVENTS_API("quizzes/quiz_submission_events_api"),
    
    QUIZZES_QUIZ_SUBMISSION_FILES("quizzes/quiz_submission_files"),
    
    QUIZZES_QUIZ_SUBMISSION_QUESTIONS("quizzes/quiz_submission_questions"),
    
    QUIZZES_QUIZ_SUBMISSION_USERS("quizzes/quiz_submission_users"),
    
    QUIZZES_QUIZ_SUBMISSIONS("quizzes/quiz_submissions"),
    
    QUIZZES_QUIZ_SUBMISSIONS_API("quizzes/quiz_submissions_api"),
    
    QUIZZES_QUIZZES("quizzes/quizzes"),
    
    QUIZZES_QUIZZES_API("quizzes/quizzes_api"),
    
    QUIZZES_RESPONDUS_LAUNCH("quizzes_respondus/launch"),
    
    QUIZZES_RESPONDUS_RESTART("quizzes_respondus/restart"),
    
    QUIZZES_RESPONDUS_SECURITY("quizzes_respondus/security"),
    
    QUIZZES_RESPONDUS_SESSION("quizzes_respondus/session"),
    
    RELEASE_NOTES("release_notes"),
    
    RESPONDUS_LDB_HANDSHAKE("respondus_ldb_handshake"),
    
    ROLE_OVERRIDES("role_overrides"),
    
    RUBRIC_ASSESSMENTS("rubric_assessments"),
    
    RUBRIC_ASSOCIATIONS("rubric_associations"),
    
    RUBRICS("rubrics"),
    
    RUBRICS_API("rubrics_api"),
    
    SAML_IDP("saml_idp"),
    
    SCOPES_API("scopes_api"),
    
    SEARCH("search"),
    
    SECTIONS("sections"),
    
    SECURITY("security"),
    
    SELF_ENROLLMENTS("self_enrollments"),
    
    SERVICES_API("services_api"),
    
    SFTP_USERS("sftp_users"),
    
    SHARED_BRAND_CONFIGS("shared_brand_configs"),
    
    SIS_API("sis_api"),
    
    SIS_IMPORT_ERRORS_API("sis_import_errors_api"),
    
    SIS_IMPORTS_API("sis_imports_api"),
    
    SITE_ADMIN("site_admin"),
    
    SUB_ACCOUNTS("sub_accounts"),
    
    SUBMISSION_COMMENTS("submission_comments"),
    
    SUBMISSION_COMMENTS_API("submission_comments_api"),
    
    SUBMISSIONS("submissions"),
    
    SUBMISSIONS_ANONYMOUS_DOWNLOADS("submissions/anonymous_downloads"),
    
    SUBMISSIONS_ANONYMOUS_PREVIEWS("submissions/anonymous_previews"),
    
    SUBMISSIONS_API("submissions_api"),
    
    SUBMISSIONS_DOWNLOADS("submissions/downloads"),
    
    SUBMISSIONS_PREVIEWS("submissions/previews"),
    
    SUPPORT_HELPERS_DUE_DATE_CACHE("support_helpers/due_date_cache"),
    
    SUPPORT_HELPERS_SUBMISSION_LIFECYCLE_MANAGE("support_helpers/submission_lifecycle_manage"),
    
    TABS("tabs"),
    
    TERMS("terms"),
    
    TERMS_API("terms_api"),
    
    TOKENS("tokens"),
    
    TRUST_LINKS("trust_links"),
    
    USAGE_RIGHTS("usage_rights"),
    
    USER_LISTS("user_lists"),
    
    USER_NOTES("user_notes"),
    
    USER_OBSERVEES("user_observees"),
    
    USERS("users"),
    
    UUID_PROVISIONERS("uuid_provisioners"),
    
    WEBHOOKS("webhooks"),
    
    WEB_ZIP_EXPORTS("web_zip_exports"),
    
    WEBCT_EXPORTER("webct_exporter"),
    
    WIKI_PAGES("wiki_pages"),
    
    WIKI_PAGES_API("wiki_pages_api");

    private Object value;

    WebApplicationControllerEnum(Object value) {
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
    public static WebApplicationControllerEnum fromValue(Object value) {
      for (WebApplicationControllerEnum b : WebApplicationControllerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_WEB_APPLICATION_CONTROLLER = "web_application_controller";
  private JsonNullable<WebApplicationControllerEnum> webApplicationController = JsonNullable.<WebApplicationControllerEnum>of(null);

  /**
   * The action in the Canvas web application used to service this request.
   */
  public enum WebApplicationActionEnum {
    ABORT("abort"),
    
    ABORT_ALL_PENDING("abort_all_pending"),
    
    ACCEPT("accept"),
    
    ACCOUNT_CALENDAR_SETTINGS("account_calendar_settings"),
    
    ACCOUNT_CHAIN("account_chain"),
    
    ACTIVATE_ROLE("activate_role"),
    
    ACTIVITY_STREAM("activity_stream"),
    
    ACTIVITY_STREAM_SUMMARY("activity_stream_summary"),
    
    ADD_ACCOUNT_USER("add_account_user"),
    
    ADD_DOMAIN("add_domain"),
    
    ADD_ENTRY("add_entry"),
    
    ADD_FAVORITE_COURSE("add_favorite_course"),
    
    ADD_FAVORITE_GROUPS("add_favorite_groups"),
    
    ADD_ITEM("add_item"),
    
    ADD_MESSAGE("add_message"),
    
    ADD_RCE_FAVORITE("add_rce_favorite"),
    
    ADD_REPLY("add_reply"),
    
    ADD_ROLE("add_role"),
    
    ADD_SFTP_KEY("add_sftp_key"),
    
    ADD_USERS("add_users"),
    
    ADMIN_MERGE("admin_merge"),
    
    ADMIN_SPLIT("admin_split"),
    
    ADMIN_TOOLS("admin_tools"),
    
    ADVANTAGE_ACCESS_TOKEN("advantage_access_token"),
    
    ALERTS_BY_STUDENT("alerts_by_student"),
    
    ALERTS_COUNT("alerts_count"),
    
    ALIGNMENT_REDIRECT("alignment_redirect"),
    
    ALL_CALENDARS("all_calendars"),
    
    ALL_COURSES("all_courses"),
    
    ALL_VISIBLE_NAV_TOOLS("all_visible_nav_tools"),
    
    ANDROID_ASSETLINKS("android_assetlinks"),
    
    ANNOTATION_NOTIFICATION("annotation_notification"),
    
    ANSWER("answer"),
    
    API_CAPTURE("api_capture"),
    
    API_CREATE_SUCCESS("api_create_success"),
    
    API_DESTROY("api_destroy"),
    
    API_FILE_STATUS("api_file_status"),
    
    API_INDEX("api_index"),
    
    API_QUOTA("api_quota"),
    
    API_SETTINGS("api_settings"),
    
    API_SHOW("api_show"),
    
    API_UPDATE("api_update"),
    
    APPLE_APP_SITE_ASSOCIATION("apple_app_site_association"),
    
    APPLY_SCORE_TO_UNGRADED_SUBMISSIONS("apply_score_to_ungraded_submissions"),
    
    ASSESSMENT_QUESTION_SHOW("assessment_question_show"),
    
    ASSET_ID_MAPPING("asset_id_mapping"),
    
    ASSIGN_PEER_REVIEW("assign_peer_review"),
    
    ASSIGN_PEER_REVIEWS("assign_peer_reviews"),
    
    ASSIGN_UNASSIGNED_MEMBERS("assign_unassigned_members"),
    
    ASSOCIATED_COURSES("associated_courses"),
    
    ATTACHMENT("attachment"),
    
    ATTACHMENT_CONTENT("attachment_content"),
    
    AUDIT_EVENTS("audit_events"),
    
    AUTH("auth"),
    
    AUTHENTICATE("authenticate"),
    
    AUTHORIZE("authorize"),
    
    AUTHORIZE_REDIRECT("authorize_redirect"),
    
    AVAILABLE("available"),
    
    AVAILABLE_MIGRATORS("available_migrators"),
    
    AVAILABLE_REPORTS("available_reports"),
    
    AVATAR_IMAGE("avatar_image"),
    
    AVATARS("avatars"),
    
    BACKUP("backup"),
    
    BASIC_LTI_LAUNCH_REQUEST("basic_lti_launch_request"),
    
    BATCH_CREATE("batch_create"),
    
    BATCH_RETRIEVE("batch_retrieve"),
    
    BATCH_UPDATE("batch_update"),
    
    BATCHES("batches"),
    
    BOOKMARK("bookmark"),
    
    BOOKMARK_SEARCH("bookmark_search"),
    
    BOUNCING_CHANNEL_REPORT("bouncing_channel_report"),
    
    BROWSERCONFIG("browserconfig"),
    
    BULK_RESET_BOUNCE_COUNTS("bulk_reset_bounce_counts"),
    
    BULK_SELECT("bulk_select"),
    
    BULK_UPDATE("bulk_update"),
    
    BULK_USER_PROGRESS("bulk_user_progress"),
    
    CANCEL("cancel"),
    
    CATEGORY_INDEX("category_index"),
    
    CHANGE_GRADEBOOK_COLUMN_SIZE("change_gradebook_column_size"),
    
    CHANGE_GRADEBOOK_VERSION("change_gradebook_version"),
    
    CHANGE_PASSWORD("change_password"),
    
    CHECK_ACCOUNT_PERMISSION("check_account_permission"),
    
    CHECK_TITLE_AVAILABILITY("check_title_availability"),
    
    CHOOSE_MASTERY_PATH("choose_mastery_path"),
    
    CLEAR_CACHE("clear_cache"),
    
    CLEAR_FILE_SESSION("clear_file_session"),
    
    CLONE_WITH_NAME("clone_with_name"),
    
    CLOSE("close"),
    
    CLOSE_NOTIFICATION("close_notification"),
    
    CLOSED("closed"),
    
    CLUSTERS("clusters"),
    
    COMMUNICATION("communication"),
    
    COMPLETE("complete"),
    
    COMPRESS_DATES("compress_dates"),
    
    CONCLUDE_USER("conclude_user"),
    
    CONFIGURATION("configuration"),
    
    CONFIRM("confirm"),
    
    CONFIRM_ACTION("confirm_action"),
    
    CONFIRM_CHANGE_PASSWORD("confirm_change_password"),
    
    CONFIRM_DELETE_USER("confirm_delete_user"),
    
    CONFIRMATION_LIMIT_REACHED("confirmation_limit_reached"),
    
    CONSORTIUM_USERS("consortium_users"),
    
    CONTENT_LIST("content_list"),
    
    CONTENT_SHARE_USERS("content_share_users"),
    
    CONTENT_SHARES("content_shares"),
    
    CONTENT_TAG_ASSIGNMENT_DATA("content_tag_assignment_data"),
    
    CONTENT_TAG_MASTER_COURSE_DATA("content_tag_master_course_data"),
    
    CONTENT_TAG_PREREQUISITES_NEEDING_FINISHING("content_tag_prerequisites_needing_finishing"),
    
    CONTEXT_INDEX("context_index"),
    
    CONTEXT_SHOW("context_show"),
    
    COPY("copy"),
    
    COPY_COURSE("copy_course"),
    
    COPY_COURSE_CONTENT("copy_course_content"),
    
    COPY_COURSE_STATUS("copy_course_status"),
    
    COPY_FILE("copy_file"),
    
    COPY_FOLDER("copy_folder"),
    
    COURSE("course"),
    
    COURSE_ACCOUNTS("course_accounts"),
    
    COURSE_ASSIGNMENTS("course_assignments"),
    
    COURSE_CREATION_ACCOUNTS("course_creation_accounts"),
    
    COURSE_INDEX("course_index"),
    
    COURSE_PARTICIPATION("course_participation"),
    
    COURSE_STUDENT_SUMMARIES("course_student_summaries"),
    
    COURSES("courses"),
    
    COURSES_API("courses_api"),
    
    COURSES_REDIRECT("courses_redirect"),
    
    CREATE("create"),
    
    CREATE_FILE("create_file"),
    
    CREATE_MEDIA_OBJECT("create_media_object"),
    
    CREATE_OR_UPDATE("create_or_update"),
    
    CREATE_PENDING("create_pending"),
    
    CREATE_TOOL_WITH_VERIFICATION("create_tool_with_verification"),
    
    CREATE_USER_SERVICE("create_user_service"),
    
    CREATED_GROUP_IDS("created_group_ids"),
    
    CROSS_DOMAIN_LOGIN("cross_domain_login"),
    
    CROSSLIST("crosslist"),
    
    CROSSLIST_CHECK("crosslist_check"),
    
    DASHBOARD_CARDS("dashboard_cards"),
    
    DASHBOARD_SIDEBAR("dashboard_sidebar"),
    
    DASHBOARD_STREAM_ITEMS("dashboard_stream_items"),
    
    DASHBOARD_VIEW("dashboard_view"),
    
    DATA("data"),
    
    DAY_DETAILS("day_details"),
    
    DAYS("days"),
    
    DEBUG_DATA("debug_data"),
    
    DEEP("deep"),
    
    DEEP_LINKING_RESPONSE("deep_linking_response"),
    
    DELEGATED_AUTH_PASS_THROUGH("delegated_auth_pass_through"),
    
    DELETE("delete"),
    
    DELETE_DATA("delete_data"),
    
    DELETE_FOR_ALL("delete_for_all"),
    
    DELETE_PEER_REVIEW("delete_peer_review"),
    
    DELETE_PUSH_TOKEN("delete_push_token"),
    
    DELETE_RECORDING("delete_recording"),
    
    DELETE_USER_SERVICE("delete_user_service"),
    
    DELETED_INDEX("deleted_index"),
    
    DENY("deny"),
    
    DEPARTMENT("department"),
    
    DEPARTMENT_GRADES("department_grades"),
    
    DEPARTMENT_PARTICIPATION("department_participation"),
    
    DEPARTMENT_STATISTICS("department_statistics"),
    
    DEPARTMENT_STATISTICS_BY_SUBACCOUNT("department_statistics_by_subaccount"),
    
    DESTROY("destroy"),
    
    DESTROY_ALL("destroy_all"),
    
    DETAIL_LIST("detail_list"),
    
    DISABLE_POST_TO_SIS("disable_post_to_sis"),
    
    DISMISS_MIGRATION_LIMITATION_MSG("dismiss_migration_limitation_msg"),
    
    DOMAIN_LOOKUPS("domain_lookups"),
    
    DUPLICATE("duplicate"),
    
    EDIT("edit"),
    
    EFFECTIVE_DUE_DATES("effective_due_dates"),
    
    ENABLED_FEATURES("enabled_features"),
    
    ENROLL_USERS("enroll_users"),
    
    ENROLLMENT_INVITATION("enrollment_invitation"),
    
    ENTRIES("entries"),
    
    ENTRY_LIST("entry_list"),
    
    ENVIRONMENT("environment"),
    
    EPORTFOLIO_MODERATION("eportfolio_moderation"),
    
    EVENT_TYPES_INDEX("event_types_index"),
    
    EXECUTE("execute"),
    
    EXPORT("export"),
    
    EXTENSIONS("extensions"),
    
    EXTERNAL_TOOL("external_tool"),
    
    FAIL("fail"),
    
    FEED("feed"),
    
    FINAL_GRADE_OVERRIDES("final_grade_overrides"),
    
    FLAG("flag"),
    
    FOR_ACCOUNT("for_account"),
    
    FOR_ASSIGNMENT("for_assignment"),
    
    FOR_COURSE("for_course"),
    
    FOR_COURSE_AND_OTHER_PARAMETERS("for_course_and_other_parameters"),
    
    FOR_GRADER("for_grader"),
    
    FOR_LOGIN("for_login"),
    
    FOR_STUDENT("for_student"),
    
    FOR_STUDENTS("for_students"),
    
    FOR_USER("for_user"),
    
    FORMATTED_ANSWER("formatted_answer"),
    
    FORGOT_PASSWORD("forgot_password"),
    
    FRONT_PAGE("front_page"),
    
    GENERATE_SESSIONLESS_LAUNCH("generate_sessionless_launch"),
    
    GET_COURSE_TIMETABLE("get_course_timetable"),
    
    GET_COURSES("get_courses"),
    
    GET_CSP_SETTINGS("get_csp_settings"),
    
    GET_CUSTOM_COLOR("get_custom_color"),
    
    GET_CUSTOM_COLORS("get_custom_colors"),
    
    GET_DASHBOARD_POSITIONS("get_dashboard_positions"),
    
    GET_DATA("get_data"),
    
    GET_NEW_USER_TUTORIAL_STATUSES("get_new_user_tutorial_statuses"),
    
    GRADE("grade"),
    
    GRADE_PASSBACK("grade_passback"),
    
    GRADE_SUMMARY("grade_summary"),
    
    GRADEABLE_STUDENTS("gradeable_students"),
    
    GRADES("grades"),
    
    GRADES_FOR_STUDENT("grades_for_student"),
    
    GRADING_PERIOD_ASSIGNMENTS("grading_period_assignments"),
    
    GRADING_RUBRICS("grading_rubrics"),
    
    GRAPHIQL("graphiql"),
    
    GROUP_ALIAS("group_alias"),
    
    GROUP_INDEX("group_index"),
    
    GROUPED_INFO("grouped_info"),
    
    GROUPS("groups"),
    
    HANDSHAKE("handshake"),
    
    HEALTH_PROGNOSIS("health_prognosis"),
    
    HELP_LINKS("help_links"),
    
    HISTORY("history"),
    
    HTML_MESSAGE("html_message"),
    
    ICON_MAKER_FOLDER("icon_maker_folder"),
    
    ICON_METADATA("icon_metadata"),
    
    IFRAME_MEDIA_PLAYER("iframe_media_player"),
    
    IGNORE_ITEM("ignore_item"),
    
    IGNORE_STREAM_ITEM("ignore_stream_item"),
    
    IMAGE_THUMBNAIL("image_thumbnail"),
    
    IMAGES("images"),
    
    IMPORT("import"),
    
    IMPORT_DETAILS("import_details"),
    
    IMPORTING("importing"),
    
    IMPORTS_INDEX("imports_index"),
    
    IMPORTS_SHOW("imports_show"),
    
    INBOX("inbox"),
    
    INDEX("index"),
    
    INTERNAL_ANALYTICS("internal_analytics"),
    
    INTRO("intro"),
    
    INVITE("invite"),
    
    INVITE_USERS("invite_users"),
    
    ITEM_DETAILS("item_details"),
    
    ITEM_REDIRECT("item_redirect"),
    
    ITEM_REDIRECT_MASTERY_PATHS("item_redirect_mastery_paths"),
    
    ITEM_SEQUENCE("item_sequence"),
    
    JOB_STATS("job_stats"),
    
    JOIN("join"),
    
    JWKS("jwks"),
    
    JWT_TOKEN("jwt_token"),
    
    LANDING("landing"),
    
    LAST_ATTENDED("last_attended"),
    
    LATEST("latest"),
    
    LAUNCH("launch"),
    
    LAUNCH_DEFINITIONS("launch_definitions"),
    
    LEAVE_STUDENT_VIEW("leave_student_view"),
    
    LEGACY_GRADE_PASSBACK("legacy_grade_passback"),
    
    LICENSES("licenses"),
    
    LIMIT_USER("limit_user"),
    
    LINK("link"),
    
    LINK_INDEX("link_index"),
    
    LINK_VALIDATION("link_validation"),
    
    LINK_VALIDATOR("link_validator"),
    
    LIST("list"),
    
    LIST_ALL_FOLDERS("list_all_folders"),
    
    LIST_FAVORITE_COURSES("list_favorite_courses"),
    
    LIST_FAVORITE_GROUPS("list_favorite_groups"),
    
    LIST_GOOGLE_DOCS("list_google_docs"),
    
    LIST_KEYS("list_keys"),
    
    LOCKDOWN_BROWSER_REQUIRED("lockdown_browser_required"),
    
    LOGOUT_LANDING("logout_landing"),
    
    LOGOUT_SERVICE("logout_service"),
    
    LOOKUP("lookup"),
    
    LTI_INDEX("lti_index"),
    
    MANAGE("manage"),
    
    MANAGEABLE_ACCOUNTS("manageable_accounts"),
    
    MANAGEABLE_COURSES("manageable_courses"),
    
    MANAGED_QUIZ_DATA("managed_quiz_data"),
    
    MANUALLY_CREATED_COURSES_ACCOUNT("manually_created_courses_account"),
    
    MARK_ALL_AS_READ("mark_all_as_read"),
    
    MARK_ALL_READ("mark_all_read"),
    
    MARK_ALL_UNREAD("mark_all_unread"),
    
    MARK_AS_DONE("mark_as_done"),
    
    MARK_AS_NOT_DONE("mark_as_not_done"),
    
    MARK_BULK_SUBMISSIONS_AS_READ("mark_bulk_submissions_as_read"),
    
    MARK_ENTRY_READ("mark_entry_read"),
    
    MARK_ENTRY_UNREAD("mark_entry_unread"),
    
    MARK_ITEM_READ("mark_item_read"),
    
    MARK_RUBRIC_ASSESSMENTS_READ("mark_rubric_assessments_read"),
    
    MARK_SUBMISSION_ITEM_READ("mark_submission_item_read"),
    
    MARK_SUBMISSION_READ("mark_submission_read"),
    
    MARK_SUBMISSION_UNREAD("mark_submission_unread"),
    
    MARK_TOPIC_READ("mark_topic_read"),
    
    MARK_TOPIC_UNREAD("mark_topic_unread"),
    
    MASQUERADE("masquerade"),
    
    MEDIA_DOWNLOAD("media_download"),
    
    MEDIA_FOLDER("media_folder"),
    
    MEDIA_OBJECT_REDIRECT("media_object_redirect"),
    
    MEDIA_OBJECT_THUMBNAIL("media_object_thumbnail"),
    
    MEDIA_UPLOAD_URL("media_upload_url"),
    
    MEMBERS("members"),
    
    MERGE("merge"),
    
    MERGE_INTO("merge_into"),
    
    MESSAGE_REDIRECT("message_redirect"),
    
    METADATA("metadata"),
    
    MIGRATION_DETAILS("migration_details"),
    
    MIGRATION_STATUS("migration_status"),
    
    MIGRATIONS_INDEX("migrations_index"),
    
    MIGRATIONS_SHOW("migrations_show"),
    
    MISSING_SUBMISSIONS("missing_submissions"),
    
    MOBILE_LOGIN_QR_CODE("mobile_login_qr_code"),
    
    MODERATE("moderate"),
    
    MODULE_REDIRECT("module_redirect"),
    
    MOVE_QUESTIONS("move_questions"),
    
    MULTIPLE_GRADEABLE_STUDENTS("multiple_gradeable_students"),
    
    NEW("new"),
    
    NEW_QUIZZES("new_quizzes"),
    
    NEW_QUIZZES_SELECTION_UPDATE("new_quizzes_selection_update"),
    
    NEXT_APPOINTMENT("next_appointment"),
    
    OAUTH("oauth"),
    
    OAUTH_SUCCESS("oauth_success"),
    
    OBJECT_SNIPPET("object_snippet"),
    
    OBSERVEES("observees"),
    
    OBSERVERS("observers"),
    
    OBSERVER_PAIRING_CODES_CSV("observer_pairing_codes_csv"),
    
    OEMBED_RETRIEVE("oembed_retrieve"),
    
    OFFLINE_WEB_EXPORTS("offline_web_exports"),
    
    OPEN("open"),
    
    OPENED("opened"),
    
    ORIGINALITY_REPORT("originality_report"),
    
    OUTCOME_ALIGNMENTS("outcome_alignments"),
    
    OUTCOME_RESULT("outcome_result"),
    
    OUTCOMES("outcomes"),
    
    PAGES("pages"),
    
    PANDATA_EVENTS_TOKEN("pandata_events_token"),
    
    PARTICIPANTS("participants"),
    
    PEER_REVIEWS("peer_reviews"),
    
    PERMISSIONS("permissions"),
    
    PING("ping"),
    
    POST_MESSAGE_FORWARDING("post_message_forwarding"),
    
    POTENTIAL_COLLABORATORS("potential_collaborators"),
    
    PRESTART("prestart"),
    
    PREVIEW_HTML("preview_html"),
    
    PRIOR_USERS("prior_users"),
    
    PRIVACY_POLICY("privacy_policy"),
    
    PROFILE_PICS("profile_pics"),
    
    PROGRESSIONS("progressions"),
    
    PUBLIC_FEED("public_feed"),
    
    PUBLIC_URL("public_url"),
    
    PUBLISH("publish"),
    
    PUBLISH_QUIZZES("publish_quizzes"),
    
    PUBLISH_TO_SIS("publish_to_sis"),
    
    QR_MOBILE_LOGIN("qr_mobile_login"),
    
    QUERY("query"),
    
    QUESTIONS("questions"),
    
    QUEUE_MIGRATION("queue_migration"),
    
    QUOTA("quota"),
    
    RATE_ENTRY("rate_entry"),
    
    RCE_CONFIG("rce_config"),
    
    RE_SEND_CONFIRMATION("re_send_confirmation"),
    
    RE_SEND_INVITATIONS("re_send_invitations"),
    
    REACT_FILES("react_files"),
    
    REACTIVATE("reactivate"),
    
    READ_ONLY("read_only"),
    
    READINESS("readiness"),
    
    RECENT_STUDENTS("recent_students"),
    
    RECIPIENTS("recipients"),
    
    RECORD_ANSWER("record_answer"),
    
    RECORDING_READY("recording_ready"),
    
    REDIRECT("redirect"),
    
    REDIRECT_PROXY("redirect_proxy"),
    
    REDO_SUBMISSION("redo_submission"),
    
    REFRESH("refresh"),
    
    REGISTRATION("registration"),
    
    REGISTRATION_RETURN("registration_return"),
    
    REJECT("reject"),
    
    RELOCK("relock"),
    
    REMIND_PEER_REVIEW("remind_peer_review"),
    
    REMOVE_ACCOUNT_USER("remove_account_user"),
    
    REMOVE_ALIGNMENT("remove_alignment"),
    
    REMOVE_FAVORITE_COURSE("remove_favorite_course"),
    
    REMOVE_FAVORITE_GROUPS("remove_favorite_groups"),
    
    REMOVE_ITEM("remove_item"),
    
    REMOVE_MESSAGES("remove_messages"),
    
    REMOVE_RCE_FAVORITE("remove_rce_favorite"),
    
    REMOVE_ROLE("remove_role"),
    
    REMOVE_USER("remove_user"),
    
    RENDER_PAST_GLOBAL_ANNOUNCEMENTS("render_past_global_announcements"),
    
    REORDER("reorder"),
    
    REORDER_ASSIGNMENTS("reorder_assignments"),
    
    REORDER_CATEGORIES("reorder_categories"),
    
    REORDER_ENTRIES("reorder_entries"),
    
    REORDER_ITEMS("reorder_items"),
    
    REPLIES("replies"),
    
    REPORT_AVATAR_IMAGE("report_avatar_image"),
    
    REPORTS_TAB("reports_tab"),
    
    REQUEUE("requeue"),
    
    RESERVE("reserve"),
    
    RESET("reset"),
    
    RESET_BOUNCE_COUNT("reset_bounce_count"),
    
    RESET_CONTENT("reset_content"),
    
    RESET_COURSE_FAVORITES("reset_course_favorites"),
    
    RESET_TEST_STUDENT("reset_test_student"),
    
    RESET_VERIFIER("reset_verifier"),
    
    RESOLVE_PATH("resolve_path"),
    
    RESOURCE("resource"),
    
    RESOURCE_SELECTION("resource_selection"),
    
    RESTORE_MESSAGE("restore_message"),
    
    RESTORE_STATES("restore_states"),
    
    RESTORE_USER("restore_user"),
    
    RESTRICT_ITEM("restrict_item"),
    
    RESUBMIT_TO_TURNITIN("resubmit_to_turnitin"),
    
    RESUBMIT_TO_VERICITE("resubmit_to_vericite"),
    
    RETRIEVE("retrieve"),
    
    REVERT("revert"),
    
    REVISIONS("revisions"),
    
    REVISIONS_REDIRECT("revisions_redirect"),
    
    ROLLUPS("rollups"),
    
    ROOT_ACCOUNTS("root_accounts"),
    
    ROSTER("roster"),
    
    ROSTER_USER("roster_user"),
    
    ROSTER_USER_SERVICES("roster_user_services"),
    
    ROSTER_USER_USAGE("roster_user_usage"),
    
    RUBRIC("rubric"),
    
    RUBRIC_ASSESSMENTS_READ_STATE("rubric_assessments_read_state"),
    
    RUBRICS("rubrics"),
    
    SAVE_ASSIGNMENT_ORDER("save_assignment_order"),
    
    SAVE_ENABLED_ACCOUNT_CALENDARS("save_enabled_account_calendars"),
    
    SAVE_GRADEBOOK_COLUMN_ORDER("save_gradebook_column_order"),
    
    SAVE_SELECTED_CONTEXTS("save_selected_contexts"),
    
    SAVE_TO_ACCOUNT("save_to_account"),
    
    SAVE_TO_USER_SESSION("save_to_user_session"),
    
    SEARCH("search"),
    
    SECTION_ALIAS("section_alias"),
    
    SELECT("select"),
    
    SELECT_MASTERY_PATH("select_mastery_path"),
    
    SELF_ENROLLMENT("self_enrollment"),
    
    SELF_UNENROLLMENT("self_unenrollment"),
    
    SEND_VIA_SMS("send_via_sms"),
    
    SERVICES("services"),
    
    SESSION_LAUNCH("session_launch"),
    
    SESSION_TOKEN("session_token"),
    
    SESSIONLESS_LAUNCH("sessionless_launch"),
    
    SET_CUSTOM_COLOR("set_custom_color"),
    
    SET_COURSE_TIMETABLE("set_course_timetable"),
    
    SET_COURSE_TIMETABLE_EVENTS("set_course_timetable_events"),
    
    SET_CSP_SETTING("set_csp_setting"),
    
    SET_DASHBOARD_POSITIONS("set_dashboard_positions"),
    
    SET_DATA("set_data"),
    
    SET_NEW_USER_TUTORIAL_STATUS("set_new_user_tutorial_status"),
    
    SET_USAGE_RIGHTS("set_usage_rights"),
    
    SETTINGS("settings"),
    
    SHOW("show"),
    
    SHOW_ANONYMOUS("show_anonymous"),
    
    SHOW_DEFAULT_GRADING_SCHEME("show_default_grading_scheme"),
    
    SHOW_DEPRECATED("show_deprecated"),
    
    SHOW_FRONT_PAGE("show_front_page"),
    
    SHOW_K5_DASHBOARD("show_k5_dashboard"),
    
    SHOW_KALTURA_CONFIG("show_kaltura_config"),
    
    SHOW_MODERATE("show_moderate"),
    
    SHOW_OBSERVER("show_observer"),
    
    SHOW_REDIRECT("show_redirect"),
    
    SHOW_RELATIVE("show_relative"),
    
    SHOW_REVISION("show_revision"),
    
    SHOW_SETTINGS("show_settings"),
    
    SHOW_SSO_SETTINGS("show_sso_settings"),
    
    SHOW_SUBMISSIONS_UPLOAD("show_submissions_upload"),
    
    SIS_ASSIGNMENTS("sis_assignments"),
    
    SIS_IMPORT("sis_import"),
    
    SIS_PUBLISH_STATUS("sis_publish_status"),
    
    SPEED_GRADER("speed_grader"),
    
    SPEED_GRADER_SETTINGS("speed_grader_settings"),
    
    SPLIT("split"),
    
    START("start"),
    
    START_DEBUGGING("start_debugging"),
    
    START_KALTURA_SESSION("start_kaltura_session"),
    
    START_LINK_VALIDATION("start_link_validation"),
    
    START_OFFLINE_WEB_EXPORT("start_offline_web_export"),
    
    STATISTICS("statistics"),
    
    STATISTICS_GRAPH("statistics_graph"),
    
    STATUS("status"),
    
    STOP_DEBUGGING("stop_debugging"),
    
    STORE("store"),
    
    STUCK_SINGLETONS("stuck_singletons"),
    
    STUCK_STRANDS("stuck_strands"),
    
    STUDENT_DETAILS("student_details"),
    
    STUDENT_IN_COURSE("student_in_course"),
    
    STUDENT_IN_COURSE_ASSIGNMENTS("student_in_course_assignments"),
    
    STUDENT_IN_COURSE_MESSAGING("student_in_course_messaging"),
    
    STUDENT_IN_COURSE_PARTICIPATION("student_in_course_participation"),
    
    STUDENT_VIEW("student_view"),
    
    STUDENT_VIEW_STUDENT("student_view_student"),
    
    STUDENTS("students"),
    
    STUDENTS_PER_RANGE("students_per_range"),
    
    STYLEGUIDE("styleguide"),
    
    SUB_ACCOUNTS("sub_accounts"),
    
    SUBGRAPH_EXECUTE("subgraph_execute"),
    
    SUBGROUPS("subgroups"),
    
    SUBMISSION("submission"),
    
    SUBMISSIONS("submissions"),
    
    SUBMISSIONS_CLEAR_UNREAD("submissions_clear_unread"),
    
    SUBMISSION_SUMMARY("submission_summary"),
    
    SUBMISSION_VERSIONS("submission_versions"),
    
    SUBMISSIONS_ZIP_UPLOAD("submissions_zip_upload"),
    
    SUBSCRIBE_TOPIC("subscribe_topic"),
    
    SUBSCRIPTIONS_INDEX("subscriptions_index"),
    
    SUCCESS("success"),
    
    SUMMARY_LIST("summary_list"),
    
    SYLLABUS("syllabus"),
    
    SYNC("sync"),
    
    TEACHER_ACTIVITY("teacher_activity"),
    
    TERMINATE_SESSIONS("terminate_sessions"),
    
    TERMS_OF_SERVICE("terms_of_service"),
    
    TERMS_OF_SERVICE_CUSTOM_CONTENT("terms_of_service_custom_content"),
    
    TERMS_OF_USE("terms_of_use"),
    
    TEST_LDAP_BIND("test_ldap_bind"),
    
    TEST_LDAP_CONNECTION("test_ldap_connection"),
    
    TEST_LDAP_LOGIN("test_ldap_login"),
    
    TEST_LDAP_SEARCH("test_ldap_search"),
    
    TIME("time"),
    
    TODO_ITEM_COUNT("todo_item_count"),
    
    TODO_ITEMS("todo_items"),
    
    TOGGLE_COLLAPSE("toggle_collapse"),
    
    TOGGLE_COLLAPSE_ALL("toggle_collapse_all"),
    
    TOGGLE_DISABLE_INBOX("toggle_disable_inbox"),
    
    TOGGLE_HIDE_DASHCARD_COLOR_OVERLAYS("toggle_hide_dashcard_color_overlays"),
    
    TOGGLE_MUTE("toggle_mute"),
    
    TOKEN("token"),
    
    TURNITIN_CONFIRMATION("turnitin_confirmation"),
    
    TURNITIN_OUTCOMES_PLACEMENT("turnitin_outcomes_placement"),
    
    TURNITIN_REPORT("turnitin_report"),
    
    UNCONCLUDE("unconclude"),
    
    UNCONCLUDE_USER("unconclude_user"),
    
    UNCONFIRMED_CHANNEL_REPORT("unconfirmed_channel_report"),
    
    UNCROSSLIST("uncrosslist"),
    
    UNDELETE_INDEX("undelete_index"),
    
    UNDELETE_ITEM("undelete_item"),
    
    UNENROLL_USER("unenroll_user"),
    
    UNFLAG("unflag"),
    
    UNIVERSAL_LINK_OAUTH2_DUMMY("universal_link_oauth2_dummy"),
    
    UNLINK("unlink"),
    
    UNPUBLISH("unpublish"),
    
    UNPUBLISH_QUIZZES("unpublish_quizzes"),
    
    UNREAD_COUNT("unread_count"),
    
    UNSUBSCRIBE_TOPIC("unsubscribe_topic"),
    
    UNSTUCK("unstuck"),
    
    UNSYNCED_CHANGES("unsynced_changes"),
    
    UPCOMING_EVENTS("upcoming_events"),
    
    UPDATE("update"),
    
    UPDATE_ALL("update_all"),
    
    UPDATE_ANONYMOUS("update_anonymous"),
    
    UPDATE_ASSOCIATIONS("update_associations"),
    
    UPDATE_AVATAR_IMAGE("update_avatar_image"),
    
    UPDATE_FRONT_PAGE("update_front_page"),
    
    UPDATE_FINAL_GRADE_OVERRIDES("update_final_grade_overrides"),
    
    UPDATE_ITEM("update_item"),
    
    UPDATE_MEDIA_OBJECT("update_media_object"),
    
    UPDATE_NAV("update_nav"),
    
    UPDATE_PREFERENCES_BY_CATEGORY("update_preferences_by_category"),
    
    UPDATE_PROFILE("update_profile"),
    
    UPDATE_REGION("update_region"),
    
    UPDATE_SETTINGS("update_settings"),
    
    UPDATE_SSO_SETTINGS("update_sso_settings"),
    
    UPDATE_SUBMISSION("update_submission"),
    
    USER("user"),
    
    USER_CLOSE_NOTIFICATION("user_close_notification"),
    
    USER_CLOSE_NOTIFICATION_DEPRECATED("user_close_notification_deprecated"),
    
    USER_DASHBOARD("user_dashboard"),
    
    USER_GRADED_SUBMISSIONS("user_graded_submissions"),
    
    USER_IDS("user_ids"),
    
    USER_INDEX("user_index"),
    
    USER_INDEX_DEPRECATED("user_index_deprecated"),
    
    USER_NOTES("user_notes"),
    
    USER_OUTCOME_RESULTS("user_outcome_results"),
    
    USER_PROGRESS("user_progress"),
    
    USERS("users"),
    
    VALIDATE_ACCESS_CODE("validate_access_code"),
    
    VERICITE_REPORT("vericite_report"),
    
    VIEW("view"),
    
    VISIBLE_CALENDARS_COUNT("visible_calendars_count"),
    
    VISIBLE_CONTEXTS("visible_contexts"),
    
    VISIBLE_COURSE_NAV_TOOLS("visible_course_nav_tools"),
    
    WEB_APP_MANIFEST("web_app_manifest"),
    
    WEBCT_SCHOOLS("webct_schools"),
    
    XML_SCHEMA("xml_schema");

    private Object value;

    WebApplicationActionEnum(Object value) {
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
    public static WebApplicationActionEnum fromValue(Object value) {
      for (WebApplicationActionEnum b : WebApplicationActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_WEB_APPLICATION_ACTION = "web_application_action";
  private JsonNullable<WebApplicationActionEnum> webApplicationAction = JsonNullable.<WebApplicationActionEnum>of(null);

  /**
   * Containing object type that the Canvas web application used to service this request.
   */
  public enum WebApplicationContextTypeEnum {
    ACCOUNT("Account"),
    
    ASSESSMENTQUESTION("AssessmentQuestion"),
    
    ASSIGNMENT("Assignment"),
    
    CONTENTMIGRATION("ContentMigration"),
    
    COURSE("Course"),
    
    COURSESECTION("CourseSection"),
    
    GROUP("Group"),
    
    QUIZZES_QUIZSUBMISSION("Quizzes::QuizSubmission"),
    
    STUDENTENROLLMENT("StudentEnrollment"),
    
    USER("User"),
    
    USERPROFILE("UserProfile");

    private Object value;

    WebApplicationContextTypeEnum(Object value) {
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
    public static WebApplicationContextTypeEnum fromValue(Object value) {
      for (WebApplicationContextTypeEnum b : WebApplicationContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_WEB_APPLICATION_CONTEXT_TYPE = "web_application_context_type";
  private JsonNullable<WebApplicationContextTypeEnum> webApplicationContextType = JsonNullable.<WebApplicationContextTypeEnum>of(null);

  public static final String JSON_PROPERTY_WEB_APPLICATION_CONTEXT_ID = "web_application_context_id";
  private JsonNullable<Object> webApplicationContextId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private JsonNullable<Object> sessionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEVELOPER_KEY_ID = "developer_key_id";
  private JsonNullable<Object> developerKeyId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PARTICIPATED = "participated";
  private Object participated = null;

  public WebLogs() {
  }

  public WebLogs id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a logged web request.
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


  public WebLogs timestamp(Object timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp when the request was made in UTC.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }


  public WebLogs userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * The unique ID of the user that made the request.
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


  public WebLogs realUserId(Object realUserId) {
    this.realUserId = JsonNullable.<Object>of(realUserId);
    
    return this;
  }

   /**
   * If the request was processed by one user masquerading as another, then this column contains the real user ID of the user.
   * @return realUserId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRealUserId() {
        return realUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REAL_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRealUserId_JsonNullable() {
    return realUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_REAL_USER_ID)
  public void setRealUserId_JsonNullable(JsonNullable<Object> realUserId) {
    this.realUserId = realUserId;
  }

  public void setRealUserId(Object realUserId) {
    this.realUserId = JsonNullable.<Object>of(realUserId);
  }


  public WebLogs courseId(Object courseId) {
    this.courseId = JsonNullable.<Object>of(courseId);
    
    return this;
  }

   /**
   * Course that owned the request.
   * @return courseId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseId() {
        return courseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseId_JsonNullable() {
    return courseId;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_ID)
  public void setCourseId_JsonNullable(JsonNullable<Object> courseId) {
    this.courseId = courseId;
  }

  public void setCourseId(Object courseId) {
    this.courseId = JsonNullable.<Object>of(courseId);
  }


  public WebLogs quizId(Object quizId) {
    this.quizId = JsonNullable.<Object>of(quizId);
    
    return this;
  }

   /**
   * Identifies the quiz if the request is for a quiz.
   * @return quizId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getQuizId() {
        return quizId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUIZ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQuizId_JsonNullable() {
    return quizId;
  }
  
  @JsonProperty(JSON_PROPERTY_QUIZ_ID)
  public void setQuizId_JsonNullable(JsonNullable<Object> quizId) {
    this.quizId = quizId;
  }

  public void setQuizId(Object quizId) {
    this.quizId = JsonNullable.<Object>of(quizId);
  }


  public WebLogs discussionId(Object discussionId) {
    this.discussionId = JsonNullable.<Object>of(discussionId);
    
    return this;
  }

   /**
   * Identifies the discussion if the request is for a discussion.
   * @return discussionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDiscussionId() {
        return discussionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCUSSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscussionId_JsonNullable() {
    return discussionId;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCUSSION_ID)
  public void setDiscussionId_JsonNullable(JsonNullable<Object> discussionId) {
    this.discussionId = discussionId;
  }

  public void setDiscussionId(Object discussionId) {
    this.discussionId = JsonNullable.<Object>of(discussionId);
  }


  public WebLogs conversationId(Object conversationId) {
    this.conversationId = JsonNullable.<Object>of(conversationId);
    
    return this;
  }

   /**
   * Identifies the conversation if the request is for a conversation.
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConversationId() {
        return conversationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConversationId_JsonNullable() {
    return conversationId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  public void setConversationId_JsonNullable(JsonNullable<Object> conversationId) {
    this.conversationId = conversationId;
  }

  public void setConversationId(Object conversationId) {
    this.conversationId = JsonNullable.<Object>of(conversationId);
  }


  public WebLogs assignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
    
    return this;
  }

   /**
   * Identifies the assignment if the request is for an assignment.
   * @return assignmentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssignmentId() {
        return assignmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssignmentId_JsonNullable() {
    return assignmentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  public void setAssignmentId_JsonNullable(JsonNullable<Object> assignmentId) {
    this.assignmentId = assignmentId;
  }

  public void setAssignmentId(Object assignmentId) {
    this.assignmentId = JsonNullable.<Object>of(assignmentId);
  }


  public WebLogs url(Object url) {
    
    this.url = url;
    return this;
  }

   /**
   * The path and the query string components of the requested URL.
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(Object url) {
    this.url = url;
  }


  public WebLogs userAgentId(Object userAgentId) {
    this.userAgentId = JsonNullable.<Object>of(userAgentId);
    
    return this;
  }

   /**
   * Foreign key linking to the user_agent table. User agent, as the header received from the user&#39;s browser/client software, will be available in the user_agent table once exposed.
   * @return userAgentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserAgentId() {
        return userAgentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserAgentId_JsonNullable() {
    return userAgentId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_AGENT_ID)
  public void setUserAgentId_JsonNullable(JsonNullable<Object> userAgentId) {
    this.userAgentId = userAgentId;
  }

  public void setUserAgentId(Object userAgentId) {
    this.userAgentId = JsonNullable.<Object>of(userAgentId);
  }


  public WebLogs httpMethod(HttpMethodEnum httpMethod) {
    
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * HTTP method/verb (GET, POST, PUT, etc.) that was sent with the request.
   * @return httpMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HttpMethodEnum getHttpMethod() {
    return httpMethod;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHttpMethod(HttpMethodEnum httpMethod) {
    this.httpMethod = httpMethod;
  }


  public WebLogs httpStatus(HttpStatusEnum httpStatus) {
    
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * HTTP status code of the request (e.g. 200 OK).
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HttpStatusEnum getHttpStatus() {
    return httpStatus;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHttpStatus(HttpStatusEnum httpStatus) {
    this.httpStatus = httpStatus;
  }


  public WebLogs httpVersion(HttpVersionEnum httpVersion) {
    
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * HTTP protocol version (e.g. HTTP/2.0).
   * @return httpVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HttpVersionEnum getHttpVersion() {
    return httpVersion;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHttpVersion(HttpVersionEnum httpVersion) {
    this.httpVersion = httpVersion;
  }


  public WebLogs remoteIp(WebLogsRemoteIp remoteIp) {
    
    this.remoteIp = remoteIp;
    return this;
  }

   /**
   * Get remoteIp
   * @return remoteIp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REMOTE_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WebLogsRemoteIp getRemoteIp() {
    return remoteIp;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemoteIp(WebLogsRemoteIp remoteIp) {
    this.remoteIp = remoteIp;
  }


  public WebLogs interactionMicros(Object interactionMicros) {
    
    this.interactionMicros = interactionMicros;
    return this;
  }

   /**
   * Total time required to service the request in microseconds.
   * @return interactionMicros
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERACTION_MICROS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getInteractionMicros() {
    return interactionMicros;
  }


  @JsonProperty(JSON_PROPERTY_INTERACTION_MICROS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInteractionMicros(Object interactionMicros) {
    this.interactionMicros = interactionMicros;
  }


  public WebLogs webApplicationController(WebApplicationControllerEnum webApplicationController) {
    this.webApplicationController = JsonNullable.<WebApplicationControllerEnum>of(webApplicationController);
    
    return this;
  }

   /**
   * The controller that the Canvas web application used to service this request.
   * @return webApplicationController
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WebApplicationControllerEnum getWebApplicationController() {
        return webApplicationController.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_CONTROLLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WebApplicationControllerEnum> getWebApplicationController_JsonNullable() {
    return webApplicationController;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_CONTROLLER)
  public void setWebApplicationController_JsonNullable(JsonNullable<WebApplicationControllerEnum> webApplicationController) {
    this.webApplicationController = webApplicationController;
  }

  public void setWebApplicationController(WebApplicationControllerEnum webApplicationController) {
    this.webApplicationController = JsonNullable.<WebApplicationControllerEnum>of(webApplicationController);
  }


  public WebLogs webApplicationAction(WebApplicationActionEnum webApplicationAction) {
    this.webApplicationAction = JsonNullable.<WebApplicationActionEnum>of(webApplicationAction);
    
    return this;
  }

   /**
   * The action in the Canvas web application used to service this request.
   * @return webApplicationAction
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WebApplicationActionEnum getWebApplicationAction() {
        return webApplicationAction.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WebApplicationActionEnum> getWebApplicationAction_JsonNullable() {
    return webApplicationAction;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_ACTION)
  public void setWebApplicationAction_JsonNullable(JsonNullable<WebApplicationActionEnum> webApplicationAction) {
    this.webApplicationAction = webApplicationAction;
  }

  public void setWebApplicationAction(WebApplicationActionEnum webApplicationAction) {
    this.webApplicationAction = JsonNullable.<WebApplicationActionEnum>of(webApplicationAction);
  }


  public WebLogs webApplicationContextType(WebApplicationContextTypeEnum webApplicationContextType) {
    this.webApplicationContextType = JsonNullable.<WebApplicationContextTypeEnum>of(webApplicationContextType);
    
    return this;
  }

   /**
   * Containing object type that the Canvas web application used to service this request.
   * @return webApplicationContextType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WebApplicationContextTypeEnum getWebApplicationContextType() {
        return webApplicationContextType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WebApplicationContextTypeEnum> getWebApplicationContextType_JsonNullable() {
    return webApplicationContextType;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_CONTEXT_TYPE)
  public void setWebApplicationContextType_JsonNullable(JsonNullable<WebApplicationContextTypeEnum> webApplicationContextType) {
    this.webApplicationContextType = webApplicationContextType;
  }

  public void setWebApplicationContextType(WebApplicationContextTypeEnum webApplicationContextType) {
    this.webApplicationContextType = JsonNullable.<WebApplicationContextTypeEnum>of(webApplicationContextType);
  }


  public WebLogs webApplicationContextId(Object webApplicationContextId) {
    this.webApplicationContextId = JsonNullable.<Object>of(webApplicationContextId);
    
    return this;
  }

   /**
   * Containing object ID that the Canvas web application used to service this request.
   * @return webApplicationContextId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWebApplicationContextId() {
        return webApplicationContextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWebApplicationContextId_JsonNullable() {
    return webApplicationContextId;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_APPLICATION_CONTEXT_ID)
  public void setWebApplicationContextId_JsonNullable(JsonNullable<Object> webApplicationContextId) {
    this.webApplicationContextId = webApplicationContextId;
  }

  public void setWebApplicationContextId(Object webApplicationContextId) {
    this.webApplicationContextId = JsonNullable.<Object>of(webApplicationContextId);
  }


  public WebLogs sessionId(Object sessionId) {
    this.sessionId = JsonNullable.<Object>of(sessionId);
    
    return this;
  }

   /**
   * ID of the user&#39;s session where this request was made.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSessionId() {
        return sessionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSessionId_JsonNullable() {
    return sessionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  public void setSessionId_JsonNullable(JsonNullable<Object> sessionId) {
    this.sessionId = sessionId;
  }

  public void setSessionId(Object sessionId) {
    this.sessionId = JsonNullable.<Object>of(sessionId);
  }


  public WebLogs developerKeyId(Object developerKeyId) {
    this.developerKeyId = JsonNullable.<Object>of(developerKeyId);
    
    return this;
  }

   /**
   * ID of the developer who accessed this resource if the request was made by a developer.
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


  public WebLogs participated(Object participated) {
    
    this.participated = participated;
    return this;
  }

   /**
   * Shows whether the HTTP request is considered a participation for the user.
   * @return participated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getParticipated() {
    return participated;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParticipated(Object participated) {
    this.participated = participated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebLogs webLogs = (WebLogs) o;
    return Objects.equals(this.id, webLogs.id) &&
        Objects.equals(this.timestamp, webLogs.timestamp) &&
        equalsNullable(this.userId, webLogs.userId) &&
        equalsNullable(this.realUserId, webLogs.realUserId) &&
        equalsNullable(this.courseId, webLogs.courseId) &&
        equalsNullable(this.quizId, webLogs.quizId) &&
        equalsNullable(this.discussionId, webLogs.discussionId) &&
        equalsNullable(this.conversationId, webLogs.conversationId) &&
        equalsNullable(this.assignmentId, webLogs.assignmentId) &&
        Objects.equals(this.url, webLogs.url) &&
        equalsNullable(this.userAgentId, webLogs.userAgentId) &&
        Objects.equals(this.httpMethod, webLogs.httpMethod) &&
        Objects.equals(this.httpStatus, webLogs.httpStatus) &&
        Objects.equals(this.httpVersion, webLogs.httpVersion) &&
        Objects.equals(this.remoteIp, webLogs.remoteIp) &&
        Objects.equals(this.interactionMicros, webLogs.interactionMicros) &&
        equalsNullable(this.webApplicationController, webLogs.webApplicationController) &&
        equalsNullable(this.webApplicationAction, webLogs.webApplicationAction) &&
        equalsNullable(this.webApplicationContextType, webLogs.webApplicationContextType) &&
        equalsNullable(this.webApplicationContextId, webLogs.webApplicationContextId) &&
        equalsNullable(this.sessionId, webLogs.sessionId) &&
        equalsNullable(this.developerKeyId, webLogs.developerKeyId) &&
        Objects.equals(this.participated, webLogs.participated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, hashCodeNullable(userId), hashCodeNullable(realUserId), hashCodeNullable(courseId), hashCodeNullable(quizId), hashCodeNullable(discussionId), hashCodeNullable(conversationId), hashCodeNullable(assignmentId), url, hashCodeNullable(userAgentId), httpMethod, httpStatus, httpVersion, remoteIp, interactionMicros, hashCodeNullable(webApplicationController), hashCodeNullable(webApplicationAction), hashCodeNullable(webApplicationContextType), hashCodeNullable(webApplicationContextId), hashCodeNullable(sessionId), hashCodeNullable(developerKeyId), participated);
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
    sb.append("class WebLogs {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    realUserId: ").append(toIndentedString(realUserId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    quizId: ").append(toIndentedString(quizId)).append("\n");
    sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userAgentId: ").append(toIndentedString(userAgentId)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    interactionMicros: ").append(toIndentedString(interactionMicros)).append("\n");
    sb.append("    webApplicationController: ").append(toIndentedString(webApplicationController)).append("\n");
    sb.append("    webApplicationAction: ").append(toIndentedString(webApplicationAction)).append("\n");
    sb.append("    webApplicationContextType: ").append(toIndentedString(webApplicationContextType)).append("\n");
    sb.append("    webApplicationContextId: ").append(toIndentedString(webApplicationContextId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    developerKeyId: ").append(toIndentedString(developerKeyId)).append("\n");
    sb.append("    participated: ").append(toIndentedString(participated)).append("\n");
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

