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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InstitutionDTO
 */
@JsonPropertyOrder({
  InstitutionDTO.JSON_PROPERTY_NAME,
  InstitutionDTO.JSON_PROPERTY_PROGRAMME_KEYS,
  InstitutionDTO.JSON_PROPERTY_COURSE_KEYS,
  InstitutionDTO.JSON_PROPERTY_LECTURER_KEYS,
  InstitutionDTO.JSON_PROPERTY_SESSION_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:20.052181070Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InstitutionDTO {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROGRAMME_KEYS = "programme_keys";
  private List<Integer> programmeKeys;

  public static final String JSON_PROPERTY_COURSE_KEYS = "course_keys";
  private JsonNullable<Object> courseKeys = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LECTURER_KEYS = "lecturer_keys";
  private JsonNullable<Object> lecturerKeys = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SESSION_KEYS = "session_keys";
  private JsonNullable<Object> sessionKeys = JsonNullable.<Object>of(null);

  public InstitutionDTO() {
  }

  public InstitutionDTO name(String name) {
    
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


  public InstitutionDTO programmeKeys(List<Integer> programmeKeys) {
    
    this.programmeKeys = programmeKeys;
    return this;
  }

  public InstitutionDTO addProgrammeKeysItem(Integer programmeKeysItem) {
    if (this.programmeKeys == null) {
      this.programmeKeys = new ArrayList<>();
    }
    this.programmeKeys.add(programmeKeysItem);
    return this;
  }

   /**
   * Get programmeKeys
   * @return programmeKeys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRAMME_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getProgrammeKeys() {
    return programmeKeys;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMME_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgrammeKeys(List<Integer> programmeKeys) {
    this.programmeKeys = programmeKeys;
  }


  public InstitutionDTO courseKeys(Object courseKeys) {
    this.courseKeys = JsonNullable.<Object>of(courseKeys);
    
    return this;
  }

   /**
   * Get courseKeys
   * @return courseKeys
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCourseKeys() {
        return courseKeys.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURSE_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCourseKeys_JsonNullable() {
    return courseKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_COURSE_KEYS)
  public void setCourseKeys_JsonNullable(JsonNullable<Object> courseKeys) {
    this.courseKeys = courseKeys;
  }

  public void setCourseKeys(Object courseKeys) {
    this.courseKeys = JsonNullable.<Object>of(courseKeys);
  }


  public InstitutionDTO lecturerKeys(Object lecturerKeys) {
    this.lecturerKeys = JsonNullable.<Object>of(lecturerKeys);
    
    return this;
  }

   /**
   * Get lecturerKeys
   * @return lecturerKeys
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLecturerKeys() {
        return lecturerKeys.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LECTURER_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLecturerKeys_JsonNullable() {
    return lecturerKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_LECTURER_KEYS)
  public void setLecturerKeys_JsonNullable(JsonNullable<Object> lecturerKeys) {
    this.lecturerKeys = lecturerKeys;
  }

  public void setLecturerKeys(Object lecturerKeys) {
    this.lecturerKeys = JsonNullable.<Object>of(lecturerKeys);
  }


  public InstitutionDTO sessionKeys(Object sessionKeys) {
    this.sessionKeys = JsonNullable.<Object>of(sessionKeys);
    
    return this;
  }

   /**
   * Get sessionKeys
   * @return sessionKeys
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSessionKeys() {
        return sessionKeys.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSessionKeys_JsonNullable() {
    return sessionKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_SESSION_KEYS)
  public void setSessionKeys_JsonNullable(JsonNullable<Object> sessionKeys) {
    this.sessionKeys = sessionKeys;
  }

  public void setSessionKeys(Object sessionKeys) {
    this.sessionKeys = JsonNullable.<Object>of(sessionKeys);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionDTO institutionDTO = (InstitutionDTO) o;
    return Objects.equals(this.name, institutionDTO.name) &&
        Objects.equals(this.programmeKeys, institutionDTO.programmeKeys) &&
        equalsNullable(this.courseKeys, institutionDTO.courseKeys) &&
        equalsNullable(this.lecturerKeys, institutionDTO.lecturerKeys) &&
        equalsNullable(this.sessionKeys, institutionDTO.sessionKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, programmeKeys, hashCodeNullable(courseKeys), hashCodeNullable(lecturerKeys), hashCodeNullable(sessionKeys));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    programmeKeys: ").append(toIndentedString(programmeKeys)).append("\n");
    sb.append("    courseKeys: ").append(toIndentedString(courseKeys)).append("\n");
    sb.append("    lecturerKeys: ").append(toIndentedString(lecturerKeys)).append("\n");
    sb.append("    sessionKeys: ").append(toIndentedString(sessionKeys)).append("\n");
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

