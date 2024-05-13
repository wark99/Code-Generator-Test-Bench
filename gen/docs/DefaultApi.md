# DefaultApi

All URIs are relative to *https://api-sndbx.servantrip.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activityFullDetailFromPreorderIdCopy**](DefaultApi.md#activityFullDetailFromPreorderIdCopy) | **GET** /api/v2_1/activities/{preorderid} | Activity full detail from preorder_id Copy |
| [**activityPax1TicketAvailabilityCopy**](DefaultApi.md#activityPax1TicketAvailabilityCopy) | **POST** /api/v2_1/availability | Activity pax, 1 ticket. Availability Copy |
| [**availabilityUsd**](DefaultApi.md#availabilityUsd) | **POST** /v2_1/availability | Availability USD |



## activityFullDetailFromPreorderIdCopy

> ActivityFullDetailFromPreorderIdCopy200Response activityFullDetailFromPreorderIdCopy(preorderid, xServantripCulture, xServantripCurrency)

Activity full detail from preorder_id Copy

Activity full detail from preorder_id Copy

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sndbx.servantrip.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String preorderid = "preorderid_example"; // String | 
        String xServantripCulture = "{{culture}}"; // String | 
        String xServantripCurrency = "{{currency}}"; // String | 
        try {
            ActivityFullDetailFromPreorderIdCopy200Response result = apiInstance.activityFullDetailFromPreorderIdCopy(preorderid, xServantripCulture, xServantripCurrency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#activityFullDetailFromPreorderIdCopy");
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
| **preorderid** | **String**|  | |
| **xServantripCulture** | **String**|  | [optional] |
| **xServantripCurrency** | **String**|  | [optional] |

### Return type

[**ActivityFullDetailFromPreorderIdCopy200Response**](ActivityFullDetailFromPreorderIdCopy200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK / OK |  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Connection -  <br>  * Content-Encoding -  <br>  * Content-Length -  <br>  * Date -  <br>  * Expires -  <br>  * Pragma -  <br>  * Server -  <br>  * X-AspNet-Version -  <br>  * X-Powered-By -  <br>  |
| **400** | Bad Request / Bad Request |  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Connection -  <br>  * Content-Length -  <br>  * Date -  <br>  * Expires -  <br>  * Pragma -  <br>  * Server -  <br>  * X-AspNet-Version -  <br>  * X-Powered-By -  <br>  |


## activityPax1TicketAvailabilityCopy

> ActivityPax1TicketAvailabilityCopy200Response activityPax1TicketAvailabilityCopy(xServantripCulture, xServantripCurrency)

Activity pax, 1 ticket. Availability Copy

Activity pax, 1 ticket. Availability Copy

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sndbx.servantrip.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String xServantripCulture = "{{culture}}"; // String | 
        String xServantripCurrency = "{{currency}}"; // String | 
        try {
            ActivityPax1TicketAvailabilityCopy200Response result = apiInstance.activityPax1TicketAvailabilityCopy(xServantripCulture, xServantripCurrency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#activityPax1TicketAvailabilityCopy");
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
| **xServantripCulture** | **String**|  | [optional] |
| **xServantripCurrency** | **String**|  | [optional] |

### Return type

[**ActivityPax1TicketAvailabilityCopy200Response**](ActivityPax1TicketAvailabilityCopy200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK / OK |  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Connection -  <br>  * Content-Encoding -  <br>  * Content-Length -  <br>  * Date -  <br>  * Expires -  <br>  * Pragma -  <br>  * Server -  <br>  * X-AspNet-Version -  <br>  * X-Powered-By -  <br>  |
| **400** | Bad Request / Bad Request |  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Connection -  <br>  * Content-Length -  <br>  * Date -  <br>  * Expires -  <br>  * Pragma -  <br>  * Server -  <br>  * X-AspNet-Version -  <br>  * X-Powered-By -  <br>  |


## availabilityUsd

> AvailabilityUsd200Response availabilityUsd(xServantripCulture, xServantripCurrency)

Availability USD

Shows all availability in USD.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sndbx.servantrip.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String xServantripCulture = "{{culture}}"; // String | 
        String xServantripCurrency = "USD"; // String | 
        try {
            AvailabilityUsd200Response result = apiInstance.availabilityUsd(xServantripCulture, xServantripCurrency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#availabilityUsd");
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
| **xServantripCulture** | **String**|  | [optional] |
| **xServantripCurrency** | **String**|  | [optional] |

### Return type

[**AvailabilityUsd200Response**](AvailabilityUsd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK / OK |  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Connection -  <br>  * Content-Encoding -  <br>  * Content-Length -  <br>  * Date -  <br>  * Expires -  <br>  * Pragma -  <br>  * Server -  <br>  * Set-Cookie -  <br>  * X-AspNet-Version -  <br>  * X-Powered-By -  <br>  |
| **400** | Bad Request / Bad Request |  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Connection -  <br>  * Content-Length -  <br>  * Date -  <br>  * Expires -  <br>  * Pragma -  <br>  * Server -  <br>  * X-AspNet-Version -  <br>  * X-Powered-By -  <br>  |

