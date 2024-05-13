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
 * SimulcastConfig
 */
@JsonPropertyOrder({
  SimulcastConfig.JSON_PROPERTY_SIMULCAST_CONFIG_ID,
  SimulcastConfig.JSON_PROPERTY_SIMULCAST_PLATFORM_ID,
  SimulcastConfig.JSON_PROPERTY_HOST,
  SimulcastConfig.JSON_PROPERTY_PORT,
  SimulcastConfig.JSON_PROPERTY_APPLICATION_NAME,
  SimulcastConfig.JSON_PROPERTY_APPLICATION_INSTANCE,
  SimulcastConfig.JSON_PROPERTY_DEST_STREAM,
  SimulcastConfig.JSON_PROPERTY_ENABLED,
  SimulcastConfig.JSON_PROPERTY_STREAM_ID,
  SimulcastConfig.JSON_PROPERTY_NAME,
  SimulcastConfig.JSON_PROPERTY_WAS_ENABLED,
  SimulcastConfig.JSON_PROPERTY_DELETED_AT,
  SimulcastConfig.JSON_PROPERTY_PREVIOUSLY_ENABLED_BY_EVENT,
  SimulcastConfig.JSON_PROPERTY_FORCE_DISABLED,
  SimulcastConfig.JSON_PROPERTY_SCHEME,
  SimulcastConfig.JSON_PROPERTY_FACEBOOK_CONFIG,
  SimulcastConfig.JSON_PROPERTY_PLATFORM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SimulcastConfig {
  public static final String JSON_PROPERTY_SIMULCAST_CONFIG_ID = "simulcast_config_id";
  private Integer simulcastConfigId;

  public static final String JSON_PROPERTY_SIMULCAST_PLATFORM_ID = "simulcast_platform_id";
  private String simulcastPlatformId;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_APPLICATION_NAME = "application_name";
  private String applicationName;

  public static final String JSON_PROPERTY_APPLICATION_INSTANCE = "application_instance";
  private String applicationInstance;

  public static final String JSON_PROPERTY_DEST_STREAM = "dest_stream";
  private String destStream;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_STREAM_ID = "stream_id";
  private String streamId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WAS_ENABLED = "was_enabled";
  private Boolean wasEnabled;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private Integer deletedAt;

  public static final String JSON_PROPERTY_PREVIOUSLY_ENABLED_BY_EVENT = "previously_enabled_by_event";
  private Boolean previouslyEnabledByEvent;

  public static final String JSON_PROPERTY_FORCE_DISABLED = "force_disabled";
  private Boolean forceDisabled;

  public static final String JSON_PROPERTY_SCHEME = "scheme";
  private String scheme;

  public static final String JSON_PROPERTY_FACEBOOK_CONFIG = "facebook_config";
  private String facebookConfig;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public SimulcastConfig() {
  }

  public SimulcastConfig simulcastConfigId(Integer simulcastConfigId) {
    
    this.simulcastConfigId = simulcastConfigId;
    return this;
  }

   /**
   * Get simulcastConfigId
   * @return simulcastConfigId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIMULCAST_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSimulcastConfigId() {
    return simulcastConfigId;
  }


  @JsonProperty(JSON_PROPERTY_SIMULCAST_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSimulcastConfigId(Integer simulcastConfigId) {
    this.simulcastConfigId = simulcastConfigId;
  }


  public SimulcastConfig simulcastPlatformId(String simulcastPlatformId) {
    
    this.simulcastPlatformId = simulcastPlatformId;
    return this;
  }

   /**
   * Get simulcastPlatformId
   * @return simulcastPlatformId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIMULCAST_PLATFORM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSimulcastPlatformId() {
    return simulcastPlatformId;
  }


  @JsonProperty(JSON_PROPERTY_SIMULCAST_PLATFORM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSimulcastPlatformId(String simulcastPlatformId) {
    this.simulcastPlatformId = simulcastPlatformId;
  }


  public SimulcastConfig host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHost() {
    return host;
  }


  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHost(String host) {
    this.host = host;
  }


  public SimulcastConfig port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public SimulcastConfig applicationName(String applicationName) {
    
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public SimulcastConfig applicationInstance(String applicationInstance) {
    
    this.applicationInstance = applicationInstance;
    return this;
  }

   /**
   * Get applicationInstance
   * @return applicationInstance
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLICATION_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApplicationInstance() {
    return applicationInstance;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicationInstance(String applicationInstance) {
    this.applicationInstance = applicationInstance;
  }


  public SimulcastConfig destStream(String destStream) {
    
    this.destStream = destStream;
    return this;
  }

   /**
   * Get destStream
   * @return destStream
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEST_STREAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestStream() {
    return destStream;
  }


  @JsonProperty(JSON_PROPERTY_DEST_STREAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestStream(String destStream) {
    this.destStream = destStream;
  }


  public SimulcastConfig enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SimulcastConfig streamId(String streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * Unique identifier of the &#x60;stream&#x60; that is related to the resource &#x60;SimulcastConfig&#x60;
   * @return streamId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STREAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStreamId() {
    return streamId;
  }


  @JsonProperty(JSON_PROPERTY_STREAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public SimulcastConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the resource &#x60;SimulcastConfig&#x60;
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


  public SimulcastConfig wasEnabled(Boolean wasEnabled) {
    
    this.wasEnabled = wasEnabled;
    return this;
  }

   /**
   * Get wasEnabled
   * @return wasEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WAS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getWasEnabled() {
    return wasEnabled;
  }


  @JsonProperty(JSON_PROPERTY_WAS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWasEnabled(Boolean wasEnabled) {
    this.wasEnabled = wasEnabled;
  }


  public SimulcastConfig deletedAt(Integer deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Timestamp &#x60;SimulcastConfig&#x60; has been deleted
   * @return deletedAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDeletedAt() {
    return deletedAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeletedAt(Integer deletedAt) {
    this.deletedAt = deletedAt;
  }


  public SimulcastConfig previouslyEnabledByEvent(Boolean previouslyEnabledByEvent) {
    
    this.previouslyEnabledByEvent = previouslyEnabledByEvent;
    return this;
  }

   /**
   * Get previouslyEnabledByEvent
   * @return previouslyEnabledByEvent
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_ENABLED_BY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getPreviouslyEnabledByEvent() {
    return previouslyEnabledByEvent;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_ENABLED_BY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviouslyEnabledByEvent(Boolean previouslyEnabledByEvent) {
    this.previouslyEnabledByEvent = previouslyEnabledByEvent;
  }


  public SimulcastConfig forceDisabled(Boolean forceDisabled) {
    
    this.forceDisabled = forceDisabled;
    return this;
  }

   /**
   * Get forceDisabled
   * @return forceDisabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FORCE_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getForceDisabled() {
    return forceDisabled;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setForceDisabled(Boolean forceDisabled) {
    this.forceDisabled = forceDisabled;
  }


  public SimulcastConfig scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScheme() {
    return scheme;
  }


  @JsonProperty(JSON_PROPERTY_SCHEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public SimulcastConfig facebookConfig(String facebookConfig) {
    
    this.facebookConfig = facebookConfig;
    return this;
  }

   /**
   * Get facebookConfig
   * @return facebookConfig
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FACEBOOK_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFacebookConfig() {
    return facebookConfig;
  }


  @JsonProperty(JSON_PROPERTY_FACEBOOK_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFacebookConfig(String facebookConfig) {
    this.facebookConfig = facebookConfig;
  }


  public SimulcastConfig platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulcastConfig simulcastConfig = (SimulcastConfig) o;
    return Objects.equals(this.simulcastConfigId, simulcastConfig.simulcastConfigId) &&
        Objects.equals(this.simulcastPlatformId, simulcastConfig.simulcastPlatformId) &&
        Objects.equals(this.host, simulcastConfig.host) &&
        Objects.equals(this.port, simulcastConfig.port) &&
        Objects.equals(this.applicationName, simulcastConfig.applicationName) &&
        Objects.equals(this.applicationInstance, simulcastConfig.applicationInstance) &&
        Objects.equals(this.destStream, simulcastConfig.destStream) &&
        Objects.equals(this.enabled, simulcastConfig.enabled) &&
        Objects.equals(this.streamId, simulcastConfig.streamId) &&
        Objects.equals(this.name, simulcastConfig.name) &&
        Objects.equals(this.wasEnabled, simulcastConfig.wasEnabled) &&
        Objects.equals(this.deletedAt, simulcastConfig.deletedAt) &&
        Objects.equals(this.previouslyEnabledByEvent, simulcastConfig.previouslyEnabledByEvent) &&
        Objects.equals(this.forceDisabled, simulcastConfig.forceDisabled) &&
        Objects.equals(this.scheme, simulcastConfig.scheme) &&
        Objects.equals(this.facebookConfig, simulcastConfig.facebookConfig) &&
        Objects.equals(this.platform, simulcastConfig.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulcastConfigId, simulcastPlatformId, host, port, applicationName, applicationInstance, destStream, enabled, streamId, name, wasEnabled, deletedAt, previouslyEnabledByEvent, forceDisabled, scheme, facebookConfig, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulcastConfig {\n");
    sb.append("    simulcastConfigId: ").append(toIndentedString(simulcastConfigId)).append("\n");
    sb.append("    simulcastPlatformId: ").append(toIndentedString(simulcastPlatformId)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationInstance: ").append(toIndentedString(applicationInstance)).append("\n");
    sb.append("    destStream: ").append(toIndentedString(destStream)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    wasEnabled: ").append(toIndentedString(wasEnabled)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    previouslyEnabledByEvent: ").append(toIndentedString(previouslyEnabledByEvent)).append("\n");
    sb.append("    forceDisabled: ").append(toIndentedString(forceDisabled)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    facebookConfig: ").append(toIndentedString(facebookConfig)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

