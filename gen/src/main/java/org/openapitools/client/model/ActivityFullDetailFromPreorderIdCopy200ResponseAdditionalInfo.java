/*
 * Servantrip API Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0-oas3
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo
 */
@JsonPropertyOrder({
  ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo.JSON_PROPERTY_HIGHLIGHTS,
  ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo.JSON_PROPERTY_INCLUDED,
  ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo.JSON_PROPERTY_NOT_INCLUDED
})
@JsonTypeName("activityFullDetailFromPreorderIdCopy_200_response_additional_info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo {
  public static final String JSON_PROPERTY_HIGHLIGHTS = "highlights";
  private List<String> highlights;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<String> included;

  public static final String JSON_PROPERTY_NOT_INCLUDED = "not_included";
  private List<String> notIncluded;

  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo() {
  }

  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo highlights(List<String> highlights) {
    
    this.highlights = highlights;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo addHighlightsItem(String highlightsItem) {
    if (this.highlights == null) {
      this.highlights = new ArrayList<>();
    }
    this.highlights.add(highlightsItem);
    return this;
  }

   /**
   * Get highlights
   * @return highlights
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGHLIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHighlights() {
    return highlights;
  }


  @JsonProperty(JSON_PROPERTY_HIGHLIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighlights(List<String> highlights) {
    this.highlights = highlights;
  }


  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo included(List<String> included) {
    
    this.included = included;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIncluded() {
    return included;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncluded(List<String> included) {
    this.included = included;
  }


  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo notIncluded(List<String> notIncluded) {
    
    this.notIncluded = notIncluded;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo addNotIncludedItem(String notIncludedItem) {
    if (this.notIncluded == null) {
      this.notIncluded = new ArrayList<>();
    }
    this.notIncluded.add(notIncludedItem);
    return this;
  }

   /**
   * Get notIncluded
   * @return notIncluded
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNotIncluded() {
    return notIncluded;
  }


  @JsonProperty(JSON_PROPERTY_NOT_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotIncluded(List<String> notIncluded) {
    this.notIncluded = notIncluded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo activityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo = (ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo) o;
    return Objects.equals(this.highlights, activityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo.highlights) &&
        Objects.equals(this.included, activityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo.included) &&
        Objects.equals(this.notIncluded, activityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo.notIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highlights, included, notIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo {\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    notIncluded: ").append(toIndentedString(notIncluded)).append("\n");
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

