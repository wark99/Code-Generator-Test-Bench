

# ContentShares

The receiver can use this link to import the content export into any of their courses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a content share. |  |
|**name** | **Object** | Name of the content item being shared. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of content share. |  |
|**userId** | **Object** | The ID of the user who owns the content share. |  |
|**createdAt** | **Object** | Timestamp showing when a &#x60;content_share&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a &#x60;content_share&#x60; record was updated. |  |
|**contentExportId** | **Object** | The ID of the ContentExport containing the content of the share. |  |
|**senderId** | **Object** | The ID of the user who sent the content share. Only populated for ReceivedContentShare. |  [optional] |
|**readState** | [**ReadStateEnum**](#ReadStateEnum) | State of the content shared. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| SENTCONTENTSHARE | &quot;SentContentShare&quot; |
| RECEIVEDCONTENTSHARE | &quot;ReceivedContentShare&quot; |



## Enum: ReadStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| READ | &quot;read&quot; |
| UNREAD | &quot;unread&quot; |



