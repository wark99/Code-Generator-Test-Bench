

# InspectionReportPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**propertyId** | **Integer** |  |  [optional] |
|**date** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | 1 &#x3D; General periodic, 2 &#x3D; HMO, 3 &#x3D; Pre move in, 4 &#x3D; Move in, 5 &#x3D; Pre move out, 6 &#x3D; Move out, 7 &#x3D; Empty property, 8 &#x3D; Condition concern, 9 &#x3D; Tenant concern, 10 &#x3D; Inventory, 11 &#x3D; Smoke detector, 12 &#x3D; Fitness for human habitation |  [optional] |
|**description** | **String** |  |  [optional] |
|**additionalNotes** | [**List&lt;InspectionReportPostRequestAdditionalNotesInner&gt;**](InspectionReportPostRequestAdditionalNotesInner.md) |  |  [optional] |
|**companyRepresentativeCallingName** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |



