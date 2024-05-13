/*
 * AIRBIT IoT Workspace REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
 *
 * The version of the OpenAPI document: 2.0.1
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
import org.openapitools.client.model.GroupScheme;
import org.openapitools.client.model.Pagination;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PageGroupScheme
 */
@JsonPropertyOrder({
  PageGroupScheme.JSON_PROPERTY_ITEMS,
  PageGroupScheme.JSON_PROPERTY_PAGINATION
})
@JsonTypeName("Page_GroupScheme_")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PageGroupScheme {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<GroupScheme> items = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private Pagination pagination;

  public PageGroupScheme() {
  }

  public PageGroupScheme items(List<GroupScheme> items) {
    
    this.items = items;
    return this;
  }

  public PageGroupScheme addItemsItem(GroupScheme itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GroupScheme> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<GroupScheme> items) {
    this.items = items;
  }


  public PageGroupScheme pagination(Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Pagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageGroupScheme pageGroupScheme = (PageGroupScheme) o;
    return Objects.equals(this.items, pageGroupScheme.items) &&
        Objects.equals(this.pagination, pageGroupScheme.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGroupScheme {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

