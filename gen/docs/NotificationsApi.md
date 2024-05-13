# NotificationsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdNotificationGet**](NotificationsApi.md#call1radiosRadioProductIdNotificationGet) | **GET** /1/radios/{radio_product_id}/notification | Get notification |
| [**call1radiosRadioProductIdNotificationPut**](NotificationsApi.md#call1radiosRadioProductIdNotificationPut) | **PUT** /1/radios/{radio_product_id}/notification | Update notification radio product |
| [**call1radiosRadioProductIdStationsStationIdNotificationGet**](NotificationsApi.md#call1radiosRadioProductIdStationsStationIdNotificationGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/notification | Get notification |
| [**call1radiosRadioProductIdStationsStationIdNotificationPut**](NotificationsApi.md#call1radiosRadioProductIdStationsStationIdNotificationPut) | **PUT** /1/radios/{radio_product_id}/stations/{station_id}/notification | Update notification |



## call1radiosRadioProductIdNotificationGet

> Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response call1radiosRadioProductIdNotificationGet(radioProductId, stationId)

Get notification

This endpoint allows you to retrieve the notification bind to the radio_product or station if it&#39;s exist.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter stationId = new Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter(); // Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter | The unique identifier (ID) of the station to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response result = apiInstance.call1radiosRadioProductIdNotificationGet(radioProductId, stationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#call1radiosRadioProductIdNotificationGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | [**Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter**](.md)| The unique identifier (ID) of the station to request. | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response**](Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## call1radiosRadioProductIdNotificationPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdNotificationPut(radioProductId, requestBody20)

Update notification radio product

This endpoint allows you to update a notification for radio product.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        RequestBody20 requestBody20 = new RequestBody20(); // RequestBody20 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdNotificationPut(radioProductId, requestBody20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#call1radiosRadioProductIdNotificationPut");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **requestBody20** | [**RequestBody20**](RequestBody20.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdNotificationGet

> Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response call1radiosRadioProductIdStationsStationIdNotificationGet(radioProductId, stationId)

Get notification

This endpoint allows you to retrieve the notification bind to the radio_product or station if it&#39;s exist.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter stationId = new Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter(); // Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter | The unique identifier (ID) of the station to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdNotificationGet(radioProductId, stationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#call1radiosRadioProductIdStationsStationIdNotificationGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | [**Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter**](.md)| The unique identifier (ID) of the station to request. | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response**](Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## call1radiosRadioProductIdStationsStationIdNotificationPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdNotificationPut(radioProductId, stationId, requestBody20)

Update notification

This endpoint allows you to update a notification.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        RequestBody20 requestBody20 = new RequestBody20(); // RequestBody20 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdNotificationPut(radioProductId, stationId, requestBody20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#call1radiosRadioProductIdStationsStationIdNotificationPut");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **requestBody20** | [**RequestBody20**](RequestBody20.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |

