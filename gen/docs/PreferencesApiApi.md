# PreferencesApiApi

All URIs are relative to *http://localhost:8000/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRetryPolicy**](PreferencesApiApi.md#getRetryPolicy) | **GET** /preferences/retry-policy | Get the retry policy for communications |
| [**updateRetryPolicy**](PreferencesApiApi.md#updateRetryPolicy) | **PUT** /preferences/retry-policy | Update the retry policy for communications |



## getRetryPolicy

> RetryPolicy getRetryPolicy()

Get the retry policy for communications

requires preferences:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PreferencesApiApi apiInstance = new PreferencesApiApi(defaultClient);
        try {
            RetryPolicy result = apiInstance.getRetryPolicy();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApiApi#getRetryPolicy");
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

[**RetryPolicy**](RetryPolicy.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |


## updateRetryPolicy

> RetryPolicy updateRetryPolicy()

Update the retry policy for communications

requires preferences:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PreferencesApiApi apiInstance = new PreferencesApiApi(defaultClient);
        try {
            RetryPolicy result = apiInstance.updateRetryPolicy();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApiApi#updateRetryPolicy");
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

[**RetryPolicy**](RetryPolicy.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |

