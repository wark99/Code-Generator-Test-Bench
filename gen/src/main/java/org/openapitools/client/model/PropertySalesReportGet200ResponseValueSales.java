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
 * PropertySalesReportGet200ResponseValueSales
 */
@JsonPropertyOrder({
  PropertySalesReportGet200ResponseValueSales.JSON_PROPERTY_COUNT,
  PropertySalesReportGet200ResponseValueSales.JSON_PROPERTY_FEES_FROM_SALES,
  PropertySalesReportGet200ResponseValueSales.JSON_PROPERTY_AVERAGE_SALE_PRICE,
  PropertySalesReportGet200ResponseValueSales.JSON_PROPERTY_TOTAL_VALUE_OF_SALES
})
@JsonTypeName("_property_sales_report_get_200_response_value_sales")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertySalesReportGet200ResponseValueSales {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_FEES_FROM_SALES = "fees_from_sales";
  private Double feesFromSales;

  public static final String JSON_PROPERTY_AVERAGE_SALE_PRICE = "average_sale_price";
  private Double averageSalePrice;

  public static final String JSON_PROPERTY_TOTAL_VALUE_OF_SALES = "total_value_of_sales";
  private Double totalValueOfSales;

  public PropertySalesReportGet200ResponseValueSales() {
  }

  public PropertySalesReportGet200ResponseValueSales count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Total number of sold properties
   * @return count
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public PropertySalesReportGet200ResponseValueSales feesFromSales(Double feesFromSales) {
    
    this.feesFromSales = feesFromSales;
    return this;
  }

   /**
   * Sum of all fees
   * @return feesFromSales
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEES_FROM_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFeesFromSales() {
    return feesFromSales;
  }


  @JsonProperty(JSON_PROPERTY_FEES_FROM_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeesFromSales(Double feesFromSales) {
    this.feesFromSales = feesFromSales;
  }


  public PropertySalesReportGet200ResponseValueSales averageSalePrice(Double averageSalePrice) {
    
    this.averageSalePrice = averageSalePrice;
    return this;
  }

   /**
   * Average price of sold properties
   * @return averageSalePrice
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageSalePrice() {
    return averageSalePrice;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageSalePrice(Double averageSalePrice) {
    this.averageSalePrice = averageSalePrice;
  }


  public PropertySalesReportGet200ResponseValueSales totalValueOfSales(Double totalValueOfSales) {
    
    this.totalValueOfSales = totalValueOfSales;
    return this;
  }

   /**
   * Average sale price divided by number of sold properties
   * @return totalValueOfSales
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_VALUE_OF_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalValueOfSales() {
    return totalValueOfSales;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_VALUE_OF_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalValueOfSales(Double totalValueOfSales) {
    this.totalValueOfSales = totalValueOfSales;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertySalesReportGet200ResponseValueSales propertySalesReportGet200ResponseValueSales = (PropertySalesReportGet200ResponseValueSales) o;
    return Objects.equals(this.count, propertySalesReportGet200ResponseValueSales.count) &&
        Objects.equals(this.feesFromSales, propertySalesReportGet200ResponseValueSales.feesFromSales) &&
        Objects.equals(this.averageSalePrice, propertySalesReportGet200ResponseValueSales.averageSalePrice) &&
        Objects.equals(this.totalValueOfSales, propertySalesReportGet200ResponseValueSales.totalValueOfSales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, feesFromSales, averageSalePrice, totalValueOfSales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertySalesReportGet200ResponseValueSales {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    feesFromSales: ").append(toIndentedString(feesFromSales)).append("\n");
    sb.append("    averageSalePrice: ").append(toIndentedString(averageSalePrice)).append("\n");
    sb.append("    totalValueOfSales: ").append(toIndentedString(totalValueOfSales)).append("\n");
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
