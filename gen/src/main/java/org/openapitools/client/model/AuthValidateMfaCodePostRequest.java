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
 * AuthValidateMfaCodePostRequest
 */
@JsonPropertyOrder({
  AuthValidateMfaCodePostRequest.JSON_PROPERTY_PIN_CODE,
  AuthValidateMfaCodePostRequest.JSON_PROPERTY_EMAIL
})
@JsonTypeName("_auth_validate_mfa_code_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AuthValidateMfaCodePostRequest {
  public static final String JSON_PROPERTY_PIN_CODE = "pin_code";
  private String pinCode;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public AuthValidateMfaCodePostRequest() {
  }

  public AuthValidateMfaCodePostRequest pinCode(String pinCode) {
    
    this.pinCode = pinCode;
    return this;
  }

   /**
   * Must be a 6 digit mfa pin code
   * @return pinCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PIN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPinCode() {
    return pinCode;
  }


  @JsonProperty(JSON_PROPERTY_PIN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }


  public AuthValidateMfaCodePostRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Mandatory if user is currently not logged in
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthValidateMfaCodePostRequest authValidateMfaCodePostRequest = (AuthValidateMfaCodePostRequest) o;
    return Objects.equals(this.pinCode, authValidateMfaCodePostRequest.pinCode) &&
        Objects.equals(this.email, authValidateMfaCodePostRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinCode, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthValidateMfaCodePostRequest {\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

