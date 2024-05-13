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
import org.openapitools.client.model.LtiLineItemsExtensions;
import org.openapitools.client.model.LtiLineItemsLabel;
import org.openapitools.client.model.LtiLineItemsResourceId;
import org.openapitools.client.model.LtiLineItemsTag;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LTI 1.3 tools that have been authorized by an admin may manage this table.  See [Learning Tools Interoperability (LTI) Assignment and Grade Services Specification](https://www.imsglobal.org/spec/lti-ags/v2p0#line-item-service).
 */
@JsonPropertyOrder({
  LtiLineItems.JSON_PROPERTY_ID,
  LtiLineItems.JSON_PROPERTY_CREATED_AT,
  LtiLineItems.JSON_PROPERTY_UPDATED_AT,
  LtiLineItems.JSON_PROPERTY_WORKFLOW_STATE,
  LtiLineItems.JSON_PROPERTY_ASSIGNMENT_ID,
  LtiLineItems.JSON_PROPERTY_CLIENT_ID,
  LtiLineItems.JSON_PROPERTY_COUPLED,
  LtiLineItems.JSON_PROPERTY_SCORE_MAXIMUM,
  LtiLineItems.JSON_PROPERTY_RESOURCE_ID,
  LtiLineItems.JSON_PROPERTY_LTI_RESOURCE_LINK_ID,
  LtiLineItems.JSON_PROPERTY_LABEL,
  LtiLineItems.JSON_PROPERTY_EXTENSIONS,
  LtiLineItems.JSON_PROPERTY_TAG
})
@JsonTypeName("lti_line_items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LtiLineItems {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  /**
   * The workflow state of the line item.
   */
  public enum WorkflowStateEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    ACTIVE("active"),
    
    DELETED("deleted");

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

  public static final String JSON_PROPERTY_ASSIGNMENT_ID = "assignment_id";
  private Object assignmentId = null;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private Object clientId = null;

  public static final String JSON_PROPERTY_COUPLED = "coupled";
  private Object coupled = null;

  public static final String JSON_PROPERTY_SCORE_MAXIMUM = "score_maximum";
  private Object scoreMaximum = null;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private LtiLineItemsResourceId resourceId;

  public static final String JSON_PROPERTY_LTI_RESOURCE_LINK_ID = "lti_resource_link_id";
  private JsonNullable<Object> ltiResourceLinkId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LABEL = "label";
  private LtiLineItemsLabel label;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private LtiLineItemsExtensions extensions;

  public static final String JSON_PROPERTY_TAG = "tag";
  private LtiLineItemsTag tag;

  public LtiLineItems() {
  }

  public LtiLineItems id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for an lti line item record.
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


  public LtiLineItems createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when a lti_line_items record was created.
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


  public LtiLineItems updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when a lti_line_items record was updated.
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


  public LtiLineItems workflowState(WorkflowStateEnum workflowState) {
    
    this.workflowState = workflowState;
    return this;
  }

   /**
   * The workflow state of the line item.
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


  public LtiLineItems assignmentId(Object assignmentId) {
    
    this.assignmentId = assignmentId;
    return this;
  }

   /**
   * The ID of the assignment associated with the line item.
   * @return assignmentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAssignmentId() {
    return assignmentId;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignmentId(Object assignmentId) {
    this.assignmentId = assignmentId;
  }


  public LtiLineItems clientId(Object clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The client ID used to create the line item (developer key global id).
   * @return clientId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(Object clientId) {
    this.clientId = clientId;
  }


  public LtiLineItems coupled(Object coupled) {
    
    this.coupled = coupled;
    return this;
  }

   /**
   * True if the line item is the default one created when a user created an assignment; false if the line item was created via the API (regardless if it is the default line item or not).
   * @return coupled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUPLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCoupled() {
    return coupled;
  }


  @JsonProperty(JSON_PROPERTY_COUPLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoupled(Object coupled) {
    this.coupled = coupled;
  }


  public LtiLineItems scoreMaximum(Object scoreMaximum) {
    
    this.scoreMaximum = scoreMaximum;
    return this;
  }

   /**
   * The maximum score for the line item.
   * @return scoreMaximum
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getScoreMaximum() {
    return scoreMaximum;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScoreMaximum(Object scoreMaximum) {
    this.scoreMaximum = scoreMaximum;
  }


  public LtiLineItems resourceId(LtiLineItemsResourceId resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LtiLineItemsResourceId getResourceId() {
    return resourceId;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceId(LtiLineItemsResourceId resourceId) {
    this.resourceId = resourceId;
  }


  public LtiLineItems ltiResourceLinkId(Object ltiResourceLinkId) {
    this.ltiResourceLinkId = JsonNullable.<Object>of(ltiResourceLinkId);
    
    return this;
  }

   /**
   * The resource link ID associated with the line item. This ID matches the associated assignments \&quot;lti_context_id\&quot;.
   * @return ltiResourceLinkId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLtiResourceLinkId() {
        return ltiResourceLinkId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LTI_RESOURCE_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLtiResourceLinkId_JsonNullable() {
    return ltiResourceLinkId;
  }
  
  @JsonProperty(JSON_PROPERTY_LTI_RESOURCE_LINK_ID)
  public void setLtiResourceLinkId_JsonNullable(JsonNullable<Object> ltiResourceLinkId) {
    this.ltiResourceLinkId = ltiResourceLinkId;
  }

  public void setLtiResourceLinkId(Object ltiResourceLinkId) {
    this.ltiResourceLinkId = JsonNullable.<Object>of(ltiResourceLinkId);
  }


  public LtiLineItems label(LtiLineItemsLabel label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LtiLineItemsLabel getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(LtiLineItemsLabel label) {
    this.label = label;
  }


  public LtiLineItems extensions(LtiLineItemsExtensions extensions) {
    
    this.extensions = extensions;
    return this;
  }

   /**
   * Get extensions
   * @return extensions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LtiLineItemsExtensions getExtensions() {
    return extensions;
  }


  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExtensions(LtiLineItemsExtensions extensions) {
    this.extensions = extensions;
  }


  public LtiLineItems tag(LtiLineItemsTag tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LtiLineItemsTag getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(LtiLineItemsTag tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtiLineItems ltiLineItems = (LtiLineItems) o;
    return Objects.equals(this.id, ltiLineItems.id) &&
        Objects.equals(this.createdAt, ltiLineItems.createdAt) &&
        Objects.equals(this.updatedAt, ltiLineItems.updatedAt) &&
        Objects.equals(this.workflowState, ltiLineItems.workflowState) &&
        Objects.equals(this.assignmentId, ltiLineItems.assignmentId) &&
        Objects.equals(this.clientId, ltiLineItems.clientId) &&
        Objects.equals(this.coupled, ltiLineItems.coupled) &&
        Objects.equals(this.scoreMaximum, ltiLineItems.scoreMaximum) &&
        Objects.equals(this.resourceId, ltiLineItems.resourceId) &&
        equalsNullable(this.ltiResourceLinkId, ltiLineItems.ltiResourceLinkId) &&
        Objects.equals(this.label, ltiLineItems.label) &&
        Objects.equals(this.extensions, ltiLineItems.extensions) &&
        Objects.equals(this.tag, ltiLineItems.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, workflowState, assignmentId, clientId, coupled, scoreMaximum, resourceId, hashCodeNullable(ltiResourceLinkId), label, extensions, tag);
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
    sb.append("class LtiLineItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    coupled: ").append(toIndentedString(coupled)).append("\n");
    sb.append("    scoreMaximum: ").append(toIndentedString(scoreMaximum)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    ltiResourceLinkId: ").append(toIndentedString(ltiResourceLinkId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

