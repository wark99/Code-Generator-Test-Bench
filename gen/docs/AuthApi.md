# AuthApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmRegister**](AuthApi.md#confirmRegister) | **POST** /auth/confirm-register/{token}/ | User confirm register |
| [**loginUser**](AuthApi.md#loginUser) | **POST** /auth/login/ | User login |
| [**logoutUser**](AuthApi.md#logoutUser) | **POST** /auth/logout/ | User logout |
| [**recovery**](AuthApi.md#recovery) | **POST** /auth/recovery/ | User recovery password by email or phone |
| [**registerUser**](AuthApi.md#registerUser) | **POST** /auth/register/ | User register |
| [**resetPassword**](AuthApi.md#resetPassword) | **POST** /auth/reset/{token}/ | Reset user password |



## confirmRegister

> Object confirmRegister(token)

User confirm register

User confirm register

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
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String token = "token_example"; // String | 
        try {
            Object result = apiInstance.confirmRegister(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#confirmRegister");
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
| **token** | **String**|  | |

### Return type

**Object**

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


## loginUser

> Object loginUser()

User login

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
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            Object result = apiInstance.loginUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#loginUser");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## logoutUser

> Object logoutUser()

User logout

User logout

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
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            Object result = apiInstance.logoutUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#logoutUser");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## recovery

> Object recovery(userRecoveryPasswordScheme)

User recovery password by email or phone

User recovery password by email or phone

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
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        AuthApi apiInstance = new AuthApi(defaultClient);
        UserRecoveryPasswordScheme userRecoveryPasswordScheme = new UserRecoveryPasswordScheme(); // UserRecoveryPasswordScheme | 
        try {
            Object result = apiInstance.recovery(userRecoveryPasswordScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#recovery");
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
| **userRecoveryPasswordScheme** | [**UserRecoveryPasswordScheme**](UserRecoveryPasswordScheme.md)|  | |

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
| **200** | Successful Response |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation Error |  -  |


## registerUser

> Object registerUser(userRegisterScheme)

User register

User register

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
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        AuthApi apiInstance = new AuthApi(defaultClient);
        UserRegisterScheme userRegisterScheme = new UserRegisterScheme(); // UserRegisterScheme | 
        try {
            Object result = apiInstance.registerUser(userRegisterScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#registerUser");
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
| **userRegisterScheme** | [**UserRegisterScheme**](UserRegisterScheme.md)|  | |

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
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## resetPassword

> Object resetPassword(token, resetPasswordScheme)

Reset user password

Reset user password

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
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String token = "token_example"; // String | 
        ResetPasswordScheme resetPasswordScheme = new ResetPasswordScheme(); // ResetPasswordScheme | 
        try {
            Object result = apiInstance.resetPassword(token, resetPasswordScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#resetPassword");
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
| **token** | **String**|  | |
| **resetPasswordScheme** | [**ResetPasswordScheme**](ResetPasswordScheme.md)|  | |

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
| **200** | Successful Response |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation Error |  -  |

