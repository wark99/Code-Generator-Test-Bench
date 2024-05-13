# OverlayApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodOverlayGetExcludedQueryParametersPost**](OverlayApi.md#indexPhpmethodOverlayGetExcludedQueryParametersPost) | **POST** /index.php?method&#x3D;Overlay.getExcludedQueryParameters |  |
| [**indexPhpmethodOverlayGetFollowingPagesPost**](OverlayApi.md#indexPhpmethodOverlayGetFollowingPagesPost) | **POST** /index.php?method&#x3D;Overlay.getFollowingPages |  |
| [**indexPhpmethodOverlayGetTranslationsPost**](OverlayApi.md#indexPhpmethodOverlayGetTranslationsPost) | **POST** /index.php?method&#x3D;Overlay.getTranslations |  |



## indexPhpmethodOverlayGetExcludedQueryParametersPost

> indexPhpmethodOverlayGetExcludedQueryParametersPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OverlayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        OverlayApi apiInstance = new OverlayApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodOverlayGetExcludedQueryParametersPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OverlayApi#indexPhpmethodOverlayGetExcludedQueryParametersPost");
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



## indexPhpmethodOverlayGetFollowingPagesPost

> indexPhpmethodOverlayGetFollowingPagesPost(indexPhpMethodOverlayGetFollowingPagesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OverlayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        OverlayApi apiInstance = new OverlayApi(defaultClient);
        IndexPhpMethodOverlayGetFollowingPagesPostRequest indexPhpMethodOverlayGetFollowingPagesPostRequest = new IndexPhpMethodOverlayGetFollowingPagesPostRequest(); // IndexPhpMethodOverlayGetFollowingPagesPostRequest | 
        try {
            apiInstance.indexPhpmethodOverlayGetFollowingPagesPost(indexPhpMethodOverlayGetFollowingPagesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OverlayApi#indexPhpmethodOverlayGetFollowingPagesPost");
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
| **indexPhpMethodOverlayGetFollowingPagesPostRequest** | [**IndexPhpMethodOverlayGetFollowingPagesPostRequest**](IndexPhpMethodOverlayGetFollowingPagesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodOverlayGetTranslationsPost

> indexPhpmethodOverlayGetTranslationsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OverlayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        OverlayApi apiInstance = new OverlayApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodOverlayGetTranslationsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OverlayApi#indexPhpmethodOverlayGetTranslationsPost");
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


