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
 * IndexPhpMethodActionsGetEntryPageUrlsPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_PERIOD,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_DATE,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_SEGMENT,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_EXPANDED,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_ID_SUBTABLE,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_FLAT,
  IndexPhpMethodActionsGetEntryPageUrlsPostRequest.JSON_PROPERTY_FORMAT_METRICS
})
@JsonTypeName("_index_php_method_Actions_getEntryPageUrls_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodActionsGetEntryPageUrlsPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PERIOD = "period";
  private JsonNullable<Object> period = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<Object> date = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SEGMENT = "segment";
  private JsonNullable<Object> segment = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EXPANDED = "expanded";
  private JsonNullable<Object> expanded = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_SUBTABLE = "idSubtable";
  private JsonNullable<Object> idSubtable = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FLAT = "flat";
  private JsonNullable<Object> flat = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FORMAT_METRICS = "format_metrics";
  private JsonNullable<Object> formatMetrics = JsonNullable.<Object>of(null);

  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest() {
  }

  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest module(Object module) {
    
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


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest format(Object format) {
    
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


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest method(Object method) {
    
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


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest period(Object period) {
    this.period = JsonNullable.<Object>of(period);
    
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPeriod() {
        return period.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPeriod_JsonNullable() {
    return period;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIOD)
  public void setPeriod_JsonNullable(JsonNullable<Object> period) {
    this.period = period;
  }

  public void setPeriod(Object period) {
    this.period = JsonNullable.<Object>of(period);
  }


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest date(Object date) {
    this.date = JsonNullable.<Object>of(date);
    
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<Object> date) {
    this.date = date;
  }

  public void setDate(Object date) {
    this.date = JsonNullable.<Object>of(date);
  }


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest segment(Object segment) {
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


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest expanded(Object expanded) {
    this.expanded = JsonNullable.<Object>of(expanded);
    
    return this;
  }

   /**
   * Get expanded
   * @return expanded
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getExpanded() {
        return expanded.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPANDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getExpanded_JsonNullable() {
    return expanded;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPANDED)
  public void setExpanded_JsonNullable(JsonNullable<Object> expanded) {
    this.expanded = expanded;
  }

  public void setExpanded(Object expanded) {
    this.expanded = JsonNullable.<Object>of(expanded);
  }


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest idSubtable(Object idSubtable) {
    this.idSubtable = JsonNullable.<Object>of(idSubtable);
    
    return this;
  }

   /**
   * Get idSubtable
   * @return idSubtable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdSubtable() {
        return idSubtable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_SUBTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdSubtable_JsonNullable() {
    return idSubtable;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_SUBTABLE)
  public void setIdSubtable_JsonNullable(JsonNullable<Object> idSubtable) {
    this.idSubtable = idSubtable;
  }

  public void setIdSubtable(Object idSubtable) {
    this.idSubtable = JsonNullable.<Object>of(idSubtable);
  }


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest flat(Object flat) {
    this.flat = JsonNullable.<Object>of(flat);
    
    return this;
  }

   /**
   * Get flat
   * @return flat
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFlat() {
        return flat.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FLAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFlat_JsonNullable() {
    return flat;
  }
  
  @JsonProperty(JSON_PROPERTY_FLAT)
  public void setFlat_JsonNullable(JsonNullable<Object> flat) {
    this.flat = flat;
  }

  public void setFlat(Object flat) {
    this.flat = JsonNullable.<Object>of(flat);
  }


  public IndexPhpMethodActionsGetEntryPageUrlsPostRequest formatMetrics(Object formatMetrics) {
    this.formatMetrics = JsonNullable.<Object>of(formatMetrics);
    
    return this;
  }

   /**
   * Get formatMetrics
   * @return formatMetrics
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFormatMetrics() {
        return formatMetrics.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMAT_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFormatMetrics_JsonNullable() {
    return formatMetrics;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMAT_METRICS)
  public void setFormatMetrics_JsonNullable(JsonNullable<Object> formatMetrics) {
    this.formatMetrics = formatMetrics;
  }

  public void setFormatMetrics(Object formatMetrics) {
    this.formatMetrics = JsonNullable.<Object>of(formatMetrics);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = (IndexPhpMethodActionsGetEntryPageUrlsPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodActionsGetEntryPageUrlsPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodActionsGetEntryPageUrlsPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodActionsGetEntryPageUrlsPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodActionsGetEntryPageUrlsPostRequest.idSite) &&
        equalsNullable(this.period, indexPhpMethodActionsGetEntryPageUrlsPostRequest.period) &&
        equalsNullable(this.date, indexPhpMethodActionsGetEntryPageUrlsPostRequest.date) &&
        equalsNullable(this.segment, indexPhpMethodActionsGetEntryPageUrlsPostRequest.segment) &&
        equalsNullable(this.expanded, indexPhpMethodActionsGetEntryPageUrlsPostRequest.expanded) &&
        equalsNullable(this.idSubtable, indexPhpMethodActionsGetEntryPageUrlsPostRequest.idSubtable) &&
        equalsNullable(this.flat, indexPhpMethodActionsGetEntryPageUrlsPostRequest.flat) &&
        equalsNullable(this.formatMetrics, indexPhpMethodActionsGetEntryPageUrlsPostRequest.formatMetrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(period), hashCodeNullable(date), hashCodeNullable(segment), hashCodeNullable(expanded), hashCodeNullable(idSubtable), hashCodeNullable(flat), hashCodeNullable(formatMetrics));
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
    sb.append("class IndexPhpMethodActionsGetEntryPageUrlsPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    expanded: ").append(toIndentedString(expanded)).append("\n");
    sb.append("    idSubtable: ").append(toIndentedString(idSubtable)).append("\n");
    sb.append("    flat: ").append(toIndentedString(flat)).append("\n");
    sb.append("    formatMetrics: ").append(toIndentedString(formatMetrics)).append("\n");
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

