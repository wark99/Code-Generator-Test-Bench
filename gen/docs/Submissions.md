

# Submissions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | Primary key of this record in the Canvas submissions dataset. |  |
|**attachmentId** | **Object** | The ID of an attachment belonging to this submission if &#x60;submission_type&#x60; is &#x60;online_url&#x60;. Generally superseded by &#x60;attachment_ids&#x60;. |  [optional] |
|**courseId** | **Object** | The ID of the associated assignment&#39;s course. |  |
|**userId** | **Object** | The ID of the user who created the submission. |  |
|**createdAt** | **Object** | Timestamp of when the submission was created. |  [optional] |
|**updatedAt** | **Object** | Timestamp of when the submission was last updated. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the submission. |  |
|**assignmentId** | **Object** | The ID of the associated assignment. |  |
|**mediaCommentId** | **Object** | For media comments, the ID of the media object associated with this comment, as a string. |  [optional] |
|**mediaCommentType** | [**MediaCommentTypeEnum**](#MediaCommentTypeEnum) | For media comments, the type of the media object associated with this comment. |  [optional] |
|**attachmentIds** | [**SubmissionsAttachmentIds**](SubmissionsAttachmentIds.md) |  |  [optional] |
|**postedAt** | **Object** | The date this submission was posted to the student, or NULL if it has not been posted. |  [optional] |
|**groupId** | **Object** | Foreign key to the &#x60;groups&#x60; table. |  [optional] |
|**score** | **Object** | The raw score. |  [optional] |
|**attempt** | **Object** | The number of attempts made including this one. |  [optional] |
|**submittedAt** | **Object** | The timestamp when the assignment was submitted. Note: this date may be missing even though the assignment was submitted and graded (example scenarios: paper assignments, submissions through external tools, no submission required, etc.); additionally, if the student failed to submit an assignment by the due date, the assignment can be graded by the instructor (and will be missing a &#x60;submitted_at&#x60; date). |  [optional] |
|**quizSubmissionId** | **Object** | Foreign key to the &#x60;quiz_submissions&#x60; dataset (if &#x60;submission_type&#x60; is &#x60;online_quiz&#x60;). If this field contains a value it means that the assignment is a quiz. |  [optional] |
|**extraAttempts** | **Object** | Extra submission attempts allowed for the given user and assignment. |  [optional] |
|**gradingPeriodId** | **Object** | The ID of the grading period that this submission&#39;s assignment belongs to. |  [optional] |
|**grade** | **Object** | Letter grade mapped from the score by the grading scheme. |  [optional] |
|**submissionType** | [**SubmissionTypeEnum**](#SubmissionTypeEnum) | The type of submission. |  [optional] |
|**processed** | **Object** | Valid only when there is a file/attachment associated with the submission. By default, this attribute is set to *false* when making the assignment submission. When a submission has a file/attachment associated with it, upon submitting the assignment a snapshot is saved and its value is set to *true*. Defaults to NULL. |  [optional] |
|**gradeMatchesCurrentSubmission** | **Object** | A boolean flag which is false if the student has re-submitted since the submission was last graded. Valid only when a score has been assigned to a submission. This is set to *false* if a student makes a new submission to an already graded assignment. This is done to indicate that the current grade given by the teacher is not for the most recent submission by the student. It is set to *true* if a score has been given and there is no new submission. Defaults to NULL. |  [optional] |
|**publishedScore** | **Object** | The raw score (identical to score). |  [optional] |
|**publishedGrade** | **Object** | Valid only for a graded submission. The values are strings that reflect the grading type used. For example, a scoring method of &#x60;points&#x60; will show &#x60;4&#x60; if given a &#x60;4&#x60; out of &#x60;5&#x60;, and a scoring method of &#x60;letter grade&#x60; will show &#x60;B&#x60; for the same score (assuming a grading scale where 80-90% is a &#x60;B&#x60;). Defaults to NULL. |  [optional] |
|**gradedAt** | **Object** | Timestamp of when the submission was graded. |  [optional] |
|**studentEnteredScore** | **Object** | A \&quot;what-if\&quot; score that the student has entered for this submission. |  [optional] |
|**graderId** | **Object** | The ID of the user who graded the submission. This will be NULL for submissions that haven&#39;t been graded yet. It will be a positive number if a real user has graded the submission and a negative number if the submission was graded by a process (e.g. Quiz auto-grader and auto-grading LTI tools). Specifically auto-graded quizzes set &#x60;grader_id&#x60; to the negative of the quiz ID. Submissions auto-graded by LTI tools set &#x60;grader_id&#x60; to the negative of the tool ID. |  [optional] |
|**submissionCommentsCount** | **Object** | A count of the number of comments made on this submission. |  [optional] |
|**mediaObjectId** | **Object** | The ID of the associated MediaObject. |  [optional] |
|**turnitinData** | **Object** | A YAML string representing plagiarism data associated with this submission. |  [optional] |
|**cachedDueDate** | **Object** | The de-normalized cached due date for this submission. |  [optional] |
|**excused** | **Object** | Whether the assignment is excused. Excused assignments have no impact on a user&#39;s grade. |  [optional] |
|**gradedAnonymously** | **Object** | Denotes how the grading has been performed. Possible values are &#x60;graded_anonymously&#x60; and &#x60;not_graded_anonymously&#x60;. |  [optional] |
|**latePolicyStatus** | **Object** | The status of the submission in relation to the late policy. Only reflects statuses manually applied by a grader. Can be late, missing, none, or NULL. |  [optional] |
|**pointsDeducted** | **Object** | The amount of points automatically deducted from the score by the missing/late policy for a late or missing assignment. |  [optional] |
|**secondsLateOverride** | **Object** | For late submissions, the amount of time (in seconds) the submission is late by. |  [optional] |
|**ltiUserId** | [**SubmissionsLtiUserId**](SubmissionsLtiUserId.md) |  |  [optional] |
|**anonymousId** | **Object** | A unique short ID identifying this submission without reference to the owning user. |  [optional] |
|**lastCommentAt** | **Object** | The date of the last non-draft comment on this submission by a user other than the submitter. |  [optional] |
|**cachedQuizLti** | **Object** | True if the associated assignment is a Quizzes.Next assignment. |  |
|**cachedTardiness** | **Object** | The status of the submission in relation to the late policy, including automatically- applied statuses. Can be &#x60;late&#x60;, &#x60;missing&#x60; or NULL. |  [optional] |
|**resourceLinkLookupUuid** | **Object** | When the submission is from an LTI tool, the resource link lookup ID is assigned to the submission in order to recover the custom parameters. |  [optional] |
|**redoRequest** | **Object** | True if the assignment has been reassigned to the student for resubmission. |  |
|**body** | [**SubmissionsBody**](SubmissionsBody.md) |  |  [optional] |
|**url** | **Object** | URL content for the submission. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| GRADED | &quot;graded&quot; |
| PENDING_REVIEW | &quot;pending_review&quot; |
| SUBMITTED | &quot;submitted&quot; |
| UNSUBMITTED | &quot;unsubmitted&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: MediaCommentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| AUDIO | &quot;audio&quot; |
| AUDIO_ | &quot;audio/_*&quot; |
| VIDEO | &quot;video&quot; |
| VIDEO_ | &quot;video/_*&quot; |



## Enum: SubmissionTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| BASIC_LTI_LAUNCH | &quot;basic_lti_launch&quot; |
| DISCUSSION_TOPIC | &quot;discussion_topic&quot; |
| EXTERNAL_TOOL | &quot;external_tool&quot; |
| MEDIA_RECORDING | &quot;media_recording&quot; |
| ONLINE_FILE_UPLOAD | &quot;online_file_upload&quot; |
| ONLINE_QUIZ | &quot;online_quiz&quot; |
| ONLINE_TEXT_ENTRY | &quot;online_text_entry&quot; |
| ONLINE_UPLOAD | &quot;online_upload&quot; |
| ONLINE_URL | &quot;online_url&quot; |
| STUDENT_ANNOTATION | &quot;student_annotation&quot; |



