/*
 * Syntax Public API
 * Documentation for the Public API
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.PublicApiV1UsersUseridGet200ResponseData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PublicApiV1UsersUseridGet200Response
 */
@JsonPropertyOrder({
  PublicApiV1UsersUseridGet200Response.JSON_PROPERTY_DATA,
  PublicApiV1UsersUseridGet200Response.JSON_PROPERTY_MESSAGE,
  PublicApiV1UsersUseridGet200Response.JSON_PROPERTY_SUCCESS
})
@JsonTypeName("_public_api_v1_users__userid__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PublicApiV1UsersUseridGet200Response {
  public static final String JSON_PROPERTY_DATA = "data";
  private PublicApiV1UsersUseridGet200ResponseData data;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public PublicApiV1UsersUseridGet200Response() {
  }

  public PublicApiV1UsersUseridGet200Response data(PublicApiV1UsersUseridGet200ResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PublicApiV1UsersUseridGet200ResponseData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(PublicApiV1UsersUseridGet200ResponseData data) {
    this.data = data;
  }


  public PublicApiV1UsersUseridGet200Response message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public PublicApiV1UsersUseridGet200Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicApiV1UsersUseridGet200Response publicApiV1UsersUseridGet200Response = (PublicApiV1UsersUseridGet200Response) o;
    return Objects.equals(this.data, publicApiV1UsersUseridGet200Response.data) &&
        Objects.equals(this.message, publicApiV1UsersUseridGet200Response.message) &&
        Objects.equals(this.success, publicApiV1UsersUseridGet200Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicApiV1UsersUseridGet200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

