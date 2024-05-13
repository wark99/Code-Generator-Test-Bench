# ProductManagementApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsCsvGet**](ProductManagementApi.md#call1mailHostingsCsvGet) | **GET** /1/mail_hostings/csv | Export products as csv |
| [**call1mailHostingsGet**](ProductManagementApi.md#call1mailHostingsGet) | **GET** /1/mail_hostings | List products |
| [**call1mailHostingsInvitationsGet**](ProductManagementApi.md#call1mailHostingsInvitationsGet) | **GET** /1/mail_hostings/invitations | List workspace invitation |
| [**call1mailHostingsMailHostingIdGet**](ProductManagementApi.md#call1mailHostingsMailHostingIdGet) | **GET** /1/mail_hostings/{mail_hosting_id} | Display a product |
| [**call1swissBackupsGet**](ProductManagementApi.md#call1swissBackupsGet) | **GET** /1/swiss_backups | List all Swiss Backups |
| [**call1swissBackupsSwissBackupIdAcronisInformationsGet**](ProductManagementApi.md#call1swissBackupsSwissBackupIdAcronisInformationsGet) | **GET** /1/swiss_backups/{swiss_backup_id}/acronis_informations | Acronis information |
| [**call1swissBackupsSwissBackupIdGet**](ProductManagementApi.md#call1swissBackupsSwissBackupIdGet) | **GET** /1/swiss_backups/{swiss_backup_id} | Swiss Backup information |
| [**call1swissBackupsSwissBackupIdPut**](ProductManagementApi.md#call1swissBackupsSwissBackupIdPut) | **PUT** /1/swiss_backups/{swiss_backup_id} | Update a Swiss Backup |



## call1mailHostingsCsvGet

> Model1MailHostingsCsvGet200Response call1mailHostingsCsvGet(accountId)

Export products as csv

Returns a variety of information about one or more Hosting Mail as CSV.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer accountId = 56; // Integer | Account identifier
        try {
            Model1MailHostingsCsvGet200Response result = apiInstance.call1mailHostingsCsvGet(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1mailHostingsCsvGet");
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
| **accountId** | **Integer**| Account identifier | |

### Return type

[**Model1MailHostingsCsvGet200Response**](Model1MailHostingsCsvGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |


## call1mailHostingsGet

> Model1MailHostingsGet200Response call1mailHostingsGet(accountId, search, with, _return, limit, skip, page, perPage, orderBy, order, orderFor)

List products

Returns a variety of information about one or more Hosting Mail from an Account identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer accountId = 56; // Integer | Unique identifier of the Account to request.
        String search = "search_example"; // String | Search filter.
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
            Model1MailHostingsGet200Response result = apiInstance.call1mailHostingsGet(accountId, search, with, _return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1mailHostingsGet");
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
| **accountId** | **Integer**| Unique identifier of the Account to request. | |
| **search** | **String**| Search filter. | [optional] |
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

[**Model1MailHostingsGet200Response**](Model1MailHostingsGet200Response.md)

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


## call1mailHostingsInvitationsGet

> Model1MailHostingsInvitationsGet200Response call1mailHostingsInvitationsGet(accountId)

List workspace invitation

Returns a variety of information about one or more Workspace invitation from an Account identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer accountId = 56; // Integer | Account identifier
        try {
            Model1MailHostingsInvitationsGet200Response result = apiInstance.call1mailHostingsInvitationsGet(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1mailHostingsInvitationsGet");
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
| **accountId** | **Integer**| Account identifier | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Entity |  -  |


## call1mailHostingsMailHostingIdGet

> Model1MailHostingsMailHostingIdGet200Response call1mailHostingsMailHostingIdGet(mailHostingId, with)

Display a product

Get informations for a given hosting mail.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer mailHostingId = 56; // Integer | Unique identifier of the Hosting Mail to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1MailHostingsMailHostingIdGet200Response result = apiInstance.call1mailHostingsMailHostingIdGet(mailHostingId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1mailHostingsMailHostingIdGet");
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
| **mailHostingId** | **Integer**| Unique identifier of the Hosting Mail to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdGet200Response**](Model1MailHostingsMailHostingIdGet200Response.md)

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


## call1swissBackupsGet

> Model1SwissBackupsGet200Response call1swissBackupsGet(accountId, _return, limit, skip, page, perPage, orderBy, order, orderFor)

List all Swiss Backups

List all Swiss Backup products for the given account

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer accountId = 56; // Integer | The account identifier
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer limit = 10; // Integer | *Optional parameter* that define the number of items to return<br /> Part of the `offset` capacity 
        Integer skip = 2; // Integer | *Optional parameter* that define the index of the first item to return (0 = first item)<br /> Part of the `offset` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1SwissBackupsGet200Response result = apiInstance.call1swissBackupsGet(accountId, _return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1swissBackupsGet");
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
| **accountId** | **Integer**| The account identifier | |
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **limit** | **Integer**| *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **skip** | **Integer**| *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1SwissBackupsGet200Response**](Model1SwissBackupsGet200Response.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## call1swissBackupsSwissBackupIdAcronisInformationsGet

> Model1SwissBackupsSwissBackupIdAcronisInformationsGet200Response call1swissBackupsSwissBackupIdAcronisInformationsGet(swissBackupId)

Acronis information

Get Acronis information, from the Acronis API, for the given Swiss Backup product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        try {
            Model1SwissBackupsSwissBackupIdAcronisInformationsGet200Response result = apiInstance.call1swissBackupsSwissBackupIdAcronisInformationsGet(swissBackupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1swissBackupsSwissBackupIdAcronisInformationsGet");
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
| **swissBackupId** | **Integer**| Unique identifier of the Swiss Backup to request. | |

### Return type

[**Model1SwissBackupsSwissBackupIdAcronisInformationsGet200Response**](Model1SwissBackupsSwissBackupIdAcronisInformationsGet200Response.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## call1swissBackupsSwissBackupIdGet

> Model1SwissBackupsSwissBackupIdGet200Response call1swissBackupsSwissBackupIdGet(swissBackupId)

Swiss Backup information

Get details for the given Swiss Backup product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        try {
            Model1SwissBackupsSwissBackupIdGet200Response result = apiInstance.call1swissBackupsSwissBackupIdGet(swissBackupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1swissBackupsSwissBackupIdGet");
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
| **swissBackupId** | **Integer**| Unique identifier of the Swiss Backup to request. | |

### Return type

[**Model1SwissBackupsSwissBackupIdGet200Response**](Model1SwissBackupsSwissBackupIdGet200Response.md)

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


## call1swissBackupsSwissBackupIdPut

> Model1SwissBackupsSwissBackupIdGet200Response call1swissBackupsSwissBackupIdPut(swissBackupId, accountId, requestBody2)

Update a Swiss Backup

Update the given Swiss Backup product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductManagementApi apiInstance = new ProductManagementApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer accountId = 56; // Integer | Unique identifier of the `account`
        RequestBody2 requestBody2 = new RequestBody2(); // RequestBody2 | 
        try {
            Model1SwissBackupsSwissBackupIdGet200Response result = apiInstance.call1swissBackupsSwissBackupIdPut(swissBackupId, accountId, requestBody2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductManagementApi#call1swissBackupsSwissBackupIdPut");
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
| **swissBackupId** | **Integer**| Unique identifier of the Swiss Backup to request. | |
| **accountId** | **Integer**| Unique identifier of the &#x60;account&#x60; | |
| **requestBody2** | [**RequestBody2**](RequestBody2.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdGet200Response**](Model1SwissBackupsSwissBackupIdGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

