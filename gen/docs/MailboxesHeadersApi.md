# MailboxesHeadersApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost**](MailboxesHeadersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/check_verified | Check if email is already validated |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet**](MailboxesHeadersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses | List headers |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut**](MailboxesHeadersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/send_validation_link | Send validation email with link |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut**](MailboxesHeadersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/send_validation | Send validation email with code |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut**](MailboxesHeadersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/validate | Validate a sender |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete**](MailboxesHeadersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/{verified_email_id} | Delete a sender |



## call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost(mailHostingId, mailboxName)

Check if email is already validated

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesHeadersApi apiInstance = new MailboxesHeadersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        String mailboxName = "mailboxName_example"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesHeadersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost");
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
| **mailboxName** | **String**|  | |

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
| **400** | Email not validated |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet(mailHostingId, mailboxName)

List headers

Returns a variety of information about one or more headers of a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesHeadersApi apiInstance = new MailboxesHeadersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesHeadersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet");
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

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut

> Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut(mailHostingId, mailboxName, requestBody60)

Send validation email with link

Send validation email with link when adding a new sender/reply address.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesHeadersApi apiInstance = new MailboxesHeadersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody60 requestBody60 = new RequestBody60(); // RequestBody60 | Request body of the called URI
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut(mailHostingId, mailboxName, requestBody60);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesHeadersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut");
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
| **requestBody60** | [**RequestBody60**](RequestBody60.md)| Request body of the called URI | |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Sender reply address already validated |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut(mailHostingId, mailboxName, requestBody60)

Send validation email with code

Send validation email with code when adding a new sender/reply address.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesHeadersApi apiInstance = new MailboxesHeadersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody60 requestBody60 = new RequestBody60(); // RequestBody60 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut(mailHostingId, mailboxName, requestBody60);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesHeadersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut");
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
| **requestBody60** | [**RequestBody60**](RequestBody60.md)| Request body of the called URI | |

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
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut(mailHostingId, mailboxName, requestBody61)

Validate a sender

Validate a new sender/reply address.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesHeadersApi apiInstance = new MailboxesHeadersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody61 requestBody61 = new RequestBody61(); // RequestBody61 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut(mailHostingId, mailboxName, requestBody61);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesHeadersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut");
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
| **requestBody61** | [**RequestBody61**](RequestBody61.md)| Request body of the called URI | |

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
| **422** | Unprocessable Entity |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete(mailHostingId, mailboxName, verifiedEmailId)

Delete a sender

Delete a sender/reply address.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesHeadersApi apiInstance = new MailboxesHeadersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        Integer verifiedEmailId = 56; // Integer | sender/reply address to remove (verified_email identifier)
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete(mailHostingId, mailboxName, verifiedEmailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesHeadersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete");
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
| **verifiedEmailId** | **Integer**| sender/reply address to remove (verified_email identifier) | |

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

