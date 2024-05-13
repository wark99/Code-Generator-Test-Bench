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
 * RequestBody63
 */
@JsonPropertyOrder({
  RequestBody63.JSON_PROPERTY_AVATAR,
  RequestBody63.JSON_PROPERTY_ENCODING
})
@JsonTypeName("Request_body_63")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody63 {
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private String avatar;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private String encoding;

  public RequestBody63() {
  }

  public RequestBody63 avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Avatar
   * @return avatar
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public RequestBody63 encoding(String encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEncoding() {
    return encoding;
  }


  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody63 requestBody63 = (RequestBody63) o;
    return Objects.equals(this.avatar, requestBody63.avatar) &&
        Objects.equals(this.encoding, requestBody63.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, encoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody63 {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

