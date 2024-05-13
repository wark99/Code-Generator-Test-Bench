/*
 * MATIX Enterprise Asset Management - OpenAPI 3.1
 * This is the MATIX Enteprise Asset Management (EAM) documentation based on the OpenAPI 3.1 specification.  You can find out more about MATIX at [https://matix.cloud](https://matix.cloud). If you have a valid account, you can log into the MATIX EAM Platform at [https://eam.matix.cloud](https://eam.matix.cloud).  API Authentication is done with Bearer token. The token can be generated by a Company Admin directly on the MATIX EAM Platform.
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: support@matix.cloud
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Company;
import org.openapitools.client.model.Plant;
import org.openapitools.client.model.ToolMatixData;
import org.openapitools.client.model.ToolProducedPartsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Tool
 */
@JsonPropertyOrder({
  Tool.JSON_PROPERTY_ID,
  Tool.JSON_PROPERTY_NAME,
  Tool.JSON_PROPERTY_TYPE,
  Tool.JSON_PROPERTY_TOTAL_CYCLES,
  Tool.JSON_PROPERTY_USED_CAVITIES,
  Tool.JSON_PROPERTY_AVAILABLE_CAVITIES,
  Tool.JSON_PROPERTY_PRODUCED_PARTS,
  Tool.JSON_PROPERTY_OWNER_COMPANY,
  Tool.JSON_PROPERTY_OPERATING_PLANT,
  Tool.JSON_PROPERTY_IN_HOUSE,
  Tool.JSON_PROPERTY_CRETAED_AT,
  Tool.JSON_PROPERTY_COMMISSIONING_DATE,
  Tool.JSON_PROPERTY_TARGET_CYCLE_TIME,
  Tool.JSON_PROPERTY_MATIX_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:24.819947494Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Tool {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Yype of tool
   */
  public enum TypeEnum {
    PLASTIC_INJECTION("plastic_injection"),
    
    METAL_STAMPING("metal_stamping"),
    
    DIE_CASTING("die_casting"),
    
    THERMOFORMING("thermoforming");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TOTAL_CYCLES = "totalCycles";
  private Integer totalCycles;

  public static final String JSON_PROPERTY_USED_CAVITIES = "usedCavities";
  private Integer usedCavities;

  public static final String JSON_PROPERTY_AVAILABLE_CAVITIES = "availableCavities";
  private Integer availableCavities;

  public static final String JSON_PROPERTY_PRODUCED_PARTS = "producedParts";
  private List<ToolProducedPartsInner> producedParts;

  public static final String JSON_PROPERTY_OWNER_COMPANY = "ownerCompany";
  private Company ownerCompany;

  public static final String JSON_PROPERTY_OPERATING_PLANT = "operatingPlant";
  private Plant operatingPlant;

  public static final String JSON_PROPERTY_IN_HOUSE = "inHouse";
  private Boolean inHouse;

  public static final String JSON_PROPERTY_CRETAED_AT = "cretaedAt";
  private OffsetDateTime cretaedAt;

  public static final String JSON_PROPERTY_COMMISSIONING_DATE = "commissioningDate";
  private OffsetDateTime commissioningDate;

  public static final String JSON_PROPERTY_TARGET_CYCLE_TIME = "targetCycleTime";
  private Double targetCycleTime;

  public static final String JSON_PROPERTY_MATIX_DATA = "matixData";
  private ToolMatixData matixData;

  public Tool() {
  }

  public Tool id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of tool
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


  public Tool name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of tool
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Tool type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Yype of tool
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Tool totalCycles(Integer totalCycles) {
    
    this.totalCycles = totalCycles;
    return this;
  }

   /**
   * Total cycles count of tool
   * @return totalCycles
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CYCLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCycles() {
    return totalCycles;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CYCLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCycles(Integer totalCycles) {
    this.totalCycles = totalCycles;
  }


  public Tool usedCavities(Integer usedCavities) {
    
    this.usedCavities = usedCavities;
    return this;
  }

   /**
   * Tool used cavities
   * @return usedCavities
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_CAVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsedCavities() {
    return usedCavities;
  }


  @JsonProperty(JSON_PROPERTY_USED_CAVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedCavities(Integer usedCavities) {
    this.usedCavities = usedCavities;
  }


  public Tool availableCavities(Integer availableCavities) {
    
    this.availableCavities = availableCavities;
    return this;
  }

   /**
   * Tool available cavities
   * @return availableCavities
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_CAVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvailableCavities() {
    return availableCavities;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_CAVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableCavities(Integer availableCavities) {
    this.availableCavities = availableCavities;
  }


  public Tool producedParts(List<ToolProducedPartsInner> producedParts) {
    
    this.producedParts = producedParts;
    return this;
  }

  public Tool addProducedPartsItem(ToolProducedPartsInner producedPartsItem) {
    if (this.producedParts == null) {
      this.producedParts = new ArrayList<>();
    }
    this.producedParts.add(producedPartsItem);
    return this;
  }

   /**
   * Array of produced parts
   * @return producedParts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCED_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ToolProducedPartsInner> getProducedParts() {
    return producedParts;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCED_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducedParts(List<ToolProducedPartsInner> producedParts) {
    this.producedParts = producedParts;
  }


  public Tool ownerCompany(Company ownerCompany) {
    
    this.ownerCompany = ownerCompany;
    return this;
  }

   /**
   * Get ownerCompany
   * @return ownerCompany
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Company getOwnerCompany() {
    return ownerCompany;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerCompany(Company ownerCompany) {
    this.ownerCompany = ownerCompany;
  }


  public Tool operatingPlant(Plant operatingPlant) {
    
    this.operatingPlant = operatingPlant;
    return this;
  }

   /**
   * Get operatingPlant
   * @return operatingPlant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_PLANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Plant getOperatingPlant() {
    return operatingPlant;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_PLANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingPlant(Plant operatingPlant) {
    this.operatingPlant = operatingPlant;
  }


  public Tool inHouse(Boolean inHouse) {
    
    this.inHouse = inHouse;
    return this;
  }

   /**
   * Get inHouse
   * @return inHouse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_HOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInHouse() {
    return inHouse;
  }


  @JsonProperty(JSON_PROPERTY_IN_HOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInHouse(Boolean inHouse) {
    this.inHouse = inHouse;
  }


  public Tool cretaedAt(OffsetDateTime cretaedAt) {
    
    this.cretaedAt = cretaedAt;
    return this;
  }

   /**
   * Tool creation date
   * @return cretaedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRETAED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCretaedAt() {
    return cretaedAt;
  }


  @JsonProperty(JSON_PROPERTY_CRETAED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCretaedAt(OffsetDateTime cretaedAt) {
    this.cretaedAt = cretaedAt;
  }


  public Tool commissioningDate(OffsetDateTime commissioningDate) {
    
    this.commissioningDate = commissioningDate;
    return this;
  }

   /**
   * Tool commissioning date
   * @return commissioningDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMISSIONING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCommissioningDate() {
    return commissioningDate;
  }


  @JsonProperty(JSON_PROPERTY_COMMISSIONING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommissioningDate(OffsetDateTime commissioningDate) {
    this.commissioningDate = commissioningDate;
  }


  public Tool targetCycleTime(Double targetCycleTime) {
    
    this.targetCycleTime = targetCycleTime;
    return this;
  }

   /**
   * Get targetCycleTime
   * @return targetCycleTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_CYCLE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetCycleTime() {
    return targetCycleTime;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CYCLE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCycleTime(Double targetCycleTime) {
    this.targetCycleTime = targetCycleTime;
  }


  public Tool matixData(ToolMatixData matixData) {
    
    this.matixData = matixData;
    return this;
  }

   /**
   * Get matixData
   * @return matixData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATIX_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ToolMatixData getMatixData() {
    return matixData;
  }


  @JsonProperty(JSON_PROPERTY_MATIX_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatixData(ToolMatixData matixData) {
    this.matixData = matixData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.id, tool.id) &&
        Objects.equals(this.name, tool.name) &&
        Objects.equals(this.type, tool.type) &&
        Objects.equals(this.totalCycles, tool.totalCycles) &&
        Objects.equals(this.usedCavities, tool.usedCavities) &&
        Objects.equals(this.availableCavities, tool.availableCavities) &&
        Objects.equals(this.producedParts, tool.producedParts) &&
        Objects.equals(this.ownerCompany, tool.ownerCompany) &&
        Objects.equals(this.operatingPlant, tool.operatingPlant) &&
        Objects.equals(this.inHouse, tool.inHouse) &&
        Objects.equals(this.cretaedAt, tool.cretaedAt) &&
        Objects.equals(this.commissioningDate, tool.commissioningDate) &&
        Objects.equals(this.targetCycleTime, tool.targetCycleTime) &&
        Objects.equals(this.matixData, tool.matixData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, totalCycles, usedCavities, availableCavities, producedParts, ownerCompany, operatingPlant, inHouse, cretaedAt, commissioningDate, targetCycleTime, matixData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalCycles: ").append(toIndentedString(totalCycles)).append("\n");
    sb.append("    usedCavities: ").append(toIndentedString(usedCavities)).append("\n");
    sb.append("    availableCavities: ").append(toIndentedString(availableCavities)).append("\n");
    sb.append("    producedParts: ").append(toIndentedString(producedParts)).append("\n");
    sb.append("    ownerCompany: ").append(toIndentedString(ownerCompany)).append("\n");
    sb.append("    operatingPlant: ").append(toIndentedString(operatingPlant)).append("\n");
    sb.append("    inHouse: ").append(toIndentedString(inHouse)).append("\n");
    sb.append("    cretaedAt: ").append(toIndentedString(cretaedAt)).append("\n");
    sb.append("    commissioningDate: ").append(toIndentedString(commissioningDate)).append("\n");
    sb.append("    targetCycleTime: ").append(toIndentedString(targetCycleTime)).append("\n");
    sb.append("    matixData: ").append(toIndentedString(matixData)).append("\n");
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

