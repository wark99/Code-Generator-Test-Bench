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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MailHosting
 */
@JsonPropertyOrder({
  MailHosting.JSON_PROPERTY_CUSTOMER_NAME,
  MailHosting.JSON_PROPERTY_OFFER,
  MailHosting.JSON_PROPERTY_EXPIRATION,
  MailHosting.JSON_PROPERTY_MAILBOXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MailHosting {
  public static final String JSON_PROPERTY_CUSTOMER_NAME = "customer_name";
  private String customerName;

  public static final String JSON_PROPERTY_OFFER = "offer";
  private String offer;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private String expiration;

  public static final String JSON_PROPERTY_MAILBOXES = "mailboxes";
  private Integer mailboxes;

  public MailHosting() {
  }

  public MailHosting customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * customer_name  
   * @return customerName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomerName() {
    return customerName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public MailHosting offer(String offer) {
    
    this.offer = offer;
    return this;
  }

   /**
   * offer  
   * @return offer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OFFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOffer() {
    return offer;
  }


  @JsonProperty(JSON_PROPERTY_OFFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOffer(String offer) {
    this.offer = offer;
  }


  public MailHosting expiration(String expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Expiration date  
   * @return expiration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }


  public MailHosting mailboxes(Integer mailboxes) {
    
    this.mailboxes = mailboxes;
    return this;
  }

   /**
   * Number of mailboxes on this product  
   * @return mailboxes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAILBOXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMailboxes() {
    return mailboxes;
  }


  @JsonProperty(JSON_PROPERTY_MAILBOXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMailboxes(Integer mailboxes) {
    this.mailboxes = mailboxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailHosting mailHosting = (MailHosting) o;
    return Objects.equals(this.customerName, mailHosting.customerName) &&
        Objects.equals(this.offer, mailHosting.offer) &&
        Objects.equals(this.expiration, mailHosting.expiration) &&
        Objects.equals(this.mailboxes, mailHosting.mailboxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, offer, expiration, mailboxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailHosting {\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
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

