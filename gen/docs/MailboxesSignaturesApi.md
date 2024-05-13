# MailboxesSignaturesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures | List signatures |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/models | List signatures |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures | Add a signature |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id}/default | Set a signature as default |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id} | Delete a signature |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id} | Display a signature |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id} | Update a signature |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost**](MailboxesSignaturesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/upload | Upload an image |



## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet(mailHostingId, mailboxName, with)

List signatures

Get a list of selected Mailbox Signatures.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet(mailHostingId, mailboxName, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet");
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
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet(mailHostingId, mailboxName)

List signatures

Returns list of signature models for given service mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        String mailboxName = "mailboxName_example"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet");
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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost(mailHostingId, mailboxName, requestBody46)

Add a signature

Create a new signature for the given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody46 requestBody46 = new RequestBody46(); // RequestBody46 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost(mailHostingId, mailboxName, requestBody46);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost");
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
| **requestBody46** | [**RequestBody46**](RequestBody46.md)| Request body of the called URI | |

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
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut(mailHostingId, mailboxName, signatureId)

Set a signature as default

Sets the given signature as the default one.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        Integer signatureId = 56; // Integer | The unique identifier (ID) of the signature to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut(mailHostingId, mailboxName, signatureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut");
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
| **signatureId** | **Integer**| The unique identifier (ID) of the signature to request. | |

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete(mailHostingId, mailboxName, signatureId)

Delete a signature

Deletes the given mailbox signature.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        Integer signatureId = 56; // Integer | The unique identifier (ID) of the signature to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete(mailHostingId, mailboxName, signatureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete");
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
| **signatureId** | **Integer**| The unique identifier (ID) of the signature to request. | |

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet(mailHostingId, mailboxName, signatureId, with)

Display a signature

Retrieves information about a given signature

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        Integer signatureId = 56; // Integer | The unique identifier (ID) of the signature to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet(mailHostingId, mailboxName, signatureId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet");
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
| **signatureId** | **Integer**| The unique identifier (ID) of the signature to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Signature does not exist |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch(mailHostingId, mailboxName, signatureId, requestBody56)

Update a signature

Updates a given mailbox signature.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        Integer signatureId = 56; // Integer | The unique identifier (ID) of the signature to request.
        RequestBody56 requestBody56 = new RequestBody56(); // RequestBody56 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch(mailHostingId, mailboxName, signatureId, requestBody56);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch");
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
| **signatureId** | **Integer**| The unique identifier (ID) of the signature to request. | |
| **requestBody56** | [**RequestBody56**](RequestBody56.md)| Request body of the called URI | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost

> Model1MailHostingsMailHostingIdSignaturesUploadPost201Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost(mailHostingId, mailboxName, requestBody45)

Upload an image

Upload an image.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesSignaturesApi apiInstance = new MailboxesSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody45 requestBody45 = new RequestBody45(); // RequestBody45 | Request body of the called URI
        try {
            Model1MailHostingsMailHostingIdSignaturesUploadPost201Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost(mailHostingId, mailboxName, requestBody45);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesSignaturesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost");
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
| **requestBody45** | [**RequestBody45**](RequestBody45.md)| Request body of the called URI | |

### Return type

[**Model1MailHostingsMailHostingIdSignaturesUploadPost201Response**](Model1MailHostingsMailHostingIdSignaturesUploadPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

