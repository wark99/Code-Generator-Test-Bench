# StorageRoutesApi

All URIs are relative to *http://localhost:5001/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadImage**](StorageRoutesApi.md#uploadImage) | **POST** /storage/upload-image | upload-image |
| [**uploadVideo**](StorageRoutesApi.md#uploadVideo) | **POST** /storage/upload-video | upload-video |



## uploadImage

> uploadImage(contentType, image, type)

upload-image

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StorageRoutesApi apiInstance = new StorageRoutesApi(defaultClient);
        String contentType = "multipart/form-data"; // String | 
        File image = new File("/path/to/file"); // File | 
        String type = "storyImage"; // String | 
        try {
            apiInstance.uploadImage(contentType, image, type);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageRoutesApi#uploadImage");
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
| **contentType** | **String**|  | [enum: multipart/form-data] |
| **image** | **File**|  | |
| **type** | **String**|  | [optional] [enum: storyImage, storyVideo, profilePicture] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## uploadVideo

> uploadVideo(contentType, video)

upload-video

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StorageRoutesApi apiInstance = new StorageRoutesApi(defaultClient);
        String contentType = "multipart/form-data"; // String | 
        File video = new File("/path/to/file"); // File | 
        try {
            apiInstance.uploadVideo(contentType, video);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageRoutesApi#uploadVideo");
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
| **contentType** | **String**|  | [enum: multipart/form-data] |
| **video** | **File**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

