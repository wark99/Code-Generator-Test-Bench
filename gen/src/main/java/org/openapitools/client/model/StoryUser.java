/*
 * ClosedNetwork-DEV
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
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
import org.openapitools.client.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StoryUser
 */
@JsonPropertyOrder({
  StoryUser.JSON_PROPERTY_ID,
  StoryUser.JSON_PROPERTY_NAME,
  StoryUser.JSON_PROPERTY_EMAIL,
  StoryUser.JSON_PROPERTY_ROLE,
  StoryUser.JSON_PROPERTY_PHONE_NUMBER,
  StoryUser.JSON_PROPERTY_COLLEGE,
  StoryUser.JSON_PROPERTY_IMAGE_URL,
  StoryUser.JSON_PROPERTY_DATE_OF_BIRTH,
  StoryUser.JSON_PROPERTY_GENDER,
  StoryUser.JSON_PROPERTY_BRANCH,
  StoryUser.JSON_PROPERTY_STATUS,
  StoryUser.JSON_PROPERTY_EDUCATION_LEVEL,
  StoryUser.JSON_PROPERTY_GRADUATION_YEAR,
  StoryUser.JSON_PROPERTY_IS_ACTIVE,
  StoryUser.JSON_PROPERTY_CREATED_AT,
  StoryUser.JSON_PROPERTY_UPDATED_AT,
  StoryUser.JSON_PROPERTY_V
})
@JsonTypeName("Story_user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:50.441407861Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StoryUser {
  public static final String JSON_PROPERTY_ID = "_id";
  private Object id = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private Object name = null;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private Object email = null;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    STUDENT("student"),
    
    ALUMNI("alumni"),
    
    PROFESSOR("professor");

    private Object value;

    RoleEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(Object value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role = null;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private Object phoneNumber = null;

  public static final String JSON_PROPERTY_COLLEGE = "college";
  private Object college = null;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private Object imageUrl = null;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private Object dateOfBirth = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female");

    private Object value;

    GenderEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(Object value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_GENDER = "gender";
  private GenderEnum gender = null;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private Object branch = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Object status = null;

  public static final String JSON_PROPERTY_EDUCATION_LEVEL = "educationLevel";
  private Object educationLevel = null;

  public static final String JSON_PROPERTY_GRADUATION_YEAR = "graduationYear";
  private Object graduationYear = null;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Object isActive = null;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_V = "__v";
  private Object v = null;

  public StoryUser() {
  }

  public StoryUser id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Object id) {
    this.id = id;
  }


  public StoryUser name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(Object name) {
    this.name = name;
  }


  public StoryUser email(Object email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(Object email) {
    this.email = email;
  }


  public StoryUser role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public StoryUser phoneNumber(Object phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumber(Object phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public StoryUser college(Object college) {
    
    this.college = college;
    return this;
  }

   /**
   * Get college
   * @return college
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLEGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCollege() {
    return college;
  }


  @JsonProperty(JSON_PROPERTY_COLLEGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollege(Object college) {
    this.college = college;
  }


  public StoryUser imageUrl(Object imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageUrl(Object imageUrl) {
    this.imageUrl = imageUrl;
  }


  public StoryUser dateOfBirth(Object dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateOfBirth(Object dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public StoryUser gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GenderEnum getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public StoryUser branch(Object branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBranch(Object branch) {
    this.branch = branch;
  }


  public StoryUser status(Object status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Object status) {
    this.status = status;
  }


  public StoryUser educationLevel(Object educationLevel) {
    
    this.educationLevel = educationLevel;
    return this;
  }

   /**
   * Get educationLevel
   * @return educationLevel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDUCATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getEducationLevel() {
    return educationLevel;
  }


  @JsonProperty(JSON_PROPERTY_EDUCATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEducationLevel(Object educationLevel) {
    this.educationLevel = educationLevel;
  }


  public StoryUser graduationYear(Object graduationYear) {
    
    this.graduationYear = graduationYear;
    return this;
  }

   /**
   * Get graduationYear
   * @return graduationYear
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADUATION_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getGraduationYear() {
    return graduationYear;
  }


  @JsonProperty(JSON_PROPERTY_GRADUATION_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGraduationYear(Object graduationYear) {
    this.graduationYear = graduationYear;
  }


  public StoryUser isActive(Object isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsActive(Object isActive) {
    this.isActive = isActive;
  }


  public StoryUser createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Object createdAt) {
    this.createdAt = createdAt;
  }


  public StoryUser updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(Object updatedAt) {
    this.updatedAt = updatedAt;
  }


  public StoryUser v(Object v) {
    
    this.v = v;
    return this;
  }

   /**
   * Get v
   * @return v
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_V)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getV() {
    return v;
  }


  @JsonProperty(JSON_PROPERTY_V)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setV(Object v) {
    this.v = v;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryUser storyUser = (StoryUser) o;
    return Objects.equals(this.id, storyUser.id) &&
        Objects.equals(this.name, storyUser.name) &&
        Objects.equals(this.email, storyUser.email) &&
        Objects.equals(this.role, storyUser.role) &&
        Objects.equals(this.phoneNumber, storyUser.phoneNumber) &&
        Objects.equals(this.college, storyUser.college) &&
        Objects.equals(this.imageUrl, storyUser.imageUrl) &&
        Objects.equals(this.dateOfBirth, storyUser.dateOfBirth) &&
        Objects.equals(this.gender, storyUser.gender) &&
        Objects.equals(this.branch, storyUser.branch) &&
        Objects.equals(this.status, storyUser.status) &&
        Objects.equals(this.educationLevel, storyUser.educationLevel) &&
        Objects.equals(this.graduationYear, storyUser.graduationYear) &&
        Objects.equals(this.isActive, storyUser.isActive) &&
        Objects.equals(this.createdAt, storyUser.createdAt) &&
        Objects.equals(this.updatedAt, storyUser.updatedAt) &&
        Objects.equals(this.v, storyUser.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, role, phoneNumber, college, imageUrl, dateOfBirth, gender, branch, status, educationLevel, graduationYear, isActive, createdAt, updatedAt, v);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    college: ").append(toIndentedString(college)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    graduationYear: ").append(toIndentedString(graduationYear)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
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

