/*
 * CIC-NEW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.7
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstockCarouselResponseImages1Inner
 */
@JsonPropertyOrder({
  CarstockCarouselResponseImages1Inner.JSON_PROPERTY_ID,
  CarstockCarouselResponseImages1Inner.JSON_PROPERTY_URL,
  CarstockCarouselResponseImages1Inner.JSON_PROPERTY_IMAGE_TYPE
})
@JsonTypeName("carstockCarouselResponse_images_1_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockCarouselResponseImages1Inner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  /**
   * Gets or Sets imageType
   */
  public enum ImageTypeEnum {
    IMAGIN_STUDIO("IMAGIN_STUDIO"),
    
    CAR_SPECIFIC("CAR_SPECIFIC"),
    
    MATCH_WITHIN_TENANT("MATCH_WITHIN_TENANT"),
    
    BRAND_RENDERS("BRAND_RENDERS"),
    
    PLACE_HOLDER("PLACE_HOLDER"),
    
    MARKETING_SLIDE("MARKETING_SLIDE");

    private String value;

    ImageTypeEnum(String value) {
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
    public static ImageTypeEnum fromValue(String value) {
      for (ImageTypeEnum b : ImageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMAGE_TYPE = "imageType";
  private ImageTypeEnum imageType;

  public CarstockCarouselResponseImages1Inner() {
  }

  public CarstockCarouselResponseImages1Inner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public CarstockCarouselResponseImages1Inner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public CarstockCarouselResponseImages1Inner imageType(ImageTypeEnum imageType) {
    
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageTypeEnum getImageType() {
    return imageType;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockCarouselResponseImages1Inner carstockCarouselResponseImages1Inner = (CarstockCarouselResponseImages1Inner) o;
    return Objects.equals(this.id, carstockCarouselResponseImages1Inner.id) &&
        Objects.equals(this.url, carstockCarouselResponseImages1Inner.url) &&
        Objects.equals(this.imageType, carstockCarouselResponseImages1Inner.imageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, imageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockCarouselResponseImages1Inner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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

