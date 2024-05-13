/*
 * BBE Nexus LMS API
 * API for updating member course completion
 *
 * The version of the OpenAPI document: 1
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
 * MemberCourseUpdate200Response
 */
@JsonPropertyOrder({
  MemberCourseUpdate200Response.JSON_PROPERTY_STATUS_CODE,
  MemberCourseUpdate200Response.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("memberCourseUpdate_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:20.164612034Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MemberCourseUpdate200Response {
  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Object statusCode = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public MemberCourseUpdate200Response() {
  }

  public MemberCourseUpdate200Response statusCode(Object statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(Object statusCode) {
    this.statusCode = statusCode;
  }


  public MemberCourseUpdate200Response message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Confirmation message for successful course update
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberCourseUpdate200Response memberCourseUpdate200Response = (MemberCourseUpdate200Response) o;
    return Objects.equals(this.statusCode, memberCourseUpdate200Response.statusCode) &&
        Objects.equals(this.message, memberCourseUpdate200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCourseUpdate200Response {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

