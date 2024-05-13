/*
 * AxisCare API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2023-10-01
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
 * GetApiApplicants207Response
 */
@JsonPropertyOrder({
  GetApiApplicants207Response.JSON_PROPERTY_APPLICANTS,
  GetApiApplicants207Response.JSON_PROPERTY_NEXT_PAGE,
  GetApiApplicants207Response.JSON_PROPERTY_APPLICANTS_NOT_FOUND
})
@JsonTypeName("get_api_applicants_207_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:58.235743643Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetApiApplicants207Response {
  public static final String JSON_PROPERTY_APPLICANTS = "applicants";
  private List<Object> applicants;

  public static final String JSON_PROPERTY_NEXT_PAGE = "nextPage";
  private String nextPage;

  public static final String JSON_PROPERTY_APPLICANTS_NOT_FOUND = "applicantsNotFound";
  private List<Integer> applicantsNotFound;

  public GetApiApplicants207Response() {
  }

  public GetApiApplicants207Response applicants(List<Object> applicants) {
    
    this.applicants = applicants;
    return this;
  }

  public GetApiApplicants207Response addApplicantsItem(Object applicantsItem) {
    if (this.applicants == null) {
      this.applicants = new ArrayList<>();
    }
    this.applicants.add(applicantsItem);
    return this;
  }

   /**
   * Get applicants
   * @return applicants
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getApplicants() {
    return applicants;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicants(List<Object> applicants) {
    this.applicants = applicants;
  }


  public GetApiApplicants207Response nextPage(String nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPage() {
    return nextPage;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public GetApiApplicants207Response applicantsNotFound(List<Integer> applicantsNotFound) {
    
    this.applicantsNotFound = applicantsNotFound;
    return this;
  }

  public GetApiApplicants207Response addApplicantsNotFoundItem(Integer applicantsNotFoundItem) {
    if (this.applicantsNotFound == null) {
      this.applicantsNotFound = new ArrayList<>();
    }
    this.applicantsNotFound.add(applicantsNotFoundItem);
    return this;
  }

   /**
   * Get applicantsNotFound
   * @return applicantsNotFound
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICANTS_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getApplicantsNotFound() {
    return applicantsNotFound;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANTS_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicantsNotFound(List<Integer> applicantsNotFound) {
    this.applicantsNotFound = applicantsNotFound;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApiApplicants207Response getApiApplicants207Response = (GetApiApplicants207Response) o;
    return Objects.equals(this.applicants, getApiApplicants207Response.applicants) &&
        Objects.equals(this.nextPage, getApiApplicants207Response.nextPage) &&
        Objects.equals(this.applicantsNotFound, getApiApplicants207Response.applicantsNotFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicants, nextPage, applicantsNotFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiApplicants207Response {\n");
    sb.append("    applicants: ").append(toIndentedString(applicants)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    applicantsNotFound: ").append(toIndentedString(applicantsNotFound)).append("\n");
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

