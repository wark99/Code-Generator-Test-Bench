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
import org.openapitools.client.model.Directory;
import org.openapitools.client.model.Sanitizer;
import org.openapitools.client.model.Summary;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rewind
 */
@JsonPropertyOrder({
  Rewind.JSON_PROPERTY_ID,
  Rewind.JSON_PROPERTY_STATUS,
  Rewind.JSON_PROPERTY_MODE,
  Rewind.JSON_PROPERTY_ARCHIVING,
  Rewind.JSON_PROPERTY_DIRECTORY_ID,
  Rewind.JSON_PROPERTY_DIRECTORY,
  Rewind.JSON_PROPERTY_DIRECTORY_NAME,
  Rewind.JSON_PROPERTY_USER_ID,
  Rewind.JSON_PROPERTY_REWIND_AT,
  Rewind.JSON_PROPERTY_CREATED_AT,
  Rewind.JSON_PROPERTY_FINISHED_AT,
  Rewind.JSON_PROPERTY_EXPIRES_AT,
  Rewind.JSON_PROPERTY_CREATED_BY,
  Rewind.JSON_PROPERTY_IS_APPROVED,
  Rewind.JSON_PROPERTY_APPROVAL_AT,
  Rewind.JSON_PROPERTY_REWIND_NAME,
  Rewind.JSON_PROPERTY_SANITIZER,
  Rewind.JSON_PROPERTY_SUMMARY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Rewind {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  /**
   * Rewind status.&lt;note&gt;&lt;strong&gt;canceled&lt;/strong&gt;: Rewind was canceled by the user and deleted.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;done&lt;/strong&gt;: Rewind completed successfully.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;drive_not_ready&lt;/strong&gt;: Rewind cannot start because the drive was not ready (uploads or actions in progress).&lt;/note&gt;&lt;note&gt;&lt;strong&gt;expired&lt;/strong&gt;: Rewind has expired and deleted.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;failed&lt;/strong&gt;: Rewind completed with errors.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;in_progress&lt;/strong&gt;: Rewind is currently in progress.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;new&lt;/strong&gt;: Rewind did not start.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;sanitizing&lt;/strong&gt;: Rewind find the activity to sanitize.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;waiting_approval&lt;/strong&gt;: Rewind waiting user approval to continue.&lt;/note&gt;
   */
  public enum StatusEnum {
    CANCELED("canceled"),
    
    DONE("done"),
    
    DRIVE_NOT_READY("drive_not_ready"),
    
    EXPIRED("expired"),
    
    FAILED("failed"),
    
    IN_PROGRESS("in_progress"),
    
    NEW("new"),
    
    SANITIZING("sanitizing"),
    
    WAITING_APPROVAL("waiting_approval");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * Rewind type.&lt;note&gt;&lt;strong&gt;directory&lt;/strong&gt;: Rewind only a directory.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;drive&lt;/strong&gt;: Rewind all the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;user&lt;/strong&gt;: Rewind a user&#39;s private folder.&lt;/note&gt;
   */
  public enum ModeEnum {
    DIRECTORY("directory"),
    
    DRIVE("drive"),
    
    USER("user");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODE = "mode";
  private ModeEnum mode;

  /**
   * Rewind archive mode, all created files between now and the rewind date will be set to trash or to an archive depending on the mode selected.&lt;note&gt;&lt;strong&gt;all&lt;/strong&gt;: Keep in an archive folder the current or trashed files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;current&lt;/strong&gt;: Keep in an archive folder the current files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;none&lt;/strong&gt;: Don&#39;t build an archive, trash all created files.&lt;/note&gt;
   */
  public enum ArchivingEnum {
    ALL("all"),
    
    CURRENT("current"),
    
    NONE("none");

    private String value;

    ArchivingEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArchivingEnum fromValue(String value) {
      for (ArchivingEnum b : ArchivingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ARCHIVING = "archiving";
  private ArchivingEnum archiving;

  public static final String JSON_PROPERTY_DIRECTORY_ID = "directory_id";
  private Integer directoryId;

  public static final String JSON_PROPERTY_DIRECTORY = "directory";
  private Directory directory;

  public static final String JSON_PROPERTY_DIRECTORY_NAME = "directory_name";
  private String directoryName;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_REWIND_AT = "rewind_at";
  private Integer rewindAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Integer finishedAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Integer expiresAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private Integer createdBy;

  public static final String JSON_PROPERTY_IS_APPROVED = "is_approved";
  private Boolean isApproved;

  public static final String JSON_PROPERTY_APPROVAL_AT = "approval_at";
  private Integer approvalAt;

  public static final String JSON_PROPERTY_REWIND_NAME = "rewind_name";
  private String rewindName;

  public static final String JSON_PROPERTY_SANITIZER = "sanitizer";
  private Sanitizer sanitizer;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private Summary summary;

  public Rewind() {
  }

  public Rewind id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Rewind identifier
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


  public Rewind status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Rewind status.&lt;note&gt;&lt;strong&gt;canceled&lt;/strong&gt;: Rewind was canceled by the user and deleted.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;done&lt;/strong&gt;: Rewind completed successfully.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;drive_not_ready&lt;/strong&gt;: Rewind cannot start because the drive was not ready (uploads or actions in progress).&lt;/note&gt;&lt;note&gt;&lt;strong&gt;expired&lt;/strong&gt;: Rewind has expired and deleted.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;failed&lt;/strong&gt;: Rewind completed with errors.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;in_progress&lt;/strong&gt;: Rewind is currently in progress.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;new&lt;/strong&gt;: Rewind did not start.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;sanitizing&lt;/strong&gt;: Rewind find the activity to sanitize.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;waiting_approval&lt;/strong&gt;: Rewind waiting user approval to continue.&lt;/note&gt;
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Rewind mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Rewind type.&lt;note&gt;&lt;strong&gt;directory&lt;/strong&gt;: Rewind only a directory.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;drive&lt;/strong&gt;: Rewind all the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;user&lt;/strong&gt;: Rewind a user&#39;s private folder.&lt;/note&gt;
   * @return mode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public Rewind archiving(ArchivingEnum archiving) {
    
    this.archiving = archiving;
    return this;
  }

   /**
   * Rewind archive mode, all created files between now and the rewind date will be set to trash or to an archive depending on the mode selected.&lt;note&gt;&lt;strong&gt;all&lt;/strong&gt;: Keep in an archive folder the current or trashed files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;current&lt;/strong&gt;: Keep in an archive folder the current files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;none&lt;/strong&gt;: Don&#39;t build an archive, trash all created files.&lt;/note&gt;
   * @return archiving
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARCHIVING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ArchivingEnum getArchiving() {
    return archiving;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArchiving(ArchivingEnum archiving) {
    this.archiving = archiving;
  }


  public Rewind directoryId(Integer directoryId) {
    
    this.directoryId = directoryId;
    return this;
  }

   /**
   * The targeted directory of the rewind &lt;note&gt;Filled only in directory and user mode&lt;/note&gt;
   * @return directoryId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIRECTORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDirectoryId() {
    return directoryId;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirectoryId(Integer directoryId) {
    this.directoryId = directoryId;
  }


  public Rewind directory(Directory directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Directory getDirectory() {
    return directory;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectory(Directory directory) {
    this.directory = directory;
  }


  public Rewind directoryName(String directoryName) {
    
    this.directoryName = directoryName;
    return this;
  }

   /**
   * The name of the directory selected when the directory mode is selected
   * @return directoryName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirectoryName() {
    return directoryName;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoryName(String directoryName) {
    this.directoryName = directoryName;
  }


  public Rewind userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The targeted user of the rewind &lt;note&gt;Filled only in user mode&lt;/note&gt;
   * @return userId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Rewind rewindAt(Integer rewindAt) {
    
    this.rewindAt = rewindAt;
    return this;
  }

   /**
   * Rewind at
   * @return rewindAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REWIND_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRewindAt() {
    return rewindAt;
  }


  @JsonProperty(JSON_PROPERTY_REWIND_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewindAt(Integer rewindAt) {
    this.rewindAt = rewindAt;
  }


  public Rewind createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * created at
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


  public Rewind finishedAt(Integer finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * when the rewind is executed the finished process time is save here
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFinishedAt() {
    return finishedAt;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
  }


  public Rewind expiresAt(Integer expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Date of the rewind approval
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Rewind createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * created by the user
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public Rewind isApproved(Boolean isApproved) {
    
    this.isApproved = isApproved;
    return this;
  }

   /**
   * Rewind approved by the user
   * @return isApproved
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_APPROVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsApproved() {
    return isApproved;
  }


  @JsonProperty(JSON_PROPERTY_IS_APPROVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsApproved(Boolean isApproved) {
    this.isApproved = isApproved;
  }


  public Rewind approvalAt(Integer approvalAt) {
    
    this.approvalAt = approvalAt;
    return this;
  }

   /**
   * Date of the rewind approval
   * @return approvalAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPROVAL_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getApprovalAt() {
    return approvalAt;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApprovalAt(Integer approvalAt) {
    this.approvalAt = approvalAt;
  }


  public Rewind rewindName(String rewindName) {
    
    this.rewindName = rewindName;
    return this;
  }

   /**
   * The name of the directory choose during approval step
   * @return rewindName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REWIND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRewindName() {
    return rewindName;
  }


  @JsonProperty(JSON_PROPERTY_REWIND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewindName(String rewindName) {
    this.rewindName = rewindName;
  }


  public Rewind sanitizer(Sanitizer sanitizer) {
    
    this.sanitizer = sanitizer;
    return this;
  }

   /**
   * Get sanitizer
   * @return sanitizer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SANITIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Sanitizer getSanitizer() {
    return sanitizer;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizer(Sanitizer sanitizer) {
    this.sanitizer = sanitizer;
  }


  public Rewind summary(Summary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Summary getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rewind rewind = (Rewind) o;
    return Objects.equals(this.id, rewind.id) &&
        Objects.equals(this.status, rewind.status) &&
        Objects.equals(this.mode, rewind.mode) &&
        Objects.equals(this.archiving, rewind.archiving) &&
        Objects.equals(this.directoryId, rewind.directoryId) &&
        Objects.equals(this.directory, rewind.directory) &&
        Objects.equals(this.directoryName, rewind.directoryName) &&
        Objects.equals(this.userId, rewind.userId) &&
        Objects.equals(this.rewindAt, rewind.rewindAt) &&
        Objects.equals(this.createdAt, rewind.createdAt) &&
        Objects.equals(this.finishedAt, rewind.finishedAt) &&
        Objects.equals(this.expiresAt, rewind.expiresAt) &&
        Objects.equals(this.createdBy, rewind.createdBy) &&
        Objects.equals(this.isApproved, rewind.isApproved) &&
        Objects.equals(this.approvalAt, rewind.approvalAt) &&
        Objects.equals(this.rewindName, rewind.rewindName) &&
        Objects.equals(this.sanitizer, rewind.sanitizer) &&
        Objects.equals(this.summary, rewind.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, mode, archiving, directoryId, directory, directoryName, userId, rewindAt, createdAt, finishedAt, expiresAt, createdBy, isApproved, approvalAt, rewindName, sanitizer, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rewind {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    archiving: ").append(toIndentedString(archiving)).append("\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    directoryName: ").append(toIndentedString(directoryName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    rewindAt: ").append(toIndentedString(rewindAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    approvalAt: ").append(toIndentedString(approvalAt)).append("\n");
    sb.append("    rewindName: ").append(toIndentedString(rewindName)).append("\n");
    sb.append("    sanitizer: ").append(toIndentedString(sanitizer)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
