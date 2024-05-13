/*
 * sila-app
 * Документация к API проекта [sila-app](https://github.com/YuryVolynets/sila-app)
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.ProductFilterRequestPrice;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProductFilterRequestParam
 */
@JsonPropertyOrder({
  ProductFilterRequestParam.JSON_PROPERTY_LENGTH,
  ProductFilterRequestParam.JSON_PROPERTY_WIDTH,
  ProductFilterRequestParam.JSON_PROPERTY_HEIGHT,
  ProductFilterRequestParam.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("productFilter_request_param")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:45.886026141Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductFilterRequestParam {
  public static final String JSON_PROPERTY_LENGTH = "length";
  private ProductFilterRequestPrice length;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private ProductFilterRequestPrice width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private ProductFilterRequestPrice height;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private ProductFilterRequestPrice weight;

  public ProductFilterRequestParam() {
  }

  public ProductFilterRequestParam length(ProductFilterRequestPrice length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFilterRequestPrice getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(ProductFilterRequestPrice length) {
    this.length = length;
  }


  public ProductFilterRequestParam width(ProductFilterRequestPrice width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFilterRequestPrice getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(ProductFilterRequestPrice width) {
    this.width = width;
  }


  public ProductFilterRequestParam height(ProductFilterRequestPrice height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFilterRequestPrice getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(ProductFilterRequestPrice height) {
    this.height = height;
  }


  public ProductFilterRequestParam weight(ProductFilterRequestPrice weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFilterRequestPrice getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(ProductFilterRequestPrice weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFilterRequestParam productFilterRequestParam = (ProductFilterRequestParam) o;
    return Objects.equals(this.length, productFilterRequestParam.length) &&
        Objects.equals(this.width, productFilterRequestParam.width) &&
        Objects.equals(this.height, productFilterRequestParam.height) &&
        Objects.equals(this.weight, productFilterRequestParam.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFilterRequestParam {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

