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
 * CheckIMEIRequest
 */
@JsonPropertyOrder({
  CheckIMEIRequest.JSON_PROPERTY_CLIENT_CODE,
  CheckIMEIRequest.JSON_PROPERTY_IMEI,
  CheckIMEIRequest.JSON_PROPERTY_CARRIER_TYPE,
  CheckIMEIRequest.JSON_PROPERTY_IS4G
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:50.381152Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CheckIMEIRequest {
  public static final String JSON_PROPERTY_CLIENT_CODE = "ClientCode";
  private String clientCode;

  public static final String JSON_PROPERTY_IMEI = "Imei";
  private String imei;

  public static final String JSON_PROPERTY_CARRIER_TYPE = "Carrier_Type";
  private Integer carrierType;

  public static final String JSON_PROPERTY_IS4G = "is4g";
  private Boolean is4g;

  public CheckIMEIRequest() {
  }

  public CheckIMEIRequest clientCode(String clientCode) {
    
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


  public CheckIMEIRequest imei(String imei) {
    
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


  public CheckIMEIRequest carrierType(Integer carrierType) {
    
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


  public CheckIMEIRequest is4g(Boolean is4g) {
    
    this.is4g = is4g;
    return this;
  }

   /**
   * Get is4g
   * @return is4g
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS4G)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIs4g() {
    return is4g;
  }


  @JsonProperty(JSON_PROPERTY_IS4G)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIs4g(Boolean is4g) {
    this.is4g = is4g;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckIMEIRequest checkIMEIRequest = (CheckIMEIRequest) o;
    return Objects.equals(this.clientCode, checkIMEIRequest.clientCode) &&
        Objects.equals(this.imei, checkIMEIRequest.imei) &&
        Objects.equals(this.carrierType, checkIMEIRequest.carrierType) &&
        Objects.equals(this.is4g, checkIMEIRequest.is4g);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCode, imei, carrierType, is4g);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckIMEIRequest {\n");
    sb.append("    clientCode: ").append(toIndentedString(clientCode)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    carrierType: ").append(toIndentedString(carrierType)).append("\n");
    sb.append("    is4g: ").append(toIndentedString(is4g)).append("\n");
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

