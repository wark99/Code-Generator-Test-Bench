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
 * RequestBody56
 */
@JsonPropertyOrder({
  RequestBody56.JSON_PROPERTY_REPLY_TO_ID,
  RequestBody56.JSON_PROPERTY_SENDER_ID,
  RequestBody56.JSON_PROPERTY_IS_DEFAULT,
  RequestBody56.JSON_PROPERTY_POSITION,
  RequestBody56.JSON_PROPERTY_CONTENT,
  RequestBody56.JSON_PROPERTY_FULL_NAME
})
@JsonTypeName("Request_body_56")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody56 {
  public static final String JSON_PROPERTY_REPLY_TO_ID = "reply_to_id";
  private Integer replyToId;

  public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
  private Integer senderId;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_POSITION = "position";
  private String position;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private String fullName;

  public RequestBody56() {
  }

  public RequestBody56 replyToId(Integer replyToId) {
    
    this.replyToId = replyToId;
    return this;
  }

   /**
   * Validated sender/reply address identifier
   * @return replyToId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPLY_TO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getReplyToId() {
    return replyToId;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReplyToId(Integer replyToId) {
    this.replyToId = replyToId;
  }


  public RequestBody56 senderId(Integer senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Validated sender/reply address identifier
   * @return senderId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSenderId() {
    return senderId;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }


  public RequestBody56 isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Set signature as default
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


  public RequestBody56 position(String position) {
    
    this.position = position;
    return this;
  }

   /**
   * Text location (top|bottom)
   * @return position
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(String position) {
    this.position = position;
  }


  public RequestBody56 content(String content) {
    
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


  public RequestBody56 fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name (generally first name and surname)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody56 requestBody56 = (RequestBody56) o;
    return Objects.equals(this.replyToId, requestBody56.replyToId) &&
        Objects.equals(this.senderId, requestBody56.senderId) &&
        Objects.equals(this.isDefault, requestBody56.isDefault) &&
        Objects.equals(this.position, requestBody56.position) &&
        Objects.equals(this.content, requestBody56.content) &&
        Objects.equals(this.fullName, requestBody56.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyToId, senderId, isDefault, position, content, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody56 {\n");
    sb.append("    replyToId: ").append(toIndentedString(replyToId)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
