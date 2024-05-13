/*
 * LiveFree PERS API
 * The Personal Emergency Response System (PERS) API enables partners to receive PERS alarms and location data via HTTP webhook.  **Alarm Types**  | Code | Alarm Type | Description | |---|---|---| | E100 | Medical Alarm (Primary Button) | The medical alarm button was activated. | | E101 | Personal Emergency Alarm (Pendant Button) | The personal emergency button was activated. | | E111 | Smoke Alarm | Smoke was detected by a compatible smoke detector. | | E301 | AC Power Loss | The device has lost AC power. | | E302 | Low Battery | The device battery is low. | | E308 | System Shutdown | The device is powering off due to low battery. | | E601 | Manual Test | A manually triggered test signal. | | E602 | Periodic Test | The device sent a recurring test signal. | | E641 | Fall Alarm | The device detected a fall. | | E643 | Geofence Exit | The user has exited a geofence area. | | E644 | Geofence Enter | The user has entered a geofence area. | | E646 | Remote Patient Monitoring (RPM) Alarm | A compatible remote patient monitoring device reported an alarm. | | R100 | Medical Alarm Cancel | A medical alarm was cancelled by the user. | **Provisioning**  Webhooks must be configured by LiveFree support. To configure your webhook, contact support with your webhook URL and authentication info. 
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
import java.time.OffsetDateTime;
import org.openapitools.client.model.DeviceEventType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about the event/alarm that was reported by the customer device. This property may be null or not present if this is a location-only message.
 */
@JsonPropertyOrder({
  DeviceEventEvent.JSON_PROPERTY_TIMESTAMP,
  DeviceEventEvent.JSON_PROPERTY_TYPE,
  DeviceEventEvent.JSON_PROPERTY_CODE,
  DeviceEventEvent.JSON_PROPERTY_ZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:36.505131168Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeviceEventEvent {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DeviceEventType type;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_ZONE = "zone";
  private Integer zone;

  public DeviceEventEvent() {
  }

  public DeviceEventEvent timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The time when the event occurred.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public DeviceEventEvent type(DeviceEventType type) {
    
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

  public DeviceEventType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(DeviceEventType type) {
    this.type = type;
  }


  public DeviceEventEvent code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The Contact ID event code.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public DeviceEventEvent zone(Integer zone) {
    
    this.zone = zone;
    return this;
  }

   /**
   * The zone number reporting the event/alarm.
   * minimum: 0
   * maximum: 255
   * @return zone
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getZone() {
    return zone;
  }


  @JsonProperty(JSON_PROPERTY_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZone(Integer zone) {
    this.zone = zone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEventEvent deviceEventEvent = (DeviceEventEvent) o;
    return Objects.equals(this.timestamp, deviceEventEvent.timestamp) &&
        Objects.equals(this.type, deviceEventEvent.type) &&
        Objects.equals(this.code, deviceEventEvent.code) &&
        Objects.equals(this.zone, deviceEventEvent.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, type, code, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEventEvent {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

