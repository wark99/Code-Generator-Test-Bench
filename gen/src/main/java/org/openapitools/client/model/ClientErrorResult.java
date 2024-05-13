/*
 * LiveFree PERS API
 * The Personal Emergency Response System (PERS) API enables partners to receive PERS alarms and location data via HTTP webhook.  **Alarm Types**  | Code | Alarm Type | Description | |---|---|---| | E100 | Medical Alarm (Primary Button) | The medical alarm button was activated. | | E101 | Personal Emergency Alarm (Pendant Button) | The personal emergency button was activated. | | E111 | Smoke Alarm | Smoke was detected by a compatible smoke detector. | | E301 | AC Power Loss | The device has lost AC power. | | E302 | Low Battery | The device battery is low. | | E308 | System Shutdown | The device is powering off due to low battery. | | E601 | Manual Test | A manually triggered test signal. | | E602 | Periodic Test | The device sent a recurring test signal. | | E641 | Fall Alarm | The device detected a fall. | | E643 | Geofence Exit | The user has exited a geofence area. | | E644 | Geofence Enter | The user has entered a geofence area. | | E646 | Remote Patient Monitoring (RPM) Alarm | A compatible remote patient monitoring device reported an alarm. | | R100 | Medical Alarm Cancel | A medical alarm was cancelled by the user. | **Provisioning**  Webhooks must be configured by LiveFree support. To configure your webhook, contact support with your webhook URL and authentication info. 
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
 * A problem details object (see https://datatracker.ietf.org/doc/html/rfc7807).
 */
@JsonPropertyOrder({
  ClientErrorResult.JSON_PROPERTY_TYPE,
  ClientErrorResult.JSON_PROPERTY_TITLE,
  ClientErrorResult.JSON_PROPERTY_STATUS,
  ClientErrorResult.JSON_PROPERTY_DETAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:36.505131168Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ClientErrorResult {
  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<Integer> status = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private JsonNullable<String> detail = JsonNullable.<String>undefined();

  public ClientErrorResult() {
  }

  public ClientErrorResult type(String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

   /**
   * A URI reference that identifies the problem type.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }


  public ClientErrorResult title(String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

   /**
   * A summary of the problem type.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public ClientErrorResult status(Integer status) {
    this.status = JsonNullable.<Integer>of(status);
    
    return this;
  }

   /**
   * The HTTP status code.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<Integer> status) {
    this.status = status;
  }

  public void setStatus(Integer status) {
    this.status = JsonNullable.<Integer>of(status);
  }


  public ClientErrorResult detail(String detail) {
    this.detail = JsonNullable.<String>of(detail);
    
    return this;
  }

   /**
   * An explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDetail() {
        return detail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDetail_JsonNullable() {
    return detail;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAIL)
  public void setDetail_JsonNullable(JsonNullable<String> detail) {
    this.detail = detail;
  }

  public void setDetail(String detail) {
    this.detail = JsonNullable.<String>of(detail);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientErrorResult clientErrorResult = (ClientErrorResult) o;
    return equalsNullable(this.type, clientErrorResult.type) &&
        equalsNullable(this.title, clientErrorResult.title) &&
        equalsNullable(this.status, clientErrorResult.status) &&
        equalsNullable(this.detail, clientErrorResult.detail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(type), hashCodeNullable(title), hashCodeNullable(status), hashCodeNullable(detail));
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
    sb.append("class ClientErrorResult {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

