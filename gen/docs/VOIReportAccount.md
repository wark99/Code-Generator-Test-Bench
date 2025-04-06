

# VOIReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  [optional] |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  [optional] |
|**ownerName** | **String** | The name(s) of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then all owners will be listed separated by |. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then the address of the primary owner will be listed. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**type** | **String** | The list of supported account types. * &#x60;checking&#x60; * &#x60;savings&#x60; * &#x60;moneyMarket&#x60; |  [optional] |
|**currency** | **String** | A currency code for account |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**incomeStreams** | [**List&lt;VOIReportIncomeStream&gt;**](VOIReportIncomeStream.md) | A list of income stream records |  [optional] |
|**balance** | **BigDecimal** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**averageMonthlyBalance** | **BigDecimal** | The average monthly balance of this account |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | a list of transaction records |  [optional] |
|**availableBalance** | **BigDecimal** | The available balance for the account |  [optional] |
|**currentBalance** | **BigDecimal** | Current balance of the account |  [optional] |
|**beginningBalance** | **BigDecimal** | Beginning balance of account per the time period in the report |  [optional] |
|**oldestTransactionDate** | **Long** | The oldest transaction date of this account. |  [optional] |
|**miscDeposits** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | A list of miscellaneous deposits |  [optional] |



