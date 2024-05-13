/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
 * MaintenancePost200ResponseValueCreatedDate
 */
@JsonPropertyOrder({
  MaintenancePost200ResponseValueCreatedDate.JSON_PROPERTY_DATE,
  MaintenancePost200ResponseValueCreatedDate.JSON_PROPERTY_TIMEZONE,
  MaintenancePost200ResponseValueCreatedDate.JSON_PROPERTY_TIMEZONE_TYPE
})
@JsonTypeName("_maintenance_post_200_response_value_created_date")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MaintenancePost200ResponseValueCreatedDate {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TIMEZONE_TYPE = "timezone_type";
  private Integer timezoneType;

  public MaintenancePost200ResponseValueCreatedDate() {
  }

  public MaintenancePost200ResponseValueCreatedDate date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public MaintenancePost200ResponseValueCreatedDate timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public MaintenancePost200ResponseValueCreatedDate timezoneType(Integer timezoneType) {
    
    this.timezoneType = timezoneType;
    return this;
  }

   /**
   * Get timezoneType
   * @return timezoneType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimezoneType() {
    return timezoneType;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenancePost200ResponseValueCreatedDate maintenancePost200ResponseValueCreatedDate = (MaintenancePost200ResponseValueCreatedDate) o;
    return Objects.equals(this.date, maintenancePost200ResponseValueCreatedDate.date) &&
        Objects.equals(this.timezone, maintenancePost200ResponseValueCreatedDate.timezone) &&
        Objects.equals(this.timezoneType, maintenancePost200ResponseValueCreatedDate.timezoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, timezone, timezoneType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenancePost200ResponseValueCreatedDate {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    timezoneType: ").append(toIndentedString(timezoneType)).append("\n");
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

