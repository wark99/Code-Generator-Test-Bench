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
import org.openapitools.client.model.Post;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * a thread that user is following
 */
@JsonPropertyOrder({
  UserThread.JSON_PROPERTY_ID,
  UserThread.JSON_PROPERTY_REPLY_COUNT,
  UserThread.JSON_PROPERTY_LAST_REPLY_AT,
  UserThread.JSON_PROPERTY_LAST_VIEWED_AT,
  UserThread.JSON_PROPERTY_PARTICIPANTS,
  UserThread.JSON_PROPERTY_POST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserThread {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REPLY_COUNT = "reply_count";
  private Integer replyCount;

  public static final String JSON_PROPERTY_LAST_REPLY_AT = "last_reply_at";
  private Long lastReplyAt;

  public static final String JSON_PROPERTY_LAST_VIEWED_AT = "last_viewed_at";
  private Long lastViewedAt;

  public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
  private List<Post> participants;

  public static final String JSON_PROPERTY_POST = "post";
  private Post post;

  public UserThread() {
  }

  public UserThread id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the post that is this thread&#39;s root
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public UserThread replyCount(Integer replyCount) {
    
    this.replyCount = replyCount;
    return this;
  }

   /**
   * number of replies in this thread
   * @return replyCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReplyCount() {
    return replyCount;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }


  public UserThread lastReplyAt(Long lastReplyAt) {
    
    this.lastReplyAt = lastReplyAt;
    return this;
  }

   /**
   * timestamp of the last post to this thread
   * @return lastReplyAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_REPLY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastReplyAt() {
    return lastReplyAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_REPLY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastReplyAt(Long lastReplyAt) {
    this.lastReplyAt = lastReplyAt;
  }


  public UserThread lastViewedAt(Long lastViewedAt) {
    
    this.lastViewedAt = lastViewedAt;
    return this;
  }

   /**
   * timestamp of the last time the user viewed this thread
   * @return lastViewedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_VIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastViewedAt() {
    return lastViewedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_VIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }


  public UserThread participants(List<Post> participants) {
    
    this.participants = participants;
    return this;
  }

  public UserThread addParticipantsItem(Post participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * list of users participating in this thread. only includes IDs unless &#39;extended&#39; was set to &#39;true&#39;
   * @return participants
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Post> getParticipants() {
    return participants;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipants(List<Post> participants) {
    this.participants = participants;
  }


  public UserThread post(Post post) {
    
    this.post = post;
    return this;
  }

   /**
   * Get post
   * @return post
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Post getPost() {
    return post;
  }


  @JsonProperty(JSON_PROPERTY_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPost(Post post) {
    this.post = post;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserThread userThread = (UserThread) o;
    return Objects.equals(this.id, userThread.id) &&
        Objects.equals(this.replyCount, userThread.replyCount) &&
        Objects.equals(this.lastReplyAt, userThread.lastReplyAt) &&
        Objects.equals(this.lastViewedAt, userThread.lastViewedAt) &&
        Objects.equals(this.participants, userThread.participants) &&
        Objects.equals(this.post, userThread.post);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, replyCount, lastReplyAt, lastViewedAt, participants, post);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserThread {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
    sb.append("    lastReplyAt: ").append(toIndentedString(lastReplyAt)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
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

