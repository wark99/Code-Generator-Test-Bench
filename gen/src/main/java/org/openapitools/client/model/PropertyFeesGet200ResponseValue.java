/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ExtendedPropertyFeesResponse;
import org.openapitools.client.model.MetaResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyFeesGet200ResponseValue
 */
@JsonPropertyOrder({
  PropertyFeesGet200ResponseValue.JSON_PROPERTY_META,
  PropertyFeesGet200ResponseValue.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("_property_fees_get_200_response_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyFeesGet200ResponseValue {
  public static final String JSON_PROPERTY_META = "meta";
  private MetaResponse meta;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ExtendedPropertyFeesResponse> properties;

  public PropertyFeesGet200ResponseValue() {
  }

  public PropertyFeesGet200ResponseValue meta(MetaResponse meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetaResponse getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(MetaResponse meta) {
    this.meta = meta;
  }


  public PropertyFeesGet200ResponseValue properties(List<ExtendedPropertyFeesResponse> properties) {
    
    this.properties = properties;
    return this;
  }

  public PropertyFeesGet200ResponseValue addPropertiesItem(ExtendedPropertyFeesResponse propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExtendedPropertyFeesResponse> getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(List<ExtendedPropertyFeesResponse> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyFeesGet200ResponseValue propertyFeesGet200ResponseValue = (PropertyFeesGet200ResponseValue) o;
    return Objects.equals(this.meta, propertyFeesGet200ResponseValue.meta) &&
        Objects.equals(this.properties, propertyFeesGet200ResponseValue.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyFeesGet200ResponseValue {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

