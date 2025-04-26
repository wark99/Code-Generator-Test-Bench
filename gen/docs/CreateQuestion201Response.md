

# CreateQuestion201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Internal status code of the response. An HTTP 200 response with an internal 500 status code is an error response. Prioritize the inner status over the HTTP status. |  |
|**data** | [**QuestionDetails**](QuestionDetails.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _200 | &quot;200&quot; |
| _201 | &quot;201&quot; |



