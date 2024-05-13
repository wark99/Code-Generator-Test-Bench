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
import org.openapitools.client.model.MediaManifestsV1xmlData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MediaManifestsV1xml
 */
@JsonPropertyOrder({
  MediaManifestsV1xml.JSON_PROPERTY_URL,
  MediaManifestsV1xml.JSON_PROPERTY_MIMETYPE,
  MediaManifestsV1xml.JSON_PROPERTY_DATA
})
@JsonTypeName("media_manifests_v1xml")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MediaManifestsV1xml {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_MIMETYPE = "mimetype";
  private String mimetype;

  public static final String JSON_PROPERTY_DATA = "data";
  private MediaManifestsV1xmlData data;

  public MediaManifestsV1xml() {
  }

  public MediaManifestsV1xml url(String url) {
    
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


  public MediaManifestsV1xml mimetype(String mimetype) {
    
    this.mimetype = mimetype;
    return this;
  }

   /**
   * Get mimetype
   * @return mimetype
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIMETYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimetype() {
    return mimetype;
  }


  @JsonProperty(JSON_PROPERTY_MIMETYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimetype(String mimetype) {
    this.mimetype = mimetype;
  }


  public MediaManifestsV1xml data(MediaManifestsV1xmlData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaManifestsV1xmlData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(MediaManifestsV1xmlData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaManifestsV1xml mediaManifestsV1xml = (MediaManifestsV1xml) o;
    return Objects.equals(this.url, mediaManifestsV1xml.url) &&
        Objects.equals(this.mimetype, mediaManifestsV1xml.mimetype) &&
        Objects.equals(this.data, mediaManifestsV1xml.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mimetype, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaManifestsV1xml {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

