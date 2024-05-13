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
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertySalesIdMarketingGet200ResponseValuePriceInformation
 */
@JsonPropertyOrder({
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_COUNCIL_TAX_BAND,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_PRICE_PER_UNIT_AREA,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_DOMESTIC_RATES,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_SALE_PRICE,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_PRICE_QUALIFIER,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_TENURE_TYPE,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_TENURE_EXPIRATION_DATE,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_SERVICE_CHARGE,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_SERVICE_CHARGE_REVIEW_PERIOD,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_GROUND_RENT,
  PropertySalesIdMarketingGet200ResponseValuePriceInformation.JSON_PROPERTY_GROUND_RENT_REVIEW_PERIOD
})
@JsonTypeName("_property_sales__id__marketing_get_200_response_value_price_information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertySalesIdMarketingGet200ResponseValuePriceInformation {
  public static final String JSON_PROPERTY_COUNCIL_TAX_BAND = "council_tax_band";
  private String councilTaxBand;

  public static final String JSON_PROPERTY_PRICE_PER_UNIT_AREA = "price_per_unit_area";
  private Integer pricePerUnitArea;

  public static final String JSON_PROPERTY_DOMESTIC_RATES = "domestic_rates";
  private Double domesticRates;

  public static final String JSON_PROPERTY_SALE_PRICE = "sale_price";
  private Double salePrice;

  /**
   * 1 &#x3D; POA, 2 &#x3D; Guide price, 3 &#x3D; Fixed price, 4 &#x3D; Offers in excess of, 5 &#x3D; OIRO, 6 &#x3D; Sale by tender, 7 &#x3D; From, 9 &#x3D; Shared ownership, 10 &#x3D; Offers over, 11 &#x3D; Part buy part rent, 12 &#x3D; Shared equity, 0 &#x3D; Default
   */
  public enum PriceQualifierEnum {
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
    
    NUMBER_0(0);

    private Integer value;

    PriceQualifierEnum(Integer value) {
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
    public static PriceQualifierEnum fromValue(Integer value) {
      for (PriceQualifierEnum b : PriceQualifierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRICE_QUALIFIER = "price_qualifier";
  private PriceQualifierEnum priceQualifier;

  /**
   * Freehold, Leasehold, Feudal, Commonhold, Share of Freehold
   */
  public enum TenureTypeEnum {
    FREEHOLD("Freehold"),
    
    LEASEHOLD("Leasehold"),
    
    FEUDAL("feudal"),
    
    COMMON_HOLD("common_hold"),
    
    SHARE_OF_FREEHOLD("share_of_freehold");

    private String value;

    TenureTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TenureTypeEnum fromValue(String value) {
      for (TenureTypeEnum b : TenureTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TENURE_TYPE = "tenure_type";
  private TenureTypeEnum tenureType;

  public static final String JSON_PROPERTY_TENURE_EXPIRATION_DATE = "tenure_expiration_date";
  private MaintenancePost200ResponseValueCreatedDate tenureExpirationDate;

  public static final String JSON_PROPERTY_SERVICE_CHARGE = "service_charge";
  private Double serviceCharge;

  public static final String JSON_PROPERTY_SERVICE_CHARGE_REVIEW_PERIOD = "service_charge_review_period";
  private Integer serviceChargeReviewPeriod;

  public static final String JSON_PROPERTY_GROUND_RENT = "ground_rent";
  private Double groundRent;

  public static final String JSON_PROPERTY_GROUND_RENT_REVIEW_PERIOD = "ground_rent_review_period";
  private Integer groundRentReviewPeriod;

  public PropertySalesIdMarketingGet200ResponseValuePriceInformation() {
  }

  public PropertySalesIdMarketingGet200ResponseValuePriceInformation councilTaxBand(String councilTaxBand) {
    
    this.councilTaxBand = councilTaxBand;
    return this;
  }

   /**
   * Get councilTaxBand
   * @return councilTaxBand
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNCIL_TAX_BAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCouncilTaxBand() {
    return councilTaxBand;
  }


  @JsonProperty(JSON_PROPERTY_COUNCIL_TAX_BAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCouncilTaxBand(String councilTaxBand) {
    this.councilTaxBand = councilTaxBand;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation pricePerUnitArea(Integer pricePerUnitArea) {
    
    this.pricePerUnitArea = pricePerUnitArea;
    return this;
  }

   /**
   * Get pricePerUnitArea
   * @return pricePerUnitArea
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_PER_UNIT_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPricePerUnitArea() {
    return pricePerUnitArea;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_PER_UNIT_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricePerUnitArea(Integer pricePerUnitArea) {
    this.pricePerUnitArea = pricePerUnitArea;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation domesticRates(Double domesticRates) {
    
    this.domesticRates = domesticRates;
    return this;
  }

   /**
   * Domestic rate for property.
   * @return domesticRates
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMESTIC_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDomesticRates() {
    return domesticRates;
  }


  @JsonProperty(JSON_PROPERTY_DOMESTIC_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomesticRates(Double domesticRates) {
    this.domesticRates = domesticRates;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation salePrice(Double salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Get salePrice
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSalePrice() {
    return salePrice;
  }


  @JsonProperty(JSON_PROPERTY_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation priceQualifier(PriceQualifierEnum priceQualifier) {
    
    this.priceQualifier = priceQualifier;
    return this;
  }

   /**
   * 1 &#x3D; POA, 2 &#x3D; Guide price, 3 &#x3D; Fixed price, 4 &#x3D; Offers in excess of, 5 &#x3D; OIRO, 6 &#x3D; Sale by tender, 7 &#x3D; From, 9 &#x3D; Shared ownership, 10 &#x3D; Offers over, 11 &#x3D; Part buy part rent, 12 &#x3D; Shared equity, 0 &#x3D; Default
   * @return priceQualifier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriceQualifierEnum getPriceQualifier() {
    return priceQualifier;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceQualifier(PriceQualifierEnum priceQualifier) {
    this.priceQualifier = priceQualifier;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation tenureType(TenureTypeEnum tenureType) {
    
    this.tenureType = tenureType;
    return this;
  }

   /**
   * Freehold, Leasehold, Feudal, Commonhold, Share of Freehold
   * @return tenureType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenureTypeEnum getTenureType() {
    return tenureType;
  }


  @JsonProperty(JSON_PROPERTY_TENURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenureType(TenureTypeEnum tenureType) {
    this.tenureType = tenureType;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation tenureExpirationDate(MaintenancePost200ResponseValueCreatedDate tenureExpirationDate) {
    
    this.tenureExpirationDate = tenureExpirationDate;
    return this;
  }

   /**
   * Get tenureExpirationDate
   * @return tenureExpirationDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENURE_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getTenureExpirationDate() {
    return tenureExpirationDate;
  }


  @JsonProperty(JSON_PROPERTY_TENURE_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenureExpirationDate(MaintenancePost200ResponseValueCreatedDate tenureExpirationDate) {
    this.tenureExpirationDate = tenureExpirationDate;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation serviceCharge(Double serviceCharge) {
    
    this.serviceCharge = serviceCharge;
    return this;
  }

   /**
   * Get serviceCharge
   * @return serviceCharge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getServiceCharge() {
    return serviceCharge;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation serviceChargeReviewPeriod(Integer serviceChargeReviewPeriod) {
    
    this.serviceChargeReviewPeriod = serviceChargeReviewPeriod;
    return this;
  }

   /**
   * Get serviceChargeReviewPeriod
   * @return serviceChargeReviewPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_CHARGE_REVIEW_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceChargeReviewPeriod() {
    return serviceChargeReviewPeriod;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CHARGE_REVIEW_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceChargeReviewPeriod(Integer serviceChargeReviewPeriod) {
    this.serviceChargeReviewPeriod = serviceChargeReviewPeriod;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation groundRent(Double groundRent) {
    
    this.groundRent = groundRent;
    return this;
  }

   /**
   * Get groundRent
   * @return groundRent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUND_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getGroundRent() {
    return groundRent;
  }


  @JsonProperty(JSON_PROPERTY_GROUND_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroundRent(Double groundRent) {
    this.groundRent = groundRent;
  }


  public PropertySalesIdMarketingGet200ResponseValuePriceInformation groundRentReviewPeriod(Integer groundRentReviewPeriod) {
    
    this.groundRentReviewPeriod = groundRentReviewPeriod;
    return this;
  }

   /**
   * Get groundRentReviewPeriod
   * @return groundRentReviewPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUND_RENT_REVIEW_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroundRentReviewPeriod() {
    return groundRentReviewPeriod;
  }


  @JsonProperty(JSON_PROPERTY_GROUND_RENT_REVIEW_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroundRentReviewPeriod(Integer groundRentReviewPeriod) {
    this.groundRentReviewPeriod = groundRentReviewPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertySalesIdMarketingGet200ResponseValuePriceInformation propertySalesIdMarketingGet200ResponseValuePriceInformation = (PropertySalesIdMarketingGet200ResponseValuePriceInformation) o;
    return Objects.equals(this.councilTaxBand, propertySalesIdMarketingGet200ResponseValuePriceInformation.councilTaxBand) &&
        Objects.equals(this.pricePerUnitArea, propertySalesIdMarketingGet200ResponseValuePriceInformation.pricePerUnitArea) &&
        Objects.equals(this.domesticRates, propertySalesIdMarketingGet200ResponseValuePriceInformation.domesticRates) &&
        Objects.equals(this.salePrice, propertySalesIdMarketingGet200ResponseValuePriceInformation.salePrice) &&
        Objects.equals(this.priceQualifier, propertySalesIdMarketingGet200ResponseValuePriceInformation.priceQualifier) &&
        Objects.equals(this.tenureType, propertySalesIdMarketingGet200ResponseValuePriceInformation.tenureType) &&
        Objects.equals(this.tenureExpirationDate, propertySalesIdMarketingGet200ResponseValuePriceInformation.tenureExpirationDate) &&
        Objects.equals(this.serviceCharge, propertySalesIdMarketingGet200ResponseValuePriceInformation.serviceCharge) &&
        Objects.equals(this.serviceChargeReviewPeriod, propertySalesIdMarketingGet200ResponseValuePriceInformation.serviceChargeReviewPeriod) &&
        Objects.equals(this.groundRent, propertySalesIdMarketingGet200ResponseValuePriceInformation.groundRent) &&
        Objects.equals(this.groundRentReviewPeriod, propertySalesIdMarketingGet200ResponseValuePriceInformation.groundRentReviewPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(councilTaxBand, pricePerUnitArea, domesticRates, salePrice, priceQualifier, tenureType, tenureExpirationDate, serviceCharge, serviceChargeReviewPeriod, groundRent, groundRentReviewPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertySalesIdMarketingGet200ResponseValuePriceInformation {\n");
    sb.append("    councilTaxBand: ").append(toIndentedString(councilTaxBand)).append("\n");
    sb.append("    pricePerUnitArea: ").append(toIndentedString(pricePerUnitArea)).append("\n");
    sb.append("    domesticRates: ").append(toIndentedString(domesticRates)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    priceQualifier: ").append(toIndentedString(priceQualifier)).append("\n");
    sb.append("    tenureType: ").append(toIndentedString(tenureType)).append("\n");
    sb.append("    tenureExpirationDate: ").append(toIndentedString(tenureExpirationDate)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    serviceChargeReviewPeriod: ").append(toIndentedString(serviceChargeReviewPeriod)).append("\n");
    sb.append("    groundRent: ").append(toIndentedString(groundRent)).append("\n");
    sb.append("    groundRentReviewPeriod: ").append(toIndentedString(groundRentReviewPeriod)).append("\n");
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

