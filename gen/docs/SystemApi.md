# SystemApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClientConfig**](SystemApi.md#getClientConfig) | **GET** /config/client | Get client configuration |



## getClientConfig

> StatusOK getClientConfig(format)

Get client configuration

Get a subset of the server configuration needed by the client. ##### Permissions No permission required. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        SystemApi apiInstance = new SystemApi(defaultClient);
        String format = "format_example"; // String | Must be `old`, other formats not implemented yet
        try {
            StatusOK result = apiInstance.getClientConfig(format);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemApi#getClientConfig");
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
| **format** | **String**| Must be &#x60;old&#x60;, other formats not implemented yet | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Configuration retrieval successful |  -  |
| **400** |  |  -  |
| **501** |  |  -  |

