/*
 * VR-Training backend with pockebase (device api)
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DevicesStartGamePost200Response
 */
@JsonPropertyOrder({
  DevicesStartGamePost200Response.JSON_PROPERTY_DEVICE_ID,
  DevicesStartGamePost200Response.JSON_PROPERTY_CLIENT_ID,
  DevicesStartGamePost200Response.JSON_PROPERTY_SCENARIO_ID,
  DevicesStartGamePost200Response.JSON_PROPERTY_SCENARIO_NAME,
  DevicesStartGamePost200Response.JSON_PROPERTY_RECORD_ID,
  DevicesStartGamePost200Response.JSON_PROPERTY_METRICS_KEYS,
  DevicesStartGamePost200Response.JSON_PROPERTY_CHECKLIST_KEYS,
  DevicesStartGamePost200Response.JSON_PROPERTY_ADDITIONAL_INFO
})
@JsonTypeName("_devices_start_game_post_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:11.915359394Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DevicesStartGamePost200Response {
  public static final String JSON_PROPERTY_DEVICE_ID = "device_id";
  private String deviceId;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_SCENARIO_ID = "scenario_id";
  private String scenarioId;

  public static final String JSON_PROPERTY_SCENARIO_NAME = "scenario_name";
  private String scenarioName;

  public static final String JSON_PROPERTY_RECORD_ID = "record_id";
  private String recordId;

  public static final String JSON_PROPERTY_METRICS_KEYS = "metrics_keys";
  private List<String> metricsKeys;

  public static final String JSON_PROPERTY_CHECKLIST_KEYS = "checklist_keys";
  private JsonNullable<Object> checklistKeys = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additional_info";
  private JsonNullable<Object> additionalInfo = JsonNullable.<Object>of(null);

  public DevicesStartGamePost200Response() {
  }

  public DevicesStartGamePost200Response deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceId() {
    return deviceId;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public DevicesStartGamePost200Response clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public DevicesStartGamePost200Response scenarioId(String scenarioId) {
    
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * Get scenarioId
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCENARIO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScenarioId() {
    return scenarioId;
  }


  @JsonProperty(JSON_PROPERTY_SCENARIO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }


  public DevicesStartGamePost200Response scenarioName(String scenarioName) {
    
    this.scenarioName = scenarioName;
    return this;
  }

   /**
   * Get scenarioName
   * @return scenarioName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCENARIO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScenarioName() {
    return scenarioName;
  }


  @JsonProperty(JSON_PROPERTY_SCENARIO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
  }


  public DevicesStartGamePost200Response recordId(String recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordId() {
    return recordId;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public DevicesStartGamePost200Response metricsKeys(List<String> metricsKeys) {
    
    this.metricsKeys = metricsKeys;
    return this;
  }

  public DevicesStartGamePost200Response addMetricsKeysItem(String metricsKeysItem) {
    if (this.metricsKeys == null) {
      this.metricsKeys = new ArrayList<>();
    }
    this.metricsKeys.add(metricsKeysItem);
    return this;
  }

   /**
   * Get metricsKeys
   * @return metricsKeys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMetricsKeys() {
    return metricsKeys;
  }


  @JsonProperty(JSON_PROPERTY_METRICS_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricsKeys(List<String> metricsKeys) {
    this.metricsKeys = metricsKeys;
  }


  public DevicesStartGamePost200Response checklistKeys(Object checklistKeys) {
    this.checklistKeys = JsonNullable.<Object>of(checklistKeys);
    
    return this;
  }

   /**
   * Get checklistKeys
   * @return checklistKeys
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getChecklistKeys() {
        return checklistKeys.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHECKLIST_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getChecklistKeys_JsonNullable() {
    return checklistKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_CHECKLIST_KEYS)
  public void setChecklistKeys_JsonNullable(JsonNullable<Object> checklistKeys) {
    this.checklistKeys = checklistKeys;
  }

  public void setChecklistKeys(Object checklistKeys) {
    this.checklistKeys = JsonNullable.<Object>of(checklistKeys);
  }


  public DevicesStartGamePost200Response additionalInfo(Object additionalInfo) {
    this.additionalInfo = JsonNullable.<Object>of(additionalInfo);
    
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAdditionalInfo() {
        return additionalInfo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAdditionalInfo_JsonNullable() {
    return additionalInfo;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  public void setAdditionalInfo_JsonNullable(JsonNullable<Object> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public void setAdditionalInfo(Object additionalInfo) {
    this.additionalInfo = JsonNullable.<Object>of(additionalInfo);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesStartGamePost200Response devicesStartGamePost200Response = (DevicesStartGamePost200Response) o;
    return Objects.equals(this.deviceId, devicesStartGamePost200Response.deviceId) &&
        Objects.equals(this.clientId, devicesStartGamePost200Response.clientId) &&
        Objects.equals(this.scenarioId, devicesStartGamePost200Response.scenarioId) &&
        Objects.equals(this.scenarioName, devicesStartGamePost200Response.scenarioName) &&
        Objects.equals(this.recordId, devicesStartGamePost200Response.recordId) &&
        Objects.equals(this.metricsKeys, devicesStartGamePost200Response.metricsKeys) &&
        equalsNullable(this.checklistKeys, devicesStartGamePost200Response.checklistKeys) &&
        equalsNullable(this.additionalInfo, devicesStartGamePost200Response.additionalInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, clientId, scenarioId, scenarioName, recordId, metricsKeys, hashCodeNullable(checklistKeys), hashCodeNullable(additionalInfo));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesStartGamePost200Response {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    metricsKeys: ").append(toIndentedString(metricsKeys)).append("\n");
    sb.append("    checklistKeys: ").append(toIndentedString(checklistKeys)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

