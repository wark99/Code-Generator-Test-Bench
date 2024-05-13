# AuthenticationApi

All URIs are relative to *https://adapter.sandbox.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authLogin**](AuthenticationApi.md#authLogin) | **POST** /oauth/token |  |



## authLogin

> Object authLogin(requestAuthenticationClientCredentials)



Request authentication token

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP basic authorization: Basic-Auth
        HttpBasicAuth Basic-Auth = (HttpBasicAuth) defaultClient.getAuthentication("Basic-Auth");
        Basic-Auth.setUsername("YOUR USERNAME");
        Basic-Auth.setPassword("YOUR PASSWORD");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        RequestAuthenticationClientCredentials requestAuthenticationClientCredentials = new RequestAuthenticationClientCredentials(); // RequestAuthenticationClientCredentials | 
        try {
            Object result = apiInstance.authLogin(requestAuthenticationClientCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authLogin");
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
| **requestAuthenticationClientCredentials** | [**RequestAuthenticationClientCredentials**](RequestAuthenticationClientCredentials.md)|  | |

### Return type

**Object**

### Authorization

[Basic-Auth](../README.md#Basic-Auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **406** |  |  -  |
| **422** |  |  -  |

