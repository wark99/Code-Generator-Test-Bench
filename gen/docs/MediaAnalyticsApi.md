# MediaAnalyticsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodMediaAnalyticsGetAudioHoursPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetAudioHoursPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getAudioHours |  |
| [**indexPhpmethodMediaAnalyticsGetAudioResourcesPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetAudioResourcesPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getAudioResources |  |
| [**indexPhpmethodMediaAnalyticsGetAudioTitlesPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetAudioTitlesPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getAudioTitles |  |
| [**indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getCurrentMostPlays |  |
| [**indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getCurrentNumPlays |  |
| [**indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getCurrentSumTimeSpent |  |
| [**indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getGroupedAudioResources |  |
| [**indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getGroupedVideoResources |  |
| [**indexPhpmethodMediaAnalyticsGetPlayersPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetPlayersPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getPlayers |  |
| [**indexPhpmethodMediaAnalyticsGetPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetPost) | **POST** /index.php?method&#x3D;MediaAnalytics.get |  |
| [**indexPhpmethodMediaAnalyticsGetVideoHoursPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetVideoHoursPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getVideoHours |  |
| [**indexPhpmethodMediaAnalyticsGetVideoResolutionsPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetVideoResolutionsPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getVideoResolutions |  |
| [**indexPhpmethodMediaAnalyticsGetVideoResourcesPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetVideoResourcesPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getVideoResources |  |
| [**indexPhpmethodMediaAnalyticsGetVideoTitlesPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsGetVideoTitlesPost) | **POST** /index.php?method&#x3D;MediaAnalytics.getVideoTitles |  |
| [**indexPhpmethodMediaAnalyticsHasRecordsPost**](MediaAnalyticsApi.md#indexPhpmethodMediaAnalyticsHasRecordsPost) | **POST** /index.php?method&#x3D;MediaAnalytics.hasRecords |  |



## indexPhpmethodMediaAnalyticsGetAudioHoursPost

> indexPhpmethodMediaAnalyticsGetAudioHoursPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetAudioHoursPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetAudioHoursPost");
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



## indexPhpmethodMediaAnalyticsGetAudioResourcesPost

> indexPhpmethodMediaAnalyticsGetAudioResourcesPost(indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest = new IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest(); // IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetAudioResourcesPost(indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetAudioResourcesPost");
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
| **indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest** | [**IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest**](IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetAudioTitlesPost

> indexPhpmethodMediaAnalyticsGetAudioTitlesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest = new IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest(); // IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetAudioTitlesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetAudioTitlesPost");
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
| **indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest** | [**IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest**](IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost

> indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost(indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest = new IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest(); // IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost(indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost");
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
| **indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest** | [**IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest**](IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost

> indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost(indexPhpMethodFormAnalyticsGetCountersPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest = new IndexPhpMethodFormAnalyticsGetCountersPostRequest(); // IndexPhpMethodFormAnalyticsGetCountersPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost(indexPhpMethodFormAnalyticsGetCountersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost");
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
| **indexPhpMethodFormAnalyticsGetCountersPostRequest** | [**IndexPhpMethodFormAnalyticsGetCountersPostRequest**](IndexPhpMethodFormAnalyticsGetCountersPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost

> indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost(indexPhpMethodFormAnalyticsGetCountersPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest = new IndexPhpMethodFormAnalyticsGetCountersPostRequest(); // IndexPhpMethodFormAnalyticsGetCountersPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost(indexPhpMethodFormAnalyticsGetCountersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost");
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
| **indexPhpMethodFormAnalyticsGetCountersPostRequest** | [**IndexPhpMethodFormAnalyticsGetCountersPostRequest**](IndexPhpMethodFormAnalyticsGetCountersPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost

> indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest = new IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest(); // IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost");
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
| **indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest** | [**IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest**](IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost

> indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest = new IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest(); // IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost");
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
| **indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest** | [**IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest**](IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetPlayersPost

> indexPhpmethodMediaAnalyticsGetPlayersPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetPlayersPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetPlayersPost");
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



## indexPhpmethodMediaAnalyticsGetPost

> indexPhpmethodMediaAnalyticsGetPost(indexPhpMethodActionsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest = new IndexPhpMethodActionsGetPostRequest(); // IndexPhpMethodActionsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetPost(indexPhpMethodActionsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetPost");
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



## indexPhpmethodMediaAnalyticsGetVideoHoursPost

> indexPhpmethodMediaAnalyticsGetVideoHoursPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetVideoHoursPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetVideoHoursPost");
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



## indexPhpmethodMediaAnalyticsGetVideoResolutionsPost

> indexPhpmethodMediaAnalyticsGetVideoResolutionsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetVideoResolutionsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetVideoResolutionsPost");
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



## indexPhpmethodMediaAnalyticsGetVideoResourcesPost

> indexPhpmethodMediaAnalyticsGetVideoResourcesPost(indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest = new IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest(); // IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetVideoResourcesPost(indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetVideoResourcesPost");
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
| **indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest** | [**IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest**](IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsGetVideoTitlesPost

> indexPhpmethodMediaAnalyticsGetVideoTitlesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest = new IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest(); // IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsGetVideoTitlesPost(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsGetVideoTitlesPost");
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
| **indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest** | [**IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest**](IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMediaAnalyticsHasRecordsPost

> indexPhpmethodMediaAnalyticsHasRecordsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MediaAnalyticsApi apiInstance = new MediaAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodMediaAnalyticsHasRecordsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaAnalyticsApi#indexPhpmethodMediaAnalyticsHasRecordsPost");
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


