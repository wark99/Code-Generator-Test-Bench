

# QuizSubmissions

This tables persists one record per `user_id` and `quiz_id`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the quiz submission. |  |
|**submissionId** | **Object** | The ID of the Submission the quiz submission represents. |  [optional] |
|**userId** | **Object** | The ID of the Student that made the quiz submission. |  [optional] |
|**createdAt** | **Object** | Time when the quiz submission was created. |  |
|**updatedAt** | **Object** | Time when the quiz submission was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the quiz submission. |  |
|**quizId** | **Object** | The ID of the Quiz the quiz submission belongs to. |  |
|**quizVersion** | **Object** | The version of the quiz this submission is related to. |  [optional] |
|**startedAt** | **Object** | The time at which the student started the quiz submission. |  [optional] |
|**finishedAt** | **Object** | The time at which the student submitted the quiz submission. |  [optional] |
|**endAt** | **Object** | The time at which the quiz submission will be overdue, and be flagged as a late submission. |  [optional] |
|**score** | **Object** | The score of the quiz submission, if graded. |  [optional] |
|**attempt** | **Object** | For quizzes that allow multiple attempts, this field specifies the quiz submission attempt number. |  [optional] |
|**submissionData** | **Object** | Student answers to quiz, it shares JSON array of answers for only graded quiz submissions, it has NULL if quiz hasn&#39;t been graded yet. Contains the &#x60;question_id&#x60;, whether the question was answered correctly, the &#x60;answer_id&#x60; and answer text. |  [optional] |
|**keptScore** | **Object** | For quizzes that allow multiple attempts, this is the score that will be used, which might be the score of the latest, or the highest, quiz submission. |  [optional] |
|**fudgePoints** | **Object** | Number of points the quiz submissions score was fudged by. |  |
|**quizPointsPossible** | **Object** | The amount of points possible for the quiz. |  [optional] |
|**extraAttempts** | **Object** | Number of times the student was allowed to retake the quiz over the multiple-attempt limit. |  [optional] |
|**temporaryUserCode** | **Object** | Construct for previewing a quiz. |  [optional] |
|**extraTime** | **Object** | Amount of extra time allowed for the quiz submission, in minutes. |  [optional] |
|**manuallyScored** | **Object** | Indicates if this submission was graded by the teacher. |  [optional] |
|**manuallyUnlocked** | **Object** | The student can take the quiz even if it&#39;s locked for everyone else. |  [optional] |
|**wasPreview** | **Object** | Indicates if this submission was created from a teacher preview. |  [optional] |
|**scoreBeforeRegrade** | **Object** | The original score of the quiz submission prior to any re-grading. |  [optional] |
|**hasSeenResults** | **Object** | Whether the student has viewed their results to the quiz. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COMPLETE | &quot;complete&quot; |
| PENDING_REVIEW | &quot;pending_review&quot; |
| PREVIEW | &quot;preview&quot; |
| SETTINGS_ONLY | &quot;settings_only&quot; |
| UNTAKEN | &quot;untaken&quot; |



