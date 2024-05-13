# MeetApi

All URIs are relative to *https://api.rphaven.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**showMeetDetails**](MeetApi.md#showMeetDetails) | **GET** /meet/{meetId} |  |
| [**showMeetSessions**](MeetApi.md#showMeetSessions) | **GET** /meet/{meetId}/sessions |  |
| [**showVenueMeets**](MeetApi.md#showVenueMeets) | **GET** /venue/{venueId}/meets |  |



## showMeetDetails

> MeetDetails showMeetDetails(meetId)



Show a Meet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        MeetApi apiInstance = new MeetApi(defaultClient);
        UUID meetId = UUID.randomUUID(); // UUID | ID of the Meet
        try {
            MeetDetails result = apiInstance.showMeetDetails(meetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetApi#showMeetDetails");
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
| **meetId** | **UUID**| ID of the Meet | |

### Return type

[**MeetDetails**](MeetDetails.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show Meet details |  -  |


## showMeetSessions

> Object showMeetSessions(meetId)



Show all Session for a Meet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        MeetApi apiInstance = new MeetApi(defaultClient);
        UUID meetId = UUID.randomUUID(); // UUID | ID of the Meet
        try {
            Object result = apiInstance.showMeetSessions(meetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetApi#showMeetSessions");
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
| **meetId** | **UUID**| ID of the Meet | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show Meet |  -  |


## showVenueMeets

> VenueMeets showVenueMeets(venueId)



Show Meets at a Venue

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        MeetApi apiInstance = new MeetApi(defaultClient);
        UUID venueId = UUID.randomUUID(); // UUID | ID of the venue
        try {
            VenueMeets result = apiInstance.showVenueMeets(venueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetApi#showVenueMeets");
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
| **venueId** | **UUID**| ID of the venue | |

### Return type

[**VenueMeets**](VenueMeets.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show venue meets |  -  |

