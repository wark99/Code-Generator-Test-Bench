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
 * IndexPhpMethodTagManagerCreateContainerVersionPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_ID_CONTAINER,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_NAME,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_DESCRIPTION,
  IndexPhpMethodTagManagerCreateContainerVersionPostRequest.JSON_PROPERTY_ID_CONTAINER_VERSION
})
@JsonTypeName("_index_php_method_TagManager_createContainerVersion_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodTagManagerCreateContainerVersionPostRequest {
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

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Object> description = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_CONTAINER_VERSION = "idContainerVersion";
  private JsonNullable<Object> idContainerVersion = JsonNullable.<Object>of(null);

  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest() {
  }

  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest module(Object module) {
    
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


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest format(Object format) {
    
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


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest method(Object method) {
    
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


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest idContainer(Object idContainer) {
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


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<Object> name) {
    this.name = name;
  }

  public void setName(Object name) {
    this.name = JsonNullable.<Object>of(name);
  }


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest description(Object description) {
    this.description = JsonNullable.<Object>of(description);
    
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<Object> description) {
    this.description = description;
  }

  public void setDescription(Object description) {
    this.description = JsonNullable.<Object>of(description);
  }


  public IndexPhpMethodTagManagerCreateContainerVersionPostRequest idContainerVersion(Object idContainerVersion) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodTagManagerCreateContainerVersionPostRequest indexPhpMethodTagManagerCreateContainerVersionPostRequest = (IndexPhpMethodTagManagerCreateContainerVersionPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodTagManagerCreateContainerVersionPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodTagManagerCreateContainerVersionPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodTagManagerCreateContainerVersionPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodTagManagerCreateContainerVersionPostRequest.idSite) &&
        equalsNullable(this.idContainer, indexPhpMethodTagManagerCreateContainerVersionPostRequest.idContainer) &&
        equalsNullable(this.name, indexPhpMethodTagManagerCreateContainerVersionPostRequest.name) &&
        equalsNullable(this.description, indexPhpMethodTagManagerCreateContainerVersionPostRequest.description) &&
        equalsNullable(this.idContainerVersion, indexPhpMethodTagManagerCreateContainerVersionPostRequest.idContainerVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(idContainer), hashCodeNullable(name), hashCodeNullable(description), hashCodeNullable(idContainerVersion));
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
    sb.append("class IndexPhpMethodTagManagerCreateContainerVersionPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    idContainer: ").append(toIndentedString(idContainer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idContainerVersion: ").append(toIndentedString(idContainerVersion)).append("\n");
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

