/*
 * Gamestream Backup Service API
 * REST API for Gamestream Cloud Gaming game saves backups management Some useful links: - [Gamestream](https://www.gamestream?biz) - [Pleio](https://www.pleio.games)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: xavier@gamestream.biz
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
import org.openapitools.client.model.UsersResponseDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UsersResponse
 */
@JsonPropertyOrder({
  UsersResponse.JSON_PROPERTY_DRAW,
  UsersResponse.JSON_PROPERTY_RECORDS_TOTAL,
  UsersResponse.JSON_PROPERTY_RECORDS_FILTERED,
  UsersResponse.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:32.669774675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UsersResponse {
  public static final String JSON_PROPERTY_DRAW = "draw";
  private Integer draw = 1;

  public static final String JSON_PROPERTY_RECORDS_TOTAL = "recordsTotal";
  private Integer recordsTotal;

  public static final String JSON_PROPERTY_RECORDS_FILTERED = "recordsFiltered";
  private Integer recordsFiltered;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<UsersResponseDataInner> data;

  public UsersResponse() {
  }

  public UsersResponse draw(Integer draw) {
    
    this.draw = draw;
    return this;
  }

   /**
   * draw parameter, always set to 1
   * minimum: 1
   * maximum: 1
   * @return draw
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDraw() {
    return draw;
  }


  @JsonProperty(JSON_PROPERTY_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDraw(Integer draw) {
    this.draw = draw;
  }


  public UsersResponse recordsTotal(Integer recordsTotal) {
    
    this.recordsTotal = recordsTotal;
    return this;
  }

   /**
   * total count of records (whatever the parameters)
   * minimum: 0
   * @return recordsTotal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORDS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecordsTotal() {
    return recordsTotal;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordsTotal(Integer recordsTotal) {
    this.recordsTotal = recordsTotal;
  }


  public UsersResponse recordsFiltered(Integer recordsFiltered) {
    
    this.recordsFiltered = recordsFiltered;
    return this;
  }

   /**
   * count records which have been filtered through needle parameter
   * minimum: 0
   * @return recordsFiltered
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORDS_FILTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecordsFiltered() {
    return recordsFiltered;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS_FILTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordsFiltered(Integer recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
  }


  public UsersResponse data(List<UsersResponseDataInner> data) {
    
    this.data = data;
    return this;
  }

  public UsersResponse addDataItem(UsersResponseDataInner dataItem) {
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

  public List<UsersResponseDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<UsersResponseDataInner> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersResponse usersResponse = (UsersResponse) o;
    return Objects.equals(this.draw, usersResponse.draw) &&
        Objects.equals(this.recordsTotal, usersResponse.recordsTotal) &&
        Objects.equals(this.recordsFiltered, usersResponse.recordsFiltered) &&
        Objects.equals(this.data, usersResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draw, recordsTotal, recordsFiltered, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");
    sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
    sb.append("    recordsTotal: ").append(toIndentedString(recordsTotal)).append("\n");
    sb.append("    recordsFiltered: ").append(toIndentedString(recordsFiltered)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

