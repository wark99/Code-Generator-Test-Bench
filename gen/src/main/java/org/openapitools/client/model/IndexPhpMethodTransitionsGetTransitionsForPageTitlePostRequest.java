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
 * IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_PAGE_TITLE,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_PERIOD,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_DATE,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_SEGMENT,
  IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.JSON_PROPERTY_LIMIT_BEFORE_GROUPING
})
@JsonTypeName("_index_php_method_Transitions_getTransitionsForPageTitle_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_PAGE_TITLE = "pageTitle";
  private JsonNullable<Object> pageTitle = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PERIOD = "period";
  private JsonNullable<Object> period = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<Object> date = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SEGMENT = "segment";
  private JsonNullable<Object> segment = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LIMIT_BEFORE_GROUPING = "limitBeforeGrouping";
  private JsonNullable<Object> limitBeforeGrouping = JsonNullable.<Object>of(null);

  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest() {
  }

  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest module(Object module) {
    
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest format(Object format) {
    
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest method(Object method) {
    
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest pageTitle(Object pageTitle) {
    this.pageTitle = JsonNullable.<Object>of(pageTitle);
    
    return this;
  }

   /**
   * Get pageTitle
   * @return pageTitle
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPageTitle() {
        return pageTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAGE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPageTitle_JsonNullable() {
    return pageTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_PAGE_TITLE)
  public void setPageTitle_JsonNullable(JsonNullable<Object> pageTitle) {
    this.pageTitle = pageTitle;
  }

  public void setPageTitle(Object pageTitle) {
    this.pageTitle = JsonNullable.<Object>of(pageTitle);
  }


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest idSite(Object idSite) {
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest period(Object period) {
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest date(Object date) {
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest segment(Object segment) {
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


  public IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest limitBeforeGrouping(Object limitBeforeGrouping) {
    this.limitBeforeGrouping = JsonNullable.<Object>of(limitBeforeGrouping);
    
    return this;
  }

   /**
   * Get limitBeforeGrouping
   * @return limitBeforeGrouping
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLimitBeforeGrouping() {
        return limitBeforeGrouping.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_BEFORE_GROUPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimitBeforeGrouping_JsonNullable() {
    return limitBeforeGrouping;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_BEFORE_GROUPING)
  public void setLimitBeforeGrouping_JsonNullable(JsonNullable<Object> limitBeforeGrouping) {
    this.limitBeforeGrouping = limitBeforeGrouping;
  }

  public void setLimitBeforeGrouping(Object limitBeforeGrouping) {
    this.limitBeforeGrouping = JsonNullable.<Object>of(limitBeforeGrouping);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest = (IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest) o;
    return Objects.equals(this.module, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.method) &&
        equalsNullable(this.pageTitle, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.pageTitle) &&
        equalsNullable(this.idSite, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.idSite) &&
        equalsNullable(this.period, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.period) &&
        equalsNullable(this.date, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.date) &&
        equalsNullable(this.segment, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.segment) &&
        equalsNullable(this.limitBeforeGrouping, indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.limitBeforeGrouping);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(pageTitle), hashCodeNullable(idSite), hashCodeNullable(period), hashCodeNullable(date), hashCodeNullable(segment), hashCodeNullable(limitBeforeGrouping));
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
    sb.append("class IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    limitBeforeGrouping: ").append(toIndentedString(limitBeforeGrouping)).append("\n");
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

