/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
import org.openapitools.client.model.CreateResponseServiceProvider;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateResponse
 */
@JsonPropertyOrder({
  CreateResponse.JSON_PROPERTY_DISPATCH_NUMBER,
  CreateResponse.JSON_PROPERTY_SERVICE_PROVIDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateResponse {
  public static final String JSON_PROPERTY_DISPATCH_NUMBER = "dispatchNumber";
  private String dispatchNumber;

  public static final String JSON_PROPERTY_SERVICE_PROVIDER = "serviceProvider";
  private CreateResponseServiceProvider serviceProvider;

  public CreateResponse() {
  }

  public CreateResponse dispatchNumber(String dispatchNumber) {
    
    this.dispatchNumber = dispatchNumber;
    return this;
  }

   /**
   * Get dispatchNumber
   * @return dispatchNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPATCH_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDispatchNumber() {
    return dispatchNumber;
  }


  @JsonProperty(JSON_PROPERTY_DISPATCH_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDispatchNumber(String dispatchNumber) {
    this.dispatchNumber = dispatchNumber;
  }


  public CreateResponse serviceProvider(CreateResponseServiceProvider serviceProvider) {
    
    this.serviceProvider = serviceProvider;
    return this;
  }

   /**
   * Get serviceProvider
   * @return serviceProvider
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateResponseServiceProvider getServiceProvider() {
    return serviceProvider;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceProvider(CreateResponseServiceProvider serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateResponse createResponse = (CreateResponse) o;
    return Objects.equals(this.dispatchNumber, createResponse.dispatchNumber) &&
        Objects.equals(this.serviceProvider, createResponse.serviceProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchNumber, serviceProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateResponse {\n");
    sb.append("    dispatchNumber: ").append(toIndentedString(dispatchNumber)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
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
