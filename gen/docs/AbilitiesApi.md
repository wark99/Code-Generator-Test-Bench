# AbilitiesApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAbilities**](AbilitiesApi.md#getAbilities) | **GET** /abilities | List abilities |



## getAbilities

> GetActivities200Response getAbilities()

List abilities

Retrieve a list of abilities.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        AbilitiesApi apiInstance = new AbilitiesApi(defaultClient);
        try {
            GetActivities200Response result = apiInstance.getAbilities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbilitiesApi#getAbilities");
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

[**GetActivities200Response**](GetActivities200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of abilities. |  -  |

