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
 * IndexPhpMethodLiveGetLastVisitsDetailsPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_PERIOD,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_DATE,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_SEGMENT,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_COUNT_VISITORS_TO_FETCH,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_MIN_TIMESTAMP,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_FLAT,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_DO_NOT_FETCH_ACTIONS,
  IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.JSON_PROPERTY_ENHANCED
})
@JsonTypeName("_index_php_method_Live_getLastVisitsDetails_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodLiveGetLastVisitsDetailsPostRequest {
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

  public static final String JSON_PROPERTY_COUNT_VISITORS_TO_FETCH = "countVisitorsToFetch";
  private JsonNullable<Object> countVisitorsToFetch = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MIN_TIMESTAMP = "minTimestamp";
  private JsonNullable<Object> minTimestamp = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FLAT = "flat";
  private JsonNullable<Object> flat = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DO_NOT_FETCH_ACTIONS = "doNotFetchActions";
  private JsonNullable<Object> doNotFetchActions = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ENHANCED = "enhanced";
  private JsonNullable<Object> enhanced = JsonNullable.<Object>of(null);

  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest() {
  }

  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest module(Object module) {
    
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest format(Object format) {
    
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest method(Object method) {
    
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest period(Object period) {
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest date(Object date) {
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest segment(Object segment) {
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest countVisitorsToFetch(Object countVisitorsToFetch) {
    this.countVisitorsToFetch = JsonNullable.<Object>of(countVisitorsToFetch);
    
    return this;
  }

   /**
   * Get countVisitorsToFetch
   * @return countVisitorsToFetch
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCountVisitorsToFetch() {
        return countVisitorsToFetch.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_VISITORS_TO_FETCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCountVisitorsToFetch_JsonNullable() {
    return countVisitorsToFetch;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_VISITORS_TO_FETCH)
  public void setCountVisitorsToFetch_JsonNullable(JsonNullable<Object> countVisitorsToFetch) {
    this.countVisitorsToFetch = countVisitorsToFetch;
  }

  public void setCountVisitorsToFetch(Object countVisitorsToFetch) {
    this.countVisitorsToFetch = JsonNullable.<Object>of(countVisitorsToFetch);
  }


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest minTimestamp(Object minTimestamp) {
    this.minTimestamp = JsonNullable.<Object>of(minTimestamp);
    
    return this;
  }

   /**
   * Get minTimestamp
   * @return minTimestamp
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMinTimestamp() {
        return minTimestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMinTimestamp_JsonNullable() {
    return minTimestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_MIN_TIMESTAMP)
  public void setMinTimestamp_JsonNullable(JsonNullable<Object> minTimestamp) {
    this.minTimestamp = minTimestamp;
  }

  public void setMinTimestamp(Object minTimestamp) {
    this.minTimestamp = JsonNullable.<Object>of(minTimestamp);
  }


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest flat(Object flat) {
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


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest doNotFetchActions(Object doNotFetchActions) {
    this.doNotFetchActions = JsonNullable.<Object>of(doNotFetchActions);
    
    return this;
  }

   /**
   * Get doNotFetchActions
   * @return doNotFetchActions
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDoNotFetchActions() {
        return doNotFetchActions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DO_NOT_FETCH_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDoNotFetchActions_JsonNullable() {
    return doNotFetchActions;
  }
  
  @JsonProperty(JSON_PROPERTY_DO_NOT_FETCH_ACTIONS)
  public void setDoNotFetchActions_JsonNullable(JsonNullable<Object> doNotFetchActions) {
    this.doNotFetchActions = doNotFetchActions;
  }

  public void setDoNotFetchActions(Object doNotFetchActions) {
    this.doNotFetchActions = JsonNullable.<Object>of(doNotFetchActions);
  }


  public IndexPhpMethodLiveGetLastVisitsDetailsPostRequest enhanced(Object enhanced) {
    this.enhanced = JsonNullable.<Object>of(enhanced);
    
    return this;
  }

   /**
   * Get enhanced
   * @return enhanced
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEnhanced() {
        return enhanced.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENHANCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEnhanced_JsonNullable() {
    return enhanced;
  }
  
  @JsonProperty(JSON_PROPERTY_ENHANCED)
  public void setEnhanced_JsonNullable(JsonNullable<Object> enhanced) {
    this.enhanced = enhanced;
  }

  public void setEnhanced(Object enhanced) {
    this.enhanced = JsonNullable.<Object>of(enhanced);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodLiveGetLastVisitsDetailsPostRequest indexPhpMethodLiveGetLastVisitsDetailsPostRequest = (IndexPhpMethodLiveGetLastVisitsDetailsPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.idSite) &&
        equalsNullable(this.period, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.period) &&
        equalsNullable(this.date, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.date) &&
        equalsNullable(this.segment, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.segment) &&
        equalsNullable(this.countVisitorsToFetch, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.countVisitorsToFetch) &&
        equalsNullable(this.minTimestamp, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.minTimestamp) &&
        equalsNullable(this.flat, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.flat) &&
        equalsNullable(this.doNotFetchActions, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.doNotFetchActions) &&
        equalsNullable(this.enhanced, indexPhpMethodLiveGetLastVisitsDetailsPostRequest.enhanced);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(period), hashCodeNullable(date), hashCodeNullable(segment), hashCodeNullable(countVisitorsToFetch), hashCodeNullable(minTimestamp), hashCodeNullable(flat), hashCodeNullable(doNotFetchActions), hashCodeNullable(enhanced));
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
    sb.append("class IndexPhpMethodLiveGetLastVisitsDetailsPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    countVisitorsToFetch: ").append(toIndentedString(countVisitorsToFetch)).append("\n");
    sb.append("    minTimestamp: ").append(toIndentedString(minTimestamp)).append("\n");
    sb.append("    flat: ").append(toIndentedString(flat)).append("\n");
    sb.append("    doNotFetchActions: ").append(toIndentedString(doNotFetchActions)).append("\n");
    sb.append("    enhanced: ").append(toIndentedString(enhanced)).append("\n");
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

