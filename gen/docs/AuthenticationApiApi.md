# AuthenticationApiApi

All URIs are relative to *http://localhost:8000/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getJwtToken**](AuthenticationApiApi.md#getJwtToken) | **POST** /auth | Get a JWT token for the given scopes |



## getJwtToken

> GetJwtToken200Response getJwtToken(requestBody)

Get a JWT token for the given scopes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");

        AuthenticationApiApi apiInstance = new AuthenticationApiApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | Scopes to request
        try {
            GetJwtToken200Response result = apiInstance.getJwtToken(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApiApi#getJwtToken");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| Scopes to request | |

### Return type

[**GetJwtToken200Response**](GetJwtToken200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |

