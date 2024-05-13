# FunnelsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodFunnelsDeleteGoalFunnelPost**](FunnelsApi.md#indexPhpmethodFunnelsDeleteGoalFunnelPost) | **POST** /index.php?method&#x3D;Funnels.deleteGoalFunnel |  |
| [**indexPhpmethodFunnelsGetAllActivatedFunnelsForSitePost**](FunnelsApi.md#indexPhpmethodFunnelsGetAllActivatedFunnelsForSitePost) | **POST** /index.php?method&#x3D;Funnels.getAllActivatedFunnelsForSite |  |
| [**indexPhpmethodFunnelsGetAvailablePatternMatchesPost**](FunnelsApi.md#indexPhpmethodFunnelsGetAvailablePatternMatchesPost) | **POST** /index.php?method&#x3D;Funnels.getAvailablePatternMatches |  |
| [**indexPhpmethodFunnelsGetFunnelEntriesPost**](FunnelsApi.md#indexPhpmethodFunnelsGetFunnelEntriesPost) | **POST** /index.php?method&#x3D;Funnels.getFunnelEntries |  |
| [**indexPhpmethodFunnelsGetFunnelExitsPost**](FunnelsApi.md#indexPhpmethodFunnelsGetFunnelExitsPost) | **POST** /index.php?method&#x3D;Funnels.getFunnelExits |  |
| [**indexPhpmethodFunnelsGetFunnelFlowPost**](FunnelsApi.md#indexPhpmethodFunnelsGetFunnelFlowPost) | **POST** /index.php?method&#x3D;Funnels.getFunnelFlow |  |
| [**indexPhpmethodFunnelsGetGoalFunnelPost**](FunnelsApi.md#indexPhpmethodFunnelsGetGoalFunnelPost) | **POST** /index.php?method&#x3D;Funnels.getGoalFunnel |  |
| [**indexPhpmethodFunnelsGetMetricsPost**](FunnelsApi.md#indexPhpmethodFunnelsGetMetricsPost) | **POST** /index.php?method&#x3D;Funnels.getMetrics |  |
| [**indexPhpmethodFunnelsHasAnyActivatedFunnelForSitePost**](FunnelsApi.md#indexPhpmethodFunnelsHasAnyActivatedFunnelForSitePost) | **POST** /index.php?method&#x3D;Funnels.hasAnyActivatedFunnelForSite |  |
| [**indexPhpmethodFunnelsSetGoalFunnelPost**](FunnelsApi.md#indexPhpmethodFunnelsSetGoalFunnelPost) | **POST** /index.php?method&#x3D;Funnels.setGoalFunnel |  |
| [**indexPhpmethodFunnelsTestUrlMatchesStepsPost**](FunnelsApi.md#indexPhpmethodFunnelsTestUrlMatchesStepsPost) | **POST** /index.php?method&#x3D;Funnels.testUrlMatchesSteps |  |



## indexPhpmethodFunnelsDeleteGoalFunnelPost

> indexPhpmethodFunnelsDeleteGoalFunnelPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest = new IndexPhpMethodFunnelsGetGoalFunnelPostRequest(); // IndexPhpMethodFunnelsGetGoalFunnelPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsDeleteGoalFunnelPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsDeleteGoalFunnelPost");
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
| **indexPhpMethodFunnelsGetGoalFunnelPostRequest** | [**IndexPhpMethodFunnelsGetGoalFunnelPostRequest**](IndexPhpMethodFunnelsGetGoalFunnelPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsGetAllActivatedFunnelsForSitePost

> indexPhpmethodFunnelsGetAllActivatedFunnelsForSitePost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetAllActivatedFunnelsForSitePost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetAllActivatedFunnelsForSitePost");
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



## indexPhpmethodFunnelsGetAvailablePatternMatchesPost

> indexPhpmethodFunnelsGetAvailablePatternMatchesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetAvailablePatternMatchesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetAvailablePatternMatchesPost");
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



## indexPhpmethodFunnelsGetFunnelEntriesPost

> indexPhpmethodFunnelsGetFunnelEntriesPost(indexPhpMethodFunnelsGetFunnelEntriesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsGetFunnelEntriesPostRequest indexPhpMethodFunnelsGetFunnelEntriesPostRequest = new IndexPhpMethodFunnelsGetFunnelEntriesPostRequest(); // IndexPhpMethodFunnelsGetFunnelEntriesPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetFunnelEntriesPost(indexPhpMethodFunnelsGetFunnelEntriesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetFunnelEntriesPost");
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
| **indexPhpMethodFunnelsGetFunnelEntriesPostRequest** | [**IndexPhpMethodFunnelsGetFunnelEntriesPostRequest**](IndexPhpMethodFunnelsGetFunnelEntriesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsGetFunnelExitsPost

> indexPhpmethodFunnelsGetFunnelExitsPost(indexPhpMethodFunnelsGetFunnelExitsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsGetFunnelExitsPostRequest indexPhpMethodFunnelsGetFunnelExitsPostRequest = new IndexPhpMethodFunnelsGetFunnelExitsPostRequest(); // IndexPhpMethodFunnelsGetFunnelExitsPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetFunnelExitsPost(indexPhpMethodFunnelsGetFunnelExitsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetFunnelExitsPost");
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
| **indexPhpMethodFunnelsGetFunnelExitsPostRequest** | [**IndexPhpMethodFunnelsGetFunnelExitsPostRequest**](IndexPhpMethodFunnelsGetFunnelExitsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsGetFunnelFlowPost

> indexPhpmethodFunnelsGetFunnelFlowPost(indexPhpMethodFunnelsGetMetricsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsGetMetricsPostRequest indexPhpMethodFunnelsGetMetricsPostRequest = new IndexPhpMethodFunnelsGetMetricsPostRequest(); // IndexPhpMethodFunnelsGetMetricsPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetFunnelFlowPost(indexPhpMethodFunnelsGetMetricsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetFunnelFlowPost");
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
| **indexPhpMethodFunnelsGetMetricsPostRequest** | [**IndexPhpMethodFunnelsGetMetricsPostRequest**](IndexPhpMethodFunnelsGetMetricsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsGetGoalFunnelPost

> indexPhpmethodFunnelsGetGoalFunnelPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest = new IndexPhpMethodFunnelsGetGoalFunnelPostRequest(); // IndexPhpMethodFunnelsGetGoalFunnelPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetGoalFunnelPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetGoalFunnelPost");
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
| **indexPhpMethodFunnelsGetGoalFunnelPostRequest** | [**IndexPhpMethodFunnelsGetGoalFunnelPostRequest**](IndexPhpMethodFunnelsGetGoalFunnelPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsGetMetricsPost

> indexPhpmethodFunnelsGetMetricsPost(indexPhpMethodFunnelsGetMetricsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsGetMetricsPostRequest indexPhpMethodFunnelsGetMetricsPostRequest = new IndexPhpMethodFunnelsGetMetricsPostRequest(); // IndexPhpMethodFunnelsGetMetricsPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsGetMetricsPost(indexPhpMethodFunnelsGetMetricsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsGetMetricsPost");
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
| **indexPhpMethodFunnelsGetMetricsPostRequest** | [**IndexPhpMethodFunnelsGetMetricsPostRequest**](IndexPhpMethodFunnelsGetMetricsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsHasAnyActivatedFunnelForSitePost

> indexPhpmethodFunnelsHasAnyActivatedFunnelForSitePost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsHasAnyActivatedFunnelForSitePost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsHasAnyActivatedFunnelForSitePost");
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



## indexPhpmethodFunnelsSetGoalFunnelPost

> indexPhpmethodFunnelsSetGoalFunnelPost(indexPhpMethodFunnelsSetGoalFunnelPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsSetGoalFunnelPostRequest indexPhpMethodFunnelsSetGoalFunnelPostRequest = new IndexPhpMethodFunnelsSetGoalFunnelPostRequest(); // IndexPhpMethodFunnelsSetGoalFunnelPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsSetGoalFunnelPost(indexPhpMethodFunnelsSetGoalFunnelPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsSetGoalFunnelPost");
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
| **indexPhpMethodFunnelsSetGoalFunnelPostRequest** | [**IndexPhpMethodFunnelsSetGoalFunnelPostRequest**](IndexPhpMethodFunnelsSetGoalFunnelPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFunnelsTestUrlMatchesStepsPost

> indexPhpmethodFunnelsTestUrlMatchesStepsPost(indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FunnelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FunnelsApi apiInstance = new FunnelsApi(defaultClient);
        IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest = new IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest(); // IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest | 
        try {
            apiInstance.indexPhpmethodFunnelsTestUrlMatchesStepsPost(indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunnelsApi#indexPhpmethodFunnelsTestUrlMatchesStepsPost");
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
| **indexPhpMethodFunnelsTestUrlMatchesStepsPostRequest** | [**IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest**](IndexPhpMethodFunnelsTestUrlMatchesStepsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


