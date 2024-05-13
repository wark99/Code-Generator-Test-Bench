# CommentApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiCommentsIdDelete**](CommentApi.md#apiCommentsIdDelete) | **DELETE** /api/comments/{id} | Delete your comment |
| [**apiCommentsPost**](CommentApi.md#apiCommentsPost) | **POST** /api/comments | Make new comment |
| [**apiCommentsPut**](CommentApi.md#apiCommentsPut) | **PUT** /api/comments | Update comment |
| [**apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet**](CommentApi.md#apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet) | **GET** /api/comments/{userId}/{playlistId}/playlist?sort&#x3D;{sort}&amp;page&#x3D;{page} | Read comment from user and playlist, sort by playlist |
| [**apiCommentsUserIdPlaylistIdTimesortsortpagepageGet**](CommentApi.md#apiCommentsUserIdPlaylistIdTimesortsortpagepageGet) | **GET** /api/comments/{userId}/{playlistId}/time?sort&#x3D;{sort}&amp;page&#x3D;{page} | Read comment from user and playlist, sort by time |
| [**apiCommentsUserIdPlaylistIdUsersortsortpagepageGet**](CommentApi.md#apiCommentsUserIdPlaylistIdUsersortsortpagepageGet) | **GET** /api/comments/{userId}/{playlistId}/user?sort&#x3D;{sort}&amp;page&#x3D;{page} | Read comment from user and playlist, sort by user |



## apiCommentsIdDelete

> MessageGood apiCommentsIdDelete(id)

Delete your comment

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApi apiInstance = new CommentApi(defaultClient);
        Integer id = 1; // Integer | 
        try {
            MessageGood result = apiInstance.apiCommentsIdDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApi#apiCommentsIdDelete");
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
| **id** | **Integer**|  | |

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
| **200** | Delete |  -  |
| **400** | Delete |  -  |


## apiCommentsPost

> CommentInfor apiCommentsPost(comment)

Make new comment

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApi apiInstance = new CommentApi(defaultClient);
        Comment comment = new HashMap(); // Comment | A new comment
        try {
            CommentInfor result = apiInstance.apiCommentsPost(comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApi#apiCommentsPost");
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
| **comment** | [**Comment**](Comment.md)| A new comment | |

### Return type

[**CommentInfor**](CommentInfor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Make new comment |  -  |
| **400** | Bad request |  -  |
| **404** | Dont have permission |  -  |


## apiCommentsPut

> ApiPlaylistsUserIdTimeSortSortPagePageGet204Response apiCommentsPut(apiCommentsPutRequest)

Update comment

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApi apiInstance = new CommentApi(defaultClient);
        ApiCommentsPutRequest apiCommentsPutRequest = new ApiCommentsPutRequest(); // ApiCommentsPutRequest | The comment you update must come from your account
        try {
            ApiPlaylistsUserIdTimeSortSortPagePageGet204Response result = apiInstance.apiCommentsPut(apiCommentsPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApi#apiCommentsPut");
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
| **apiCommentsPutRequest** | [**ApiCommentsPutRequest**](ApiCommentsPutRequest.md)| The comment you update must come from your account | |

### Return type

[**ApiPlaylistsUserIdTimeSortSortPagePageGet204Response**](ApiPlaylistsUserIdTimeSortSortPagePageGet204Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated comment |  -  |
| **400** | Bad request |  -  |
| **404** | Dont have permission |  -  |


## apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet

> CommentInforReturn apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet(userId, sort, playlistId, page)

Read comment from user and playlist, sort by playlist

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApi apiInstance = new CommentApi(defaultClient);
        Integer userId = 1; // Integer | 0 is from all user/playlist, 1+ is from some user/playlist
        String sort = "ASC"; // String | DESC or ASC to sort the comment
        Integer playlistId = 3; // Integer | 0 is from all user/playlist, 1+ is from some user/playlist
        Integer page = 1; // Integer | Pagination
        try {
            CommentInforReturn result = apiInstance.apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet(userId, sort, playlistId, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApi#apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet");
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
| **userId** | **Integer**| 0 is from all user/playlist, 1+ is from some user/playlist | |
| **sort** | **String**| DESC or ASC to sort the comment | |
| **playlistId** | **Integer**| 0 is from all user/playlist, 1+ is from some user/playlist | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**CommentInforReturn**](CommentInforReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read comment list from user and playlist |  -  |
| **204** | No comment |  -  |
| **400** | Bad request |  -  |


## apiCommentsUserIdPlaylistIdTimesortsortpagepageGet

> CommentInforReturn apiCommentsUserIdPlaylistIdTimesortsortpagepageGet(userId, sort, playlistId, page)

Read comment from user and playlist, sort by time

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApi apiInstance = new CommentApi(defaultClient);
        Integer userId = 1; // Integer | 0 is from all user/playlist, 1+ is from some user/playlist
        String sort = "ASC"; // String | DESC or ASC to sort the comment
        Integer playlistId = 3; // Integer | 0 is from all user/playlist, 1+ is from some user/playlist
        Integer page = 1; // Integer | Pagination
        try {
            CommentInforReturn result = apiInstance.apiCommentsUserIdPlaylistIdTimesortsortpagepageGet(userId, sort, playlistId, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApi#apiCommentsUserIdPlaylistIdTimesortsortpagepageGet");
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
| **userId** | **Integer**| 0 is from all user/playlist, 1+ is from some user/playlist | |
| **sort** | **String**| DESC or ASC to sort the comment | |
| **playlistId** | **Integer**| 0 is from all user/playlist, 1+ is from some user/playlist | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**CommentInforReturn**](CommentInforReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read comment list from user and playlist |  -  |
| **204** | No comment |  -  |
| **400** | Bad request |  -  |


## apiCommentsUserIdPlaylistIdUsersortsortpagepageGet

> CommentInforReturn apiCommentsUserIdPlaylistIdUsersortsortpagepageGet(userId, sort, playlistId, page)

Read comment from user and playlist, sort by user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApi apiInstance = new CommentApi(defaultClient);
        Integer userId = 1; // Integer | 0 is from all user/playlist, 1+ is from some user/playlist
        String sort = "ASC"; // String | DESC or ASC to sort the comment
        Integer playlistId = 3; // Integer | 0 is from all user/playlist, 1+ is from some user/playlist
        Integer page = 1; // Integer | Pagination
        try {
            CommentInforReturn result = apiInstance.apiCommentsUserIdPlaylistIdUsersortsortpagepageGet(userId, sort, playlistId, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApi#apiCommentsUserIdPlaylistIdUsersortsortpagepageGet");
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
| **userId** | **Integer**| 0 is from all user/playlist, 1+ is from some user/playlist | |
| **sort** | **String**| DESC or ASC to sort the comment | |
| **playlistId** | **Integer**| 0 is from all user/playlist, 1+ is from some user/playlist | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**CommentInforReturn**](CommentInforReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read comment list from user and playlist |  -  |
| **204** | No comment |  -  |
| **400** | Bad request |  -  |

