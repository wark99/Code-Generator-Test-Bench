/*
 * Communication API
 * Communication API
 *
 * The version of the OpenAPI document: 1.0.2
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
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateCommunicationGateway
 */
@JsonPropertyOrder({
  CreateCommunicationGateway.JSON_PROPERTY_ENDPOINT_URL,
  CreateCommunicationGateway.JSON_PROPERTY_FRIENDLY_NAME,
  CreateCommunicationGateway.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:04.742654231Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCommunicationGateway {
  public static final String JSON_PROPERTY_ENDPOINT_URL = "endpointUrl";
  private URI endpointUrl;

  public static final String JSON_PROPERTY_FRIENDLY_NAME = "friendlyName";
  private String friendlyName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public CreateCommunicationGateway() {
  }

  public CreateCommunicationGateway endpointUrl(URI endpointUrl) {
    
    this.endpointUrl = endpointUrl;
    return this;
  }

   /**
   * Get endpointUrl
   * @return endpointUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENDPOINT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getEndpointUrl() {
    return endpointUrl;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndpointUrl(URI endpointUrl) {
    this.endpointUrl = endpointUrl;
  }


  public CreateCommunicationGateway friendlyName(String friendlyName) {
    
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Get friendlyName
   * @return friendlyName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FRIENDLY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFriendlyName() {
    return friendlyName;
  }


  @JsonProperty(JSON_PROPERTY_FRIENDLY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  public CreateCommunicationGateway description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCommunicationGateway createCommunicationGateway = (CreateCommunicationGateway) o;
    return Objects.equals(this.endpointUrl, createCommunicationGateway.endpointUrl) &&
        Objects.equals(this.friendlyName, createCommunicationGateway.friendlyName) &&
        Objects.equals(this.description, createCommunicationGateway.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUrl, friendlyName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCommunicationGateway {\n");
    sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

