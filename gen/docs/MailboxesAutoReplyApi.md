# MailboxesAutoReplyApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyDelete**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply | Delete an auto reply |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply | Display an auto reply |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelGet**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply/model | List auto replies models |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdDelete**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply/model/{model_id} | Update auto reply model |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply/model/{model_id} | Show auto reply model |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdPatch**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply/model/{model_id} | Update auto reply model |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelPost**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply/model | Add auto reply model |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyPatch**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply | Update an auto reply |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyResetPut**](MailboxesAutoReplyApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyResetPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auto_reply/reset | Reset an auto reply |



## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyDelete(mailHostingId, mailboxName)

Delete an auto reply

Deletes a given mailbox&#39;s auto reply.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyDelete(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyDelete");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet(mailHostingId, mailboxName)

Display an auto reply

Retrieves information about a given mailbox&#39;s auto reply configuration.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyGet200Response.md)

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
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelGet(mailHostingId, mailboxName)

List auto replies models

Get auto replies models available for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelGet");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdDelete(mailHostingId, mailboxName, modelId)

Update auto reply model

Delete an auto replies model for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String modelId = "modelId_example"; // String | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdDelete(mailHostingId, mailboxName, modelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdDelete");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |
| **modelId** | **String**|  | [optional] |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet(mailHostingId, mailboxName, modelId, with)

Show auto reply model

Show an auto replies model for a given mailbox

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String modelId = "modelId_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet(mailHostingId, mailboxName, modelId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |
| **modelId** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdPatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdPatch(mailHostingId, mailboxName, modelId)

Update auto reply model

Update an auto replies model for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String modelId = "modelId_example"; // String | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdPatch(mailHostingId, mailboxName, modelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelModelIdPatch");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |
| **modelId** | **String**|  | [optional] |

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelPost

> Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelPost(mailHostingId, mailboxName)

Add auto reply model

Create an auto replies model for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelPost(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyModelPost");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyPatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyPatch(mailHostingId, mailboxName, requestBody57)

Update an auto reply

Updates the auto reply configuration of a given mailbox

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody57 requestBody57 = new RequestBody57(); // RequestBody57 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyPatch(mailHostingId, mailboxName, requestBody57);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyPatch");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |
| **requestBody57** | [**RequestBody57**](RequestBody57.md)| Request body of the called URI | |

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
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyResetPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyResetPut(mailHostingId, mailboxName)

Reset an auto reply

Resets the count of automatic replies that were sent per sender.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAutoReplyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAutoReplyApi apiInstance = new MailboxesAutoReplyApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyResetPut(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAutoReplyApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAutoReplyResetPut");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **mailboxName** | **String**| The username (that is the part before the @) of the email address you want to request. | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

