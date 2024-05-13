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
import org.openapitools.client.model.Resolutionsandhistogramressource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model1VideosChannelStatsViewersResolutionsHistogramGet200Response
 */
@JsonPropertyOrder({
  Model1VideosChannelStatsViewersResolutionsHistogramGet200Response.JSON_PROPERTY_RESULT,
  Model1VideosChannelStatsViewersResolutionsHistogramGet200Response.JSON_PROPERTY_DATA
})
@JsonTypeName("_1_videos__channel__stats_viewers_resolutions_histogram_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Model1VideosChannelStatsViewersResolutionsHistogramGet200Response {
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

  public static final String JSON_PROPERTY_DATA = "data";
  private Resolutionsandhistogramressource data;

  public Model1VideosChannelStatsViewersResolutionsHistogramGet200Response() {
  }

  public Model1VideosChannelStatsViewersResolutionsHistogramGet200Response result(ResultEnum result) {
    
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


  public Model1VideosChannelStatsViewersResolutionsHistogramGet200Response data(Resolutionsandhistogramressource data) {
    
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

  public Resolutionsandhistogramressource getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Resolutionsandhistogramressource data) {
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
    Model1VideosChannelStatsViewersResolutionsHistogramGet200Response _1videosChannelStatsViewersResolutionsHistogramGet200Response = (Model1VideosChannelStatsViewersResolutionsHistogramGet200Response) o;
    return Objects.equals(this.result, _1videosChannelStatsViewersResolutionsHistogramGet200Response.result) &&
        Objects.equals(this.data, _1videosChannelStatsViewersResolutionsHistogramGet200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model1VideosChannelStatsViewersResolutionsHistogramGet200Response {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

