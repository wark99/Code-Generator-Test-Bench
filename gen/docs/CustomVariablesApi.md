# CustomVariablesApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodCustomVariablesGetCustomVariablesPost**](CustomVariablesApi.md#indexPhpmethodCustomVariablesGetCustomVariablesPost) | **POST** /index.php?method&#x3D;CustomVariables.getCustomVariables |  |
| [**indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost**](CustomVariablesApi.md#indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost) | **POST** /index.php?method&#x3D;CustomVariables.getCustomVariablesValuesFromNameId |  |
| [**indexPhpmethodCustomVariablesGetUsagesOfSlotsPost**](CustomVariablesApi.md#indexPhpmethodCustomVariablesGetUsagesOfSlotsPost) | **POST** /index.php?method&#x3D;CustomVariables.getUsagesOfSlots |  |



## indexPhpmethodCustomVariablesGetCustomVariablesPost

> indexPhpmethodCustomVariablesGetCustomVariablesPost(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomVariablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomVariablesApi apiInstance = new CustomVariablesApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomVariablesGetCustomVariablesPost(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomVariablesApi#indexPhpmethodCustomVariablesGetCustomVariablesPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost

> indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomVariablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomVariablesApi apiInstance = new CustomVariablesApi(defaultClient);
        IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest = new IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest(); // IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomVariablesApi#indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost");
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
| **indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest** | [**IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest**](IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomVariablesGetUsagesOfSlotsPost

> indexPhpmethodCustomVariablesGetUsagesOfSlotsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomVariablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomVariablesApi apiInstance = new CustomVariablesApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomVariablesGetUsagesOfSlotsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomVariablesApi#indexPhpmethodCustomVariablesGetUsagesOfSlotsPost");
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


