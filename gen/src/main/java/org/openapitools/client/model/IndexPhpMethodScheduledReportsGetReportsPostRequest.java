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
 * IndexPhpMethodScheduledReportsGetReportsPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_PERIOD,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_ID_REPORT,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_IF_SUPER_USER_RETURN_ONLY_SUPER_USER_REPORTS,
  IndexPhpMethodScheduledReportsGetReportsPostRequest.JSON_PROPERTY_ID_SEGMENT
})
@JsonTypeName("_index_php_method_ScheduledReports_getReports_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodScheduledReportsGetReportsPostRequest {
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

  public static final String JSON_PROPERTY_ID_REPORT = "idReport";
  private JsonNullable<Object> idReport = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IF_SUPER_USER_RETURN_ONLY_SUPER_USER_REPORTS = "ifSuperUserReturnOnlySuperUserReports";
  private JsonNullable<Object> ifSuperUserReturnOnlySuperUserReports = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID_SEGMENT = "idSegment";
  private JsonNullable<Object> idSegment = JsonNullable.<Object>of(null);

  public IndexPhpMethodScheduledReportsGetReportsPostRequest() {
  }

  public IndexPhpMethodScheduledReportsGetReportsPostRequest module(Object module) {
    
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


  public IndexPhpMethodScheduledReportsGetReportsPostRequest format(Object format) {
    
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


  public IndexPhpMethodScheduledReportsGetReportsPostRequest method(Object method) {
    
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


  public IndexPhpMethodScheduledReportsGetReportsPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodScheduledReportsGetReportsPostRequest period(Object period) {
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


  public IndexPhpMethodScheduledReportsGetReportsPostRequest idReport(Object idReport) {
    this.idReport = JsonNullable.<Object>of(idReport);
    
    return this;
  }

   /**
   * Get idReport
   * @return idReport
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdReport() {
        return idReport.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdReport_JsonNullable() {
    return idReport;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_REPORT)
  public void setIdReport_JsonNullable(JsonNullable<Object> idReport) {
    this.idReport = idReport;
  }

  public void setIdReport(Object idReport) {
    this.idReport = JsonNullable.<Object>of(idReport);
  }


  public IndexPhpMethodScheduledReportsGetReportsPostRequest ifSuperUserReturnOnlySuperUserReports(Object ifSuperUserReturnOnlySuperUserReports) {
    this.ifSuperUserReturnOnlySuperUserReports = JsonNullable.<Object>of(ifSuperUserReturnOnlySuperUserReports);
    
    return this;
  }

   /**
   * Get ifSuperUserReturnOnlySuperUserReports
   * @return ifSuperUserReturnOnlySuperUserReports
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIfSuperUserReturnOnlySuperUserReports() {
        return ifSuperUserReturnOnlySuperUserReports.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IF_SUPER_USER_RETURN_ONLY_SUPER_USER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIfSuperUserReturnOnlySuperUserReports_JsonNullable() {
    return ifSuperUserReturnOnlySuperUserReports;
  }
  
  @JsonProperty(JSON_PROPERTY_IF_SUPER_USER_RETURN_ONLY_SUPER_USER_REPORTS)
  public void setIfSuperUserReturnOnlySuperUserReports_JsonNullable(JsonNullable<Object> ifSuperUserReturnOnlySuperUserReports) {
    this.ifSuperUserReturnOnlySuperUserReports = ifSuperUserReturnOnlySuperUserReports;
  }

  public void setIfSuperUserReturnOnlySuperUserReports(Object ifSuperUserReturnOnlySuperUserReports) {
    this.ifSuperUserReturnOnlySuperUserReports = JsonNullable.<Object>of(ifSuperUserReturnOnlySuperUserReports);
  }


  public IndexPhpMethodScheduledReportsGetReportsPostRequest idSegment(Object idSegment) {
    this.idSegment = JsonNullable.<Object>of(idSegment);
    
    return this;
  }

   /**
   * Get idSegment
   * @return idSegment
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getIdSegment() {
        return idSegment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIdSegment_JsonNullable() {
    return idSegment;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_SEGMENT)
  public void setIdSegment_JsonNullable(JsonNullable<Object> idSegment) {
    this.idSegment = idSegment;
  }

  public void setIdSegment(Object idSegment) {
    this.idSegment = JsonNullable.<Object>of(idSegment);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodScheduledReportsGetReportsPostRequest indexPhpMethodScheduledReportsGetReportsPostRequest = (IndexPhpMethodScheduledReportsGetReportsPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodScheduledReportsGetReportsPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodScheduledReportsGetReportsPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodScheduledReportsGetReportsPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodScheduledReportsGetReportsPostRequest.idSite) &&
        equalsNullable(this.period, indexPhpMethodScheduledReportsGetReportsPostRequest.period) &&
        equalsNullable(this.idReport, indexPhpMethodScheduledReportsGetReportsPostRequest.idReport) &&
        equalsNullable(this.ifSuperUserReturnOnlySuperUserReports, indexPhpMethodScheduledReportsGetReportsPostRequest.ifSuperUserReturnOnlySuperUserReports) &&
        equalsNullable(this.idSegment, indexPhpMethodScheduledReportsGetReportsPostRequest.idSegment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(period), hashCodeNullable(idReport), hashCodeNullable(ifSuperUserReturnOnlySuperUserReports), hashCodeNullable(idSegment));
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
    sb.append("class IndexPhpMethodScheduledReportsGetReportsPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    idReport: ").append(toIndentedString(idReport)).append("\n");
    sb.append("    ifSuperUserReturnOnlySuperUserReports: ").append(toIndentedString(ifSuperUserReturnOnlySuperUserReports)).append("\n");
    sb.append("    idSegment: ").append(toIndentedString(idSegment)).append("\n");
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

