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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V40ReportEquifaxDataConsumerReferralLocationAddress
 */
@JsonPropertyOrder({
  V40ReportEquifaxDataConsumerReferralLocationAddress.JSON_PROPERTY_PRIMARY_ADDRESS,
  V40ReportEquifaxDataConsumerReferralLocationAddress.JSON_PROPERTY_SECONDARY_ADDRESS,
  V40ReportEquifaxDataConsumerReferralLocationAddress.JSON_PROPERTY_CITY_NAME,
  V40ReportEquifaxDataConsumerReferralLocationAddress.JSON_PROPERTY_STATE_ABBREVIATION,
  V40ReportEquifaxDataConsumerReferralLocationAddress.JSON_PROPERTY_ZIP_CODE
})
@JsonTypeName("V4_0_ReportEquifax_data_consumerReferralLocation_address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportEquifaxDataConsumerReferralLocationAddress {
  public static final String JSON_PROPERTY_PRIMARY_ADDRESS = "primaryAddress";
  private String primaryAddress;

  public static final String JSON_PROPERTY_SECONDARY_ADDRESS = "secondaryAddress";
  private String secondaryAddress;

  public static final String JSON_PROPERTY_CITY_NAME = "cityName";
  private String cityName;

  public static final String JSON_PROPERTY_STATE_ABBREVIATION = "stateAbbreviation";
  private String stateAbbreviation;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public V40ReportEquifaxDataConsumerReferralLocationAddress() {
  }

  public V40ReportEquifaxDataConsumerReferralLocationAddress primaryAddress(String primaryAddress) {
    
    this.primaryAddress = primaryAddress;
    return this;
  }

   /**
   * Get primaryAddress
   * @return primaryAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryAddress() {
    return primaryAddress;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryAddress(String primaryAddress) {
    this.primaryAddress = primaryAddress;
  }


  public V40ReportEquifaxDataConsumerReferralLocationAddress secondaryAddress(String secondaryAddress) {
    
    this.secondaryAddress = secondaryAddress;
    return this;
  }

   /**
   * Get secondaryAddress
   * @return secondaryAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryAddress() {
    return secondaryAddress;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryAddress(String secondaryAddress) {
    this.secondaryAddress = secondaryAddress;
  }


  public V40ReportEquifaxDataConsumerReferralLocationAddress cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * Get cityName
   * @return cityName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCityName() {
    return cityName;
  }


  @JsonProperty(JSON_PROPERTY_CITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public V40ReportEquifaxDataConsumerReferralLocationAddress stateAbbreviation(String stateAbbreviation) {
    
    this.stateAbbreviation = stateAbbreviation;
    return this;
  }

   /**
   * Get stateAbbreviation
   * @return stateAbbreviation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_ABBREVIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateAbbreviation() {
    return stateAbbreviation;
  }


  @JsonProperty(JSON_PROPERTY_STATE_ABBREVIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateAbbreviation(String stateAbbreviation) {
    this.stateAbbreviation = stateAbbreviation;
  }


  public V40ReportEquifaxDataConsumerReferralLocationAddress zipCode(String zipCode) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportEquifaxDataConsumerReferralLocationAddress v40ReportEquifaxDataConsumerReferralLocationAddress = (V40ReportEquifaxDataConsumerReferralLocationAddress) o;
    return Objects.equals(this.primaryAddress, v40ReportEquifaxDataConsumerReferralLocationAddress.primaryAddress) &&
        Objects.equals(this.secondaryAddress, v40ReportEquifaxDataConsumerReferralLocationAddress.secondaryAddress) &&
        Objects.equals(this.cityName, v40ReportEquifaxDataConsumerReferralLocationAddress.cityName) &&
        Objects.equals(this.stateAbbreviation, v40ReportEquifaxDataConsumerReferralLocationAddress.stateAbbreviation) &&
        Objects.equals(this.zipCode, v40ReportEquifaxDataConsumerReferralLocationAddress.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAddress, secondaryAddress, cityName, stateAbbreviation, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportEquifaxDataConsumerReferralLocationAddress {\n");
    sb.append("    primaryAddress: ").append(toIndentedString(primaryAddress)).append("\n");
    sb.append("    secondaryAddress: ").append(toIndentedString(secondaryAddress)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateAbbreviation: ").append(toIndentedString(stateAbbreviation)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

