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
import org.openapitools.client.model.LinkedOwnerResponse;
import org.openapitools.client.model.PropertyWithPaymentDetailsConfigBankAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyWithPaymentDetailsConfig
 */
@JsonPropertyOrder({
  PropertyWithPaymentDetailsConfig.JSON_PROPERTY_BANK_ACCOUNT,
  PropertyWithPaymentDetailsConfig.JSON_PROPERTY_LINKED_OWNER,
  PropertyWithPaymentDetailsConfig.JSON_PROPERTY_PERCENTAGE_SPLIT,
  PropertyWithPaymentDetailsConfig.JSON_PROPERTY_PAYMENT_REFERENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyWithPaymentDetailsConfig {
  public static final String JSON_PROPERTY_BANK_ACCOUNT = "bank_account";
  private PropertyWithPaymentDetailsConfigBankAccount bankAccount;

  public static final String JSON_PROPERTY_LINKED_OWNER = "linked_owner";
  private LinkedOwnerResponse linkedOwner;

  public static final String JSON_PROPERTY_PERCENTAGE_SPLIT = "percentage_split";
  private Double percentageSplit;

  public static final String JSON_PROPERTY_PAYMENT_REFERENCE = "payment_reference";
  private String paymentReference;

  public PropertyWithPaymentDetailsConfig() {
  }

  public PropertyWithPaymentDetailsConfig bankAccount(PropertyWithPaymentDetailsConfigBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyWithPaymentDetailsConfigBankAccount getBankAccount() {
    return bankAccount;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccount(PropertyWithPaymentDetailsConfigBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  public PropertyWithPaymentDetailsConfig linkedOwner(LinkedOwnerResponse linkedOwner) {
    
    this.linkedOwner = linkedOwner;
    return this;
  }

   /**
   * Get linkedOwner
   * @return linkedOwner
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinkedOwnerResponse getLinkedOwner() {
    return linkedOwner;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedOwner(LinkedOwnerResponse linkedOwner) {
    this.linkedOwner = linkedOwner;
  }


  public PropertyWithPaymentDetailsConfig percentageSplit(Double percentageSplit) {
    
    this.percentageSplit = percentageSplit;
    return this;
  }

   /**
   * Get percentageSplit
   * @return percentageSplit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPercentageSplit() {
    return percentageSplit;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentageSplit(Double percentageSplit) {
    this.percentageSplit = percentageSplit;
  }


  public PropertyWithPaymentDetailsConfig paymentReference(String paymentReference) {
    
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * Get paymentReference
   * @return paymentReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentReference() {
    return paymentReference;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyWithPaymentDetailsConfig propertyWithPaymentDetailsConfig = (PropertyWithPaymentDetailsConfig) o;
    return Objects.equals(this.bankAccount, propertyWithPaymentDetailsConfig.bankAccount) &&
        Objects.equals(this.linkedOwner, propertyWithPaymentDetailsConfig.linkedOwner) &&
        Objects.equals(this.percentageSplit, propertyWithPaymentDetailsConfig.percentageSplit) &&
        Objects.equals(this.paymentReference, propertyWithPaymentDetailsConfig.paymentReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, linkedOwner, percentageSplit, paymentReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyWithPaymentDetailsConfig {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    linkedOwner: ").append(toIndentedString(linkedOwner)).append("\n");
    sb.append("    percentageSplit: ").append(toIndentedString(percentageSplit)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
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
