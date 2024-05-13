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
 * IndexPhpMethodLiveGetCountersPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_LAST_MINUTES,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_SEGMENT,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_SHOW_COLUMNS,
  IndexPhpMethodLiveGetCountersPostRequest.JSON_PROPERTY_HIDE_COLUMNS
})
@JsonTypeName("_index_php_method_Live_getCounters_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodLiveGetCountersPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_MINUTES = "lastMinutes";
  private JsonNullable<Object> lastMinutes = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SEGMENT = "segment";
  private JsonNullable<Object> segment = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SHOW_COLUMNS = "showColumns";
  private JsonNullable<Object> showColumns = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HIDE_COLUMNS = "hideColumns";
  private JsonNullable<Object> hideColumns = JsonNullable.<Object>of(null);

  public IndexPhpMethodLiveGetCountersPostRequest() {
  }

  public IndexPhpMethodLiveGetCountersPostRequest module(Object module) {
    
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


  public IndexPhpMethodLiveGetCountersPostRequest format(Object format) {
    
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


  public IndexPhpMethodLiveGetCountersPostRequest method(Object method) {
    
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


  public IndexPhpMethodLiveGetCountersPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodLiveGetCountersPostRequest lastMinutes(Object lastMinutes) {
    this.lastMinutes = JsonNullable.<Object>of(lastMinutes);
    
    return this;
  }

   /**
   * Get lastMinutes
   * @return lastMinutes
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastMinutes() {
        return lastMinutes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastMinutes_JsonNullable() {
    return lastMinutes;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_MINUTES)
  public void setLastMinutes_JsonNullable(JsonNullable<Object> lastMinutes) {
    this.lastMinutes = lastMinutes;
  }

  public void setLastMinutes(Object lastMinutes) {
    this.lastMinutes = JsonNullable.<Object>of(lastMinutes);
  }


  public IndexPhpMethodLiveGetCountersPostRequest segment(Object segment) {
    this.segment = JsonNullable.<Object>of(segment);
    
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSegment() {
        return segment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSegment_JsonNullable() {
    return segment;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT)
  public void setSegment_JsonNullable(JsonNullable<Object> segment) {
    this.segment = segment;
  }

  public void setSegment(Object segment) {
    this.segment = JsonNullable.<Object>of(segment);
  }


  public IndexPhpMethodLiveGetCountersPostRequest showColumns(Object showColumns) {
    this.showColumns = JsonNullable.<Object>of(showColumns);
    
    return this;
  }

   /**
   * Get showColumns
   * @return showColumns
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getShowColumns() {
        return showColumns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOW_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getShowColumns_JsonNullable() {
    return showColumns;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOW_COLUMNS)
  public void setShowColumns_JsonNullable(JsonNullable<Object> showColumns) {
    this.showColumns = showColumns;
  }

  public void setShowColumns(Object showColumns) {
    this.showColumns = JsonNullable.<Object>of(showColumns);
  }


  public IndexPhpMethodLiveGetCountersPostRequest hideColumns(Object hideColumns) {
    this.hideColumns = JsonNullable.<Object>of(hideColumns);
    
    return this;
  }

   /**
   * Get hideColumns
   * @return hideColumns
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHideColumns() {
        return hideColumns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIDE_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHideColumns_JsonNullable() {
    return hideColumns;
  }
  
  @JsonProperty(JSON_PROPERTY_HIDE_COLUMNS)
  public void setHideColumns_JsonNullable(JsonNullable<Object> hideColumns) {
    this.hideColumns = hideColumns;
  }

  public void setHideColumns(Object hideColumns) {
    this.hideColumns = JsonNullable.<Object>of(hideColumns);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodLiveGetCountersPostRequest indexPhpMethodLiveGetCountersPostRequest = (IndexPhpMethodLiveGetCountersPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodLiveGetCountersPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodLiveGetCountersPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodLiveGetCountersPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodLiveGetCountersPostRequest.idSite) &&
        equalsNullable(this.lastMinutes, indexPhpMethodLiveGetCountersPostRequest.lastMinutes) &&
        equalsNullable(this.segment, indexPhpMethodLiveGetCountersPostRequest.segment) &&
        equalsNullable(this.showColumns, indexPhpMethodLiveGetCountersPostRequest.showColumns) &&
        equalsNullable(this.hideColumns, indexPhpMethodLiveGetCountersPostRequest.hideColumns);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(lastMinutes), hashCodeNullable(segment), hashCodeNullable(showColumns), hashCodeNullable(hideColumns));
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
    sb.append("class IndexPhpMethodLiveGetCountersPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    lastMinutes: ").append(toIndentedString(lastMinutes)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    showColumns: ").append(toIndentedString(showColumns)).append("\n");
    sb.append("    hideColumns: ").append(toIndentedString(hideColumns)).append("\n");
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

