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
 * V40ReportExperianEmploymentInformationInner
 */
@JsonPropertyOrder({
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_ADDRESS_EXTRA_LINE,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_ADDRESS_FIRST_LINE,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_ADDRESS_SECOND_LINE,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_FIRST_REPORTED_DATE,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_LAST_UPDATED_DATE,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_NAME,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_SOURCE,
  V40ReportExperianEmploymentInformationInner.JSON_PROPERTY_ZIP_CODE
})
@JsonTypeName("V4_0_ReportExperian_employmentInformation_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportExperianEmploymentInformationInner {
  public static final String JSON_PROPERTY_ADDRESS_EXTRA_LINE = "addressExtraLine";
  private String addressExtraLine;

  public static final String JSON_PROPERTY_ADDRESS_FIRST_LINE = "addressFirstLine";
  private String addressFirstLine;

  public static final String JSON_PROPERTY_ADDRESS_SECOND_LINE = "addressSecondLine";
  private String addressSecondLine;

  public static final String JSON_PROPERTY_FIRST_REPORTED_DATE = "firstReportedDate";
  private String firstReportedDate;

  public static final String JSON_PROPERTY_LAST_UPDATED_DATE = "lastUpdatedDate";
  private String lastUpdatedDate;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public V40ReportExperianEmploymentInformationInner() {
  }

  public V40ReportExperianEmploymentInformationInner addressExtraLine(String addressExtraLine) {
    
    this.addressExtraLine = addressExtraLine;
    return this;
  }

   /**
   * Get addressExtraLine
   * @return addressExtraLine
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_EXTRA_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressExtraLine() {
    return addressExtraLine;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_EXTRA_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressExtraLine(String addressExtraLine) {
    this.addressExtraLine = addressExtraLine;
  }


  public V40ReportExperianEmploymentInformationInner addressFirstLine(String addressFirstLine) {
    
    this.addressFirstLine = addressFirstLine;
    return this;
  }

   /**
   * Get addressFirstLine
   * @return addressFirstLine
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_FIRST_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressFirstLine() {
    return addressFirstLine;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_FIRST_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressFirstLine(String addressFirstLine) {
    this.addressFirstLine = addressFirstLine;
  }


  public V40ReportExperianEmploymentInformationInner addressSecondLine(String addressSecondLine) {
    
    this.addressSecondLine = addressSecondLine;
    return this;
  }

   /**
   * Get addressSecondLine
   * @return addressSecondLine
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_SECOND_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressSecondLine() {
    return addressSecondLine;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_SECOND_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressSecondLine(String addressSecondLine) {
    this.addressSecondLine = addressSecondLine;
  }


  public V40ReportExperianEmploymentInformationInner firstReportedDate(String firstReportedDate) {
    
    this.firstReportedDate = firstReportedDate;
    return this;
  }

   /**
   * Get firstReportedDate
   * @return firstReportedDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_REPORTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstReportedDate() {
    return firstReportedDate;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_REPORTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstReportedDate(String firstReportedDate) {
    this.firstReportedDate = firstReportedDate;
  }


  public V40ReportExperianEmploymentInformationInner lastUpdatedDate(String lastUpdatedDate) {
    
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  public V40ReportExperianEmploymentInformationInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public V40ReportExperianEmploymentInformationInner source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public V40ReportExperianEmploymentInformationInner zipCode(String zipCode) {
    
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
    V40ReportExperianEmploymentInformationInner v40ReportExperianEmploymentInformationInner = (V40ReportExperianEmploymentInformationInner) o;
    return Objects.equals(this.addressExtraLine, v40ReportExperianEmploymentInformationInner.addressExtraLine) &&
        Objects.equals(this.addressFirstLine, v40ReportExperianEmploymentInformationInner.addressFirstLine) &&
        Objects.equals(this.addressSecondLine, v40ReportExperianEmploymentInformationInner.addressSecondLine) &&
        Objects.equals(this.firstReportedDate, v40ReportExperianEmploymentInformationInner.firstReportedDate) &&
        Objects.equals(this.lastUpdatedDate, v40ReportExperianEmploymentInformationInner.lastUpdatedDate) &&
        Objects.equals(this.name, v40ReportExperianEmploymentInformationInner.name) &&
        Objects.equals(this.source, v40ReportExperianEmploymentInformationInner.source) &&
        Objects.equals(this.zipCode, v40ReportExperianEmploymentInformationInner.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressExtraLine, addressFirstLine, addressSecondLine, firstReportedDate, lastUpdatedDate, name, source, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportExperianEmploymentInformationInner {\n");
    sb.append("    addressExtraLine: ").append(toIndentedString(addressExtraLine)).append("\n");
    sb.append("    addressFirstLine: ").append(toIndentedString(addressFirstLine)).append("\n");
    sb.append("    addressSecondLine: ").append(toIndentedString(addressSecondLine)).append("\n");
    sb.append("    firstReportedDate: ").append(toIndentedString(firstReportedDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

