/*
 * Standard Message Envelope
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MessageContext
 */
@JsonPropertyOrder({
  MessageContext.JSON_PROPERTY_MESSAGE_CONTENT_TYPE,
  MessageContext.JSON_PROPERTY_MESSAGE_CONTENT_ENCODING,
  MessageContext.JSON_PROPERTY_PAYLOAD_HASH_VALUE,
  MessageContext.JSON_PROPERTY_HASHING_ALGORITHM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:27.354224883Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageContext {
  public static final String JSON_PROPERTY_MESSAGE_CONTENT_TYPE = "messageContentType";
  private String messageContentType;

  public static final String JSON_PROPERTY_MESSAGE_CONTENT_ENCODING = "messageContentEncoding";
  private String messageContentEncoding;

  public static final String JSON_PROPERTY_PAYLOAD_HASH_VALUE = "payloadHashValue";
  private String payloadHashValue;

  public static final String JSON_PROPERTY_HASHING_ALGORITHM = "hashingAlgorithm";
  private String hashingAlgorithm;

  public MessageContext() {
  }

  public MessageContext messageContentType(String messageContentType) {
    
    this.messageContentType = messageContentType;
    return this;
  }

   /**
   * Indicates the format of message payload.
   * @return messageContentType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessageContentType() {
    return messageContentType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageContentType(String messageContentType) {
    this.messageContentType = messageContentType;
  }


  public MessageContext messageContentEncoding(String messageContentEncoding) {
    
    this.messageContentEncoding = messageContentEncoding;
    return this;
  }

   /**
   * Indicates the content encoding of message payload.
   * @return messageContentEncoding
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE_CONTENT_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessageContentEncoding() {
    return messageContentEncoding;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_CONTENT_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageContentEncoding(String messageContentEncoding) {
    this.messageContentEncoding = messageContentEncoding;
  }


  public MessageContext payloadHashValue(String payloadHashValue) {
    
    this.payloadHashValue = payloadHashValue;
    return this;
  }

   /**
   * Indicates the hash value of the below payload
   * @return payloadHashValue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayloadHashValue() {
    return payloadHashValue;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadHashValue(String payloadHashValue) {
    this.payloadHashValue = payloadHashValue;
  }


  public MessageContext hashingAlgorithm(String hashingAlgorithm) {
    
    this.hashingAlgorithm = hashingAlgorithm;
    return this;
  }

   /**
   * Indicates hashing algorithm
   * @return hashingAlgorithm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASHING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHashingAlgorithm() {
    return hashingAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_HASHING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHashingAlgorithm(String hashingAlgorithm) {
    this.hashingAlgorithm = hashingAlgorithm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContext messageContext = (MessageContext) o;
    return Objects.equals(this.messageContentType, messageContext.messageContentType) &&
        Objects.equals(this.messageContentEncoding, messageContext.messageContentEncoding) &&
        Objects.equals(this.payloadHashValue, messageContext.payloadHashValue) &&
        Objects.equals(this.hashingAlgorithm, messageContext.hashingAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageContentType, messageContentEncoding, payloadHashValue, hashingAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContext {\n");
    sb.append("    messageContentType: ").append(toIndentedString(messageContentType)).append("\n");
    sb.append("    messageContentEncoding: ").append(toIndentedString(messageContentEncoding)).append("\n");
    sb.append("    payloadHashValue: ").append(toIndentedString(payloadHashValue)).append("\n");
    sb.append("    hashingAlgorithm: ").append(toIndentedString(hashingAlgorithm)).append("\n");
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

