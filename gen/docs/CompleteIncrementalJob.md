

# CompleteIncrementalJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Opaque unique identifier of the job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the job. |  |
|**expiresAt** | **OffsetDateTime** | The time when job will no longer be available. |  [optional] |
|**objects** | [**List&lt;ModelObject&gt;**](ModelObject.md) | The list of objects generated by the job. |  |
|**schemaVersion** | **Integer** | Version of the schema that records in the table conform to. |  |
|**since** | **OffsetDateTime** | Start timestamp (in UTC); only those records are returned that have been persisted since the specified date and time. |  |
|**until** | **OffsetDateTime** | End timestamp (in UTC); only those records are returned that have been persisted before the specified date and time. This can be used as a starting point for future incremental queries. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING | &quot;waiting&quot; |
| RUNNING | &quot;running&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |


