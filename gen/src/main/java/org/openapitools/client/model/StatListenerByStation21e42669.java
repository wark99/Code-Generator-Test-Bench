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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StatListenerByStation21e42669
 */
@JsonPropertyOrder({
  StatListenerByStation21e42669.JSON_PROPERTY_STATION_ID,
  StatListenerByStation21e42669.JSON_PROPERTY_LISTENERS,
  StatListenerByStation21e42669.JSON_PROPERTY_LISTENERS30S,
  StatListenerByStation21e42669.JSON_PROPERTY_MAX_LISTENERS,
  StatListenerByStation21e42669.JSON_PROPERTY_MIN_LISTENERS,
  StatListenerByStation21e42669.JSON_PROPERTY_UNIQUES,
  StatListenerByStation21e42669.JSON_PROPERTY_AVERAGE_LISTENERS,
  StatListenerByStation21e42669.JSON_PROPERTY_LISTENING_TIME,
  StatListenerByStation21e42669.JSON_PROPERTY_MAX_LISTENING_TIME,
  StatListenerByStation21e42669.JSON_PROPERTY_MIN_LISTENING_TIME,
  StatListenerByStation21e42669.JSON_PROPERTY_AVERAGE_LISTENING_TIME
})
@JsonTypeName("StatListenerByStation_21e42669")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StatListenerByStation21e42669 {
  public static final String JSON_PROPERTY_STATION_ID = "station_id";
  private Integer stationId;

  public static final String JSON_PROPERTY_LISTENERS = "listeners";
  private Integer listeners;

  public static final String JSON_PROPERTY_LISTENERS30S = "listeners_30s";
  private Integer listeners30s;

  public static final String JSON_PROPERTY_MAX_LISTENERS = "max_listeners";
  private Integer maxListeners;

  public static final String JSON_PROPERTY_MIN_LISTENERS = "min_listeners";
  private Integer minListeners;

  public static final String JSON_PROPERTY_UNIQUES = "uniques";
  private Integer uniques;

  public static final String JSON_PROPERTY_AVERAGE_LISTENERS = "average_listeners";
  private BigDecimal averageListeners;

  public static final String JSON_PROPERTY_LISTENING_TIME = "listening_time";
  private Integer listeningTime;

  public static final String JSON_PROPERTY_MAX_LISTENING_TIME = "max_listening_time";
  private Integer maxListeningTime;

  public static final String JSON_PROPERTY_MIN_LISTENING_TIME = "min_listening_time";
  private Integer minListeningTime;

  public static final String JSON_PROPERTY_AVERAGE_LISTENING_TIME = "average_listening_time";
  private BigDecimal averageListeningTime;

  public StatListenerByStation21e42669() {
  }

  public StatListenerByStation21e42669 stationId(Integer stationId) {
    
    this.stationId = stationId;
    return this;
  }

   /**
   * The station id related to this stat
   * @return stationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStationId() {
    return stationId;
  }


  @JsonProperty(JSON_PROPERTY_STATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStationId(Integer stationId) {
    this.stationId = stationId;
  }


  public StatListenerByStation21e42669 listeners(Integer listeners) {
    
    this.listeners = listeners;
    return this;
  }

   /**
   * The number of listeners
   * @return listeners
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getListeners() {
    return listeners;
  }


  @JsonProperty(JSON_PROPERTY_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListeners(Integer listeners) {
    this.listeners = listeners;
  }


  public StatListenerByStation21e42669 listeners30s(Integer listeners30s) {
    
    this.listeners30s = listeners30s;
    return this;
  }

   /**
   * The number of listeners will stay 30 seconds
   * @return listeners30s
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LISTENERS30S)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getListeners30s() {
    return listeners30s;
  }


  @JsonProperty(JSON_PROPERTY_LISTENERS30S)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListeners30s(Integer listeners30s) {
    this.listeners30s = listeners30s;
  }


  public StatListenerByStation21e42669 maxListeners(Integer maxListeners) {
    
    this.maxListeners = maxListeners;
    return this;
  }

   /**
   * The max listeners on the date range
   * @return maxListeners
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxListeners() {
    return maxListeners;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxListeners(Integer maxListeners) {
    this.maxListeners = maxListeners;
  }


  public StatListenerByStation21e42669 minListeners(Integer minListeners) {
    
    this.minListeners = minListeners;
    return this;
  }

   /**
   * The min listeners on the date range
   * @return minListeners
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MIN_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMinListeners() {
    return minListeners;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinListeners(Integer minListeners) {
    this.minListeners = minListeners;
  }


  public StatListenerByStation21e42669 uniques(Integer uniques) {
    
    this.uniques = uniques;
    return this;
  }

   /**
   * The number of unique listeners
   * @return uniques
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUniques() {
    return uniques;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniques(Integer uniques) {
    this.uniques = uniques;
  }


  public StatListenerByStation21e42669 averageListeners(BigDecimal averageListeners) {
    
    this.averageListeners = averageListeners;
    return this;
  }

   /**
   * The average listeners on the date range
   * @return averageListeners
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVERAGE_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAverageListeners() {
    return averageListeners;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageListeners(BigDecimal averageListeners) {
    this.averageListeners = averageListeners;
  }


  public StatListenerByStation21e42669 listeningTime(Integer listeningTime) {
    
    this.listeningTime = listeningTime;
    return this;
  }

   /**
   * The number of seconds listened
   * @return listeningTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getListeningTime() {
    return listeningTime;
  }


  @JsonProperty(JSON_PROPERTY_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListeningTime(Integer listeningTime) {
    this.listeningTime = listeningTime;
  }


  public StatListenerByStation21e42669 maxListeningTime(Integer maxListeningTime) {
    
    this.maxListeningTime = maxListeningTime;
    return this;
  }

   /**
   * The max of seconds listened
   * @return maxListeningTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxListeningTime() {
    return maxListeningTime;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxListeningTime(Integer maxListeningTime) {
    this.maxListeningTime = maxListeningTime;
  }


  public StatListenerByStation21e42669 minListeningTime(Integer minListeningTime) {
    
    this.minListeningTime = minListeningTime;
    return this;
  }

   /**
   * The min of seconds listened
   * @return minListeningTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MIN_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMinListeningTime() {
    return minListeningTime;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinListeningTime(Integer minListeningTime) {
    this.minListeningTime = minListeningTime;
  }


  public StatListenerByStation21e42669 averageListeningTime(BigDecimal averageListeningTime) {
    
    this.averageListeningTime = averageListeningTime;
    return this;
  }

   /**
   * The average of seconds listened on the date range
   * @return averageListeningTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVERAGE_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAverageListeningTime() {
    return averageListeningTime;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_LISTENING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageListeningTime(BigDecimal averageListeningTime) {
    this.averageListeningTime = averageListeningTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatListenerByStation21e42669 statListenerByStation21e42669 = (StatListenerByStation21e42669) o;
    return Objects.equals(this.stationId, statListenerByStation21e42669.stationId) &&
        Objects.equals(this.listeners, statListenerByStation21e42669.listeners) &&
        Objects.equals(this.listeners30s, statListenerByStation21e42669.listeners30s) &&
        Objects.equals(this.maxListeners, statListenerByStation21e42669.maxListeners) &&
        Objects.equals(this.minListeners, statListenerByStation21e42669.minListeners) &&
        Objects.equals(this.uniques, statListenerByStation21e42669.uniques) &&
        Objects.equals(this.averageListeners, statListenerByStation21e42669.averageListeners) &&
        Objects.equals(this.listeningTime, statListenerByStation21e42669.listeningTime) &&
        Objects.equals(this.maxListeningTime, statListenerByStation21e42669.maxListeningTime) &&
        Objects.equals(this.minListeningTime, statListenerByStation21e42669.minListeningTime) &&
        Objects.equals(this.averageListeningTime, statListenerByStation21e42669.averageListeningTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stationId, listeners, listeners30s, maxListeners, minListeners, uniques, averageListeners, listeningTime, maxListeningTime, minListeningTime, averageListeningTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatListenerByStation21e42669 {\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    listeners30s: ").append(toIndentedString(listeners30s)).append("\n");
    sb.append("    maxListeners: ").append(toIndentedString(maxListeners)).append("\n");
    sb.append("    minListeners: ").append(toIndentedString(minListeners)).append("\n");
    sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
    sb.append("    averageListeners: ").append(toIndentedString(averageListeners)).append("\n");
    sb.append("    listeningTime: ").append(toIndentedString(listeningTime)).append("\n");
    sb.append("    maxListeningTime: ").append(toIndentedString(maxListeningTime)).append("\n");
    sb.append("    minListeningTime: ").append(toIndentedString(minListeningTime)).append("\n");
    sb.append("    averageListeningTime: ").append(toIndentedString(averageListeningTime)).append("\n");
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

