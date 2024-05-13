/*
 * LiveFree Health Measurements API
 * The Health Measurements API enables partners to access data from the LiveFree Health Portal.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@lifebeacon.com
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
import org.openapitools.client.model.MeasurementType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Measurement
 */
@JsonPropertyOrder({
  Measurement.JSON_PROPERTY_TYPE,
  Measurement.JSON_PROPERTY_NAME,
  Measurement.JSON_PROPERTY_VALUE,
  Measurement.JSON_PROPERTY_UNIT,
  Measurement.JSON_PROPERTY_BODY_SITE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:30.476705269Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Measurement {
  public static final String JSON_PROPERTY_TYPE = "type";
  private MeasurementType type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_BODY_SITE = "bodySite";
  private String bodySite;

  public Measurement() {
  }

  public Measurement type(MeasurementType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MeasurementType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(MeasurementType type) {
    this.type = type;
  }


  public Measurement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the measurement.
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


  public Measurement value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The measurement value in string format.
   * @return value
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public Measurement unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measure in UCUM format (see https://ucum.org).
   * @return unit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  public Measurement bodySite(String bodySite) {
    
    this.bodySite = bodySite;
    return this;
  }

   /**
   * The site on the body where the measurement was taken (if applicable).
   * @return bodySite
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBodySite() {
    return bodySite;
  }


  @JsonProperty(JSON_PROPERTY_BODY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBodySite(String bodySite) {
    this.bodySite = bodySite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.type, measurement.type) &&
        Objects.equals(this.name, measurement.name) &&
        Objects.equals(this.value, measurement.value) &&
        Objects.equals(this.unit, measurement.unit) &&
        Objects.equals(this.bodySite, measurement.bodySite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, value, unit, bodySite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    bodySite: ").append(toIndentedString(bodySite)).append("\n");
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
