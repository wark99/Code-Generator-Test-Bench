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
 * PropertySalesReportGet200ResponseValueNetSales
 */
@JsonPropertyOrder({
  PropertySalesReportGet200ResponseValueNetSales.JSON_PROPERTY_COUNT,
  PropertySalesReportGet200ResponseValueNetSales.JSON_PROPERTY_NET_SALES_FEES
})
@JsonTypeName("_property_sales_report_get_200_response_value_net_sales")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertySalesReportGet200ResponseValueNetSales {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_NET_SALES_FEES = "net_sales_fees";
  private Double netSalesFees;

  public PropertySalesReportGet200ResponseValueNetSales() {
  }

  public PropertySalesReportGet200ResponseValueNetSales count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Total number of sales, fallthroughs, and rejections
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


  public PropertySalesReportGet200ResponseValueNetSales netSalesFees(Double netSalesFees) {
    
    this.netSalesFees = netSalesFees;
    return this;
  }

   /**
   * Total value of sales, fallthroughs, and rejections
   * @return netSalesFees
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_SALES_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNetSalesFees() {
    return netSalesFees;
  }


  @JsonProperty(JSON_PROPERTY_NET_SALES_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetSalesFees(Double netSalesFees) {
    this.netSalesFees = netSalesFees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertySalesReportGet200ResponseValueNetSales propertySalesReportGet200ResponseValueNetSales = (PropertySalesReportGet200ResponseValueNetSales) o;
    return Objects.equals(this.count, propertySalesReportGet200ResponseValueNetSales.count) &&
        Objects.equals(this.netSalesFees, propertySalesReportGet200ResponseValueNetSales.netSalesFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, netSalesFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertySalesReportGet200ResponseValueNetSales {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    netSalesFees: ").append(toIndentedString(netSalesFees)).append("\n");
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
