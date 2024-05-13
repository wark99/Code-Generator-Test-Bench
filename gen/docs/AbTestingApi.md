# AbTestingApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodAbTestingAddExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingAddExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.addExperiment |  |
| [**indexPhpmethodAbTestingArchiveExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingArchiveExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.archiveExperiment |  |
| [**indexPhpmethodAbTestingDeleteExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingDeleteExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.deleteExperiment |  |
| [**indexPhpmethodAbTestingFinishExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingFinishExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.finishExperiment |  |
| [**indexPhpmethodAbTestingGetActiveExperimentsPost**](AbTestingApi.md#indexPhpmethodAbTestingGetActiveExperimentsPost) | **POST** /index.php?method&#x3D;AbTesting.getActiveExperiments |  |
| [**indexPhpmethodAbTestingGetAllExperimentsPost**](AbTestingApi.md#indexPhpmethodAbTestingGetAllExperimentsPost) | **POST** /index.php?method&#x3D;AbTesting.getAllExperiments |  |
| [**indexPhpmethodAbTestingGetAvailableStatusesPost**](AbTestingApi.md#indexPhpmethodAbTestingGetAvailableStatusesPost) | **POST** /index.php?method&#x3D;AbTesting.getAvailableStatuses |  |
| [**indexPhpmethodAbTestingGetAvailableSuccessMetricsPost**](AbTestingApi.md#indexPhpmethodAbTestingGetAvailableSuccessMetricsPost) | **POST** /index.php?method&#x3D;AbTesting.getAvailableSuccessMetrics |  |
| [**indexPhpmethodAbTestingGetAvailableTargetAttributesPost**](AbTestingApi.md#indexPhpmethodAbTestingGetAvailableTargetAttributesPost) | **POST** /index.php?method&#x3D;AbTesting.getAvailableTargetAttributes |  |
| [**indexPhpmethodAbTestingGetExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingGetExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.getExperiment |  |
| [**indexPhpmethodAbTestingGetExperimentsByStatusesPost**](AbTestingApi.md#indexPhpmethodAbTestingGetExperimentsByStatusesPost) | **POST** /index.php?method&#x3D;AbTesting.getExperimentsByStatuses |  |
| [**indexPhpmethodAbTestingGetExperimentsWithReportsPost**](AbTestingApi.md#indexPhpmethodAbTestingGetExperimentsWithReportsPost) | **POST** /index.php?method&#x3D;AbTesting.getExperimentsWithReports |  |
| [**indexPhpmethodAbTestingGetJsExperimentTemplatePost**](AbTestingApi.md#indexPhpmethodAbTestingGetJsExperimentTemplatePost) | **POST** /index.php?method&#x3D;AbTesting.getJsExperimentTemplate |  |
| [**indexPhpmethodAbTestingGetJsIncludeTemplatePost**](AbTestingApi.md#indexPhpmethodAbTestingGetJsIncludeTemplatePost) | **POST** /index.php?method&#x3D;AbTesting.getJsIncludeTemplate |  |
| [**indexPhpmethodAbTestingGetMetricDetailsPost**](AbTestingApi.md#indexPhpmethodAbTestingGetMetricDetailsPost) | **POST** /index.php?method&#x3D;AbTesting.getMetricDetails |  |
| [**indexPhpmethodAbTestingGetMetricsOverviewPost**](AbTestingApi.md#indexPhpmethodAbTestingGetMetricsOverviewPost) | **POST** /index.php?method&#x3D;AbTesting.getMetricsOverview |  |
| [**indexPhpmethodAbTestingStartExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingStartExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.startExperiment |  |
| [**indexPhpmethodAbTestingUpdateExperimentPost**](AbTestingApi.md#indexPhpmethodAbTestingUpdateExperimentPost) | **POST** /index.php?method&#x3D;AbTesting.updateExperiment |  |



## indexPhpmethodAbTestingAddExperimentPost

> indexPhpmethodAbTestingAddExperimentPost(indexPhpMethodAbTestingAddExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingAddExperimentPostRequest indexPhpMethodAbTestingAddExperimentPostRequest = new IndexPhpMethodAbTestingAddExperimentPostRequest(); // IndexPhpMethodAbTestingAddExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingAddExperimentPost(indexPhpMethodAbTestingAddExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingAddExperimentPost");
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
| **indexPhpMethodAbTestingAddExperimentPostRequest** | [**IndexPhpMethodAbTestingAddExperimentPostRequest**](IndexPhpMethodAbTestingAddExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingArchiveExperimentPost

> indexPhpmethodAbTestingArchiveExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingStartExperimentPostRequest indexPhpMethodAbTestingStartExperimentPostRequest = new IndexPhpMethodAbTestingStartExperimentPostRequest(); // IndexPhpMethodAbTestingStartExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingArchiveExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingArchiveExperimentPost");
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
| **indexPhpMethodAbTestingStartExperimentPostRequest** | [**IndexPhpMethodAbTestingStartExperimentPostRequest**](IndexPhpMethodAbTestingStartExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingDeleteExperimentPost

> indexPhpmethodAbTestingDeleteExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingStartExperimentPostRequest indexPhpMethodAbTestingStartExperimentPostRequest = new IndexPhpMethodAbTestingStartExperimentPostRequest(); // IndexPhpMethodAbTestingStartExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingDeleteExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingDeleteExperimentPost");
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
| **indexPhpMethodAbTestingStartExperimentPostRequest** | [**IndexPhpMethodAbTestingStartExperimentPostRequest**](IndexPhpMethodAbTestingStartExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingFinishExperimentPost

> indexPhpmethodAbTestingFinishExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingStartExperimentPostRequest indexPhpMethodAbTestingStartExperimentPostRequest = new IndexPhpMethodAbTestingStartExperimentPostRequest(); // IndexPhpMethodAbTestingStartExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingFinishExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingFinishExperimentPost");
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
| **indexPhpMethodAbTestingStartExperimentPostRequest** | [**IndexPhpMethodAbTestingStartExperimentPostRequest**](IndexPhpMethodAbTestingStartExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingGetActiveExperimentsPost

> indexPhpmethodAbTestingGetActiveExperimentsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetActiveExperimentsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetActiveExperimentsPost");
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



## indexPhpmethodAbTestingGetAllExperimentsPost

> indexPhpmethodAbTestingGetAllExperimentsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetAllExperimentsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetAllExperimentsPost");
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



## indexPhpmethodAbTestingGetAvailableStatusesPost

> indexPhpmethodAbTestingGetAvailableStatusesPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetAvailableStatusesPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetAvailableStatusesPost");
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



## indexPhpmethodAbTestingGetAvailableSuccessMetricsPost

> indexPhpmethodAbTestingGetAvailableSuccessMetricsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetAvailableSuccessMetricsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetAvailableSuccessMetricsPost");
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



## indexPhpmethodAbTestingGetAvailableTargetAttributesPost

> indexPhpmethodAbTestingGetAvailableTargetAttributesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetAvailableTargetAttributesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetAvailableTargetAttributesPost");
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



## indexPhpmethodAbTestingGetExperimentPost

> indexPhpmethodAbTestingGetExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingStartExperimentPostRequest indexPhpMethodAbTestingStartExperimentPostRequest = new IndexPhpMethodAbTestingStartExperimentPostRequest(); // IndexPhpMethodAbTestingStartExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetExperimentPost");
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
| **indexPhpMethodAbTestingStartExperimentPostRequest** | [**IndexPhpMethodAbTestingStartExperimentPostRequest**](IndexPhpMethodAbTestingStartExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingGetExperimentsByStatusesPost

> indexPhpmethodAbTestingGetExperimentsByStatusesPost(indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest = new IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest(); // IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetExperimentsByStatusesPost(indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetExperimentsByStatusesPost");
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
| **indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest** | [**IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest**](IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingGetExperimentsWithReportsPost

> indexPhpmethodAbTestingGetExperimentsWithReportsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetExperimentsWithReportsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetExperimentsWithReportsPost");
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



## indexPhpmethodAbTestingGetJsExperimentTemplatePost

> indexPhpmethodAbTestingGetJsExperimentTemplatePost(indexPhpMethodAbTestingStartExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingStartExperimentPostRequest indexPhpMethodAbTestingStartExperimentPostRequest = new IndexPhpMethodAbTestingStartExperimentPostRequest(); // IndexPhpMethodAbTestingStartExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetJsExperimentTemplatePost(indexPhpMethodAbTestingStartExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetJsExperimentTemplatePost");
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
| **indexPhpMethodAbTestingStartExperimentPostRequest** | [**IndexPhpMethodAbTestingStartExperimentPostRequest**](IndexPhpMethodAbTestingStartExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingGetJsIncludeTemplatePost

> indexPhpmethodAbTestingGetJsIncludeTemplatePost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetJsIncludeTemplatePost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetJsIncludeTemplatePost");
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



## indexPhpmethodAbTestingGetMetricDetailsPost

> indexPhpmethodAbTestingGetMetricDetailsPost(indexPhpMethodAbTestingGetMetricDetailsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingGetMetricDetailsPostRequest indexPhpMethodAbTestingGetMetricDetailsPostRequest = new IndexPhpMethodAbTestingGetMetricDetailsPostRequest(); // IndexPhpMethodAbTestingGetMetricDetailsPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetMetricDetailsPost(indexPhpMethodAbTestingGetMetricDetailsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetMetricDetailsPost");
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
| **indexPhpMethodAbTestingGetMetricDetailsPostRequest** | [**IndexPhpMethodAbTestingGetMetricDetailsPostRequest**](IndexPhpMethodAbTestingGetMetricDetailsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingGetMetricsOverviewPost

> indexPhpmethodAbTestingGetMetricsOverviewPost(indexPhpMethodAbTestingGetMetricsOverviewPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingGetMetricsOverviewPostRequest indexPhpMethodAbTestingGetMetricsOverviewPostRequest = new IndexPhpMethodAbTestingGetMetricsOverviewPostRequest(); // IndexPhpMethodAbTestingGetMetricsOverviewPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingGetMetricsOverviewPost(indexPhpMethodAbTestingGetMetricsOverviewPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingGetMetricsOverviewPost");
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
| **indexPhpMethodAbTestingGetMetricsOverviewPostRequest** | [**IndexPhpMethodAbTestingGetMetricsOverviewPostRequest**](IndexPhpMethodAbTestingGetMetricsOverviewPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingStartExperimentPost

> indexPhpmethodAbTestingStartExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingStartExperimentPostRequest indexPhpMethodAbTestingStartExperimentPostRequest = new IndexPhpMethodAbTestingStartExperimentPostRequest(); // IndexPhpMethodAbTestingStartExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingStartExperimentPost(indexPhpMethodAbTestingStartExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingStartExperimentPost");
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
| **indexPhpMethodAbTestingStartExperimentPostRequest** | [**IndexPhpMethodAbTestingStartExperimentPostRequest**](IndexPhpMethodAbTestingStartExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAbTestingUpdateExperimentPost

> indexPhpmethodAbTestingUpdateExperimentPost(indexPhpMethodAbTestingUpdateExperimentPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AbTestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AbTestingApi apiInstance = new AbTestingApi(defaultClient);
        IndexPhpMethodAbTestingUpdateExperimentPostRequest indexPhpMethodAbTestingUpdateExperimentPostRequest = new IndexPhpMethodAbTestingUpdateExperimentPostRequest(); // IndexPhpMethodAbTestingUpdateExperimentPostRequest | 
        try {
            apiInstance.indexPhpmethodAbTestingUpdateExperimentPost(indexPhpMethodAbTestingUpdateExperimentPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbTestingApi#indexPhpmethodAbTestingUpdateExperimentPost");
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
| **indexPhpMethodAbTestingUpdateExperimentPostRequest** | [**IndexPhpMethodAbTestingUpdateExperimentPostRequest**](IndexPhpMethodAbTestingUpdateExperimentPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


