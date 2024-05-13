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
import org.openapitools.client.model.Config;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MailingListSubscriber
 */
@JsonPropertyOrder({
  MailingListSubscriber.JSON_PROPERTY_FULL_NAME,
  MailingListSubscriber.JSON_PROPERTY_MAIL,
  MailingListSubscriber.JSON_PROPERTY_MAIL_IDN,
  MailingListSubscriber.JSON_PROPERTY_CONFIG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MailingListSubscriber {
  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private String fullName;

  public static final String JSON_PROPERTY_MAIL = "mail";
  private String mail;

  public static final String JSON_PROPERTY_MAIL_IDN = "mail_idn";
  private String mailIdn;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private Config config;

  public MailingListSubscriber() {
  }

  public MailingListSubscriber fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * full_name  
   * @return fullName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public MailingListSubscriber mail(String mail) {
    
    this.mail = mail;
    return this;
  }

   /**
   * Full email address  
   * @return mail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMail() {
    return mail;
  }


  @JsonProperty(JSON_PROPERTY_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMail(String mail) {
    this.mail = mail;
  }


  public MailingListSubscriber mailIdn(String mailIdn) {
    
    this.mailIdn = mailIdn;
    return this;
  }

   /**
   * Full email address with IDN format  
   * @return mailIdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIL_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMailIdn() {
    return mailIdn;
  }


  @JsonProperty(JSON_PROPERTY_MAIL_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailIdn(String mailIdn) {
    this.mailIdn = mailIdn;
  }


  public MailingListSubscriber config(Config config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Config getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(Config config) {
    this.config = config;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingListSubscriber mailingListSubscriber = (MailingListSubscriber) o;
    return Objects.equals(this.fullName, mailingListSubscriber.fullName) &&
        Objects.equals(this.mail, mailingListSubscriber.mail) &&
        Objects.equals(this.mailIdn, mailingListSubscriber.mailIdn) &&
        Objects.equals(this.config, mailingListSubscriber.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, mail, mailIdn, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingListSubscriber {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    mailIdn: ").append(toIndentedString(mailIdn)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
