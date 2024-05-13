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
 *  
 */
@JsonPropertyOrder({
  Limit.JSON_PROPERTY_ALIAS_FOR_FQDN,
  Limit.JSON_PROPERTY_ALIAS_FOR_FQDN_DEFAULT,
  Limit.JSON_PROPERTY_ALIAS_FOR_MAILBOX,
  Limit.JSON_PROPERTY_ALIAS_FOR_MAILBOX_DEFAULT
})
@JsonTypeName("limit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Limit {
  public static final String JSON_PROPERTY_ALIAS_FOR_FQDN = "alias_for_fqdn";
  private Boolean aliasForFqdn;

  public static final String JSON_PROPERTY_ALIAS_FOR_FQDN_DEFAULT = "alias_for_fqdn_default";
  private Boolean aliasForFqdnDefault;

  public static final String JSON_PROPERTY_ALIAS_FOR_MAILBOX = "alias_for_mailbox";
  private Boolean aliasForMailbox;

  public static final String JSON_PROPERTY_ALIAS_FOR_MAILBOX_DEFAULT = "alias_for_mailbox_default";
  private Boolean aliasForMailboxDefault;

  public Limit() {
  }

  public Limit aliasForFqdn(Boolean aliasForFqdn) {
    
    this.aliasForFqdn = aliasForFqdn;
    return this;
  }

   /**
   *  
   * @return aliasForFqdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_FQDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAliasForFqdn() {
    return aliasForFqdn;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_FQDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasForFqdn(Boolean aliasForFqdn) {
    this.aliasForFqdn = aliasForFqdn;
  }


  public Limit aliasForFqdnDefault(Boolean aliasForFqdnDefault) {
    
    this.aliasForFqdnDefault = aliasForFqdnDefault;
    return this;
  }

   /**
   *  
   * @return aliasForFqdnDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_FQDN_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAliasForFqdnDefault() {
    return aliasForFqdnDefault;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_FQDN_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasForFqdnDefault(Boolean aliasForFqdnDefault) {
    this.aliasForFqdnDefault = aliasForFqdnDefault;
  }


  public Limit aliasForMailbox(Boolean aliasForMailbox) {
    
    this.aliasForMailbox = aliasForMailbox;
    return this;
  }

   /**
   *  
   * @return aliasForMailbox
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_MAILBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAliasForMailbox() {
    return aliasForMailbox;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_MAILBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasForMailbox(Boolean aliasForMailbox) {
    this.aliasForMailbox = aliasForMailbox;
  }


  public Limit aliasForMailboxDefault(Boolean aliasForMailboxDefault) {
    
    this.aliasForMailboxDefault = aliasForMailboxDefault;
    return this;
  }

   /**
   *  
   * @return aliasForMailboxDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_MAILBOX_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAliasForMailboxDefault() {
    return aliasForMailboxDefault;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS_FOR_MAILBOX_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasForMailboxDefault(Boolean aliasForMailboxDefault) {
    this.aliasForMailboxDefault = aliasForMailboxDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limit limit = (Limit) o;
    return Objects.equals(this.aliasForFqdn, limit.aliasForFqdn) &&
        Objects.equals(this.aliasForFqdnDefault, limit.aliasForFqdnDefault) &&
        Objects.equals(this.aliasForMailbox, limit.aliasForMailbox) &&
        Objects.equals(this.aliasForMailboxDefault, limit.aliasForMailboxDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasForFqdn, aliasForFqdnDefault, aliasForMailbox, aliasForMailboxDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    sb.append("    aliasForFqdn: ").append(toIndentedString(aliasForFqdn)).append("\n");
    sb.append("    aliasForFqdnDefault: ").append(toIndentedString(aliasForFqdnDefault)).append("\n");
    sb.append("    aliasForMailbox: ").append(toIndentedString(aliasForMailbox)).append("\n");
    sb.append("    aliasForMailboxDefault: ").append(toIndentedString(aliasForMailboxDefault)).append("\n");
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
