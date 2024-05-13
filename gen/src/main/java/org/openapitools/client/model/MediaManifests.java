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
import org.openapitools.client.model.MediaManifestsJson;
import org.openapitools.client.model.MediaManifestsV1xml;
import org.openapitools.client.model.MediaManifestsXml;
import org.openapitools.client.model.MediaManifestsYaml;
import org.openapitools.client.model.MediaManifestsYml;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * manifest
 */
@JsonPropertyOrder({
  MediaManifests.JSON_PROPERTY_JSON,
  MediaManifests.JSON_PROPERTY_XML,
  MediaManifests.JSON_PROPERTY_V1XML,
  MediaManifests.JSON_PROPERTY_YAML,
  MediaManifests.JSON_PROPERTY_YML
})
@JsonTypeName("media_manifests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MediaManifests {
  public static final String JSON_PROPERTY_JSON = "json";
  private MediaManifestsJson json;

  public static final String JSON_PROPERTY_XML = "xml";
  private MediaManifestsXml xml;

  public static final String JSON_PROPERTY_V1XML = "v1xml";
  private MediaManifestsV1xml v1xml;

  public static final String JSON_PROPERTY_YAML = "yaml";
  private MediaManifestsYaml yaml;

  public static final String JSON_PROPERTY_YML = "yml";
  private MediaManifestsYml yml;

  public MediaManifests() {
  }

  public MediaManifests json(MediaManifestsJson json) {
    
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaManifestsJson getJson() {
    return json;
  }


  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJson(MediaManifestsJson json) {
    this.json = json;
  }


  public MediaManifests xml(MediaManifestsXml xml) {
    
    this.xml = xml;
    return this;
  }

   /**
   * Get xml
   * @return xml
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaManifestsXml getXml() {
    return xml;
  }


  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXml(MediaManifestsXml xml) {
    this.xml = xml;
  }


  public MediaManifests v1xml(MediaManifestsV1xml v1xml) {
    
    this.v1xml = v1xml;
    return this;
  }

   /**
   * Get v1xml
   * @return v1xml
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_V1XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaManifestsV1xml getV1xml() {
    return v1xml;
  }


  @JsonProperty(JSON_PROPERTY_V1XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setV1xml(MediaManifestsV1xml v1xml) {
    this.v1xml = v1xml;
  }


  public MediaManifests yaml(MediaManifestsYaml yaml) {
    
    this.yaml = yaml;
    return this;
  }

   /**
   * Get yaml
   * @return yaml
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YAML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaManifestsYaml getYaml() {
    return yaml;
  }


  @JsonProperty(JSON_PROPERTY_YAML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYaml(MediaManifestsYaml yaml) {
    this.yaml = yaml;
  }


  public MediaManifests yml(MediaManifestsYml yml) {
    
    this.yml = yml;
    return this;
  }

   /**
   * Get yml
   * @return yml
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaManifestsYml getYml() {
    return yml;
  }


  @JsonProperty(JSON_PROPERTY_YML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYml(MediaManifestsYml yml) {
    this.yml = yml;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaManifests mediaManifests = (MediaManifests) o;
    return Objects.equals(this.json, mediaManifests.json) &&
        Objects.equals(this.xml, mediaManifests.xml) &&
        Objects.equals(this.v1xml, mediaManifests.v1xml) &&
        Objects.equals(this.yaml, mediaManifests.yaml) &&
        Objects.equals(this.yml, mediaManifests.yml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json, xml, v1xml, yaml, yml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaManifests {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    v1xml: ").append(toIndentedString(v1xml)).append("\n");
    sb.append("    yaml: ").append(toIndentedString(yaml)).append("\n");
    sb.append("    yml: ").append(toIndentedString(yml)).append("\n");
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
