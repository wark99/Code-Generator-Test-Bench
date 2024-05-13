# PrivacyManagerApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodPrivacyManagerAnonymizeSomeRawDataPost**](PrivacyManagerApi.md#indexPhpmethodPrivacyManagerAnonymizeSomeRawDataPost) | **POST** /index.php?method&#x3D;PrivacyManager.anonymizeSomeRawData |  |
| [**indexPhpmethodPrivacyManagerDeleteDataSubjectsPost**](PrivacyManagerApi.md#indexPhpmethodPrivacyManagerDeleteDataSubjectsPost) | **POST** /index.php?method&#x3D;PrivacyManager.deleteDataSubjects |  |
| [**indexPhpmethodPrivacyManagerExportDataSubjectsPost**](PrivacyManagerApi.md#indexPhpmethodPrivacyManagerExportDataSubjectsPost) | **POST** /index.php?method&#x3D;PrivacyManager.exportDataSubjects |  |
| [**indexPhpmethodPrivacyManagerFindDataSubjectsPost**](PrivacyManagerApi.md#indexPhpmethodPrivacyManagerFindDataSubjectsPost) | **POST** /index.php?method&#x3D;PrivacyManager.findDataSubjects |  |
| [**indexPhpmethodPrivacyManagerGetAvailableLinkVisitActionColumnsToAnonymizePost**](PrivacyManagerApi.md#indexPhpmethodPrivacyManagerGetAvailableLinkVisitActionColumnsToAnonymizePost) | **POST** /index.php?method&#x3D;PrivacyManager.getAvailableLinkVisitActionColumnsToAnonymize |  |
| [**indexPhpmethodPrivacyManagerGetAvailableVisitColumnsToAnonymizePost**](PrivacyManagerApi.md#indexPhpmethodPrivacyManagerGetAvailableVisitColumnsToAnonymizePost) | **POST** /index.php?method&#x3D;PrivacyManager.getAvailableVisitColumnsToAnonymize |  |



## indexPhpmethodPrivacyManagerAnonymizeSomeRawDataPost

> indexPhpmethodPrivacyManagerAnonymizeSomeRawDataPost(indexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivacyManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        PrivacyManagerApi apiInstance = new PrivacyManagerApi(defaultClient);
        IndexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest indexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest = new IndexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest(); // IndexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest | 
        try {
            apiInstance.indexPhpmethodPrivacyManagerAnonymizeSomeRawDataPost(indexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyManagerApi#indexPhpmethodPrivacyManagerAnonymizeSomeRawDataPost");
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
| **indexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest** | [**IndexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest**](IndexPhpMethodPrivacyManagerAnonymizeSomeRawDataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodPrivacyManagerDeleteDataSubjectsPost

> indexPhpmethodPrivacyManagerDeleteDataSubjectsPost(indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivacyManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        PrivacyManagerApi apiInstance = new PrivacyManagerApi(defaultClient);
        IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest = new IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest(); // IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest | 
        try {
            apiInstance.indexPhpmethodPrivacyManagerDeleteDataSubjectsPost(indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyManagerApi#indexPhpmethodPrivacyManagerDeleteDataSubjectsPost");
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
| **indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest** | [**IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest**](IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodPrivacyManagerExportDataSubjectsPost

> indexPhpmethodPrivacyManagerExportDataSubjectsPost(indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivacyManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        PrivacyManagerApi apiInstance = new PrivacyManagerApi(defaultClient);
        IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest = new IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest(); // IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest | 
        try {
            apiInstance.indexPhpmethodPrivacyManagerExportDataSubjectsPost(indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyManagerApi#indexPhpmethodPrivacyManagerExportDataSubjectsPost");
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
| **indexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest** | [**IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest**](IndexPhpMethodPrivacyManagerDeleteDataSubjectsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodPrivacyManagerFindDataSubjectsPost

> indexPhpmethodPrivacyManagerFindDataSubjectsPost(indexPhpMethodLiveGetMostRecentVisitorIdPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivacyManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        PrivacyManagerApi apiInstance = new PrivacyManagerApi(defaultClient);
        IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest indexPhpMethodLiveGetMostRecentVisitorIdPostRequest = new IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest(); // IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest | 
        try {
            apiInstance.indexPhpmethodPrivacyManagerFindDataSubjectsPost(indexPhpMethodLiveGetMostRecentVisitorIdPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyManagerApi#indexPhpmethodPrivacyManagerFindDataSubjectsPost");
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
| **indexPhpMethodLiveGetMostRecentVisitorIdPostRequest** | [**IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest**](IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodPrivacyManagerGetAvailableLinkVisitActionColumnsToAnonymizePost

> indexPhpmethodPrivacyManagerGetAvailableLinkVisitActionColumnsToAnonymizePost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivacyManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        PrivacyManagerApi apiInstance = new PrivacyManagerApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodPrivacyManagerGetAvailableLinkVisitActionColumnsToAnonymizePost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyManagerApi#indexPhpmethodPrivacyManagerGetAvailableLinkVisitActionColumnsToAnonymizePost");
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



## indexPhpmethodPrivacyManagerGetAvailableVisitColumnsToAnonymizePost

> indexPhpmethodPrivacyManagerGetAvailableVisitColumnsToAnonymizePost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivacyManagerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        PrivacyManagerApi apiInstance = new PrivacyManagerApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodPrivacyManagerGetAvailableVisitColumnsToAnonymizePost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyManagerApi#indexPhpmethodPrivacyManagerGetAvailableVisitColumnsToAnonymizePost");
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


