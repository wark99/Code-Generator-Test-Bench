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
 * PostList
 */
@JsonPropertyOrder({
  PostList.JSON_PROPERTY_ORDER,
  PostList.JSON_PROPERTY_POSTS,
  PostList.JSON_PROPERTY_NEXT_POST_ID,
  PostList.JSON_PROPERTY_PREV_POST_ID,
  PostList.JSON_PROPERTY_HAS_NEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PostList {
  public static final String JSON_PROPERTY_ORDER = "order";
  private List<String> order;

  public static final String JSON_PROPERTY_POSTS = "posts";
  private Map<String, Post> posts = new HashMap<>();

  public static final String JSON_PROPERTY_NEXT_POST_ID = "next_post_id";
  private String nextPostId;

  public static final String JSON_PROPERTY_PREV_POST_ID = "prev_post_id";
  private String prevPostId;

  public static final String JSON_PROPERTY_HAS_NEXT = "has_next";
  private Boolean hasNext;

  public PostList() {
  }

  public PostList order(List<String> order) {
    
    this.order = order;
    return this;
  }

  public PostList addOrderItem(String orderItem) {
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


  public PostList posts(Map<String, Post> posts) {
    
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


  public PostList nextPostId(String nextPostId) {
    
    this.nextPostId = nextPostId;
    return this;
  }

   /**
   * The ID of next post. Not omitted when empty or not relevant.
   * @return nextPostId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_POST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPostId() {
    return nextPostId;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_POST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPostId(String nextPostId) {
    this.nextPostId = nextPostId;
  }


  public PostList prevPostId(String prevPostId) {
    
    this.prevPostId = prevPostId;
    return this;
  }

   /**
   * The ID of previous post. Not omitted when empty or not relevant.
   * @return prevPostId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREV_POST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrevPostId() {
    return prevPostId;
  }


  @JsonProperty(JSON_PROPERTY_PREV_POST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevPostId(String prevPostId) {
    this.prevPostId = prevPostId;
  }


  public PostList hasNext(Boolean hasNext) {
    
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Whether there are more items after this page.
   * @return hasNext
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNext() {
    return hasNext;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostList postList = (PostList) o;
    return Objects.equals(this.order, postList.order) &&
        Objects.equals(this.posts, postList.posts) &&
        Objects.equals(this.nextPostId, postList.nextPostId) &&
        Objects.equals(this.prevPostId, postList.prevPostId) &&
        Objects.equals(this.hasNext, postList.hasNext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, posts, nextPostId, prevPostId, hasNext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostList {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    nextPostId: ").append(toIndentedString(nextPostId)).append("\n");
    sb.append("    prevPostId: ").append(toIndentedString(prevPostId)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
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
