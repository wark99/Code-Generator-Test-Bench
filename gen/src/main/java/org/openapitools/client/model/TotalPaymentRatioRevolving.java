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
 * TotalPaymentRatioRevolving
 */
@JsonPropertyOrder({
  TotalPaymentRatioRevolving.JSON_PROPERTY_PAYMENTS12_MONTHS_AGO,
  TotalPaymentRatioRevolving.JSON_PROPERTY_PAYMENTS1_MONTH_AGO,
  TotalPaymentRatioRevolving.JSON_PROPERTY_PAYMENTS6_MONTHS_AGO,
  TotalPaymentRatioRevolving.JSON_PROPERTY_TPR12_MONTHS,
  TotalPaymentRatioRevolving.JSON_PROPERTY_TPR12_MONTHS_AVERAGE,
  TotalPaymentRatioRevolving.JSON_PROPERTY_TPR1_MONTH,
  TotalPaymentRatioRevolving.JSON_PROPERTY_TPR6_MONTHS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TotalPaymentRatioRevolving {
  public static final String JSON_PROPERTY_PAYMENTS12_MONTHS_AGO = "payments12MonthsAgo";
  private String payments12MonthsAgo;

  public static final String JSON_PROPERTY_PAYMENTS1_MONTH_AGO = "payments1MonthAgo";
  private String payments1MonthAgo;

  public static final String JSON_PROPERTY_PAYMENTS6_MONTHS_AGO = "payments6MonthsAgo";
  private String payments6MonthsAgo;

  public static final String JSON_PROPERTY_TPR12_MONTHS = "tpr12Months";
  private String tpr12Months;

  public static final String JSON_PROPERTY_TPR12_MONTHS_AVERAGE = "tpr12MonthsAverage";
  private String tpr12MonthsAverage;

  public static final String JSON_PROPERTY_TPR1_MONTH = "tpr1Month";
  private String tpr1Month;

  public static final String JSON_PROPERTY_TPR6_MONTHS = "tpr6Months";
  private String tpr6Months;

  public TotalPaymentRatioRevolving() {
  }

  public TotalPaymentRatioRevolving payments12MonthsAgo(String payments12MonthsAgo) {
    
    this.payments12MonthsAgo = payments12MonthsAgo;
    return this;
  }

   /**
   * Get payments12MonthsAgo
   * @return payments12MonthsAgo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENTS12_MONTHS_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayments12MonthsAgo() {
    return payments12MonthsAgo;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS12_MONTHS_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayments12MonthsAgo(String payments12MonthsAgo) {
    this.payments12MonthsAgo = payments12MonthsAgo;
  }


  public TotalPaymentRatioRevolving payments1MonthAgo(String payments1MonthAgo) {
    
    this.payments1MonthAgo = payments1MonthAgo;
    return this;
  }

   /**
   * Get payments1MonthAgo
   * @return payments1MonthAgo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENTS1_MONTH_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayments1MonthAgo() {
    return payments1MonthAgo;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS1_MONTH_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayments1MonthAgo(String payments1MonthAgo) {
    this.payments1MonthAgo = payments1MonthAgo;
  }


  public TotalPaymentRatioRevolving payments6MonthsAgo(String payments6MonthsAgo) {
    
    this.payments6MonthsAgo = payments6MonthsAgo;
    return this;
  }

   /**
   * Get payments6MonthsAgo
   * @return payments6MonthsAgo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENTS6_MONTHS_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayments6MonthsAgo() {
    return payments6MonthsAgo;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS6_MONTHS_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayments6MonthsAgo(String payments6MonthsAgo) {
    this.payments6MonthsAgo = payments6MonthsAgo;
  }


  public TotalPaymentRatioRevolving tpr12Months(String tpr12Months) {
    
    this.tpr12Months = tpr12Months;
    return this;
  }

   /**
   * Get tpr12Months
   * @return tpr12Months
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TPR12_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTpr12Months() {
    return tpr12Months;
  }


  @JsonProperty(JSON_PROPERTY_TPR12_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTpr12Months(String tpr12Months) {
    this.tpr12Months = tpr12Months;
  }


  public TotalPaymentRatioRevolving tpr12MonthsAverage(String tpr12MonthsAverage) {
    
    this.tpr12MonthsAverage = tpr12MonthsAverage;
    return this;
  }

   /**
   * Get tpr12MonthsAverage
   * @return tpr12MonthsAverage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TPR12_MONTHS_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTpr12MonthsAverage() {
    return tpr12MonthsAverage;
  }


  @JsonProperty(JSON_PROPERTY_TPR12_MONTHS_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTpr12MonthsAverage(String tpr12MonthsAverage) {
    this.tpr12MonthsAverage = tpr12MonthsAverage;
  }


  public TotalPaymentRatioRevolving tpr1Month(String tpr1Month) {
    
    this.tpr1Month = tpr1Month;
    return this;
  }

   /**
   * Get tpr1Month
   * @return tpr1Month
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TPR1_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTpr1Month() {
    return tpr1Month;
  }


  @JsonProperty(JSON_PROPERTY_TPR1_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTpr1Month(String tpr1Month) {
    this.tpr1Month = tpr1Month;
  }


  public TotalPaymentRatioRevolving tpr6Months(String tpr6Months) {
    
    this.tpr6Months = tpr6Months;
    return this;
  }

   /**
   * Get tpr6Months
   * @return tpr6Months
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TPR6_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTpr6Months() {
    return tpr6Months;
  }


  @JsonProperty(JSON_PROPERTY_TPR6_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTpr6Months(String tpr6Months) {
    this.tpr6Months = tpr6Months;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalPaymentRatioRevolving totalPaymentRatioRevolving = (TotalPaymentRatioRevolving) o;
    return Objects.equals(this.payments12MonthsAgo, totalPaymentRatioRevolving.payments12MonthsAgo) &&
        Objects.equals(this.payments1MonthAgo, totalPaymentRatioRevolving.payments1MonthAgo) &&
        Objects.equals(this.payments6MonthsAgo, totalPaymentRatioRevolving.payments6MonthsAgo) &&
        Objects.equals(this.tpr12Months, totalPaymentRatioRevolving.tpr12Months) &&
        Objects.equals(this.tpr12MonthsAverage, totalPaymentRatioRevolving.tpr12MonthsAverage) &&
        Objects.equals(this.tpr1Month, totalPaymentRatioRevolving.tpr1Month) &&
        Objects.equals(this.tpr6Months, totalPaymentRatioRevolving.tpr6Months);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments12MonthsAgo, payments1MonthAgo, payments6MonthsAgo, tpr12Months, tpr12MonthsAverage, tpr1Month, tpr6Months);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalPaymentRatioRevolving {\n");
    sb.append("    payments12MonthsAgo: ").append(toIndentedString(payments12MonthsAgo)).append("\n");
    sb.append("    payments1MonthAgo: ").append(toIndentedString(payments1MonthAgo)).append("\n");
    sb.append("    payments6MonthsAgo: ").append(toIndentedString(payments6MonthsAgo)).append("\n");
    sb.append("    tpr12Months: ").append(toIndentedString(tpr12Months)).append("\n");
    sb.append("    tpr12MonthsAverage: ").append(toIndentedString(tpr12MonthsAverage)).append("\n");
    sb.append("    tpr1Month: ").append(toIndentedString(tpr1Month)).append("\n");
    sb.append("    tpr6Months: ").append(toIndentedString(tpr6Months)).append("\n");
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

