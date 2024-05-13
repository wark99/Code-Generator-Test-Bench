/*
 * 의류 보관 서비스 API
 * 의류 보관 서비스를 위한 API 명세서
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
import org.openapitools.client.model.ClothesListUserIdGet200ResponseClothesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ClothesListUserIdGet200Response
 */
@JsonPropertyOrder({
  ClothesListUserIdGet200Response.JSON_PROPERTY_CLOTHES
})
@JsonTypeName("_clothes_list__user_id__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:22.823821767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ClothesListUserIdGet200Response {
  public static final String JSON_PROPERTY_CLOTHES = "clothes";
  private List<ClothesListUserIdGet200ResponseClothesInner> clothes;

  public ClothesListUserIdGet200Response() {
  }

  public ClothesListUserIdGet200Response clothes(List<ClothesListUserIdGet200ResponseClothesInner> clothes) {
    
    this.clothes = clothes;
    return this;
  }

  public ClothesListUserIdGet200Response addClothesItem(ClothesListUserIdGet200ResponseClothesInner clothesItem) {
    if (this.clothes == null) {
      this.clothes = new ArrayList<>();
    }
    this.clothes.add(clothesItem);
    return this;
  }

   /**
   * Get clothes
   * @return clothes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOTHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ClothesListUserIdGet200ResponseClothesInner> getClothes() {
    return clothes;
  }


  @JsonProperty(JSON_PROPERTY_CLOTHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClothes(List<ClothesListUserIdGet200ResponseClothesInner> clothes) {
    this.clothes = clothes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClothesListUserIdGet200Response clothesListUserIdGet200Response = (ClothesListUserIdGet200Response) o;
    return Objects.equals(this.clothes, clothesListUserIdGet200Response.clothes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clothes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClothesListUserIdGet200Response {\n");
    sb.append("    clothes: ").append(toIndentedString(clothes)).append("\n");
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

