# AdvertisingConversionExportApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodAdvertisingConversionExportAddConversionExportPost**](AdvertisingConversionExportApi.md#indexPhpmethodAdvertisingConversionExportAddConversionExportPost) | **POST** /index.php?method&#x3D;AdvertisingConversionExport.addConversionExport |  |
| [**indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost**](AdvertisingConversionExportApi.md#indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost) | **POST** /index.php?method&#x3D;AdvertisingConversionExport.deleteConversionExport |  |
| [**indexPhpmethodAdvertisingConversionExportGetConversionExportPost**](AdvertisingConversionExportApi.md#indexPhpmethodAdvertisingConversionExportGetConversionExportPost) | **POST** /index.php?method&#x3D;AdvertisingConversionExport.getConversionExport |  |
| [**indexPhpmethodAdvertisingConversionExportGetConversionExportsPost**](AdvertisingConversionExportApi.md#indexPhpmethodAdvertisingConversionExportGetConversionExportsPost) | **POST** /index.php?method&#x3D;AdvertisingConversionExport.getConversionExports |  |
| [**indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost**](AdvertisingConversionExportApi.md#indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost) | **POST** /index.php?method&#x3D;AdvertisingConversionExport.regenerateAccessToken |  |
| [**indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost**](AdvertisingConversionExportApi.md#indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost) | **POST** /index.php?method&#x3D;AdvertisingConversionExport.updateConversionExport |  |



## indexPhpmethodAdvertisingConversionExportAddConversionExportPost

> indexPhpmethodAdvertisingConversionExportAddConversionExportPost(indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisingConversionExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AdvertisingConversionExportApi apiInstance = new AdvertisingConversionExportApi(defaultClient);
        IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest = new IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest(); // IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest | 
        try {
            apiInstance.indexPhpmethodAdvertisingConversionExportAddConversionExportPost(indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisingConversionExportApi#indexPhpmethodAdvertisingConversionExportAddConversionExportPost");
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
| **indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest** | [**IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest**](IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost

> indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost(indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisingConversionExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AdvertisingConversionExportApi apiInstance = new AdvertisingConversionExportApi(defaultClient);
        IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest = new IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest(); // IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest | 
        try {
            apiInstance.indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost(indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisingConversionExportApi#indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost");
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
| **indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest** | [**IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest**](IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAdvertisingConversionExportGetConversionExportPost

> indexPhpmethodAdvertisingConversionExportGetConversionExportPost(indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisingConversionExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AdvertisingConversionExportApi apiInstance = new AdvertisingConversionExportApi(defaultClient);
        IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest = new IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest(); // IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest | 
        try {
            apiInstance.indexPhpmethodAdvertisingConversionExportGetConversionExportPost(indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisingConversionExportApi#indexPhpmethodAdvertisingConversionExportGetConversionExportPost");
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
| **indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest** | [**IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest**](IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAdvertisingConversionExportGetConversionExportsPost

> indexPhpmethodAdvertisingConversionExportGetConversionExportsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisingConversionExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AdvertisingConversionExportApi apiInstance = new AdvertisingConversionExportApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAdvertisingConversionExportGetConversionExportsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisingConversionExportApi#indexPhpmethodAdvertisingConversionExportGetConversionExportsPost");
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



## indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost

> indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost(indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisingConversionExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AdvertisingConversionExportApi apiInstance = new AdvertisingConversionExportApi(defaultClient);
        IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest = new IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest(); // IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest | 
        try {
            apiInstance.indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost(indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisingConversionExportApi#indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost");
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
| **indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest** | [**IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest**](IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost

> indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost(indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisingConversionExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AdvertisingConversionExportApi apiInstance = new AdvertisingConversionExportApi(defaultClient);
        IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest = new IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest(); // IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest | 
        try {
            apiInstance.indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost(indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisingConversionExportApi#indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost");
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
| **indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest** | [**IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest**](IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


