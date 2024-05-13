/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
 * SearchFilesRequest
 */
@JsonPropertyOrder({
  SearchFilesRequest.JSON_PROPERTY_TERMS,
  SearchFilesRequest.JSON_PROPERTY_IS_OR_SEARCH,
  SearchFilesRequest.JSON_PROPERTY_TIME_ZONE_OFFSET,
  SearchFilesRequest.JSON_PROPERTY_INCLUDE_DELETED_CHANNELS,
  SearchFilesRequest.JSON_PROPERTY_PAGE,
  SearchFilesRequest.JSON_PROPERTY_PER_PAGE
})
@JsonTypeName("SearchFiles_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SearchFilesRequest {
  public static final String JSON_PROPERTY_TERMS = "terms";
  private String terms;

  public static final String JSON_PROPERTY_IS_OR_SEARCH = "is_or_search";
  private Boolean isOrSearch;

  public static final String JSON_PROPERTY_TIME_ZONE_OFFSET = "time_zone_offset";
  private Integer timeZoneOffset = 0;

  public static final String JSON_PROPERTY_INCLUDE_DELETED_CHANNELS = "include_deleted_channels";
  private Boolean includeDeletedChannels;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page = 0;

  public static final String JSON_PROPERTY_PER_PAGE = "per_page";
  private Integer perPage = 60;

  public SearchFilesRequest() {
  }

  public SearchFilesRequest terms(String terms) {
    
    this.terms = terms;
    return this;
  }

   /**
   * The search terms as inputed by the user. To search for files from a user include &#x60;from:someusername&#x60;, using a user&#39;s username. To search in a specific channel include &#x60;in:somechannel&#x60;, using the channel name (not the display name). To search for specific extensions included &#x60;ext:extension&#x60;.
   * @return terms
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTerms() {
    return terms;
  }


  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTerms(String terms) {
    this.terms = terms;
  }


  public SearchFilesRequest isOrSearch(Boolean isOrSearch) {
    
    this.isOrSearch = isOrSearch;
    return this;
  }

   /**
   * Set to true if an Or search should be performed vs an And search.
   * @return isOrSearch
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_OR_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsOrSearch() {
    return isOrSearch;
  }


  @JsonProperty(JSON_PROPERTY_IS_OR_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsOrSearch(Boolean isOrSearch) {
    this.isOrSearch = isOrSearch;
  }


  public SearchFilesRequest timeZoneOffset(Integer timeZoneOffset) {
    
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * Offset from UTC of user timezone for date searches.
   * @return timeZoneOffset
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  public SearchFilesRequest includeDeletedChannels(Boolean includeDeletedChannels) {
    
    this.includeDeletedChannels = includeDeletedChannels;
    return this;
  }

   /**
   * Set to true if deleted channels should be included in the search. (archived channels)
   * @return includeDeletedChannels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_DELETED_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeDeletedChannels() {
    return includeDeletedChannels;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_DELETED_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeDeletedChannels(Boolean includeDeletedChannels) {
    this.includeDeletedChannels = includeDeletedChannels;
  }


  public SearchFilesRequest page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * The page to select. (Only works with Elasticsearch)
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


  public SearchFilesRequest perPage(Integer perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * The number of posts per page. (Only works with Elasticsearch)
   * @return perPage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPerPage() {
    return perPage;
  }


  @JsonProperty(JSON_PROPERTY_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFilesRequest searchFilesRequest = (SearchFilesRequest) o;
    return Objects.equals(this.terms, searchFilesRequest.terms) &&
        Objects.equals(this.isOrSearch, searchFilesRequest.isOrSearch) &&
        Objects.equals(this.timeZoneOffset, searchFilesRequest.timeZoneOffset) &&
        Objects.equals(this.includeDeletedChannels, searchFilesRequest.includeDeletedChannels) &&
        Objects.equals(this.page, searchFilesRequest.page) &&
        Objects.equals(this.perPage, searchFilesRequest.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, isOrSearch, timeZoneOffset, includeDeletedChannels, page, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFilesRequest {\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    isOrSearch: ").append(toIndentedString(isOrSearch)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    includeDeletedChannels: ").append(toIndentedString(includeDeletedChannels)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

