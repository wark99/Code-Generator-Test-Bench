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
 * IndexPhpMethodTagManagerUpdateContainerVariablePostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_ID_CONTAINER,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_ID_CONTAINER_VERSION,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_ID_VARIABLE,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_NAME,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_PARAMETERS,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_DEFAULT_VALUE,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_LOOKUP_TABLE,
  IndexPhpMethodTagManagerUpdateContainerVariablePostRequest.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("_index_php_method_TagManager_updateContainerVariable_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodTagManagerUpdateContainerVariablePostRequest {
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

  public static final String JSON_PROPERTY_ID_VARIABLE = "idVariable";
  private JsonNullable<Object> idVariable = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private JsonNullable<Object> parameters = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private JsonNullable<Object> defaultValue = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LOOKUP_TABLE = "lookupTable";
  private JsonNullable<Object> lookupTable = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Object> description = JsonNullable.<Object>of(null);

  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest() {
  }

  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest module(Object module) {
    
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest format(Object format) {
    
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest method(Object method) {
    
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest idSite(Object idSite) {
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest idContainer(Object idContainer) {
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest idContainerVersion(Object idContainerVersion) {
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest idVariable(Object idVariable) {
    this.idVariable = JsonNullable.<Object>of(idVariable);
    
    return this;
  }

   /**
   * Get idVariable
   * @return idVariable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdVariable() {
        return idVariable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_VARIABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdVariable_JsonNullable() {
    return idVariable;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_VARIABLE)
  public void setIdVariable_JsonNullable(JsonNullable<Object> idVariable) {
    this.idVariable = idVariable;
  }

  public void setIdVariable(Object idVariable) {
    this.idVariable = JsonNullable.<Object>of(idVariable);
  }


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest name(Object name) {
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


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest parameters(Object parameters) {
    this.parameters = JsonNullable.<Object>of(parameters);
    
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getParameters() {
        return parameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getParameters_JsonNullable() {
    return parameters;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  public void setParameters_JsonNullable(JsonNullable<Object> parameters) {
    this.parameters = parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = JsonNullable.<Object>of(parameters);
  }


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest defaultValue(Object defaultValue) {
    this.defaultValue = JsonNullable.<Object>of(defaultValue);
    
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultValue() {
        return defaultValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultValue_JsonNullable() {
    return defaultValue;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  public void setDefaultValue_JsonNullable(JsonNullable<Object> defaultValue) {
    this.defaultValue = defaultValue;
  }

  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = JsonNullable.<Object>of(defaultValue);
  }


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest lookupTable(Object lookupTable) {
    this.lookupTable = JsonNullable.<Object>of(lookupTable);
    
    return this;
  }

   /**
   * Get lookupTable
   * @return lookupTable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLookupTable() {
        return lookupTable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOOKUP_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLookupTable_JsonNullable() {
    return lookupTable;
  }
  
  @JsonProperty(JSON_PROPERTY_LOOKUP_TABLE)
  public void setLookupTable_JsonNullable(JsonNullable<Object> lookupTable) {
    this.lookupTable = lookupTable;
  }

  public void setLookupTable(Object lookupTable) {
    this.lookupTable = JsonNullable.<Object>of(lookupTable);
  }


  public IndexPhpMethodTagManagerUpdateContainerVariablePostRequest description(Object description) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodTagManagerUpdateContainerVariablePostRequest indexPhpMethodTagManagerUpdateContainerVariablePostRequest = (IndexPhpMethodTagManagerUpdateContainerVariablePostRequest) o;
    return Objects.equals(this.module, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.idSite) &&
        equalsNullable(this.idContainer, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.idContainer) &&
        equalsNullable(this.idContainerVersion, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.idContainerVersion) &&
        equalsNullable(this.idVariable, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.idVariable) &&
        equalsNullable(this.name, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.name) &&
        equalsNullable(this.parameters, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.parameters) &&
        equalsNullable(this.defaultValue, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.defaultValue) &&
        equalsNullable(this.lookupTable, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.lookupTable) &&
        equalsNullable(this.description, indexPhpMethodTagManagerUpdateContainerVariablePostRequest.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(idContainer), hashCodeNullable(idContainerVersion), hashCodeNullable(idVariable), hashCodeNullable(name), hashCodeNullable(parameters), hashCodeNullable(defaultValue), hashCodeNullable(lookupTable), hashCodeNullable(description));
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
    sb.append("class IndexPhpMethodTagManagerUpdateContainerVariablePostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    idContainer: ").append(toIndentedString(idContainer)).append("\n");
    sb.append("    idContainerVersion: ").append(toIndentedString(idContainerVersion)).append("\n");
    sb.append("    idVariable: ").append(toIndentedString(idVariable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    lookupTable: ").append(toIndentedString(lookupTable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

