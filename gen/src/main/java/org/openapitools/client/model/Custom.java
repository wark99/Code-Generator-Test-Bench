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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ModelCharacteristics;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Custom
 */
@JsonPropertyOrder({
  Custom.JSON_PROPERTY_BLOCK_GROUP_STATUS,
  Custom.JSON_PROPERTY_CARRIER_ROUTE,
  Custom.JSON_PROPERTY_CENSUS_BLOCK_CODE,
  Custom.JSON_PROPERTY_CENSUS_TRACT_CODE,
  Custom.JSON_PROPERTY_CENSUS_TRACT_STATUS,
  Custom.JSON_PROPERTY_CENSUS_TRACT_SUFFIX,
  Custom.JSON_PROPERTY_CHECK_DIGIT,
  Custom.JSON_PROPERTY_CMSA,
  Custom.JSON_PROPERTY_CONGRESSIONAL_DISTRICT,
  Custom.JSON_PROPERTY_DELIVERY_POINT,
  Custom.JSON_PROPERTY_FIPS,
  Custom.JSON_PROPERTY_LATITUDE,
  Custom.JSON_PROPERTY_LONGITUDE,
  Custom.JSON_PROPERTY_MODEL_CHARACTERISTICS,
  Custom.JSON_PROPERTY_MSA_CODE,
  Custom.JSON_PROPERTY_SORT_ZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Custom {
  public static final String JSON_PROPERTY_BLOCK_GROUP_STATUS = "blockGroupStatus";
  private String blockGroupStatus;

  public static final String JSON_PROPERTY_CARRIER_ROUTE = "carrierRoute";
  private String carrierRoute;

  public static final String JSON_PROPERTY_CENSUS_BLOCK_CODE = "censusBlockCode";
  private String censusBlockCode;

  public static final String JSON_PROPERTY_CENSUS_TRACT_CODE = "censusTractCode";
  private String censusTractCode;

  public static final String JSON_PROPERTY_CENSUS_TRACT_STATUS = "censusTractStatus";
  private String censusTractStatus;

  public static final String JSON_PROPERTY_CENSUS_TRACT_SUFFIX = "censusTractSuffix";
  private String censusTractSuffix;

  public static final String JSON_PROPERTY_CHECK_DIGIT = "checkDigit";
  private String checkDigit;

  public static final String JSON_PROPERTY_CMSA = "cmsa";
  private String cmsa;

  public static final String JSON_PROPERTY_CONGRESSIONAL_DISTRICT = "congressionalDistrict";
  private String congressionalDistrict;

  public static final String JSON_PROPERTY_DELIVERY_POINT = "deliveryPoint";
  private String deliveryPoint;

  public static final String JSON_PROPERTY_FIPS = "fips";
  private String fips;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private String latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private String longitude;

  public static final String JSON_PROPERTY_MODEL_CHARACTERISTICS = "modelCharacteristics";
  private List<ModelCharacteristics> modelCharacteristics;

  public static final String JSON_PROPERTY_MSA_CODE = "msaCode";
  private String msaCode;

  public static final String JSON_PROPERTY_SORT_ZONE = "sortZone";
  private String sortZone;

  public Custom() {
  }

  public Custom blockGroupStatus(String blockGroupStatus) {
    
    this.blockGroupStatus = blockGroupStatus;
    return this;
  }

   /**
   * Get blockGroupStatus
   * @return blockGroupStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_GROUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlockGroupStatus() {
    return blockGroupStatus;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_GROUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockGroupStatus(String blockGroupStatus) {
    this.blockGroupStatus = blockGroupStatus;
  }


  public Custom carrierRoute(String carrierRoute) {
    
    this.carrierRoute = carrierRoute;
    return this;
  }

   /**
   * Get carrierRoute
   * @return carrierRoute
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierRoute() {
    return carrierRoute;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierRoute(String carrierRoute) {
    this.carrierRoute = carrierRoute;
  }


  public Custom censusBlockCode(String censusBlockCode) {
    
    this.censusBlockCode = censusBlockCode;
    return this;
  }

   /**
   * Get censusBlockCode
   * @return censusBlockCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CENSUS_BLOCK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCensusBlockCode() {
    return censusBlockCode;
  }


  @JsonProperty(JSON_PROPERTY_CENSUS_BLOCK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCensusBlockCode(String censusBlockCode) {
    this.censusBlockCode = censusBlockCode;
  }


  public Custom censusTractCode(String censusTractCode) {
    
    this.censusTractCode = censusTractCode;
    return this;
  }

   /**
   * Get censusTractCode
   * @return censusTractCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CENSUS_TRACT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCensusTractCode() {
    return censusTractCode;
  }


  @JsonProperty(JSON_PROPERTY_CENSUS_TRACT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCensusTractCode(String censusTractCode) {
    this.censusTractCode = censusTractCode;
  }


  public Custom censusTractStatus(String censusTractStatus) {
    
    this.censusTractStatus = censusTractStatus;
    return this;
  }

   /**
   * Get censusTractStatus
   * @return censusTractStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CENSUS_TRACT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCensusTractStatus() {
    return censusTractStatus;
  }


  @JsonProperty(JSON_PROPERTY_CENSUS_TRACT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCensusTractStatus(String censusTractStatus) {
    this.censusTractStatus = censusTractStatus;
  }


  public Custom censusTractSuffix(String censusTractSuffix) {
    
    this.censusTractSuffix = censusTractSuffix;
    return this;
  }

   /**
   * Get censusTractSuffix
   * @return censusTractSuffix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CENSUS_TRACT_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCensusTractSuffix() {
    return censusTractSuffix;
  }


  @JsonProperty(JSON_PROPERTY_CENSUS_TRACT_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCensusTractSuffix(String censusTractSuffix) {
    this.censusTractSuffix = censusTractSuffix;
  }


  public Custom checkDigit(String checkDigit) {
    
    this.checkDigit = checkDigit;
    return this;
  }

   /**
   * Get checkDigit
   * @return checkDigit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_DIGIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckDigit() {
    return checkDigit;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_DIGIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckDigit(String checkDigit) {
    this.checkDigit = checkDigit;
  }


  public Custom cmsa(String cmsa) {
    
    this.cmsa = cmsa;
    return this;
  }

   /**
   * Get cmsa
   * @return cmsa
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CMSA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCmsa() {
    return cmsa;
  }


  @JsonProperty(JSON_PROPERTY_CMSA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmsa(String cmsa) {
    this.cmsa = cmsa;
  }


  public Custom congressionalDistrict(String congressionalDistrict) {
    
    this.congressionalDistrict = congressionalDistrict;
    return this;
  }

   /**
   * Get congressionalDistrict
   * @return congressionalDistrict
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONGRESSIONAL_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCongressionalDistrict() {
    return congressionalDistrict;
  }


  @JsonProperty(JSON_PROPERTY_CONGRESSIONAL_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCongressionalDistrict(String congressionalDistrict) {
    this.congressionalDistrict = congressionalDistrict;
  }


  public Custom deliveryPoint(String deliveryPoint) {
    
    this.deliveryPoint = deliveryPoint;
    return this;
  }

   /**
   * Get deliveryPoint
   * @return deliveryPoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveryPoint() {
    return deliveryPoint;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryPoint(String deliveryPoint) {
    this.deliveryPoint = deliveryPoint;
  }


  public Custom fips(String fips) {
    
    this.fips = fips;
    return this;
  }

   /**
   * Get fips
   * @return fips
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFips() {
    return fips;
  }


  @JsonProperty(JSON_PROPERTY_FIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFips(String fips) {
    this.fips = fips;
  }


  public Custom latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public Custom longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public Custom modelCharacteristics(List<ModelCharacteristics> modelCharacteristics) {
    
    this.modelCharacteristics = modelCharacteristics;
    return this;
  }

  public Custom addModelCharacteristicsItem(ModelCharacteristics modelCharacteristicsItem) {
    if (this.modelCharacteristics == null) {
      this.modelCharacteristics = new ArrayList<>();
    }
    this.modelCharacteristics.add(modelCharacteristicsItem);
    return this;
  }

   /**
   * Get modelCharacteristics
   * @return modelCharacteristics
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_CHARACTERISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModelCharacteristics> getModelCharacteristics() {
    return modelCharacteristics;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_CHARACTERISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelCharacteristics(List<ModelCharacteristics> modelCharacteristics) {
    this.modelCharacteristics = modelCharacteristics;
  }


  public Custom msaCode(String msaCode) {
    
    this.msaCode = msaCode;
    return this;
  }

   /**
   * Get msaCode
   * @return msaCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSA_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsaCode() {
    return msaCode;
  }


  @JsonProperty(JSON_PROPERTY_MSA_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsaCode(String msaCode) {
    this.msaCode = msaCode;
  }


  public Custom sortZone(String sortZone) {
    
    this.sortZone = sortZone;
    return this;
  }

   /**
   * Get sortZone
   * @return sortZone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortZone() {
    return sortZone;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortZone(String sortZone) {
    this.sortZone = sortZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Custom custom = (Custom) o;
    return Objects.equals(this.blockGroupStatus, custom.blockGroupStatus) &&
        Objects.equals(this.carrierRoute, custom.carrierRoute) &&
        Objects.equals(this.censusBlockCode, custom.censusBlockCode) &&
        Objects.equals(this.censusTractCode, custom.censusTractCode) &&
        Objects.equals(this.censusTractStatus, custom.censusTractStatus) &&
        Objects.equals(this.censusTractSuffix, custom.censusTractSuffix) &&
        Objects.equals(this.checkDigit, custom.checkDigit) &&
        Objects.equals(this.cmsa, custom.cmsa) &&
        Objects.equals(this.congressionalDistrict, custom.congressionalDistrict) &&
        Objects.equals(this.deliveryPoint, custom.deliveryPoint) &&
        Objects.equals(this.fips, custom.fips) &&
        Objects.equals(this.latitude, custom.latitude) &&
        Objects.equals(this.longitude, custom.longitude) &&
        Objects.equals(this.modelCharacteristics, custom.modelCharacteristics) &&
        Objects.equals(this.msaCode, custom.msaCode) &&
        Objects.equals(this.sortZone, custom.sortZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockGroupStatus, carrierRoute, censusBlockCode, censusTractCode, censusTractStatus, censusTractSuffix, checkDigit, cmsa, congressionalDistrict, deliveryPoint, fips, latitude, longitude, modelCharacteristics, msaCode, sortZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Custom {\n");
    sb.append("    blockGroupStatus: ").append(toIndentedString(blockGroupStatus)).append("\n");
    sb.append("    carrierRoute: ").append(toIndentedString(carrierRoute)).append("\n");
    sb.append("    censusBlockCode: ").append(toIndentedString(censusBlockCode)).append("\n");
    sb.append("    censusTractCode: ").append(toIndentedString(censusTractCode)).append("\n");
    sb.append("    censusTractStatus: ").append(toIndentedString(censusTractStatus)).append("\n");
    sb.append("    censusTractSuffix: ").append(toIndentedString(censusTractSuffix)).append("\n");
    sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
    sb.append("    cmsa: ").append(toIndentedString(cmsa)).append("\n");
    sb.append("    congressionalDistrict: ").append(toIndentedString(congressionalDistrict)).append("\n");
    sb.append("    deliveryPoint: ").append(toIndentedString(deliveryPoint)).append("\n");
    sb.append("    fips: ").append(toIndentedString(fips)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    modelCharacteristics: ").append(toIndentedString(modelCharacteristics)).append("\n");
    sb.append("    msaCode: ").append(toIndentedString(msaCode)).append("\n");
    sb.append("    sortZone: ").append(toIndentedString(sortZone)).append("\n");
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

