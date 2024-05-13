/*
 * Patient Management API
 * The API for patient management for MisterEd system.
 *
 * The version of the OpenAPI document: 2.5.0
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateUserHealthInfoRequest
 */
@JsonPropertyOrder({
  UpdateUserHealthInfoRequest.JSON_PROPERTY_HEIGHT,
  UpdateUserHealthInfoRequest.JSON_PROPERTY_WEIGHT,
  UpdateUserHealthInfoRequest.JSON_PROPERTY_BLOOD_TYPE,
  UpdateUserHealthInfoRequest.JSON_PROPERTY_BLOOD_PRESSURE,
  UpdateUserHealthInfoRequest.JSON_PROPERTY_ALLERGIES,
  UpdateUserHealthInfoRequest.JSON_PROPERTY_COMPLICATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:43.969735874Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateUserHealthInfoRequest {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_BLOOD_TYPE = "blood_type";
  private String bloodType;

  public static final String JSON_PROPERTY_BLOOD_PRESSURE = "blood_pressure";
  private BigDecimal bloodPressure;

  public static final String JSON_PROPERTY_ALLERGIES = "allergies";
  private String allergies;

  public static final String JSON_PROPERTY_COMPLICATIONS = "complications";
  private String complications;

  public UpdateUserHealthInfoRequest() {
  }

  public UpdateUserHealthInfoRequest height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public UpdateUserHealthInfoRequest weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public UpdateUserHealthInfoRequest bloodType(String bloodType) {
    
    this.bloodType = bloodType;
    return this;
  }

   /**
   * Get bloodType
   * @return bloodType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBloodType() {
    return bloodType;
  }


  @JsonProperty(JSON_PROPERTY_BLOOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }


  public UpdateUserHealthInfoRequest bloodPressure(BigDecimal bloodPressure) {
    
    this.bloodPressure = bloodPressure;
    return this;
  }

   /**
   * Get bloodPressure
   * @return bloodPressure
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOOD_PRESSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBloodPressure() {
    return bloodPressure;
  }


  @JsonProperty(JSON_PROPERTY_BLOOD_PRESSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBloodPressure(BigDecimal bloodPressure) {
    this.bloodPressure = bloodPressure;
  }


  public UpdateUserHealthInfoRequest allergies(String allergies) {
    
    this.allergies = allergies;
    return this;
  }

   /**
   * Get allergies
   * @return allergies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLERGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAllergies() {
    return allergies;
  }


  @JsonProperty(JSON_PROPERTY_ALLERGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllergies(String allergies) {
    this.allergies = allergies;
  }


  public UpdateUserHealthInfoRequest complications(String complications) {
    
    this.complications = complications;
    return this;
  }

   /**
   * Get complications
   * @return complications
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComplications() {
    return complications;
  }


  @JsonProperty(JSON_PROPERTY_COMPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplications(String complications) {
    this.complications = complications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserHealthInfoRequest updateUserHealthInfoRequest = (UpdateUserHealthInfoRequest) o;
    return Objects.equals(this.height, updateUserHealthInfoRequest.height) &&
        Objects.equals(this.weight, updateUserHealthInfoRequest.weight) &&
        Objects.equals(this.bloodType, updateUserHealthInfoRequest.bloodType) &&
        Objects.equals(this.bloodPressure, updateUserHealthInfoRequest.bloodPressure) &&
        Objects.equals(this.allergies, updateUserHealthInfoRequest.allergies) &&
        Objects.equals(this.complications, updateUserHealthInfoRequest.complications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, weight, bloodType, bloodPressure, allergies, complications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserHealthInfoRequest {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    bloodType: ").append(toIndentedString(bloodType)).append("\n");
    sb.append("    bloodPressure: ").append(toIndentedString(bloodPressure)).append("\n");
    sb.append("    allergies: ").append(toIndentedString(allergies)).append("\n");
    sb.append("    complications: ").append(toIndentedString(complications)).append("\n");
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

