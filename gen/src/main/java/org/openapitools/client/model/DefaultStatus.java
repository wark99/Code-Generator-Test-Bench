/*
 * AIRBIT IoT Workspace REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
 *
 * The version of the OpenAPI document: 2.0.1
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
 * Gets or Sets DefaultStatus
 */
public enum DefaultStatus {
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  DefaultStatus(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DefaultStatus fromValue(Integer value) {
    for (DefaultStatus b : DefaultStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

