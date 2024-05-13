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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccountOwnerAddress;
import org.openapitools.client.model.AccountOwnerName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Owner of an account.
 */
@JsonPropertyOrder({
  AccountOwner.JSON_PROPERTY_NAME,
  AccountOwner.JSON_PROPERTY_ADDRESSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:38.356341300Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountOwner {
  public static final String JSON_PROPERTY_NAME = "name";
  private AccountOwnerName name;

  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<AccountOwnerAddress> addresses = new ArrayList<>();

  public AccountOwner() {
  }

  public AccountOwner name(AccountOwnerName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of an account owner.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountOwnerName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(AccountOwnerName name) {
    this.name = name;
  }


  public AccountOwner addresses(List<AccountOwnerAddress> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public AccountOwner addAddressesItem(AccountOwnerAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses belonging to the account owner.
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountOwnerAddress> getAddresses() {
    return addresses;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddresses(List<AccountOwnerAddress> addresses) {
    this.addresses = addresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountOwner accountOwner = (AccountOwner) o;
    return Objects.equals(this.name, accountOwner.name) &&
        Objects.equals(this.addresses, accountOwner.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOwner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

