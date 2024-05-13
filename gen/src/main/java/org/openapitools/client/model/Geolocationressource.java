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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Geolocationressource
 */
@JsonPropertyOrder({
  Geolocationressource.JSON_PROPERTY_LOCATIONS,
  Geolocationressource.JSON_PROPERTY_FROM,
  Geolocationressource.JSON_PROPERTY_TO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Geolocationressource {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM = "from";
  private Integer from;

  public static final String JSON_PROPERTY_TO = "to";
  private Integer to;

  public Geolocationressource() {
  }

  public Geolocationressource locations(List<String> locations) {
    
    this.locations = locations;
    return this;
  }

  public Geolocationressource addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(List<String> locations) {
    this.locations = locations;
  }


  public Geolocationressource from(Integer from) {
    
    this.from = from;
    return this;
  }

   /**
   * Timestamp &#x60;Geolocation ressource&#x60; from
   * @return from
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(Integer from) {
    this.from = from;
  }


  public Geolocationressource to(Integer to) {
    
    this.to = to;
    return this;
  }

   /**
   * Timestamp &#x60;Geolocation ressource&#x60; to
   * @return to
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(Integer to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Geolocationressource geolocationressource = (Geolocationressource) o;
    return Objects.equals(this.locations, geolocationressource.locations) &&
        Objects.equals(this.from, geolocationressource.from) &&
        Objects.equals(this.to, geolocationressource.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geolocationressource {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
