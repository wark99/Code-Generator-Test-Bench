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
 * IndexPhpMethodGoalsAddGoalPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_ID_SITE,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_NAME,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_MATCH_ATTRIBUTE,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_PATTERN,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_PATTERN_TYPE,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_CASE_SENSITIVE,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_REVENUE,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_ALLOW_MULTIPLE_CONVERSIONS_PER_VISIT,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_DESCRIPTION,
  IndexPhpMethodGoalsAddGoalPostRequest.JSON_PROPERTY_USE_EVENT_VALUE_AS_REVENUE
})
@JsonTypeName("_index_php_method_Goals_addGoal_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodGoalsAddGoalPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_ID_SITE = "idSite";
  private JsonNullable<Object> idSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MATCH_ATTRIBUTE = "matchAttribute";
  private JsonNullable<Object> matchAttribute = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private JsonNullable<Object> pattern = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PATTERN_TYPE = "patternType";
  private JsonNullable<Object> patternType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CASE_SENSITIVE = "caseSensitive";
  private JsonNullable<Object> caseSensitive = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REVENUE = "revenue";
  private JsonNullable<Object> revenue = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ALLOW_MULTIPLE_CONVERSIONS_PER_VISIT = "allowMultipleConversionsPerVisit";
  private JsonNullable<Object> allowMultipleConversionsPerVisit = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Object> description = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USE_EVENT_VALUE_AS_REVENUE = "useEventValueAsRevenue";
  private JsonNullable<Object> useEventValueAsRevenue = JsonNullable.<Object>of(null);

  public IndexPhpMethodGoalsAddGoalPostRequest() {
  }

  public IndexPhpMethodGoalsAddGoalPostRequest module(Object module) {
    
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


  public IndexPhpMethodGoalsAddGoalPostRequest format(Object format) {
    
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


  public IndexPhpMethodGoalsAddGoalPostRequest method(Object method) {
    
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


  public IndexPhpMethodGoalsAddGoalPostRequest idSite(Object idSite) {
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


  public IndexPhpMethodGoalsAddGoalPostRequest name(Object name) {
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


  public IndexPhpMethodGoalsAddGoalPostRequest matchAttribute(Object matchAttribute) {
    this.matchAttribute = JsonNullable.<Object>of(matchAttribute);
    
    return this;
  }

   /**
   * Get matchAttribute
   * @return matchAttribute
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMatchAttribute() {
        return matchAttribute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATCH_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMatchAttribute_JsonNullable() {
    return matchAttribute;
  }
  
  @JsonProperty(JSON_PROPERTY_MATCH_ATTRIBUTE)
  public void setMatchAttribute_JsonNullable(JsonNullable<Object> matchAttribute) {
    this.matchAttribute = matchAttribute;
  }

  public void setMatchAttribute(Object matchAttribute) {
    this.matchAttribute = JsonNullable.<Object>of(matchAttribute);
  }


  public IndexPhpMethodGoalsAddGoalPostRequest pattern(Object pattern) {
    this.pattern = JsonNullable.<Object>of(pattern);
    
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPattern() {
        return pattern.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPattern_JsonNullable() {
    return pattern;
  }
  
  @JsonProperty(JSON_PROPERTY_PATTERN)
  public void setPattern_JsonNullable(JsonNullable<Object> pattern) {
    this.pattern = pattern;
  }

  public void setPattern(Object pattern) {
    this.pattern = JsonNullable.<Object>of(pattern);
  }


  public IndexPhpMethodGoalsAddGoalPostRequest patternType(Object patternType) {
    this.patternType = JsonNullable.<Object>of(patternType);
    
    return this;
  }

   /**
   * Get patternType
   * @return patternType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPatternType() {
        return patternType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPatternType_JsonNullable() {
    return patternType;
  }
  
  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  public void setPatternType_JsonNullable(JsonNullable<Object> patternType) {
    this.patternType = patternType;
  }

  public void setPatternType(Object patternType) {
    this.patternType = JsonNullable.<Object>of(patternType);
  }


  public IndexPhpMethodGoalsAddGoalPostRequest caseSensitive(Object caseSensitive) {
    this.caseSensitive = JsonNullable.<Object>of(caseSensitive);
    
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCaseSensitive() {
        return caseSensitive.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_SENSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCaseSensitive_JsonNullable() {
    return caseSensitive;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_SENSITIVE)
  public void setCaseSensitive_JsonNullable(JsonNullable<Object> caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public void setCaseSensitive(Object caseSensitive) {
    this.caseSensitive = JsonNullable.<Object>of(caseSensitive);
  }


  public IndexPhpMethodGoalsAddGoalPostRequest revenue(Object revenue) {
    this.revenue = JsonNullable.<Object>of(revenue);
    
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRevenue() {
        return revenue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRevenue_JsonNullable() {
    return revenue;
  }
  
  @JsonProperty(JSON_PROPERTY_REVENUE)
  public void setRevenue_JsonNullable(JsonNullable<Object> revenue) {
    this.revenue = revenue;
  }

  public void setRevenue(Object revenue) {
    this.revenue = JsonNullable.<Object>of(revenue);
  }


  public IndexPhpMethodGoalsAddGoalPostRequest allowMultipleConversionsPerVisit(Object allowMultipleConversionsPerVisit) {
    this.allowMultipleConversionsPerVisit = JsonNullable.<Object>of(allowMultipleConversionsPerVisit);
    
    return this;
  }

   /**
   * Get allowMultipleConversionsPerVisit
   * @return allowMultipleConversionsPerVisit
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAllowMultipleConversionsPerVisit() {
        return allowMultipleConversionsPerVisit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOW_MULTIPLE_CONVERSIONS_PER_VISIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAllowMultipleConversionsPerVisit_JsonNullable() {
    return allowMultipleConversionsPerVisit;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOW_MULTIPLE_CONVERSIONS_PER_VISIT)
  public void setAllowMultipleConversionsPerVisit_JsonNullable(JsonNullable<Object> allowMultipleConversionsPerVisit) {
    this.allowMultipleConversionsPerVisit = allowMultipleConversionsPerVisit;
  }

  public void setAllowMultipleConversionsPerVisit(Object allowMultipleConversionsPerVisit) {
    this.allowMultipleConversionsPerVisit = JsonNullable.<Object>of(allowMultipleConversionsPerVisit);
  }


  public IndexPhpMethodGoalsAddGoalPostRequest description(Object description) {
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


  public IndexPhpMethodGoalsAddGoalPostRequest useEventValueAsRevenue(Object useEventValueAsRevenue) {
    this.useEventValueAsRevenue = JsonNullable.<Object>of(useEventValueAsRevenue);
    
    return this;
  }

   /**
   * Get useEventValueAsRevenue
   * @return useEventValueAsRevenue
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUseEventValueAsRevenue() {
        return useEventValueAsRevenue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USE_EVENT_VALUE_AS_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUseEventValueAsRevenue_JsonNullable() {
    return useEventValueAsRevenue;
  }
  
  @JsonProperty(JSON_PROPERTY_USE_EVENT_VALUE_AS_REVENUE)
  public void setUseEventValueAsRevenue_JsonNullable(JsonNullable<Object> useEventValueAsRevenue) {
    this.useEventValueAsRevenue = useEventValueAsRevenue;
  }

  public void setUseEventValueAsRevenue(Object useEventValueAsRevenue) {
    this.useEventValueAsRevenue = JsonNullable.<Object>of(useEventValueAsRevenue);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodGoalsAddGoalPostRequest indexPhpMethodGoalsAddGoalPostRequest = (IndexPhpMethodGoalsAddGoalPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodGoalsAddGoalPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodGoalsAddGoalPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodGoalsAddGoalPostRequest.method) &&
        equalsNullable(this.idSite, indexPhpMethodGoalsAddGoalPostRequest.idSite) &&
        equalsNullable(this.name, indexPhpMethodGoalsAddGoalPostRequest.name) &&
        equalsNullable(this.matchAttribute, indexPhpMethodGoalsAddGoalPostRequest.matchAttribute) &&
        equalsNullable(this.pattern, indexPhpMethodGoalsAddGoalPostRequest.pattern) &&
        equalsNullable(this.patternType, indexPhpMethodGoalsAddGoalPostRequest.patternType) &&
        equalsNullable(this.caseSensitive, indexPhpMethodGoalsAddGoalPostRequest.caseSensitive) &&
        equalsNullable(this.revenue, indexPhpMethodGoalsAddGoalPostRequest.revenue) &&
        equalsNullable(this.allowMultipleConversionsPerVisit, indexPhpMethodGoalsAddGoalPostRequest.allowMultipleConversionsPerVisit) &&
        equalsNullable(this.description, indexPhpMethodGoalsAddGoalPostRequest.description) &&
        equalsNullable(this.useEventValueAsRevenue, indexPhpMethodGoalsAddGoalPostRequest.useEventValueAsRevenue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(idSite), hashCodeNullable(name), hashCodeNullable(matchAttribute), hashCodeNullable(pattern), hashCodeNullable(patternType), hashCodeNullable(caseSensitive), hashCodeNullable(revenue), hashCodeNullable(allowMultipleConversionsPerVisit), hashCodeNullable(description), hashCodeNullable(useEventValueAsRevenue));
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
    sb.append("class IndexPhpMethodGoalsAddGoalPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    idSite: ").append(toIndentedString(idSite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matchAttribute: ").append(toIndentedString(matchAttribute)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    allowMultipleConversionsPerVisit: ").append(toIndentedString(allowMultipleConversionsPerVisit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    useEventValueAsRevenue: ").append(toIndentedString(useEventValueAsRevenue)).append("\n");
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

