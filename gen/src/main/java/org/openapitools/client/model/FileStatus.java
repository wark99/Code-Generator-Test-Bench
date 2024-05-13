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
 * FileStatus
 */
@JsonPropertyOrder({
  FileStatus.JSON_PROPERTY_FROZEN_BUT_EXEMPT,
  FileStatus.JSON_PROPERTY_HIT,
  FileStatus.JSON_PROPERTY_SUPPRESSED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FileStatus {
  public static final String JSON_PROPERTY_FROZEN_BUT_EXEMPT = "frozenButExempt";
  private Boolean frozenButExempt;

  public static final String JSON_PROPERTY_HIT = "hit";
  private Boolean hit;

  public static final String JSON_PROPERTY_SUPPRESSED = "suppressed";
  private Boolean suppressed;

  public FileStatus() {
  }

  public FileStatus frozenButExempt(Boolean frozenButExempt) {
    
    this.frozenButExempt = frozenButExempt;
    return this;
  }

   /**
   * Get frozenButExempt
   * @return frozenButExempt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROZEN_BUT_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFrozenButExempt() {
    return frozenButExempt;
  }


  @JsonProperty(JSON_PROPERTY_FROZEN_BUT_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrozenButExempt(Boolean frozenButExempt) {
    this.frozenButExempt = frozenButExempt;
  }


  public FileStatus hit(Boolean hit) {
    
    this.hit = hit;
    return this;
  }

   /**
   * Get hit
   * @return hit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHit() {
    return hit;
  }


  @JsonProperty(JSON_PROPERTY_HIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHit(Boolean hit) {
    this.hit = hit;
  }


  public FileStatus suppressed(Boolean suppressed) {
    
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuppressed() {
    return suppressed;
  }


  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileStatus fileStatus = (FileStatus) o;
    return Objects.equals(this.frozenButExempt, fileStatus.frozenButExempt) &&
        Objects.equals(this.hit, fileStatus.hit) &&
        Objects.equals(this.suppressed, fileStatus.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frozenButExempt, hit, suppressed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileStatus {\n");
    sb.append("    frozenButExempt: ").append(toIndentedString(frozenButExempt)).append("\n");
    sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

