/*
 * VS4+ APIs
 * This file describes the VS4+ APIs using the swagger notation.
 *
 * The version of the OpenAPI document: 0.1.0
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
 * A factor that affects credit score calculation.
 */
@JsonPropertyOrder({
  CreditScoreFactor.JSON_PROPERTY_CREDIT_SCORE_FACTOR_CODE,
  CreditScoreFactor.JSON_PROPERTY_CREDIT_SCORE_FACTOR_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:38.356341300Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreditScoreFactor {
  public static final String JSON_PROPERTY_CREDIT_SCORE_FACTOR_CODE = "credit_score_factor_code";
  private String creditScoreFactorCode;

  public static final String JSON_PROPERTY_CREDIT_SCORE_FACTOR_TEXT = "credit_score_factor_text";
  private String creditScoreFactorText;

  public CreditScoreFactor() {
  }

  public CreditScoreFactor creditScoreFactorCode(String creditScoreFactorCode) {
    
    this.creditScoreFactorCode = creditScoreFactorCode;
    return this;
  }

   /**
   * Credit bureau-specific code that identifies the factor.
   * @return creditScoreFactorCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_SCORE_FACTOR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreditScoreFactorCode() {
    return creditScoreFactorCode;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_SCORE_FACTOR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditScoreFactorCode(String creditScoreFactorCode) {
    this.creditScoreFactorCode = creditScoreFactorCode;
  }


  public CreditScoreFactor creditScoreFactorText(String creditScoreFactorText) {
    
    this.creditScoreFactorText = creditScoreFactorText;
    return this;
  }

   /**
   * Description of the factor.
   * @return creditScoreFactorText
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_SCORE_FACTOR_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreditScoreFactorText() {
    return creditScoreFactorText;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_SCORE_FACTOR_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditScoreFactorText(String creditScoreFactorText) {
    this.creditScoreFactorText = creditScoreFactorText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditScoreFactor creditScoreFactor = (CreditScoreFactor) o;
    return Objects.equals(this.creditScoreFactorCode, creditScoreFactor.creditScoreFactorCode) &&
        Objects.equals(this.creditScoreFactorText, creditScoreFactor.creditScoreFactorText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditScoreFactorCode, creditScoreFactorText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditScoreFactor {\n");
    sb.append("    creditScoreFactorCode: ").append(toIndentedString(creditScoreFactorCode)).append("\n");
    sb.append("    creditScoreFactorText: ").append(toIndentedString(creditScoreFactorText)).append("\n");
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

