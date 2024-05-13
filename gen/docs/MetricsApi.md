# MetricsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetric**](MetricsApi.md#getMetric) | **GET** /metics/{domain}/{metric} | Get a metric |



## getMetric

> GetMetric200Response getMetric(domain, metric, clubId, filterDateRange)

Get a metric

Retrieve the metric.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String domain = "domain_example"; // String | 
        String metric = "metric_example"; // String | 
        Integer clubId = 56; // Integer | ID of the organiser
        String filterDateRange = "filterDateRange_example"; // String | Date range
        try {
            GetMetric200Response result = apiInstance.getMetric(domain, metric, clubId, filterDateRange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#getMetric");
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
| **domain** | **String**|  | |
| **metric** | **String**|  | |
| **clubId** | **Integer**| ID of the organiser | [optional] |
| **filterDateRange** | **String**| Date range | [optional] |

### Return type

[**GetMetric200Response**](GetMetric200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the trend or value metric. |  -  |
| **404** | Booking not found. |  -  |

