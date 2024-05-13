# DocumentFileRecordApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDocumentFileRecordGet**](DocumentFileRecordApi.md#apiDocumentFileRecordGet) | **GET** /api/document-file-record |  |
| [**apiDocumentFileRecordPost**](DocumentFileRecordApi.md#apiDocumentFileRecordPost) | **POST** /api/document-file-record |  |
| [**apiDocumentFileRecordTargetIdDelete**](DocumentFileRecordApi.md#apiDocumentFileRecordTargetIdDelete) | **DELETE** /api/document-file-record/{target_id} |  |
| [**apiDocumentFileRecordTargetIdPut**](DocumentFileRecordApi.md#apiDocumentFileRecordTargetIdPut) | **PUT** /api/document-file-record/{target_id} |  |



## apiDocumentFileRecordGet

> Object apiDocumentFileRecordGet(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentFileRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentFileRecordApi apiInstance = new DocumentFileRecordApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            Object result = apiInstance.apiDocumentFileRecordGet(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentFileRecordApi#apiDocumentFileRecordGet");
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
| **targetId** | **Integer**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## apiDocumentFileRecordPost

> BaseHttpActionPostCorrectResponseModel apiDocumentFileRecordPost(trainingRecordId, fileDescription, note, inputFile)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentFileRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentFileRecordApi apiInstance = new DocumentFileRecordApi(defaultClient);
        Integer trainingRecordId = 56; // Integer | 
        String fileDescription = "fileDescription_example"; // String | 
        String note = "note_example"; // String | 
        File inputFile = new File("/path/to/file"); // File | 
        try {
            BaseHttpActionPostCorrectResponseModel result = apiInstance.apiDocumentFileRecordPost(trainingRecordId, fileDescription, note, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentFileRecordApi#apiDocumentFileRecordPost");
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
| **trainingRecordId** | **Integer**|  | |
| **fileDescription** | **String**|  | |
| **note** | **String**|  | |
| **inputFile** | **File**|  | |

### Return type

[**BaseHttpActionPostCorrectResponseModel**](BaseHttpActionPostCorrectResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## apiDocumentFileRecordTargetIdDelete

> BaseHttpActionDeleteCorrectResponseModel apiDocumentFileRecordTargetIdDelete(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentFileRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentFileRecordApi apiInstance = new DocumentFileRecordApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            BaseHttpActionDeleteCorrectResponseModel result = apiInstance.apiDocumentFileRecordTargetIdDelete(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentFileRecordApi#apiDocumentFileRecordTargetIdDelete");
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
| **targetId** | **Integer**|  | |

### Return type

[**BaseHttpActionDeleteCorrectResponseModel**](BaseHttpActionDeleteCorrectResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## apiDocumentFileRecordTargetIdPut

> BaseHttpActionPutCorrectResponseModel apiDocumentFileRecordTargetIdPut(targetId, trainingRecordId, fileDescription, note, inputFile)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentFileRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentFileRecordApi apiInstance = new DocumentFileRecordApi(defaultClient);
        Integer targetId = 56; // Integer | 
        Integer trainingRecordId = 56; // Integer | 
        String fileDescription = "fileDescription_example"; // String | 
        String note = "note_example"; // String | 
        File inputFile = new File("/path/to/file"); // File | 
        try {
            BaseHttpActionPutCorrectResponseModel result = apiInstance.apiDocumentFileRecordTargetIdPut(targetId, trainingRecordId, fileDescription, note, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentFileRecordApi#apiDocumentFileRecordTargetIdPut");
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
| **targetId** | **Integer**|  | |
| **trainingRecordId** | **Integer**|  | |
| **fileDescription** | **String**|  | |
| **note** | **String**|  | |
| **inputFile** | **File**|  | |

### Return type

[**BaseHttpActionPutCorrectResponseModel**](BaseHttpActionPutCorrectResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

