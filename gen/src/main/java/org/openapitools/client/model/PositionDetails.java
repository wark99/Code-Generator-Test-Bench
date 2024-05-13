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
import org.openapitools.client.model.Duration2;
import org.openapitools.client.model.Names;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PositionDetails
 */
@JsonPropertyOrder({
  PositionDetails.JSON_PROPERTY_DATE_HIRED,
  PositionDetails.JSON_PROPERTY_EMPLOYER,
  PositionDetails.JSON_PROPERTY_EMPLOYMENT_HOURS,
  PositionDetails.JSON_PROPERTY_EMPLOYMENT_STATUS,
  PositionDetails.JSON_PROPERTY_EMPLOYMENT_TYPE,
  PositionDetails.JSON_PROPERTY_POSITION_TENURE,
  PositionDetails.JSON_PROPERTY_POSITION_TITLE,
  PositionDetails.JSON_PROPERTY_SOURCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PositionDetails {
  public static final String JSON_PROPERTY_DATE_HIRED = "dateHired";
  private String dateHired;

  public static final String JSON_PROPERTY_EMPLOYER = "employer";
  private Names employer;

  public static final String JSON_PROPERTY_EMPLOYMENT_HOURS = "employmentHours";
  private String employmentHours;

  public static final String JSON_PROPERTY_EMPLOYMENT_STATUS = "employmentStatus";
  private String employmentStatus;

  public static final String JSON_PROPERTY_EMPLOYMENT_TYPE = "employmentType";
  private String employmentType;

  public static final String JSON_PROPERTY_POSITION_TENURE = "positionTenure";
  private Duration2 positionTenure;

  public static final String JSON_PROPERTY_POSITION_TITLE = "positionTitle";
  private String positionTitle;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public PositionDetails() {
  }

  public PositionDetails dateHired(String dateHired) {
    
    this.dateHired = dateHired;
    return this;
  }

   /**
   * Get dateHired
   * @return dateHired
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_HIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateHired() {
    return dateHired;
  }


  @JsonProperty(JSON_PROPERTY_DATE_HIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateHired(String dateHired) {
    this.dateHired = dateHired;
  }


  public PositionDetails employer(Names employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Names getEmployer() {
    return employer;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployer(Names employer) {
    this.employer = employer;
  }


  public PositionDetails employmentHours(String employmentHours) {
    
    this.employmentHours = employmentHours;
    return this;
  }

   /**
   * Get employmentHours
   * @return employmentHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmploymentHours() {
    return employmentHours;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmploymentHours(String employmentHours) {
    this.employmentHours = employmentHours;
  }


  public PositionDetails employmentStatus(String employmentStatus) {
    
    this.employmentStatus = employmentStatus;
    return this;
  }

   /**
   * Get employmentStatus
   * @return employmentStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmploymentStatus() {
    return employmentStatus;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmploymentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
  }


  public PositionDetails employmentType(String employmentType) {
    
    this.employmentType = employmentType;
    return this;
  }

   /**
   * Get employmentType
   * @return employmentType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmploymentType() {
    return employmentType;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }


  public PositionDetails positionTenure(Duration2 positionTenure) {
    
    this.positionTenure = positionTenure;
    return this;
  }

   /**
   * Get positionTenure
   * @return positionTenure
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION_TENURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Duration2 getPositionTenure() {
    return positionTenure;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_TENURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositionTenure(Duration2 positionTenure) {
    this.positionTenure = positionTenure;
  }


  public PositionDetails positionTitle(String positionTitle) {
    
    this.positionTitle = positionTitle;
    return this;
  }

   /**
   * Get positionTitle
   * @return positionTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPositionTitle() {
    return positionTitle;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }


  public PositionDetails source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionDetails positionDetails = (PositionDetails) o;
    return Objects.equals(this.dateHired, positionDetails.dateHired) &&
        Objects.equals(this.employer, positionDetails.employer) &&
        Objects.equals(this.employmentHours, positionDetails.employmentHours) &&
        Objects.equals(this.employmentStatus, positionDetails.employmentStatus) &&
        Objects.equals(this.employmentType, positionDetails.employmentType) &&
        Objects.equals(this.positionTenure, positionDetails.positionTenure) &&
        Objects.equals(this.positionTitle, positionDetails.positionTitle) &&
        Objects.equals(this.source, positionDetails.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateHired, employer, employmentHours, employmentStatus, employmentType, positionTenure, positionTitle, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionDetails {\n");
    sb.append("    dateHired: ").append(toIndentedString(dateHired)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employmentHours: ").append(toIndentedString(employmentHours)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    positionTenure: ").append(toIndentedString(positionTenure)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

