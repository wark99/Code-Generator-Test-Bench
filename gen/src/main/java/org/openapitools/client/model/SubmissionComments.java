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
import org.openapitools.client.model.SubmissionCommentsAttachmentIds;
import org.openapitools.client.model.SubmissionCommentsComment;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubmissionComments
 */
@JsonPropertyOrder({
  SubmissionComments.JSON_PROPERTY_ID,
  SubmissionComments.JSON_PROPERTY_COMMENT,
  SubmissionComments.JSON_PROPERTY_SUBMISSION_ID,
  SubmissionComments.JSON_PROPERTY_CREATED_AT,
  SubmissionComments.JSON_PROPERTY_UPDATED_AT,
  SubmissionComments.JSON_PROPERTY_CONTEXT_ID,
  SubmissionComments.JSON_PROPERTY_CONTEXT_TYPE,
  SubmissionComments.JSON_PROPERTY_AUTHOR_ID,
  SubmissionComments.JSON_PROPERTY_MEDIA_COMMENT_ID,
  SubmissionComments.JSON_PROPERTY_MEDIA_COMMENT_TYPE,
  SubmissionComments.JSON_PROPERTY_ATTACHMENT_IDS,
  SubmissionComments.JSON_PROPERTY_ATTEMPT,
  SubmissionComments.JSON_PROPERTY_HIDDEN,
  SubmissionComments.JSON_PROPERTY_AUTHOR_NAME,
  SubmissionComments.JSON_PROPERTY_GROUP_COMMENT_ID,
  SubmissionComments.JSON_PROPERTY_ASSESSMENT_REQUEST_ID,
  SubmissionComments.JSON_PROPERTY_ANONYMOUS,
  SubmissionComments.JSON_PROPERTY_TEACHER_ONLY_COMMENT,
  SubmissionComments.JSON_PROPERTY_PROVISIONAL_GRADE_ID,
  SubmissionComments.JSON_PROPERTY_DRAFT,
  SubmissionComments.JSON_PROPERTY_EDITED_AT
})
@JsonTypeName("submission_comments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SubmissionComments {
  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private SubmissionCommentsComment comment;

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submission_id";
  private JsonNullable<Object> submissionId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_CONTEXT_ID = "context_id";
  private JsonNullable<Object> contextId = JsonNullable.<Object>of(null);

  /**
   * The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60;.
   */
  public enum ContextTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    COURSE("Course");

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

  public static final String JSON_PROPERTY_AUTHOR_ID = "author_id";
  private JsonNullable<Object> authorId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MEDIA_COMMENT_ID = "media_comment_id";
  private JsonNullable<Object> mediaCommentId = JsonNullable.<Object>of(null);

  /**
   * For media comments, the type of the associated media object.
   */
  public enum MediaCommentTypeEnum {
    __DAP_UNSPECIFIED__("__dap_unspecified__"),
    
    AUDIO("audio"),
    
    VIDEO("video");

    private Object value;

    MediaCommentTypeEnum(Object value) {
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
    public static MediaCommentTypeEnum fromValue(Object value) {
      for (MediaCommentTypeEnum b : MediaCommentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_MEDIA_COMMENT_TYPE = "media_comment_type";
  private JsonNullable<MediaCommentTypeEnum> mediaCommentType = JsonNullable.<MediaCommentTypeEnum>of(null);

  public static final String JSON_PROPERTY_ATTACHMENT_IDS = "attachment_ids";
  private SubmissionCommentsAttachmentIds attachmentIds;

  public static final String JSON_PROPERTY_ATTEMPT = "attempt";
  private JsonNullable<Object> attempt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Object hidden = null;

  public static final String JSON_PROPERTY_AUTHOR_NAME = "author_name";
  private JsonNullable<Object> authorName = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_COMMENT_ID = "group_comment_id";
  private JsonNullable<Object> groupCommentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ASSESSMENT_REQUEST_ID = "assessment_request_id";
  private JsonNullable<Object> assessmentRequestId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ANONYMOUS = "anonymous";
  private JsonNullable<Object> anonymous = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEACHER_ONLY_COMMENT = "teacher_only_comment";
  private Object teacherOnlyComment = null;

  public static final String JSON_PROPERTY_PROVISIONAL_GRADE_ID = "provisional_grade_id";
  private JsonNullable<Object> provisionalGradeId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DRAFT = "draft";
  private Object draft = null;

  public static final String JSON_PROPERTY_EDITED_AT = "edited_at";
  private JsonNullable<Object> editedAt = JsonNullable.<Object>of(null);

  public SubmissionComments() {
  }

  public SubmissionComments id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of this submission comment.
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


  public SubmissionComments comment(SubmissionCommentsComment comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubmissionCommentsComment getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(SubmissionCommentsComment comment) {
    this.comment = comment;
  }


  public SubmissionComments submissionId(Object submissionId) {
    this.submissionId = JsonNullable.<Object>of(submissionId);
    
    return this;
  }

   /**
   * The ID of the associated submission.
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubmissionId() {
        return submissionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubmissionId_JsonNullable() {
    return submissionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  public void setSubmissionId_JsonNullable(JsonNullable<Object> submissionId) {
    this.submissionId = submissionId;
  }

  public void setSubmissionId(Object submissionId) {
    this.submissionId = JsonNullable.<Object>of(submissionId);
  }


  public SubmissionComments createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date this comment was created.
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


  public SubmissionComments updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date this comment was updated.
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


  public SubmissionComments contextId(Object contextId) {
    this.contextId = JsonNullable.<Object>of(contextId);
    
    return this;
  }

   /**
   * The ID of the course this comment is associated with.
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


  public SubmissionComments contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60;.
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


  public SubmissionComments authorId(Object authorId) {
    this.authorId = JsonNullable.<Object>of(authorId);
    
    return this;
  }

   /**
   * The ID of the commenting user.
   * @return authorId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAuthorId() {
        return authorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAuthorId_JsonNullable() {
    return authorId;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  public void setAuthorId_JsonNullable(JsonNullable<Object> authorId) {
    this.authorId = authorId;
  }

  public void setAuthorId(Object authorId) {
    this.authorId = JsonNullable.<Object>of(authorId);
  }


  public SubmissionComments mediaCommentId(Object mediaCommentId) {
    this.mediaCommentId = JsonNullable.<Object>of(mediaCommentId);
    
    return this;
  }

   /**
   * For media comments, the ID of the associated media object.
   * @return mediaCommentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMediaCommentId() {
        return mediaCommentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMediaCommentId_JsonNullable() {
    return mediaCommentId;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_ID)
  public void setMediaCommentId_JsonNullable(JsonNullable<Object> mediaCommentId) {
    this.mediaCommentId = mediaCommentId;
  }

  public void setMediaCommentId(Object mediaCommentId) {
    this.mediaCommentId = JsonNullable.<Object>of(mediaCommentId);
  }


  public SubmissionComments mediaCommentType(MediaCommentTypeEnum mediaCommentType) {
    this.mediaCommentType = JsonNullable.<MediaCommentTypeEnum>of(mediaCommentType);
    
    return this;
  }

   /**
   * For media comments, the type of the associated media object.
   * @return mediaCommentType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MediaCommentTypeEnum getMediaCommentType() {
        return mediaCommentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MediaCommentTypeEnum> getMediaCommentType_JsonNullable() {
    return mediaCommentType;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_COMMENT_TYPE)
  public void setMediaCommentType_JsonNullable(JsonNullable<MediaCommentTypeEnum> mediaCommentType) {
    this.mediaCommentType = mediaCommentType;
  }

  public void setMediaCommentType(MediaCommentTypeEnum mediaCommentType) {
    this.mediaCommentType = JsonNullable.<MediaCommentTypeEnum>of(mediaCommentType);
  }


  public SubmissionComments attachmentIds(SubmissionCommentsAttachmentIds attachmentIds) {
    
    this.attachmentIds = attachmentIds;
    return this;
  }

   /**
   * Get attachmentIds
   * @return attachmentIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubmissionCommentsAttachmentIds getAttachmentIds() {
    return attachmentIds;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentIds(SubmissionCommentsAttachmentIds attachmentIds) {
    this.attachmentIds = attachmentIds;
  }


  public SubmissionComments attempt(Object attempt) {
    this.attempt = JsonNullable.<Object>of(attempt);
    
    return this;
  }

   /**
   * The particular attempt (on the associated submission) that this comment pertains to.
   * @return attempt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAttempt() {
        return attempt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAttempt_JsonNullable() {
    return attempt;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTEMPT)
  public void setAttempt_JsonNullable(JsonNullable<Object> attempt) {
    this.attempt = attempt;
  }

  public void setAttempt(Object attempt) {
    this.attempt = JsonNullable.<Object>of(attempt);
  }


  public SubmissionComments hidden(Object hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * True if this comment is not visible to the owner of the submission.
   * @return hidden
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHidden() {
    return hidden;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHidden(Object hidden) {
    this.hidden = hidden;
  }


  public SubmissionComments authorName(Object authorName) {
    this.authorName = JsonNullable.<Object>of(authorName);
    
    return this;
  }

   /**
   * The name of the commenting user.
   * @return authorName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAuthorName() {
        return authorName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAuthorName_JsonNullable() {
    return authorName;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  public void setAuthorName_JsonNullable(JsonNullable<Object> authorName) {
    this.authorName = authorName;
  }

  public void setAuthorName(Object authorName) {
    this.authorName = JsonNullable.<Object>of(authorName);
  }


  public SubmissionComments groupCommentId(Object groupCommentId) {
    this.groupCommentId = JsonNullable.<Object>of(groupCommentId);
    
    return this;
  }

   /**
   * For group assignments, a value that is unique for all copies of this comment on submissions in the same group.
   * @return groupCommentId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGroupCommentId() {
        return groupCommentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_COMMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGroupCommentId_JsonNullable() {
    return groupCommentId;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_COMMENT_ID)
  public void setGroupCommentId_JsonNullable(JsonNullable<Object> groupCommentId) {
    this.groupCommentId = groupCommentId;
  }

  public void setGroupCommentId(Object groupCommentId) {
    this.groupCommentId = JsonNullable.<Object>of(groupCommentId);
  }


  public SubmissionComments assessmentRequestId(Object assessmentRequestId) {
    this.assessmentRequestId = JsonNullable.<Object>of(assessmentRequestId);
    
    return this;
  }

   /**
   * For peer-reviewed assignments, the ID of the Assessment Request this comment is associated with.
   * @return assessmentRequestId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAssessmentRequestId() {
        return assessmentRequestId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSESSMENT_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAssessmentRequestId_JsonNullable() {
    return assessmentRequestId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSESSMENT_REQUEST_ID)
  public void setAssessmentRequestId_JsonNullable(JsonNullable<Object> assessmentRequestId) {
    this.assessmentRequestId = assessmentRequestId;
  }

  public void setAssessmentRequestId(Object assessmentRequestId) {
    this.assessmentRequestId = JsonNullable.<Object>of(assessmentRequestId);
  }


  public SubmissionComments anonymous(Object anonymous) {
    this.anonymous = JsonNullable.<Object>of(anonymous);
    
    return this;
  }

   /**
   * True if this is a peer-reviewed comment for an assignment with anonymous peer reviews enabled. Does not apply to instructor comments for anonymously-graded assignments.
   * @return anonymous
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAnonymous() {
        return anonymous.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnonymous_JsonNullable() {
    return anonymous;
  }
  
  @JsonProperty(JSON_PROPERTY_ANONYMOUS)
  public void setAnonymous_JsonNullable(JsonNullable<Object> anonymous) {
    this.anonymous = anonymous;
  }

  public void setAnonymous(Object anonymous) {
    this.anonymous = JsonNullable.<Object>of(anonymous);
  }


  public SubmissionComments teacherOnlyComment(Object teacherOnlyComment) {
    
    this.teacherOnlyComment = teacherOnlyComment;
    return this;
  }

   /**
   * Indicates whether the comment was provided by a teacher.
   * @return teacherOnlyComment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEACHER_ONLY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTeacherOnlyComment() {
    return teacherOnlyComment;
  }


  @JsonProperty(JSON_PROPERTY_TEACHER_ONLY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeacherOnlyComment(Object teacherOnlyComment) {
    this.teacherOnlyComment = teacherOnlyComment;
  }


  public SubmissionComments provisionalGradeId(Object provisionalGradeId) {
    this.provisionalGradeId = JsonNullable.<Object>of(provisionalGradeId);
    
    return this;
  }

   /**
   * For moderated assignments, the provisional grade this comment is tied to.
   * @return provisionalGradeId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getProvisionalGradeId() {
        return provisionalGradeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVISIONAL_GRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getProvisionalGradeId_JsonNullable() {
    return provisionalGradeId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVISIONAL_GRADE_ID)
  public void setProvisionalGradeId_JsonNullable(JsonNullable<Object> provisionalGradeId) {
    this.provisionalGradeId = provisionalGradeId;
  }

  public void setProvisionalGradeId(Object provisionalGradeId) {
    this.provisionalGradeId = JsonNullable.<Object>of(provisionalGradeId);
  }


  public SubmissionComments draft(Object draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * True if this comment was saved as a draft.
   * @return draft
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDraft() {
    return draft;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDraft(Object draft) {
    this.draft = draft;
  }


  public SubmissionComments editedAt(Object editedAt) {
    this.editedAt = JsonNullable.<Object>of(editedAt);
    
    return this;
  }

   /**
   * The date this comment was last edited.
   * @return editedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEditedAt() {
        return editedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EDITED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEditedAt_JsonNullable() {
    return editedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EDITED_AT)
  public void setEditedAt_JsonNullable(JsonNullable<Object> editedAt) {
    this.editedAt = editedAt;
  }

  public void setEditedAt(Object editedAt) {
    this.editedAt = JsonNullable.<Object>of(editedAt);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionComments submissionComments = (SubmissionComments) o;
    return Objects.equals(this.id, submissionComments.id) &&
        Objects.equals(this.comment, submissionComments.comment) &&
        equalsNullable(this.submissionId, submissionComments.submissionId) &&
        Objects.equals(this.createdAt, submissionComments.createdAt) &&
        Objects.equals(this.updatedAt, submissionComments.updatedAt) &&
        equalsNullable(this.contextId, submissionComments.contextId) &&
        Objects.equals(this.contextType, submissionComments.contextType) &&
        equalsNullable(this.authorId, submissionComments.authorId) &&
        equalsNullable(this.mediaCommentId, submissionComments.mediaCommentId) &&
        equalsNullable(this.mediaCommentType, submissionComments.mediaCommentType) &&
        Objects.equals(this.attachmentIds, submissionComments.attachmentIds) &&
        equalsNullable(this.attempt, submissionComments.attempt) &&
        Objects.equals(this.hidden, submissionComments.hidden) &&
        equalsNullable(this.authorName, submissionComments.authorName) &&
        equalsNullable(this.groupCommentId, submissionComments.groupCommentId) &&
        equalsNullable(this.assessmentRequestId, submissionComments.assessmentRequestId) &&
        equalsNullable(this.anonymous, submissionComments.anonymous) &&
        Objects.equals(this.teacherOnlyComment, submissionComments.teacherOnlyComment) &&
        equalsNullable(this.provisionalGradeId, submissionComments.provisionalGradeId) &&
        Objects.equals(this.draft, submissionComments.draft) &&
        equalsNullable(this.editedAt, submissionComments.editedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comment, hashCodeNullable(submissionId), createdAt, updatedAt, hashCodeNullable(contextId), contextType, hashCodeNullable(authorId), hashCodeNullable(mediaCommentId), hashCodeNullable(mediaCommentType), attachmentIds, hashCodeNullable(attempt), hidden, hashCodeNullable(authorName), hashCodeNullable(groupCommentId), hashCodeNullable(assessmentRequestId), hashCodeNullable(anonymous), teacherOnlyComment, hashCodeNullable(provisionalGradeId), draft, hashCodeNullable(editedAt));
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
    sb.append("class SubmissionComments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    mediaCommentId: ").append(toIndentedString(mediaCommentId)).append("\n");
    sb.append("    mediaCommentType: ").append(toIndentedString(mediaCommentType)).append("\n");
    sb.append("    attachmentIds: ").append(toIndentedString(attachmentIds)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    groupCommentId: ").append(toIndentedString(groupCommentId)).append("\n");
    sb.append("    assessmentRequestId: ").append(toIndentedString(assessmentRequestId)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    teacherOnlyComment: ").append(toIndentedString(teacherOnlyComment)).append("\n");
    sb.append("    provisionalGradeId: ").append(toIndentedString(provisionalGradeId)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    editedAt: ").append(toIndentedString(editedAt)).append("\n");
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

