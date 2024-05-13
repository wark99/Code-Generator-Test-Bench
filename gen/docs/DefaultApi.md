# DefaultApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1vodChannelChannelBrowseCopyPost**](DefaultApi.md#call1vodChannelChannelBrowseCopyPost) | **POST** /1/vod/channel/{channel}/browse/copy | Duplicates one or many medias/folders to a given folder. |
| [**call1vodChannelChannelBrowseDelete**](DefaultApi.md#call1vodChannelChannelBrowseDelete) | **DELETE** /1/vod/channel/{channel}/browse | Moves one or many medias/folders to trash. |
| [**call1vodChannelChannelBrowseFileCopyPost**](DefaultApi.md#call1vodChannelChannelBrowseFileCopyPost) | **POST** /1/vod/channel/{channel}/browse/{file}/copy | Duplicates a media/folder to a given folder. |
| [**call1vodChannelChannelBrowseFileDelete**](DefaultApi.md#call1vodChannelChannelBrowseFileDelete) | **DELETE** /1/vod/channel/{channel}/browse/{file} | Moves a media/folder to trash. |
| [**call1vodChannelChannelBrowseFileGet**](DefaultApi.md#call1vodChannelChannelBrowseFileGet) | **GET** /1/vod/channel/{channel}/browse/{file} | Lists all children of a given folder. |
| [**call1vodChannelChannelBrowseFileMovePost**](DefaultApi.md#call1vodChannelChannelBrowseFileMovePost) | **POST** /1/vod/channel/{channel}/browse/{file}/move | Moves a media/folder to a given folder. |
| [**call1vodChannelChannelBrowseFilePut**](DefaultApi.md#call1vodChannelChannelBrowseFilePut) | **PUT** /1/vod/channel/{channel}/browse/{file} | Updates a media/folder. |
| [**call1vodChannelChannelBrowseGet**](DefaultApi.md#call1vodChannelChannelBrowseGet) | **GET** /1/vod/channel/{channel}/browse | Lists all children of the channel&#39;s root folder. |
| [**call1vodChannelChannelBrowseMovePost**](DefaultApi.md#call1vodChannelChannelBrowseMovePost) | **POST** /1/vod/channel/{channel}/browse/move | Moves one or many medias/folders to a given folder. |
| [**call1vodChannelChannelBrowseTrashFileDelete**](DefaultApi.md#call1vodChannelChannelBrowseTrashFileDelete) | **DELETE** /1/vod/channel/{channel}/browse/trash/{file} | Deletes a media/folder from trash, permanently. |
| [**call1vodChannelChannelBrowseTrashFileRestorePost**](DefaultApi.md#call1vodChannelChannelBrowseTrashFileRestorePost) | **POST** /1/vod/channel/{channel}/browse/trash/{file}/restore | Restores a media/folder from trash to its original location. |
| [**call1vodChannelChannelBrowseTrashGet**](DefaultApi.md#call1vodChannelChannelBrowseTrashGet) | **GET** /1/vod/channel/{channel}/browse/trash | Lists all medias/folders in trash. |
| [**call1vodChannelChannelBrowseUpdatePut**](DefaultApi.md#call1vodChannelChannelBrowseUpdatePut) | **PUT** /1/vod/channel/{channel}/browse/update | Updates one or many medias/folders. |
| [**call1vodChannelChannelFolderFolderDelete**](DefaultApi.md#call1vodChannelChannelFolderFolderDelete) | **DELETE** /1/vod/channel/{channel}/folder/{folder} | Deletes a folder with all its children, recursively. |
| [**call1vodChannelChannelFolderFolderGet**](DefaultApi.md#call1vodChannelChannelFolderFolderGet) | **GET** /1/vod/channel/{channel}/folder/{folder} | Returns a folder. |
| [**call1vodChannelChannelFolderFolderPlaylistGet**](DefaultApi.md#call1vodChannelChannelFolderFolderPlaylistGet) | **GET** /1/vod/channel/{channel}/folder/{folder}/playlist | Lists all playlists having a given folder attached. |
| [**call1vodChannelChannelFolderFolderPost**](DefaultApi.md#call1vodChannelChannelFolderFolderPost) | **POST** /1/vod/channel/{channel}/folder/{folder} | Creates a new folder in the parent folder. |
| [**call1vodChannelChannelFolderFolderPut**](DefaultApi.md#call1vodChannelChannelFolderFolderPut) | **PUT** /1/vod/channel/{channel}/folder/{folder} | Updates a folder. |
| [**call1vodChannelChannelFolderGet**](DefaultApi.md#call1vodChannelChannelFolderGet) | **GET** /1/vod/channel/{channel}/folder | List all folders. |
| [**call1vodChannelChannelFolderRootGet**](DefaultApi.md#call1vodChannelChannelFolderRootGet) | **GET** /1/vod/channel/{channel}/folder/root | Returns the channel&#39;s root folder. |
| [**call1vodChannelChannelMediaGet**](DefaultApi.md#call1vodChannelChannelMediaGet) | **GET** /1/vod/channel/{channel}/media | Lists all medias. |
| [**call1vodChannelChannelMediaMediaChapterChapterGet**](DefaultApi.md#call1vodChannelChannelMediaMediaChapterChapterGet) | **GET** /1/vod/channel/{channel}/media/{media}/chapter/{chapter} | Returns a chapter. |
| [**call1vodChannelChannelMediaMediaChapterChapterPut**](DefaultApi.md#call1vodChannelChannelMediaMediaChapterChapterPut) | **PUT** /1/vod/channel/{channel}/media/{media}/chapter/{chapter} | Updates a chapter. |
| [**call1vodChannelChannelMediaMediaChapterGet**](DefaultApi.md#call1vodChannelChannelMediaMediaChapterGet) | **GET** /1/vod/channel/{channel}/media/{media}/chapter | Lists all chapters of a given media. |
| [**call1vodChannelChannelMediaMediaChapterPost**](DefaultApi.md#call1vodChannelChannelMediaMediaChapterPost) | **POST** /1/vod/channel/{channel}/media/{media}/chapter | Creates a new chapter to a given media. |
| [**call1vodChannelChannelMediaMediaCutPost**](DefaultApi.md#call1vodChannelChannelMediaMediaCutPost) | **POST** /1/vod/channel/{channel}/media/{media}/cut | Cuts a media with its encodings |
| [**call1vodChannelChannelMediaMediaDelete**](DefaultApi.md#call1vodChannelChannelMediaMediaDelete) | **DELETE** /1/vod/channel/{channel}/media/{media} | Deletes a media. |
| [**call1vodChannelChannelMediaMediaGet**](DefaultApi.md#call1vodChannelChannelMediaMediaGet) | **GET** /1/vod/channel/{channel}/media/{media} | Returns a media. |
| [**call1vodChannelChannelMediaMediaPut**](DefaultApi.md#call1vodChannelChannelMediaMediaPut) | **PUT** /1/vod/channel/{channel}/media/{media} | Updates a media. |
| [**call1vodChannelChannelMediaMediaThumbnailPost**](DefaultApi.md#call1vodChannelChannelMediaMediaThumbnailPost) | **POST** /1/vod/channel/{channel}/media/{media}/thumbnail | Replaces the thumbnail &amp; poster for a given media |
| [**call1vodChannelChannelPlayerGet**](DefaultApi.md#call1vodChannelChannelPlayerGet) | **GET** /1/vod/channel/{channel}/player | Lists all players. |
| [**call1vodChannelChannelPlayerPlayerGet**](DefaultApi.md#call1vodChannelChannelPlayerPlayerGet) | **GET** /1/vod/channel/{channel}/player/{player} | Returns a player. |
| [**call1vodChannelChannelPlayerPlayerPut**](DefaultApi.md#call1vodChannelChannelPlayerPlayerPut) | **PUT** /1/vod/channel/{channel}/player/{player} | Updates a player. |
| [**call1vodChannelChannelPlaylistGet**](DefaultApi.md#call1vodChannelChannelPlaylistGet) | **GET** /1/vod/channel/{channel}/playlist | Lists all playlists. |
| [**call1vodChannelChannelPlaylistPlaylistGet**](DefaultApi.md#call1vodChannelChannelPlaylistPlaylistGet) | **GET** /1/vod/channel/{channel}/playlist/{playlist} | Returns a playlist. |
| [**call1vodChannelChannelSharePost**](DefaultApi.md#call1vodChannelChannelSharePost) | **POST** /1/vod/channel/{channel}/share | Creates a new share to a given target. |
| [**call1vodChannelChannelShareShareGet**](DefaultApi.md#call1vodChannelChannelShareShareGet) | **GET** /1/vod/channel/{channel}/share/{share} | Returns a share. |
| [**call1vodChannelChannelShareShareTokenPost**](DefaultApi.md#call1vodChannelChannelShareShareTokenPost) | **POST** /1/vod/channel/{channel}/share/{share}/token | token |
| [**call1vodChannelChannelStatisticsAvgTimeGet**](DefaultApi.md#call1vodChannelChannelStatisticsAvgTimeGet) | **GET** /1/vod/channel/{channel}/statistics/avg_time | avg time |
| [**call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/consumption/encodings/histogram | consumption encoding histogram |
| [**call1vodChannelChannelStatisticsConsumptionGet**](DefaultApi.md#call1vodChannelChannelStatisticsConsumptionGet) | **GET** /1/vod/channel/{channel}/statistics/consumption | consumption |
| [**call1vodChannelChannelStatisticsMediaGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaGet) | **GET** /1/vod/channel/{channel}/statistics/media | top-media |
| [**call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/consumption/encodings/histogram | media consumption encoding histogram |
| [**call1vodChannelChannelStatisticsMediaMediaConsumptionGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaConsumptionGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/consumption | media consumption |
| [**call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/geolocation/clusters | media clusters |
| [**call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/geolocation/countries | media countries |
| [**call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/technologies/browsers/shares | media browsers shares |
| [**call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/technologies/os/shares | media os shares |
| [**call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/technologies/playback/shares | media playbacks shares |
| [**call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/technologies/players/shares | media players shares |
| [**call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/viewers/encodings/histogram | media viewers encoding histogram |
| [**call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/viewers/encodings/shares | media viewers encoding shares |
| [**call1vodChannelChannelStatisticsMediaMediaViewersGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaViewersGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/viewers | media viewers |
| [**call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/viewers/uniques | media viewers unique |
| [**call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/viewing/encodings/histogram | media viewing time encoding histogram |
| [**call1vodChannelChannelStatisticsMediaMediaViewingGet**](DefaultApi.md#call1vodChannelChannelStatisticsMediaMediaViewingGet) | **GET** /1/vod/channel/{channel}/statistics/media/{media}/viewing | media viewing time |
| [**call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet) | **GET** /1/vod/channel/{channel}/statistics/technologies/browsers/shares | browsers shares |
| [**call1vodChannelChannelStatisticsTechnologiesOsSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsTechnologiesOsSharesGet) | **GET** /1/vod/channel/{channel}/statistics/technologies/os/shares | os shares |
| [**call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet) | **GET** /1/vod/channel/{channel}/statistics/technologies/playback/shares | playbacks shares |
| [**call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet) | **GET** /1/vod/channel/{channel}/statistics/technologies/players/shares | players shares |
| [**call1vodChannelChannelStatisticsTimeIpGet**](DefaultApi.md#call1vodChannelChannelStatisticsTimeIpGet) | **GET** /1/vod/channel/{channel}/statistics/time_ip | time ip |
| [**call1vodChannelChannelStatisticsViewersEncodingsHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersEncodingsHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/viewers/encodings/histogram | viewers encoding histogram |
| [**call1vodChannelChannelStatisticsViewersEncodingsSharesGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersEncodingsSharesGet) | **GET** /1/vod/channel/{channel}/statistics/viewers/encodings/shares | viewers encoding shares |
| [**call1vodChannelChannelStatisticsViewersGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersGet) | **GET** /1/vod/channel/{channel}/statistics/viewers | viewers |
| [**call1vodChannelChannelStatisticsViewersHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/viewers/histogram | viewers histogram |
| [**call1vodChannelChannelStatisticsViewersMediasGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersMediasGet) | **GET** /1/vod/channel/{channel}/statistics/viewers/medias | viewers medias bulk |
| [**call1vodChannelChannelStatisticsViewersUniquesGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersUniquesGet) | **GET** /1/vod/channel/{channel}/statistics/viewers/uniques | viewers unique |
| [**call1vodChannelChannelStatisticsViewersUniquesMediasGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewersUniquesMediasGet) | **GET** /1/vod/channel/{channel}/statistics/viewers/uniques/medias | viewers medias unique bulk |
| [**call1vodChannelChannelStatisticsViewingEncodingsHistogramGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewingEncodingsHistogramGet) | **GET** /1/vod/channel/{channel}/statistics/viewing/encodings/histogram | viewing time encoding histogram |
| [**call1vodChannelChannelStatisticsViewingGet**](DefaultApi.md#call1vodChannelChannelStatisticsViewingGet) | **GET** /1/vod/channel/{channel}/statistics/viewing | viewing time |
| [**call1vodChannelChannelUploadPost**](DefaultApi.md#call1vodChannelChannelUploadPost) | **POST** /1/vod/channel/{channel}/upload | store |



## call1vodChannelChannelBrowseCopyPost

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseCopyPost(channel, model1VodChannelChannelBrowseCopyPostRequest)

Duplicates one or many medias/folders to a given folder.

Duplicates one or many medias/folders to a given folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        Model1VodChannelChannelBrowseCopyPostRequest model1VodChannelChannelBrowseCopyPostRequest = new Model1VodChannelChannelBrowseCopyPostRequest(); // Model1VodChannelChannelBrowseCopyPostRequest | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseCopyPost(channel, model1VodChannelChannelBrowseCopyPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseCopyPost");
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
| **channel** | **String**|  | |
| **model1VodChannelChannelBrowseCopyPostRequest** | [**Model1VodChannelChannelBrowseCopyPostRequest**](Model1VodChannelChannelBrowseCopyPostRequest.md)|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseDelete

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseDelete(channel, model1VodChannelChannelBrowseDeleteRequest)

Moves one or many medias/folders to trash.

Moves one or many medias/folders to trash.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        Model1VodChannelChannelBrowseDeleteRequest model1VodChannelChannelBrowseDeleteRequest = new Model1VodChannelChannelBrowseDeleteRequest(); // Model1VodChannelChannelBrowseDeleteRequest | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseDelete(channel, model1VodChannelChannelBrowseDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseDelete");
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
| **channel** | **String**|  | |
| **model1VodChannelChannelBrowseDeleteRequest** | [**Model1VodChannelChannelBrowseDeleteRequest**](Model1VodChannelChannelBrowseDeleteRequest.md)|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **204** |  |  -  |


## call1vodChannelChannelBrowseFileCopyPost

> Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseFileCopyPost(channel, _file, model1VodChannelChannelBrowseFileCopyPostRequest)

Duplicates a media/folder to a given folder.

Duplicates a media/folder to a given folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        Model1VodChannelChannelBrowseFileCopyPostRequest model1VodChannelChannelBrowseFileCopyPostRequest = new Model1VodChannelChannelBrowseFileCopyPostRequest(); // Model1VodChannelChannelBrowseFileCopyPostRequest | 
        try {
            Model1VodChannelChannelBrowseTrashFileRestorePost200Response result = apiInstance.call1vodChannelChannelBrowseFileCopyPost(channel, _file, model1VodChannelChannelBrowseFileCopyPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseFileCopyPost");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |
| **model1VodChannelChannelBrowseFileCopyPostRequest** | [**Model1VodChannelChannelBrowseFileCopyPostRequest**](Model1VodChannelChannelBrowseFileCopyPostRequest.md)|  | |

### Return type

[**Model1VodChannelChannelBrowseTrashFileRestorePost200Response**](Model1VodChannelChannelBrowseTrashFileRestorePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseFileDelete

> Object call1vodChannelChannelBrowseFileDelete(channel, _file)

Moves a media/folder to trash.

Moves a media/folder to trash.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        try {
            Object result = apiInstance.call1vodChannelChannelBrowseFileDelete(channel, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseFileDelete");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |


## call1vodChannelChannelBrowseFileGet

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseFileGet(channel, _file)

Lists all children of a given folder.

Lists all children of a given folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseFileGet(channel, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseFileGet");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseFileMovePost

> Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseFileMovePost(channel, _file, model1VodChannelChannelBrowseFileCopyPostRequest)

Moves a media/folder to a given folder.

Moves a media/folder to a given folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        Model1VodChannelChannelBrowseFileCopyPostRequest model1VodChannelChannelBrowseFileCopyPostRequest = new Model1VodChannelChannelBrowseFileCopyPostRequest(); // Model1VodChannelChannelBrowseFileCopyPostRequest | 
        try {
            Model1VodChannelChannelBrowseTrashFileRestorePost200Response result = apiInstance.call1vodChannelChannelBrowseFileMovePost(channel, _file, model1VodChannelChannelBrowseFileCopyPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseFileMovePost");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |
| **model1VodChannelChannelBrowseFileCopyPostRequest** | [**Model1VodChannelChannelBrowseFileCopyPostRequest**](Model1VodChannelChannelBrowseFileCopyPostRequest.md)|  | |

### Return type

[**Model1VodChannelChannelBrowseTrashFileRestorePost200Response**](Model1VodChannelChannelBrowseTrashFileRestorePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseFilePut

> Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseFilePut(channel, _file, body)

Updates a media/folder.

Updates a media/folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        Object body = null; // Object | 
        try {
            Model1VodChannelChannelBrowseTrashFileRestorePost200Response result = apiInstance.call1vodChannelChannelBrowseFilePut(channel, _file, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseFilePut");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**Model1VodChannelChannelBrowseTrashFileRestorePost200Response**](Model1VodChannelChannelBrowseTrashFileRestorePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseGet

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseGet(channel)

Lists all children of the channel&#39;s root folder.

Lists all children of the channel&#39;s root folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseGet(channel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseGet");
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
| **channel** | **String**|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |


## call1vodChannelChannelBrowseMovePost

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseMovePost(channel, model1VodChannelChannelBrowseCopyPostRequest)

Moves one or many medias/folders to a given folder.

Moves one or many medias/folders to a given folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        Model1VodChannelChannelBrowseCopyPostRequest model1VodChannelChannelBrowseCopyPostRequest = new Model1VodChannelChannelBrowseCopyPostRequest(); // Model1VodChannelChannelBrowseCopyPostRequest | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseMovePost(channel, model1VodChannelChannelBrowseCopyPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseMovePost");
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
| **channel** | **String**|  | |
| **model1VodChannelChannelBrowseCopyPostRequest** | [**Model1VodChannelChannelBrowseCopyPostRequest**](Model1VodChannelChannelBrowseCopyPostRequest.md)|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseTrashFileDelete

> Object call1vodChannelChannelBrowseTrashFileDelete(channel, _file)

Deletes a media/folder from trash, permanently.

Deletes a media/folder from trash, permanently.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        try {
            Object result = apiInstance.call1vodChannelChannelBrowseTrashFileDelete(channel, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseTrashFileDelete");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |


## call1vodChannelChannelBrowseTrashFileRestorePost

> Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseTrashFileRestorePost(channel, _file)

Restores a media/folder from trash to its original location.

Restores a media/folder from trash to its original location.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String _file = "1jhvl2uqa5v8a"; // String | 
        try {
            Model1VodChannelChannelBrowseTrashFileRestorePost200Response result = apiInstance.call1vodChannelChannelBrowseTrashFileRestorePost(channel, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseTrashFileRestorePost");
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
| **channel** | **String**|  | |
| **_file** | **String**|  | |

### Return type

[**Model1VodChannelChannelBrowseTrashFileRestorePost200Response**](Model1VodChannelChannelBrowseTrashFileRestorePost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseTrashGet

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseTrashGet(channel)

Lists all medias/folders in trash.

Lists all medias/folders in trash.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseTrashGet(channel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseTrashGet");
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
| **channel** | **String**|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelBrowseUpdatePut

> Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseUpdatePut(channel, model1VodChannelChannelBrowseUpdatePutRequest)

Updates one or many medias/folders.

Updates one or many medias/folders.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        Model1VodChannelChannelBrowseUpdatePutRequest model1VodChannelChannelBrowseUpdatePutRequest = new Model1VodChannelChannelBrowseUpdatePutRequest(); // Model1VodChannelChannelBrowseUpdatePutRequest | 
        try {
            Model1VodChannelChannelBrowseGet200Response result = apiInstance.call1vodChannelChannelBrowseUpdatePut(channel, model1VodChannelChannelBrowseUpdatePutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelBrowseUpdatePut");
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
| **channel** | **String**|  | |
| **model1VodChannelChannelBrowseUpdatePutRequest** | [**Model1VodChannelChannelBrowseUpdatePutRequest**](Model1VodChannelChannelBrowseUpdatePutRequest.md)|  | |

### Return type

[**Model1VodChannelChannelBrowseGet200Response**](Model1VodChannelChannelBrowseGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelFolderFolderDelete

> Object call1vodChannelChannelFolderFolderDelete(channel, folder)

Deletes a folder with all its children, recursively.

Deletes a folder with all its children, recursively.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String folder = "1jhvl2uqa5v8a"; // String | 
        try {
            Object result = apiInstance.call1vodChannelChannelFolderFolderDelete(channel, folder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderFolderDelete");
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
| **channel** | **String**|  | |
| **folder** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |


## call1vodChannelChannelFolderFolderGet

> Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderFolderGet(channel, folder, $folderCommaNewOptionsHttp$request, with)

Returns a folder.

Returns a folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String folder = "1jhvl2uqa5v8a"; // String | 
        String $folderCommaNewOptionsHttp$request = "$folderCommaNewOptionsHttp$request_example"; // String | 
        String with = "allowed_country,disallowed_country,effectiveEncodings,media_count,media_duration"; // String | 
        try {
            Model1VodChannelChannelFolderRootGet200Response result = apiInstance.call1vodChannelChannelFolderFolderGet(channel, folder, $folderCommaNewOptionsHttp$request, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderFolderGet");
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
| **channel** | **String**|  | |
| **folder** | **String**|  | |
| **$folderCommaNewOptionsHttp$request** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelFolderRootGet200Response**](Model1VodChannelChannelFolderRootGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelFolderFolderPlaylistGet

> Model1VodChannelChannelFolderFolderPlaylistGet200Response call1vodChannelChannelFolderFolderPlaylistGet(channel, folder, with)

Lists all playlists having a given folder attached.

Lists all playlists having a given folder attached.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String folder = "1jhvl2uqa5v8a"; // String | 
        String with = "image,files,medias_count,medias_duration"; // String | 
        try {
            Model1VodChannelChannelFolderFolderPlaylistGet200Response result = apiInstance.call1vodChannelChannelFolderFolderPlaylistGet(channel, folder, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderFolderPlaylistGet");
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
| **channel** | **String**|  | |
| **folder** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelFolderFolderPlaylistGet200Response**](Model1VodChannelChannelFolderFolderPlaylistGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelFolderFolderPost

> Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderFolderPost(channel, folder, shortFolder)

Creates a new folder in the parent folder.

Creates a new folder in the parent folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String folder = "1jhvl2uqa5v8a"; // String | 
        ShortFolder shortFolder = new ShortFolder(); // ShortFolder | 
        try {
            Model1VodChannelChannelFolderRootGet200Response result = apiInstance.call1vodChannelChannelFolderFolderPost(channel, folder, shortFolder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderFolderPost");
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
| **channel** | **String**|  | |
| **folder** | **String**|  | |
| **shortFolder** | [**ShortFolder**](ShortFolder.md)|  | |

### Return type

[**Model1VodChannelChannelFolderRootGet200Response**](Model1VodChannelChannelFolderRootGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelFolderFolderPut

> Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderFolderPut(channel, folder, shortFolder)

Updates a folder.

Updates a folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String folder = "1jhvl2uqa5v8a"; // String | 
        ShortFolder shortFolder = new ShortFolder(); // ShortFolder | 
        try {
            Model1VodChannelChannelFolderRootGet200Response result = apiInstance.call1vodChannelChannelFolderFolderPut(channel, folder, shortFolder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderFolderPut");
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
| **channel** | **String**|  | |
| **folder** | **String**|  | |
| **shortFolder** | [**ShortFolder**](ShortFolder.md)|  | |

### Return type

[**Model1VodChannelChannelFolderRootGet200Response**](Model1VodChannelChannelFolderRootGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelFolderGet

> Model1VodChannelChannelFolderGet200Response call1vodChannelChannelFolderGet(channel, with)

List all folders.

List all folders.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String with = "allowed_country,disallowed_country,effectiveEncodings,media_count,media_duration"; // String | 
        try {
            Model1VodChannelChannelFolderGet200Response result = apiInstance.call1vodChannelChannelFolderGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderGet");
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
| **channel** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelFolderGet200Response**](Model1VodChannelChannelFolderGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelFolderRootGet

> Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderRootGet(channel, with)

Returns the channel&#39;s root folder.

Returns the channel&#39;s root folder.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String with = "allowed_country,disallowed_country,effectiveEncodings,media_count,media_duration"; // String | 
        try {
            Model1VodChannelChannelFolderRootGet200Response result = apiInstance.call1vodChannelChannelFolderRootGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelFolderRootGet");
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
| **channel** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelFolderRootGet200Response**](Model1VodChannelChannelFolderRootGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaGet

> Model1VodChannelChannelMediaGet200Response call1vodChannelChannelMediaGet(channel, with)

Lists all medias.

Lists all medias.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String with = "manifests,source,state,preview,sample,shot_boundaries,thumbnail,poster,encodings,progress,playbacks"; // String | 
        try {
            Model1VodChannelChannelMediaGet200Response result = apiInstance.call1vodChannelChannelMediaGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaGet");
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
| **channel** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelMediaGet200Response**](Model1VodChannelChannelMediaGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaChapterChapterGet

> Model1VodChannelChannelMediaMediaChapterChapterGet200Response call1vodChannelChannelMediaMediaChapterChapterGet(channel, media, chapter, $mediaComma$chapterCommaNewOptionsHttp$request, with)

Returns a chapter.

Returns a chapter.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String chapter = "1jhvl2uqa5v8a"; // String | 
        String $mediaComma$chapterCommaNewOptionsHttp$request = "$mediaComma$chapterCommaNewOptionsHttp$request_example"; // String | 
        String with = "image"; // String | 
        try {
            Model1VodChannelChannelMediaMediaChapterChapterGet200Response result = apiInstance.call1vodChannelChannelMediaMediaChapterChapterGet(channel, media, chapter, $mediaComma$chapterCommaNewOptionsHttp$request, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaChapterChapterGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **chapter** | **String**|  | |
| **$mediaComma$chapterCommaNewOptionsHttp$request** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelMediaMediaChapterChapterGet200Response**](Model1VodChannelChannelMediaMediaChapterChapterGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaChapterChapterPut

> Model1VodChannelChannelMediaMediaChapterGet200Response call1vodChannelChannelMediaMediaChapterChapterPut(channel, media, chapter, shortChapter)

Updates a chapter.

Updates a chapter.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String chapter = "1jhvl2uqa5v8a"; // String | 
        ShortChapter shortChapter = new ShortChapter(); // ShortChapter | 
        try {
            Model1VodChannelChannelMediaMediaChapterGet200Response result = apiInstance.call1vodChannelChannelMediaMediaChapterChapterPut(channel, media, chapter, shortChapter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaChapterChapterPut");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **chapter** | **String**|  | |
| **shortChapter** | [**ShortChapter**](ShortChapter.md)|  | [optional] |

### Return type

[**Model1VodChannelChannelMediaMediaChapterGet200Response**](Model1VodChannelChannelMediaMediaChapterGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaChapterGet

> Model1VodChannelChannelMediaMediaChapterGet200Response call1vodChannelChannelMediaMediaChapterGet(channel, media, with)

Lists all chapters of a given media.

Lists all chapters of a given media.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String with = "image"; // String | 
        try {
            Model1VodChannelChannelMediaMediaChapterGet200Response result = apiInstance.call1vodChannelChannelMediaMediaChapterGet(channel, media, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaChapterGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelMediaMediaChapterGet200Response**](Model1VodChannelChannelMediaMediaChapterGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaChapterPost

> Model1VodChannelChannelMediaMediaChapterGet200Response call1vodChannelChannelMediaMediaChapterPost(channel, media, shortChapter)

Creates a new chapter to a given media.

Creates a new chapter to a given media.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        ShortChapter shortChapter = new ShortChapter(); // ShortChapter | 
        try {
            Model1VodChannelChannelMediaMediaChapterGet200Response result = apiInstance.call1vodChannelChannelMediaMediaChapterPost(channel, media, shortChapter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaChapterPost");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **shortChapter** | [**ShortChapter**](ShortChapter.md)|  | [optional] |

### Return type

[**Model1VodChannelChannelMediaMediaChapterGet200Response**](Model1VodChannelChannelMediaMediaChapterGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaCutPost

> Model1VodChannelChannelMediaMediaCutPost200Response call1vodChannelChannelMediaMediaCutPost(body, _new, from, duration, channel, media)

Cuts a media with its encodings

Cuts a media with its encodings

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Object body = null; // Object | 
        String _new = "1"; // String | creates a new trimmed media if set to 1
        String from = "2"; // String | time in seconds where the trim starts, in multiples of 2
        String duration = "24"; // String | duration of the trim in seconds, in multiples of 2, is (endTime-startTrimTime)
        String channel = "6349"; // String | channel id
        String media = "1jhvl2uqa5v8a"; // String | media uuid
        try {
            Model1VodChannelChannelMediaMediaCutPost200Response result = apiInstance.call1vodChannelChannelMediaMediaCutPost(body, _new, from, duration, channel, media);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaCutPost");
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
| **body** | **Object**|  | |
| **_new** | **String**| creates a new trimmed media if set to 1 | [optional] |
| **from** | **String**| time in seconds where the trim starts, in multiples of 2 | [optional] |
| **duration** | **String**| duration of the trim in seconds, in multiples of 2, is (endTime-startTrimTime) | [optional] |
| **channel** | **String**| channel id | [optional] |
| **media** | **String**| media uuid | [optional] |

### Return type

[**Model1VodChannelChannelMediaMediaCutPost200Response**](Model1VodChannelChannelMediaMediaCutPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaDelete

> Object call1vodChannelChannelMediaMediaDelete(channel, media)

Deletes a media.

Deletes a media.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        try {
            Object result = apiInstance.call1vodChannelChannelMediaMediaDelete(channel, media);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaDelete");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |


## call1vodChannelChannelMediaMediaGet

> Model1VodChannelChannelMediaMediaGet200Response call1vodChannelChannelMediaMediaGet(channel, media, $mediaCommaNewOptionsHttp$request, with)

Returns a media.

Returns a media.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String $mediaCommaNewOptionsHttp$request = "$mediaCommaNewOptionsHttp$request_example"; // String | 
        String with = "manifests,source,state,preview,sample,shot_boundaries,thumbnail,poster,encodings,progress,playbacks"; // String | 
        try {
            Model1VodChannelChannelMediaMediaGet200Response result = apiInstance.call1vodChannelChannelMediaMediaGet(channel, media, $mediaCommaNewOptionsHttp$request, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **$mediaCommaNewOptionsHttp$request** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelMediaMediaGet200Response**](Model1VodChannelChannelMediaMediaGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaPut

> Model1VodChannelChannelMediaMediaGet200Response call1vodChannelChannelMediaMediaPut(channel, media, shortMedia)

Updates a media.

Updates a media.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        ShortMedia shortMedia = new ShortMedia(); // ShortMedia | 
        try {
            Model1VodChannelChannelMediaMediaGet200Response result = apiInstance.call1vodChannelChannelMediaMediaPut(channel, media, shortMedia);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaPut");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **shortMedia** | [**ShortMedia**](ShortMedia.md)|  | |

### Return type

[**Model1VodChannelChannelMediaMediaGet200Response**](Model1VodChannelChannelMediaMediaGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelMediaMediaThumbnailPost

> Model1VodChannelChannelMediaMediaThumbnailPost200Response call1vodChannelChannelMediaMediaThumbnailPost(_file, channel, media)

Replaces the thumbnail &amp; poster for a given media

Replaces the thumbnail &amp; poster for a given media  with the file provided in the request as multipart/form-data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String _file = "uploaded file within multipart/form-data ( ex: using <form method=post enctype='multipart/form-data'><input type=file name=file> )"; // String | The thumbnail file
        String channel = "channel id : 6349"; // String | 
        String media = "media uuid : 1jhv...."; // String | 
        try {
            Model1VodChannelChannelMediaMediaThumbnailPost200Response result = apiInstance.call1vodChannelChannelMediaMediaThumbnailPost(_file, channel, media);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelMediaMediaThumbnailPost");
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
| **_file** | **String**| The thumbnail file | |
| **channel** | **String**|  | |
| **media** | **String**|  | |

### Return type

[**Model1VodChannelChannelMediaMediaThumbnailPost200Response**](Model1VodChannelChannelMediaMediaThumbnailPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |


## call1vodChannelChannelPlayerGet

> Model1VodChannelChannelPlayerGet200Response call1vodChannelChannelPlayerGet(channel, with)

Lists all players.

Lists all players.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String with = "files,logo_image,preload_image,interrupt_image,geoip_image,restrict_image,is_channel_default"; // String | 
        try {
            Model1VodChannelChannelPlayerGet200Response result = apiInstance.call1vodChannelChannelPlayerGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelPlayerGet");
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
| **channel** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelPlayerGet200Response**](Model1VodChannelChannelPlayerGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelPlayerPlayerGet

> Model1VodChannelChannelPlayerPlayerGet200Response call1vodChannelChannelPlayerPlayerGet(channel, player, $playerCommaNewOptionsHttp$request, with)

Returns a player.

Returns a player.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String player = "1jhvl2uqa5v8a"; // String | 
        String $playerCommaNewOptionsHttp$request = "$playerCommaNewOptionsHttp$request_example"; // String | 
        String with = "files,logo_image,preload_image,interrupt_image,geoip_image,restrict_image,is_channel_default"; // String | 
        try {
            Model1VodChannelChannelPlayerPlayerGet200Response result = apiInstance.call1vodChannelChannelPlayerPlayerGet(channel, player, $playerCommaNewOptionsHttp$request, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelPlayerPlayerGet");
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
| **channel** | **String**|  | |
| **player** | **String**|  | |
| **$playerCommaNewOptionsHttp$request** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelPlayerPlayerGet200Response**](Model1VodChannelChannelPlayerPlayerGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelPlayerPlayerPut

> Model1VodChannelChannelPlayerPlayerGet200Response call1vodChannelChannelPlayerPlayerPut(channel, player, body)

Updates a player.

Updates a player.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String player = "1jhvl2uqa5v8a"; // String | 
        Object body = null; // Object | 
        try {
            Model1VodChannelChannelPlayerPlayerGet200Response result = apiInstance.call1vodChannelChannelPlayerPlayerPut(channel, player, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelPlayerPlayerPut");
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
| **channel** | **String**|  | |
| **player** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**Model1VodChannelChannelPlayerPlayerGet200Response**](Model1VodChannelChannelPlayerPlayerGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelPlaylistGet

> Model1VodChannelChannelFolderFolderPlaylistGet200Response call1vodChannelChannelPlaylistGet(channel, with)

Lists all playlists.

Lists all playlists.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String with = "image,files,medias_count,medias_duration"; // String | 
        try {
            Model1VodChannelChannelFolderFolderPlaylistGet200Response result = apiInstance.call1vodChannelChannelPlaylistGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelPlaylistGet");
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
| **channel** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelFolderFolderPlaylistGet200Response**](Model1VodChannelChannelFolderFolderPlaylistGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelPlaylistPlaylistGet

> Model1VodChannelChannelPlaylistPlaylistGet200Response call1vodChannelChannelPlaylistPlaylistGet(channel, playlist, $playlistCommaNewOptionsHttp$request, with)

Returns a playlist.

Returns a playlist.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String playlist = "1jhvl2uqa5v8a"; // String | 
        String $playlistCommaNewOptionsHttp$request = "$playlistCommaNewOptionsHttp$request_example"; // String | 
        String with = "image,files,medias_count,medias_duration"; // String | 
        try {
            Model1VodChannelChannelPlaylistPlaylistGet200Response result = apiInstance.call1vodChannelChannelPlaylistPlaylistGet(channel, playlist, $playlistCommaNewOptionsHttp$request, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelPlaylistPlaylistGet");
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
| **channel** | **String**|  | |
| **playlist** | **String**|  | |
| **$playlistCommaNewOptionsHttp$request** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelPlaylistPlaylistGet200Response**](Model1VodChannelChannelPlaylistPlaylistGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelSharePost

> Model1VodChannelChannelSharePost200Response call1vodChannelChannelSharePost(channel, model1VodChannelChannelSharePostRequest)

Creates a new share to a given target.

Creates a share, returns a share having id in order to build this url : https://api.vod2.infomaniak.com/res/embed/{{ ID }}.html

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        Model1VodChannelChannelSharePostRequest model1VodChannelChannelSharePostRequest = new Model1VodChannelChannelSharePostRequest(); // Model1VodChannelChannelSharePostRequest | 
        try {
            Model1VodChannelChannelSharePost200Response result = apiInstance.call1vodChannelChannelSharePost(channel, model1VodChannelChannelSharePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelSharePost");
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
| **channel** | **String**|  | |
| **model1VodChannelChannelSharePostRequest** | [**Model1VodChannelChannelSharePostRequest**](Model1VodChannelChannelSharePostRequest.md)|  | |

### Return type

[**Model1VodChannelChannelSharePost200Response**](Model1VodChannelChannelSharePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelShareShareGet

> Model1VodChannelChannelShareShareGet200Response call1vodChannelChannelShareShareGet(channel, share, $shareCommaNewOptionsHttp$request, with)

Returns a share.

Returns a share.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String share = "1jhvl2uqa5v8a"; // String | 
        String $shareCommaNewOptionsHttp$request = "$shareCommaNewOptionsHttp$request_example"; // String | 
        String with = "links,target_id,target_type,player,manifests,target"; // String | 
        try {
            Model1VodChannelChannelShareShareGet200Response result = apiInstance.call1vodChannelChannelShareShareGet(channel, share, $shareCommaNewOptionsHttp$request, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelShareShareGet");
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
| **channel** | **String**|  | |
| **share** | **String**|  | |
| **$shareCommaNewOptionsHttp$request** | **String**|  | |
| **with** | **String**|  | [optional] |

### Return type

[**Model1VodChannelChannelShareShareGet200Response**](Model1VodChannelChannelShareShareGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelShareShareTokenPost

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelShareShareTokenPost(channel, share, body)

token

token

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String share = "1jhvl2uqa5v8a"; // String | 
        Object body = null; // Object | 
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelShareShareTokenPost(channel, share, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelShareShareTokenPost");
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
| **channel** | **String**|  | |
| **share** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsAvgTimeGet

> String call1vodChannelChannelStatisticsAvgTimeGet(channel, from)

avg time

avg time

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            String result = apiInstance.call1vodChannelChannelStatisticsAvgTimeGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsAvgTimeGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

**String**

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet(channel, from, per)

consumption encoding histogram

consumption encoding histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        String per = "1d"; // String | Histogram grouped by 1d,1h,1m ..
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet(channel, from, per);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |
| **per** | **String**| Histogram grouped by 1d,1h,1m .. | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsConsumptionGet

> String call1vodChannelChannelStatisticsConsumptionGet(channel, from)

consumption

consumption

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            String result = apiInstance.call1vodChannelChannelStatisticsConsumptionGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsConsumptionGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

**String**

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaGet(channel, from)

top-media

top-media

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet(channel, media, from, per)

media consumption encoding histogram

media consumption encoding histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        String per = "1d"; // String | Histogram grouped by 1d,1h,1m ..
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet(channel, media, from, per);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |
| **per** | **String**| Histogram grouped by 1d,1h,1m .. | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaConsumptionGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaConsumptionGet(channel, media, from)

media consumption

media consumption

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaConsumptionGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaConsumptionGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet(channel, media)

media clusters

media clusters

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet(channel, media);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet(channel, media)

media countries

media countries

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet(channel, media);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet(channel, media, from)

media browsers shares

media browsers shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet(channel, media, from)

media os shares

media os shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet(channel, media, from)

media playbacks shares

media playbacks shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet(channel, media, from)

media players shares

media players shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet(channel, media, from)

media viewers encoding histogram

media viewers encoding histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet(channel, media, from)

media viewers encoding shares

media viewers encoding shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaViewersGet

> Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response call1vodChannelChannelStatisticsMediaMediaViewersGet(channel, media, medias, from)

media viewers

media viewers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String medias = "?medias=1jhvl1uq4j94b,1jhvl1uq4j94c"; // String | Valid Media identifiers separated with comma ,
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaViewersGet(channel, media, medias, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaViewersGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **medias** | **String**| Valid Media identifiers separated with comma , | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response**](Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet

> Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet(channel, media, medias, from)

media viewers unique

media viewers unique

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String medias = "?medias=1jhvl1uq4j94b,1jhvl1uq4j94c"; // String | Valid Media identifiers separated with comma ,
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet(channel, media, medias, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **medias** | **String**| Valid Media identifiers separated with comma , | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response**](Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet(channel, media, from, per)

media viewing time encoding histogram

media viewing time encoding histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        String per = "1d"; // String | Histogram grouped by 1d,1h,1m ..
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet(channel, media, from, per);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |
| **per** | **String**| Histogram grouped by 1d,1h,1m .. | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsMediaMediaViewingGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewingGet(channel, media, from)

media viewing time

media viewing time

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String media = "1jhvl2uqa5v8a"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsMediaMediaViewingGet(channel, media, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsMediaMediaViewingGet");
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
| **channel** | **String**|  | |
| **media** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet(channel, from)

browsers shares

browsers shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsTechnologiesOsSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesOsSharesGet(channel, from)

os shares

os shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsTechnologiesOsSharesGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsTechnologiesOsSharesGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet(channel, from)

playbacks shares

playbacks shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet(channel, from)

players shares

players shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsTimeIpGet

> String call1vodChannelChannelStatisticsTimeIpGet(channel, from)

time ip

time ip

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            String result = apiInstance.call1vodChannelChannelStatisticsTimeIpGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsTimeIpGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

**String**

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
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## call1vodChannelChannelStatisticsViewersEncodingsHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersEncodingsHistogramGet(channel, from)

viewers encoding histogram

viewers encoding histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewersEncodingsHistogramGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersEncodingsHistogramGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewersEncodingsSharesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersEncodingsSharesGet(channel, from)

viewers encoding shares

viewers encoding shares

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewersEncodingsSharesGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersEncodingsSharesGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewersGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersGet(channel, from)

viewers

viewers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewersGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewersHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersHistogramGet(channel, from, per)

viewers histogram

viewers histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        String per = "1d"; // String | Histogram grouped by 1d,1h,1m ..
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewersHistogramGet(channel, from, per);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersHistogramGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |
| **per** | **String**| Histogram grouped by 1d,1h,1m .. | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewersMediasGet

> String call1vodChannelChannelStatisticsViewersMediasGet(channel, medias, from)

viewers medias bulk

viewers medias bulk

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String medias = "?medias=1jhvl1uq4j94b,1jhvl1uq4j94c"; // String | Valid Media identifiers separated with comma ,
        String from = "1640390400"; // String | begin date timestamp
        try {
            String result = apiInstance.call1vodChannelChannelStatisticsViewersMediasGet(channel, medias, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersMediasGet");
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
| **channel** | **String**|  | |
| **medias** | **String**| Valid Media identifiers separated with comma , | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

**String**

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewersUniquesGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersUniquesGet(channel, from)

viewers unique

viewers unique

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewersUniquesGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersUniquesGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewersUniquesMediasGet

> Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response call1vodChannelChannelStatisticsViewersUniquesMediasGet(channel, medias, from)

viewers medias unique bulk

viewers medias unique bulk

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String medias = "?medias=1jhvl1uq4j94b,1jhvl1uq4j94c"; // String | Valid Media identifiers separated with comma ,
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response result = apiInstance.call1vodChannelChannelStatisticsViewersUniquesMediasGet(channel, medias, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewersUniquesMediasGet");
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
| **channel** | **String**|  | |
| **medias** | **String**| Valid Media identifiers separated with comma , | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response**](Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewingEncodingsHistogramGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewingEncodingsHistogramGet(channel, from)

viewing time encoding histogram

viewing time encoding histogram

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewingEncodingsHistogramGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewingEncodingsHistogramGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelStatisticsViewingGet

> Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewingGet(channel, from)

viewing time

viewing time

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        String from = "1640390400"; // String | begin date timestamp
        try {
            Model1VodChannelChannelShareShareTokenPost200Response result = apiInstance.call1vodChannelChannelStatisticsViewingGet(channel, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelStatisticsViewingGet");
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
| **channel** | **String**|  | |
| **from** | **String**| begin date timestamp | [optional] |

### Return type

[**Model1VodChannelChannelShareShareTokenPost200Response**](Model1VodChannelChannelShareShareTokenPost200Response.md)

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
| **401** |  |  -  |
| **404** |  |  -  |


## call1vodChannelChannelUploadPost

> Model1VodChannelChannelUploadPost200Response call1vodChannelChannelUploadPost(channel, model1VodChannelChannelUploadPostRequest, digest)

store

Creates a new upload

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String channel = "channel id : 6349"; // String | 
        Model1VodChannelChannelUploadPostRequest model1VodChannelChannelUploadPostRequest = new Model1VodChannelChannelUploadPostRequest(); // Model1VodChannelChannelUploadPostRequest | 
        String digest = "Digest: sha-256=X48E9qOokqqrvdts8nOJRJN3OWDUoyWxBf7kbu9DBPE=,unixsum=30637"; // String | Digest: algorythmn checksum
        try {
            Model1VodChannelChannelUploadPost200Response result = apiInstance.call1vodChannelChannelUploadPost(channel, model1VodChannelChannelUploadPostRequest, digest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#call1vodChannelChannelUploadPost");
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
| **channel** | **String**|  | |
| **model1VodChannelChannelUploadPostRequest** | [**Model1VodChannelChannelUploadPostRequest**](Model1VodChannelChannelUploadPostRequest.md)|  | |
| **digest** | **String**| Digest: algorythmn checksum | [optional] |

### Return type

[**Model1VodChannelChannelUploadPost200Response**](Model1VodChannelChannelUploadPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, file
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

