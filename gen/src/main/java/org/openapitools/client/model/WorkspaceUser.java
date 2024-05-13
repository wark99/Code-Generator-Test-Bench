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
import org.openapitools.client.model.MailUser;
import org.openapitools.client.model.WorkspaceInvitation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WorkspaceUser
 */
@JsonPropertyOrder({
  WorkspaceUser.JSON_PROPERTY_USERS,
  WorkspaceUser.JSON_PROPERTY_INVITATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WorkspaceUser {
  public static final String JSON_PROPERTY_USERS = "users";
  private List<MailUser> users;

  public static final String JSON_PROPERTY_INVITATIONS = "invitations";
  private List<WorkspaceInvitation> invitations;

  public WorkspaceUser() {
  }

  public WorkspaceUser users(List<MailUser> users) {
    
    this.users = users;
    return this;
  }

  public WorkspaceUser addUsersItem(MailUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MailUser> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<MailUser> users) {
    this.users = users;
  }


  public WorkspaceUser invitations(List<WorkspaceInvitation> invitations) {
    
    this.invitations = invitations;
    return this;
  }

  public WorkspaceUser addInvitationsItem(WorkspaceInvitation invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

   /**
   * Get invitations
   * @return invitations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkspaceInvitation> getInvitations() {
    return invitations;
  }


  @JsonProperty(JSON_PROPERTY_INVITATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitations(List<WorkspaceInvitation> invitations) {
    this.invitations = invitations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceUser workspaceUser = (WorkspaceUser) o;
    return Objects.equals(this.users, workspaceUser.users) &&
        Objects.equals(this.invitations, workspaceUser.invitations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, invitations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceUser {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
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

