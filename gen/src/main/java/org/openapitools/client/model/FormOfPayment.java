/*
 * Customer Payment Domain
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.1
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FormOfPayment
 */
@JsonPropertyOrder({
  FormOfPayment.JSON_PROPERTY_ID,
  FormOfPayment.JSON_PROPERTY_EXPIRY_YEAR,
  FormOfPayment.JSON_PROPERTY_CARD_TYPE,
  FormOfPayment.JSON_PROPERTY_FORM_OF_PAYMENT_TYPE,
  FormOfPayment.JSON_PROPERTY_BIN,
  FormOfPayment.JSON_PROPERTY_LAST_FOUR_DIGITS,
  FormOfPayment.JSON_PROPERTY_EXPIRY_MONTH,
  FormOfPayment.JSON_PROPERTY_IS_STORED,
  FormOfPayment.JSON_PROPERTY_STORE_PAYMENT_METHOD,
  FormOfPayment.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  FormOfPayment.JSON_PROPERTY_AFOP_TYPE,
  FormOfPayment.JSON_PROPERTY_AFOP_NUMBER,
  FormOfPayment.JSON_PROPERTY_TIMESTAMP_CREATED,
  FormOfPayment.JSON_PROPERTY_CLIENT_AUTH_RECEIVED_ID,
  FormOfPayment.JSON_PROPERTY_ACCOUNT_HOLDER_ID,
  FormOfPayment.JSON_PROPERTY_BILLING_ADDRESS_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:54.275857511Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FormOfPayment {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXPIRY_YEAR = "expiryYear";
  private Integer expiryYear;

  public static final String JSON_PROPERTY_CARD_TYPE = "cardType";
  private String cardType;

  public static final String JSON_PROPERTY_FORM_OF_PAYMENT_TYPE = "formOfPaymentType";
  private String formOfPaymentType;

  public static final String JSON_PROPERTY_BIN = "bin";
  private String bin;

  public static final String JSON_PROPERTY_LAST_FOUR_DIGITS = "lastFourDigits";
  private String lastFourDigits;

  public static final String JSON_PROPERTY_EXPIRY_MONTH = "expiryMonth";
  private Integer expiryMonth;

  public static final String JSON_PROPERTY_IS_STORED = "isStored";
  private String isStored;

  public static final String JSON_PROPERTY_STORE_PAYMENT_METHOD = "storePaymentMethod";
  private String storePaymentMethod;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public static final String JSON_PROPERTY_AFOP_TYPE = "afopType";
  private String afopType;

  public static final String JSON_PROPERTY_AFOP_NUMBER = "afopNumber";
  private String afopNumber;

  public static final String JSON_PROPERTY_TIMESTAMP_CREATED = "timestampCreated";
  private OffsetDateTime timestampCreated;

  public static final String JSON_PROPERTY_CLIENT_AUTH_RECEIVED_ID = "clientAuthReceivedId";
  private String clientAuthReceivedId;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_ID = "accountHolderId";
  private String accountHolderId;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_ID = "billingAddressId";
  private String billingAddressId;

  public FormOfPayment() {
  }

  public FormOfPayment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public FormOfPayment expiryYear(Integer expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * Get expiryYear
   * @return expiryYear
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiryYear() {
    return expiryYear;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryYear(Integer expiryYear) {
    this.expiryYear = expiryYear;
  }


  public FormOfPayment cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardType() {
    return cardType;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public FormOfPayment formOfPaymentType(String formOfPaymentType) {
    
    this.formOfPaymentType = formOfPaymentType;
    return this;
  }

   /**
   * Get formOfPaymentType
   * @return formOfPaymentType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORM_OF_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormOfPaymentType() {
    return formOfPaymentType;
  }


  @JsonProperty(JSON_PROPERTY_FORM_OF_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormOfPaymentType(String formOfPaymentType) {
    this.formOfPaymentType = formOfPaymentType;
  }


  public FormOfPayment bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(String bin) {
    this.bin = bin;
  }


  public FormOfPayment lastFourDigits(String lastFourDigits) {
    
    this.lastFourDigits = lastFourDigits;
    return this;
  }

   /**
   * Get lastFourDigits
   * @return lastFourDigits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_FOUR_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastFourDigits() {
    return lastFourDigits;
  }


  @JsonProperty(JSON_PROPERTY_LAST_FOUR_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
  }


  public FormOfPayment expiryMonth(Integer expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * Get expiryMonth
   * @return expiryMonth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiryMonth() {
    return expiryMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryMonth(Integer expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public FormOfPayment isStored(String isStored) {
    
    this.isStored = isStored;
    return this;
  }

   /**
   * Get isStored
   * @return isStored
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsStored() {
    return isStored;
  }


  @JsonProperty(JSON_PROPERTY_IS_STORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStored(String isStored) {
    this.isStored = isStored;
  }


  public FormOfPayment storePaymentMethod(String storePaymentMethod) {
    
    this.storePaymentMethod = storePaymentMethod;
    return this;
  }

   /**
   * Get storePaymentMethod
   * @return storePaymentMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStorePaymentMethod() {
    return storePaymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_STORE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorePaymentMethod(String storePaymentMethod) {
    this.storePaymentMethod = storePaymentMethod;
  }


  public FormOfPayment storedPaymentMethodId(String storedPaymentMethodId) {
    
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * Get storedPaymentMethodId
   * @return storedPaymentMethodId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public FormOfPayment afopType(String afopType) {
    
    this.afopType = afopType;
    return this;
  }

   /**
   * Get afopType
   * @return afopType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFOP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfopType() {
    return afopType;
  }


  @JsonProperty(JSON_PROPERTY_AFOP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfopType(String afopType) {
    this.afopType = afopType;
  }


  public FormOfPayment afopNumber(String afopNumber) {
    
    this.afopNumber = afopNumber;
    return this;
  }

   /**
   * Get afopNumber
   * @return afopNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFOP_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfopNumber() {
    return afopNumber;
  }


  @JsonProperty(JSON_PROPERTY_AFOP_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfopNumber(String afopNumber) {
    this.afopNumber = afopNumber;
  }


  public FormOfPayment timestampCreated(OffsetDateTime timestampCreated) {
    
    this.timestampCreated = timestampCreated;
    return this;
  }

   /**
   * Get timestampCreated
   * @return timestampCreated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestampCreated() {
    return timestampCreated;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestampCreated(OffsetDateTime timestampCreated) {
    this.timestampCreated = timestampCreated;
  }


  public FormOfPayment clientAuthReceivedId(String clientAuthReceivedId) {
    
    this.clientAuthReceivedId = clientAuthReceivedId;
    return this;
  }

   /**
   * Get clientAuthReceivedId
   * @return clientAuthReceivedId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_AUTH_RECEIVED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientAuthReceivedId() {
    return clientAuthReceivedId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_AUTH_RECEIVED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAuthReceivedId(String clientAuthReceivedId) {
    this.clientAuthReceivedId = clientAuthReceivedId;
  }


  public FormOfPayment accountHolderId(String accountHolderId) {
    
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * Get accountHolderId
   * @return accountHolderId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderId() {
    return accountHolderId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public FormOfPayment billingAddressId(String billingAddressId) {
    
    this.billingAddressId = billingAddressId;
    return this;
  }

   /**
   * Get billingAddressId
   * @return billingAddressId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingAddressId() {
    return billingAddressId;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressId(String billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPayment formOfPayment = (FormOfPayment) o;
    return Objects.equals(this.id, formOfPayment.id) &&
        Objects.equals(this.expiryYear, formOfPayment.expiryYear) &&
        Objects.equals(this.cardType, formOfPayment.cardType) &&
        Objects.equals(this.formOfPaymentType, formOfPayment.formOfPaymentType) &&
        Objects.equals(this.bin, formOfPayment.bin) &&
        Objects.equals(this.lastFourDigits, formOfPayment.lastFourDigits) &&
        Objects.equals(this.expiryMonth, formOfPayment.expiryMonth) &&
        Objects.equals(this.isStored, formOfPayment.isStored) &&
        Objects.equals(this.storePaymentMethod, formOfPayment.storePaymentMethod) &&
        Objects.equals(this.storedPaymentMethodId, formOfPayment.storedPaymentMethodId) &&
        Objects.equals(this.afopType, formOfPayment.afopType) &&
        Objects.equals(this.afopNumber, formOfPayment.afopNumber) &&
        Objects.equals(this.timestampCreated, formOfPayment.timestampCreated) &&
        Objects.equals(this.clientAuthReceivedId, formOfPayment.clientAuthReceivedId) &&
        Objects.equals(this.accountHolderId, formOfPayment.accountHolderId) &&
        Objects.equals(this.billingAddressId, formOfPayment.billingAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, expiryYear, cardType, formOfPaymentType, bin, lastFourDigits, expiryMonth, isStored, storePaymentMethod, storedPaymentMethodId, afopType, afopNumber, timestampCreated, clientAuthReceivedId, accountHolderId, billingAddressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPayment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    formOfPaymentType: ").append(toIndentedString(formOfPaymentType)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    lastFourDigits: ").append(toIndentedString(lastFourDigits)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    isStored: ").append(toIndentedString(isStored)).append("\n");
    sb.append("    storePaymentMethod: ").append(toIndentedString(storePaymentMethod)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    afopType: ").append(toIndentedString(afopType)).append("\n");
    sb.append("    afopNumber: ").append(toIndentedString(afopNumber)).append("\n");
    sb.append("    timestampCreated: ").append(toIndentedString(timestampCreated)).append("\n");
    sb.append("    clientAuthReceivedId: ").append(toIndentedString(clientAuthReceivedId)).append("\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    billingAddressId: ").append(toIndentedString(billingAddressId)).append("\n");
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

