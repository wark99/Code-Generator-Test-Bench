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
import org.openapitools.client.model.LedgerItemReferenceResponse;
import org.openapitools.client.model.LinkedContractorResponse;
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LedgerItemResponse
 */
@JsonPropertyOrder({
  LedgerItemResponse.JSON_PROPERTY_REFERENCE,
  LedgerItemResponse.JSON_PROPERTY_DATE,
  LedgerItemResponse.JSON_PROPERTY_AMOUNT_IN,
  LedgerItemResponse.JSON_PROPERTY_AMOUNT_OUT,
  LedgerItemResponse.JSON_PROPERTY_SUBCATEGORY,
  LedgerItemResponse.JSON_PROPERTY_DESCRIPTION,
  LedgerItemResponse.JSON_PROPERTY_CONTRACTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LedgerItemResponse {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private LedgerItemReferenceResponse reference;

  public static final String JSON_PROPERTY_DATE = "date";
  private MaintenancePost200ResponseValueCreatedDate date;

  public static final String JSON_PROPERTY_AMOUNT_IN = "amount_in";
  private Double amountIn;

  public static final String JSON_PROPERTY_AMOUNT_OUT = "amount_out";
  private Double amountOut;

  public static final String JSON_PROPERTY_SUBCATEGORY = "subcategory";
  private String subcategory;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONTRACTOR = "contractor";
  private LinkedContractorResponse contractor;

  public LedgerItemResponse() {
  }

  public LedgerItemResponse reference(LedgerItemReferenceResponse reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LedgerItemReferenceResponse getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(LedgerItemReferenceResponse reference) {
    this.reference = reference;
  }


  public LedgerItemResponse date(MaintenancePost200ResponseValueCreatedDate date) {
    
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

  public MaintenancePost200ResponseValueCreatedDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(MaintenancePost200ResponseValueCreatedDate date) {
    this.date = date;
  }


  public LedgerItemResponse amountIn(Double amountIn) {
    
    this.amountIn = amountIn;
    return this;
  }

   /**
   * Get amountIn
   * @return amountIn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAmountIn() {
    return amountIn;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountIn(Double amountIn) {
    this.amountIn = amountIn;
  }


  public LedgerItemResponse amountOut(Double amountOut) {
    
    this.amountOut = amountOut;
    return this;
  }

   /**
   * Get amountOut
   * @return amountOut
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAmountOut() {
    return amountOut;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOut(Double amountOut) {
    this.amountOut = amountOut;
  }


  public LedgerItemResponse subcategory(String subcategory) {
    
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Get subcategory
   * @return subcategory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBCATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubcategory() {
    return subcategory;
  }


  @JsonProperty(JSON_PROPERTY_SUBCATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }


  public LedgerItemResponse description(String description) {
    
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


  public LedgerItemResponse contractor(LinkedContractorResponse contractor) {
    
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

  public LinkedContractorResponse getContractor() {
    return contractor;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractor(LinkedContractorResponse contractor) {
    this.contractor = contractor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerItemResponse ledgerItemResponse = (LedgerItemResponse) o;
    return Objects.equals(this.reference, ledgerItemResponse.reference) &&
        Objects.equals(this.date, ledgerItemResponse.date) &&
        Objects.equals(this.amountIn, ledgerItemResponse.amountIn) &&
        Objects.equals(this.amountOut, ledgerItemResponse.amountOut) &&
        Objects.equals(this.subcategory, ledgerItemResponse.subcategory) &&
        Objects.equals(this.description, ledgerItemResponse.description) &&
        Objects.equals(this.contractor, ledgerItemResponse.contractor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, date, amountIn, amountOut, subcategory, description, contractor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerItemResponse {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amountIn: ").append(toIndentedString(amountIn)).append("\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contractor: ").append(toIndentedString(contractor)).append("\n");
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
