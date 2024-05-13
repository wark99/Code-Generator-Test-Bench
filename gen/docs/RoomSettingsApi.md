# RoomSettingsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1kmeetRoomsRoomIdSettingsGet**](RoomSettingsApi.md#call1kmeetRoomsRoomIdSettingsGet) | **GET** /1/kmeet/rooms/{room_id}/settings | Get room settings |



## call1kmeetRoomsRoomIdSettingsGet

> Model1KmeetRoomsPost200Response call1kmeetRoomsRoomIdSettingsGet(roomId)

Get room settings

This endpoint allows you to fetch room settings. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomSettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomSettingsApi apiInstance = new RoomSettingsApi(defaultClient);
        String roomId = "roomId_example"; // String | Unique identifier of the room settings
        try {
            Model1KmeetRoomsPost200Response result = apiInstance.call1kmeetRoomsRoomIdSettingsGet(roomId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSettingsApi#call1kmeetRoomsRoomIdSettingsGet");
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
| **roomId** | **String**| Unique identifier of the room settings | |

### Return type

[**Model1KmeetRoomsPost200Response**](Model1KmeetRoomsPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

