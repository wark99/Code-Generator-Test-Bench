/*
 * CIC-NEW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.7
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
import org.openapitools.client.model.CarstockImagesChildsPost200ResponseChildsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CarstockImagesChildsPost200Response
 */
@JsonPropertyOrder({
  CarstockImagesChildsPost200Response.JSON_PROPERTY_SUCCESS,
  CarstockImagesChildsPost200Response.JSON_PROPERTY_AMOUNT,
  CarstockImagesChildsPost200Response.JSON_PROPERTY_CHILDS
})
@JsonTypeName("_carstock_images_childs_post_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockImagesChildsPost200Response {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CHILDS = "childs";
  private List<CarstockImagesChildsPost200ResponseChildsInner> childs = new ArrayList<>();

  public CarstockImagesChildsPost200Response() {
  }

  public CarstockImagesChildsPost200Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public CarstockImagesChildsPost200Response amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public CarstockImagesChildsPost200Response childs(List<CarstockImagesChildsPost200ResponseChildsInner> childs) {
    
    this.childs = childs;
    return this;
  }

  public CarstockImagesChildsPost200Response addChildsItem(CarstockImagesChildsPost200ResponseChildsInner childsItem) {
    if (this.childs == null) {
      this.childs = new ArrayList<>();
    }
    this.childs.add(childsItem);
    return this;
  }

   /**
   * Get childs
   * @return childs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHILDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CarstockImagesChildsPost200ResponseChildsInner> getChilds() {
    return childs;
  }


  @JsonProperty(JSON_PROPERTY_CHILDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChilds(List<CarstockImagesChildsPost200ResponseChildsInner> childs) {
    this.childs = childs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarstockImagesChildsPost200Response carstockImagesChildsPost200Response = (CarstockImagesChildsPost200Response) o;
    return Objects.equals(this.success, carstockImagesChildsPost200Response.success) &&
        Objects.equals(this.amount, carstockImagesChildsPost200Response.amount) &&
        Objects.equals(this.childs, carstockImagesChildsPost200Response.childs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, amount, childs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarstockImagesChildsPost200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    childs: ").append(toIndentedString(childs)).append("\n");
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
