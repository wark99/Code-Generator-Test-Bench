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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Command
 */
@JsonPropertyOrder({
  Command.JSON_PROPERTY_ID,
  Command.JSON_PROPERTY_TOKEN,
  Command.JSON_PROPERTY_CREATE_AT,
  Command.JSON_PROPERTY_UPDATE_AT,
  Command.JSON_PROPERTY_DELETE_AT,
  Command.JSON_PROPERTY_CREATOR_ID,
  Command.JSON_PROPERTY_TEAM_ID,
  Command.JSON_PROPERTY_TRIGGER,
  Command.JSON_PROPERTY_METHOD,
  Command.JSON_PROPERTY_USERNAME,
  Command.JSON_PROPERTY_ICON_URL,
  Command.JSON_PROPERTY_AUTO_COMPLETE,
  Command.JSON_PROPERTY_AUTO_COMPLETE_DESC,
  Command.JSON_PROPERTY_AUTO_COMPLETE_HINT,
  Command.JSON_PROPERTY_DISPLAY_NAME,
  Command.JSON_PROPERTY_DESCRIPTION,
  Command.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Command {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_CREATE_AT = "create_at";
  private Integer createAt;

  public static final String JSON_PROPERTY_UPDATE_AT = "update_at";
  private Long updateAt;

  public static final String JSON_PROPERTY_DELETE_AT = "delete_at";
  private Long deleteAt;

  public static final String JSON_PROPERTY_CREATOR_ID = "creator_id";
  private String creatorId;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private String trigger;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private String iconUrl;

  public static final String JSON_PROPERTY_AUTO_COMPLETE = "auto_complete";
  private Boolean autoComplete;

  public static final String JSON_PROPERTY_AUTO_COMPLETE_DESC = "auto_complete_desc";
  private String autoCompleteDesc;

  public static final String JSON_PROPERTY_AUTO_COMPLETE_HINT = "auto_complete_hint";
  private String autoCompleteHint;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public Command() {
  }

  public Command id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the slash command
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


  public Command token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The token which is used to verify the source of the payload
   * @return token
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public Command createAt(Integer createAt) {
    
    this.createAt = createAt;
    return this;
  }

   /**
   * The time in milliseconds the command was created
   * @return createAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreateAt() {
    return createAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateAt(Integer createAt) {
    this.createAt = createAt;
  }


  public Command updateAt(Long updateAt) {
    
    this.updateAt = updateAt;
    return this;
  }

   /**
   * The time in milliseconds the command was last updated
   * @return updateAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdateAt() {
    return updateAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }


  public Command deleteAt(Long deleteAt) {
    
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * The time in milliseconds the command was deleted, 0 if never deleted
   * @return deleteAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeleteAt() {
    return deleteAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }


  public Command creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * The user id for the commands creator
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorId() {
    return creatorId;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public Command teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * The team id for which this command is configured
   * @return teamId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamId() {
    return teamId;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public Command trigger(String trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * The string that triggers this command
   * @return trigger
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrigger() {
    return trigger;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }


  public Command method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Is the trigger done with HTTP Get (&#39;G&#39;) or HTTP Post (&#39;P&#39;)
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(String method) {
    this.method = method;
  }


  public Command username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * What is the username for the response post
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


  public Command iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The url to find the icon for this users avatar
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconUrl() {
    return iconUrl;
  }


  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public Command autoComplete(Boolean autoComplete) {
    
    this.autoComplete = autoComplete;
    return this;
  }

   /**
   * Use auto complete for this command
   * @return autoComplete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoComplete() {
    return autoComplete;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoComplete(Boolean autoComplete) {
    this.autoComplete = autoComplete;
  }


  public Command autoCompleteDesc(String autoCompleteDesc) {
    
    this.autoCompleteDesc = autoCompleteDesc;
    return this;
  }

   /**
   * The description for this command shown when selecting the command
   * @return autoCompleteDesc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAutoCompleteDesc() {
    return autoCompleteDesc;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoCompleteDesc(String autoCompleteDesc) {
    this.autoCompleteDesc = autoCompleteDesc;
  }


  public Command autoCompleteHint(String autoCompleteHint) {
    
    this.autoCompleteHint = autoCompleteHint;
    return this;
  }

   /**
   * The hint for this command
   * @return autoCompleteHint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAutoCompleteHint() {
    return autoCompleteHint;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoCompleteHint(String autoCompleteHint) {
    this.autoCompleteHint = autoCompleteHint;
  }


  public Command displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for the command
   * @return displayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Command description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description for this command
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Command url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL that is triggered
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Command command = (Command) o;
    return Objects.equals(this.id, command.id) &&
        Objects.equals(this.token, command.token) &&
        Objects.equals(this.createAt, command.createAt) &&
        Objects.equals(this.updateAt, command.updateAt) &&
        Objects.equals(this.deleteAt, command.deleteAt) &&
        Objects.equals(this.creatorId, command.creatorId) &&
        Objects.equals(this.teamId, command.teamId) &&
        Objects.equals(this.trigger, command.trigger) &&
        Objects.equals(this.method, command.method) &&
        Objects.equals(this.username, command.username) &&
        Objects.equals(this.iconUrl, command.iconUrl) &&
        Objects.equals(this.autoComplete, command.autoComplete) &&
        Objects.equals(this.autoCompleteDesc, command.autoCompleteDesc) &&
        Objects.equals(this.autoCompleteHint, command.autoCompleteHint) &&
        Objects.equals(this.displayName, command.displayName) &&
        Objects.equals(this.description, command.description) &&
        Objects.equals(this.url, command.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, createAt, updateAt, deleteAt, creatorId, teamId, trigger, method, username, iconUrl, autoComplete, autoCompleteDesc, autoCompleteHint, displayName, description, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Command {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    autoComplete: ").append(toIndentedString(autoComplete)).append("\n");
    sb.append("    autoCompleteDesc: ").append(toIndentedString(autoCompleteDesc)).append("\n");
    sb.append("    autoCompleteHint: ").append(toIndentedString(autoCompleteHint)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
