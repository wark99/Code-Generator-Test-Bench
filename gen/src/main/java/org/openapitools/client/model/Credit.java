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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Collections2;
import org.openapitools.client.model.CreditSummary;
import org.openapitools.client.model.Inquiry;
import org.openapitools.client.model.PublicRecords;
import org.openapitools.client.model.Trades2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Credit
 */
@JsonPropertyOrder({
  Credit.JSON_PROPERTY_COLLECTIONS,
  Credit.JSON_PROPERTY_CREDIT_SUMMARY,
  Credit.JSON_PROPERTY_INQUIRIES,
  Credit.JSON_PROPERTY_PUBLIC_RECORDS,
  Credit.JSON_PROPERTY_TRADES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Credit {
  public static final String JSON_PROPERTY_COLLECTIONS = "collections";
  private List<Collections2> collections;

  public static final String JSON_PROPERTY_CREDIT_SUMMARY = "creditSummary";
  private CreditSummary creditSummary;

  public static final String JSON_PROPERTY_INQUIRIES = "inquiries";
  private List<Inquiry> inquiries;

  public static final String JSON_PROPERTY_PUBLIC_RECORDS = "publicRecords";
  private List<PublicRecords> publicRecords;

  public static final String JSON_PROPERTY_TRADES = "trades";
  private List<Trades2> trades;

  public Credit() {
  }

  public Credit collections(List<Collections2> collections) {
    
    this.collections = collections;
    return this;
  }

  public Credit addCollectionsItem(Collections2 collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Collections2> getCollections() {
    return collections;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollections(List<Collections2> collections) {
    this.collections = collections;
  }


  public Credit creditSummary(CreditSummary creditSummary) {
    
    this.creditSummary = creditSummary;
    return this;
  }

   /**
   * Get creditSummary
   * @return creditSummary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreditSummary getCreditSummary() {
    return creditSummary;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditSummary(CreditSummary creditSummary) {
    this.creditSummary = creditSummary;
  }


  public Credit inquiries(List<Inquiry> inquiries) {
    
    this.inquiries = inquiries;
    return this;
  }

  public Credit addInquiriesItem(Inquiry inquiriesItem) {
    if (this.inquiries == null) {
      this.inquiries = new ArrayList<>();
    }
    this.inquiries.add(inquiriesItem);
    return this;
  }

   /**
   * Get inquiries
   * @return inquiries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INQUIRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Inquiry> getInquiries() {
    return inquiries;
  }


  @JsonProperty(JSON_PROPERTY_INQUIRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInquiries(List<Inquiry> inquiries) {
    this.inquiries = inquiries;
  }


  public Credit publicRecords(List<PublicRecords> publicRecords) {
    
    this.publicRecords = publicRecords;
    return this;
  }

  public Credit addPublicRecordsItem(PublicRecords publicRecordsItem) {
    if (this.publicRecords == null) {
      this.publicRecords = new ArrayList<>();
    }
    this.publicRecords.add(publicRecordsItem);
    return this;
  }

   /**
   * Get publicRecords
   * @return publicRecords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PublicRecords> getPublicRecords() {
    return publicRecords;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicRecords(List<PublicRecords> publicRecords) {
    this.publicRecords = publicRecords;
  }


  public Credit trades(List<Trades2> trades) {
    
    this.trades = trades;
    return this;
  }

  public Credit addTradesItem(Trades2 tradesItem) {
    if (this.trades == null) {
      this.trades = new ArrayList<>();
    }
    this.trades.add(tradesItem);
    return this;
  }

   /**
   * Get trades
   * @return trades
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Trades2> getTrades() {
    return trades;
  }


  @JsonProperty(JSON_PROPERTY_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrades(List<Trades2> trades) {
    this.trades = trades;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit credit = (Credit) o;
    return Objects.equals(this.collections, credit.collections) &&
        Objects.equals(this.creditSummary, credit.creditSummary) &&
        Objects.equals(this.inquiries, credit.inquiries) &&
        Objects.equals(this.publicRecords, credit.publicRecords) &&
        Objects.equals(this.trades, credit.trades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, creditSummary, inquiries, publicRecords, trades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credit {\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    creditSummary: ").append(toIndentedString(creditSummary)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
    sb.append("    publicRecords: ").append(toIndentedString(publicRecords)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
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

