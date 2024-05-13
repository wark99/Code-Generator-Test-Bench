

# JobPostCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**description** | **String** |  |  |
|**numberOfChildren** | **Integer** |  |  |
|**ageOfChildren** | [**List&lt;AgeOfChildrenEnum&gt;**](#List&lt;AgeOfChildrenEnum&gt;) |  |  |
|**childcareTypes** | [**List&lt;ChildcareTypesEnum&gt;**](#List&lt;ChildcareTypesEnum&gt;) |  |  |
|**jobTypes** | **List&lt;String&gt;** |  |  |
|**schedule** | [**JobIdEditPutRequestSchedule**](JobIdEditPutRequestSchedule.md) |  |  |
|**pay** | [**JobIdEditPutRequestPay**](JobIdEditPutRequestPay.md) |  |  |
|**postcode** | **String** |  |  |
|**city** | **String** |  |  |
|**town** | **String** |  |  [optional] |
|**startDate** | **String** |  |  |



## Enum: List&lt;AgeOfChildrenEnum&gt;

| Name | Value |
|---- | -----|
| TODDLER | &quot;toddler&quot; |
| PRESCHOOLER | &quot;preschooler&quot; |
| _5_11_YR_OLD | &quot;5-11_yr_old&quot; |
| TEENAGER | &quot;teenager&quot; |



## Enum: List&lt;ChildcareTypesEnum&gt;

| Name | Value |
|---- | -----|
| NANNY | &quot;nanny&quot; |
| BABYSITTER | &quot;babysitter&quot; |
| CHILDMINDER | &quot;childminder&quot; |
| PRIVATE_TUTOR | &quot;private_tutor&quot; |
| HOUSEHOLD_HELP | &quot;household_help&quot; |



