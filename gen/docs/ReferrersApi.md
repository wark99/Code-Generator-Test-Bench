# ReferrersApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodReferrersGetAllPost**](ReferrersApi.md#indexPhpmethodReferrersGetAllPost) | **POST** /index.php?method&#x3D;Referrers.getAll |  |
| [**indexPhpmethodReferrersGetCampaignsPost**](ReferrersApi.md#indexPhpmethodReferrersGetCampaignsPost) | **POST** /index.php?method&#x3D;Referrers.getCampaigns |  |
| [**indexPhpmethodReferrersGetKeywordsFromCampaignIdPost**](ReferrersApi.md#indexPhpmethodReferrersGetKeywordsFromCampaignIdPost) | **POST** /index.php?method&#x3D;Referrers.getKeywordsFromCampaignId |  |
| [**indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost**](ReferrersApi.md#indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost) | **POST** /index.php?method&#x3D;Referrers.getKeywordsFromSearchEngineId |  |
| [**indexPhpmethodReferrersGetKeywordsPost**](ReferrersApi.md#indexPhpmethodReferrersGetKeywordsPost) | **POST** /index.php?method&#x3D;Referrers.getKeywords |  |
| [**indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost**](ReferrersApi.md#indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost) | **POST** /index.php?method&#x3D;Referrers.getNumberOfDistinctCampaigns |  |
| [**indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost**](ReferrersApi.md#indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost) | **POST** /index.php?method&#x3D;Referrers.getNumberOfDistinctKeywords |  |
| [**indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost**](ReferrersApi.md#indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost) | **POST** /index.php?method&#x3D;Referrers.getNumberOfDistinctSearchEngines |  |
| [**indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost**](ReferrersApi.md#indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost) | **POST** /index.php?method&#x3D;Referrers.getNumberOfDistinctSocialNetworks |  |
| [**indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost**](ReferrersApi.md#indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost) | **POST** /index.php?method&#x3D;Referrers.getNumberOfDistinctWebsites |  |
| [**indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost**](ReferrersApi.md#indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost) | **POST** /index.php?method&#x3D;Referrers.getNumberOfDistinctWebsitesUrls |  |
| [**indexPhpmethodReferrersGetPost**](ReferrersApi.md#indexPhpmethodReferrersGetPost) | **POST** /index.php?method&#x3D;Referrers.get |  |
| [**indexPhpmethodReferrersGetReferrerTypePost**](ReferrersApi.md#indexPhpmethodReferrersGetReferrerTypePost) | **POST** /index.php?method&#x3D;Referrers.getReferrerType |  |
| [**indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost**](ReferrersApi.md#indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost) | **POST** /index.php?method&#x3D;Referrers.getSearchEnginesFromKeywordId |  |
| [**indexPhpmethodReferrersGetSearchEnginesPost**](ReferrersApi.md#indexPhpmethodReferrersGetSearchEnginesPost) | **POST** /index.php?method&#x3D;Referrers.getSearchEngines |  |
| [**indexPhpmethodReferrersGetSocialsPost**](ReferrersApi.md#indexPhpmethodReferrersGetSocialsPost) | **POST** /index.php?method&#x3D;Referrers.getSocials |  |
| [**indexPhpmethodReferrersGetUrlsForSocialPost**](ReferrersApi.md#indexPhpmethodReferrersGetUrlsForSocialPost) | **POST** /index.php?method&#x3D;Referrers.getUrlsForSocial |  |
| [**indexPhpmethodReferrersGetUrlsFromWebsiteIdPost**](ReferrersApi.md#indexPhpmethodReferrersGetUrlsFromWebsiteIdPost) | **POST** /index.php?method&#x3D;Referrers.getUrlsFromWebsiteId |  |
| [**indexPhpmethodReferrersGetWebsitesPost**](ReferrersApi.md#indexPhpmethodReferrersGetWebsitesPost) | **POST** /index.php?method&#x3D;Referrers.getWebsites |  |



## indexPhpmethodReferrersGetAllPost

> indexPhpmethodReferrersGetAllPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetAllPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetAllPost");
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



## indexPhpmethodReferrersGetCampaignsPost

> indexPhpmethodReferrersGetCampaignsPost(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest indexPhpMethodMarketingCampaignsReportingGetNamePostRequest = new IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest(); // IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetCampaignsPost(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetCampaignsPost");
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



## indexPhpmethodReferrersGetKeywordsFromCampaignIdPost

> indexPhpmethodReferrersGetKeywordsFromCampaignIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetKeywordsFromCampaignIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetKeywordsFromCampaignIdPost");
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



## indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost

> indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost");
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



## indexPhpmethodReferrersGetKeywordsPost

> indexPhpmethodReferrersGetKeywordsPost(indexPhpMethodReferrersGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest = new IndexPhpMethodReferrersGetKeywordsPostRequest(); // IndexPhpMethodReferrersGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetKeywordsPost(indexPhpMethodReferrersGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetKeywordsPost");
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
| **indexPhpMethodReferrersGetKeywordsPostRequest** | [**IndexPhpMethodReferrersGetKeywordsPostRequest**](IndexPhpMethodReferrersGetKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost

> indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost");
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
| **indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest** | [**IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest**](IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost

> indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost");
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
| **indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest** | [**IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest**](IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost

> indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost");
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
| **indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest** | [**IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest**](IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost

> indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost");
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
| **indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest** | [**IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest**](IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost

> indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost");
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
| **indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest** | [**IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest**](IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost

> indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost");
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
| **indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest** | [**IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest**](IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetPost

> indexPhpmethodReferrersGetPost(indexPhpMethodActionsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest = new IndexPhpMethodActionsGetPostRequest(); // IndexPhpMethodActionsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetPost(indexPhpMethodActionsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetPost");
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



## indexPhpmethodReferrersGetReferrerTypePost

> indexPhpmethodReferrersGetReferrerTypePost(indexPhpMethodReferrersGetReferrerTypePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodReferrersGetReferrerTypePostRequest indexPhpMethodReferrersGetReferrerTypePostRequest = new IndexPhpMethodReferrersGetReferrerTypePostRequest(); // IndexPhpMethodReferrersGetReferrerTypePostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetReferrerTypePost(indexPhpMethodReferrersGetReferrerTypePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetReferrerTypePost");
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
| **indexPhpMethodReferrersGetReferrerTypePostRequest** | [**IndexPhpMethodReferrersGetReferrerTypePostRequest**](IndexPhpMethodReferrersGetReferrerTypePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost

> indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost");
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



## indexPhpmethodReferrersGetSearchEnginesPost

> indexPhpmethodReferrersGetSearchEnginesPost(indexPhpMethodReferrersGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest = new IndexPhpMethodReferrersGetKeywordsPostRequest(); // IndexPhpMethodReferrersGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetSearchEnginesPost(indexPhpMethodReferrersGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetSearchEnginesPost");
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
| **indexPhpMethodReferrersGetKeywordsPostRequest** | [**IndexPhpMethodReferrersGetKeywordsPostRequest**](IndexPhpMethodReferrersGetKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetSocialsPost

> indexPhpmethodReferrersGetSocialsPost(indexPhpMethodReferrersGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest = new IndexPhpMethodReferrersGetKeywordsPostRequest(); // IndexPhpMethodReferrersGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetSocialsPost(indexPhpMethodReferrersGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetSocialsPost");
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
| **indexPhpMethodReferrersGetKeywordsPostRequest** | [**IndexPhpMethodReferrersGetKeywordsPostRequest**](IndexPhpMethodReferrersGetKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetUrlsForSocialPost

> indexPhpmethodReferrersGetUrlsForSocialPost(indexPhpMethodReferrersGetUrlsForSocialPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodReferrersGetUrlsForSocialPostRequest indexPhpMethodReferrersGetUrlsForSocialPostRequest = new IndexPhpMethodReferrersGetUrlsForSocialPostRequest(); // IndexPhpMethodReferrersGetUrlsForSocialPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetUrlsForSocialPost(indexPhpMethodReferrersGetUrlsForSocialPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetUrlsForSocialPost");
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
| **indexPhpMethodReferrersGetUrlsForSocialPostRequest** | [**IndexPhpMethodReferrersGetUrlsForSocialPostRequest**](IndexPhpMethodReferrersGetUrlsForSocialPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodReferrersGetUrlsFromWebsiteIdPost

> indexPhpmethodReferrersGetUrlsFromWebsiteIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetUrlsFromWebsiteIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetUrlsFromWebsiteIdPost");
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



## indexPhpmethodReferrersGetWebsitesPost

> indexPhpmethodReferrersGetWebsitesPost(indexPhpMethodReferrersGetKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferrersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ReferrersApi apiInstance = new ReferrersApi(defaultClient);
        IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest = new IndexPhpMethodReferrersGetKeywordsPostRequest(); // IndexPhpMethodReferrersGetKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodReferrersGetWebsitesPost(indexPhpMethodReferrersGetKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferrersApi#indexPhpmethodReferrersGetWebsitesPost");
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
| **indexPhpMethodReferrersGetKeywordsPostRequest** | [**IndexPhpMethodReferrersGetKeywordsPostRequest**](IndexPhpMethodReferrersGetKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


