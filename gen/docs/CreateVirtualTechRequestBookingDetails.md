

# CreateVirtualTechRequestBookingDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseNumber** | **String** | This is the clients unique case number |  |
|**complaintCode** | **String** | Standardized codes for the complaint |  [optional] |
|**complaint** | **String** | Explaination of the problem |  |
|**specialInstruction** | **String** |  |  [optional] |
|**scheduleDate** | **String** | Date provided from availabilityVirtualTech |  |
|**slot** | **String** | Slot provided from availabilityVirtualTech |  |
|**preAuthorizationLimit** | **BigDecimal** | Amount that is pre-approved for the repair (parts and labor) before requiring an estimate |  [optional] |
|**deductibleAmount** | **BigDecimal** | Some cirumstances require the consumer to pay a trip/deductible/service call fee directly to the service provider. That amount would be included here. |  [optional] |
|**planCode** | **String** | For contact work, the consumer is usually part of a specific plan that comes with certain terms and conditions |  [optional] |
|**authorizationNumber** | **String** | Some clients require a special authorization number to be provided at billing time. Please provide if required. |  [optional] |
|**suspectedRecall** | **Boolean** | If there is concern that this dispatch should be covered under the workmanship guarantee |  [optional] |
|**exclusions** | **String** | Delimited list of things not covered by the contract |  [optional] |
|**virtualBookingType** | [**VirtualBookingTypeEnum**](#VirtualBookingTypeEnum) | Indicates virtual booking type. I not provided, it defaults to diagnosisOnly |  [optional] |



## Enum: VirtualBookingTypeEnum

| Name | Value |
|---- | -----|
| DIAGNOSISONLY | &quot;diagnosisOnly&quot; |
| DIAGNOSISANDREPAIRWALKTHROUGH | &quot;diagnosisAndRepairWalkthrough&quot; |



