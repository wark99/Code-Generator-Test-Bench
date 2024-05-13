/*
 * MATIX Enterprise Asset Management - OpenAPI 3.1
 * This is the MATIX Enteprise Asset Management (EAM) documentation based on the OpenAPI 3.1 specification.  You can find out more about MATIX at [https://matix.cloud](https://matix.cloud). If you have a valid account, you can log into the MATIX EAM Platform at [https://eam.matix.cloud](https://eam.matix.cloud).  API Authentication is done with Bearer token. The token can be generated by a Company Admin directly on the MATIX EAM Platform.
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: support@matix.cloud
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CompanyParentCompany
 */
@JsonPropertyOrder({
  CompanyParentCompany.JSON_PROPERTY_ID,
  CompanyParentCompany.JSON_PROPERTY_NAME,
  CompanyParentCompany.JSON_PROPERTY_VAT,
  CompanyParentCompany.JSON_PROPERTY_ADDRESS,
  CompanyParentCompany.JSON_PROPERTY_CITY,
  CompanyParentCompany.JSON_PROPERTY_STATE,
  CompanyParentCompany.JSON_PROPERTY_COUNTRY,
  CompanyParentCompany.JSON_PROPERTY_ZIP_CODE,
  CompanyParentCompany.JSON_PROPERTY_CRETAED_AT,
  CompanyParentCompany.JSON_PROPERTY_PARENT_COMPANY
})
@JsonTypeName("Company_parentCompany")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:24.819947494Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CompanyParentCompany {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VAT = "vat";
  private String vat;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public static final String JSON_PROPERTY_CRETAED_AT = "cretaedAt";
  private OffsetDateTime cretaedAt;

  public static final String JSON_PROPERTY_PARENT_COMPANY = "parentCompany";
  private Object parentCompany;

  public CompanyParentCompany() {
  }

  public CompanyParentCompany id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of company
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


  public CompanyParentCompany name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of company
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CompanyParentCompany vat(String vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * VAT number / tad ID of company
   * @return vat
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVat() {
    return vat;
  }


  @JsonProperty(JSON_PROPERTY_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVat(String vat) {
    this.vat = vat;
  }


  public CompanyParentCompany address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of company
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public CompanyParentCompany city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of company
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public CompanyParentCompany state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of company
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public CompanyParentCompany country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of company
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public CompanyParentCompany zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Zip code of company
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public CompanyParentCompany cretaedAt(OffsetDateTime cretaedAt) {
    
    this.cretaedAt = cretaedAt;
    return this;
  }

   /**
   * Company creation date
   * @return cretaedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRETAED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCretaedAt() {
    return cretaedAt;
  }


  @JsonProperty(JSON_PROPERTY_CRETAED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCretaedAt(OffsetDateTime cretaedAt) {
    this.cretaedAt = cretaedAt;
  }


  public CompanyParentCompany parentCompany(Object parentCompany) {
    
    this.parentCompany = parentCompany;
    return this;
  }

   /**
   * Get parentCompany
   * @return parentCompany
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getParentCompany() {
    return parentCompany;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentCompany(Object parentCompany) {
    this.parentCompany = parentCompany;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyParentCompany companyParentCompany = (CompanyParentCompany) o;
    return Objects.equals(this.id, companyParentCompany.id) &&
        Objects.equals(this.name, companyParentCompany.name) &&
        Objects.equals(this.vat, companyParentCompany.vat) &&
        Objects.equals(this.address, companyParentCompany.address) &&
        Objects.equals(this.city, companyParentCompany.city) &&
        Objects.equals(this.state, companyParentCompany.state) &&
        Objects.equals(this.country, companyParentCompany.country) &&
        Objects.equals(this.zipCode, companyParentCompany.zipCode) &&
        Objects.equals(this.cretaedAt, companyParentCompany.cretaedAt) &&
        Objects.equals(this.parentCompany, companyParentCompany.parentCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, vat, address, city, state, country, zipCode, cretaedAt, parentCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyParentCompany {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    cretaedAt: ").append(toIndentedString(cretaedAt)).append("\n");
    sb.append("    parentCompany: ").append(toIndentedString(parentCompany)).append("\n");
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

