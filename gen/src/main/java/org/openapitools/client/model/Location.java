/*
 * Customer Authorization API
 *  # Introduction Customer Authorization API The Customer Authorization API is the web service that allows you to exchange your application's `Client ID` and `Client Secret` for an `Access Token`. You will need to use the `accessToken` as authentication for all the other web requests, in the form of a HTTP Header as it follows: ``` Authorization: Bearer {accessToken} ```   Data API The Data API is the web service that allows you to obtain three kinds of data related to your users:    - Bank Account data   - Bank Transactions data   - Credit Score (VS 4.0) data   - Credit Report (VS 4.0) data 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: vs4plus@vantagescore.com
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
import org.openapitools.client.model.County;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Location
 */
@JsonPropertyOrder({
  Location.JSON_PROPERTY_CITY,
  Location.JSON_PROPERTY_COUNTRY,
  Location.JSON_PROPERTY_COUNTY,
  Location.JSON_PROPERTY_STATE,
  Location.JSON_PROPERTY_UNPARSED,
  Location.JSON_PROPERTY_ZIP_CODE,
  Location.JSON_PROPERTY_ZIP_EXTENSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Location {
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_COUNTY = "county";
  private County county;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_UNPARSED = "unparsed";
  private String unparsed;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public static final String JSON_PROPERTY_ZIP_EXTENSION = "zipExtension";
  private String zipExtension;

  public Location() {
  }

  public Location city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public Location country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public Location county(County county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public County getCounty() {
    return county;
  }


  @JsonProperty(JSON_PROPERTY_COUNTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounty(County county) {
    this.county = county;
  }


  public Location state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public Location unparsed(String unparsed) {
    
    this.unparsed = unparsed;
    return this;
  }

   /**
   * Get unparsed
   * @return unparsed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNPARSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnparsed() {
    return unparsed;
  }


  @JsonProperty(JSON_PROPERTY_UNPARSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnparsed(String unparsed) {
    this.unparsed = unparsed;
  }


  public Location zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public Location zipExtension(String zipExtension) {
    
    this.zipExtension = zipExtension;
    return this;
  }

   /**
   * Get zipExtension
   * @return zipExtension
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipExtension() {
    return zipExtension;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipExtension(String zipExtension) {
    this.zipExtension = zipExtension;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.city, location.city) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.county, location.county) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.unparsed, location.unparsed) &&
        Objects.equals(this.zipCode, location.zipCode) &&
        Objects.equals(this.zipExtension, location.zipExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, county, state, unparsed, zipCode, zipExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    unparsed: ").append(toIndentedString(unparsed)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipExtension: ").append(toIndentedString(zipExtension)).append("\n");
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

