/*
 * Drip - Merchant API
 * API Documentation of endpoints available to Merchants. All requests need to contain the `X-API-KEY` received during the initial Drip Merchant Onboarding. If you do not have it, contact one of the admins.
 *
 * The version of the OpenAPI document: 0.1.2
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CancellationIdPutRequest
 */
@JsonPropertyOrder({
  CancellationIdPutRequest.JSON_PROPERTY_AMOUNT
})
@JsonTypeName("_cancellation__id__put_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:11.928068984Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CancellationIdPutRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public CancellationIdPutRequest() {
  }

  public CancellationIdPutRequest amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Valor a ser cancelado, com 2 digitos depois do ponto
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationIdPutRequest cancellationIdPutRequest = (CancellationIdPutRequest) o;
    return Objects.equals(this.amount, cancellationIdPutRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationIdPutRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

