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
import org.openapitools.client.model.CarstockCarouselResponseImageSources;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstocklistResponse
 */
@JsonPropertyOrder({
  CarstocklistResponse.JSON_PROPERTY_CAR_STOCK_ID,
  CarstocklistResponse.JSON_PROPERTY_THUMB_NAIL,
  CarstocklistResponse.JSON_PROPERTY_IMAGE_SOURCES,
  CarstocklistResponse.JSON_PROPERTY_AVAILABLE_IMAGES_COUNT,
  CarstocklistResponse.JSON_PROPERTY_ACTIVE_IMAGES_COUNT
})
@JsonTypeName("carstocklistResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstocklistResponse {
  public static final String JSON_PROPERTY_CAR_STOCK_ID = "carStockId";
  private Integer carStockId;

  public static final String JSON_PROPERTY_THUMB_NAIL = "thumbNail";
  private String thumbNail;

  public static final String JSON_PROPERTY_IMAGE_SOURCES = "imageSources";
  private CarstockCarouselResponseImageSources imageSources;

  public static final String JSON_PROPERTY_AVAILABLE_IMAGES_COUNT = "availableImagesCount";
  private Integer availableImagesCount;

  public static final String JSON_PROPERTY_ACTIVE_IMAGES_COUNT = "activeImagesCount";
  private Integer activeImagesCount;

  public CarstocklistResponse() {
  }

  public CarstocklistResponse carStockId(Integer carStockId) {
    
    this.carStockId = carStockId;
    return this;
  }

   /**
   * Get carStockId
   * @return carStockId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAR_STOCK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCarStockId() {
    return carStockId;
  }


  @JsonProperty(JSON_PROPERTY_CAR_STOCK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarStockId(Integer carStockId) {
    this.carStockId = carStockId;
  }


  public CarstocklistResponse thumbNail(String thumbNail) {
    
    this.thumbNail = thumbNail;
    return this;
  }

   /**
   * Get thumbNail
   * @return thumbNail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THUMB_NAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbNail() {
    return thumbNail;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_NAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbNail(String thumbNail) {
    this.thumbNail = thumbNail;
  }


  public CarstocklistResponse imageSources(CarstockCarouselResponseImageSources imageSources) {
    
    this.imageSources = imageSources;
    return this;
  }

   /**
   * Get imageSources
   * @return imageSources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockCarouselResponseImageSources getImageSources() {
    return imageSources;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageSources(CarstockCarouselResponseImageSources imageSources) {
    this.imageSources = imageSources;
  }


  public CarstocklistResponse availableImagesCount(Integer availableImagesCount) {
    
    this.availableImagesCount = availableImagesCount;
    return this;
  }

   /**
   * Get availableImagesCount
   * @return availableImagesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_IMAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvailableImagesCount() {
    return availableImagesCount;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_IMAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableImagesCount(Integer availableImagesCount) {
    this.availableImagesCount = availableImagesCount;
  }


  public CarstocklistResponse activeImagesCount(Integer activeImagesCount) {
    
    this.activeImagesCount = activeImagesCount;
    return this;
  }

   /**
   * Get activeImagesCount
   * @return activeImagesCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_IMAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActiveImagesCount() {
    return activeImagesCount;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_IMAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveImagesCount(Integer activeImagesCount) {
    this.activeImagesCount = activeImagesCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstocklistResponse carstocklistResponse = (CarstocklistResponse) o;
    return Objects.equals(this.carStockId, carstocklistResponse.carStockId) &&
        Objects.equals(this.thumbNail, carstocklistResponse.thumbNail) &&
        Objects.equals(this.imageSources, carstocklistResponse.imageSources) &&
        Objects.equals(this.availableImagesCount, carstocklistResponse.availableImagesCount) &&
        Objects.equals(this.activeImagesCount, carstocklistResponse.activeImagesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carStockId, thumbNail, imageSources, availableImagesCount, activeImagesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstocklistResponse {\n");
    sb.append("    carStockId: ").append(toIndentedString(carStockId)).append("\n");
    sb.append("    thumbNail: ").append(toIndentedString(thumbNail)).append("\n");
    sb.append("    imageSources: ").append(toIndentedString(imageSources)).append("\n");
    sb.append("    availableImagesCount: ").append(toIndentedString(availableImagesCount)).append("\n");
    sb.append("    activeImagesCount: ").append(toIndentedString(activeImagesCount)).append("\n");
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

