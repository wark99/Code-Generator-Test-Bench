# ApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**profileV1ProfileUserGet**](ApiApi.md#profileV1ProfileUserGet) | **GET** /v1/profile/{user} | Profile |



## profileV1ProfileUserGet

> String profileV1ProfileUserGet(name, get, image)

Profile

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ApiApi apiInstance = new ApiApi(defaultClient);
        String name = "name_example"; // String | bruh moment
        String get = "mini"; // String | Optionally set multiple queries separated by a comma.
        String image = "avatar"; // String | Optionally set multiple queries separated by a comma.
        try {
            String result = apiInstance.profileV1ProfileUserGet(name, get, image);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#profileV1ProfileUserGet");
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
| **name** | **String**| bruh moment | |
| **get** | **String**| Optionally set multiple queries separated by a comma. | [optional] [enum: mini, full, background, style, css, purchase, group] |
| **image** | **String**| Optionally set multiple queries separated by a comma. | [optional] [enum: avatar, thumb, thumb_m, message, flag, flag_t, vr_t] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

