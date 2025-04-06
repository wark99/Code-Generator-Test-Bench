

# RestError

The schema for all error responses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **Integer** | The HTTP status code. |  [readonly] |
|**error** | **String** | The short error message. |  [readonly] |
|**path** | **URI** | The path of the URL for this request. |  [readonly] |
|**timestamp** | **OffsetDateTime** | The time the error occured. |  [readonly] |
|**message** | **String** | The long error message. |  [readonly] |
|**schemaValidationErrors** | **List&lt;ValidationMessage&gt;** | Validation errors against the OpenAPI schema. |  |
|**trace** | **String** | The stacktrace for this error. |  [optional] [readonly] |



