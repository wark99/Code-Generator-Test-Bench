

# CcReconHeader


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fopChannel** | **String** |  |  [optional] |
|**messageType** | **String** |  |  [optional] |
|**missingCatalog** | **List&lt;String&gt;** |  |  [optional] |
|**incompletePaymentDetailsRetryCount** | **BigDecimal** |  |  [optional] |
|**payloadDataSchema** | **String** |  |  [optional] |
|**eventType** | **String** |  |  [optional] |
|**eventState** | [**EventStateEnum**](#EventStateEnum) |  |  [optional] |
|**totalNumberOfCCRecords** | **String** |  |  [optional] |
|**totalNumberOfRecords** | **String** |  |  [optional] |
|**recordLineNumber** | **String** |  |  [optional] |
|**fileDetailsId** | **String** |  |  [optional] |
|**ccReconExceptions** | [**List&lt;CcReconException&gt;**](CcReconException.md) |  |  [optional] |



## Enum: EventStateEnum

| Name | Value |
|---- | -----|
| BEGIN | &quot;BEGIN&quot; |
| TRANS | &quot;TRANS&quot; |



