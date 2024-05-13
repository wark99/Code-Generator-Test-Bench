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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChannelMemberWithTeamData
 */
@JsonPropertyOrder({
  ChannelMemberWithTeamData.JSON_PROPERTY_CHANNEL_ID,
  ChannelMemberWithTeamData.JSON_PROPERTY_USER_ID,
  ChannelMemberWithTeamData.JSON_PROPERTY_ROLES,
  ChannelMemberWithTeamData.JSON_PROPERTY_LAST_VIEWED_AT,
  ChannelMemberWithTeamData.JSON_PROPERTY_MSG_COUNT,
  ChannelMemberWithTeamData.JSON_PROPERTY_MENTION_COUNT,
  ChannelMemberWithTeamData.JSON_PROPERTY_NOTIFY_PROPS,
  ChannelMemberWithTeamData.JSON_PROPERTY_LAST_UPDATE_AT,
  ChannelMemberWithTeamData.JSON_PROPERTY_TEAM_DISPLAY_NAME,
  ChannelMemberWithTeamData.JSON_PROPERTY_TEAM_NAME,
  ChannelMemberWithTeamData.JSON_PROPERTY_TEAM_UPDATE_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChannelMemberWithTeamData {
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private JsonNullable<Object> channelId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<Object> userId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ROLES = "roles";
  private JsonNullable<Object> roles = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LAST_VIEWED_AT = "last_viewed_at";
  private JsonNullable<Object> lastViewedAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MSG_COUNT = "msg_count";
  private JsonNullable<Object> msgCount = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MENTION_COUNT = "mention_count";
  private JsonNullable<Object> mentionCount = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NOTIFY_PROPS = "notify_props";
  private ChannelNotifyProps notifyProps;

  public static final String JSON_PROPERTY_LAST_UPDATE_AT = "last_update_at";
  private JsonNullable<Object> lastUpdateAt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEAM_DISPLAY_NAME = "team_display_name";
  private String teamDisplayName;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public static final String JSON_PROPERTY_TEAM_UPDATE_AT = "team_update_at";
  private Integer teamUpdateAt;

  public ChannelMemberWithTeamData() {
  }

  public ChannelMemberWithTeamData channelId(Object channelId) {
    this.channelId = JsonNullable.<Object>of(channelId);
    
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getChannelId() {
        return channelId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getChannelId_JsonNullable() {
    return channelId;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  public void setChannelId_JsonNullable(JsonNullable<Object> channelId) {
    this.channelId = channelId;
  }

  public void setChannelId(Object channelId) {
    this.channelId = JsonNullable.<Object>of(channelId);
  }


  public ChannelMemberWithTeamData userId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
    
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<Object> userId) {
    this.userId = userId;
  }

  public void setUserId(Object userId) {
    this.userId = JsonNullable.<Object>of(userId);
  }


  public ChannelMemberWithTeamData roles(Object roles) {
    this.roles = JsonNullable.<Object>of(roles);
    
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRoles() {
        return roles.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRoles_JsonNullable() {
    return roles;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLES)
  public void setRoles_JsonNullable(JsonNullable<Object> roles) {
    this.roles = roles;
  }

  public void setRoles(Object roles) {
    this.roles = JsonNullable.<Object>of(roles);
  }


  public ChannelMemberWithTeamData lastViewedAt(Object lastViewedAt) {
    this.lastViewedAt = JsonNullable.<Object>of(lastViewedAt);
    
    return this;
  }

   /**
   * The time in milliseconds the channel was last viewed by the user
   * @return lastViewedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastViewedAt() {
        return lastViewedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_VIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastViewedAt_JsonNullable() {
    return lastViewedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_VIEWED_AT)
  public void setLastViewedAt_JsonNullable(JsonNullable<Object> lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }

  public void setLastViewedAt(Object lastViewedAt) {
    this.lastViewedAt = JsonNullable.<Object>of(lastViewedAt);
  }


  public ChannelMemberWithTeamData msgCount(Object msgCount) {
    this.msgCount = JsonNullable.<Object>of(msgCount);
    
    return this;
  }

   /**
   * Get msgCount
   * @return msgCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMsgCount() {
        return msgCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MSG_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMsgCount_JsonNullable() {
    return msgCount;
  }
  
  @JsonProperty(JSON_PROPERTY_MSG_COUNT)
  public void setMsgCount_JsonNullable(JsonNullable<Object> msgCount) {
    this.msgCount = msgCount;
  }

  public void setMsgCount(Object msgCount) {
    this.msgCount = JsonNullable.<Object>of(msgCount);
  }


  public ChannelMemberWithTeamData mentionCount(Object mentionCount) {
    this.mentionCount = JsonNullable.<Object>of(mentionCount);
    
    return this;
  }

   /**
   * Get mentionCount
   * @return mentionCount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMentionCount() {
        return mentionCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMentionCount_JsonNullable() {
    return mentionCount;
  }
  
  @JsonProperty(JSON_PROPERTY_MENTION_COUNT)
  public void setMentionCount_JsonNullable(JsonNullable<Object> mentionCount) {
    this.mentionCount = mentionCount;
  }

  public void setMentionCount(Object mentionCount) {
    this.mentionCount = JsonNullable.<Object>of(mentionCount);
  }


  public ChannelMemberWithTeamData notifyProps(ChannelNotifyProps notifyProps) {
    
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


  public ChannelMemberWithTeamData lastUpdateAt(Object lastUpdateAt) {
    this.lastUpdateAt = JsonNullable.<Object>of(lastUpdateAt);
    
    return this;
  }

   /**
   * The time in milliseconds the channel member was last updated
   * @return lastUpdateAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLastUpdateAt() {
        return lastUpdateAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLastUpdateAt_JsonNullable() {
    return lastUpdateAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_AT)
  public void setLastUpdateAt_JsonNullable(JsonNullable<Object> lastUpdateAt) {
    this.lastUpdateAt = lastUpdateAt;
  }

  public void setLastUpdateAt(Object lastUpdateAt) {
    this.lastUpdateAt = JsonNullable.<Object>of(lastUpdateAt);
  }


  public ChannelMemberWithTeamData teamDisplayName(String teamDisplayName) {
    
    this.teamDisplayName = teamDisplayName;
    return this;
  }

   /**
   * The display name of the team to which this channel belongs.
   * @return teamDisplayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamDisplayName() {
    return teamDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
  }


  public ChannelMemberWithTeamData teamName(String teamName) {
    
    this.teamName = teamName;
    return this;
  }

   /**
   * The name of the team to which this channel belongs.
   * @return teamName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamName() {
    return teamName;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public ChannelMemberWithTeamData teamUpdateAt(Integer teamUpdateAt) {
    
    this.teamUpdateAt = teamUpdateAt;
    return this;
  }

   /**
   * The time at which the team to which this channel belongs was last updated.
   * @return teamUpdateAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTeamUpdateAt() {
    return teamUpdateAt;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamUpdateAt(Integer teamUpdateAt) {
    this.teamUpdateAt = teamUpdateAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMemberWithTeamData channelMemberWithTeamData = (ChannelMemberWithTeamData) o;
    return equalsNullable(this.channelId, channelMemberWithTeamData.channelId) &&
        equalsNullable(this.userId, channelMemberWithTeamData.userId) &&
        equalsNullable(this.roles, channelMemberWithTeamData.roles) &&
        equalsNullable(this.lastViewedAt, channelMemberWithTeamData.lastViewedAt) &&
        equalsNullable(this.msgCount, channelMemberWithTeamData.msgCount) &&
        equalsNullable(this.mentionCount, channelMemberWithTeamData.mentionCount) &&
        Objects.equals(this.notifyProps, channelMemberWithTeamData.notifyProps) &&
        equalsNullable(this.lastUpdateAt, channelMemberWithTeamData.lastUpdateAt) &&
        Objects.equals(this.teamDisplayName, channelMemberWithTeamData.teamDisplayName) &&
        Objects.equals(this.teamName, channelMemberWithTeamData.teamName) &&
        Objects.equals(this.teamUpdateAt, channelMemberWithTeamData.teamUpdateAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(channelId), hashCodeNullable(userId), hashCodeNullable(roles), hashCodeNullable(lastViewedAt), hashCodeNullable(msgCount), hashCodeNullable(mentionCount), notifyProps, hashCodeNullable(lastUpdateAt), teamDisplayName, teamName, teamUpdateAt);
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
    sb.append("class ChannelMemberWithTeamData {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    msgCount: ").append(toIndentedString(msgCount)).append("\n");
    sb.append("    mentionCount: ").append(toIndentedString(mentionCount)).append("\n");
    sb.append("    notifyProps: ").append(toIndentedString(notifyProps)).append("\n");
    sb.append("    lastUpdateAt: ").append(toIndentedString(lastUpdateAt)).append("\n");
    sb.append("    teamDisplayName: ").append(toIndentedString(teamDisplayName)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    teamUpdateAt: ").append(toIndentedString(teamUpdateAt)).append("\n");
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

