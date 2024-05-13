# UserCountryApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodUserCountryGetCityPost**](UserCountryApi.md#indexPhpmethodUserCountryGetCityPost) | **POST** /index.php?method&#x3D;UserCountry.getCity |  |
| [**indexPhpmethodUserCountryGetContinentPost**](UserCountryApi.md#indexPhpmethodUserCountryGetContinentPost) | **POST** /index.php?method&#x3D;UserCountry.getContinent |  |
| [**indexPhpmethodUserCountryGetCountryCodeMappingPost**](UserCountryApi.md#indexPhpmethodUserCountryGetCountryCodeMappingPost) | **POST** /index.php?method&#x3D;UserCountry.getCountryCodeMapping |  |
| [**indexPhpmethodUserCountryGetCountryPost**](UserCountryApi.md#indexPhpmethodUserCountryGetCountryPost) | **POST** /index.php?method&#x3D;UserCountry.getCountry |  |
| [**indexPhpmethodUserCountryGetLocationFromIPPost**](UserCountryApi.md#indexPhpmethodUserCountryGetLocationFromIPPost) | **POST** /index.php?method&#x3D;UserCountry.getLocationFromIP |  |
| [**indexPhpmethodUserCountryGetNumberOfDistinctCountriesPost**](UserCountryApi.md#indexPhpmethodUserCountryGetNumberOfDistinctCountriesPost) | **POST** /index.php?method&#x3D;UserCountry.getNumberOfDistinctCountries |  |
| [**indexPhpmethodUserCountryGetRegionPost**](UserCountryApi.md#indexPhpmethodUserCountryGetRegionPost) | **POST** /index.php?method&#x3D;UserCountry.getRegion |  |
| [**indexPhpmethodUserCountrySetLocationProviderPost**](UserCountryApi.md#indexPhpmethodUserCountrySetLocationProviderPost) | **POST** /index.php?method&#x3D;UserCountry.setLocationProvider |  |



## indexPhpmethodUserCountryGetCityPost

> indexPhpmethodUserCountryGetCityPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetCityPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetCityPost");
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



## indexPhpmethodUserCountryGetContinentPost

> indexPhpmethodUserCountryGetContinentPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetContinentPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetContinentPost");
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



## indexPhpmethodUserCountryGetCountryCodeMappingPost

> indexPhpmethodUserCountryGetCountryCodeMappingPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetCountryCodeMappingPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetCountryCodeMappingPost");
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



## indexPhpmethodUserCountryGetCountryPost

> indexPhpmethodUserCountryGetCountryPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetCountryPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetCountryPost");
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



## indexPhpmethodUserCountryGetLocationFromIPPost

> indexPhpmethodUserCountryGetLocationFromIPPost(indexPhpMethodUserCountryGetLocationFromIPPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodUserCountryGetLocationFromIPPostRequest indexPhpMethodUserCountryGetLocationFromIPPostRequest = new IndexPhpMethodUserCountryGetLocationFromIPPostRequest(); // IndexPhpMethodUserCountryGetLocationFromIPPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetLocationFromIPPost(indexPhpMethodUserCountryGetLocationFromIPPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetLocationFromIPPost");
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
| **indexPhpMethodUserCountryGetLocationFromIPPostRequest** | [**IndexPhpMethodUserCountryGetLocationFromIPPostRequest**](IndexPhpMethodUserCountryGetLocationFromIPPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodUserCountryGetNumberOfDistinctCountriesPost

> indexPhpmethodUserCountryGetNumberOfDistinctCountriesPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetNumberOfDistinctCountriesPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetNumberOfDistinctCountriesPost");
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



## indexPhpmethodUserCountryGetRegionPost

> indexPhpmethodUserCountryGetRegionPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountryGetRegionPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountryGetRegionPost");
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



## indexPhpmethodUserCountrySetLocationProviderPost

> indexPhpmethodUserCountrySetLocationProviderPost(indexPhpMethodUserCountrySetLocationProviderPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserCountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserCountryApi apiInstance = new UserCountryApi(defaultClient);
        IndexPhpMethodUserCountrySetLocationProviderPostRequest indexPhpMethodUserCountrySetLocationProviderPostRequest = new IndexPhpMethodUserCountrySetLocationProviderPostRequest(); // IndexPhpMethodUserCountrySetLocationProviderPostRequest | 
        try {
            apiInstance.indexPhpmethodUserCountrySetLocationProviderPost(indexPhpMethodUserCountrySetLocationProviderPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCountryApi#indexPhpmethodUserCountrySetLocationProviderPost");
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
| **indexPhpMethodUserCountrySetLocationProviderPostRequest** | [**IndexPhpMethodUserCountrySetLocationProviderPostRequest**](IndexPhpMethodUserCountrySetLocationProviderPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


