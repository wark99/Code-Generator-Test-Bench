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
 * TypeExtractedFromColumnAssignmentsTurnitinSettings
 */
@JsonPropertyOrder({
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_ORIGINALITY_REPORT_VISIBILITY,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_TYPE,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_VALUE,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_S_PAPER_CHECK,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_S_VIEW_REPORT,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_INTERNET_CHECK,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_JOURNAL_CHECK,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_EXCLUDE_BIBLIO,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_EXCLUDE_QUOTED,
  TypeExtractedFromColumnAssignmentsTurnitinSettings.JSON_PROPERTY_SUBMIT_PAPERS_TO
})
@JsonTypeName("Type_extracted_from_column__assignments_turnitin_settings__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TypeExtractedFromColumnAssignmentsTurnitinSettings {
  /**
   * Allows to set the timeframe when the report will become visible.
   */
  public enum OriginalityReportVisibilityEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    IMMEDIATE("immediate"),
    
    AFTER_GRADING("after_grading"),
    
    AFTER_DUE_DATE("after_due_date"),
    
    NEVER("never");

    private Object value;

    OriginalityReportVisibilityEnum(Object value) {
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
    public static OriginalityReportVisibilityEnum fromValue(Object value) {
      for (OriginalityReportVisibilityEnum b : OriginalityReportVisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ORIGINALITY_REPORT_VISIBILITY = "originality_report_visibility";
  private JsonNullable<OriginalityReportVisibilityEnum> originalityReportVisibility = JsonNullable.<OriginalityReportVisibilityEnum>of(null);

  /**
   * Exclude small sources from the Similarity Report by a set number of words or percentage.
   */
  public enum ExcludeSmallMatchesTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    OFF("off"),
    
    WORDS("words"),
    
    PERCENT("percent");

    private Object value;

    ExcludeSmallMatchesTypeEnum(Object value) {
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
    public static ExcludeSmallMatchesTypeEnum fromValue(Object value) {
      for (ExcludeSmallMatchesTypeEnum b : ExcludeSmallMatchesTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_TYPE = "exclude_small_matches_type";
  private JsonNullable<ExcludeSmallMatchesTypeEnum> excludeSmallMatchesType = JsonNullable.<ExcludeSmallMatchesTypeEnum>of(null);

  public static final String JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_VALUE = "exclude_small_matches_value";
  private JsonNullable<Object> excludeSmallMatchesValue = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_S_PAPER_CHECK = "s_paper_check";
  private JsonNullable<Object> sPaperCheck = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_S_VIEW_REPORT = "s_view_report";
  private JsonNullable<Object> sViewReport = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INTERNET_CHECK = "internet_check";
  private JsonNullable<Object> internetCheck = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_JOURNAL_CHECK = "journal_check";
  private JsonNullable<Object> journalCheck = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXCLUDE_BIBLIO = "exclude_biblio";
  private JsonNullable<Object> excludeBiblio = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXCLUDE_QUOTED = "exclude_quoted";
  private JsonNullable<Object> excludeQuoted = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUBMIT_PAPERS_TO = "submit_papers_to";
  private JsonNullable<Object> submitPapersTo = JsonNullable.<Object>of(null);

  public TypeExtractedFromColumnAssignmentsTurnitinSettings() {
  }

  public TypeExtractedFromColumnAssignmentsTurnitinSettings originalityReportVisibility(OriginalityReportVisibilityEnum originalityReportVisibility) {
    this.originalityReportVisibility = JsonNullable.<OriginalityReportVisibilityEnum>of(originalityReportVisibility);
    
    return this;
  }

   /**
   * Allows to set the timeframe when the report will become visible.
   * @return originalityReportVisibility
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OriginalityReportVisibilityEnum getOriginalityReportVisibility() {
        return originalityReportVisibility.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINALITY_REPORT_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OriginalityReportVisibilityEnum> getOriginalityReportVisibility_JsonNullable() {
    return originalityReportVisibility;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINALITY_REPORT_VISIBILITY)
  public void setOriginalityReportVisibility_JsonNullable(JsonNullable<OriginalityReportVisibilityEnum> originalityReportVisibility) {
    this.originalityReportVisibility = originalityReportVisibility;
  }

  public void setOriginalityReportVisibility(OriginalityReportVisibilityEnum originalityReportVisibility) {
    this.originalityReportVisibility = JsonNullable.<OriginalityReportVisibilityEnum>of(originalityReportVisibility);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings excludeSmallMatchesType(ExcludeSmallMatchesTypeEnum excludeSmallMatchesType) {
    this.excludeSmallMatchesType = JsonNullable.<ExcludeSmallMatchesTypeEnum>of(excludeSmallMatchesType);
    
    return this;
  }

   /**
   * Exclude small sources from the Similarity Report by a set number of words or percentage.
   * @return excludeSmallMatchesType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ExcludeSmallMatchesTypeEnum getExcludeSmallMatchesType() {
        return excludeSmallMatchesType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ExcludeSmallMatchesTypeEnum> getExcludeSmallMatchesType_JsonNullable() {
    return excludeSmallMatchesType;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_TYPE)
  public void setExcludeSmallMatchesType_JsonNullable(JsonNullable<ExcludeSmallMatchesTypeEnum> excludeSmallMatchesType) {
    this.excludeSmallMatchesType = excludeSmallMatchesType;
  }

  public void setExcludeSmallMatchesType(ExcludeSmallMatchesTypeEnum excludeSmallMatchesType) {
    this.excludeSmallMatchesType = JsonNullable.<ExcludeSmallMatchesTypeEnum>of(excludeSmallMatchesType);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings excludeSmallMatchesValue(Object excludeSmallMatchesValue) {
    this.excludeSmallMatchesValue = JsonNullable.<Object>of(excludeSmallMatchesValue);
    
    return this;
  }

   /**
   * If exclude_small_matches_type is set to percent or number then the value will be will be a number (of words or a percent).
   * @return excludeSmallMatchesValue
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExcludeSmallMatchesValue() {
        return excludeSmallMatchesValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExcludeSmallMatchesValue_JsonNullable() {
    return excludeSmallMatchesValue;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCLUDE_SMALL_MATCHES_VALUE)
  public void setExcludeSmallMatchesValue_JsonNullable(JsonNullable<Object> excludeSmallMatchesValue) {
    this.excludeSmallMatchesValue = excludeSmallMatchesValue;
  }

  public void setExcludeSmallMatchesValue(Object excludeSmallMatchesValue) {
    this.excludeSmallMatchesValue = JsonNullable.<Object>of(excludeSmallMatchesValue);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings sPaperCheck(Object sPaperCheck) {
    this.sPaperCheck = JsonNullable.<Object>of(sPaperCheck);
    
    return this;
  }

   /**
   * If set to TRUE, will allow to compare submission against other students&#39; papers.
   * @return sPaperCheck
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getsPaperCheck() {
        return sPaperCheck.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_S_PAPER_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getsPaperCheck_JsonNullable() {
    return sPaperCheck;
  }
  
  @JsonProperty(JSON_PROPERTY_S_PAPER_CHECK)
  public void setsPaperCheck_JsonNullable(JsonNullable<Object> sPaperCheck) {
    this.sPaperCheck = sPaperCheck;
  }

  public void setsPaperCheck(Object sPaperCheck) {
    this.sPaperCheck = JsonNullable.<Object>of(sPaperCheck);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings sViewReport(Object sViewReport) {
    this.sViewReport = JsonNullable.<Object>of(sViewReport);
    
    return this;
  }

   /**
   * If set to TRUE students will be able to access their originality report.
   * @return sViewReport
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getsViewReport() {
        return sViewReport.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_S_VIEW_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getsViewReport_JsonNullable() {
    return sViewReport;
  }
  
  @JsonProperty(JSON_PROPERTY_S_VIEW_REPORT)
  public void setsViewReport_JsonNullable(JsonNullable<Object> sViewReport) {
    this.sViewReport = sViewReport;
  }

  public void setsViewReport(Object sViewReport) {
    this.sViewReport = JsonNullable.<Object>of(sViewReport);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings internetCheck(Object internetCheck) {
    this.internetCheck = JsonNullable.<Object>of(internetCheck);
    
    return this;
  }

   /**
   * Select the content you&#39;d like to compare papers against: current and archived website content.
   * @return internetCheck
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getInternetCheck() {
        return internetCheck.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERNET_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getInternetCheck_JsonNullable() {
    return internetCheck;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERNET_CHECK)
  public void setInternetCheck_JsonNullable(JsonNullable<Object> internetCheck) {
    this.internetCheck = internetCheck;
  }

  public void setInternetCheck(Object internetCheck) {
    this.internetCheck = JsonNullable.<Object>of(internetCheck);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings journalCheck(Object journalCheck) {
    this.journalCheck = JsonNullable.<Object>of(journalCheck);
    
    return this;
  }

   /**
   * Select the content you&#39;d like to compare papers against: periodicals, journals and publications.
   * @return journalCheck
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getJournalCheck() {
        return journalCheck.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOURNAL_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getJournalCheck_JsonNullable() {
    return journalCheck;
  }
  
  @JsonProperty(JSON_PROPERTY_JOURNAL_CHECK)
  public void setJournalCheck_JsonNullable(JsonNullable<Object> journalCheck) {
    this.journalCheck = journalCheck;
  }

  public void setJournalCheck(Object journalCheck) {
    this.journalCheck = JsonNullable.<Object>of(journalCheck);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings excludeBiblio(Object excludeBiblio) {
    this.excludeBiblio = JsonNullable.<Object>of(excludeBiblio);
    
    return this;
  }

   /**
   * Selecting this option will exclude text appearing in the bibliography, works cited, or references sections of student papers from being checked for matches when generating Similarity Reports.
   * @return excludeBiblio
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExcludeBiblio() {
        return excludeBiblio.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE_BIBLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExcludeBiblio_JsonNullable() {
    return excludeBiblio;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCLUDE_BIBLIO)
  public void setExcludeBiblio_JsonNullable(JsonNullable<Object> excludeBiblio) {
    this.excludeBiblio = excludeBiblio;
  }

  public void setExcludeBiblio(Object excludeBiblio) {
    this.excludeBiblio = JsonNullable.<Object>of(excludeBiblio);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings excludeQuoted(Object excludeQuoted) {
    this.excludeQuoted = JsonNullable.<Object>of(excludeQuoted);
    
    return this;
  }

   /**
   * Selecting this option will exclude text appearing in the bibliography, works cited, or references sections of student papers from being checked for matches when generating Similarity Reports.
   * @return excludeQuoted
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExcludeQuoted() {
        return excludeQuoted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE_QUOTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExcludeQuoted_JsonNullable() {
    return excludeQuoted;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCLUDE_QUOTED)
  public void setExcludeQuoted_JsonNullable(JsonNullable<Object> excludeQuoted) {
    this.excludeQuoted = excludeQuoted;
  }

  public void setExcludeQuoted(Object excludeQuoted) {
    this.excludeQuoted = JsonNullable.<Object>of(excludeQuoted);
  }


  public TypeExtractedFromColumnAssignmentsTurnitinSettings submitPapersTo(Object submitPapersTo) {
    this.submitPapersTo = JsonNullable.<Object>of(submitPapersTo);
    
    return this;
  }

   /**
   * If set to FALSE, a similarity report will still be generated for paper submissions but students&#39; papers will not be stored in the Turnitin standard paper repository or the institution&#39;s paper repository for future comparison.
   * @return submitPapersTo
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmitPapersTo() {
        return submitPapersTo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMIT_PAPERS_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmitPapersTo_JsonNullable() {
    return submitPapersTo;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMIT_PAPERS_TO)
  public void setSubmitPapersTo_JsonNullable(JsonNullable<Object> submitPapersTo) {
    this.submitPapersTo = submitPapersTo;
  }

  public void setSubmitPapersTo(Object submitPapersTo) {
    this.submitPapersTo = JsonNullable.<Object>of(submitPapersTo);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeExtractedFromColumnAssignmentsTurnitinSettings typeExtractedFromColumnAssignmentsTurnitinSettings = (TypeExtractedFromColumnAssignmentsTurnitinSettings) o;
    return equalsNullable(this.originalityReportVisibility, typeExtractedFromColumnAssignmentsTurnitinSettings.originalityReportVisibility) &&
        equalsNullable(this.excludeSmallMatchesType, typeExtractedFromColumnAssignmentsTurnitinSettings.excludeSmallMatchesType) &&
        equalsNullable(this.excludeSmallMatchesValue, typeExtractedFromColumnAssignmentsTurnitinSettings.excludeSmallMatchesValue) &&
        equalsNullable(this.sPaperCheck, typeExtractedFromColumnAssignmentsTurnitinSettings.sPaperCheck) &&
        equalsNullable(this.sViewReport, typeExtractedFromColumnAssignmentsTurnitinSettings.sViewReport) &&
        equalsNullable(this.internetCheck, typeExtractedFromColumnAssignmentsTurnitinSettings.internetCheck) &&
        equalsNullable(this.journalCheck, typeExtractedFromColumnAssignmentsTurnitinSettings.journalCheck) &&
        equalsNullable(this.excludeBiblio, typeExtractedFromColumnAssignmentsTurnitinSettings.excludeBiblio) &&
        equalsNullable(this.excludeQuoted, typeExtractedFromColumnAssignmentsTurnitinSettings.excludeQuoted) &&
        equalsNullable(this.submitPapersTo, typeExtractedFromColumnAssignmentsTurnitinSettings.submitPapersTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(originalityReportVisibility), hashCodeNullable(excludeSmallMatchesType), hashCodeNullable(excludeSmallMatchesValue), hashCodeNullable(sPaperCheck), hashCodeNullable(sViewReport), hashCodeNullable(internetCheck), hashCodeNullable(journalCheck), hashCodeNullable(excludeBiblio), hashCodeNullable(excludeQuoted), hashCodeNullable(submitPapersTo));
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
    sb.append("class TypeExtractedFromColumnAssignmentsTurnitinSettings {\n");
    sb.append("    originalityReportVisibility: ").append(toIndentedString(originalityReportVisibility)).append("\n");
    sb.append("    excludeSmallMatchesType: ").append(toIndentedString(excludeSmallMatchesType)).append("\n");
    sb.append("    excludeSmallMatchesValue: ").append(toIndentedString(excludeSmallMatchesValue)).append("\n");
    sb.append("    sPaperCheck: ").append(toIndentedString(sPaperCheck)).append("\n");
    sb.append("    sViewReport: ").append(toIndentedString(sViewReport)).append("\n");
    sb.append("    internetCheck: ").append(toIndentedString(internetCheck)).append("\n");
    sb.append("    journalCheck: ").append(toIndentedString(journalCheck)).append("\n");
    sb.append("    excludeBiblio: ").append(toIndentedString(excludeBiblio)).append("\n");
    sb.append("    excludeQuoted: ").append(toIndentedString(excludeQuoted)).append("\n");
    sb.append("    submitPapersTo: ").append(toIndentedString(submitPapersTo)).append("\n");
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

