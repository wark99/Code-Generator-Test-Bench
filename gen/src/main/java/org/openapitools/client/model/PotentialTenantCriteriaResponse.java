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
import org.openapitools.client.model.BuyerCriteriaResponseBedrooms;
import org.openapitools.client.model.LocationCriteriaResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PotentialTenantCriteriaResponse
 */
@JsonPropertyOrder({
  PotentialTenantCriteriaResponse.JSON_PROPERTY_LOCATIONS,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_PROPERTY_TYPES,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_BEDROOMS,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_RENT,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_FURNISHED,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_PETS,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_DSS,
  PotentialTenantCriteriaResponse.JSON_PROPERTY_GROUND_FLOOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PotentialTenantCriteriaResponse {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<LocationCriteriaResponse> locations;

  /**
   * Gets or Sets propertyTypes
   */
  public enum PropertyTypesEnum {
    ALL("All"),
    
    HOUSE("House"),
    
    FLAT("Flat"),
    
    BUNGALOW("Bungalow");

    private String value;

    PropertyTypesEnum(String value) {
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
    public static PropertyTypesEnum fromValue(String value) {
      for (PropertyTypesEnum b : PropertyTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROPERTY_TYPES = "property_types";
  private List<PropertyTypesEnum> propertyTypes;

  public static final String JSON_PROPERTY_BEDROOMS = "bedrooms";
  private BuyerCriteriaResponseBedrooms bedrooms;

  public static final String JSON_PROPERTY_RENT = "rent";
  private BuyerCriteriaResponseBedrooms rent;

  public static final String JSON_PROPERTY_FURNISHED = "furnished";
  private Boolean furnished;

  public static final String JSON_PROPERTY_PETS = "pets";
  private Boolean pets;

  public static final String JSON_PROPERTY_DSS = "dss";
  private Boolean dss;

  public static final String JSON_PROPERTY_GROUND_FLOOR = "ground_floor";
  private Boolean groundFloor;

  public PotentialTenantCriteriaResponse() {
  }

  public PotentialTenantCriteriaResponse locations(List<LocationCriteriaResponse> locations) {
    
    this.locations = locations;
    return this;
  }

  public PotentialTenantCriteriaResponse addLocationsItem(LocationCriteriaResponse locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocationCriteriaResponse> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocations(List<LocationCriteriaResponse> locations) {
    this.locations = locations;
  }


  public PotentialTenantCriteriaResponse propertyTypes(List<PropertyTypesEnum> propertyTypes) {
    
    this.propertyTypes = propertyTypes;
    return this;
  }

  public PotentialTenantCriteriaResponse addPropertyTypesItem(PropertyTypesEnum propertyTypesItem) {
    if (this.propertyTypes == null) {
      this.propertyTypes = new ArrayList<>();
    }
    this.propertyTypes.add(propertyTypesItem);
    return this;
  }

   /**
   * Get propertyTypes
   * @return propertyTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PropertyTypesEnum> getPropertyTypes() {
    return propertyTypes;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyTypes(List<PropertyTypesEnum> propertyTypes) {
    this.propertyTypes = propertyTypes;
  }


  public PotentialTenantCriteriaResponse bedrooms(BuyerCriteriaResponseBedrooms bedrooms) {
    
    this.bedrooms = bedrooms;
    return this;
  }

   /**
   * Get bedrooms
   * @return bedrooms
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEDROOMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuyerCriteriaResponseBedrooms getBedrooms() {
    return bedrooms;
  }


  @JsonProperty(JSON_PROPERTY_BEDROOMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBedrooms(BuyerCriteriaResponseBedrooms bedrooms) {
    this.bedrooms = bedrooms;
  }


  public PotentialTenantCriteriaResponse rent(BuyerCriteriaResponseBedrooms rent) {
    
    this.rent = rent;
    return this;
  }

   /**
   * Get rent
   * @return rent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuyerCriteriaResponseBedrooms getRent() {
    return rent;
  }


  @JsonProperty(JSON_PROPERTY_RENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRent(BuyerCriteriaResponseBedrooms rent) {
    this.rent = rent;
  }


  public PotentialTenantCriteriaResponse furnished(Boolean furnished) {
    
    this.furnished = furnished;
    return this;
  }

   /**
   * Get furnished
   * @return furnished
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FURNISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFurnished() {
    return furnished;
  }


  @JsonProperty(JSON_PROPERTY_FURNISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFurnished(Boolean furnished) {
    this.furnished = furnished;
  }


  public PotentialTenantCriteriaResponse pets(Boolean pets) {
    
    this.pets = pets;
    return this;
  }

   /**
   * Get pets
   * @return pets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPets() {
    return pets;
  }


  @JsonProperty(JSON_PROPERTY_PETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPets(Boolean pets) {
    this.pets = pets;
  }


  public PotentialTenantCriteriaResponse dss(Boolean dss) {
    
    this.dss = dss;
    return this;
  }

   /**
   * Get dss
   * @return dss
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDss() {
    return dss;
  }


  @JsonProperty(JSON_PROPERTY_DSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDss(Boolean dss) {
    this.dss = dss;
  }


  public PotentialTenantCriteriaResponse groundFloor(Boolean groundFloor) {
    
    this.groundFloor = groundFloor;
    return this;
  }

   /**
   * Get groundFloor
   * @return groundFloor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUND_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGroundFloor() {
    return groundFloor;
  }


  @JsonProperty(JSON_PROPERTY_GROUND_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroundFloor(Boolean groundFloor) {
    this.groundFloor = groundFloor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PotentialTenantCriteriaResponse potentialTenantCriteriaResponse = (PotentialTenantCriteriaResponse) o;
    return Objects.equals(this.locations, potentialTenantCriteriaResponse.locations) &&
        Objects.equals(this.propertyTypes, potentialTenantCriteriaResponse.propertyTypes) &&
        Objects.equals(this.bedrooms, potentialTenantCriteriaResponse.bedrooms) &&
        Objects.equals(this.rent, potentialTenantCriteriaResponse.rent) &&
        Objects.equals(this.furnished, potentialTenantCriteriaResponse.furnished) &&
        Objects.equals(this.pets, potentialTenantCriteriaResponse.pets) &&
        Objects.equals(this.dss, potentialTenantCriteriaResponse.dss) &&
        Objects.equals(this.groundFloor, potentialTenantCriteriaResponse.groundFloor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, propertyTypes, bedrooms, rent, furnished, pets, dss, groundFloor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PotentialTenantCriteriaResponse {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    propertyTypes: ").append(toIndentedString(propertyTypes)).append("\n");
    sb.append("    bedrooms: ").append(toIndentedString(bedrooms)).append("\n");
    sb.append("    rent: ").append(toIndentedString(rent)).append("\n");
    sb.append("    furnished: ").append(toIndentedString(furnished)).append("\n");
    sb.append("    pets: ").append(toIndentedString(pets)).append("\n");
    sb.append("    dss: ").append(toIndentedString(dss)).append("\n");
    sb.append("    groundFloor: ").append(toIndentedString(groundFloor)).append("\n");
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

