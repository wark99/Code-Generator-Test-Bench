# LikeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiLikesIdDelete**](LikeApi.md#apiLikesIdDelete) | **DELETE** /api/likes/{id} | remove your like |
| [**apiLikesPlaylistIdPlaylistsortsortpagepageGet**](LikeApi.md#apiLikesPlaylistIdPlaylistsortsortpagepageGet) | **GET** /api/likes/{playlistId}/playlist?sort&#x3D;{sort}&amp;page&#x3D;{page} | Like from users to a playlist, sort by user |
| [**apiLikesPost**](LikeApi.md#apiLikesPost) | **POST** /api/likes | Like a playlist |
| [**apiLikesUserIdUsersortsortpagepageGet**](LikeApi.md#apiLikesUserIdUsersortsortpagepageGet) | **GET** /api/likes/{userId}/user?sort&#x3D;{sort}&amp;page&#x3D;{page} | Like from a user to many playlists |



## apiLikesIdDelete

> MessageGood apiLikesIdDelete(likeId)

remove your like

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LikeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LikeApi apiInstance = new LikeApi(defaultClient);
        Integer likeId = 1; // Integer | If comment is not from user, will fail
        try {
            MessageGood result = apiInstance.apiLikesIdDelete(likeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LikeApi#apiLikesIdDelete");
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
| **likeId** | **Integer**| If comment is not from user, will fail | |

### Return type

[**MessageGood**](MessageGood.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete successfully |  -  |
| **400** | Bad request |  -  |


## apiLikesPlaylistIdPlaylistsortsortpagepageGet

> ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response apiLikesPlaylistIdPlaylistsortsortpagepageGet(playlistId, sort, page)

Like from users to a playlist, sort by user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LikeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LikeApi apiInstance = new LikeApi(defaultClient);
        Integer playlistId = 3; // Integer | 0 is from all user, 1+ is from some user
        String sort = "DESC"; // String | DESC or ASC to sort the comment
        Integer page = 1; // Integer | Pagination
        try {
            ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response result = apiInstance.apiLikesPlaylistIdPlaylistsortsortpagepageGet(playlistId, sort, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LikeApi#apiLikesPlaylistIdPlaylistsortsortpagepageGet");
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
| **playlistId** | **Integer**| 0 is from all user, 1+ is from some user | |
| **sort** | **String**| DESC or ASC to sort the comment | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response**](ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read like of a playlist from users, sort by user |  -  |
| **204** | No like |  -  |
| **400** | Bad request |  -  |


## apiLikesPost

> MessageBad apiLikesPost(playlistId)

Like a playlist

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LikeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LikeApi apiInstance = new LikeApi(defaultClient);
        Integer playlistId = 3; // Integer | 0 is from all user, 1+ is from some user
        try {
            MessageBad result = apiInstance.apiLikesPost(playlistId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LikeApi#apiLikesPost");
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
| **playlistId** | **Integer**| 0 is from all user, 1+ is from some user | |

### Return type

[**MessageBad**](MessageBad.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Like a playlist |  -  |
| **400** | Bad request |  -  |


## apiLikesUserIdUsersortsortpagepageGet

> ApiLikesUserIdUserSortSortPagePageGet200Response apiLikesUserIdUsersortsortpagepageGet(userId, sort, page)

Like from a user to many playlists

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LikeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LikeApi apiInstance = new LikeApi(defaultClient);
        Integer userId = 1; // Integer | 0 is from all user, 1+ is from some user
        String sort = "ASC"; // String | DESC or ASC to sort the comment
        Integer page = 1; // Integer | Pagination
        try {
            ApiLikesUserIdUserSortSortPagePageGet200Response result = apiInstance.apiLikesUserIdUsersortsortpagepageGet(userId, sort, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LikeApi#apiLikesUserIdUsersortsortpagepageGet");
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
| **userId** | **Integer**| 0 is from all user, 1+ is from some user | |
| **sort** | **String**| DESC or ASC to sort the comment | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**ApiLikesUserIdUserSortSortPagePageGet200Response**](ApiLikesUserIdUserSortSortPagePageGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read playlist from a user like |  -  |
| **204** | No like |  -  |
| **400** | Bad request |  -  |

