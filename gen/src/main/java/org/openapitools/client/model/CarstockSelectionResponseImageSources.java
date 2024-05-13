/*
 * CIC-NEW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.7
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
import org.openapitools.client.model.CarstockSelectionResponseImageSourcesBRANDRENDERS;
import org.openapitools.client.model.CarstockSelectionResponseImageSourcesCARSPECIFIC;
import org.openapitools.client.model.CarstockSelectionResponseImageSourcesIMAGINSTUDIO;
import org.openapitools.client.model.CarstockSelectionResponseImageSourcesMATCHWITHINTENANT;
import org.openapitools.client.model.CarstockSelectionResponseImageSourcesPLACEHOLDER;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstockSelectionResponseImageSources
 */
@JsonPropertyOrder({
  CarstockSelectionResponseImageSources.JSON_PROPERTY_I_M_A_G_I_N_S_T_U_D_I_O,
  CarstockSelectionResponseImageSources.JSON_PROPERTY_C_A_R_S_P_E_C_I_F_I_C,
  CarstockSelectionResponseImageSources.JSON_PROPERTY_M_A_T_C_H_W_I_T_H_I_N_T_E_N_A_N_T,
  CarstockSelectionResponseImageSources.JSON_PROPERTY_B_R_A_N_D_R_E_N_D_E_R_S,
  CarstockSelectionResponseImageSources.JSON_PROPERTY_P_L_A_C_E_H_O_L_D_E_R
})
@JsonTypeName("carstockSelectionResponse_imageSources")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockSelectionResponseImageSources {
  public static final String JSON_PROPERTY_I_M_A_G_I_N_S_T_U_D_I_O = "IMAGIN_STUDIO";
  private CarstockSelectionResponseImageSourcesIMAGINSTUDIO IMAGIN_STUDIO;

  public static final String JSON_PROPERTY_C_A_R_S_P_E_C_I_F_I_C = "CAR_SPECIFIC";
  private CarstockSelectionResponseImageSourcesCARSPECIFIC CAR_SPECIFIC;

  public static final String JSON_PROPERTY_M_A_T_C_H_W_I_T_H_I_N_T_E_N_A_N_T = "MATCH_WITHIN_TENANT";
  private CarstockSelectionResponseImageSourcesMATCHWITHINTENANT MATCH_WITHIN_TENANT;

  public static final String JSON_PROPERTY_B_R_A_N_D_R_E_N_D_E_R_S = "BRAND_RENDERS";
  private CarstockSelectionResponseImageSourcesBRANDRENDERS BRAND_RENDERS;

  public static final String JSON_PROPERTY_P_L_A_C_E_H_O_L_D_E_R = "PLACE_HOLDER";
  private CarstockSelectionResponseImageSourcesPLACEHOLDER PLACE_HOLDER;

  public CarstockSelectionResponseImageSources() {
  }

  public CarstockSelectionResponseImageSources IMAGIN_STUDIO(CarstockSelectionResponseImageSourcesIMAGINSTUDIO IMAGIN_STUDIO) {
    
    this.IMAGIN_STUDIO = IMAGIN_STUDIO;
    return this;
  }

   /**
   * Get IMAGIN_STUDIO
   * @return IMAGIN_STUDIO
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_I_M_A_G_I_N_S_T_U_D_I_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockSelectionResponseImageSourcesIMAGINSTUDIO getIMAGINSTUDIO() {
    return IMAGIN_STUDIO;
  }


  @JsonProperty(JSON_PROPERTY_I_M_A_G_I_N_S_T_U_D_I_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIMAGINSTUDIO(CarstockSelectionResponseImageSourcesIMAGINSTUDIO IMAGIN_STUDIO) {
    this.IMAGIN_STUDIO = IMAGIN_STUDIO;
  }


  public CarstockSelectionResponseImageSources CAR_SPECIFIC(CarstockSelectionResponseImageSourcesCARSPECIFIC CAR_SPECIFIC) {
    
    this.CAR_SPECIFIC = CAR_SPECIFIC;
    return this;
  }

   /**
   * Get CAR_SPECIFIC
   * @return CAR_SPECIFIC
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_A_R_S_P_E_C_I_F_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockSelectionResponseImageSourcesCARSPECIFIC getCARSPECIFIC() {
    return CAR_SPECIFIC;
  }


  @JsonProperty(JSON_PROPERTY_C_A_R_S_P_E_C_I_F_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCARSPECIFIC(CarstockSelectionResponseImageSourcesCARSPECIFIC CAR_SPECIFIC) {
    this.CAR_SPECIFIC = CAR_SPECIFIC;
  }


  public CarstockSelectionResponseImageSources MATCH_WITHIN_TENANT(CarstockSelectionResponseImageSourcesMATCHWITHINTENANT MATCH_WITHIN_TENANT) {
    
    this.MATCH_WITHIN_TENANT = MATCH_WITHIN_TENANT;
    return this;
  }

   /**
   * Get MATCH_WITHIN_TENANT
   * @return MATCH_WITHIN_TENANT
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_M_A_T_C_H_W_I_T_H_I_N_T_E_N_A_N_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockSelectionResponseImageSourcesMATCHWITHINTENANT getMATCHWITHINTENANT() {
    return MATCH_WITHIN_TENANT;
  }


  @JsonProperty(JSON_PROPERTY_M_A_T_C_H_W_I_T_H_I_N_T_E_N_A_N_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMATCHWITHINTENANT(CarstockSelectionResponseImageSourcesMATCHWITHINTENANT MATCH_WITHIN_TENANT) {
    this.MATCH_WITHIN_TENANT = MATCH_WITHIN_TENANT;
  }


  public CarstockSelectionResponseImageSources BRAND_RENDERS(CarstockSelectionResponseImageSourcesBRANDRENDERS BRAND_RENDERS) {
    
    this.BRAND_RENDERS = BRAND_RENDERS;
    return this;
  }

   /**
   * Get BRAND_RENDERS
   * @return BRAND_RENDERS
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_B_R_A_N_D_R_E_N_D_E_R_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockSelectionResponseImageSourcesBRANDRENDERS getBRANDRENDERS() {
    return BRAND_RENDERS;
  }


  @JsonProperty(JSON_PROPERTY_B_R_A_N_D_R_E_N_D_E_R_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBRANDRENDERS(CarstockSelectionResponseImageSourcesBRANDRENDERS BRAND_RENDERS) {
    this.BRAND_RENDERS = BRAND_RENDERS;
  }


  public CarstockSelectionResponseImageSources PLACE_HOLDER(CarstockSelectionResponseImageSourcesPLACEHOLDER PLACE_HOLDER) {
    
    this.PLACE_HOLDER = PLACE_HOLDER;
    return this;
  }

   /**
   * Get PLACE_HOLDER
   * @return PLACE_HOLDER
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P_L_A_C_E_H_O_L_D_E_R)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarstockSelectionResponseImageSourcesPLACEHOLDER getPLACEHOLDER() {
    return PLACE_HOLDER;
  }


  @JsonProperty(JSON_PROPERTY_P_L_A_C_E_H_O_L_D_E_R)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPLACEHOLDER(CarstockSelectionResponseImageSourcesPLACEHOLDER PLACE_HOLDER) {
    this.PLACE_HOLDER = PLACE_HOLDER;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockSelectionResponseImageSources carstockSelectionResponseImageSources = (CarstockSelectionResponseImageSources) o;
    return Objects.equals(this.IMAGIN_STUDIO, carstockSelectionResponseImageSources.IMAGIN_STUDIO) &&
        Objects.equals(this.CAR_SPECIFIC, carstockSelectionResponseImageSources.CAR_SPECIFIC) &&
        Objects.equals(this.MATCH_WITHIN_TENANT, carstockSelectionResponseImageSources.MATCH_WITHIN_TENANT) &&
        Objects.equals(this.BRAND_RENDERS, carstockSelectionResponseImageSources.BRAND_RENDERS) &&
        Objects.equals(this.PLACE_HOLDER, carstockSelectionResponseImageSources.PLACE_HOLDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IMAGIN_STUDIO, CAR_SPECIFIC, MATCH_WITHIN_TENANT, BRAND_RENDERS, PLACE_HOLDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockSelectionResponseImageSources {\n");
    sb.append("    IMAGIN_STUDIO: ").append(toIndentedString(IMAGIN_STUDIO)).append("\n");
    sb.append("    CAR_SPECIFIC: ").append(toIndentedString(CAR_SPECIFIC)).append("\n");
    sb.append("    MATCH_WITHIN_TENANT: ").append(toIndentedString(MATCH_WITHIN_TENANT)).append("\n");
    sb.append("    BRAND_RENDERS: ").append(toIndentedString(BRAND_RENDERS)).append("\n");
    sb.append("    PLACE_HOLDER: ").append(toIndentedString(PLACE_HOLDER)).append("\n");
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
