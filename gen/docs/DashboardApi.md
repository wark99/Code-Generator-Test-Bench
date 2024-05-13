# DashboardApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodDashboardCopyDashboardToUserPost**](DashboardApi.md#indexPhpmethodDashboardCopyDashboardToUserPost) | **POST** /index.php?method&#x3D;Dashboard.copyDashboardToUser |  |
| [**indexPhpmethodDashboardCreateNewDashboardForUserPost**](DashboardApi.md#indexPhpmethodDashboardCreateNewDashboardForUserPost) | **POST** /index.php?method&#x3D;Dashboard.createNewDashboardForUser |  |
| [**indexPhpmethodDashboardGetDashboardsPost**](DashboardApi.md#indexPhpmethodDashboardGetDashboardsPost) | **POST** /index.php?method&#x3D;Dashboard.getDashboards |  |
| [**indexPhpmethodDashboardRemoveDashboardPost**](DashboardApi.md#indexPhpmethodDashboardRemoveDashboardPost) | **POST** /index.php?method&#x3D;Dashboard.removeDashboard |  |
| [**indexPhpmethodDashboardResetDashboardLayoutPost**](DashboardApi.md#indexPhpmethodDashboardResetDashboardLayoutPost) | **POST** /index.php?method&#x3D;Dashboard.resetDashboardLayout |  |



## indexPhpmethodDashboardCopyDashboardToUserPost

> indexPhpmethodDashboardCopyDashboardToUserPost(indexPhpMethodDashboardCopyDashboardToUserPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DashboardApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        DashboardApi apiInstance = new DashboardApi(defaultClient);
        IndexPhpMethodDashboardCopyDashboardToUserPostRequest indexPhpMethodDashboardCopyDashboardToUserPostRequest = new IndexPhpMethodDashboardCopyDashboardToUserPostRequest(); // IndexPhpMethodDashboardCopyDashboardToUserPostRequest | 
        try {
            apiInstance.indexPhpmethodDashboardCopyDashboardToUserPost(indexPhpMethodDashboardCopyDashboardToUserPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardApi#indexPhpmethodDashboardCopyDashboardToUserPost");
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
| **indexPhpMethodDashboardCopyDashboardToUserPostRequest** | [**IndexPhpMethodDashboardCopyDashboardToUserPostRequest**](IndexPhpMethodDashboardCopyDashboardToUserPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodDashboardCreateNewDashboardForUserPost

> indexPhpmethodDashboardCreateNewDashboardForUserPost(indexPhpMethodDashboardCreateNewDashboardForUserPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DashboardApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        DashboardApi apiInstance = new DashboardApi(defaultClient);
        IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest indexPhpMethodDashboardCreateNewDashboardForUserPostRequest = new IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest(); // IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest | 
        try {
            apiInstance.indexPhpmethodDashboardCreateNewDashboardForUserPost(indexPhpMethodDashboardCreateNewDashboardForUserPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardApi#indexPhpmethodDashboardCreateNewDashboardForUserPost");
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
| **indexPhpMethodDashboardCreateNewDashboardForUserPostRequest** | [**IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest**](IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodDashboardGetDashboardsPost

> indexPhpmethodDashboardGetDashboardsPost(indexPhpMethodDashboardGetDashboardsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DashboardApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        DashboardApi apiInstance = new DashboardApi(defaultClient);
        IndexPhpMethodDashboardGetDashboardsPostRequest indexPhpMethodDashboardGetDashboardsPostRequest = new IndexPhpMethodDashboardGetDashboardsPostRequest(); // IndexPhpMethodDashboardGetDashboardsPostRequest | 
        try {
            apiInstance.indexPhpmethodDashboardGetDashboardsPost(indexPhpMethodDashboardGetDashboardsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardApi#indexPhpmethodDashboardGetDashboardsPost");
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
| **indexPhpMethodDashboardGetDashboardsPostRequest** | [**IndexPhpMethodDashboardGetDashboardsPostRequest**](IndexPhpMethodDashboardGetDashboardsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodDashboardRemoveDashboardPost

> indexPhpmethodDashboardRemoveDashboardPost(indexPhpMethodDashboardRemoveDashboardPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DashboardApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        DashboardApi apiInstance = new DashboardApi(defaultClient);
        IndexPhpMethodDashboardRemoveDashboardPostRequest indexPhpMethodDashboardRemoveDashboardPostRequest = new IndexPhpMethodDashboardRemoveDashboardPostRequest(); // IndexPhpMethodDashboardRemoveDashboardPostRequest | 
        try {
            apiInstance.indexPhpmethodDashboardRemoveDashboardPost(indexPhpMethodDashboardRemoveDashboardPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardApi#indexPhpmethodDashboardRemoveDashboardPost");
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
| **indexPhpMethodDashboardRemoveDashboardPostRequest** | [**IndexPhpMethodDashboardRemoveDashboardPostRequest**](IndexPhpMethodDashboardRemoveDashboardPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodDashboardResetDashboardLayoutPost

> indexPhpmethodDashboardResetDashboardLayoutPost(indexPhpMethodDashboardRemoveDashboardPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DashboardApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        DashboardApi apiInstance = new DashboardApi(defaultClient);
        IndexPhpMethodDashboardRemoveDashboardPostRequest indexPhpMethodDashboardRemoveDashboardPostRequest = new IndexPhpMethodDashboardRemoveDashboardPostRequest(); // IndexPhpMethodDashboardRemoveDashboardPostRequest | 
        try {
            apiInstance.indexPhpmethodDashboardResetDashboardLayoutPost(indexPhpMethodDashboardRemoveDashboardPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardApi#indexPhpmethodDashboardResetDashboardLayoutPost");
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
| **indexPhpMethodDashboardRemoveDashboardPostRequest** | [**IndexPhpMethodDashboardRemoveDashboardPostRequest**](IndexPhpMethodDashboardRemoveDashboardPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


