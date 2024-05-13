# PlayersPicturesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelPlayersPlayerThumbnailThumbnailGet**](PlayersPicturesApi.md#call1videosChannelPlayersPlayerThumbnailThumbnailGet) | **GET** /1/videos/{channel}/players/{player}/thumbnail/{thumbnail} | Show picture |



## call1videosChannelPlayersPlayerThumbnailThumbnailGet

> Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1videosChannelPlayersPlayerThumbnailThumbnailGet(channel, player, thumbnail, with)

Show picture

This endpoint allows you to retrieve a Vignette for the player.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayersPicturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PlayersPicturesApi apiInstance = new PlayersPicturesApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer player = 56; // Integer | The unique identifier (ID) of the player to request.
        String thumbnail = "thumbnail_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1RadiosRadioProductIdPlayersPlayerIdGet200Response result = apiInstance.call1videosChannelPlayersPlayerThumbnailThumbnailGet(channel, player, thumbnail, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersPicturesApi#call1videosChannelPlayersPlayerThumbnailThumbnailGet");
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
| **thumbnail** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1RadiosRadioProductIdPlayersPlayerIdGet200Response**](Model1RadiosRadioProductIdPlayersPlayerIdGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

