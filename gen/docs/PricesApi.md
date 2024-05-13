# PricesApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPrices**](PricesApi.md#getPrices) | **GET** /prices | List prices |



## getPrices

> GetPrices200Response getPrices(filterClass, filterStudents)

List prices

Retrieve a list of prices.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        PricesApi apiInstance = new PricesApi(defaultClient);
        Integer filterClass = 56; // Integer | ID of the class
        List<String> filterStudents = Arrays.asList(); // List<String> | IDs of the students
        try {
            GetPrices200Response result = apiInstance.getPrices(filterClass, filterStudents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPrices");
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
| **filterClass** | **Integer**| ID of the class | |
| **filterStudents** | [**List&lt;String&gt;**](String.md)| IDs of the students | |

### Return type

[**GetPrices200Response**](GetPrices200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Price objects.  When the class filter is provided, the list contains only prices that are available for this class.  When the students filter is provided, the list contains only prices that are available for all students. |  -  |

