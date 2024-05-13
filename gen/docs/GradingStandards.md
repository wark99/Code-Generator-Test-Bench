

# GradingStandards


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a grading standard record. |  |
|**version** | **Object** | Either 1 or 2, as noted in the definition of &#x60;data&#x60;. |  [optional] |
|**contextCode** | **Object** | A value in string form representing the associated context (e.g., &#x60;course_5&#x60;). |  [optional] |
|**userId** | **Object** | The ID of the user who created this grading standard. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;grading_standards&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;grading_standards&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the grading standard. |  |
|**contextId** | **Object** | The ID of the account or course to which this grading standard belongs. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;, either Account or Course. |  |
|**migrationId** | **Object** | The ID of the associated migration, if this grading standard was created via a content migration. |  [optional] |
|**title** | **Object** | The name for this grading standard. |  [optional] |
|**data** | **Object** | A stringified array representing the content of this grading standard. If the &#x60;version&#x60; column is 1, each element is a tuple containing a letter grade and the maximum value for that letter grade. If the &#x60;version&#x60; column is 2, each element is a tuple containing a letter grade and the minimum value for that letter grade. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |



