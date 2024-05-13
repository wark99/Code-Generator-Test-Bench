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
 * AccountGet200ResponseOneOfAllOfAccount
 */
@JsonPropertyOrder({
  AccountGet200ResponseOneOfAllOfAccount.JSON_PROPERTY_PRIMARY_MOBILE_NUMBER,
  AccountGet200ResponseOneOfAllOfAccount.JSON_PROPERTY_EMAIL
})
@JsonTypeName("_account_get_200_response_oneOf_allOf_account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountGet200ResponseOneOfAllOfAccount {
  public static final String JSON_PROPERTY_PRIMARY_MOBILE_NUMBER = "primary_mobile_number";
  private String primaryMobileNumber;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public AccountGet200ResponseOneOfAllOfAccount() {
  }

  public AccountGet200ResponseOneOfAllOfAccount primaryMobileNumber(String primaryMobileNumber) {
    
    this.primaryMobileNumber = primaryMobileNumber;
    return this;
  }

   /**
   * Get primaryMobileNumber
   * @return primaryMobileNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_MOBILE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryMobileNumber() {
    return primaryMobileNumber;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_MOBILE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryMobileNumber(String primaryMobileNumber) {
    this.primaryMobileNumber = primaryMobileNumber;
  }


  public AccountGet200ResponseOneOfAllOfAccount email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
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
    AccountGet200ResponseOneOfAllOfAccount accountGet200ResponseOneOfAllOfAccount = (AccountGet200ResponseOneOfAllOfAccount) o;
    return Objects.equals(this.primaryMobileNumber, accountGet200ResponseOneOfAllOfAccount.primaryMobileNumber) &&
        Objects.equals(this.email, accountGet200ResponseOneOfAllOfAccount.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryMobileNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGet200ResponseOneOfAllOfAccount {\n");
    sb.append("    primaryMobileNumber: ").append(toIndentedString(primaryMobileNumber)).append("\n");
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

