/*
 * Servantrip API Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0-oas3
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
import org.openapitools.client.model.AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner
 */
@JsonPropertyOrder({
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner.JSON_PROPERTY_SERVICE_DETAILS
})
@JsonTypeName("availabilityUsd_200_response_responses_inner_consolidated_results_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner {
  public static final String JSON_PROPERTY_SERVICE_DETAILS = "service_details";
  private List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInner> serviceDetails;

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner() {
  }

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner serviceDetails(List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInner> serviceDetails) {
    
    this.serviceDetails = serviceDetails;
    return this;
  }

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner addServiceDetailsItem(AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInner serviceDetailsItem) {
    if (this.serviceDetails == null) {
      this.serviceDetails = new ArrayList<>();
    }
    this.serviceDetails.add(serviceDetailsItem);
    return this;
  }

   /**
   * Get serviceDetails
   * @return serviceDetails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInner> getServiceDetails() {
    return serviceDetails;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceDetails(List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInner> serviceDetails) {
    this.serviceDetails = serviceDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner availabilityUsd200ResponseResponsesInnerConsolidatedResultsInner = (AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner) o;
    return Objects.equals(this.serviceDetails, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInner.serviceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner {\n");
    sb.append("    serviceDetails: ").append(toIndentedString(serviceDetails)).append("\n");
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

