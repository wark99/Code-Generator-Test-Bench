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
 * IndexPhpMethodAPIIsPluginActivatedPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodAPIIsPluginActivatedPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodAPIIsPluginActivatedPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodAPIIsPluginActivatedPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodAPIIsPluginActivatedPostRequest.JSON_PROPERTY_PLUGIN_NAME
})
@JsonTypeName("_index_php_method_API_isPluginActivated_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodAPIIsPluginActivatedPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_PLUGIN_NAME = "pluginName";
  private JsonNullable<Object> pluginName = JsonNullable.<Object>of(null);

  public IndexPhpMethodAPIIsPluginActivatedPostRequest() {
  }

  public IndexPhpMethodAPIIsPluginActivatedPostRequest module(Object module) {
    
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


  public IndexPhpMethodAPIIsPluginActivatedPostRequest format(Object format) {
    
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


  public IndexPhpMethodAPIIsPluginActivatedPostRequest method(Object method) {
    
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


  public IndexPhpMethodAPIIsPluginActivatedPostRequest pluginName(Object pluginName) {
    this.pluginName = JsonNullable.<Object>of(pluginName);
    
    return this;
  }

   /**
   * Get pluginName
   * @return pluginName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPluginName() {
        return pluginName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLUGIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPluginName_JsonNullable() {
    return pluginName;
  }
  
  @JsonProperty(JSON_PROPERTY_PLUGIN_NAME)
  public void setPluginName_JsonNullable(JsonNullable<Object> pluginName) {
    this.pluginName = pluginName;
  }

  public void setPluginName(Object pluginName) {
    this.pluginName = JsonNullable.<Object>of(pluginName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodAPIIsPluginActivatedPostRequest indexPhpMethodAPIIsPluginActivatedPostRequest = (IndexPhpMethodAPIIsPluginActivatedPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodAPIIsPluginActivatedPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodAPIIsPluginActivatedPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodAPIIsPluginActivatedPostRequest.method) &&
        equalsNullable(this.pluginName, indexPhpMethodAPIIsPluginActivatedPostRequest.pluginName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(pluginName));
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
    sb.append("class IndexPhpMethodAPIIsPluginActivatedPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
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

