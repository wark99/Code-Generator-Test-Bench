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
import org.openapitools.client.model.Names;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Original
 */
@JsonPropertyOrder({
  Original.JSON_PROPERTY_CHARGE_OFF,
  Original.JSON_PROPERTY_CREDIT_GRANTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Original {
  public static final String JSON_PROPERTY_CHARGE_OFF = "chargeOff";
  private String chargeOff;

  public static final String JSON_PROPERTY_CREDIT_GRANTOR = "creditGrantor";
  private Names creditGrantor;

  public Original() {
  }

  public Original chargeOff(String chargeOff) {
    
    this.chargeOff = chargeOff;
    return this;
  }

   /**
   * Get chargeOff
   * @return chargeOff
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_OFF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChargeOff() {
    return chargeOff;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE_OFF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeOff(String chargeOff) {
    this.chargeOff = chargeOff;
  }


  public Original creditGrantor(Names creditGrantor) {
    
    this.creditGrantor = creditGrantor;
    return this;
  }

   /**
   * Get creditGrantor
   * @return creditGrantor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_GRANTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Names getCreditGrantor() {
    return creditGrantor;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_GRANTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditGrantor(Names creditGrantor) {
    this.creditGrantor = creditGrantor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Original original = (Original) o;
    return Objects.equals(this.chargeOff, original.chargeOff) &&
        Objects.equals(this.creditGrantor, original.creditGrantor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeOff, creditGrantor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Original {\n");
    sb.append("    chargeOff: ").append(toIndentedString(chargeOff)).append("\n");
    sb.append("    creditGrantor: ").append(toIndentedString(creditGrantor)).append("\n");
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

