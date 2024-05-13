

# Quizzes

Quizzes can also be assignments (`assignment_id` field will have a value).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | the ID of the quiz. |  |
|**deletedAt** | **Object** | Timestamp when the quiz was deleted. |  [optional] |
|**createdAt** | **Object** | Time when the quiz was created. |  |
|**updatedAt** | **Object** | Time when the quiz was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Denotes where the quiz is in the workflow. Possible values are &#x60;unpublished&#x60;, &#x60;published&#x60; and &#x60;deleted&#x60;. Defaults to &#x60;unpublished&#x60;. |  |
|**dueAt** | **Object** | when the quiz is due. |  [optional] |
|**unlockAt** | **Object** | when to unlock the quiz. |  [optional] |
|**lockAt** | **Object** | when to lock the quiz. |  [optional] |
|**pointsPossible** | **Object** | The total point value given to the quiz. |  [optional] |
|**assignmentGroupId** | **Object** | the ID of the quizzes assignment group:. |  [optional] |
|**contextId** | **Object** | The ID of the context (account or course) this group belongs too. See also: context_type. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the context object (typically &#x60;Course&#x60;). |  |
|**assignmentId** | **Object** | Identifies the assignment the quiz belongs to (NULL if not an assignment). |  [optional] |
|**couldBeLocked** | **Object** | Dictates if the quiz can be locked or not. Possible values are &#x60;allow_locking&#x60; and &#x60;disallow_locking&#x60;. Defaults to &#x60;disallow_locking&#x60;. |  |
|**migrationId** | **Object** | The unique identifier of the migration that imported the quiz. |  [optional] |
|**onlyVisibleToOverrides** | **Object** | This indicates the quiz is not visible to everyone in the course, but only to those with an override. |  |
|**allowedAttempts** | **Object** | how many times a student can take the quiz -1 &#x3D; unlimited attempts. |  [optional] |
|**publishedAt** | **Object** | whether the quiz has a published or unpublished draft state. |  [optional] |
|**shuffleAnswers** | **Object** | shuffle answers for students. |  |
|**showCorrectAnswers** | **Object** | show which answers were correct when results are shown? only valid if &#x60;hide_results&#x60; is NULL. |  |
|**timeLimit** | **Object** | quiz time limit in minutes. |  [optional] |
|**scoringPolicy** | **Object** | which quiz score to keep (only if &#x60;allowed_attempts&#x60; !&#x3D; 1) possible values: &#x60;keep_highest&#x60;, &#x60;keep_latest&#x60;. |  [optional] |
|**quizType** | [**QuizTypeEnum**](#QuizTypeEnum) | type of quiz. |  [optional] |
|**accessCode** | **Object** | access code to restrict quiz access. |  [optional] |
|**questionCount** | **Object** | the number of questions in the quiz. |  [optional] |
|**anonymousSubmissions** | **Object** | Dictates whether students are allowed to submit the quiz anonymously. |  |
|**hideResults** | **Object** | let students see their quiz responses? possible values: NULL, &#x60;always&#x60;, &#x60;until_after_last_attempt&#x60;. |  [optional] |
|**ipFilter** | **Object** | IP address or range that quiz access is limited to. |  [optional] |
|**requireLockdownBrowser** | **Object** | Dictates whether the browser has locked-down when the quiz is being taken. Possible values are &#x60;required&#x60; and &#x60;not_required&#x60;. Defaults to &#x60;not_required&#x60;. |  |
|**requireLockdownBrowserForResults** | **Object** | Dictates whether the browser has to be locked-down to display the results. Is valid only if &#x60;hide_results&#x60; is set to &#x60;never&#x60; or &#x60;until_after_last_attempt&#x60; (for the results to be displayed after the last attempt). Possible values are &#x60;required&#x60; and &#x60;not_required&#x60;. Defaults to &#x60;not_required&#x60;. |  |
|**oneQuestionAtATime** | **Object** | show one question at a time? |  |
|**cantGoBack** | **Object** | lock questions after answering? only valid if one_question_at_a_time&#x3D;true. |  |
|**showCorrectAnswersAt** | **Object** | when should the correct answers be visible by students? only valid if show_correct_answers&#x3D;true. |  [optional] |
|**hideCorrectAnswersAt** | **Object** | prevent the students from seeing correct answers after the specified date has passed. only valid if show_correct_answers&#x3D;true. |  [optional] |
|**requireLockdownBrowserMonitor** | **Object** | Dictates whether a browser lockdown monitor is required. Possible values are &#x60;required&#x60; and &#x60;not_required&#x60;. Defaults to &#x60;not_required&#x60;. |  |
|**oneTimeResults** | **Object** | prevent the students from seeing their results more than once (right after they submit the quiz). |  |
|**showCorrectAnswersLastAttempt** | **Object** | restrict the show_correct_answers option above to apply only to the last submitted attempt of a quiz that allows multiple attempts. only valid if show_correct_answers&#x3D;true and &#x60;allowed_attempts&#x60; &gt; 1. |  |
|**unpublishedQuestionCount** | **Object** | The number of questions that have not been published. |  |
|**description** | [**QuizzesDescription**](QuizzesDescription.md) |  |  [optional] |
|**title** | **Object** | the title of the quiz. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CREATED | &quot;created&quot; |
| EDITED | &quot;edited&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |
| DELETED | &quot;deleted&quot; |
| AVAILABLE | &quot;available&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



## Enum: QuizTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ASSIGNMENT | &quot;assignment&quot; |
| PRACTICE_QUIZ | &quot;practice_quiz&quot; |
| GRADED_SURVEY | &quot;graded_survey&quot; |
| SURVEY | &quot;survey&quot; |



