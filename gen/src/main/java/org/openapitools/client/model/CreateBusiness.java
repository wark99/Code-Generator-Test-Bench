/*
 * CRM Cotización
 * CRM Cotización
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.Description;
import org.openapitools.client.model.Operatorid;
import org.openapitools.client.model.Pipelinephaseid;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateBusiness
 */
@JsonPropertyOrder({
  CreateBusiness.JSON_PROPERTY_NAME,
  CreateBusiness.JSON_PROPERTY_DESCRIPTION,
  CreateBusiness.JSON_PROPERTY_PIPELINE_ID,
  CreateBusiness.JSON_PROPERTY_PIPELINE_PHASE_ID,
  CreateBusiness.JSON_PROPERTY_CONTACT_ID,
  CreateBusiness.JSON_PROPERTY_OPERATOR_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:21.037021681Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateBusiness {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Description description;

  public static final String JSON_PROPERTY_PIPELINE_ID = "pipelineId";
  private String pipelineId;

  public static final String JSON_PROPERTY_PIPELINE_PHASE_ID = "pipelinePhaseId";
  private Pipelinephaseid pipelinePhaseId;

  public static final String JSON_PROPERTY_CONTACT_ID = "contactId";
  private String contactId;

  public static final String JSON_PROPERTY_OPERATOR_ID = "operatorId";
  private Operatorid operatorId;

  public CreateBusiness() {
  }

  public CreateBusiness name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateBusiness description(Description description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Description getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(Description description) {
    this.description = description;
  }


  public CreateBusiness pipelineId(String pipelineId) {
    
    this.pipelineId = pipelineId;
    return this;
  }

   /**
   * Get pipelineId
   * @return pipelineId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPipelineId() {
    return pipelineId;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
  }


  public CreateBusiness pipelinePhaseId(Pipelinephaseid pipelinePhaseId) {
    
    this.pipelinePhaseId = pipelinePhaseId;
    return this;
  }

   /**
   * Get pipelinePhaseId
   * @return pipelinePhaseId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE_PHASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pipelinephaseid getPipelinePhaseId() {
    return pipelinePhaseId;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_PHASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPipelinePhaseId(Pipelinephaseid pipelinePhaseId) {
    this.pipelinePhaseId = pipelinePhaseId;
  }


  public CreateBusiness contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContactId() {
    return contactId;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public CreateBusiness operatorId(Operatorid operatorId) {
    
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Operatorid getOperatorId() {
    return operatorId;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatorId(Operatorid operatorId) {
    this.operatorId = operatorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBusiness createBusiness = (CreateBusiness) o;
    return Objects.equals(this.name, createBusiness.name) &&
        Objects.equals(this.description, createBusiness.description) &&
        Objects.equals(this.pipelineId, createBusiness.pipelineId) &&
        Objects.equals(this.pipelinePhaseId, createBusiness.pipelinePhaseId) &&
        Objects.equals(this.contactId, createBusiness.contactId) &&
        Objects.equals(this.operatorId, createBusiness.operatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, pipelineId, pipelinePhaseId, contactId, operatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBusiness {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    pipelinePhaseId: ").append(toIndentedString(pipelinePhaseId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
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

