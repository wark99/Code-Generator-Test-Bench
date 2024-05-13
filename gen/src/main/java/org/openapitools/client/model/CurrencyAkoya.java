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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CurrencyAkoya
 */
@JsonPropertyOrder({
  CurrencyAkoya.JSON_PROPERTY_CURRENCY_CODE,
  CurrencyAkoya.JSON_PROPERTY_CURRENCY_RATE,
  CurrencyAkoya.JSON_PROPERTY_ORIGINAL_CURRENCY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CurrencyAkoya {
  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_CURRENCY_RATE = "currencyRate";
  private BigDecimal currencyRate;

  public static final String JSON_PROPERTY_ORIGINAL_CURRENCY_CODE = "originalCurrencyCode";
  private String originalCurrencyCode;

  public CurrencyAkoya() {
  }

  public CurrencyAkoya currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public CurrencyAkoya currencyRate(BigDecimal currencyRate) {
    
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * Get currencyRate
   * @return currencyRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCurrencyRate() {
    return currencyRate;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyRate(BigDecimal currencyRate) {
    this.currencyRate = currencyRate;
  }


  public CurrencyAkoya originalCurrencyCode(String originalCurrencyCode) {
    
    this.originalCurrencyCode = originalCurrencyCode;
    return this;
  }

   /**
   * Get originalCurrencyCode
   * @return originalCurrencyCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalCurrencyCode() {
    return originalCurrencyCode;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalCurrencyCode(String originalCurrencyCode) {
    this.originalCurrencyCode = originalCurrencyCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyAkoya currencyAkoya = (CurrencyAkoya) o;
    return Objects.equals(this.currencyCode, currencyAkoya.currencyCode) &&
        Objects.equals(this.currencyRate, currencyAkoya.currencyRate) &&
        Objects.equals(this.originalCurrencyCode, currencyAkoya.originalCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencyRate, originalCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyAkoya {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    originalCurrencyCode: ").append(toIndentedString(originalCurrencyCode)).append("\n");
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

