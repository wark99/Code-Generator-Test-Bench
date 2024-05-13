

# Document


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  [optional] |
|**sourceEventTimestamp** | **OffsetDateTime** |  |  [optional] |
|**documentNumber** | **String** |  |  [optional] |
|**issueDate** | **String** |  |  [optional] |
|**issueCountryCode** | **String** |  |  [optional] |
|**totalDocumentAmount** | [**TotalDocumentAmount**](TotalDocumentAmount.md) |  |  [optional] |
|**agentSine** | **String** |  |  [optional] |
|**pnrInfo** | [**PnrInfo**](PnrInfo.md) |  |  [optional] |
|**documentType** | **String** |  |  [optional] |
|**stationAlpha** | **String** |  |  [optional] |
|**iataAgencyNumber** | **String** |  |  [optional] |
|**couponDetails** | [**List&lt;CouponDetails&gt;**](CouponDetails.md) |  |  [optional] |
|**passengerInfo** | [**PassengerInfo**](PassengerInfo.md) |  |  [optional] |
|**formOfPaymentSale** | [**List&lt;FormOfPaymentSale&gt;**](FormOfPaymentSale.md) |  |  [optional] |
|**exchangeDocumentInfo** | [**ExchangeDocumentInfo**](ExchangeDocumentInfo.md) |  |  [optional] |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| SALE | &quot;SALE&quot; |
| REFUND | &quot;REFUND&quot; |
| VOID | &quot;VOID&quot; |



