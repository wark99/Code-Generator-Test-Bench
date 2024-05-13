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
 * MailboxSignatureElement
 */
@JsonPropertyOrder({
  MailboxSignatureElement.JSON_PROPERTY_ID,
  MailboxSignatureElement.JSON_PROPERTY_NAME,
  MailboxSignatureElement.JSON_PROPERTY_CONTENT,
  MailboxSignatureElement.JSON_PROPERTY_REPLY_TO,
  MailboxSignatureElement.JSON_PROPERTY_REPLY_TO_IDN,
  MailboxSignatureElement.JSON_PROPERTY_REPLY_TO_ID,
  MailboxSignatureElement.JSON_PROPERTY_FULL_NAME,
  MailboxSignatureElement.JSON_PROPERTY_SENDER,
  MailboxSignatureElement.JSON_PROPERTY_SENDER_IDN,
  MailboxSignatureElement.JSON_PROPERTY_SENDER_ID,
  MailboxSignatureElement.JSON_PROPERTY_HASH,
  MailboxSignatureElement.JSON_PROPERTY_IS_DEFAULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MailboxSignatureElement {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_REPLY_TO = "reply_to";
  private String replyTo;

  public static final String JSON_PROPERTY_REPLY_TO_IDN = "reply_to_idn";
  private String replyToIdn;

  public static final String JSON_PROPERTY_REPLY_TO_ID = "reply_to_id";
  private Integer replyToId;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private String fullName;

  public static final String JSON_PROPERTY_SENDER = "sender";
  private String sender;

  public static final String JSON_PROPERTY_SENDER_IDN = "sender_idn";
  private String senderIdn;

  public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
  private Integer senderId;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public MailboxSignatureElement() {
  }

  public MailboxSignatureElement id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Signature/personality identifier  
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public MailboxSignatureElement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Signature name  
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public MailboxSignatureElement content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * HTML content of the signature  
   * @return content
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public MailboxSignatureElement replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Reply to email  
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyTo() {
    return replyTo;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public MailboxSignatureElement replyToIdn(String replyToIdn) {
    
    this.replyToIdn = replyToIdn;
    return this;
  }

   /**
   * Reply to email IDN  
   * @return replyToIdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyToIdn() {
    return replyToIdn;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyToIdn(String replyToIdn) {
    this.replyToIdn = replyToIdn;
  }


  public MailboxSignatureElement replyToId(Integer replyToId) {
    
    this.replyToId = replyToId;
    return this;
  }

   /**
   * Reply to VerifiedEmail identifier  
   * @return replyToId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReplyToId() {
    return replyToId;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyToId(Integer replyToId) {
    this.replyToId = replyToId;
  }


  public MailboxSignatureElement fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * From full name  
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


  public MailboxSignatureElement sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * From email  
   * @return sender
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSender() {
    return sender;
  }


  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSender(String sender) {
    this.sender = sender;
  }


  public MailboxSignatureElement senderIdn(String senderIdn) {
    
    this.senderIdn = senderIdn;
    return this;
  }

   /**
   * From email IDN  
   * @return senderIdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderIdn() {
    return senderIdn;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderIdn(String senderIdn) {
    this.senderIdn = senderIdn;
  }


  public MailboxSignatureElement senderId(Integer senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * From VerifiedEmail identifier  
   * @return senderId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSenderId() {
    return senderId;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }


  public MailboxSignatureElement hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Hash (deprecated)  
   * @return hash
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHash(String hash) {
    this.hash = hash;
  }


  public MailboxSignatureElement isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * True if default signature/personality  
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxSignatureElement mailboxSignatureElement = (MailboxSignatureElement) o;
    return Objects.equals(this.id, mailboxSignatureElement.id) &&
        Objects.equals(this.name, mailboxSignatureElement.name) &&
        Objects.equals(this.content, mailboxSignatureElement.content) &&
        Objects.equals(this.replyTo, mailboxSignatureElement.replyTo) &&
        Objects.equals(this.replyToIdn, mailboxSignatureElement.replyToIdn) &&
        Objects.equals(this.replyToId, mailboxSignatureElement.replyToId) &&
        Objects.equals(this.fullName, mailboxSignatureElement.fullName) &&
        Objects.equals(this.sender, mailboxSignatureElement.sender) &&
        Objects.equals(this.senderIdn, mailboxSignatureElement.senderIdn) &&
        Objects.equals(this.senderId, mailboxSignatureElement.senderId) &&
        Objects.equals(this.hash, mailboxSignatureElement.hash) &&
        Objects.equals(this.isDefault, mailboxSignatureElement.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, content, replyTo, replyToIdn, replyToId, fullName, sender, senderIdn, senderId, hash, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxSignatureElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    replyToIdn: ").append(toIndentedString(replyToIdn)).append("\n");
    sb.append("    replyToId: ").append(toIndentedString(replyToId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    senderIdn: ").append(toIndentedString(senderIdn)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
