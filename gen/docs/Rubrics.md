

# Rubrics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a rubric record. |  |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a rubrics record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a rubrics record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of row. |  |
|**pointsPossible** | **Object** | Total points possible for the rubric. |  [optional] |
|**contextId** | **Object** | The unique identifier of a rubric&#39;s context (account, course). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**migrationId** | **Object** | An identifier used by the Blueprint system to match with the blueprint content. |  [optional] |
|**hideScoreTotal** | **Object** | Whether or not the score total is displayed within the rubric. This option is only available if the rubric is not used for grading. |  [optional] |
|**associationCount** | **Object** | The number of associated objects (accounts, courses, assignments). |  |
|**freeFormCriterionComments** | **Object** | Whether or not you can write custom comments in the ratings field for a rubric. |  [optional] |
|**title** | **Object** | The Rubric name or title. |  [optional] |
|**data** | **Object** | The data containing all the information for the rubric including each criterion. |  [optional] |



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



