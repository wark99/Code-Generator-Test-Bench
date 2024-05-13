/*
 * Matomo API
 * Complete Matomo reporting API documentation
 *
 * The version of the OpenAPI document: 5.0.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.JSON_PROPERTY_LOGIN,
  IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.JSON_PROPERTY_USE12_HOUR_CLOCK
})
@JsonTypeName("_index_php_method_LanguagesManager_set12HourClockForUser_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private JsonNullable<Object> login = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USE12_HOUR_CLOCK = "use12HourClock";
  private JsonNullable<Object> use12HourClock = JsonNullable.<Object>of(null);

  public IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest() {
  }

  public IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest module(Object module) {
    
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getModule() {
    return module;
  }


  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModule(Object module) {
    this.module = module;
  }


  public IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest format(Object format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormat(Object format) {
    this.format = format;
  }


  public IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest method(Object method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMethod(Object method) {
    this.method = method;
  }


  public IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest login(Object login) {
    this.login = JsonNullable.<Object>of(login);
    
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLogin() {
        return login.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLogin_JsonNullable() {
    return login;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGIN)
  public void setLogin_JsonNullable(JsonNullable<Object> login) {
    this.login = login;
  }

  public void setLogin(Object login) {
    this.login = JsonNullable.<Object>of(login);
  }


  public IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest use12HourClock(Object use12HourClock) {
    this.use12HourClock = JsonNullable.<Object>of(use12HourClock);
    
    return this;
  }

   /**
   * Get use12HourClock
   * @return use12HourClock
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUse12HourClock() {
        return use12HourClock.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USE12_HOUR_CLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUse12HourClock_JsonNullable() {
    return use12HourClock;
  }
  
  @JsonProperty(JSON_PROPERTY_USE12_HOUR_CLOCK)
  public void setUse12HourClock_JsonNullable(JsonNullable<Object> use12HourClock) {
    this.use12HourClock = use12HourClock;
  }

  public void setUse12HourClock(Object use12HourClock) {
    this.use12HourClock = JsonNullable.<Object>of(use12HourClock);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest = (IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.method) &&
        equalsNullable(this.login, indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.login) &&
        equalsNullable(this.use12HourClock, indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.use12HourClock);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(login), hashCodeNullable(use12HourClock));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    use12HourClock: ").append(toIndentedString(use12HourClock)).append("\n");
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

