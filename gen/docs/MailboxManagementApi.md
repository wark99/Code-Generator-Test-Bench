# MailboxManagementApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdInvitationsGet**](MailboxManagementApi.md#call1mailHostingsMailHostingIdInvitationsGet) | **GET** /1/mail_hostings/{mail_hosting_id}/invitations | List user invitations |
| [**call1mailHostingsMailHostingIdMailboxesGet**](MailboxManagementApi.md#call1mailHostingsMailHostingIdMailboxesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes | List mailboxes |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameDelete**](MailboxManagementApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name} | Delete a mailbox |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNameGet**](MailboxManagementApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNameGet) | **GET** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name} | Display a mailbox |
| [**call1mailHostingsMailHostingIdMailboxesMailboxNamePatch**](MailboxManagementApi.md#call1mailHostingsMailHostingIdMailboxesMailboxNamePatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name} | Update a mailbox |
| [**call1mailHostingsMailHostingIdMailboxesPost**](MailboxManagementApi.md#call1mailHostingsMailHostingIdMailboxesPost) | **POST** /1/mail_hostings/{mail_hosting_id}/mailboxes | Add a mailbox |
| [**call1mailHostingsMailHostingIdUsersGet**](MailboxManagementApi.md#call1mailHostingsMailHostingIdUsersGet) | **GET** /1/mail_hostings/{mail_hosting_id}/users | List users |



## call1mailHostingsMailHostingIdInvitationsGet

> Model1MailHostingsInvitationsGet200Response call1mailHostingsMailHostingIdInvitationsGet(mailHostingId, with)

List user invitations

Returns a variety of information about one or more user invitations for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsInvitationsGet200Response result = apiInstance.call1mailHostingsMailHostingIdInvitationsGet(mailHostingId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdInvitationsGet");
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
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1MailHostingsInvitationsGet200Response**](Model1MailHostingsInvitationsGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesGet

> Model1MailHostingsMailHostingIdMailboxesGet200Response call1mailHostingsMailHostingIdMailboxesGet(mailHostingId, search, filterBy, with, _return, limit, skip, page, perPage, orderBy, order, orderFor)

List mailboxes

This endpoint allows you to retrieve all the mailboxes for a given mail hosting.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String search = "search_example"; // String | 
        String filterBy = "filterBy_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer limit = 10; // Integer | *Optional parameter* that define the number of items to return<br /> Part of the `offset` capacity 
        Integer skip = 2; // Integer | *Optional parameter* that define the index of the first item to return (0 = first item)<br /> Part of the `offset` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1MailHostingsMailHostingIdMailboxesGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesGet(mailHostingId, search, filterBy, with, _return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdMailboxesGet");
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
| **search** | **String**|  | [optional] |
| **filterBy** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **limit** | **Integer**| *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **skip** | **Integer**| *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesGet200Response**](Model1MailHostingsMailHostingIdMailboxesGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesMailboxNameDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameDelete(mailHostingId, mailboxName)

Delete a mailbox

Deletes a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameDelete(mailHostingId, mailboxName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdMailboxesMailboxNameDelete");
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


## call1mailHostingsMailHostingIdMailboxesMailboxNameGet

> Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameGet(mailHostingId, mailboxName, with)

Display a mailbox

Returns a variety of information about a single a Mailbox specified by the requested unique identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNameGet(mailHostingId, mailboxName, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdMailboxesMailboxNameGet");
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

[**Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response**](Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response.md)

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


## call1mailHostingsMailHostingIdMailboxesMailboxNamePatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNamePatch(mailHostingId, mailboxName, requestBody55)

Update a mailbox

Updates a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        String mailboxName = "mailboxName_example"; // String | The username (that is the part before the @) of the email address you want to request.
        RequestBody55 requestBody55 = new RequestBody55(); // RequestBody55 | Request body of the called URI
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesMailboxNamePatch(mailHostingId, mailboxName, requestBody55);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdMailboxesMailboxNamePatch");
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
| **requestBody55** | [**RequestBody55**](RequestBody55.md)| Request body of the called URI | |

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


## call1mailHostingsMailHostingIdMailboxesPost

> Model1MailHostingsMailHostingIdMailboxesPost201Response call1mailHostingsMailHostingIdMailboxesPost(mailHostingId, requestBody28, with)

Add a mailbox

Creates a new mailbox in the mail hosting.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        RequestBody28 requestBody28 = new RequestBody28(); // RequestBody28 | Request body of the called URI
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsMailHostingIdMailboxesPost201Response result = apiInstance.call1mailHostingsMailHostingIdMailboxesPost(mailHostingId, requestBody28, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdMailboxesPost");
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
| **requestBody28** | [**RequestBody28**](RequestBody28.md)| Request body of the called URI | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdMailboxesPost201Response**](Model1MailHostingsMailHostingIdMailboxesPost201Response.md)

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


## call1mailHostingsMailHostingIdUsersGet

> Model1MailHostingsMailHostingIdUsersGet201Response call1mailHostingsMailHostingIdUsersGet(mailHostingId)

List users

Returns a variety of information about one or more users for a given mailbox.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MailboxManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MailboxManagementApi apiInstance = new MailboxManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        try {
            Model1MailHostingsMailHostingIdUsersGet201Response result = apiInstance.call1mailHostingsMailHostingIdUsersGet(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MailboxManagementApi#call1mailHostingsMailHostingIdUsersGet");
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

### Return type

[**Model1MailHostingsMailHostingIdUsersGet201Response**](Model1MailHostingsMailHostingIdUsersGet201Response.md)

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

