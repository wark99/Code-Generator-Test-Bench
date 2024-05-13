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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Post;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PostListWithSearchMatches
 */
@JsonPropertyOrder({
  PostListWithSearchMatches.JSON_PROPERTY_ORDER,
  PostListWithSearchMatches.JSON_PROPERTY_POSTS,
  PostListWithSearchMatches.JSON_PROPERTY_MATCHES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PostListWithSearchMatches {
  public static final String JSON_PROPERTY_ORDER = "order";
  private List<String> order;

  public static final String JSON_PROPERTY_POSTS = "posts";
  private Map<String, Post> posts = new HashMap<>();

  public static final String JSON_PROPERTY_MATCHES = "matches";
  private Map<String, Object> matches = new HashMap<>();

  public PostListWithSearchMatches() {
  }

  public PostListWithSearchMatches order(List<String> order) {
    
    this.order = order;
    return this;
  }

  public PostListWithSearchMatches addOrderItem(String orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<>();
    }
    this.order.add(orderItem);
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(List<String> order) {
    this.order = order;
  }


  public PostListWithSearchMatches posts(Map<String, Post> posts) {
    
    this.posts = posts;
    return this;
  }

   /**
   * Get posts
   * @return posts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Post> getPosts() {
    return posts;
  }


  @JsonProperty(JSON_PROPERTY_POSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosts(Map<String, Post> posts) {
    this.posts = posts;
  }


  public PostListWithSearchMatches matches(Map<String, Object> matches) {
    
    this.matches = matches;
    return this;
  }

   /**
   * A mapping of post IDs to a list of matched terms within the post.
   * @return matches
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMatches() {
    return matches;
  }


  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatches(Map<String, Object> matches) {
    this.matches = matches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostListWithSearchMatches postListWithSearchMatches = (PostListWithSearchMatches) o;
    return Objects.equals(this.order, postListWithSearchMatches.order) &&
        Objects.equals(this.posts, postListWithSearchMatches.posts) &&
        Objects.equals(this.matches, postListWithSearchMatches.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, posts, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostListWithSearchMatches {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
