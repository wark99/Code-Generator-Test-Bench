# FromTUtoToApi

All URIs are relative to *https://asteo.pre.optimaprivatecloud.es*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**troubleTicketPost**](FromTUtoToApi.md#troubleTicketPost) | **POST** /troubleTicket | Create a new ticket in TO. |
| [**troubleTicketPrimaryKeyPatch**](FromTUtoToApi.md#troubleTicketPrimaryKeyPatch) | **PATCH** /troubleTicket/{primaryKey} | Update an existing ticket from TU to TO. |



## troubleTicketPost

> TicketKeys troubleTicketPost(ticket)

Create a new ticket in TO.

Create a new ticket in the Freshdesk instance that corresponds depending on the requested data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FromTUtoToApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://asteo.pre.optimaprivatecloud.es");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FromTUtoToApi apiInstance = new FromTUtoToApi(defaultClient);
        Ticket ticket = new Ticket(); // Ticket | Ticket attributes needed to create a new ticket.
        try {
            TicketKeys result = apiInstance.troubleTicketPost(ticket);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FromTUtoToApi#troubleTicketPost");
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
| **ticket** | [**Ticket**](Ticket.md)| Ticket attributes needed to create a new ticket. | |

### Return type

[**TicketKeys**](TicketKeys.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## troubleTicketPrimaryKeyPatch

> UpdateTicket troubleTicketPrimaryKeyPatch(primaryKey, updateTicket)

Update an existing ticket from TU to TO.

Update the ticket in TO system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FromTUtoToApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://asteo.pre.optimaprivatecloud.es");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FromTUtoToApi apiInstance = new FromTUtoToApi(defaultClient);
        String primaryKey = "primaryKey_example"; // String | 
        UpdateTicket updateTicket = new UpdateTicket(); // UpdateTicket | Ticket object to update a ticket.
        try {
            UpdateTicket result = apiInstance.troubleTicketPrimaryKeyPatch(primaryKey, updateTicket);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FromTUtoToApi#troubleTicketPrimaryKeyPatch");
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
| **primaryKey** | **String**|  | |
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

