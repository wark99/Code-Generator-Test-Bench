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
 * Pagination
 */
@JsonPropertyOrder({
  Pagination.JSON_PROPERTY_TOTAL,
  Pagination.JSON_PROPERTY_PAGE,
  Pagination.JSON_PROPERTY_PAGES,
  Pagination.JSON_PROPERTY_ITEMS_PER_PAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Pagination {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGES = "pages";
  private Integer pages;

  public static final String JSON_PROPERTY_ITEMS_PER_PAGE = "items_per_page";
  private Integer itemsPerPage;

  public Pagination() {
  }

  public Pagination total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of items Added when using query parameter &#x60;page&#x60; 
   * @return total
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public Pagination page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Number of the current page Added when using query parameter &#x60;page&#x60; 
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


  public Pagination pages(Integer pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * Total number of pages Added when using query parameter &#x60;page&#x60; 
   * @return pages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPages() {
    return pages;
  }


  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPages(Integer pages) {
    this.pages = pages;
  }


  public Pagination itemsPerPage(Integer itemsPerPage) {
    
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Number of items per page Added when using query parameter &#x60;page&#x60; 
   * @return itemsPerPage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getItemsPerPage() {
    return itemsPerPage;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.total, pagination.total) &&
        Objects.equals(this.page, pagination.page) &&
        Objects.equals(this.pages, pagination.pages) &&
        Objects.equals(this.itemsPerPage, pagination.itemsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, page, pages, itemsPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
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
