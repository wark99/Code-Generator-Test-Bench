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
 * RequestBody44
 */
@JsonPropertyOrder({
  RequestBody44.JSON_PROPERTY_DRAFT_FOLDER,
  RequestBody44.JSON_PROPERTY_TRASH_FOLDER,
  RequestBody44.JSON_PROPERTY_SENT_FOLDER,
  RequestBody44.JSON_PROPERTY_SPAM_FOLDER,
  RequestBody44.JSON_PROPERTY_ARCHIVES_FOLDER,
  RequestBody44.JSON_PROPERTY_COMMERCIALS_FOLDER,
  RequestBody44.JSON_PROPERTY_SOCIAL_NETWORKS_FOLDER
})
@JsonTypeName("Request_body_44")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody44 {
  public static final String JSON_PROPERTY_DRAFT_FOLDER = "draft_folder";
  private String draftFolder;

  public static final String JSON_PROPERTY_TRASH_FOLDER = "trash_folder";
  private String trashFolder;

  public static final String JSON_PROPERTY_SENT_FOLDER = "sent_folder";
  private String sentFolder;

  public static final String JSON_PROPERTY_SPAM_FOLDER = "spam_folder";
  private String spamFolder;

  public static final String JSON_PROPERTY_ARCHIVES_FOLDER = "archives_folder";
  private String archivesFolder;

  public static final String JSON_PROPERTY_COMMERCIALS_FOLDER = "commercials_folder";
  private String commercialsFolder;

  public static final String JSON_PROPERTY_SOCIAL_NETWORKS_FOLDER = "social_networks_folder";
  private String socialNetworksFolder;

  public RequestBody44() {
  }

  public RequestBody44 draftFolder(String draftFolder) {
    
    this.draftFolder = draftFolder;
    return this;
  }

   /**
   * Draft folder name
   * @return draftFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DRAFT_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDraftFolder() {
    return draftFolder;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDraftFolder(String draftFolder) {
    this.draftFolder = draftFolder;
  }


  public RequestBody44 trashFolder(String trashFolder) {
    
    this.trashFolder = trashFolder;
    return this;
  }

   /**
   * Trash folder name
   * @return trashFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRASH_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTrashFolder() {
    return trashFolder;
  }


  @JsonProperty(JSON_PROPERTY_TRASH_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrashFolder(String trashFolder) {
    this.trashFolder = trashFolder;
  }


  public RequestBody44 sentFolder(String sentFolder) {
    
    this.sentFolder = sentFolder;
    return this;
  }

   /**
   * Sent folder name
   * @return sentFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENT_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSentFolder() {
    return sentFolder;
  }


  @JsonProperty(JSON_PROPERTY_SENT_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSentFolder(String sentFolder) {
    this.sentFolder = sentFolder;
  }


  public RequestBody44 spamFolder(String spamFolder) {
    
    this.spamFolder = spamFolder;
    return this;
  }

   /**
   * Spam folder name
   * @return spamFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SPAM_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpamFolder() {
    return spamFolder;
  }


  @JsonProperty(JSON_PROPERTY_SPAM_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpamFolder(String spamFolder) {
    this.spamFolder = spamFolder;
  }


  public RequestBody44 archivesFolder(String archivesFolder) {
    
    this.archivesFolder = archivesFolder;
    return this;
  }

   /**
   * Archives folder name
   * @return archivesFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARCHIVES_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getArchivesFolder() {
    return archivesFolder;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVES_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArchivesFolder(String archivesFolder) {
    this.archivesFolder = archivesFolder;
  }


  public RequestBody44 commercialsFolder(String commercialsFolder) {
    
    this.commercialsFolder = commercialsFolder;
    return this;
  }

   /**
   * Folder for Commercial emails filter
   * @return commercialsFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMERCIALS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCommercialsFolder() {
    return commercialsFolder;
  }


  @JsonProperty(JSON_PROPERTY_COMMERCIALS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommercialsFolder(String commercialsFolder) {
    this.commercialsFolder = commercialsFolder;
  }


  public RequestBody44 socialNetworksFolder(String socialNetworksFolder) {
    
    this.socialNetworksFolder = socialNetworksFolder;
    return this;
  }

   /**
   * Folder for SocialNetwork emails filter
   * @return socialNetworksFolder
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOCIAL_NETWORKS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSocialNetworksFolder() {
    return socialNetworksFolder;
  }


  @JsonProperty(JSON_PROPERTY_SOCIAL_NETWORKS_FOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSocialNetworksFolder(String socialNetworksFolder) {
    this.socialNetworksFolder = socialNetworksFolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody44 requestBody44 = (RequestBody44) o;
    return Objects.equals(this.draftFolder, requestBody44.draftFolder) &&
        Objects.equals(this.trashFolder, requestBody44.trashFolder) &&
        Objects.equals(this.sentFolder, requestBody44.sentFolder) &&
        Objects.equals(this.spamFolder, requestBody44.spamFolder) &&
        Objects.equals(this.archivesFolder, requestBody44.archivesFolder) &&
        Objects.equals(this.commercialsFolder, requestBody44.commercialsFolder) &&
        Objects.equals(this.socialNetworksFolder, requestBody44.socialNetworksFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftFolder, trashFolder, sentFolder, spamFolder, archivesFolder, commercialsFolder, socialNetworksFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody44 {\n");
    sb.append("    draftFolder: ").append(toIndentedString(draftFolder)).append("\n");
    sb.append("    trashFolder: ").append(toIndentedString(trashFolder)).append("\n");
    sb.append("    sentFolder: ").append(toIndentedString(sentFolder)).append("\n");
    sb.append("    spamFolder: ").append(toIndentedString(spamFolder)).append("\n");
    sb.append("    archivesFolder: ").append(toIndentedString(archivesFolder)).append("\n");
    sb.append("    commercialsFolder: ").append(toIndentedString(commercialsFolder)).append("\n");
    sb.append("    socialNetworksFolder: ").append(toIndentedString(socialNetworksFolder)).append("\n");
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

