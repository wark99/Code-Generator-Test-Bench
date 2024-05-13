

# FilterSetsParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Object** | Limit the number of data items returned per page. This will default to (and be capped at) the configured page size for each individual endpoint. |  [optional] |
|**nextToken** | **Object** | The &#x60;next_token&#x60; from a previous page response. |  [optional] |
|**id** | **Integer** | Retrieve a single set with this ID (response data will be a single object not an array). |  [optional] |
|**userId** | **Integer** | Retrieve only sets for the user with ID &#x3D; &#x60;user_id&#x60;. |  [optional] |
|**groupId** | **Integer** | Retrieve only sets for users in the group with the corresponding &#x60;id&#x60;. This can be set to the &#x60;org_id&#x60; of a user, which would filter for all users in said organization. |  [optional] |
|**exerciseId** | **Integer** | Retrieve only sets for the exercise with ID &#x3D; &#x60;exercise_id&#x60;. |  [optional] |
|**beginTime** | **BigDecimal** |  |  [optional] |
|**endTime** | **BigDecimal** |  |  [optional] |
|**untracked** | **InclusiveFilter** | Controls whether manually entered sets are returned. |  [optional] |
|**includeReps** | **Boolean** | By specifying &#x60;include_reps &#x3D; true&#x60;, the &#x60;reps&#x60; field will be included on Sets returned. Otherwise, it will be omitted. |  [optional] |



