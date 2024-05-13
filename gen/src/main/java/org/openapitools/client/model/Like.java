/*
 * Youtube Music
 * Require authentication for all route except /auth and /auth/new.
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
 * Like
 */
@JsonPropertyOrder({
  Like.JSON_PROPERTY_USER_ID,
  Like.JSON_PROPERTY_PLAYLIST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:03.133651353Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Like {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Integer userId;

  public static final String JSON_PROPERTY_PLAYLIST_ID = "playlistId";
  private Integer playlistId;

  public Like() {
  }

  public Like userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Like playlistId(Integer playlistId) {
    
    this.playlistId = playlistId;
    return this;
  }

   /**
   * Get playlistId
   * @return playlistId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAYLIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlaylistId() {
    return playlistId;
  }


  @JsonProperty(JSON_PROPERTY_PLAYLIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaylistId(Integer playlistId) {
    this.playlistId = playlistId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Like like = (Like) o;
    return Objects.equals(this.userId, like.userId) &&
        Objects.equals(this.playlistId, like.playlistId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, playlistId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Like {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    playlistId: ").append(toIndentedString(playlistId)).append("\n");
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

