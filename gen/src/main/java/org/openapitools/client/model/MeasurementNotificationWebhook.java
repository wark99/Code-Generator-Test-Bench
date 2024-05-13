/*
 * LiveFree Health Measurements API
 * The Health Measurements API enables partners to access data from the LiveFree Health Portal.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@lifebeacon.com
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
import java.util.UUID;
import org.openapitools.client.model.WebhookType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MeasurementNotificationWebhook
 */
@JsonPropertyOrder({
  MeasurementNotificationWebhook.JSON_PROPERTY_ID,
  MeasurementNotificationWebhook.JSON_PROPERTY_TYPE
})
@JsonTypeName("MeasurementNotification_webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:30.476705269Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MeasurementNotificationWebhook {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WebhookType type;

  public MeasurementNotificationWebhook() {
  }

  public MeasurementNotificationWebhook id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the webhook.
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public MeasurementNotificationWebhook type(WebhookType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WebhookType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(WebhookType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementNotificationWebhook measurementNotificationWebhook = (MeasurementNotificationWebhook) o;
    return Objects.equals(this.id, measurementNotificationWebhook.id) &&
        Objects.equals(this.type, measurementNotificationWebhook.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementNotificationWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

