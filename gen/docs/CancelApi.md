# CancelApi

All URIs are relative to *https://dev1.nationalservicealliance.com/clientapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDispatch**](CancelApi.md#cancelDispatch) | **POST** /cancel/cancel.php | Cancels an open dispatch |



## cancelDispatch

> cancelDispatch(cancelRequest)

Cancels an open dispatch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CancelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CancelApi apiInstance = new CancelApi(defaultClient);
        CancelRequest cancelRequest = new CancelRequest(); // CancelRequest | 
        try {
            apiInstance.cancelDispatch(cancelRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CancelApi#cancelDispatch");
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
| **cancelRequest** | [**CancelRequest**](CancelRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful cancellation |  -  |
| **400** | User request error |  -  |
| **401** | Authentication error |  -  |
| **409** | Cannot cancel because dispatch is not in a cancellable state |  -  |
| **5XX** | Unexpected server error |  -  |

