# VisitsSummaryApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodVisitsSummaryGetActionsPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetActionsPost) | **POST** /index.php?method&#x3D;VisitsSummary.getActions |  |
| [**indexPhpmethodVisitsSummaryGetBounceCountPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetBounceCountPost) | **POST** /index.php?method&#x3D;VisitsSummary.getBounceCount |  |
| [**indexPhpmethodVisitsSummaryGetMaxActionsPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetMaxActionsPost) | **POST** /index.php?method&#x3D;VisitsSummary.getMaxActions |  |
| [**indexPhpmethodVisitsSummaryGetPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetPost) | **POST** /index.php?method&#x3D;VisitsSummary.get |  |
| [**indexPhpmethodVisitsSummaryGetSumVisitsLengthPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetSumVisitsLengthPost) | **POST** /index.php?method&#x3D;VisitsSummary.getSumVisitsLength |  |
| [**indexPhpmethodVisitsSummaryGetSumVisitsLengthPrettyPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetSumVisitsLengthPrettyPost) | **POST** /index.php?method&#x3D;VisitsSummary.getSumVisitsLengthPretty |  |
| [**indexPhpmethodVisitsSummaryGetUniqueVisitorsPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetUniqueVisitorsPost) | **POST** /index.php?method&#x3D;VisitsSummary.getUniqueVisitors |  |
| [**indexPhpmethodVisitsSummaryGetUsersPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetUsersPost) | **POST** /index.php?method&#x3D;VisitsSummary.getUsers |  |
| [**indexPhpmethodVisitsSummaryGetVisitsConvertedPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetVisitsConvertedPost) | **POST** /index.php?method&#x3D;VisitsSummary.getVisitsConverted |  |
| [**indexPhpmethodVisitsSummaryGetVisitsPost**](VisitsSummaryApi.md#indexPhpmethodVisitsSummaryGetVisitsPost) | **POST** /index.php?method&#x3D;VisitsSummary.getVisits |  |



## indexPhpmethodVisitsSummaryGetActionsPost

> indexPhpmethodVisitsSummaryGetActionsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetActionsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetActionsPost");
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



## indexPhpmethodVisitsSummaryGetBounceCountPost

> indexPhpmethodVisitsSummaryGetBounceCountPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetBounceCountPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetBounceCountPost");
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



## indexPhpmethodVisitsSummaryGetMaxActionsPost

> indexPhpmethodVisitsSummaryGetMaxActionsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetMaxActionsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetMaxActionsPost");
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



## indexPhpmethodVisitsSummaryGetPost

> indexPhpmethodVisitsSummaryGetPost(indexPhpMethodActionsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest = new IndexPhpMethodActionsGetPostRequest(); // IndexPhpMethodActionsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetPost(indexPhpMethodActionsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetPost");
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



## indexPhpmethodVisitsSummaryGetSumVisitsLengthPost

> indexPhpmethodVisitsSummaryGetSumVisitsLengthPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetSumVisitsLengthPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetSumVisitsLengthPost");
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



## indexPhpmethodVisitsSummaryGetSumVisitsLengthPrettyPost

> indexPhpmethodVisitsSummaryGetSumVisitsLengthPrettyPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetSumVisitsLengthPrettyPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetSumVisitsLengthPrettyPost");
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



## indexPhpmethodVisitsSummaryGetUniqueVisitorsPost

> indexPhpmethodVisitsSummaryGetUniqueVisitorsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetUniqueVisitorsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetUniqueVisitorsPost");
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



## indexPhpmethodVisitsSummaryGetUsersPost

> indexPhpmethodVisitsSummaryGetUsersPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetUsersPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetUsersPost");
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



## indexPhpmethodVisitsSummaryGetVisitsConvertedPost

> indexPhpmethodVisitsSummaryGetVisitsConvertedPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetVisitsConvertedPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetVisitsConvertedPost");
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



## indexPhpmethodVisitsSummaryGetVisitsPost

> indexPhpmethodVisitsSummaryGetVisitsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitsSummaryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitsSummaryApi apiInstance = new VisitsSummaryApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitsSummaryGetVisitsPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitsSummaryApi#indexPhpmethodVisitsSummaryGetVisitsPost");
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


