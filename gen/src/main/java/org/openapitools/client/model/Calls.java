/*
 * Swagger Inventory Management System(ConvoConvert) - OpenAPI 3.1
 * This is a sample Inventory Management System based on the OpenAPI 3.1 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the Inventory Management System, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Inventory Management System repository](https://github.com/afefa-karakra/inventory-management-system.git)
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Calls
 */
@JsonPropertyOrder({
  Calls.JSON_PROPERTY_ID,
  Calls.JSON_PROPERTY_AUDIO_TEXT,
  Calls.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:45.540345838Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Calls {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_AUDIO_TEXT = "audioText";
  private String audioText;

  public static final String JSON_PROPERTY_TIME = "Time";
  private String time;

  public Calls() {
  }

  public Calls id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public Calls audioText(String audioText) {
    
    this.audioText = audioText;
    return this;
  }

   /**
   * Get audioText
   * @return audioText
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIO_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudioText() {
    return audioText;
  }


  @JsonProperty(JSON_PROPERTY_AUDIO_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudioText(String audioText) {
    this.audioText = audioText;
  }


  public Calls time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calls calls = (Calls) o;
    return Objects.equals(this.id, calls.id) &&
        Objects.equals(this.audioText, calls.audioText) &&
        Objects.equals(this.time, calls.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, audioText, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calls {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    audioText: ").append(toIndentedString(audioText)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

