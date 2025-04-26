# FeedApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserFeed**](FeedApi.md#getUserFeed) | **GET** /feed | Get user feed |



## getUserFeed

> SearchQuestions200Response getUserFeed(type, page, pageSize)

Get user feed

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FeedApi apiInstance = new FeedApi(defaultClient);
        String type = "recent"; // String | Feed type
        Integer page = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Number of items per page
        try {
            SearchQuestions200Response result = apiInstance.getUserFeed(type, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedApi#getUserFeed");
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
| **type** | **String**| Feed type | [enum: recent, topRated, recommended] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**SearchQuestions200Response**](SearchQuestions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** |  |  -  |

