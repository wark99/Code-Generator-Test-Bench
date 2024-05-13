# MeasurementWebhooksApi

All URIs are relative to *https://device-events.lfapi.net/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**measurementWebhooksGet**](MeasurementWebhooksApi.md#measurementWebhooksGet) | **GET** /measurement-webhooks | List all measurement webhooks |
| [**measurementWebhooksIdDelete**](MeasurementWebhooksApi.md#measurementWebhooksIdDelete) | **DELETE** /measurement-webhooks/{id} | Dalate a measurement webhook |
| [**measurementWebhooksIdGet**](MeasurementWebhooksApi.md#measurementWebhooksIdGet) | **GET** /measurement-webhooks/{id} | Get a single measurement webhook |
| [**measurementWebhooksIdPost**](MeasurementWebhooksApi.md#measurementWebhooksIdPost) | **POST** /measurement-webhooks/{id} | Update a measurement webhook |
| [**measurementWebhooksIdTestPost**](MeasurementWebhooksApi.md#measurementWebhooksIdTestPost) | **POST** /measurement-webhooks/{id}/test | Test a measurement webhook |
| [**measurementWebhooksPost**](MeasurementWebhooksApi.md#measurementWebhooksPost) | **POST** /measurement-webhooks | Create a measurement webhook |



## measurementWebhooksGet

> List&lt;MeasurementWebhook&gt; measurementWebhooksGet()

List all measurement webhooks

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementWebhooksApi apiInstance = new MeasurementWebhooksApi(defaultClient);
        try {
            List<MeasurementWebhook> result = apiInstance.measurementWebhooksGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementWebhooksApi#measurementWebhooksGet");
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

[**List&lt;MeasurementWebhook&gt;**](MeasurementWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Measurement webhooks (if any) |  -  |


## measurementWebhooksIdDelete

> measurementWebhooksIdDelete(id)

Dalate a measurement webhook

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementWebhooksApi apiInstance = new MeasurementWebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | ID of the measurement webhook.
        try {
            apiInstance.measurementWebhooksIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementWebhooksApi#measurementWebhooksIdDelete");
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
| **id** | **UUID**| ID of the measurement webhook. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Measurement webhook deleted |  -  |


## measurementWebhooksIdGet

> MeasurementWebhook measurementWebhooksIdGet(id)

Get a single measurement webhook

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementWebhooksApi apiInstance = new MeasurementWebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | ID of the measurement webhook.
        try {
            MeasurementWebhook result = apiInstance.measurementWebhooksIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementWebhooksApi#measurementWebhooksIdGet");
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
| **id** | **UUID**| ID of the measurement webhook. | |

### Return type

[**MeasurementWebhook**](MeasurementWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Measurement webhook |  -  |


## measurementWebhooksIdPost

> MeasurementWebhook measurementWebhooksIdPost(id, measurementWebhookBase)

Update a measurement webhook

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementWebhooksApi apiInstance = new MeasurementWebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | ID of the measurement webhook.
        MeasurementWebhookBase measurementWebhookBase = new MeasurementWebhookBase(); // MeasurementWebhookBase | 
        try {
            MeasurementWebhook result = apiInstance.measurementWebhooksIdPost(id, measurementWebhookBase);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementWebhooksApi#measurementWebhooksIdPost");
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
| **id** | **UUID**| ID of the measurement webhook. | |
| **measurementWebhookBase** | [**MeasurementWebhookBase**](MeasurementWebhookBase.md)|  | |

### Return type

[**MeasurementWebhook**](MeasurementWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Measurement webhook updated |  -  |


## measurementWebhooksIdTestPost

> MeasurementWebhookTestResult measurementWebhooksIdTestPost(id)

Test a measurement webhook

Sends a test notification to your webhook URL and returns information about the response received.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementWebhooksApi apiInstance = new MeasurementWebhooksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | ID of the measurement webhook.
        try {
            MeasurementWebhookTestResult result = apiInstance.measurementWebhooksIdTestPost(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementWebhooksApi#measurementWebhooksIdTestPost");
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
| **id** | **UUID**| ID of the measurement webhook. | |

### Return type

[**MeasurementWebhookTestResult**](MeasurementWebhookTestResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Measurement webhook test result |  -  |


## measurementWebhooksPost

> MeasurementWebhook measurementWebhooksPost(measurementWebhookBase)

Create a measurement webhook

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MeasurementWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://device-events.lfapi.net/v1.0");

        MeasurementWebhooksApi apiInstance = new MeasurementWebhooksApi(defaultClient);
        MeasurementWebhookBase measurementWebhookBase = new MeasurementWebhookBase(); // MeasurementWebhookBase | 
        try {
            MeasurementWebhook result = apiInstance.measurementWebhooksPost(measurementWebhookBase);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeasurementWebhooksApi#measurementWebhooksPost");
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
| **measurementWebhookBase** | [**MeasurementWebhookBase**](MeasurementWebhookBase.md)|  | |

### Return type

[**MeasurementWebhook**](MeasurementWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Measurement webhook created |  * Locatioh - The URL of the newly created measurement webhook. <br>  |

