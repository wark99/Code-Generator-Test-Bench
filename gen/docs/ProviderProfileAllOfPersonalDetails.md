

# ProviderProfileAllOfPersonalDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**postcode** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**county** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**age** | **String** |  |  [optional] |
|**schedule** | [**JobIdEditPutRequestSchedule**](JobIdEditPutRequestSchedule.md) |  |  [optional] |
|**idChecked** | **Boolean** |  |  [optional] |
|**addressChecked** | **Boolean** |  |  [optional] |
|**referencedChecked** | **Boolean** |  |  [optional] |
|**idDocumentUnderReview** | **Boolean** |  |  [optional] |
|**dateJoined** | **String** |  |  [optional] |
|**lastLogin** | **String** |  |  [optional] |
|**aboutYou** | **String** |  |  [optional] |
|**childcareExperienceInYears** | **Integer** |  |  [optional] |
|**childcareExperienceDescription** | **String** |  |  [optional] |
|**childcareTypesSeeking** | [**List&lt;ChildcareTypesSeekingEnum&gt;**](#List&lt;ChildcareTypesSeekingEnum&gt;) |  |  [optional] |
|**childrenAge** | [**List&lt;ChildrenAgeEnum&gt;**](#List&lt;ChildrenAgeEnum&gt;) |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |



## Enum: List&lt;ChildcareTypesSeekingEnum&gt;

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



