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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Item2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RequestBody66
 */
@JsonPropertyOrder({
  RequestBody66.JSON_PROPERTY_ACCESS_COUNTRY,
  RequestBody66.JSON_PROPERTY_AUTHORIZE_COUNTRY,
  RequestBody66.JSON_PROPERTY_DATE,
  RequestBody66.JSON_PROPERTY_DVR_WINDOW,
  RequestBody66.JSON_PROPERTY_FRAGMENT_DURATION,
  RequestBody66.JSON_PROPERTY_NAME,
  RequestBody66.JSON_PROPERTY_RECORD,
  RequestBody66.JSON_PROPERTY_RECORD_NAME,
  RequestBody66.JSON_PROPERTY_REPEAT_INTERVAL,
  RequestBody66.JSON_PROPERTY_REPEAT_UNTIL,
  RequestBody66.JSON_PROPERTY_SIMULCASTS,
  RequestBody66.JSON_PROPERTY_START_AT,
  RequestBody66.JSON_PROPERTY_STOP_AT,
  RequestBody66.JSON_PROPERTY_STOP_LIVE,
  RequestBody66.JSON_PROPERTY_STORAGE_MACHINE_ID,
  RequestBody66.JSON_PROPERTY_TIMEZONE,
  RequestBody66.JSON_PROPERTY_WEEKDAYS_ONLY,
  RequestBody66.JSON_PROPERTY_WEEKENDS_ONLY
})
@JsonTypeName("Request_body_66")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody66 {
  public static final String JSON_PROPERTY_ACCESS_COUNTRY = "access_country";
  private String accessCountry;

  public static final String JSON_PROPERTY_AUTHORIZE_COUNTRY = "authorize_country";
  private Boolean authorizeCountry;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_DVR_WINDOW = "dvr_window";
  private Integer dvrWindow;

  public static final String JSON_PROPERTY_FRAGMENT_DURATION = "fragment_duration";
  private Integer fragmentDuration;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECORD = "record";
  private Boolean record;

  public static final String JSON_PROPERTY_RECORD_NAME = "record_name";
  private String recordName;

  public static final String JSON_PROPERTY_REPEAT_INTERVAL = "repeat_interval";
  private Integer repeatInterval;

  public static final String JSON_PROPERTY_REPEAT_UNTIL = "repeat_until";
  private Integer repeatUntil;

  public static final String JSON_PROPERTY_SIMULCASTS = "simulcasts";
  private List<Item2> simulcasts;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private Integer startAt;

  public static final String JSON_PROPERTY_STOP_AT = "stop_at";
  private Integer stopAt;

  public static final String JSON_PROPERTY_STOP_LIVE = "stop_live";
  private Boolean stopLive;

  public static final String JSON_PROPERTY_STORAGE_MACHINE_ID = "storage_machine_id";
  private Integer storageMachineId;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_WEEKDAYS_ONLY = "weekdays_only";
  private Boolean weekdaysOnly;

  public static final String JSON_PROPERTY_WEEKENDS_ONLY = "weekends_only";
  private Boolean weekendsOnly;

  public RequestBody66() {
  }

  public RequestBody66 accessCountry(String accessCountry) {
    
    this.accessCountry = accessCountry;
    return this;
  }

   /**
   * Get accessCountry
   * @return accessCountry
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessCountry() {
    return accessCountry;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessCountry(String accessCountry) {
    this.accessCountry = accessCountry;
  }


  public RequestBody66 authorizeCountry(Boolean authorizeCountry) {
    
    this.authorizeCountry = authorizeCountry;
    return this;
  }

   /**
   * Authorise or Prohibit countries to view the stream
   * @return authorizeCountry
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZE_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAuthorizeCountry() {
    return authorizeCountry;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZE_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizeCountry(Boolean authorizeCountry) {
    this.authorizeCountry = authorizeCountry;
  }


  public RequestBody66 date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp &#x60;{name}&#x60; has been created
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


  public RequestBody66 dvrWindow(Integer dvrWindow) {
    
    this.dvrWindow = dvrWindow;
    return this;
  }

   /**
   * Get dvrWindow
   * minimum: -1
   * @return dvrWindow
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DVR_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDvrWindow() {
    return dvrWindow;
  }


  @JsonProperty(JSON_PROPERTY_DVR_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDvrWindow(Integer dvrWindow) {
    this.dvrWindow = dvrWindow;
  }


  public RequestBody66 fragmentDuration(Integer fragmentDuration) {
    
    this.fragmentDuration = fragmentDuration;
    return this;
  }

   /**
   * Limit the size of files
   * minimum: 1
   * maximum: 420
   * @return fragmentDuration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FRAGMENT_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFragmentDuration() {
    return fragmentDuration;
  }


  @JsonProperty(JSON_PROPERTY_FRAGMENT_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFragmentDuration(Integer fragmentDuration) {
    this.fragmentDuration = fragmentDuration;
  }


  public RequestBody66 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the resource &#x60;{name}&#x60;
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


  public RequestBody66 record(Boolean record) {
    
    this.record = record;
    return this;
  }

   /**
   * Activate the interupt the live event
   * @return record
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRecord() {
    return record;
  }


  @JsonProperty(JSON_PROPERTY_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecord(Boolean record) {
    this.record = record;
  }


  public RequestBody66 recordName(String recordName) {
    
    this.recordName = recordName;
    return this;
  }

   /**
   * Name of the recording
   * @return recordName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordName() {
    return recordName;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordName(String recordName) {
    this.recordName = recordName;
  }


  public RequestBody66 repeatInterval(Integer repeatInterval) {
    
    this.repeatInterval = repeatInterval;
    return this;
  }

   /**
   * Get repeatInterval
   * minimum: 3600
   * @return repeatInterval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepeatInterval() {
    return repeatInterval;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeatInterval(Integer repeatInterval) {
    this.repeatInterval = repeatInterval;
  }


  public RequestBody66 repeatUntil(Integer repeatUntil) {
    
    this.repeatUntil = repeatUntil;
    return this;
  }

   /**
   * Get repeatUntil
   * minimum: 1693188895
   * @return repeatUntil
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepeatUntil() {
    return repeatUntil;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeatUntil(Integer repeatUntil) {
    this.repeatUntil = repeatUntil;
  }


  public RequestBody66 simulcasts(List<Item2> simulcasts) {
    
    this.simulcasts = simulcasts;
    return this;
  }

  public RequestBody66 addSimulcastsItem(Item2 simulcastsItem) {
    if (this.simulcasts == null) {
      this.simulcasts = new ArrayList<>();
    }
    this.simulcasts.add(simulcastsItem);
    return this;
  }

   /**
   * Get simulcasts
   * @return simulcasts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMULCASTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Item2> getSimulcasts() {
    return simulcasts;
  }


  @JsonProperty(JSON_PROPERTY_SIMULCASTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimulcasts(List<Item2> simulcasts) {
    this.simulcasts = simulcasts;
  }


  public RequestBody66 startAt(Integer startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Start of the event
   * minimum: 1
   * @return startAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartAt() {
    return startAt;
  }


  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }


  public RequestBody66 stopAt(Integer stopAt) {
    
    this.stopAt = stopAt;
    return this;
  }

   /**
   * End of the event
   * minimum: 1
   * @return stopAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STOP_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStopAt() {
    return stopAt;
  }


  @JsonProperty(JSON_PROPERTY_STOP_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStopAt(Integer stopAt) {
    this.stopAt = stopAt;
  }


  public RequestBody66 stopLive(Boolean stopLive) {
    
    this.stopLive = stopLive;
    return this;
  }

   /**
   * Add geographical restrictions
   * @return stopLive
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STOP_LIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStopLive() {
    return stopLive;
  }


  @JsonProperty(JSON_PROPERTY_STOP_LIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStopLive(Boolean stopLive) {
    this.stopLive = stopLive;
  }


  public RequestBody66 storageMachineId(Integer storageMachineId) {
    
    this.storageMachineId = storageMachineId;
    return this;
  }

   /**
   * Unique identifier of the &#x60;storage space&#x60;
   * @return storageMachineId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStorageMachineId() {
    return storageMachineId;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageMachineId(Integer storageMachineId) {
    this.storageMachineId = storageMachineId;
  }


  public RequestBody66 timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public RequestBody66 weekdaysOnly(Boolean weekdaysOnly) {
    
    this.weekdaysOnly = weekdaysOnly;
    return this;
  }

   /**
   * Get weekdaysOnly
   * @return weekdaysOnly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEKDAYS_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWeekdaysOnly() {
    return weekdaysOnly;
  }


  @JsonProperty(JSON_PROPERTY_WEEKDAYS_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeekdaysOnly(Boolean weekdaysOnly) {
    this.weekdaysOnly = weekdaysOnly;
  }


  public RequestBody66 weekendsOnly(Boolean weekendsOnly) {
    
    this.weekendsOnly = weekendsOnly;
    return this;
  }

   /**
   * Get weekendsOnly
   * @return weekendsOnly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEKENDS_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWeekendsOnly() {
    return weekendsOnly;
  }


  @JsonProperty(JSON_PROPERTY_WEEKENDS_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeekendsOnly(Boolean weekendsOnly) {
    this.weekendsOnly = weekendsOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody66 requestBody66 = (RequestBody66) o;
    return Objects.equals(this.accessCountry, requestBody66.accessCountry) &&
        Objects.equals(this.authorizeCountry, requestBody66.authorizeCountry) &&
        Objects.equals(this.date, requestBody66.date) &&
        Objects.equals(this.dvrWindow, requestBody66.dvrWindow) &&
        Objects.equals(this.fragmentDuration, requestBody66.fragmentDuration) &&
        Objects.equals(this.name, requestBody66.name) &&
        Objects.equals(this.record, requestBody66.record) &&
        Objects.equals(this.recordName, requestBody66.recordName) &&
        Objects.equals(this.repeatInterval, requestBody66.repeatInterval) &&
        Objects.equals(this.repeatUntil, requestBody66.repeatUntil) &&
        Objects.equals(this.simulcasts, requestBody66.simulcasts) &&
        Objects.equals(this.startAt, requestBody66.startAt) &&
        Objects.equals(this.stopAt, requestBody66.stopAt) &&
        Objects.equals(this.stopLive, requestBody66.stopLive) &&
        Objects.equals(this.storageMachineId, requestBody66.storageMachineId) &&
        Objects.equals(this.timezone, requestBody66.timezone) &&
        Objects.equals(this.weekdaysOnly, requestBody66.weekdaysOnly) &&
        Objects.equals(this.weekendsOnly, requestBody66.weekendsOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCountry, authorizeCountry, date, dvrWindow, fragmentDuration, name, record, recordName, repeatInterval, repeatUntil, simulcasts, startAt, stopAt, stopLive, storageMachineId, timezone, weekdaysOnly, weekendsOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody66 {\n");
    sb.append("    accessCountry: ").append(toIndentedString(accessCountry)).append("\n");
    sb.append("    authorizeCountry: ").append(toIndentedString(authorizeCountry)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dvrWindow: ").append(toIndentedString(dvrWindow)).append("\n");
    sb.append("    fragmentDuration: ").append(toIndentedString(fragmentDuration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    recordName: ").append(toIndentedString(recordName)).append("\n");
    sb.append("    repeatInterval: ").append(toIndentedString(repeatInterval)).append("\n");
    sb.append("    repeatUntil: ").append(toIndentedString(repeatUntil)).append("\n");
    sb.append("    simulcasts: ").append(toIndentedString(simulcasts)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    stopAt: ").append(toIndentedString(stopAt)).append("\n");
    sb.append("    stopLive: ").append(toIndentedString(stopLive)).append("\n");
    sb.append("    storageMachineId: ").append(toIndentedString(storageMachineId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    weekdaysOnly: ").append(toIndentedString(weekdaysOnly)).append("\n");
    sb.append("    weekendsOnly: ").append(toIndentedString(weekendsOnly)).append("\n");
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

