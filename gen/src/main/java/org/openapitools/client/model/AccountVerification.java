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
import org.openapitools.client.model.ComplianceConditions;
import org.openapitools.client.model.ConsumerStatements;
import org.openapitools.client.model.IdMismatchAlerts;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AccountVerification
 */
@JsonPropertyOrder({
  AccountVerification.JSON_PROPERTY_ACCOUNT_NUMBER,
  AccountVerification.JSON_PROPERTY_ACCOUNT_TYPE,
  AccountVerification.JSON_PROPERTY_COMPLIANCE_CONDITIONS,
  AccountVerification.JSON_PROPERTY_CONSUMER_STATEMENTS,
  AccountVerification.JSON_PROPERTY_ID_MISMATCH_ALERTS,
  AccountVerification.JSON_PROPERTY_SEARCH_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountVerification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private String accountType;

  public static final String JSON_PROPERTY_COMPLIANCE_CONDITIONS = "complianceConditions";
  private List<ComplianceConditions> complianceConditions;

  public static final String JSON_PROPERTY_CONSUMER_STATEMENTS = "consumerStatements";
  private List<ConsumerStatements> consumerStatements;

  public static final String JSON_PROPERTY_ID_MISMATCH_ALERTS = "idMismatchAlerts";
  private List<IdMismatchAlerts> idMismatchAlerts;

  public static final String JSON_PROPERTY_SEARCH_STATUS = "searchStatus";
  private String searchStatus;

  public AccountVerification() {
  }

  public AccountVerification accountNumber(String accountNumber) {
    
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


  public AccountVerification accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public AccountVerification complianceConditions(List<ComplianceConditions> complianceConditions) {
    
    this.complianceConditions = complianceConditions;
    return this;
  }

  public AccountVerification addComplianceConditionsItem(ComplianceConditions complianceConditionsItem) {
    if (this.complianceConditions == null) {
      this.complianceConditions = new ArrayList<>();
    }
    this.complianceConditions.add(complianceConditionsItem);
    return this;
  }

   /**
   * Get complianceConditions
   * @return complianceConditions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComplianceConditions> getComplianceConditions() {
    return complianceConditions;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplianceConditions(List<ComplianceConditions> complianceConditions) {
    this.complianceConditions = complianceConditions;
  }


  public AccountVerification consumerStatements(List<ConsumerStatements> consumerStatements) {
    
    this.consumerStatements = consumerStatements;
    return this;
  }

  public AccountVerification addConsumerStatementsItem(ConsumerStatements consumerStatementsItem) {
    if (this.consumerStatements == null) {
      this.consumerStatements = new ArrayList<>();
    }
    this.consumerStatements.add(consumerStatementsItem);
    return this;
  }

   /**
   * Get consumerStatements
   * @return consumerStatements
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_STATEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConsumerStatements> getConsumerStatements() {
    return consumerStatements;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_STATEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerStatements(List<ConsumerStatements> consumerStatements) {
    this.consumerStatements = consumerStatements;
  }


  public AccountVerification idMismatchAlerts(List<IdMismatchAlerts> idMismatchAlerts) {
    
    this.idMismatchAlerts = idMismatchAlerts;
    return this;
  }

  public AccountVerification addIdMismatchAlertsItem(IdMismatchAlerts idMismatchAlertsItem) {
    if (this.idMismatchAlerts == null) {
      this.idMismatchAlerts = new ArrayList<>();
    }
    this.idMismatchAlerts.add(idMismatchAlertsItem);
    return this;
  }

   /**
   * Get idMismatchAlerts
   * @return idMismatchAlerts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_MISMATCH_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IdMismatchAlerts> getIdMismatchAlerts() {
    return idMismatchAlerts;
  }


  @JsonProperty(JSON_PROPERTY_ID_MISMATCH_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdMismatchAlerts(List<IdMismatchAlerts> idMismatchAlerts) {
    this.idMismatchAlerts = idMismatchAlerts;
  }


  public AccountVerification searchStatus(String searchStatus) {
    
    this.searchStatus = searchStatus;
    return this;
  }

   /**
   * Get searchStatus
   * @return searchStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchStatus() {
    return searchStatus;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchStatus(String searchStatus) {
    this.searchStatus = searchStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerification accountVerification = (AccountVerification) o;
    return Objects.equals(this.accountNumber, accountVerification.accountNumber) &&
        Objects.equals(this.accountType, accountVerification.accountType) &&
        Objects.equals(this.complianceConditions, accountVerification.complianceConditions) &&
        Objects.equals(this.consumerStatements, accountVerification.consumerStatements) &&
        Objects.equals(this.idMismatchAlerts, accountVerification.idMismatchAlerts) &&
        Objects.equals(this.searchStatus, accountVerification.searchStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, complianceConditions, consumerStatements, idMismatchAlerts, searchStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    complianceConditions: ").append(toIndentedString(complianceConditions)).append("\n");
    sb.append("    consumerStatements: ").append(toIndentedString(consumerStatements)).append("\n");
    sb.append("    idMismatchAlerts: ").append(toIndentedString(idMismatchAlerts)).append("\n");
    sb.append("    searchStatus: ").append(toIndentedString(searchStatus)).append("\n");
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

