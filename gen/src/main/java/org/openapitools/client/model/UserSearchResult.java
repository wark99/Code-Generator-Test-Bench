/*
 * Semantic Cuisine
 * This is the API specification for the Semantic Browse for Cuisines application.
 *
 * The version of the OpenAPI document: 1.0.1
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
 * UserSearchResult
 */
@JsonPropertyOrder({
  UserSearchResult.JSON_PROPERTY_ID,
  UserSearchResult.JSON_PROPERTY_USERNAME,
  UserSearchResult.JSON_PROPERTY_NAME,
  UserSearchResult.JSON_PROPERTY_BIO,
  UserSearchResult.JSON_PROPERTY_FOLLOWERS_COUNT,
  UserSearchResult.JSON_PROPERTY_RECIPE_COUNT,
  UserSearchResult.JSON_PROPERTY_AVG_RATING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:30.095527364Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserSearchResult {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BIO = "bio";
  private String bio;

  public static final String JSON_PROPERTY_FOLLOWERS_COUNT = "followersCount";
  private Integer followersCount;

  public static final String JSON_PROPERTY_RECIPE_COUNT = "recipeCount";
  private Integer recipeCount;

  public static final String JSON_PROPERTY_AVG_RATING = "avgRating";
  private Float avgRating;

  public UserSearchResult() {
  }

  public UserSearchResult id(Integer id) {
    
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


  public UserSearchResult username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public UserSearchResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UserSearchResult bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBio() {
    return bio;
  }


  @JsonProperty(JSON_PROPERTY_BIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBio(String bio) {
    this.bio = bio;
  }


  public UserSearchResult followersCount(Integer followersCount) {
    
    this.followersCount = followersCount;
    return this;
  }

   /**
   * Get followersCount
   * @return followersCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOWERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFollowersCount() {
    return followersCount;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOWERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }


  public UserSearchResult recipeCount(Integer recipeCount) {
    
    this.recipeCount = recipeCount;
    return this;
  }

   /**
   * Get recipeCount
   * @return recipeCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecipeCount() {
    return recipeCount;
  }


  @JsonProperty(JSON_PROPERTY_RECIPE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipeCount(Integer recipeCount) {
    this.recipeCount = recipeCount;
  }


  public UserSearchResult avgRating(Float avgRating) {
    
    this.avgRating = avgRating;
    return this;
  }

   /**
   * Get avgRating
   * @return avgRating
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAvgRating() {
    return avgRating;
  }


  @JsonProperty(JSON_PROPERTY_AVG_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgRating(Float avgRating) {
    this.avgRating = avgRating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSearchResult userSearchResult = (UserSearchResult) o;
    return Objects.equals(this.id, userSearchResult.id) &&
        Objects.equals(this.username, userSearchResult.username) &&
        Objects.equals(this.name, userSearchResult.name) &&
        Objects.equals(this.bio, userSearchResult.bio) &&
        Objects.equals(this.followersCount, userSearchResult.followersCount) &&
        Objects.equals(this.recipeCount, userSearchResult.recipeCount) &&
        Objects.equals(this.avgRating, userSearchResult.avgRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, name, bio, followersCount, recipeCount, avgRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSearchResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    recipeCount: ").append(toIndentedString(recipeCount)).append("\n");
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
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

