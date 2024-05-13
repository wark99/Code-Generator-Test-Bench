/*
 * Youtube Music
 * Require authentication for all route except /auth and /auth/new.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ApiLikesPlaylistIdPlaylistSortSortPagePageGet200ResponseDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response
 */
@JsonPropertyOrder({
  ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.JSON_PROPERTY_ROW_COUNT,
  ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.JSON_PROPERTY_PAGE,
  ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.JSON_PROPERTY_DATA
})
@JsonTypeName("_api_likes__playlistId__playlist_sort__sort__page__page__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:03.133651353Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response {
  public static final String JSON_PROPERTY_ROW_COUNT = "rowCount";
  private Integer rowCount;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200ResponseDataInner> data;

  public ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response() {
  }

  public ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response rowCount(Integer rowCount) {
    
    this.rowCount = rowCount;
    return this;
  }

   /**
   * Get rowCount
   * @return rowCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRowCount() {
    return rowCount;
  }


  @JsonProperty(JSON_PROPERTY_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }


  public ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response data(List<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200ResponseDataInner> data) {
    
    this.data = data;
    return this;
  }

  public ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response addDataItem(ApiLikesPlaylistIdPlaylistSortSortPagePageGet200ResponseDataInner dataItem) {
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

  public List<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200ResponseDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200ResponseDataInner> data) {
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
    ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response apiLikesPlaylistIdPlaylistSortSortPagePageGet200Response = (ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response) o;
    return Objects.equals(this.rowCount, apiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.rowCount) &&
        Objects.equals(this.page, apiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.page) &&
        Objects.equals(this.data, apiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowCount, page, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response {\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

