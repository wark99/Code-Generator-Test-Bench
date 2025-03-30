

# VOETransactionsReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  [optional] |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  [optional] |
|**ownerName** | **String** | The name(s) of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then all owners will be listed separated by |. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then the address of the primary owner will be listed. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**type** | **String** | The list of supported account types * &#x60;checking&#x60; * &#x60;savings&#x60; * &#x60;moneyMarket&#x60; |  [optional] |
|**currency** | **String** | A currency code for account |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**incomeStreams** | [**List&lt;VOETransactionsReportIncomeStream&gt;**](VOETransactionsReportIncomeStream.md) | A list of income stream records |  [optional] |



