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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstocklistRequest
 */
@JsonPropertyOrder({
  CarstocklistRequest.JSON_PROPERTY_CAR_STOCK_IDS,
  CarstocklistRequest.JSON_PROPERTY_TENANT_ID
})
@JsonTypeName("carstocklistRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstocklistRequest {
  public static final String JSON_PROPERTY_CAR_STOCK_IDS = "carStockIds";
  private List<Integer> carStockIds;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private Integer tenantId;

  public CarstocklistRequest() {
  }

  public CarstocklistRequest carStockIds(List<Integer> carStockIds) {
    
    this.carStockIds = carStockIds;
    return this;
  }

  public CarstocklistRequest addCarStockIdsItem(Integer carStockIdsItem) {
    if (this.carStockIds == null) {
      this.carStockIds = new ArrayList<>();
    }
    this.carStockIds.add(carStockIdsItem);
    return this;
  }

   /**
   * Get carStockIds
   * @return carStockIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAR_STOCK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getCarStockIds() {
    return carStockIds;
  }


  @JsonProperty(JSON_PROPERTY_CAR_STOCK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarStockIds(List<Integer> carStockIds) {
    this.carStockIds = carStockIds;
  }


  public CarstocklistRequest tenantId(Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstocklistRequest carstocklistRequest = (CarstocklistRequest) o;
    return Objects.equals(this.carStockIds, carstocklistRequest.carStockIds) &&
        Objects.equals(this.tenantId, carstocklistRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carStockIds, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstocklistRequest {\n");
    sb.append("    carStockIds: ").append(toIndentedString(carStockIds)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
