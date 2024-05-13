# AuthApi

All URIs are relative to *https://glusterfs1.sgx.io:8443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authPost**](AuthApi.md#authPost) | **POST** /auth | Authenticate |
| [**logoutPost**](AuthApi.md#logoutPost) | **POST** /logout | Logout |



## authPost

> AuthResponse authPost(username, password)

Authenticate

Authenticate to Gamestream Backup Service. This step is mandatory to acess backup management methods. Authentication is purely cookie based. The JWT Token returned is response body if purely informational.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String username = "username_example"; // String | 
        String password = "password_example"; // String | 
        try {
            AuthResponse result = apiInstance.authPost(username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authPost");
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
| **username** | **String**|  | |
| **password** | **String**|  | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication failed |  -  |


## logoutPost

> String logoutPost()

Logout

Logout from Gamestream Backup Service. When logout is successfull, the auuthorization cookie is automatically removed, and backup management methods are no longer accessible.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            String result = apiInstance.logoutPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#logoutPost");
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

**String**

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xhtml+xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

