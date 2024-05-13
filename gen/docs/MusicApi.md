# MusicApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiMusicSongIdGet**](MusicApi.md#apiMusicSongIdGet) | **GET** /api/music/{songId} | Download Music + Get song infors |
| [**apiMusicsearchsearchpagepageGet**](MusicApi.md#apiMusicsearchsearchpagepageGet) | **GET** /api/music?search&#x3D;{search}&amp;page&#x3D;{page} | Search music |
| [**apiStreamSongIdGet**](MusicApi.md#apiStreamSongIdGet) | **GET** /api/stream/{songId} | Stream Music |



## apiMusicSongIdGet

> SongInfor apiMusicSongIdGet(songId)

Download Music + Get song infors

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MusicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MusicApi apiInstance = new MusicApi(defaultClient);
        String songId = "oKOtzIo-uYw"; // String | Valid youtube Id
        try {
            SongInfor result = apiInstance.apiMusicSongIdGet(songId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MusicApi#apiMusicSongIdGet");
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
| **songId** | **String**| Valid youtube Id | |

### Return type

[**SongInfor**](SongInfor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | After this api send response, /api/stream/{songId} is available to stream |  -  |
| **204** | No playlist |  -  |
| **401** |  |  -  |


## apiMusicsearchsearchpagepageGet

> ApiMusicSearchSearchPagePageGet200Response apiMusicsearchsearchpagepageGet(UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2)

Search music

Return data, only song that is less than 5 min

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MusicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MusicApi apiInstance = new MusicApi(defaultClient);
         UNKNOWN_PARAMETER_NAME = new null(); //  | 
         UNKNOWN_PARAMETER_NAME2 = new null(); //  | 
        try {
            ApiMusicSearchSearchPagePageGet200Response result = apiInstance.apiMusicsearchsearchpagepageGet(UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MusicApi#apiMusicsearchsearchpagepageGet");
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
| **UNKNOWN_PARAMETER_NAME** | [****](.md)|  | [optional] |
| **UNKNOWN_PARAMETER_NAME2** | [****](.md)|  | [optional] |

### Return type

[**ApiMusicSearchSearchPagePageGet200Response**](ApiMusicSearchSearchPagePageGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | After this api send response, /api/stream/{songId} is available to stream |  -  |
| **204** | No playlist |  -  |


## apiStreamSongIdGet

> File apiStreamSongIdGet(songId)

Stream Music

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MusicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MusicApi apiInstance = new MusicApi(defaultClient);
        String songId = "A_HekkBbd1M"; // String | Valid youtube Id
        try {
            File result = apiInstance.apiStreamSongIdGet(songId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MusicApi#apiStreamSongIdGet");
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
| **songId** | **String**| Valid youtube Id | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | audio return |  -  |
| **204** | No playlist |  -  |
| **401** |  |  -  |

