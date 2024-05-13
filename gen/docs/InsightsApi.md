# InsightsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodInsightsCanGenerateInsightsPost**](InsightsApi.md#indexPhpmethodInsightsCanGenerateInsightsPost) | **POST** /index.php?method&#x3D;Insights.canGenerateInsights |  |
| [**indexPhpmethodInsightsGetInsightsOverviewPost**](InsightsApi.md#indexPhpmethodInsightsGetInsightsOverviewPost) | **POST** /index.php?method&#x3D;Insights.getInsightsOverview |  |
| [**indexPhpmethodInsightsGetInsightsPost**](InsightsApi.md#indexPhpmethodInsightsGetInsightsPost) | **POST** /index.php?method&#x3D;Insights.getInsights |  |
| [**indexPhpmethodInsightsGetMoversAndShakersOverviewPost**](InsightsApi.md#indexPhpmethodInsightsGetMoversAndShakersOverviewPost) | **POST** /index.php?method&#x3D;Insights.getMoversAndShakersOverview |  |
| [**indexPhpmethodInsightsGetMoversAndShakersPost**](InsightsApi.md#indexPhpmethodInsightsGetMoversAndShakersPost) | **POST** /index.php?method&#x3D;Insights.getMoversAndShakers |  |



## indexPhpmethodInsightsCanGenerateInsightsPost

> indexPhpmethodInsightsCanGenerateInsightsPost(indexPhpMethodInsightsCanGenerateInsightsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        IndexPhpMethodInsightsCanGenerateInsightsPostRequest indexPhpMethodInsightsCanGenerateInsightsPostRequest = new IndexPhpMethodInsightsCanGenerateInsightsPostRequest(); // IndexPhpMethodInsightsCanGenerateInsightsPostRequest | 
        try {
            apiInstance.indexPhpmethodInsightsCanGenerateInsightsPost(indexPhpMethodInsightsCanGenerateInsightsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#indexPhpmethodInsightsCanGenerateInsightsPost");
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
| **indexPhpMethodInsightsCanGenerateInsightsPostRequest** | [**IndexPhpMethodInsightsCanGenerateInsightsPostRequest**](IndexPhpMethodInsightsCanGenerateInsightsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodInsightsGetInsightsOverviewPost

> indexPhpmethodInsightsGetInsightsOverviewPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodInsightsGetInsightsOverviewPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#indexPhpmethodInsightsGetInsightsOverviewPost");
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



## indexPhpmethodInsightsGetInsightsPost

> indexPhpmethodInsightsGetInsightsPost(indexPhpMethodInsightsGetInsightsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        IndexPhpMethodInsightsGetInsightsPostRequest indexPhpMethodInsightsGetInsightsPostRequest = new IndexPhpMethodInsightsGetInsightsPostRequest(); // IndexPhpMethodInsightsGetInsightsPostRequest | 
        try {
            apiInstance.indexPhpmethodInsightsGetInsightsPost(indexPhpMethodInsightsGetInsightsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#indexPhpmethodInsightsGetInsightsPost");
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
| **indexPhpMethodInsightsGetInsightsPostRequest** | [**IndexPhpMethodInsightsGetInsightsPostRequest**](IndexPhpMethodInsightsGetInsightsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodInsightsGetMoversAndShakersOverviewPost

> indexPhpmethodInsightsGetMoversAndShakersOverviewPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest = new IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest(); // IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest | 
        try {
            apiInstance.indexPhpmethodInsightsGetMoversAndShakersOverviewPost(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#indexPhpmethodInsightsGetMoversAndShakersOverviewPost");
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



## indexPhpmethodInsightsGetMoversAndShakersPost

> indexPhpmethodInsightsGetMoversAndShakersPost(indexPhpMethodInsightsGetMoversAndShakersPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        IndexPhpMethodInsightsGetMoversAndShakersPostRequest indexPhpMethodInsightsGetMoversAndShakersPostRequest = new IndexPhpMethodInsightsGetMoversAndShakersPostRequest(); // IndexPhpMethodInsightsGetMoversAndShakersPostRequest | 
        try {
            apiInstance.indexPhpmethodInsightsGetMoversAndShakersPost(indexPhpMethodInsightsGetMoversAndShakersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#indexPhpmethodInsightsGetMoversAndShakersPost");
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
| **indexPhpMethodInsightsGetMoversAndShakersPostRequest** | [**IndexPhpMethodInsightsGetMoversAndShakersPostRequest**](IndexPhpMethodInsightsGetMoversAndShakersPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


