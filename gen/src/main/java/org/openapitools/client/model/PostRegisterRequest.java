/*
 * Reference
 * The DoDays API reference.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@dodays.co.uk
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
 * PostRegisterRequest
 */
@JsonPropertyOrder({
  PostRegisterRequest.JSON_PROPERTY_FIRST_NAME,
  PostRegisterRequest.JSON_PROPERTY_LAST_NAME,
  PostRegisterRequest.JSON_PROPERTY_EMAIL,
  PostRegisterRequest.JSON_PROPERTY_PASSWORD,
  PostRegisterRequest.JSON_PROPERTY_PASSWORD_CONFIRMATION,
  PostRegisterRequest.JSON_PROPERTY_TELEPHONE,
  PostRegisterRequest.JSON_PROPERTY_TERMS,
  PostRegisterRequest.JSON_PROPERTY_DEVICE_NAME
})
@JsonTypeName("post_register_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PostRegisterRequest {
  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PASSWORD_CONFIRMATION = "password_confirmation";
  private String passwordConfirmation;

  public static final String JSON_PROPERTY_TELEPHONE = "telephone";
  private String telephone;

  public static final String JSON_PROPERTY_TERMS = "terms";
  private Boolean terms;

  public static final String JSON_PROPERTY_DEVICE_NAME = "device_name";
  private String deviceName;

  public PostRegisterRequest() {
  }

  public PostRegisterRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PostRegisterRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PostRegisterRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public PostRegisterRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public PostRegisterRequest passwordConfirmation(String passwordConfirmation) {
    
    this.passwordConfirmation = passwordConfirmation;
    return this;
  }

   /**
   * Get passwordConfirmation
   * @return passwordConfirmation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPasswordConfirmation() {
    return passwordConfirmation;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPasswordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }


  public PostRegisterRequest telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTelephone() {
    return telephone;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public PostRegisterRequest terms(Boolean terms) {
    
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTerms() {
    return terms;
  }


  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTerms(Boolean terms) {
    this.terms = terms;
  }


  public PostRegisterRequest deviceName(String deviceName) {
    
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Get deviceName
   * @return deviceName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDeviceName() {
    return deviceName;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRegisterRequest postRegisterRequest = (PostRegisterRequest) o;
    return Objects.equals(this.firstName, postRegisterRequest.firstName) &&
        Objects.equals(this.lastName, postRegisterRequest.lastName) &&
        Objects.equals(this.email, postRegisterRequest.email) &&
        Objects.equals(this.password, postRegisterRequest.password) &&
        Objects.equals(this.passwordConfirmation, postRegisterRequest.passwordConfirmation) &&
        Objects.equals(this.telephone, postRegisterRequest.telephone) &&
        Objects.equals(this.terms, postRegisterRequest.terms) &&
        Objects.equals(this.deviceName, postRegisterRequest.deviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, password, passwordConfirmation, telephone, terms, deviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRegisterRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordConfirmation: ").append(toIndentedString(passwordConfirmation)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
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

