# AuthApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**login**](AuthApi.md#login) | **POST** /users/login | User login |
| [**logout**](AuthApi.md#logout) | **POST** /users/logout | User logout |
| [**resendVerificationEmail**](AuthApi.md#resendVerificationEmail) | **POST** /users/resend-verification-email | Resend verification email |
| [**resetPassword**](AuthApi.md#resetPassword) | **POST** /users/reset-password | Reset password |
| [**resetPasswordRequest**](AuthApi.md#resetPasswordRequest) | **POST** /users/reset-password-request | Request password reset |
| [**signup**](AuthApi.md#signup) | **POST** /users/signup | Register a new user |
| [**verifyEmail**](AuthApi.md#verifyEmail) | **POST** /users/verify-email | Verify user&#39;s email |



## login

> Login200Response login(userLogin)

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
            Login200Response result = apiInstance.login(userLogin);
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

[**Login200Response**](Login200Response.md)

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


## logout

> Logout200Response logout()

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
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            Logout200Response result = apiInstance.logout();
            System.out.println(result);
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

[**Logout200Response**](Logout200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## resendVerificationEmail

> Logout200Response resendVerificationEmail()

Resend verification email

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
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            Logout200Response result = apiInstance.resendVerificationEmail();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#resendVerificationEmail");
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

[**Logout200Response**](Logout200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## resetPassword

> Logout200Response resetPassword(resetPasswordRequest)

Reset password

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
            Logout200Response result = apiInstance.resetPassword(resetPasswordRequest);
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
| **resetPasswordRequest** | [**ResetPasswordRequest**](ResetPasswordRequest.md)|  | |

### Return type

[**Logout200Response**](Logout200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## resetPasswordRequest

> Logout200Response resetPasswordRequest(resetPasswordRequestRequest)

Request password reset

A password reset link will be sent to the user&#39;s email if it exists. The response must always be success (even if email does not exist). This is to prevent email enumeration attacks.

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
        ResetPasswordRequestRequest resetPasswordRequestRequest = new ResetPasswordRequestRequest(); // ResetPasswordRequestRequest | 
        try {
            Logout200Response result = apiInstance.resetPasswordRequest(resetPasswordRequestRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#resetPasswordRequest");
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
| **resetPasswordRequestRequest** | [**ResetPasswordRequestRequest**](ResetPasswordRequestRequest.md)|  | |

### Return type

[**Logout200Response**](Logout200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## signup

> SuccessResponseObject signup(userRegistration)

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
            SuccessResponseObject result = apiInstance.signup(userRegistration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#signup");
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

[**SuccessResponseObject**](SuccessResponseObject.md)

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


## verifyEmail

> Logout200Response verifyEmail(verifyEmailRequest)

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
            Logout200Response result = apiInstance.verifyEmail(verifyEmailRequest);
            System.out.println(result);
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

[**Logout200Response**](Logout200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |

