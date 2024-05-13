

# FilterExercisesParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Object** | Limit the number of data items returned per page. This will default to (and be capped at) the configured page size for each individual endpoint. |  [optional] |
|**nextToken** | **Object** | The &#x60;next_token&#x60; from a previous page response. |  [optional] |
|**id** | **Integer** | Retrieve a single exercise with this ID (response data will be a single object not an array). |  [optional] |
|**untracked** | **InclusiveFilter** | Control whether exercises which are manually input are included |  [optional] |
|**inactive** | **InclusiveFilter** | Control whether exercises which have been archived are included |  [optional] |



