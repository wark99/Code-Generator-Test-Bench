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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.StorageMachine;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RecordingConfig
 */
@JsonPropertyOrder({
  RecordingConfig.JSON_PROPERTY_RECORDING_CONFIG_ID,
  RecordingConfig.JSON_PROPERTY_AUTO_RECORD,
  RecordingConfig.JSON_PROPERTY_STORAGE_MACHINES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RecordingConfig {
  public static final String JSON_PROPERTY_RECORDING_CONFIG_ID = "recording_config_id";
  private Integer recordingConfigId;

  public static final String JSON_PROPERTY_AUTO_RECORD = "auto_record";
  private Boolean autoRecord;

  public static final String JSON_PROPERTY_STORAGE_MACHINES = "storage_machines";
  private List<StorageMachine> storageMachines;

  public RecordingConfig() {
  }

  public RecordingConfig recordingConfigId(Integer recordingConfigId) {
    
    this.recordingConfigId = recordingConfigId;
    return this;
  }

   /**
   * Unique identifier of the &#x60;recording config&#x60; that is related to the resource &#x60;RecordingConfig&#x60;
   * @return recordingConfigId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECORDING_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRecordingConfigId() {
    return recordingConfigId;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordingConfigId(Integer recordingConfigId) {
    this.recordingConfigId = recordingConfigId;
  }


  public RecordingConfig autoRecord(Boolean autoRecord) {
    
    this.autoRecord = autoRecord;
    return this;
  }

   /**
   * Get autoRecord
   * @return autoRecord
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTO_RECORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAutoRecord() {
    return autoRecord;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_RECORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoRecord(Boolean autoRecord) {
    this.autoRecord = autoRecord;
  }


  public RecordingConfig storageMachines(List<StorageMachine> storageMachines) {
    
    this.storageMachines = storageMachines;
    return this;
  }

  public RecordingConfig addStorageMachinesItem(StorageMachine storageMachinesItem) {
    if (this.storageMachines == null) {
      this.storageMachines = new ArrayList<>();
    }
    this.storageMachines.add(storageMachinesItem);
    return this;
  }

   /**
   * Get storageMachines
   * @return storageMachines
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StorageMachine> getStorageMachines() {
    return storageMachines;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageMachines(List<StorageMachine> storageMachines) {
    this.storageMachines = storageMachines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingConfig recordingConfig = (RecordingConfig) o;
    return Objects.equals(this.recordingConfigId, recordingConfig.recordingConfigId) &&
        Objects.equals(this.autoRecord, recordingConfig.autoRecord) &&
        Objects.equals(this.storageMachines, recordingConfig.storageMachines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingConfigId, autoRecord, storageMachines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingConfig {\n");
    sb.append("    recordingConfigId: ").append(toIndentedString(recordingConfigId)).append("\n");
    sb.append("    autoRecord: ").append(toIndentedString(autoRecord)).append("\n");
    sb.append("    storageMachines: ").append(toIndentedString(storageMachines)).append("\n");
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
