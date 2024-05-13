# VisitTimeApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodVisitTimeGetByDayOfWeekPost**](VisitTimeApi.md#indexPhpmethodVisitTimeGetByDayOfWeekPost) | **POST** /index.php?method&#x3D;VisitTime.getByDayOfWeek |  |
| [**indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost**](VisitTimeApi.md#indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost) | **POST** /index.php?method&#x3D;VisitTime.getVisitInformationPerLocalTime |  |
| [**indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost**](VisitTimeApi.md#indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost) | **POST** /index.php?method&#x3D;VisitTime.getVisitInformationPerServerTime |  |



## indexPhpmethodVisitTimeGetByDayOfWeekPost

> indexPhpmethodVisitTimeGetByDayOfWeekPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitTimeApi apiInstance = new VisitTimeApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitTimeGetByDayOfWeekPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitTimeApi#indexPhpmethodVisitTimeGetByDayOfWeekPost");
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



## indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost

> indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitTimeApi apiInstance = new VisitTimeApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitTimeApi#indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost");
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



## indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost

> indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost(indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitTimeApi apiInstance = new VisitTimeApi(defaultClient);
        IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest = new IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest(); // IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest | 
        try {
            apiInstance.indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost(indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitTimeApi#indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost");
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
| **indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest** | [**IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest**](IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


