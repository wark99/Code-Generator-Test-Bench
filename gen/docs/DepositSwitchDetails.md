

# DepositSwitchDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A customer ID |  |
|**customerType** | **String** | The type of Mastercard Open Banking customer (&#x60;active&#x60; or &#x60;testing&#x60;) |  |
|**switchId** | **String** | Deposit switch ID |  |
|**switchStatus** | **String** | Deposit switch status. Possible values include &#x60;processing&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;.  * processing - The deposit switch is currently being processed. * completed - The deposit switch has been completed successfully. * failed - The deposit switch has failed. Refer to failureReason for more details.  |  |
|**failureReason** | **String** | Deposit switch failure reason |  [optional] |
|**createdDate** | **String** | Date and time in ISO 8601 format (YYYY-MM-DDThh:mm:ssZ) when deposit switch was performed |  |
|**updatedDate** | **String** | Date and time in ISO 8601 format (YYYY-MM-DDThh:mm:ssZ) when deposit switch status was updated |  |
|**authenticated** | **Boolean** | Indicates whether or not the deposit switch task has successfully authenticated against the payroll system |  [optional] |
|**provider** | [**DepositSwitchDetailsProvider**](DepositSwitchDetailsProvider.md) |  |  |
|**distributions** | [**List&lt;DepositSwitchDetailsDistributionsInner&gt;**](DepositSwitchDetailsDistributionsInner.md) | Deposit switch distribution details |  |



