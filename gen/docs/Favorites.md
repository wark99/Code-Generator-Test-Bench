

# Favorites

This affects how items are displayed in places like the Dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a favorite record. |  |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a favorites record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a favorites record was updated. |  |
|**contextId** | **Object** | The unique identifier for the favorites&#39;s context (account, course, user). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60; or &#x60;Account&#x60; or &#x60;User&#x60;. |  |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |



