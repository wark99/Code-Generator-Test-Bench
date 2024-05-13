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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InviteGuestsToTeamRequest
 */
@JsonPropertyOrder({
  InviteGuestsToTeamRequest.JSON_PROPERTY_EMAILS,
  InviteGuestsToTeamRequest.JSON_PROPERTY_CHANNELS,
  InviteGuestsToTeamRequest.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("InviteGuestsToTeam_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InviteGuestsToTeamRequest {
  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails = new ArrayList<>();

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<String> channels = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public InviteGuestsToTeamRequest() {
  }

  public InviteGuestsToTeamRequest emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public InviteGuestsToTeamRequest addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * List of emails
   * @return emails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public InviteGuestsToTeamRequest channels(List<String> channels) {
    
    this.channels = channels;
    return this;
  }

  public InviteGuestsToTeamRequest addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * List of channel ids
   * @return channels
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannels(List<String> channels) {
    this.channels = channels;
  }


  public InviteGuestsToTeamRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message to include in the invite
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteGuestsToTeamRequest inviteGuestsToTeamRequest = (InviteGuestsToTeamRequest) o;
    return Objects.equals(this.emails, inviteGuestsToTeamRequest.emails) &&
        Objects.equals(this.channels, inviteGuestsToTeamRequest.channels) &&
        Objects.equals(this.message, inviteGuestsToTeamRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, channels, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteGuestsToTeamRequest {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
