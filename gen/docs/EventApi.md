# EventApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelEventsGet**](EventApi.md#call1videosChannelEventsGet) | **GET** /1/videos/{channel}/events | List all events |
| [**call1videosChannelEventsPost**](EventApi.md#call1videosChannelEventsPost) | **POST** /1/videos/{channel}/events | Create an event |
| [**call1videosChannelEventsRepeatablePlannedEventDelete**](EventApi.md#call1videosChannelEventsRepeatablePlannedEventDelete) | **DELETE** /1/videos/{channel}/events/{repeatable_planned_event} | Delete an event |
| [**call1videosChannelEventsRepeatablePlannedEventGet**](EventApi.md#call1videosChannelEventsRepeatablePlannedEventGet) | **GET** /1/videos/{channel}/events/{repeatable_planned_event} | Return an event |
| [**call1videosChannelEventsRepeatablePlannedEventPut**](EventApi.md#call1videosChannelEventsRepeatablePlannedEventPut) | **PUT** /1/videos/{channel}/events/{repeatable_planned_event} | Update an event |



## call1videosChannelEventsGet

> Model1VideosChannelEventsGet200Response call1videosChannelEventsGet(channel, with, _return, page, perPage, orderBy, order, orderFor)

List all events

This endpoint allows you to retrieve all Event.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1VideosChannelEventsGet200Response result = apiInstance.call1videosChannelEventsGet(channel, with, _return, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#call1videosChannelEventsGet");
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
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1VideosChannelEventsGet200Response**](Model1VideosChannelEventsGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelEventsPost

> Model1VideosChannelEventsPost201Response call1videosChannelEventsPost(channel, accountId, with, requestBody66)

Create an event

This endpoint allows you to create an Event.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody66 requestBody66 = new RequestBody66(); // RequestBody66 | 
        try {
            Model1VideosChannelEventsPost201Response result = apiInstance.call1videosChannelEventsPost(channel, accountId, with, requestBody66);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#call1videosChannelEventsPost");
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
| **accountId** | **Integer**| The account identifier | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |
| **requestBody66** | [**RequestBody66**](RequestBody66.md)|  | [optional] |

### Return type

[**Model1VideosChannelEventsPost201Response**](Model1VideosChannelEventsPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## call1videosChannelEventsRepeatablePlannedEventDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelEventsRepeatablePlannedEventDelete(channel, repeatablePlannedEvent, with)

Delete an event

This endpoint allows you to delete an Event.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer repeatablePlannedEvent = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1videosChannelEventsRepeatablePlannedEventDelete(channel, repeatablePlannedEvent, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#call1videosChannelEventsRepeatablePlannedEventDelete");
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
| **repeatablePlannedEvent** | **Integer**| The unique identifier (ID) of the channel to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelEventsRepeatablePlannedEventGet

> Model1VideosChannelEventsPost201Response call1videosChannelEventsRepeatablePlannedEventGet(channel, repeatablePlannedEvent, with)

Return an event

This endpoint allows you to retrieve an Event.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer repeatablePlannedEvent = 56; // Integer | The unique identifier (ID) of the event to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelEventsPost201Response result = apiInstance.call1videosChannelEventsRepeatablePlannedEventGet(channel, repeatablePlannedEvent, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#call1videosChannelEventsRepeatablePlannedEventGet");
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
| **repeatablePlannedEvent** | **Integer**| The unique identifier (ID) of the event to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelEventsPost201Response**](Model1VideosChannelEventsPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelEventsRepeatablePlannedEventPut

> Model1VideosChannelEventsPost201Response call1videosChannelEventsRepeatablePlannedEventPut(channel, repeatablePlannedEvent, with)

Update an event

This endpoint allows you to update an Event.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer repeatablePlannedEvent = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelEventsPost201Response result = apiInstance.call1videosChannelEventsRepeatablePlannedEventPut(channel, repeatablePlannedEvent, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#call1videosChannelEventsRepeatablePlannedEventPut");
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
| **repeatablePlannedEvent** | **Integer**| The unique identifier (ID) of the channel to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelEventsPost201Response**](Model1VideosChannelEventsPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

