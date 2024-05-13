/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PartnerInvitationData
 */
@JsonPropertyOrder({
  PartnerInvitationData.JSON_PROPERTY_PARTNER_ID,
  PartnerInvitationData.JSON_PROPERTY_FULL_ACCESS,
  PartnerInvitationData.JSON_PROPERTY_PRODUCTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PartnerInvitationData {
  public static final String JSON_PROPERTY_PARTNER_ID = "partner_id";
  private Integer partnerId;

  public static final String JSON_PROPERTY_FULL_ACCESS = "full_access";
  private Boolean fullAccess;

  public static final String JSON_PROPERTY_PRODUCTS = "products";
  private List<String> products;

  public PartnerInvitationData() {
  }

  public PartnerInvitationData partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARTNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPartnerId() {
    return partnerId;
  }


  @JsonProperty(JSON_PROPERTY_PARTNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public PartnerInvitationData fullAccess(Boolean fullAccess) {
    
    this.fullAccess = fullAccess;
    return this;
  }

   /**
   * Describes the type of access the partner has on its client
   * @return fullAccess
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFullAccess() {
    return fullAccess;
  }


  @JsonProperty(JSON_PROPERTY_FULL_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullAccess(Boolean fullAccess) {
    this.fullAccess = fullAccess;
  }


  public PartnerInvitationData products(List<String> products) {
    
    this.products = products;
    return this;
  }

  public PartnerInvitationData addProductsItem(String productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProducts() {
    return products;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducts(List<String> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerInvitationData partnerInvitationData = (PartnerInvitationData) o;
    return Objects.equals(this.partnerId, partnerInvitationData.partnerId) &&
        Objects.equals(this.fullAccess, partnerInvitationData.fullAccess) &&
        Objects.equals(this.products, partnerInvitationData.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, fullAccess, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerInvitationData {\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    fullAccess: ").append(toIndentedString(fullAccess)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
