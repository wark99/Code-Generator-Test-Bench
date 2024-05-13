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
 * IndexPhpMethodSitesManagerGetTimezoneNamePostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodSitesManagerGetTimezoneNamePostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodSitesManagerGetTimezoneNamePostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodSitesManagerGetTimezoneNamePostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodSitesManagerGetTimezoneNamePostRequest.JSON_PROPERTY_TIMEZONE,
  IndexPhpMethodSitesManagerGetTimezoneNamePostRequest.JSON_PROPERTY_COUNTRY_CODE,
  IndexPhpMethodSitesManagerGetTimezoneNamePostRequest.JSON_PROPERTY_MULTIPLE_TIMEZONES_IN_COUNTRY
})
@JsonTypeName("_index_php_method_SitesManager_getTimezoneName_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodSitesManagerGetTimezoneNamePostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private JsonNullable<Object> timezone = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private JsonNullable<Object> countryCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MULTIPLE_TIMEZONES_IN_COUNTRY = "multipleTimezonesInCountry";
  private JsonNullable<Object> multipleTimezonesInCountry = JsonNullable.<Object>of(null);

  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest() {
  }

  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest module(Object module) {
    
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


  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest format(Object format) {
    
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


  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest method(Object method) {
    
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


  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest timezone(Object timezone) {
    this.timezone = JsonNullable.<Object>of(timezone);
    
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTimezone() {
        return timezone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTimezone_JsonNullable() {
    return timezone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  public void setTimezone_JsonNullable(JsonNullable<Object> timezone) {
    this.timezone = timezone;
  }

  public void setTimezone(Object timezone) {
    this.timezone = JsonNullable.<Object>of(timezone);
  }


  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest countryCode(Object countryCode) {
    this.countryCode = JsonNullable.<Object>of(countryCode);
    
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCountryCode() {
        return countryCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCountryCode_JsonNullable() {
    return countryCode;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  public void setCountryCode_JsonNullable(JsonNullable<Object> countryCode) {
    this.countryCode = countryCode;
  }

  public void setCountryCode(Object countryCode) {
    this.countryCode = JsonNullable.<Object>of(countryCode);
  }


  public IndexPhpMethodSitesManagerGetTimezoneNamePostRequest multipleTimezonesInCountry(Object multipleTimezonesInCountry) {
    this.multipleTimezonesInCountry = JsonNullable.<Object>of(multipleTimezonesInCountry);
    
    return this;
  }

   /**
   * Get multipleTimezonesInCountry
   * @return multipleTimezonesInCountry
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMultipleTimezonesInCountry() {
        return multipleTimezonesInCountry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MULTIPLE_TIMEZONES_IN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMultipleTimezonesInCountry_JsonNullable() {
    return multipleTimezonesInCountry;
  }
  
  @JsonProperty(JSON_PROPERTY_MULTIPLE_TIMEZONES_IN_COUNTRY)
  public void setMultipleTimezonesInCountry_JsonNullable(JsonNullable<Object> multipleTimezonesInCountry) {
    this.multipleTimezonesInCountry = multipleTimezonesInCountry;
  }

  public void setMultipleTimezonesInCountry(Object multipleTimezonesInCountry) {
    this.multipleTimezonesInCountry = JsonNullable.<Object>of(multipleTimezonesInCountry);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodSitesManagerGetTimezoneNamePostRequest indexPhpMethodSitesManagerGetTimezoneNamePostRequest = (IndexPhpMethodSitesManagerGetTimezoneNamePostRequest) o;
    return Objects.equals(this.module, indexPhpMethodSitesManagerGetTimezoneNamePostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodSitesManagerGetTimezoneNamePostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodSitesManagerGetTimezoneNamePostRequest.method) &&
        equalsNullable(this.timezone, indexPhpMethodSitesManagerGetTimezoneNamePostRequest.timezone) &&
        equalsNullable(this.countryCode, indexPhpMethodSitesManagerGetTimezoneNamePostRequest.countryCode) &&
        equalsNullable(this.multipleTimezonesInCountry, indexPhpMethodSitesManagerGetTimezoneNamePostRequest.multipleTimezonesInCountry);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(timezone), hashCodeNullable(countryCode), hashCodeNullable(multipleTimezonesInCountry));
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
    sb.append("class IndexPhpMethodSitesManagerGetTimezoneNamePostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    multipleTimezonesInCountry: ").append(toIndentedString(multipleTimezonesInCountry)).append("\n");
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

