/*
 * Customer Authorization API
 *  # Introduction Customer Authorization API The Customer Authorization API is the web service that allows you to exchange your application's `Client ID` and `Client Secret` for an `Access Token`. You will need to use the `accessToken` as authentication for all the other web requests, in the form of a HTTP Header as it follows: ``` Authorization: Bearer {accessToken} ```   Data API The Data API is the web service that allows you to obtain three kinds of data related to your users:    - Bank Account data   - Bank Transactions data   - Credit Score (VS 4.0) data   - Credit Report (VS 4.0) data 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: vs4plus@vantagescore.com
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
 * ClaimFeatures
 */
@JsonPropertyOrder({
  ClaimFeatures.JSON_PROPERTY_COVERAGE_TYPE,
  ClaimFeatures.JSON_PROPERTY_LOSS_TYPE,
  ClaimFeatures.JSON_PROPERTY_SETTLEMENT_AMOUNT,
  ClaimFeatures.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ClaimFeatures {
  public static final String JSON_PROPERTY_COVERAGE_TYPE = "coverageType";
  private String coverageType;

  public static final String JSON_PROPERTY_LOSS_TYPE = "lossType";
  private String lossType;

  public static final String JSON_PROPERTY_SETTLEMENT_AMOUNT = "settlementAmount";
  private Integer settlementAmount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public ClaimFeatures() {
  }

  public ClaimFeatures coverageType(String coverageType) {
    
    this.coverageType = coverageType;
    return this;
  }

   /**
   * Get coverageType
   * @return coverageType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverageType() {
    return coverageType;
  }


  @JsonProperty(JSON_PROPERTY_COVERAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverageType(String coverageType) {
    this.coverageType = coverageType;
  }


  public ClaimFeatures lossType(String lossType) {
    
    this.lossType = lossType;
    return this;
  }

   /**
   * Get lossType
   * @return lossType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOSS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLossType() {
    return lossType;
  }


  @JsonProperty(JSON_PROPERTY_LOSS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLossType(String lossType) {
    this.lossType = lossType;
  }


  public ClaimFeatures settlementAmount(Integer settlementAmount) {
    
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * Get settlementAmount
   * @return settlementAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSettlementAmount() {
    return settlementAmount;
  }


  @JsonProperty(JSON_PROPERTY_SETTLEMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettlementAmount(Integer settlementAmount) {
    this.settlementAmount = settlementAmount;
  }


  public ClaimFeatures status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimFeatures claimFeatures = (ClaimFeatures) o;
    return Objects.equals(this.coverageType, claimFeatures.coverageType) &&
        Objects.equals(this.lossType, claimFeatures.lossType) &&
        Objects.equals(this.settlementAmount, claimFeatures.settlementAmount) &&
        Objects.equals(this.status, claimFeatures.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverageType, lossType, settlementAmount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimFeatures {\n");
    sb.append("    coverageType: ").append(toIndentedString(coverageType)).append("\n");
    sb.append("    lossType: ").append(toIndentedString(lossType)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

