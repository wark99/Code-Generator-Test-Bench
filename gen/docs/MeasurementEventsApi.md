# MeasurementEventsApi

All URIs are relative to *https://device-events.lfapi.net/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**measurementEventsGet**](MeasurementEventsApi.md#measurementEventsGet) | **GET** /measurement-events | Query measurement events |
| [**measurementEventsIdGet**](MeasurementEventsApi.md#measurementEventsIdGet) | **GET** /measurement-events/{id} | Get a single measurement event |
| [**measurementEventsPost**](MeasurementEventsApi.md#measurementEventsPost) | **POST** /measurement-events | Create a measurement event (for non-production testing only) |



## measurementEventsGet

> List&lt;MeasurementEvent&gt; measurementEventsGet(since, until, types, offset, limit)

Query measurement events

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementEventsApi apiInstance = new MeasurementEventsApi(defaultClient);
        OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Include events that occurred or were modified after the specified date/time (inclusive).
        OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Include events that occurred or were modified before the specified date/time (inclusive).
        List<MeasurementEventType> types = Arrays.asList(); // List<MeasurementEventType> | Filter by event type(s).
        Integer offset = 56; // Integer | The number of events to skip.
        Integer limit = 56; // Integer | The maximum number of events to return.
        try {
            List<MeasurementEvent> result = apiInstance.measurementEventsGet(since, until, types, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementEventsApi#measurementEventsGet");
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
| **since** | **OffsetDateTime**| Include events that occurred or were modified after the specified date/time (inclusive). | [optional] |
| **until** | **OffsetDateTime**| Include events that occurred or were modified before the specified date/time (inclusive). | [optional] |
| **types** | [**List&lt;MeasurementEventType&gt;**](MeasurementEventType.md)| Filter by event type(s). | [optional] |
| **offset** | **Integer**| The number of events to skip. | [optional] |
| **limit** | **Integer**| The maximum number of events to return. | [optional] |

### Return type

[**List&lt;MeasurementEvent&gt;**](MeasurementEvent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Measurement events (if any) |  -  |


## measurementEventsIdGet

> MeasurementEvent measurementEventsIdGet(id)

Get a single measurement event

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementEventsApi apiInstance = new MeasurementEventsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | ID of the measurement event.
        try {
            MeasurementEvent result = apiInstance.measurementEventsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementEventsApi#measurementEventsIdGet");
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
| **id** | **UUID**| ID of the measurement event. | |

### Return type

[**MeasurementEvent**](MeasurementEvent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Measurement event |  -  |


## measurementEventsPost

> MeasurementEvent measurementEventsPost(createMeasurementEventRequest)

Create a measurement event (for non-production testing only)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementEventsApi apiInstance = new MeasurementEventsApi(defaultClient);
        CreateMeasurementEventRequest createMeasurementEventRequest = new CreateMeasurementEventRequest(); // CreateMeasurementEventRequest | 
        try {
            MeasurementEvent result = apiInstance.measurementEventsPost(createMeasurementEventRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementEventsApi#measurementEventsPost");
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
| **createMeasurementEventRequest** | [**CreateMeasurementEventRequest**](CreateMeasurementEventRequest.md)|  | |

### Return type

[**MeasurementEvent**](MeasurementEvent.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Measurement event created |  * Locatioh - The URL of the newly created measurement webhook. <br>  |

