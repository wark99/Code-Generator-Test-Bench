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
 * UpdateChannelRequest
 */
@JsonPropertyOrder({
  UpdateChannelRequest.JSON_PROPERTY_ID,
  UpdateChannelRequest.JSON_PROPERTY_NAME,
  UpdateChannelRequest.JSON_PROPERTY_DISPLAY_NAME,
  UpdateChannelRequest.JSON_PROPERTY_PURPOSE,
  UpdateChannelRequest.JSON_PROPERTY_HEADER
})
@JsonTypeName("UpdateChannel_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateChannelRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private String purpose;

  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;

  public UpdateChannelRequest() {
  }

  public UpdateChannelRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The channel&#39;s id, not updatable
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public UpdateChannelRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The unique handle for the channel, will be present in the channel URL
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


  public UpdateChannelRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The non-unique UI name for the channel
   * @return displayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpdateChannelRequest purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * A short description of the purpose of the channel
   * @return purpose
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public UpdateChannelRequest header(String header) {
    
    this.header = header;
    return this;
  }

   /**
   * Markdown-formatted text to display in the header of the channel
   * @return header
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeader() {
    return header;
  }


  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(String header) {
    this.header = header;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelRequest updateChannelRequest = (UpdateChannelRequest) o;
    return Objects.equals(this.id, updateChannelRequest.id) &&
        Objects.equals(this.name, updateChannelRequest.name) &&
        Objects.equals(this.displayName, updateChannelRequest.displayName) &&
        Objects.equals(this.purpose, updateChannelRequest.purpose) &&
        Objects.equals(this.header, updateChannelRequest.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, purpose, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
