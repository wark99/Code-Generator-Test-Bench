# DefaultApi

All URIs are relative to *https://rgcqz988gj.execute-api.us-east-1.amazonaws.com/v1/file-processor*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadNfPost**](DefaultApi.md#uploadNfPost) | **POST** /upload/nf | Upload invoice file and data |



## uploadNfPost

> uploadNfPost(orderCode, nota)

Upload invoice file and data

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://rgcqz988gj.execute-api.us-east-1.amazonaws.com/v1/file-processor");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String orderCode = "orderCode_example"; // String | Order identifier
        File nota = new File("/path/to/file"); // File | Invoice file
        try {
            apiInstance.uploadNfPost(orderCode, nota);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#uploadNfPost");
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
| **orderCode** | **String**| Order identifier | [optional] |
| **nota** | **File**| Invoice file | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File uploaded successfully |  -  |
| **400** |  |  -  |

