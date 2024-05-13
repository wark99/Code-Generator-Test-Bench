

# OutcomeProficiencies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an outcome proficiency record. |  |
|**createdAt** | **Object** | Timestamp of when an &#x60;outcome_proficiencies&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when an &#x60;outcome_proficiencies&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow status of the outcome_proficiency. Defaults to &#x60;active&#x60;. |  |
|**contextId** | **Object** | The unique identifier for the context (account or course) of the outcome proficiency. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |



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



