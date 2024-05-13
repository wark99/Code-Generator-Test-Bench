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
import org.openapitools.client.model.DoNotPromote;
import org.openapitools.client.model.Freeze;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditDataStatus
 */
@JsonPropertyOrder({
  CreditDataStatus.JSON_PROPERTY_DISPUTED,
  CreditDataStatus.JSON_PROPERTY_DO_NOT_PROMOTE,
  CreditDataStatus.JSON_PROPERTY_FREEZE,
  CreditDataStatus.JSON_PROPERTY_MINOR,
  CreditDataStatus.JSON_PROPERTY_SUPPRESSED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreditDataStatus {
  public static final String JSON_PROPERTY_DISPUTED = "disputed";
  private Boolean disputed;

  public static final String JSON_PROPERTY_DO_NOT_PROMOTE = "doNotPromote";
  private DoNotPromote doNotPromote;

  public static final String JSON_PROPERTY_FREEZE = "freeze";
  private Freeze freeze;

  public static final String JSON_PROPERTY_MINOR = "minor";
  private Boolean minor;

  public static final String JSON_PROPERTY_SUPPRESSED = "suppressed";
  private Boolean suppressed;

  public CreditDataStatus() {
  }

  public CreditDataStatus disputed(Boolean disputed) {
    
    this.disputed = disputed;
    return this;
  }

   /**
   * Get disputed
   * @return disputed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisputed() {
    return disputed;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisputed(Boolean disputed) {
    this.disputed = disputed;
  }


  public CreditDataStatus doNotPromote(DoNotPromote doNotPromote) {
    
    this.doNotPromote = doNotPromote;
    return this;
  }

   /**
   * Get doNotPromote
   * @return doNotPromote
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DO_NOT_PROMOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DoNotPromote getDoNotPromote() {
    return doNotPromote;
  }


  @JsonProperty(JSON_PROPERTY_DO_NOT_PROMOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoNotPromote(DoNotPromote doNotPromote) {
    this.doNotPromote = doNotPromote;
  }


  public CreditDataStatus freeze(Freeze freeze) {
    
    this.freeze = freeze;
    return this;
  }

   /**
   * Get freeze
   * @return freeze
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREEZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Freeze getFreeze() {
    return freeze;
  }


  @JsonProperty(JSON_PROPERTY_FREEZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeze(Freeze freeze) {
    this.freeze = freeze;
  }


  public CreditDataStatus minor(Boolean minor) {
    
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMinor() {
    return minor;
  }


  @JsonProperty(JSON_PROPERTY_MINOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinor(Boolean minor) {
    this.minor = minor;
  }


  public CreditDataStatus suppressed(Boolean suppressed) {
    
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
    CreditDataStatus creditDataStatus = (CreditDataStatus) o;
    return Objects.equals(this.disputed, creditDataStatus.disputed) &&
        Objects.equals(this.doNotPromote, creditDataStatus.doNotPromote) &&
        Objects.equals(this.freeze, creditDataStatus.freeze) &&
        Objects.equals(this.minor, creditDataStatus.minor) &&
        Objects.equals(this.suppressed, creditDataStatus.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputed, doNotPromote, freeze, minor, suppressed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDataStatus {\n");
    sb.append("    disputed: ").append(toIndentedString(disputed)).append("\n");
    sb.append("    doNotPromote: ").append(toIndentedString(doNotPromote)).append("\n");
    sb.append("    freeze: ").append(toIndentedString(freeze)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
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

