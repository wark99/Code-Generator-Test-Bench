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
 * Liveressource
 */
@JsonPropertyOrder({
  Liveressource.JSON_PROPERTY_SERVER_NAME,
  Liveressource.JSON_PROPERTY_APPLICATION_INSTANCE,
  Liveressource.JSON_PROPERTY_BYTES_IN,
  Liveressource.JSON_PROPERTY_BYTES_OUT,
  Liveressource.JSON_PROPERTY_BYTES_IN_RATE,
  Liveressource.JSON_PROPERTY_BYTES_OUT_RATE,
  Liveressource.JSON_PROPERTY_TOTAL_CONNECTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Liveressource {
  public static final String JSON_PROPERTY_SERVER_NAME = "server_name";
  private String serverName;

  public static final String JSON_PROPERTY_APPLICATION_INSTANCE = "application_instance";
  private String applicationInstance;

  public static final String JSON_PROPERTY_BYTES_IN = "bytes_in";
  private Integer bytesIn;

  public static final String JSON_PROPERTY_BYTES_OUT = "bytes_out";
  private Integer bytesOut;

  public static final String JSON_PROPERTY_BYTES_IN_RATE = "bytes_in_rate";
  private Integer bytesInRate;

  public static final String JSON_PROPERTY_BYTES_OUT_RATE = "bytes_out_rate";
  private Integer bytesOutRate;

  public static final String JSON_PROPERTY_TOTAL_CONNECTIONS = "total_connections";
  private Integer totalConnections;

  public Liveressource() {
  }

  public Liveressource serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerName() {
    return serverName;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public Liveressource applicationInstance(String applicationInstance) {
    
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


  public Liveressource bytesIn(Integer bytesIn) {
    
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * Get bytesIn
   * @return bytesIn
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BYTES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBytesIn() {
    return bytesIn;
  }


  @JsonProperty(JSON_PROPERTY_BYTES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBytesIn(Integer bytesIn) {
    this.bytesIn = bytesIn;
  }


  public Liveressource bytesOut(Integer bytesOut) {
    
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * Get bytesOut
   * @return bytesOut
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BYTES_OUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBytesOut() {
    return bytesOut;
  }


  @JsonProperty(JSON_PROPERTY_BYTES_OUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBytesOut(Integer bytesOut) {
    this.bytesOut = bytesOut;
  }


  public Liveressource bytesInRate(Integer bytesInRate) {
    
    this.bytesInRate = bytesInRate;
    return this;
  }

   /**
   * Get bytesInRate
   * @return bytesInRate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BYTES_IN_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBytesInRate() {
    return bytesInRate;
  }


  @JsonProperty(JSON_PROPERTY_BYTES_IN_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBytesInRate(Integer bytesInRate) {
    this.bytesInRate = bytesInRate;
  }


  public Liveressource bytesOutRate(Integer bytesOutRate) {
    
    this.bytesOutRate = bytesOutRate;
    return this;
  }

   /**
   * Get bytesOutRate
   * @return bytesOutRate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BYTES_OUT_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBytesOutRate() {
    return bytesOutRate;
  }


  @JsonProperty(JSON_PROPERTY_BYTES_OUT_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBytesOutRate(Integer bytesOutRate) {
    this.bytesOutRate = bytesOutRate;
  }


  public Liveressource totalConnections(Integer totalConnections) {
    
    this.totalConnections = totalConnections;
    return this;
  }

   /**
   * Get totalConnections
   * @return totalConnections
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalConnections() {
    return totalConnections;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalConnections(Integer totalConnections) {
    this.totalConnections = totalConnections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Liveressource liveressource = (Liveressource) o;
    return Objects.equals(this.serverName, liveressource.serverName) &&
        Objects.equals(this.applicationInstance, liveressource.applicationInstance) &&
        Objects.equals(this.bytesIn, liveressource.bytesIn) &&
        Objects.equals(this.bytesOut, liveressource.bytesOut) &&
        Objects.equals(this.bytesInRate, liveressource.bytesInRate) &&
        Objects.equals(this.bytesOutRate, liveressource.bytesOutRate) &&
        Objects.equals(this.totalConnections, liveressource.totalConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, applicationInstance, bytesIn, bytesOut, bytesInRate, bytesOutRate, totalConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Liveressource {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    applicationInstance: ").append(toIndentedString(applicationInstance)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    bytesInRate: ").append(toIndentedString(bytesInRate)).append("\n");
    sb.append("    bytesOutRate: ").append(toIndentedString(bytesOutRate)).append("\n");
    sb.append("    totalConnections: ").append(toIndentedString(totalConnections)).append("\n");
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
