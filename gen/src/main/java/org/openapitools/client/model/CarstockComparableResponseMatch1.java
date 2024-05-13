/*
 * CIC-NEW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.7
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
import org.openapitools.client.model.CarstockComparableResponseMatch1Details;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstockComparableResponseMatch1
 */
@JsonPropertyOrder({
  CarstockComparableResponseMatch1.JSON_PROPERTY_PERCENTAGE,
  CarstockComparableResponseMatch1.JSON_PROPERTY_FULL,
  CarstockComparableResponseMatch1.JSON_PROPERTY_DETAILS
})
@JsonTypeName("carstockComparableResponse_match_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockComparableResponseMatch1 {
  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private Integer percentage;

  public static final String JSON_PROPERTY_FULL = "full";
  private Boolean full;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private CarstockComparableResponseMatch1Details details;

  public CarstockComparableResponseMatch1() {
  }

  public CarstockComparableResponseMatch1 percentage(Integer percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPercentage() {
    return percentage;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }


  public CarstockComparableResponseMatch1 full(Boolean full) {
    
    this.full = full;
    return this;
  }

   /**
   * Get full
   * @return full
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFull() {
    return full;
  }


  @JsonProperty(JSON_PROPERTY_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFull(Boolean full) {
    this.full = full;
  }


  public CarstockComparableResponseMatch1 details(CarstockComparableResponseMatch1Details details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockComparableResponseMatch1Details getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(CarstockComparableResponseMatch1Details details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockComparableResponseMatch1 carstockComparableResponseMatch1 = (CarstockComparableResponseMatch1) o;
    return Objects.equals(this.percentage, carstockComparableResponseMatch1.percentage) &&
        Objects.equals(this.full, carstockComparableResponseMatch1.full) &&
        Objects.equals(this.details, carstockComparableResponseMatch1.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, full, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockComparableResponseMatch1 {\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

