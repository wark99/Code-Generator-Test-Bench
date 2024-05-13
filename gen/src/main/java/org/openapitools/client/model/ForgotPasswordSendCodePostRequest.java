/*
 * Childcare Provider API
 * Childcare Provider RESTful Service API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: p.oforduru@zodiac-software.com
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
 * ForgotPasswordSendCodePostRequest
 */
@JsonPropertyOrder({
  ForgotPasswordSendCodePostRequest.JSON_PROPERTY_TOKEN
})
@JsonTypeName("_forgot_password_send_code_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ForgotPasswordSendCodePostRequest {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public ForgotPasswordSendCodePostRequest() {
  }

  public ForgotPasswordSendCodePostRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgotPasswordSendCodePostRequest forgotPasswordSendCodePostRequest = (ForgotPasswordSendCodePostRequest) o;
    return Objects.equals(this.token, forgotPasswordSendCodePostRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgotPasswordSendCodePostRequest {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

