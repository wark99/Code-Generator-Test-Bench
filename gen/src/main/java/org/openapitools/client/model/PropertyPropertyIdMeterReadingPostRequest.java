/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import org.openapitools.client.model.DateRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyPropertyIdMeterReadingPostRequest
 */
@JsonPropertyOrder({
  PropertyPropertyIdMeterReadingPostRequest.JSON_PROPERTY_DATE,
  PropertyPropertyIdMeterReadingPostRequest.JSON_PROPERTY_TYPE,
  PropertyPropertyIdMeterReadingPostRequest.JSON_PROPERTY_METER_READING,
  PropertyPropertyIdMeterReadingPostRequest.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("_property__property_id__meter_reading_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyPropertyIdMeterReadingPostRequest {
  public static final String JSON_PROPERTY_DATE = "date";
  private DateRequest date;

  /**
   * 1 &#x3D; Gas (MOVE OUT), 2 &#x3D; Gas (MOVE IN), 3 &#x3D; Electricity TOTAL RATE (MOVE OUT), 4 &#x3D; Electricity TOTAL RATE (MOVE IN), 5 &#x3D; Electricity R2 LOW RATE (MOVE OUT), 6 &#x3D; Electricity R2 LOW RATE (MOVE IN), 7 &#x3D; Electricity R1 NORMAL RATE (MOVE OUT), 8 &#x3D; Electricity R1 NORMAL RATE (MOVE IN), 9 &#x3D; Electricity R1 NORMAL RATE (OTHER READING), 10 &#x3D; Electricity  R2 LOW RATE (OTHER READING), 11 &#x3D; Electricity TOTAL RATE (OTHER READINGS), 12 &#x3D; Gas (OTHER READING), 13 &#x3D; Water (MOVE IN), 14 &#x3D; Water (MOVE OUT), 15 &#x3D; Water (OTHER READING)
   */
  public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_8(8),
    
    NUMBER_9(9),
    
    NUMBER_10(10),
    
    NUMBER_11(11),
    
    NUMBER_12(12),
    
    NUMBER_13(13),
    
    NUMBER_14(14),
    
    NUMBER_15(15);

    private Integer value;

    TypeEnum(Integer value) {
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
    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_METER_READING = "meter_reading";
  private Integer meterReading;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public PropertyPropertyIdMeterReadingPostRequest() {
  }

  public PropertyPropertyIdMeterReadingPostRequest date(DateRequest date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateRequest getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(DateRequest date) {
    this.date = date;
  }


  public PropertyPropertyIdMeterReadingPostRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 1 &#x3D; Gas (MOVE OUT), 2 &#x3D; Gas (MOVE IN), 3 &#x3D; Electricity TOTAL RATE (MOVE OUT), 4 &#x3D; Electricity TOTAL RATE (MOVE IN), 5 &#x3D; Electricity R2 LOW RATE (MOVE OUT), 6 &#x3D; Electricity R2 LOW RATE (MOVE IN), 7 &#x3D; Electricity R1 NORMAL RATE (MOVE OUT), 8 &#x3D; Electricity R1 NORMAL RATE (MOVE IN), 9 &#x3D; Electricity R1 NORMAL RATE (OTHER READING), 10 &#x3D; Electricity  R2 LOW RATE (OTHER READING), 11 &#x3D; Electricity TOTAL RATE (OTHER READINGS), 12 &#x3D; Gas (OTHER READING), 13 &#x3D; Water (MOVE IN), 14 &#x3D; Water (MOVE OUT), 15 &#x3D; Water (OTHER READING)
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PropertyPropertyIdMeterReadingPostRequest meterReading(Integer meterReading) {
    
    this.meterReading = meterReading;
    return this;
  }

   /**
   * The value of the meter.
   * @return meterReading
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METER_READING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMeterReading() {
    return meterReading;
  }


  @JsonProperty(JSON_PROPERTY_METER_READING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeterReading(Integer meterReading) {
    this.meterReading = meterReading;
  }


  public PropertyPropertyIdMeterReadingPostRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Any extra information pertaining to the reading.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyPropertyIdMeterReadingPostRequest propertyPropertyIdMeterReadingPostRequest = (PropertyPropertyIdMeterReadingPostRequest) o;
    return Objects.equals(this.date, propertyPropertyIdMeterReadingPostRequest.date) &&
        Objects.equals(this.type, propertyPropertyIdMeterReadingPostRequest.type) &&
        Objects.equals(this.meterReading, propertyPropertyIdMeterReadingPostRequest.meterReading) &&
        Objects.equals(this.description, propertyPropertyIdMeterReadingPostRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, type, meterReading, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyPropertyIdMeterReadingPostRequest {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    meterReading: ").append(toIndentedString(meterReading)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

