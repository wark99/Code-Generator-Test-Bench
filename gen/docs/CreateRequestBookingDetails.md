

# CreateRequestBookingDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseNumber** | **String** | This is the clients unique case number |  |
|**complaintCode** | **String** | Standardized codes for the complaint |  [optional] |
|**complaint** | **String** | Explaination of the problem |  |
|**specialInstruction** | **String** |  |  [optional] |
|**scheduleDate** | **String** | If left blank, it will be booked without a schedule date |  [optional] |
|**timePreference** | [**TimePreferenceEnum**](#TimePreferenceEnum) | A&#x3D;Morning  P&#x3D;Afternoon E&#x3D;Evening D&#x3D;All Day  |  [optional] |
|**preAuthorizationLimit** | **BigDecimal** | Amount that is pre-approved for the repair (parts and labor) before requiring an estimate |  [optional] |
|**limitOfLiabilityRemaining** | **BigDecimal** | Amount of the limit of liability that is remaining on the contract. |  [optional] |
|**limitOfLiabilityTotal** | **BigDecimal** | Amount of the limit of liability that began on the on the contract. |  [optional] |
|**deductibleAmount** | **BigDecimal** | Some cirumstances require the consumer to pay a trip/deductible/service call fee directly to the service provider. That amount would be included here. |  [optional] |
|**planCode** | **String** | For contact work, the consumer is usually part of a specific plan that comes with certain terms and conditions |  [optional] |
|**relationshipCode** | **String** | Allows NSA to associate this repair to an arbitrary group such as a source system or billing group. |  [optional] |
|**authorizationNumber** | **String** | Some clients require a special authorization number to be provided at billing time. Please provide if required. |  [optional] |
|**suspectedRecall** | **Boolean** | If there is concern that this dispatch should be covered under the workmanship guarantee |  [optional] |
|**exclusions** | **String** | Delimited list of things not covered by the contract |  [optional] |
|**noPartsNeeded** | **Boolean** | Used to indicate that there are not parts required for this repair and notification of the dispatch should not be delayed |  [optional] |



## Enum: TimePreferenceEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| P | &quot;P&quot; |
| E | &quot;E&quot; |
| D | &quot;D&quot; |



