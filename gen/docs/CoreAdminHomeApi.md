# CoreAdminHomeApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodCoreAdminHomeDeleteAllTrackingFailuresPost**](CoreAdminHomeApi.md#indexPhpmethodCoreAdminHomeDeleteAllTrackingFailuresPost) | **POST** /index.php?method&#x3D;CoreAdminHome.deleteAllTrackingFailures |  |
| [**indexPhpmethodCoreAdminHomeDeleteTrackingFailurePost**](CoreAdminHomeApi.md#indexPhpmethodCoreAdminHomeDeleteTrackingFailurePost) | **POST** /index.php?method&#x3D;CoreAdminHome.deleteTrackingFailure |  |
| [**indexPhpmethodCoreAdminHomeGetTrackingFailuresPost**](CoreAdminHomeApi.md#indexPhpmethodCoreAdminHomeGetTrackingFailuresPost) | **POST** /index.php?method&#x3D;CoreAdminHome.getTrackingFailures |  |



## indexPhpmethodCoreAdminHomeDeleteAllTrackingFailuresPost

> indexPhpmethodCoreAdminHomeDeleteAllTrackingFailuresPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreAdminHomeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CoreAdminHomeApi apiInstance = new CoreAdminHomeApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodCoreAdminHomeDeleteAllTrackingFailuresPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreAdminHomeApi#indexPhpmethodCoreAdminHomeDeleteAllTrackingFailuresPost");
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



## indexPhpmethodCoreAdminHomeDeleteTrackingFailurePost

> indexPhpmethodCoreAdminHomeDeleteTrackingFailurePost(indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreAdminHomeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CoreAdminHomeApi apiInstance = new CoreAdminHomeApi(defaultClient);
        IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest = new IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest(); // IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest | 
        try {
            apiInstance.indexPhpmethodCoreAdminHomeDeleteTrackingFailurePost(indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreAdminHomeApi#indexPhpmethodCoreAdminHomeDeleteTrackingFailurePost");
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
| **indexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest** | [**IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest**](IndexPhpMethodCoreAdminHomeDeleteTrackingFailurePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCoreAdminHomeGetTrackingFailuresPost

> indexPhpmethodCoreAdminHomeGetTrackingFailuresPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreAdminHomeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CoreAdminHomeApi apiInstance = new CoreAdminHomeApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodCoreAdminHomeGetTrackingFailuresPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreAdminHomeApi#indexPhpmethodCoreAdminHomeGetTrackingFailuresPost");
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


