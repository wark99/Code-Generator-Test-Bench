# AuthApi

All URIs are relative to *https://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersLoginPost**](AuthApi.md#usersLoginPost) | **POST** /users/login | User login |
| [**usersPost**](AuthApi.md#usersPost) | **POST** /users | Register a new user |



## usersLoginPost

> UsersLoginPost200Response usersLoginPost(userLogin)

User login

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        AuthApi apiInstance = new AuthApi(defaultClient);
        UserLogin userLogin = new UserLogin(); // UserLogin | 
        try {
            UsersLoginPost200Response result = apiInstance.usersLoginPost(userLogin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#usersLoginPost");
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
| **userLogin** | [**UserLogin**](UserLogin.md)|  | |

### Return type

[**UsersLoginPost200Response**](UsersLoginPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** |  |  -  |


## usersPost

> Object usersPost(userRegistration)

Register a new user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        AuthApi apiInstance = new AuthApi(defaultClient);
        UserRegistration userRegistration = new UserRegistration(); // UserRegistration | 
        try {
            Object result = apiInstance.usersPost(userRegistration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#usersPost");
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
| **userRegistration** | [**UserRegistration**](UserRegistration.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |

