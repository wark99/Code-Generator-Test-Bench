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
import org.openapitools.client.model.MostRecentPayment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RevolvingAmount
 */
@JsonPropertyOrder({
  RevolvingAmount.JSON_PROPERTY_CREDIT_LIMIT,
  RevolvingAmount.JSON_PROPERTY_CURRENT_BALANCE,
  RevolvingAmount.JSON_PROPERTY_CURRENT_PAYMENT_DUE,
  RevolvingAmount.JSON_PROPERTY_ESTIMATED_SPEND,
  RevolvingAmount.JSON_PROPERTY_HIGH_CREDIT,
  RevolvingAmount.JSON_PROPERTY_MONTHLY_PAYMENT,
  RevolvingAmount.JSON_PROPERTY_MOST_RECENT_PAYMENT,
  RevolvingAmount.JSON_PROPERTY_PAST_DUE,
  RevolvingAmount.JSON_PROPERTY_PERCENT_AVAILABLE_CREDIT,
  RevolvingAmount.JSON_PROPERTY_PRIOR_PAYMENT_DUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RevolvingAmount {
  public static final String JSON_PROPERTY_CREDIT_LIMIT = "creditLimit";
  private String creditLimit;

  public static final String JSON_PROPERTY_CURRENT_BALANCE = "currentBalance";
  private String currentBalance;

  public static final String JSON_PROPERTY_CURRENT_PAYMENT_DUE = "currentPaymentDue";
  private String currentPaymentDue;

  public static final String JSON_PROPERTY_ESTIMATED_SPEND = "estimatedSpend";
  private String estimatedSpend;

  public static final String JSON_PROPERTY_HIGH_CREDIT = "highCredit";
  private String highCredit;

  public static final String JSON_PROPERTY_MONTHLY_PAYMENT = "monthlyPayment";
  private String monthlyPayment;

  public static final String JSON_PROPERTY_MOST_RECENT_PAYMENT = "mostRecentPayment";
  private MostRecentPayment mostRecentPayment;

  public static final String JSON_PROPERTY_PAST_DUE = "pastDue";
  private String pastDue;

  public static final String JSON_PROPERTY_PERCENT_AVAILABLE_CREDIT = "percentAvailableCredit";
  private String percentAvailableCredit;

  public static final String JSON_PROPERTY_PRIOR_PAYMENT_DUE = "priorPaymentDue";
  private String priorPaymentDue;

  public RevolvingAmount() {
  }

  public RevolvingAmount creditLimit(String creditLimit) {
    
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditLimit() {
    return creditLimit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditLimit(String creditLimit) {
    this.creditLimit = creditLimit;
  }


  public RevolvingAmount currentBalance(String currentBalance) {
    
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * @return currentBalance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalance() {
    return currentBalance;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalance(String currentBalance) {
    this.currentBalance = currentBalance;
  }


  public RevolvingAmount currentPaymentDue(String currentPaymentDue) {
    
    this.currentPaymentDue = currentPaymentDue;
    return this;
  }

   /**
   * Get currentPaymentDue
   * @return currentPaymentDue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PAYMENT_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentPaymentDue() {
    return currentPaymentDue;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PAYMENT_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPaymentDue(String currentPaymentDue) {
    this.currentPaymentDue = currentPaymentDue;
  }


  public RevolvingAmount estimatedSpend(String estimatedSpend) {
    
    this.estimatedSpend = estimatedSpend;
    return this;
  }

   /**
   * Get estimatedSpend
   * @return estimatedSpend
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_SPEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEstimatedSpend() {
    return estimatedSpend;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_SPEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedSpend(String estimatedSpend) {
    this.estimatedSpend = estimatedSpend;
  }


  public RevolvingAmount highCredit(String highCredit) {
    
    this.highCredit = highCredit;
    return this;
  }

   /**
   * Get highCredit
   * @return highCredit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHighCredit() {
    return highCredit;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighCredit(String highCredit) {
    this.highCredit = highCredit;
  }


  public RevolvingAmount monthlyPayment(String monthlyPayment) {
    
    this.monthlyPayment = monthlyPayment;
    return this;
  }

   /**
   * Get monthlyPayment
   * @return monthlyPayment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonthlyPayment() {
    return monthlyPayment;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyPayment(String monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }


  public RevolvingAmount mostRecentPayment(MostRecentPayment mostRecentPayment) {
    
    this.mostRecentPayment = mostRecentPayment;
    return this;
  }

   /**
   * Get mostRecentPayment
   * @return mostRecentPayment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOST_RECENT_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MostRecentPayment getMostRecentPayment() {
    return mostRecentPayment;
  }


  @JsonProperty(JSON_PROPERTY_MOST_RECENT_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMostRecentPayment(MostRecentPayment mostRecentPayment) {
    this.mostRecentPayment = mostRecentPayment;
  }


  public RevolvingAmount pastDue(String pastDue) {
    
    this.pastDue = pastDue;
    return this;
  }

   /**
   * Get pastDue
   * @return pastDue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAST_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPastDue() {
    return pastDue;
  }


  @JsonProperty(JSON_PROPERTY_PAST_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPastDue(String pastDue) {
    this.pastDue = pastDue;
  }


  public RevolvingAmount percentAvailableCredit(String percentAvailableCredit) {
    
    this.percentAvailableCredit = percentAvailableCredit;
    return this;
  }

   /**
   * Get percentAvailableCredit
   * @return percentAvailableCredit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENT_AVAILABLE_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPercentAvailableCredit() {
    return percentAvailableCredit;
  }


  @JsonProperty(JSON_PROPERTY_PERCENT_AVAILABLE_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentAvailableCredit(String percentAvailableCredit) {
    this.percentAvailableCredit = percentAvailableCredit;
  }


  public RevolvingAmount priorPaymentDue(String priorPaymentDue) {
    
    this.priorPaymentDue = priorPaymentDue;
    return this;
  }

   /**
   * Get priorPaymentDue
   * @return priorPaymentDue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIOR_PAYMENT_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPriorPaymentDue() {
    return priorPaymentDue;
  }


  @JsonProperty(JSON_PROPERTY_PRIOR_PAYMENT_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriorPaymentDue(String priorPaymentDue) {
    this.priorPaymentDue = priorPaymentDue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevolvingAmount revolvingAmount = (RevolvingAmount) o;
    return Objects.equals(this.creditLimit, revolvingAmount.creditLimit) &&
        Objects.equals(this.currentBalance, revolvingAmount.currentBalance) &&
        Objects.equals(this.currentPaymentDue, revolvingAmount.currentPaymentDue) &&
        Objects.equals(this.estimatedSpend, revolvingAmount.estimatedSpend) &&
        Objects.equals(this.highCredit, revolvingAmount.highCredit) &&
        Objects.equals(this.monthlyPayment, revolvingAmount.monthlyPayment) &&
        Objects.equals(this.mostRecentPayment, revolvingAmount.mostRecentPayment) &&
        Objects.equals(this.pastDue, revolvingAmount.pastDue) &&
        Objects.equals(this.percentAvailableCredit, revolvingAmount.percentAvailableCredit) &&
        Objects.equals(this.priorPaymentDue, revolvingAmount.priorPaymentDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, currentBalance, currentPaymentDue, estimatedSpend, highCredit, monthlyPayment, mostRecentPayment, pastDue, percentAvailableCredit, priorPaymentDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevolvingAmount {\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    currentPaymentDue: ").append(toIndentedString(currentPaymentDue)).append("\n");
    sb.append("    estimatedSpend: ").append(toIndentedString(estimatedSpend)).append("\n");
    sb.append("    highCredit: ").append(toIndentedString(highCredit)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    mostRecentPayment: ").append(toIndentedString(mostRecentPayment)).append("\n");
    sb.append("    pastDue: ").append(toIndentedString(pastDue)).append("\n");
    sb.append("    percentAvailableCredit: ").append(toIndentedString(percentAvailableCredit)).append("\n");
    sb.append("    priorPaymentDue: ").append(toIndentedString(priorPaymentDue)).append("\n");
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

