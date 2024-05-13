# AuthApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWhoami**](AuthApi.md#getWhoami) | **GET** /whoami | Whoami |
| [**postForgotPassword**](AuthApi.md#postForgotPassword) | **POST** /auth/forgot-password | Password reset link |
| [**postRegister**](AuthApi.md#postRegister) | **POST** /auth/register | Register a user |
| [**postResetPassword**](AuthApi.md#postResetPassword) | **POST** /auth/reset-password | Reset password |
| [**postToken**](AuthApi.md#postToken) | **POST** /auth/token | Get a token |



## getWhoami

> Object getWhoami()

Whoami

Retrieve the authenticated user.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            Object result = apiInstance.getWhoami();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#getWhoami");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postForgotPassword

> Object postForgotPassword(postForgotPasswordRequest)

Password reset link

Request a password reset link.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        PostForgotPasswordRequest postForgotPasswordRequest = new PostForgotPasswordRequest(); // PostForgotPasswordRequest | Sends a new password reset email.
        try {
            Object result = apiInstance.postForgotPassword(postForgotPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#postForgotPassword");
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
| **postForgotPasswordRequest** | [**PostForgotPasswordRequest**](PostForgotPasswordRequest.md)| Sends a new password reset email. | [optional] |

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


## postRegister

> Object postRegister(postRegisterRequest)

Register a user

Register and retrieve a token.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        PostRegisterRequest postRegisterRequest = new PostRegisterRequest(); // PostRegisterRequest | Creates and authenticates a new User and generates a new Token.
        try {
            Object result = apiInstance.postRegister(postRegisterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#postRegister");
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
| **postRegisterRequest** | [**PostRegisterRequest**](PostRegisterRequest.md)| Creates and authenticates a new User and generates a new Token. | [optional] |

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


## postResetPassword

> Object postResetPassword(postResetPasswordRequest)

Reset password

Reset the users password.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        PostResetPasswordRequest postResetPasswordRequest = new PostResetPasswordRequest(); // PostResetPasswordRequest | Resets the User password.
        try {
            Object result = apiInstance.postResetPassword(postResetPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#postResetPassword");
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
| **postResetPasswordRequest** | [**PostResetPasswordRequest**](PostResetPasswordRequest.md)| Resets the User password. | [optional] |

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


## postToken

> Object postToken(postTokenRequest)

Get a token

Sign in and retrieve a token.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        PostTokenRequest postTokenRequest = new PostTokenRequest(); // PostTokenRequest | Authenticates the User credentials and generates a new Token.
        try {
            Object result = apiInstance.postToken(postTokenRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#postToken");
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
| **postTokenRequest** | [**PostTokenRequest**](PostTokenRequest.md)| Authenticates the User credentials and generates a new Token. | [optional] |

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

