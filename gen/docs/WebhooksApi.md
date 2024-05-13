# WebhooksApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventsStripePost**](WebhooksApi.md#eventsStripePost) | **POST** /events/stripe | endpoint exposed to payment provider to send webhooks |



## eventsStripePost

> eventsStripePost()

endpoint exposed to payment provider to send webhooks

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            apiInstance.eventsStripePost();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#eventsStripePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Web hook response processed correctly |  -  |
| **400** | Unable to process webhook |  -  |

