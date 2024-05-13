/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import org.openapitools.client.model.PropertyAddressResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ExtendedPropertyFeesResponse
 */
@JsonPropertyOrder({
  ExtendedPropertyFeesResponse.JSON_PROPERTY_ID,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_MANAGEMENT_TYPE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_PRIMARY_STATUS,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_SECONDARY_STATUS,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_ADDRESS,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_MANAGEMENT_FEE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_MARKETING_FEE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_RENEWAL_FEE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_REGISTRATION_FEE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_COMMISSION_RATE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_OTHER_FEE_ONE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_OTHER_FEE_ONE_DESCRIPTION,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_OTHER_FEE_TWO,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_OTHER_FEE_TWO_DESCRIPTION,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_BUYER_FEE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_SURVEY_FEE,
  ExtendedPropertyFeesResponse.JSON_PROPERTY_INTERNAL_REFERENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ExtendedPropertyFeesResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  /**
   * 1 &#x3D; Managed let, 2 &#x3D; Let only, 3 &#x3D; Estate agency, 4 &#x3D; Short term let, 5 &#x3D; STL advertising, 6 &#x3D; Booking only, 7 &#x3D; STL Key holding, 9 &#x3D; Rental potential purchase, 10 &#x3D; Advertising only, 11 &#x3D; Lease only, 12 &#x3D; Rent collection, 13 &#x3D; Key holding, 15 &#x3D; Inspection only, 20 &#x3D; Block management, 30 &#x3D; Guaranteed rent
   */
  public enum ManagementTypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_9(9),
    
    NUMBER_10(10),
    
    NUMBER_11(11),
    
    NUMBER_12(12),
    
    NUMBER_13(13),
    
    NUMBER_15(15),
    
    NUMBER_20(20),
    
    NUMBER_30(30);

    private Integer value;

    ManagementTypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ManagementTypeEnum fromValue(Integer value) {
      for (ManagementTypeEnum b : ManagementTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MANAGEMENT_TYPE = "management_type";
  private ManagementTypeEnum managementType;

  /**
   * If management_type is not 3:  1 &#x3D; Void: general, 2 &#x3D; Unoccupied on market, 3 &#x3D; Occupied on market, 4 &#x3D; Tenant check period, 5 &#x3D; Await tenant move in, 6 &#x3D; Occupied, 7 &#x3D; Past property, 8 &#x3D; Notice given: not on market, 10 &#x3D; Eviction, 11 &#x3D; Pending: new property, 20 &#x3D; Occupied: pre let, 21 &#x3D; Occupied: on hold, 22 &#x3D; Occupied: pending withdrawal, 30 &#x3D; Unoccupied: pre let, 31 &#x3D; Unoccupied: on hold, 32 &#x3D; Unoccupied: pending withdrawal, 40 &#x3D; Void: in development, 41 &#x3D; Void: in refurbishment, 42 &#x3D; Void: in maintenance, 43 &#x3D; Awaiting tenant checks, 44 &#x3D; Awaiting lease.\\If management_type is 3:  0 &#x3D; Occupied on market, 1 &#x3D; Sold STC, 2 &#x3D; Sold STCM, 3 &#x3D; Under offer, 4 &#x3D; Reserved, 7 &#x3D; Past property, 8 &#x3D; Pending, 12 &#x3D; Viewings on hold, 20 &#x3D; Enquiry, 21 &#x3D; Exchanged, 22 &#x3D; Unoccupied on market, 23 &#x3D; Unoccupied off-market sale, 24 &#x3D; Occupied off-market sale.
   */
  public enum PrimaryStatusEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_8(8),
    
    NUMBER_10(10),
    
    NUMBER_11(11),
    
    NUMBER_12(12),
    
    NUMBER_20(20),
    
    NUMBER_21(21),
    
    NUMBER_22(22),
    
    NUMBER_23(23),
    
    NUMBER_24(24),
    
    NUMBER_30(30),
    
    NUMBER_31(31),
    
    NUMBER_32(32),
    
    NUMBER_40(40),
    
    NUMBER_41(41),
    
    NUMBER_42(42),
    
    NUMBER_43(43),
    
    NUMBER_44(44);

    private Integer value;

    PrimaryStatusEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrimaryStatusEnum fromValue(Integer value) {
      for (PrimaryStatusEnum b : PrimaryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIMARY_STATUS = "primary_status";
  private PrimaryStatusEnum primaryStatus;

  public static final String JSON_PROPERTY_SECONDARY_STATUS = "secondary_status";
  private Integer secondaryStatus;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private PropertyAddressResponse address;

  public static final String JSON_PROPERTY_MANAGEMENT_FEE = "management_fee";
  private String managementFee;

  public static final String JSON_PROPERTY_MARKETING_FEE = "marketing_fee";
  private Double marketingFee;

  public static final String JSON_PROPERTY_RENEWAL_FEE = "renewal_fee";
  private Double renewalFee;

  public static final String JSON_PROPERTY_REGISTRATION_FEE = "registration_fee";
  private Double registrationFee;

  public static final String JSON_PROPERTY_COMMISSION_RATE = "commission_rate";
  private Double commissionRate;

  public static final String JSON_PROPERTY_OTHER_FEE_ONE = "other_fee_one";
  private Double otherFeeOne;

  public static final String JSON_PROPERTY_OTHER_FEE_ONE_DESCRIPTION = "other_fee_one_description";
  private String otherFeeOneDescription;

  public static final String JSON_PROPERTY_OTHER_FEE_TWO = "other_fee_two";
  private Double otherFeeTwo;

  public static final String JSON_PROPERTY_OTHER_FEE_TWO_DESCRIPTION = "other_fee_two_description";
  private String otherFeeTwoDescription;

  public static final String JSON_PROPERTY_BUYER_FEE = "buyer_fee";
  private Double buyerFee;

  public static final String JSON_PROPERTY_SURVEY_FEE = "survey_fee";
  private Double surveyFee;

  public static final String JSON_PROPERTY_INTERNAL_REFERENCE = "internal_reference";
  private String internalReference;

  public ExtendedPropertyFeesResponse() {
  }

  public ExtendedPropertyFeesResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ExtendedPropertyFeesResponse managementType(ManagementTypeEnum managementType) {
    
    this.managementType = managementType;
    return this;
  }

   /**
   * 1 &#x3D; Managed let, 2 &#x3D; Let only, 3 &#x3D; Estate agency, 4 &#x3D; Short term let, 5 &#x3D; STL advertising, 6 &#x3D; Booking only, 7 &#x3D; STL Key holding, 9 &#x3D; Rental potential purchase, 10 &#x3D; Advertising only, 11 &#x3D; Lease only, 12 &#x3D; Rent collection, 13 &#x3D; Key holding, 15 &#x3D; Inspection only, 20 &#x3D; Block management, 30 &#x3D; Guaranteed rent
   * @return managementType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ManagementTypeEnum getManagementType() {
    return managementType;
  }


  @JsonProperty(JSON_PROPERTY_MANAGEMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagementType(ManagementTypeEnum managementType) {
    this.managementType = managementType;
  }


  public ExtendedPropertyFeesResponse primaryStatus(PrimaryStatusEnum primaryStatus) {
    
    this.primaryStatus = primaryStatus;
    return this;
  }

   /**
   * If management_type is not 3:  1 &#x3D; Void: general, 2 &#x3D; Unoccupied on market, 3 &#x3D; Occupied on market, 4 &#x3D; Tenant check period, 5 &#x3D; Await tenant move in, 6 &#x3D; Occupied, 7 &#x3D; Past property, 8 &#x3D; Notice given: not on market, 10 &#x3D; Eviction, 11 &#x3D; Pending: new property, 20 &#x3D; Occupied: pre let, 21 &#x3D; Occupied: on hold, 22 &#x3D; Occupied: pending withdrawal, 30 &#x3D; Unoccupied: pre let, 31 &#x3D; Unoccupied: on hold, 32 &#x3D; Unoccupied: pending withdrawal, 40 &#x3D; Void: in development, 41 &#x3D; Void: in refurbishment, 42 &#x3D; Void: in maintenance, 43 &#x3D; Awaiting tenant checks, 44 &#x3D; Awaiting lease.\\If management_type is 3:  0 &#x3D; Occupied on market, 1 &#x3D; Sold STC, 2 &#x3D; Sold STCM, 3 &#x3D; Under offer, 4 &#x3D; Reserved, 7 &#x3D; Past property, 8 &#x3D; Pending, 12 &#x3D; Viewings on hold, 20 &#x3D; Enquiry, 21 &#x3D; Exchanged, 22 &#x3D; Unoccupied on market, 23 &#x3D; Unoccupied off-market sale, 24 &#x3D; Occupied off-market sale.
   * @return primaryStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrimaryStatusEnum getPrimaryStatus() {
    return primaryStatus;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryStatus(PrimaryStatusEnum primaryStatus) {
    this.primaryStatus = primaryStatus;
  }


  public ExtendedPropertyFeesResponse secondaryStatus(Integer secondaryStatus) {
    
    this.secondaryStatus = secondaryStatus;
    return this;
  }

   /**
   * Get secondaryStatus
   * @return secondaryStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSecondaryStatus() {
    return secondaryStatus;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryStatus(Integer secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }


  public ExtendedPropertyFeesResponse address(PropertyAddressResponse address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyAddressResponse getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(PropertyAddressResponse address) {
    this.address = address;
  }


  public ExtendedPropertyFeesResponse managementFee(String managementFee) {
    
    this.managementFee = managementFee;
    return this;
  }

   /**
   * Get managementFee
   * @return managementFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManagementFee() {
    return managementFee;
  }


  @JsonProperty(JSON_PROPERTY_MANAGEMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagementFee(String managementFee) {
    this.managementFee = managementFee;
  }


  public ExtendedPropertyFeesResponse marketingFee(Double marketingFee) {
    
    this.marketingFee = marketingFee;
    return this;
  }

   /**
   * Get marketingFee
   * @return marketingFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMarketingFee() {
    return marketingFee;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingFee(Double marketingFee) {
    this.marketingFee = marketingFee;
  }


  public ExtendedPropertyFeesResponse renewalFee(Double renewalFee) {
    
    this.renewalFee = renewalFee;
    return this;
  }

   /**
   * Get renewalFee
   * @return renewalFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENEWAL_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRenewalFee() {
    return renewalFee;
  }


  @JsonProperty(JSON_PROPERTY_RENEWAL_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenewalFee(Double renewalFee) {
    this.renewalFee = renewalFee;
  }


  public ExtendedPropertyFeesResponse registrationFee(Double registrationFee) {
    
    this.registrationFee = registrationFee;
    return this;
  }

   /**
   * Get registrationFee
   * @return registrationFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTRATION_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRegistrationFee() {
    return registrationFee;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationFee(Double registrationFee) {
    this.registrationFee = registrationFee;
  }


  public ExtendedPropertyFeesResponse commissionRate(Double commissionRate) {
    
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * Get commissionRate
   * @return commissionRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMISSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCommissionRate() {
    return commissionRate;
  }


  @JsonProperty(JSON_PROPERTY_COMMISSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommissionRate(Double commissionRate) {
    this.commissionRate = commissionRate;
  }


  public ExtendedPropertyFeesResponse otherFeeOne(Double otherFeeOne) {
    
    this.otherFeeOne = otherFeeOne;
    return this;
  }

   /**
   * Get otherFeeOne
   * @return otherFeeOne
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_FEE_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOtherFeeOne() {
    return otherFeeOne;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_FEE_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherFeeOne(Double otherFeeOne) {
    this.otherFeeOne = otherFeeOne;
  }


  public ExtendedPropertyFeesResponse otherFeeOneDescription(String otherFeeOneDescription) {
    
    this.otherFeeOneDescription = otherFeeOneDescription;
    return this;
  }

   /**
   * Get otherFeeOneDescription
   * @return otherFeeOneDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_FEE_ONE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOtherFeeOneDescription() {
    return otherFeeOneDescription;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_FEE_ONE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherFeeOneDescription(String otherFeeOneDescription) {
    this.otherFeeOneDescription = otherFeeOneDescription;
  }


  public ExtendedPropertyFeesResponse otherFeeTwo(Double otherFeeTwo) {
    
    this.otherFeeTwo = otherFeeTwo;
    return this;
  }

   /**
   * Get otherFeeTwo
   * @return otherFeeTwo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_FEE_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOtherFeeTwo() {
    return otherFeeTwo;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_FEE_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherFeeTwo(Double otherFeeTwo) {
    this.otherFeeTwo = otherFeeTwo;
  }


  public ExtendedPropertyFeesResponse otherFeeTwoDescription(String otherFeeTwoDescription) {
    
    this.otherFeeTwoDescription = otherFeeTwoDescription;
    return this;
  }

   /**
   * Get otherFeeTwoDescription
   * @return otherFeeTwoDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_FEE_TWO_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOtherFeeTwoDescription() {
    return otherFeeTwoDescription;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_FEE_TWO_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherFeeTwoDescription(String otherFeeTwoDescription) {
    this.otherFeeTwoDescription = otherFeeTwoDescription;
  }


  public ExtendedPropertyFeesResponse buyerFee(Double buyerFee) {
    
    this.buyerFee = buyerFee;
    return this;
  }

   /**
   * Get buyerFee
   * @return buyerFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUYER_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBuyerFee() {
    return buyerFee;
  }


  @JsonProperty(JSON_PROPERTY_BUYER_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuyerFee(Double buyerFee) {
    this.buyerFee = buyerFee;
  }


  public ExtendedPropertyFeesResponse surveyFee(Double surveyFee) {
    
    this.surveyFee = surveyFee;
    return this;
  }

   /**
   * Get surveyFee
   * @return surveyFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SURVEY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSurveyFee() {
    return surveyFee;
  }


  @JsonProperty(JSON_PROPERTY_SURVEY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurveyFee(Double surveyFee) {
    this.surveyFee = surveyFee;
  }


  public ExtendedPropertyFeesResponse internalReference(String internalReference) {
    
    this.internalReference = internalReference;
    return this;
  }

   /**
   * Get internalReference
   * @return internalReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternalReference() {
    return internalReference;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalReference(String internalReference) {
    this.internalReference = internalReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedPropertyFeesResponse extendedPropertyFeesResponse = (ExtendedPropertyFeesResponse) o;
    return Objects.equals(this.id, extendedPropertyFeesResponse.id) &&
        Objects.equals(this.managementType, extendedPropertyFeesResponse.managementType) &&
        Objects.equals(this.primaryStatus, extendedPropertyFeesResponse.primaryStatus) &&
        Objects.equals(this.secondaryStatus, extendedPropertyFeesResponse.secondaryStatus) &&
        Objects.equals(this.address, extendedPropertyFeesResponse.address) &&
        Objects.equals(this.managementFee, extendedPropertyFeesResponse.managementFee) &&
        Objects.equals(this.marketingFee, extendedPropertyFeesResponse.marketingFee) &&
        Objects.equals(this.renewalFee, extendedPropertyFeesResponse.renewalFee) &&
        Objects.equals(this.registrationFee, extendedPropertyFeesResponse.registrationFee) &&
        Objects.equals(this.commissionRate, extendedPropertyFeesResponse.commissionRate) &&
        Objects.equals(this.otherFeeOne, extendedPropertyFeesResponse.otherFeeOne) &&
        Objects.equals(this.otherFeeOneDescription, extendedPropertyFeesResponse.otherFeeOneDescription) &&
        Objects.equals(this.otherFeeTwo, extendedPropertyFeesResponse.otherFeeTwo) &&
        Objects.equals(this.otherFeeTwoDescription, extendedPropertyFeesResponse.otherFeeTwoDescription) &&
        Objects.equals(this.buyerFee, extendedPropertyFeesResponse.buyerFee) &&
        Objects.equals(this.surveyFee, extendedPropertyFeesResponse.surveyFee) &&
        Objects.equals(this.internalReference, extendedPropertyFeesResponse.internalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementType, primaryStatus, secondaryStatus, address, managementFee, marketingFee, renewalFee, registrationFee, commissionRate, otherFeeOne, otherFeeOneDescription, otherFeeTwo, otherFeeTwoDescription, buyerFee, surveyFee, internalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedPropertyFeesResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managementType: ").append(toIndentedString(managementType)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    managementFee: ").append(toIndentedString(managementFee)).append("\n");
    sb.append("    marketingFee: ").append(toIndentedString(marketingFee)).append("\n");
    sb.append("    renewalFee: ").append(toIndentedString(renewalFee)).append("\n");
    sb.append("    registrationFee: ").append(toIndentedString(registrationFee)).append("\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    otherFeeOne: ").append(toIndentedString(otherFeeOne)).append("\n");
    sb.append("    otherFeeOneDescription: ").append(toIndentedString(otherFeeOneDescription)).append("\n");
    sb.append("    otherFeeTwo: ").append(toIndentedString(otherFeeTwo)).append("\n");
    sb.append("    otherFeeTwoDescription: ").append(toIndentedString(otherFeeTwoDescription)).append("\n");
    sb.append("    buyerFee: ").append(toIndentedString(buyerFee)).append("\n");
    sb.append("    surveyFee: ").append(toIndentedString(surveyFee)).append("\n");
    sb.append("    internalReference: ").append(toIndentedString(internalReference)).append("\n");
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

