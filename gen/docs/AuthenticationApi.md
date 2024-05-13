# AuthenticationApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authAccessTokenPost**](AuthenticationApi.md#authAccessTokenPost) | **POST** /auth/access-token | Authenticate user |
| [**authLogoutPost**](AuthenticationApi.md#authLogoutPost) | **POST** /auth/logout | logs user out |
| [**authRefreshTokenPost**](AuthenticationApi.md#authRefreshTokenPost) | **POST** /auth/refresh-token | refreshs your expired token |
| [**authSendMfaCodePost**](AuthenticationApi.md#authSendMfaCodePost) | **POST** /auth/send-mfa-code | send mfa code to user |
| [**authValidateMfaCodePost**](AuthenticationApi.md#authValidateMfaCodePost) | **POST** /auth/validate-mfa-code | validates 6 digit mfa pin code |



## authAccessTokenPost

> AuthAccessTokenPost200Response authAccessTokenPost(authAccessTokenPostRequest)

Authenticate user

Authenticates user and issues them JWT access and refresh tokens. Access token is valid for 1 hour and refresh token is valid for 2 hours. User mobile must be verified using /registration/verify-mobile before they can be issued a token 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthAccessTokenPostRequest authAccessTokenPostRequest = new AuthAccessTokenPostRequest(); // AuthAccessTokenPostRequest | 
        try {
            AuthAccessTokenPost200Response result = apiInstance.authAccessTokenPost(authAccessTokenPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authAccessTokenPost");
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
| **authAccessTokenPostRequest** | [**AuthAccessTokenPostRequest**](AuthAccessTokenPostRequest.md)|  | [optional] |

### Return type

[**AuthAccessTokenPost200Response**](AuthAccessTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Login successful |  -  |
| **400** | We were unable to verify your pin code |  -  |
| **0** | Unexpected Error |  -  |


## authLogoutPost

> authLogoutPost()

logs user out

This allows user to logout, tokens are destroyed.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            apiInstance.authLogoutPost();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authLogoutPost");
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

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User successfully logged out |  -  |
| **400** | Unable to logout. |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## authRefreshTokenPost

> AuthRefreshTokenPost200Response authRefreshTokenPost(authRefreshTokenPostRequest)

refreshs your expired token

Accepts a valid refresh token to issue you a new access token. Note that no refresh token issued.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthRefreshTokenPostRequest authRefreshTokenPostRequest = new AuthRefreshTokenPostRequest(); // AuthRefreshTokenPostRequest | 
        try {
            AuthRefreshTokenPost200Response result = apiInstance.authRefreshTokenPost(authRefreshTokenPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authRefreshTokenPost");
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
| **authRefreshTokenPostRequest** | [**AuthRefreshTokenPostRequest**](AuthRefreshTokenPostRequest.md)|  | [optional] |

### Return type

[**AuthRefreshTokenPost200Response**](AuthRefreshTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully refreshes a token |  -  |
| **400** | We were unable to verify your pin code |  -  |
| **0** | Unexpected Error |  -  |


## authSendMfaCodePost

> authSendMfaCodePost(authSendMfaCodePostRequest)

send mfa code to user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthSendMfaCodePostRequest authSendMfaCodePostRequest = new AuthSendMfaCodePostRequest(); // AuthSendMfaCodePostRequest | 
        try {
            apiInstance.authSendMfaCodePost(authSendMfaCodePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authSendMfaCodePost");
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
| **authSendMfaCodePostRequest** | [**AuthSendMfaCodePostRequest**](AuthSendMfaCodePostRequest.md)|  | [optional] |

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
| **200** | Mfa code sent |  -  |
| **400** | There was problem sending mfa code |  -  |


## authValidateMfaCodePost

> authValidateMfaCodePost(authValidateMfaCodePostRequest)

validates 6 digit mfa pin code

email is mandatory if user is not logged in

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthValidateMfaCodePostRequest authValidateMfaCodePostRequest = new AuthValidateMfaCodePostRequest(); // AuthValidateMfaCodePostRequest | 
        try {
            apiInstance.authValidateMfaCodePost(authValidateMfaCodePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authValidateMfaCodePost");
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
| **authValidateMfaCodePostRequest** | [**AuthValidateMfaCodePostRequest**](AuthValidateMfaCodePostRequest.md)|  | [optional] |

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
| **200** | Successfully validated mfa pin code |  -  |
| **400** | There was problem validating mfa code |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

