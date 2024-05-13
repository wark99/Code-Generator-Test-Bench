# GatewayApi

All URIs are relative to *https://localhost:8080/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendMonthlyNewsletterByEmail**](GatewayApi.md#sendMonthlyNewsletterByEmail) | **POST** /email/newsletter | Send monthly newsletter to customer via email |



## sendMonthlyNewsletterByEmail

> SendMonthlyNewsletterByEmail200Response sendMonthlyNewsletterByEmail(gatewayBody)

Send monthly newsletter to customer via email

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GatewayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8080/api/v1");

        GatewayApi apiInstance = new GatewayApi(defaultClient);
        GatewayBody gatewayBody = new GatewayBody(); // GatewayBody | The customer ID and message ID
        try {
            SendMonthlyNewsletterByEmail200Response result = apiInstance.sendMonthlyNewsletterByEmail(gatewayBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GatewayApi#sendMonthlyNewsletterByEmail");
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
| **gatewayBody** | [**GatewayBody**](GatewayBody.md)| The customer ID and message ID | |

### Return type

[**SendMonthlyNewsletterByEmail200Response**](SendMonthlyNewsletterByEmail200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

