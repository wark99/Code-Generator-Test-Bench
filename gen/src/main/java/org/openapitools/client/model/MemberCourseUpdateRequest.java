/*
 * BBE Nexus LMS API
 * API for updating member course completion
 *
 * The version of the OpenAPI document: 1
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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MemberCourseUpdateRequest
 */
@JsonPropertyOrder({
  MemberCourseUpdateRequest.JSON_PROPERTY_COURSE_CODE,
  MemberCourseUpdateRequest.JSON_PROPERTY_QUALIFICATION_TYPE,
  MemberCourseUpdateRequest.JSON_PROPERTY_QUALIFICATION_LEVEL,
  MemberCourseUpdateRequest.JSON_PROPERTY_STATUS,
  MemberCourseUpdateRequest.JSON_PROPERTY_QUALIFICATION_DATE
})
@JsonTypeName("memberCourseUpdate_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:20.164612034Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MemberCourseUpdateRequest {
  public static final String JSON_PROPERTY_COURSE_CODE = "courseCode";
  private String courseCode;

  public static final String JSON_PROPERTY_QUALIFICATION_TYPE = "qualificationType";
  private String qualificationType;

  public static final String JSON_PROPERTY_QUALIFICATION_LEVEL = "qualificationLevel";
  private String qualificationLevel;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_QUALIFICATION_DATE = "qualificationDate";
  private LocalDate qualificationDate;

  public MemberCourseUpdateRequest() {
  }

  public MemberCourseUpdateRequest courseCode(String courseCode) {
    
    this.courseCode = courseCode;
    return this;
  }

   /**
   * ID of the course completed by the member
   * @return courseCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COURSE_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCourseCode() {
    return courseCode;
  }


  @JsonProperty(JSON_PROPERTY_COURSE_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }


  public MemberCourseUpdateRequest qualificationType(String qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Type of qualification completed
   * @return qualificationType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUALIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQualificationType() {
    return qualificationType;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQualificationType(String qualificationType) {
    this.qualificationType = qualificationType;
  }


  public MemberCourseUpdateRequest qualificationLevel(String qualificationLevel) {
    
    this.qualificationLevel = qualificationLevel;
    return this;
  }

   /**
   * Level of qualification
   * @return qualificationLevel
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUALIFICATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQualificationLevel() {
    return qualificationLevel;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFICATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQualificationLevel(String qualificationLevel) {
    this.qualificationLevel = qualificationLevel;
  }


  public MemberCourseUpdateRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Completed status of course
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public MemberCourseUpdateRequest qualificationDate(LocalDate qualificationDate) {
    
    this.qualificationDate = qualificationDate;
    return this;
  }

   /**
   * Date when the course was completed
   * @return qualificationDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUALIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getQualificationDate() {
    return qualificationDate;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQualificationDate(LocalDate qualificationDate) {
    this.qualificationDate = qualificationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberCourseUpdateRequest memberCourseUpdateRequest = (MemberCourseUpdateRequest) o;
    return Objects.equals(this.courseCode, memberCourseUpdateRequest.courseCode) &&
        Objects.equals(this.qualificationType, memberCourseUpdateRequest.qualificationType) &&
        Objects.equals(this.qualificationLevel, memberCourseUpdateRequest.qualificationLevel) &&
        Objects.equals(this.status, memberCourseUpdateRequest.status) &&
        Objects.equals(this.qualificationDate, memberCourseUpdateRequest.qualificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseCode, qualificationType, qualificationLevel, status, qualificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCourseUpdateRequest {\n");
    sb.append("    courseCode: ").append(toIndentedString(courseCode)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    qualificationLevel: ").append(toIndentedString(qualificationLevel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    qualificationDate: ").append(toIndentedString(qualificationDate)).append("\n");
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

