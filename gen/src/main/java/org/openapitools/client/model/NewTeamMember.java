/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
 * NewTeamMember
 */
@JsonPropertyOrder({
  NewTeamMember.JSON_PROPERTY_ID,
  NewTeamMember.JSON_PROPERTY_USERNAME,
  NewTeamMember.JSON_PROPERTY_FIRST_NAME,
  NewTeamMember.JSON_PROPERTY_LAST_NAME,
  NewTeamMember.JSON_PROPERTY_NICKNAME,
  NewTeamMember.JSON_PROPERTY_POSITION,
  NewTeamMember.JSON_PROPERTY_CREATE_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class NewTeamMember {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_POSITION = "position";
  private String position;

  public static final String JSON_PROPERTY_CREATE_AT = "create_at";
  private Integer createAt;

  public NewTeamMember() {
  }

  public NewTeamMember id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The user&#39;s ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public NewTeamMember username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public NewTeamMember firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public NewTeamMember lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public NewTeamMember nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public NewTeamMember position(String position) {
    
    this.position = position;
    return this;
  }

   /**
   * The user&#39;s position field value.
   * @return position
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(String position) {
    this.position = position;
  }


  public NewTeamMember createAt(Integer createAt) {
    
    this.createAt = createAt;
    return this;
  }

   /**
   * The creation timestamp of the team member record.
   * @return createAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreateAt() {
    return createAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateAt(Integer createAt) {
    this.createAt = createAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewTeamMember newTeamMember = (NewTeamMember) o;
    return Objects.equals(this.id, newTeamMember.id) &&
        Objects.equals(this.username, newTeamMember.username) &&
        Objects.equals(this.firstName, newTeamMember.firstName) &&
        Objects.equals(this.lastName, newTeamMember.lastName) &&
        Objects.equals(this.nickname, newTeamMember.nickname) &&
        Objects.equals(this.position, newTeamMember.position) &&
        Objects.equals(this.createAt, newTeamMember.createAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, nickname, position, createAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewTeamMember {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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

