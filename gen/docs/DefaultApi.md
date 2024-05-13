# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/IT-Financial-Systems/composite-model/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStandardMessageEnvelope**](DefaultApi.md#createStandardMessageEnvelope) | **POST** /messageEnvelope | Create a Standard Message Envelope |



## createStandardMessageEnvelope

> MessageEnvelope createStandardMessageEnvelope(messageEnvelope)

Create a Standard Message Envelope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/IT-Financial-Systems/composite-model/1.0.0");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MessageEnvelope messageEnvelope = new MessageEnvelope(); // MessageEnvelope | 
        try {
            MessageEnvelope result = apiInstance.createStandardMessageEnvelope(messageEnvelope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createStandardMessageEnvelope");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageEnvelope** | [**MessageEnvelope**](MessageEnvelope.md)|  | |

### Return type

[**MessageEnvelope**](MessageEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MessageEnvelope was successfully created |  -  |
| **400** | Bad Request |  -  |

