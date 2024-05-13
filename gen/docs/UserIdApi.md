# UserIdApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodUserIdGetUsersPost**](UserIdApi.md#indexPhpmethodUserIdGetUsersPost) | **POST** /index.php?method&#x3D;UserId.getUsers |  |



## indexPhpmethodUserIdGetUsersPost

> indexPhpmethodUserIdGetUsersPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserIdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UserIdApi apiInstance = new UserIdApi(defaultClient);
        IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest = new IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest(); // IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest | 
        try {
            apiInstance.indexPhpmethodUserIdGetUsersPost(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserIdApi#indexPhpmethodUserIdGetUsersPost");
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
| **indexPhpMethodActionsGetSiteSearchKeywordsPostRequest** | [**IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest**](IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


