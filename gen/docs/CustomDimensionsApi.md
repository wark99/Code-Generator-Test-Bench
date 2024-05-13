# CustomDimensionsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodCustomDimensionsConfigureExistingCustomDimensionPost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsConfigureExistingCustomDimensionPost) | **POST** /index.php?method&#x3D;CustomDimensions.configureExistingCustomDimension |  |
| [**indexPhpmethodCustomDimensionsConfigureNewCustomDimensionPost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsConfigureNewCustomDimensionPost) | **POST** /index.php?method&#x3D;CustomDimensions.configureNewCustomDimension |  |
| [**indexPhpmethodCustomDimensionsGetAvailableExtractionDimensionsPost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsGetAvailableExtractionDimensionsPost) | **POST** /index.php?method&#x3D;CustomDimensions.getAvailableExtractionDimensions |  |
| [**indexPhpmethodCustomDimensionsGetAvailableScopesPost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsGetAvailableScopesPost) | **POST** /index.php?method&#x3D;CustomDimensions.getAvailableScopes |  |
| [**indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePost) | **POST** /index.php?method&#x3D;CustomDimensions.getConfiguredCustomDimensionsHavingScope |  |
| [**indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsPost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsPost) | **POST** /index.php?method&#x3D;CustomDimensions.getConfiguredCustomDimensions |  |
| [**indexPhpmethodCustomDimensionsGetCustomDimensionPost**](CustomDimensionsApi.md#indexPhpmethodCustomDimensionsGetCustomDimensionPost) | **POST** /index.php?method&#x3D;CustomDimensions.getCustomDimension |  |



## indexPhpmethodCustomDimensionsConfigureExistingCustomDimensionPost

> indexPhpmethodCustomDimensionsConfigureExistingCustomDimensionPost(indexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest indexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest = new IndexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest(); // IndexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsConfigureExistingCustomDimensionPost(indexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsConfigureExistingCustomDimensionPost");
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
| **indexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest** | [**IndexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest**](IndexPhpMethodCustomDimensionsConfigureExistingCustomDimensionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomDimensionsConfigureNewCustomDimensionPost

> indexPhpmethodCustomDimensionsConfigureNewCustomDimensionPost(indexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest indexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest = new IndexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest(); // IndexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsConfigureNewCustomDimensionPost(indexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsConfigureNewCustomDimensionPost");
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
| **indexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest** | [**IndexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest**](IndexPhpMethodCustomDimensionsConfigureNewCustomDimensionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomDimensionsGetAvailableExtractionDimensionsPost

> indexPhpmethodCustomDimensionsGetAvailableExtractionDimensionsPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsGetAvailableExtractionDimensionsPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsGetAvailableExtractionDimensionsPost");
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



## indexPhpmethodCustomDimensionsGetAvailableScopesPost

> indexPhpmethodCustomDimensionsGetAvailableScopesPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsGetAvailableScopesPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsGetAvailableScopesPost");
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



## indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePost

> indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePost(indexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest indexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest = new IndexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest(); // IndexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePost(indexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePost");
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
| **indexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest** | [**IndexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest**](IndexPhpMethodCustomDimensionsGetConfiguredCustomDimensionsHavingScopePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsPost

> indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsGetConfiguredCustomDimensionsPost");
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



## indexPhpmethodCustomDimensionsGetCustomDimensionPost

> indexPhpmethodCustomDimensionsGetCustomDimensionPost(indexPhpMethodCustomDimensionsGetCustomDimensionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomDimensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomDimensionsApi apiInstance = new CustomDimensionsApi(defaultClient);
        IndexPhpMethodCustomDimensionsGetCustomDimensionPostRequest indexPhpMethodCustomDimensionsGetCustomDimensionPostRequest = new IndexPhpMethodCustomDimensionsGetCustomDimensionPostRequest(); // IndexPhpMethodCustomDimensionsGetCustomDimensionPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomDimensionsGetCustomDimensionPost(indexPhpMethodCustomDimensionsGetCustomDimensionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDimensionsApi#indexPhpmethodCustomDimensionsGetCustomDimensionPost");
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
| **indexPhpMethodCustomDimensionsGetCustomDimensionPostRequest** | [**IndexPhpMethodCustomDimensionsGetCustomDimensionPostRequest**](IndexPhpMethodCustomDimensionsGetCustomDimensionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


