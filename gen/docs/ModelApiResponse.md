

# ModelApiResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Internal status code of the response. An HTTP 200 response with an internal 500 status code is an error response. Prioritize the inner status over the HTTP status. |  |
|**data** | [**SuccessResponseObjectData**](SuccessResponseObjectData.md) |  |  |
|**errors** | **Object** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _400 | &quot;400&quot; |
| _401 | &quot;401&quot; |
| _403 | &quot;403&quot; |
| _404 | &quot;404&quot; |
| _409 | &quot;409&quot; |
| _500 | &quot;500&quot; |



