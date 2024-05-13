

# SourceContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **String** | Meta information providing context about the client of this message. A client context represents the absolute originator of a distributed business transaction (e.g. sales channel in context of payment services transaction processing.) |  |
|**applicationId** | **String** | Provides the information about the application that created the message. |  |
|**transactionId** | **String** | Unique transaction identifier generated and provided by the absolute client. If the absolute client did not provide a transaction Id then the first intermediate processing node might produce on client&#39;s behalf. Various uses include - track, correlate, idempotency and troubleshoot transaction instances. |  |



