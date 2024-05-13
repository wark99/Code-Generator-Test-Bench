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
import org.openapitools.client.model.MailboxForwardingRedirectAdressesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MailboxForwarding
 */
@JsonPropertyOrder({
  MailboxForwarding.JSON_PROPERTY_IS_ENABLED,
  MailboxForwarding.JSON_PROPERTY_REDIRECT_ADRESSES,
  MailboxForwarding.JSON_PROPERTY_HAS_DONT_DELIVER,
  MailboxForwarding.JSON_PROPERTY_HAS_FORWARD_SPAM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MailboxForwarding {
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_REDIRECT_ADRESSES = "redirect_adresses";
  private List<MailboxForwardingRedirectAdressesInner> redirectAdresses;

  public static final String JSON_PROPERTY_HAS_DONT_DELIVER = "has_dont_deliver";
  private Boolean hasDontDeliver;

  public static final String JSON_PROPERTY_HAS_FORWARD_SPAM = "has_forward_spam";
  private Boolean hasForwardSpam;

  public MailboxForwarding() {
  }

  public MailboxForwarding isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Enabled  
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public MailboxForwarding redirectAdresses(List<MailboxForwardingRedirectAdressesInner> redirectAdresses) {
    
    this.redirectAdresses = redirectAdresses;
    return this;
  }

  public MailboxForwarding addRedirectAdressesItem(MailboxForwardingRedirectAdressesInner redirectAdressesItem) {
    if (this.redirectAdresses == null) {
      this.redirectAdresses = new ArrayList<>();
    }
    this.redirectAdresses.add(redirectAdressesItem);
    return this;
  }

   /**
   * Get redirectAdresses
   * @return redirectAdresses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_ADRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MailboxForwardingRedirectAdressesInner> getRedirectAdresses() {
    return redirectAdresses;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_ADRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectAdresses(List<MailboxForwardingRedirectAdressesInner> redirectAdresses) {
    this.redirectAdresses = redirectAdresses;
  }


  public MailboxForwarding hasDontDeliver(Boolean hasDontDeliver) {
    
    this.hasDontDeliver = hasDontDeliver;
    return this;
  }

   /**
   * True if email is deleted after forwarded  
   * @return hasDontDeliver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_DONT_DELIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasDontDeliver() {
    return hasDontDeliver;
  }


  @JsonProperty(JSON_PROPERTY_HAS_DONT_DELIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasDontDeliver(Boolean hasDontDeliver) {
    this.hasDontDeliver = hasDontDeliver;
  }


  public MailboxForwarding hasForwardSpam(Boolean hasForwardSpam) {
    
    this.hasForwardSpam = hasForwardSpam;
    return this;
  }

   /**
   * True if transmits spam messages  
   * @return hasForwardSpam
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_FORWARD_SPAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasForwardSpam() {
    return hasForwardSpam;
  }


  @JsonProperty(JSON_PROPERTY_HAS_FORWARD_SPAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasForwardSpam(Boolean hasForwardSpam) {
    this.hasForwardSpam = hasForwardSpam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxForwarding mailboxForwarding = (MailboxForwarding) o;
    return Objects.equals(this.isEnabled, mailboxForwarding.isEnabled) &&
        Objects.equals(this.redirectAdresses, mailboxForwarding.redirectAdresses) &&
        Objects.equals(this.hasDontDeliver, mailboxForwarding.hasDontDeliver) &&
        Objects.equals(this.hasForwardSpam, mailboxForwarding.hasForwardSpam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, redirectAdresses, hasDontDeliver, hasForwardSpam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxForwarding {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    redirectAdresses: ").append(toIndentedString(redirectAdresses)).append("\n");
    sb.append("    hasDontDeliver: ").append(toIndentedString(hasDontDeliver)).append("\n");
    sb.append("    hasForwardSpam: ").append(toIndentedString(hasForwardSpam)).append("\n");
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
