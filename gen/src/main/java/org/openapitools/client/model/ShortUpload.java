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
import org.openapitools.client.model.Datetime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * upload
 */
@JsonPropertyOrder({
  ShortUpload.JSON_PROPERTY_ID,
  ShortUpload.JSON_PROPERTY_INDEX,
  ShortUpload.JSON_PROPERTY_PROGRESS,
  ShortUpload.JSON_PROPERTY_URL,
  ShortUpload.JSON_PROPERTY_CREATED_AT,
  ShortUpload.JSON_PROPERTY_READY_AT
})
@JsonTypeName("shortUpload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ShortUpload {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index = null;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private Integer progress = null;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Datetime createdAt = null;

  public static final String JSON_PROPERTY_READY_AT = "ready_at";
  private Datetime readyAt = null;

  public ShortUpload() {
  }

  public ShortUpload id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ShortUpload index(Integer index) {
    
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

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public ShortUpload progress(Integer progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public ShortUpload url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ShortUpload createdAt(Datetime createdAt) {
    
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


  public ShortUpload readyAt(Datetime readyAt) {
    
    this.readyAt = readyAt;
    return this;
  }

   /**
   * Get readyAt
   * @return readyAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getReadyAt() {
    return readyAt;
  }


  @JsonProperty(JSON_PROPERTY_READY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadyAt(Datetime readyAt) {
    this.readyAt = readyAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortUpload shortUpload = (ShortUpload) o;
    return Objects.equals(this.id, shortUpload.id) &&
        Objects.equals(this.index, shortUpload.index) &&
        Objects.equals(this.progress, shortUpload.progress) &&
        Objects.equals(this.url, shortUpload.url) &&
        Objects.equals(this.createdAt, shortUpload.createdAt) &&
        Objects.equals(this.readyAt, shortUpload.readyAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, index, progress, url, createdAt, readyAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortUpload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    readyAt: ").append(toIndentedString(readyAt)).append("\n");
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
