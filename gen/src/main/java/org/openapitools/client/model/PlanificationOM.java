/*
 * Portail auditeur
 * <strong>Documentation de l'api du portail auditeur de Qualibat.</strong> <br> <br> L'identification est effectuée via un Bearer token fourni par Qualibat.<br> Vous pouvez obtenir plus d'information en contactant le support sur l'adresse email <support.portail-auditeur@qualibat.com> <br><br> Des webhooks sont disponibles pour être notifiés des actions effectuées à partir du portail auditeur.
 *
 * The version of the OpenAPI document: 1.0.12
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
import org.openapitools.client.model.EnumTypeNotification;
import org.openapitools.client.model.PlanificationOMData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlanificationOM
 */
@JsonPropertyOrder({
  PlanificationOM.JSON_PROPERTY_TYPE,
  PlanificationOM.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:49.756884279Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PlanificationOM {
  public static final String JSON_PROPERTY_TYPE = "type";
  private EnumTypeNotification type;

  public static final String JSON_PROPERTY_DATA = "data";
  private PlanificationOMData data;

  public PlanificationOM() {
  }

  public PlanificationOM type(EnumTypeNotification type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumTypeNotification getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(EnumTypeNotification type) {
    this.type = type;
  }


  public PlanificationOM data(PlanificationOMData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlanificationOMData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(PlanificationOMData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanificationOM planificationOM = (PlanificationOM) o;
    return Objects.equals(this.type, planificationOM.type) &&
        Objects.equals(this.data, planificationOM.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanificationOM {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

