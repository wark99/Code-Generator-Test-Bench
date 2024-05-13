# ApiApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodAPIGetBulkRequestPost**](ApiApi.md#indexPhpmethodAPIGetBulkRequestPost) | **POST** /index.php?method&#x3D;API.getBulkRequest |  |
| [**indexPhpmethodAPIGetGlossaryMetricsPost**](ApiApi.md#indexPhpmethodAPIGetGlossaryMetricsPost) | **POST** /index.php?method&#x3D;API.getGlossaryMetrics |  |
| [**indexPhpmethodAPIGetGlossaryReportsPost**](ApiApi.md#indexPhpmethodAPIGetGlossaryReportsPost) | **POST** /index.php?method&#x3D;API.getGlossaryReports |  |
| [**indexPhpmethodAPIGetIpFromHeaderPost**](ApiApi.md#indexPhpmethodAPIGetIpFromHeaderPost) | **POST** /index.php?method&#x3D;API.getIpFromHeader |  |
| [**indexPhpmethodAPIGetMatomoVersionPost**](ApiApi.md#indexPhpmethodAPIGetMatomoVersionPost) | **POST** /index.php?method&#x3D;API.getMatomoVersion |  |
| [**indexPhpmethodAPIGetMetadataPost**](ApiApi.md#indexPhpmethodAPIGetMetadataPost) | **POST** /index.php?method&#x3D;API.getMetadata |  |
| [**indexPhpmethodAPIGetPagesComparisonsDisabledForPost**](ApiApi.md#indexPhpmethodAPIGetPagesComparisonsDisabledForPost) | **POST** /index.php?method&#x3D;API.getPagesComparisonsDisabledFor |  |
| [**indexPhpmethodAPIGetPhpVersionPost**](ApiApi.md#indexPhpmethodAPIGetPhpVersionPost) | **POST** /index.php?method&#x3D;API.getPhpVersion |  |
| [**indexPhpmethodAPIGetPost**](ApiApi.md#indexPhpmethodAPIGetPost) | **POST** /index.php?method&#x3D;API.get |  |
| [**indexPhpmethodAPIGetProcessedReportPost**](ApiApi.md#indexPhpmethodAPIGetProcessedReportPost) | **POST** /index.php?method&#x3D;API.getProcessedReport |  |
| [**indexPhpmethodAPIGetReportMetadataPost**](ApiApi.md#indexPhpmethodAPIGetReportMetadataPost) | **POST** /index.php?method&#x3D;API.getReportMetadata |  |
| [**indexPhpmethodAPIGetReportPagesMetadataPost**](ApiApi.md#indexPhpmethodAPIGetReportPagesMetadataPost) | **POST** /index.php?method&#x3D;API.getReportPagesMetadata |  |
| [**indexPhpmethodAPIGetRowEvolutionPost**](ApiApi.md#indexPhpmethodAPIGetRowEvolutionPost) | **POST** /index.php?method&#x3D;API.getRowEvolution |  |
| [**indexPhpmethodAPIGetSegmentsMetadataPost**](ApiApi.md#indexPhpmethodAPIGetSegmentsMetadataPost) | **POST** /index.php?method&#x3D;API.getSegmentsMetadata |  |
| [**indexPhpmethodAPIGetSettingsPost**](ApiApi.md#indexPhpmethodAPIGetSettingsPost) | **POST** /index.php?method&#x3D;API.getSettings |  |
| [**indexPhpmethodAPIGetSuggestedValuesForSegmentPost**](ApiApi.md#indexPhpmethodAPIGetSuggestedValuesForSegmentPost) | **POST** /index.php?method&#x3D;API.getSuggestedValuesForSegment |  |
| [**indexPhpmethodAPIGetWidgetMetadataPost**](ApiApi.md#indexPhpmethodAPIGetWidgetMetadataPost) | **POST** /index.php?method&#x3D;API.getWidgetMetadata |  |
| [**indexPhpmethodAPIIsPluginActivatedPost**](ApiApi.md#indexPhpmethodAPIIsPluginActivatedPost) | **POST** /index.php?method&#x3D;API.isPluginActivated |  |



## indexPhpmethodAPIGetBulkRequestPost

> indexPhpmethodAPIGetBulkRequestPost(indexPhpMethodAPIGetBulkRequestPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetBulkRequestPostRequest indexPhpMethodAPIGetBulkRequestPostRequest = new IndexPhpMethodAPIGetBulkRequestPostRequest(); // IndexPhpMethodAPIGetBulkRequestPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetBulkRequestPost(indexPhpMethodAPIGetBulkRequestPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetBulkRequestPost");
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
| **indexPhpMethodAPIGetBulkRequestPostRequest** | [**IndexPhpMethodAPIGetBulkRequestPostRequest**](IndexPhpMethodAPIGetBulkRequestPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetGlossaryMetricsPost

> indexPhpmethodAPIGetGlossaryMetricsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetGlossaryMetricsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetGlossaryMetricsPost");
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



## indexPhpmethodAPIGetGlossaryReportsPost

> indexPhpmethodAPIGetGlossaryReportsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetGlossaryReportsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetGlossaryReportsPost");
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



## indexPhpmethodAPIGetIpFromHeaderPost

> indexPhpmethodAPIGetIpFromHeaderPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetIpFromHeaderPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetIpFromHeaderPost");
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



## indexPhpmethodAPIGetMatomoVersionPost

> indexPhpmethodAPIGetMatomoVersionPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetMatomoVersionPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetMatomoVersionPost");
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



## indexPhpmethodAPIGetMetadataPost

> indexPhpmethodAPIGetMetadataPost(indexPhpMethodAPIGetMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetMetadataPostRequest indexPhpMethodAPIGetMetadataPostRequest = new IndexPhpMethodAPIGetMetadataPostRequest(); // IndexPhpMethodAPIGetMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetMetadataPost(indexPhpMethodAPIGetMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetMetadataPost");
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
| **indexPhpMethodAPIGetMetadataPostRequest** | [**IndexPhpMethodAPIGetMetadataPostRequest**](IndexPhpMethodAPIGetMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetPagesComparisonsDisabledForPost

> indexPhpmethodAPIGetPagesComparisonsDisabledForPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetPagesComparisonsDisabledForPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetPagesComparisonsDisabledForPost");
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



## indexPhpmethodAPIGetPhpVersionPost

> indexPhpmethodAPIGetPhpVersionPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetPhpVersionPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetPhpVersionPost");
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



## indexPhpmethodAPIGetPost

> indexPhpmethodAPIGetPost(indexPhpMethodAPIGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetPostRequest indexPhpMethodAPIGetPostRequest = new IndexPhpMethodAPIGetPostRequest(); // IndexPhpMethodAPIGetPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetPost(indexPhpMethodAPIGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetPost");
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
| **indexPhpMethodAPIGetPostRequest** | [**IndexPhpMethodAPIGetPostRequest**](IndexPhpMethodAPIGetPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetProcessedReportPost

> indexPhpmethodAPIGetProcessedReportPost(indexPhpMethodAPIGetProcessedReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetProcessedReportPostRequest indexPhpMethodAPIGetProcessedReportPostRequest = new IndexPhpMethodAPIGetProcessedReportPostRequest(); // IndexPhpMethodAPIGetProcessedReportPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetProcessedReportPost(indexPhpMethodAPIGetProcessedReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetProcessedReportPost");
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
| **indexPhpMethodAPIGetProcessedReportPostRequest** | [**IndexPhpMethodAPIGetProcessedReportPostRequest**](IndexPhpMethodAPIGetProcessedReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetReportMetadataPost

> indexPhpmethodAPIGetReportMetadataPost(indexPhpMethodAPIGetReportMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetReportMetadataPostRequest indexPhpMethodAPIGetReportMetadataPostRequest = new IndexPhpMethodAPIGetReportMetadataPostRequest(); // IndexPhpMethodAPIGetReportMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetReportMetadataPost(indexPhpMethodAPIGetReportMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetReportMetadataPost");
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
| **indexPhpMethodAPIGetReportMetadataPostRequest** | [**IndexPhpMethodAPIGetReportMetadataPostRequest**](IndexPhpMethodAPIGetReportMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetReportPagesMetadataPost

> indexPhpmethodAPIGetReportPagesMetadataPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetReportPagesMetadataPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetReportPagesMetadataPost");
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



## indexPhpmethodAPIGetRowEvolutionPost

> indexPhpmethodAPIGetRowEvolutionPost(indexPhpMethodAPIGetRowEvolutionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetRowEvolutionPostRequest indexPhpMethodAPIGetRowEvolutionPostRequest = new IndexPhpMethodAPIGetRowEvolutionPostRequest(); // IndexPhpMethodAPIGetRowEvolutionPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetRowEvolutionPost(indexPhpMethodAPIGetRowEvolutionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetRowEvolutionPost");
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
| **indexPhpMethodAPIGetRowEvolutionPostRequest** | [**IndexPhpMethodAPIGetRowEvolutionPostRequest**](IndexPhpMethodAPIGetRowEvolutionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetSegmentsMetadataPost

> indexPhpmethodAPIGetSegmentsMetadataPost(indexPhpMethodAPIGetSegmentsMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetSegmentsMetadataPostRequest indexPhpMethodAPIGetSegmentsMetadataPostRequest = new IndexPhpMethodAPIGetSegmentsMetadataPostRequest(); // IndexPhpMethodAPIGetSegmentsMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetSegmentsMetadataPost(indexPhpMethodAPIGetSegmentsMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetSegmentsMetadataPost");
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
| **indexPhpMethodAPIGetSegmentsMetadataPostRequest** | [**IndexPhpMethodAPIGetSegmentsMetadataPostRequest**](IndexPhpMethodAPIGetSegmentsMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetSettingsPost

> indexPhpmethodAPIGetSettingsPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetSettingsPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetSettingsPost");
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



## indexPhpmethodAPIGetSuggestedValuesForSegmentPost

> indexPhpmethodAPIGetSuggestedValuesForSegmentPost(indexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest indexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest = new IndexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest(); // IndexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetSuggestedValuesForSegmentPost(indexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetSuggestedValuesForSegmentPost");
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
| **indexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest** | [**IndexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest**](IndexPhpMethodAPIGetSuggestedValuesForSegmentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAPIGetWidgetMetadataPost

> indexPhpmethodAPIGetWidgetMetadataPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIGetWidgetMetadataPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIGetWidgetMetadataPost");
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



## indexPhpmethodAPIIsPluginActivatedPost

> indexPhpmethodAPIIsPluginActivatedPost(indexPhpMethodAPIIsPluginActivatedPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi(defaultClient);
        IndexPhpMethodAPIIsPluginActivatedPostRequest indexPhpMethodAPIIsPluginActivatedPostRequest = new IndexPhpMethodAPIIsPluginActivatedPostRequest(); // IndexPhpMethodAPIIsPluginActivatedPostRequest | 
        try {
            apiInstance.indexPhpmethodAPIIsPluginActivatedPost(indexPhpMethodAPIIsPluginActivatedPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#indexPhpmethodAPIIsPluginActivatedPost");
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
| **indexPhpMethodAPIIsPluginActivatedPostRequest** | [**IndexPhpMethodAPIIsPluginActivatedPostRequest**](IndexPhpMethodAPIIsPluginActivatedPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


