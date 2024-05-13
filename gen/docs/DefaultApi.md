# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1LicensesCheckPost**](DefaultApi.md#apiV1LicensesCheckPost) | **POST** /api/v1/licenses/check | Check License |



## apiV1LicensesCheckPost

> apiV1LicensesCheckPost(postApiV1LicensesCheckRequestBody)

Check License

The preferable way is to use \&quot;Bearer\&quot; header to send license code instead of \&quot;key\&quot; parameter.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PostApiV1LicensesCheckRequestBody postApiV1LicensesCheckRequestBody = new PostApiV1LicensesCheckRequestBody(); // PostApiV1LicensesCheckRequestBody | 
        try {
            apiInstance.apiV1LicensesCheckPost(postApiV1LicensesCheckRequestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#apiV1LicensesCheckPost");
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
| **postApiV1LicensesCheckRequestBody** | [**PostApiV1LicensesCheckRequestBody**](PostApiV1LicensesCheckRequestBody.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Authentication is invalid |  -  |
| **403** | License is invalid |  -  |
| **204** | License is valid (no response body) |  -  |

