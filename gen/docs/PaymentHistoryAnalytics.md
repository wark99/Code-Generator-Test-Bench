

# PaymentHistoryAnalytics

Payment History computed analytics

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Report status |  [optional] |
|**riskScore** | **BigDecimal** | Calculated risk score |  [optional] |
|**transactionHistory** | **Integer** | Months of transactions |  [optional] |
|**transactionsSummary** | [**PaymentHistoryTransactionsSummary**](PaymentHistoryTransactionsSummary.md) |  |  [optional] |
|**accountSummaries** | [**List&lt;PaymentHistoryAccountSummary&gt;**](PaymentHistoryAccountSummary.md) | Account-level summary of transactions |  [optional] |
|**customerSummaryByMonths** | [**List&lt;PaymentHistoryCustomerMonthlySummary&gt;**](PaymentHistoryCustomerMonthlySummary.md) | Customer-level summary of transactions per month |  [optional] |



