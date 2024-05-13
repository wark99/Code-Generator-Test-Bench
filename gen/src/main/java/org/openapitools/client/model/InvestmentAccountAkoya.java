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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.InvestmentAccountAkoyaBalanceListInner;
import org.openapitools.client.model.InvestmentAccountAkoyaContributionInner;
import org.openapitools.client.model.InvestmentAccountAkoyaEntityGrantsInner;
import org.openapitools.client.model.InvestmentAccountAkoyaHoldingsInner;
import org.openapitools.client.model.InvestmentAccountAkoyaInvestmentLoansInner;
import org.openapitools.client.model.InvestmentAccountAkoyaOpenOrdersInner;
import org.openapitools.client.model.InvestmentAccountAkoyaPensionSourceInner;
import org.openapitools.client.model.InvestmentAccountAkoyaVestingInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvestmentAccountAkoya
 */
@JsonPropertyOrder({
  InvestmentAccountAkoya.JSON_PROPERTY_HOLDINGS,
  InvestmentAccountAkoya.JSON_PROPERTY_OPEN_ORDERS,
  InvestmentAccountAkoya.JSON_PROPERTY_CONTRIBUTION,
  InvestmentAccountAkoya.JSON_PROPERTY_VESTING,
  InvestmentAccountAkoya.JSON_PROPERTY_INVESTMENT_LOANS,
  InvestmentAccountAkoya.JSON_PROPERTY_PENSION_SOURCE,
  InvestmentAccountAkoya.JSON_PROPERTY_ENTITY_GRANTS,
  InvestmentAccountAkoya.JSON_PROPERTY_AVAILABLE_CASH_BALANCE,
  InvestmentAccountAkoya.JSON_PROPERTY_BALANCE_AS_OF,
  InvestmentAccountAkoya.JSON_PROPERTY_BALANCE_LIST,
  InvestmentAccountAkoya.JSON_PROPERTY_CURRENT_VALUE,
  InvestmentAccountAkoya.JSON_PROPERTY_DAILY_CHANGE,
  InvestmentAccountAkoya.JSON_PROPERTY_MARGIN_BALANCE,
  InvestmentAccountAkoya.JSON_PROPERTY_PERCENTAGE_CHANGE,
  InvestmentAccountAkoya.JSON_PROPERTY_ROLLOVER_AMOUNT,
  InvestmentAccountAkoya.JSON_PROPERTY_SHORT_BALANCE,
  InvestmentAccountAkoya.JSON_PROPERTY_ALLOWED_CHECK_WRITING,
  InvestmentAccountAkoya.JSON_PROPERTY_ALLOWED_OPTION_TRADE,
  InvestmentAccountAkoya.JSON_PROPERTY_BROKER_ID,
  InvestmentAccountAkoya.JSON_PROPERTY_CALENDAR_YEAR_FOR401_K,
  InvestmentAccountAkoya.JSON_PROPERTY_EMPLOYER_NAME,
  InvestmentAccountAkoya.JSON_PROPERTY_MARGIN,
  InvestmentAccountAkoya.JSON_PROPERTY_PLAN_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InvestmentAccountAkoya {
  public static final String JSON_PROPERTY_HOLDINGS = "holdings";
  private List<InvestmentAccountAkoyaHoldingsInner> holdings;

  public static final String JSON_PROPERTY_OPEN_ORDERS = "openOrders";
  private List<InvestmentAccountAkoyaOpenOrdersInner> openOrders;

  public static final String JSON_PROPERTY_CONTRIBUTION = "contribution";
  private List<InvestmentAccountAkoyaContributionInner> contribution;

  public static final String JSON_PROPERTY_VESTING = "vesting";
  private List<InvestmentAccountAkoyaVestingInner> vesting;

  public static final String JSON_PROPERTY_INVESTMENT_LOANS = "investmentLoans";
  private List<InvestmentAccountAkoyaInvestmentLoansInner> investmentLoans;

  public static final String JSON_PROPERTY_PENSION_SOURCE = "pensionSource";
  private List<InvestmentAccountAkoyaPensionSourceInner> pensionSource;

  public static final String JSON_PROPERTY_ENTITY_GRANTS = "entityGrants";
  private List<InvestmentAccountAkoyaEntityGrantsInner> entityGrants;

  public static final String JSON_PROPERTY_AVAILABLE_CASH_BALANCE = "availableCashBalance";
  private BigDecimal availableCashBalance;

  public static final String JSON_PROPERTY_BALANCE_AS_OF = "balanceAsOf";
  private String balanceAsOf;

  public static final String JSON_PROPERTY_BALANCE_LIST = "balanceList";
  private List<InvestmentAccountAkoyaBalanceListInner> balanceList;

  public static final String JSON_PROPERTY_CURRENT_VALUE = "currentValue";
  private BigDecimal currentValue;

  public static final String JSON_PROPERTY_DAILY_CHANGE = "dailyChange";
  private BigDecimal dailyChange;

  public static final String JSON_PROPERTY_MARGIN_BALANCE = "marginBalance";
  private BigDecimal marginBalance;

  public static final String JSON_PROPERTY_PERCENTAGE_CHANGE = "percentageChange";
  private BigDecimal percentageChange;

  public static final String JSON_PROPERTY_ROLLOVER_AMOUNT = "rolloverAmount";
  private BigDecimal rolloverAmount;

  public static final String JSON_PROPERTY_SHORT_BALANCE = "shortBalance";
  private BigDecimal shortBalance;

  public static final String JSON_PROPERTY_ALLOWED_CHECK_WRITING = "allowedCheckWriting";
  private Boolean allowedCheckWriting;

  public static final String JSON_PROPERTY_ALLOWED_OPTION_TRADE = "allowedOptionTrade";
  private Boolean allowedOptionTrade;

  public static final String JSON_PROPERTY_BROKER_ID = "brokerId";
  private String brokerId;

  public static final String JSON_PROPERTY_CALENDAR_YEAR_FOR401_K = "calendarYearFor401K";
  private String calendarYearFor401K;

  public static final String JSON_PROPERTY_EMPLOYER_NAME = "employerName";
  private String employerName;

  public static final String JSON_PROPERTY_MARGIN = "margin";
  private Boolean margin;

  public static final String JSON_PROPERTY_PLAN_ID = "planId";
  private String planId;

  public InvestmentAccountAkoya() {
  }

  public InvestmentAccountAkoya holdings(List<InvestmentAccountAkoyaHoldingsInner> holdings) {
    
    this.holdings = holdings;
    return this;
  }

  public InvestmentAccountAkoya addHoldingsItem(InvestmentAccountAkoyaHoldingsInner holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaHoldingsInner> getHoldings() {
    return holdings;
  }


  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldings(List<InvestmentAccountAkoyaHoldingsInner> holdings) {
    this.holdings = holdings;
  }


  public InvestmentAccountAkoya openOrders(List<InvestmentAccountAkoyaOpenOrdersInner> openOrders) {
    
    this.openOrders = openOrders;
    return this;
  }

  public InvestmentAccountAkoya addOpenOrdersItem(InvestmentAccountAkoyaOpenOrdersInner openOrdersItem) {
    if (this.openOrders == null) {
      this.openOrders = new ArrayList<>();
    }
    this.openOrders.add(openOrdersItem);
    return this;
  }

   /**
   * Get openOrders
   * @return openOrders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_ORDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaOpenOrdersInner> getOpenOrders() {
    return openOrders;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_ORDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenOrders(List<InvestmentAccountAkoyaOpenOrdersInner> openOrders) {
    this.openOrders = openOrders;
  }


  public InvestmentAccountAkoya contribution(List<InvestmentAccountAkoyaContributionInner> contribution) {
    
    this.contribution = contribution;
    return this;
  }

  public InvestmentAccountAkoya addContributionItem(InvestmentAccountAkoyaContributionInner contributionItem) {
    if (this.contribution == null) {
      this.contribution = new ArrayList<>();
    }
    this.contribution.add(contributionItem);
    return this;
  }

   /**
   * Get contribution
   * @return contribution
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaContributionInner> getContribution() {
    return contribution;
  }


  @JsonProperty(JSON_PROPERTY_CONTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContribution(List<InvestmentAccountAkoyaContributionInner> contribution) {
    this.contribution = contribution;
  }


  public InvestmentAccountAkoya vesting(List<InvestmentAccountAkoyaVestingInner> vesting) {
    
    this.vesting = vesting;
    return this;
  }

  public InvestmentAccountAkoya addVestingItem(InvestmentAccountAkoyaVestingInner vestingItem) {
    if (this.vesting == null) {
      this.vesting = new ArrayList<>();
    }
    this.vesting.add(vestingItem);
    return this;
  }

   /**
   * Get vesting
   * @return vesting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VESTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaVestingInner> getVesting() {
    return vesting;
  }


  @JsonProperty(JSON_PROPERTY_VESTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVesting(List<InvestmentAccountAkoyaVestingInner> vesting) {
    this.vesting = vesting;
  }


  public InvestmentAccountAkoya investmentLoans(List<InvestmentAccountAkoyaInvestmentLoansInner> investmentLoans) {
    
    this.investmentLoans = investmentLoans;
    return this;
  }

  public InvestmentAccountAkoya addInvestmentLoansItem(InvestmentAccountAkoyaInvestmentLoansInner investmentLoansItem) {
    if (this.investmentLoans == null) {
      this.investmentLoans = new ArrayList<>();
    }
    this.investmentLoans.add(investmentLoansItem);
    return this;
  }

   /**
   * Get investmentLoans
   * @return investmentLoans
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVESTMENT_LOANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaInvestmentLoansInner> getInvestmentLoans() {
    return investmentLoans;
  }


  @JsonProperty(JSON_PROPERTY_INVESTMENT_LOANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentLoans(List<InvestmentAccountAkoyaInvestmentLoansInner> investmentLoans) {
    this.investmentLoans = investmentLoans;
  }


  public InvestmentAccountAkoya pensionSource(List<InvestmentAccountAkoyaPensionSourceInner> pensionSource) {
    
    this.pensionSource = pensionSource;
    return this;
  }

  public InvestmentAccountAkoya addPensionSourceItem(InvestmentAccountAkoyaPensionSourceInner pensionSourceItem) {
    if (this.pensionSource == null) {
      this.pensionSource = new ArrayList<>();
    }
    this.pensionSource.add(pensionSourceItem);
    return this;
  }

   /**
   * Get pensionSource
   * @return pensionSource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENSION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaPensionSourceInner> getPensionSource() {
    return pensionSource;
  }


  @JsonProperty(JSON_PROPERTY_PENSION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPensionSource(List<InvestmentAccountAkoyaPensionSourceInner> pensionSource) {
    this.pensionSource = pensionSource;
  }


  public InvestmentAccountAkoya entityGrants(List<InvestmentAccountAkoyaEntityGrantsInner> entityGrants) {
    
    this.entityGrants = entityGrants;
    return this;
  }

  public InvestmentAccountAkoya addEntityGrantsItem(InvestmentAccountAkoyaEntityGrantsInner entityGrantsItem) {
    if (this.entityGrants == null) {
      this.entityGrants = new ArrayList<>();
    }
    this.entityGrants.add(entityGrantsItem);
    return this;
  }

   /**
   * Get entityGrants
   * @return entityGrants
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaEntityGrantsInner> getEntityGrants() {
    return entityGrants;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGrants(List<InvestmentAccountAkoyaEntityGrantsInner> entityGrants) {
    this.entityGrants = entityGrants;
  }


  public InvestmentAccountAkoya availableCashBalance(BigDecimal availableCashBalance) {
    
    this.availableCashBalance = availableCashBalance;
    return this;
  }

   /**
   * Get availableCashBalance
   * @return availableCashBalance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_CASH_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAvailableCashBalance() {
    return availableCashBalance;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_CASH_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableCashBalance(BigDecimal availableCashBalance) {
    this.availableCashBalance = availableCashBalance;
  }


  public InvestmentAccountAkoya balanceAsOf(String balanceAsOf) {
    
    this.balanceAsOf = balanceAsOf;
    return this;
  }

   /**
   * Get balanceAsOf
   * @return balanceAsOf
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE_AS_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAsOf() {
    return balanceAsOf;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AS_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAsOf(String balanceAsOf) {
    this.balanceAsOf = balanceAsOf;
  }


  public InvestmentAccountAkoya balanceList(List<InvestmentAccountAkoyaBalanceListInner> balanceList) {
    
    this.balanceList = balanceList;
    return this;
  }

  public InvestmentAccountAkoya addBalanceListItem(InvestmentAccountAkoyaBalanceListInner balanceListItem) {
    if (this.balanceList == null) {
      this.balanceList = new ArrayList<>();
    }
    this.balanceList.add(balanceListItem);
    return this;
  }

   /**
   * Get balanceList
   * @return balanceList
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvestmentAccountAkoyaBalanceListInner> getBalanceList() {
    return balanceList;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceList(List<InvestmentAccountAkoyaBalanceListInner> balanceList) {
    this.balanceList = balanceList;
  }


  public InvestmentAccountAkoya currentValue(BigDecimal currentValue) {
    
    this.currentValue = currentValue;
    return this;
  }

   /**
   * Get currentValue
   * @return currentValue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCurrentValue() {
    return currentValue;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentValue(BigDecimal currentValue) {
    this.currentValue = currentValue;
  }


  public InvestmentAccountAkoya dailyChange(BigDecimal dailyChange) {
    
    this.dailyChange = dailyChange;
    return this;
  }

   /**
   * Get dailyChange
   * @return dailyChange
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDailyChange() {
    return dailyChange;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyChange(BigDecimal dailyChange) {
    this.dailyChange = dailyChange;
  }


  public InvestmentAccountAkoya marginBalance(BigDecimal marginBalance) {
    
    this.marginBalance = marginBalance;
    return this;
  }

   /**
   * Get marginBalance
   * @return marginBalance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMarginBalance() {
    return marginBalance;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarginBalance(BigDecimal marginBalance) {
    this.marginBalance = marginBalance;
  }


  public InvestmentAccountAkoya percentageChange(BigDecimal percentageChange) {
    
    this.percentageChange = percentageChange;
    return this;
  }

   /**
   * Get percentageChange
   * @return percentageChange
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPercentageChange() {
    return percentageChange;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentageChange(BigDecimal percentageChange) {
    this.percentageChange = percentageChange;
  }


  public InvestmentAccountAkoya rolloverAmount(BigDecimal rolloverAmount) {
    
    this.rolloverAmount = rolloverAmount;
    return this;
  }

   /**
   * Get rolloverAmount
   * @return rolloverAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLLOVER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRolloverAmount() {
    return rolloverAmount;
  }


  @JsonProperty(JSON_PROPERTY_ROLLOVER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRolloverAmount(BigDecimal rolloverAmount) {
    this.rolloverAmount = rolloverAmount;
  }


  public InvestmentAccountAkoya shortBalance(BigDecimal shortBalance) {
    
    this.shortBalance = shortBalance;
    return this;
  }

   /**
   * Get shortBalance
   * @return shortBalance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getShortBalance() {
    return shortBalance;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortBalance(BigDecimal shortBalance) {
    this.shortBalance = shortBalance;
  }


  public InvestmentAccountAkoya allowedCheckWriting(Boolean allowedCheckWriting) {
    
    this.allowedCheckWriting = allowedCheckWriting;
    return this;
  }

   /**
   * Get allowedCheckWriting
   * @return allowedCheckWriting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_CHECK_WRITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowedCheckWriting() {
    return allowedCheckWriting;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_CHECK_WRITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedCheckWriting(Boolean allowedCheckWriting) {
    this.allowedCheckWriting = allowedCheckWriting;
  }


  public InvestmentAccountAkoya allowedOptionTrade(Boolean allowedOptionTrade) {
    
    this.allowedOptionTrade = allowedOptionTrade;
    return this;
  }

   /**
   * Get allowedOptionTrade
   * @return allowedOptionTrade
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_OPTION_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowedOptionTrade() {
    return allowedOptionTrade;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_OPTION_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOptionTrade(Boolean allowedOptionTrade) {
    this.allowedOptionTrade = allowedOptionTrade;
  }


  public InvestmentAccountAkoya brokerId(String brokerId) {
    
    this.brokerId = brokerId;
    return this;
  }

   /**
   * Get brokerId
   * @return brokerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrokerId() {
    return brokerId;
  }


  @JsonProperty(JSON_PROPERTY_BROKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrokerId(String brokerId) {
    this.brokerId = brokerId;
  }


  public InvestmentAccountAkoya calendarYearFor401K(String calendarYearFor401K) {
    
    this.calendarYearFor401K = calendarYearFor401K;
    return this;
  }

   /**
   * Get calendarYearFor401K
   * @return calendarYearFor401K
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALENDAR_YEAR_FOR401_K)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalendarYearFor401K() {
    return calendarYearFor401K;
  }


  @JsonProperty(JSON_PROPERTY_CALENDAR_YEAR_FOR401_K)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalendarYearFor401K(String calendarYearFor401K) {
    this.calendarYearFor401K = calendarYearFor401K;
  }


  public InvestmentAccountAkoya employerName(String employerName) {
    
    this.employerName = employerName;
    return this;
  }

   /**
   * Get employerName
   * @return employerName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmployerName() {
    return employerName;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }


  public InvestmentAccountAkoya margin(Boolean margin) {
    
    this.margin = margin;
    return this;
  }

   /**
   * Get margin
   * @return margin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMargin() {
    return margin;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMargin(Boolean margin) {
    this.margin = margin;
  }


  public InvestmentAccountAkoya planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(String planId) {
    this.planId = planId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentAccountAkoya investmentAccountAkoya = (InvestmentAccountAkoya) o;
    return Objects.equals(this.holdings, investmentAccountAkoya.holdings) &&
        Objects.equals(this.openOrders, investmentAccountAkoya.openOrders) &&
        Objects.equals(this.contribution, investmentAccountAkoya.contribution) &&
        Objects.equals(this.vesting, investmentAccountAkoya.vesting) &&
        Objects.equals(this.investmentLoans, investmentAccountAkoya.investmentLoans) &&
        Objects.equals(this.pensionSource, investmentAccountAkoya.pensionSource) &&
        Objects.equals(this.entityGrants, investmentAccountAkoya.entityGrants) &&
        Objects.equals(this.availableCashBalance, investmentAccountAkoya.availableCashBalance) &&
        Objects.equals(this.balanceAsOf, investmentAccountAkoya.balanceAsOf) &&
        Objects.equals(this.balanceList, investmentAccountAkoya.balanceList) &&
        Objects.equals(this.currentValue, investmentAccountAkoya.currentValue) &&
        Objects.equals(this.dailyChange, investmentAccountAkoya.dailyChange) &&
        Objects.equals(this.marginBalance, investmentAccountAkoya.marginBalance) &&
        Objects.equals(this.percentageChange, investmentAccountAkoya.percentageChange) &&
        Objects.equals(this.rolloverAmount, investmentAccountAkoya.rolloverAmount) &&
        Objects.equals(this.shortBalance, investmentAccountAkoya.shortBalance) &&
        Objects.equals(this.allowedCheckWriting, investmentAccountAkoya.allowedCheckWriting) &&
        Objects.equals(this.allowedOptionTrade, investmentAccountAkoya.allowedOptionTrade) &&
        Objects.equals(this.brokerId, investmentAccountAkoya.brokerId) &&
        Objects.equals(this.calendarYearFor401K, investmentAccountAkoya.calendarYearFor401K) &&
        Objects.equals(this.employerName, investmentAccountAkoya.employerName) &&
        Objects.equals(this.margin, investmentAccountAkoya.margin) &&
        Objects.equals(this.planId, investmentAccountAkoya.planId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdings, openOrders, contribution, vesting, investmentLoans, pensionSource, entityGrants, availableCashBalance, balanceAsOf, balanceList, currentValue, dailyChange, marginBalance, percentageChange, rolloverAmount, shortBalance, allowedCheckWriting, allowedOptionTrade, brokerId, calendarYearFor401K, employerName, margin, planId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentAccountAkoya {\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    openOrders: ").append(toIndentedString(openOrders)).append("\n");
    sb.append("    contribution: ").append(toIndentedString(contribution)).append("\n");
    sb.append("    vesting: ").append(toIndentedString(vesting)).append("\n");
    sb.append("    investmentLoans: ").append(toIndentedString(investmentLoans)).append("\n");
    sb.append("    pensionSource: ").append(toIndentedString(pensionSource)).append("\n");
    sb.append("    entityGrants: ").append(toIndentedString(entityGrants)).append("\n");
    sb.append("    availableCashBalance: ").append(toIndentedString(availableCashBalance)).append("\n");
    sb.append("    balanceAsOf: ").append(toIndentedString(balanceAsOf)).append("\n");
    sb.append("    balanceList: ").append(toIndentedString(balanceList)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    dailyChange: ").append(toIndentedString(dailyChange)).append("\n");
    sb.append("    marginBalance: ").append(toIndentedString(marginBalance)).append("\n");
    sb.append("    percentageChange: ").append(toIndentedString(percentageChange)).append("\n");
    sb.append("    rolloverAmount: ").append(toIndentedString(rolloverAmount)).append("\n");
    sb.append("    shortBalance: ").append(toIndentedString(shortBalance)).append("\n");
    sb.append("    allowedCheckWriting: ").append(toIndentedString(allowedCheckWriting)).append("\n");
    sb.append("    allowedOptionTrade: ").append(toIndentedString(allowedOptionTrade)).append("\n");
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
    sb.append("    calendarYearFor401K: ").append(toIndentedString(calendarYearFor401K)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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

