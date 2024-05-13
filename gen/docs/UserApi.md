# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userLogin**](UserApi.md#userLogin) | **POST** /api/user/login | Авторизация пользователя |
| [**userRegister**](UserApi.md#userRegister) | **POST** /api/user/register | Регистрация пользователя |



## userLogin

> Object userLogin(userLoginRequest)

Авторизация пользователя

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        UserLoginRequest userLoginRequest = new UserLoginRequest(); // UserLoginRequest | 
        try {
            Object result = apiInstance.userLogin(userLoginRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLogin");
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
| **userLoginRequest** | [**UserLoginRequest**](UserLoginRequest.md)|  | |

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
| **200** |  |  -  |
| **401** |  |  -  |
| **422** |  |  -  |


## userRegister

> Object userRegister(userRegisterRequest)

Регистрация пользователя

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        UserRegisterRequest userRegisterRequest = new UserRegisterRequest(); // UserRegisterRequest | 
        try {
            Object result = apiInstance.userRegister(userRegisterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userRegister");
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
| **userRegisterRequest** | [**UserRegisterRequest**](UserRegisterRequest.md)|  | |

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
| **200** |  |  -  |
| **422** |  |  -  |

