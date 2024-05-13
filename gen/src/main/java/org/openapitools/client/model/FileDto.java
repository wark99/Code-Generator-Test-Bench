/*
 * FiledgrDigiCertAPI
 * The API to be used by digital certificate websites in the Filedgr format
 *
 * The version of the OpenAPI document: 0.4.0
 * 
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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.Cid;
import org.openapitools.client.model.FileAttachmentStatus;
import org.openapitools.client.model.Hash;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FileDto
 */
@JsonPropertyOrder({
  FileDto.JSON_PROPERTY_ID,
  FileDto.JSON_PROPERTY_FILENAME,
  FileDto.JSON_PROPERTY_MIMETYPE,
  FileDto.JSON_PROPERTY_CREATED_AT,
  FileDto.JSON_PROPERTY_STATUS,
  FileDto.JSON_PROPERTY_HASH,
  FileDto.JSON_PROPERTY_SIZE,
  FileDto.JSON_PROPERTY_CID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:43.391813307Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FileDto {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_MIMETYPE = "mimetype";
  private String mimetype;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FileAttachmentStatus status = FileAttachmentStatus.UPLOAD_PENDING;

  public static final String JSON_PROPERTY_HASH = "hash";
  private Hash hash;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_CID = "cid";
  private Cid cid = ;

  public FileDto() {
  }

  public FileDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public FileDto filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public FileDto mimetype(String mimetype) {
    
    this.mimetype = mimetype;
    return this;
  }

   /**
   * Get mimetype
   * @return mimetype
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MIMETYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMimetype() {
    return mimetype;
  }


  @JsonProperty(JSON_PROPERTY_MIMETYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMimetype(String mimetype) {
    this.mimetype = mimetype;
  }


  public FileDto createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public FileDto status(FileAttachmentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileAttachmentStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(FileAttachmentStatus status) {
    this.status = status;
  }


  public FileDto hash(Hash hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Hash getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHash(Hash hash) {
    this.hash = hash;
  }


  public FileDto size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public FileDto cid(Cid cid) {
    
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Cid getCid() {
    return cid;
  }


  @JsonProperty(JSON_PROPERTY_CID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCid(Cid cid) {
    this.cid = cid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDto fileDto = (FileDto) o;
    return Objects.equals(this.id, fileDto.id) &&
        Objects.equals(this.filename, fileDto.filename) &&
        Objects.equals(this.mimetype, fileDto.mimetype) &&
        Objects.equals(this.createdAt, fileDto.createdAt) &&
        Objects.equals(this.status, fileDto.status) &&
        Objects.equals(this.hash, fileDto.hash) &&
        Objects.equals(this.size, fileDto.size) &&
        Objects.equals(this.cid, fileDto.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filename, mimetype, createdAt, status, hash, size, cid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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

