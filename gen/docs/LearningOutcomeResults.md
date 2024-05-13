

# LearningOutcomeResults

This table contains dimensions for learning outcome results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a learning outcome result record. |  |
|**userId** | **Object** | The unique ID of a user who made the submission. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a learning_outcome_results record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a learning_outcome_results record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The current state of a learning outcome result record. |  |
|**contextId** | **Object** | The unique identifier for the learning_outcome_results&#39;s context (account, course, user). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60; or &#x60;Account&#x60; or &#x60;User&#x60;. |  [optional] |
|**contextCode** | **Object** | Alternate specification of learning outcome result context as single string. |  [optional] |
|**learningOutcomeId** | **Object** | Identifies the learning outcome this result is associated with. |  [optional] |
|**associatedAssetId** | **Object** | Polymorphic foreign key to the associated asset this result is associated with. |  [optional] |
|**associatedAssetType** | [**AssociatedAssetTypeEnum**](#AssociatedAssetTypeEnum) | Type of the associated asset this result is associated with. |  [optional] |
|**score** | **Object** | The student&#39;s score. |  [optional] |
|**possible** | **Object** | Total number of points possible. |  [optional] |
|**mastery** | **Object** | Boolean indicating whether user achieved mastery. |  [optional] |
|**attempt** | **Object** | The total number of attempts, or submissions. |  [optional] |
|**originalScore** | **Object** | Score on the first attempt. |  [optional] |
|**originalPossible** | **Object** | Possible points on the first attempt. |  [optional] |
|**originalMastery** | **Object** | Boolean indicating whether user achieved mastery. |  [optional] |
|**assessedAt** | **Object** | Time when the result was assessed. |  [optional] |
|**submittedAt** | **Object** | Time when the submission was submitted. |  [optional] |
|**associationId** | **Object** | Polymorphic foreign key to the aligned learning object this result is associated with. |  [optional] |
|**associationType** | [**AssociationTypeEnum**](#AssociationTypeEnum) | Type of the aligned learning object this result is associated with. |  [optional] |
|**contentTagId** | **Object** | Foreign key to the content tag representing the learning outcome alignment this result is associated with. |  [optional] |
|**userUuid** | **Object** | The uuid of the user who made the submission. |  [optional] |
|**artifactId** | **Object** | Polymorphic foreign key to the assessed artifact this result is associated with. |  [optional] |
|**artifactType** | [**ArtifactTypeEnum**](#ArtifactTypeEnum) | Type of the assessed artifact this result is associated with. |  [optional] |
|**hidePoints** | **Object** | Boolean indicating if outcome result points should be hidden in the Learning Mastery Gradebook and reports. If enabled, replace points with the description of the highest scoring outcome criterion rating. |  |
|**hidden** | **Object** | Boolean indicating if outcome result should be hidden from the Learning Mastery Gradebook and reports. |  |
|**percent** | **Object** | Percent of maximum points possible for an outcome, scaled to reflect any custom mastery levels that differ from the learning outcome. |  [optional] |
|**title** | **Object** | Title for identifying the result. |  [optional] |



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



## Enum: AssociatedAssetTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ASSESSMENTQUESTION | &quot;AssessmentQuestion&quot; |
| LIVEASSESSMENTS_ASSESSMENT | &quot;LiveAssessments::Assessment&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |



## Enum: AssociationTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |
| RUBRICASSOCIATION | &quot;RubricAssociation&quot; |



## Enum: ArtifactTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| LIVEASSESSMENTS_SUBMISSION | &quot;LiveAssessments::Submission&quot; |
| QUIZZES_QUIZSUBMISSION | &quot;Quizzes::QuizSubmission&quot; |
| RUBRICASSESSMENT | &quot;RubricAssessment&quot; |
| SUBMISSION | &quot;Submission&quot; |



