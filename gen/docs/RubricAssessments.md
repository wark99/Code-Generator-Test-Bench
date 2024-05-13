

# RubricAssessments


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a rubric assessment record. |  |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a &#x60;rubric_assessment&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a &#x60;rubric_assessment&#x60; record was updated. |  |
|**rubricAssociationId** | **Object** | The ID of a rubric association (which links the rubric to an assignment that uses the rubric). |  [optional] |
|**artifactId** | **Object** | The submission or assignment identifier. |  |
|**artifactType** | [**ArtifactTypeEnum**](#ArtifactTypeEnum) | The artifact type. |  |
|**hidePoints** | **Object** | Flag indicating a non-scoring rubric assessment. |  |
|**score** | **Object** | Score of the assessment. |  [optional] |
|**rubricId** | **Object** | The unique ID of a rubric. |  |
|**assessmentType** | [**AssessmentTypeEnum**](#AssessmentTypeEnum) | Type of assessment. |  |
|**assessorId** | **Object** | The unique ID of a user who assessed the submission. |  [optional] |
|**artifactAttempt** | **Object** | The current number of attempts made on the object of the assessment. |  [optional] |
|**data** | **Object** | Object containing all data related to assessment including score-break down and comments for each criterion. |  [optional] |



## Enum: ArtifactTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| SUBMISSION | &quot;Submission&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| MODERATEDGRADING_PROVISIONALGRADE | &quot;ModeratedGrading::ProvisionalGrade&quot; |



## Enum: AssessmentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| GRADING | &quot;grading&quot; |
| INVITED_ASSESSMENT | &quot;invited_assessment&quot; |
| PEER_REVIEW | &quot;peer_review&quot; |



