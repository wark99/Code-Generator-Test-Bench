# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/IT-Financial-Systems/composite-model/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessageEnvelope**](DefaultApi.md#createMessageEnvelope) | **POST** /messageEnvelope | Create a MessageEnvelope |



## createMessageEnvelope

> CompositeModel createMessageEnvelope(compositeModel)

Create a MessageEnvelope

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
        CompositeModel compositeModel = new CompositeModel(); // CompositeModel | 
        try {
            CompositeModel result = apiInstance.createMessageEnvelope(compositeModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createMessageEnvelope");
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
| **compositeModel** | [**CompositeModel**](CompositeModel.md)|  | |

### Return type

[**CompositeModel**](CompositeModel.md)

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

