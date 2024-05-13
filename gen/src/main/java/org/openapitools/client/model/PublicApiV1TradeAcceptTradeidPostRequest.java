/*
 * Syntax Public API
 * Documentation for the Public API
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
 * PublicApiV1TradeAcceptTradeidPostRequest
 */
@JsonPropertyOrder({
  PublicApiV1TradeAcceptTradeidPostRequest.JSON_PROPERTY_TO_T_P_CODE
})
@JsonTypeName("_public_api_v1_trade_accept__tradeid__post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PublicApiV1TradeAcceptTradeidPostRequest {
  public static final String JSON_PROPERTY_TO_T_P_CODE = "TOTPCode";
  private Integer toTPCode;

  public PublicApiV1TradeAcceptTradeidPostRequest() {
  }

  public PublicApiV1TradeAcceptTradeidPostRequest toTPCode(Integer toTPCode) {
    
    this.toTPCode = toTPCode;
    return this;
  }

   /**
   * Get toTPCode
   * @return toTPCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_T_P_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getToTPCode() {
    return toTPCode;
  }


  @JsonProperty(JSON_PROPERTY_TO_T_P_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToTPCode(Integer toTPCode) {
    this.toTPCode = toTPCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicApiV1TradeAcceptTradeidPostRequest publicApiV1TradeAcceptTradeidPostRequest = (PublicApiV1TradeAcceptTradeidPostRequest) o;
    return Objects.equals(this.toTPCode, publicApiV1TradeAcceptTradeidPostRequest.toTPCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toTPCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicApiV1TradeAcceptTradeidPostRequest {\n");
    sb.append("    toTPCode: ").append(toIndentedString(toTPCode)).append("\n");
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

