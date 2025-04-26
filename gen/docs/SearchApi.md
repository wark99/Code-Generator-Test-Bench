# SearchApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchQuestions**](SearchApi.md#searchQuestions) | **GET** /search/questions | Search questions |
| [**searchTags**](SearchApi.md#searchTags) | **GET** /search/tags | Search tags |
| [**searchUsers**](SearchApi.md#searchUsers) | **GET** /search/users | Search users |



## searchQuestions

> SearchQuestions200Response searchQuestions(q, tags, difficulty, page, pageSize, sortBy)

Search questions

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        SearchApi apiInstance = new SearchApi(defaultClient);
        String q = "q_example"; // String | Search query
        String tags = "tags_example"; // String | Comma-separated list of tag IDs
        DifficultyLevel difficulty = DifficultyLevel.fromValue("EASY"); // DifficultyLevel | Filter by difficulty level
        Integer page = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Number of items per page
        String sortBy = "recommended"; // String | Sorting type
        try {
            SearchQuestions200Response result = apiInstance.searchQuestions(q, tags, difficulty, page, pageSize, sortBy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchQuestions");
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
| **q** | **String**| Search query | |
| **tags** | **String**| Comma-separated list of tag IDs | [optional] |
| **difficulty** | [**DifficultyLevel**](.md)| Filter by difficulty level | [optional] [enum: EASY, MEDIUM, HARD] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page | [optional] [default to 20] |
| **sortBy** | **String**| Sorting type | [optional] [default to recommended] |

### Return type

[**SearchQuestions200Response**](SearchQuestions200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |


## searchTags

> SearchTags200Response searchTags(q, page, pageSize)

Search tags

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        SearchApi apiInstance = new SearchApi(defaultClient);
        String q = "q_example"; // String | Search query
        Integer page = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Number of items per page
        try {
            SearchTags200Response result = apiInstance.searchTags(q, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchTags");
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
| **q** | **String**| Search query | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**SearchTags200Response**](SearchTags200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |


## searchUsers

> SearchUsers200Response searchUsers(q, page, pageSize)

Search users

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        SearchApi apiInstance = new SearchApi(defaultClient);
        String q = "q_example"; // String | Search query
        Integer page = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Number of items per page
        try {
            SearchUsers200Response result = apiInstance.searchUsers(q, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchUsers");
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
| **q** | **String**| Search query | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**SearchUsers200Response**](SearchUsers200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |

