

# FailedJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Opaque unique identifier of the job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the job. |  |
|**expiresAt** | **OffsetDateTime** | The time when job will no longer be available. |  [optional] |
|**error** | [**ProcessingError**](ProcessingError.md) | Provides more details on the error that occurred. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING | &quot;waiting&quot; |
| RUNNING | &quot;running&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |



