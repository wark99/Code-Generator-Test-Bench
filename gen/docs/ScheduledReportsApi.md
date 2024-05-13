# ScheduledReportsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodScheduledReportsAddReportPost**](ScheduledReportsApi.md#indexPhpmethodScheduledReportsAddReportPost) | **POST** /index.php?method&#x3D;ScheduledReports.addReport |  |
| [**indexPhpmethodScheduledReportsDeleteReportPost**](ScheduledReportsApi.md#indexPhpmethodScheduledReportsDeleteReportPost) | **POST** /index.php?method&#x3D;ScheduledReports.deleteReport |  |
| [**indexPhpmethodScheduledReportsGenerateReportPost**](ScheduledReportsApi.md#indexPhpmethodScheduledReportsGenerateReportPost) | **POST** /index.php?method&#x3D;ScheduledReports.generateReport |  |
| [**indexPhpmethodScheduledReportsGetReportsPost**](ScheduledReportsApi.md#indexPhpmethodScheduledReportsGetReportsPost) | **POST** /index.php?method&#x3D;ScheduledReports.getReports |  |
| [**indexPhpmethodScheduledReportsSendReportPost**](ScheduledReportsApi.md#indexPhpmethodScheduledReportsSendReportPost) | **POST** /index.php?method&#x3D;ScheduledReports.sendReport |  |
| [**indexPhpmethodScheduledReportsUpdateReportPost**](ScheduledReportsApi.md#indexPhpmethodScheduledReportsUpdateReportPost) | **POST** /index.php?method&#x3D;ScheduledReports.updateReport |  |



## indexPhpmethodScheduledReportsAddReportPost

> indexPhpmethodScheduledReportsAddReportPost(indexPhpMethodScheduledReportsAddReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ScheduledReportsApi apiInstance = new ScheduledReportsApi(defaultClient);
        IndexPhpMethodScheduledReportsAddReportPostRequest indexPhpMethodScheduledReportsAddReportPostRequest = new IndexPhpMethodScheduledReportsAddReportPostRequest(); // IndexPhpMethodScheduledReportsAddReportPostRequest | 
        try {
            apiInstance.indexPhpmethodScheduledReportsAddReportPost(indexPhpMethodScheduledReportsAddReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledReportsApi#indexPhpmethodScheduledReportsAddReportPost");
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
| **indexPhpMethodScheduledReportsAddReportPostRequest** | [**IndexPhpMethodScheduledReportsAddReportPostRequest**](IndexPhpMethodScheduledReportsAddReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodScheduledReportsDeleteReportPost

> indexPhpmethodScheduledReportsDeleteReportPost(indexPhpMethodScheduledReportsDeleteReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ScheduledReportsApi apiInstance = new ScheduledReportsApi(defaultClient);
        IndexPhpMethodScheduledReportsDeleteReportPostRequest indexPhpMethodScheduledReportsDeleteReportPostRequest = new IndexPhpMethodScheduledReportsDeleteReportPostRequest(); // IndexPhpMethodScheduledReportsDeleteReportPostRequest | 
        try {
            apiInstance.indexPhpmethodScheduledReportsDeleteReportPost(indexPhpMethodScheduledReportsDeleteReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledReportsApi#indexPhpmethodScheduledReportsDeleteReportPost");
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
| **indexPhpMethodScheduledReportsDeleteReportPostRequest** | [**IndexPhpMethodScheduledReportsDeleteReportPostRequest**](IndexPhpMethodScheduledReportsDeleteReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodScheduledReportsGenerateReportPost

> indexPhpmethodScheduledReportsGenerateReportPost(indexPhpMethodScheduledReportsGenerateReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ScheduledReportsApi apiInstance = new ScheduledReportsApi(defaultClient);
        IndexPhpMethodScheduledReportsGenerateReportPostRequest indexPhpMethodScheduledReportsGenerateReportPostRequest = new IndexPhpMethodScheduledReportsGenerateReportPostRequest(); // IndexPhpMethodScheduledReportsGenerateReportPostRequest | 
        try {
            apiInstance.indexPhpmethodScheduledReportsGenerateReportPost(indexPhpMethodScheduledReportsGenerateReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledReportsApi#indexPhpmethodScheduledReportsGenerateReportPost");
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
| **indexPhpMethodScheduledReportsGenerateReportPostRequest** | [**IndexPhpMethodScheduledReportsGenerateReportPostRequest**](IndexPhpMethodScheduledReportsGenerateReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodScheduledReportsGetReportsPost

> indexPhpmethodScheduledReportsGetReportsPost(indexPhpMethodScheduledReportsGetReportsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ScheduledReportsApi apiInstance = new ScheduledReportsApi(defaultClient);
        IndexPhpMethodScheduledReportsGetReportsPostRequest indexPhpMethodScheduledReportsGetReportsPostRequest = new IndexPhpMethodScheduledReportsGetReportsPostRequest(); // IndexPhpMethodScheduledReportsGetReportsPostRequest | 
        try {
            apiInstance.indexPhpmethodScheduledReportsGetReportsPost(indexPhpMethodScheduledReportsGetReportsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledReportsApi#indexPhpmethodScheduledReportsGetReportsPost");
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
| **indexPhpMethodScheduledReportsGetReportsPostRequest** | [**IndexPhpMethodScheduledReportsGetReportsPostRequest**](IndexPhpMethodScheduledReportsGetReportsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodScheduledReportsSendReportPost

> indexPhpmethodScheduledReportsSendReportPost(indexPhpMethodScheduledReportsSendReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ScheduledReportsApi apiInstance = new ScheduledReportsApi(defaultClient);
        IndexPhpMethodScheduledReportsSendReportPostRequest indexPhpMethodScheduledReportsSendReportPostRequest = new IndexPhpMethodScheduledReportsSendReportPostRequest(); // IndexPhpMethodScheduledReportsSendReportPostRequest | 
        try {
            apiInstance.indexPhpmethodScheduledReportsSendReportPost(indexPhpMethodScheduledReportsSendReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledReportsApi#indexPhpmethodScheduledReportsSendReportPost");
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
| **indexPhpMethodScheduledReportsSendReportPostRequest** | [**IndexPhpMethodScheduledReportsSendReportPostRequest**](IndexPhpMethodScheduledReportsSendReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodScheduledReportsUpdateReportPost

> indexPhpmethodScheduledReportsUpdateReportPost(indexPhpMethodScheduledReportsUpdateReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ScheduledReportsApi apiInstance = new ScheduledReportsApi(defaultClient);
        IndexPhpMethodScheduledReportsUpdateReportPostRequest indexPhpMethodScheduledReportsUpdateReportPostRequest = new IndexPhpMethodScheduledReportsUpdateReportPostRequest(); // IndexPhpMethodScheduledReportsUpdateReportPostRequest | 
        try {
            apiInstance.indexPhpmethodScheduledReportsUpdateReportPost(indexPhpMethodScheduledReportsUpdateReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledReportsApi#indexPhpmethodScheduledReportsUpdateReportPost");
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
| **indexPhpMethodScheduledReportsUpdateReportPostRequest** | [**IndexPhpMethodScheduledReportsUpdateReportPostRequest**](IndexPhpMethodScheduledReportsUpdateReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


