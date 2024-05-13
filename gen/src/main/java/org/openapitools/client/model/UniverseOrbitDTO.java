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
 * UniverseOrbitDTO
 */
@JsonPropertyOrder({
  UniverseOrbitDTO.JSON_PROPERTY_CODE,
  UniverseOrbitDTO.JSON_PROPERTY_DATE_ADDED,
  UniverseOrbitDTO.JSON_PROPERTY_DATE_MODIFIED,
  UniverseOrbitDTO.JSON_PROPERTY_ID,
  UniverseOrbitDTO.JSON_PROPERTY_ID_STAR_SYSTEM,
  UniverseOrbitDTO.JSON_PROPERTY_IS_AVAILABLE,
  UniverseOrbitDTO.JSON_PROPERTY_IS_DEFAULT,
  UniverseOrbitDTO.JSON_PROPERTY_IS_LAGRANGE,
  UniverseOrbitDTO.JSON_PROPERTY_IS_VISIBLE,
  UniverseOrbitDTO.JSON_PROPERTY_NAME,
  UniverseOrbitDTO.JSON_PROPERTY_NAME_ORIGIN,
  UniverseOrbitDTO.JSON_PROPERTY_STAR_SYSTEM_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UniverseOrbitDTO {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DATE_ADDED = "date_added";
  private BigDecimal dateAdded;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "date_modified";
  private BigDecimal dateModified;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_ID_STAR_SYSTEM = "id_star_system";
  private BigDecimal idStarSystem;

  public static final String JSON_PROPERTY_IS_AVAILABLE = "is_available";
  private BigDecimal isAvailable;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private BigDecimal isDefault;

  public static final String JSON_PROPERTY_IS_LAGRANGE = "is_lagrange";
  private BigDecimal isLagrange;

  public static final String JSON_PROPERTY_IS_VISIBLE = "is_visible";
  private BigDecimal isVisible;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAME_ORIGIN = "name_origin";
  private String nameOrigin;

  public static final String JSON_PROPERTY_STAR_SYSTEM_NAME = "star_system_name";
  private String starSystemName;

  public UniverseOrbitDTO() {
  }

  public UniverseOrbitDTO code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public UniverseOrbitDTO dateAdded(BigDecimal dateAdded) {
    
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


  public UniverseOrbitDTO dateModified(BigDecimal dateModified) {
    
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


  public UniverseOrbitDTO id(BigDecimal id) {
    
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


  public UniverseOrbitDTO idStarSystem(BigDecimal idStarSystem) {
    
    this.idStarSystem = idStarSystem;
    return this;
  }

   /**
   * Get idStarSystem
   * @return idStarSystem
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_STAR_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdStarSystem() {
    return idStarSystem;
  }


  @JsonProperty(JSON_PROPERTY_ID_STAR_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdStarSystem(BigDecimal idStarSystem) {
    this.idStarSystem = idStarSystem;
  }


  public UniverseOrbitDTO isAvailable(BigDecimal isAvailable) {
    
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Get isAvailable
   * @return isAvailable
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIsAvailable() {
    return isAvailable;
  }


  @JsonProperty(JSON_PROPERTY_IS_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAvailable(BigDecimal isAvailable) {
    this.isAvailable = isAvailable;
  }


  public UniverseOrbitDTO isDefault(BigDecimal isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(BigDecimal isDefault) {
    this.isDefault = isDefault;
  }


  public UniverseOrbitDTO isLagrange(BigDecimal isLagrange) {
    
    this.isLagrange = isLagrange;
    return this;
  }

   /**
   * Get isLagrange
   * @return isLagrange
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_LAGRANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIsLagrange() {
    return isLagrange;
  }


  @JsonProperty(JSON_PROPERTY_IS_LAGRANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLagrange(BigDecimal isLagrange) {
    this.isLagrange = isLagrange;
  }


  public UniverseOrbitDTO isVisible(BigDecimal isVisible) {
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIsVisible() {
    return isVisible;
  }


  @JsonProperty(JSON_PROPERTY_IS_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsVisible(BigDecimal isVisible) {
    this.isVisible = isVisible;
  }


  public UniverseOrbitDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  public UniverseOrbitDTO nameOrigin(String nameOrigin) {
    
    this.nameOrigin = nameOrigin;
    return this;
  }

   /**
   * Get nameOrigin
   * @return nameOrigin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameOrigin() {
    return nameOrigin;
  }


  @JsonProperty(JSON_PROPERTY_NAME_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameOrigin(String nameOrigin) {
    this.nameOrigin = nameOrigin;
  }


  public UniverseOrbitDTO starSystemName(String starSystemName) {
    
    this.starSystemName = starSystemName;
    return this;
  }

   /**
   * Get starSystemName
   * @return starSystemName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STAR_SYSTEM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStarSystemName() {
    return starSystemName;
  }


  @JsonProperty(JSON_PROPERTY_STAR_SYSTEM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStarSystemName(String starSystemName) {
    this.starSystemName = starSystemName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniverseOrbitDTO universeOrbitDTO = (UniverseOrbitDTO) o;
    return Objects.equals(this.code, universeOrbitDTO.code) &&
        Objects.equals(this.dateAdded, universeOrbitDTO.dateAdded) &&
        Objects.equals(this.dateModified, universeOrbitDTO.dateModified) &&
        Objects.equals(this.id, universeOrbitDTO.id) &&
        Objects.equals(this.idStarSystem, universeOrbitDTO.idStarSystem) &&
        Objects.equals(this.isAvailable, universeOrbitDTO.isAvailable) &&
        Objects.equals(this.isDefault, universeOrbitDTO.isDefault) &&
        Objects.equals(this.isLagrange, universeOrbitDTO.isLagrange) &&
        Objects.equals(this.isVisible, universeOrbitDTO.isVisible) &&
        Objects.equals(this.name, universeOrbitDTO.name) &&
        Objects.equals(this.nameOrigin, universeOrbitDTO.nameOrigin) &&
        Objects.equals(this.starSystemName, universeOrbitDTO.starSystemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, dateAdded, dateModified, id, idStarSystem, isAvailable, isDefault, isLagrange, isVisible, name, nameOrigin, starSystemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniverseOrbitDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStarSystem: ").append(toIndentedString(idStarSystem)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isLagrange: ").append(toIndentedString(isLagrange)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameOrigin: ").append(toIndentedString(nameOrigin)).append("\n");
    sb.append("    starSystemName: ").append(toIndentedString(starSystemName)).append("\n");
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

