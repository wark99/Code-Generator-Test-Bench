# SearchApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchProfilePost**](SearchApi.md#searchProfilePost) | **POST** /search-profile | search for user profiles |



## searchProfilePost

> SearchProfilePost200Response searchProfilePost(searchProfilePostRequest)

search for user profiles

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SearchApi apiInstance = new SearchApi(defaultClient);
        SearchProfilePostRequest searchProfilePostRequest = new SearchProfilePostRequest(); // SearchProfilePostRequest | 
        try {
            SearchProfilePost200Response result = apiInstance.searchProfilePost(searchProfilePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchProfilePost");
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
| **searchProfilePostRequest** | [**SearchProfilePostRequest**](SearchProfilePostRequest.md)|  | [optional] |

### Return type

[**SearchProfilePost200Response**](SearchProfilePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search completed successfully |  -  |
| **400** | There was problem retrieving thread&#39;s messages |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

