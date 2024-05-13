

# EstimateProcessRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**estimateID** | **Integer** |  |  |
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**note** | **String** | Required if the following actions - rejectWithResubmit, partiallyApproved, estimateHold |  [optional] |
|**processedReference** | **String** |  |  |
|**partsApproved** | **List&lt;Integer&gt;** | Required if action &#x3D; partiallyApproved |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| PARTIALLYAPPROVED | &quot;partiallyApproved&quot; |
| ESTDECLINED | &quot;estDeclined&quot; |
| REJECTWITHRESUBMIT | &quot;rejectWithResubmit&quot; |
| PARTSUNAVAIL | &quot;partsUnAvail&quot; |
| ESTIMATEHOLD | &quot;estimateHold&quot; |



