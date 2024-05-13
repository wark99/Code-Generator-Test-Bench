# MailboxesFoldersApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet**](MailboxesFoldersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/folders | List folders |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersPut**](MailboxesFoldersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/folders | Update folders |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersSpamDelete**](MailboxesFoldersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersSpamDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/folders/spam | Purge spam folder |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersTrashDelete**](MailboxesFoldersApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersTrashDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/folders/trash | Empty trash folder |



## call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet(mailHostingId, mailboxName)

List folders

Retrieves the folders of a given mailbox linked to the current user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesFoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesFoldersApi apiInstance = new MailboxesFoldersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesFoldersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet");
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

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid mailbox password |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersPut(mailHostingId, mailboxName, requestBody44)

Update folders

Updates the folder mapping configuration for the draft, trash, sent an spam folders of a given mailbox linked to the current user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesFoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesFoldersApi apiInstance = new MailboxesFoldersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody44 requestBody44 = new RequestBody44(); // RequestBody44 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersPut(mailHostingId, mailboxName, requestBody44);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesFoldersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersPut");
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
| **requestBody44** | [**RequestBody44**](RequestBody44.md)| Request body of the called URI | |

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
| **400** | Invalid mailbox folders |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersSpamDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersSpamDelete(mailHostingId, mailboxName)

Purge spam folder

Deletes all mails currently in the spam folder of the given mailbox linked to the current user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesFoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesFoldersApi apiInstance = new MailboxesFoldersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersSpamDelete(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesFoldersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersSpamDelete");
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
| **400** | Invalid mailbox password |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersTrashDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersTrashDelete(mailHostingId, mailboxName)

Empty trash folder

Deletes all mails currently in the trash folder of the given mailbox linked to the current user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesFoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesFoldersApi apiInstance = new MailboxesFoldersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersTrashDelete(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesFoldersApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFoldersTrashDelete");
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
| **400** | Invalid mailbox password |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

