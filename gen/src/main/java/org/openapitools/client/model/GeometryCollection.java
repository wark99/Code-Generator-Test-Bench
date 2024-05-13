/*
 * Beakon API
 * Access the Beakon incident feed.
 *
 * The version of the OpenAPI document: 1.0.6
 * Contact: apiteam@beakon.com
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
import org.openapitools.client.model.Geometry;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GeoJSon geometry collection
 */
@JsonPropertyOrder({
  GeometryCollection.JSON_PROPERTY_TYPE,
  GeometryCollection.JSON_PROPERTY_GEOMETRIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:49.334490151Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GeometryCollection {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    GEOMETRYCOLLECTION("GeometryCollection");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_GEOMETRIES = "geometries";
  private List<Geometry> geometries = new ArrayList<>();

  public GeometryCollection() {
  }

  public GeometryCollection type(TypeEnum type) {
    
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

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GeometryCollection geometries(List<Geometry> geometries) {
    
    this.geometries = geometries;
    return this;
  }

  public GeometryCollection addGeometriesItem(Geometry geometriesItem) {
    if (this.geometries == null) {
      this.geometries = new ArrayList<>();
    }
    this.geometries.add(geometriesItem);
    return this;
  }

   /**
   * Get geometries
   * @return geometries
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GEOMETRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Geometry> getGeometries() {
    return geometries;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGeometries(List<Geometry> geometries) {
    this.geometries = geometries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeometryCollection geometryCollection = (GeometryCollection) o;
    return Objects.equals(this.type, geometryCollection.type) &&
        Objects.equals(this.geometries, geometryCollection.geometries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, geometries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeometryCollection {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometries: ").append(toIndentedString(geometries)).append("\n");
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

