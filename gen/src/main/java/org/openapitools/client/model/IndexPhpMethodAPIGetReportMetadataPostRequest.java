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
 * IndexPhpMethodAPIGetReportMetadataPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_ID_SITES,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_PERIOD,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_DATE,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_HIDE_METRICS_DOC,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_SHOW_SUBTABLE_REPORTS,
  IndexPhpMethodAPIGetReportMetadataPostRequest.JSON_PROPERTY_ID_SITE
})
@JsonTypeName("_index_php_method_API_getReportMetadata_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodAPIGetReportMetadataPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITES = "idSites";
  private JsonNullable<Object> idSites = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PERIOD = "period";
  private JsonNullable<Object> period = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<Object> date = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HIDE_METRICS_DOC = "hideMetricsDoc";
  private JsonNullable<Object> hideMetricsDoc = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SHOW_SUBTABLE_REPORTS = "showSubtableReports";
  private JsonNullable<Object> showSubtableReports = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public IndexPhpMethodAPIGetReportMetadataPostRequest() {
  }

  public IndexPhpMethodAPIGetReportMetadataPostRequest module(Object module) {
    
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


  public IndexPhpMethodAPIGetReportMetadataPostRequest format(Object format) {
    
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


  public IndexPhpMethodAPIGetReportMetadataPostRequest method(Object method) {
    
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


  public IndexPhpMethodAPIGetReportMetadataPostRequest idSites(Object idSites) {
    this.idSites = JsonNullable.<Object>of(idSites);
    
    return this;
  }

   /**
   * Get idSites
   * @return idSites
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdSites() {
        return idSites.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_SITES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdSites_JsonNullable() {
    return idSites;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_SITES)
  public void setIdSites_JsonNullable(JsonNullable<Object> idSites) {
    this.idSites = idSites;
  }

  public void setIdSites(Object idSites) {
    this.idSites = JsonNullable.<Object>of(idSites);
  }


  public IndexPhpMethodAPIGetReportMetadataPostRequest period(Object period) {
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


  public IndexPhpMethodAPIGetReportMetadataPostRequest date(Object date) {
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


  public IndexPhpMethodAPIGetReportMetadataPostRequest hideMetricsDoc(Object hideMetricsDoc) {
    this.hideMetricsDoc = JsonNullable.<Object>of(hideMetricsDoc);
    
    return this;
  }

   /**
   * Get hideMetricsDoc
   * @return hideMetricsDoc
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getHideMetricsDoc() {
        return hideMetricsDoc.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIDE_METRICS_DOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getHideMetricsDoc_JsonNullable() {
    return hideMetricsDoc;
  }
  
  @JsonProperty(JSON_PROPERTY_HIDE_METRICS_DOC)
  public void setHideMetricsDoc_JsonNullable(JsonNullable<Object> hideMetricsDoc) {
    this.hideMetricsDoc = hideMetricsDoc;
  }

  public void setHideMetricsDoc(Object hideMetricsDoc) {
    this.hideMetricsDoc = JsonNullable.<Object>of(hideMetricsDoc);
  }


  public IndexPhpMethodAPIGetReportMetadataPostRequest showSubtableReports(Object showSubtableReports) {
    this.showSubtableReports = JsonNullable.<Object>of(showSubtableReports);
    
    return this;
  }

   /**
   * Get showSubtableReports
   * @return showSubtableReports
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getShowSubtableReports() {
        return showSubtableReports.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOW_SUBTABLE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getShowSubtableReports_JsonNullable() {
    return showSubtableReports;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOW_SUBTABLE_REPORTS)
  public void setShowSubtableReports_JsonNullable(JsonNullable<Object> showSubtableReports) {
    this.showSubtableReports = showSubtableReports;
  }

  public void setShowSubtableReports(Object showSubtableReports) {
    this.showSubtableReports = JsonNullable.<Object>of(showSubtableReports);
  }


  public IndexPhpMethodAPIGetReportMetadataPostRequest idSite(Object idSite) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodAPIGetReportMetadataPostRequest indexPhpMethodAPIGetReportMetadataPostRequest = (IndexPhpMethodAPIGetReportMetadataPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodAPIGetReportMetadataPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodAPIGetReportMetadataPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodAPIGetReportMetadataPostRequest.method) &&
        equalsNullable(this.idSites, indexPhpMethodAPIGetReportMetadataPostRequest.idSites) &&
        equalsNullable(this.period, indexPhpMethodAPIGetReportMetadataPostRequest.period) &&
        equalsNullable(this.date, indexPhpMethodAPIGetReportMetadataPostRequest.date) &&
        equalsNullable(this.hideMetricsDoc, indexPhpMethodAPIGetReportMetadataPostRequest.hideMetricsDoc) &&
        equalsNullable(this.showSubtableReports, indexPhpMethodAPIGetReportMetadataPostRequest.showSubtableReports) &&
        equalsNullable(this.idSite, indexPhpMethodAPIGetReportMetadataPostRequest.idSite);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSites), hashCodeNullable(period), hashCodeNullable(date), hashCodeNullable(hideMetricsDoc), hashCodeNullable(showSubtableReports), hashCodeNullable(idSite));
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
    sb.append("class IndexPhpMethodAPIGetReportMetadataPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSites: ").append(toIndentedString(idSites)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hideMetricsDoc: ").append(toIndentedString(hideMetricsDoc)).append("\n");
    sb.append("    showSubtableReports: ").append(toIndentedString(showSubtableReports)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
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

