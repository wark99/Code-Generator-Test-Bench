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
import org.openapitools.client.model.Addresses3;
import org.openapitools.client.model.Names;
import org.openapitools.client.model.Phone;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MatchDataSummary
 */
@JsonPropertyOrder({
  MatchDataSummary.JSON_PROPERTY_ADDRESSES,
  MatchDataSummary.JSON_PROPERTY_NAMES,
  MatchDataSummary.JSON_PROPERTY_PHONES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MatchDataSummary {
  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<Addresses3> addresses;

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<Names> names;

  public static final String JSON_PROPERTY_PHONES = "phones";
  private List<Phone> phones;

  public MatchDataSummary() {
  }

  public MatchDataSummary addresses(List<Addresses3> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public MatchDataSummary addAddressesItem(Addresses3 addressesItem) {
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

  public List<Addresses3> getAddresses() {
    return addresses;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddresses(List<Addresses3> addresses) {
    this.addresses = addresses;
  }


  public MatchDataSummary names(List<Names> names) {
    
    this.names = names;
    return this;
  }

  public MatchDataSummary addNamesItem(Names namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Names> getNames() {
    return names;
  }


  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNames(List<Names> names) {
    this.names = names;
  }


  public MatchDataSummary phones(List<Phone> phones) {
    
    this.phones = phones;
    return this;
  }

  public MatchDataSummary addPhonesItem(Phone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Get phones
   * @return phones
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Phone> getPhones() {
    return phones;
  }


  @JsonProperty(JSON_PROPERTY_PHONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchDataSummary matchDataSummary = (MatchDataSummary) o;
    return Objects.equals(this.addresses, matchDataSummary.addresses) &&
        Objects.equals(this.names, matchDataSummary.names) &&
        Objects.equals(this.phones, matchDataSummary.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, names, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchDataSummary {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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

