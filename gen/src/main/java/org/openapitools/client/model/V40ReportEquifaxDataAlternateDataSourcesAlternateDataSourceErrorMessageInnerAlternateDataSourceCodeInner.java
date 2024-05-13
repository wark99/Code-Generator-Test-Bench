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
import org.openapitools.client.model.V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInnerErrorCodesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner
 */
@JsonPropertyOrder({
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner.JSON_PROPERTY_CODE,
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner.JSON_PROPERTY_DESCRIPTION,
  V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner.JSON_PROPERTY_ERROR_CODES
})
@JsonTypeName("V4_0_ReportEquifax_data_alternateDataSources_alternateDataSourceErrorMessage_inner_alternateDataSourceCode_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODES = "errorCodes";
  private List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInnerErrorCodesInner> errorCodes;

  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner() {
  }

  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner errorCodes(List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInnerErrorCodesInner> errorCodes) {
    
    this.errorCodes = errorCodes;
    return this;
  }

  public V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner addErrorCodesItem(V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInnerErrorCodesInner errorCodesItem) {
    if (this.errorCodes == null) {
      this.errorCodes = new ArrayList<>();
    }
    this.errorCodes.add(errorCodesItem);
    return this;
  }

   /**
   * Get errorCodes
   * @return errorCodes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInnerErrorCodesInner> getErrorCodes() {
    return errorCodes;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCodes(List<V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInnerErrorCodesInner> errorCodes) {
    this.errorCodes = errorCodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner = (V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner) o;
    return Objects.equals(this.code, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner.code) &&
        Objects.equals(this.description, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner.description) &&
        Objects.equals(this.errorCodes, v40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner.errorCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, errorCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportEquifaxDataAlternateDataSourcesAlternateDataSourceErrorMessageInnerAlternateDataSourceCodeInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCodes: ").append(toIndentedString(errorCodes)).append("\n");
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

