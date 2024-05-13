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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UniverseTerminalDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetTerminalsOkResponse
 */
@JsonPropertyOrder({
  GetTerminalsOkResponse.JSON_PROPERTY_DATA,
  GetTerminalsOkResponse.JSON_PROPERTY_HTTP_CODE,
  GetTerminalsOkResponse.JSON_PROPERTY_STATUS,
  GetTerminalsOkResponse.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetTerminalsOkResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<UniverseTerminalDTO> data;

  public static final String JSON_PROPERTY_HTTP_CODE = "http_code";
  private BigDecimal httpCode;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIME = "time";
  private BigDecimal time;

  public GetTerminalsOkResponse() {
  }

  public GetTerminalsOkResponse data(List<UniverseTerminalDTO> data) {
    
    this.data = data;
    return this;
  }

  public GetTerminalsOkResponse addDataItem(UniverseTerminalDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UniverseTerminalDTO> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<UniverseTerminalDTO> data) {
    this.data = data;
  }


  public GetTerminalsOkResponse httpCode(BigDecimal httpCode) {
    
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


  public GetTerminalsOkResponse status(String status) {
    
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


  public GetTerminalsOkResponse time(BigDecimal time) {
    
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
    GetTerminalsOkResponse getTerminalsOkResponse = (GetTerminalsOkResponse) o;
    return Objects.equals(this.data, getTerminalsOkResponse.data) &&
        Objects.equals(this.httpCode, getTerminalsOkResponse.httpCode) &&
        Objects.equals(this.status, getTerminalsOkResponse.status) &&
        Objects.equals(this.time, getTerminalsOkResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, httpCode, status, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTerminalsOkResponse {\n");
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

