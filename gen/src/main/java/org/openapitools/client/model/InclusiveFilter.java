/*
 * Perch API
 * Perch API for accessing data from Perch. See our [API Guide](https://docs.google.com/document/d/1ms6LFNwFN4C4WkrfWs8Hlu5igFBpNLhNr7uLEkGmvJA) for guidance on best practices. <br/> <br/> Find out more about Perch at [https://perch.fit](https://perch.fit) or by contacting us at [support@perch.fit](mailto:support@perch.fit).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support@perch.fit
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
 * Gets or Sets InclusiveFilter
 */
public enum InclusiveFilter {
  
  ONLY("ONLY"),
  
  INCLUDE("INCLUDE"),
  
  EXCLUDE("EXCLUDE");

  private String value;

  InclusiveFilter(String value) {
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
  public static InclusiveFilter fromValue(String value) {
    for (InclusiveFilter b : InclusiveFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

