# NotificationsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**registerNotificationAction**](NotificationsApi.md#registerNotificationAction) | **POST** /mobile/api/register/notification | Register user for in app notification |



## registerNotificationAction

> registerNotificationAction()

Register user for in app notification

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        
        // Configure HTTP bearer authorization: JWT
        HttpBearerAuth JWT = (HttpBearerAuth) defaultClient.getAuthentication("JWT");
        JWT.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        try {
            apiInstance.registerNotificationAction();
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#registerNotificationAction");
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

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

