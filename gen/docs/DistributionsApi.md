# DistributionsApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDistribution**](DistributionsApi.md#deleteDistribution) | **DELETE** /distributions/{id} | Delete user |
| [**findChannelDistributionByAssetId**](DistributionsApi.md#findChannelDistributionByAssetId) | **GET** /distributions/channels/{channelId} | Get Distribution by Id |
| [**findScheduleDistributionByAssetId**](DistributionsApi.md#findScheduleDistributionByAssetId) | **GET** /distributions/schedules/{scheduleId} | Get Distribution by Id |
| [**getDistributionById**](DistributionsApi.md#getDistributionById) | **GET** /distributions/{id} | Get Distribution by Id |



## deleteDistribution

> deleteDistribution(id)

Delete user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        DistributionsApi apiInstance = new DistributionsApi(defaultClient);
        String id = "id_example"; // String | ID of the distribution to be deleted
        try {
            apiInstance.deleteDistribution(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistributionsApi#deleteDistribution");
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
| **id** | **String**| ID of the distribution to be deleted | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid Request |  -  |
| **404** | Distribution not found |  -  |


## findChannelDistributionByAssetId

> Distribution findChannelDistributionByAssetId(channelId, assetId)

Get Distribution by Id



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        DistributionsApi apiInstance = new DistributionsApi(defaultClient);
        Integer channelId = 56; // Integer | Unique Numerical ID of the distribution
        Integer assetId = 56; // Integer | Unique Numerical ID of the distribution
        try {
            Distribution result = apiInstance.findChannelDistributionByAssetId(channelId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistributionsApi#findChannelDistributionByAssetId");
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
| **channelId** | **Integer**| Unique Numerical ID of the distribution | |
| **assetId** | **Integer**| Unique Numerical ID of the distribution | |

### Return type

[**Distribution**](Distribution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Request |  -  |
| **404** | Distribution not found |  -  |


## findScheduleDistributionByAssetId

> Distribution findScheduleDistributionByAssetId(scheduleId, assetId)

Get Distribution by Id



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        DistributionsApi apiInstance = new DistributionsApi(defaultClient);
        Integer scheduleId = 56; // Integer | Unique Numerical ID of the distribution
        Integer assetId = 56; // Integer | Unique Numerical ID of the distribution
        try {
            Distribution result = apiInstance.findScheduleDistributionByAssetId(scheduleId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistributionsApi#findScheduleDistributionByAssetId");
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
| **scheduleId** | **Integer**| Unique Numerical ID of the distribution | |
| **assetId** | **Integer**| Unique Numerical ID of the distribution | |

### Return type

[**Distribution**](Distribution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Request |  -  |
| **404** | Distribution not found |  -  |


## getDistributionById

> Distribution getDistributionById(id)

Get Distribution by Id



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        DistributionsApi apiInstance = new DistributionsApi(defaultClient);
        Integer id = 56; // Integer | Unique Numerical ID of the distribution
        try {
            Distribution result = apiInstance.getDistributionById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistributionsApi#getDistributionById");
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
| **id** | **Integer**| Unique Numerical ID of the distribution | |

### Return type

[**Distribution**](Distribution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Request |  -  |
| **404** | Distribution not found |  -  |

