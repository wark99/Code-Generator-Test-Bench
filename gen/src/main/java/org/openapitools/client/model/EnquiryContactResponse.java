/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BuyerEmailAddressesResponseInner;
import org.openapitools.client.model.BuyerPhoneNumbersResponseInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EnquiryContactResponse
 */
@JsonPropertyOrder({
  EnquiryContactResponse.JSON_PROPERTY_PHONE_NUMBERS,
  EnquiryContactResponse.JSON_PROPERTY_EMAIL_ADDRESSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EnquiryContactResponse {
  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<BuyerPhoneNumbersResponseInner> phoneNumbers;

  public static final String JSON_PROPERTY_EMAIL_ADDRESSES = "email_addresses";
  private List<BuyerEmailAddressesResponseInner> emailAddresses;

  public EnquiryContactResponse() {
  }

  public EnquiryContactResponse phoneNumbers(List<BuyerPhoneNumbersResponseInner> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public EnquiryContactResponse addPhoneNumbersItem(BuyerPhoneNumbersResponseInner phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BuyerPhoneNumbersResponseInner> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(List<BuyerPhoneNumbersResponseInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public EnquiryContactResponse emailAddresses(List<BuyerEmailAddressesResponseInner> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public EnquiryContactResponse addEmailAddressesItem(BuyerEmailAddressesResponseInner emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BuyerEmailAddressesResponseInner> getEmailAddresses() {
    return emailAddresses;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddresses(List<BuyerEmailAddressesResponseInner> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnquiryContactResponse enquiryContactResponse = (EnquiryContactResponse) o;
    return Objects.equals(this.phoneNumbers, enquiryContactResponse.phoneNumbers) &&
        Objects.equals(this.emailAddresses, enquiryContactResponse.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumbers, emailAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnquiryContactResponse {\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
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

