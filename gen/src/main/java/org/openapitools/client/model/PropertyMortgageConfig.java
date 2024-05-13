/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import org.openapitools.client.model.RecurringAmountConfig;
import org.openapitools.client.model.ThirdPartyProviderConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyMortgageConfig
 */
@JsonPropertyOrder({
  PropertyMortgageConfig.JSON_PROPERTY_PROVIDER,
  PropertyMortgageConfig.JSON_PROPERTY_CURRENT_PAYMENT,
  PropertyMortgageConfig.JSON_PROPERTY_PAYMENT_TYPE,
  PropertyMortgageConfig.JSON_PROPERTY_OUTSTANDING_BALANCE,
  PropertyMortgageConfig.JSON_PROPERTY_REFERENCE_NUMBER,
  PropertyMortgageConfig.JSON_PROPERTY_RENEWAL_DATE,
  PropertyMortgageConfig.JSON_PROPERTY_ADDITIONAL_INFORMATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyMortgageConfig {
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private ThirdPartyProviderConfig provider;

  public static final String JSON_PROPERTY_CURRENT_PAYMENT = "current_payment";
  private RecurringAmountConfig currentPayment;

  /**
   * Gets or Sets paymentType
   */
  public enum PaymentTypeEnum {
    INTEREST_ONLY("interest only"),
    
    CAPITAL_AND_INTEREST("capital and interest");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "payment_type";
  private PaymentTypeEnum paymentType;

  public static final String JSON_PROPERTY_OUTSTANDING_BALANCE = "outstanding_balance";
  private Double outstandingBalance;

  public static final String JSON_PROPERTY_REFERENCE_NUMBER = "reference_number";
  private String referenceNumber;

  public static final String JSON_PROPERTY_RENEWAL_DATE = "renewal_date";
  private MaintenancePost200ResponseValueCreatedDate renewalDate;

  public static final String JSON_PROPERTY_ADDITIONAL_INFORMATION = "additional_information";
  private String additionalInformation;

  public PropertyMortgageConfig() {
  }

  public PropertyMortgageConfig provider(ThirdPartyProviderConfig provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThirdPartyProviderConfig getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(ThirdPartyProviderConfig provider) {
    this.provider = provider;
  }


  public PropertyMortgageConfig currentPayment(RecurringAmountConfig currentPayment) {
    
    this.currentPayment = currentPayment;
    return this;
  }

   /**
   * Get currentPayment
   * @return currentPayment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringAmountConfig getCurrentPayment() {
    return currentPayment;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPayment(RecurringAmountConfig currentPayment) {
    this.currentPayment = currentPayment;
  }


  public PropertyMortgageConfig paymentType(PaymentTypeEnum paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public PropertyMortgageConfig outstandingBalance(Double outstandingBalance) {
    
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * Get outstandingBalance
   * @return outstandingBalance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTSTANDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOutstandingBalance() {
    return outstandingBalance;
  }


  @JsonProperty(JSON_PROPERTY_OUTSTANDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutstandingBalance(Double outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
  }


  public PropertyMortgageConfig referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceNumber() {
    return referenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public PropertyMortgageConfig renewalDate(MaintenancePost200ResponseValueCreatedDate renewalDate) {
    
    this.renewalDate = renewalDate;
    return this;
  }

   /**
   * Get renewalDate
   * @return renewalDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENEWAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getRenewalDate() {
    return renewalDate;
  }


  @JsonProperty(JSON_PROPERTY_RENEWAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenewalDate(MaintenancePost200ResponseValueCreatedDate renewalDate) {
    this.renewalDate = renewalDate;
  }


  public PropertyMortgageConfig additionalInformation(String additionalInformation) {
    
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalInformation() {
    return additionalInformation;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMortgageConfig propertyMortgageConfig = (PropertyMortgageConfig) o;
    return Objects.equals(this.provider, propertyMortgageConfig.provider) &&
        Objects.equals(this.currentPayment, propertyMortgageConfig.currentPayment) &&
        Objects.equals(this.paymentType, propertyMortgageConfig.paymentType) &&
        Objects.equals(this.outstandingBalance, propertyMortgageConfig.outstandingBalance) &&
        Objects.equals(this.referenceNumber, propertyMortgageConfig.referenceNumber) &&
        Objects.equals(this.renewalDate, propertyMortgageConfig.renewalDate) &&
        Objects.equals(this.additionalInformation, propertyMortgageConfig.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, currentPayment, paymentType, outstandingBalance, referenceNumber, renewalDate, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMortgageConfig {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    currentPayment: ").append(toIndentedString(currentPayment)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    renewalDate: ").append(toIndentedString(renewalDate)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

