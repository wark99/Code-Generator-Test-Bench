/*
 * Reference
 * The DoDays API reference.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@dodays.co.uk
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
 * StudentGoal
 */
@JsonPropertyOrder({
  StudentGoal.JSON_PROPERTY_ID,
  StudentGoal.JSON_PROPERTY_NAME,
  StudentGoal.JSON_PROPERTY_ACHIEVED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StudentGoal {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ACHIEVED_AT = "achieved_at";
  private OffsetDateTime achievedAt;

  public StudentGoal() {
  }

  public StudentGoal id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public StudentGoal name(String name) {
    
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


  public StudentGoal achievedAt(OffsetDateTime achievedAt) {
    
    this.achievedAt = achievedAt;
    return this;
  }

   /**
   * Get achievedAt
   * @return achievedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACHIEVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAchievedAt() {
    return achievedAt;
  }


  @JsonProperty(JSON_PROPERTY_ACHIEVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAchievedAt(OffsetDateTime achievedAt) {
    this.achievedAt = achievedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentGoal studentGoal = (StudentGoal) o;
    return Objects.equals(this.id, studentGoal.id) &&
        Objects.equals(this.name, studentGoal.name) &&
        Objects.equals(this.achievedAt, studentGoal.achievedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, achievedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentGoal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    achievedAt: ").append(toIndentedString(achievedAt)).append("\n");
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

