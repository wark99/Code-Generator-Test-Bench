# FailingApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**failingRequest**](FailingApi.md#failingRequest) | **GET** /oops | Always fails |



## failingRequest

> String failingRequest()

Always fails

Produces sample error response.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FailingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        FailingApi apiInstance = new FailingApi(defaultClient);
        try {
            String result = apiInstance.failingRequest();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailingApi#failingRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Never returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |

