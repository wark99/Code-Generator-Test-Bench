# TokensApi

All URIs are relative to *https://digicert-api.dev.filedgr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTokenAttachmentsTokensTokenCodeAttachmentsGet**](TokensApi.md#getTokenAttachmentsTokensTokenCodeAttachmentsGet) | **GET** /tokens/{token_code}/attachments | Get Token Attachments |



## getTokenAttachmentsTokensTokenCodeAttachmentsGet

> GetDataAttachmentPaginationSet getTokenAttachmentsTokensTokenCodeAttachmentsGet(tokenCode, pageSize, page, accept)

Get Token Attachments

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://digicert-api.dev.filedgr.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String tokenCode = "tokenCode_example"; // String | 
        Integer pageSize = 10; // Integer | 
        Integer page = 1; // Integer | 
        String accept = "application/vnd.com.filedgr.digicertApi.0.4.0+json"; // String | 
        try {
            GetDataAttachmentPaginationSet result = apiInstance.getTokenAttachmentsTokensTokenCodeAttachmentsGet(tokenCode, pageSize, page, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#getTokenAttachmentsTokensTokenCodeAttachmentsGet");
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
| **tokenCode** | **String**|  | |
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **accept** | **String**|  | [optional] [enum: application/vnd.com.filedgr.digicertApi.0.4.0+json] |

### Return type

[**GetDataAttachmentPaginationSet**](GetDataAttachmentPaginationSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **204** | No Content |  -  |
| **422** | Validation Error |  -  |

