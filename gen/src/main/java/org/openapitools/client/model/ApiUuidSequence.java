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
import java.math.BigDecimal;
import java.util.UUID;
import org.openapitools.client.model.Datetime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UuidSequence
 */
@JsonPropertyOrder({
  ApiUuidSequence.JSON_PROPERTY_UUID,
  ApiUuidSequence.JSON_PROPERTY_MODEL_TYPE,
  ApiUuidSequence.JSON_PROPERTY_MODEL_ID,
  ApiUuidSequence.JSON_PROPERTY_CREATED_AT,
  ApiUuidSequence.JSON_PROPERTY_MODEL,
  ApiUuidSequence.JSON_PROPERTY_UUID_SEQUENCE,
  ApiUuidSequence.JSON_PROPERTY_ID
})
@JsonTypeName("Api_UuidSequence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ApiUuidSequence {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_MODEL_TYPE = "model_type";
  private String modelType;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private BigDecimal modelId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Datetime createdAt = null;

  public static final String JSON_PROPERTY_MODEL = "model";
  private ApiUuidSequence model;

  public static final String JSON_PROPERTY_UUID_SEQUENCE = "uuidSequence";
  private ApiUuidSequence uuidSequence;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public ApiUuidSequence() {
  }

  public ApiUuidSequence uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ApiUuidSequence modelType(String modelType) {
    
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelType() {
    return modelType;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelType(String modelType) {
    this.modelType = modelType;
  }


  public ApiUuidSequence modelId(BigDecimal modelId) {
    
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getModelId() {
    return modelId;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelId(BigDecimal modelId) {
    this.modelId = modelId;
  }


  public ApiUuidSequence createdAt(Datetime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Datetime createdAt) {
    this.createdAt = createdAt;
  }


  public ApiUuidSequence model(ApiUuidSequence model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiUuidSequence getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModel(ApiUuidSequence model) {
    this.model = model;
  }


  public ApiUuidSequence uuidSequence(ApiUuidSequence uuidSequence) {
    
    this.uuidSequence = uuidSequence;
    return this;
  }

   /**
   * 
   * @return uuidSequence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiUuidSequence getUuidSequence() {
    return uuidSequence;
  }


  @JsonProperty(JSON_PROPERTY_UUID_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuidSequence(ApiUuidSequence uuidSequence) {
    this.uuidSequence = uuidSequence;
  }


  public ApiUuidSequence id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUuidSequence apiUuidSequence = (ApiUuidSequence) o;
    return Objects.equals(this.uuid, apiUuidSequence.uuid) &&
        Objects.equals(this.modelType, apiUuidSequence.modelType) &&
        Objects.equals(this.modelId, apiUuidSequence.modelId) &&
        Objects.equals(this.createdAt, apiUuidSequence.createdAt) &&
        Objects.equals(this.model, apiUuidSequence.model) &&
        Objects.equals(this.uuidSequence, apiUuidSequence.uuidSequence) &&
        Objects.equals(this.id, apiUuidSequence.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, modelType, modelId, createdAt, model, uuidSequence, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUuidSequence {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    uuidSequence: ").append(toIndentedString(uuidSequence)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
