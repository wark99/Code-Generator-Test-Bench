# UploadApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateUploadURL**](UploadApiApi.md#generateUploadURL) | **POST** /upload/generate-url | Generate upload URL |
| [**startUploadSession**](UploadApiApi.md#startUploadSession) | **POST** /upload/session | Start upload session |



## generateUploadURL

> UploadURLResponse generateUploadURL(sessionID)

Generate upload URL

Generates a unique and safe URL to upload file.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UploadApiApi apiInstance = new UploadApiApi(defaultClient);
        String sessionID = "sessionID_example"; // String | ID of an active upload session.
        try {
            UploadURLResponse result = apiInstance.generateUploadURL(sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApiApi#generateUploadURL");
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
| **sessionID** | **String**| ID of an active upload session. | [optional] |

### Return type

[**UploadURLResponse**](UploadURLResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload path generated successfully. |  -  |
| **400** | Validation error. |  -  |
| **401** | Upload session already expired. |  -  |
| **404** | Upload session not found. |  -  |


## startUploadSession

> UploadSessionResponse startUploadSession()

Start upload session

Starts a new file upload session to upload aggregator files and credit report for scoring purpose.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UploadApiApi apiInstance = new UploadApiApi(defaultClient);
        try {
            UploadSessionResponse result = apiInstance.startUploadSession();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApiApi#startUploadSession");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UploadSessionResponse**](UploadSessionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload session started successfully. |  -  |
| **400** | Validation error. |  -  |

