# ActivityLogApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodActivityLogGetEntriesPost**](ActivityLogApi.md#indexPhpmethodActivityLogGetEntriesPost) | **POST** /index.php?method&#x3D;ActivityLog.getEntries |  |
| [**indexPhpmethodActivityLogGetEntryCountPost**](ActivityLogApi.md#indexPhpmethodActivityLogGetEntryCountPost) | **POST** /index.php?method&#x3D;ActivityLog.getEntryCount |  |



## indexPhpmethodActivityLogGetEntriesPost

> indexPhpmethodActivityLogGetEntriesPost(indexPhpMethodActivityLogGetEntriesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActivityLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActivityLogApi apiInstance = new ActivityLogApi(defaultClient);
        IndexPhpMethodActivityLogGetEntriesPostRequest indexPhpMethodActivityLogGetEntriesPostRequest = new IndexPhpMethodActivityLogGetEntriesPostRequest(); // IndexPhpMethodActivityLogGetEntriesPostRequest | 
        try {
            apiInstance.indexPhpmethodActivityLogGetEntriesPost(indexPhpMethodActivityLogGetEntriesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivityLogApi#indexPhpmethodActivityLogGetEntriesPost");
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
| **indexPhpMethodActivityLogGetEntriesPostRequest** | [**IndexPhpMethodActivityLogGetEntriesPostRequest**](IndexPhpMethodActivityLogGetEntriesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodActivityLogGetEntryCountPost

> indexPhpmethodActivityLogGetEntryCountPost(indexPhpMethodActivityLogGetEntryCountPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActivityLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ActivityLogApi apiInstance = new ActivityLogApi(defaultClient);
        IndexPhpMethodActivityLogGetEntryCountPostRequest indexPhpMethodActivityLogGetEntryCountPostRequest = new IndexPhpMethodActivityLogGetEntryCountPostRequest(); // IndexPhpMethodActivityLogGetEntryCountPostRequest | 
        try {
            apiInstance.indexPhpmethodActivityLogGetEntryCountPost(indexPhpMethodActivityLogGetEntryCountPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivityLogApi#indexPhpmethodActivityLogGetEntryCountPost");
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
| **indexPhpMethodActivityLogGetEntryCountPostRequest** | [**IndexPhpMethodActivityLogGetEntryCountPostRequest**](IndexPhpMethodActivityLogGetEntryCountPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


