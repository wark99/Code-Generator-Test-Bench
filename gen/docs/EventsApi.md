# EventsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call2eventsEventIdGet**](EventsApi.md#call2eventsEventIdGet) | **GET** /2/events/{event_id} | Display an event |
| [**call2eventsGet**](EventsApi.md#call2eventsGet) | **GET** /2/events | List events |



## call2eventsEventIdGet

> Model2EventsEventIdGet200Response call2eventsEventIdGet(eventId)

Display an event

Returns a variety of information about a single Event specified by the requested unique identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EventsApi apiInstance = new EventsApi(defaultClient);
        Integer eventId = 56; // Integer | The unique identifier (ID) of the event to request.
        try {
            Model2EventsEventIdGet200Response result = apiInstance.call2eventsEventIdGet(eventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#call2eventsEventIdGet");
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
| **eventId** | **Integer**| The unique identifier (ID) of the event to request. | |

### Return type

[**Model2EventsEventIdGet200Response**](Model2EventsEventIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call2eventsGet

> Model2EventsGet200Response call2eventsGet(eventType, locale, showAuto, status, withTrashed)

List events

This endpoint allows you to retrieve all the opened events.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventType = "internal"; // String | 
        String locale = "de"; // String | 
        Boolean showAuto = true; // Boolean | 
        String status = "inprogress"; // String | 
        Boolean withTrashed = true; // Boolean | 
        try {
            Model2EventsGet200Response result = apiInstance.call2eventsGet(eventType, locale, showAuto, status, withTrashed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#call2eventsGet");
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
| **eventType** | **String**|  | [optional] [enum: internal, public, server, streaming] |
| **locale** | **String**|  | [optional] [enum: de, en, es, fr, it] |
| **showAuto** | **Boolean**|  | [optional] |
| **status** | **String**|  | [optional] [enum: inprogress, reviewed, terminated] |
| **withTrashed** | **Boolean**|  | [optional] |

### Return type

[**Model2EventsGet200Response**](Model2EventsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

