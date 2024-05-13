

# DiscussionTopics

Discussion topics are logical discussion threads. They can have many discussion entries. They also have their own message text for the message that started the topic.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of this topic. |  |
|**message** | [**DiscussionTopicsMessage**](DiscussionTopicsMessage.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Discussion topic type. Two types are default (blank) and Announcement. |  [optional] |
|**attachmentId** | **Object** | Has a value if the discussion topic is associated with an attachment (file). |  [optional] |
|**deletedAt** | **Object** | Timestamp when the discussion topic was deleted. |  [optional] |
|**userId** | **Object** | The username of the topic creator. |  [optional] |
|**createdAt** | **Object** | The date the discussion topic was made. |  |
|**updatedAt** | **Object** | The date the discussion topic was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the discussion topic. |  |
|**lockAt** | **Object** | The datetime to lock the topic (if ever). |  [optional] |
|**contextId** | **Object** | The ID of the context that this discussion is used in, e.g. &#x60;courses&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Course&#x60;. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of context this discussion is used with. |  |
|**locked** | **Object** | Whether or not the discussion is *closed for comments*. |  |
|**assignmentId** | **Object** | The unique identifier of the assignment if the topic is for grading, otherwise NULL. |  [optional] |
|**migrationId** | **Object** | The unique identifier of the migration that imported this discussion topic. |  [optional] |
|**groupCategoryId** | **Object** | The unique identifier of the group category if the topic is a group discussion, otherwise NULL. |  [optional] |
|**clonedItemId** | **Object** | The ID of the item in which this discussion topic was cloned from. |  [optional] |
|**lastReplyAt** | **Object** | The datetime for when the last reply was in the topic. |  [optional] |
|**delayedPostAt** | **Object** | The datetime to publish the topic (if not right away). |  [optional] |
|**postedAt** | **Object** | The datetime the topic was posted. If it is NULL it hasn&#39;t been posted yet. |  [optional] |
|**rootTopicId** | **Object** | If the topic is for grading and a group assignment this will point to the original topic in the course. |  [optional] |
|**oldAssignmentId** | **Object** | the assignment ID after you change a topic from graded to ungraded, then restores the old one if it goes back to graded. |  [optional] |
|**subtopicsRefreshedAt** | **Object** | The time at which the subtopics for a group category discussion was refreshed at. |  [optional] |
|**externalFeedId** | **Object** | The ID of the external feed that this discussion topic was created from. |  [optional] |
|**podcastEnabled** | **Object** | Boolean to determine if the podcast is enabled. |  |
|**podcastHasStudentPosts** | **Object** | If true, the podcast will include posts from students as well. Implies podcast_enabled. |  |
|**requireInitialPost** | **Object** | If true then a user may not respond to other replies until that user has made an initial reply. |  |
|**editorId** | **Object** | The ID of the editor of the discussion. |  [optional] |
|**discussionType** | [**DiscussionTypeEnum**](#DiscussionTypeEnum) | The type of discussion. |  [optional] |
|**pinned** | **Object** | Whether or not the discussion has been *pinned* by an instructor. |  |
|**allowRating** | **Object** | Whether or not users can rate entries in this topic. |  |
|**onlyGradersCanRate** | **Object** | Whether or not grade permissions are required to rate entries. |  |
|**sortByRating** | **Object** | Whether or not entries should be sorted by rating. |  |
|**todoDate** | **Object** | Date in which discussion topic will show up in the student planner feature. |  [optional] |
|**isSectionSpecific** | **Object** | Boolean distinguishing if the topic is a section specific topic or not. |  |
|**position** | **Object** | The position on the discussions index page under pinned items. |  [optional] |
|**title** | **Object** | The topic title. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ANNOUNCEMENT | &quot;Announcement&quot; |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| LOCKED | &quot;locked&quot; |
| POST_DELAYED | &quot;post_delayed&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |



## Enum: DiscussionTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| SIDE_COMMENT | &quot;side_comment&quot; |
| THREADED | &quot;threaded&quot; |



