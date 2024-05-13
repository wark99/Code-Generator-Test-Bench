

# ScoreResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**response** | [**ResponseEnum**](#ResponseEnum) | Result of the scoring request. |  |
|**score** | **Integer** | The VS4+ weighted credit score. |  [optional] |
|**reasonCodes** | **List&lt;Object&gt;** | List of all factors considered in the calculation of the VS4+ score. |  [optional] |



## Enum: ResponseEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| FAIL | &quot;FAIL&quot; |



