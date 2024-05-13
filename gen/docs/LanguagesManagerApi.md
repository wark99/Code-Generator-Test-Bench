# LanguagesManagerApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost) | **POST** /index.php?method&#x3D;LanguagesManager.getAvailableLanguageNames |  |
| [**indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost) | **POST** /index.php?method&#x3D;LanguagesManager.getAvailableLanguagesInfo |  |
| [**indexPhpmethodLanguagesManagerGetAvailableLanguagesPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerGetAvailableLanguagesPost) | **POST** /index.php?method&#x3D;LanguagesManager.getAvailableLanguages |  |
| [**indexPhpmethodLanguagesManagerGetLanguageForUserPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerGetLanguageForUserPost) | **POST** /index.php?method&#x3D;LanguagesManager.getLanguageForUser |  |
| [**indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost) | **POST** /index.php?method&#x3D;LanguagesManager.getTranslationsForLanguage |  |
| [**indexPhpmethodLanguagesManagerIsLanguageAvailablePost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerIsLanguageAvailablePost) | **POST** /index.php?method&#x3D;LanguagesManager.isLanguageAvailable |  |
| [**indexPhpmethodLanguagesManagerSet12HourClockForUserPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerSet12HourClockForUserPost) | **POST** /index.php?method&#x3D;LanguagesManager.set12HourClockForUser |  |
| [**indexPhpmethodLanguagesManagerSetLanguageForUserPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerSetLanguageForUserPost) | **POST** /index.php?method&#x3D;LanguagesManager.setLanguageForUser |  |
| [**indexPhpmethodLanguagesManagerUses12HourClockForUserPost**](LanguagesManagerApi.md#indexPhpmethodLanguagesManagerUses12HourClockForUserPost) | **POST** /index.php?method&#x3D;LanguagesManager.uses12HourClockForUser |  |



## indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost

> indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost");
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



## indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost

> indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost(indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest = new IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest(); // IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost(indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost");
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
| **indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest** | [**IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest**](IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLanguagesManagerGetAvailableLanguagesPost

> indexPhpmethodLanguagesManagerGetAvailableLanguagesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerGetAvailableLanguagesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerGetAvailableLanguagesPost");
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



## indexPhpmethodLanguagesManagerGetLanguageForUserPost

> indexPhpmethodLanguagesManagerGetLanguageForUserPost(indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest = new IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest(); // IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerGetLanguageForUserPost(indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerGetLanguageForUserPost");
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
| **indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest** | [**IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest**](IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost

> indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost(indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest = new IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest(); // IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost(indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost");
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
| **indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest** | [**IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest**](IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLanguagesManagerIsLanguageAvailablePost

> indexPhpmethodLanguagesManagerIsLanguageAvailablePost(indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest = new IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest(); // IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerIsLanguageAvailablePost(indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerIsLanguageAvailablePost");
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
| **indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest** | [**IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest**](IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLanguagesManagerSet12HourClockForUserPost

> indexPhpmethodLanguagesManagerSet12HourClockForUserPost(indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest = new IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest(); // IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerSet12HourClockForUserPost(indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerSet12HourClockForUserPost");
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
| **indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest** | [**IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest**](IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLanguagesManagerSetLanguageForUserPost

> indexPhpmethodLanguagesManagerSetLanguageForUserPost(indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest = new IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest(); // IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerSetLanguageForUserPost(indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerSetLanguageForUserPost");
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
| **indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest** | [**IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest**](IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodLanguagesManagerUses12HourClockForUserPost

> indexPhpmethodLanguagesManagerUses12HourClockForUserPost(indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguagesManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        LanguagesManagerApi apiInstance = new LanguagesManagerApi(defaultClient);
        IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest = new IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest(); // IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest | 
        try {
            apiInstance.indexPhpmethodLanguagesManagerUses12HourClockForUserPost(indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguagesManagerApi#indexPhpmethodLanguagesManagerUses12HourClockForUserPost");
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
| **indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest** | [**IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest**](IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


