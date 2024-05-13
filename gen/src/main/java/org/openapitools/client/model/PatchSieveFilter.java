/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
import org.openapitools.client.model.PostSieveFilterActions;
import org.openapitools.client.model.PostSieveFilterConditions;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Sieve filter PATCH body parameters
 */
@JsonPropertyOrder({
  PatchSieveFilter.JSON_PROPERTY_NAME,
  PatchSieveFilter.JSON_PROPERTY_OLD_NAME,
  PatchSieveFilter.JSON_PROPERTY_IS_ENABLED,
  PatchSieveFilter.JSON_PROPERTY_HAS_ALL_OF,
  PatchSieveFilter.JSON_PROPERTY_CONDITIONS,
  PatchSieveFilter.JSON_PROPERTY_ACTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PatchSieveFilter {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OLD_NAME = "old_name";
  private String oldName;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_HAS_ALL_OF = "has_all_of";
  private Boolean hasAllOf;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private PostSieveFilterConditions conditions;

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private PostSieveFilterActions actions;

  public PatchSieveFilter() {
  }

  public PatchSieveFilter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * New name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PatchSieveFilter oldName(String oldName) {
    
    this.oldName = oldName;
    return this;
  }

   /**
   * Old name
   * @return oldName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OLD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOldName() {
    return oldName;
  }


  @JsonProperty(JSON_PROPERTY_OLD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOldName(String oldName) {
    this.oldName = oldName;
  }


  public PatchSieveFilter isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is enabled
   * @return isEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public PatchSieveFilter hasAllOf(Boolean hasAllOf) {
    
    this.hasAllOf = hasAllOf;
    return this;
  }

   /**
   * Filter must match all conditions if true, at least one if false
   * @return hasAllOf
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_ALL_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasAllOf() {
    return hasAllOf;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ALL_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasAllOf(Boolean hasAllOf) {
    this.hasAllOf = hasAllOf;
  }


  public PatchSieveFilter conditions(PostSieveFilterConditions conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostSieveFilterConditions getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConditions(PostSieveFilterConditions conditions) {
    this.conditions = conditions;
  }


  public PatchSieveFilter actions(PostSieveFilterActions actions) {
    
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostSieveFilterActions getActions() {
    return actions;
  }


  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActions(PostSieveFilterActions actions) {
    this.actions = actions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchSieveFilter patchSieveFilter = (PatchSieveFilter) o;
    return Objects.equals(this.name, patchSieveFilter.name) &&
        Objects.equals(this.oldName, patchSieveFilter.oldName) &&
        Objects.equals(this.isEnabled, patchSieveFilter.isEnabled) &&
        Objects.equals(this.hasAllOf, patchSieveFilter.hasAllOf) &&
        Objects.equals(this.conditions, patchSieveFilter.conditions) &&
        Objects.equals(this.actions, patchSieveFilter.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, oldName, isEnabled, hasAllOf, conditions, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchSieveFilter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    hasAllOf: ").append(toIndentedString(hasAllOf)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
