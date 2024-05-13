/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
 * InspectionReportResponseCompanyRepresentative
 */
@JsonPropertyOrder({
  InspectionReportResponseCompanyRepresentative.JSON_PROPERTY_CALLING_NAME
})
@JsonTypeName("InspectionReportResponse_company_representative")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InspectionReportResponseCompanyRepresentative {
  public static final String JSON_PROPERTY_CALLING_NAME = "calling_name";
  private String callingName;

  public InspectionReportResponseCompanyRepresentative() {
  }

  public InspectionReportResponseCompanyRepresentative callingName(String callingName) {
    
    this.callingName = callingName;
    return this;
  }

   /**
   * Get callingName
   * @return callingName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALLING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallingName() {
    return callingName;
  }


  @JsonProperty(JSON_PROPERTY_CALLING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallingName(String callingName) {
    this.callingName = callingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectionReportResponseCompanyRepresentative inspectionReportResponseCompanyRepresentative = (InspectionReportResponseCompanyRepresentative) o;
    return Objects.equals(this.callingName, inspectionReportResponseCompanyRepresentative.callingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callingName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectionReportResponseCompanyRepresentative {\n");
    sb.append("    callingName: ").append(toIndentedString(callingName)).append("\n");
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

