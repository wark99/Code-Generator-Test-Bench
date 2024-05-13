/*
 * UEX Corp API
 * Created by [@thekronny](https://discord.com/users/224580858432978944). ## Downloads [Secification file](https://app.swaggerhub.com/apiproxy/registry/dolejska-daniel/UEX-API/v2.0?resolved=true&flatten=true&pretty=true) ## Other Resources
 *
 * The version of the OpenAPI document: v2.0
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetUserRefineriesJobsBadRequestResponse
 */
@JsonPropertyOrder({
  GetUserRefineriesJobsBadRequestResponse.JSON_PROPERTY_DATA,
  GetUserRefineriesJobsBadRequestResponse.JSON_PROPERTY_HTTP_CODE,
  GetUserRefineriesJobsBadRequestResponse.JSON_PROPERTY_STATUS,
  GetUserRefineriesJobsBadRequestResponse.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetUserRefineriesJobsBadRequestResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_HTTP_CODE = "http_code";
  private BigDecimal httpCode;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIME = "time";
  private BigDecimal time;

  public GetUserRefineriesJobsBadRequestResponse() {
  }

  public GetUserRefineriesJobsBadRequestResponse data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  public GetUserRefineriesJobsBadRequestResponse httpCode(BigDecimal httpCode) {
    
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHttpCode() {
    return httpCode;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpCode(BigDecimal httpCode) {
    this.httpCode = httpCode;
  }


  public GetUserRefineriesJobsBadRequestResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public GetUserRefineriesJobsBadRequestResponse time(BigDecimal time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(BigDecimal time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserRefineriesJobsBadRequestResponse getUserRefineriesJobsBadRequestResponse = (GetUserRefineriesJobsBadRequestResponse) o;
    return Objects.equals(this.data, getUserRefineriesJobsBadRequestResponse.data) &&
        Objects.equals(this.httpCode, getUserRefineriesJobsBadRequestResponse.httpCode) &&
        Objects.equals(this.status, getUserRefineriesJobsBadRequestResponse.status) &&
        Objects.equals(this.time, getUserRefineriesJobsBadRequestResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, httpCode, status, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserRefineriesJobsBadRequestResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

