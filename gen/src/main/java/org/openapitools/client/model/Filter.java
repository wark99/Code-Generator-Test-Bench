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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * (This feature is not currently implemented.)  Filter encompasses column-level (&#x60;select&#x60;) and row-level (&#x60;where&#x60;) filters.  Column-level filters allow clients to include only those columns in the output they are interested in. Row-level filters let clients specify a condition that is applied to each record; if the condition is true, the record is included in the output, otherwise omitted. Row-level filters are inspired by the [where argument](https://hasura.io/docs/latest/queries/postgres/query-filters/#the-where-argument) in Hasura.  Consider a table with the following columns:  * &#x60;family_name&#x60; of type &#x60;string&#x60;, * &#x60;given_name&#x60; of type &#x60;string&#x60;, * &#x60;birth_date&#x60; of type &#x60;datetime&#x60;, * &#x60;height&#x60; of type &#x60;number&#x60;, representing a person&#39;s height in meters, * &#x60;status&#x60;, which is an enumeration that can take the values &#x60;active&#x60;, &#x60;inactive&#x60;, &#x60;pending&#x60;.  Include only those people whose family name is &#x60;Smith&#x60;:  &#x60;&#x60;&#x60;json { \&quot;family_name\&quot;: { \&quot;_eq\&quot;: \&quot;Smith\&quot; } } &#x60;&#x60;&#x60;  Return people born in the 21st century:  &#x60;&#x60;&#x60;json { \&quot;birth_date\&quot;: { \&quot;_gte\&quot;: \&quot;2001-01-01\&quot; } } &#x60;&#x60;&#x60;  Include only those people whose height is between 1.6 and 1.7 meters:  &#x60;&#x60;&#x60;json { \&quot;height\&quot;: { \&quot;_gt\&quot;: 1.6, \&quot;_lt\&quot;: 1.7 } } &#x60;&#x60;&#x60;  Return people whose status is &#x60;active&#x60; or &#x60;pending&#x60;:  &#x60;&#x60;&#x60;json { \&quot;status\&quot;: { \&quot;_in\&quot;: [\&quot;active\&quot;, \&quot;pending\&quot;] } } &#x60;&#x60;&#x60;  Find people whose family name is &#x60;Smith&#x60; and given name starts with &#x60;L&#x60; or &#x60;K&#x60;:  &#x60;&#x60;&#x60;json { \&quot;family_name\&quot;: { \&quot;_eq\&quot;: \&quot;Smith\&quot; }, \&quot;given_name\&quot;: { \&quot;_match\&quot;: \&quot;^[LK]\&quot; } } &#x60;&#x60;&#x60;  Find people whose family name is &#x60;Smith&#x60; *or* whose given name starts with &#x60;L&#x60; or &#x60;K&#x60;:  &#x60;&#x60;&#x60;json { \&quot;_or\&quot;: [     { \&quot;family_name\&quot;: { \&quot;_eq\&quot;: \&quot;Smith\&quot; } },     { \&quot;given_name\&quot;: { \&quot;_match\&quot;: \&quot;^[LK]\&quot; } } ] } &#x60;&#x60;&#x60;  The type of the value matched in the condition must be compatible with the type of the column.  The following operators are generally available for all types:  * &#x60;_eq&#x60; (equal to) * &#x60;_neq&#x60; (not equal to)  Comparison operators for strings:  * &#x60;_match&#x60; (value matches regular expression)  Comparison operators for numbers, dates and timestamps:  * &#x60;_gt&#x60; (greater than) * &#x60;_lt&#x60; (less than) * &#x60;_gte&#x60; (greater than or equal to) * &#x60;_lte&#x60; (less than or equal to)  Comparison operators for enumerations:  * &#x60;_in&#x60; (value in set of values) * &#x60;_nin&#x60; (value not in set of values)  Operators to build composite Boolean expressions:  * &#x60;_and&#x60; * &#x60;_or&#x60; * &#x60;_not&#x60;
 */
@JsonPropertyOrder({
  Filter.JSON_PROPERTY_SELECT,
  Filter.JSON_PROPERTY_WHERE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Filter {
  public static final String JSON_PROPERTY_SELECT = "select";
  private List<String> select;

  public static final String JSON_PROPERTY_WHERE = "where";
  private Object where;

  public Filter() {
  }

  public Filter select(List<String> select) {
    
    this.select = select;
    return this;
  }

  public Filter addSelectItem(String selectItem) {
    if (this.select == null) {
      this.select = new ArrayList<>();
    }
    this.select.add(selectItem);
    return this;
  }

   /**
   * A list of column names to include in the data set returned; other columns are excluded. If omitted, return all columns.
   * @return select
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSelect() {
    return select;
  }


  @JsonProperty(JSON_PROPERTY_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelect(List<String> select) {
    this.select = select;
  }


  public Filter where(Object where) {
    
    this.where = where;
    return this;
  }

   /**
   * A filter condition to apply to records; only records that meet the condition are included. If omitted, return all records.
   * @return where
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHERE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getWhere() {
    return where;
  }


  @JsonProperty(JSON_PROPERTY_WHERE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhere(Object where) {
    this.where = where;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.select, filter.select) &&
        Objects.equals(this.where, filter.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(select, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

