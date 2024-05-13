

# AssessmentQuestionBanks

Question Banks are a place to house questions that can be added to quizzes across courses or accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the question bank. |  |
|**deletedAt** | **Object** | The time the question bank was deleted. If the question bank has not been deleted the value will be NULL. |  [optional] |
|**createdAt** | **Object** | The time the question bank was created. |  |
|**updatedAt** | **Object** | The time the question bank was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the question bank. |  |
|**contextId** | **Object** | The unique identifier for the question bank&#39;s context (account or course). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of context the question bank is associated with. |  |
|**migrationId** | **Object** | The unique identifier of the migration that imported this question bank. |  [optional] |
|**title** | [**AssessmentQuestionBanksTitle**](AssessmentQuestionBanksTitle.md) |  |  [optional] |



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



