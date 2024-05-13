/*
 * 의류 보관 서비스 API
 * 의류 보관 서비스를 위한 API 명세서
 *
 * The version of the OpenAPI document: 1.0.0
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
 * ClothesReturnPostRequest
 */
@JsonPropertyOrder({
  ClothesReturnPostRequest.JSON_PROPERTY_ORDER_ID,
  ClothesReturnPostRequest.JSON_PROPERTY_TOKEN
})
@JsonTypeName("_clothes_return_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:22.823821767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ClothesReturnPostRequest {
  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private Integer orderId;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public ClothesReturnPostRequest() {
  }

  public ClothesReturnPostRequest orderId(Integer orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 반환을 요청하는 주문 ID
   * @return orderId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public ClothesReturnPostRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * 사용자의 인증 토큰
   * @return token
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClothesReturnPostRequest clothesReturnPostRequest = (ClothesReturnPostRequest) o;
    return Objects.equals(this.orderId, clothesReturnPostRequest.orderId) &&
        Objects.equals(this.token, clothesReturnPostRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClothesReturnPostRequest {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

