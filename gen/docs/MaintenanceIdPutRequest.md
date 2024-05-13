

# MaintenanceIdPutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**closed** | **Integer** |  |  [optional] |
|**status** | **MaintenanceStatusConfig** |  |  [optional] |
|**contractorId** | **Integer** |  |  [optional] |
|**estimatedAmount** | **String** |  |  [optional] |
|**finalAmount** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**maintenanceIssue** | **String** |  |  [optional] |
|**contactDetailsPassedToThirdParty** | **Boolean** |  |  [optional] |
|**propertyCanBeAccessedWithoutTenant** | **Boolean** |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | 1 &#x3D; Low, 2 &#x3D; Medium, 3 &#x3D; High, 4 &#x3D; Emergency |  [optional] |
|**maintenanceCategory** | **MaintenanceCategoryConfig** |  |  [optional] |
|**invoiceReceivedDate** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**invoiceReceivedReference** | **String** |  |  [optional] |
|**thirdPartySystemId** | **String** |  |  [optional] |
|**contractorAccepted** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**contractorVisit** | [**DateRequest**](DateRequest.md) |  |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



