

# PropertyInsuranceConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**provider** | [**ThirdPartyProviderConfig**](ThirdPartyProviderConfig.md) |  |  [optional] |
|**referenceNumber** | **String** |  |  [optional] |
|**premiumPayment** | [**RecurringAmountConfig**](RecurringAmountConfig.md) |  |  [optional] |
|**startDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**endDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**reinstatementValue** | **Double** |  |  [optional] |
|**additionalInformation** | **String** |  |  [optional] |
|**contentsValue** | **Double** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUILDING | &quot;Building&quot; |
| CONTENTS | &quot;Contents&quot; |
| BUILDING_AND_CONTENT | &quot;Building and content&quot; |
| FACTORED | &quot;Factored&quot; |



