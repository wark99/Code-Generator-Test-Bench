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
 * Userconnection
 */
@JsonPropertyOrder({
  Userconnection.JSON_PROPERTY_UNSUCCESSFUL_LIMIT,
  Userconnection.JSON_PROPERTY_UNSUCCESSFUL_RATE_LIMIT,
  Userconnection.JSON_PROPERTY_UNSUCCESSFUL_NOTIFICATION,
  Userconnection.JSON_PROPERTY_SUCCESSFUL_NOTIFICATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Userconnection {
  public static final String JSON_PROPERTY_UNSUCCESSFUL_LIMIT = "unsuccessful_limit";
  private Boolean unsuccessfulLimit;

  public static final String JSON_PROPERTY_UNSUCCESSFUL_RATE_LIMIT = "unsuccessful_rate_limit";
  private Integer unsuccessfulRateLimit;

  public static final String JSON_PROPERTY_UNSUCCESSFUL_NOTIFICATION = "unsuccessful_notification";
  private Boolean unsuccessfulNotification;

  public static final String JSON_PROPERTY_SUCCESSFUL_NOTIFICATION = "successful_notification";
  private Boolean successfulNotification;

  public Userconnection() {
  }

  public Userconnection unsuccessfulLimit(Boolean unsuccessfulLimit) {
    
    this.unsuccessfulLimit = unsuccessfulLimit;
    return this;
  }

   /**
   * Get unsuccessfulLimit
   * @return unsuccessfulLimit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUnsuccessfulLimit() {
    return unsuccessfulLimit;
  }


  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnsuccessfulLimit(Boolean unsuccessfulLimit) {
    this.unsuccessfulLimit = unsuccessfulLimit;
  }


  public Userconnection unsuccessfulRateLimit(Integer unsuccessfulRateLimit) {
    
    this.unsuccessfulRateLimit = unsuccessfulRateLimit;
    return this;
  }

   /**
   * Get unsuccessfulRateLimit
   * @return unsuccessfulRateLimit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUnsuccessfulRateLimit() {
    return unsuccessfulRateLimit;
  }


  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnsuccessfulRateLimit(Integer unsuccessfulRateLimit) {
    this.unsuccessfulRateLimit = unsuccessfulRateLimit;
  }


  public Userconnection unsuccessfulNotification(Boolean unsuccessfulNotification) {
    
    this.unsuccessfulNotification = unsuccessfulNotification;
    return this;
  }

   /**
   * Get unsuccessfulNotification
   * @return unsuccessfulNotification
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUnsuccessfulNotification() {
    return unsuccessfulNotification;
  }


  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnsuccessfulNotification(Boolean unsuccessfulNotification) {
    this.unsuccessfulNotification = unsuccessfulNotification;
  }


  public Userconnection successfulNotification(Boolean successfulNotification) {
    
    this.successfulNotification = successfulNotification;
    return this;
  }

   /**
   * Get successfulNotification
   * @return successfulNotification
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccessfulNotification() {
    return successfulNotification;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccessfulNotification(Boolean successfulNotification) {
    this.successfulNotification = successfulNotification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Userconnection userconnection = (Userconnection) o;
    return Objects.equals(this.unsuccessfulLimit, userconnection.unsuccessfulLimit) &&
        Objects.equals(this.unsuccessfulRateLimit, userconnection.unsuccessfulRateLimit) &&
        Objects.equals(this.unsuccessfulNotification, userconnection.unsuccessfulNotification) &&
        Objects.equals(this.successfulNotification, userconnection.successfulNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsuccessfulLimit, unsuccessfulRateLimit, unsuccessfulNotification, successfulNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Userconnection {\n");
    sb.append("    unsuccessfulLimit: ").append(toIndentedString(unsuccessfulLimit)).append("\n");
    sb.append("    unsuccessfulRateLimit: ").append(toIndentedString(unsuccessfulRateLimit)).append("\n");
    sb.append("    unsuccessfulNotification: ").append(toIndentedString(unsuccessfulNotification)).append("\n");
    sb.append("    successfulNotification: ").append(toIndentedString(successfulNotification)).append("\n");
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
