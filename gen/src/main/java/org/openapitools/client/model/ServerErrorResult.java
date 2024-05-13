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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A problem details object (see https://datatracker.ietf.org/doc/html/rfc7807).
 */
@JsonPropertyOrder({
  ServerErrorResult.JSON_PROPERTY_TYPE,
  ServerErrorResult.JSON_PROPERTY_TITLE,
  ServerErrorResult.JSON_PROPERTY_STATUS,
  ServerErrorResult.JSON_PROPERTY_DETAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:30.476705269Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ServerErrorResult {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public ServerErrorResult() {
  }

  public ServerErrorResult type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A URI reference that identifies the problem type.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ServerErrorResult title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A summary of the problem type.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ServerErrorResult status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public ServerErrorResult detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * An explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerErrorResult serverErrorResult = (ServerErrorResult) o;
    return Objects.equals(this.type, serverErrorResult.type) &&
        Objects.equals(this.title, serverErrorResult.title) &&
        Objects.equals(this.status, serverErrorResult.status) &&
        Objects.equals(this.detail, serverErrorResult.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerErrorResult {\n");
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

