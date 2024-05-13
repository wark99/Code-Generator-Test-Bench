# SegmentEditorApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodSegmentEditorAddPost**](SegmentEditorApi.md#indexPhpmethodSegmentEditorAddPost) | **POST** /index.php?method&#x3D;SegmentEditor.add |  |
| [**indexPhpmethodSegmentEditorDeletePost**](SegmentEditorApi.md#indexPhpmethodSegmentEditorDeletePost) | **POST** /index.php?method&#x3D;SegmentEditor.delete |  |
| [**indexPhpmethodSegmentEditorGetAllPost**](SegmentEditorApi.md#indexPhpmethodSegmentEditorGetAllPost) | **POST** /index.php?method&#x3D;SegmentEditor.getAll |  |
| [**indexPhpmethodSegmentEditorGetPost**](SegmentEditorApi.md#indexPhpmethodSegmentEditorGetPost) | **POST** /index.php?method&#x3D;SegmentEditor.get |  |
| [**indexPhpmethodSegmentEditorIsUserCanAddNewSegmentPost**](SegmentEditorApi.md#indexPhpmethodSegmentEditorIsUserCanAddNewSegmentPost) | **POST** /index.php?method&#x3D;SegmentEditor.isUserCanAddNewSegment |  |
| [**indexPhpmethodSegmentEditorUpdatePost**](SegmentEditorApi.md#indexPhpmethodSegmentEditorUpdatePost) | **POST** /index.php?method&#x3D;SegmentEditor.update |  |



## indexPhpmethodSegmentEditorAddPost

> indexPhpmethodSegmentEditorAddPost(indexPhpMethodSegmentEditorAddPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentEditorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SegmentEditorApi apiInstance = new SegmentEditorApi(defaultClient);
        IndexPhpMethodSegmentEditorAddPostRequest indexPhpMethodSegmentEditorAddPostRequest = new IndexPhpMethodSegmentEditorAddPostRequest(); // IndexPhpMethodSegmentEditorAddPostRequest | 
        try {
            apiInstance.indexPhpmethodSegmentEditorAddPost(indexPhpMethodSegmentEditorAddPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEditorApi#indexPhpmethodSegmentEditorAddPost");
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
| **indexPhpMethodSegmentEditorAddPostRequest** | [**IndexPhpMethodSegmentEditorAddPostRequest**](IndexPhpMethodSegmentEditorAddPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodSegmentEditorDeletePost

> indexPhpmethodSegmentEditorDeletePost(indexPhpMethodSegmentEditorDeletePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentEditorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SegmentEditorApi apiInstance = new SegmentEditorApi(defaultClient);
        IndexPhpMethodSegmentEditorDeletePostRequest indexPhpMethodSegmentEditorDeletePostRequest = new IndexPhpMethodSegmentEditorDeletePostRequest(); // IndexPhpMethodSegmentEditorDeletePostRequest | 
        try {
            apiInstance.indexPhpmethodSegmentEditorDeletePost(indexPhpMethodSegmentEditorDeletePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEditorApi#indexPhpmethodSegmentEditorDeletePost");
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
| **indexPhpMethodSegmentEditorDeletePostRequest** | [**IndexPhpMethodSegmentEditorDeletePostRequest**](IndexPhpMethodSegmentEditorDeletePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodSegmentEditorGetAllPost

> indexPhpmethodSegmentEditorGetAllPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentEditorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SegmentEditorApi apiInstance = new SegmentEditorApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodSegmentEditorGetAllPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEditorApi#indexPhpmethodSegmentEditorGetAllPost");
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



## indexPhpmethodSegmentEditorGetPost

> indexPhpmethodSegmentEditorGetPost(indexPhpMethodSegmentEditorDeletePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentEditorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SegmentEditorApi apiInstance = new SegmentEditorApi(defaultClient);
        IndexPhpMethodSegmentEditorDeletePostRequest indexPhpMethodSegmentEditorDeletePostRequest = new IndexPhpMethodSegmentEditorDeletePostRequest(); // IndexPhpMethodSegmentEditorDeletePostRequest | 
        try {
            apiInstance.indexPhpmethodSegmentEditorGetPost(indexPhpMethodSegmentEditorDeletePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEditorApi#indexPhpmethodSegmentEditorGetPost");
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
| **indexPhpMethodSegmentEditorDeletePostRequest** | [**IndexPhpMethodSegmentEditorDeletePostRequest**](IndexPhpMethodSegmentEditorDeletePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodSegmentEditorIsUserCanAddNewSegmentPost

> indexPhpmethodSegmentEditorIsUserCanAddNewSegmentPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentEditorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SegmentEditorApi apiInstance = new SegmentEditorApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodSegmentEditorIsUserCanAddNewSegmentPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEditorApi#indexPhpmethodSegmentEditorIsUserCanAddNewSegmentPost");
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



## indexPhpmethodSegmentEditorUpdatePost

> indexPhpmethodSegmentEditorUpdatePost(indexPhpMethodSegmentEditorUpdatePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentEditorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SegmentEditorApi apiInstance = new SegmentEditorApi(defaultClient);
        IndexPhpMethodSegmentEditorUpdatePostRequest indexPhpMethodSegmentEditorUpdatePostRequest = new IndexPhpMethodSegmentEditorUpdatePostRequest(); // IndexPhpMethodSegmentEditorUpdatePostRequest | 
        try {
            apiInstance.indexPhpmethodSegmentEditorUpdatePost(indexPhpMethodSegmentEditorUpdatePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEditorApi#indexPhpmethodSegmentEditorUpdatePost");
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
| **indexPhpMethodSegmentEditorUpdatePostRequest** | [**IndexPhpMethodSegmentEditorUpdatePostRequest**](IndexPhpMethodSegmentEditorUpdatePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


