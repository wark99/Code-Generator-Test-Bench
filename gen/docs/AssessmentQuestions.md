

# AssessmentQuestions

The column `question_data` stores a variety of question data related points such as:     * `question_type` denotes the type of the question. Possible values are:             - `calculated_question`             - `essay_question`             - `file_upload_question`             - `fill_in_multiple_blanks_question`             - `matching_question`             - `multiple_answers_question`             - `multiple_choice_question`             - `multiple_dropdowns_question`             - `numerical_question`,             - `short_answer_question`             - `text_only_question`             - `true_false_question`     * `question_text` is the text of the question.     * `regrade_option` denotes if regrading is available for the question. Possible values are: `available`       and `unavailable` for question types `multiple_answers_question`, `multiple_choice_question`,       `true_false_question`, and NULL for others. Defaults to `available` for the allowed question types, and NULL       for the rest.     * `correct_comments` are comments to be displayed if the student answers the question correctly.     * `incorrect_comments` are comments to be displayed if the student answers the question incorrectly.     * `neutral_comments` are comments to be displayed regardless of how the student answers the question.     * `answers` is a JSON array of all possible answers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the Assessment Question. |  |
|**name** | [**AssessmentQuestionsName**](AssessmentQuestionsName.md) |  |  [optional] |
|**deletedAt** | **Object** | The time the question was deleted. If the question has not been deleted the value will be NULL. |  [optional] |
|**createdAt** | **Object** | Time when the quiz question was created. |  [optional] |
|**updatedAt** | **Object** | Time when the quiz question was last updated. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the quiz question. |  [optional] |
|**contextId** | **Object** | The unique identifier for the question bank&#39;s context (account or course). No longer used as Canvas delegates to &#x60;context_id&#x60; of the associated AssessmentQuestion. |  [optional] |
|**contextType** | **Object** | The type of context the question bank is associated with. No longer used as Canvas delegates to the context of the associated AssessmentQuestion. |  [optional] |
|**questionData** | **Object** | A variety of question data related points. |  [optional] |
|**assessmentQuestionBankId** | **Object** | The unique identifier for the assessment question bank this question is associated with. |  [optional] |
|**migrationId** | **Object** | The unique identifier of the migration that imported this assessment question. |  [optional] |
|**position** | **Object** | The position of the question. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| INDEPENDENTLY_EDITED | &quot;independently_edited&quot; |
| DELETED | &quot;deleted&quot; |



