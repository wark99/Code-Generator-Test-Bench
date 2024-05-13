# PlaylistApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPlaylistsIdDelete**](PlaylistApi.md#apiPlaylistsIdDelete) | **DELETE** /api/playlists/{id} | Delete your playlist |
| [**apiPlaylistsIdGet**](PlaylistApi.md#apiPlaylistsIdGet) | **GET** /api/playlists/{id} | Delete your playlist |
| [**apiPlaylistsPost**](PlaylistApi.md#apiPlaylistsPost) | **POST** /api/playlists | Make Playlist |
| [**apiPlaylistsPut**](PlaylistApi.md#apiPlaylistsPut) | **PUT** /api/playlists | Update Playlist |
| [**apiPlaylistsUserIdTimesortsortpagepageGet**](PlaylistApi.md#apiPlaylistsUserIdTimesortsortpagepageGet) | **GET** /api/playlists/{userId}/time?sort&#x3D;{sort}&amp;page&#x3D;{page} | Playlists |
| [**apiPlaylistsUserIdViewsortsortpagepageGet**](PlaylistApi.md#apiPlaylistsUserIdViewsortsortpagepageGet) | **GET** /api/playlists/{userId}/view?sort&#x3D;{sort}&amp;page&#x3D;{page} | Playlists |



## apiPlaylistsIdDelete

> MessageGood apiPlaylistsIdDelete(id)

Delete your playlist

Delete playlist

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlaylistApi apiInstance = new PlaylistApi(defaultClient);
        Integer id = 3; // Integer | 0 is from all user, 1+ is from some user
        try {
            MessageGood result = apiInstance.apiPlaylistsIdDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaylistApi#apiPlaylistsIdDelete");
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
| **id** | **Integer**| 0 is from all user, 1+ is from some user | |

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
| **404** | Dont have permission |  -  |


## apiPlaylistsIdGet

> PlaylistInfor apiPlaylistsIdGet(id)

Delete your playlist

Delete playlist

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlaylistApi apiInstance = new PlaylistApi(defaultClient);
        Integer id = 1; // Integer | 0 is from all user, 1+ is from some user
        try {
            PlaylistInfor result = apiInstance.apiPlaylistsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaylistApi#apiPlaylistsIdGet");
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
| **id** | **Integer**| 0 is from all user, 1+ is from some user | |

### Return type

[**PlaylistInfor**](PlaylistInfor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist with id |  -  |
| **404** | Dont have permission |  -  |


## apiPlaylistsPost

> ApiPlaylistsPost201Response apiPlaylistsPost(playlist)

Make Playlist

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlaylistApi apiInstance = new PlaylistApi(defaultClient);
        Playlist playlist = new HashMap(); // Playlist | Must have the playlistId, name, a list of song that is valid youtube id, and a valid link to image
        try {
            ApiPlaylistsPost201Response result = apiInstance.apiPlaylistsPost(playlist);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaylistApi#apiPlaylistsPost");
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
| **playlist** | [**Playlist**](Playlist.md)| Must have the playlistId, name, a list of song that is valid youtube id, and a valid link to image | |

### Return type

[**ApiPlaylistsPost201Response**](ApiPlaylistsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | New playlist |  -  |
| **400** | Bad request |  -  |
| **404** | Dont have permission |  -  |


## apiPlaylistsPut

> MessageGood apiPlaylistsPut(playlistInfor)

Update Playlist

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlaylistApi apiInstance = new PlaylistApi(defaultClient);
        PlaylistInfor playlistInfor = new HashMap(); // PlaylistInfor | Mutate the object + revalidate with middleware(done) is much faster than add/remove one by one(in writing codes)
        try {
            MessageGood result = apiInstance.apiPlaylistsPut(playlistInfor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaylistApi#apiPlaylistsPut");
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
| **playlistInfor** | [**PlaylistInfor**](PlaylistInfor.md)| Mutate the object + revalidate with middleware(done) is much faster than add/remove one by one(in writing codes) | |

### Return type

[**MessageGood**](MessageGood.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update playlist |  -  |
| **400** | Password not match requirement/Username too short(6-) or too long(32+) |  -  |
| **404** | Dont have permission |  -  |


## apiPlaylistsUserIdTimesortsortpagepageGet

> PlaylistInforReturn apiPlaylistsUserIdTimesortsortpagepageGet(userId, sort, page)

Playlists

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlaylistApi apiInstance = new PlaylistApi(defaultClient);
        Integer userId = 1; // Integer | 0 is from all user, 1+ is from some user
        String sort = "DESC"; // String | DESC or ASC to sort by time
        Integer page = 1; // Integer | Pagination
        try {
            PlaylistInforReturn result = apiInstance.apiPlaylistsUserIdTimesortsortpagepageGet(userId, sort, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaylistApi#apiPlaylistsUserIdTimesortsortpagepageGet");
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
| **sort** | **String**| DESC or ASC to sort by time | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**PlaylistInforReturn**](PlaylistInforReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read playlist from user |  -  |
| **204** | No playlist |  -  |
| **400** | Bad request |  -  |


## apiPlaylistsUserIdViewsortsortpagepageGet

> PlaylistInforReturn apiPlaylistsUserIdViewsortsortpagepageGet(userId, sort, page)

Playlists

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PlaylistApi apiInstance = new PlaylistApi(defaultClient);
        Integer userId = 1; // Integer | 0 is from all user, 1+ is from some user
        String sort = "ASC"; // String | DESC or ASC to sort by view
        Integer page = 1; // Integer | Pagination
        try {
            PlaylistInforReturn result = apiInstance.apiPlaylistsUserIdViewsortsortpagepageGet(userId, sort, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaylistApi#apiPlaylistsUserIdViewsortsortpagepageGet");
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
| **sort** | **String**| DESC or ASC to sort by view | |
| **page** | **Integer**| Pagination | [optional] |

### Return type

[**PlaylistInforReturn**](PlaylistInforReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read playlist from user |  -  |
| **204** | No playlist |  -  |
| **400** | Bad request |  -  |

