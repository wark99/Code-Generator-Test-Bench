# LiveApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodLiveGetCountersPost**](LiveApi.md#indexPhpmethodLiveGetCountersPost) | **POST** /index.php?method&#x3D;Live.getCounters |  |
| [**indexPhpmethodLiveGetLastVisitsDetailsPost**](LiveApi.md#indexPhpmethodLiveGetLastVisitsDetailsPost) | **POST** /index.php?method&#x3D;Live.getLastVisitsDetails |  |
| [**indexPhpmethodLiveGetMostRecentVisitorIdPost**](LiveApi.md#indexPhpmethodLiveGetMostRecentVisitorIdPost) | **POST** /index.php?method&#x3D;Live.getMostRecentVisitorId |  |
| [**indexPhpmethodLiveGetVisitorProfilePost**](LiveApi.md#indexPhpmethodLiveGetVisitorProfilePost) | **POST** /index.php?method&#x3D;Live.getVisitorProfile |  |



## indexPhpmethodLiveGetCountersPost

> indexPhpmethodLiveGetCountersPost(indexPhpMethodLiveGetCountersPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LiveApi apiInstance = new LiveApi(defaultClient);
        IndexPhpMethodLiveGetCountersPostRequest indexPhpMethodLiveGetCountersPostRequest = new IndexPhpMethodLiveGetCountersPostRequest(); // IndexPhpMethodLiveGetCountersPostRequest | 
        try {
            apiInstance.indexPhpmethodLiveGetCountersPost(indexPhpMethodLiveGetCountersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveApi#indexPhpmethodLiveGetCountersPost");
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
| **indexPhpMethodLiveGetCountersPostRequest** | [**IndexPhpMethodLiveGetCountersPostRequest**](IndexPhpMethodLiveGetCountersPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLiveGetLastVisitsDetailsPost

> indexPhpmethodLiveGetLastVisitsDetailsPost(indexPhpMethodLiveGetLastVisitsDetailsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LiveApi apiInstance = new LiveApi(defaultClient);
        IndexPhpMethodLiveGetLastVisitsDetailsPostRequest indexPhpMethodLiveGetLastVisitsDetailsPostRequest = new IndexPhpMethodLiveGetLastVisitsDetailsPostRequest(); // IndexPhpMethodLiveGetLastVisitsDetailsPostRequest | 
        try {
            apiInstance.indexPhpmethodLiveGetLastVisitsDetailsPost(indexPhpMethodLiveGetLastVisitsDetailsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveApi#indexPhpmethodLiveGetLastVisitsDetailsPost");
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
| **indexPhpMethodLiveGetLastVisitsDetailsPostRequest** | [**IndexPhpMethodLiveGetLastVisitsDetailsPostRequest**](IndexPhpMethodLiveGetLastVisitsDetailsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLiveGetMostRecentVisitorIdPost

> indexPhpmethodLiveGetMostRecentVisitorIdPost(indexPhpMethodLiveGetMostRecentVisitorIdPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LiveApi apiInstance = new LiveApi(defaultClient);
        IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest indexPhpMethodLiveGetMostRecentVisitorIdPostRequest = new IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest(); // IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest | 
        try {
            apiInstance.indexPhpmethodLiveGetMostRecentVisitorIdPost(indexPhpMethodLiveGetMostRecentVisitorIdPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveApi#indexPhpmethodLiveGetMostRecentVisitorIdPost");
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
| **indexPhpMethodLiveGetMostRecentVisitorIdPostRequest** | [**IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest**](IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLiveGetVisitorProfilePost

> indexPhpmethodLiveGetVisitorProfilePost(indexPhpMethodLiveGetVisitorProfilePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LiveApi apiInstance = new LiveApi(defaultClient);
        IndexPhpMethodLiveGetVisitorProfilePostRequest indexPhpMethodLiveGetVisitorProfilePostRequest = new IndexPhpMethodLiveGetVisitorProfilePostRequest(); // IndexPhpMethodLiveGetVisitorProfilePostRequest | 
        try {
            apiInstance.indexPhpmethodLiveGetVisitorProfilePost(indexPhpMethodLiveGetVisitorProfilePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveApi#indexPhpmethodLiveGetVisitorProfilePost");
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
| **indexPhpMethodLiveGetVisitorProfilePostRequest** | [**IndexPhpMethodLiveGetVisitorProfilePostRequest**](IndexPhpMethodLiveGetVisitorProfilePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


