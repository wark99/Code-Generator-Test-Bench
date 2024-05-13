/*
 * Childcare Provider API
 * Childcare Provider RESTful Service API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: p.oforduru@zodiac-software.com
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
import org.openapitools.client.model.AccountGet200ResponseOneOfAllOfAccount;
import org.openapitools.client.model.AccountGet200ResponseOneOfAllOfOtherRequirements;
import org.openapitools.client.model.AccountGet200ResponseOneOfAllOfReferenceChecksInner;
import org.openapitools.client.model.JobIdEditPutRequestPay;
import org.openapitools.client.model.ProviderProfileAllOfPersonalDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProviderProfile
 */
@JsonPropertyOrder({
  ProviderProfile.JSON_PROPERTY_OTHER_REQUIREMENTS,
  ProviderProfile.JSON_PROPERTY_REFERENCE_CHECKS,
  ProviderProfile.JSON_PROPERTY_PAY_OFFER,
  ProviderProfile.JSON_PROPERTY_ACCOUNT,
  ProviderProfile.JSON_PROPERTY_PERSONAL_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProviderProfile {
  public static final String JSON_PROPERTY_OTHER_REQUIREMENTS = "other_requirements";
  private AccountGet200ResponseOneOfAllOfOtherRequirements otherRequirements;

  public static final String JSON_PROPERTY_REFERENCE_CHECKS = "reference_checks";
  private List<AccountGet200ResponseOneOfAllOfReferenceChecksInner> referenceChecks;

  public static final String JSON_PROPERTY_PAY_OFFER = "pay_offer";
  private JobIdEditPutRequestPay payOffer;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountGet200ResponseOneOfAllOfAccount account;

  public static final String JSON_PROPERTY_PERSONAL_DETAILS = "personal_details";
  private ProviderProfileAllOfPersonalDetails personalDetails;

  public ProviderProfile() {
  }

  public ProviderProfile otherRequirements(AccountGet200ResponseOneOfAllOfOtherRequirements otherRequirements) {
    
    this.otherRequirements = otherRequirements;
    return this;
  }

   /**
   * Get otherRequirements
   * @return otherRequirements
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountGet200ResponseOneOfAllOfOtherRequirements getOtherRequirements() {
    return otherRequirements;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherRequirements(AccountGet200ResponseOneOfAllOfOtherRequirements otherRequirements) {
    this.otherRequirements = otherRequirements;
  }


  public ProviderProfile referenceChecks(List<AccountGet200ResponseOneOfAllOfReferenceChecksInner> referenceChecks) {
    
    this.referenceChecks = referenceChecks;
    return this;
  }

  public ProviderProfile addReferenceChecksItem(AccountGet200ResponseOneOfAllOfReferenceChecksInner referenceChecksItem) {
    if (this.referenceChecks == null) {
      this.referenceChecks = new ArrayList<>();
    }
    this.referenceChecks.add(referenceChecksItem);
    return this;
  }

   /**
   * Get referenceChecks
   * @return referenceChecks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountGet200ResponseOneOfAllOfReferenceChecksInner> getReferenceChecks() {
    return referenceChecks;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceChecks(List<AccountGet200ResponseOneOfAllOfReferenceChecksInner> referenceChecks) {
    this.referenceChecks = referenceChecks;
  }


  public ProviderProfile payOffer(JobIdEditPutRequestPay payOffer) {
    
    this.payOffer = payOffer;
    return this;
  }

   /**
   * Get payOffer
   * @return payOffer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAY_OFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JobIdEditPutRequestPay getPayOffer() {
    return payOffer;
  }


  @JsonProperty(JSON_PROPERTY_PAY_OFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayOffer(JobIdEditPutRequestPay payOffer) {
    this.payOffer = payOffer;
  }


  public ProviderProfile account(AccountGet200ResponseOneOfAllOfAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountGet200ResponseOneOfAllOfAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(AccountGet200ResponseOneOfAllOfAccount account) {
    this.account = account;
  }


  public ProviderProfile personalDetails(ProviderProfileAllOfPersonalDetails personalDetails) {
    
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Get personalDetails
   * @return personalDetails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSONAL_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProviderProfileAllOfPersonalDetails getPersonalDetails() {
    return personalDetails;
  }


  @JsonProperty(JSON_PROPERTY_PERSONAL_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalDetails(ProviderProfileAllOfPersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderProfile providerProfile = (ProviderProfile) o;
    return Objects.equals(this.otherRequirements, providerProfile.otherRequirements) &&
        Objects.equals(this.referenceChecks, providerProfile.referenceChecks) &&
        Objects.equals(this.payOffer, providerProfile.payOffer) &&
        Objects.equals(this.account, providerProfile.account) &&
        Objects.equals(this.personalDetails, providerProfile.personalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherRequirements, referenceChecks, payOffer, account, personalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderProfile {\n");
    sb.append("    otherRequirements: ").append(toIndentedString(otherRequirements)).append("\n");
    sb.append("    referenceChecks: ").append(toIndentedString(referenceChecks)).append("\n");
    sb.append("    payOffer: ").append(toIndentedString(payOffer)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
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

