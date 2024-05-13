# VenuesApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVenue**](VenuesApi.md#getVenue) | **GET** /venues/{venueId} | Get a venue |
| [**getVenues**](VenuesApi.md#getVenues) | **GET** /venues | List venues |



## getVenue

> GetVenue200Response getVenue(venueId)

Get a venue

Retrieve the venue.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VenuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        VenuesApi apiInstance = new VenuesApi(defaultClient);
        String venueId = "venueId_example"; // String | 
        try {
            GetVenue200Response result = apiInstance.getVenue(venueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenuesApi#getVenue");
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
| **venueId** | **String**|  | |

### Return type

[**GetVenue200Response**](GetVenue200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Venue object. |  -  |
| **404** | Venue not found. |  -  |


## getVenues

> GetVenues200Response getVenues()

List venues

Retrieve a list of venues.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VenuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        VenuesApi apiInstance = new VenuesApi(defaultClient);
        try {
            GetVenues200Response result = apiInstance.getVenues();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenuesApi#getVenues");
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

[**GetVenues200Response**](GetVenues200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Venue objects. |  -  |

