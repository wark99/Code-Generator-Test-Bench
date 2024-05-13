# PlayersEmbedsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelPlayersPlayerEmbedGet**](PlayersEmbedsApi.md#call1videosChannelPlayersPlayerEmbedGet) | **GET** /1/videos/{channel}/players/{player}/embed | Integration code |
| [**call1videosChannelPlayersPlayerEmbedUrlGet**](PlayersEmbedsApi.md#call1videosChannelPlayersPlayerEmbedUrlGet) | **GET** /1/videos/{channel}/players/{player}/embed/url | Integration url |



## call1videosChannelPlayersPlayerEmbedGet

> Model1VideosChannelPlayersPlayerEmbedGet200Response call1videosChannelPlayersPlayerEmbedGet(channel, player, with)

Integration code

Integrate the player into your site by cutting / pasting the HTML5 code below.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayersEmbedsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PlayersEmbedsApi apiInstance = new PlayersEmbedsApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer player = 56; // Integer | The unique identifier (ID) of the player to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelPlayersPlayerEmbedGet200Response result = apiInstance.call1videosChannelPlayersPlayerEmbedGet(channel, player, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersEmbedsApi#call1videosChannelPlayersPlayerEmbedGet");
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
| **channel** | **Integer**| The unique identifier (ID) of the channel to request. | |
| **player** | **Integer**| The unique identifier (ID) of the player to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelPlayersPlayerEmbedGet200Response**](Model1VideosChannelPlayersPlayerEmbedGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelPlayersPlayerEmbedUrlGet

> Model1VideosChannelPlayersPlayerEmbedUrlGet200Response call1videosChannelPlayersPlayerEmbedUrlGet(channel, player, with)

Integration url

Try to retrieve the parameters needed to construct an iframe for the player identified by the given player ID for the given channel, or for the last updated player of the channel, if any. If the channels hasn&#39;t any player and that no player ID is provided, it will return parameters for a default player.  If the channels doesn&#39;t exist or that the player isn&#39;t linked to the channel, or that the channel is badly configured, this will throw an error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayersEmbedsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PlayersEmbedsApi apiInstance = new PlayersEmbedsApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer player = 56; // Integer | The unique identifier (ID) of the player to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelPlayersPlayerEmbedUrlGet200Response result = apiInstance.call1videosChannelPlayersPlayerEmbedUrlGet(channel, player, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersEmbedsApi#call1videosChannelPlayersPlayerEmbedUrlGet");
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
| **channel** | **Integer**| The unique identifier (ID) of the channel to request. | |
| **player** | **Integer**| The unique identifier (ID) of the player to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelPlayersPlayerEmbedUrlGet200Response**](Model1VideosChannelPlayersPlayerEmbedUrlGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

