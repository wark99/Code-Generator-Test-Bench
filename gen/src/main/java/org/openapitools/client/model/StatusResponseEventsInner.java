/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
 * StatusResponseEventsInner
 */
@JsonPropertyOrder({
  StatusResponseEventsInner.JSON_PROPERTY_EVENT_I_D,
  StatusResponseEventsInner.JSON_PROPERTY_EVENT_TIMESTAMP,
  StatusResponseEventsInner.JSON_PROPERTY_EVENT_TYPE_I_D,
  StatusResponseEventsInner.JSON_PROPERTY_EVENT_TYPE_NAME,
  StatusResponseEventsInner.JSON_PROPERTY_EVENT_DESCRIPTION
})
@JsonTypeName("StatusResponse_events_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StatusResponseEventsInner {
  public static final String JSON_PROPERTY_EVENT_I_D = "eventID";
  private String eventID;

  public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
  private String eventTimestamp;

  public static final String JSON_PROPERTY_EVENT_TYPE_I_D = "eventTypeID";
  private String eventTypeID;

  public static final String JSON_PROPERTY_EVENT_TYPE_NAME = "eventTypeName";
  private String eventTypeName;

  public static final String JSON_PROPERTY_EVENT_DESCRIPTION = "eventDescription";
  private String eventDescription;

  public StatusResponseEventsInner() {
  }

  public StatusResponseEventsInner eventID(String eventID) {
    
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventID() {
    return eventID;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventID(String eventID) {
    this.eventID = eventID;
  }


  public StatusResponseEventsInner eventTimestamp(String eventTimestamp) {
    
    this.eventTimestamp = eventTimestamp;
    return this;
  }

   /**
   * Get eventTimestamp
   * @return eventTimestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventTimestamp() {
    return eventTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }


  public StatusResponseEventsInner eventTypeID(String eventTypeID) {
    
    this.eventTypeID = eventTypeID;
    return this;
  }

   /**
   * Get eventTypeID
   * @return eventTypeID
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventTypeID() {
    return eventTypeID;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventTypeID(String eventTypeID) {
    this.eventTypeID = eventTypeID;
  }


  public StatusResponseEventsInner eventTypeName(String eventTypeName) {
    
    this.eventTypeName = eventTypeName;
    return this;
  }

   /**
   * Get eventTypeName
   * @return eventTypeName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventTypeName() {
    return eventTypeName;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventTypeName(String eventTypeName) {
    this.eventTypeName = eventTypeName;
  }


  public StatusResponseEventsInner eventDescription(String eventDescription) {
    
    this.eventDescription = eventDescription;
    return this;
  }

   /**
   * Get eventDescription
   * @return eventDescription
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventDescription() {
    return eventDescription;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponseEventsInner statusResponseEventsInner = (StatusResponseEventsInner) o;
    return Objects.equals(this.eventID, statusResponseEventsInner.eventID) &&
        Objects.equals(this.eventTimestamp, statusResponseEventsInner.eventTimestamp) &&
        Objects.equals(this.eventTypeID, statusResponseEventsInner.eventTypeID) &&
        Objects.equals(this.eventTypeName, statusResponseEventsInner.eventTypeName) &&
        Objects.equals(this.eventDescription, statusResponseEventsInner.eventDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventID, eventTimestamp, eventTypeID, eventTypeName, eventDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResponseEventsInner {\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    eventTypeID: ").append(toIndentedString(eventTypeID)).append("\n");
    sb.append("    eventTypeName: ").append(toIndentedString(eventTypeName)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
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

