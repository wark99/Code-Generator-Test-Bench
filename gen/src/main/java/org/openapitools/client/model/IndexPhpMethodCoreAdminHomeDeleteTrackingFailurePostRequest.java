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
 * IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.JSON_PROPERTY_ID_FAILURE
})
@JsonTypeName("_index_php_method_CoreAdminHome_deleteTrackingFailure_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_FAILURE = "idFailure";
  private JsonNullable<Object> idFailure = JsonNullable.<Object>of(null);

  public IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest() {
  }

  public IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest module(Object module) {
    
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


  public IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest format(Object format) {
    
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


  public IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest method(Object method) {
    
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


  public IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest idSite(Object idSite) {
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


  public IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest idFailure(Object idFailure) {
    this.idFailure = JsonNullable.<Object>of(idFailure);
    
    return this;
  }

   /**
   * Get idFailure
   * @return idFailure
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdFailure() {
        return idFailure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdFailure_JsonNullable() {
    return idFailure;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_FAILURE)
  public void setIdFailure_JsonNullable(JsonNullable<Object> idFailure) {
    this.idFailure = idFailure;
  }

  public void setIdFailure(Object idFailure) {
    this.idFailure = JsonNullable.<Object>of(idFailure);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest = (IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest) o;
    return Objects.equals(this.module, indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.idSite) &&
        equalsNullable(this.idFailure, indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.idFailure);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(idFailure));
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
    sb.append("class IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    idFailure: ").append(toIndentedString(idFailure)).append("\n");
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

