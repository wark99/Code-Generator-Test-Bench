# MailboxesActionsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesActionsApplySignaturePost**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsApplySignaturePost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/apply_signature | Apply a service mail signature model to given mailboxes |
| [**call1mailHostingsMailHostingIdMailboxesActionsBatchBatchIdGet**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsBatchBatchIdGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/batch/{batchId} |  |
| [**call1mailHostingsMailHostingIdMailboxesActionsDeleteMailboxesDelete**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsDeleteMailboxesDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/delete_mailboxes | Delete mailbox of a service mail |
| [**call1mailHostingsMailHostingIdMailboxesActionsDeleteRedirectsPost**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsDeleteRedirectsPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/delete_redirects | Delete all redirections for given mailboxes |
| [**call1mailHostingsMailHostingIdMailboxesActionsSetPermissionsPost**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsSetPermissionsPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/set_permissions | Set global permissions to mailbox |
| [**call1mailHostingsMailHostingIdMailboxesActionsToggleAutoReplyPost**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsToggleAutoReplyPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/toggle_auto_reply | Set global permissions to mailbox |
| [**call1mailHostingsMailHostingIdMailboxesActionsTogglePromotionFilterPost**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsTogglePromotionFilterPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/toggle_promotion_filter | Toggle promotions filter |
| [**call1mailHostingsMailHostingIdMailboxesActionsToggleSpamFilterPost**](MailboxesActionsApi.md#call1mailHostingsMailHostingIdMailboxesActionsToggleSpamFilterPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/actions/toggle_spam_filter | Toggle spam filter |



## call1mailHostingsMailHostingIdMailboxesActionsApplySignaturePost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsApplySignaturePost(mailHostingId, requestBody32)

Apply a service mail signature model to given mailboxes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        RequestBody32 requestBody32 = new RequestBody32(); // RequestBody32 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsApplySignaturePost(mailHostingId, requestBody32);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsApplySignaturePost");
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
| **requestBody32** | [**RequestBody32**](RequestBody32.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesActionsBatchBatchIdGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsBatchBatchIdGet(mailHostingId, batchId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        String batchId = "batchId_example"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsBatchBatchIdGet(mailHostingId, batchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsBatchBatchIdGet");
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
| **batchId** | **String**|  | [optional] |

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## call1mailHostingsMailHostingIdMailboxesActionsDeleteMailboxesDelete

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsDeleteMailboxesDelete(mailHostingId, requestBody62)

Delete mailbox of a service mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        RequestBody62 requestBody62 = new RequestBody62(); // RequestBody62 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsDeleteMailboxesDelete(mailHostingId, requestBody62);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsDeleteMailboxesDelete");
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
| **requestBody62** | [**RequestBody62**](RequestBody62.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesActionsDeleteRedirectsPost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsDeleteRedirectsPost(mailHostingId, requestBody31)

Delete all redirections for given mailboxes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        RequestBody31 requestBody31 = new RequestBody31(); // RequestBody31 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsDeleteRedirectsPost(mailHostingId, requestBody31);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsDeleteRedirectsPost");
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
| **requestBody31** | [**RequestBody31**](RequestBody31.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesActionsSetPermissionsPost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsSetPermissionsPost(mailHostingId)

Set global permissions to mailbox

Set global permissions to mailbox

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsSetPermissionsPost(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsSetPermissionsPost");
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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## call1mailHostingsMailHostingIdMailboxesActionsToggleAutoReplyPost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsToggleAutoReplyPost(mailHostingId, requestBody30)

Set global permissions to mailbox

Toggle auto reply on / off on given mailboxes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        RequestBody30 requestBody30 = new RequestBody30(); // RequestBody30 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsToggleAutoReplyPost(mailHostingId, requestBody30);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsToggleAutoReplyPost");
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
| **requestBody30** | [**RequestBody30**](RequestBody30.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesActionsTogglePromotionFilterPost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsTogglePromotionFilterPost(mailHostingId, requestBody29)

Toggle promotions filter

Toggle promotions filter on given mailboxes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        RequestBody29 requestBody29 = new RequestBody29(); // RequestBody29 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsTogglePromotionFilterPost(mailHostingId, requestBody29);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsTogglePromotionFilterPost");
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
| **requestBody29** | [**RequestBody29**](RequestBody29.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesActionsToggleSpamFilterPost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesActionsToggleSpamFilterPost(mailHostingId, requestBody29)

Toggle spam filter

Toggle spam filter on given mailboxes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesActionsApi apiInstance = new MailboxesActionsApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        RequestBody29 requestBody29 = new RequestBody29(); // RequestBody29 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesActionsToggleSpamFilterPost(mailHostingId, requestBody29);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesActionsApi#call1mailHostingsMailHostingIdMailboxesActionsToggleSpamFilterPost");
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
| **requestBody29** | [**RequestBody29**](RequestBody29.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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

