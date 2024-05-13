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
import java.util.UUID;
import org.openapitools.client.model.ApiDataUrl;
import org.openapitools.client.model.Bool;
import org.openapitools.client.model.Datetime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Chapter
 */
@JsonPropertyOrder({
  ApiChapter.JSON_PROPERTY_ID,
  ApiChapter.JSON_PROPERTY_TIMESTAMP,
  ApiChapter.JSON_PROPERTY_NAME,
  ApiChapter.JSON_PROPERTY_DESCRIPTION,
  ApiChapter.JSON_PROPERTY_PUBLISHED,
  ApiChapter.JSON_PROPERTY_IMAGE,
  ApiChapter.JSON_PROPERTY_CREATED_AT,
  ApiChapter.JSON_PROPERTY_UPDATED_AT,
  ApiChapter.JSON_PROPERTY_DELETED_AT,
  ApiChapter.JSON_PROPERTY_INDEX
})
@JsonTypeName("Api_Chapter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ApiChapter {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Float timestamp;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets published
   */
  public enum PublishedEnum {
    TRUE("true"),
    
    FALSE("false");

    private Bool value;

    PublishedEnum(Bool value) {
      this.value = value;
    }

    @JsonValue
    public Bool getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PublishedEnum fromValue(Bool value) {
      for (PublishedEnum b : PublishedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PUBLISHED = "published";
  private PublishedEnum published = null;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private ApiDataUrl image;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Datetime createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Datetime updatedAt = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private Datetime deletedAt = null;

  public static final String JSON_PROPERTY_INDEX = "index";
  private BigDecimal index;

  public ApiChapter() {
  }

  public ApiChapter id(UUID id) {
    
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


  public ApiChapter timestamp(Float timestamp) {
    
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

  public Float getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Float timestamp) {
    this.timestamp = timestamp;
  }


  public ApiChapter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiChapter description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ApiChapter published(PublishedEnum published) {
    
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PublishedEnum getPublished() {
    return published;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublished(PublishedEnum published) {
    this.published = published;
  }


  public ApiChapter image(ApiDataUrl image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDataUrl getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(ApiDataUrl image) {
    this.image = image;
  }


  public ApiChapter createdAt(Datetime createdAt) {
    
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


  public ApiChapter updatedAt(Datetime updatedAt) {
    
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


  public ApiChapter deletedAt(Datetime deletedAt) {
    
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


  public ApiChapter index(BigDecimal index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiChapter apiChapter = (ApiChapter) o;
    return Objects.equals(this.id, apiChapter.id) &&
        Objects.equals(this.timestamp, apiChapter.timestamp) &&
        Objects.equals(this.name, apiChapter.name) &&
        Objects.equals(this.description, apiChapter.description) &&
        Objects.equals(this.published, apiChapter.published) &&
        Objects.equals(this.image, apiChapter.image) &&
        Objects.equals(this.createdAt, apiChapter.createdAt) &&
        Objects.equals(this.updatedAt, apiChapter.updatedAt) &&
        Objects.equals(this.deletedAt, apiChapter.deletedAt) &&
        Objects.equals(this.index, apiChapter.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, name, description, published, image, createdAt, updatedAt, deletedAt, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiChapter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

