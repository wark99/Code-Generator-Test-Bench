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
import org.openapitools.client.model.MeasurementNotificationEvent;
import org.openapitools.client.model.MeasurementNotificationWebhook;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MeasurementNotification
 */
@JsonPropertyOrder({
  MeasurementNotification.JSON_PROPERTY_WEBHOOK,
  MeasurementNotification.JSON_PROPERTY_EVENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:30.476705269Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MeasurementNotification {
  public static final String JSON_PROPERTY_WEBHOOK = "webhook";
  private MeasurementNotificationWebhook webhook;

  public static final String JSON_PROPERTY_EVENT = "event";
  private MeasurementNotificationEvent event;

  public MeasurementNotification() {
  }

  public MeasurementNotification webhook(MeasurementNotificationWebhook webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MeasurementNotificationWebhook getWebhook() {
    return webhook;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhook(MeasurementNotificationWebhook webhook) {
    this.webhook = webhook;
  }


  public MeasurementNotification event(MeasurementNotificationEvent event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MeasurementNotificationEvent getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(MeasurementNotificationEvent event) {
    this.event = event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementNotification measurementNotification = (MeasurementNotification) o;
    return Objects.equals(this.webhook, measurementNotification.webhook) &&
        Objects.equals(this.event, measurementNotification.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementNotification {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

