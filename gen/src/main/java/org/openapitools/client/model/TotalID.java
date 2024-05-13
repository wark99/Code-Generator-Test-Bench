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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FraudAnalysis;
import org.openapitools.client.model.MatchAnalysis;
import org.openapitools.client.model.VerificationAnalysises;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TotalID
 */
@JsonPropertyOrder({
  TotalID.JSON_PROPERTY_FRAUD_ANALYSIS,
  TotalID.JSON_PROPERTY_MATCH_ANALYSIS,
  TotalID.JSON_PROPERTY_VERIFICATION_ANALYSISES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TotalID {
  public static final String JSON_PROPERTY_FRAUD_ANALYSIS = "fraudAnalysis";
  private FraudAnalysis fraudAnalysis;

  public static final String JSON_PROPERTY_MATCH_ANALYSIS = "matchAnalysis";
  private MatchAnalysis matchAnalysis;

  public static final String JSON_PROPERTY_VERIFICATION_ANALYSISES = "verificationAnalysises";
  private List<VerificationAnalysises> verificationAnalysises;

  public TotalID() {
  }

  public TotalID fraudAnalysis(FraudAnalysis fraudAnalysis) {
    
    this.fraudAnalysis = fraudAnalysis;
    return this;
  }

   /**
   * Get fraudAnalysis
   * @return fraudAnalysis
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAUD_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FraudAnalysis getFraudAnalysis() {
    return fraudAnalysis;
  }


  @JsonProperty(JSON_PROPERTY_FRAUD_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudAnalysis(FraudAnalysis fraudAnalysis) {
    this.fraudAnalysis = fraudAnalysis;
  }


  public TotalID matchAnalysis(MatchAnalysis matchAnalysis) {
    
    this.matchAnalysis = matchAnalysis;
    return this;
  }

   /**
   * Get matchAnalysis
   * @return matchAnalysis
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MatchAnalysis getMatchAnalysis() {
    return matchAnalysis;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchAnalysis(MatchAnalysis matchAnalysis) {
    this.matchAnalysis = matchAnalysis;
  }


  public TotalID verificationAnalysises(List<VerificationAnalysises> verificationAnalysises) {
    
    this.verificationAnalysises = verificationAnalysises;
    return this;
  }

  public TotalID addVerificationAnalysisesItem(VerificationAnalysises verificationAnalysisesItem) {
    if (this.verificationAnalysises == null) {
      this.verificationAnalysises = new ArrayList<>();
    }
    this.verificationAnalysises.add(verificationAnalysisesItem);
    return this;
  }

   /**
   * Get verificationAnalysises
   * @return verificationAnalysises
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFICATION_ANALYSISES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VerificationAnalysises> getVerificationAnalysises() {
    return verificationAnalysises;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_ANALYSISES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationAnalysises(List<VerificationAnalysises> verificationAnalysises) {
    this.verificationAnalysises = verificationAnalysises;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalID totalID = (TotalID) o;
    return Objects.equals(this.fraudAnalysis, totalID.fraudAnalysis) &&
        Objects.equals(this.matchAnalysis, totalID.matchAnalysis) &&
        Objects.equals(this.verificationAnalysises, totalID.verificationAnalysises);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudAnalysis, matchAnalysis, verificationAnalysises);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalID {\n");
    sb.append("    fraudAnalysis: ").append(toIndentedString(fraudAnalysis)).append("\n");
    sb.append("    matchAnalysis: ").append(toIndentedString(matchAnalysis)).append("\n");
    sb.append("    verificationAnalysises: ").append(toIndentedString(verificationAnalysises)).append("\n");
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

