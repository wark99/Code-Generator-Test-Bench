/*
 * Essense Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: hello@essense.io
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
import org.openapitools.client.model.Metadata;
import org.openapitools.client.model.Title1;
import org.openapitools.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FeedbackSchema
 */
@JsonPropertyOrder({
  FeedbackSchema.JSON_PROPERTY_DATE,
  FeedbackSchema.JSON_PROPERTY_COMMENT,
  FeedbackSchema.JSON_PROPERTY_TITLE,
  FeedbackSchema.JSON_PROPERTY_USER_ID,
  FeedbackSchema.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:25.807394581Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FeedbackSchema {
  public static final String JSON_PROPERTY_DATE = "date";
  private Integer date;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_TITLE = "title";
  private Title1 title;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UserId userId;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Metadata metadata;

  public FeedbackSchema() {
  }

  public FeedbackSchema date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp in milliseconds when the review was created.
   * @return date
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(Integer date) {
    this.date = date;
  }


  public FeedbackSchema comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The review comment content.
   * @return comment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public FeedbackSchema title(Title1 title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Title1 getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(Title1 title) {
    this.title = title;
  }


  public FeedbackSchema userId(UserId userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserId getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(UserId userId) {
    this.userId = userId;
  }


  public FeedbackSchema metadata(Metadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Metadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackSchema feedbackSchema = (FeedbackSchema) o;
    return Objects.equals(this.date, feedbackSchema.date) &&
        Objects.equals(this.comment, feedbackSchema.comment) &&
        Objects.equals(this.title, feedbackSchema.title) &&
        Objects.equals(this.userId, feedbackSchema.userId) &&
        Objects.equals(this.metadata, feedbackSchema.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, comment, title, userId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackSchema {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

