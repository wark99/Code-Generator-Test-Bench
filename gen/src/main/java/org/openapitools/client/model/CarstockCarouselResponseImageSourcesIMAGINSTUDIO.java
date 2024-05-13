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
 * CarstockCarouselResponseImageSourcesIMAGINSTUDIO
 */
@JsonPropertyOrder({
  CarstockCarouselResponseImageSourcesIMAGINSTUDIO.JSON_PROPERTY_ACTIVE,
  CarstockCarouselResponseImageSourcesIMAGINSTUDIO.JSON_PROPERTY_AVAILABLE
})
@JsonTypeName("carstockCarouselResponse_imageSources_IMAGIN_STUDIO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockCarouselResponseImageSourcesIMAGINSTUDIO {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Boolean available;

  public CarstockCarouselResponseImageSourcesIMAGINSTUDIO() {
  }

  public CarstockCarouselResponseImageSourcesIMAGINSTUDIO active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public CarstockCarouselResponseImageSourcesIMAGINSTUDIO available(Boolean available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailable() {
    return available;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailable(Boolean available) {
    this.available = available;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockCarouselResponseImageSourcesIMAGINSTUDIO carstockCarouselResponseImageSourcesIMAGINSTUDIO = (CarstockCarouselResponseImageSourcesIMAGINSTUDIO) o;
    return Objects.equals(this.active, carstockCarouselResponseImageSourcesIMAGINSTUDIO.active) &&
        Objects.equals(this.available, carstockCarouselResponseImageSourcesIMAGINSTUDIO.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockCarouselResponseImageSourcesIMAGINSTUDIO {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
