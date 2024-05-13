# CustomAlertsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodCustomAlertsAddAlertPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsAddAlertPost) | **POST** /index.php?method&#x3D;CustomAlerts.addAlert |  |
| [**indexPhpmethodCustomAlertsDeleteAlertPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsDeleteAlertPost) | **POST** /index.php?method&#x3D;CustomAlerts.deleteAlert |  |
| [**indexPhpmethodCustomAlertsEditAlertPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsEditAlertPost) | **POST** /index.php?method&#x3D;CustomAlerts.editAlert |  |
| [**indexPhpmethodCustomAlertsGetAlertPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsGetAlertPost) | **POST** /index.php?method&#x3D;CustomAlerts.getAlert |  |
| [**indexPhpmethodCustomAlertsGetAlertsPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsGetAlertsPost) | **POST** /index.php?method&#x3D;CustomAlerts.getAlerts |  |
| [**indexPhpmethodCustomAlertsGetTriggeredAlertsPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsGetTriggeredAlertsPost) | **POST** /index.php?method&#x3D;CustomAlerts.getTriggeredAlerts |  |
| [**indexPhpmethodCustomAlertsGetValuesForAlertInPastPost**](CustomAlertsApi.md#indexPhpmethodCustomAlertsGetValuesForAlertInPastPost) | **POST** /index.php?method&#x3D;CustomAlerts.getValuesForAlertInPast |  |



## indexPhpmethodCustomAlertsAddAlertPost

> indexPhpmethodCustomAlertsAddAlertPost(indexPhpMethodCustomAlertsAddAlertPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodCustomAlertsAddAlertPostRequest indexPhpMethodCustomAlertsAddAlertPostRequest = new IndexPhpMethodCustomAlertsAddAlertPostRequest(); // IndexPhpMethodCustomAlertsAddAlertPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsAddAlertPost(indexPhpMethodCustomAlertsAddAlertPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsAddAlertPost");
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
| **indexPhpMethodCustomAlertsAddAlertPostRequest** | [**IndexPhpMethodCustomAlertsAddAlertPostRequest**](IndexPhpMethodCustomAlertsAddAlertPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomAlertsDeleteAlertPost

> indexPhpmethodCustomAlertsDeleteAlertPost(indexPhpMethodCustomAlertsGetAlertPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodCustomAlertsGetAlertPostRequest indexPhpMethodCustomAlertsGetAlertPostRequest = new IndexPhpMethodCustomAlertsGetAlertPostRequest(); // IndexPhpMethodCustomAlertsGetAlertPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsDeleteAlertPost(indexPhpMethodCustomAlertsGetAlertPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsDeleteAlertPost");
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
| **indexPhpMethodCustomAlertsGetAlertPostRequest** | [**IndexPhpMethodCustomAlertsGetAlertPostRequest**](IndexPhpMethodCustomAlertsGetAlertPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomAlertsEditAlertPost

> indexPhpmethodCustomAlertsEditAlertPost(indexPhpMethodCustomAlertsEditAlertPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodCustomAlertsEditAlertPostRequest indexPhpMethodCustomAlertsEditAlertPostRequest = new IndexPhpMethodCustomAlertsEditAlertPostRequest(); // IndexPhpMethodCustomAlertsEditAlertPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsEditAlertPost(indexPhpMethodCustomAlertsEditAlertPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsEditAlertPost");
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
| **indexPhpMethodCustomAlertsEditAlertPostRequest** | [**IndexPhpMethodCustomAlertsEditAlertPostRequest**](IndexPhpMethodCustomAlertsEditAlertPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomAlertsGetAlertPost

> indexPhpmethodCustomAlertsGetAlertPost(indexPhpMethodCustomAlertsGetAlertPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodCustomAlertsGetAlertPostRequest indexPhpMethodCustomAlertsGetAlertPostRequest = new IndexPhpMethodCustomAlertsGetAlertPostRequest(); // IndexPhpMethodCustomAlertsGetAlertPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsGetAlertPost(indexPhpMethodCustomAlertsGetAlertPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsGetAlertPost");
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
| **indexPhpMethodCustomAlertsGetAlertPostRequest** | [**IndexPhpMethodCustomAlertsGetAlertPostRequest**](IndexPhpMethodCustomAlertsGetAlertPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomAlertsGetAlertsPost

> indexPhpmethodCustomAlertsGetAlertsPost(indexPhpMethodCustomAlertsGetAlertsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodCustomAlertsGetAlertsPostRequest indexPhpMethodCustomAlertsGetAlertsPostRequest = new IndexPhpMethodCustomAlertsGetAlertsPostRequest(); // IndexPhpMethodCustomAlertsGetAlertsPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsGetAlertsPost(indexPhpMethodCustomAlertsGetAlertsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsGetAlertsPost");
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
| **indexPhpMethodCustomAlertsGetAlertsPostRequest** | [**IndexPhpMethodCustomAlertsGetAlertsPostRequest**](IndexPhpMethodCustomAlertsGetAlertsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomAlertsGetTriggeredAlertsPost

> indexPhpmethodCustomAlertsGetTriggeredAlertsPost(indexPhpMethodAPIGetSegmentsMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodAPIGetSegmentsMetadataPostRequest indexPhpMethodAPIGetSegmentsMetadataPostRequest = new IndexPhpMethodAPIGetSegmentsMetadataPostRequest(); // IndexPhpMethodAPIGetSegmentsMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsGetTriggeredAlertsPost(indexPhpMethodAPIGetSegmentsMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsGetTriggeredAlertsPost");
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
| **indexPhpMethodAPIGetSegmentsMetadataPostRequest** | [**IndexPhpMethodAPIGetSegmentsMetadataPostRequest**](IndexPhpMethodAPIGetSegmentsMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodCustomAlertsGetValuesForAlertInPastPost

> indexPhpmethodCustomAlertsGetValuesForAlertInPastPost(indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomAlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CustomAlertsApi apiInstance = new CustomAlertsApi(defaultClient);
        IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest = new IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest(); // IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest | 
        try {
            apiInstance.indexPhpmethodCustomAlertsGetValuesForAlertInPastPost(indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomAlertsApi#indexPhpmethodCustomAlertsGetValuesForAlertInPastPost");
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
| **indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest** | [**IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest**](IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


