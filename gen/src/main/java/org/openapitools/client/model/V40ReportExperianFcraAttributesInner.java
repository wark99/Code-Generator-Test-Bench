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
 * V40ReportExperianFcraAttributesInner
 */
@JsonPropertyOrder({
  V40ReportExperianFcraAttributesInner.JSON_PROPERTY_MODEL_TYPE_INDICATOR,
  V40ReportExperianFcraAttributesInner.JSON_PROPERTY_VARIABLE_NAME,
  V40ReportExperianFcraAttributesInner.JSON_PROPERTY_SIGNOF_ATTRIBUTE,
  V40ReportExperianFcraAttributesInner.JSON_PROPERTY_ATTRIBUTE_VALUE
})
@JsonTypeName("V4_0_ReportExperian_fcraAttributes_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class V40ReportExperianFcraAttributesInner {
  public static final String JSON_PROPERTY_MODEL_TYPE_INDICATOR = "modelTypeIndicator";
  private String modelTypeIndicator;

  public static final String JSON_PROPERTY_VARIABLE_NAME = "variableName";
  private String variableName;

  public static final String JSON_PROPERTY_SIGNOF_ATTRIBUTE = "signofAttribute";
  private String signofAttribute;

  public static final String JSON_PROPERTY_ATTRIBUTE_VALUE = "attributeValue";
  private String attributeValue;

  public V40ReportExperianFcraAttributesInner() {
  }

  public V40ReportExperianFcraAttributesInner modelTypeIndicator(String modelTypeIndicator) {
    
    this.modelTypeIndicator = modelTypeIndicator;
    return this;
  }

   /**
   * Get modelTypeIndicator
   * @return modelTypeIndicator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_TYPE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelTypeIndicator() {
    return modelTypeIndicator;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_TYPE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelTypeIndicator(String modelTypeIndicator) {
    this.modelTypeIndicator = modelTypeIndicator;
  }


  public V40ReportExperianFcraAttributesInner variableName(String variableName) {
    
    this.variableName = variableName;
    return this;
  }

   /**
   * Get variableName
   * @return variableName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVariableName() {
    return variableName;
  }


  @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  public V40ReportExperianFcraAttributesInner signofAttribute(String signofAttribute) {
    
    this.signofAttribute = signofAttribute;
    return this;
  }

   /**
   * Get signofAttribute
   * @return signofAttribute
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNOF_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignofAttribute() {
    return signofAttribute;
  }


  @JsonProperty(JSON_PROPERTY_SIGNOF_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignofAttribute(String signofAttribute) {
    this.signofAttribute = signofAttribute;
  }


  public V40ReportExperianFcraAttributesInner attributeValue(String attributeValue) {
    
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * Get attributeValue
   * @return attributeValue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttributeValue() {
    return attributeValue;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V40ReportExperianFcraAttributesInner v40ReportExperianFcraAttributesInner = (V40ReportExperianFcraAttributesInner) o;
    return Objects.equals(this.modelTypeIndicator, v40ReportExperianFcraAttributesInner.modelTypeIndicator) &&
        Objects.equals(this.variableName, v40ReportExperianFcraAttributesInner.variableName) &&
        Objects.equals(this.signofAttribute, v40ReportExperianFcraAttributesInner.signofAttribute) &&
        Objects.equals(this.attributeValue, v40ReportExperianFcraAttributesInner.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeIndicator, variableName, signofAttribute, attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V40ReportExperianFcraAttributesInner {\n");
    sb.append("    modelTypeIndicator: ").append(toIndentedString(modelTypeIndicator)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    signofAttribute: ").append(toIndentedString(signofAttribute)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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

