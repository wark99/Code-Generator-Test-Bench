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
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TenantIdDetailsGet200ResponseRightToRent
 */
@JsonPropertyOrder({
  TenantIdDetailsGet200ResponseRightToRent.JSON_PROPERTY_RIGHT_TO_RENT,
  TenantIdDetailsGet200ResponseRightToRent.JSON_PROPERTY_EXPIRY_DATE
})
@JsonTypeName("_tenant__id__details_get_200_response_right_to_rent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TenantIdDetailsGet200ResponseRightToRent {
  public static final String JSON_PROPERTY_RIGHT_TO_RENT = "right_to_rent";
  private Boolean rightToRent;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiry_date";
  private MaintenancePost200ResponseValueCreatedDate expiryDate;

  public TenantIdDetailsGet200ResponseRightToRent() {
  }

  public TenantIdDetailsGet200ResponseRightToRent rightToRent(Boolean rightToRent) {
    
    this.rightToRent = rightToRent;
    return this;
  }

   /**
   * Get rightToRent
   * @return rightToRent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RIGHT_TO_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRightToRent() {
    return rightToRent;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_TO_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightToRent(Boolean rightToRent) {
    this.rightToRent = rightToRent;
  }


  public TenantIdDetailsGet200ResponseRightToRent expiryDate(MaintenancePost200ResponseValueCreatedDate expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getExpiryDate() {
    return expiryDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(MaintenancePost200ResponseValueCreatedDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantIdDetailsGet200ResponseRightToRent tenantIdDetailsGet200ResponseRightToRent = (TenantIdDetailsGet200ResponseRightToRent) o;
    return Objects.equals(this.rightToRent, tenantIdDetailsGet200ResponseRightToRent.rightToRent) &&
        Objects.equals(this.expiryDate, tenantIdDetailsGet200ResponseRightToRent.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rightToRent, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantIdDetailsGet200ResponseRightToRent {\n");
    sb.append("    rightToRent: ").append(toIndentedString(rightToRent)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
