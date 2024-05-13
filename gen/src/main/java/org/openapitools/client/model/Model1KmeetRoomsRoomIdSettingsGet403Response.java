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
import org.openapitools.client.model.Model1KmeetRoomsRoomIdSettingsGet403ResponseAllOfError;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model1KmeetRoomsRoomIdSettingsGet403Response
 */
@JsonPropertyOrder({
  Model1KmeetRoomsRoomIdSettingsGet403Response.JSON_PROPERTY_RESULT,
  Model1KmeetRoomsRoomIdSettingsGet403Response.JSON_PROPERTY_ERROR
})
@JsonTypeName("_1_kmeet_rooms__room_id__settings_get_403_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Model1KmeetRoomsRoomIdSettingsGet403Response {
  /**
   * Result of the HTTP request
   */
  public enum ResultEnum {
    SUCCESS("success"),
    
    ERROR("error"),
    
    ASYNCHRONOUS("asynchronous");

    private Object value;

    ResultEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultEnum fromValue(Object value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_RESULT = "result";
  private ResultEnum result = null;

  public static final String JSON_PROPERTY_ERROR = "error";
  private Model1KmeetRoomsRoomIdSettingsGet403ResponseAllOfError error;

  public Model1KmeetRoomsRoomIdSettingsGet403Response() {
  }

  public Model1KmeetRoomsRoomIdSettingsGet403Response result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Result of the HTTP request
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResultEnum getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public Model1KmeetRoomsRoomIdSettingsGet403Response error(Model1KmeetRoomsRoomIdSettingsGet403ResponseAllOfError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Model1KmeetRoomsRoomIdSettingsGet403ResponseAllOfError getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(Model1KmeetRoomsRoomIdSettingsGet403ResponseAllOfError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model1KmeetRoomsRoomIdSettingsGet403Response _1kmeetRoomsRoomIdSettingsGet403Response = (Model1KmeetRoomsRoomIdSettingsGet403Response) o;
    return Objects.equals(this.result, _1kmeetRoomsRoomIdSettingsGet403Response.result) &&
        Objects.equals(this.error, _1kmeetRoomsRoomIdSettingsGet403Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model1KmeetRoomsRoomIdSettingsGet403Response {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

