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
 * Directory rights
 */
@JsonPropertyOrder({
  Capabilities2.JSON_PROPERTY_CAN_USE_FAVORITE,
  Capabilities2.JSON_PROPERTY_CAN_BECOME_SHARELINK,
  Capabilities2.JSON_PROPERTY_CAN_USE_TEAM,
  Capabilities2.JSON_PROPERTY_CAN_SHOW,
  Capabilities2.JSON_PROPERTY_CAN_READ,
  Capabilities2.JSON_PROPERTY_CAN_WRITE,
  Capabilities2.JSON_PROPERTY_CAN_SHARE,
  Capabilities2.JSON_PROPERTY_CAN_LEAVE,
  Capabilities2.JSON_PROPERTY_CAN_DELETE,
  Capabilities2.JSON_PROPERTY_CAN_RENAME,
  Capabilities2.JSON_PROPERTY_CAN_MOVE,
  Capabilities2.JSON_PROPERTY_CAN_CREATE_DIRECTORY,
  Capabilities2.JSON_PROPERTY_CAN_CREATE_FILE,
  Capabilities2.JSON_PROPERTY_CAN_UPLOAD,
  Capabilities2.JSON_PROPERTY_CAN_MOVE_INTO,
  Capabilities2.JSON_PROPERTY_CAN_BECOME_DROPBOX
})
@JsonTypeName("capabilities_2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Capabilities2 {
  public static final String JSON_PROPERTY_CAN_USE_FAVORITE = "can_use_favorite";
  private Boolean canUseFavorite;

  public static final String JSON_PROPERTY_CAN_BECOME_SHARELINK = "can_become_sharelink";
  private Boolean canBecomeSharelink;

  public static final String JSON_PROPERTY_CAN_USE_TEAM = "can_use_team";
  private Boolean canUseTeam;

  public static final String JSON_PROPERTY_CAN_SHOW = "can_show";
  private Boolean canShow;

  public static final String JSON_PROPERTY_CAN_READ = "can_read";
  private Boolean canRead;

  public static final String JSON_PROPERTY_CAN_WRITE = "can_write";
  private Boolean canWrite;

  public static final String JSON_PROPERTY_CAN_SHARE = "can_share";
  private Boolean canShare;

  public static final String JSON_PROPERTY_CAN_LEAVE = "can_leave";
  private Boolean canLeave;

  public static final String JSON_PROPERTY_CAN_DELETE = "can_delete";
  private Boolean canDelete;

  public static final String JSON_PROPERTY_CAN_RENAME = "can_rename";
  private Boolean canRename;

  public static final String JSON_PROPERTY_CAN_MOVE = "can_move";
  private Boolean canMove;

  public static final String JSON_PROPERTY_CAN_CREATE_DIRECTORY = "can_create_directory";
  private Boolean canCreateDirectory;

  public static final String JSON_PROPERTY_CAN_CREATE_FILE = "can_create_file";
  private Boolean canCreateFile;

  public static final String JSON_PROPERTY_CAN_UPLOAD = "can_upload";
  private Boolean canUpload;

  public static final String JSON_PROPERTY_CAN_MOVE_INTO = "can_move_into";
  private Boolean canMoveInto;

  public static final String JSON_PROPERTY_CAN_BECOME_DROPBOX = "can_become_dropbox";
  private Boolean canBecomeDropbox;

  public Capabilities2() {
  }

  public Capabilities2 canUseFavorite(Boolean canUseFavorite) {
    
    this.canUseFavorite = canUseFavorite;
    return this;
  }

   /**
   * Right to set file as favorite
   * @return canUseFavorite
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_USE_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUseFavorite() {
    return canUseFavorite;
  }


  @JsonProperty(JSON_PROPERTY_CAN_USE_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUseFavorite(Boolean canUseFavorite) {
    this.canUseFavorite = canUseFavorite;
  }


  public Capabilities2 canBecomeSharelink(Boolean canBecomeSharelink) {
    
    this.canBecomeSharelink = canBecomeSharelink;
    return this;
  }

   /**
   * Right to share file by link (share_link)
   * @return canBecomeSharelink
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_BECOME_SHARELINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanBecomeSharelink() {
    return canBecomeSharelink;
  }


  @JsonProperty(JSON_PROPERTY_CAN_BECOME_SHARELINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanBecomeSharelink(Boolean canBecomeSharelink) {
    this.canBecomeSharelink = canBecomeSharelink;
  }


  public Capabilities2 canUseTeam(Boolean canUseTeam) {
    
    this.canUseTeam = canUseTeam;
    return this;
  }

   /**
   * Right to use and give team access
   * @return canUseTeam
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_USE_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUseTeam() {
    return canUseTeam;
  }


  @JsonProperty(JSON_PROPERTY_CAN_USE_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUseTeam(Boolean canUseTeam) {
    this.canUseTeam = canUseTeam;
  }


  public Capabilities2 canShow(Boolean canShow) {
    
    this.canShow = canShow;
    return this;
  }

   /**
   * Right to see Directory information
   * @return canShow
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanShow() {
    return canShow;
  }


  @JsonProperty(JSON_PROPERTY_CAN_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanShow(Boolean canShow) {
    this.canShow = canShow;
  }


  public Capabilities2 canRead(Boolean canRead) {
    
    this.canRead = canRead;
    return this;
  }

   /**
   * Right to read Directory content
   * @return canRead
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanRead() {
    return canRead;
  }


  @JsonProperty(JSON_PROPERTY_CAN_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanRead(Boolean canRead) {
    this.canRead = canRead;
  }


  public Capabilities2 canWrite(Boolean canWrite) {
    
    this.canWrite = canWrite;
    return this;
  }

   /**
   * Right to write Directory
   * @return canWrite
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_WRITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanWrite() {
    return canWrite;
  }


  @JsonProperty(JSON_PROPERTY_CAN_WRITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanWrite(Boolean canWrite) {
    this.canWrite = canWrite;
  }


  public Capabilities2 canShare(Boolean canShare) {
    
    this.canShare = canShare;
    return this;
  }

   /**
   * Right to share Directory or manage access to Directory
   * @return canShare
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanShare() {
    return canShare;
  }


  @JsonProperty(JSON_PROPERTY_CAN_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanShare(Boolean canShare) {
    this.canShare = canShare;
  }


  public Capabilities2 canLeave(Boolean canLeave) {
    
    this.canLeave = canLeave;
    return this;
  }

   /**
   * Right to leave shared Directory
   * @return canLeave
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_LEAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanLeave() {
    return canLeave;
  }


  @JsonProperty(JSON_PROPERTY_CAN_LEAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanLeave(Boolean canLeave) {
    this.canLeave = canLeave;
  }


  public Capabilities2 canDelete(Boolean canDelete) {
    
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Right to delete Directory
   * @return canDelete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanDelete() {
    return canDelete;
  }


  @JsonProperty(JSON_PROPERTY_CAN_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }


  public Capabilities2 canRename(Boolean canRename) {
    
    this.canRename = canRename;
    return this;
  }

   /**
   * Right to rename Directory
   * @return canRename
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_RENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanRename() {
    return canRename;
  }


  @JsonProperty(JSON_PROPERTY_CAN_RENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanRename(Boolean canRename) {
    this.canRename = canRename;
  }


  public Capabilities2 canMove(Boolean canMove) {
    
    this.canMove = canMove;
    return this;
  }

   /**
   * Right to move Directory
   * @return canMove
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_MOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanMove() {
    return canMove;
  }


  @JsonProperty(JSON_PROPERTY_CAN_MOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanMove(Boolean canMove) {
    this.canMove = canMove;
  }


  public Capabilities2 canCreateDirectory(Boolean canCreateDirectory) {
    
    this.canCreateDirectory = canCreateDirectory;
    return this;
  }

   /**
   * Right to add new child directory
   * @return canCreateDirectory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_CREATE_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanCreateDirectory() {
    return canCreateDirectory;
  }


  @JsonProperty(JSON_PROPERTY_CAN_CREATE_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanCreateDirectory(Boolean canCreateDirectory) {
    this.canCreateDirectory = canCreateDirectory;
  }


  public Capabilities2 canCreateFile(Boolean canCreateFile) {
    
    this.canCreateFile = canCreateFile;
    return this;
  }

   /**
   * Right to add new child file
   * @return canCreateFile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_CREATE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanCreateFile() {
    return canCreateFile;
  }


  @JsonProperty(JSON_PROPERTY_CAN_CREATE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanCreateFile(Boolean canCreateFile) {
    this.canCreateFile = canCreateFile;
  }


  public Capabilities2 canUpload(Boolean canUpload) {
    
    this.canUpload = canUpload;
    return this;
  }

   /**
   * Right to upload a child file
   * @return canUpload
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_UPLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUpload() {
    return canUpload;
  }


  @JsonProperty(JSON_PROPERTY_CAN_UPLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUpload(Boolean canUpload) {
    this.canUpload = canUpload;
  }


  public Capabilities2 canMoveInto(Boolean canMoveInto) {
    
    this.canMoveInto = canMoveInto;
    return this;
  }

   /**
   * right to move directory
   * @return canMoveInto
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_MOVE_INTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanMoveInto() {
    return canMoveInto;
  }


  @JsonProperty(JSON_PROPERTY_CAN_MOVE_INTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanMoveInto(Boolean canMoveInto) {
    this.canMoveInto = canMoveInto;
  }


  public Capabilities2 canBecomeDropbox(Boolean canBecomeDropbox) {
    
    this.canBecomeDropbox = canBecomeDropbox;
    return this;
  }

   /**
   * Right to use convert directory into collaborative directory
   * @return canBecomeDropbox
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_BECOME_DROPBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanBecomeDropbox() {
    return canBecomeDropbox;
  }


  @JsonProperty(JSON_PROPERTY_CAN_BECOME_DROPBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanBecomeDropbox(Boolean canBecomeDropbox) {
    this.canBecomeDropbox = canBecomeDropbox;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capabilities2 capabilities2 = (Capabilities2) o;
    return Objects.equals(this.canUseFavorite, capabilities2.canUseFavorite) &&
        Objects.equals(this.canBecomeSharelink, capabilities2.canBecomeSharelink) &&
        Objects.equals(this.canUseTeam, capabilities2.canUseTeam) &&
        Objects.equals(this.canShow, capabilities2.canShow) &&
        Objects.equals(this.canRead, capabilities2.canRead) &&
        Objects.equals(this.canWrite, capabilities2.canWrite) &&
        Objects.equals(this.canShare, capabilities2.canShare) &&
        Objects.equals(this.canLeave, capabilities2.canLeave) &&
        Objects.equals(this.canDelete, capabilities2.canDelete) &&
        Objects.equals(this.canRename, capabilities2.canRename) &&
        Objects.equals(this.canMove, capabilities2.canMove) &&
        Objects.equals(this.canCreateDirectory, capabilities2.canCreateDirectory) &&
        Objects.equals(this.canCreateFile, capabilities2.canCreateFile) &&
        Objects.equals(this.canUpload, capabilities2.canUpload) &&
        Objects.equals(this.canMoveInto, capabilities2.canMoveInto) &&
        Objects.equals(this.canBecomeDropbox, capabilities2.canBecomeDropbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canUseFavorite, canBecomeSharelink, canUseTeam, canShow, canRead, canWrite, canShare, canLeave, canDelete, canRename, canMove, canCreateDirectory, canCreateFile, canUpload, canMoveInto, canBecomeDropbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capabilities2 {\n");
    sb.append("    canUseFavorite: ").append(toIndentedString(canUseFavorite)).append("\n");
    sb.append("    canBecomeSharelink: ").append(toIndentedString(canBecomeSharelink)).append("\n");
    sb.append("    canUseTeam: ").append(toIndentedString(canUseTeam)).append("\n");
    sb.append("    canShow: ").append(toIndentedString(canShow)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
    sb.append("    canShare: ").append(toIndentedString(canShare)).append("\n");
    sb.append("    canLeave: ").append(toIndentedString(canLeave)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canRename: ").append(toIndentedString(canRename)).append("\n");
    sb.append("    canMove: ").append(toIndentedString(canMove)).append("\n");
    sb.append("    canCreateDirectory: ").append(toIndentedString(canCreateDirectory)).append("\n");
    sb.append("    canCreateFile: ").append(toIndentedString(canCreateFile)).append("\n");
    sb.append("    canUpload: ").append(toIndentedString(canUpload)).append("\n");
    sb.append("    canMoveInto: ").append(toIndentedString(canMoveInto)).append("\n");
    sb.append("    canBecomeDropbox: ").append(toIndentedString(canBecomeDropbox)).append("\n");
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
