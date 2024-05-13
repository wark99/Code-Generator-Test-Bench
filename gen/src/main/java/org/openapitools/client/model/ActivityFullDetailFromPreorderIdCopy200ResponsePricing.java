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
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponsePricingTotal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ActivityFullDetailFromPreorderIdCopy200ResponsePricing
 */
@JsonPropertyOrder({
  ActivityFullDetailFromPreorderIdCopy200ResponsePricing.JSON_PROPERTY_CURRENCY_CODE3ISO,
  ActivityFullDetailFromPreorderIdCopy200ResponsePricing.JSON_PROPERTY_PREDISCOUNT,
  ActivityFullDetailFromPreorderIdCopy200ResponsePricing.JSON_PROPERTY_TOTAL
})
@JsonTypeName("activityFullDetailFromPreorderIdCopy_200_response_pricing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ActivityFullDetailFromPreorderIdCopy200ResponsePricing {
  public static final String JSON_PROPERTY_CURRENCY_CODE3ISO = "currency_code_3iso";
  private String currencyCode3iso;

  public static final String JSON_PROPERTY_PREDISCOUNT = "prediscount";
  private BigDecimal prediscount;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private ActivityFullDetailFromPreorderIdCopy200ResponsePricingTotal total;

  public ActivityFullDetailFromPreorderIdCopy200ResponsePricing() {
  }

  public ActivityFullDetailFromPreorderIdCopy200ResponsePricing currencyCode3iso(String currencyCode3iso) {
    
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


  public ActivityFullDetailFromPreorderIdCopy200ResponsePricing prediscount(BigDecimal prediscount) {
    
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


  public ActivityFullDetailFromPreorderIdCopy200ResponsePricing total(ActivityFullDetailFromPreorderIdCopy200ResponsePricingTotal total) {
    
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

  public ActivityFullDetailFromPreorderIdCopy200ResponsePricingTotal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(ActivityFullDetailFromPreorderIdCopy200ResponsePricingTotal total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityFullDetailFromPreorderIdCopy200ResponsePricing activityFullDetailFromPreorderIdCopy200ResponsePricing = (ActivityFullDetailFromPreorderIdCopy200ResponsePricing) o;
    return Objects.equals(this.currencyCode3iso, activityFullDetailFromPreorderIdCopy200ResponsePricing.currencyCode3iso) &&
        Objects.equals(this.prediscount, activityFullDetailFromPreorderIdCopy200ResponsePricing.prediscount) &&
        Objects.equals(this.total, activityFullDetailFromPreorderIdCopy200ResponsePricing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode3iso, prediscount, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityFullDetailFromPreorderIdCopy200ResponsePricing {\n");
    sb.append("    currencyCode3iso: ").append(toIndentedString(currencyCode3iso)).append("\n");
    sb.append("    prediscount: ").append(toIndentedString(prediscount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

