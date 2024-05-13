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
import org.openapitools.client.model.RevolvingCount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AccountDelinquencySummary
 */
@JsonPropertyOrder({
  AccountDelinquencySummary.JSON_PROPERTY_INSTALLMENT_COUNT,
  AccountDelinquencySummary.JSON_PROPERTY_MORTGAGE_COUNT,
  AccountDelinquencySummary.JSON_PROPERTY_OTHER_COUNT,
  AccountDelinquencySummary.JSON_PROPERTY_REVOLVING_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountDelinquencySummary {
  public static final String JSON_PROPERTY_INSTALLMENT_COUNT = "installmentCount";
  private RevolvingCount installmentCount;

  public static final String JSON_PROPERTY_MORTGAGE_COUNT = "mortgageCount";
  private RevolvingCount mortgageCount;

  public static final String JSON_PROPERTY_OTHER_COUNT = "otherCount";
  private RevolvingCount otherCount;

  public static final String JSON_PROPERTY_REVOLVING_COUNT = "revolvingCount";
  private RevolvingCount revolvingCount;

  public AccountDelinquencySummary() {
  }

  public AccountDelinquencySummary installmentCount(RevolvingCount installmentCount) {
    
    this.installmentCount = installmentCount;
    return this;
  }

   /**
   * Get installmentCount
   * @return installmentCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALLMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingCount getInstallmentCount() {
    return installmentCount;
  }


  @JsonProperty(JSON_PROPERTY_INSTALLMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallmentCount(RevolvingCount installmentCount) {
    this.installmentCount = installmentCount;
  }


  public AccountDelinquencySummary mortgageCount(RevolvingCount mortgageCount) {
    
    this.mortgageCount = mortgageCount;
    return this;
  }

   /**
   * Get mortgageCount
   * @return mortgageCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MORTGAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingCount getMortgageCount() {
    return mortgageCount;
  }


  @JsonProperty(JSON_PROPERTY_MORTGAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMortgageCount(RevolvingCount mortgageCount) {
    this.mortgageCount = mortgageCount;
  }


  public AccountDelinquencySummary otherCount(RevolvingCount otherCount) {
    
    this.otherCount = otherCount;
    return this;
  }

   /**
   * Get otherCount
   * @return otherCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingCount getOtherCount() {
    return otherCount;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCount(RevolvingCount otherCount) {
    this.otherCount = otherCount;
  }


  public AccountDelinquencySummary revolvingCount(RevolvingCount revolvingCount) {
    
    this.revolvingCount = revolvingCount;
    return this;
  }

   /**
   * Get revolvingCount
   * @return revolvingCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOLVING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevolvingCount getRevolvingCount() {
    return revolvingCount;
  }


  @JsonProperty(JSON_PROPERTY_REVOLVING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevolvingCount(RevolvingCount revolvingCount) {
    this.revolvingCount = revolvingCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDelinquencySummary accountDelinquencySummary = (AccountDelinquencySummary) o;
    return Objects.equals(this.installmentCount, accountDelinquencySummary.installmentCount) &&
        Objects.equals(this.mortgageCount, accountDelinquencySummary.mortgageCount) &&
        Objects.equals(this.otherCount, accountDelinquencySummary.otherCount) &&
        Objects.equals(this.revolvingCount, accountDelinquencySummary.revolvingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentCount, mortgageCount, otherCount, revolvingCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDelinquencySummary {\n");
    sb.append("    installmentCount: ").append(toIndentedString(installmentCount)).append("\n");
    sb.append("    mortgageCount: ").append(toIndentedString(mortgageCount)).append("\n");
    sb.append("    otherCount: ").append(toIndentedString(otherCount)).append("\n");
    sb.append("    revolvingCount: ").append(toIndentedString(revolvingCount)).append("\n");
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

