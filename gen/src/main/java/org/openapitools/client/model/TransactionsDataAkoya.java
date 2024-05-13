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
import org.openapitools.client.model.DepositTransactionAkoya;
import org.openapitools.client.model.InsuranceTransactionAkoya;
import org.openapitools.client.model.InvestmentTransactionAkoya;
import org.openapitools.client.model.LoanTransactionAkoya;
import org.openapitools.client.model.LocTransactionAkoya;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TransactionsDataAkoya
 */
@JsonPropertyOrder({
  TransactionsDataAkoya.JSON_PROPERTY_DEPOSIT_TRANSACTION,
  TransactionsDataAkoya.JSON_PROPERTY_INVESTMENT_TRANSACTION,
  TransactionsDataAkoya.JSON_PROPERTY_LOAN_TRANSACTION,
  TransactionsDataAkoya.JSON_PROPERTY_LOC_TRANSACTION,
  TransactionsDataAkoya.JSON_PROPERTY_INSURANCE_TRANSACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TransactionsDataAkoya {
  public static final String JSON_PROPERTY_DEPOSIT_TRANSACTION = "depositTransaction";
  private DepositTransactionAkoya depositTransaction;

  public static final String JSON_PROPERTY_INVESTMENT_TRANSACTION = "investmentTransaction";
  private InvestmentTransactionAkoya investmentTransaction;

  public static final String JSON_PROPERTY_LOAN_TRANSACTION = "loanTransaction";
  private LoanTransactionAkoya loanTransaction;

  public static final String JSON_PROPERTY_LOC_TRANSACTION = "locTransaction";
  private LocTransactionAkoya locTransaction;

  public static final String JSON_PROPERTY_INSURANCE_TRANSACTION = "insuranceTransaction";
  private InsuranceTransactionAkoya insuranceTransaction;

  public TransactionsDataAkoya() {
  }

  public TransactionsDataAkoya depositTransaction(DepositTransactionAkoya depositTransaction) {
    
    this.depositTransaction = depositTransaction;
    return this;
  }

   /**
   * Get depositTransaction
   * @return depositTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPOSIT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositTransactionAkoya getDepositTransaction() {
    return depositTransaction;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSIT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepositTransaction(DepositTransactionAkoya depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  public TransactionsDataAkoya investmentTransaction(InvestmentTransactionAkoya investmentTransaction) {
    
    this.investmentTransaction = investmentTransaction;
    return this;
  }

   /**
   * Get investmentTransaction
   * @return investmentTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVESTMENT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvestmentTransactionAkoya getInvestmentTransaction() {
    return investmentTransaction;
  }


  @JsonProperty(JSON_PROPERTY_INVESTMENT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentTransaction(InvestmentTransactionAkoya investmentTransaction) {
    this.investmentTransaction = investmentTransaction;
  }


  public TransactionsDataAkoya loanTransaction(LoanTransactionAkoya loanTransaction) {
    
    this.loanTransaction = loanTransaction;
    return this;
  }

   /**
   * Get loanTransaction
   * @return loanTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOAN_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LoanTransactionAkoya getLoanTransaction() {
    return loanTransaction;
  }


  @JsonProperty(JSON_PROPERTY_LOAN_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoanTransaction(LoanTransactionAkoya loanTransaction) {
    this.loanTransaction = loanTransaction;
  }


  public TransactionsDataAkoya locTransaction(LocTransactionAkoya locTransaction) {
    
    this.locTransaction = locTransaction;
    return this;
  }

   /**
   * Get locTransaction
   * @return locTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOC_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocTransactionAkoya getLocTransaction() {
    return locTransaction;
  }


  @JsonProperty(JSON_PROPERTY_LOC_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocTransaction(LocTransactionAkoya locTransaction) {
    this.locTransaction = locTransaction;
  }


  public TransactionsDataAkoya insuranceTransaction(InsuranceTransactionAkoya insuranceTransaction) {
    
    this.insuranceTransaction = insuranceTransaction;
    return this;
  }

   /**
   * Get insuranceTransaction
   * @return insuranceTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSURANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InsuranceTransactionAkoya getInsuranceTransaction() {
    return insuranceTransaction;
  }


  @JsonProperty(JSON_PROPERTY_INSURANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsuranceTransaction(InsuranceTransactionAkoya insuranceTransaction) {
    this.insuranceTransaction = insuranceTransaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsDataAkoya transactionsDataAkoya = (TransactionsDataAkoya) o;
    return Objects.equals(this.depositTransaction, transactionsDataAkoya.depositTransaction) &&
        Objects.equals(this.investmentTransaction, transactionsDataAkoya.investmentTransaction) &&
        Objects.equals(this.loanTransaction, transactionsDataAkoya.loanTransaction) &&
        Objects.equals(this.locTransaction, transactionsDataAkoya.locTransaction) &&
        Objects.equals(this.insuranceTransaction, transactionsDataAkoya.insuranceTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransaction, investmentTransaction, loanTransaction, locTransaction, insuranceTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsDataAkoya {\n");
    sb.append("    depositTransaction: ").append(toIndentedString(depositTransaction)).append("\n");
    sb.append("    investmentTransaction: ").append(toIndentedString(investmentTransaction)).append("\n");
    sb.append("    loanTransaction: ").append(toIndentedString(loanTransaction)).append("\n");
    sb.append("    locTransaction: ").append(toIndentedString(locTransaction)).append("\n");
    sb.append("    insuranceTransaction: ").append(toIndentedString(insuranceTransaction)).append("\n");
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

