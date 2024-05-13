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
import org.openapitools.client.model.Right;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProductUser
 */
@JsonPropertyOrder({
  ProductUser.JSON_PROPERTY_USER_ID,
  ProductUser.JSON_PROPERTY_RIGHTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductUser {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_RIGHTS = "rights";
  private Right rights;

  public ProductUser() {
  }

  public ProductUser userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public ProductUser rights(Right rights) {
    
    this.rights = rights;
    return this;
  }

   /**
   * Get rights
   * @return rights
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Right getRights() {
    return rights;
  }


  @JsonProperty(JSON_PROPERTY_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRights(Right rights) {
    this.rights = rights;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUser productUser = (ProductUser) o;
    return Objects.equals(this.userId, productUser.userId) &&
        Objects.equals(this.rights, productUser.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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
