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
 * RequestBody54
 */
@JsonPropertyOrder({
  RequestBody54.JSON_PROPERTY_DONT_REPLY_TO,
  RequestBody54.JSON_PROPERTY_ENDED_AT,
  RequestBody54.JSON_PROPERTY_IS_VISIBLE,
  RequestBody54.JSON_PROPERTY_MESSAGE,
  RequestBody54.JSON_PROPERTY_RECURRENT_DAYS,
  RequestBody54.JSON_PROPERTY_STARTED_AT
})
@JsonTypeName("Request_body_54")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody54 {
  public static final String JSON_PROPERTY_DONT_REPLY_TO = "dont_reply_to";
  private List<String> dontReplyTo;

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private Integer endedAt;

  public static final String JSON_PROPERTY_IS_VISIBLE = "is_visible";
  private Boolean isVisible;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_RECURRENT_DAYS = "recurrent_days";
  private List<Boolean> recurrentDays;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Integer startedAt;

  public RequestBody54() {
  }

  public RequestBody54 dontReplyTo(List<String> dontReplyTo) {
    
    this.dontReplyTo = dontReplyTo;
    return this;
  }

  public RequestBody54 addDontReplyToItem(String dontReplyToItem) {
    if (this.dontReplyTo == null) {
      this.dontReplyTo = new ArrayList<>();
    }
    this.dontReplyTo.add(dontReplyToItem);
    return this;
  }

   /**
   * List of emails the auto reply won&#39;t respond to
   * @return dontReplyTo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DONT_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDontReplyTo() {
    return dontReplyTo;
  }


  @JsonProperty(JSON_PROPERTY_DONT_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDontReplyTo(List<String> dontReplyTo) {
    this.dontReplyTo = dontReplyTo;
  }


  public RequestBody54 endedAt(Integer endedAt) {
    
    this.endedAt = endedAt;
    return this;
  }

   /**
   * Timestamp &#x60;{name}&#x60; has ended
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndedAt() {
    return endedAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndedAt(Integer endedAt) {
    this.endedAt = endedAt;
  }


  public RequestBody54 isVisible(Boolean isVisible) {
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsVisible() {
    return isVisible;
  }


  @JsonProperty(JSON_PROPERTY_IS_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }


  public RequestBody54 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public RequestBody54 recurrentDays(List<Boolean> recurrentDays) {
    
    this.recurrentDays = recurrentDays;
    return this;
  }

  public RequestBody54 addRecurrentDaysItem(Boolean recurrentDaysItem) {
    if (this.recurrentDays == null) {
      this.recurrentDays = new ArrayList<>();
    }
    this.recurrentDays.add(recurrentDaysItem);
    return this;
  }

   /**
   * List of the days when the auto reply is activated
   * @return recurrentDays
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENT_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Boolean> getRecurrentDays() {
    return recurrentDays;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENT_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurrentDays(List<Boolean> recurrentDays) {
    this.recurrentDays = recurrentDays;
  }


  public RequestBody54 startedAt(Integer startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Timestamp &#x60;{name}&#x60; has been started
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody54 requestBody54 = (RequestBody54) o;
    return Objects.equals(this.dontReplyTo, requestBody54.dontReplyTo) &&
        Objects.equals(this.endedAt, requestBody54.endedAt) &&
        Objects.equals(this.isVisible, requestBody54.isVisible) &&
        Objects.equals(this.message, requestBody54.message) &&
        Objects.equals(this.recurrentDays, requestBody54.recurrentDays) &&
        Objects.equals(this.startedAt, requestBody54.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dontReplyTo, endedAt, isVisible, message, recurrentDays, startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody54 {\n");
    sb.append("    dontReplyTo: ").append(toIndentedString(dontReplyTo)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    recurrentDays: ").append(toIndentedString(recurrentDays)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
