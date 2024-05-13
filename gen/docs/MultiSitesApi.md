# MultiSitesApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodMultiSitesGetAllPost**](MultiSitesApi.md#indexPhpmethodMultiSitesGetAllPost) | **POST** /index.php?method&#x3D;MultiSites.getAll |  |
| [**indexPhpmethodMultiSitesGetAllWithGroupsPost**](MultiSitesApi.md#indexPhpmethodMultiSitesGetAllWithGroupsPost) | **POST** /index.php?method&#x3D;MultiSites.getAllWithGroups |  |
| [**indexPhpmethodMultiSitesGetOnePost**](MultiSitesApi.md#indexPhpmethodMultiSitesGetOnePost) | **POST** /index.php?method&#x3D;MultiSites.getOne |  |



## indexPhpmethodMultiSitesGetAllPost

> indexPhpmethodMultiSitesGetAllPost(indexPhpMethodMultiSitesGetAllPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiSitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiSitesApi apiInstance = new MultiSitesApi(defaultClient);
        IndexPhpMethodMultiSitesGetAllPostRequest indexPhpMethodMultiSitesGetAllPostRequest = new IndexPhpMethodMultiSitesGetAllPostRequest(); // IndexPhpMethodMultiSitesGetAllPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiSitesGetAllPost(indexPhpMethodMultiSitesGetAllPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiSitesApi#indexPhpmethodMultiSitesGetAllPost");
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
| **indexPhpMethodMultiSitesGetAllPostRequest** | [**IndexPhpMethodMultiSitesGetAllPostRequest**](IndexPhpMethodMultiSitesGetAllPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMultiSitesGetAllWithGroupsPost

> indexPhpmethodMultiSitesGetAllWithGroupsPost(indexPhpMethodMultiSitesGetAllWithGroupsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiSitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiSitesApi apiInstance = new MultiSitesApi(defaultClient);
        IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest indexPhpMethodMultiSitesGetAllWithGroupsPostRequest = new IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest(); // IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiSitesGetAllWithGroupsPost(indexPhpMethodMultiSitesGetAllWithGroupsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiSitesApi#indexPhpmethodMultiSitesGetAllWithGroupsPost");
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
| **indexPhpMethodMultiSitesGetAllWithGroupsPostRequest** | [**IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest**](IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMultiSitesGetOnePost

> indexPhpmethodMultiSitesGetOnePost(indexPhpMethodMultiSitesGetOnePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiSitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiSitesApi apiInstance = new MultiSitesApi(defaultClient);
        IndexPhpMethodMultiSitesGetOnePostRequest indexPhpMethodMultiSitesGetOnePostRequest = new IndexPhpMethodMultiSitesGetOnePostRequest(); // IndexPhpMethodMultiSitesGetOnePostRequest | 
        try {
            apiInstance.indexPhpmethodMultiSitesGetOnePost(indexPhpMethodMultiSitesGetOnePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiSitesApi#indexPhpmethodMultiSitesGetOnePost");
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
| **indexPhpMethodMultiSitesGetOnePostRequest** | [**IndexPhpMethodMultiSitesGetOnePostRequest**](IndexPhpMethodMultiSitesGetOnePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


