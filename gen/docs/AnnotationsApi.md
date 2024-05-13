# AnnotationsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodAnnotationsAddPost**](AnnotationsApi.md#indexPhpmethodAnnotationsAddPost) | **POST** /index.php?method&#x3D;Annotations.add |  |
| [**indexPhpmethodAnnotationsDeleteAllPost**](AnnotationsApi.md#indexPhpmethodAnnotationsDeleteAllPost) | **POST** /index.php?method&#x3D;Annotations.deleteAll |  |
| [**indexPhpmethodAnnotationsDeletePost**](AnnotationsApi.md#indexPhpmethodAnnotationsDeletePost) | **POST** /index.php?method&#x3D;Annotations.delete |  |
| [**indexPhpmethodAnnotationsGetAllPost**](AnnotationsApi.md#indexPhpmethodAnnotationsGetAllPost) | **POST** /index.php?method&#x3D;Annotations.getAll |  |
| [**indexPhpmethodAnnotationsGetAnnotationCountForDatesPost**](AnnotationsApi.md#indexPhpmethodAnnotationsGetAnnotationCountForDatesPost) | **POST** /index.php?method&#x3D;Annotations.getAnnotationCountForDates |  |
| [**indexPhpmethodAnnotationsGetPost**](AnnotationsApi.md#indexPhpmethodAnnotationsGetPost) | **POST** /index.php?method&#x3D;Annotations.get |  |
| [**indexPhpmethodAnnotationsSavePost**](AnnotationsApi.md#indexPhpmethodAnnotationsSavePost) | **POST** /index.php?method&#x3D;Annotations.save |  |



## indexPhpmethodAnnotationsAddPost

> indexPhpmethodAnnotationsAddPost(indexPhpMethodAnnotationsAddPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAnnotationsAddPostRequest indexPhpMethodAnnotationsAddPostRequest = new IndexPhpMethodAnnotationsAddPostRequest(); // IndexPhpMethodAnnotationsAddPostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsAddPost(indexPhpMethodAnnotationsAddPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsAddPost");
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
| **indexPhpMethodAnnotationsAddPostRequest** | [**IndexPhpMethodAnnotationsAddPostRequest**](IndexPhpMethodAnnotationsAddPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAnnotationsDeleteAllPost

> indexPhpmethodAnnotationsDeleteAllPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsDeleteAllPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsDeleteAllPost");
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



## indexPhpmethodAnnotationsDeletePost

> indexPhpmethodAnnotationsDeletePost(indexPhpMethodAnnotationsDeletePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAnnotationsDeletePostRequest indexPhpMethodAnnotationsDeletePostRequest = new IndexPhpMethodAnnotationsDeletePostRequest(); // IndexPhpMethodAnnotationsDeletePostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsDeletePost(indexPhpMethodAnnotationsDeletePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsDeletePost");
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
| **indexPhpMethodAnnotationsDeletePostRequest** | [**IndexPhpMethodAnnotationsDeletePostRequest**](IndexPhpMethodAnnotationsDeletePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAnnotationsGetAllPost

> indexPhpmethodAnnotationsGetAllPost(indexPhpMethodAnnotationsGetAllPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAnnotationsGetAllPostRequest indexPhpMethodAnnotationsGetAllPostRequest = new IndexPhpMethodAnnotationsGetAllPostRequest(); // IndexPhpMethodAnnotationsGetAllPostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsGetAllPost(indexPhpMethodAnnotationsGetAllPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsGetAllPost");
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
| **indexPhpMethodAnnotationsGetAllPostRequest** | [**IndexPhpMethodAnnotationsGetAllPostRequest**](IndexPhpMethodAnnotationsGetAllPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAnnotationsGetAnnotationCountForDatesPost

> indexPhpmethodAnnotationsGetAnnotationCountForDatesPost(indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest = new IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest(); // IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsGetAnnotationCountForDatesPost(indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsGetAnnotationCountForDatesPost");
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
| **indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest** | [**IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest**](IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAnnotationsGetPost

> indexPhpmethodAnnotationsGetPost(indexPhpMethodAnnotationsDeletePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAnnotationsDeletePostRequest indexPhpMethodAnnotationsDeletePostRequest = new IndexPhpMethodAnnotationsDeletePostRequest(); // IndexPhpMethodAnnotationsDeletePostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsGetPost(indexPhpMethodAnnotationsDeletePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsGetPost");
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
| **indexPhpMethodAnnotationsDeletePostRequest** | [**IndexPhpMethodAnnotationsDeletePostRequest**](IndexPhpMethodAnnotationsDeletePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodAnnotationsSavePost

> indexPhpmethodAnnotationsSavePost(indexPhpMethodAnnotationsSavePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        IndexPhpMethodAnnotationsSavePostRequest indexPhpMethodAnnotationsSavePostRequest = new IndexPhpMethodAnnotationsSavePostRequest(); // IndexPhpMethodAnnotationsSavePostRequest | 
        try {
            apiInstance.indexPhpmethodAnnotationsSavePost(indexPhpMethodAnnotationsSavePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#indexPhpmethodAnnotationsSavePost");
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
| **indexPhpMethodAnnotationsSavePostRequest** | [**IndexPhpMethodAnnotationsSavePostRequest**](IndexPhpMethodAnnotationsSavePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


