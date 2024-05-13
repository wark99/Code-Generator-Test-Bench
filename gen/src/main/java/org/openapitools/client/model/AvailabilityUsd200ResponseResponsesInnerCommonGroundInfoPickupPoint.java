/*
 * Servantrip API Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0-oas3
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
import org.openapitools.client.model.AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPointGeolocation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint
 */
@JsonPropertyOrder({
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_ADDRESS,
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_AIRPORT_IATA,
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_COUNTRY_CODE2ISO,
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_DESTINATION_NAME,
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_DISPLAY_TEXT,
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_GEOLOCATION,
  AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.JSON_PROPERTY_GGLE_PLACE_ID
})
@JsonTypeName("availabilityUsd_200_response_responses_inner_common_ground_info_pickup_point")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_AIRPORT_IATA = "airport_iata";
  private String airportIata;

  public static final String JSON_PROPERTY_COUNTRY_CODE2ISO = "country_code_2iso";
  private String countryCode2iso;

  public static final String JSON_PROPERTY_DESTINATION_NAME = "destination_name";
  private String destinationName;

  public static final String JSON_PROPERTY_DISPLAY_TEXT = "display_text";
  private String displayText;

  public static final String JSON_PROPERTY_GEOLOCATION = "geolocation";
  private AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPointGeolocation geolocation;

  public static final String JSON_PROPERTY_GGLE_PLACE_ID = "ggle_place_id";
  private String gglePlaceId;

  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint() {
  }

  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint airportIata(String airportIata) {
    
    this.airportIata = airportIata;
    return this;
  }

   /**
   * Get airportIata
   * @return airportIata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AIRPORT_IATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAirportIata() {
    return airportIata;
  }


  @JsonProperty(JSON_PROPERTY_AIRPORT_IATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAirportIata(String airportIata) {
    this.airportIata = airportIata;
  }


  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint countryCode2iso(String countryCode2iso) {
    
    this.countryCode2iso = countryCode2iso;
    return this;
  }

   /**
   * Get countryCode2iso
   * @return countryCode2iso
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE2ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode2iso() {
    return countryCode2iso;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE2ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode2iso(String countryCode2iso) {
    this.countryCode2iso = countryCode2iso;
  }


  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint destinationName(String destinationName) {
    
    this.destinationName = destinationName;
    return this;
  }

   /**
   * Get destinationName
   * @return destinationName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestinationName() {
    return destinationName;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }


  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint displayText(String displayText) {
    
    this.displayText = displayText;
    return this;
  }

   /**
   * Get displayText
   * @return displayText
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayText() {
    return displayText;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }


  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint geolocation(AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPointGeolocation geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

   /**
   * Get geolocation
   * @return geolocation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPointGeolocation getGeolocation() {
    return geolocation;
  }


  @JsonProperty(JSON_PROPERTY_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeolocation(AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPointGeolocation geolocation) {
    this.geolocation = geolocation;
  }


  public AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint gglePlaceId(String gglePlaceId) {
    
    this.gglePlaceId = gglePlaceId;
    return this;
  }

   /**
   * Get gglePlaceId
   * @return gglePlaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GGLE_PLACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGglePlaceId() {
    return gglePlaceId;
  }


  @JsonProperty(JSON_PROPERTY_GGLE_PLACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGglePlaceId(String gglePlaceId) {
    this.gglePlaceId = gglePlaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint = (AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint) o;
    return Objects.equals(this.address, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.address) &&
        Objects.equals(this.airportIata, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.airportIata) &&
        Objects.equals(this.countryCode2iso, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.countryCode2iso) &&
        Objects.equals(this.destinationName, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.destinationName) &&
        Objects.equals(this.displayText, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.displayText) &&
        Objects.equals(this.geolocation, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.geolocation) &&
        Objects.equals(this.gglePlaceId, availabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint.gglePlaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, airportIata, countryCode2iso, destinationName, displayText, geolocation, gglePlaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityUsd200ResponseResponsesInnerCommonGroundInfoPickupPoint {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    airportIata: ").append(toIndentedString(airportIata)).append("\n");
    sb.append("    countryCode2iso: ").append(toIndentedString(countryCode2iso)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    gglePlaceId: ").append(toIndentedString(gglePlaceId)).append("\n");
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

