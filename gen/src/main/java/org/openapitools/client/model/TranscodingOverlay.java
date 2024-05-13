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
 * TranscodingOverlay
 */
@JsonPropertyOrder({
  TranscodingOverlay.JSON_PROPERTY_OVERLAY_ID,
  TranscodingOverlay.JSON_PROPERTY_NAME,
  TranscodingOverlay.JSON_PROPERTY_ENABLED,
  TranscodingOverlay.JSON_PROPERTY_FOLLOW_UPDATE,
  TranscodingOverlay.JSON_PROPERTY_DESCRIPTION,
  TranscodingOverlay.JSON_PROPERTY_Z_INDEX,
  TranscodingOverlay.JSON_PROPERTY_ALIGN,
  TranscodingOverlay.JSON_PROPERTY_WIDTH,
  TranscodingOverlay.JSON_PROPERTY_HEIGHT,
  TranscodingOverlay.JSON_PROPERTY_OPACITY_PERCENTAGE,
  TranscodingOverlay.JSON_PROPERTY_HORIZONTAL_OFFSET,
  TranscodingOverlay.JSON_PROPERTY_VERTICAL_OFFSET,
  TranscodingOverlay.JSON_PROPERTY_SIZE_PERCENTAGE,
  TranscodingOverlay.JSON_PROPERTY_WAS_ENABLED,
  TranscodingOverlay.JSON_PROPERTY_ENCODER_PRESET,
  TranscodingOverlay.JSON_PROPERTY_IMAGE_URL,
  TranscodingOverlay.JSON_PROPERTY_IMAGE_BASE64
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TranscodingOverlay {
  public static final String JSON_PROPERTY_OVERLAY_ID = "overlay_id";
  private Integer overlayId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FOLLOW_UPDATE = "follow_update";
  private Boolean followUpdate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_Z_INDEX = "z_index";
  private Integer zIndex;

  public static final String JSON_PROPERTY_ALIGN = "align";
  private String align;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_OPACITY_PERCENTAGE = "opacity_percentage";
  private Integer opacityPercentage;

  public static final String JSON_PROPERTY_HORIZONTAL_OFFSET = "horizontal_offset";
  private Integer horizontalOffset;

  public static final String JSON_PROPERTY_VERTICAL_OFFSET = "vertical_offset";
  private Integer verticalOffset;

  public static final String JSON_PROPERTY_SIZE_PERCENTAGE = "size_percentage";
  private Integer sizePercentage;

  public static final String JSON_PROPERTY_WAS_ENABLED = "was_enabled";
  private Boolean wasEnabled;

  public static final String JSON_PROPERTY_ENCODER_PRESET = "encoder_preset";
  private String encoderPreset;

  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public static final String JSON_PROPERTY_IMAGE_BASE64 = "image_base_64";
  private String imageBase64;

  public TranscodingOverlay() {
  }

  public TranscodingOverlay overlayId(Integer overlayId) {
    
    this.overlayId = overlayId;
    return this;
  }

   /**
   * Get overlayId
   * @return overlayId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OVERLAY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOverlayId() {
    return overlayId;
  }


  @JsonProperty(JSON_PROPERTY_OVERLAY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOverlayId(Integer overlayId) {
    this.overlayId = overlayId;
  }


  public TranscodingOverlay name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the resource &#x60;TranscodingOverlay&#x60;
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


  public TranscodingOverlay enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public TranscodingOverlay followUpdate(Boolean followUpdate) {
    
    this.followUpdate = followUpdate;
    return this;
  }

   /**
   * Get followUpdate
   * @return followUpdate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FOLLOW_UPDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFollowUpdate() {
    return followUpdate;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOW_UPDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFollowUpdate(Boolean followUpdate) {
    this.followUpdate = followUpdate;
  }


  public TranscodingOverlay description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the resource &#x60;TranscodingOverlay&#x60;
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TranscodingOverlay zIndex(Integer zIndex) {
    
    this.zIndex = zIndex;
    return this;
  }

   /**
   * Get zIndex
   * @return zIndex
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_Z_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getzIndex() {
    return zIndex;
  }


  @JsonProperty(JSON_PROPERTY_Z_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setzIndex(Integer zIndex) {
    this.zIndex = zIndex;
  }


  public TranscodingOverlay align(String align) {
    
    this.align = align;
    return this;
  }

   /**
   * Get align
   * @return align
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALIGN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAlign() {
    return align;
  }


  @JsonProperty(JSON_PROPERTY_ALIGN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlign(String align) {
    this.align = align;
  }


  public TranscodingOverlay width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public TranscodingOverlay height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public TranscodingOverlay opacityPercentage(Integer opacityPercentage) {
    
    this.opacityPercentage = opacityPercentage;
    return this;
  }

   /**
   * Get opacityPercentage
   * @return opacityPercentage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPACITY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOpacityPercentage() {
    return opacityPercentage;
  }


  @JsonProperty(JSON_PROPERTY_OPACITY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpacityPercentage(Integer opacityPercentage) {
    this.opacityPercentage = opacityPercentage;
  }


  public TranscodingOverlay horizontalOffset(Integer horizontalOffset) {
    
    this.horizontalOffset = horizontalOffset;
    return this;
  }

   /**
   * Get horizontalOffset
   * @return horizontalOffset
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HORIZONTAL_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHorizontalOffset() {
    return horizontalOffset;
  }


  @JsonProperty(JSON_PROPERTY_HORIZONTAL_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHorizontalOffset(Integer horizontalOffset) {
    this.horizontalOffset = horizontalOffset;
  }


  public TranscodingOverlay verticalOffset(Integer verticalOffset) {
    
    this.verticalOffset = verticalOffset;
    return this;
  }

   /**
   * Get verticalOffset
   * @return verticalOffset
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERTICAL_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVerticalOffset() {
    return verticalOffset;
  }


  @JsonProperty(JSON_PROPERTY_VERTICAL_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerticalOffset(Integer verticalOffset) {
    this.verticalOffset = verticalOffset;
  }


  public TranscodingOverlay sizePercentage(Integer sizePercentage) {
    
    this.sizePercentage = sizePercentage;
    return this;
  }

   /**
   * Get sizePercentage
   * @return sizePercentage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSizePercentage() {
    return sizePercentage;
  }


  @JsonProperty(JSON_PROPERTY_SIZE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSizePercentage(Integer sizePercentage) {
    this.sizePercentage = sizePercentage;
  }


  public TranscodingOverlay wasEnabled(Boolean wasEnabled) {
    
    this.wasEnabled = wasEnabled;
    return this;
  }

   /**
   * Get wasEnabled
   * @return wasEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WAS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getWasEnabled() {
    return wasEnabled;
  }


  @JsonProperty(JSON_PROPERTY_WAS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWasEnabled(Boolean wasEnabled) {
    this.wasEnabled = wasEnabled;
  }


  public TranscodingOverlay encoderPreset(String encoderPreset) {
    
    this.encoderPreset = encoderPreset;
    return this;
  }

   /**
   * Get encoderPreset
   * @return encoderPreset
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODER_PRESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncoderPreset() {
    return encoderPreset;
  }


  @JsonProperty(JSON_PROPERTY_ENCODER_PRESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncoderPreset(String encoderPreset) {
    this.encoderPreset = encoderPreset;
  }


  public TranscodingOverlay imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public TranscodingOverlay imageBase64(String imageBase64) {
    
    this.imageBase64 = imageBase64;
    return this;
  }

   /**
   * Get imageBase64
   * @return imageBase64
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_BASE64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageBase64() {
    return imageBase64;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_BASE64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscodingOverlay transcodingOverlay = (TranscodingOverlay) o;
    return Objects.equals(this.overlayId, transcodingOverlay.overlayId) &&
        Objects.equals(this.name, transcodingOverlay.name) &&
        Objects.equals(this.enabled, transcodingOverlay.enabled) &&
        Objects.equals(this.followUpdate, transcodingOverlay.followUpdate) &&
        Objects.equals(this.description, transcodingOverlay.description) &&
        Objects.equals(this.zIndex, transcodingOverlay.zIndex) &&
        Objects.equals(this.align, transcodingOverlay.align) &&
        Objects.equals(this.width, transcodingOverlay.width) &&
        Objects.equals(this.height, transcodingOverlay.height) &&
        Objects.equals(this.opacityPercentage, transcodingOverlay.opacityPercentage) &&
        Objects.equals(this.horizontalOffset, transcodingOverlay.horizontalOffset) &&
        Objects.equals(this.verticalOffset, transcodingOverlay.verticalOffset) &&
        Objects.equals(this.sizePercentage, transcodingOverlay.sizePercentage) &&
        Objects.equals(this.wasEnabled, transcodingOverlay.wasEnabled) &&
        Objects.equals(this.encoderPreset, transcodingOverlay.encoderPreset) &&
        Objects.equals(this.imageUrl, transcodingOverlay.imageUrl) &&
        Objects.equals(this.imageBase64, transcodingOverlay.imageBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overlayId, name, enabled, followUpdate, description, zIndex, align, width, height, opacityPercentage, horizontalOffset, verticalOffset, sizePercentage, wasEnabled, encoderPreset, imageUrl, imageBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscodingOverlay {\n");
    sb.append("    overlayId: ").append(toIndentedString(overlayId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    followUpdate: ").append(toIndentedString(followUpdate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    zIndex: ").append(toIndentedString(zIndex)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    opacityPercentage: ").append(toIndentedString(opacityPercentage)).append("\n");
    sb.append("    horizontalOffset: ").append(toIndentedString(horizontalOffset)).append("\n");
    sb.append("    verticalOffset: ").append(toIndentedString(verticalOffset)).append("\n");
    sb.append("    sizePercentage: ").append(toIndentedString(sizePercentage)).append("\n");
    sb.append("    wasEnabled: ").append(toIndentedString(wasEnabled)).append("\n");
    sb.append("    encoderPreset: ").append(toIndentedString(encoderPreset)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
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

