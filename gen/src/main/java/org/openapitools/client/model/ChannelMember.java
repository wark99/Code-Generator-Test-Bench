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
import org.openapitools.client.model.ChannelNotifyProps;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChannelMember
 */
@JsonPropertyOrder({
  ChannelMember.JSON_PROPERTY_CHANNEL_ID,
  ChannelMember.JSON_PROPERTY_USER_ID,
  ChannelMember.JSON_PROPERTY_ROLES,
  ChannelMember.JSON_PROPERTY_LAST_VIEWED_AT,
  ChannelMember.JSON_PROPERTY_MSG_COUNT,
  ChannelMember.JSON_PROPERTY_MENTION_COUNT,
  ChannelMember.JSON_PROPERTY_NOTIFY_PROPS,
  ChannelMember.JSON_PROPERTY_LAST_UPDATE_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChannelMember {
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private String roles;

  public static final String JSON_PROPERTY_LAST_VIEWED_AT = "last_viewed_at";
  private Long lastViewedAt;

  public static final String JSON_PROPERTY_MSG_COUNT = "msg_count";
  private Integer msgCount;

  public static final String JSON_PROPERTY_MENTION_COUNT = "mention_count";
  private Integer mentionCount;

  public static final String JSON_PROPERTY_NOTIFY_PROPS = "notify_props";
  private ChannelNotifyProps notifyProps;

  public static final String JSON_PROPERTY_LAST_UPDATE_AT = "last_update_at";
  private Long lastUpdateAt;

  public ChannelMember() {
  }

  public ChannelMember channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelId() {
    return channelId;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public ChannelMember userId(String userId) {
    
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

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ChannelMember roles(String roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(String roles) {
    this.roles = roles;
  }


  public ChannelMember lastViewedAt(Long lastViewedAt) {
    
    this.lastViewedAt = lastViewedAt;
    return this;
  }

   /**
   * The time in milliseconds the channel was last viewed by the user
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


  public ChannelMember msgCount(Integer msgCount) {
    
    this.msgCount = msgCount;
    return this;
  }

   /**
   * Get msgCount
   * @return msgCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSG_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMsgCount() {
    return msgCount;
  }


  @JsonProperty(JSON_PROPERTY_MSG_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgCount(Integer msgCount) {
    this.msgCount = msgCount;
  }


  public ChannelMember mentionCount(Integer mentionCount) {
    
    this.mentionCount = mentionCount;
    return this;
  }

   /**
   * Get mentionCount
   * @return mentionCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMentionCount() {
    return mentionCount;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionCount(Integer mentionCount) {
    this.mentionCount = mentionCount;
  }


  public ChannelMember notifyProps(ChannelNotifyProps notifyProps) {
    
    this.notifyProps = notifyProps;
    return this;
  }

   /**
   * Get notifyProps
   * @return notifyProps
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChannelNotifyProps getNotifyProps() {
    return notifyProps;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyProps(ChannelNotifyProps notifyProps) {
    this.notifyProps = notifyProps;
  }


  public ChannelMember lastUpdateAt(Long lastUpdateAt) {
    
    this.lastUpdateAt = lastUpdateAt;
    return this;
  }

   /**
   * The time in milliseconds the channel member was last updated
   * @return lastUpdateAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastUpdateAt() {
    return lastUpdateAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdateAt(Long lastUpdateAt) {
    this.lastUpdateAt = lastUpdateAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMember channelMember = (ChannelMember) o;
    return Objects.equals(this.channelId, channelMember.channelId) &&
        Objects.equals(this.userId, channelMember.userId) &&
        Objects.equals(this.roles, channelMember.roles) &&
        Objects.equals(this.lastViewedAt, channelMember.lastViewedAt) &&
        Objects.equals(this.msgCount, channelMember.msgCount) &&
        Objects.equals(this.mentionCount, channelMember.mentionCount) &&
        Objects.equals(this.notifyProps, channelMember.notifyProps) &&
        Objects.equals(this.lastUpdateAt, channelMember.lastUpdateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, userId, roles, lastViewedAt, msgCount, mentionCount, notifyProps, lastUpdateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelMember {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    msgCount: ").append(toIndentedString(msgCount)).append("\n");
    sb.append("    mentionCount: ").append(toIndentedString(mentionCount)).append("\n");
    sb.append("    notifyProps: ").append(toIndentedString(notifyProps)).append("\n");
    sb.append("    lastUpdateAt: ").append(toIndentedString(lastUpdateAt)).append("\n");
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

