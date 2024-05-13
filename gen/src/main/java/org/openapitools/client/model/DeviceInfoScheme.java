/*
 * AIRBIT Device Auto-registration REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
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
import org.joda.time.*;
import org.openapitools.client.model.LocationScheme;
import org.openapitools.client.model.Personalization;
import org.openapitools.client.model.Settings;
import org.openapitools.client.model.SlaveProfile;
import org.openapitools.client.model.State;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceInfoScheme
 */
@JsonPropertyOrder({
  DeviceInfoScheme.JSON_PROPERTY_DATE_TIME,
  DeviceInfoScheme.JSON_PROPERTY_LOCATION,
  DeviceInfoScheme.JSON_PROPERTY_MODEL_ID,
  DeviceInfoScheme.JSON_PROPERTY_SERIAL,
  DeviceInfoScheme.JSON_PROPERTY_FIRMWARE,
  DeviceInfoScheme.JSON_PROPERTY_SLAVE_PROFILE,
  DeviceInfoScheme.JSON_PROPERTY_SETTINGS,
  DeviceInfoScheme.JSON_PROPERTY_STATE,
  DeviceInfoScheme.JSON_PROPERTY_PERSONALIZATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:58.353940352Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeviceInfoScheme {
  public static final String JSON_PROPERTY_DATE_TIME = "date_time";
  private OffsetDateTime dateTime;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private LocationScheme location;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private Integer modelId;

  public static final String JSON_PROPERTY_SERIAL = "serial";
  private String serial;

  public static final String JSON_PROPERTY_FIRMWARE = "firmware";
  private String firmware;

  public static final String JSON_PROPERTY_SLAVE_PROFILE = "slave_profile";
  private SlaveProfile slaveProfile;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Settings settings;

  public static final String JSON_PROPERTY_STATE = "state";
  private State state;

  public static final String JSON_PROPERTY_PERSONALIZATION = "personalization";
  private Personalization personalization;

  public DeviceInfoScheme() {
  }

  public DeviceInfoScheme dateTime(OffsetDateTime dateTime) {
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public DeviceInfoScheme location(LocationScheme location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocationScheme getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocation(LocationScheme location) {
    this.location = location;
  }


  public DeviceInfoScheme modelId(Integer modelId) {
    
    this.modelId = modelId;
    return this;
  }

   /**
   * the device model identifier
   * @return modelId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getModelId() {
    return modelId;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelId(Integer modelId) {
    this.modelId = modelId;
  }


  public DeviceInfoScheme serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * the device serial number
   * @return serial
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSerial() {
    return serial;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSerial(String serial) {
    this.serial = serial;
  }


  public DeviceInfoScheme firmware(String firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * the device firmware version
   * @return firmware
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRMWARE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirmware() {
    return firmware;
  }


  @JsonProperty(JSON_PROPERTY_FIRMWARE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirmware(String firmware) {
    this.firmware = firmware;
  }


  public DeviceInfoScheme slaveProfile(SlaveProfile slaveProfile) {
    
    this.slaveProfile = slaveProfile;
    return this;
  }

   /**
   * Get slaveProfile
   * @return slaveProfile
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLAVE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SlaveProfile getSlaveProfile() {
    return slaveProfile;
  }


  @JsonProperty(JSON_PROPERTY_SLAVE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlaveProfile(SlaveProfile slaveProfile) {
    this.slaveProfile = slaveProfile;
  }


  public DeviceInfoScheme settings(Settings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Settings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSettings(Settings settings) {
    this.settings = settings;
  }


  public DeviceInfoScheme state(State state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public State getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(State state) {
    this.state = state;
  }


  public DeviceInfoScheme personalization(Personalization personalization) {
    
    this.personalization = personalization;
    return this;
  }

   /**
   * Get personalization
   * @return personalization
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERSONALIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Personalization getPersonalization() {
    return personalization;
  }


  @JsonProperty(JSON_PROPERTY_PERSONALIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPersonalization(Personalization personalization) {
    this.personalization = personalization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfoScheme deviceInfoScheme = (DeviceInfoScheme) o;
    return Objects.equals(this.dateTime, deviceInfoScheme.dateTime) &&
        Objects.equals(this.location, deviceInfoScheme.location) &&
        Objects.equals(this.modelId, deviceInfoScheme.modelId) &&
        Objects.equals(this.serial, deviceInfoScheme.serial) &&
        Objects.equals(this.firmware, deviceInfoScheme.firmware) &&
        Objects.equals(this.slaveProfile, deviceInfoScheme.slaveProfile) &&
        Objects.equals(this.settings, deviceInfoScheme.settings) &&
        Objects.equals(this.state, deviceInfoScheme.state) &&
        Objects.equals(this.personalization, deviceInfoScheme.personalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, location, modelId, serial, firmware, slaveProfile, settings, state, personalization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInfoScheme {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    slaveProfile: ").append(toIndentedString(slaveProfile)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    personalization: ").append(toIndentedString(personalization)).append("\n");
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

