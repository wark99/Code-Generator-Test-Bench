# GoalsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodGoalsAddGoalPost**](GoalsApi.md#indexPhpmethodGoalsAddGoalPost) | **POST** /index.php?method&#x3D;Goals.addGoal |  |
| [**indexPhpmethodGoalsDeleteGoalPost**](GoalsApi.md#indexPhpmethodGoalsDeleteGoalPost) | **POST** /index.php?method&#x3D;Goals.deleteGoal |  |
| [**indexPhpmethodGoalsGetDaysToConversionPost**](GoalsApi.md#indexPhpmethodGoalsGetDaysToConversionPost) | **POST** /index.php?method&#x3D;Goals.getDaysToConversion |  |
| [**indexPhpmethodGoalsGetGoalPost**](GoalsApi.md#indexPhpmethodGoalsGetGoalPost) | **POST** /index.php?method&#x3D;Goals.getGoal |  |
| [**indexPhpmethodGoalsGetGoalsPost**](GoalsApi.md#indexPhpmethodGoalsGetGoalsPost) | **POST** /index.php?method&#x3D;Goals.getGoals |  |
| [**indexPhpmethodGoalsGetItemsCategoryPost**](GoalsApi.md#indexPhpmethodGoalsGetItemsCategoryPost) | **POST** /index.php?method&#x3D;Goals.getItemsCategory |  |
| [**indexPhpmethodGoalsGetItemsNamePost**](GoalsApi.md#indexPhpmethodGoalsGetItemsNamePost) | **POST** /index.php?method&#x3D;Goals.getItemsName |  |
| [**indexPhpmethodGoalsGetItemsSkuPost**](GoalsApi.md#indexPhpmethodGoalsGetItemsSkuPost) | **POST** /index.php?method&#x3D;Goals.getItemsSku |  |
| [**indexPhpmethodGoalsGetPost**](GoalsApi.md#indexPhpmethodGoalsGetPost) | **POST** /index.php?method&#x3D;Goals.get |  |
| [**indexPhpmethodGoalsGetVisitsUntilConversionPost**](GoalsApi.md#indexPhpmethodGoalsGetVisitsUntilConversionPost) | **POST** /index.php?method&#x3D;Goals.getVisitsUntilConversion |  |
| [**indexPhpmethodGoalsUpdateGoalPost**](GoalsApi.md#indexPhpmethodGoalsUpdateGoalPost) | **POST** /index.php?method&#x3D;Goals.updateGoal |  |



## indexPhpmethodGoalsAddGoalPost

> indexPhpmethodGoalsAddGoalPost(indexPhpMethodGoalsAddGoalPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsAddGoalPostRequest indexPhpMethodGoalsAddGoalPostRequest = new IndexPhpMethodGoalsAddGoalPostRequest(); // IndexPhpMethodGoalsAddGoalPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsAddGoalPost(indexPhpMethodGoalsAddGoalPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsAddGoalPost");
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
| **indexPhpMethodGoalsAddGoalPostRequest** | [**IndexPhpMethodGoalsAddGoalPostRequest**](IndexPhpMethodGoalsAddGoalPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsDeleteGoalPost

> indexPhpmethodGoalsDeleteGoalPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest = new IndexPhpMethodFunnelsGetGoalFunnelPostRequest(); // IndexPhpMethodFunnelsGetGoalFunnelPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsDeleteGoalPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsDeleteGoalPost");
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



## indexPhpmethodGoalsGetDaysToConversionPost

> indexPhpmethodGoalsGetDaysToConversionPost(indexPhpMethodGoalsGetDaysToConversionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsGetDaysToConversionPostRequest indexPhpMethodGoalsGetDaysToConversionPostRequest = new IndexPhpMethodGoalsGetDaysToConversionPostRequest(); // IndexPhpMethodGoalsGetDaysToConversionPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetDaysToConversionPost(indexPhpMethodGoalsGetDaysToConversionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetDaysToConversionPost");
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
| **indexPhpMethodGoalsGetDaysToConversionPostRequest** | [**IndexPhpMethodGoalsGetDaysToConversionPostRequest**](IndexPhpMethodGoalsGetDaysToConversionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsGetGoalPost

> indexPhpmethodGoalsGetGoalPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest = new IndexPhpMethodFunnelsGetGoalFunnelPostRequest(); // IndexPhpMethodFunnelsGetGoalFunnelPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetGoalPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetGoalPost");
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



## indexPhpmethodGoalsGetGoalsPost

> indexPhpmethodGoalsGetGoalsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetGoalsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetGoalsPost");
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



## indexPhpmethodGoalsGetItemsCategoryPost

> indexPhpmethodGoalsGetItemsCategoryPost(indexPhpMethodGoalsGetItemsSkuPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest = new IndexPhpMethodGoalsGetItemsSkuPostRequest(); // IndexPhpMethodGoalsGetItemsSkuPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetItemsCategoryPost(indexPhpMethodGoalsGetItemsSkuPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetItemsCategoryPost");
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
| **indexPhpMethodGoalsGetItemsSkuPostRequest** | [**IndexPhpMethodGoalsGetItemsSkuPostRequest**](IndexPhpMethodGoalsGetItemsSkuPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsGetItemsNamePost

> indexPhpmethodGoalsGetItemsNamePost(indexPhpMethodGoalsGetItemsSkuPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest = new IndexPhpMethodGoalsGetItemsSkuPostRequest(); // IndexPhpMethodGoalsGetItemsSkuPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetItemsNamePost(indexPhpMethodGoalsGetItemsSkuPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetItemsNamePost");
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
| **indexPhpMethodGoalsGetItemsSkuPostRequest** | [**IndexPhpMethodGoalsGetItemsSkuPostRequest**](IndexPhpMethodGoalsGetItemsSkuPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsGetItemsSkuPost

> indexPhpmethodGoalsGetItemsSkuPost(indexPhpMethodGoalsGetItemsSkuPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest = new IndexPhpMethodGoalsGetItemsSkuPostRequest(); // IndexPhpMethodGoalsGetItemsSkuPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetItemsSkuPost(indexPhpMethodGoalsGetItemsSkuPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetItemsSkuPost");
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
| **indexPhpMethodGoalsGetItemsSkuPostRequest** | [**IndexPhpMethodGoalsGetItemsSkuPostRequest**](IndexPhpMethodGoalsGetItemsSkuPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsGetPost

> indexPhpmethodGoalsGetPost(indexPhpMethodGoalsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsGetPostRequest indexPhpMethodGoalsGetPostRequest = new IndexPhpMethodGoalsGetPostRequest(); // IndexPhpMethodGoalsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetPost(indexPhpMethodGoalsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetPost");
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
| **indexPhpMethodGoalsGetPostRequest** | [**IndexPhpMethodGoalsGetPostRequest**](IndexPhpMethodGoalsGetPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsGetVisitsUntilConversionPost

> indexPhpmethodGoalsGetVisitsUntilConversionPost(indexPhpMethodGoalsGetDaysToConversionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsGetDaysToConversionPostRequest indexPhpMethodGoalsGetDaysToConversionPostRequest = new IndexPhpMethodGoalsGetDaysToConversionPostRequest(); // IndexPhpMethodGoalsGetDaysToConversionPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsGetVisitsUntilConversionPost(indexPhpMethodGoalsGetDaysToConversionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsGetVisitsUntilConversionPost");
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
| **indexPhpMethodGoalsGetDaysToConversionPostRequest** | [**IndexPhpMethodGoalsGetDaysToConversionPostRequest**](IndexPhpMethodGoalsGetDaysToConversionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodGoalsUpdateGoalPost

> indexPhpmethodGoalsUpdateGoalPost(indexPhpMethodGoalsUpdateGoalPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GoalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        GoalsApi apiInstance = new GoalsApi(defaultClient);
        IndexPhpMethodGoalsUpdateGoalPostRequest indexPhpMethodGoalsUpdateGoalPostRequest = new IndexPhpMethodGoalsUpdateGoalPostRequest(); // IndexPhpMethodGoalsUpdateGoalPostRequest | 
        try {
            apiInstance.indexPhpmethodGoalsUpdateGoalPost(indexPhpMethodGoalsUpdateGoalPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GoalsApi#indexPhpmethodGoalsUpdateGoalPost");
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
| **indexPhpMethodGoalsUpdateGoalPostRequest** | [**IndexPhpMethodGoalsUpdateGoalPostRequest**](IndexPhpMethodGoalsUpdateGoalPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


