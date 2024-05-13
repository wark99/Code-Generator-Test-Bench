# SetApi

All URIs are relative to *https://api.perch.fit*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filterSets**](SetApi.md#filterSets) | **POST** /v3/sets | Filter sets |



## filterSets

> FilterSetsResponse filterSets(filterSetsParams)

Filter sets

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        SetApi apiInstance = new SetApi(defaultClient);
        FilterSetsParams filterSetsParams = new FilterSetsParams(); // FilterSetsParams | Filters on Sets. Requires at least one filter, multiple may be specified and will be combined to find matching records. If neither `user_id` nor `group_id` is specified, the default behavior or this endpoint is to return only Sets with the same `user_id` as the requester.
        try {
            FilterSetsResponse result = apiInstance.filterSets(filterSetsParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SetApi#filterSets");
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
| **filterSetsParams** | [**FilterSetsParams**](FilterSetsParams.md)| Filters on Sets. Requires at least one filter, multiple may be specified and will be combined to find matching records. If neither &#x60;user_id&#x60; nor &#x60;group_id&#x60; is specified, the default behavior or this endpoint is to return only Sets with the same &#x60;user_id&#x60; as the requester. | |

### Return type

[**FilterSetsResponse**](FilterSetsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, here are matching sets |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |

