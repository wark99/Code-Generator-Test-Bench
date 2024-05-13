# TwoFactorAuthApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodTwoFactorAuthResetTwoFactorAuthPost**](TwoFactorAuthApi.md#indexPhpmethodTwoFactorAuthResetTwoFactorAuthPost) | **POST** /index.php?method&#x3D;TwoFactorAuth.resetTwoFactorAuth |  |



## indexPhpmethodTwoFactorAuthResetTwoFactorAuthPost

> indexPhpmethodTwoFactorAuthResetTwoFactorAuthPost(indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwoFactorAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        TwoFactorAuthApi apiInstance = new TwoFactorAuthApi(defaultClient);
        IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest = new IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest(); // IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest | 
        try {
            apiInstance.indexPhpmethodTwoFactorAuthResetTwoFactorAuthPost(indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TwoFactorAuthApi#indexPhpmethodTwoFactorAuthResetTwoFactorAuthPost");
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
| **indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest** | [**IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest**](IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


