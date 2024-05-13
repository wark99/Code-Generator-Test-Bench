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
 * IndexPhpMethodSitesManagerGetIpsForRangePostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodSitesManagerGetIpsForRangePostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodSitesManagerGetIpsForRangePostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodSitesManagerGetIpsForRangePostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodSitesManagerGetIpsForRangePostRequest.JSON_PROPERTY_IP_RANGE
})
@JsonTypeName("_index_php_method_SitesManager_getIpsForRange_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodSitesManagerGetIpsForRangePostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_IP_RANGE = "ipRange";
  private JsonNullable<Object> ipRange = JsonNullable.<Object>of(null);

  public IndexPhpMethodSitesManagerGetIpsForRangePostRequest() {
  }

  public IndexPhpMethodSitesManagerGetIpsForRangePostRequest module(Object module) {
    
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


  public IndexPhpMethodSitesManagerGetIpsForRangePostRequest format(Object format) {
    
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


  public IndexPhpMethodSitesManagerGetIpsForRangePostRequest method(Object method) {
    
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


  public IndexPhpMethodSitesManagerGetIpsForRangePostRequest ipRange(Object ipRange) {
    this.ipRange = JsonNullable.<Object>of(ipRange);
    
    return this;
  }

   /**
   * Get ipRange
   * @return ipRange
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIpRange() {
        return ipRange.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IP_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIpRange_JsonNullable() {
    return ipRange;
  }
  
  @JsonProperty(JSON_PROPERTY_IP_RANGE)
  public void setIpRange_JsonNullable(JsonNullable<Object> ipRange) {
    this.ipRange = ipRange;
  }

  public void setIpRange(Object ipRange) {
    this.ipRange = JsonNullable.<Object>of(ipRange);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodSitesManagerGetIpsForRangePostRequest indexPhpMethodSitesManagerGetIpsForRangePostRequest = (IndexPhpMethodSitesManagerGetIpsForRangePostRequest) o;
    return Objects.equals(this.module, indexPhpMethodSitesManagerGetIpsForRangePostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodSitesManagerGetIpsForRangePostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodSitesManagerGetIpsForRangePostRequest.method) &&
        equalsNullable(this.ipRange, indexPhpMethodSitesManagerGetIpsForRangePostRequest.ipRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(ipRange));
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
    sb.append("class IndexPhpMethodSitesManagerGetIpsForRangePostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
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

