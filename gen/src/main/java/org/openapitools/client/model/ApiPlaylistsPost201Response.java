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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiPlaylistsPost201Response
 */
@JsonPropertyOrder({
  ApiPlaylistsPost201Response.JSON_PROPERTY_NAME,
  ApiPlaylistsPost201Response.JSON_PROPERTY_SONG_LIST,
  ApiPlaylistsPost201Response.JSON_PROPERTY_IMAGE,
  ApiPlaylistsPost201Response.JSON_PROPERTY_PLAYLIST_ID
})
@JsonTypeName("_api_playlists_post_201_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:03.133651353Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ApiPlaylistsPost201Response {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SONG_LIST = "songList";
  private JsonNullable<Object> songList = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IMAGE = "image";
  private JsonNullable<Object> image = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PLAYLIST_ID = "playlistId";
  private Integer playlistId;

  public ApiPlaylistsPost201Response() {
  }

  public ApiPlaylistsPost201Response name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<Object> name) {
    this.name = name;
  }

  public void setName(Object name) {
    this.name = JsonNullable.<Object>of(name);
  }


  public ApiPlaylistsPost201Response songList(Object songList) {
    this.songList = JsonNullable.<Object>of(songList);
    
    return this;
  }

   /**
   * List of valid youtube id
   * @return songList
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSongList() {
        return songList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SONG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSongList_JsonNullable() {
    return songList;
  }
  
  @JsonProperty(JSON_PROPERTY_SONG_LIST)
  public void setSongList_JsonNullable(JsonNullable<Object> songList) {
    this.songList = songList;
  }

  public void setSongList(Object songList) {
    this.songList = JsonNullable.<Object>of(songList);
  }


  public ApiPlaylistsPost201Response image(Object image) {
    this.image = JsonNullable.<Object>of(image);
    
    return this;
  }

   /**
   * Must be a link to an image
   * @return image
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getImage() {
        return image.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getImage_JsonNullable() {
    return image;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE)
  public void setImage_JsonNullable(JsonNullable<Object> image) {
    this.image = image;
  }

  public void setImage(Object image) {
    this.image = JsonNullable.<Object>of(image);
  }


  public ApiPlaylistsPost201Response playlistId(Integer playlistId) {
    
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
    ApiPlaylistsPost201Response apiPlaylistsPost201Response = (ApiPlaylistsPost201Response) o;
    return equalsNullable(this.name, apiPlaylistsPost201Response.name) &&
        equalsNullable(this.songList, apiPlaylistsPost201Response.songList) &&
        equalsNullable(this.image, apiPlaylistsPost201Response.image) &&
        Objects.equals(this.playlistId, apiPlaylistsPost201Response.playlistId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(songList), hashCodeNullable(image), playlistId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPlaylistsPost201Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    songList: ").append(toIndentedString(songList)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

