# ReservationApi

All URIs are relative to *https://api.hudini.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReservationGuest**](ReservationApi.md#addReservationGuest) | **POST** /{hotelId}/reservations/{reservationId}/guests | Add a guest |
| [**getReservationDetails**](ReservationApi.md#getReservationDetails) | **GET** /{hotelId}/reservations/{reservationId} | Find Reservation Details |
| [**getReservationGuestDetails**](ReservationApi.md#getReservationGuestDetails) | **GET** /{hotelId}/reservations/{reservationId}/guests/{guestId} | Find Guests Details on a reservation |
| [**getReservationGuests**](ReservationApi.md#getReservationGuests) | **GET** /{hotelId}/reservations/{reservationId}/guests | Find Guests on a reservation |
| [**getReservations**](ReservationApi.md#getReservations) | **GET** /{hotelId}/reservations | Find Reservations |
| [**updateReservationGuest**](ReservationApi.md#updateReservationGuest) | **PATCH** /{hotelId}/reservations/{reservationId}/guests/{guestId} | Add a guest |



## addReservationGuest

> Guest addReservationGuest(hotelId, reservationId, guest)

Add a guest

Add a new guest to the reservation

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReservationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hudini.io/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: hudini_auth
        OAuth hudini_auth = (OAuth) defaultClient.getAuthentication("hudini_auth");
        hudini_auth.setAccessToken("YOUR ACCESS TOKEN");

        ReservationApi apiInstance = new ReservationApi(defaultClient);
        UUID hotelId = UUID.randomUUID(); // UUID | Hudini Hotel Identifier
        String reservationId = "reservationId_example"; // String | Reservation ID
        Guest guest = new Guest(); // Guest | 
        try {
            Guest result = apiInstance.addReservationGuest(hotelId, reservationId, guest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReservationApi#addReservationGuest");
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
| **hotelId** | **UUID**| Hudini Hotel Identifier | |
| **reservationId** | **String**| Reservation ID | |
| **guest** | [**Guest**](Guest.md)|  | [optional] |

### Return type

[**Guest**](Guest.md)

### Authorization

[api_key](../README.md#api_key), [hudini_auth](../README.md#hudini_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Downstream system unavailable |  -  |


## getReservationDetails

> GetReservationDetails200Response getReservationDetails(hotelId, reservationId)

Find Reservation Details

Returns details about a reservation

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReservationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hudini.io/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: hudini_auth
        OAuth hudini_auth = (OAuth) defaultClient.getAuthentication("hudini_auth");
        hudini_auth.setAccessToken("YOUR ACCESS TOKEN");

        ReservationApi apiInstance = new ReservationApi(defaultClient);
        UUID hotelId = UUID.randomUUID(); // UUID | Hudini Hotel Identifier
        String reservationId = "reservationId_example"; // String | Reservation ID
        try {
            GetReservationDetails200Response result = apiInstance.getReservationDetails(hotelId, reservationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReservationApi#getReservationDetails");
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
| **hotelId** | **UUID**| Hudini Hotel Identifier | |
| **reservationId** | **String**| Reservation ID | |

### Return type

[**GetReservationDetails200Response**](GetReservationDetails200Response.md)

### Authorization

[api_key](../README.md#api_key), [hudini_auth](../README.md#hudini_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Downstream system unavailable |  -  |


## getReservationGuestDetails

> Guest getReservationGuestDetails(hotelId, reservationId, guestId)

Find Guests Details on a reservation

Returns details about a guest on reservation

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReservationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hudini.io/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: hudini_auth
        OAuth hudini_auth = (OAuth) defaultClient.getAuthentication("hudini_auth");
        hudini_auth.setAccessToken("YOUR ACCESS TOKEN");

        ReservationApi apiInstance = new ReservationApi(defaultClient);
        UUID hotelId = UUID.randomUUID(); // UUID | Hudini Hotel Identifier
        String reservationId = "reservationId_example"; // String | Reservation ID
        String guestId = "guestId_example"; // String | Guest ID
        try {
            Guest result = apiInstance.getReservationGuestDetails(hotelId, reservationId, guestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReservationApi#getReservationGuestDetails");
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
| **hotelId** | **UUID**| Hudini Hotel Identifier | |
| **reservationId** | **String**| Reservation ID | |
| **guestId** | **String**| Guest ID | |

### Return type

[**Guest**](Guest.md)

### Authorization

[api_key](../README.md#api_key), [hudini_auth](../README.md#hudini_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Downstream system unavailable |  -  |


## getReservationGuests

> List&lt;Guest&gt; getReservationGuests(hotelId, reservationId)

Find Guests on a reservation

Returns details about all guests on reservation

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReservationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hudini.io/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: hudini_auth
        OAuth hudini_auth = (OAuth) defaultClient.getAuthentication("hudini_auth");
        hudini_auth.setAccessToken("YOUR ACCESS TOKEN");

        ReservationApi apiInstance = new ReservationApi(defaultClient);
        UUID hotelId = UUID.randomUUID(); // UUID | Hudini Hotel Identifier
        String reservationId = "reservationId_example"; // String | Reservation ID
        try {
            List<Guest> result = apiInstance.getReservationGuests(hotelId, reservationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReservationApi#getReservationGuests");
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
| **hotelId** | **UUID**| Hudini Hotel Identifier | |
| **reservationId** | **String**| Reservation ID | |

### Return type

[**List&lt;Guest&gt;**](Guest.md)

### Authorization

[api_key](../README.md#api_key), [hudini_auth](../README.md#hudini_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Downstream system unavailable |  -  |


## getReservations

> List&lt;GetReservations200ResponseInner&gt; getReservations(hotelId, fromDate, toDate, firstName, lastName)

Find Reservations

Returns a collection of reservations

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReservationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hudini.io/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: hudini_auth
        OAuth hudini_auth = (OAuth) defaultClient.getAuthentication("hudini_auth");
        hudini_auth.setAccessToken("YOUR ACCESS TOKEN");

        ReservationApi apiInstance = new ReservationApi(defaultClient);
        UUID hotelId = UUID.randomUUID(); // UUID | Hudini Hotel Identifier
        OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | Start of range for check in dates
        OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | End of range for check in dates
        String firstName = "firstName_example"; // String | First name of guest
        String lastName = "lastName_example"; // String | Last name of guest
        try {
            List<GetReservations200ResponseInner> result = apiInstance.getReservations(hotelId, fromDate, toDate, firstName, lastName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReservationApi#getReservations");
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
| **hotelId** | **UUID**| Hudini Hotel Identifier | |
| **fromDate** | **OffsetDateTime**| Start of range for check in dates | [optional] |
| **toDate** | **OffsetDateTime**| End of range for check in dates | [optional] |
| **firstName** | **String**| First name of guest | [optional] |
| **lastName** | **String**| Last name of guest | [optional] |

### Return type

[**List&lt;GetReservations200ResponseInner&gt;**](GetReservations200ResponseInner.md)

### Authorization

[api_key](../README.md#api_key), [hudini_auth](../README.md#hudini_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Downstream system unavailable |  -  |


## updateReservationGuest

> Guest updateReservationGuest(hotelId, reservationId, guestId, guest)

Add a guest

Add a new guest to the reservation

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReservationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hudini.io/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: hudini_auth
        OAuth hudini_auth = (OAuth) defaultClient.getAuthentication("hudini_auth");
        hudini_auth.setAccessToken("YOUR ACCESS TOKEN");

        ReservationApi apiInstance = new ReservationApi(defaultClient);
        UUID hotelId = UUID.randomUUID(); // UUID | Hudini Hotel Identifier
        String reservationId = "reservationId_example"; // String | Reservation ID
        String guestId = "guestId_example"; // String | Guest ID
        Guest guest = new Guest(); // Guest | 
        try {
            Guest result = apiInstance.updateReservationGuest(hotelId, reservationId, guestId, guest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReservationApi#updateReservationGuest");
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
| **hotelId** | **UUID**| Hudini Hotel Identifier | |
| **reservationId** | **String**| Reservation ID | |
| **guestId** | **String**| Guest ID | |
| **guest** | [**Guest**](Guest.md)|  | [optional] |

### Return type

[**Guest**](Guest.md)

### Authorization

[api_key](../README.md#api_key), [hudini_auth](../README.md#hudini_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Downstream system unavailable |  -  |

