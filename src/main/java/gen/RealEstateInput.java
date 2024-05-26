package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class RealEstateInput {
    @JsonProperty("Property_Type")
    private String propertyType;
    @JsonProperty("Property_Size")
    private Integer propertySize;
    @JsonProperty("Bedrooms")
    private Integer bedrooms;
    @JsonProperty("Bathrooms")
    private Integer bathrooms;
    @JsonProperty("Location")
    private String location;
    @JsonProperty("Furnishing")
    private String furnishing;
    @JsonProperty("Age_of_Property")
    private Integer ageOfProperty;
    @JsonProperty("Amenities")
    private String amenities;
    @JsonProperty("Proximity_to_Important_Locations")
    private Double proximityToImportantLocations;
    @JsonProperty("Floor_Level")
    private Integer floorLevel;
    @JsonProperty("Property_Status")
    private String propertyStatus;

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Integer getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Integer propertySize) {
        this.propertySize = propertySize;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public Integer getAgeOfProperty() {
        return ageOfProperty;
    }

    public void setAgeOfProperty(Integer ageOfProperty) {
        this.ageOfProperty = ageOfProperty;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public Double getProximityToImportantLocations() {
        return proximityToImportantLocations;
    }

    public void setProximityToImportantLocations(Double proximityToImportantLocations) {
        this.proximityToImportantLocations = proximityToImportantLocations;
    }

    public Integer getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(Integer floorLevel) {
        this.floorLevel = floorLevel;
    }

    public String getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealEstateInput that = (RealEstateInput) o;
        return Objects.equals(propertyType, that.propertyType) && Objects.equals(propertySize, that.propertySize) && Objects.equals(bedrooms, that.bedrooms) && Objects.equals(bathrooms, that.bathrooms) && Objects.equals(location, that.location) && Objects.equals(furnishing, that.furnishing) && Objects.equals(ageOfProperty, that.ageOfProperty) && Objects.equals(amenities, that.amenities) && Objects.equals(proximityToImportantLocations, that.proximityToImportantLocations) && Objects.equals(floorLevel, that.floorLevel) && Objects.equals(propertyStatus, that.propertyStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyType, propertySize, bedrooms, bathrooms, location, furnishing, ageOfProperty, amenities, proximityToImportantLocations, floorLevel, propertyStatus);
    }

    @Override
    public String toString() {
        return "RealEstateInput{" +
            "propertyType='" + propertyType + '\'' +
            ", propertySize=" + propertySize +
            ", bedrooms=" + bedrooms +
            ", bathrooms=" + bathrooms +
            ", location='" + location + '\'' +
            ", furnishing='" + furnishing + '\'' +
            ", ageOfProperty=" + ageOfProperty +
            ", amenities='" + amenities + '\'' +
            ", proximityToImportantLocations=" + proximityToImportantLocations +
            ", floorLevel=" + floorLevel +
            ", propertyStatus='" + propertyStatus + '\'' +
            '}';
    }
}

