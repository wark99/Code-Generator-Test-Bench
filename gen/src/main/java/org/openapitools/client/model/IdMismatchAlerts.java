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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IdMismatchAlerts
 */
@JsonPropertyOrder({
  IdMismatchAlerts.JSON_PROPERTY_ADDRESS_STATUS,
  IdMismatchAlerts.JSON_PROPERTY_CONDITION,
  IdMismatchAlerts.JSON_PROPERTY_INQUIRIES_IN_LAST60_COUNT,
  IdMismatchAlerts.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IdMismatchAlerts {
  public static final String JSON_PROPERTY_ADDRESS_STATUS = "addressStatus";
  private String addressStatus;

  public static final String JSON_PROPERTY_CONDITION = "condition";
  private String condition;

  public static final String JSON_PROPERTY_INQUIRIES_IN_LAST60_COUNT = "inquiriesInLast60Count";
  private String inquiriesInLast60Count;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public IdMismatchAlerts() {
  }

  public IdMismatchAlerts addressStatus(String addressStatus) {
    
    this.addressStatus = addressStatus;
    return this;
  }

   /**
   * Get addressStatus
   * @return addressStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressStatus() {
    return addressStatus;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressStatus(String addressStatus) {
    this.addressStatus = addressStatus;
  }


  public IdMismatchAlerts condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCondition() {
    return condition;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(String condition) {
    this.condition = condition;
  }


  public IdMismatchAlerts inquiriesInLast60Count(String inquiriesInLast60Count) {
    
    this.inquiriesInLast60Count = inquiriesInLast60Count;
    return this;
  }

   /**
   * Get inquiriesInLast60Count
   * @return inquiriesInLast60Count
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INQUIRIES_IN_LAST60_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInquiriesInLast60Count() {
    return inquiriesInLast60Count;
  }


  @JsonProperty(JSON_PROPERTY_INQUIRIES_IN_LAST60_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInquiriesInLast60Count(String inquiriesInLast60Count) {
    this.inquiriesInLast60Count = inquiriesInLast60Count;
  }


  public IdMismatchAlerts type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdMismatchAlerts idMismatchAlerts = (IdMismatchAlerts) o;
    return Objects.equals(this.addressStatus, idMismatchAlerts.addressStatus) &&
        Objects.equals(this.condition, idMismatchAlerts.condition) &&
        Objects.equals(this.inquiriesInLast60Count, idMismatchAlerts.inquiriesInLast60Count) &&
        Objects.equals(this.type, idMismatchAlerts.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressStatus, condition, inquiriesInLast60Count, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdMismatchAlerts {\n");
    sb.append("    addressStatus: ").append(toIndentedString(addressStatus)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    inquiriesInLast60Count: ").append(toIndentedString(inquiriesInLast60Count)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

