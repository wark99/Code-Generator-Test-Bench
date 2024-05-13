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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ManipulationOverlaysPost200ResponseInnerImagesInner
 */
@JsonPropertyOrder({
  ManipulationOverlaysPost200ResponseInnerImagesInner.JSON_PROPERTY_ID,
  ManipulationOverlaysPost200ResponseInnerImagesInner.JSON_PROPERTY_NAME,
  ManipulationOverlaysPost200ResponseInnerImagesInner.JSON_PROPERTY_VALID_FROM,
  ManipulationOverlaysPost200ResponseInnerImagesInner.JSON_PROPERTY_VALID_UNTIL,
  ManipulationOverlaysPost200ResponseInnerImagesInner.JSON_PROPERTY_STATUS,
  ManipulationOverlaysPost200ResponseInnerImagesInner.JSON_PROPERTY_URL
})
@JsonTypeName("_manipulation_overlays_post_200_response_inner_images_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ManipulationOverlaysPost200ResponseInnerImagesInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
  private LocalDate validFrom;

  public static final String JSON_PROPERTY_VALID_UNTIL = "validUntil";
  private LocalDate validUntil;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    PENDING("PENDING"),
    
    INACTIVE("INACTIVE"),
    
    CONFLICT("CONFLICT"),
    
    OUTSIDE_PERIOD("OUTSIDE_PERIOD");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ManipulationOverlaysPost200ResponseInnerImagesInner() {
  }

  public ManipulationOverlaysPost200ResponseInnerImagesInner id(Integer id) {
    
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


  public ManipulationOverlaysPost200ResponseInnerImagesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ManipulationOverlaysPost200ResponseInnerImagesInner validFrom(LocalDate validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getValidFrom() {
    return validFrom;
  }


  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }


  public ManipulationOverlaysPost200ResponseInnerImagesInner validUntil(LocalDate validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Get validUntil
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getValidUntil() {
    return validUntil;
  }


  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }


  public ManipulationOverlaysPost200ResponseInnerImagesInner status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ManipulationOverlaysPost200ResponseInnerImagesInner url(String url) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManipulationOverlaysPost200ResponseInnerImagesInner manipulationOverlaysPost200ResponseInnerImagesInner = (ManipulationOverlaysPost200ResponseInnerImagesInner) o;
    return Objects.equals(this.id, manipulationOverlaysPost200ResponseInnerImagesInner.id) &&
        Objects.equals(this.name, manipulationOverlaysPost200ResponseInnerImagesInner.name) &&
        Objects.equals(this.validFrom, manipulationOverlaysPost200ResponseInnerImagesInner.validFrom) &&
        Objects.equals(this.validUntil, manipulationOverlaysPost200ResponseInnerImagesInner.validUntil) &&
        Objects.equals(this.status, manipulationOverlaysPost200ResponseInnerImagesInner.status) &&
        Objects.equals(this.url, manipulationOverlaysPost200ResponseInnerImagesInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, validFrom, validUntil, status, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManipulationOverlaysPost200ResponseInnerImagesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

