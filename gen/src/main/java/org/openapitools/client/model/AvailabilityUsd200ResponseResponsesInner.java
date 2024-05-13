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
import org.openapitools.client.model.AvailabilityUsd200ResponseResponsesInnerCommonGroundInfo;
import org.openapitools.client.model.AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AvailabilityUsd200ResponseResponsesInner
 */
@JsonPropertyOrder({
  AvailabilityUsd200ResponseResponsesInner.JSON_PROPERTY_COMMON_GROUND_INFO,
  AvailabilityUsd200ResponseResponsesInner.JSON_PROPERTY_CONSOLIDATED_RESULTS,
  AvailabilityUsd200ResponseResponsesInner.JSON_PROPERTY_REFERENCE,
  AvailabilityUsd200ResponseResponsesInner.JSON_PROPERTY_VERTICAL
})
@JsonTypeName("availabilityUsd_200_response_responses_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityUsd200ResponseResponsesInner {
  public static final String JSON_PROPERTY_COMMON_GROUND_INFO = "common_ground_info";
  private AvailabilityUsd200ResponseResponsesInnerCommonGroundInfo commonGroundInfo;

  public static final String JSON_PROPERTY_CONSOLIDATED_RESULTS = "consolidated_results";
  private List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner> consolidatedResults;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_VERTICAL = "vertical";
  private String vertical;

  public AvailabilityUsd200ResponseResponsesInner() {
  }

  public AvailabilityUsd200ResponseResponsesInner commonGroundInfo(AvailabilityUsd200ResponseResponsesInnerCommonGroundInfo commonGroundInfo) {
    
    this.commonGroundInfo = commonGroundInfo;
    return this;
  }

   /**
   * Get commonGroundInfo
   * @return commonGroundInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMON_GROUND_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfo getCommonGroundInfo() {
    return commonGroundInfo;
  }


  @JsonProperty(JSON_PROPERTY_COMMON_GROUND_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonGroundInfo(AvailabilityUsd200ResponseResponsesInnerCommonGroundInfo commonGroundInfo) {
    this.commonGroundInfo = commonGroundInfo;
  }


  public AvailabilityUsd200ResponseResponsesInner consolidatedResults(List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner> consolidatedResults) {
    
    this.consolidatedResults = consolidatedResults;
    return this;
  }

  public AvailabilityUsd200ResponseResponsesInner addConsolidatedResultsItem(AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner consolidatedResultsItem) {
    if (this.consolidatedResults == null) {
      this.consolidatedResults = new ArrayList<>();
    }
    this.consolidatedResults.add(consolidatedResultsItem);
    return this;
  }

   /**
   * Get consolidatedResults
   * @return consolidatedResults
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSOLIDATED_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner> getConsolidatedResults() {
    return consolidatedResults;
  }


  @JsonProperty(JSON_PROPERTY_CONSOLIDATED_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsolidatedResults(List<AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInner> consolidatedResults) {
    this.consolidatedResults = consolidatedResults;
  }


  public AvailabilityUsd200ResponseResponsesInner reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public AvailabilityUsd200ResponseResponsesInner vertical(String vertical) {
    
    this.vertical = vertical;
    return this;
  }

   /**
   * Get vertical
   * @return vertical
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVertical() {
    return vertical;
  }


  @JsonProperty(JSON_PROPERTY_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVertical(String vertical) {
    this.vertical = vertical;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityUsd200ResponseResponsesInner availabilityUsd200ResponseResponsesInner = (AvailabilityUsd200ResponseResponsesInner) o;
    return Objects.equals(this.commonGroundInfo, availabilityUsd200ResponseResponsesInner.commonGroundInfo) &&
        Objects.equals(this.consolidatedResults, availabilityUsd200ResponseResponsesInner.consolidatedResults) &&
        Objects.equals(this.reference, availabilityUsd200ResponseResponsesInner.reference) &&
        Objects.equals(this.vertical, availabilityUsd200ResponseResponsesInner.vertical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonGroundInfo, consolidatedResults, reference, vertical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityUsd200ResponseResponsesInner {\n");
    sb.append("    commonGroundInfo: ").append(toIndentedString(commonGroundInfo)).append("\n");
    sb.append("    consolidatedResults: ").append(toIndentedString(consolidatedResults)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
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

