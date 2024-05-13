/*
 * Boom API
 * ## Base URL  The base URL for all API requests is:  `http://104.42.44.252/BoomAPI/api/Genric`  ## Errors  This API uses the following error codes:  - `100 Success` - `101 User Request Error` - `102 Error`  ------
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CheckPortinMdnRequest
 */
@JsonPropertyOrder({
  CheckPortinMdnRequest.JSON_PROPERTY_CLIENT_CODE,
  CheckPortinMdnRequest.JSON_PROPERTY_IMEI,
  CheckPortinMdnRequest.JSON_PROPERTY_SERIAL_NUMBER,
  CheckPortinMdnRequest.JSON_PROPERTY_MSISDN,
  CheckPortinMdnRequest.JSON_PROPERTY_CARRIER_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:50.381152Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CheckPortinMdnRequest {
  public static final String JSON_PROPERTY_CLIENT_CODE = "ClientCode";
  private String clientCode;

  public static final String JSON_PROPERTY_IMEI = "Imei";
  private String imei;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "SerialNumber";
  private String serialNumber;

  public static final String JSON_PROPERTY_MSISDN = "Msisdn";
  private String msisdn;

  public static final String JSON_PROPERTY_CARRIER_TYPE = "Carrier_Type";
  private Integer carrierType;

  public CheckPortinMdnRequest() {
  }

  public CheckPortinMdnRequest clientCode(String clientCode) {
    
    this.clientCode = clientCode;
    return this;
  }

   /**
   * Get clientCode
   * @return clientCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientCode() {
    return clientCode;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientCode(String clientCode) {
    this.clientCode = clientCode;
  }


  public CheckPortinMdnRequest imei(String imei) {
    
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImei() {
    return imei;
  }


  @JsonProperty(JSON_PROPERTY_IMEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImei(String imei) {
    this.imei = imei;
  }


  public CheckPortinMdnRequest serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNumber() {
    return serialNumber;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public CheckPortinMdnRequest msisdn(String msisdn) {
    
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSISDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsisdn() {
    return msisdn;
  }


  @JsonProperty(JSON_PROPERTY_MSISDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }


  public CheckPortinMdnRequest carrierType(Integer carrierType) {
    
    this.carrierType = carrierType;
    return this;
  }

   /**
   * Get carrierType
   * @return carrierType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCarrierType() {
    return carrierType;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierType(Integer carrierType) {
    this.carrierType = carrierType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPortinMdnRequest checkPortinMdnRequest = (CheckPortinMdnRequest) o;
    return Objects.equals(this.clientCode, checkPortinMdnRequest.clientCode) &&
        Objects.equals(this.imei, checkPortinMdnRequest.imei) &&
        Objects.equals(this.serialNumber, checkPortinMdnRequest.serialNumber) &&
        Objects.equals(this.msisdn, checkPortinMdnRequest.msisdn) &&
        Objects.equals(this.carrierType, checkPortinMdnRequest.carrierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCode, imei, serialNumber, msisdn, carrierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPortinMdnRequest {\n");
    sb.append("    clientCode: ").append(toIndentedString(clientCode)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    carrierType: ").append(toIndentedString(carrierType)).append("\n");
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

