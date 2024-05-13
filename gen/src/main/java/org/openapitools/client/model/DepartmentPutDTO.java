/*
 * CHT SA GPT Application
 * Development Environment.
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
 * DepartmentPutDTO
 */
@JsonPropertyOrder({
  DepartmentPutDTO.JSON_PROPERTY_DEPARTMENT_NAME,
  DepartmentPutDTO.JSON_PROPERTY_DEPARTMENT_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:35.805334182Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DepartmentPutDTO {
  public static final String JSON_PROPERTY_DEPARTMENT_NAME = "departmentName";
  private String departmentName;

  public static final String JSON_PROPERTY_DEPARTMENT_CODE = "departmentCode";
  private Integer departmentCode;

  public DepartmentPutDTO() {
  }

  public DepartmentPutDTO departmentName(String departmentName) {
    
    this.departmentName = departmentName;
    return this;
  }

   /**
   * Get departmentName
   * @return departmentName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPARTMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDepartmentName() {
    return departmentName;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public DepartmentPutDTO departmentCode(Integer departmentCode) {
    
    this.departmentCode = departmentCode;
    return this;
  }

   /**
   * Get departmentCode
   * @return departmentCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPARTMENT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDepartmentCode() {
    return departmentCode;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepartmentCode(Integer departmentCode) {
    this.departmentCode = departmentCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentPutDTO departmentPutDTO = (DepartmentPutDTO) o;
    return Objects.equals(this.departmentName, departmentPutDTO.departmentName) &&
        Objects.equals(this.departmentCode, departmentPutDTO.departmentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentName, departmentCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentPutDTO {\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
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

