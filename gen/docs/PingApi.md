# PingApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPing**](PingApi.md#getPing) | **GET** /ping | Ping |



## getPing

> List&lt;Object&gt; getPing()

Ping

Ping pong.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        PingApi apiInstance = new PingApi(defaultClient);
        try {
            List<Object> result = apiInstance.getPing();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PingApi#getPing");
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

**List&lt;Object&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pong. |  -  |

