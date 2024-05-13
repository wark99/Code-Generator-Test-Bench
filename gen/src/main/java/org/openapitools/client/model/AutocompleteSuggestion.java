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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutocompleteSuggestion
 */
@JsonPropertyOrder({
  AutocompleteSuggestion.JSON_PROPERTY_COMPLETE,
  AutocompleteSuggestion.JSON_PROPERTY_SUGGESTION,
  AutocompleteSuggestion.JSON_PROPERTY_HINT,
  AutocompleteSuggestion.JSON_PROPERTY_DESCRIPTION,
  AutocompleteSuggestion.JSON_PROPERTY_ICON_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AutocompleteSuggestion {
  public static final String JSON_PROPERTY_COMPLETE = "Complete";
  private String complete;

  public static final String JSON_PROPERTY_SUGGESTION = "Suggestion";
  private String suggestion;

  public static final String JSON_PROPERTY_HINT = "Hint";
  private String hint;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_ICON_DATA = "IconData";
  private String iconData;

  public AutocompleteSuggestion() {
  }

  public AutocompleteSuggestion complete(String complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * Completed suggestion
   * @return complete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComplete() {
    return complete;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplete(String complete) {
    this.complete = complete;
  }


  public AutocompleteSuggestion suggestion(String suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Predicted text user might want to input
   * @return suggestion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuggestion() {
    return suggestion;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  public AutocompleteSuggestion hint(String hint) {
    
    this.hint = hint;
    return this;
  }

   /**
   * Hint about suggested input
   * @return hint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHint() {
    return hint;
  }


  @JsonProperty(JSON_PROPERTY_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHint(String hint) {
    this.hint = hint;
  }


  public AutocompleteSuggestion description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the suggested command
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AutocompleteSuggestion iconData(String iconData) {
    
    this.iconData = iconData;
    return this;
  }

   /**
   * Base64 encoded svg image
   * @return iconData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconData() {
    return iconData;
  }


  @JsonProperty(JSON_PROPERTY_ICON_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIconData(String iconData) {
    this.iconData = iconData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutocompleteSuggestion autocompleteSuggestion = (AutocompleteSuggestion) o;
    return Objects.equals(this.complete, autocompleteSuggestion.complete) &&
        Objects.equals(this.suggestion, autocompleteSuggestion.suggestion) &&
        Objects.equals(this.hint, autocompleteSuggestion.hint) &&
        Objects.equals(this.description, autocompleteSuggestion.description) &&
        Objects.equals(this.iconData, autocompleteSuggestion.iconData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, suggestion, hint, description, iconData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutocompleteSuggestion {\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconData: ").append(toIndentedString(iconData)).append("\n");
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
