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
import org.openapitools.client.model.V40ReportEquifaxDataFileSinceDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V40ReportEquifaxDataOtherIdentificationInner
 */
@JsonPropertyOrder({
  V40ReportEquifaxDataOtherIdentificationInner.JSON_PROPERTY_DATE_REPORTED,
  V40ReportEquifaxDataOtherIdentificationInner.JSON_PROPERTY_TYPE_CODE,
  V40ReportEquifaxDataOtherIdentificationInner.JSON_PROPERTY_IDENTIFICATION_NUMBER,
  V40ReportEquifaxDataOtherIdentificationInner.JSON_PROPERTY_REASON_CODE
})
@JsonTypeName("V4_0_ReportEquifax_data_otherIdentification_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportEquifaxDataOtherIdentificationInner {
  public static final String JSON_PROPERTY_DATE_REPORTED = "dateReported";
  private V40ReportEquifaxDataFileSinceDate dateReported;

  public static final String JSON_PROPERTY_TYPE_CODE = "typeCode";
  private V40EquifaxScoreNumberOrMaxIndustryCode typeCode;

  public static final String JSON_PROPERTY_IDENTIFICATION_NUMBER = "identificationNumber";
  private String identificationNumber;

  public static final String JSON_PROPERTY_REASON_CODE = "reasonCode";
  private V40EquifaxScoreNumberOrMaxIndustryCode reasonCode;

  public V40ReportEquifaxDataOtherIdentificationInner() {
  }

  public V40ReportEquifaxDataOtherIdentificationInner dateReported(V40ReportEquifaxDataFileSinceDate dateReported) {
    
    this.dateReported = dateReported;
    return this;
  }

   /**
   * Get dateReported
   * @return dateReported
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_REPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40ReportEquifaxDataFileSinceDate getDateReported() {
    return dateReported;
  }


  @JsonProperty(JSON_PROPERTY_DATE_REPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateReported(V40ReportEquifaxDataFileSinceDate dateReported) {
    this.dateReported = dateReported;
  }


  public V40ReportEquifaxDataOtherIdentificationInner typeCode(V40EquifaxScoreNumberOrMaxIndustryCode typeCode) {
    
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getTypeCode() {
    return typeCode;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeCode(V40EquifaxScoreNumberOrMaxIndustryCode typeCode) {
    this.typeCode = typeCode;
  }


  public V40ReportEquifaxDataOtherIdentificationInner identificationNumber(String identificationNumber) {
    
    this.identificationNumber = identificationNumber;
    return this;
  }

   /**
   * Get identificationNumber
   * @return identificationNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentificationNumber() {
    return identificationNumber;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }


  public V40ReportEquifaxDataOtherIdentificationInner reasonCode(V40EquifaxScoreNumberOrMaxIndustryCode reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40EquifaxScoreNumberOrMaxIndustryCode getReasonCode() {
    return reasonCode;
  }


  @JsonProperty(JSON_PROPERTY_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonCode(V40EquifaxScoreNumberOrMaxIndustryCode reasonCode) {
    this.reasonCode = reasonCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportEquifaxDataOtherIdentificationInner v40ReportEquifaxDataOtherIdentificationInner = (V40ReportEquifaxDataOtherIdentificationInner) o;
    return Objects.equals(this.dateReported, v40ReportEquifaxDataOtherIdentificationInner.dateReported) &&
        Objects.equals(this.typeCode, v40ReportEquifaxDataOtherIdentificationInner.typeCode) &&
        Objects.equals(this.identificationNumber, v40ReportEquifaxDataOtherIdentificationInner.identificationNumber) &&
        Objects.equals(this.reasonCode, v40ReportEquifaxDataOtherIdentificationInner.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateReported, typeCode, identificationNumber, reasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportEquifaxDataOtherIdentificationInner {\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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

