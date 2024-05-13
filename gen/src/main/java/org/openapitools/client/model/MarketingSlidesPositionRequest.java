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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MarketingSlidesPositionRequest
 */
@JsonPropertyOrder({
  MarketingSlidesPositionRequest.JSON_PROPERTY_CAR_STOCK_ID,
  MarketingSlidesPositionRequest.JSON_PROPERTY_TENANT_ID,
  MarketingSlidesPositionRequest.JSON_PROPERTY_MARKETING_SLIDE_ID,
  MarketingSlidesPositionRequest.JSON_PROPERTY_POSITION
})
@JsonTypeName("marketingSlidesPositionRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MarketingSlidesPositionRequest {
  public static final String JSON_PROPERTY_CAR_STOCK_ID = "carStockId";
  private Integer carStockId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private Integer tenantId;

  public static final String JSON_PROPERTY_MARKETING_SLIDE_ID = "marketingSlideId";
  private Integer marketingSlideId;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Integer position;

  public MarketingSlidesPositionRequest() {
  }

  public MarketingSlidesPositionRequest carStockId(Integer carStockId) {
    
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


  public MarketingSlidesPositionRequest tenantId(Integer tenantId) {
    
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


  public MarketingSlidesPositionRequest marketingSlideId(Integer marketingSlideId) {
    
    this.marketingSlideId = marketingSlideId;
    return this;
  }

   /**
   * Get marketingSlideId
   * @return marketingSlideId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_SLIDE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMarketingSlideId() {
    return marketingSlideId;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_SLIDE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingSlideId(Integer marketingSlideId) {
    this.marketingSlideId = marketingSlideId;
  }


  public MarketingSlidesPositionRequest position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(Integer position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingSlidesPositionRequest marketingSlidesPositionRequest = (MarketingSlidesPositionRequest) o;
    return Objects.equals(this.carStockId, marketingSlidesPositionRequest.carStockId) &&
        Objects.equals(this.tenantId, marketingSlidesPositionRequest.tenantId) &&
        Objects.equals(this.marketingSlideId, marketingSlidesPositionRequest.marketingSlideId) &&
        Objects.equals(this.position, marketingSlidesPositionRequest.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carStockId, tenantId, marketingSlideId, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketingSlidesPositionRequest {\n");
    sb.append("    carStockId: ").append(toIndentedString(carStockId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    marketingSlideId: ").append(toIndentedString(marketingSlideId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

