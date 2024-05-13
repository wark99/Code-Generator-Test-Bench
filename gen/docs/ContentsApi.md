# ContentsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodContentsGetContentNamesPost**](ContentsApi.md#indexPhpmethodContentsGetContentNamesPost) | **POST** /index.php?method&#x3D;Contents.getContentNames |  |
| [**indexPhpmethodContentsGetContentPiecesPost**](ContentsApi.md#indexPhpmethodContentsGetContentPiecesPost) | **POST** /index.php?method&#x3D;Contents.getContentPieces |  |



## indexPhpmethodContentsGetContentNamesPost

> indexPhpmethodContentsGetContentNamesPost(indexPhpMethodContentsGetContentNamesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        IndexPhpMethodContentsGetContentNamesPostRequest indexPhpMethodContentsGetContentNamesPostRequest = new IndexPhpMethodContentsGetContentNamesPostRequest(); // IndexPhpMethodContentsGetContentNamesPostRequest | 
        try {
            apiInstance.indexPhpmethodContentsGetContentNamesPost(indexPhpMethodContentsGetContentNamesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#indexPhpmethodContentsGetContentNamesPost");
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
| **indexPhpMethodContentsGetContentNamesPostRequest** | [**IndexPhpMethodContentsGetContentNamesPostRequest**](IndexPhpMethodContentsGetContentNamesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodContentsGetContentPiecesPost

> indexPhpmethodContentsGetContentPiecesPost(indexPhpMethodContentsGetContentNamesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        IndexPhpMethodContentsGetContentNamesPostRequest indexPhpMethodContentsGetContentNamesPostRequest = new IndexPhpMethodContentsGetContentNamesPostRequest(); // IndexPhpMethodContentsGetContentNamesPostRequest | 
        try {
            apiInstance.indexPhpmethodContentsGetContentPiecesPost(indexPhpMethodContentsGetContentNamesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#indexPhpmethodContentsGetContentPiecesPost");
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
| **indexPhpMethodContentsGetContentNamesPostRequest** | [**IndexPhpMethodContentsGetContentNamesPostRequest**](IndexPhpMethodContentsGetContentNamesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


