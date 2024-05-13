/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AvailabilityVirutalTechResponseInner
 */
@JsonPropertyOrder({
  AvailabilityVirutalTechResponseInner.JSON_PROPERTY_DATE,
  AvailabilityVirutalTechResponseInner.JSON_PROPERTY_SLOTS
})
@JsonTypeName("AvailabilityVirutalTechResponse_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityVirutalTechResponseInner {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_SLOTS = "slots";
  private List<String> slots;

  public AvailabilityVirutalTechResponseInner() {
  }

  public AvailabilityVirutalTechResponseInner date(String date) {
    
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

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public AvailabilityVirutalTechResponseInner slots(List<String> slots) {
    
    this.slots = slots;
    return this;
  }

  public AvailabilityVirutalTechResponseInner addSlotsItem(String slotsItem) {
    if (this.slots == null) {
      this.slots = new ArrayList<>();
    }
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * Slots are in the following format: HHMM-HHMM. To provide the time slot of 1:00pm to 1:30 pm you would received 1300-1330
   * @return slots
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSlots() {
    return slots;
  }


  @JsonProperty(JSON_PROPERTY_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlots(List<String> slots) {
    this.slots = slots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityVirutalTechResponseInner availabilityVirutalTechResponseInner = (AvailabilityVirutalTechResponseInner) o;
    return Objects.equals(this.date, availabilityVirutalTechResponseInner.date) &&
        Objects.equals(this.slots, availabilityVirutalTechResponseInner.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, slots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityVirutalTechResponseInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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
