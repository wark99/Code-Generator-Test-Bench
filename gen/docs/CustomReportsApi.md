# CustomReportsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodCustomReportsAddCustomReportPost**](CustomReportsApi.md#indexPhpmethodCustomReportsAddCustomReportPost) | **POST** /index.php?method&#x3D;CustomReports.addCustomReport |  |
| [**indexPhpmethodCustomReportsDeleteCustomReportPost**](CustomReportsApi.md#indexPhpmethodCustomReportsDeleteCustomReportPost) | **POST** /index.php?method&#x3D;CustomReports.deleteCustomReport |  |
| [**indexPhpmethodCustomReportsGetAvailableCategoriesPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetAvailableCategoriesPost) | **POST** /index.php?method&#x3D;CustomReports.getAvailableCategories |  |
| [**indexPhpmethodCustomReportsGetAvailableDimensionsPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetAvailableDimensionsPost) | **POST** /index.php?method&#x3D;CustomReports.getAvailableDimensions |  |
| [**indexPhpmethodCustomReportsGetAvailableMetricsPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetAvailableMetricsPost) | **POST** /index.php?method&#x3D;CustomReports.getAvailableMetrics |  |
| [**indexPhpmethodCustomReportsGetAvailableReportTypesPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetAvailableReportTypesPost) | **POST** /index.php?method&#x3D;CustomReports.getAvailableReportTypes |  |
| [**indexPhpmethodCustomReportsGetConfiguredReportPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetConfiguredReportPost) | **POST** /index.php?method&#x3D;CustomReports.getConfiguredReport |  |
| [**indexPhpmethodCustomReportsGetConfiguredReportsPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetConfiguredReportsPost) | **POST** /index.php?method&#x3D;CustomReports.getConfiguredReports |  |
| [**indexPhpmethodCustomReportsGetCustomReportPost**](CustomReportsApi.md#indexPhpmethodCustomReportsGetCustomReportPost) | **POST** /index.php?method&#x3D;CustomReports.getCustomReport |  |
| [**indexPhpmethodCustomReportsUpdateCustomReportPost**](CustomReportsApi.md#indexPhpmethodCustomReportsUpdateCustomReportPost) | **POST** /index.php?method&#x3D;CustomReports.updateCustomReport |  |



## indexPhpmethodCustomReportsAddCustomReportPost

> indexPhpmethodCustomReportsAddCustomReportPost(indexPhpMethodCustomReportsAddCustomReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodCustomReportsAddCustomReportPostRequest indexPhpMethodCustomReportsAddCustomReportPostRequest = new IndexPhpMethodCustomReportsAddCustomReportPostRequest(); // IndexPhpMethodCustomReportsAddCustomReportPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsAddCustomReportPost(indexPhpMethodCustomReportsAddCustomReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsAddCustomReportPost");
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
| **indexPhpMethodCustomReportsAddCustomReportPostRequest** | [**IndexPhpMethodCustomReportsAddCustomReportPostRequest**](IndexPhpMethodCustomReportsAddCustomReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomReportsDeleteCustomReportPost

> indexPhpmethodCustomReportsDeleteCustomReportPost(indexPhpMethodCustomReportsGetConfiguredReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodCustomReportsGetConfiguredReportPostRequest indexPhpMethodCustomReportsGetConfiguredReportPostRequest = new IndexPhpMethodCustomReportsGetConfiguredReportPostRequest(); // IndexPhpMethodCustomReportsGetConfiguredReportPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsDeleteCustomReportPost(indexPhpMethodCustomReportsGetConfiguredReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsDeleteCustomReportPost");
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
| **indexPhpMethodCustomReportsGetConfiguredReportPostRequest** | [**IndexPhpMethodCustomReportsGetConfiguredReportPostRequest**](IndexPhpMethodCustomReportsGetConfiguredReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomReportsGetAvailableCategoriesPost

> indexPhpmethodCustomReportsGetAvailableCategoriesPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetAvailableCategoriesPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetAvailableCategoriesPost");
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



## indexPhpmethodCustomReportsGetAvailableDimensionsPost

> indexPhpmethodCustomReportsGetAvailableDimensionsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetAvailableDimensionsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetAvailableDimensionsPost");
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



## indexPhpmethodCustomReportsGetAvailableMetricsPost

> indexPhpmethodCustomReportsGetAvailableMetricsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetAvailableMetricsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetAvailableMetricsPost");
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



## indexPhpmethodCustomReportsGetAvailableReportTypesPost

> indexPhpmethodCustomReportsGetAvailableReportTypesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetAvailableReportTypesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetAvailableReportTypesPost");
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



## indexPhpmethodCustomReportsGetConfiguredReportPost

> indexPhpmethodCustomReportsGetConfiguredReportPost(indexPhpMethodCustomReportsGetConfiguredReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodCustomReportsGetConfiguredReportPostRequest indexPhpMethodCustomReportsGetConfiguredReportPostRequest = new IndexPhpMethodCustomReportsGetConfiguredReportPostRequest(); // IndexPhpMethodCustomReportsGetConfiguredReportPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetConfiguredReportPost(indexPhpMethodCustomReportsGetConfiguredReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetConfiguredReportPost");
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
| **indexPhpMethodCustomReportsGetConfiguredReportPostRequest** | [**IndexPhpMethodCustomReportsGetConfiguredReportPostRequest**](IndexPhpMethodCustomReportsGetConfiguredReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomReportsGetConfiguredReportsPost

> indexPhpmethodCustomReportsGetConfiguredReportsPost(indexPhpMethodCustomReportsGetConfiguredReportsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest indexPhpMethodCustomReportsGetConfiguredReportsPostRequest = new IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest(); // IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetConfiguredReportsPost(indexPhpMethodCustomReportsGetConfiguredReportsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetConfiguredReportsPost");
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
| **indexPhpMethodCustomReportsGetConfiguredReportsPostRequest** | [**IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest**](IndexPhpMethodCustomReportsGetConfiguredReportsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomReportsGetCustomReportPost

> indexPhpmethodCustomReportsGetCustomReportPost(indexPhpMethodCustomReportsGetCustomReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodCustomReportsGetCustomReportPostRequest indexPhpMethodCustomReportsGetCustomReportPostRequest = new IndexPhpMethodCustomReportsGetCustomReportPostRequest(); // IndexPhpMethodCustomReportsGetCustomReportPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsGetCustomReportPost(indexPhpMethodCustomReportsGetCustomReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsGetCustomReportPost");
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
| **indexPhpMethodCustomReportsGetCustomReportPostRequest** | [**IndexPhpMethodCustomReportsGetCustomReportPostRequest**](IndexPhpMethodCustomReportsGetCustomReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomReportsUpdateCustomReportPost

> indexPhpmethodCustomReportsUpdateCustomReportPost(indexPhpMethodCustomReportsUpdateCustomReportPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomReportsApi apiInstance = new CustomReportsApi(defaultClient);
        IndexPhpMethodCustomReportsUpdateCustomReportPostRequest indexPhpMethodCustomReportsUpdateCustomReportPostRequest = new IndexPhpMethodCustomReportsUpdateCustomReportPostRequest(); // IndexPhpMethodCustomReportsUpdateCustomReportPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomReportsUpdateCustomReportPost(indexPhpMethodCustomReportsUpdateCustomReportPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomReportsApi#indexPhpmethodCustomReportsUpdateCustomReportPost");
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
| **indexPhpMethodCustomReportsUpdateCustomReportPostRequest** | [**IndexPhpMethodCustomReportsUpdateCustomReportPostRequest**](IndexPhpMethodCustomReportsUpdateCustomReportPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


