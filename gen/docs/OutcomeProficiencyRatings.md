

# OutcomeProficiencyRatings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an outcome proficiency ratings record. |  |
|**createdAt** | **Object** | Timestamp of when an outcome_proficiency_ratings record was created. |  |
|**updatedAt** | **Object** | Timestamp of when an outcome_proficiency_ratings record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow status of the outcome_proficiency_rating. Defaults to &#x60;active&#x60;. |  |
|**mastery** | **Object** | Indicates the rating where mastery is first achieved. |  |
|**points** | **Object** | A non-negative number of points for the rating. |  |
|**outcomeProficiencyId** | **Object** | Unique ID of proficiency collection to which this rating belongs. |  |
|**color** | [**OutcomeProficiencyRatingsColor**](OutcomeProficiencyRatingsColor.md) |  |  |
|**description** | **Object** | The description of the rating. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



