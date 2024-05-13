

# JobIdAppGet200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**postcode** | **String** |  |  [optional] |
|**town** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**expiry** | **String** |  |  [optional] |
|**viewed** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**numberOfChildren** | **Integer** |  |  [optional] |
|**applications** | [**List&lt;JobIdAppGet200ResponseApplicationsInner&gt;**](JobIdAppGet200ResponseApplicationsInner.md) |  |  [optional] |
|**childcareTypes** | [**List&lt;ChildcareTypesEnum&gt;**](#List&lt;ChildcareTypesEnum&gt;) |  |  [optional] |
|**payOffers** | [**JobIdEditPutRequestPay**](JobIdEditPutRequestPay.md) |  |  [optional] |
|**schedules** | [**JobIdEditPutRequestSchedule**](JobIdEditPutRequestSchedule.md) |  |  [optional] |
|**jobTypes** | **List&lt;String&gt;** |  |  [optional] |
|**childrenAge** | [**List&lt;ChildrenAgeEnum&gt;**](#List&lt;ChildrenAgeEnum&gt;) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;live&quot; |
| DRAFT | &quot;draft&quot; |
| OFFLINE | &quot;offline&quot; |
| SUSPENDED | &quot;suspended&quot; |
| EXPIRED | &quot;expired&quot; |
| ABANDONED | &quot;abandoned&quot; |



## Enum: List&lt;ChildcareTypesEnum&gt;

| Name | Value |
|---- | -----|
| NANNY | &quot;nanny&quot; |
| BABYSITTER | &quot;babysitter&quot; |
| CHILDMINDER | &quot;childminder&quot; |
| PRIVATE_TUTOR | &quot;private_tutor&quot; |
| HOUSEHOLD_HELP | &quot;household_help&quot; |



## Enum: List&lt;ChildrenAgeEnum&gt;

| Name | Value |
|---- | -----|
| TODDLER | &quot;toddler&quot; |
| PRESCHOOLER | &quot;preschooler&quot; |
| _5_11_YR_OLD | &quot;5-11_yr_old&quot; |
| TEENAGER | &quot;teenager&quot; |



