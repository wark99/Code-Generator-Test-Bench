/*
 * Customers Communications Service - OpenAPI 3.1.0
 * Сервис, отвечающий за внешние коммуникации с клиентами компании.
 *
 * The version of the OpenAPI document: 0.0.1
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TopicManager
 */
@JsonPropertyOrder({
  TopicManager.JSON_PROPERTY_ID,
  TopicManager.JSON_PROPERTY_USER_UUID,
  TopicManager.JSON_PROPERTY_TOPIC_ID,
  TopicManager.JSON_PROPERTY_UNASSIGNED_SINCE,
  TopicManager.JSON_PROPERTY_ASSIGNED_SINCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:58.322050771Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopicManager {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_USER_UUID = "userUuid";
  private String userUuid;

  public static final String JSON_PROPERTY_TOPIC_ID = "topicId";
  private Long topicId;

  public static final String JSON_PROPERTY_UNASSIGNED_SINCE = "unassignedSince";
  private OffsetDateTime unassignedSince;

  public static final String JSON_PROPERTY_ASSIGNED_SINCE = "assignedSince";
  private OffsetDateTime assignedSince;

  public TopicManager() {
  }

  public TopicManager id(Long id) {
    
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

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Long id) {
    this.id = id;
  }


  public TopicManager userUuid(String userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserUuid() {
    return userUuid;
  }


  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public TopicManager topicId(Long topicId) {
    
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTopicId() {
    return topicId;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopicId(Long topicId) {
    this.topicId = topicId;
  }


  public TopicManager unassignedSince(OffsetDateTime unassignedSince) {
    
    this.unassignedSince = unassignedSince;
    return this;
  }

   /**
   * Get unassignedSince
   * @return unassignedSince
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNASSIGNED_SINCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUnassignedSince() {
    return unassignedSince;
  }


  @JsonProperty(JSON_PROPERTY_UNASSIGNED_SINCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnassignedSince(OffsetDateTime unassignedSince) {
    this.unassignedSince = unassignedSince;
  }


  public TopicManager assignedSince(OffsetDateTime assignedSince) {
    
    this.assignedSince = assignedSince;
    return this;
  }

   /**
   * Get assignedSince
   * @return assignedSince
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ASSIGNED_SINCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getAssignedSince() {
    return assignedSince;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_SINCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignedSince(OffsetDateTime assignedSince) {
    this.assignedSince = assignedSince;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicManager topicManager = (TopicManager) o;
    return Objects.equals(this.id, topicManager.id) &&
        Objects.equals(this.userUuid, topicManager.userUuid) &&
        Objects.equals(this.topicId, topicManager.topicId) &&
        Objects.equals(this.unassignedSince, topicManager.unassignedSince) &&
        Objects.equals(this.assignedSince, topicManager.assignedSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userUuid, topicId, unassignedSince, assignedSince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicManager {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    unassignedSince: ").append(toIndentedString(unassignedSince)).append("\n");
    sb.append("    assignedSince: ").append(toIndentedString(assignedSince)).append("\n");
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

