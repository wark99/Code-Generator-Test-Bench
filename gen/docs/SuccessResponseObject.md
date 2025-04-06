

# SuccessResponseObject

OK

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Internal status code of the response. An HTTP 200 response with an internal 500 status code is an error response. Prioritize the inner status over the HTTP status. |  |
|**data** | [**SuccessResponseObjectData**](SuccessResponseObjectData.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_200 | 200 |
| NUMBER_201 | 201 |



