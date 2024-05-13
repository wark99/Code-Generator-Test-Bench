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
 * MasterCoursesMigrationResults
 */
@JsonPropertyOrder({
  MasterCoursesMigrationResults.JSON_PROPERTY_ID,
  MasterCoursesMigrationResults.JSON_PROPERTY_STATE,
  MasterCoursesMigrationResults.JSON_PROPERTY_CHILD_SUBSCRIPTION_ID,
  MasterCoursesMigrationResults.JSON_PROPERTY_MASTER_MIGRATION_ID,
  MasterCoursesMigrationResults.JSON_PROPERTY_CONTENT_MIGRATION_ID,
  MasterCoursesMigrationResults.JSON_PROPERTY_IMPORT_TYPE,
  MasterCoursesMigrationResults.JSON_PROPERTY_RESULTS
})
@JsonTypeName("master_courses_migration_results")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MasterCoursesMigrationResults {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  /**
   * The state of the import into the associated course (&#x60;failed&#x60;, &#x60;completed&#x60; or &#x60;queued&#x60;).
   */
  public enum StateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    FAILED("failed"),
    
    COMPLETED("completed"),
    
    QUEUED("queued");

    private Object value;

    StateEnum(Object value) {
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
    public static StateEnum fromValue(Object value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state = null;

  public static final String JSON_PROPERTY_CHILD_SUBSCRIPTION_ID = "child_subscription_id";
  private Object childSubscriptionId = null;

  public static final String JSON_PROPERTY_MASTER_MIGRATION_ID = "master_migration_id";
  private Object masterMigrationId = null;

  public static final String JSON_PROPERTY_CONTENT_MIGRATION_ID = "content_migration_id";
  private Object contentMigrationId = null;

  /**
   * Whether the blueprint export was for the entire course (&#x60;full&#x60;) or a partial (&#x60;selective&#x60;).
   */
  public enum ImportTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    FULL("full"),
    
    SELECTIVE("selective");

    private Object value;

    ImportTypeEnum(Object value) {
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
    public static ImportTypeEnum fromValue(Object value) {
      for (ImportTypeEnum b : ImportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_IMPORT_TYPE = "import_type";
  private ImportTypeEnum importType = null;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private JsonNullable<Object> results = JsonNullable.<Object>of(null);

  public MasterCoursesMigrationResults() {
  }

  public MasterCoursesMigrationResults id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a master courses migration result record.
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


  public MasterCoursesMigrationResults state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the import into the associated course (&#x60;failed&#x60;, &#x60;completed&#x60; or &#x60;queued&#x60;).
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  public MasterCoursesMigrationResults childSubscriptionId(Object childSubscriptionId) {
    
    this.childSubscriptionId = childSubscriptionId;
    return this;
  }

   /**
   * The ID of a relevant associated course subscription record.
   * @return childSubscriptionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getChildSubscriptionId() {
    return childSubscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_CHILD_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChildSubscriptionId(Object childSubscriptionId) {
    this.childSubscriptionId = childSubscriptionId;
  }


  public MasterCoursesMigrationResults masterMigrationId(Object masterMigrationId) {
    
    this.masterMigrationId = masterMigrationId;
    return this;
  }

   /**
   * The ID of a relevant blueprint migration record (sync event).
   * @return masterMigrationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_MIGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMasterMigrationId() {
    return masterMigrationId;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_MIGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMasterMigrationId(Object masterMigrationId) {
    this.masterMigrationId = masterMigrationId;
  }


  public MasterCoursesMigrationResults contentMigrationId(Object contentMigrationId) {
    
    this.contentMigrationId = contentMigrationId;
    return this;
  }

   /**
   * The ID of a relevant import record on the associated course.
   * @return contentMigrationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_MIGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getContentMigrationId() {
    return contentMigrationId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_MIGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentMigrationId(Object contentMigrationId) {
    this.contentMigrationId = contentMigrationId;
  }


  public MasterCoursesMigrationResults importType(ImportTypeEnum importType) {
    
    this.importType = importType;
    return this;
  }

   /**
   * Whether the blueprint export was for the entire course (&#x60;full&#x60;) or a partial (&#x60;selective&#x60;).
   * @return importType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ImportTypeEnum getImportType() {
    return importType;
  }


  @JsonProperty(JSON_PROPERTY_IMPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImportType(ImportTypeEnum importType) {
    this.importType = importType;
  }


  public MasterCoursesMigrationResults results(Object results) {
    this.results = JsonNullable.<Object>of(results);
    
    return this;
  }

   /**
   * Relevant results of the import (e.g. items that were not synced because they were modified by the associated course).
   * @return results
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getResults() {
        return results.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getResults_JsonNullable() {
    return results;
  }
  
  @JsonProperty(JSON_PROPERTY_RESULTS)
  public void setResults_JsonNullable(JsonNullable<Object> results) {
    this.results = results;
  }

  public void setResults(Object results) {
    this.results = JsonNullable.<Object>of(results);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterCoursesMigrationResults masterCoursesMigrationResults = (MasterCoursesMigrationResults) o;
    return Objects.equals(this.id, masterCoursesMigrationResults.id) &&
        Objects.equals(this.state, masterCoursesMigrationResults.state) &&
        Objects.equals(this.childSubscriptionId, masterCoursesMigrationResults.childSubscriptionId) &&
        Objects.equals(this.masterMigrationId, masterCoursesMigrationResults.masterMigrationId) &&
        Objects.equals(this.contentMigrationId, masterCoursesMigrationResults.contentMigrationId) &&
        Objects.equals(this.importType, masterCoursesMigrationResults.importType) &&
        equalsNullable(this.results, masterCoursesMigrationResults.results);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, childSubscriptionId, masterMigrationId, contentMigrationId, importType, hashCodeNullable(results));
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
    sb.append("class MasterCoursesMigrationResults {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    childSubscriptionId: ").append(toIndentedString(childSubscriptionId)).append("\n");
    sb.append("    masterMigrationId: ").append(toIndentedString(masterMigrationId)).append("\n");
    sb.append("    contentMigrationId: ").append(toIndentedString(contentMigrationId)).append("\n");
    sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

