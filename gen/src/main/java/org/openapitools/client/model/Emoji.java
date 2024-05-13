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
 * Emoji
 */
@JsonPropertyOrder({
  Emoji.JSON_PROPERTY_ID,
  Emoji.JSON_PROPERTY_CREATOR_ID,
  Emoji.JSON_PROPERTY_NAME,
  Emoji.JSON_PROPERTY_CREATE_AT,
  Emoji.JSON_PROPERTY_UPDATE_AT,
  Emoji.JSON_PROPERTY_DELETE_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Emoji {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATOR_ID = "creator_id";
  private String creatorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATE_AT = "create_at";
  private Long createAt;

  public static final String JSON_PROPERTY_UPDATE_AT = "update_at";
  private Long updateAt;

  public static final String JSON_PROPERTY_DELETE_AT = "delete_at";
  private Long deleteAt;

  public Emoji() {
  }

  public Emoji id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the emoji
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Emoji creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * The ID of the user that made the emoji
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorId() {
    return creatorId;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public Emoji name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the emoji
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


  public Emoji createAt(Long createAt) {
    
    this.createAt = createAt;
    return this;
  }

   /**
   * The time in milliseconds the emoji was made
   * @return createAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateAt() {
    return createAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }


  public Emoji updateAt(Long updateAt) {
    
    this.updateAt = updateAt;
    return this;
  }

   /**
   * The time in milliseconds the emoji was last updated
   * @return updateAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdateAt() {
    return updateAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }


  public Emoji deleteAt(Long deleteAt) {
    
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * The time in milliseconds the emoji was deleted
   * @return deleteAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeleteAt() {
    return deleteAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emoji emoji = (Emoji) o;
    return Objects.equals(this.id, emoji.id) &&
        Objects.equals(this.creatorId, emoji.creatorId) &&
        Objects.equals(this.name, emoji.name) &&
        Objects.equals(this.createAt, emoji.createAt) &&
        Objects.equals(this.updateAt, emoji.updateAt) &&
        Objects.equals(this.deleteAt, emoji.deleteAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creatorId, name, createAt, updateAt, deleteAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emoji {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
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

