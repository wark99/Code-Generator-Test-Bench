/*
 * connect-api
 * # API Rules * Null values are not sent / received. * Object IDs are **always** sent in list methods, but are **ignored** in create / update methods. * All request and response objects are at the root of the returned structure, if they contain only one entity. * Response of multiple entities is returned as an object that contains the list of entities and a structure `pager`, if necessary. ### Additional documentation: * [Camera registration](../camera_registration/) * [Camera communication](../camera_communication/) ### HTTP Status * 200 - OK, response contains data (usually the entire entity) * 201 - OK, entry created; response contains data as required * 204 - OK, no response * 304 - Response has not been modified * 400 - Invalid request / invalid input (SDK error) * 401 - Endpoint is being accessed without credentials (SDK error) * 403 - Request can't be served, usually due to insufficient rights (user error) * 404 - Entity not found (user error or outdated data) * 409 - Conflict with the state of target resource (user error) * 50x - Server side error
 *
 * The version of the OpenAPI document: 0.22.0
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
import org.openapitools.client.model.CameraResolution;
import org.openapitools.client.model.NetworkInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Configuration of the camera
 */
@JsonPropertyOrder({
  CameraConfig.JSON_PROPERTY_CAMERA_ID,
  CameraConfig.JSON_PROPERTY_PATH,
  CameraConfig.JSON_PROPERTY_NAME,
  CameraConfig.JSON_PROPERTY_DRIVER,
  CameraConfig.JSON_PROPERTY_TRIGGER_SCHEME,
  CameraConfig.JSON_PROPERTY_RESOLUTION,
  CameraConfig.JSON_PROPERTY_NETWORK_INFO
})
@JsonTypeName("camera_config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:13.609131704Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CameraConfig {
  public static final String JSON_PROPERTY_CAMERA_ID = "camera_id";
  private String cameraId;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private String driver;

  /**
   * Type of snapshot trigger scheme. Manual, layer, gcode only for LINK cameras
   */
  public enum TriggerSchemeEnum {
    MANUAL("MANUAL"),
    
    EACH_LAYER("EACH_LAYER"),
    
    FIFTH_LAYER("FIFTH_LAYER"),
    
    GCODE("GCODE"),
    
    TEN_SEC("TEN_SEC"),
    
    THIRTY_SEC("THIRTY_SEC"),
    
    SIXTY_SEC("SIXTY_SEC"),
    
    TEN_MIN("TEN_MIN");

    private String value;

    TriggerSchemeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TriggerSchemeEnum fromValue(String value) {
      for (TriggerSchemeEnum b : TriggerSchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRIGGER_SCHEME = "trigger_scheme";
  private TriggerSchemeEnum triggerScheme = TriggerSchemeEnum.THIRTY_SEC;

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private CameraResolution resolution;

  public static final String JSON_PROPERTY_NETWORK_INFO = "network_info";
  private NetworkInfo networkInfo;

  public CameraConfig() {
  }

  public CameraConfig cameraId(String cameraId) {
    
    this.cameraId = cameraId;
    return this;
  }

   /**
   * Get cameraId
   * @return cameraId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMERA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCameraId() {
    return cameraId;
  }


  @JsonProperty(JSON_PROPERTY_CAMERA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCameraId(String cameraId) {
    this.cameraId = cameraId;
  }


  public CameraConfig path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to the driver
   * @return path
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public CameraConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name defined by user
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CameraConfig driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriver(String driver) {
    this.driver = driver;
  }


  public CameraConfig triggerScheme(TriggerSchemeEnum triggerScheme) {
    
    this.triggerScheme = triggerScheme;
    return this;
  }

   /**
   * Type of snapshot trigger scheme. Manual, layer, gcode only for LINK cameras
   * @return triggerScheme
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGER_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TriggerSchemeEnum getTriggerScheme() {
    return triggerScheme;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerScheme(TriggerSchemeEnum triggerScheme) {
    this.triggerScheme = triggerScheme;
  }


  public CameraConfig resolution(CameraResolution resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CameraResolution getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolution(CameraResolution resolution) {
    this.resolution = resolution;
  }


  public CameraConfig networkInfo(NetworkInfo networkInfo) {
    
    this.networkInfo = networkInfo;
    return this;
  }

   /**
   * Get networkInfo
   * @return networkInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkInfo getNetworkInfo() {
    return networkInfo;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkInfo(NetworkInfo networkInfo) {
    this.networkInfo = networkInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CameraConfig cameraConfig = (CameraConfig) o;
    return Objects.equals(this.cameraId, cameraConfig.cameraId) &&
        Objects.equals(this.path, cameraConfig.path) &&
        Objects.equals(this.name, cameraConfig.name) &&
        Objects.equals(this.driver, cameraConfig.driver) &&
        Objects.equals(this.triggerScheme, cameraConfig.triggerScheme) &&
        Objects.equals(this.resolution, cameraConfig.resolution) &&
        Objects.equals(this.networkInfo, cameraConfig.networkInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cameraId, path, name, driver, triggerScheme, resolution, networkInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CameraConfig {\n");
    sb.append("    cameraId: ").append(toIndentedString(cameraId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    triggerScheme: ").append(toIndentedString(triggerScheme)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
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

