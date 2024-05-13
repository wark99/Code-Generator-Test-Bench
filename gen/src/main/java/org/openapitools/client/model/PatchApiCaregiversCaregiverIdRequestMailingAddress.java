/*
 * AxisCare API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2023-10-01
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * If specified, must provide the entire &#x60;mailingAddress&#x60; object.
 */
@JsonPropertyOrder({
  PatchApiCaregiversCaregiverIdRequestMailingAddress.JSON_PROPERTY_STREET_ADDRESS1,
  PatchApiCaregiversCaregiverIdRequestMailingAddress.JSON_PROPERTY_STREET_ADDRESS2,
  PatchApiCaregiversCaregiverIdRequestMailingAddress.JSON_PROPERTY_CITY,
  PatchApiCaregiversCaregiverIdRequestMailingAddress.JSON_PROPERTY_STATE,
  PatchApiCaregiversCaregiverIdRequestMailingAddress.JSON_PROPERTY_POSTAL_CODE
})
@JsonTypeName("patch_api_caregivers_caregiverId_request_mailingAddress")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:58.235743643Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PatchApiCaregiversCaregiverIdRequestMailingAddress {
  public static final String JSON_PROPERTY_STREET_ADDRESS1 = "streetAddress1";
  private String streetAddress1;

  public static final String JSON_PROPERTY_STREET_ADDRESS2 = "streetAddress2";
  private JsonNullable<String> streetAddress2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public PatchApiCaregiversCaregiverIdRequestMailingAddress() {
  }

  public PatchApiCaregiversCaregiverIdRequestMailingAddress streetAddress1(String streetAddress1) {
    
    this.streetAddress1 = streetAddress1;
    return this;
  }

   /**
   * Get streetAddress1
   * @return streetAddress1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetAddress1() {
    return streetAddress1;
  }


  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetAddress1(String streetAddress1) {
    this.streetAddress1 = streetAddress1;
  }


  public PatchApiCaregiversCaregiverIdRequestMailingAddress streetAddress2(String streetAddress2) {
    this.streetAddress2 = JsonNullable.<String>of(streetAddress2);
    
    return this;
  }

   /**
   * Get streetAddress2
   * @return streetAddress2
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStreetAddress2() {
        return streetAddress2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStreetAddress2_JsonNullable() {
    return streetAddress2;
  }
  
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS2)
  public void setStreetAddress2_JsonNullable(JsonNullable<String> streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = JsonNullable.<String>of(streetAddress2);
  }


  public PatchApiCaregiversCaregiverIdRequestMailingAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public PatchApiCaregiversCaregiverIdRequestMailingAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public PatchApiCaregiversCaregiverIdRequestMailingAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchApiCaregiversCaregiverIdRequestMailingAddress patchApiCaregiversCaregiverIdRequestMailingAddress = (PatchApiCaregiversCaregiverIdRequestMailingAddress) o;
    return Objects.equals(this.streetAddress1, patchApiCaregiversCaregiverIdRequestMailingAddress.streetAddress1) &&
        equalsNullable(this.streetAddress2, patchApiCaregiversCaregiverIdRequestMailingAddress.streetAddress2) &&
        Objects.equals(this.city, patchApiCaregiversCaregiverIdRequestMailingAddress.city) &&
        Objects.equals(this.state, patchApiCaregiversCaregiverIdRequestMailingAddress.state) &&
        Objects.equals(this.postalCode, patchApiCaregiversCaregiverIdRequestMailingAddress.postalCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress1, hashCodeNullable(streetAddress2), city, state, postalCode);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchApiCaregiversCaregiverIdRequestMailingAddress {\n");
    sb.append("    streetAddress1: ").append(toIndentedString(streetAddress1)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

