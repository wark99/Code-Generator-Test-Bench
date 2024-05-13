# StatApi

All URIs are relative to *https://api.perch.fit*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filterStats**](StatApi.md#filterStats) | **POST** /stats | Filter stats |
| [**getStats**](StatApi.md#getStats) | **GET** /stats | Get stats for the logged in user |



## filterStats

> FilterStatsResponse filterStats(filterStatsParams)

Filter stats

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        StatApi apiInstance = new StatApi(defaultClient);
        FilterStatsParams filterStatsParams = new FilterStatsParams(); // FilterStatsParams | Parameters on which to filter stats.
        try {
            FilterStatsResponse result = apiInstance.filterStats(filterStatsParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatApi#filterStats");
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
| **filterStatsParams** | [**FilterStatsParams**](FilterStatsParams.md)| Parameters on which to filter stats. | [optional] |

### Return type

[**FilterStatsResponse**](FilterStatsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, here are matching exercises |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |


## getStats

> FilterStatsResponse getStats()

Get stats for the logged in user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        StatApi apiInstance = new StatApi(defaultClient);
        try {
            FilterStatsResponse result = apiInstance.getStats();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatApi#getStats");
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

[**FilterStatsResponse**](FilterStatsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, here are all stats |  -  |
| **429** |  |  -  |

