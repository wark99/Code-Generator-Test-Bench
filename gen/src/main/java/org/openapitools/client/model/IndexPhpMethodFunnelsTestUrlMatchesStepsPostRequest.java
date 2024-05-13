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
 * IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.JSON_PROPERTY_URL,
  IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.JSON_PROPERTY_STEPS
})
@JsonTypeName("_index_php_method_Funnels_testUrlMatchesSteps_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<Object> url = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STEPS = "steps";
  private JsonNullable<Object> steps = JsonNullable.<Object>of(null);

  public IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest() {
  }

  public IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest module(Object module) {
    
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


  public IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest format(Object format) {
    
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


  public IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest method(Object method) {
    
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


  public IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest url(Object url) {
    this.url = JsonNullable.<Object>of(url);
    
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<Object> url) {
    this.url = url;
  }

  public void setUrl(Object url) {
    this.url = JsonNullable.<Object>of(url);
  }


  public IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest steps(Object steps) {
    this.steps = JsonNullable.<Object>of(steps);
    
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSteps() {
        return steps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSteps_JsonNullable() {
    return steps;
  }
  
  @JsonProperty(JSON_PROPERTY_STEPS)
  public void setSteps_JsonNullable(JsonNullable<Object> steps) {
    this.steps = steps;
  }

  public void setSteps(Object steps) {
    this.steps = JsonNullable.<Object>of(steps);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest = (IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.method) &&
        equalsNullable(this.url, indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.url) &&
        equalsNullable(this.steps, indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.steps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(url), hashCodeNullable(steps));
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
    sb.append("class IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

