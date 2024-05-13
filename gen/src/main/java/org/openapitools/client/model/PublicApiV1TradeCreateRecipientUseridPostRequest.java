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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PublicApiV1TradeCreateRecipientUseridPostRequest
 */
@JsonPropertyOrder({
  PublicApiV1TradeCreateRecipientUseridPostRequest.JSON_PROPERTY_REQUESTER_OFFER_ROBUX,
  PublicApiV1TradeCreateRecipientUseridPostRequest.JSON_PROPERTY_TARGET_OFFER_ROBUX,
  PublicApiV1TradeCreateRecipientUseridPostRequest.JSON_PROPERTY_REQUESTER_OFFER_U_A_I_DS,
  PublicApiV1TradeCreateRecipientUseridPostRequest.JSON_PROPERTY_TARGET_OFFER_U_A_I_DS,
  PublicApiV1TradeCreateRecipientUseridPostRequest.JSON_PROPERTY_TO_T_P_CODE
})
@JsonTypeName("_public_api_v1_trade_create__recipient_userid__post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PublicApiV1TradeCreateRecipientUseridPostRequest {
  public static final String JSON_PROPERTY_REQUESTER_OFFER_ROBUX = "RequesterOfferRobux";
  private Integer requesterOfferRobux;

  public static final String JSON_PROPERTY_TARGET_OFFER_ROBUX = "TargetOfferRobux";
  private Integer targetOfferRobux;

  public static final String JSON_PROPERTY_REQUESTER_OFFER_U_A_I_DS = "RequesterOfferUAIDs";
  private List<Integer> requesterOfferUAIDs;

  public static final String JSON_PROPERTY_TARGET_OFFER_U_A_I_DS = "TargetOfferUAIDs";
  private List<Integer> targetOfferUAIDs;

  public static final String JSON_PROPERTY_TO_T_P_CODE = "TOTPCode";
  private Integer toTPCode;

  public PublicApiV1TradeCreateRecipientUseridPostRequest() {
  }

  public PublicApiV1TradeCreateRecipientUseridPostRequest requesterOfferRobux(Integer requesterOfferRobux) {
    
    this.requesterOfferRobux = requesterOfferRobux;
    return this;
  }

   /**
   * Get requesterOfferRobux
   * @return requesterOfferRobux
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTER_OFFER_ROBUX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRequesterOfferRobux() {
    return requesterOfferRobux;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTER_OFFER_ROBUX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequesterOfferRobux(Integer requesterOfferRobux) {
    this.requesterOfferRobux = requesterOfferRobux;
  }


  public PublicApiV1TradeCreateRecipientUseridPostRequest targetOfferRobux(Integer targetOfferRobux) {
    
    this.targetOfferRobux = targetOfferRobux;
    return this;
  }

   /**
   * Get targetOfferRobux
   * @return targetOfferRobux
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_OFFER_ROBUX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetOfferRobux() {
    return targetOfferRobux;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_OFFER_ROBUX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetOfferRobux(Integer targetOfferRobux) {
    this.targetOfferRobux = targetOfferRobux;
  }


  public PublicApiV1TradeCreateRecipientUseridPostRequest requesterOfferUAIDs(List<Integer> requesterOfferUAIDs) {
    
    this.requesterOfferUAIDs = requesterOfferUAIDs;
    return this;
  }

  public PublicApiV1TradeCreateRecipientUseridPostRequest addRequesterOfferUAIDsItem(Integer requesterOfferUAIDsItem) {
    if (this.requesterOfferUAIDs == null) {
      this.requesterOfferUAIDs = new ArrayList<>();
    }
    this.requesterOfferUAIDs.add(requesterOfferUAIDsItem);
    return this;
  }

   /**
   * Get requesterOfferUAIDs
   * @return requesterOfferUAIDs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTER_OFFER_U_A_I_DS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getRequesterOfferUAIDs() {
    return requesterOfferUAIDs;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTER_OFFER_U_A_I_DS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequesterOfferUAIDs(List<Integer> requesterOfferUAIDs) {
    this.requesterOfferUAIDs = requesterOfferUAIDs;
  }


  public PublicApiV1TradeCreateRecipientUseridPostRequest targetOfferUAIDs(List<Integer> targetOfferUAIDs) {
    
    this.targetOfferUAIDs = targetOfferUAIDs;
    return this;
  }

  public PublicApiV1TradeCreateRecipientUseridPostRequest addTargetOfferUAIDsItem(Integer targetOfferUAIDsItem) {
    if (this.targetOfferUAIDs == null) {
      this.targetOfferUAIDs = new ArrayList<>();
    }
    this.targetOfferUAIDs.add(targetOfferUAIDsItem);
    return this;
  }

   /**
   * Get targetOfferUAIDs
   * @return targetOfferUAIDs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_OFFER_U_A_I_DS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTargetOfferUAIDs() {
    return targetOfferUAIDs;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_OFFER_U_A_I_DS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetOfferUAIDs(List<Integer> targetOfferUAIDs) {
    this.targetOfferUAIDs = targetOfferUAIDs;
  }


  public PublicApiV1TradeCreateRecipientUseridPostRequest toTPCode(Integer toTPCode) {
    
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
    PublicApiV1TradeCreateRecipientUseridPostRequest publicApiV1TradeCreateRecipientUseridPostRequest = (PublicApiV1TradeCreateRecipientUseridPostRequest) o;
    return Objects.equals(this.requesterOfferRobux, publicApiV1TradeCreateRecipientUseridPostRequest.requesterOfferRobux) &&
        Objects.equals(this.targetOfferRobux, publicApiV1TradeCreateRecipientUseridPostRequest.targetOfferRobux) &&
        Objects.equals(this.requesterOfferUAIDs, publicApiV1TradeCreateRecipientUseridPostRequest.requesterOfferUAIDs) &&
        Objects.equals(this.targetOfferUAIDs, publicApiV1TradeCreateRecipientUseridPostRequest.targetOfferUAIDs) &&
        Objects.equals(this.toTPCode, publicApiV1TradeCreateRecipientUseridPostRequest.toTPCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requesterOfferRobux, targetOfferRobux, requesterOfferUAIDs, targetOfferUAIDs, toTPCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicApiV1TradeCreateRecipientUseridPostRequest {\n");
    sb.append("    requesterOfferRobux: ").append(toIndentedString(requesterOfferRobux)).append("\n");
    sb.append("    targetOfferRobux: ").append(toIndentedString(targetOfferRobux)).append("\n");
    sb.append("    requesterOfferUAIDs: ").append(toIndentedString(requesterOfferUAIDs)).append("\n");
    sb.append("    targetOfferUAIDs: ").append(toIndentedString(targetOfferUAIDs)).append("\n");
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

