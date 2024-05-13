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
 * InspectionReportPost200ResponseValue
 */
@JsonPropertyOrder({
  InspectionReportPost200ResponseValue.JSON_PROPERTY_INSPECTION_REPORT_ID,
  InspectionReportPost200ResponseValue.JSON_PROPERTY_PROPERTY_ID
})
@JsonTypeName("_inspection_report_post_200_response_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InspectionReportPost200ResponseValue {
  public static final String JSON_PROPERTY_INSPECTION_REPORT_ID = "inspection_report_id";
  private Integer inspectionReportId;

  public static final String JSON_PROPERTY_PROPERTY_ID = "property_id";
  private Integer propertyId;

  public InspectionReportPost200ResponseValue() {
  }

  public InspectionReportPost200ResponseValue inspectionReportId(Integer inspectionReportId) {
    
    this.inspectionReportId = inspectionReportId;
    return this;
  }

   /**
   * Get inspectionReportId
   * @return inspectionReportId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSPECTION_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInspectionReportId() {
    return inspectionReportId;
  }


  @JsonProperty(JSON_PROPERTY_INSPECTION_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInspectionReportId(Integer inspectionReportId) {
    this.inspectionReportId = inspectionReportId;
  }


  public InspectionReportPost200ResponseValue propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPropertyId() {
    return propertyId;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectionReportPost200ResponseValue inspectionReportPost200ResponseValue = (InspectionReportPost200ResponseValue) o;
    return Objects.equals(this.inspectionReportId, inspectionReportPost200ResponseValue.inspectionReportId) &&
        Objects.equals(this.propertyId, inspectionReportPost200ResponseValue.propertyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inspectionReportId, propertyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectionReportPost200ResponseValue {\n");
    sb.append("    inspectionReportId: ").append(toIndentedString(inspectionReportId)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
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

