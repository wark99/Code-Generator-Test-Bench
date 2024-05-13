/*
 * Beakon Event API
 * Access Beakon events
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: apiteam@beakon.com
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
 * Modifiers - commercial (commercial property) - fatality - gun - infrastructure (key public infrastructure) - injury (personal injury) - weapon (non-gun, deadly weapon)  Crime - assault - hostage - suspicious (suspicious individual) - trespass - bomb - robbery - theft - vandalism - disturbance (public disturbance) - shooting - threat (criminal threat of harm)  Fire &amp; Medical - fire - explosion - smoke - medical - gas (gas leak) - rescue - hazmat (hazaradous materials)  Traffic - collision - hazard - pursuit (vehicle pursuit) - transit (public transit) - closure (road closure)  Civil - assembly (illegal assembly) - rioting - looting - protest
 */
public enum Tag {
  
  COMMERCIAL("commercial"),
  
  FATALITY("fatality"),
  
  GUN("gun"),
  
  INFRASTRUCTURE("infrastructure"),
  
  INJURY("injury"),
  
  WEAPON("weapon"),
  
  ASSAULT("assault"),
  
  HOSTAGE("hostage"),
  
  SUSPICIOUS("suspicious"),
  
  TRESPASS("trespass"),
  
  BOMB("bomb"),
  
  ROBBERY("robbery"),
  
  THEFT("theft"),
  
  VANDALISM("vandalism"),
  
  DISTURBANCE("disturbance"),
  
  SHOOTING("shooting"),
  
  THREAT("threat"),
  
  FIRE("fire"),
  
  EXPLOSION("explosion"),
  
  SMOKE("smoke"),
  
  MEDICAL("medical"),
  
  GAS("gas"),
  
  RESCUE("rescue"),
  
  HAZMAT("hazmat"),
  
  COLLISION("collision"),
  
  HAZARD("hazard"),
  
  PURSUIT("pursuit"),
  
  TRANSIT("transit"),
  
  CLOSURE("closure"),
  
  ASSEMBLY("assembly"),
  
  RIOTING("rioting"),
  
  LOOTING("looting"),
  
  PROTEST("protest");

  private String value;

  Tag(String value) {
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
  public static Tag fromValue(String value) {
    for (Tag b : Tag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

