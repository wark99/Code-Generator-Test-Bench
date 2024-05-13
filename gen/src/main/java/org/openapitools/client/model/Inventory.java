/*
 * Inventory Management System API
 * API for Inventory Management System, it saves items(\"Products\") in an Inventory, each Item has a Provider that provides it, and also there is consumers who sonsumes therse Items(\"Products\")
 *
 * The version of the OpenAPI document: Version1
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Inventory
 */
@JsonPropertyOrder({
  Inventory.JSON_PROPERTY_INVENTORY_I_D,
  Inventory.JSON_PROPERTY_INVENTORY_NAME,
  Inventory.JSON_PROPERTY_INVENTORY_LOCATION,
  Inventory.JSON_PROPERTY_OWNER_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:25.962969645Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Inventory {
  public static final String JSON_PROPERTY_INVENTORY_I_D = "inventoryID";
  private Integer inventoryID;

  public static final String JSON_PROPERTY_INVENTORY_NAME = "inventoryName";
  private String inventoryName;

  public static final String JSON_PROPERTY_INVENTORY_LOCATION = "inventoryLocation";
  private String inventoryLocation;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  private String ownerName;

  public Inventory() {
  }

  public Inventory inventoryID(Integer inventoryID) {
    
    this.inventoryID = inventoryID;
    return this;
  }

   /**
   * Get inventoryID
   * @return inventoryID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVENTORY_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInventoryID() {
    return inventoryID;
  }


  @JsonProperty(JSON_PROPERTY_INVENTORY_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventoryID(Integer inventoryID) {
    this.inventoryID = inventoryID;
  }


  public Inventory inventoryName(String inventoryName) {
    
    this.inventoryName = inventoryName;
    return this;
  }

   /**
   * Get inventoryName
   * @return inventoryName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVENTORY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInventoryName() {
    return inventoryName;
  }


  @JsonProperty(JSON_PROPERTY_INVENTORY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInventoryName(String inventoryName) {
    this.inventoryName = inventoryName;
  }


  public Inventory inventoryLocation(String inventoryLocation) {
    
    this.inventoryLocation = inventoryLocation;
    return this;
  }

   /**
   * Get inventoryLocation
   * @return inventoryLocation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVENTORY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInventoryLocation() {
    return inventoryLocation;
  }


  @JsonProperty(JSON_PROPERTY_INVENTORY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInventoryLocation(String inventoryLocation) {
    this.inventoryLocation = inventoryLocation;
  }


  public Inventory ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwnerName() {
    return ownerName;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventory inventory = (Inventory) o;
    return Objects.equals(this.inventoryID, inventory.inventoryID) &&
        Objects.equals(this.inventoryName, inventory.inventoryName) &&
        Objects.equals(this.inventoryLocation, inventory.inventoryLocation) &&
        Objects.equals(this.ownerName, inventory.ownerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryID, inventoryName, inventoryLocation, ownerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inventory {\n");
    sb.append("    inventoryID: ").append(toIndentedString(inventoryID)).append("\n");
    sb.append("    inventoryName: ").append(toIndentedString(inventoryName)).append("\n");
    sb.append("    inventoryLocation: ").append(toIndentedString(inventoryLocation)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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

