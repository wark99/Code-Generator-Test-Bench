/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RequestBody2
 */
@JsonPropertyOrder({
  RequestBody2.JSON_PROPERTY_PERIODICITY,
  RequestBody2.JSON_PROPERTY_STORAGE_RESERVED_ACRONIS
})
@JsonTypeName("Request_body_2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody2 {
  /**
   * Commitment period (in years)
   */
  public enum PeriodicityEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Double value;

    PeriodicityEnum(Double value) {
      this.value = value;
    }

    @JsonValue
    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodicityEnum fromValue(Double value) {
      for (PeriodicityEnum b : PeriodicityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private PeriodicityEnum periodicity;

  public static final String JSON_PROPERTY_STORAGE_RESERVED_ACRONIS = "storage_reserved_acronis";
  private Integer storageReservedAcronis;

  public RequestBody2() {
  }

  public RequestBody2 periodicity(PeriodicityEnum periodicity) {
    
    this.periodicity = periodicity;
    return this;
  }

   /**
   * Commitment period (in years)
   * @return periodicity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodicityEnum getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(PeriodicityEnum periodicity) {
    this.periodicity = periodicity;
  }


  public RequestBody2 storageReservedAcronis(Integer storageReservedAcronis) {
    
    this.storageReservedAcronis = storageReservedAcronis;
    return this;
  }

   /**
   * Allocated storage size for Acronis (Bytes)
   * @return storageReservedAcronis
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_RESERVED_ACRONIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStorageReservedAcronis() {
    return storageReservedAcronis;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_RESERVED_ACRONIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageReservedAcronis(Integer storageReservedAcronis) {
    this.storageReservedAcronis = storageReservedAcronis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody2 requestBody2 = (RequestBody2) o;
    return Objects.equals(this.periodicity, requestBody2.periodicity) &&
        Objects.equals(this.storageReservedAcronis, requestBody2.storageReservedAcronis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodicity, storageReservedAcronis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody2 {\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    storageReservedAcronis: ").append(toIndentedString(storageReservedAcronis)).append("\n");
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

