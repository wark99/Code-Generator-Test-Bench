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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods
 */
@JsonPropertyOrder({
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_TELEVISION,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_FRIDGE_FREEZER,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_TUMBLE_DRYER,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_DVD,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_MICROWAVE,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_DISHWASHER,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_SOUND_SYSTEM,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_WASHING_MACHINE,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_BROADBAND_CONNECTION,
  PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.JSON_PROPERTY_OTHER_ELECTRICAL_GOODS
})
@JsonTypeName("_property_lettings__id__marketing_get_200_response_value_details_electrical_goods")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods {
  public static final String JSON_PROPERTY_TELEVISION = "television";
  private Boolean television;

  public static final String JSON_PROPERTY_FRIDGE_FREEZER = "fridge_freezer";
  private Boolean fridgeFreezer;

  public static final String JSON_PROPERTY_TUMBLE_DRYER = "tumble_dryer";
  private Boolean tumbleDryer;

  public static final String JSON_PROPERTY_DVD = "dvd";
  private Boolean dvd;

  public static final String JSON_PROPERTY_MICROWAVE = "microwave";
  private Boolean microwave;

  public static final String JSON_PROPERTY_DISHWASHER = "dishwasher";
  private Boolean dishwasher;

  public static final String JSON_PROPERTY_SOUND_SYSTEM = "sound_system";
  private Boolean soundSystem;

  public static final String JSON_PROPERTY_WASHING_MACHINE = "washing_machine";
  private Boolean washingMachine;

  public static final String JSON_PROPERTY_BROADBAND_CONNECTION = "broadband_connection";
  private Boolean broadbandConnection;

  public static final String JSON_PROPERTY_OTHER_ELECTRICAL_GOODS = "other_electrical_goods";
  private JsonNullable<Object> otherElectricalGoods = JsonNullable.<Object>of(null);

  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods() {
  }

  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods television(Boolean television) {
    
    this.television = television;
    return this;
  }

   /**
   * Get television
   * @return television
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TELEVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTelevision() {
    return television;
  }


  @JsonProperty(JSON_PROPERTY_TELEVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelevision(Boolean television) {
    this.television = television;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods fridgeFreezer(Boolean fridgeFreezer) {
    
    this.fridgeFreezer = fridgeFreezer;
    return this;
  }

   /**
   * Get fridgeFreezer
   * @return fridgeFreezer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRIDGE_FREEZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFridgeFreezer() {
    return fridgeFreezer;
  }


  @JsonProperty(JSON_PROPERTY_FRIDGE_FREEZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFridgeFreezer(Boolean fridgeFreezer) {
    this.fridgeFreezer = fridgeFreezer;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods tumbleDryer(Boolean tumbleDryer) {
    
    this.tumbleDryer = tumbleDryer;
    return this;
  }

   /**
   * Get tumbleDryer
   * @return tumbleDryer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUMBLE_DRYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTumbleDryer() {
    return tumbleDryer;
  }


  @JsonProperty(JSON_PROPERTY_TUMBLE_DRYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTumbleDryer(Boolean tumbleDryer) {
    this.tumbleDryer = tumbleDryer;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods dvd(Boolean dvd) {
    
    this.dvd = dvd;
    return this;
  }

   /**
   * Get dvd
   * @return dvd
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DVD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDvd() {
    return dvd;
  }


  @JsonProperty(JSON_PROPERTY_DVD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDvd(Boolean dvd) {
    this.dvd = dvd;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods microwave(Boolean microwave) {
    
    this.microwave = microwave;
    return this;
  }

   /**
   * Get microwave
   * @return microwave
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MICROWAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMicrowave() {
    return microwave;
  }


  @JsonProperty(JSON_PROPERTY_MICROWAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMicrowave(Boolean microwave) {
    this.microwave = microwave;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods dishwasher(Boolean dishwasher) {
    
    this.dishwasher = dishwasher;
    return this;
  }

   /**
   * Get dishwasher
   * @return dishwasher
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISHWASHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDishwasher() {
    return dishwasher;
  }


  @JsonProperty(JSON_PROPERTY_DISHWASHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDishwasher(Boolean dishwasher) {
    this.dishwasher = dishwasher;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods soundSystem(Boolean soundSystem) {
    
    this.soundSystem = soundSystem;
    return this;
  }

   /**
   * Get soundSystem
   * @return soundSystem
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOUND_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSoundSystem() {
    return soundSystem;
  }


  @JsonProperty(JSON_PROPERTY_SOUND_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoundSystem(Boolean soundSystem) {
    this.soundSystem = soundSystem;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods washingMachine(Boolean washingMachine) {
    
    this.washingMachine = washingMachine;
    return this;
  }

   /**
   * Get washingMachine
   * @return washingMachine
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WASHING_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWashingMachine() {
    return washingMachine;
  }


  @JsonProperty(JSON_PROPERTY_WASHING_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWashingMachine(Boolean washingMachine) {
    this.washingMachine = washingMachine;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods broadbandConnection(Boolean broadbandConnection) {
    
    this.broadbandConnection = broadbandConnection;
    return this;
  }

   /**
   * Get broadbandConnection
   * @return broadbandConnection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROADBAND_CONNECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBroadbandConnection() {
    return broadbandConnection;
  }


  @JsonProperty(JSON_PROPERTY_BROADBAND_CONNECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBroadbandConnection(Boolean broadbandConnection) {
    this.broadbandConnection = broadbandConnection;
  }


  public PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods otherElectricalGoods(Object otherElectricalGoods) {
    this.otherElectricalGoods = JsonNullable.<Object>of(otherElectricalGoods);
    
    return this;
  }

   /**
   * Get otherElectricalGoods
   * @return otherElectricalGoods
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOtherElectricalGoods() {
        return otherElectricalGoods.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OTHER_ELECTRICAL_GOODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOtherElectricalGoods_JsonNullable() {
    return otherElectricalGoods;
  }
  
  @JsonProperty(JSON_PROPERTY_OTHER_ELECTRICAL_GOODS)
  public void setOtherElectricalGoods_JsonNullable(JsonNullable<Object> otherElectricalGoods) {
    this.otherElectricalGoods = otherElectricalGoods;
  }

  public void setOtherElectricalGoods(Object otherElectricalGoods) {
    this.otherElectricalGoods = JsonNullable.<Object>of(otherElectricalGoods);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods = (PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods) o;
    return Objects.equals(this.television, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.television) &&
        Objects.equals(this.fridgeFreezer, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.fridgeFreezer) &&
        Objects.equals(this.tumbleDryer, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.tumbleDryer) &&
        Objects.equals(this.dvd, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.dvd) &&
        Objects.equals(this.microwave, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.microwave) &&
        Objects.equals(this.dishwasher, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.dishwasher) &&
        Objects.equals(this.soundSystem, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.soundSystem) &&
        Objects.equals(this.washingMachine, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.washingMachine) &&
        Objects.equals(this.broadbandConnection, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.broadbandConnection) &&
        equalsNullable(this.otherElectricalGoods, propertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods.otherElectricalGoods);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(television, fridgeFreezer, tumbleDryer, dvd, microwave, dishwasher, soundSystem, washingMachine, broadbandConnection, hashCodeNullable(otherElectricalGoods));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyLettingsIdMarketingGet200ResponseValueDetailsElectricalGoods {\n");
    sb.append("    television: ").append(toIndentedString(television)).append("\n");
    sb.append("    fridgeFreezer: ").append(toIndentedString(fridgeFreezer)).append("\n");
    sb.append("    tumbleDryer: ").append(toIndentedString(tumbleDryer)).append("\n");
    sb.append("    dvd: ").append(toIndentedString(dvd)).append("\n");
    sb.append("    microwave: ").append(toIndentedString(microwave)).append("\n");
    sb.append("    dishwasher: ").append(toIndentedString(dishwasher)).append("\n");
    sb.append("    soundSystem: ").append(toIndentedString(soundSystem)).append("\n");
    sb.append("    washingMachine: ").append(toIndentedString(washingMachine)).append("\n");
    sb.append("    broadbandConnection: ").append(toIndentedString(broadbandConnection)).append("\n");
    sb.append("    otherElectricalGoods: ").append(toIndentedString(otherElectricalGoods)).append("\n");
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

