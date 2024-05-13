

# MaintenancePropertyPropertyIdPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportedDate** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**status** | **MaintenanceStatusConfig** |  |  [optional] |
|**maintenanceIssue** | **String** |  |  [optional] |
|**contractorAccepted** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**contractorVisit** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**contractorId** | **Integer** |  |  [optional] |
|**invoiceReceivedDate** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**invoiceReceivedReference** | **String** |  |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**closedDate** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**assignedEmployeeId** | **Integer** |  |  [optional] |
|**contactDetailsPassedToThirdParty** | **Boolean** |  |  [optional] |
|**propertyCanBeAccessedWithoutTenant** | **Boolean** |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | 1 &#x3D; Low, 2 &#x3D; Medium, 3 &#x3D; High, 4 &#x3D; Emergency |  [optional] |
|**maintenanceCategory** | **MaintenanceCategoryConfig** |  |  [optional] |
|**thirdPartySystemId** | **String** |  |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



