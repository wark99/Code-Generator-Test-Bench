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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Datetime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Share
 */
@JsonPropertyOrder({
  ShortShare.JSON_PROPERTY_ID,
  ShortShare.JSON_PROPERTY_TARGET_TYPE,
  ShortShare.JSON_PROPERTY_TARGET_ID,
  ShortShare.JSON_PROPERTY_COMMENT,
  ShortShare.JSON_PROPERTY_TIMESTAMP,
  ShortShare.JSON_PROPERTY_VALIDITY,
  ShortShare.JSON_PROPERTY_CREATED_AT,
  ShortShare.JSON_PROPERTY_UPDATED_AT,
  ShortShare.JSON_PROPERTY_DELETED_AT,
  ShortShare.JSON_PROPERTY_LINKS
})
@JsonTypeName("shortShare")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ShortShare {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TARGET_TYPE = "target_type";
  private String targetType;

  public static final String JSON_PROPERTY_TARGET_ID = "target_id";
  private String targetId;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_VALIDITY = "validity";
  private BigDecimal validity;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Datetime createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Datetime updatedAt = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private Datetime deletedAt = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<Object> links;

  public ShortShare() {
  }

  public ShortShare id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public ShortShare targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetType() {
    return targetType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public ShortShare targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public ShortShare comment(String comment) {
    
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

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public ShortShare timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ShortShare validity(BigDecimal validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * In seconds
   * @return validity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValidity() {
    return validity;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidity(BigDecimal validity) {
    this.validity = validity;
  }


  public ShortShare createdAt(Datetime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Datetime createdAt) {
    this.createdAt = createdAt;
  }


  public ShortShare updatedAt(Datetime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Datetime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ShortShare deletedAt(Datetime deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getDeletedAt() {
    return deletedAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletedAt(Datetime deletedAt) {
    this.deletedAt = deletedAt;
  }


  public ShortShare links(List<Object> links) {
    
    this.links = links;
    return this;
  }

  public ShortShare addLinksItem(Object linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(List<Object> links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortShare shortShare = (ShortShare) o;
    return Objects.equals(this.id, shortShare.id) &&
        Objects.equals(this.targetType, shortShare.targetType) &&
        Objects.equals(this.targetId, shortShare.targetId) &&
        Objects.equals(this.comment, shortShare.comment) &&
        Objects.equals(this.timestamp, shortShare.timestamp) &&
        Objects.equals(this.validity, shortShare.validity) &&
        Objects.equals(this.createdAt, shortShare.createdAt) &&
        Objects.equals(this.updatedAt, shortShare.updatedAt) &&
        Objects.equals(this.deletedAt, shortShare.deletedAt) &&
        Objects.equals(this.links, shortShare.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetType, targetId, comment, timestamp, validity, createdAt, updatedAt, deletedAt, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortShare {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

