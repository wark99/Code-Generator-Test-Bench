# StatusApi

All URIs are relative to *https://dev1.nationalservicealliance.com/clientapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatus**](StatusApi.md#getStatus) | **GET** /status/status.php | Provides status of dispatch by dispatchNumber or case number in the url |



## getStatus

> StatusResponse getStatus(dispatchNumber, caseNumber)

Provides status of dispatch by dispatchNumber or case number in the url

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String dispatchNumber = "dispatchNumber_example"; // String | NSA dispatchNumber
        String caseNumber = "caseNumber_example"; // String | Client provided case number
        try {
            StatusResponse result = apiInstance.getStatus(dispatchNumber, caseNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#getStatus");
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
| **dispatchNumber** | **String**| NSA dispatchNumber | [optional] |
| **caseNumber** | **String**| Client provided case number | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current status of the dispatch |  -  |
| **400** | User request error |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |

