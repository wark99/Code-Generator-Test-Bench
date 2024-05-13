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
import org.openapitools.client.model.V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner
 */
@JsonPropertyOrder({
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.JSON_PROPERTY_CUSTOMER_REFERENCE_NUMBER,
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.JSON_PROPERTY_CUSTOMER_NUMBER,
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.JSON_PROPERTY_ERROR_TYPE,
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.JSON_PROPERTY_ALTERNATE_DATA_SOURCE_CODE
})
@JsonTypeName("V4_0_ReportEquifax_data_alternateDataSources_alternateDataSourceErrorMessage_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner {
  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE_NUMBER = "customerReferenceNumber";
  private String customerReferenceNumber;

  public static final String JSON_PROPERTY_CUSTOMER_NUMBER = "customerNumber";
  private String customerNumber;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private String errorType;

  public static final String JSON_PROPERTY_ALTERNATE_DATA_SOURCE_CODE = "alternateDataSourceCode";
  private List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner> alternateDataSourceCode;

  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner() {
  }

  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner customerReferenceNumber(String customerReferenceNumber) {
    
    this.customerReferenceNumber = customerReferenceNumber;
    return this;
  }

   /**
   * Get customerReferenceNumber
   * @return customerReferenceNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }


  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner customerNumber(String customerNumber) {
    
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerNumber() {
    return customerNumber;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner errorType(String errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorType() {
    return errorType;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner alternateDataSourceCode(List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner> alternateDataSourceCode) {
    
    this.alternateDataSourceCode = alternateDataSourceCode;
    return this;
  }

  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner addAlternateDataSourceCodeItem(V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner alternateDataSourceCodeItem) {
    if (this.alternateDataSourceCode == null) {
      this.alternateDataSourceCode = new ArrayList<>();
    }
    this.alternateDataSourceCode.add(alternateDataSourceCodeItem);
    return this;
  }

   /**
   * Get alternateDataSourceCode
   * @return alternateDataSourceCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALTERNATE_DATA_SOURCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner> getAlternateDataSourceCode() {
    return alternateDataSourceCode;
  }


  @JsonProperty(JSON_PROPERTY_ALTERNATE_DATA_SOURCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternateDataSourceCode(List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner> alternateDataSourceCode) {
    this.alternateDataSourceCode = alternateDataSourceCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner = (V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner) o;
    return Objects.equals(this.customerReferenceNumber, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.customerReferenceNumber) &&
        Objects.equals(this.customerNumber, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.customerNumber) &&
        Objects.equals(this.errorType, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.errorType) &&
        Objects.equals(this.alternateDataSourceCode, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner.alternateDataSourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReferenceNumber, customerNumber, errorType, alternateDataSourceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInner {\n");
    sb.append("    customerReferenceNumber: ").append(toIndentedString(customerReferenceNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    alternateDataSourceCode: ").append(toIndentedString(alternateDataSourceCode)).append("\n");
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

