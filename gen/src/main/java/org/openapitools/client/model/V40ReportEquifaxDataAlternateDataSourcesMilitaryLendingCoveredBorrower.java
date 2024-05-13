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
 * V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower
 */
@JsonPropertyOrder({
  V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.JSON_PROPERTY_REGULATED_IDENTIFIER,
  V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.JSON_PROPERTY_DISCLAIMER,
  V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.JSON_PROPERTY_COVERED_BORROWER_STATUS,
  V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.JSON_PROPERTY_INSUFFICIENT_DATA_PROVIDED_FOR_MATCH,
  V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.JSON_PROPERTY_REFERRAL_CONTACT_NUMBER
})
@JsonTypeName("V4_0_ReportEquifax_data_alternateDataSources_militaryLendingCoveredBorrower")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower {
  public static final String JSON_PROPERTY_REGULATED_IDENTIFIER = "regulatedIdentifier";
  private String regulatedIdentifier;

  public static final String JSON_PROPERTY_DISCLAIMER = "disclaimer";
  private String disclaimer;

  public static final String JSON_PROPERTY_COVERED_BORROWER_STATUS = "coveredBorrowerStatus";
  private String coveredBorrowerStatus;

  public static final String JSON_PROPERTY_INSUFFICIENT_DATA_PROVIDED_FOR_MATCH = "insufficientDataProvidedForMatch";
  private String insufficientDataProvidedForMatch;

  public static final String JSON_PROPERTY_REFERRAL_CONTACT_NUMBER = "referralContactNumber";
  private String referralContactNumber;

  public V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower() {
  }

  public V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower regulatedIdentifier(String regulatedIdentifier) {
    
    this.regulatedIdentifier = regulatedIdentifier;
    return this;
  }

   /**
   * Get regulatedIdentifier
   * @return regulatedIdentifier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGULATED_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegulatedIdentifier() {
    return regulatedIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_REGULATED_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatedIdentifier(String regulatedIdentifier) {
    this.regulatedIdentifier = regulatedIdentifier;
  }


  public V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower disclaimer(String disclaimer) {
    
    this.disclaimer = disclaimer;
    return this;
  }

   /**
   * Get disclaimer
   * @return disclaimer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCLAIMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisclaimer() {
    return disclaimer;
  }


  @JsonProperty(JSON_PROPERTY_DISCLAIMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }


  public V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower coveredBorrowerStatus(String coveredBorrowerStatus) {
    
    this.coveredBorrowerStatus = coveredBorrowerStatus;
    return this;
  }

   /**
   * Get coveredBorrowerStatus
   * @return coveredBorrowerStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERED_BORROWER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoveredBorrowerStatus() {
    return coveredBorrowerStatus;
  }


  @JsonProperty(JSON_PROPERTY_COVERED_BORROWER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoveredBorrowerStatus(String coveredBorrowerStatus) {
    this.coveredBorrowerStatus = coveredBorrowerStatus;
  }


  public V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower insufficientDataProvidedForMatch(String insufficientDataProvidedForMatch) {
    
    this.insufficientDataProvidedForMatch = insufficientDataProvidedForMatch;
    return this;
  }

   /**
   * Get insufficientDataProvidedForMatch
   * @return insufficientDataProvidedForMatch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_DATA_PROVIDED_FOR_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsufficientDataProvidedForMatch() {
    return insufficientDataProvidedForMatch;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_DATA_PROVIDED_FOR_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientDataProvidedForMatch(String insufficientDataProvidedForMatch) {
    this.insufficientDataProvidedForMatch = insufficientDataProvidedForMatch;
  }


  public V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower referralContactNumber(String referralContactNumber) {
    
    this.referralContactNumber = referralContactNumber;
    return this;
  }

   /**
   * Get referralContactNumber
   * @return referralContactNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERRAL_CONTACT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferralContactNumber() {
    return referralContactNumber;
  }


  @JsonProperty(JSON_PROPERTY_REFERRAL_CONTACT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferralContactNumber(String referralContactNumber) {
    this.referralContactNumber = referralContactNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower v40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower = (V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower) o;
    return Objects.equals(this.regulatedIdentifier, v40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.regulatedIdentifier) &&
        Objects.equals(this.disclaimer, v40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.disclaimer) &&
        Objects.equals(this.coveredBorrowerStatus, v40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.coveredBorrowerStatus) &&
        Objects.equals(this.insufficientDataProvidedForMatch, v40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.insufficientDataProvidedForMatch) &&
        Objects.equals(this.referralContactNumber, v40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower.referralContactNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatedIdentifier, disclaimer, coveredBorrowerStatus, insufficientDataProvidedForMatch, referralContactNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportEquifaxDataAlternateDataSourcesMilitaryLendingCoveredBorrower {\n");
    sb.append("    regulatedIdentifier: ").append(toIndentedString(regulatedIdentifier)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
    sb.append("    coveredBorrowerStatus: ").append(toIndentedString(coveredBorrowerStatus)).append("\n");
    sb.append("    insufficientDataProvidedForMatch: ").append(toIndentedString(insufficientDataProvidedForMatch)).append("\n");
    sb.append("    referralContactNumber: ").append(toIndentedString(referralContactNumber)).append("\n");
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

