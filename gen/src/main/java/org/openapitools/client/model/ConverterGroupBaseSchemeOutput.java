/*
 * AIRBIT IoT Workspace REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
 *
 * The version of the OpenAPI document: 2.0.1
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
import org.openapitools.client.model.AddressNodeNormSchemeCreator;
import org.openapitools.client.model.CompanyId;
import org.openapitools.client.model.Created;
import org.openapitools.client.model.Status;
import org.openapitools.client.model.Updated;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConverterGroupBaseSchemeOutput
 */
@JsonPropertyOrder({
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_COMPANY_ID,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_STATUS,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_CREATED,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_CREATOR,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_UPDATED,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_UPDATER,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_ID,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_NAME,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_DATA_FORMAT_INPUT,
  ConverterGroupBaseSchemeOutput.JSON_PROPERTY_DATA_FORMAT_OUTPUT
})
@JsonTypeName("ConverterGroupBaseScheme-Output")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConverterGroupBaseSchemeOutput {
  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private CompanyId companyId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_CREATED = "created";
  private Created created;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private AddressNodeNormSchemeCreator creator;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private Updated updated;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private AddressNodeNormSchemeCreator updater;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATA_FORMAT_INPUT = "data_format_input";
  private String dataFormatInput;

  public static final String JSON_PROPERTY_DATA_FORMAT_OUTPUT = "data_format_output";
  private String dataFormatOutput;

  public ConverterGroupBaseSchemeOutput() {
  }

  public ConverterGroupBaseSchemeOutput companyId(CompanyId companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CompanyId getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyId(CompanyId companyId) {
    this.companyId = companyId;
  }


  public ConverterGroupBaseSchemeOutput status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * status (1 - Inactive, 2 - Active)
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Status status) {
    this.status = status;
  }


  public ConverterGroupBaseSchemeOutput created(Created created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Created getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(Created created) {
    this.created = created;
  }


  public ConverterGroupBaseSchemeOutput creator(AddressNodeNormSchemeCreator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddressNodeNormSchemeCreator getCreator() {
    return creator;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreator(AddressNodeNormSchemeCreator creator) {
    this.creator = creator;
  }


  public ConverterGroupBaseSchemeOutput updated(Updated updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Updated getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdated(Updated updated) {
    this.updated = updated;
  }


  public ConverterGroupBaseSchemeOutput updater(AddressNodeNormSchemeCreator updater) {
    
    this.updater = updater;
    return this;
  }

   /**
   * Get updater
   * @return updater
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddressNodeNormSchemeCreator getUpdater() {
    return updater;
  }


  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdater(AddressNodeNormSchemeCreator updater) {
    this.updater = updater;
  }


  public ConverterGroupBaseSchemeOutput id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * unique data converter group id
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


  public ConverterGroupBaseSchemeOutput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * data converter group name
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


  public ConverterGroupBaseSchemeOutput dataFormatInput(String dataFormatInput) {
    
    this.dataFormatInput = dataFormatInput;
    return this;
  }

   /**
   * Input data format
   * @return dataFormatInput
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_FORMAT_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDataFormatInput() {
    return dataFormatInput;
  }


  @JsonProperty(JSON_PROPERTY_DATA_FORMAT_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataFormatInput(String dataFormatInput) {
    this.dataFormatInput = dataFormatInput;
  }


  public ConverterGroupBaseSchemeOutput dataFormatOutput(String dataFormatOutput) {
    
    this.dataFormatOutput = dataFormatOutput;
    return this;
  }

   /**
   * Output data format
   * @return dataFormatOutput
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_FORMAT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDataFormatOutput() {
    return dataFormatOutput;
  }


  @JsonProperty(JSON_PROPERTY_DATA_FORMAT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataFormatOutput(String dataFormatOutput) {
    this.dataFormatOutput = dataFormatOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConverterGroupBaseSchemeOutput converterGroupBaseSchemeOutput = (ConverterGroupBaseSchemeOutput) o;
    return Objects.equals(this.companyId, converterGroupBaseSchemeOutput.companyId) &&
        Objects.equals(this.status, converterGroupBaseSchemeOutput.status) &&
        Objects.equals(this.created, converterGroupBaseSchemeOutput.created) &&
        Objects.equals(this.creator, converterGroupBaseSchemeOutput.creator) &&
        Objects.equals(this.updated, converterGroupBaseSchemeOutput.updated) &&
        Objects.equals(this.updater, converterGroupBaseSchemeOutput.updater) &&
        Objects.equals(this.id, converterGroupBaseSchemeOutput.id) &&
        Objects.equals(this.name, converterGroupBaseSchemeOutput.name) &&
        Objects.equals(this.dataFormatInput, converterGroupBaseSchemeOutput.dataFormatInput) &&
        Objects.equals(this.dataFormatOutput, converterGroupBaseSchemeOutput.dataFormatOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, status, created, creator, updated, updater, id, name, dataFormatInput, dataFormatOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConverterGroupBaseSchemeOutput {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataFormatInput: ").append(toIndentedString(dataFormatInput)).append("\n");
    sb.append("    dataFormatOutput: ").append(toIndentedString(dataFormatOutput)).append("\n");
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

