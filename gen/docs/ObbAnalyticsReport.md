

# ObbAnalyticsReport

Cash Flow Analytics, Balance Analytics, and Payment History report data as JSON

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountResults** | [**List&lt;BalanceAnalyticsAccountResult&gt;**](BalanceAnalyticsAccountResult.md) | Balance results per account |  [optional] |
|**businessId** | **Integer** | Business ID |  [optional] |
|**businessSummary** | [**BalanceAnalyticsBusinessSummary**](BalanceAnalyticsBusinessSummary.md) |  |  [optional] |
|**customerId** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**reportHeader** | [**ObbReportHeader**](ObbReportHeader.md) | Customer and report metadata |  |
|**requesterName** | **String** | Name of requester |  [optional] |
|**title** | **String** | Title of the report |  |
|**totalRevenue** | **BigDecimal** | The total revenue |  [optional] |
|**accountIds** | **List&lt;Long&gt;** | List of account IDs included in the report |  [optional] |
|**analytics** | [**PaymentHistoryAnalytics**](PaymentHistoryAnalytics.md) |  |  [optional] |



