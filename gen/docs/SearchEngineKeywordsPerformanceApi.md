# SearchEngineKeywordsPerformanceApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getCrawlingErrorExamplesBing |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getCrawlingOverviewBing |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getCrawlingOverviewYandex |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsBing |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsGoogleImage |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsGoogleNews |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsGoogle |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsGoogleVideo |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsGoogleWeb |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsImported |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywords |  |
| [**indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost**](SearchEngineKeywordsPerformanceApi.md#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost) | **POST** /index.php?method&#x3D;SearchEngineKeywordsPerformance.getKeywordsYandex |  |



## indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost");
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
| **indexPhpMethodAPIGetReportPagesMetadataPostRequest** | [**IndexPhpMethodAPIGetReportPagesMetadataPostRequest**](IndexPhpMethodAPIGetReportPagesMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost");
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



## indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost

> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchEngineKeywordsPerformanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SearchEngineKeywordsPerformanceApi apiInstance = new SearchEngineKeywordsPerformanceApi(defaultClient);
        IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest = new IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest(); // IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEngineKeywordsPerformanceApi#indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost");
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


