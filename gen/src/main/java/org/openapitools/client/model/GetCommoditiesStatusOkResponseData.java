/*
 * UEX Corp API
 * Created by [@thekronny](https://discord.com/users/224580858432978944). ## Downloads [Secification file](https://app.swaggerhub.com/apiproxy/registry/dolejska-daniel/UEX-API/v2.0?resolved=true&flatten=true&pretty=true) ## Other Resources
 *
 * The version of the OpenAPI document: v2.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CommodityStatusDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetCommoditiesStatusOkResponseData
 */
@JsonPropertyOrder({
  GetCommoditiesStatusOkResponseData.JSON_PROPERTY_BUY,
  GetCommoditiesStatusOkResponseData.JSON_PROPERTY_SELL
})
@JsonTypeName("GetCommoditiesStatusOkResponse_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetCommoditiesStatusOkResponseData {
  public static final String JSON_PROPERTY_BUY = "buy";
  private List<CommodityStatusDTO> buy;

  public static final String JSON_PROPERTY_SELL = "sell";
  private JsonNullable<Object> sell = JsonNullable.<Object>of(null);

  public GetCommoditiesStatusOkResponseData() {
  }

  public GetCommoditiesStatusOkResponseData buy(List<CommodityStatusDTO> buy) {
    
    this.buy = buy;
    return this;
  }

  public GetCommoditiesStatusOkResponseData addBuyItem(CommodityStatusDTO buyItem) {
    if (this.buy == null) {
      this.buy = new ArrayList<>();
    }
    this.buy.add(buyItem);
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CommodityStatusDTO> getBuy() {
    return buy;
  }


  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuy(List<CommodityStatusDTO> buy) {
    this.buy = buy;
  }


  public GetCommoditiesStatusOkResponseData sell(Object sell) {
    this.sell = JsonNullable.<Object>of(sell);
    
    return this;
  }

   /**
   * Get sell
   * @return sell
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSell() {
        return sell.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSell_JsonNullable() {
    return sell;
  }
  
  @JsonProperty(JSON_PROPERTY_SELL)
  public void setSell_JsonNullable(JsonNullable<Object> sell) {
    this.sell = sell;
  }

  public void setSell(Object sell) {
    this.sell = JsonNullable.<Object>of(sell);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCommoditiesStatusOkResponseData getCommoditiesStatusOkResponseData = (GetCommoditiesStatusOkResponseData) o;
    return Objects.equals(this.buy, getCommoditiesStatusOkResponseData.buy) &&
        equalsNullable(this.sell, getCommoditiesStatusOkResponseData.sell);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(buy, hashCodeNullable(sell));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCommoditiesStatusOkResponseData {\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
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

