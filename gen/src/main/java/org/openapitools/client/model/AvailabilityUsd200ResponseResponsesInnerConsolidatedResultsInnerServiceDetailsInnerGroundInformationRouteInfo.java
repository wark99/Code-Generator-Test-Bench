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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo
 */
@JsonPropertyOrder({
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo.JSON_PROPERTY_DISTANCE_KM,
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo.JSON_PROPERTY_DURATION_HOURS
})
@JsonTypeName("availabilityUsd_200_response_responses_inner_consolidated_results_inner_service_details_inner_ground_information_route_info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo {
  public static final String JSON_PROPERTY_DISTANCE_KM = "distance_km";
  private BigDecimal distanceKm;

  public static final String JSON_PROPERTY_DURATION_HOURS = "duration_hours";
  private BigDecimal durationHours;

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo() {
  }

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo distanceKm(BigDecimal distanceKm) {
    
    this.distanceKm = distanceKm;
    return this;
  }

   /**
   * Get distanceKm
   * @return distanceKm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTANCE_KM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDistanceKm() {
    return distanceKm;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE_KM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistanceKm(BigDecimal distanceKm) {
    this.distanceKm = distanceKm;
  }


  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo durationHours(BigDecimal durationHours) {
    
    this.durationHours = durationHours;
    return this;
  }

   /**
   * Get durationHours
   * @return durationHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDurationHours() {
    return durationHours;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationHours(BigDecimal durationHours) {
    this.durationHours = durationHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo = (AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo) o;
    return Objects.equals(this.distanceKm, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo.distanceKm) &&
        Objects.equals(this.durationHours, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo.durationHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceKm, durationHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerGroundInformationRouteInfo {\n");
    sb.append("    distanceKm: ").append(toIndentedString(distanceKm)).append("\n");
    sb.append("    durationHours: ").append(toIndentedString(durationHours)).append("\n");
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

