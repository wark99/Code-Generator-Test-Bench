/*
 * AxisCare API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2023-10-01
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ClientsGetSingle200Response
 */
@JsonPropertyOrder({
  ClientsGetSingle200Response.JSON_PROPERTY_RESULTS,
  ClientsGetSingle200Response.JSON_PROPERTY_ERRORS
})
@JsonTypeName("clients_get_single_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:58.235743643Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ClientsGetSingle200Response {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private Object results = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors;

  public ClientsGetSingle200Response() {
  }

  public ClientsGetSingle200Response results(Object results) {
    
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(Object results) {
    this.results = results;
  }


  public ClientsGetSingle200Response errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public ClientsGetSingle200Response addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientsGetSingle200Response clientsGetSingle200Response = (ClientsGetSingle200Response) o;
    return Objects.equals(this.results, clientsGetSingle200Response.results) &&
        Objects.equals(this.errors, clientsGetSingle200Response.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientsGetSingle200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

