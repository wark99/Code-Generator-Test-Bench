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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccountRatings;
import org.openapitools.client.model.RecordCounts2;
import org.openapitools.client.model.RevolvingAmount2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditSummary
 */
@JsonPropertyOrder({
  CreditSummary.JSON_PROPERTY_ACCOUNT_RATINGS,
  CreditSummary.JSON_PROPERTY_CLOSED_WITH_BALANCE_AMOUNT,
  CreditSummary.JSON_PROPERTY_INSTALLMENT_AMOUNT,
  CreditSummary.JSON_PROPERTY_MORTGAGE_AMOUNT,
  CreditSummary.JSON_PROPERTY_OPEN_AMOUNT,
  CreditSummary.JSON_PROPERTY_RECORD_COUNTS,
  CreditSummary.JSON_PROPERTY_RETURN_ACCOUNT_RATING,
  CreditSummary.JSON_PROPERTY_REVOLVING_AMOUNT,
  CreditSummary.JSON_PROPERTY_TOTAL_AMOUNT,
  CreditSummary.JSON_PROPERTY_UNSPECIFIED_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreditSummary {
  public static final String JSON_PROPERTY_ACCOUNT_RATINGS = "accountRatings";
  private List<AccountRatings> accountRatings;

  public static final String JSON_PROPERTY_CLOSED_WITH_BALANCE_AMOUNT = "closedWithBalanceAmount";
  private RevolvingAmount2 closedWithBalanceAmount;

  public static final String JSON_PROPERTY_INSTALLMENT_AMOUNT = "installmentAmount";
  private RevolvingAmount2 installmentAmount;

  public static final String JSON_PROPERTY_MORTGAGE_AMOUNT = "mortgageAmount";
  private RevolvingAmount2 mortgageAmount;

  public static final String JSON_PROPERTY_OPEN_AMOUNT = "openAmount";
  private RevolvingAmount2 openAmount;

  public static final String JSON_PROPERTY_RECORD_COUNTS = "recordCounts";
  private RecordCounts2 recordCounts;

  public static final String JSON_PROPERTY_RETURN_ACCOUNT_RATING = "returnAccountRating";
  private Boolean returnAccountRating;

  public static final String JSON_PROPERTY_REVOLVING_AMOUNT = "revolvingAmount";
  private RevolvingAmount2 revolvingAmount;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  private RevolvingAmount2 totalAmount;

  public static final String JSON_PROPERTY_UNSPECIFIED_AMOUNT = "unspecifiedAmount";
  private RevolvingAmount2 unspecifiedAmount;

  public CreditSummary() {
  }

  public CreditSummary accountRatings(List<AccountRatings> accountRatings) {
    
    this.accountRatings = accountRatings;
    return this;
  }

  public CreditSummary addAccountRatingsItem(AccountRatings accountRatingsItem) {
    if (this.accountRatings == null) {
      this.accountRatings = new ArrayList<>();
    }
    this.accountRatings.add(accountRatingsItem);
    return this;
  }

   /**
   * Get accountRatings
   * @return accountRatings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountRatings> getAccountRatings() {
    return accountRatings;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountRatings(List<AccountRatings> accountRatings) {
    this.accountRatings = accountRatings;
  }


  public CreditSummary closedWithBalanceAmount(RevolvingAmount2 closedWithBalanceAmount) {
    
    this.closedWithBalanceAmount = closedWithBalanceAmount;
    return this;
  }

   /**
   * Get closedWithBalanceAmount
   * @return closedWithBalanceAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_WITH_BALANCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getClosedWithBalanceAmount() {
    return closedWithBalanceAmount;
  }


  @JsonProperty(JSON_PROPERTY_CLOSED_WITH_BALANCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosedWithBalanceAmount(RevolvingAmount2 closedWithBalanceAmount) {
    this.closedWithBalanceAmount = closedWithBalanceAmount;
  }


  public CreditSummary installmentAmount(RevolvingAmount2 installmentAmount) {
    
    this.installmentAmount = installmentAmount;
    return this;
  }

   /**
   * Get installmentAmount
   * @return installmentAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALLMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getInstallmentAmount() {
    return installmentAmount;
  }


  @JsonProperty(JSON_PROPERTY_INSTALLMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallmentAmount(RevolvingAmount2 installmentAmount) {
    this.installmentAmount = installmentAmount;
  }


  public CreditSummary mortgageAmount(RevolvingAmount2 mortgageAmount) {
    
    this.mortgageAmount = mortgageAmount;
    return this;
  }

   /**
   * Get mortgageAmount
   * @return mortgageAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MORTGAGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getMortgageAmount() {
    return mortgageAmount;
  }


  @JsonProperty(JSON_PROPERTY_MORTGAGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMortgageAmount(RevolvingAmount2 mortgageAmount) {
    this.mortgageAmount = mortgageAmount;
  }


  public CreditSummary openAmount(RevolvingAmount2 openAmount) {
    
    this.openAmount = openAmount;
    return this;
  }

   /**
   * Get openAmount
   * @return openAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getOpenAmount() {
    return openAmount;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenAmount(RevolvingAmount2 openAmount) {
    this.openAmount = openAmount;
  }


  public CreditSummary recordCounts(RecordCounts2 recordCounts) {
    
    this.recordCounts = recordCounts;
    return this;
  }

   /**
   * Get recordCounts
   * @return recordCounts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordCounts2 getRecordCounts() {
    return recordCounts;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordCounts(RecordCounts2 recordCounts) {
    this.recordCounts = recordCounts;
  }


  public CreditSummary returnAccountRating(Boolean returnAccountRating) {
    
    this.returnAccountRating = returnAccountRating;
    return this;
  }

   /**
   * Get returnAccountRating
   * @return returnAccountRating
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_ACCOUNT_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReturnAccountRating() {
    return returnAccountRating;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ACCOUNT_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnAccountRating(Boolean returnAccountRating) {
    this.returnAccountRating = returnAccountRating;
  }


  public CreditSummary revolvingAmount(RevolvingAmount2 revolvingAmount) {
    
    this.revolvingAmount = revolvingAmount;
    return this;
  }

   /**
   * Get revolvingAmount
   * @return revolvingAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOLVING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getRevolvingAmount() {
    return revolvingAmount;
  }


  @JsonProperty(JSON_PROPERTY_REVOLVING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevolvingAmount(RevolvingAmount2 revolvingAmount) {
    this.revolvingAmount = revolvingAmount;
  }


  public CreditSummary totalAmount(RevolvingAmount2 totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(RevolvingAmount2 totalAmount) {
    this.totalAmount = totalAmount;
  }


  public CreditSummary unspecifiedAmount(RevolvingAmount2 unspecifiedAmount) {
    
    this.unspecifiedAmount = unspecifiedAmount;
    return this;
  }

   /**
   * Get unspecifiedAmount
   * @return unspecifiedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSPECIFIED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingAmount2 getUnspecifiedAmount() {
    return unspecifiedAmount;
  }


  @JsonProperty(JSON_PROPERTY_UNSPECIFIED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnspecifiedAmount(RevolvingAmount2 unspecifiedAmount) {
    this.unspecifiedAmount = unspecifiedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSummary creditSummary = (CreditSummary) o;
    return Objects.equals(this.accountRatings, creditSummary.accountRatings) &&
        Objects.equals(this.closedWithBalanceAmount, creditSummary.closedWithBalanceAmount) &&
        Objects.equals(this.installmentAmount, creditSummary.installmentAmount) &&
        Objects.equals(this.mortgageAmount, creditSummary.mortgageAmount) &&
        Objects.equals(this.openAmount, creditSummary.openAmount) &&
        Objects.equals(this.recordCounts, creditSummary.recordCounts) &&
        Objects.equals(this.returnAccountRating, creditSummary.returnAccountRating) &&
        Objects.equals(this.revolvingAmount, creditSummary.revolvingAmount) &&
        Objects.equals(this.totalAmount, creditSummary.totalAmount) &&
        Objects.equals(this.unspecifiedAmount, creditSummary.unspecifiedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRatings, closedWithBalanceAmount, installmentAmount, mortgageAmount, openAmount, recordCounts, returnAccountRating, revolvingAmount, totalAmount, unspecifiedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSummary {\n");
    sb.append("    accountRatings: ").append(toIndentedString(accountRatings)).append("\n");
    sb.append("    closedWithBalanceAmount: ").append(toIndentedString(closedWithBalanceAmount)).append("\n");
    sb.append("    installmentAmount: ").append(toIndentedString(installmentAmount)).append("\n");
    sb.append("    mortgageAmount: ").append(toIndentedString(mortgageAmount)).append("\n");
    sb.append("    openAmount: ").append(toIndentedString(openAmount)).append("\n");
    sb.append("    recordCounts: ").append(toIndentedString(recordCounts)).append("\n");
    sb.append("    returnAccountRating: ").append(toIndentedString(returnAccountRating)).append("\n");
    sb.append("    revolvingAmount: ").append(toIndentedString(revolvingAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unspecifiedAmount: ").append(toIndentedString(unspecifiedAmount)).append("\n");
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

