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
import org.openapitools.client.model.V40EquifaxScoreNumberOrMaxIndustryCode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V40ReportEquifaxDataOnlineGeoCodeInner
 */
@JsonPropertyOrder({
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_S_M_S_A_CODE,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_STATE_CODE,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_COUNTY_CODE,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_CENSUS_TRACT,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_SUFFIX,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_BLOCK_GROUP,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_STREET_NUMBER,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_STREET_NAME,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_STREET_TYPE_OR_DIRECTION,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_GEO_S_M_S_A5_DIGIT_CODE,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_CITY,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_STATE_ABBREVIATION,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_ZIP_CODE,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_TYPE_OF_ADDRESS,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_RETURN_CODE1,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_RETURN_CODE2,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_RETURN_CODE3,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_RETURN_CODE4,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_MICRO_VISION_CODE,
  V40ReportEquifaxDataOnlineGeoCodeInner.JSON_PROPERTY_MICRO_VISION_RETURN_CODE
})
@JsonTypeName("V4_0_ReportEquifax_data_onlineGeoCode_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportEquifaxDataOnlineGeoCodeInner {
  public static final String JSON_PROPERTY_GEO_S_M_S_A_CODE = "geoSMSACode";
  private String geoSMSACode;

  public static final String JSON_PROPERTY_GEO_STATE_CODE = "geoStateCode";
  private String geoStateCode;

  public static final String JSON_PROPERTY_GEO_COUNTY_CODE = "geoCountyCode";
  private String geoCountyCode;

  public static final String JSON_PROPERTY_GEO_CENSUS_TRACT = "geoCensusTract";
  private String geoCensusTract;

  public static final String JSON_PROPERTY_GEO_SUFFIX = "geoSuffix";
  private String geoSuffix;

  public static final String JSON_PROPERTY_GEO_BLOCK_GROUP = "geoBlockGroup";
  private String geoBlockGroup;

  public static final String JSON_PROPERTY_STREET_NUMBER = "streetNumber";
  private String streetNumber;

  public static final String JSON_PROPERTY_STREET_NAME = "streetName";
  private String streetName;

  public static final String JSON_PROPERTY_STREET_TYPE_OR_DIRECTION = "streetTypeOrDirection";
  private String streetTypeOrDirection;

  public static final String JSON_PROPERTY_GEO_S_M_S_A5_DIGIT_CODE = "geoSMSA5DigitCode";
  private String geoSMSA5DigitCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE_ABBREVIATION = "stateAbbreviation";
  private String stateAbbreviation;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public static final String JSON_PROPERTY_TYPE_OF_ADDRESS = "typeOfAddress";
  private V40EquifaxScoreNumberOrMaxIndustryCode typeOfAddress;

  public static final String JSON_PROPERTY_RETURN_CODE1 = "returnCode1";
  private V40EquifaxScoreNumberOrMaxIndustryCode returnCode1;

  public static final String JSON_PROPERTY_RETURN_CODE2 = "returnCode2";
  private V40EquifaxScoreNumberOrMaxIndustryCode returnCode2;

  public static final String JSON_PROPERTY_RETURN_CODE3 = "returnCode3";
  private V40EquifaxScoreNumberOrMaxIndustryCode returnCode3;

  public static final String JSON_PROPERTY_RETURN_CODE4 = "returnCode4";
  private V40EquifaxScoreNumberOrMaxIndustryCode returnCode4;

  public static final String JSON_PROPERTY_MICRO_VISION_CODE = "microVisionCode";
  private String microVisionCode;

  public static final String JSON_PROPERTY_MICRO_VISION_RETURN_CODE = "microVisionReturnCode";
  private String microVisionReturnCode;

  public V40ReportEquifaxDataOnlineGeoCodeInner() {
  }

  public V40ReportEquifaxDataOnlineGeoCodeInner geoSMSACode(String geoSMSACode) {
    
    this.geoSMSACode = geoSMSACode;
    return this;
  }

   /**
   * Get geoSMSACode
   * @return geoSMSACode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_S_M_S_A_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoSMSACode() {
    return geoSMSACode;
  }


  @JsonProperty(JSON_PROPERTY_GEO_S_M_S_A_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoSMSACode(String geoSMSACode) {
    this.geoSMSACode = geoSMSACode;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner geoStateCode(String geoStateCode) {
    
    this.geoStateCode = geoStateCode;
    return this;
  }

   /**
   * Get geoStateCode
   * @return geoStateCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_STATE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoStateCode() {
    return geoStateCode;
  }


  @JsonProperty(JSON_PROPERTY_GEO_STATE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoStateCode(String geoStateCode) {
    this.geoStateCode = geoStateCode;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner geoCountyCode(String geoCountyCode) {
    
    this.geoCountyCode = geoCountyCode;
    return this;
  }

   /**
   * Get geoCountyCode
   * @return geoCountyCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_COUNTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoCountyCode() {
    return geoCountyCode;
  }


  @JsonProperty(JSON_PROPERTY_GEO_COUNTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoCountyCode(String geoCountyCode) {
    this.geoCountyCode = geoCountyCode;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner geoCensusTract(String geoCensusTract) {
    
    this.geoCensusTract = geoCensusTract;
    return this;
  }

   /**
   * Get geoCensusTract
   * @return geoCensusTract
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_CENSUS_TRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoCensusTract() {
    return geoCensusTract;
  }


  @JsonProperty(JSON_PROPERTY_GEO_CENSUS_TRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoCensusTract(String geoCensusTract) {
    this.geoCensusTract = geoCensusTract;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner geoSuffix(String geoSuffix) {
    
    this.geoSuffix = geoSuffix;
    return this;
  }

   /**
   * Get geoSuffix
   * @return geoSuffix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoSuffix() {
    return geoSuffix;
  }


  @JsonProperty(JSON_PROPERTY_GEO_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoSuffix(String geoSuffix) {
    this.geoSuffix = geoSuffix;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner geoBlockGroup(String geoBlockGroup) {
    
    this.geoBlockGroup = geoBlockGroup;
    return this;
  }

   /**
   * Get geoBlockGroup
   * @return geoBlockGroup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_BLOCK_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoBlockGroup() {
    return geoBlockGroup;
  }


  @JsonProperty(JSON_PROPERTY_GEO_BLOCK_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoBlockGroup(String geoBlockGroup) {
    this.geoBlockGroup = geoBlockGroup;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetNumber() {
    return streetNumber;
  }


  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetName() {
    return streetName;
  }


  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner streetTypeOrDirection(String streetTypeOrDirection) {
    
    this.streetTypeOrDirection = streetTypeOrDirection;
    return this;
  }

   /**
   * Get streetTypeOrDirection
   * @return streetTypeOrDirection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET_TYPE_OR_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetTypeOrDirection() {
    return streetTypeOrDirection;
  }


  @JsonProperty(JSON_PROPERTY_STREET_TYPE_OR_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetTypeOrDirection(String streetTypeOrDirection) {
    this.streetTypeOrDirection = streetTypeOrDirection;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner geoSMSA5DigitCode(String geoSMSA5DigitCode) {
    
    this.geoSMSA5DigitCode = geoSMSA5DigitCode;
    return this;
  }

   /**
   * Get geoSMSA5DigitCode
   * @return geoSMSA5DigitCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_S_M_S_A5_DIGIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoSMSA5DigitCode() {
    return geoSMSA5DigitCode;
  }


  @JsonProperty(JSON_PROPERTY_GEO_S_M_S_A5_DIGIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoSMSA5DigitCode(String geoSMSA5DigitCode) {
    this.geoSMSA5DigitCode = geoSMSA5DigitCode;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner city(String city) {
    
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


  public V40ReportEquifaxDataOnlineGeoCodeInner stateAbbreviation(String stateAbbreviation) {
    
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


  public V40ReportEquifaxDataOnlineGeoCodeInner zipCode(String zipCode) {
    
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


  public V40ReportEquifaxDataOnlineGeoCodeInner typeOfAddress(V40EquifaxScoreNumberOrMaxIndustryCode typeOfAddress) {
    
    this.typeOfAddress = typeOfAddress;
    return this;
  }

   /**
   * Get typeOfAddress
   * @return typeOfAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_OF_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getTypeOfAddress() {
    return typeOfAddress;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_OF_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeOfAddress(V40EquifaxScoreNumberOrMaxIndustryCode typeOfAddress) {
    this.typeOfAddress = typeOfAddress;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner returnCode1(V40EquifaxScoreNumberOrMaxIndustryCode returnCode1) {
    
    this.returnCode1 = returnCode1;
    return this;
  }

   /**
   * Get returnCode1
   * @return returnCode1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CODE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getReturnCode1() {
    return returnCode1;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_CODE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnCode1(V40EquifaxScoreNumberOrMaxIndustryCode returnCode1) {
    this.returnCode1 = returnCode1;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner returnCode2(V40EquifaxScoreNumberOrMaxIndustryCode returnCode2) {
    
    this.returnCode2 = returnCode2;
    return this;
  }

   /**
   * Get returnCode2
   * @return returnCode2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CODE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getReturnCode2() {
    return returnCode2;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_CODE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnCode2(V40EquifaxScoreNumberOrMaxIndustryCode returnCode2) {
    this.returnCode2 = returnCode2;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner returnCode3(V40EquifaxScoreNumberOrMaxIndustryCode returnCode3) {
    
    this.returnCode3 = returnCode3;
    return this;
  }

   /**
   * Get returnCode3
   * @return returnCode3
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CODE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getReturnCode3() {
    return returnCode3;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_CODE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnCode3(V40EquifaxScoreNumberOrMaxIndustryCode returnCode3) {
    this.returnCode3 = returnCode3;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner returnCode4(V40EquifaxScoreNumberOrMaxIndustryCode returnCode4) {
    
    this.returnCode4 = returnCode4;
    return this;
  }

   /**
   * Get returnCode4
   * @return returnCode4
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CODE4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getReturnCode4() {
    return returnCode4;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_CODE4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnCode4(V40EquifaxScoreNumberOrMaxIndustryCode returnCode4) {
    this.returnCode4 = returnCode4;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner microVisionCode(String microVisionCode) {
    
    this.microVisionCode = microVisionCode;
    return this;
  }

   /**
   * Get microVisionCode
   * @return microVisionCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MICRO_VISION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMicroVisionCode() {
    return microVisionCode;
  }


  @JsonProperty(JSON_PROPERTY_MICRO_VISION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMicroVisionCode(String microVisionCode) {
    this.microVisionCode = microVisionCode;
  }


  public V40ReportEquifaxDataOnlineGeoCodeInner microVisionReturnCode(String microVisionReturnCode) {
    
    this.microVisionReturnCode = microVisionReturnCode;
    return this;
  }

   /**
   * Get microVisionReturnCode
   * @return microVisionReturnCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MICRO_VISION_RETURN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMicroVisionReturnCode() {
    return microVisionReturnCode;
  }


  @JsonProperty(JSON_PROPERTY_MICRO_VISION_RETURN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMicroVisionReturnCode(String microVisionReturnCode) {
    this.microVisionReturnCode = microVisionReturnCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportEquifaxDataOnlineGeoCodeInner v40ReportEquifaxDataOnlineGeoCodeInner = (V40ReportEquifaxDataOnlineGeoCodeInner) o;
    return Objects.equals(this.geoSMSACode, v40ReportEquifaxDataOnlineGeoCodeInner.geoSMSACode) &&
        Objects.equals(this.geoStateCode, v40ReportEquifaxDataOnlineGeoCodeInner.geoStateCode) &&
        Objects.equals(this.geoCountyCode, v40ReportEquifaxDataOnlineGeoCodeInner.geoCountyCode) &&
        Objects.equals(this.geoCensusTract, v40ReportEquifaxDataOnlineGeoCodeInner.geoCensusTract) &&
        Objects.equals(this.geoSuffix, v40ReportEquifaxDataOnlineGeoCodeInner.geoSuffix) &&
        Objects.equals(this.geoBlockGroup, v40ReportEquifaxDataOnlineGeoCodeInner.geoBlockGroup) &&
        Objects.equals(this.streetNumber, v40ReportEquifaxDataOnlineGeoCodeInner.streetNumber) &&
        Objects.equals(this.streetName, v40ReportEquifaxDataOnlineGeoCodeInner.streetName) &&
        Objects.equals(this.streetTypeOrDirection, v40ReportEquifaxDataOnlineGeoCodeInner.streetTypeOrDirection) &&
        Objects.equals(this.geoSMSA5DigitCode, v40ReportEquifaxDataOnlineGeoCodeInner.geoSMSA5DigitCode) &&
        Objects.equals(this.city, v40ReportEquifaxDataOnlineGeoCodeInner.city) &&
        Objects.equals(this.stateAbbreviation, v40ReportEquifaxDataOnlineGeoCodeInner.stateAbbreviation) &&
        Objects.equals(this.zipCode, v40ReportEquifaxDataOnlineGeoCodeInner.zipCode) &&
        Objects.equals(this.typeOfAddress, v40ReportEquifaxDataOnlineGeoCodeInner.typeOfAddress) &&
        Objects.equals(this.returnCode1, v40ReportEquifaxDataOnlineGeoCodeInner.returnCode1) &&
        Objects.equals(this.returnCode2, v40ReportEquifaxDataOnlineGeoCodeInner.returnCode2) &&
        Objects.equals(this.returnCode3, v40ReportEquifaxDataOnlineGeoCodeInner.returnCode3) &&
        Objects.equals(this.returnCode4, v40ReportEquifaxDataOnlineGeoCodeInner.returnCode4) &&
        Objects.equals(this.microVisionCode, v40ReportEquifaxDataOnlineGeoCodeInner.microVisionCode) &&
        Objects.equals(this.microVisionReturnCode, v40ReportEquifaxDataOnlineGeoCodeInner.microVisionReturnCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoSMSACode, geoStateCode, geoCountyCode, geoCensusTract, geoSuffix, geoBlockGroup, streetNumber, streetName, streetTypeOrDirection, geoSMSA5DigitCode, city, stateAbbreviation, zipCode, typeOfAddress, returnCode1, returnCode2, returnCode3, returnCode4, microVisionCode, microVisionReturnCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportEquifaxDataOnlineGeoCodeInner {\n");
    sb.append("    geoSMSACode: ").append(toIndentedString(geoSMSACode)).append("\n");
    sb.append("    geoStateCode: ").append(toIndentedString(geoStateCode)).append("\n");
    sb.append("    geoCountyCode: ").append(toIndentedString(geoCountyCode)).append("\n");
    sb.append("    geoCensusTract: ").append(toIndentedString(geoCensusTract)).append("\n");
    sb.append("    geoSuffix: ").append(toIndentedString(geoSuffix)).append("\n");
    sb.append("    geoBlockGroup: ").append(toIndentedString(geoBlockGroup)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetTypeOrDirection: ").append(toIndentedString(streetTypeOrDirection)).append("\n");
    sb.append("    geoSMSA5DigitCode: ").append(toIndentedString(geoSMSA5DigitCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateAbbreviation: ").append(toIndentedString(stateAbbreviation)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    typeOfAddress: ").append(toIndentedString(typeOfAddress)).append("\n");
    sb.append("    returnCode1: ").append(toIndentedString(returnCode1)).append("\n");
    sb.append("    returnCode2: ").append(toIndentedString(returnCode2)).append("\n");
    sb.append("    returnCode3: ").append(toIndentedString(returnCode3)).append("\n");
    sb.append("    returnCode4: ").append(toIndentedString(returnCode4)).append("\n");
    sb.append("    microVisionCode: ").append(toIndentedString(microVisionCode)).append("\n");
    sb.append("    microVisionReturnCode: ").append(toIndentedString(microVisionReturnCode)).append("\n");
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

