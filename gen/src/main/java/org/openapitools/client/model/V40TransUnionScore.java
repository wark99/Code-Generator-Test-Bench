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
import org.openapitools.client.model.V40TransUnionScoreFactors;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V40TransUnionScore
 */
@JsonPropertyOrder({
  V40TransUnionScore.JSON_PROPERTY_RESULTS,
  V40TransUnionScore.JSON_PROPERTY_DEROGATORY_ALERT,
  V40TransUnionScore.JSON_PROPERTY_FACTORS,
  V40TransUnionScore.JSON_PROPERTY_SCORE_CARD
})
@JsonTypeName("V4_0_TransUnion_score")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40TransUnionScore {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private String results;

  public static final String JSON_PROPERTY_DEROGATORY_ALERT = "derogatoryAlert";
  private Boolean derogatoryAlert;

  public static final String JSON_PROPERTY_FACTORS = "factors";
  private V40TransUnionScoreFactors factors;

  public static final String JSON_PROPERTY_SCORE_CARD = "scoreCard";
  private String scoreCard;

  public V40TransUnionScore() {
  }

  public V40TransUnionScore results(String results) {
    
    this.results = results;
    return this;
  }

   /**
   * V4.0 score
   * @return results
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(String results) {
    this.results = results;
  }


  public V40TransUnionScore derogatoryAlert(Boolean derogatoryAlert) {
    
    this.derogatoryAlert = derogatoryAlert;
    return this;
  }

   /**
   * Get derogatoryAlert
   * @return derogatoryAlert
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEROGATORY_ALERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDerogatoryAlert() {
    return derogatoryAlert;
  }


  @JsonProperty(JSON_PROPERTY_DEROGATORY_ALERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDerogatoryAlert(Boolean derogatoryAlert) {
    this.derogatoryAlert = derogatoryAlert;
  }


  public V40TransUnionScore factors(V40TransUnionScoreFactors factors) {
    
    this.factors = factors;
    return this;
  }

   /**
   * Get factors
   * @return factors
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V40TransUnionScoreFactors getFactors() {
    return factors;
  }


  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactors(V40TransUnionScoreFactors factors) {
    this.factors = factors;
  }


  public V40TransUnionScore scoreCard(String scoreCard) {
    
    this.scoreCard = scoreCard;
    return this;
  }

   /**
   * Get scoreCard
   * @return scoreCard
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScoreCard() {
    return scoreCard;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreCard(String scoreCard) {
    this.scoreCard = scoreCard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40TransUnionScore v40TransUnionScore = (V40TransUnionScore) o;
    return Objects.equals(this.results, v40TransUnionScore.results) &&
        Objects.equals(this.derogatoryAlert, v40TransUnionScore.derogatoryAlert) &&
        Objects.equals(this.factors, v40TransUnionScore.factors) &&
        Objects.equals(this.scoreCard, v40TransUnionScore.scoreCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, derogatoryAlert, factors, scoreCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40TransUnionScore {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    derogatoryAlert: ").append(toIndentedString(derogatoryAlert)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    scoreCard: ").append(toIndentedString(scoreCard)).append("\n");
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

