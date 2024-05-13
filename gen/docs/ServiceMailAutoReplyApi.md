# ServiceMailAutoReplyApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete**](ServiceMailAutoReplyApi.md#call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/auto_replies/{auto_reply_id} | Delete auto reply |
| [**call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet**](ServiceMailAutoReplyApi.md#call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet) | **GET** /1/mail_hostings/{mail_hosting_id}/auto_replies/{auto_reply_id} | Show a specific auto reply |
| [**call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch**](ServiceMailAutoReplyApi.md#call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/auto_replies/{auto_reply_id} | Update auto reply |
| [**call1mailHostingsMailHostingIdAutoRepliesGet**](ServiceMailAutoReplyApi.md#call1mailHostingsMailHostingIdAutoRepliesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/auto_replies | List auto replies |
| [**call1mailHostingsMailHostingIdAutoRepliesPost**](ServiceMailAutoReplyApi.md#call1mailHostingsMailHostingIdAutoRepliesPost) | **POST** /1/mail_hostings/{mail_hosting_id}/auto_replies | Create auto reply |



## call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete(mailHostingId, autoReplyId)

Delete auto reply

Delete auto reply

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailAutoReplyApi apiInstance = new ServiceMailAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        Integer autoReplyId = 56; // Integer | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete(mailHostingId, autoReplyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailAutoReplyApi#call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |
| **autoReplyId** | **Integer**|  | |

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
| **400** | Bad Request |  -  |


## call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet(mailHostingId, autoReplyId)

Show a specific auto reply

Show a specific auto reply model

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailAutoReplyApi apiInstance = new ServiceMailAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        Integer autoReplyId = 56; // Integer | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet(mailHostingId, autoReplyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailAutoReplyApi#call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet");
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
| **mailHostingId** | **Integer**|  | |
| **autoReplyId** | **Integer**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch(mailHostingId, autoReplyId, requestBody54)

Update auto reply

Update auto reply

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailAutoReplyApi apiInstance = new ServiceMailAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        Integer autoReplyId = 56; // Integer | ServiceMailAutoReply identifier
        RequestBody54 requestBody54 = new RequestBody54(); // RequestBody54 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch(mailHostingId, autoReplyId, requestBody54);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailAutoReplyApi#call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |
| **autoReplyId** | **Integer**| ServiceMailAutoReply identifier | |
| **requestBody54** | [**RequestBody54**](RequestBody54.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## call1mailHostingsMailHostingIdAutoRepliesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdAutoRepliesGet(mailHostingId)

List auto replies

Returns list of auto replies models for given service mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailAutoReplyApi apiInstance = new ServiceMailAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdAutoRepliesGet(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailAutoReplyApi#call1mailHostingsMailHostingIdAutoRepliesGet");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdAutoRepliesPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdAutoRepliesPost(mailHostingId, requestBody27)

Create auto reply

Create new auto reply for given service mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailAutoReplyApi apiInstance = new ServiceMailAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        RequestBody27 requestBody27 = new RequestBody27(); // RequestBody27 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdAutoRepliesPost(mailHostingId, requestBody27);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailAutoReplyApi#call1mailHostingsMailHostingIdAutoRepliesPost");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |
| **requestBody27** | [**RequestBody27**](RequestBody27.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Not Found |  -  |

