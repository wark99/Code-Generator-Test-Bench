

# PotentialPropertyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**address** | [**PropertyAddressResponse**](PropertyAddressResponse.md) |  |  [optional] |
|**setupFee** | **String** |  |  [optional] |
|**propertyPurchasePrice** | **String** |  |  [optional] |
|**transactionDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**tenancyStartDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**propertyAdvertisedDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**instructionDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**titleName** | **String** |  |  [optional] |
|**titleNumber** | **String** |  |  [optional] |
|**managementFee** | **String** |  |  [optional] |
|**reasonNotInstructed** | [**ReasonNotInstructedEnum**](#ReasonNotInstructedEnum) |  |  [optional] |



## Enum: ReasonNotInstructedEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SOLD | &quot;Sold&quot; |
| COMPETITOR_INSTRUCTED | &quot;Competitor Instructed&quot; |
| _FEES | &quot; Fees&quot; |
| REJECTED_BY_AGENT | &quot;Rejected By Agent&quot; |
| NO_RESPONSE | &quot;No Response&quot; |



