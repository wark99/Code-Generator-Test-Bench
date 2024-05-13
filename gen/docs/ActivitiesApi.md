# ActivitiesApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActivities**](ActivitiesApi.md#getActivities) | **GET** /activities | List activities |



## getActivities

> GetActivities200Response getActivities()

List activities

Retrieve a list of activities.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        try {
            GetActivities200Response result = apiInstance.getActivities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getActivities");
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
| **200** | Returns a list of activities. |  -  |

