

# Directory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Directory&#x60; |  |
|**name** | **String** | File name |  |
|**sortedName** | **String** | Specific sortable name |  [optional] |
|**path** | **String** | Full path of the Directory |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of returned element either a dir (Directory) or file (File) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current state of Directory. The state can be null meaning that the Directory has no specific state.&lt;note&gt;&lt;strong&gt;erasing&lt;/strong&gt;: Directory is currently being erased from the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;locked&lt;/strong&gt;: Directory is currently locked. No action can be made except unlocking by the application which locked the File (such as office, webdav or external import).&lt;/note&gt;&lt;note&gt;&lt;strong&gt;trash_inherited&lt;/strong&gt;: Directory is currently in trash because a parent directory was trashed.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;trashed&lt;/strong&gt;: Directory is currently in trash and specifically trashed by the user.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;uploading&lt;/strong&gt;: Directory is currently being uploaded. The Directory is locked and no action can be done excepting upload actions.&lt;/note&gt; |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of Directory, empty string if no specific visibility. Add additional information about Directory to show different icons or more.&lt;note&gt;&lt;strong&gt;&lt;/strong&gt;: Empty visibility mean no special visibility.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;is_in_team_space_folder&lt;/strong&gt;: Is a Directory inside a Common Documents directory.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;is_root&lt;/strong&gt;: Is the root directory of the user.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;is_shared_space&lt;/strong&gt;: Is the shared root directory, a special directory where the files inside are the private files of other user shared with the logged user.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;is_team_space&lt;/strong&gt;: Is the Common Documents directory, a special directory where the files inside are common to all users by default.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;is_team_space_folder&lt;/strong&gt;: Is the root directory inside the Common Documents.&lt;/note&gt; |  |
|**driveId** | **Integer** | Drive identifier |  |
|**depth** | **Integer** | Current path depth of Directory |  |
|**createdBy** | **Integer** | The identifier of the user who first uploaded the Directory |  |
|**createdAt** | **Integer** | Directory creation timestamp (in seconds), if available in its metadata or specified on upload |  |
|**addedAt** | **Integer** | The timestamp (in seconds) at which the Directory has been uploaded for the first time |  |
|**lastModifiedAt** | **Integer** | Directory creation timestamp (in seconds), if available in its metadata or specified on upload |  |
|**parentId** | **Integer** | Parent directory identifier |  |
|**deletedAt** | **Integer** | Timestamp of deleted resource Directory, only visible when the Directory is trashed |  [optional] |
|**deletedBy** | **Integer** | User identifier of deleted resource Directory, only visible when the Directory is trashed |  [optional] |
|**sharedRootId** | **Integer** | Root Directory identifier, only visible for shared user |  [optional] |
|**parents** | [**List&lt;Directory&gt;**](Directory.md) |  |  [optional] |
|**users** | **List&lt;Integer&gt;** | Array of users identifiers that has access to the Directory |  [optional] |
|**teams** | **List&lt;Integer&gt;** | Array of teams identifiers that has access to the Directory |  [optional] |
|**isFavorite** | **Boolean** | Is Directory pinned as favorite |  [optional] |
|**activity** | [**Activity**](Activity.md) |  |  [optional] |
|**sharelink** | [**ShareLink**](ShareLink.md) |  |  [optional] |
|**capabilities** | [**Capabilities2**](Capabilities2.md) |  |  [optional] |
|**lock** | [**Lock**](Lock.md) |  |  [optional] |
|**categories** | [**List&lt;FileCategory&gt;**](FileCategory.md) |  |  [optional] |
|**etag** | **String** | ETag of the file |  [optional] |
|**color** | **String** | Color of the directory for the user requesting it |  |
|**dropbox** | [**Dropbox**](Dropbox.md) |  |  [optional] |
|**externalImport** | [**ExternalImportFile**](ExternalImportFile.md) |  |  [optional] |
|**rewind** | [**Rewind**](Rewind.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DIR | &quot;dir&quot; |
| FILE | &quot;file&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ERASING | &quot;erasing&quot; |
| LOCKED | &quot;locked&quot; |
| TRASH_INHERITED | &quot;trash_inherited&quot; |
| TRASHED | &quot;trashed&quot; |
| UPLOADING | &quot;uploading&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| IS_IN_TEAM_SPACE_FOLDER | &quot;is_in_team_space_folder&quot; |
| IS_ROOT | &quot;is_root&quot; |
| IS_SHARED_SPACE | &quot;is_shared_space&quot; |
| IS_TEAM_SPACE | &quot;is_team_space&quot; |
| IS_TEAM_SPACE_FOLDER | &quot;is_team_space_folder&quot; |



