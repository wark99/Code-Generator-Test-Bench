# ActionsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodActionsGetDownloadPost**](ActionsApi.md#indexPhpmethodActionsGetDownloadPost) | **POST** /index.php?method&#x3D;Actions.getDownload |  |
| [**indexPhpmethodActionsGetDownloadsPost**](ActionsApi.md#indexPhpmethodActionsGetDownloadsPost) | **POST** /index.php?method&#x3D;Actions.getDownloads |  |
| [**indexPhpmethodActionsGetEntryPageTitlesPost**](ActionsApi.md#indexPhpmethodActionsGetEntryPageTitlesPost) | **POST** /index.php?method&#x3D;Actions.getEntryPageTitles |  |
| [**indexPhpmethodActionsGetEntryPageUrlsPost**](ActionsApi.md#indexPhpmethodActionsGetEntryPageUrlsPost) | **POST** /index.php?method&#x3D;Actions.getEntryPageUrls |  |
| [**indexPhpmethodActionsGetExitPageTitlesPost**](ActionsApi.md#indexPhpmethodActionsGetExitPageTitlesPost) | **POST** /index.php?method&#x3D;Actions.getExitPageTitles |  |
| [**indexPhpmethodActionsGetExitPageUrlsPost**](ActionsApi.md#indexPhpmethodActionsGetExitPageUrlsPost) | **POST** /index.php?method&#x3D;Actions.getExitPageUrls |  |
| [**indexPhpmethodActionsGetOutlinkPost**](ActionsApi.md#indexPhpmethodActionsGetOutlinkPost) | **POST** /index.php?method&#x3D;Actions.getOutlink |  |
| [**indexPhpmethodActionsGetOutlinksPost**](ActionsApi.md#indexPhpmethodActionsGetOutlinksPost) | **POST** /index.php?method&#x3D;Actions.getOutlinks |  |
| [**indexPhpmethodActionsGetPageTitlePost**](ActionsApi.md#indexPhpmethodActionsGetPageTitlePost) | **POST** /index.php?method&#x3D;Actions.getPageTitle |  |
| [**indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost**](ActionsApi.md#indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost) | **POST** /index.php?method&#x3D;Actions.getPageTitlesFollowingSiteSearch |  |
| [**indexPhpmethodActionsGetPageTitlesPost**](ActionsApi.md#indexPhpmethodActionsGetPageTitlesPost) | **POST** /index.php?method&#x3D;Actions.getPageTitles |  |
| [**indexPhpmethodActionsGetPageUrlPost**](ActionsApi.md#indexPhpmethodActionsGetPageUrlPost) | **POST** /index.php?method&#x3D;Actions.getPageUrl |  |
| [**indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost**](ActionsApi.md#indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost) | **POST** /index.php?method&#x3D;Actions.getPageUrlsFollowingSiteSearch |  |
| [**indexPhpmethodActionsGetPageUrlsPost**](ActionsApi.md#indexPhpmethodActionsGetPageUrlsPost) | **POST** /index.php?method&#x3D;Actions.getPageUrls |  |
| [**indexPhpmethodActionsGetPost**](ActionsApi.md#indexPhpmethodActionsGetPost) | **POST** /index.php?method&#x3D;Actions.get |  |
| [**indexPhpmethodActionsGetSiteSearchCategoriesPost**](ActionsApi.md#indexPhpmethodActionsGetSiteSearchCategoriesPost) | **POST** /index.php?method&#x3D;Actions.getSiteSearchCategories |  |
| [**indexPhpmethodActionsGetSiteSearchKeywordsPost**](ActionsApi.md#indexPhpmethodActionsGetSiteSearchKeywordsPost) | **POST** /index.php?method&#x3D;Actions.getSiteSearchKeywords |  |
| [**indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost**](ActionsApi.md#indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost) | **POST** /index.php?method&#x3D;Actions.getSiteSearchNoResultKeywords |  |



## indexPhpmethodActionsGetDownloadPost

> indexPhpmethodActionsGetDownloadPost(indexPhpMethodActionsGetDownloadPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetDownloadPostRequest indexPhpMethodActionsGetDownloadPostRequest = new IndexPhpMethodActionsGetDownloadPostRequest(); // IndexPhpMethodActionsGetDownloadPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetDownloadPost(indexPhpMethodActionsGetDownloadPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetDownloadPost");
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
| **indexPhpMethodActionsGetDownloadPostRequest** | [**IndexPhpMethodActionsGetDownloadPostRequest**](IndexPhpMethodActionsGetDownloadPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetDownloadsPost

> indexPhpmethodActionsGetDownloadsPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetDownloadsPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetDownloadsPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetEntryPageTitlesPost

> indexPhpmethodActionsGetEntryPageTitlesPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetEntryPageTitlesPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetEntryPageTitlesPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetEntryPageUrlsPost

> indexPhpmethodActionsGetEntryPageUrlsPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetEntryPageUrlsPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetEntryPageUrlsPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetExitPageTitlesPost

> indexPhpmethodActionsGetExitPageTitlesPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetExitPageTitlesPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetExitPageTitlesPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetExitPageUrlsPost

> indexPhpmethodActionsGetExitPageUrlsPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetExitPageUrlsPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetExitPageUrlsPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetOutlinkPost

> indexPhpmethodActionsGetOutlinkPost(indexPhpMethodActionsGetOutlinkPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetOutlinkPostRequest indexPhpMethodActionsGetOutlinkPostRequest = new IndexPhpMethodActionsGetOutlinkPostRequest(); // IndexPhpMethodActionsGetOutlinkPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetOutlinkPost(indexPhpMethodActionsGetOutlinkPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetOutlinkPost");
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
| **indexPhpMethodActionsGetOutlinkPostRequest** | [**IndexPhpMethodActionsGetOutlinkPostRequest**](IndexPhpMethodActionsGetOutlinkPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetOutlinksPost

> indexPhpmethodActionsGetOutlinksPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetOutlinksPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetOutlinksPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPageTitlePost

> indexPhpmethodActionsGetPageTitlePost(indexPhpMethodActionsGetPageTitlePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetPageTitlePostRequest indexPhpMethodActionsGetPageTitlePostRequest = new IndexPhpMethodActionsGetPageTitlePostRequest(); // IndexPhpMethodActionsGetPageTitlePostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPageTitlePost(indexPhpMethodActionsGetPageTitlePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPageTitlePost");
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
| **indexPhpMethodActionsGetPageTitlePostRequest** | [**IndexPhpMethodActionsGetPageTitlePostRequest**](IndexPhpMethodActionsGetPageTitlePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost

> indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost(indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest = new IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest(); // IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost(indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost");
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
| **indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest** | [**IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest**](IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPageTitlesPost

> indexPhpmethodActionsGetPageTitlesPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest = new IndexPhpMethodActionsGetEntryPageUrlsPostRequest(); // IndexPhpMethodActionsGetEntryPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPageTitlesPost(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPageTitlesPost");
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
| **indexPhpMethodActionsGetEntryPageUrlsPostRequest** | [**IndexPhpMethodActionsGetEntryPageUrlsPostRequest**](IndexPhpMethodActionsGetEntryPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPageUrlPost

> indexPhpmethodActionsGetPageUrlPost(indexPhpMethodActionsGetPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetPageUrlPostRequest indexPhpMethodActionsGetPageUrlPostRequest = new IndexPhpMethodActionsGetPageUrlPostRequest(); // IndexPhpMethodActionsGetPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPageUrlPost(indexPhpMethodActionsGetPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPageUrlPost");
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
| **indexPhpMethodActionsGetPageUrlPostRequest** | [**IndexPhpMethodActionsGetPageUrlPostRequest**](IndexPhpMethodActionsGetPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost

> indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost(indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest = new IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest(); // IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost(indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost");
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
| **indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest** | [**IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest**](IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPageUrlsPost

> indexPhpmethodActionsGetPageUrlsPost(indexPhpMethodActionsGetPageUrlsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetPageUrlsPostRequest indexPhpMethodActionsGetPageUrlsPostRequest = new IndexPhpMethodActionsGetPageUrlsPostRequest(); // IndexPhpMethodActionsGetPageUrlsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPageUrlsPost(indexPhpMethodActionsGetPageUrlsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPageUrlsPost");
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
| **indexPhpMethodActionsGetPageUrlsPostRequest** | [**IndexPhpMethodActionsGetPageUrlsPostRequest**](IndexPhpMethodActionsGetPageUrlsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetPost

> indexPhpmethodActionsGetPost(indexPhpMethodActionsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest = new IndexPhpMethodActionsGetPostRequest(); // IndexPhpMethodActionsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetPost(indexPhpMethodActionsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetPost");
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
| **indexPhpMethodActionsGetPostRequest** | [**IndexPhpMethodActionsGetPostRequest**](IndexPhpMethodActionsGetPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActionsGetSiteSearchCategoriesPost

> indexPhpmethodActionsGetSiteSearchCategoriesPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetSiteSearchCategoriesPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetSiteSearchCategoriesPost");
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



## indexPhpmethodActionsGetSiteSearchKeywordsPost

> indexPhpmethodActionsGetSiteSearchKeywordsPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetSiteSearchKeywordsPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetSiteSearchKeywordsPost");
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



## indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost

> indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost");
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


