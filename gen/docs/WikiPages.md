

# WikiPages

Also known as Pages. Pages store content and educational resources that are part of a course or group but don't necessarily belong in an assignment. Pages can include text, video, and links to files and other course or group content. Pages can also be linked to other pages. They can also be used as a collaboration tool for course or group wikis where only specific users can have access. Canvas keeps the entire history of the page to account for changes over time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a wiki page record. |  |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a &#x60;wiki_pages&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a &#x60;wiki_pages&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The state of a wiki page. |  |
|**contextId** | **Object** | The unique identifier for the context of &#x60;wiki_pages&#x60; (account, course, user). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;. |  |
|**assignmentId** | **Object** | Assignment identifier when using &#x60;wiki_page&#x60; assignment type for an assignment. |  [optional] |
|**migrationId** | **Object** | An identifier used by the Blueprint system to match with the blueprint content. |  [optional] |
|**wikiId** | **Object** | The unique identifier of an associated wiki record. |  |
|**oldAssignmentId** | **Object** | An old assignment identifier. |  [optional] |
|**todoDate** | **Object** | Date to set when setting this page as student to-do. |  [optional] |
|**editingRoles** | **Object** | CSV list of the roles that are allowed to edit this page. Possible values are &#x60;teachers&#x60;, &#x60;students&#x60;, &#x60;public&#x60;. |  [optional] |
|**revisedAt** | **Object** | Timestamp showing when page was last revised. |  [optional] |
|**body** | [**WikiPagesBody**](WikiPagesBody.md) |  |  [optional] |
|**url** | [**WikiPagesUrl**](WikiPagesUrl.md) |  |  [optional] |
|**title** | **Object** | The name of the wiki page record. |  [optional] |
|**protectedEditing** | **Object** | Editing protection for the wiki page. It is false by default. |  |
|**couldBeLocked** | **Object** | True if the wiki page can be locked. This prevents it from being visible to others until ready. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| POST_DELAYED | &quot;post_delayed&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |



