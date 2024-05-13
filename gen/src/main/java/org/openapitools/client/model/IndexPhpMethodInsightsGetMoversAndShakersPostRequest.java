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
 * IndexPhpMethodInsightsGetMoversAndShakersPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_PERIOD,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_DATE,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_REPORT_UNIQUE_ID,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_SEGMENT,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_COMPARED_TO_X_PERIODS,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_LIMIT_INCREASER,
  IndexPhpMethodInsightsGetMoversAndShakersPostRequest.JSON_PROPERTY_LIMIT_DECREASER
})
@JsonTypeName("_index_php_method_Insights_getMoversAndShakers_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodInsightsGetMoversAndShakersPostRequest {
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

  public static final String JSON_PROPERTY_REPORT_UNIQUE_ID = "reportUniqueId";
  private JsonNullable<Object> reportUniqueId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SEGMENT = "segment";
  private JsonNullable<Object> segment = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_COMPARED_TO_X_PERIODS = "comparedToXPeriods";
  private JsonNullable<Object> comparedToXPeriods = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LIMIT_INCREASER = "limitIncreaser";
  private JsonNullable<Object> limitIncreaser = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LIMIT_DECREASER = "limitDecreaser";
  private JsonNullable<Object> limitDecreaser = JsonNullable.<Object>of(null);

  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest() {
  }

  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest module(Object module) {
    
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest format(Object format) {
    
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest method(Object method) {
    
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest period(Object period) {
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest date(Object date) {
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest reportUniqueId(Object reportUniqueId) {
    this.reportUniqueId = JsonNullable.<Object>of(reportUniqueId);
    
    return this;
  }

   /**
   * Get reportUniqueId
   * @return reportUniqueId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getReportUniqueId() {
        return reportUniqueId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getReportUniqueId_JsonNullable() {
    return reportUniqueId;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_UNIQUE_ID)
  public void setReportUniqueId_JsonNullable(JsonNullable<Object> reportUniqueId) {
    this.reportUniqueId = reportUniqueId;
  }

  public void setReportUniqueId(Object reportUniqueId) {
    this.reportUniqueId = JsonNullable.<Object>of(reportUniqueId);
  }


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest segment(Object segment) {
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


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest comparedToXPeriods(Object comparedToXPeriods) {
    this.comparedToXPeriods = JsonNullable.<Object>of(comparedToXPeriods);
    
    return this;
  }

   /**
   * Get comparedToXPeriods
   * @return comparedToXPeriods
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getComparedToXPeriods() {
        return comparedToXPeriods.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPARED_TO_X_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getComparedToXPeriods_JsonNullable() {
    return comparedToXPeriods;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPARED_TO_X_PERIODS)
  public void setComparedToXPeriods_JsonNullable(JsonNullable<Object> comparedToXPeriods) {
    this.comparedToXPeriods = comparedToXPeriods;
  }

  public void setComparedToXPeriods(Object comparedToXPeriods) {
    this.comparedToXPeriods = JsonNullable.<Object>of(comparedToXPeriods);
  }


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest limitIncreaser(Object limitIncreaser) {
    this.limitIncreaser = JsonNullable.<Object>of(limitIncreaser);
    
    return this;
  }

   /**
   * Get limitIncreaser
   * @return limitIncreaser
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLimitIncreaser() {
        return limitIncreaser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_INCREASER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimitIncreaser_JsonNullable() {
    return limitIncreaser;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_INCREASER)
  public void setLimitIncreaser_JsonNullable(JsonNullable<Object> limitIncreaser) {
    this.limitIncreaser = limitIncreaser;
  }

  public void setLimitIncreaser(Object limitIncreaser) {
    this.limitIncreaser = JsonNullable.<Object>of(limitIncreaser);
  }


  public IndexPhpMethodInsightsGetMoversAndShakersPostRequest limitDecreaser(Object limitDecreaser) {
    this.limitDecreaser = JsonNullable.<Object>of(limitDecreaser);
    
    return this;
  }

   /**
   * Get limitDecreaser
   * @return limitDecreaser
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLimitDecreaser() {
        return limitDecreaser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_DECREASER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimitDecreaser_JsonNullable() {
    return limitDecreaser;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_DECREASER)
  public void setLimitDecreaser_JsonNullable(JsonNullable<Object> limitDecreaser) {
    this.limitDecreaser = limitDecreaser;
  }

  public void setLimitDecreaser(Object limitDecreaser) {
    this.limitDecreaser = JsonNullable.<Object>of(limitDecreaser);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodInsightsGetMoversAndShakersPostRequest indexPhpMethodInsightsGetMoversAndShakersPostRequest = (IndexPhpMethodInsightsGetMoversAndShakersPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodInsightsGetMoversAndShakersPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodInsightsGetMoversAndShakersPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodInsightsGetMoversAndShakersPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodInsightsGetMoversAndShakersPostRequest.idSite) &&
        equalsNullable(this.period, indexPhpMethodInsightsGetMoversAndShakersPostRequest.period) &&
        equalsNullable(this.date, indexPhpMethodInsightsGetMoversAndShakersPostRequest.date) &&
        equalsNullable(this.reportUniqueId, indexPhpMethodInsightsGetMoversAndShakersPostRequest.reportUniqueId) &&
        equalsNullable(this.segment, indexPhpMethodInsightsGetMoversAndShakersPostRequest.segment) &&
        equalsNullable(this.comparedToXPeriods, indexPhpMethodInsightsGetMoversAndShakersPostRequest.comparedToXPeriods) &&
        equalsNullable(this.limitIncreaser, indexPhpMethodInsightsGetMoversAndShakersPostRequest.limitIncreaser) &&
        equalsNullable(this.limitDecreaser, indexPhpMethodInsightsGetMoversAndShakersPostRequest.limitDecreaser);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(period), hashCodeNullable(date), hashCodeNullable(reportUniqueId), hashCodeNullable(segment), hashCodeNullable(comparedToXPeriods), hashCodeNullable(limitIncreaser), hashCodeNullable(limitDecreaser));
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
    sb.append("class IndexPhpMethodInsightsGetMoversAndShakersPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    reportUniqueId: ").append(toIndentedString(reportUniqueId)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    comparedToXPeriods: ").append(toIndentedString(comparedToXPeriods)).append("\n");
    sb.append("    limitIncreaser: ").append(toIndentedString(limitIncreaser)).append("\n");
    sb.append("    limitDecreaser: ").append(toIndentedString(limitDecreaser)).append("\n");
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

