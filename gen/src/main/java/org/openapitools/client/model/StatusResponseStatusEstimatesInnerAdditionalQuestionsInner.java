/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
 * StatusResponseStatusEstimatesInnerAdditionalQuestionsInner
 */
@JsonPropertyOrder({
  StatusResponseStatusEstimatesInnerAdditionalQuestionsInner.JSON_PROPERTY_QUESTION_CODE,
  StatusResponseStatusEstimatesInnerAdditionalQuestionsInner.JSON_PROPERTY_ANSWER
})
@JsonTypeName("StatusResponse_status_estimates_inner_additionalQuestions_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StatusResponseStatusEstimatesInnerAdditionalQuestionsInner {
  public static final String JSON_PROPERTY_QUESTION_CODE = "questionCode";
  private String questionCode;

  public static final String JSON_PROPERTY_ANSWER = "answer";
  private String answer;

  public StatusResponseStatusEstimatesInnerAdditionalQuestionsInner() {
  }

  public StatusResponseStatusEstimatesInnerAdditionalQuestionsInner questionCode(String questionCode) {
    
    this.questionCode = questionCode;
    return this;
  }

   /**
   * Get questionCode
   * @return questionCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUESTION_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuestionCode() {
    return questionCode;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuestionCode(String questionCode) {
    this.questionCode = questionCode;
  }


  public StatusResponseStatusEstimatesInnerAdditionalQuestionsInner answer(String answer) {
    
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANSWER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAnswer() {
    return answer;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponseStatusEstimatesInnerAdditionalQuestionsInner statusResponseStatusEstimatesInnerAdditionalQuestionsInner = (StatusResponseStatusEstimatesInnerAdditionalQuestionsInner) o;
    return Objects.equals(this.questionCode, statusResponseStatusEstimatesInnerAdditionalQuestionsInner.questionCode) &&
        Objects.equals(this.answer, statusResponseStatusEstimatesInnerAdditionalQuestionsInner.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionCode, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResponseStatusEstimatesInnerAdditionalQuestionsInner {\n");
    sb.append("    questionCode: ").append(toIndentedString(questionCode)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

