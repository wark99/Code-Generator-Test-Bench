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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FirstNameMatchAnalysis
 */
@JsonPropertyOrder({
  FirstNameMatchAnalysis.JSON_PROPERTY_MATCH_ON_SOURCES_COUNT,
  FirstNameMatchAnalysis.JSON_PROPERTY_NO_MATCH_ON_SOURCES_COUNT,
  FirstNameMatchAnalysis.JSON_PROPERTY_NOT_FOUND_ON_SOURCES_COUNT,
  FirstNameMatchAnalysis.JSON_PROPERTY_PARTIAL_MATCH_ON_SOURCES_COUNT,
  FirstNameMatchAnalysis.JSON_PROPERTY_TOTAL_POINTS,
  FirstNameMatchAnalysis.JSON_PROPERTY_TOTAL_SOURCES_COUNT,
  FirstNameMatchAnalysis.JSON_PROPERTY_VERIFICATION_PERCENTAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FirstNameMatchAnalysis {
  public static final String JSON_PROPERTY_MATCH_ON_SOURCES_COUNT = "matchOnSourcesCount";
  private Integer matchOnSourcesCount;

  public static final String JSON_PROPERTY_NO_MATCH_ON_SOURCES_COUNT = "noMatchOnSourcesCount";
  private Integer noMatchOnSourcesCount;

  public static final String JSON_PROPERTY_NOT_FOUND_ON_SOURCES_COUNT = "notFoundOnSourcesCount";
  private Integer notFoundOnSourcesCount;

  public static final String JSON_PROPERTY_PARTIAL_MATCH_ON_SOURCES_COUNT = "partialMatchOnSourcesCount";
  private Integer partialMatchOnSourcesCount;

  public static final String JSON_PROPERTY_TOTAL_POINTS = "totalPoints";
  private Integer totalPoints;

  public static final String JSON_PROPERTY_TOTAL_SOURCES_COUNT = "totalSourcesCount";
  private Integer totalSourcesCount;

  public static final String JSON_PROPERTY_VERIFICATION_PERCENTAGE = "verificationPercentage";
  private Integer verificationPercentage;

  public FirstNameMatchAnalysis() {
  }

  public FirstNameMatchAnalysis matchOnSourcesCount(Integer matchOnSourcesCount) {
    
    this.matchOnSourcesCount = matchOnSourcesCount;
    return this;
  }

   /**
   * Get matchOnSourcesCount
   * @return matchOnSourcesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchOnSourcesCount() {
    return matchOnSourcesCount;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchOnSourcesCount(Integer matchOnSourcesCount) {
    this.matchOnSourcesCount = matchOnSourcesCount;
  }


  public FirstNameMatchAnalysis noMatchOnSourcesCount(Integer noMatchOnSourcesCount) {
    
    this.noMatchOnSourcesCount = noMatchOnSourcesCount;
    return this;
  }

   /**
   * Get noMatchOnSourcesCount
   * @return noMatchOnSourcesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_MATCH_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoMatchOnSourcesCount() {
    return noMatchOnSourcesCount;
  }


  @JsonProperty(JSON_PROPERTY_NO_MATCH_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoMatchOnSourcesCount(Integer noMatchOnSourcesCount) {
    this.noMatchOnSourcesCount = noMatchOnSourcesCount;
  }


  public FirstNameMatchAnalysis notFoundOnSourcesCount(Integer notFoundOnSourcesCount) {
    
    this.notFoundOnSourcesCount = notFoundOnSourcesCount;
    return this;
  }

   /**
   * Get notFoundOnSourcesCount
   * @return notFoundOnSourcesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_FOUND_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNotFoundOnSourcesCount() {
    return notFoundOnSourcesCount;
  }


  @JsonProperty(JSON_PROPERTY_NOT_FOUND_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotFoundOnSourcesCount(Integer notFoundOnSourcesCount) {
    this.notFoundOnSourcesCount = notFoundOnSourcesCount;
  }


  public FirstNameMatchAnalysis partialMatchOnSourcesCount(Integer partialMatchOnSourcesCount) {
    
    this.partialMatchOnSourcesCount = partialMatchOnSourcesCount;
    return this;
  }

   /**
   * Get partialMatchOnSourcesCount
   * @return partialMatchOnSourcesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTIAL_MATCH_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPartialMatchOnSourcesCount() {
    return partialMatchOnSourcesCount;
  }


  @JsonProperty(JSON_PROPERTY_PARTIAL_MATCH_ON_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartialMatchOnSourcesCount(Integer partialMatchOnSourcesCount) {
    this.partialMatchOnSourcesCount = partialMatchOnSourcesCount;
  }


  public FirstNameMatchAnalysis totalPoints(Integer totalPoints) {
    
    this.totalPoints = totalPoints;
    return this;
  }

   /**
   * Get totalPoints
   * @return totalPoints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPoints() {
    return totalPoints;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
  }


  public FirstNameMatchAnalysis totalSourcesCount(Integer totalSourcesCount) {
    
    this.totalSourcesCount = totalSourcesCount;
    return this;
  }

   /**
   * Get totalSourcesCount
   * @return totalSourcesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalSourcesCount() {
    return totalSourcesCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SOURCES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalSourcesCount(Integer totalSourcesCount) {
    this.totalSourcesCount = totalSourcesCount;
  }


  public FirstNameMatchAnalysis verificationPercentage(Integer verificationPercentage) {
    
    this.verificationPercentage = verificationPercentage;
    return this;
  }

   /**
   * Get verificationPercentage
   * @return verificationPercentage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFICATION_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVerificationPercentage() {
    return verificationPercentage;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationPercentage(Integer verificationPercentage) {
    this.verificationPercentage = verificationPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstNameMatchAnalysis firstNameMatchAnalysis = (FirstNameMatchAnalysis) o;
    return Objects.equals(this.matchOnSourcesCount, firstNameMatchAnalysis.matchOnSourcesCount) &&
        Objects.equals(this.noMatchOnSourcesCount, firstNameMatchAnalysis.noMatchOnSourcesCount) &&
        Objects.equals(this.notFoundOnSourcesCount, firstNameMatchAnalysis.notFoundOnSourcesCount) &&
        Objects.equals(this.partialMatchOnSourcesCount, firstNameMatchAnalysis.partialMatchOnSourcesCount) &&
        Objects.equals(this.totalPoints, firstNameMatchAnalysis.totalPoints) &&
        Objects.equals(this.totalSourcesCount, firstNameMatchAnalysis.totalSourcesCount) &&
        Objects.equals(this.verificationPercentage, firstNameMatchAnalysis.verificationPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchOnSourcesCount, noMatchOnSourcesCount, notFoundOnSourcesCount, partialMatchOnSourcesCount, totalPoints, totalSourcesCount, verificationPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstNameMatchAnalysis {\n");
    sb.append("    matchOnSourcesCount: ").append(toIndentedString(matchOnSourcesCount)).append("\n");
    sb.append("    noMatchOnSourcesCount: ").append(toIndentedString(noMatchOnSourcesCount)).append("\n");
    sb.append("    notFoundOnSourcesCount: ").append(toIndentedString(notFoundOnSourcesCount)).append("\n");
    sb.append("    partialMatchOnSourcesCount: ").append(toIndentedString(partialMatchOnSourcesCount)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    totalSourcesCount: ").append(toIndentedString(totalSourcesCount)).append("\n");
    sb.append("    verificationPercentage: ").append(toIndentedString(verificationPercentage)).append("\n");
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

