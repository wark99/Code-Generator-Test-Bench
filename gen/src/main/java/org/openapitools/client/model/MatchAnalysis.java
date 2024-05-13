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
import org.openapitools.client.model.Addresses4;
import org.openapitools.client.model.FirstNameMatchAnalysis;
import org.openapitools.client.model.Name;
import org.openapitools.client.model.Phone2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MatchAnalysis
 */
@JsonPropertyOrder({
  MatchAnalysis.JSON_PROPERTY_ADDRESSES,
  MatchAnalysis.JSON_PROPERTY_DATE_OF_BIRTH,
  MatchAnalysis.JSON_PROPERTY_NAME,
  MatchAnalysis.JSON_PROPERTY_PHONE,
  MatchAnalysis.JSON_PROPERTY_SSN,
  MatchAnalysis.JSON_PROPERTY_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MatchAnalysis {
  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<Addresses4> addresses;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private FirstNameMatchAnalysis dateOfBirth;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone2 phone;

  public static final String JSON_PROPERTY_SSN = "ssn";
  private FirstNameMatchAnalysis ssn;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private FirstNameMatchAnalysis total;

  public MatchAnalysis() {
  }

  public MatchAnalysis addresses(List<Addresses4> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public MatchAnalysis addAddressesItem(Addresses4 addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Addresses4> getAddresses() {
    return addresses;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddresses(List<Addresses4> addresses) {
    this.addresses = addresses;
  }


  public MatchAnalysis dateOfBirth(FirstNameMatchAnalysis dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FirstNameMatchAnalysis getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(FirstNameMatchAnalysis dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public MatchAnalysis name(Name name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Name getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }


  public MatchAnalysis phone(Phone2 phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Phone2 getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(Phone2 phone) {
    this.phone = phone;
  }


  public MatchAnalysis ssn(FirstNameMatchAnalysis ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FirstNameMatchAnalysis getSsn() {
    return ssn;
  }


  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsn(FirstNameMatchAnalysis ssn) {
    this.ssn = ssn;
  }


  public MatchAnalysis total(FirstNameMatchAnalysis total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FirstNameMatchAnalysis getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(FirstNameMatchAnalysis total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchAnalysis matchAnalysis = (MatchAnalysis) o;
    return Objects.equals(this.addresses, matchAnalysis.addresses) &&
        Objects.equals(this.dateOfBirth, matchAnalysis.dateOfBirth) &&
        Objects.equals(this.name, matchAnalysis.name) &&
        Objects.equals(this.phone, matchAnalysis.phone) &&
        Objects.equals(this.ssn, matchAnalysis.ssn) &&
        Objects.equals(this.total, matchAnalysis.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, dateOfBirth, name, phone, ssn, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAnalysis {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

