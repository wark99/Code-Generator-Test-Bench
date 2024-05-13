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
import org.openapitools.client.model.JobIdEditPutRequestSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PersonalDetails
 */
@JsonPropertyOrder({
  PersonalDetails.JSON_PROPERTY_NAME,
  PersonalDetails.JSON_PROPERTY_POSTCODE,
  PersonalDetails.JSON_PROPERTY_CITY,
  PersonalDetails.JSON_PROPERTY_COUNTY,
  PersonalDetails.JSON_PROPERTY_GENDER,
  PersonalDetails.JSON_PROPERTY_AGE,
  PersonalDetails.JSON_PROPERTY_SCHEDULE,
  PersonalDetails.JSON_PROPERTY_ID_CHECKED,
  PersonalDetails.JSON_PROPERTY_ADDRESS_CHECKED,
  PersonalDetails.JSON_PROPERTY_REFERENCED_CHECKED,
  PersonalDetails.JSON_PROPERTY_ID_DOCUMENT_UNDER_REVIEW,
  PersonalDetails.JSON_PROPERTY_DATE_JOINED,
  PersonalDetails.JSON_PROPERTY_LAST_LOGIN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PersonalDetails {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSTCODE = "postcode";
  private String postcode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTY = "county";
  private String county;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GENDER = "gender";
  private GenderEnum gender;

  public static final String JSON_PROPERTY_AGE = "age";
  private String age;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private JobIdEditPutRequestSchedule schedule;

  public static final String JSON_PROPERTY_ID_CHECKED = "id_checked";
  private Boolean idChecked;

  public static final String JSON_PROPERTY_ADDRESS_CHECKED = "address_checked";
  private Boolean addressChecked;

  public static final String JSON_PROPERTY_REFERENCED_CHECKED = "referenced_checked";
  private Boolean referencedChecked;

  public static final String JSON_PROPERTY_ID_DOCUMENT_UNDER_REVIEW = "id_document_under_review";
  private Boolean idDocumentUnderReview;

  public static final String JSON_PROPERTY_DATE_JOINED = "date_joined";
  private String dateJoined;

  public static final String JSON_PROPERTY_LAST_LOGIN = "last_login";
  private String lastLogin;

  public PersonalDetails() {
  }

  public PersonalDetails name(String name) {
    
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

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PersonalDetails postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostcode() {
    return postcode;
  }


  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public PersonalDetails city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
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


  public PersonalDetails county(String county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCounty() {
    return county;
  }


  @JsonProperty(JSON_PROPERTY_COUNTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounty(String county) {
    this.county = county;
  }


  public PersonalDetails gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GenderEnum getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public PersonalDetails age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAge() {
    return age;
  }


  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAge(String age) {
    this.age = age;
  }


  public PersonalDetails schedule(JobIdEditPutRequestSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JobIdEditPutRequestSchedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(JobIdEditPutRequestSchedule schedule) {
    this.schedule = schedule;
  }


  public PersonalDetails idChecked(Boolean idChecked) {
    
    this.idChecked = idChecked;
    return this;
  }

   /**
   * Get idChecked
   * @return idChecked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIdChecked() {
    return idChecked;
  }


  @JsonProperty(JSON_PROPERTY_ID_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdChecked(Boolean idChecked) {
    this.idChecked = idChecked;
  }


  public PersonalDetails addressChecked(Boolean addressChecked) {
    
    this.addressChecked = addressChecked;
    return this;
  }

   /**
   * Get addressChecked
   * @return addressChecked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddressChecked() {
    return addressChecked;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressChecked(Boolean addressChecked) {
    this.addressChecked = addressChecked;
  }


  public PersonalDetails referencedChecked(Boolean referencedChecked) {
    
    this.referencedChecked = referencedChecked;
    return this;
  }

   /**
   * Get referencedChecked
   * @return referencedChecked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCED_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReferencedChecked() {
    return referencedChecked;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCED_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferencedChecked(Boolean referencedChecked) {
    this.referencedChecked = referencedChecked;
  }


  public PersonalDetails idDocumentUnderReview(Boolean idDocumentUnderReview) {
    
    this.idDocumentUnderReview = idDocumentUnderReview;
    return this;
  }

   /**
   * Get idDocumentUnderReview
   * @return idDocumentUnderReview
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_DOCUMENT_UNDER_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIdDocumentUnderReview() {
    return idDocumentUnderReview;
  }


  @JsonProperty(JSON_PROPERTY_ID_DOCUMENT_UNDER_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdDocumentUnderReview(Boolean idDocumentUnderReview) {
    this.idDocumentUnderReview = idDocumentUnderReview;
  }


  public PersonalDetails dateJoined(String dateJoined) {
    
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_JOINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateJoined() {
    return dateJoined;
  }


  @JsonProperty(JSON_PROPERTY_DATE_JOINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }


  public PersonalDetails lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastLogin() {
    return lastLogin;
  }


  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalDetails personalDetails = (PersonalDetails) o;
    return Objects.equals(this.name, personalDetails.name) &&
        Objects.equals(this.postcode, personalDetails.postcode) &&
        Objects.equals(this.city, personalDetails.city) &&
        Objects.equals(this.county, personalDetails.county) &&
        Objects.equals(this.gender, personalDetails.gender) &&
        Objects.equals(this.age, personalDetails.age) &&
        Objects.equals(this.schedule, personalDetails.schedule) &&
        Objects.equals(this.idChecked, personalDetails.idChecked) &&
        Objects.equals(this.addressChecked, personalDetails.addressChecked) &&
        Objects.equals(this.referencedChecked, personalDetails.referencedChecked) &&
        Objects.equals(this.idDocumentUnderReview, personalDetails.idDocumentUnderReview) &&
        Objects.equals(this.dateJoined, personalDetails.dateJoined) &&
        Objects.equals(this.lastLogin, personalDetails.lastLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postcode, city, county, gender, age, schedule, idChecked, addressChecked, referencedChecked, idDocumentUnderReview, dateJoined, lastLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    idChecked: ").append(toIndentedString(idChecked)).append("\n");
    sb.append("    addressChecked: ").append(toIndentedString(addressChecked)).append("\n");
    sb.append("    referencedChecked: ").append(toIndentedString(referencedChecked)).append("\n");
    sb.append("    idDocumentUnderReview: ").append(toIndentedString(idDocumentUnderReview)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
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

