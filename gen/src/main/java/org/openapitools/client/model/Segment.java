/*
 * Customer Payment Domain
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.1
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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Segment
 */
@JsonPropertyOrder({
  Segment.JSON_PROPERTY_ID,
  Segment.JSON_PROPERTY_ORIGIN,
  Segment.JSON_PROPERTY_FLIGHT_NO,
  Segment.JSON_PROPERTY_CARRIER_CODE,
  Segment.JSON_PROPERTY_FARE_BASE_CODE,
  Segment.JSON_PROPERTY_CLASS_OF_TRAVEL,
  Segment.JSON_PROPERTY_STOP_OVER_CODE,
  Segment.JSON_PROPERTY_DESTINATION,
  Segment.JSON_PROPERTY_DATE_OF_TRAVEL,
  Segment.JSON_PROPERTY_SEGMENTS_ID,
  Segment.JSON_PROPERTY_SLICES_ID,
  Segment.JSON_PROPERTY_TIMESTAMP_CREATED,
  Segment.JSON_PROPERTY_AUTH_PNR_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:54.275857511Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Segment {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public static final String JSON_PROPERTY_FLIGHT_NO = "flightNo";
  private String flightNo;

  public static final String JSON_PROPERTY_CARRIER_CODE = "carrierCode";
  private String carrierCode;

  public static final String JSON_PROPERTY_FARE_BASE_CODE = "fareBaseCode";
  private String fareBaseCode;

  public static final String JSON_PROPERTY_CLASS_OF_TRAVEL = "classOfTravel";
  private String classOfTravel;

  public static final String JSON_PROPERTY_STOP_OVER_CODE = "stopOverCode";
  private String stopOverCode;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private String destination;

  public static final String JSON_PROPERTY_DATE_OF_TRAVEL = "dateOfTravel";
  private LocalDate dateOfTravel;

  public static final String JSON_PROPERTY_SEGMENTS_ID = "segmentsId";
  private Integer segmentsId;

  public static final String JSON_PROPERTY_SLICES_ID = "slicesId";
  private String slicesId;

  public static final String JSON_PROPERTY_TIMESTAMP_CREATED = "timestampCreated";
  private OffsetDateTime timestampCreated;

  public static final String JSON_PROPERTY_AUTH_PNR_ID = "authPnrId";
  private String authPnrId;

  public Segment() {
  }

  public Segment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Segment origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrigin() {
    return origin;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public Segment flightNo(String flightNo) {
    
    this.flightNo = flightNo;
    return this;
  }

   /**
   * Get flightNo
   * @return flightNo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLIGHT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlightNo() {
    return flightNo;
  }


  @JsonProperty(JSON_PROPERTY_FLIGHT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlightNo(String flightNo) {
    this.flightNo = flightNo;
  }


  public Segment carrierCode(String carrierCode) {
    
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Get carrierCode
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierCode() {
    return carrierCode;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public Segment fareBaseCode(String fareBaseCode) {
    
    this.fareBaseCode = fareBaseCode;
    return this;
  }

   /**
   * Get fareBaseCode
   * @return fareBaseCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARE_BASE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFareBaseCode() {
    return fareBaseCode;
  }


  @JsonProperty(JSON_PROPERTY_FARE_BASE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFareBaseCode(String fareBaseCode) {
    this.fareBaseCode = fareBaseCode;
  }


  public Segment classOfTravel(String classOfTravel) {
    
    this.classOfTravel = classOfTravel;
    return this;
  }

   /**
   * Get classOfTravel
   * @return classOfTravel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLASS_OF_TRAVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClassOfTravel() {
    return classOfTravel;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_OF_TRAVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassOfTravel(String classOfTravel) {
    this.classOfTravel = classOfTravel;
  }


  public Segment stopOverCode(String stopOverCode) {
    
    this.stopOverCode = stopOverCode;
    return this;
  }

   /**
   * Get stopOverCode
   * @return stopOverCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOP_OVER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStopOverCode() {
    return stopOverCode;
  }


  @JsonProperty(JSON_PROPERTY_STOP_OVER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStopOverCode(String stopOverCode) {
    this.stopOverCode = stopOverCode;
  }


  public Segment destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestination(String destination) {
    this.destination = destination;
  }


  public Segment dateOfTravel(LocalDate dateOfTravel) {
    
    this.dateOfTravel = dateOfTravel;
    return this;
  }

   /**
   * Get dateOfTravel
   * @return dateOfTravel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_TRAVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDateOfTravel() {
    return dateOfTravel;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_TRAVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfTravel(LocalDate dateOfTravel) {
    this.dateOfTravel = dateOfTravel;
  }


  public Segment segmentsId(Integer segmentsId) {
    
    this.segmentsId = segmentsId;
    return this;
  }

   /**
   * Get segmentsId
   * @return segmentsId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENTS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSegmentsId() {
    return segmentsId;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENTS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentsId(Integer segmentsId) {
    this.segmentsId = segmentsId;
  }


  public Segment slicesId(String slicesId) {
    
    this.slicesId = slicesId;
    return this;
  }

   /**
   * Get slicesId
   * @return slicesId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLICES_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlicesId() {
    return slicesId;
  }


  @JsonProperty(JSON_PROPERTY_SLICES_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlicesId(String slicesId) {
    this.slicesId = slicesId;
  }


  public Segment timestampCreated(OffsetDateTime timestampCreated) {
    
    this.timestampCreated = timestampCreated;
    return this;
  }

   /**
   * Get timestampCreated
   * @return timestampCreated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestampCreated() {
    return timestampCreated;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestampCreated(OffsetDateTime timestampCreated) {
    this.timestampCreated = timestampCreated;
  }


  public Segment authPnrId(String authPnrId) {
    
    this.authPnrId = authPnrId;
    return this;
  }

   /**
   * Get authPnrId
   * @return authPnrId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_PNR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthPnrId() {
    return authPnrId;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_PNR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthPnrId(String authPnrId) {
    this.authPnrId = authPnrId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(this.id, segment.id) &&
        Objects.equals(this.origin, segment.origin) &&
        Objects.equals(this.flightNo, segment.flightNo) &&
        Objects.equals(this.carrierCode, segment.carrierCode) &&
        Objects.equals(this.fareBaseCode, segment.fareBaseCode) &&
        Objects.equals(this.classOfTravel, segment.classOfTravel) &&
        Objects.equals(this.stopOverCode, segment.stopOverCode) &&
        Objects.equals(this.destination, segment.destination) &&
        Objects.equals(this.dateOfTravel, segment.dateOfTravel) &&
        Objects.equals(this.segmentsId, segment.segmentsId) &&
        Objects.equals(this.slicesId, segment.slicesId) &&
        Objects.equals(this.timestampCreated, segment.timestampCreated) &&
        Objects.equals(this.authPnrId, segment.authPnrId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, origin, flightNo, carrierCode, fareBaseCode, classOfTravel, stopOverCode, destination, dateOfTravel, segmentsId, slicesId, timestampCreated, authPnrId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    flightNo: ").append(toIndentedString(flightNo)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    fareBaseCode: ").append(toIndentedString(fareBaseCode)).append("\n");
    sb.append("    classOfTravel: ").append(toIndentedString(classOfTravel)).append("\n");
    sb.append("    stopOverCode: ").append(toIndentedString(stopOverCode)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    dateOfTravel: ").append(toIndentedString(dateOfTravel)).append("\n");
    sb.append("    segmentsId: ").append(toIndentedString(segmentsId)).append("\n");
    sb.append("    slicesId: ").append(toIndentedString(slicesId)).append("\n");
    sb.append("    timestampCreated: ").append(toIndentedString(timestampCreated)).append("\n");
    sb.append("    authPnrId: ").append(toIndentedString(authPnrId)).append("\n");
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

