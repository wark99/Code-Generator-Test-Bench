# EventsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodEventsGetActionFromCategoryIdPost**](EventsApi.md#indexPhpmethodEventsGetActionFromCategoryIdPost) | **POST** /index.php?method&#x3D;Events.getActionFromCategoryId |  |
| [**indexPhpmethodEventsGetActionFromNameIdPost**](EventsApi.md#indexPhpmethodEventsGetActionFromNameIdPost) | **POST** /index.php?method&#x3D;Events.getActionFromNameId |  |
| [**indexPhpmethodEventsGetActionPost**](EventsApi.md#indexPhpmethodEventsGetActionPost) | **POST** /index.php?method&#x3D;Events.getAction |  |
| [**indexPhpmethodEventsGetCategoryFromActionIdPost**](EventsApi.md#indexPhpmethodEventsGetCategoryFromActionIdPost) | **POST** /index.php?method&#x3D;Events.getCategoryFromActionId |  |
| [**indexPhpmethodEventsGetCategoryFromNameIdPost**](EventsApi.md#indexPhpmethodEventsGetCategoryFromNameIdPost) | **POST** /index.php?method&#x3D;Events.getCategoryFromNameId |  |
| [**indexPhpmethodEventsGetCategoryPost**](EventsApi.md#indexPhpmethodEventsGetCategoryPost) | **POST** /index.php?method&#x3D;Events.getCategory |  |
| [**indexPhpmethodEventsGetNameFromActionIdPost**](EventsApi.md#indexPhpmethodEventsGetNameFromActionIdPost) | **POST** /index.php?method&#x3D;Events.getNameFromActionId |  |
| [**indexPhpmethodEventsGetNameFromCategoryIdPost**](EventsApi.md#indexPhpmethodEventsGetNameFromCategoryIdPost) | **POST** /index.php?method&#x3D;Events.getNameFromCategoryId |  |
| [**indexPhpmethodEventsGetNamePost**](EventsApi.md#indexPhpmethodEventsGetNamePost) | **POST** /index.php?method&#x3D;Events.getName |  |



## indexPhpmethodEventsGetActionFromCategoryIdPost

> indexPhpmethodEventsGetActionFromCategoryIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetActionFromCategoryIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetActionFromCategoryIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetActionFromNameIdPost

> indexPhpmethodEventsGetActionFromNameIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetActionFromNameIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetActionFromNameIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetActionPost

> indexPhpmethodEventsGetActionPost(indexPhpMethodEventsGetCategoryPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodEventsGetCategoryPostRequest indexPhpMethodEventsGetCategoryPostRequest = new IndexPhpMethodEventsGetCategoryPostRequest(); // IndexPhpMethodEventsGetCategoryPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetActionPost(indexPhpMethodEventsGetCategoryPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetActionPost");
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
| **indexPhpMethodEventsGetCategoryPostRequest** | [**IndexPhpMethodEventsGetCategoryPostRequest**](IndexPhpMethodEventsGetCategoryPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetCategoryFromActionIdPost

> indexPhpmethodEventsGetCategoryFromActionIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetCategoryFromActionIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetCategoryFromActionIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetCategoryFromNameIdPost

> indexPhpmethodEventsGetCategoryFromNameIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetCategoryFromNameIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetCategoryFromNameIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetCategoryPost

> indexPhpmethodEventsGetCategoryPost(indexPhpMethodEventsGetCategoryPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodEventsGetCategoryPostRequest indexPhpMethodEventsGetCategoryPostRequest = new IndexPhpMethodEventsGetCategoryPostRequest(); // IndexPhpMethodEventsGetCategoryPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetCategoryPost(indexPhpMethodEventsGetCategoryPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetCategoryPost");
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
| **indexPhpMethodEventsGetCategoryPostRequest** | [**IndexPhpMethodEventsGetCategoryPostRequest**](IndexPhpMethodEventsGetCategoryPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetNameFromActionIdPost

> indexPhpmethodEventsGetNameFromActionIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetNameFromActionIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetNameFromActionIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetNameFromCategoryIdPost

> indexPhpmethodEventsGetNameFromCategoryIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetNameFromCategoryIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetNameFromCategoryIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodEventsGetNamePost

> indexPhpmethodEventsGetNamePost(indexPhpMethodEventsGetCategoryPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        IndexPhpMethodEventsGetCategoryPostRequest indexPhpMethodEventsGetCategoryPostRequest = new IndexPhpMethodEventsGetCategoryPostRequest(); // IndexPhpMethodEventsGetCategoryPostRequest | 
        try {
            apiInstance.indexPhpmethodEventsGetNamePost(indexPhpMethodEventsGetCategoryPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#indexPhpmethodEventsGetNamePost");
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
| **indexPhpMethodEventsGetCategoryPostRequest** | [**IndexPhpMethodEventsGetCategoryPostRequest**](IndexPhpMethodEventsGetCategoryPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


