

# SchemaAccessToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**response** | [**ResponseEnum**](#ResponseEnum) | Whether the authorization is successful or not. |  [optional] |
|**accessToken** | **String** | The generated token. |  [optional] |
|**expiresIn** | **Integer** | The amount of time (in seconds) the generated token is effective. Once the period has passed, the token expires, and requests using the token will fail. |  [optional] |
|**tokenType** | **String** | Type of the token. Currently this value is always &#x60;Bearer&#x60;. |  [optional] |



## Enum: ResponseEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| FAIL | &quot;FAIL&quot; |



