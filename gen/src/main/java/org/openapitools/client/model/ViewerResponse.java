/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
 * ViewerResponse
 */
@JsonPropertyOrder({
  ViewerResponse.JSON_PROPERTY_ID,
  ViewerResponse.JSON_PROPERTY_FIRST_NAME,
  ViewerResponse.JSON_PROPERTY_LAST_NAME,
  ViewerResponse.JSON_PROPERTY_STATUS,
  ViewerResponse.JSON_PROPERTY_VIEWING_TIME,
  ViewerResponse.JSON_PROPERTY_EMAIL_ADDRESS,
  ViewerResponse.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ViewerResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  /**
   * 1 &#x3D; Booked - unconfirmed, 2 &#x3D; Booked - confirmed, 3 &#x3D; Viewer cancelled, 4 &#x3D; Landlord cancelled, 5 &#x3D; Agency cancelled, 6 &#x3D; Viewer no show, 7 &#x3D; Agency missed appointment, 8 &#x3D; Viewer interested, 9 &#x3D; Viewer possibly interested - chase, 10 &#x3D; Viewer possibly interested - do not chase, 11 &#x3D; Viewer not interested
   */
  public enum StatusEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_8(8),
    
    NUMBER_9(9),
    
    NUMBER_10(10),
    
    NUMBER_11(11);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(Integer value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_VIEWING_TIME = "viewing_time";
  private String viewingTime;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public ViewerResponse() {
  }

  public ViewerResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public ViewerResponse firstName(String firstName) {
    
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


  public ViewerResponse lastName(String lastName) {
    
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


  public ViewerResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 1 &#x3D; Booked - unconfirmed, 2 &#x3D; Booked - confirmed, 3 &#x3D; Viewer cancelled, 4 &#x3D; Landlord cancelled, 5 &#x3D; Agency cancelled, 6 &#x3D; Viewer no show, 7 &#x3D; Agency missed appointment, 8 &#x3D; Viewer interested, 9 &#x3D; Viewer possibly interested - chase, 10 &#x3D; Viewer possibly interested - do not chase, 11 &#x3D; Viewer not interested
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ViewerResponse viewingTime(String viewingTime) {
    
    this.viewingTime = viewingTime;
    return this;
  }

   /**
   * Get viewingTime
   * @return viewingTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getViewingTime() {
    return viewingTime;
  }


  @JsonProperty(JSON_PROPERTY_VIEWING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewingTime(String viewingTime) {
    this.viewingTime = viewingTime;
  }


  public ViewerResponse emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public ViewerResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewerResponse viewerResponse = (ViewerResponse) o;
    return Objects.equals(this.id, viewerResponse.id) &&
        Objects.equals(this.firstName, viewerResponse.firstName) &&
        Objects.equals(this.lastName, viewerResponse.lastName) &&
        Objects.equals(this.status, viewerResponse.status) &&
        Objects.equals(this.viewingTime, viewerResponse.viewingTime) &&
        Objects.equals(this.emailAddress, viewerResponse.emailAddress) &&
        Objects.equals(this.description, viewerResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, status, viewingTime, emailAddress, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    viewingTime: ").append(toIndentedString(viewingTime)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

