/*
 * CHT SA GPT Application
 * Development Environment.
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UserAccountPostDTO
 */
@JsonPropertyOrder({
  UserAccountPostDTO.JSON_PROPERTY_USER_ACCOUNT_NAME,
  UserAccountPostDTO.JSON_PROPERTY_USER_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:35.805334182Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserAccountPostDTO {
  public static final String JSON_PROPERTY_USER_ACCOUNT_NAME = "userAccountName";
  private String userAccountName;

  public static final String JSON_PROPERTY_USER_PASSWORD = "userPassword";
  private Integer userPassword;

  public UserAccountPostDTO() {
  }

  public UserAccountPostDTO userAccountName(String userAccountName) {
    
    this.userAccountName = userAccountName;
    return this;
  }

   /**
   * Get userAccountName
   * @return userAccountName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserAccountName() {
    return userAccountName;
  }


  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAccountName(String userAccountName) {
    this.userAccountName = userAccountName;
  }


  public UserAccountPostDTO userPassword(Integer userPassword) {
    
    this.userPassword = userPassword;
    return this;
  }

   /**
   * Get userPassword
   * @return userPassword
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUserPassword() {
    return userPassword;
  }


  @JsonProperty(JSON_PROPERTY_USER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserPassword(Integer userPassword) {
    this.userPassword = userPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountPostDTO userAccountPostDTO = (UserAccountPostDTO) o;
    return Objects.equals(this.userAccountName, userAccountPostDTO.userAccountName) &&
        Objects.equals(this.userPassword, userAccountPostDTO.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAccountName, userPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountPostDTO {\n");
    sb.append("    userAccountName: ").append(toIndentedString(userAccountName)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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

