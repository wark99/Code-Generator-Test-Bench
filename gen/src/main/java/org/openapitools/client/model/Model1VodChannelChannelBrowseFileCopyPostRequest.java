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
 * Model1VodChannelChannelBrowseFileCopyPostRequest
 */
@JsonPropertyOrder({
  Model1VodChannelChannelBrowseFileCopyPostRequest.JSON_PROPERTY_DESTINATION
})
@JsonTypeName("_1_vod_channel__channel__browse__file__copy_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Model1VodChannelChannelBrowseFileCopyPostRequest {
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private String destination;

  public Model1VodChannelChannelBrowseFileCopyPostRequest() {
  }

  public Model1VodChannelChannelBrowseFileCopyPostRequest destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * uuid of destination folder
   * @return destination
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestination(String destination) {
    this.destination = destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model1VodChannelChannelBrowseFileCopyPostRequest _1vodChannelChannelBrowseFileCopyPostRequest = (Model1VodChannelChannelBrowseFileCopyPostRequest) o;
    return Objects.equals(this.destination, _1vodChannelChannelBrowseFileCopyPostRequest.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model1VodChannelChannelBrowseFileCopyPostRequest {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
