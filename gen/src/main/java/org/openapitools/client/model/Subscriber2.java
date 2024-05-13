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
 * Subscriber2
 */
@JsonPropertyOrder({
  Subscriber2.JSON_PROPERTY_INDUSTRY_CODE,
  Subscriber2.JSON_PROPERTY_INQUIRY_SUBSCRIBER_PREFIX_CODE,
  Subscriber2.JSON_PROPERTY_MEMBER_CODE,
  Subscriber2.JSON_PROPERTY_NAME,
  Subscriber2.JSON_PROPERTY_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Subscriber2 {
  public static final String JSON_PROPERTY_INDUSTRY_CODE = "industryCode";
  private String industryCode;

  public static final String JSON_PROPERTY_INQUIRY_SUBSCRIBER_PREFIX_CODE = "inquirySubscriberPrefixCode";
  private String inquirySubscriberPrefixCode;

  public static final String JSON_PROPERTY_MEMBER_CODE = "memberCode";
  private String memberCode;

  public static final String JSON_PROPERTY_NAME = "name";
  private Names name;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public Subscriber2() {
  }

  public Subscriber2 industryCode(String industryCode) {
    
    this.industryCode = industryCode;
    return this;
  }

   /**
   * Get industryCode
   * @return industryCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndustryCode() {
    return industryCode;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }


  public Subscriber2 inquirySubscriberPrefixCode(String inquirySubscriberPrefixCode) {
    
    this.inquirySubscriberPrefixCode = inquirySubscriberPrefixCode;
    return this;
  }

   /**
   * Get inquirySubscriberPrefixCode
   * @return inquirySubscriberPrefixCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INQUIRY_SUBSCRIBER_PREFIX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInquirySubscriberPrefixCode() {
    return inquirySubscriberPrefixCode;
  }


  @JsonProperty(JSON_PROPERTY_INQUIRY_SUBSCRIBER_PREFIX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInquirySubscriberPrefixCode(String inquirySubscriberPrefixCode) {
    this.inquirySubscriberPrefixCode = inquirySubscriberPrefixCode;
  }


  public Subscriber2 memberCode(String memberCode) {
    
    this.memberCode = memberCode;
    return this;
  }

   /**
   * Get memberCode
   * @return memberCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberCode() {
    return memberCode;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberCode(String memberCode) {
    this.memberCode = memberCode;
  }


  public Subscriber2 name(Names name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Names getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Names name) {
    this.name = name;
  }


  public Subscriber2 password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriber2 subscriber2 = (Subscriber2) o;
    return Objects.equals(this.industryCode, subscriber2.industryCode) &&
        Objects.equals(this.inquirySubscriberPrefixCode, subscriber2.inquirySubscriberPrefixCode) &&
        Objects.equals(this.memberCode, subscriber2.memberCode) &&
        Objects.equals(this.name, subscriber2.name) &&
        Objects.equals(this.password, subscriber2.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryCode, inquirySubscriberPrefixCode, memberCode, name, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscriber2 {\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    inquirySubscriberPrefixCode: ").append(toIndentedString(inquirySubscriberPrefixCode)).append("\n");
    sb.append("    memberCode: ").append(toIndentedString(memberCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

