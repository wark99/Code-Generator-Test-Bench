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
 * NewBackgroundListPostRequest
 */
@JsonPropertyOrder({
  NewBackgroundListPostRequest.JSON_PROPERTY_TENANT_ID,
  NewBackgroundListPostRequest.JSON_PROPERTY_CAR_STOCK_ID
})
@JsonTypeName("_new_background_list_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class NewBackgroundListPostRequest {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private Integer tenantId;

  public static final String JSON_PROPERTY_CAR_STOCK_ID = "carStockId";
  private Integer carStockId;

  public NewBackgroundListPostRequest() {
  }

  public NewBackgroundListPostRequest tenantId(Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }


  public NewBackgroundListPostRequest carStockId(Integer carStockId) {
    
    this.carStockId = carStockId;
    return this;
  }

   /**
   * Get carStockId
   * @return carStockId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAR_STOCK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCarStockId() {
    return carStockId;
  }


  @JsonProperty(JSON_PROPERTY_CAR_STOCK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCarStockId(Integer carStockId) {
    this.carStockId = carStockId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBackgroundListPostRequest newBackgroundListPostRequest = (NewBackgroundListPostRequest) o;
    return Objects.equals(this.tenantId, newBackgroundListPostRequest.tenantId) &&
        Objects.equals(this.carStockId, newBackgroundListPostRequest.carStockId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, carStockId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBackgroundListPostRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    carStockId: ").append(toIndentedString(carStockId)).append("\n");
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

