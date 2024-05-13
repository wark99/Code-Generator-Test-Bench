# VerificationApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verifyConsumerFile**](VerificationApiApi.md#verifyConsumerFile) | **POST** /verify | Verify consumer file holder of a consumer file |



## verifyConsumerFile

> VerificationResponse verifyConsumerFile(consumerFileForVerification)

Verify consumer file holder of a consumer file

Verifies the owner of accounts and credit files in a consumer file.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VerificationApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerificationApiApi apiInstance = new VerificationApiApi(defaultClient);
        ConsumerFileForVerification consumerFileForVerification = new ConsumerFileForVerification(); // ConsumerFileForVerification | Consumer file and credit report data.
        try {
            VerificationResponse result = apiInstance.verifyConsumerFile(consumerFileForVerification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationApiApi#verifyConsumerFile");
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
| **consumerFileForVerification** | [**ConsumerFileForVerification**](ConsumerFileForVerification.md)| Consumer file and credit report data. | |

### Return type

[**VerificationResponse**](VerificationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consumer file is verified successfully. |  -  |
| **400** | Accounts and credit files seem to belong to different persons. |  -  |

