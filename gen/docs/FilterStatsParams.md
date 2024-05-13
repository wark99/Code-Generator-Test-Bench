

# FilterStatsParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Object** | Limit the number of data items returned per page. This will default to (and be capped at) the configured page size for each individual endpoint. |  [optional] |
|**nextToken** | **Object** | The &#x60;next_token&#x60; from a previous page response. |  [optional] |
|**userId** | **Integer** | Retrieve only stats for the user with ID &#x3D; &#x60;user_id&#x60;. |  [optional] |
|**groupId** | **Integer** | Retrieve only stats for users in the group with ID &#x3D; &#x60;group_id&#x60;. |  [optional] |
|**exerciseId** | **Integer** | Retrieve only sets for the exercise with ID &#x3D; &#x60;exercise_id&#x60;. |  [optional] |
|**beginTime** | **BigDecimal** |  |  [optional] |
|**endTime** | **BigDecimal** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | A descriptor for what this recorded stat represents. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONE_RM | &quot;ONE_RM&quot; |



