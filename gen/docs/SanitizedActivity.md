

# SanitizedActivity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | [**Target**](Target.md) |  |  [optional] |
|**targetAt** | [**TargetAt**](TargetAt.md) |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Action to do in rewind situation.&lt;note&gt;&lt;strong&gt;archive&lt;/strong&gt;: File needs to be archived in a specific directory.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;archive_in_trash&lt;/strong&gt;: File needs to be archived in trash root.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;file_deleted&lt;/strong&gt;: File does not exist.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;move&lt;/strong&gt;: File needs to be moved.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;rename&lt;/strong&gt;: File needs to be renamed.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;restore&lt;/strong&gt;: File needs to be restored from trash.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;trash&lt;/strong&gt;: File needs to be trashed.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;update&lt;/strong&gt;: File content need to be updated.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;version_deleted&lt;/strong&gt;: File content does not exist.&lt;/note&gt; |  |
|**state** | [**StateEnum**](#StateEnum) | State one action in the rewind process.&lt;note&gt;&lt;strong&gt;not_executed&lt;/strong&gt;: Action was not executed yet.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;not_handled&lt;/strong&gt;: Action cannot be rewound.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;on_conflict&lt;/strong&gt;: Action lead to a conflict with another file/directory, this item was moved to a specific directory.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;on_error&lt;/strong&gt;: Action lead to a fatal error, for instance the targeted version of a file was unable to be restored.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;success&lt;/strong&gt;: Action was executed correctly.&lt;/note&gt; |  |
|**specialParentId** | **Integer** |  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ARCHIVE | &quot;archive&quot; |
| ARCHIVE_IN_TRASH | &quot;archive_in_trash&quot; |
| FILE_DELETED | &quot;file_deleted&quot; |
| MOVE | &quot;move&quot; |
| RENAME | &quot;rename&quot; |
| RESTORE | &quot;restore&quot; |
| TRASH | &quot;trash&quot; |
| UPDATE | &quot;update&quot; |
| VERSION_DELETED | &quot;version_deleted&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| NOT_EXECUTED | &quot;not_executed&quot; |
| NOT_HANDLED | &quot;not_handled&quot; |
| ON_CONFLICT | &quot;on_conflict&quot; |
| ON_ERROR | &quot;on_error&quot; |
| SUCCESS | &quot;success&quot; |



