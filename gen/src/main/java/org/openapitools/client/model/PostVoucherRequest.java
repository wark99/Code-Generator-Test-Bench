/*
 * Reference
 * The DoDays API reference.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@dodays.co.uk
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
 * PostVoucherRequest
 */
@JsonPropertyOrder({
  PostVoucherRequest.JSON_PROPERTY_PRODUCT_ID,
  PostVoucherRequest.JSON_PROPERTY_NAME,
  PostVoucherRequest.JSON_PROPERTY_EMAIL,
  PostVoucherRequest.JSON_PROPERTY_PAYMENT_INTENT,
  PostVoucherRequest.JSON_PROPERTY_TERMS
})
@JsonTypeName("post_voucher_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PostVoucherRequest {
  public static final String JSON_PROPERTY_PRODUCT_ID = "product_id";
  private Integer productId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PAYMENT_INTENT = "payment_intent";
  private String paymentIntent;

  public static final String JSON_PROPERTY_TERMS = "terms";
  private Boolean terms;

  public PostVoucherRequest() {
  }

  public PostVoucherRequest productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public PostVoucherRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PostVoucherRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public PostVoucherRequest paymentIntent(String paymentIntent) {
    
    this.paymentIntent = paymentIntent;
    return this;
  }

   /**
   * Get paymentIntent
   * @return paymentIntent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentIntent() {
    return paymentIntent;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentIntent(String paymentIntent) {
    this.paymentIntent = paymentIntent;
  }


  public PostVoucherRequest terms(Boolean terms) {
    
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTerms() {
    return terms;
  }


  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTerms(Boolean terms) {
    this.terms = terms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostVoucherRequest postVoucherRequest = (PostVoucherRequest) o;
    return Objects.equals(this.productId, postVoucherRequest.productId) &&
        Objects.equals(this.name, postVoucherRequest.name) &&
        Objects.equals(this.email, postVoucherRequest.email) &&
        Objects.equals(this.paymentIntent, postVoucherRequest.paymentIntent) &&
        Objects.equals(this.terms, postVoucherRequest.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, email, paymentIntent, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVoucherRequest {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    paymentIntent: ").append(toIndentedString(paymentIntent)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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

