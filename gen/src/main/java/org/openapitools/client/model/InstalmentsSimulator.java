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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Instalment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InstalmentsSimulator
 */
@JsonPropertyOrder({
  InstalmentsSimulator.JSON_PROPERTY_CASHBACK_RATE,
  InstalmentsSimulator.JSON_PROPERTY_INSTALMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:11.928068984Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InstalmentsSimulator {
  public static final String JSON_PROPERTY_CASHBACK_RATE = "cashbackRate";
  private String cashbackRate;

  public static final String JSON_PROPERTY_INSTALMENTS = "instalments";
  private List<Instalment> instalments;

  public InstalmentsSimulator() {
  }

  public InstalmentsSimulator cashbackRate(String cashbackRate) {
    
    this.cashbackRate = cashbackRate;
    return this;
  }

   /**
   * Quando aplicado, retorna o valor em % que o usuário receberá de cashback após realizar todos os pagamentos em dia.
   * @return cashbackRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASHBACK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCashbackRate() {
    return cashbackRate;
  }


  @JsonProperty(JSON_PROPERTY_CASHBACK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashbackRate(String cashbackRate) {
    this.cashbackRate = cashbackRate;
  }


  public InstalmentsSimulator instalments(List<Instalment> instalments) {
    
    this.instalments = instalments;
    return this;
  }

  public InstalmentsSimulator addInstalmentsItem(Instalment instalmentsItem) {
    if (this.instalments == null) {
      this.instalments = new ArrayList<>();
    }
    this.instalments.add(instalmentsItem);
    return this;
  }

   /**
   * Usually with 3 installments, the last installment has the cashback value !&#x3D; \&quot;0\&quot;, and the first 2, has the cashback &#x3D;&#x3D; \&quot;0\&quot;
   * @return instalments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Instalment> getInstalments() {
    return instalments;
  }


  @JsonProperty(JSON_PROPERTY_INSTALMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstalments(List<Instalment> instalments) {
    this.instalments = instalments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstalmentsSimulator instalmentsSimulator = (InstalmentsSimulator) o;
    return Objects.equals(this.cashbackRate, instalmentsSimulator.cashbackRate) &&
        Objects.equals(this.instalments, instalmentsSimulator.instalments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashbackRate, instalments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstalmentsSimulator {\n");
    sb.append("    cashbackRate: ").append(toIndentedString(cashbackRate)).append("\n");
    sb.append("    instalments: ").append(toIndentedString(instalments)).append("\n");
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

