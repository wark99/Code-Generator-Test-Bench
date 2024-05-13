# BookingsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBooking**](BookingsApi.md#getBooking) | **GET** /bookings/{bookingRef} | Get a booking |
| [**getBookingCalculation**](BookingsApi.md#getBookingCalculation) | **GET** /bookings/calculate | Calculate booking costs |
| [**getBookings**](BookingsApi.md#getBookings) | **GET** /bookings | List bookings |
| [**postBooking**](BookingsApi.md#postBooking) | **POST** /bookings | Create a booking |
| [**postPayBooking**](BookingsApi.md#postPayBooking) | **POST** /bookings/{bookingRef}/pay | Pay booking |



## getBooking

> PostBooking201Response getBooking(bookingRef)

Get a booking

Retrieve the booking.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        BookingsApi apiInstance = new BookingsApi(defaultClient);
        String bookingRef = "bookingRef_example"; // String | 
        try {
            PostBooking201Response result = apiInstance.getBooking(bookingRef);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingsApi#getBooking");
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
| **bookingRef** | **String**|  | |

### Return type

[**PostBooking201Response**](PostBooking201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the Booking object. |  -  |
| **404** | Booking not found. |  -  |


## getBookingCalculation

> GetBookingCalculation200Response getBookingCalculation(filterClass, filterSessions, filterStudents, filterPrice, filterPlan, filterDiscount, filterVoucher)

Calculate booking costs

Retrieve the Booking costs.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        BookingsApi apiInstance = new BookingsApi(defaultClient);
        Integer filterClass = 56; // Integer | ID of the class
        List<String> filterSessions = Arrays.asList(); // List<String> | IDs of the sessions
        List<String> filterStudents = Arrays.asList(); // List<String> | IDs of the students
        Integer filterPrice = 56; // Integer | ID of the price
        Integer filterPlan = 56; // Integer | ID of the plan
        Integer filterDiscount = 56; // Integer | ID of the discount
        Integer filterVoucher = 56; // Integer | ID of the voucher
        try {
            GetBookingCalculation200Response result = apiInstance.getBookingCalculation(filterClass, filterSessions, filterStudents, filterPrice, filterPlan, filterDiscount, filterVoucher);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingsApi#getBookingCalculation");
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
| **filterClass** | **Integer**| ID of the class | |
| **filterSessions** | [**List&lt;String&gt;**](String.md)| IDs of the sessions | |
| **filterStudents** | [**List&lt;String&gt;**](String.md)| IDs of the students | |
| **filterPrice** | **Integer**| ID of the price | |
| **filterPlan** | **Integer**| ID of the plan | [optional] |
| **filterDiscount** | **Integer**| ID of the discount | [optional] |
| **filterVoucher** | **Integer**| ID of the voucher | [optional] |

### Return type

[**GetBookingCalculation200Response**](GetBookingCalculation200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the calculated booking costs. |  -  |


## getBookings

> GetBookings200Response getBookings(filterOrganiser, filterStudent, filterEnded, include)

List bookings

Retrieve a list of bookings.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        BookingsApi apiInstance = new BookingsApi(defaultClient);
        Integer filterOrganiser = 56; // Integer | ID of the organiser
        Integer filterStudent = 56; // Integer | ID of the student
        Boolean filterEnded = true; // Boolean | Whether the booking has ended
        String include = "include_example"; // String | Related resources to include
        try {
            GetBookings200Response result = apiInstance.getBookings(filterOrganiser, filterStudent, filterEnded, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingsApi#getBookings");
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
| **filterStudent** | **Integer**| ID of the student | [optional] |
| **filterEnded** | **Boolean**| Whether the booking has ended | [optional] |
| **include** | **String**| Related resources to include | [optional] |

### Return type

[**GetBookings200Response**](GetBookings200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Booking created. |  -  |


## postBooking

> PostBooking201Response postBooking(postBookingRequest)

Create a booking

Create a new booking.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        BookingsApi apiInstance = new BookingsApi(defaultClient);
        PostBookingRequest postBookingRequest = new PostBookingRequest(); // PostBookingRequest | Creates a new booking.
        try {
            PostBooking201Response result = apiInstance.postBooking(postBookingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingsApi#postBooking");
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
| **postBookingRequest** | [**PostBookingRequest**](PostBookingRequest.md)| Creates a new booking. | [optional] |

### Return type

[**PostBooking201Response**](PostBooking201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Booking created. |  -  |


## postPayBooking

> postPayBooking(bookingRef, postPayBookingRequest)

Pay booking

Pay a booking.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        BookingsApi apiInstance = new BookingsApi(defaultClient);
        String bookingRef = "bookingRef_example"; // String | 
        PostPayBookingRequest postPayBookingRequest = new PostPayBookingRequest(); // PostPayBookingRequest | Pays for a booking.
        try {
            apiInstance.postPayBooking(bookingRef, postPayBookingRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingsApi#postPayBooking");
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
| **bookingRef** | **String**|  | |
| **postPayBookingRequest** | [**PostPayBookingRequest**](PostPayBookingRequest.md)| Pays for a booking. | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |

