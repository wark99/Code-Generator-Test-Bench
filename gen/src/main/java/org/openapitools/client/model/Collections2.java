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
import org.openapitools.client.model.Account;
import org.openapitools.client.model.DateOfExpiration;
import org.openapitools.client.model.MostRecentPayment;
import org.openapitools.client.model.Original2;
import org.openapitools.client.model.Remarks2;
import org.openapitools.client.model.Subscriber3;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Collections2
 */
@JsonPropertyOrder({
  Collections2.JSON_PROPERTY_ACCOUNT,
  Collections2.JSON_PROPERTY_ACCOUNT_NUMBER,
  Collections2.JSON_PROPERTY_ACCOUNT_RATING,
  Collections2.JSON_PROPERTY_CLOSED_INDICATOR,
  Collections2.JSON_PROPERTY_CURRENT_BALANCE,
  Collections2.JSON_PROPERTY_DATE_CLOSED,
  Collections2.JSON_PROPERTY_DATE_EFFECTIVE,
  Collections2.JSON_PROPERTY_DATE_FIRST_DELINQUENT,
  Collections2.JSON_PROPERTY_DATE_OPENED,
  Collections2.JSON_PROPERTY_DATE_PAID_OUT,
  Collections2.JSON_PROPERTY_ECOADESIGNATOR,
  Collections2.JSON_PROPERTY_MOST_RECENT_PAYMENT,
  Collections2.JSON_PROPERTY_ORIGINAL,
  Collections2.JSON_PROPERTY_PAST_DUE,
  Collections2.JSON_PROPERTY_PORTFOLIO_TYPE,
  Collections2.JSON_PROPERTY_REMARKS,
  Collections2.JSON_PROPERTY_SUBSCRIBER,
  Collections2.JSON_PROPERTY_UPDATE_METHOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Collections2 {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Account account;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ACCOUNT_RATING = "accountRating";
  private String accountRating;

  public static final String JSON_PROPERTY_CLOSED_INDICATOR = "closedIndicator";
  private String closedIndicator;

  public static final String JSON_PROPERTY_CURRENT_BALANCE = "currentBalance";
  private String currentBalance;

  public static final String JSON_PROPERTY_DATE_CLOSED = "dateClosed";
  private DateOfExpiration dateClosed;

  public static final String JSON_PROPERTY_DATE_EFFECTIVE = "dateEffective";
  private DateOfExpiration dateEffective;

  public static final String JSON_PROPERTY_DATE_FIRST_DELINQUENT = "dateFirstDelinquent";
  private DateOfExpiration dateFirstDelinquent;

  public static final String JSON_PROPERTY_DATE_OPENED = "dateOpened";
  private DateOfExpiration dateOpened;

  public static final String JSON_PROPERTY_DATE_PAID_OUT = "datePaidOut";
  private DateOfExpiration datePaidOut;

  public static final String JSON_PROPERTY_ECOADESIGNATOR = "ecoadesignator";
  private String ecoadesignator;

  public static final String JSON_PROPERTY_MOST_RECENT_PAYMENT = "mostRecentPayment";
  private MostRecentPayment mostRecentPayment;

  public static final String JSON_PROPERTY_ORIGINAL = "original";
  private Original2 original;

  public static final String JSON_PROPERTY_PAST_DUE = "pastDue";
  private String pastDue;

  public static final String JSON_PROPERTY_PORTFOLIO_TYPE = "portfolioType";
  private String portfolioType;

  public static final String JSON_PROPERTY_REMARKS = "remarks";
  private List<Remarks2> remarks;

  public static final String JSON_PROPERTY_SUBSCRIBER = "subscriber";
  private Subscriber3 subscriber;

  public static final String JSON_PROPERTY_UPDATE_METHOD = "updateMethod";
  private String updateMethod;

  public Collections2() {
  }

  public Collections2 account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Account getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(Account account) {
    this.account = account;
  }


  public Collections2 accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public Collections2 accountRating(String accountRating) {
    
    this.accountRating = accountRating;
    return this;
  }

   /**
   * Get accountRating
   * @return accountRating
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountRating() {
    return accountRating;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountRating(String accountRating) {
    this.accountRating = accountRating;
  }


  public Collections2 closedIndicator(String closedIndicator) {
    
    this.closedIndicator = closedIndicator;
    return this;
  }

   /**
   * Get closedIndicator
   * @return closedIndicator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClosedIndicator() {
    return closedIndicator;
  }


  @JsonProperty(JSON_PROPERTY_CLOSED_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosedIndicator(String closedIndicator) {
    this.closedIndicator = closedIndicator;
  }


  public Collections2 currentBalance(String currentBalance) {
    
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


  public Collections2 dateClosed(DateOfExpiration dateClosed) {
    
    this.dateClosed = dateClosed;
    return this;
  }

   /**
   * Get dateClosed
   * @return dateClosed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_CLOSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateOfExpiration getDateClosed() {
    return dateClosed;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CLOSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateClosed(DateOfExpiration dateClosed) {
    this.dateClosed = dateClosed;
  }


  public Collections2 dateEffective(DateOfExpiration dateEffective) {
    
    this.dateEffective = dateEffective;
    return this;
  }

   /**
   * Get dateEffective
   * @return dateEffective
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateOfExpiration getDateEffective() {
    return dateEffective;
  }


  @JsonProperty(JSON_PROPERTY_DATE_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateEffective(DateOfExpiration dateEffective) {
    this.dateEffective = dateEffective;
  }


  public Collections2 dateFirstDelinquent(DateOfExpiration dateFirstDelinquent) {
    
    this.dateFirstDelinquent = dateFirstDelinquent;
    return this;
  }

   /**
   * Get dateFirstDelinquent
   * @return dateFirstDelinquent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_FIRST_DELINQUENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateOfExpiration getDateFirstDelinquent() {
    return dateFirstDelinquent;
  }


  @JsonProperty(JSON_PROPERTY_DATE_FIRST_DELINQUENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateFirstDelinquent(DateOfExpiration dateFirstDelinquent) {
    this.dateFirstDelinquent = dateFirstDelinquent;
  }


  public Collections2 dateOpened(DateOfExpiration dateOpened) {
    
    this.dateOpened = dateOpened;
    return this;
  }

   /**
   * Get dateOpened
   * @return dateOpened
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateOfExpiration getDateOpened() {
    return dateOpened;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOpened(DateOfExpiration dateOpened) {
    this.dateOpened = dateOpened;
  }


  public Collections2 datePaidOut(DateOfExpiration datePaidOut) {
    
    this.datePaidOut = datePaidOut;
    return this;
  }

   /**
   * Get datePaidOut
   * @return datePaidOut
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_PAID_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateOfExpiration getDatePaidOut() {
    return datePaidOut;
  }


  @JsonProperty(JSON_PROPERTY_DATE_PAID_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatePaidOut(DateOfExpiration datePaidOut) {
    this.datePaidOut = datePaidOut;
  }


  public Collections2 ecoadesignator(String ecoadesignator) {
    
    this.ecoadesignator = ecoadesignator;
    return this;
  }

   /**
   * Get ecoadesignator
   * @return ecoadesignator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ECOADESIGNATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEcoadesignator() {
    return ecoadesignator;
  }


  @JsonProperty(JSON_PROPERTY_ECOADESIGNATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcoadesignator(String ecoadesignator) {
    this.ecoadesignator = ecoadesignator;
  }


  public Collections2 mostRecentPayment(MostRecentPayment mostRecentPayment) {
    
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


  public Collections2 original(Original2 original) {
    
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Original2 getOriginal() {
    return original;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginal(Original2 original) {
    this.original = original;
  }


  public Collections2 pastDue(String pastDue) {
    
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


  public Collections2 portfolioType(String portfolioType) {
    
    this.portfolioType = portfolioType;
    return this;
  }

   /**
   * Get portfolioType
   * @return portfolioType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortfolioType() {
    return portfolioType;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolioType(String portfolioType) {
    this.portfolioType = portfolioType;
  }


  public Collections2 remarks(List<Remarks2> remarks) {
    
    this.remarks = remarks;
    return this;
  }

  public Collections2 addRemarksItem(Remarks2 remarksItem) {
    if (this.remarks == null) {
      this.remarks = new ArrayList<>();
    }
    this.remarks.add(remarksItem);
    return this;
  }

   /**
   * Get remarks
   * @return remarks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Remarks2> getRemarks() {
    return remarks;
  }


  @JsonProperty(JSON_PROPERTY_REMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemarks(List<Remarks2> remarks) {
    this.remarks = remarks;
  }


  public Collections2 subscriber(Subscriber3 subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subscriber3 getSubscriber() {
    return subscriber;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriber(Subscriber3 subscriber) {
    this.subscriber = subscriber;
  }


  public Collections2 updateMethod(String updateMethod) {
    
    this.updateMethod = updateMethod;
    return this;
  }

   /**
   * Get updateMethod
   * @return updateMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateMethod() {
    return updateMethod;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateMethod(String updateMethod) {
    this.updateMethod = updateMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collections2 collections2 = (Collections2) o;
    return Objects.equals(this.account, collections2.account) &&
        Objects.equals(this.accountNumber, collections2.accountNumber) &&
        Objects.equals(this.accountRating, collections2.accountRating) &&
        Objects.equals(this.closedIndicator, collections2.closedIndicator) &&
        Objects.equals(this.currentBalance, collections2.currentBalance) &&
        Objects.equals(this.dateClosed, collections2.dateClosed) &&
        Objects.equals(this.dateEffective, collections2.dateEffective) &&
        Objects.equals(this.dateFirstDelinquent, collections2.dateFirstDelinquent) &&
        Objects.equals(this.dateOpened, collections2.dateOpened) &&
        Objects.equals(this.datePaidOut, collections2.datePaidOut) &&
        Objects.equals(this.ecoadesignator, collections2.ecoadesignator) &&
        Objects.equals(this.mostRecentPayment, collections2.mostRecentPayment) &&
        Objects.equals(this.original, collections2.original) &&
        Objects.equals(this.pastDue, collections2.pastDue) &&
        Objects.equals(this.portfolioType, collections2.portfolioType) &&
        Objects.equals(this.remarks, collections2.remarks) &&
        Objects.equals(this.subscriber, collections2.subscriber) &&
        Objects.equals(this.updateMethod, collections2.updateMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountNumber, accountRating, closedIndicator, currentBalance, dateClosed, dateEffective, dateFirstDelinquent, dateOpened, datePaidOut, ecoadesignator, mostRecentPayment, original, pastDue, portfolioType, remarks, subscriber, updateMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collections2 {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountRating: ").append(toIndentedString(accountRating)).append("\n");
    sb.append("    closedIndicator: ").append(toIndentedString(closedIndicator)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    dateEffective: ").append(toIndentedString(dateEffective)).append("\n");
    sb.append("    dateFirstDelinquent: ").append(toIndentedString(dateFirstDelinquent)).append("\n");
    sb.append("    dateOpened: ").append(toIndentedString(dateOpened)).append("\n");
    sb.append("    datePaidOut: ").append(toIndentedString(datePaidOut)).append("\n");
    sb.append("    ecoadesignator: ").append(toIndentedString(ecoadesignator)).append("\n");
    sb.append("    mostRecentPayment: ").append(toIndentedString(mostRecentPayment)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    pastDue: ").append(toIndentedString(pastDue)).append("\n");
    sb.append("    portfolioType: ").append(toIndentedString(portfolioType)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    updateMethod: ").append(toIndentedString(updateMethod)).append("\n");
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

