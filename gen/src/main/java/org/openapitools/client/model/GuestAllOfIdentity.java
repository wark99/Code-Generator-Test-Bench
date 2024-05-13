/*
 * Hudini Elevate
 * Explore reference documentation for Hudini Elevate - A collection of APIs that application developers can utilize to extend hospitality functions on their experiences
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: developers@hudini.io
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
import org.openapitools.client.model.Country;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GuestAllOfIdentity
 */
@JsonPropertyOrder({
  GuestAllOfIdentity.JSON_PROPERTY_ID_TYPE,
  GuestAllOfIdentity.JSON_PROPERTY_NUMBER,
  GuestAllOfIdentity.JSON_PROPERTY_ISSUE_DATE,
  GuestAllOfIdentity.JSON_PROPERTY_EXPIRY_DATE,
  GuestAllOfIdentity.JSON_PROPERTY_ISSUE_COUNTRY
})
@JsonTypeName("Guest_allOf_identity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:57.602746427Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GuestAllOfIdentity {
  /**
   * Gets or Sets idType
   */
  public enum IdTypeEnum {
    PASSPORT("PASSPORT"),
    
    DRIVERS_LICENSE("DRIVERS_LICENSE"),
    
    NATIONAL_ID("NATIONAL_ID"),
    
    OTHER_ID("OTHER_ID");

    private String value;

    IdTypeEnum(String value) {
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
    public static IdTypeEnum fromValue(String value) {
      for (IdTypeEnum b : IdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ID_TYPE = "IDType";
  private IdTypeEnum idType;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_ISSUE_DATE = "issueDate";
  private String issueDate;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public static final String JSON_PROPERTY_ISSUE_COUNTRY = "issueCountry";
  private Country issueCountry;

  public GuestAllOfIdentity() {
  }

  public GuestAllOfIdentity idType(IdTypeEnum idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdTypeEnum getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }


  public GuestAllOfIdentity number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public GuestAllOfIdentity issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueDate() {
    return issueDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public GuestAllOfIdentity expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryDate() {
    return expiryDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public GuestAllOfIdentity issueCountry(Country issueCountry) {
    
    this.issueCountry = issueCountry;
    return this;
  }

   /**
   * Get issueCountry
   * @return issueCountry
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Country getIssueCountry() {
    return issueCountry;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueCountry(Country issueCountry) {
    this.issueCountry = issueCountry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestAllOfIdentity guestAllOfIdentity = (GuestAllOfIdentity) o;
    return Objects.equals(this.idType, guestAllOfIdentity.idType) &&
        Objects.equals(this.number, guestAllOfIdentity.number) &&
        Objects.equals(this.issueDate, guestAllOfIdentity.issueDate) &&
        Objects.equals(this.expiryDate, guestAllOfIdentity.expiryDate) &&
        Objects.equals(this.issueCountry, guestAllOfIdentity.issueCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType, number, issueDate, expiryDate, issueCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestAllOfIdentity {\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issueCountry: ").append(toIndentedString(issueCountry)).append("\n");
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

