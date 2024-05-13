

# RubricAssociations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a rubric association record. |  |
|**purpose** | **Object** | Whether or not the association is for grading (and thus linked to an assignment) or if it&#39;s to indicate the rubric should appear in its context. Values will be grading or bookmark. |  |
|**createdAt** | **Object** | Timestamp showing when a &#x60;rubric_associations&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a &#x60;rubric_associations&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The current state of a rubric association record. |  |
|**contextId** | **Object** | The unique identifier for the context of &#x60;rubric_associations&#x60; (account, course). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;. |  |
|**associationId** | **Object** | The unique identifier of an associated object. |  |
|**associationType** | [**AssociationTypeEnum**](#AssociationTypeEnum) | The type of object associated. |  |
|**hidePoints** | **Object** | Flag indication whether to hide points from rubric. |  |
|**rubricId** | **Object** | The unique identifier of a rubric tied to this association. |  |
|**useForGrading** | **Object** | Whether or not the associated rubric is used for grade calculation. |  [optional] |
|**summaryData** | **Object** | Object that stores reusable comments made during assessments. |  [optional] |
|**hideScoreTotal** | **Object** | Flag indicating whether to hide the score total for assessment results. |  [optional] |
|**bookmarked** | **Object** | Flag indication whether rubric is bookmarked. |  |
|**hideOutcomeResults** | **Object** | Flag indicating to not post Outcomes results to Learning Mastery Gradebook. |  |
|**title** | **Object** | The name of the object this rubric is associated with. |  [optional] |



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
| COURSE | &quot;Course&quot; |
| ACCOUNT | &quot;Account&quot; |



## Enum: AssociationTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |



