# MailboxesForwardingApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete**](MailboxesForwardingApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses | Delete all forwardings |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet**](MailboxesForwardingApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses | List forwarding |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch**](MailboxesForwardingApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses | Update a forwarding |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost**](MailboxesForwardingApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses | Add a forwarding |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete**](MailboxesForwardingApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses/{redirect_addresses} | Delete a forwarding |



## call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete(mailHostingId, mailboxName)

Delete all forwardings

Deletes all configured forwarding addresses of the given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesForwardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesForwardingApi apiInstance = new MailboxesForwardingApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesForwardingApi#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete");
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


## call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet(mailHostingId, mailboxName)

List forwarding

Retrieves information about the forwarding configuration of a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesForwardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesForwardingApi apiInstance = new MailboxesForwardingApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesForwardingApi#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet");
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

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch(mailHostingId, mailboxName, requestBody48)

Update a forwarding

Update a given mailbox forwarding.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesForwardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesForwardingApi apiInstance = new MailboxesForwardingApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody48 requestBody48 = new RequestBody48(); // RequestBody48 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch(mailHostingId, mailboxName, requestBody48);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesForwardingApi#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch");
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
| **requestBody48** | [**RequestBody48**](RequestBody48.md)| Request body of the called URI | |

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost

> Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost(mailHostingId, mailboxName, requestBody47)

Add a forwarding

Adds a new forwarding address to the given mailbox

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesForwardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesForwardingApi apiInstance = new MailboxesForwardingApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody47 requestBody47 = new RequestBody47(); // RequestBody47 | Request body of the called URI
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost(mailHostingId, mailboxName, requestBody47);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesForwardingApi#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost");
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
| **requestBody47** | [**RequestBody47**](RequestBody47.md)| Request body of the called URI | |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Too much redirections |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete(mailHostingId, mailboxName, redirectAddresses)

Delete a forwarding

Deletes the given forwarding address from the given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxesForwardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxesForwardingApi apiInstance = new MailboxesForwardingApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String redirectAddresses = "redirectAddresses_example"; // String | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete(mailHostingId, mailboxName, redirectAddresses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxesForwardingApi#call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete");
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
| **redirectAddresses** | **String**|  | [optional] |

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

