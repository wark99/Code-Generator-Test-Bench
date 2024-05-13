/*
 * Inventory Management System API
 * API for managing customers, orders, products, and categories in an Inventory Management System.
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Customer
 */
@JsonPropertyOrder({
  Customer.JSON_PROPERTY_CUSTOMER_I_D,
  Customer.JSON_PROPERTY_NAME,
  Customer.JSON_PROPERTY_EMAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:18.328773307Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Customer {
  public static final String JSON_PROPERTY_CUSTOMER_I_D = "CustomerID";
  private Integer customerID;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "Email";
  private String email;

  public Customer() {
  }

  public Customer customerID(Integer customerID) {
    
    this.customerID = customerID;
    return this;
  }

   /**
   * Unique identifier for the customer
   * @return customerID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCustomerID() {
    return customerID;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerID(Integer customerID) {
    this.customerID = customerID;
  }


  public Customer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer&#39;s name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Customer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerID, customer.customerID) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.email, customer.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, name, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

