

# CancelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dispatchNumber** | **String** | This is NSA&#39;s unique reference id. It is returned as part of the create response body |  |
|**cancelReason** | [**CancelReasonEnum**](#CancelReasonEnum) |  |  |
|**notes** | **String** |  |  |



## Enum: CancelReasonEnum

| Name | Value |
|---- | -----|
| CLIENT | &quot;Cancelled by Client&quot; |
| CUSTOMER | &quot;Cancelled by Customer&quot; |
| NSA | &quot;Cancelled by NSA&quot; |



