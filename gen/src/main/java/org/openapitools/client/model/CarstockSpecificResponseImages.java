/*
 * CIC-NEW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.7
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstockSpecificResponseImages
 */
@JsonPropertyOrder({
  CarstockSpecificResponseImages.JSON_PROPERTY_ID,
  CarstockSpecificResponseImages.JSON_PROPERTY_URL,
  CarstockSpecificResponseImages.JSON_PROPERTY_NAME,
  CarstockSpecificResponseImages.JSON_PROPERTY_CREATOR,
  CarstockSpecificResponseImages.JSON_PROPERTY_SIZE
})
@JsonTypeName("carstockSpecificResponse_images")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockSpecificResponseImages {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private String creator;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public CarstockSpecificResponseImages() {
  }

  public CarstockSpecificResponseImages id(Integer id) {
    
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

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public CarstockSpecificResponseImages url(String url) {
    
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


  public CarstockSpecificResponseImages name(String name) {
    
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


  public CarstockSpecificResponseImages creator(String creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreator() {
    return creator;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreator(String creator) {
    this.creator = creator;
  }


  public CarstockSpecificResponseImages size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockSpecificResponseImages carstockSpecificResponseImages = (CarstockSpecificResponseImages) o;
    return Objects.equals(this.id, carstockSpecificResponseImages.id) &&
        Objects.equals(this.url, carstockSpecificResponseImages.url) &&
        Objects.equals(this.name, carstockSpecificResponseImages.name) &&
        Objects.equals(this.creator, carstockSpecificResponseImages.creator) &&
        Objects.equals(this.size, carstockSpecificResponseImages.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, name, creator, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockSpecificResponseImages {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

