# AttachmentsApi

All URIs are relative to *https://digicert-api.dev.filedgr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataAttachmentAttachmentsDataAttachmentIdGet**](AttachmentsApi.md#getDataAttachmentAttachmentsDataAttachmentIdGet) | **GET** /attachments/{data_attachment_id} | Get Data Attachment |



## getDataAttachmentAttachmentsDataAttachmentIdGet

> GetDataAttachmentResponse getDataAttachmentAttachmentsDataAttachmentIdGet(dataAttachmentId, accept)

Get Data Attachment

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://digicert-api.dev.filedgr.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        UUID dataAttachmentId = UUID.randomUUID(); // UUID | 
        String accept = "application/vnd.com.filedgr.digicertApi.0.4.0+json"; // String | 
        try {
            GetDataAttachmentResponse result = apiInstance.getDataAttachmentAttachmentsDataAttachmentIdGet(dataAttachmentId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#getDataAttachmentAttachmentsDataAttachmentIdGet");
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
| **dataAttachmentId** | **UUID**|  | |
| **accept** | **String**|  | [optional] [enum: application/vnd.com.filedgr.digicertApi.0.4.0+json] |

### Return type

[**GetDataAttachmentResponse**](GetDataAttachmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |

