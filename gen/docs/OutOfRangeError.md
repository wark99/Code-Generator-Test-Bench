

# OutOfRangeError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | A machine-processable identifier for the error. Typically corresponds to the fully-qualified exception class, as per the type system of the language that emitted the message (e.g. Java, Python or Scala exception type). |  |
|**uuid** | **String** | Unique identifier of the error. This identifier helps locate the exact source of the error (e.g. find the log entry in the server log stream). Make sure to include this identifier when contacting support. |  |
|**message** | **String** | A human-readable description for the error for informational purposes. The exact format of the message is unspecified, and implementations should not rely on the presence of any specific information. |  |
|**since** | **OffsetDateTime** | The earliest permitted timestamp. |  |
|**until** | **OffsetDateTime** | The latest permitted timestamp. |  [optional] |



