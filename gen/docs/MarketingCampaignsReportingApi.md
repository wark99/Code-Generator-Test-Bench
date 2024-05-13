# MarketingCampaignsReportingApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodMarketingCampaignsReportingGetContentPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetContentPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getContent |  |
| [**indexPhpmethodMarketingCampaignsReportingGetGroupPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetGroupPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getGroup |  |
| [**indexPhpmethodMarketingCampaignsReportingGetIdPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetIdPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getId |  |
| [**indexPhpmethodMarketingCampaignsReportingGetKeywordContentFromNameIdPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetKeywordContentFromNameIdPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getKeywordContentFromNameId |  |
| [**indexPhpmethodMarketingCampaignsReportingGetKeywordPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetKeywordPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getKeyword |  |
| [**indexPhpmethodMarketingCampaignsReportingGetMediumPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetMediumPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getMedium |  |
| [**indexPhpmethodMarketingCampaignsReportingGetNameFromSourceMediumIdPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetNameFromSourceMediumIdPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getNameFromSourceMediumId |  |
| [**indexPhpmethodMarketingCampaignsReportingGetNamePost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetNamePost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getName |  |
| [**indexPhpmethodMarketingCampaignsReportingGetPlacementPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetPlacementPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getPlacement |  |
| [**indexPhpmethodMarketingCampaignsReportingGetSourceMediumPost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetSourceMediumPost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getSourceMedium |  |
| [**indexPhpmethodMarketingCampaignsReportingGetSourcePost**](MarketingCampaignsReportingApi.md#indexPhpmethodMarketingCampaignsReportingGetSourcePost) | **POST** /index.php?method&#x3D;MarketingCampaignsReporting.getSource |  |



## indexPhpmethodMarketingCampaignsReportingGetContentPost

> indexPhpmethodMarketingCampaignsReportingGetContentPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetContentPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetContentPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetGroupPost

> indexPhpmethodMarketingCampaignsReportingGetGroupPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetGroupPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetGroupPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetIdPost

> indexPhpmethodMarketingCampaignsReportingGetIdPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetIdPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetIdPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetKeywordContentFromNameIdPost

> indexPhpmethodMarketingCampaignsReportingGetKeywordContentFromNameIdPost(indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest = new IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest(); // IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetKeywordContentFromNameIdPost(indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetKeywordContentFromNameIdPost");
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
| **indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest** | [**IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest**](IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetKeywordPost

> indexPhpmethodMarketingCampaignsReportingGetKeywordPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetKeywordPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetKeywordPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetMediumPost

> indexPhpmethodMarketingCampaignsReportingGetMediumPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetMediumPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetMediumPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetNameFromSourceMediumIdPost

> indexPhpmethodMarketingCampaignsReportingGetNameFromSourceMediumIdPost(indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest = new IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest(); // IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetNameFromSourceMediumIdPost(indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetNameFromSourceMediumIdPost");
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
| **indexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest** | [**IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest**](IndexPhpMethodMarketingCampaignsReportingGetKeywordContentFromNameIdPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetNamePost

> indexPhpmethodMarketingCampaignsReportingGetNamePost(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest indexPhpMethodMarketingCampaignsReportingGetNamePostRequest = new IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest(); // IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetNamePost(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetNamePost");
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
| **indexPhpMethodMarketingCampaignsReportingGetNamePostRequest** | [**IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest**](IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetPlacementPost

> indexPhpmethodMarketingCampaignsReportingGetPlacementPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetPlacementPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetPlacementPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetSourceMediumPost

> indexPhpmethodMarketingCampaignsReportingGetSourceMediumPost(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest indexPhpMethodMarketingCampaignsReportingGetNamePostRequest = new IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest(); // IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetSourceMediumPost(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetSourceMediumPost");
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
| **indexPhpMethodMarketingCampaignsReportingGetNamePostRequest** | [**IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest**](IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMarketingCampaignsReportingGetSourcePost

> indexPhpmethodMarketingCampaignsReportingGetSourcePost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketingCampaignsReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MarketingCampaignsReportingApi apiInstance = new MarketingCampaignsReportingApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodMarketingCampaignsReportingGetSourcePost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketingCampaignsReportingApi#indexPhpmethodMarketingCampaignsReportingGetSourcePost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


