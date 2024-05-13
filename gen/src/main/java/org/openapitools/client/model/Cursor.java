/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Cursor
 */
@JsonPropertyOrder({
  Cursor.JSON_PROPERTY_USER_ID,
  Cursor.JSON_PROPERTY_SOURCE_ID,
  Cursor.JSON_PROPERTY_ACTIVITY_ID,
  Cursor.JSON_PROPERTY_CREATED_AT,
  Cursor.JSON_PROPERTY_RECURSIVE,
  Cursor.JSON_PROPERTY_PAGE,
  Cursor.JSON_PROPERTY_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Cursor {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_SOURCE_ID = "source_id";
  private Integer sourceId;

  public static final String JSON_PROPERTY_ACTIVITY_ID = "activity_id";
  private Integer activityId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_RECURSIVE = "recursive";
  private Boolean recursive;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public Cursor() {
  }

  public Cursor userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user who created the cursor
   * @return userId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Cursor sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * ID of the directory the cursor was created in
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public Cursor activityId(Integer activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * ID of the last activity seen by the cursor
   * @return activityId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getActivityId() {
    return activityId;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActivityId(Integer activityId) {
    this.activityId = activityId;
  }


  public Cursor createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of the cursor&#39;s creation
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public Cursor recursive(Boolean recursive) {
    
    this.recursive = recursive;
    return this;
  }

   /**
   * Whether the cursor also reads children directories
   * @return recursive
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRecursive() {
    return recursive;
  }


  @JsonProperty(JSON_PROPERTY_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }


  public Cursor page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Current page of cursor data
   * @return page
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public Cursor limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Curent limit of cursor
   * @return limit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cursor cursor = (Cursor) o;
    return Objects.equals(this.userId, cursor.userId) &&
        Objects.equals(this.sourceId, cursor.sourceId) &&
        Objects.equals(this.activityId, cursor.activityId) &&
        Objects.equals(this.createdAt, cursor.createdAt) &&
        Objects.equals(this.recursive, cursor.recursive) &&
        Objects.equals(this.page, cursor.page) &&
        Objects.equals(this.limit, cursor.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, sourceId, activityId, createdAt, recursive, page, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cursor {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
