

# ContextModules

A place to link items so that students can proceed through course content in order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a module record. |  |
|**name** | [**ContextModulesName**](ContextModulesName.md) |  |  [optional] |
|**deletedAt** | **Object** | Timestamp showing when this record was deleted. If the record has not been deleted, the value will be NULL. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a &#x60;context_modules&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a &#x60;context_modules&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the record. |  |
|**unlockAt** | **Object** | Module can be locked until this date. |  [optional] |
|**contextId** | **Object** | The unique identifier for the context of &#x60;context_modules&#x60; (&#x60;courses&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Course&#x60;). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**migrationId** | **Object** | An identifier used by the Blueprint system to match with the blueprint content. |  [optional] |
|**prerequisites** | **Object** | An object indicating which module(s) must be completed before accessing this one. Has value if course module has prerequisites; field contains ids (context_modules.id), type and name of prerequisites. |  [optional] |
|**completionRequirements** | **Object** | An object indicating the requirements to complete this module. Contains ids and types (the action required). Requirements can be \&quot;must_mark_done\&quot; , \&quot;must_view\&quot;, or \&quot;must_contribute\&quot;. |  [optional] |
|**requireSequentialProgress** | **Object** | Indicates whether requirements must be completed in sequential order. |  [optional] |
|**completionEvents** | [**ContextModulesCompletionEvents**](ContextModulesCompletionEvents.md) |  |  [optional] |
|**requirementCount** | **Object** | The number of requirements to be completed before marking module as complete: can be 1 or NULL for all. |  [optional] |
|**position** | **Object** | Where the module should fall in the list of modules. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



