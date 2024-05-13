/*
 * LiveFree Health Measurements API
 * The Health Measurements API enables partners to access data from the LiveFree Health Portal.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@lifebeacon.com
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
 * The type of encoding for the raw value.
 */
public enum MeasurementEventRawEncodingType {
  
  TEXT("Text"),
  
  BASE64("Base64");

  private String value;

  MeasurementEventRawEncodingType(String value) {
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
  public static MeasurementEventRawEncodingType fromValue(String value) {
    for (MeasurementEventRawEncodingType b : MeasurementEventRawEncodingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

