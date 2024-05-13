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
import org.openapitools.client.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Comment
 */
@JsonPropertyOrder({
  Comment.JSON_PROPERTY_ID,
  Comment.JSON_PROPERTY_PARENT_ID,
  Comment.JSON_PROPERTY_BODY,
  Comment.JSON_PROPERTY_IS_RESOLVED,
  Comment.JSON_PROPERTY_CREATED_AT,
  Comment.JSON_PROPERTY_UPDATED_AT,
  Comment.JSON_PROPERTY_LIKED,
  Comment.JSON_PROPERTY_LIKES_COUNT,
  Comment.JSON_PROPERTY_RESPONSES_COUNT,
  Comment.JSON_PROPERTY_USER,
  Comment.JSON_PROPERTY_RESPONSES,
  Comment.JSON_PROPERTY_LIKES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Comment {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private Integer parentId;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_IS_RESOLVED = "is_resolved";
  private Boolean isResolved;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Integer updatedAt;

  public static final String JSON_PROPERTY_LIKED = "liked";
  private Boolean liked;

  public static final String JSON_PROPERTY_LIKES_COUNT = "likes_count";
  private Integer likesCount;

  public static final String JSON_PROPERTY_RESPONSES_COUNT = "responses_count";
  private Integer responsesCount;

  public static final String JSON_PROPERTY_USER = "user";
  private User user;

  public static final String JSON_PROPERTY_RESPONSES = "responses";
  private List<Comment> responses;

  public static final String JSON_PROPERTY_LIKES = "likes";
  private List<User> likes;

  public Comment() {
  }

  public Comment id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the resource &#x60;Comment&#x60;
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public Comment parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Comment parent identifier. If present, this comment is a response of another comment
   * @return parentId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public Comment body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Comment message
   * @return body
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBody(String body) {
    this.body = body;
  }


  public Comment isResolved(Boolean isResolved) {
    
    this.isResolved = isResolved;
    return this;
  }

   /**
   * If a comment is set as resolved, solved.
   * @return isResolved
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsResolved() {
    return isResolved;
  }


  @JsonProperty(JSON_PROPERTY_IS_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsResolved(Boolean isResolved) {
    this.isResolved = isResolved;
  }


  public Comment createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp &#x60;Comment&#x60; was created at
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public Comment updatedAt(Integer updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp &#x60;Comment&#x60; was updated at
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Comment liked(Boolean liked) {
    
    this.liked = liked;
    return this;
  }

   /**
   * if the comment is liked
   * @return liked
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLiked() {
    return liked;
  }


  @JsonProperty(JSON_PROPERTY_LIKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLiked(Boolean liked) {
    this.liked = liked;
  }


  public Comment likesCount(Integer likesCount) {
    
    this.likesCount = likesCount;
    return this;
  }

   /**
   * Number of likes
   * @return likesCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIKES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLikesCount() {
    return likesCount;
  }


  @JsonProperty(JSON_PROPERTY_LIKES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLikesCount(Integer likesCount) {
    this.likesCount = likesCount;
  }


  public Comment responsesCount(Integer responsesCount) {
    
    this.responsesCount = responsesCount;
    return this;
  }

   /**
   * Number of responses for this comment
   * @return responsesCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getResponsesCount() {
    return responsesCount;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
  }


  public Comment user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(User user) {
    this.user = user;
  }


  public Comment responses(List<Comment> responses) {
    
    this.responses = responses;
    return this;
  }

  public Comment addResponsesItem(Comment responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Comment> getResponses() {
    return responses;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponses(List<Comment> responses) {
    this.responses = responses;
  }


  public Comment likes(List<User> likes) {
    
    this.likes = likes;
    return this;
  }

  public Comment addLikesItem(User likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<User> getLikes() {
    return likes;
  }


  @JsonProperty(JSON_PROPERTY_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLikes(List<User> likes) {
    this.likes = likes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.parentId, comment.parentId) &&
        Objects.equals(this.body, comment.body) &&
        Objects.equals(this.isResolved, comment.isResolved) &&
        Objects.equals(this.createdAt, comment.createdAt) &&
        Objects.equals(this.updatedAt, comment.updatedAt) &&
        Objects.equals(this.liked, comment.liked) &&
        Objects.equals(this.likesCount, comment.likesCount) &&
        Objects.equals(this.responsesCount, comment.responsesCount) &&
        Objects.equals(this.user, comment.user) &&
        Objects.equals(this.responses, comment.responses) &&
        Objects.equals(this.likes, comment.likes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, body, isResolved, createdAt, updatedAt, liked, likesCount, responsesCount, user, responses, likes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    isResolved: ").append(toIndentedString(isResolved)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
    sb.append("    responsesCount: ").append(toIndentedString(responsesCount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
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

