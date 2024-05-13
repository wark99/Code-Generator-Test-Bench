# AuthRoutesApi

All URIs are relative to *http://localhost:5001/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessToken**](AuthRoutesApi.md#getAccessToken) | **POST** /get-access-token/user/{userid} | get-access-token |
| [**signin**](AuthRoutesApi.md#signin) | **POST** /signin | signin |
| [**signout**](AuthRoutesApi.md#signout) | **POST** /signout/{userid} | signout |
| [**signup**](AuthRoutesApi.md#signup) | **POST** /signup | signup |
| [**verifyAccessToken**](AuthRoutesApi.md#verifyAccessToken) | **GET** /verify-access-token/user/{userid} | verify-access-token |



## getAccessToken

> getAccessToken(userid, getAccessTokenRequest)

get-access-token

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        AuthRoutesApi apiInstance = new AuthRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        GetAccessTokenRequest getAccessTokenRequest = new GetAccessTokenRequest(); // GetAccessTokenRequest | 
        try {
            apiInstance.getAccessToken(userid, getAccessTokenRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthRoutesApi#getAccessToken");
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
| **userid** | **String**|  | |
| **getAccessTokenRequest** | [**GetAccessTokenRequest**](GetAccessTokenRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |


## signin

> signin(deviceID, signinRequest)

signin

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        AuthRoutesApi apiInstance = new AuthRoutesApi(defaultClient);
        String deviceID = "deviceID_example"; // String | 
        SigninRequest signinRequest = new SigninRequest(); // SigninRequest | 
        try {
            apiInstance.signin(deviceID, signinRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthRoutesApi#signin");
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
| **deviceID** | **String**|  | |
| **signinRequest** | [**SigninRequest**](SigninRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |


## signout

> signout(deviceID, userid, authorization, contentType)

signout

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        AuthRoutesApi apiInstance = new AuthRoutesApi(defaultClient);
        String deviceID = "deviceID_example"; // String | 
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        String contentType = "contentType_example"; // String | 
        try {
            apiInstance.signout(deviceID, userid, authorization, contentType);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthRoutesApi#signout");
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
| **deviceID** | **String**|  | |
| **userid** | **String**|  | |
| **authorization** | **String**|  | |
| **contentType** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |


## signup

> signup(deviceID, signuprequest)

signup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        AuthRoutesApi apiInstance = new AuthRoutesApi(defaultClient);
        String deviceID = "deviceID_example"; // String | 
        Signuprequest signuprequest = new Signuprequest(); // Signuprequest | 
        try {
            apiInstance.signup(deviceID, signuprequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthRoutesApi#signup");
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
| **deviceID** | **String**|  | |
| **signuprequest** | [**Signuprequest**](Signuprequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |


## verifyAccessToken

> verifyAccessToken(userid, authorization)

verify-access-token

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        AuthRoutesApi apiInstance = new AuthRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            apiInstance.verifyAccessToken(userid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthRoutesApi#verifyAccessToken");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

