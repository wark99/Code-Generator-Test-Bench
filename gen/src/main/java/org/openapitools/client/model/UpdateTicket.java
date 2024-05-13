/*
 * Optima Solutions - Asteo Ticketing
 * Remote API to interact between Freshdesk accounts and MasMovil application.
 *
 * The version of the OpenAPI document: 1.0.0
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
 * UpdateTicket
 */
@JsonPropertyOrder({
  UpdateTicket.JSON_PROPERTY_MIRROR_KEY,
  UpdateTicket.JSON_PROPERTY_PRIMARY_KEY,
  UpdateTicket.JSON_PROPERTY_DIALOG,
  UpdateTicket.JSON_PROPERTY_TROUBLE_TYPE,
  UpdateTicket.JSON_PROPERTY_TROUBLE_DESCRIPTION,
  UpdateTicket.JSON_PROPERTY_PREFERRED_PRIORITY,
  UpdateTicket.JSON_PROPERTY_CUSTOMER_TROUBLE_NUM,
  UpdateTicket.JSON_PROPERTY_WH1_PARAMETER
})
@JsonTypeName("updateTicket")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:28.900088471Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateTicket {
  public static final String JSON_PROPERTY_MIRROR_KEY = "mirrorKey";
  private JsonNullable<Object> mirrorKey = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PRIMARY_KEY = "primaryKey";
  private JsonNullable<Object> primaryKey = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DIALOG = "dialog";
  private JsonNullable<Object> dialog = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TROUBLE_TYPE = "troubleType";
  private JsonNullable<Object> troubleType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TROUBLE_DESCRIPTION = "troubleDescription";
  private JsonNullable<Object> troubleDescription = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PREFERRED_PRIORITY = "preferredPriority";
  private JsonNullable<Object> preferredPriority = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CUSTOMER_TROUBLE_NUM = "customerTroubleNum";
  private JsonNullable<Object> customerTroubleNum = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WH1_PARAMETER = "wh1Parameter";
  private JsonNullable<Object> wh1Parameter = JsonNullable.<Object>of(null);

  public UpdateTicket() {
  }

  public UpdateTicket mirrorKey(Object mirrorKey) {
    this.mirrorKey = JsonNullable.<Object>of(mirrorKey);
    
    return this;
  }

   /**
   * Get mirrorKey
   * @return mirrorKey
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMirrorKey() {
        return mirrorKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIRROR_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMirrorKey_JsonNullable() {
    return mirrorKey;
  }
  
  @JsonProperty(JSON_PROPERTY_MIRROR_KEY)
  public void setMirrorKey_JsonNullable(JsonNullable<Object> mirrorKey) {
    this.mirrorKey = mirrorKey;
  }

  public void setMirrorKey(Object mirrorKey) {
    this.mirrorKey = JsonNullable.<Object>of(mirrorKey);
  }


  public UpdateTicket primaryKey(Object primaryKey) {
    this.primaryKey = JsonNullable.<Object>of(primaryKey);
    
    return this;
  }

   /**
   * Primary key from TO system.
   * @return primaryKey
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPrimaryKey() {
        return primaryKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPrimaryKey_JsonNullable() {
    return primaryKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_KEY)
  public void setPrimaryKey_JsonNullable(JsonNullable<Object> primaryKey) {
    this.primaryKey = primaryKey;
  }

  public void setPrimaryKey(Object primaryKey) {
    this.primaryKey = JsonNullable.<Object>of(primaryKey);
  }


  public UpdateTicket dialog(Object dialog) {
    this.dialog = JsonNullable.<Object>of(dialog);
    
    return this;
  }

   /**
   * Get dialog
   * @return dialog
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDialog() {
        return dialog.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDialog_JsonNullable() {
    return dialog;
  }
  
  @JsonProperty(JSON_PROPERTY_DIALOG)
  public void setDialog_JsonNullable(JsonNullable<Object> dialog) {
    this.dialog = dialog;
  }

  public void setDialog(Object dialog) {
    this.dialog = JsonNullable.<Object>of(dialog);
  }


  public UpdateTicket troubleType(Object troubleType) {
    this.troubleType = JsonNullable.<Object>of(troubleType);
    
    return this;
  }

   /**
   * Get troubleType
   * @return troubleType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTroubleType() {
        return troubleType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TROUBLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTroubleType_JsonNullable() {
    return troubleType;
  }
  
  @JsonProperty(JSON_PROPERTY_TROUBLE_TYPE)
  public void setTroubleType_JsonNullable(JsonNullable<Object> troubleType) {
    this.troubleType = troubleType;
  }

  public void setTroubleType(Object troubleType) {
    this.troubleType = JsonNullable.<Object>of(troubleType);
  }


  public UpdateTicket troubleDescription(Object troubleDescription) {
    this.troubleDescription = JsonNullable.<Object>of(troubleDescription);
    
    return this;
  }

   /**
   * Get troubleDescription
   * @return troubleDescription
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTroubleDescription() {
        return troubleDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TROUBLE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTroubleDescription_JsonNullable() {
    return troubleDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_TROUBLE_DESCRIPTION)
  public void setTroubleDescription_JsonNullable(JsonNullable<Object> troubleDescription) {
    this.troubleDescription = troubleDescription;
  }

  public void setTroubleDescription(Object troubleDescription) {
    this.troubleDescription = JsonNullable.<Object>of(troubleDescription);
  }


  public UpdateTicket preferredPriority(Object preferredPriority) {
    this.preferredPriority = JsonNullable.<Object>of(preferredPriority);
    
    return this;
  }

   /**
   * Get preferredPriority
   * @return preferredPriority
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPreferredPriority() {
        return preferredPriority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREFERRED_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPreferredPriority_JsonNullable() {
    return preferredPriority;
  }
  
  @JsonProperty(JSON_PROPERTY_PREFERRED_PRIORITY)
  public void setPreferredPriority_JsonNullable(JsonNullable<Object> preferredPriority) {
    this.preferredPriority = preferredPriority;
  }

  public void setPreferredPriority(Object preferredPriority) {
    this.preferredPriority = JsonNullable.<Object>of(preferredPriority);
  }


  public UpdateTicket customerTroubleNum(Object customerTroubleNum) {
    this.customerTroubleNum = JsonNullable.<Object>of(customerTroubleNum);
    
    return this;
  }

   /**
   * Get customerTroubleNum
   * @return customerTroubleNum
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCustomerTroubleNum() {
        return customerTroubleNum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_TROUBLE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCustomerTroubleNum_JsonNullable() {
    return customerTroubleNum;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_TROUBLE_NUM)
  public void setCustomerTroubleNum_JsonNullable(JsonNullable<Object> customerTroubleNum) {
    this.customerTroubleNum = customerTroubleNum;
  }

  public void setCustomerTroubleNum(Object customerTroubleNum) {
    this.customerTroubleNum = JsonNullable.<Object>of(customerTroubleNum);
  }


  public UpdateTicket wh1Parameter(Object wh1Parameter) {
    this.wh1Parameter = JsonNullable.<Object>of(wh1Parameter);
    
    return this;
  }

   /**
   * Get wh1Parameter
   * @return wh1Parameter
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWh1Parameter() {
        return wh1Parameter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WH1_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWh1Parameter_JsonNullable() {
    return wh1Parameter;
  }
  
  @JsonProperty(JSON_PROPERTY_WH1_PARAMETER)
  public void setWh1Parameter_JsonNullable(JsonNullable<Object> wh1Parameter) {
    this.wh1Parameter = wh1Parameter;
  }

  public void setWh1Parameter(Object wh1Parameter) {
    this.wh1Parameter = JsonNullable.<Object>of(wh1Parameter);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTicket updateTicket = (UpdateTicket) o;
    return equalsNullable(this.mirrorKey, updateTicket.mirrorKey) &&
        equalsNullable(this.primaryKey, updateTicket.primaryKey) &&
        equalsNullable(this.dialog, updateTicket.dialog) &&
        equalsNullable(this.troubleType, updateTicket.troubleType) &&
        equalsNullable(this.troubleDescription, updateTicket.troubleDescription) &&
        equalsNullable(this.preferredPriority, updateTicket.preferredPriority) &&
        equalsNullable(this.customerTroubleNum, updateTicket.customerTroubleNum) &&
        equalsNullable(this.wh1Parameter, updateTicket.wh1Parameter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(mirrorKey), hashCodeNullable(primaryKey), hashCodeNullable(dialog), hashCodeNullable(troubleType), hashCodeNullable(troubleDescription), hashCodeNullable(preferredPriority), hashCodeNullable(customerTroubleNum), hashCodeNullable(wh1Parameter));
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
    sb.append("class UpdateTicket {\n");
    sb.append("    mirrorKey: ").append(toIndentedString(mirrorKey)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    dialog: ").append(toIndentedString(dialog)).append("\n");
    sb.append("    troubleType: ").append(toIndentedString(troubleType)).append("\n");
    sb.append("    troubleDescription: ").append(toIndentedString(troubleDescription)).append("\n");
    sb.append("    preferredPriority: ").append(toIndentedString(preferredPriority)).append("\n");
    sb.append("    customerTroubleNum: ").append(toIndentedString(customerTroubleNum)).append("\n");
    sb.append("    wh1Parameter: ").append(toIndentedString(wh1Parameter)).append("\n");
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

