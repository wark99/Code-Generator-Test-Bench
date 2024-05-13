/*
 * Syntax Public API
 * Documentation for the Public API
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
 * PublicApiV1TradeListGet200ResponseDataInner
 */
@JsonPropertyOrder({
  PublicApiV1TradeListGet200ResponseDataInner.JSON_PROPERTY_CREATED_AT,
  PublicApiV1TradeListGet200ResponseDataInner.JSON_PROPERTY_EXPIRES_AT,
  PublicApiV1TradeListGet200ResponseDataInner.JSON_PROPERTY_ID,
  PublicApiV1TradeListGet200ResponseDataInner.JSON_PROPERTY_RECIPIENT_USERID,
  PublicApiV1TradeListGet200ResponseDataInner.JSON_PROPERTY_SENDER_USERID,
  PublicApiV1TradeListGet200ResponseDataInner.JSON_PROPERTY_STATUS
})
@JsonTypeName("_public_api_v1_trade_list_get_200_response_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PublicApiV1TradeListGet200ResponseDataInner {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Integer expiresAt;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_RECIPIENT_USERID = "recipient_userid";
  private Integer recipientUserid;

  public static final String JSON_PROPERTY_SENDER_USERID = "sender_userid";
  private Integer senderUserid;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public PublicApiV1TradeListGet200ResponseDataInner() {
  }

  public PublicApiV1TradeListGet200ResponseDataInner createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public PublicApiV1TradeListGet200ResponseDataInner expiresAt(Integer expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  public PublicApiV1TradeListGet200ResponseDataInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public PublicApiV1TradeListGet200ResponseDataInner recipientUserid(Integer recipientUserid) {
    
    this.recipientUserid = recipientUserid;
    return this;
  }

   /**
   * Get recipientUserid
   * @return recipientUserid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_USERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecipientUserid() {
    return recipientUserid;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_USERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientUserid(Integer recipientUserid) {
    this.recipientUserid = recipientUserid;
  }


  public PublicApiV1TradeListGet200ResponseDataInner senderUserid(Integer senderUserid) {
    
    this.senderUserid = senderUserid;
    return this;
  }

   /**
   * Get senderUserid
   * @return senderUserid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_USERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSenderUserid() {
    return senderUserid;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_USERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderUserid(Integer senderUserid) {
    this.senderUserid = senderUserid;
  }


  public PublicApiV1TradeListGet200ResponseDataInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicApiV1TradeListGet200ResponseDataInner publicApiV1TradeListGet200ResponseDataInner = (PublicApiV1TradeListGet200ResponseDataInner) o;
    return Objects.equals(this.createdAt, publicApiV1TradeListGet200ResponseDataInner.createdAt) &&
        Objects.equals(this.expiresAt, publicApiV1TradeListGet200ResponseDataInner.expiresAt) &&
        Objects.equals(this.id, publicApiV1TradeListGet200ResponseDataInner.id) &&
        Objects.equals(this.recipientUserid, publicApiV1TradeListGet200ResponseDataInner.recipientUserid) &&
        Objects.equals(this.senderUserid, publicApiV1TradeListGet200ResponseDataInner.senderUserid) &&
        Objects.equals(this.status, publicApiV1TradeListGet200ResponseDataInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, expiresAt, id, recipientUserid, senderUserid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicApiV1TradeListGet200ResponseDataInner {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipientUserid: ").append(toIndentedString(recipientUserid)).append("\n");
    sb.append("    senderUserid: ").append(toIndentedString(senderUserid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

