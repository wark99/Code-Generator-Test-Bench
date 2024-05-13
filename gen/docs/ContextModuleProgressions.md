

# ContextModuleProgressions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a user module progression record. |  |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a context_module_progressions record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a context_module_progressions record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The current state of the record. |  |
|**requirementsMet** | **Object** | Object indicating which requirements have been met. |  [optional] |
|**collapsed** | **Object** | Flag indicating whether modules items are collapsed for user. |  [optional] |
|**currentPosition** | **Object** | For sequential access, this is the current position of the module item (ContentTag). |  [optional] |
|**completedAt** | **Object** | Timestamp showing when this user completed this module progression. |  [optional] |
|**current** | **Object** | Flag indicating that this progression is current and not outdated. |  [optional] |
|**evaluatedAt** | **Object** | Timestamp showing when this progression was last evaluated for completion, lock, or unlock. |  [optional] |
|**incompleteRequirements** | **Object** | Object that contains incomplete requirements related to min_score. |  [optional] |
|**contextModuleId** | **Object** | The unique identifier of a associated context_module. |  [optional] |
|**lockVersion** | **Object** | Lock version of the module progression. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COMPLETED | &quot;completed&quot; |
| LOCKED | &quot;locked&quot; |
| STARTED | &quot;started&quot; |
| UNLOCKED | &quot;unlocked&quot; |



