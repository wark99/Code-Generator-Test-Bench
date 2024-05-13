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
import org.openapitools.client.model.PropertyWithPaymentDetailsConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyIdPaymentGet200ResponseProperty
 */
@JsonPropertyOrder({
  PropertyIdPaymentGet200ResponseProperty.JSON_PROPERTY_ID,
  PropertyIdPaymentGet200ResponseProperty.JSON_PROPERTY_PAYMENT_DETAILS
})
@JsonTypeName("_property__id__payment_get_200_response_property")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyIdPaymentGet200ResponseProperty {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_PAYMENT_DETAILS = "payment_details";
  private List<PropertyWithPaymentDetailsConfig> paymentDetails;

  public PropertyIdPaymentGet200ResponseProperty() {
  }

  public PropertyIdPaymentGet200ResponseProperty id(Integer id) {
    
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


  public PropertyIdPaymentGet200ResponseProperty paymentDetails(List<PropertyWithPaymentDetailsConfig> paymentDetails) {
    
    this.paymentDetails = paymentDetails;
    return this;
  }

  public PropertyIdPaymentGet200ResponseProperty addPaymentDetailsItem(PropertyWithPaymentDetailsConfig paymentDetailsItem) {
    if (this.paymentDetails == null) {
      this.paymentDetails = new ArrayList<>();
    }
    this.paymentDetails.add(paymentDetailsItem);
    return this;
  }

   /**
   * Get paymentDetails
   * @return paymentDetails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PropertyWithPaymentDetailsConfig> getPaymentDetails() {
    return paymentDetails;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentDetails(List<PropertyWithPaymentDetailsConfig> paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyIdPaymentGet200ResponseProperty propertyIdPaymentGet200ResponseProperty = (PropertyIdPaymentGet200ResponseProperty) o;
    return Objects.equals(this.id, propertyIdPaymentGet200ResponseProperty.id) &&
        Objects.equals(this.paymentDetails, propertyIdPaymentGet200ResponseProperty.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyIdPaymentGet200ResponseProperty {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
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
