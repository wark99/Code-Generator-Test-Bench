/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
 * CreateRequestCustomer
 */
@JsonPropertyOrder({
  CreateRequestCustomer.JSON_PROPERTY_FIRST_NAME,
  CreateRequestCustomer.JSON_PROPERTY_LAST_NAME,
  CreateRequestCustomer.JSON_PROPERTY_EMAIL,
  CreateRequestCustomer.JSON_PROPERTY_PHONE1,
  CreateRequestCustomer.JSON_PROPERTY_PHONE2,
  CreateRequestCustomer.JSON_PROPERTY_PHONE3,
  CreateRequestCustomer.JSON_PROPERTY_ADDRESS1,
  CreateRequestCustomer.JSON_PROPERTY_ADDRESS2,
  CreateRequestCustomer.JSON_PROPERTY_CITY,
  CreateRequestCustomer.JSON_PROPERTY_STATE,
  CreateRequestCustomer.JSON_PROPERTY_ZIP,
  CreateRequestCustomer.JSON_PROPERTY_CUSTOMER_NUMBER
})
@JsonTypeName("CreateRequest_customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateRequestCustomer {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE1 = "phone1";
  private String phone1;

  public static final String JSON_PROPERTY_PHONE2 = "phone2";
  private String phone2;

  public static final String JSON_PROPERTY_PHONE3 = "phone3";
  private String phone3;

  public static final String JSON_PROPERTY_ADDRESS1 = "address1";
  private String address1;

  public static final String JSON_PROPERTY_ADDRESS2 = "address2";
  private String address2;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public static final String JSON_PROPERTY_CUSTOMER_NUMBER = "customerNumber";
  private String customerNumber;

  public CreateRequestCustomer() {
  }

  public CreateRequestCustomer firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreateRequestCustomer lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreateRequestCustomer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CreateRequestCustomer phone1(String phone1) {
    
    this.phone1 = phone1;
    return this;
  }

   /**
   * Get phone1
   * @return phone1
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHONE1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhone1() {
    return phone1;
  }


  @JsonProperty(JSON_PROPERTY_PHONE1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }


  public CreateRequestCustomer phone2(String phone2) {
    
    this.phone2 = phone2;
    return this;
  }

   /**
   * Get phone2
   * @return phone2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone2() {
    return phone2;
  }


  @JsonProperty(JSON_PROPERTY_PHONE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }


  public CreateRequestCustomer phone3(String phone3) {
    
    this.phone3 = phone3;
    return this;
  }

   /**
   * Get phone3
   * @return phone3
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone3() {
    return phone3;
  }


  @JsonProperty(JSON_PROPERTY_PHONE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone3(String phone3) {
    this.phone3 = phone3;
  }


  public CreateRequestCustomer address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress1() {
    return address1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public CreateRequestCustomer address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress2() {
    return address2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public CreateRequestCustomer city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCity(String city) {
    this.city = city;
  }


  public CreateRequestCustomer state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(String state) {
    this.state = state;
  }


  public CreateRequestCustomer zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getZip() {
    return zip;
  }


  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZip(String zip) {
    this.zip = zip;
  }


  public CreateRequestCustomer customerNumber(String customerNumber) {
    
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Some clients would like to have the customer identifier provided in reports. Please provide here if you would like to report on it later.
   * @return customerNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerNumber() {
    return customerNumber;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRequestCustomer createRequestCustomer = (CreateRequestCustomer) o;
    return Objects.equals(this.firstName, createRequestCustomer.firstName) &&
        Objects.equals(this.lastName, createRequestCustomer.lastName) &&
        Objects.equals(this.email, createRequestCustomer.email) &&
        Objects.equals(this.phone1, createRequestCustomer.phone1) &&
        Objects.equals(this.phone2, createRequestCustomer.phone2) &&
        Objects.equals(this.phone3, createRequestCustomer.phone3) &&
        Objects.equals(this.address1, createRequestCustomer.address1) &&
        Objects.equals(this.address2, createRequestCustomer.address2) &&
        Objects.equals(this.city, createRequestCustomer.city) &&
        Objects.equals(this.state, createRequestCustomer.state) &&
        Objects.equals(this.zip, createRequestCustomer.zip) &&
        Objects.equals(this.customerNumber, createRequestCustomer.customerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, phone1, phone2, phone3, address1, address2, city, state, zip, customerNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRequestCustomer {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    phone3: ").append(toIndentedString(phone3)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
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
