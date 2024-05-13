

# ContentTags

Some of the ways to use this table would be to: identify the external tool that is used to submit an assignment, identify the items that are in modules (the IDs in this table are also referred to as `module_item_id`), identify the learning outcome group that an outcome is part of.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a content tag record. |  |
|**createdAt** | **Object** | Timestamp of when a &#x60;content_tags&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;content_tags&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the content tag. |  |
|**contextId** | **Object** | The unique identifier for the &#x60;content_tags&#x60; context (account, course, user). Depends on &#x60;context_type&#x60; value: &#x60;Course&#x60;: &#x60;courses.id&#x60;, &#x60;Assignment&#x60;: &#x60;assignments.id&#x60;. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60; or &#x60;Account&#x60; or &#x60;User&#x60;. |  |
|**contextCode** | **Object** | An asset string describing the content tag context (for example: &#x60;assignment_3&#x60;). |  [optional] |
|**comments** | [**ContentTagsComments**](ContentTagsComments.md) |  |  [optional] |
|**migrationId** | **Object** | The ID of the migration that created the content tag. |  [optional] |
|**contentId** | **Object** | Refers to the ID of the object that is linked to another object (&#x60;context_type&#x60;). |  |
|**tagType** | [**TagTypeEnum**](#TagTypeEnum) | Identifies the type of tag. |  |
|**contextModuleId** | **Object** | The ID of the context module the content tag belongs to (if &#x60;tag_type&#x60; is &#x60;context_module&#x60;). |  [optional] |
|**learningOutcomeId** | **Object** | Has a value if &#x60;tag_type&#x60; is &#x60;learning_outcome&#x60;, indicates that the content (&#x60;content_type&#x60;, &#x60;content_id&#x60;) is aligned with the given LearningOutcome. |  [optional] |
|**masteryScore** | **Object** | when &#x60;tag_type&#x60; is &#x60;learning_outcome&#x60; and &#x60;content_type&#x60; is &#x60;AssessmentQuestionBank&#x60;, indicates the required score on a set of bank questions to show mastery. |  [optional] |
|**rubricAssociationId** | **Object** | (deprecated) when &#x60;tag_type&#x60; is &#x60;learning_outcome&#x60; and &#x60;content_type&#x60; is &#x60;Assignment&#x60;, indicates the *RubricAssociation* which aligns the *LearningOutcome* to the *Assignment*. |  [optional] |
|**associatedAssetId** | **Object** | Associated asset, whose use varies by ContentTag use. When &#x60;tag_type&#x60; is &#x60;learning_outcome_association&#x60;, then &#x60;content_type&#x60; is &#x60;LearningOutcome&#x60; and &#x60;associated_asset_type&#x60; is &#x60;learning_outcome_group&#x60; and indicates the *LearningOutcome* (&#x60;content_id&#x60;) is displayed within the *LearningOutcomeGroup* (&#x60;associated_asset_id&#x60;). When &#x60;content_type&#x60; is &#x60;ContextExternalTool&#x60; and &#x60;associated_asset_type&#x60; is &#x60;Lti::ResourceLink&#x60;, indicates the resource link associated with an LTI tool link. |  [optional] |
|**associatedAssetType** | [**AssociatedAssetTypeEnum**](#AssociatedAssetTypeEnum) | when &#x60;tag_type&#x60; is &#x60;learning_outcome_association&#x60;, then &#x60;content_type&#x60; is &#x60;LearningOutcome&#x60; and &#x60;associated_asset_type&#x60; is &#x60;learning_outcome_group&#x60; and indicates the *LearningOutcome* (&#x60;content_id&#x60;) is displayed within the *LearningOutcomeGroup* (&#x60;associated_asset_id&#x60;). |  [optional] |
|**linkSettings** | [**ContentTagsLinkSettings**](ContentTagsLinkSettings.md) |  |  [optional] |
|**newTab** | **Object** | Whether or not the content should open in a new tab. |  [optional] |
|**position** | **Object** | The position of the content tag relative to other content tags when listed in a UI. |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | The type of the tag&#39;s content. Corresponds to the tables that &#x60;content_id&#x60; is a foreign key for, the exceptions being: &#x60;Announcement&#x60; (for which &#x60;content_id&#x60; references the &#x60;discussion_topics&#x60; table) and &#x60;ContextModuleSubheader&#x60; and &#x60;ExternalUrl&#x60; (which have no tables). |  [optional] |
|**url** | [**ContentTagsUrl**](ContentTagsUrl.md) |  |  [optional] |
|**title** | [**ContentTagsTitle**](ContentTagsTitle.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| COURSE | &quot;Course&quot; |
| LEARNINGOUTCOMEGROUP | &quot;LearningOutcomeGroup&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |
| USER | &quot;User&quot; |



## Enum: TagTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CONTEXT_MODULE | &quot;context_module&quot; |
| DEFAULT | &quot;default&quot; |
| LEARNING_OUTCOME | &quot;learning_outcome&quot; |
| LEARNING_OUTCOME_ASSOCIATION | &quot;learning_outcome_association&quot; |



## Enum: AssociatedAssetTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| LEARNINGOUTCOMEGROUP | &quot;LearningOutcomeGroup&quot; |
| LTI_RESOURCELINK | &quot;Lti::ResourceLink&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ANNOUNCEMENT | &quot;Announcement&quot; |
| ASSESSMENTQUESTIONBANK | &quot;AssessmentQuestionBank&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| CONTEXTEXTERNALTOOL | &quot;ContextExternalTool&quot; |
| CONTEXTMODULESUBHEADER | &quot;ContextModuleSubHeader&quot; |
| DISCUSSIONTOPIC | &quot;DiscussionTopic&quot; |
| EXTERNALURL | &quot;ExternalUrl&quot; |
| LEARNINGOUTCOME | &quot;LearningOutcome&quot; |
| LEARNINGOUTCOMEGROUP | &quot;LearningOutcomeGroup&quot; |
| LIVEASSESSMENTS_ASSESSMENT | &quot;LiveAssessments::Assessment&quot; |
| LTI_MESSAGEHANDLER | &quot;Lti::MessageHandler&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |
| RUBRIC | &quot;Rubric&quot; |
| WIKIPAGE | &quot;WikiPage&quot; |



