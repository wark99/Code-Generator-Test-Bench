# DefaultApi

All URIs are relative to *https://openaiagent.gottacatchemall.repl.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomerDataByEmail**](DefaultApi.md#getCustomerDataByEmail) | **POST** /get_user_id |  |



## getCustomerDataByEmail

> Object getCustomerDataByEmail(email)



Get customer data given user email

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
        defaultClient.setBasePath("https://openaiagent.gottacatchemall.repl.co");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String email = "email_example"; // String | The email of the customer to get data about
        try {
            Object result = apiInstance.getCustomerDataByEmail(email);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCustomerDataByEmail");
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
| **email** | **String**| The email of the customer to get data about | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

