# MailboxesAliasesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete**](MailboxesAliasesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/aliases/{alias} | Delete an alias |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesGet**](MailboxesAliasesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/aliases | List aliases |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPost**](MailboxesAliasesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/aliases | Add an alias |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPut**](MailboxesAliasesApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/aliases | Update aliases |



## call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete(mailHostingId, mailboxName, alias)

Delete an alias

Removes an alias from a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAliasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAliasesApi apiInstance = new MailboxesAliasesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String alias = "alias_example"; // String | Alias to remove.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete(mailHostingId, mailboxName, alias);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAliasesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete");
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
| **alias** | **String**| Alias to remove. | |

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameAliasesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesGet(mailHostingId, mailboxName)

List aliases

This endpoint allows you to retrieve all the aliases for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAliasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAliasesApi apiInstance = new MailboxesAliasesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameAliasesGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAliasesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesGet");
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

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameAliasesGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameAliasesGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPost(mailHostingId, mailboxName, requestBody50)

Add an alias

Creates an alias on the given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAliasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAliasesApi apiInstance = new MailboxesAliasesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody50 requestBody50 = new RequestBody50(); // RequestBody50 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPost(mailHostingId, mailboxName, requestBody50);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAliasesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPost");
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
| **requestBody50** | [**RequestBody50**](RequestBody50.md)| Request body of the called URI | |

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPut(mailHostingId, mailboxName, requestBody49)

Update aliases

Updates the list of aliases for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesAliasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesAliasesApi apiInstance = new MailboxesAliasesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody49 requestBody49 = new RequestBody49(); // RequestBody49 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPut(mailHostingId, mailboxName, requestBody49);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesAliasesApi#call1mailHostingsMailHostingIdMailboxesMailboxNameAliasesPut");
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
| **requestBody49** | [**RequestBody49**](RequestBody49.md)| Request body of the called URI | |

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

