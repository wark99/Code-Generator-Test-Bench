

# AsyncTask


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Universally unique identifier of the resource &#x60;Async Task&#x60; |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the resource &#x60;Async Task&#x60; |  |
|**createdAt** | **Integer** | Timestamp &#x60;Async Task&#x60; has been created |  |
|**updatedAt** | **Integer** | Timestamp &#x60;Async Task&#x60; has been updated |  |
|**executedAt** | **Integer** | Timestamp &#x60;Async Task&#x60; has been executed |  |
|**finishedAt** | **Integer** | Timestamp &#x60;Async Task&#x60; is finished |  |
|**response** | **Object** | Asynchronous response result |  |
|**error** | **Object** | Asynchronous error result |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| EXECUTED | &quot;executed&quot; |
| FAILED | &quot;failed&quot; |
| RUNNING | &quot;running&quot; |
| SPOOLED | &quot;spooled&quot; |



