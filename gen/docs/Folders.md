

# Folders


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a folder record. |  |
|**name** | **Object** | Name of the folder. |  [optional] |
|**fullName** | [**FoldersFullName**](FoldersFullName.md) |  |  [optional] |
|**deletedAt** | **Object** | Timestamp when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a folders record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a folders record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | In this context the workflow state indicates the visibility of the folder. |  |
|**unlockAt** | **Object** | Indicates the date at which this folder should become accessible. |  [optional] |
|**lockAt** | **Object** | Indicates the date at which this folder should no longer be accessible. |  [optional] |
|**contextId** | **Object** | The unique identifier for the folders&#39;s context (account, course, user). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**locked** | **Object** | Indicates if the folder is currently accessible [NULL&#x3D;false]. |  [optional] |
|**clonedItemId** | **Object** | Unique identifier of the folder that this folder was cloned from. |  [optional] |
|**submissionContextCode** | **Object** | A value indicating the context to which this folder should be submitted if it is for a submission. |  [optional] |
|**parentFolderId** | **Object** | Id of the parent folder. |  [optional] |
|**uniqueType** | [**UniqueTypeEnum**](#UniqueTypeEnum) | Value indicating what kind of files are stored in this folder. NULL is the most common value, meaning this is a standard folder. &#x60;media&#x60; is a special case where media files are stored. |  [optional] |
|**position** | **Object** | An integer value used for sorting the order in which the folder is listed. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| HIDDEN | &quot;hidden&quot; |
| PRIVATE | &quot;private&quot; |
| VISIBLE | &quot;visible&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |
| USER | &quot;User&quot; |



## Enum: UniqueTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| MEDIA | &quot;media&quot; |
| STUDENT_ANNOTATION_DOCUMENTS | &quot;student annotation documents&quot; |
| ICON_MAKER_ICONS | &quot;icon maker icons&quot; |
| BUTTONS_AND_ICONS | &quot;buttons and icons&quot; |



