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
import org.openapitools.client.model.CompleteIncrementalJob;
import org.openapitools.client.model.CompleteSnapshotJob;
import org.openapitools.client.model.FailedJob;
import org.openapitools.client.model.ProcessingError;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * JobIdGet200Response
 */
@JsonPropertyOrder({
  JobIdGet200Response.JSON_PROPERTY_ID,
  JobIdGet200Response.JSON_PROPERTY_STATUS,
  JobIdGet200Response.JSON_PROPERTY_EXPIRES_AT,
  JobIdGet200Response.JSON_PROPERTY_OBJECTS,
  JobIdGet200Response.JSON_PROPERTY_SCHEMA_VERSION,
  JobIdGet200Response.JSON_PROPERTY_AT,
  JobIdGet200Response.JSON_PROPERTY_SINCE,
  JobIdGet200Response.JSON_PROPERTY_UNTIL,
  JobIdGet200Response.JSON_PROPERTY_ERROR
})
@JsonTypeName("_job__id__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class JobIdGet200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  /**
   * The current status of the job.
   */
  public enum StatusEnum {
    WAITING("waiting"),
    
    RUNNING("running"),
    
    COMPLETE("complete"),
    
    FAILED("failed");

    private Object value;

    StatusEnum(Object value) {
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
    public static StatusEnum fromValue(Object value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status = null;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<Object> expiresAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_OBJECTS = "objects";
  private Object objects = null;

  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema_version";
  private Object schemaVersion = null;

  public static final String JSON_PROPERTY_AT = "at";
  private Object at = null;

  public static final String JSON_PROPERTY_SINCE = "since";
  private Object since = null;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private Object until = null;

  public static final String JSON_PROPERTY_ERROR = "error";
  private ProcessingError error;

  public JobIdGet200Response() {
  }

  public JobIdGet200Response id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Opaque unique identifier of the job.
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


  public JobIdGet200Response status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the job.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public JobIdGet200Response expiresAt(Object expiresAt) {
    this.expiresAt = JsonNullable.<Object>of(expiresAt);
    
    return this;
  }

   /**
   * The time when job will no longer be available.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExpiresAt() {
        return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExpiresAt_JsonNullable() {
    return expiresAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  public void setExpiresAt_JsonNullable(JsonNullable<Object> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setExpiresAt(Object expiresAt) {
    this.expiresAt = JsonNullable.<Object>of(expiresAt);
  }


  public JobIdGet200Response objects(Object objects) {
    
    this.objects = objects;
    return this;
  }

   /**
   * The list of objects generated by the job.
   * @return objects
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getObjects() {
    return objects;
  }


  @JsonProperty(JSON_PROPERTY_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjects(Object objects) {
    this.objects = objects;
  }


  public JobIdGet200Response schemaVersion(Object schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Version of the schema that records in the table conform to.
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSchemaVersion() {
    return schemaVersion;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemaVersion(Object schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public JobIdGet200Response at(Object at) {
    
    this.at = at;
    return this;
  }

   /**
   * Timestamp (in UTC) that identifies the table state. This can be used as a starting point for future incremental queries.
   * @return at
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAt() {
    return at;
  }


  @JsonProperty(JSON_PROPERTY_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAt(Object at) {
    this.at = at;
  }


  public JobIdGet200Response since(Object since) {
    
    this.since = since;
    return this;
  }

   /**
   * Start timestamp (in UTC); only those records are returned that have been persisted since the specified date and time.
   * @return since
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSince() {
    return since;
  }


  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSince(Object since) {
    this.since = since;
  }


  public JobIdGet200Response until(Object until) {
    
    this.until = until;
    return this;
  }

   /**
   * End timestamp (in UTC); only those records are returned that have been persisted before the specified date and time. This can be used as a starting point for future incremental queries.
   * @return until
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUntil() {
    return until;
  }


  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUntil(Object until) {
    this.until = until;
  }


  public JobIdGet200Response error(ProcessingError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Provides more details on the error that occurred.
   * @return error
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProcessingError getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(ProcessingError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobIdGet200Response jobIdGet200Response = (JobIdGet200Response) o;
    return Objects.equals(this.id, jobIdGet200Response.id) &&
        Objects.equals(this.status, jobIdGet200Response.status) &&
        equalsNullable(this.expiresAt, jobIdGet200Response.expiresAt) &&
        Objects.equals(this.objects, jobIdGet200Response.objects) &&
        Objects.equals(this.schemaVersion, jobIdGet200Response.schemaVersion) &&
        Objects.equals(this.at, jobIdGet200Response.at) &&
        Objects.equals(this.since, jobIdGet200Response.since) &&
        Objects.equals(this.until, jobIdGet200Response.until) &&
        Objects.equals(this.error, jobIdGet200Response.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, hashCodeNullable(expiresAt), objects, schemaVersion, at, since, until, error);
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
    sb.append("class JobIdGet200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

