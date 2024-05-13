# ServiceApi

All URIs are relative to *https://api-eseg.mindlogix.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNaceFromAteco**](ServiceApi.md#getNaceFromAteco) | **GET** /ateco2nace/{ateco} |  |



## getNaceFromAteco

> AtecoToNaceResponse getNaceFromAteco(ateco)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        ServiceApi apiInstance = new ServiceApi(defaultClient);
        String ateco = "ateco_example"; // String | ateco code
        try {
            AtecoToNaceResponse result = apiInstance.getNaceFromAteco(ateco);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceApi#getNaceFromAteco");
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
| **ateco** | **String**| ateco code | |

### Return type

[**AtecoToNaceResponse**](AtecoToNaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | nace code |  -  |

