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
 * InquiryHistories
 */
@JsonPropertyOrder({
  InquiryHistories.JSON_PROPERTY_ADDRESS_MATCH,
  InquiryHistories.JSON_PROPERTY_INQUIRY_WITH_CURRENT_INPUT_COUNT,
  InquiryHistories.JSON_PROPERTY_MAX_INQUIRY_COUNT,
  InquiryHistories.JSON_PROPERTY_MESSAGE_CODE,
  InquiryHistories.JSON_PROPERTY_TIMEFRAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InquiryHistories {
  public static final String JSON_PROPERTY_ADDRESS_MATCH = "addressMatch";
  private String addressMatch;

  public static final String JSON_PROPERTY_INQUIRY_WITH_CURRENT_INPUT_COUNT = "inquiryWithCurrentInputCount";
  private String inquiryWithCurrentInputCount;

  public static final String JSON_PROPERTY_MAX_INQUIRY_COUNT = "maxInquiryCount";
  private String maxInquiryCount;

  public static final String JSON_PROPERTY_MESSAGE_CODE = "messageCode";
  private String messageCode;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public InquiryHistories() {
  }

  public InquiryHistories addressMatch(String addressMatch) {
    
    this.addressMatch = addressMatch;
    return this;
  }

   /**
   * Get addressMatch
   * @return addressMatch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressMatch() {
    return addressMatch;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressMatch(String addressMatch) {
    this.addressMatch = addressMatch;
  }


  public InquiryHistories inquiryWithCurrentInputCount(String inquiryWithCurrentInputCount) {
    
    this.inquiryWithCurrentInputCount = inquiryWithCurrentInputCount;
    return this;
  }

   /**
   * Get inquiryWithCurrentInputCount
   * @return inquiryWithCurrentInputCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INQUIRY_WITH_CURRENT_INPUT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInquiryWithCurrentInputCount() {
    return inquiryWithCurrentInputCount;
  }


  @JsonProperty(JSON_PROPERTY_INQUIRY_WITH_CURRENT_INPUT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInquiryWithCurrentInputCount(String inquiryWithCurrentInputCount) {
    this.inquiryWithCurrentInputCount = inquiryWithCurrentInputCount;
  }


  public InquiryHistories maxInquiryCount(String maxInquiryCount) {
    
    this.maxInquiryCount = maxInquiryCount;
    return this;
  }

   /**
   * Get maxInquiryCount
   * @return maxInquiryCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_INQUIRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaxInquiryCount() {
    return maxInquiryCount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_INQUIRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxInquiryCount(String maxInquiryCount) {
    this.maxInquiryCount = maxInquiryCount;
  }


  public InquiryHistories messageCode(String messageCode) {
    
    this.messageCode = messageCode;
    return this;
  }

   /**
   * Get messageCode
   * @return messageCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageCode() {
    return messageCode;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }


  public InquiryHistories timeframe(String timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

   /**
   * Get timeframe
   * @return timeframe
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeframe() {
    return timeframe;
  }


  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InquiryHistories inquiryHistories = (InquiryHistories) o;
    return Objects.equals(this.addressMatch, inquiryHistories.addressMatch) &&
        Objects.equals(this.inquiryWithCurrentInputCount, inquiryHistories.inquiryWithCurrentInputCount) &&
        Objects.equals(this.maxInquiryCount, inquiryHistories.maxInquiryCount) &&
        Objects.equals(this.messageCode, inquiryHistories.messageCode) &&
        Objects.equals(this.timeframe, inquiryHistories.timeframe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressMatch, inquiryWithCurrentInputCount, maxInquiryCount, messageCode, timeframe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InquiryHistories {\n");
    sb.append("    addressMatch: ").append(toIndentedString(addressMatch)).append("\n");
    sb.append("    inquiryWithCurrentInputCount: ").append(toIndentedString(inquiryWithCurrentInputCount)).append("\n");
    sb.append("    maxInquiryCount: ").append(toIndentedString(maxInquiryCount)).append("\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
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

