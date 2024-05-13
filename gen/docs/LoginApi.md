# LoginApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginForAccessTokenApiV1LoginTokenPost**](LoginApi.md#loginForAccessTokenApiV1LoginTokenPost) | **POST** /api/v1/login/token | Login For Access Token |



## loginForAccessTokenApiV1LoginTokenPost

> AuthResponse loginForAccessTokenApiV1LoginTokenPost(username, password, grantType, scope, clientId, clientSecret)

Login For Access Token

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LoginApi apiInstance = new LoginApi(defaultClient);
        String username = "username_example"; // String | 
        String password = "password_example"; // String | 
        GrantType grantType = new GrantType(); // GrantType | 
        String scope = ""; // String | 
        ClientId clientId = new ClientId(); // ClientId | 
        ClientSecret clientSecret = new ClientSecret(); // ClientSecret | 
        try {
            AuthResponse result = apiInstance.loginForAccessTokenApiV1LoginTokenPost(username, password, grantType, scope, clientId, clientSecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi#loginForAccessTokenApiV1LoginTokenPost");
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
| **username** | **String**|  | |
| **password** | **String**|  | |
| **grantType** | [**GrantType**](GrantType.md)|  | [optional] |
| **scope** | **String**|  | [optional] [default to ] |
| **clientId** | [**ClientId**](ClientId.md)|  | [optional] |
| **clientSecret** | [**ClientSecret**](ClientSecret.md)|  | [optional] |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

