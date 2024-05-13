# VisitFrequencyApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodVisitFrequencyGetPost**](VisitFrequencyApi.md#indexPhpmethodVisitFrequencyGetPost) | **POST** /index.php?method&#x3D;VisitFrequency.get |  |



## indexPhpmethodVisitFrequencyGetPost

> indexPhpmethodVisitFrequencyGetPost(indexPhpMethodActionsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitFrequencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        VisitFrequencyApi apiInstance = new VisitFrequencyApi(defaultClient);
        IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest = new IndexPhpMethodActionsGetPostRequest(); // IndexPhpMethodActionsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodVisitFrequencyGetPost(indexPhpMethodActionsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitFrequencyApi#indexPhpmethodVisitFrequencyGetPost");
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
| **indexPhpMethodActionsGetPostRequest** | [**IndexPhpMethodActionsGetPostRequest**](IndexPhpMethodActionsGetPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


