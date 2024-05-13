# SeoApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodSEOGetRankPost**](SeoApi.md#indexPhpmethodSEOGetRankPost) | **POST** /index.php?method&#x3D;SEO.getRank |  |



## indexPhpmethodSEOGetRankPost

> indexPhpmethodSEOGetRankPost(indexPhpMethodSEOGetRankPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SeoApi apiInstance = new SeoApi(defaultClient);
        IndexPhpMethodSEOGetRankPostRequest indexPhpMethodSEOGetRankPostRequest = new IndexPhpMethodSEOGetRankPostRequest(); // IndexPhpMethodSEOGetRankPostRequest | 
        try {
            apiInstance.indexPhpmethodSEOGetRankPost(indexPhpMethodSEOGetRankPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeoApi#indexPhpmethodSEOGetRankPost");
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
| **indexPhpMethodSEOGetRankPostRequest** | [**IndexPhpMethodSEOGetRankPostRequest**](IndexPhpMethodSEOGetRankPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


