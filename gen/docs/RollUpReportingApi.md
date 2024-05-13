# RollUpReportingApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodRollUpReportingAddRollUpPost**](RollUpReportingApi.md#indexPhpmethodRollUpReportingAddRollUpPost) | **POST** /index.php?method&#x3D;RollUpReporting.addRollUp |  |
| [**indexPhpmethodRollUpReportingGetRollUpsPost**](RollUpReportingApi.md#indexPhpmethodRollUpReportingGetRollUpsPost) | **POST** /index.php?method&#x3D;RollUpReporting.getRollUps |  |
| [**indexPhpmethodRollUpReportingUpdateRollUpPost**](RollUpReportingApi.md#indexPhpmethodRollUpReportingUpdateRollUpPost) | **POST** /index.php?method&#x3D;RollUpReporting.updateRollUp |  |



## indexPhpmethodRollUpReportingAddRollUpPost

> indexPhpmethodRollUpReportingAddRollUpPost(indexPhpMethodRollUpReportingAddRollUpPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RollUpReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        RollUpReportingApi apiInstance = new RollUpReportingApi(defaultClient);
        IndexPhpMethodRollUpReportingAddRollUpPostRequest indexPhpMethodRollUpReportingAddRollUpPostRequest = new IndexPhpMethodRollUpReportingAddRollUpPostRequest(); // IndexPhpMethodRollUpReportingAddRollUpPostRequest | 
        try {
            apiInstance.indexPhpmethodRollUpReportingAddRollUpPost(indexPhpMethodRollUpReportingAddRollUpPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling RollUpReportingApi#indexPhpmethodRollUpReportingAddRollUpPost");
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
| **indexPhpMethodRollUpReportingAddRollUpPostRequest** | [**IndexPhpMethodRollUpReportingAddRollUpPostRequest**](IndexPhpMethodRollUpReportingAddRollUpPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodRollUpReportingGetRollUpsPost

> indexPhpmethodRollUpReportingGetRollUpsPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RollUpReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        RollUpReportingApi apiInstance = new RollUpReportingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodRollUpReportingGetRollUpsPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling RollUpReportingApi#indexPhpmethodRollUpReportingGetRollUpsPost");
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



## indexPhpmethodRollUpReportingUpdateRollUpPost

> indexPhpmethodRollUpReportingUpdateRollUpPost(indexPhpMethodRollUpReportingUpdateRollUpPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RollUpReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        RollUpReportingApi apiInstance = new RollUpReportingApi(defaultClient);
        IndexPhpMethodRollUpReportingUpdateRollUpPostRequest indexPhpMethodRollUpReportingUpdateRollUpPostRequest = new IndexPhpMethodRollUpReportingUpdateRollUpPostRequest(); // IndexPhpMethodRollUpReportingUpdateRollUpPostRequest | 
        try {
            apiInstance.indexPhpmethodRollUpReportingUpdateRollUpPost(indexPhpMethodRollUpReportingUpdateRollUpPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling RollUpReportingApi#indexPhpmethodRollUpReportingUpdateRollUpPost");
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
| **indexPhpMethodRollUpReportingUpdateRollUpPostRequest** | [**IndexPhpMethodRollUpReportingUpdateRollUpPostRequest**](IndexPhpMethodRollUpReportingUpdateRollUpPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


