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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets enumTypeNotification
 */
public enum EnumTypeNotification {
  
  PUBLICATIONOM("PublicationOM"),
  
  ACCEPTATIONOM("AcceptationOM"),
  
  REFUSOM("RefusOM"),
  
  RECUSATIONENTREPRISE("RecusationEntreprise"),
  
  ANNULATIONOM("AnnulationOM"),
  
  AUDITEUR("Auditeur"),
  
  PLANIFICATIONAUDIT("PlanificationAudit"),
  
  ANNULATIONPLANIFICATIONAUDIT("AnnulationPlanificationAudit"),
  
  INFORMATIONOM("InformationOM"),
  
  SUPERVISEUR("Superviseur"),
  
  ETATOM("EtatOM");

  private String value;

  EnumTypeNotification(String value) {
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
  public static EnumTypeNotification fromValue(String value) {
    for (EnumTypeNotification b : EnumTypeNotification.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

