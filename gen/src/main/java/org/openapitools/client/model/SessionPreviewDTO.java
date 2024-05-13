/*
 * Data Scraper API
 * A RESTful API for managing web scraping data related to educational institutions, programmes, courses, and schedules.
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SessionPreviewDTO
 */
@JsonPropertyOrder({
  SessionPreviewDTO.JSON_PROPERTY_HASH,
  SessionPreviewDTO.JSON_PROPERTY_INSTITUTION_KEY,
  SessionPreviewDTO.JSON_PROPERTY_START_TIME,
  SessionPreviewDTO.JSON_PROPERTY_END_TIME,
  SessionPreviewDTO.JSON_PROPERTY_STATUS,
  SessionPreviewDTO.JSON_PROPERTY_APPROVED,
  SessionPreviewDTO.JSON_PROPERTY_NO_NEW_COURSES,
  SessionPreviewDTO.JSON_PROPERTY_NO_NEW_DESCRIPTIONS,
  SessionPreviewDTO.JSON_PROPERTY_NO_NEW_LECTURERES,
  SessionPreviewDTO.JSON_PROPERTY_NO_NEW_PROGRAMMES,
  SessionPreviewDTO.JSON_PROPERTY_NO_UPDATED_COURSES,
  SessionPreviewDTO.JSON_PROPERTY_NO_UPDATED_DESCRIPTIONS,
  SessionPreviewDTO.JSON_PROPERTY_NO_UPDATED_LECTURERS,
  SessionPreviewDTO.JSON_PROPERTY_NO_UPDATED_PROGRAMMES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:20.052181070Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SessionPreviewDTO {
  public static final String JSON_PROPERTY_HASH = "hash";
  private Integer hash;

  public static final String JSON_PROPERTY_INSTITUTION_KEY = "institution_key";
  private String institutionKey;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_APPROVED = "approved";
  private Boolean approved;

  public static final String JSON_PROPERTY_NO_NEW_COURSES = "no_new_courses";
  private Integer noNewCourses;

  public static final String JSON_PROPERTY_NO_NEW_DESCRIPTIONS = "no_new_descriptions";
  private Integer noNewDescriptions;

  public static final String JSON_PROPERTY_NO_NEW_LECTURERES = "no_new_lectureres";
  private Integer noNewLectureres;

  public static final String JSON_PROPERTY_NO_NEW_PROGRAMMES = "no_new_programmes";
  private Integer noNewProgrammes;

  public static final String JSON_PROPERTY_NO_UPDATED_COURSES = "no_updated_courses";
  private Integer noUpdatedCourses;

  public static final String JSON_PROPERTY_NO_UPDATED_DESCRIPTIONS = "no_updated_descriptions";
  private Integer noUpdatedDescriptions;

  public static final String JSON_PROPERTY_NO_UPDATED_LECTURERS = "no_updated_lecturers";
  private Integer noUpdatedLecturers;

  public static final String JSON_PROPERTY_NO_UPDATED_PROGRAMMES = "no_updated_programmes";
  private Integer noUpdatedProgrammes;

  public SessionPreviewDTO() {
  }

  public SessionPreviewDTO hash(Integer hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHash(Integer hash) {
    this.hash = hash;
  }


  public SessionPreviewDTO institutionKey(String institutionKey) {
    
    this.institutionKey = institutionKey;
    return this;
  }

   /**
   * Get institutionKey
   * @return institutionKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTITUTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitutionKey() {
    return institutionKey;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitutionKey(String institutionKey) {
    this.institutionKey = institutionKey;
  }


  public SessionPreviewDTO startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public SessionPreviewDTO endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public SessionPreviewDTO status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public SessionPreviewDTO approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApproved() {
    return approved;
  }


  @JsonProperty(JSON_PROPERTY_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public SessionPreviewDTO noNewCourses(Integer noNewCourses) {
    
    this.noNewCourses = noNewCourses;
    return this;
  }

   /**
   * Get noNewCourses
   * @return noNewCourses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_NEW_COURSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoNewCourses() {
    return noNewCourses;
  }


  @JsonProperty(JSON_PROPERTY_NO_NEW_COURSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoNewCourses(Integer noNewCourses) {
    this.noNewCourses = noNewCourses;
  }


  public SessionPreviewDTO noNewDescriptions(Integer noNewDescriptions) {
    
    this.noNewDescriptions = noNewDescriptions;
    return this;
  }

   /**
   * Get noNewDescriptions
   * @return noNewDescriptions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_NEW_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoNewDescriptions() {
    return noNewDescriptions;
  }


  @JsonProperty(JSON_PROPERTY_NO_NEW_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoNewDescriptions(Integer noNewDescriptions) {
    this.noNewDescriptions = noNewDescriptions;
  }


  public SessionPreviewDTO noNewLectureres(Integer noNewLectureres) {
    
    this.noNewLectureres = noNewLectureres;
    return this;
  }

   /**
   * Get noNewLectureres
   * @return noNewLectureres
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_NEW_LECTURERES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoNewLectureres() {
    return noNewLectureres;
  }


  @JsonProperty(JSON_PROPERTY_NO_NEW_LECTURERES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoNewLectureres(Integer noNewLectureres) {
    this.noNewLectureres = noNewLectureres;
  }


  public SessionPreviewDTO noNewProgrammes(Integer noNewProgrammes) {
    
    this.noNewProgrammes = noNewProgrammes;
    return this;
  }

   /**
   * Get noNewProgrammes
   * @return noNewProgrammes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_NEW_PROGRAMMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoNewProgrammes() {
    return noNewProgrammes;
  }


  @JsonProperty(JSON_PROPERTY_NO_NEW_PROGRAMMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoNewProgrammes(Integer noNewProgrammes) {
    this.noNewProgrammes = noNewProgrammes;
  }


  public SessionPreviewDTO noUpdatedCourses(Integer noUpdatedCourses) {
    
    this.noUpdatedCourses = noUpdatedCourses;
    return this;
  }

   /**
   * Get noUpdatedCourses
   * @return noUpdatedCourses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_UPDATED_COURSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoUpdatedCourses() {
    return noUpdatedCourses;
  }


  @JsonProperty(JSON_PROPERTY_NO_UPDATED_COURSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoUpdatedCourses(Integer noUpdatedCourses) {
    this.noUpdatedCourses = noUpdatedCourses;
  }


  public SessionPreviewDTO noUpdatedDescriptions(Integer noUpdatedDescriptions) {
    
    this.noUpdatedDescriptions = noUpdatedDescriptions;
    return this;
  }

   /**
   * Get noUpdatedDescriptions
   * @return noUpdatedDescriptions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_UPDATED_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoUpdatedDescriptions() {
    return noUpdatedDescriptions;
  }


  @JsonProperty(JSON_PROPERTY_NO_UPDATED_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoUpdatedDescriptions(Integer noUpdatedDescriptions) {
    this.noUpdatedDescriptions = noUpdatedDescriptions;
  }


  public SessionPreviewDTO noUpdatedLecturers(Integer noUpdatedLecturers) {
    
    this.noUpdatedLecturers = noUpdatedLecturers;
    return this;
  }

   /**
   * Get noUpdatedLecturers
   * @return noUpdatedLecturers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_UPDATED_LECTURERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoUpdatedLecturers() {
    return noUpdatedLecturers;
  }


  @JsonProperty(JSON_PROPERTY_NO_UPDATED_LECTURERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoUpdatedLecturers(Integer noUpdatedLecturers) {
    this.noUpdatedLecturers = noUpdatedLecturers;
  }


  public SessionPreviewDTO noUpdatedProgrammes(Integer noUpdatedProgrammes) {
    
    this.noUpdatedProgrammes = noUpdatedProgrammes;
    return this;
  }

   /**
   * Get noUpdatedProgrammes
   * @return noUpdatedProgrammes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_UPDATED_PROGRAMMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoUpdatedProgrammes() {
    return noUpdatedProgrammes;
  }


  @JsonProperty(JSON_PROPERTY_NO_UPDATED_PROGRAMMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoUpdatedProgrammes(Integer noUpdatedProgrammes) {
    this.noUpdatedProgrammes = noUpdatedProgrammes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionPreviewDTO sessionPreviewDTO = (SessionPreviewDTO) o;
    return Objects.equals(this.hash, sessionPreviewDTO.hash) &&
        Objects.equals(this.institutionKey, sessionPreviewDTO.institutionKey) &&
        Objects.equals(this.startTime, sessionPreviewDTO.startTime) &&
        Objects.equals(this.endTime, sessionPreviewDTO.endTime) &&
        Objects.equals(this.status, sessionPreviewDTO.status) &&
        Objects.equals(this.approved, sessionPreviewDTO.approved) &&
        Objects.equals(this.noNewCourses, sessionPreviewDTO.noNewCourses) &&
        Objects.equals(this.noNewDescriptions, sessionPreviewDTO.noNewDescriptions) &&
        Objects.equals(this.noNewLectureres, sessionPreviewDTO.noNewLectureres) &&
        Objects.equals(this.noNewProgrammes, sessionPreviewDTO.noNewProgrammes) &&
        Objects.equals(this.noUpdatedCourses, sessionPreviewDTO.noUpdatedCourses) &&
        Objects.equals(this.noUpdatedDescriptions, sessionPreviewDTO.noUpdatedDescriptions) &&
        Objects.equals(this.noUpdatedLecturers, sessionPreviewDTO.noUpdatedLecturers) &&
        Objects.equals(this.noUpdatedProgrammes, sessionPreviewDTO.noUpdatedProgrammes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, institutionKey, startTime, endTime, status, approved, noNewCourses, noNewDescriptions, noNewLectureres, noNewProgrammes, noUpdatedCourses, noUpdatedDescriptions, noUpdatedLecturers, noUpdatedProgrammes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionPreviewDTO {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    institutionKey: ").append(toIndentedString(institutionKey)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    noNewCourses: ").append(toIndentedString(noNewCourses)).append("\n");
    sb.append("    noNewDescriptions: ").append(toIndentedString(noNewDescriptions)).append("\n");
    sb.append("    noNewLectureres: ").append(toIndentedString(noNewLectureres)).append("\n");
    sb.append("    noNewProgrammes: ").append(toIndentedString(noNewProgrammes)).append("\n");
    sb.append("    noUpdatedCourses: ").append(toIndentedString(noUpdatedCourses)).append("\n");
    sb.append("    noUpdatedDescriptions: ").append(toIndentedString(noUpdatedDescriptions)).append("\n");
    sb.append("    noUpdatedLecturers: ").append(toIndentedString(noUpdatedLecturers)).append("\n");
    sb.append("    noUpdatedProgrammes: ").append(toIndentedString(noUpdatedProgrammes)).append("\n");
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
