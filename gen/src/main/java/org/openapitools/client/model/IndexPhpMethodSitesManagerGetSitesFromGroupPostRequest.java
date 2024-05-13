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
 * IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest.JSON_PROPERTY_GROUP
})
@JsonTypeName("_index_php_method_SitesManager_getSitesFromGroup_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private JsonNullable<Object> group = JsonNullable.<Object>of(null);

  public IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest() {
  }

  public IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest module(Object module) {
    
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


  public IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest format(Object format) {
    
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


  public IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest method(Object method) {
    
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


  public IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest group(Object group) {
    this.group = JsonNullable.<Object>of(group);
    
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getGroup() {
        return group.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGroup_JsonNullable() {
    return group;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP)
  public void setGroup_JsonNullable(JsonNullable<Object> group) {
    this.group = group;
  }

  public void setGroup(Object group) {
    this.group = JsonNullable.<Object>of(group);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest indexPhpMethodSitesManagerGetSitesFromGroupPostRequest = (IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodSitesManagerGetSitesFromGroupPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodSitesManagerGetSitesFromGroupPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodSitesManagerGetSitesFromGroupPostRequest.method) &&
        equalsNullable(this.group, indexPhpMethodSitesManagerGetSitesFromGroupPostRequest.group);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(group));
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
    sb.append("class IndexPhpMethodSitesManagerGetSitesFromGroupPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

