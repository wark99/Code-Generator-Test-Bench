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
 * UpdateChannelSchemeRequest
 */
@JsonPropertyOrder({
  UpdateChannelSchemeRequest.JSON_PROPERTY_SCHEME_ID
})
@JsonTypeName("UpdateChannelScheme_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateChannelSchemeRequest {
  public static final String JSON_PROPERTY_SCHEME_ID = "scheme_id";
  private String schemeId;

  public UpdateChannelSchemeRequest() {
  }

  public UpdateChannelSchemeRequest schemeId(String schemeId) {
    
    this.schemeId = schemeId;
    return this;
  }

   /**
   * The ID of the scheme.
   * @return schemeId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEME_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSchemeId() {
    return schemeId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEME_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemeId(String schemeId) {
    this.schemeId = schemeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelSchemeRequest updateChannelSchemeRequest = (UpdateChannelSchemeRequest) o;
    return Objects.equals(this.schemeId, updateChannelSchemeRequest.schemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelSchemeRequest {\n");
    sb.append("    schemeId: ").append(toIndentedString(schemeId)).append("\n");
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

