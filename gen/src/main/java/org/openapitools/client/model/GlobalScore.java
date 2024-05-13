/*
 * API ESG PMI - assessment
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0.2
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GlobalScore
 */
@JsonPropertyOrder({
  GlobalScore.JSON_PROPERTY_GLOBAL_ESG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:04.261563944Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GlobalScore {
  public static final String JSON_PROPERTY_GLOBAL_ESG = "global_esg";
  private BigDecimal globalEsg;

  public GlobalScore() {
  }

  public GlobalScore globalEsg(BigDecimal globalEsg) {
    
    this.globalEsg = globalEsg;
    return this;
  }

   /**
   * Get globalEsg
   * @return globalEsg
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GLOBAL_ESG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getGlobalEsg() {
    return globalEsg;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_ESG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGlobalEsg(BigDecimal globalEsg) {
    this.globalEsg = globalEsg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalScore globalScore = (GlobalScore) o;
    return Objects.equals(this.globalEsg, globalScore.globalEsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalEsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalScore {\n");
    sb.append("    globalEsg: ").append(toIndentedString(globalEsg)).append("\n");
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

