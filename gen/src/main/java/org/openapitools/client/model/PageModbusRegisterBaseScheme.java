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
import org.openapitools.client.model.ModbusRegisterBaseScheme;
import org.openapitools.client.model.Pagination;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PageModbusRegisterBaseScheme
 */
@JsonPropertyOrder({
  PageModbusRegisterBaseScheme.JSON_PROPERTY_ITEMS,
  PageModbusRegisterBaseScheme.JSON_PROPERTY_PAGINATION
})
@JsonTypeName("Page_ModbusRegisterBaseScheme_")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PageModbusRegisterBaseScheme {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ModbusRegisterBaseScheme> items = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private Pagination pagination;

  public PageModbusRegisterBaseScheme() {
  }

  public PageModbusRegisterBaseScheme items(List<ModbusRegisterBaseScheme> items) {
    
    this.items = items;
    return this;
  }

  public PageModbusRegisterBaseScheme addItemsItem(ModbusRegisterBaseScheme itemsItem) {
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

  public List<ModbusRegisterBaseScheme> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<ModbusRegisterBaseScheme> items) {
    this.items = items;
  }


  public PageModbusRegisterBaseScheme pagination(Pagination pagination) {
    
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
    PageModbusRegisterBaseScheme pageModbusRegisterBaseScheme = (PageModbusRegisterBaseScheme) o;
    return Objects.equals(this.items, pageModbusRegisterBaseScheme.items) &&
        Objects.equals(this.pagination, pageModbusRegisterBaseScheme.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageModbusRegisterBaseScheme {\n");
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

