# VenueApi

All URIs are relative to *https://api.rphaven.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**showBranchVenues**](VenueApi.md#showBranchVenues) | **GET** /branch/{branchId}/venues |  |
| [**showVenueDetails**](VenueApi.md#showVenueDetails) | **GET** /venue/{venueId} |  |
| [**showVenueMeets**](VenueApi.md#showVenueMeets) | **GET** /venue/{venueId}/meets |  |
| [**showVenueTables**](VenueApi.md#showVenueTables) | **GET** /venue/{venueId}/tables |  |



## showBranchVenues

> BranchVenues showBranchVenues(branchId)



Show Venues for a Branch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VenueApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        VenueApi apiInstance = new VenueApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the Branch
        try {
            BranchVenues result = apiInstance.showBranchVenues(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApi#showBranchVenues");
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
| **branchId** | **UUID**| ID of the Branch | |

### Return type

[**BranchVenues**](BranchVenues.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show Venues for a Branch |  -  |


## showVenueDetails

> VenueDetails showVenueDetails(venueId)



Show a Venue

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VenueApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        VenueApi apiInstance = new VenueApi(defaultClient);
        UUID venueId = UUID.randomUUID(); // UUID | ID of the venue
        try {
            VenueDetails result = apiInstance.showVenueDetails(venueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApi#showVenueDetails");
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

[**VenueDetails**](VenueDetails.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show venue details |  -  |


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
import org.openapitools.client.api.VenueApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        VenueApi apiInstance = new VenueApi(defaultClient);
        UUID venueId = UUID.randomUUID(); // UUID | ID of the venue
        try {
            VenueMeets result = apiInstance.showVenueMeets(venueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApi#showVenueMeets");
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


## showVenueTables

> Object showVenueTables(venueId)



Show Tables at a Venue

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VenueApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        VenueApi apiInstance = new VenueApi(defaultClient);
        UUID venueId = UUID.randomUUID(); // UUID | ID of the venue
        try {
            Object result = apiInstance.showVenueTables(venueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApi#showVenueTables");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show venue tables |  -  |

