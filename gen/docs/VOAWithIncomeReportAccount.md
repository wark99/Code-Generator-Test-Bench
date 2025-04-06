

# VOAWithIncomeReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  [optional] |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  [optional] |
|**ownerName** | **String** | The name(s) of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then all owners will be listed separated by |. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then the address of the primary owner will be listed. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**type** | **String** | The list of supported account types. * &#x60;checking&#x60; * &#x60;savings&#x60; * &#x60;moneyMarket&#x60; * &#x60;cd&#x60; * &#x60;investment&#x60; * &#x60;investmentTaxDeferred&#x60; * &#x60;employeeStockPurchasePlan&#x60; * &#x60;ira&#x60; * &#x60;401k&#x60; * &#x60;roth&#x60; * &#x60;403b&#x60; * &#x60;529&#x60; * &#x60;rollover&#x60; * &#x60;ugma&#x60; * &#x60;utma&#x60; * &#x60;keogh&#x60; * &#x60;457&#x60; * &#x60;401a&#x60; * &#x60;brokerageAccount&#x60; * &#x60;educationSavings&#x60; * &#x60;healthSavingsAccount&#x60; * &#x60;nonTaxableBrokerageAccount&#x60; * &#x60;pension&#x60; * &#x60;profitSharingPlan&#x60; * &#x60;roth401k&#x60; * &#x60;sepIRA&#x60; * &#x60;simpleIRA&#x60; * &#x60;thriftSavingsPlan&#x60; * &#x60;variableAnnuity&#x60; |  [optional] |
|**currency** | **String** | A currency code for account |  [optional] |
|**availableBalance** | **BigDecimal** | The available balance for the account |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**balance** | **BigDecimal** | The cleared balance of the account as-of balanceDate |  [optional] |
|**balanceDate** | **Long** | A timestamp showing when the balance was captured by the FI |  [optional] |
|**averageMonthlyBalance** | **BigDecimal** | The average monthly balance of this account |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxAccount** | **Long** | The count for the total number of insufficient funds transactions, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount** | **Long** | The count for the total number of insufficient funds transactions for the last two months, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount** | **Long** | The number of days since the most recent insufficient funds transaction, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**oldestTransactionDate** | **Long** | The oldest transaction date of this account. |  [optional] |
|**transactions** | [**List&lt;ReportTransactionNewTxBased&gt;**](ReportTransactionNewTxBased.md) | a list of transaction records |  [optional] |
|**details** | [**AccountDetailsTxBased**](AccountDetailsTxBased.md) |  |  [optional] |
|**position** | [**ReportAccountPosition**](ReportAccountPosition.md) |  |  [optional] |
|**asset** | [**PrequalificationReportAssetSummary**](PrequalificationReportAssetSummary.md) |  |  [optional] |
|**incomeStreams** | [**List&lt;VOAIReportIncomeStream&gt;**](VOAIReportIncomeStream.md) | A list of income stream records |  [optional] |



