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
import org.openapitools.client.model.DateRequest;
import org.openapitools.client.model.PropertyInvoiceOwnerBalancePostRequestContractor;
import org.openapitools.client.model.PropertyInvoiceOwnerBalancePostRequestProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyInvoiceOwnerBalancePostRequest
 */
@JsonPropertyOrder({
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_PROPERTY,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_DESCRIPTION,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_DATE,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_AMOUNT,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_EXPENSE_CATEGORY,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_VAT_PAYABLE_ON_AMOUNT,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_CONTRACTOR,
  PropertyInvoiceOwnerBalancePostRequest.JSON_PROPERTY_COMMISSION_AMOUNT
})
@JsonTypeName("_property_invoice_owner_balance_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyInvoiceOwnerBalancePostRequest {
  public static final String JSON_PROPERTY_PROPERTY = "property";
  private PropertyInvoiceOwnerBalancePostRequestProperty property;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DATE = "date";
  private DateRequest date;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Double amount;

  public static final String JSON_PROPERTY_EXPENSE_CATEGORY = "expense_category";
  private Integer expenseCategory;

  public static final String JSON_PROPERTY_VAT_PAYABLE_ON_AMOUNT = "vat_payable_on_amount";
  private Double vatPayableOnAmount;

  public static final String JSON_PROPERTY_CONTRACTOR = "contractor";
  private PropertyInvoiceOwnerBalancePostRequestContractor contractor;

  public static final String JSON_PROPERTY_COMMISSION_AMOUNT = "commission_amount";
  private Double commissionAmount;

  public PropertyInvoiceOwnerBalancePostRequest() {
  }

  public PropertyInvoiceOwnerBalancePostRequest property(PropertyInvoiceOwnerBalancePostRequestProperty property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyInvoiceOwnerBalancePostRequestProperty getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(PropertyInvoiceOwnerBalancePostRequestProperty property) {
    this.property = property;
  }


  public PropertyInvoiceOwnerBalancePostRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PropertyInvoiceOwnerBalancePostRequest date(DateRequest date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateRequest getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(DateRequest date) {
    this.date = date;
  }


  public PropertyInvoiceOwnerBalancePostRequest amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public PropertyInvoiceOwnerBalancePostRequest expenseCategory(Integer expenseCategory) {
    
    this.expenseCategory = expenseCategory;
    return this;
  }

   /**
   * Get expenseCategory
   * @return expenseCategory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPENSE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpenseCategory() {
    return expenseCategory;
  }


  @JsonProperty(JSON_PROPERTY_EXPENSE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenseCategory(Integer expenseCategory) {
    this.expenseCategory = expenseCategory;
  }


  public PropertyInvoiceOwnerBalancePostRequest vatPayableOnAmount(Double vatPayableOnAmount) {
    
    this.vatPayableOnAmount = vatPayableOnAmount;
    return this;
  }

   /**
   * Get vatPayableOnAmount
   * @return vatPayableOnAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAT_PAYABLE_ON_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getVatPayableOnAmount() {
    return vatPayableOnAmount;
  }


  @JsonProperty(JSON_PROPERTY_VAT_PAYABLE_ON_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatPayableOnAmount(Double vatPayableOnAmount) {
    this.vatPayableOnAmount = vatPayableOnAmount;
  }


  public PropertyInvoiceOwnerBalancePostRequest contractor(PropertyInvoiceOwnerBalancePostRequestContractor contractor) {
    
    this.contractor = contractor;
    return this;
  }

   /**
   * Get contractor
   * @return contractor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyInvoiceOwnerBalancePostRequestContractor getContractor() {
    return contractor;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractor(PropertyInvoiceOwnerBalancePostRequestContractor contractor) {
    this.contractor = contractor;
  }


  public PropertyInvoiceOwnerBalancePostRequest commissionAmount(Double commissionAmount) {
    
    this.commissionAmount = commissionAmount;
    return this;
  }

   /**
   * Get commissionAmount
   * @return commissionAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMISSION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCommissionAmount() {
    return commissionAmount;
  }


  @JsonProperty(JSON_PROPERTY_COMMISSION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommissionAmount(Double commissionAmount) {
    this.commissionAmount = commissionAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyInvoiceOwnerBalancePostRequest propertyInvoiceOwnerBalancePostRequest = (PropertyInvoiceOwnerBalancePostRequest) o;
    return Objects.equals(this.property, propertyInvoiceOwnerBalancePostRequest.property) &&
        Objects.equals(this.description, propertyInvoiceOwnerBalancePostRequest.description) &&
        Objects.equals(this.date, propertyInvoiceOwnerBalancePostRequest.date) &&
        Objects.equals(this.amount, propertyInvoiceOwnerBalancePostRequest.amount) &&
        Objects.equals(this.expenseCategory, propertyInvoiceOwnerBalancePostRequest.expenseCategory) &&
        Objects.equals(this.vatPayableOnAmount, propertyInvoiceOwnerBalancePostRequest.vatPayableOnAmount) &&
        Objects.equals(this.contractor, propertyInvoiceOwnerBalancePostRequest.contractor) &&
        Objects.equals(this.commissionAmount, propertyInvoiceOwnerBalancePostRequest.commissionAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, description, date, amount, expenseCategory, vatPayableOnAmount, contractor, commissionAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyInvoiceOwnerBalancePostRequest {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    expenseCategory: ").append(toIndentedString(expenseCategory)).append("\n");
    sb.append("    vatPayableOnAmount: ").append(toIndentedString(vatPayableOnAmount)).append("\n");
    sb.append("    contractor: ").append(toIndentedString(contractor)).append("\n");
    sb.append("    commissionAmount: ").append(toIndentedString(commissionAmount)).append("\n");
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

