# AuthApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**login**](AuthApi.md#login) | **POST** /auth/login | User login |
| [**logout**](AuthApi.md#logout) | **POST** /auth/logout | User logout |
| [**resetPassword**](AuthApi.md#resetPassword) | **POST** /auth/reset-password | Reset user&#39;s password |
| [**signUp**](AuthApi.md#signUp) | **POST** /auth/signup | Register a new user |
| [**verifyEmail**](AuthApi.md#verifyEmail) | **POST** /auth/verify-email | Verify user&#39;s email |



## login

> SignUp201Response login(userLogin)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        UserLogin userLogin = new UserLogin(); // UserLogin | 
        try {
            SignUp201Response result = apiInstance.login(userLogin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#login");
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

[**SignUp201Response**](SignUp201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful login |  -  |
| **401** |  |  -  |


## logout

> logout()

User logout

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            apiInstance.logout();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#logout");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful logout |  -  |
| **401** |  |  -  |


## resetPassword

> resetPassword(resetPasswordRequest)

Reset user&#39;s password

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest(); // ResetPasswordRequest | 
        try {
            apiInstance.resetPassword(resetPasswordRequest);
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
| **resetPasswordRequest** | [**ResetPasswordRequest**](ResetPasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Password reset email sent |  -  |
| **400** |  |  -  |


## signUp

> SignUp201Response signUp(userRegistration)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        UserRegistration userRegistration = new UserRegistration(); // UserRegistration | 
        try {
            SignUp201Response result = apiInstance.signUp(userRegistration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#signUp");
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

[**SignUp201Response**](SignUp201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User successfully registered |  -  |
| **400** |  |  -  |


## verifyEmail

> verifyEmail(verifyEmailRequest)

Verify user&#39;s email

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        VerifyEmailRequest verifyEmailRequest = new VerifyEmailRequest(); // VerifyEmailRequest | 
        try {
            apiInstance.verifyEmail(verifyEmailRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#verifyEmail");
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
| **verifyEmailRequest** | [**VerifyEmailRequest**](VerifyEmailRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Email successfully verified |  -  |
| **400** |  |  -  |

