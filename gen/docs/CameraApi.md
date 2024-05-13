# CameraApi

All URIs are relative to *http://localhost:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cInfoPut**](CameraApi.md#cInfoPut) | **PUT** /c/info | Update camera attributes |
| [**cSnapshotPut**](CameraApi.md#cSnapshotPut) | **PUT** /c/snapshot | Upload snapshot to Connect |



## cInfoPut

> CameraResponse cInfoPut(cameraRequest)

Update camera attributes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CameraApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
        
        // Configure API key authorization: Fingerprint
        ApiKeyAuth Fingerprint = (ApiKeyAuth) defaultClient.getAuthentication("Fingerprint");
        Fingerprint.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Fingerprint.setApiKeyPrefix("Token");

        // Configure API key authorization: Token
        ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
        Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Token.setApiKeyPrefix("Token");

        CameraApi apiInstance = new CameraApi(defaultClient);
        CameraRequest cameraRequest = new CameraRequest(); // CameraRequest | 
        try {
            CameraResponse result = apiInstance.cInfoPut(cameraRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CameraApi#cInfoPut");
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
| **cameraRequest** | [**CameraRequest**](CameraRequest.md)|  | |

### Return type

[**CameraResponse**](CameraResponse.md)

### Authorization

[Fingerprint](../README.md#Fingerprint), [Token](../README.md#Token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **OK** |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **503** |  |  -  |


## cSnapshotPut

> cSnapshotPut(body)

Upload snapshot to Connect

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CameraApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
        
        // Configure API key authorization: Fingerprint
        ApiKeyAuth Fingerprint = (ApiKeyAuth) defaultClient.getAuthentication("Fingerprint");
        Fingerprint.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Fingerprint.setApiKeyPrefix("Token");

        // Configure API key authorization: Token
        ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
        Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Token.setApiKeyPrefix("Token");

        CameraApi apiInstance = new CameraApi(defaultClient);
        File body = new File("/path/to/file"); // File | 
        try {
            apiInstance.cSnapshotPut(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CameraApi#cSnapshotPut");
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
| **body** | **File**|  | |

### Return type

null (empty response body)

### Authorization

[Fingerprint](../README.md#Fingerprint), [Token](../README.md#Token)

### HTTP request headers

- **Content-Type**: image/jpg
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **503** |  |  -  |

