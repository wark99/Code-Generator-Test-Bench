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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AcronisUsage
 */
@JsonPropertyOrder({
  AcronisUsage.JSON_PROPERTY_STORAGE_USED_ACRONIS,
  AcronisUsage.JSON_PROPERTY_NB_SLOTS_WORKSTATION,
  AcronisUsage.JSON_PROPERTY_NB_SLOTS_SERVER,
  AcronisUsage.JSON_PROPERTY_NB_SLOTS_VIRTUAL,
  AcronisUsage.JSON_PROPERTY_NB_SLOTS_MOBILE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AcronisUsage {
  public static final String JSON_PROPERTY_STORAGE_USED_ACRONIS = "storage_used_acronis";
  private Integer storageUsedAcronis;

  public static final String JSON_PROPERTY_NB_SLOTS_WORKSTATION = "nb_slots_workstation";
  private Integer nbSlotsWorkstation;

  public static final String JSON_PROPERTY_NB_SLOTS_SERVER = "nb_slots_server";
  private Integer nbSlotsServer;

  public static final String JSON_PROPERTY_NB_SLOTS_VIRTUAL = "nb_slots_virtual";
  private Integer nbSlotsVirtual;

  public static final String JSON_PROPERTY_NB_SLOTS_MOBILE = "nb_slots_mobile";
  private Integer nbSlotsMobile;

  public AcronisUsage() {
  }

  public AcronisUsage storageUsedAcronis(Integer storageUsedAcronis) {
    
    this.storageUsedAcronis = storageUsedAcronis;
    return this;
  }

   /**
   * Get storageUsedAcronis
   * @return storageUsedAcronis
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STORAGE_USED_ACRONIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStorageUsedAcronis() {
    return storageUsedAcronis;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_USED_ACRONIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStorageUsedAcronis(Integer storageUsedAcronis) {
    this.storageUsedAcronis = storageUsedAcronis;
  }


  public AcronisUsage nbSlotsWorkstation(Integer nbSlotsWorkstation) {
    
    this.nbSlotsWorkstation = nbSlotsWorkstation;
    return this;
  }

   /**
   * Number of Acronis workstation licences
   * @return nbSlotsWorkstation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NB_SLOTS_WORKSTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNbSlotsWorkstation() {
    return nbSlotsWorkstation;
  }


  @JsonProperty(JSON_PROPERTY_NB_SLOTS_WORKSTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNbSlotsWorkstation(Integer nbSlotsWorkstation) {
    this.nbSlotsWorkstation = nbSlotsWorkstation;
  }


  public AcronisUsage nbSlotsServer(Integer nbSlotsServer) {
    
    this.nbSlotsServer = nbSlotsServer;
    return this;
  }

   /**
   * Number of Acronis server licences
   * @return nbSlotsServer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NB_SLOTS_SERVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNbSlotsServer() {
    return nbSlotsServer;
  }


  @JsonProperty(JSON_PROPERTY_NB_SLOTS_SERVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNbSlotsServer(Integer nbSlotsServer) {
    this.nbSlotsServer = nbSlotsServer;
  }


  public AcronisUsage nbSlotsVirtual(Integer nbSlotsVirtual) {
    
    this.nbSlotsVirtual = nbSlotsVirtual;
    return this;
  }

   /**
   * Number of Acronis virtual machine licences
   * @return nbSlotsVirtual
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NB_SLOTS_VIRTUAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNbSlotsVirtual() {
    return nbSlotsVirtual;
  }


  @JsonProperty(JSON_PROPERTY_NB_SLOTS_VIRTUAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNbSlotsVirtual(Integer nbSlotsVirtual) {
    this.nbSlotsVirtual = nbSlotsVirtual;
  }


  public AcronisUsage nbSlotsMobile(Integer nbSlotsMobile) {
    
    this.nbSlotsMobile = nbSlotsMobile;
    return this;
  }

   /**
   * Number of Acronis mobile licences
   * @return nbSlotsMobile
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NB_SLOTS_MOBILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNbSlotsMobile() {
    return nbSlotsMobile;
  }


  @JsonProperty(JSON_PROPERTY_NB_SLOTS_MOBILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNbSlotsMobile(Integer nbSlotsMobile) {
    this.nbSlotsMobile = nbSlotsMobile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcronisUsage acronisUsage = (AcronisUsage) o;
    return Objects.equals(this.storageUsedAcronis, acronisUsage.storageUsedAcronis) &&
        Objects.equals(this.nbSlotsWorkstation, acronisUsage.nbSlotsWorkstation) &&
        Objects.equals(this.nbSlotsServer, acronisUsage.nbSlotsServer) &&
        Objects.equals(this.nbSlotsVirtual, acronisUsage.nbSlotsVirtual) &&
        Objects.equals(this.nbSlotsMobile, acronisUsage.nbSlotsMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageUsedAcronis, nbSlotsWorkstation, nbSlotsServer, nbSlotsVirtual, nbSlotsMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcronisUsage {\n");
    sb.append("    storageUsedAcronis: ").append(toIndentedString(storageUsedAcronis)).append("\n");
    sb.append("    nbSlotsWorkstation: ").append(toIndentedString(nbSlotsWorkstation)).append("\n");
    sb.append("    nbSlotsServer: ").append(toIndentedString(nbSlotsServer)).append("\n");
    sb.append("    nbSlotsVirtual: ").append(toIndentedString(nbSlotsVirtual)).append("\n");
    sb.append("    nbSlotsMobile: ").append(toIndentedString(nbSlotsMobile)).append("\n");
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

