/*
 * Customer Authorization API
 *  # Introduction Customer Authorization API The Customer Authorization API is the web service that allows you to exchange your application's `Client ID` and `Client Secret` for an `Access Token`. You will need to use the `accessToken` as authentication for all the other web requests, in the form of a HTTP Header as it follows: ``` Authorization: Bearer {accessToken} ```   Data API The Data API is the web service that allows you to obtain three kinds of data related to your users:    - Bank Account data   - Bank Transactions data   - Credit Score (VS 4.0) data   - Credit Report (VS 4.0) data 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: vs4plus@vantagescore.com
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
 * BrandedInformations
 */
@JsonPropertyOrder({
  BrandedInformations.JSON_PROPERTY_BRANDED_DATE,
  BrandedInformations.JSON_PROPERTY_BRANDED_DESCRIPTION,
  BrandedInformations.JSON_PROPERTY_BRANDED_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BrandedInformations {
  public static final String JSON_PROPERTY_BRANDED_DATE = "brandedDate";
  private String brandedDate;

  public static final String JSON_PROPERTY_BRANDED_DESCRIPTION = "brandedDescription";
  private String brandedDescription;

  public static final String JSON_PROPERTY_BRANDED_STATE = "brandedState";
  private String brandedState;

  public BrandedInformations() {
  }

  public BrandedInformations brandedDate(String brandedDate) {
    
    this.brandedDate = brandedDate;
    return this;
  }

   /**
   * Get brandedDate
   * @return brandedDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANDED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandedDate() {
    return brandedDate;
  }


  @JsonProperty(JSON_PROPERTY_BRANDED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandedDate(String brandedDate) {
    this.brandedDate = brandedDate;
  }


  public BrandedInformations brandedDescription(String brandedDescription) {
    
    this.brandedDescription = brandedDescription;
    return this;
  }

   /**
   * Get brandedDescription
   * @return brandedDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANDED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandedDescription() {
    return brandedDescription;
  }


  @JsonProperty(JSON_PROPERTY_BRANDED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandedDescription(String brandedDescription) {
    this.brandedDescription = brandedDescription;
  }


  public BrandedInformations brandedState(String brandedState) {
    
    this.brandedState = brandedState;
    return this;
  }

   /**
   * Get brandedState
   * @return brandedState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANDED_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandedState() {
    return brandedState;
  }


  @JsonProperty(JSON_PROPERTY_BRANDED_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandedState(String brandedState) {
    this.brandedState = brandedState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedInformations brandedInformations = (BrandedInformations) o;
    return Objects.equals(this.brandedDate, brandedInformations.brandedDate) &&
        Objects.equals(this.brandedDescription, brandedInformations.brandedDescription) &&
        Objects.equals(this.brandedState, brandedInformations.brandedState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandedDate, brandedDescription, brandedState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedInformations {\n");
    sb.append("    brandedDate: ").append(toIndentedString(brandedDate)).append("\n");
    sb.append("    brandedDescription: ").append(toIndentedString(brandedDescription)).append("\n");
    sb.append("    brandedState: ").append(toIndentedString(brandedState)).append("\n");
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

