

# PropertyMortgageConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | [**ThirdPartyProviderConfig**](ThirdPartyProviderConfig.md) |  |  [optional] |
|**currentPayment** | [**RecurringAmountConfig**](RecurringAmountConfig.md) |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
|**outstandingBalance** | **Double** |  |  [optional] |
|**referenceNumber** | **String** |  |  [optional] |
|**renewalDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**additionalInformation** | **String** |  |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| INTEREST_ONLY | &quot;interest only&quot; |
| CAPITAL_AND_INTEREST | &quot;capital and interest&quot; |



