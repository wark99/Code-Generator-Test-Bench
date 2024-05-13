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
import org.openapitools.client.model.AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing
 */
@JsonPropertyOrder({
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.JSON_PROPERTY_CURRENCY_CODE3ISO,
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.JSON_PROPERTY_PREDISCOUNT,
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.JSON_PROPERTY_TOTAL,
  AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.JSON_PROPERTY_UNITARY
})
@JsonTypeName("availabilityUsd_200_response_responses_inner_consolidated_results_inner_service_details_inner_pricing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing {
  public static final String JSON_PROPERTY_CURRENCY_CODE3ISO = "currency_code_3iso";
  private String currencyCode3iso;

  public static final String JSON_PROPERTY_PREDISCOUNT = "prediscount";
  private BigDecimal prediscount;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal total;

  public static final String JSON_PROPERTY_UNITARY = "unitary";
  private AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal unitary;

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing() {
  }

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing currencyCode3iso(String currencyCode3iso) {
    
    this.currencyCode3iso = currencyCode3iso;
    return this;
  }

   /**
   * Get currencyCode3iso
   * @return currencyCode3iso
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE3ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode3iso() {
    return currencyCode3iso;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE3ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode3iso(String currencyCode3iso) {
    this.currencyCode3iso = currencyCode3iso;
  }


  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing prediscount(BigDecimal prediscount) {
    
    this.prediscount = prediscount;
    return this;
  }

   /**
   * Get prediscount
   * @return prediscount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREDISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrediscount() {
    return prediscount;
  }


  @JsonProperty(JSON_PROPERTY_PREDISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrediscount(BigDecimal prediscount) {
    this.prediscount = prediscount;
  }


  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing total(AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal total) {
    this.total = total;
  }


  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing unitary(AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal unitary) {
    
    this.unitary = unitary;
    return this;
  }

   /**
   * Get unitary
   * @return unitary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNITARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal getUnitary() {
    return unitary;
  }


  @JsonProperty(JSON_PROPERTY_UNITARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitary(AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricingTotal unitary) {
    this.unitary = unitary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing = (AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing) o;
    return Objects.equals(this.currencyCode3iso, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.currencyCode3iso) &&
        Objects.equals(this.prediscount, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.prediscount) &&
        Objects.equals(this.total, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.total) &&
        Objects.equals(this.unitary, availabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing.unitary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode3iso, prediscount, total, unitary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityUsd200ResponseResponsesInnerConsolidatedResultsInnerServiceDetailsInnerPricing {\n");
    sb.append("    currencyCode3iso: ").append(toIndentedString(currencyCode3iso)).append("\n");
    sb.append("    prediscount: ").append(toIndentedString(prediscount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    unitary: ").append(toIndentedString(unitary)).append("\n");
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

