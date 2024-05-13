

# FilterUsersParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Object** | Limit the number of data items returned per page. This will default to (and be capped at) the configured page size for each individual endpoint. |  [optional] |
|**nextToken** | **Object** | The &#x60;next_token&#x60; from a previous page response. |  [optional] |
|**id** | **Integer** | Retrieve a single user with this ID (response data will be a single object not an array). |  [optional] |
|**groupId** | **Integer** | Retrieve users who are members of a group (with id &#x60;group_id&#x60;). |  [optional] |



