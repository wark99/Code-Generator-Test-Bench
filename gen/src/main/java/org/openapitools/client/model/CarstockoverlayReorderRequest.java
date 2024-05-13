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
 * CarstockoverlayReorderRequest
 */
@JsonPropertyOrder({
  CarstockoverlayReorderRequest.JSON_PROPERTY_TENANT_ID,
  CarstockoverlayReorderRequest.JSON_PROPERTY_USER_ID,
  CarstockoverlayReorderRequest.JSON_PROPERTY_CAR_STOCK_ID,
  CarstockoverlayReorderRequest.JSON_PROPERTY_OVERLAY_IDS
})
@JsonTypeName("carstockoverlayReorderRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockoverlayReorderRequest {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private Integer tenantId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Integer userId;

  public static final String JSON_PROPERTY_CAR_STOCK_ID = "carStockId";
  private Integer carStockId;

  public static final String JSON_PROPERTY_OVERLAY_IDS = "overlayIds";
  private List<Integer> overlayIds;

  public CarstockoverlayReorderRequest() {
  }

  public CarstockoverlayReorderRequest tenantId(Integer tenantId) {
    
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


  public CarstockoverlayReorderRequest userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public CarstockoverlayReorderRequest carStockId(Integer carStockId) {
    
    this.carStockId = carStockId;
    return this;
  }

   /**
   * Get carStockId
   * @return carStockId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAR_STOCK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCarStockId() {
    return carStockId;
  }


  @JsonProperty(JSON_PROPERTY_CAR_STOCK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarStockId(Integer carStockId) {
    this.carStockId = carStockId;
  }


  public CarstockoverlayReorderRequest overlayIds(List<Integer> overlayIds) {
    
    this.overlayIds = overlayIds;
    return this;
  }

  public CarstockoverlayReorderRequest addOverlayIdsItem(Integer overlayIdsItem) {
    if (this.overlayIds == null) {
      this.overlayIds = new ArrayList<>();
    }
    this.overlayIds.add(overlayIdsItem);
    return this;
  }

   /**
   * Get overlayIds
   * @return overlayIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERLAY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getOverlayIds() {
    return overlayIds;
  }


  @JsonProperty(JSON_PROPERTY_OVERLAY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverlayIds(List<Integer> overlayIds) {
    this.overlayIds = overlayIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockoverlayReorderRequest carstockoverlayReorderRequest = (CarstockoverlayReorderRequest) o;
    return Objects.equals(this.tenantId, carstockoverlayReorderRequest.tenantId) &&
        Objects.equals(this.userId, carstockoverlayReorderRequest.userId) &&
        Objects.equals(this.carStockId, carstockoverlayReorderRequest.carStockId) &&
        Objects.equals(this.overlayIds, carstockoverlayReorderRequest.overlayIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, userId, carStockId, overlayIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockoverlayReorderRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    carStockId: ").append(toIndentedString(carStockId)).append("\n");
    sb.append("    overlayIds: ").append(toIndentedString(overlayIds)).append("\n");
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
