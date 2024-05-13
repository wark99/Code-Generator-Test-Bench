

# NotFoundError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | A machine-processable identifier for the error. Typically corresponds to the fully-qualified exception class, as per the type system of the language that emitted the message (e.g. Java, Python or Scala exception type). |  |
|**uuid** | **String** | Unique identifier of the error. This identifier helps locate the exact source of the error (e.g. find the log entry in the server log stream). Make sure to include this identifier when contacting support. |  |
|**message** | **String** | A human-readable description for the error for informational purposes. The exact format of the message is unspecified, and implementations should not rely on the presence of any specific information. |  |
|**id** | **String** | The identifier of the entity not found, e.g. the name of a table or the UUID of a job. |  |
|**kind** | **String** | The entity that is not found such as a namespace, table, object or job. |  |


