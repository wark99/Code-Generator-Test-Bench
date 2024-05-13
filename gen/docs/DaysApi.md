# DaysApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDays**](DaysApi.md#getDays) | **GET** /days | List days |



## getDays

> List&lt;String&gt; getDays(filterOrganiser)

List days

Retrieve a list of days.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        DaysApi apiInstance = new DaysApi(defaultClient);
        Integer filterOrganiser = 56; // Integer | ID of the organiser
        try {
            List<String> result = apiInstance.getDays(filterOrganiser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DaysApi#getDays");
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
| **filterOrganiser** | **Integer**| ID of the organiser | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of days the organiser delivers classes. |  -  |

