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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyWithPaymentDetailsConfigBankAccount
 */
@JsonPropertyOrder({
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_ACCOUNT_HOLDER_NAME,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_BANK_NAME,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_BANK_ADDRESS,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_SORT_CODE,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_ACCOUNT_NUMBER,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_BUILDING_SOCIETY_ROLL_NO,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_IBAN,
  PropertyWithPaymentDetailsConfigBankAccount.JSON_PROPERTY_SWIFT_ADDRESS_OR_BIC
})
@JsonTypeName("PropertyWithPaymentDetailsConfig_bank_account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyWithPaymentDetailsConfigBankAccount {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_NAME = "account_holder_name";
  private String accountHolderName;

  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  private String bankName;

  public static final String JSON_PROPERTY_BANK_ADDRESS = "bank_address";
  private String bankAddress;

  public static final String JSON_PROPERTY_SORT_CODE = "sort_code";
  private String sortCode;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
  private String accountNumber;

  public static final String JSON_PROPERTY_BUILDING_SOCIETY_ROLL_NO = "building_society_roll_no";
  private String buildingSocietyRollNo;

  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  public static final String JSON_PROPERTY_SWIFT_ADDRESS_OR_BIC = "swift_address_or_bic";
  private String swiftAddressOrBic;

  public PropertyWithPaymentDetailsConfigBankAccount() {
  }

  public PropertyWithPaymentDetailsConfigBankAccount accountHolderName(String accountHolderName) {
    
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * Get accountHolderName
   * @return accountHolderName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderName() {
    return accountHolderName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  public PropertyWithPaymentDetailsConfigBankAccount bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankName() {
    return bankName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public PropertyWithPaymentDetailsConfigBankAccount bankAddress(String bankAddress) {
    
    this.bankAddress = bankAddress;
    return this;
  }

   /**
   * Get bankAddress
   * @return bankAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAddress() {
    return bankAddress;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }


  public PropertyWithPaymentDetailsConfigBankAccount sortCode(String sortCode) {
    
    this.sortCode = sortCode;
    return this;
  }

   /**
   * Get sortCode
   * @return sortCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortCode() {
    return sortCode;
  }


  @JsonProperty(JSON_PROPERTY_SORT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }


  public PropertyWithPaymentDetailsConfigBankAccount accountNumber(String accountNumber) {
    
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


  public PropertyWithPaymentDetailsConfigBankAccount buildingSocietyRollNo(String buildingSocietyRollNo) {
    
    this.buildingSocietyRollNo = buildingSocietyRollNo;
    return this;
  }

   /**
   * Get buildingSocietyRollNo
   * @return buildingSocietyRollNo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_SOCIETY_ROLL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingSocietyRollNo() {
    return buildingSocietyRollNo;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_SOCIETY_ROLL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingSocietyRollNo(String buildingSocietyRollNo) {
    this.buildingSocietyRollNo = buildingSocietyRollNo;
  }


  public PropertyWithPaymentDetailsConfigBankAccount iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIban(String iban) {
    this.iban = iban;
  }


  public PropertyWithPaymentDetailsConfigBankAccount swiftAddressOrBic(String swiftAddressOrBic) {
    
    this.swiftAddressOrBic = swiftAddressOrBic;
    return this;
  }

   /**
   * Get swiftAddressOrBic
   * @return swiftAddressOrBic
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SWIFT_ADDRESS_OR_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSwiftAddressOrBic() {
    return swiftAddressOrBic;
  }


  @JsonProperty(JSON_PROPERTY_SWIFT_ADDRESS_OR_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwiftAddressOrBic(String swiftAddressOrBic) {
    this.swiftAddressOrBic = swiftAddressOrBic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyWithPaymentDetailsConfigBankAccount propertyWithPaymentDetailsConfigBankAccount = (PropertyWithPaymentDetailsConfigBankAccount) o;
    return Objects.equals(this.accountHolderName, propertyWithPaymentDetailsConfigBankAccount.accountHolderName) &&
        Objects.equals(this.bankName, propertyWithPaymentDetailsConfigBankAccount.bankName) &&
        Objects.equals(this.bankAddress, propertyWithPaymentDetailsConfigBankAccount.bankAddress) &&
        Objects.equals(this.sortCode, propertyWithPaymentDetailsConfigBankAccount.sortCode) &&
        Objects.equals(this.accountNumber, propertyWithPaymentDetailsConfigBankAccount.accountNumber) &&
        Objects.equals(this.buildingSocietyRollNo, propertyWithPaymentDetailsConfigBankAccount.buildingSocietyRollNo) &&
        Objects.equals(this.iban, propertyWithPaymentDetailsConfigBankAccount.iban) &&
        Objects.equals(this.swiftAddressOrBic, propertyWithPaymentDetailsConfigBankAccount.swiftAddressOrBic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderName, bankName, bankAddress, sortCode, accountNumber, buildingSocietyRollNo, iban, swiftAddressOrBic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyWithPaymentDetailsConfigBankAccount {\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    buildingSocietyRollNo: ").append(toIndentedString(buildingSocietyRollNo)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swiftAddressOrBic: ").append(toIndentedString(swiftAddressOrBic)).append("\n");
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

