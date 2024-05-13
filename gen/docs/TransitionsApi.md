# TransitionsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodTransitionsGetTransitionsForActionPost**](TransitionsApi.md#indexPhpmethodTransitionsGetTransitionsForActionPost) | **POST** /index.php?method&#x3D;Transitions.getTransitionsForAction |  |
| [**indexPhpmethodTransitionsGetTransitionsForPageTitlePost**](TransitionsApi.md#indexPhpmethodTransitionsGetTransitionsForPageTitlePost) | **POST** /index.php?method&#x3D;Transitions.getTransitionsForPageTitle |  |
| [**indexPhpmethodTransitionsGetTransitionsForPageUrlPost**](TransitionsApi.md#indexPhpmethodTransitionsGetTransitionsForPageUrlPost) | **POST** /index.php?method&#x3D;Transitions.getTransitionsForPageUrl |  |
| [**indexPhpmethodTransitionsGetTranslationsPost**](TransitionsApi.md#indexPhpmethodTransitionsGetTranslationsPost) | **POST** /index.php?method&#x3D;Transitions.getTranslations |  |
| [**indexPhpmethodTransitionsIsPeriodAllowedPost**](TransitionsApi.md#indexPhpmethodTransitionsIsPeriodAllowedPost) | **POST** /index.php?method&#x3D;Transitions.isPeriodAllowed |  |



## indexPhpmethodTransitionsGetTransitionsForActionPost

> indexPhpmethodTransitionsGetTransitionsForActionPost(indexPhpMethodTransitionsGetTransitionsForActionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        TransitionsApi apiInstance = new TransitionsApi(defaultClient);
        IndexPhpMethodTransitionsGetTransitionsForActionPostRequest indexPhpMethodTransitionsGetTransitionsForActionPostRequest = new IndexPhpMethodTransitionsGetTransitionsForActionPostRequest(); // IndexPhpMethodTransitionsGetTransitionsForActionPostRequest | 
        try {
            apiInstance.indexPhpmethodTransitionsGetTransitionsForActionPost(indexPhpMethodTransitionsGetTransitionsForActionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransitionsApi#indexPhpmethodTransitionsGetTransitionsForActionPost");
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
| **indexPhpMethodTransitionsGetTransitionsForActionPostRequest** | [**IndexPhpMethodTransitionsGetTransitionsForActionPostRequest**](IndexPhpMethodTransitionsGetTransitionsForActionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodTransitionsGetTransitionsForPageTitlePost

> indexPhpmethodTransitionsGetTransitionsForPageTitlePost(indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        TransitionsApi apiInstance = new TransitionsApi(defaultClient);
        IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest = new IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest(); // IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest | 
        try {
            apiInstance.indexPhpmethodTransitionsGetTransitionsForPageTitlePost(indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransitionsApi#indexPhpmethodTransitionsGetTransitionsForPageTitlePost");
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
| **indexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest** | [**IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest**](IndexPhpMethodTransitionsGetTransitionsForPageTitlePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodTransitionsGetTransitionsForPageUrlPost

> indexPhpmethodTransitionsGetTransitionsForPageUrlPost(indexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        TransitionsApi apiInstance = new TransitionsApi(defaultClient);
        IndexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest indexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest = new IndexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest(); // IndexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodTransitionsGetTransitionsForPageUrlPost(indexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransitionsApi#indexPhpmethodTransitionsGetTransitionsForPageUrlPost");
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
| **indexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest** | [**IndexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest**](IndexPhpMethodTransitionsGetTransitionsForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodTransitionsGetTranslationsPost

> indexPhpmethodTransitionsGetTranslationsPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        TransitionsApi apiInstance = new TransitionsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodTransitionsGetTranslationsPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransitionsApi#indexPhpmethodTransitionsGetTranslationsPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodTransitionsIsPeriodAllowedPost

> indexPhpmethodTransitionsIsPeriodAllowedPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        TransitionsApi apiInstance = new TransitionsApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodTransitionsIsPeriodAllowedPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransitionsApi#indexPhpmethodTransitionsIsPeriodAllowedPost");
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
| **indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest** | [**IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest**](IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


