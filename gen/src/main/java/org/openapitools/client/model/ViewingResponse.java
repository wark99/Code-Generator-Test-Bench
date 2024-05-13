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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ExtendedLinkedPropertyResponse;
import org.openapitools.client.model.LinkedEmployeeResponse;
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import org.openapitools.client.model.ViewerResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ViewingResponse
 */
@JsonPropertyOrder({
  ViewingResponse.JSON_PROPERTY_ID,
  ViewingResponse.JSON_PROPERTY_DATE,
  ViewingResponse.JSON_PROPERTY_START_TIME,
  ViewingResponse.JSON_PROPERTY_END_TIME,
  ViewingResponse.JSON_PROPERTY_COMPLETE,
  ViewingResponse.JSON_PROPERTY_PRE_VIEWING_NOTES,
  ViewingResponse.JSON_PROPERTY_POST_VIEWING_NOTES,
  ViewingResponse.JSON_PROPERTY_VIEWERS,
  ViewingResponse.JSON_PROPERTY_LINKED_PROPERTY,
  ViewingResponse.JSON_PROPERTY_ASSIGNED_EMPLOYEE,
  ViewingResponse.JSON_PROPERTY_REPORTED_BY_EMPLOYEE,
  ViewingResponse.JSON_PROPERTY_CREATED,
  ViewingResponse.JSON_PROPERTY_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ViewingResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_DATE = "date";
  private MaintenancePost200ResponseValueCreatedDate date;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private String endTime;

  public static final String JSON_PROPERTY_COMPLETE = "complete";
  private Boolean complete;

  public static final String JSON_PROPERTY_PRE_VIEWING_NOTES = "pre-viewing_notes";
  private String preViewingNotes;

  public static final String JSON_PROPERTY_POST_VIEWING_NOTES = "post-viewing_notes";
  private String postViewingNotes;

  public static final String JSON_PROPERTY_VIEWERS = "viewers";
  private List<ViewerResponse> viewers;

  public static final String JSON_PROPERTY_LINKED_PROPERTY = "linked_property";
  private ExtendedLinkedPropertyResponse linkedProperty;

  public static final String JSON_PROPERTY_ASSIGNED_EMPLOYEE = "assigned_employee";
  private LinkedEmployeeResponse assignedEmployee;

  public static final String JSON_PROPERTY_REPORTED_BY_EMPLOYEE = "reported_by_employee";
  private LinkedEmployeeResponse reportedByEmployee;

  public static final String JSON_PROPERTY_CREATED = "created";
  private MaintenancePost200ResponseValueCreatedDate created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private MaintenancePost200ResponseValueCreatedDate updated;

  public ViewingResponse() {
  }

  public ViewingResponse id(Integer id) {
    
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


  public ViewingResponse date(MaintenancePost200ResponseValueCreatedDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(MaintenancePost200ResponseValueCreatedDate date) {
    this.date = date;
  }


  public ViewingResponse startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ViewingResponse endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ViewingResponse complete(Boolean complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComplete() {
    return complete;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  public ViewingResponse preViewingNotes(String preViewingNotes) {
    
    this.preViewingNotes = preViewingNotes;
    return this;
  }

   /**
   * Get preViewingNotes
   * @return preViewingNotes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_VIEWING_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreViewingNotes() {
    return preViewingNotes;
  }


  @JsonProperty(JSON_PROPERTY_PRE_VIEWING_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreViewingNotes(String preViewingNotes) {
    this.preViewingNotes = preViewingNotes;
  }


  public ViewingResponse postViewingNotes(String postViewingNotes) {
    
    this.postViewingNotes = postViewingNotes;
    return this;
  }

   /**
   * Get postViewingNotes
   * @return postViewingNotes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_VIEWING_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostViewingNotes() {
    return postViewingNotes;
  }


  @JsonProperty(JSON_PROPERTY_POST_VIEWING_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostViewingNotes(String postViewingNotes) {
    this.postViewingNotes = postViewingNotes;
  }


  public ViewingResponse viewers(List<ViewerResponse> viewers) {
    
    this.viewers = viewers;
    return this;
  }

  public ViewingResponse addViewersItem(ViewerResponse viewersItem) {
    if (this.viewers == null) {
      this.viewers = new ArrayList<>();
    }
    this.viewers.add(viewersItem);
    return this;
  }

   /**
   * Get viewers
   * @return viewers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ViewerResponse> getViewers() {
    return viewers;
  }


  @JsonProperty(JSON_PROPERTY_VIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewers(List<ViewerResponse> viewers) {
    this.viewers = viewers;
  }


  public ViewingResponse linkedProperty(ExtendedLinkedPropertyResponse linkedProperty) {
    
    this.linkedProperty = linkedProperty;
    return this;
  }

   /**
   * Get linkedProperty
   * @return linkedProperty
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtendedLinkedPropertyResponse getLinkedProperty() {
    return linkedProperty;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedProperty(ExtendedLinkedPropertyResponse linkedProperty) {
    this.linkedProperty = linkedProperty;
  }


  public ViewingResponse assignedEmployee(LinkedEmployeeResponse assignedEmployee) {
    
    this.assignedEmployee = assignedEmployee;
    return this;
  }

   /**
   * Get assignedEmployee
   * @return assignedEmployee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_EMPLOYEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinkedEmployeeResponse getAssignedEmployee() {
    return assignedEmployee;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_EMPLOYEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedEmployee(LinkedEmployeeResponse assignedEmployee) {
    this.assignedEmployee = assignedEmployee;
  }


  public ViewingResponse reportedByEmployee(LinkedEmployeeResponse reportedByEmployee) {
    
    this.reportedByEmployee = reportedByEmployee;
    return this;
  }

   /**
   * Get reportedByEmployee
   * @return reportedByEmployee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORTED_BY_EMPLOYEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinkedEmployeeResponse getReportedByEmployee() {
    return reportedByEmployee;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED_BY_EMPLOYEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedByEmployee(LinkedEmployeeResponse reportedByEmployee) {
    this.reportedByEmployee = reportedByEmployee;
  }


  public ViewingResponse created(MaintenancePost200ResponseValueCreatedDate created) {
    
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


  public ViewingResponse updated(MaintenancePost200ResponseValueCreatedDate updated) {
    
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
    ViewingResponse viewingResponse = (ViewingResponse) o;
    return Objects.equals(this.id, viewingResponse.id) &&
        Objects.equals(this.date, viewingResponse.date) &&
        Objects.equals(this.startTime, viewingResponse.startTime) &&
        Objects.equals(this.endTime, viewingResponse.endTime) &&
        Objects.equals(this.complete, viewingResponse.complete) &&
        Objects.equals(this.preViewingNotes, viewingResponse.preViewingNotes) &&
        Objects.equals(this.postViewingNotes, viewingResponse.postViewingNotes) &&
        Objects.equals(this.viewers, viewingResponse.viewers) &&
        Objects.equals(this.linkedProperty, viewingResponse.linkedProperty) &&
        Objects.equals(this.assignedEmployee, viewingResponse.assignedEmployee) &&
        Objects.equals(this.reportedByEmployee, viewingResponse.reportedByEmployee) &&
        Objects.equals(this.created, viewingResponse.created) &&
        Objects.equals(this.updated, viewingResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, startTime, endTime, complete, preViewingNotes, postViewingNotes, viewers, linkedProperty, assignedEmployee, reportedByEmployee, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewingResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    preViewingNotes: ").append(toIndentedString(preViewingNotes)).append("\n");
    sb.append("    postViewingNotes: ").append(toIndentedString(postViewingNotes)).append("\n");
    sb.append("    viewers: ").append(toIndentedString(viewers)).append("\n");
    sb.append("    linkedProperty: ").append(toIndentedString(linkedProperty)).append("\n");
    sb.append("    assignedEmployee: ").append(toIndentedString(assignedEmployee)).append("\n");
    sb.append("    reportedByEmployee: ").append(toIndentedString(reportedByEmployee)).append("\n");
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
