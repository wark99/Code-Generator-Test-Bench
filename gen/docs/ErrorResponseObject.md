

# ErrorResponseObject

Response with errors

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Internal status code of the response. An HTTP 200 response with an internal 500 status code is an error response. Prioritize the inner status over the HTTP status. |  |
|**errors** | [**List&lt;ApiError&gt;**](ApiError.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_400 | new BigDecimal(&quot;400&quot;) |
| NUMBER_401 | new BigDecimal(&quot;401&quot;) |
| NUMBER_403 | new BigDecimal(&quot;403&quot;) |
| NUMBER_404 | new BigDecimal(&quot;404&quot;) |
| NUMBER_409 | new BigDecimal(&quot;409&quot;) |
| NUMBER_500 | new BigDecimal(&quot;500&quot;) |



