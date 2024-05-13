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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RecordsAddPost200Response
 */
@JsonPropertyOrder({
  RecordsAddPost200Response.JSON_PROPERTY_DEVICE_ID,
  RecordsAddPost200Response.JSON_PROPERTY_CLIENT_ID,
  RecordsAddPost200Response.JSON_PROPERTY_SCENARIO_ID,
  RecordsAddPost200Response.JSON_PROPERTY_USER_ID
})
@JsonTypeName("_records_add_post_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:11.915359394Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RecordsAddPost200Response {
  public static final String JSON_PROPERTY_DEVICE_ID = "device_id";
  private String deviceId;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_SCENARIO_ID = "scenario_id";
  private String scenarioId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public RecordsAddPost200Response() {
  }

  public RecordsAddPost200Response deviceId(String deviceId) {
    
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


  public RecordsAddPost200Response clientId(String clientId) {
    
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


  public RecordsAddPost200Response scenarioId(String scenarioId) {
    
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


  public RecordsAddPost200Response userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordsAddPost200Response recordsAddPost200Response = (RecordsAddPost200Response) o;
    return Objects.equals(this.deviceId, recordsAddPost200Response.deviceId) &&
        Objects.equals(this.clientId, recordsAddPost200Response.clientId) &&
        Objects.equals(this.scenarioId, recordsAddPost200Response.scenarioId) &&
        Objects.equals(this.userId, recordsAddPost200Response.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, clientId, scenarioId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordsAddPost200Response {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

