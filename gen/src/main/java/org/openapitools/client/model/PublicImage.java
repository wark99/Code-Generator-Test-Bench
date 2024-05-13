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
 * PublicImage
 */
@JsonPropertyOrder({
  PublicImage.JSON_PROPERTY_ID,
  PublicImage.JSON_PROPERTY_PUBLIC_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PublicImage {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_PUBLIC_URL = "public_url";
  private String publicUrl;

  public PublicImage() {
  }

  public PublicImage id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the resource &#x60;PublicImage&#x60;
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public PublicImage publicUrl(String publicUrl) {
    
    this.publicUrl = publicUrl;
    return this;
  }

   /**
   * Get publicUrl
   * @return publicUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PUBLIC_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPublicUrl() {
    return publicUrl;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicImage publicImage = (PublicImage) o;
    return Objects.equals(this.id, publicImage.id) &&
        Objects.equals(this.publicUrl, publicImage.publicUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publicUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicImage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicUrl: ").append(toIndentedString(publicUrl)).append("\n");
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

