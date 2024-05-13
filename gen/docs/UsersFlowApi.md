# UsersFlowApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodUsersFlowGetAvailableDataSourcesPost**](UsersFlowApi.md#indexPhpmethodUsersFlowGetAvailableDataSourcesPost) | **POST** /index.php?method&#x3D;UsersFlow.getAvailableDataSources |  |
| [**indexPhpmethodUsersFlowGetInteractionActionsPost**](UsersFlowApi.md#indexPhpmethodUsersFlowGetInteractionActionsPost) | **POST** /index.php?method&#x3D;UsersFlow.getInteractionActions |  |
| [**indexPhpmethodUsersFlowGetUsersFlowPost**](UsersFlowApi.md#indexPhpmethodUsersFlowGetUsersFlowPost) | **POST** /index.php?method&#x3D;UsersFlow.getUsersFlow |  |
| [**indexPhpmethodUsersFlowGetUsersFlowPrettyPost**](UsersFlowApi.md#indexPhpmethodUsersFlowGetUsersFlowPrettyPost) | **POST** /index.php?method&#x3D;UsersFlow.getUsersFlowPretty |  |



## indexPhpmethodUsersFlowGetAvailableDataSourcesPost

> indexPhpmethodUsersFlowGetAvailableDataSourcesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UsersFlowApi apiInstance = new UsersFlowApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodUsersFlowGetAvailableDataSourcesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersFlowApi#indexPhpmethodUsersFlowGetAvailableDataSourcesPost");
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



## indexPhpmethodUsersFlowGetInteractionActionsPost

> indexPhpmethodUsersFlowGetInteractionActionsPost(indexPhpMethodUsersFlowGetInteractionActionsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UsersFlowApi apiInstance = new UsersFlowApi(defaultClient);
        IndexPhpMethodUsersFlowGetInteractionActionsPostRequest indexPhpMethodUsersFlowGetInteractionActionsPostRequest = new IndexPhpMethodUsersFlowGetInteractionActionsPostRequest(); // IndexPhpMethodUsersFlowGetInteractionActionsPostRequest | 
        try {
            apiInstance.indexPhpmethodUsersFlowGetInteractionActionsPost(indexPhpMethodUsersFlowGetInteractionActionsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersFlowApi#indexPhpmethodUsersFlowGetInteractionActionsPost");
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
| **indexPhpMethodUsersFlowGetInteractionActionsPostRequest** | [**IndexPhpMethodUsersFlowGetInteractionActionsPostRequest**](IndexPhpMethodUsersFlowGetInteractionActionsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodUsersFlowGetUsersFlowPost

> indexPhpmethodUsersFlowGetUsersFlowPost(indexPhpMethodUsersFlowGetUsersFlowPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UsersFlowApi apiInstance = new UsersFlowApi(defaultClient);
        IndexPhpMethodUsersFlowGetUsersFlowPostRequest indexPhpMethodUsersFlowGetUsersFlowPostRequest = new IndexPhpMethodUsersFlowGetUsersFlowPostRequest(); // IndexPhpMethodUsersFlowGetUsersFlowPostRequest | 
        try {
            apiInstance.indexPhpmethodUsersFlowGetUsersFlowPost(indexPhpMethodUsersFlowGetUsersFlowPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersFlowApi#indexPhpmethodUsersFlowGetUsersFlowPost");
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
| **indexPhpMethodUsersFlowGetUsersFlowPostRequest** | [**IndexPhpMethodUsersFlowGetUsersFlowPostRequest**](IndexPhpMethodUsersFlowGetUsersFlowPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodUsersFlowGetUsersFlowPrettyPost

> indexPhpmethodUsersFlowGetUsersFlowPrettyPost(indexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        UsersFlowApi apiInstance = new UsersFlowApi(defaultClient);
        IndexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest indexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest = new IndexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest(); // IndexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest | 
        try {
            apiInstance.indexPhpmethodUsersFlowGetUsersFlowPrettyPost(indexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersFlowApi#indexPhpmethodUsersFlowGetUsersFlowPrettyPost");
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
| **indexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest** | [**IndexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest**](IndexPhpMethodUsersFlowGetUsersFlowPrettyPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


