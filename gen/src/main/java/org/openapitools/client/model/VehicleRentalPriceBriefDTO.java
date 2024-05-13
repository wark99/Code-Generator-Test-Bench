/*
 * UEX Corp API
 * Created by [@thekronny](https://discord.com/users/224580858432978944). ## Downloads [Secification file](https://app.swaggerhub.com/apiproxy/registry/dolejska-daniel/UEX-API/v2.0?resolved=true&flatten=true&pretty=true) ## Other Resources
 *
 * The version of the OpenAPI document: v2.0
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VehicleRentalPriceBriefDTO
 */
@JsonPropertyOrder({
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_DATE_ADDED,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_DATE_MODIFIED,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_ID,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_ID_TERMINAL,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_ID_VEHICLE,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_PRICE_RENT,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_TERMINAL_NAME,
  VehicleRentalPriceBriefDTO.JSON_PROPERTY_VEHICLE_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VehicleRentalPriceBriefDTO {
  public static final String JSON_PROPERTY_DATE_ADDED = "date_added";
  private BigDecimal dateAdded;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "date_modified";
  private BigDecimal dateModified;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_ID_TERMINAL = "id_terminal";
  private BigDecimal idTerminal;

  public static final String JSON_PROPERTY_ID_VEHICLE = "id_vehicle";
  private BigDecimal idVehicle;

  public static final String JSON_PROPERTY_PRICE_RENT = "price_rent";
  private BigDecimal priceRent;

  public static final String JSON_PROPERTY_TERMINAL_NAME = "terminal_name";
  private String terminalName;

  public static final String JSON_PROPERTY_VEHICLE_NAME = "vehicle_name";
  private String vehicleName;

  public VehicleRentalPriceBriefDTO() {
  }

  public VehicleRentalPriceBriefDTO dateAdded(BigDecimal dateAdded) {
    
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_ADDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDateAdded() {
    return dateAdded;
  }


  @JsonProperty(JSON_PROPERTY_DATE_ADDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateAdded(BigDecimal dateAdded) {
    this.dateAdded = dateAdded;
  }


  public VehicleRentalPriceBriefDTO dateModified(BigDecimal dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(BigDecimal dateModified) {
    this.dateModified = dateModified;
  }


  public VehicleRentalPriceBriefDTO id(BigDecimal id) {
    
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

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public VehicleRentalPriceBriefDTO idTerminal(BigDecimal idTerminal) {
    
    this.idTerminal = idTerminal;
    return this;
  }

   /**
   * Get idTerminal
   * @return idTerminal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdTerminal() {
    return idTerminal;
  }


  @JsonProperty(JSON_PROPERTY_ID_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdTerminal(BigDecimal idTerminal) {
    this.idTerminal = idTerminal;
  }


  public VehicleRentalPriceBriefDTO idVehicle(BigDecimal idVehicle) {
    
    this.idVehicle = idVehicle;
    return this;
  }

   /**
   * Get idVehicle
   * @return idVehicle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdVehicle() {
    return idVehicle;
  }


  @JsonProperty(JSON_PROPERTY_ID_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdVehicle(BigDecimal idVehicle) {
    this.idVehicle = idVehicle;
  }


  public VehicleRentalPriceBriefDTO priceRent(BigDecimal priceRent) {
    
    this.priceRent = priceRent;
    return this;
  }

   /**
   * Get priceRent
   * @return priceRent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPriceRent() {
    return priceRent;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceRent(BigDecimal priceRent) {
    this.priceRent = priceRent;
  }


  public VehicleRentalPriceBriefDTO terminalName(String terminalName) {
    
    this.terminalName = terminalName;
    return this;
  }

   /**
   * Get terminalName
   * @return terminalName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminalName() {
    return terminalName;
  }


  @JsonProperty(JSON_PROPERTY_TERMINAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }


  public VehicleRentalPriceBriefDTO vehicleName(String vehicleName) {
    
    this.vehicleName = vehicleName;
    return this;
  }

   /**
   * Get vehicleName
   * @return vehicleName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEHICLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVehicleName() {
    return vehicleName;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleRentalPriceBriefDTO vehicleRentalPriceBriefDTO = (VehicleRentalPriceBriefDTO) o;
    return Objects.equals(this.dateAdded, vehicleRentalPriceBriefDTO.dateAdded) &&
        Objects.equals(this.dateModified, vehicleRentalPriceBriefDTO.dateModified) &&
        Objects.equals(this.id, vehicleRentalPriceBriefDTO.id) &&
        Objects.equals(this.idTerminal, vehicleRentalPriceBriefDTO.idTerminal) &&
        Objects.equals(this.idVehicle, vehicleRentalPriceBriefDTO.idVehicle) &&
        Objects.equals(this.priceRent, vehicleRentalPriceBriefDTO.priceRent) &&
        Objects.equals(this.terminalName, vehicleRentalPriceBriefDTO.terminalName) &&
        Objects.equals(this.vehicleName, vehicleRentalPriceBriefDTO.vehicleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAdded, dateModified, id, idTerminal, idVehicle, priceRent, terminalName, vehicleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleRentalPriceBriefDTO {\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTerminal: ").append(toIndentedString(idTerminal)).append("\n");
    sb.append("    idVehicle: ").append(toIndentedString(idVehicle)).append("\n");
    sb.append("    priceRent: ").append(toIndentedString(priceRent)).append("\n");
    sb.append("    terminalName: ").append(toIndentedString(terminalName)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
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

