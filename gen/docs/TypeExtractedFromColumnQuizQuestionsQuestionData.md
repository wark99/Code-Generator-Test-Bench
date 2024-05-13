

# TypeExtractedFromColumnQuizQuestionsQuestionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**neutralComments** | **Object** | Comments to be displayed regardless of how the student answers the question. |  [optional] |
|**answers** | **Object** | Collection of possible answers. |  [optional] |
|**name** | **Object** | Name of the question. |  [optional] |
|**questionType** | **Object** | Denotes the type of the question. |  [optional] |
|**questionText** | **Object** | Text of the question. |  [optional] |
|**regradeOption** | [**RegradeOptionEnum**](#RegradeOptionEnum) | Denotes if regrading is available for the question. Possible values are &#x60;available&#x60; and &#x60;unavailable&#x60; for question types. Defaults to &#x60;available&#x60; for the allowed question types and NULL for the rest. |  [optional] |
|**correctComments** | **Object** | Comments to be displayed if the student answers the question correctly. |  [optional] |
|**incorrectComments** | **Object** | Comments to be displayed if the student answers the question incorrectly neutral_comments: Comments to be displayed regardless of how the student answers the question. |  [optional] |
|**textAfterAnswers** | **Object** | (Used in *short_answer_question*, also known as *fill_in_the_blank*. Omitted for other question types) Text following the missing word. |  [optional] |
|**matchingAnswerIncorrectMatches** | **Object** | (Used in *matching_question*. Omitted for other question types) List of distractors (incorrect answers), delimited by new lines, that will be seeded with all the *answer_match_right* values. |  [optional] |
|**pointsPossible** | **Object** | Maximum number of points that can be awarded for answering the question correctly. |  [optional] |



## Enum: RegradeOptionEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| AVAILABLE | &quot;available&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |
| MULTIPLE_ANSWERS_QUESTION | &quot;multiple_answers_question&quot; |
| MULTIPLE_CHOICE_QUESTION | &quot;multiple_choice_question&quot; |
| TRUE_FALSE_QUESTION | &quot;true_false_question&quot; |
| CURRENT_AND_PREVIOUS_CORRECT | &quot;current_and_previous_correct&quot; |
| NO_REGRADE | &quot;no_regrade&quot; |
| CURRENT_CORRECT_ONLY | &quot;current_correct_only&quot; |
| FULL_CREDIT | &quot;full_credit&quot; |
| DISABLED | &quot;disabled&quot; |



