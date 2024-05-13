/*
 * Hudini Elevate
 * Explore reference documentation for Hudini Elevate - A collection of APIs that application developers can utilize to extend hospitality functions on their experiences
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: developers@hudini.io
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
 * RoomTypeAllOfPreferencesInner
 */
@JsonPropertyOrder({
  RoomTypeAllOfPreferencesInner.JSON_PROPERTY_CODE,
  RoomTypeAllOfPreferencesInner.JSON_PROPERTY_TITLE
})
@JsonTypeName("RoomType_allOf_preferences_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:57.602746427Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RoomTypeAllOfPreferencesInner {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public RoomTypeAllOfPreferencesInner() {
  }

  public RoomTypeAllOfPreferencesInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public RoomTypeAllOfPreferencesInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTypeAllOfPreferencesInner roomTypeAllOfPreferencesInner = (RoomTypeAllOfPreferencesInner) o;
    return Objects.equals(this.code, roomTypeAllOfPreferencesInner.code) &&
        Objects.equals(this.title, roomTypeAllOfPreferencesInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeAllOfPreferencesInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

