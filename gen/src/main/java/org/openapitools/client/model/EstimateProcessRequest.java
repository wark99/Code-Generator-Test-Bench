/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EstimateProcessRequest
 */
@JsonPropertyOrder({
  EstimateProcessRequest.JSON_PROPERTY_ESTIMATE_I_D,
  EstimateProcessRequest.JSON_PROPERTY_ACTION,
  EstimateProcessRequest.JSON_PROPERTY_NOTE,
  EstimateProcessRequest.JSON_PROPERTY_PROCESSED_REFERENCE,
  EstimateProcessRequest.JSON_PROPERTY_PARTS_APPROVED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EstimateProcessRequest {
  public static final String JSON_PROPERTY_ESTIMATE_I_D = "estimateID";
  private Integer estimateID;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    APPROVE("approve"),
    
    PARTIALLYAPPROVED("partiallyApproved"),
    
    ESTDECLINED("estDeclined"),
    
    REJECTWITHRESUBMIT("rejectWithResubmit"),
    
    PARTSUNAVAIL("partsUnAvail"),
    
    ESTIMATEHOLD("estimateHold");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_NOTE = "note";
  private String note;

  public static final String JSON_PROPERTY_PROCESSED_REFERENCE = "processedReference";
  private String processedReference;

  public static final String JSON_PROPERTY_PARTS_APPROVED = "partsApproved";
  private List<Integer> partsApproved;

  public EstimateProcessRequest() {
  }

  public EstimateProcessRequest estimateID(Integer estimateID) {
    
    this.estimateID = estimateID;
    return this;
  }

   /**
   * Get estimateID
   * @return estimateID
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESTIMATE_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEstimateID() {
    return estimateID;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATE_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimateID(Integer estimateID) {
    this.estimateID = estimateID;
  }


  public EstimateProcessRequest action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public EstimateProcessRequest note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Required if the following actions - rejectWithResubmit, partiallyApproved, estimateHold
   * @return note
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNote() {
    return note;
  }


  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNote(String note) {
    this.note = note;
  }


  public EstimateProcessRequest processedReference(String processedReference) {
    
    this.processedReference = processedReference;
    return this;
  }

   /**
   * Get processedReference
   * @return processedReference
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROCESSED_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessedReference() {
    return processedReference;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSED_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcessedReference(String processedReference) {
    this.processedReference = processedReference;
  }


  public EstimateProcessRequest partsApproved(List<Integer> partsApproved) {
    
    this.partsApproved = partsApproved;
    return this;
  }

  public EstimateProcessRequest addPartsApprovedItem(Integer partsApprovedItem) {
    if (this.partsApproved == null) {
      this.partsApproved = new ArrayList<>();
    }
    this.partsApproved.add(partsApprovedItem);
    return this;
  }

   /**
   * Required if action &#x3D; partiallyApproved
   * @return partsApproved
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTS_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPartsApproved() {
    return partsApproved;
  }


  @JsonProperty(JSON_PROPERTY_PARTS_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartsApproved(List<Integer> partsApproved) {
    this.partsApproved = partsApproved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateProcessRequest estimateProcessRequest = (EstimateProcessRequest) o;
    return Objects.equals(this.estimateID, estimateProcessRequest.estimateID) &&
        Objects.equals(this.action, estimateProcessRequest.action) &&
        Objects.equals(this.note, estimateProcessRequest.note) &&
        Objects.equals(this.processedReference, estimateProcessRequest.processedReference) &&
        Objects.equals(this.partsApproved, estimateProcessRequest.partsApproved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateID, action, note, processedReference, partsApproved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateProcessRequest {\n");
    sb.append("    estimateID: ").append(toIndentedString(estimateID)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    processedReference: ").append(toIndentedString(processedReference)).append("\n");
    sb.append("    partsApproved: ").append(toIndentedString(partsApproved)).append("\n");
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

