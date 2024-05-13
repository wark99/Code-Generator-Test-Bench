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
 * Usersession
 */
@JsonPropertyOrder({
  Usersession.JSON_PROPERTY_BROWSER,
  Usersession.JSON_PROPERTY_LAST_ACCESSED_AT,
  Usersession.JSON_PROPERTY_DEVICE,
  Usersession.JSON_PROPERTY_LOCATION,
  Usersession.JSON_PROPERTY_IP,
  Usersession.JSON_PROPERTY_USER_AGENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Usersession {
  public static final String JSON_PROPERTY_BROWSER = "browser";
  private String browser;

  public static final String JSON_PROPERTY_LAST_ACCESSED_AT = "last_accessed_at";
  private Integer lastAccessedAt;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private String device;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_USER_AGENT = "user_agent";
  private String userAgent;

  public Usersession() {
  }

  public Usersession browser(String browser) {
    
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrowser() {
    return browser;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrowser(String browser) {
    this.browser = browser;
  }


  public Usersession lastAccessedAt(Integer lastAccessedAt) {
    
    this.lastAccessedAt = lastAccessedAt;
    return this;
  }

   /**
   * Get lastAccessedAt
   * @return lastAccessedAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLastAccessedAt() {
    return lastAccessedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastAccessedAt(Integer lastAccessedAt) {
    this.lastAccessedAt = lastAccessedAt;
  }


  public Usersession device(String device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDevice(String device) {
    this.device = device;
  }


  public Usersession location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocation(String location) {
    this.location = location;
  }


  public Usersession ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public Usersession userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usersession usersession = (Usersession) o;
    return Objects.equals(this.browser, usersession.browser) &&
        Objects.equals(this.lastAccessedAt, usersession.lastAccessedAt) &&
        Objects.equals(this.device, usersession.device) &&
        Objects.equals(this.location, usersession.location) &&
        Objects.equals(this.ip, usersession.ip) &&
        Objects.equals(this.userAgent, usersession.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browser, lastAccessedAt, device, location, ip, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usersession {\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    lastAccessedAt: ").append(toIndentedString(lastAccessedAt)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
