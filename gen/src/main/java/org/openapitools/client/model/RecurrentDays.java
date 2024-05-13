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
 * 
 */
@JsonPropertyOrder({
  RecurrentDays.JSON_PROPERTY_MONDAY,
  RecurrentDays.JSON_PROPERTY_TUESDAY,
  RecurrentDays.JSON_PROPERTY_WEDNESDAY,
  RecurrentDays.JSON_PROPERTY_THURSDAY,
  RecurrentDays.JSON_PROPERTY_FRIDAY,
  RecurrentDays.JSON_PROPERTY_SATURDAY,
  RecurrentDays.JSON_PROPERTY_SUNDAY
})
@JsonTypeName("recurrent_days")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RecurrentDays {
  public static final String JSON_PROPERTY_MONDAY = "monday";
  private Boolean monday;

  public static final String JSON_PROPERTY_TUESDAY = "tuesday";
  private Boolean tuesday;

  public static final String JSON_PROPERTY_WEDNESDAY = "wednesday";
  private Boolean wednesday;

  public static final String JSON_PROPERTY_THURSDAY = "thursday";
  private Boolean thursday;

  public static final String JSON_PROPERTY_FRIDAY = "friday";
  private Boolean friday;

  public static final String JSON_PROPERTY_SATURDAY = "saturday";
  private Boolean saturday;

  public static final String JSON_PROPERTY_SUNDAY = "sunday";
  private Boolean sunday;

  public RecurrentDays() {
  }

  public RecurrentDays monday(Boolean monday) {
    
    this.monday = monday;
    return this;
  }

   /**
   * Activated on mondays  
   * @return monday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMonday() {
    return monday;
  }


  @JsonProperty(JSON_PROPERTY_MONDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonday(Boolean monday) {
    this.monday = monday;
  }


  public RecurrentDays tuesday(Boolean tuesday) {
    
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Activated on tuesdays  
   * @return tuesday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUESDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTuesday() {
    return tuesday;
  }


  @JsonProperty(JSON_PROPERTY_TUESDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }


  public RecurrentDays wednesday(Boolean wednesday) {
    
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Activated on wednesdays  
   * @return wednesday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEDNESDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWednesday() {
    return wednesday;
  }


  @JsonProperty(JSON_PROPERTY_WEDNESDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }


  public RecurrentDays thursday(Boolean thursday) {
    
    this.thursday = thursday;
    return this;
  }

   /**
   * Activated on thursday  
   * @return thursday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THURSDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThursday() {
    return thursday;
  }


  @JsonProperty(JSON_PROPERTY_THURSDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }


  public RecurrentDays friday(Boolean friday) {
    
    this.friday = friday;
    return this;
  }

   /**
   * Activated on friday  
   * @return friday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRIDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFriday() {
    return friday;
  }


  @JsonProperty(JSON_PROPERTY_FRIDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFriday(Boolean friday) {
    this.friday = friday;
  }


  public RecurrentDays saturday(Boolean saturday) {
    
    this.saturday = saturday;
    return this;
  }

   /**
   * Activated on saturdays  
   * @return saturday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SATURDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSaturday() {
    return saturday;
  }


  @JsonProperty(JSON_PROPERTY_SATURDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }


  public RecurrentDays sunday(Boolean sunday) {
    
    this.sunday = sunday;
    return this;
  }

   /**
   * Activated on sundays  
   * @return sunday
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUNDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSunday() {
    return sunday;
  }


  @JsonProperty(JSON_PROPERTY_SUNDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrentDays recurrentDays = (RecurrentDays) o;
    return Objects.equals(this.monday, recurrentDays.monday) &&
        Objects.equals(this.tuesday, recurrentDays.tuesday) &&
        Objects.equals(this.wednesday, recurrentDays.wednesday) &&
        Objects.equals(this.thursday, recurrentDays.thursday) &&
        Objects.equals(this.friday, recurrentDays.friday) &&
        Objects.equals(this.saturday, recurrentDays.saturday) &&
        Objects.equals(this.sunday, recurrentDays.sunday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrentDays {\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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
