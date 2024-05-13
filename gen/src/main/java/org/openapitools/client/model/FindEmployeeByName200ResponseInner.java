/*
 * Swagger Inventory Management System(ConvoConvert) - OpenAPI 3.1
 * This is a sample Inventory Management System based on the OpenAPI 3.1 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the Inventory Management System, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Inventory Management System repository](https://github.com/afefa-karakra/inventory-management-system.git)
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
 * FindEmployeeByName200ResponseInner
 */
@JsonPropertyOrder({
  FindEmployeeByName200ResponseInner.JSON_PROPERTY_I_D,
  FindEmployeeByName200ResponseInner.JSON_PROPERTY_USERNAME,
  FindEmployeeByName200ResponseInner.JSON_PROPERTY_PHONE_NUMBER
})
@JsonTypeName("findEmployeeByName_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:45.540345838Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FindEmployeeByName200ResponseInner {
  public static final String JSON_PROPERTY_I_D = "ID";
  private Integer ID;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "PhoneNumber";
  private Integer phoneNumber;

  public FindEmployeeByName200ResponseInner() {
  }

  public FindEmployeeByName200ResponseInner ID(Integer ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getID() {
    return ID;
  }


  @JsonProperty(JSON_PROPERTY_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setID(Integer ID) {
    this.ID = ID;
  }


  public FindEmployeeByName200ResponseInner username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public FindEmployeeByName200ResponseInner phoneNumber(Integer phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindEmployeeByName200ResponseInner findEmployeeByName200ResponseInner = (FindEmployeeByName200ResponseInner) o;
    return Objects.equals(this.ID, findEmployeeByName200ResponseInner.ID) &&
        Objects.equals(this.username, findEmployeeByName200ResponseInner.username) &&
        Objects.equals(this.phoneNumber, findEmployeeByName200ResponseInner.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, username, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindEmployeeByName200ResponseInner {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

