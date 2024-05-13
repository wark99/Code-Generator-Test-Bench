

# MessageHeader

Message Header capture details of the source of message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**headerVersion** | **String** | The Universal MessageHeaderType version. Version should be check by processing nodes to ensure compatability. [Major_Version.Minor_Version] |  |
|**timestamp** | **OffsetDateTime** | ISO Data Time Format. |  |
|**sourceContext** | [**SourceContext**](SourceContext.md) |  |  |
|**messageContext** | [**MessageContext**](MessageContext.md) |  |  |
|**multiPartMessageContextType** | [**MultiPartMessageContextType**](MultiPartMessageContextType.md) |  |  [optional] |



