# HealthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fluxStateGet**](HealthApi.md#fluxStateGet) | **GET** /flux-state | Receive the state of the SDANet Flux mesh network. |
| [**siteStateGet**](HealthApi.md#siteStateGet) | **GET** /site-state | Receive the state of a C2 or sensor site. |
| [**siteStatePost**](HealthApi.md#siteStatePost) | **POST** /site-state | Update the state of a C2 or sensor site. |



## fluxStateGet

> FluxState fluxStateGet(siteID)

Receive the state of the SDANet Flux mesh network.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HealthApi apiInstance = new HealthApi(defaultClient);
        String siteID = "siteID_example"; // String | The ID of the site to retrieve Flux link status.
        try {
            FluxState result = apiInstance.fluxStateGet(siteID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#fluxStateGet");
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
| **siteID** | **String**| The ID of the site to retrieve Flux link status. | [optional] |

### Return type

[**FluxState**](FluxState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful state lookup. |  -  |
| **400** | A failed lookup, the site ID wasn&#39;t found. |  -  |


## siteStateGet

> SensorState siteStateGet(siteID)

Receive the state of a C2 or sensor site.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HealthApi apiInstance = new HealthApi(defaultClient);
        String siteID = "siteID_example"; // String | The ID of the site to retrieve health status
        try {
            SensorState result = apiInstance.siteStateGet(siteID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#siteStateGet");
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
| **siteID** | **String**| The ID of the site to retrieve health status | [optional] |

### Return type

[**SensorState**](SensorState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful state lookup. |  -  |
| **400** | A failed lookup, the site ID wasn&#39;t found. |  -  |


## siteStatePost

> siteStatePost(sensorState)

Update the state of a C2 or sensor site.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HealthApi apiInstance = new HealthApi(defaultClient);
        SensorState sensorState = new SensorState(); // SensorState | The message content to send
        try {
            apiInstance.siteStatePost(sensorState);
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#siteStatePost");
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
| **sensorState** | [**SensorState**](SensorState.md)| The message content to send | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


