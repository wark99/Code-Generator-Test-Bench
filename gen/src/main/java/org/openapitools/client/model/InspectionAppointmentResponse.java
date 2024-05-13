/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import org.openapitools.client.model.InspectionAppointmentResponseAppointment;
import org.openapitools.client.model.InspectionAppointmentResponseType;
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import org.openapitools.client.model.PropertyInvoiceOwnerBalancePostRequestProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InspectionAppointmentResponse
 */
@JsonPropertyOrder({
  InspectionAppointmentResponse.JSON_PROPERTY_ID,
  InspectionAppointmentResponse.JSON_PROPERTY_APPOINTMENT,
  InspectionAppointmentResponse.JSON_PROPERTY_TYPE,
  InspectionAppointmentResponse.JSON_PROPERTY_PROPERTY,
  InspectionAppointmentResponse.JSON_PROPERTY_CREATED,
  InspectionAppointmentResponse.JSON_PROPERTY_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InspectionAppointmentResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_APPOINTMENT = "appointment";
  private InspectionAppointmentResponseAppointment appointment;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InspectionAppointmentResponseType type;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private PropertyInvoiceOwnerBalancePostRequestProperty property;

  public static final String JSON_PROPERTY_CREATED = "created";
  private MaintenancePost200ResponseValueCreatedDate created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private MaintenancePost200ResponseValueCreatedDate updated;

  public InspectionAppointmentResponse() {
  }

  public InspectionAppointmentResponse id(Integer id) {
    
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

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public InspectionAppointmentResponse appointment(InspectionAppointmentResponseAppointment appointment) {
    
    this.appointment = appointment;
    return this;
  }

   /**
   * Get appointment
   * @return appointment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPOINTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InspectionAppointmentResponseAppointment getAppointment() {
    return appointment;
  }


  @JsonProperty(JSON_PROPERTY_APPOINTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppointment(InspectionAppointmentResponseAppointment appointment) {
    this.appointment = appointment;
  }


  public InspectionAppointmentResponse type(InspectionAppointmentResponseType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InspectionAppointmentResponseType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InspectionAppointmentResponseType type) {
    this.type = type;
  }


  public InspectionAppointmentResponse property(PropertyInvoiceOwnerBalancePostRequestProperty property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyInvoiceOwnerBalancePostRequestProperty getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(PropertyInvoiceOwnerBalancePostRequestProperty property) {
    this.property = property;
  }


  public InspectionAppointmentResponse created(MaintenancePost200ResponseValueCreatedDate created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(MaintenancePost200ResponseValueCreatedDate created) {
    this.created = created;
  }


  public InspectionAppointmentResponse updated(MaintenancePost200ResponseValueCreatedDate updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(MaintenancePost200ResponseValueCreatedDate updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectionAppointmentResponse inspectionAppointmentResponse = (InspectionAppointmentResponse) o;
    return Objects.equals(this.id, inspectionAppointmentResponse.id) &&
        Objects.equals(this.appointment, inspectionAppointmentResponse.appointment) &&
        Objects.equals(this.type, inspectionAppointmentResponse.type) &&
        Objects.equals(this.property, inspectionAppointmentResponse.property) &&
        Objects.equals(this.created, inspectionAppointmentResponse.created) &&
        Objects.equals(this.updated, inspectionAppointmentResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appointment, type, property, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectionAppointmentResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

