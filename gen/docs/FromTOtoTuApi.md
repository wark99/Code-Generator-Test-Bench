# FromTOtoTuApi

All URIs are relative to *https://asteo.pre.optimaprivatecloud.es*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**troubleTicketUpdatePost**](FromTOtoTuApi.md#troubleTicketUpdatePost) | **POST** /troubleTicket/update | Update an existing ticket from TO to TU. |



## troubleTicketUpdatePost

> UpdateTicket troubleTicketUpdatePost(updateTicket)

Update an existing ticket from TO to TU.

The ticket status changes in TO and send information to TU.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FromTOtoTuApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://asteo.pre.optimaprivatecloud.es");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FromTOtoTuApi apiInstance = new FromTOtoTuApi(defaultClient);
        UpdateTicket updateTicket = new UpdateTicket(); // UpdateTicket | Ticket object to update a ticket.
        try {
            UpdateTicket result = apiInstance.troubleTicketUpdatePost(updateTicket);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FromTOtoTuApi#troubleTicketUpdatePost");
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
| **updateTicket** | [**UpdateTicket**](UpdateTicket.md)| Ticket object to update a ticket. | |

### Return type

[**UpdateTicket**](UpdateTicket.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |

