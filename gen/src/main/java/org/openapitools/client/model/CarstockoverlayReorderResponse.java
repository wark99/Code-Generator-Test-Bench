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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstockoverlayReorderResponse
 */
@JsonPropertyOrder({
  CarstockoverlayReorderResponse.JSON_PROPERTY_FAILED,
  CarstockoverlayReorderResponse.JSON_PROPERTY_SUCCEEDED
})
@JsonTypeName("carstockoverlayReorderResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockoverlayReorderResponse {
  public static final String JSON_PROPERTY_FAILED = "failed";
  private List<Integer> failed;

  public static final String JSON_PROPERTY_SUCCEEDED = "succeeded";
  private List<Integer> succeeded;

  public CarstockoverlayReorderResponse() {
  }

  public CarstockoverlayReorderResponse failed(List<Integer> failed) {
    
    this.failed = failed;
    return this;
  }

  public CarstockoverlayReorderResponse addFailedItem(Integer failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<>();
    }
    this.failed.add(failedItem);
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getFailed() {
    return failed;
  }


  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailed(List<Integer> failed) {
    this.failed = failed;
  }


  public CarstockoverlayReorderResponse succeeded(List<Integer> succeeded) {
    
    this.succeeded = succeeded;
    return this;
  }

  public CarstockoverlayReorderResponse addSucceededItem(Integer succeededItem) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList<>();
    }
    this.succeeded.add(succeededItem);
    return this;
  }

   /**
   * Get succeeded
   * @return succeeded
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getSucceeded() {
    return succeeded;
  }


  @JsonProperty(JSON_PROPERTY_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSucceeded(List<Integer> succeeded) {
    this.succeeded = succeeded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockoverlayReorderResponse carstockoverlayReorderResponse = (CarstockoverlayReorderResponse) o;
    return Objects.equals(this.failed, carstockoverlayReorderResponse.failed) &&
        Objects.equals(this.succeeded, carstockoverlayReorderResponse.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, succeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockoverlayReorderResponse {\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

