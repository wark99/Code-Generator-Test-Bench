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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LinkedPropertyEmployeeResponse
 */
@JsonPropertyOrder({
  LinkedPropertyEmployeeResponse.JSON_PROPERTY_ID,
  LinkedPropertyEmployeeResponse.JSON_PROPERTY_ROLE,
  LinkedPropertyEmployeeResponse.JSON_PROPERTY_IS_WEBSITE_CONTACT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LinkedPropertyEmployeeResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  /**
   * 1 &#x3D; Property manager, 2 &#x3D; Valuer, 3 &#x3D; Negotiator
   */
  public enum RoleEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    RoleEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(Integer value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  public static final String JSON_PROPERTY_IS_WEBSITE_CONTACT = "is_website_contact";
  private Boolean isWebsiteContact;

  public LinkedPropertyEmployeeResponse() {
  }

  public LinkedPropertyEmployeeResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public LinkedPropertyEmployeeResponse role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * 1 &#x3D; Property manager, 2 &#x3D; Valuer, 3 &#x3D; Negotiator
   * @return role
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public LinkedPropertyEmployeeResponse isWebsiteContact(Boolean isWebsiteContact) {
    
    this.isWebsiteContact = isWebsiteContact;
    return this;
  }

   /**
   * Get isWebsiteContact
   * @return isWebsiteContact
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_WEBSITE_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsWebsiteContact() {
    return isWebsiteContact;
  }


  @JsonProperty(JSON_PROPERTY_IS_WEBSITE_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsWebsiteContact(Boolean isWebsiteContact) {
    this.isWebsiteContact = isWebsiteContact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedPropertyEmployeeResponse linkedPropertyEmployeeResponse = (LinkedPropertyEmployeeResponse) o;
    return Objects.equals(this.id, linkedPropertyEmployeeResponse.id) &&
        Objects.equals(this.role, linkedPropertyEmployeeResponse.role) &&
        Objects.equals(this.isWebsiteContact, linkedPropertyEmployeeResponse.isWebsiteContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, isWebsiteContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedPropertyEmployeeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    isWebsiteContact: ").append(toIndentedString(isWebsiteContact)).append("\n");
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
