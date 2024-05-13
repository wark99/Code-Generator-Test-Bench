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
 * IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_ID_CONTAINER,
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_ID_CONTAINER_VERSION,
  IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.JSON_PROPERTY_ID_TRIGGER
})
@JsonTypeName("_index_php_method_TagManager_getContainerTriggerReferences_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_CONTAINER = "idContainer";
  private JsonNullable<Object> idContainer = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_CONTAINER_VERSION = "idContainerVersion";
  private JsonNullable<Object> idContainerVersion = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_TRIGGER = "idTrigger";
  private JsonNullable<Object> idTrigger = JsonNullable.<Object>of(null);

  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest() {
  }

  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest module(Object module) {
    
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


  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest format(Object format) {
    
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


  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest method(Object method) {
    
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


  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest idContainer(Object idContainer) {
    this.idContainer = JsonNullable.<Object>of(idContainer);
    
    return this;
  }

   /**
   * Get idContainer
   * @return idContainer
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdContainer() {
        return idContainer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdContainer_JsonNullable() {
    return idContainer;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_CONTAINER)
  public void setIdContainer_JsonNullable(JsonNullable<Object> idContainer) {
    this.idContainer = idContainer;
  }

  public void setIdContainer(Object idContainer) {
    this.idContainer = JsonNullable.<Object>of(idContainer);
  }


  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest idContainerVersion(Object idContainerVersion) {
    this.idContainerVersion = JsonNullable.<Object>of(idContainerVersion);
    
    return this;
  }

   /**
   * Get idContainerVersion
   * @return idContainerVersion
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdContainerVersion() {
        return idContainerVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_CONTAINER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdContainerVersion_JsonNullable() {
    return idContainerVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_CONTAINER_VERSION)
  public void setIdContainerVersion_JsonNullable(JsonNullable<Object> idContainerVersion) {
    this.idContainerVersion = idContainerVersion;
  }

  public void setIdContainerVersion(Object idContainerVersion) {
    this.idContainerVersion = JsonNullable.<Object>of(idContainerVersion);
  }


  public IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest idTrigger(Object idTrigger) {
    this.idTrigger = JsonNullable.<Object>of(idTrigger);
    
    return this;
  }

   /**
   * Get idTrigger
   * @return idTrigger
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdTrigger() {
        return idTrigger.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdTrigger_JsonNullable() {
    return idTrigger;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_TRIGGER)
  public void setIdTrigger_JsonNullable(JsonNullable<Object> idTrigger) {
    this.idTrigger = idTrigger;
  }

  public void setIdTrigger(Object idTrigger) {
    this.idTrigger = JsonNullable.<Object>of(idTrigger);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest = (IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.idSite) &&
        equalsNullable(this.idContainer, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.idContainer) &&
        equalsNullable(this.idContainerVersion, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.idContainerVersion) &&
        equalsNullable(this.idTrigger, indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest.idTrigger);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(idContainer), hashCodeNullable(idContainerVersion), hashCodeNullable(idTrigger));
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
    sb.append("class IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    idContainer: ").append(toIndentedString(idContainer)).append("\n");
    sb.append("    idContainerVersion: ").append(toIndentedString(idContainerVersion)).append("\n");
    sb.append("    idTrigger: ").append(toIndentedString(idTrigger)).append("\n");
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

