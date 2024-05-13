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
 * IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest.JSON_PROPERTY_SKIP_CATEGORY_METADATA
})
@JsonTypeName("_index_php_method_CustomReports_getConfiguredReports_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SKIP_CATEGORY_METADATA = "skipCategoryMetadata";
  private JsonNullable<Object> skipCategoryMetadata = JsonNullable.<Object>of(null);

  public IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest() {
  }

  public IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest module(Object module) {
    
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


  public IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest format(Object format) {
    
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


  public IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest method(Object method) {
    
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


  public IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest idSite(Object idSite) {
    this.idSite = JsonNullable.<Object>of(idSite);
    
    return this;
  }

   /**
   * Get idSite
   * @return idSite
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdSite() {
        return idSite.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdSite_JsonNullable() {
    return idSite;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_SITE)
  public void setIdSite_JsonNullable(JsonNullable<Object> idSite) {
    this.idSite = idSite;
  }

  public void setIdSite(Object idSite) {
    this.idSite = JsonNullable.<Object>of(idSite);
  }


  public IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest skipCategoryMetadata(Object skipCategoryMetadata) {
    this.skipCategoryMetadata = JsonNullable.<Object>of(skipCategoryMetadata);
    
    return this;
  }

   /**
   * Get skipCategoryMetadata
   * @return skipCategoryMetadata
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSkipCategoryMetadata() {
        return skipCategoryMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIP_CATEGORY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSkipCategoryMetadata_JsonNullable() {
    return skipCategoryMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_SKIP_CATEGORY_METADATA)
  public void setSkipCategoryMetadata_JsonNullable(JsonNullable<Object> skipCategoryMetadata) {
    this.skipCategoryMetadata = skipCategoryMetadata;
  }

  public void setSkipCategoryMetadata(Object skipCategoryMetadata) {
    this.skipCategoryMetadata = JsonNullable.<Object>of(skipCategoryMetadata);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest indexPhpMethodCustomReportsGetConfiguredReportsPostRequest = (IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodCustomReportsGetConfiguredReportsPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodCustomReportsGetConfiguredReportsPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodCustomReportsGetConfiguredReportsPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodCustomReportsGetConfiguredReportsPostRequest.idSite) &&
        equalsNullable(this.skipCategoryMetadata, indexPhpMethodCustomReportsGetConfiguredReportsPostRequest.skipCategoryMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(skipCategoryMetadata));
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
    sb.append("class IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    skipCategoryMetadata: ").append(toIndentedString(skipCategoryMetadata)).append("\n");
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

