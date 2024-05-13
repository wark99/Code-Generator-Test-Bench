# LinksApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLink**](LinksApi.md#getLink) | **GET** /links | Get a link |



## getLink

> GetLink200Response getLink(filterOrganiser)

Get a link

Retrieve a organiser link.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        LinksApi apiInstance = new LinksApi(defaultClient);
        Integer filterOrganiser = 56; // Integer | ID of the organiser
        try {
            GetLink200Response result = apiInstance.getLink(filterOrganiser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#getLink");
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

[**GetLink200Response**](GetLink200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the users link for the given organiser. |  -  |

