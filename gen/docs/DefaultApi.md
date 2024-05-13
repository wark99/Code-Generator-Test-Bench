# DefaultApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getString**](DefaultApi.md#getString) | **GET** /string/ | This command does not require API authentication. |



## getString

> getString()

This command does not require API authentication.

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
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.getString();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getString");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

