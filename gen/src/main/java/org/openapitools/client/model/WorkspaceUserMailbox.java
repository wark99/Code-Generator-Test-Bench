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
import org.openapitools.client.model.MailPermissions;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WorkspaceUserMailbox
 */
@JsonPropertyOrder({
  WorkspaceUserMailbox.JSON_PROPERTY_MAILBOX_NAME,
  WorkspaceUserMailbox.JSON_PROPERTY_MAILBOX,
  WorkspaceUserMailbox.JSON_PROPERTY_MAILBOX_IDN,
  WorkspaceUserMailbox.JSON_PROPERTY_PERMISSIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WorkspaceUserMailbox {
  public static final String JSON_PROPERTY_MAILBOX_NAME = "mailbox_name";
  private Object mailboxName = null;

  public static final String JSON_PROPERTY_MAILBOX = "mailbox";
  private Object mailbox = null;

  public static final String JSON_PROPERTY_MAILBOX_IDN = "mailbox_idn";
  private Object mailboxIdn = null;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private MailPermissions permissions;

  public WorkspaceUserMailbox() {
  }

  public WorkspaceUserMailbox mailboxName(Object mailboxName) {
    
    this.mailboxName = mailboxName;
    return this;
  }

   /**
   * The username (that is the part before the @) of the email address  
   * @return mailboxName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAILBOX_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMailboxName() {
    return mailboxName;
  }


  @JsonProperty(JSON_PROPERTY_MAILBOX_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMailboxName(Object mailboxName) {
    this.mailboxName = mailboxName;
  }


  public WorkspaceUserMailbox mailbox(Object mailbox) {
    
    this.mailbox = mailbox;
    return this;
  }

   /**
   * Full email address  
   * @return mailbox
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAILBOX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMailbox() {
    return mailbox;
  }


  @JsonProperty(JSON_PROPERTY_MAILBOX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMailbox(Object mailbox) {
    this.mailbox = mailbox;
  }


  public WorkspaceUserMailbox mailboxIdn(Object mailboxIdn) {
    
    this.mailboxIdn = mailboxIdn;
    return this;
  }

   /**
   * Full email address with internationalized domain name (IDN) format  
   * @return mailboxIdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAILBOX_IDN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMailboxIdn() {
    return mailboxIdn;
  }


  @JsonProperty(JSON_PROPERTY_MAILBOX_IDN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMailboxIdn(Object mailboxIdn) {
    this.mailboxIdn = mailboxIdn;
  }


  public WorkspaceUserMailbox permissions(MailPermissions permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MailPermissions getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(MailPermissions permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceUserMailbox workspaceUserMailbox = (WorkspaceUserMailbox) o;
    return Objects.equals(this.mailboxName, workspaceUserMailbox.mailboxName) &&
        Objects.equals(this.mailbox, workspaceUserMailbox.mailbox) &&
        Objects.equals(this.mailboxIdn, workspaceUserMailbox.mailboxIdn) &&
        Objects.equals(this.permissions, workspaceUserMailbox.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxName, mailbox, mailboxIdn, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceUserMailbox {\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    mailbox: ").append(toIndentedString(mailbox)).append("\n");
    sb.append("    mailboxIdn: ").append(toIndentedString(mailboxIdn)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

