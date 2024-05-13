/*
 * Perch API
 * Perch API for accessing data from Perch. See our [API Guide](https://docs.google.com/document/d/1ms6LFNwFN4C4WkrfWs8Hlu5igFBpNLhNr7uLEkGmvJA) for guidance on best practices. <br/> <br/> Find out more about Perch at [https://perch.fit](https://perch.fit) or by contacting us at [support@perch.fit](mailto:support@perch.fit).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support@perch.fit
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
import org.openapitools.client.model.UpdateUserParamsData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateUserParams
 */
@JsonPropertyOrder({
  UpdateUserParams.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:41.221792118Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateUserParams {
  public static final String JSON_PROPERTY_DATA = "data";
  private UpdateUserParamsData data;

  public UpdateUserParams() {
  }

  public UpdateUserParams data(UpdateUserParamsData data) {
    
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

  public UpdateUserParamsData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(UpdateUserParamsData data) {
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
    UpdateUserParams updateUserParams = (UpdateUserParams) o;
    return Objects.equals(this.data, updateUserParams.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserParams {\n");
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

