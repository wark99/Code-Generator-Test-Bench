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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.HlsStream;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Item1
 */
@JsonPropertyOrder({
  Item1.JSON_PROPERTY_ID,
  Item1.JSON_PROPERTY_IS_MAIN,
  Item1.JSON_PROPERTY_ORDER,
  Item1.JSON_PROPERTY_STREAMS,
  Item1.JSON_PROPERTY_HLS_STREAM
})
@JsonTypeName("item_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Item1 {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_IS_MAIN = "is_main";
  private Boolean isMain;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_STREAMS = "streams";
  private List<Item1> streams;

  public static final String JSON_PROPERTY_HLS_STREAM = "hls_stream";
  private HlsStream hlsStream;

  public Item1() {
  }

  public Item1 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Specify the id of the station
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public Item1 isMain(Boolean isMain) {
    
    this.isMain = isMain;
    return this;
  }

   /**
   * Specify if the station is the main station to listen
   * @return isMain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMain() {
    return isMain;
  }


  @JsonProperty(JSON_PROPERTY_IS_MAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }


  public Item1 order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Specify the order of the station in the list
   * @return order
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public Item1 streams(List<Item1> streams) {
    
    this.streams = streams;
    return this;
  }

  public Item1 addStreamsItem(Item1 streamsItem) {
    if (this.streams == null) {
      this.streams = new ArrayList<>();
    }
    this.streams.add(streamsItem);
    return this;
  }

   /**
   * Specify the list of streams used in the super player by station
   * @return streams
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Item1> getStreams() {
    return streams;
  }


  @JsonProperty(JSON_PROPERTY_STREAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreams(List<Item1> streams) {
    this.streams = streams;
  }


  public Item1 hlsStream(HlsStream hlsStream) {
    
    this.hlsStream = hlsStream;
    return this;
  }

   /**
   * Get hlsStream
   * @return hlsStream
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HLS_STREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HlsStream getHlsStream() {
    return hlsStream;
  }


  @JsonProperty(JSON_PROPERTY_HLS_STREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHlsStream(HlsStream hlsStream) {
    this.hlsStream = hlsStream;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item1 item1 = (Item1) o;
    return Objects.equals(this.id, item1.id) &&
        Objects.equals(this.isMain, item1.isMain) &&
        Objects.equals(this.order, item1.order) &&
        Objects.equals(this.streams, item1.streams) &&
        Objects.equals(this.hlsStream, item1.hlsStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isMain, order, streams, hlsStream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    hlsStream: ").append(toIndentedString(hlsStream)).append("\n");
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
