# EmailsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call2profileEmailsEmailTypeEmailIdDelete**](EmailsApi.md#call2profileEmailsEmailTypeEmailIdDelete) | **DELETE** /2/profile/emails/{email_type}/{email_id} | Delete an email |
| [**call2profileEmailsEmailTypeEmailIdGet**](EmailsApi.md#call2profileEmailsEmailTypeEmailIdGet) | **GET** /2/profile/emails/{email_type}/{email_id} | Display an email |
| [**call2profileEmailsGet**](EmailsApi.md#call2profileEmailsGet) | **GET** /2/profile/emails | List emails |



## call2profileEmailsEmailTypeEmailIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call2profileEmailsEmailTypeEmailIdDelete(emailType, emailId)

Delete an email

Delete an email address of the current user&#39;s profile.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailsApi apiInstance = new EmailsApi(defaultClient);
        String emailType = "emailType_example"; // String | The email type (email|email_request) to request.
        Integer emailId = 56; // Integer | The unique identifier (ID) of the email to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call2profileEmailsEmailTypeEmailIdDelete(emailType, emailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailsApi#call2profileEmailsEmailTypeEmailIdDelete");
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
| **emailType** | **String**| The email type (email|email_request) to request. | |
| **emailId** | **Integer**| The unique identifier (ID) of the email to request. | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call2profileEmailsEmailTypeEmailIdGet

> Model2ProfileEmailsEmailTypeEmailIdGet200Response call2profileEmailsEmailTypeEmailIdGet(emailType, emailId)

Display an email

Get details of a specific email address of the current user&#39;s profile.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailsApi apiInstance = new EmailsApi(defaultClient);
        String emailType = "emailType_example"; // String | The email type (email|email_request) to request.
        Integer emailId = 56; // Integer | The unique identifier (ID) of the email to request.
        try {
            Model2ProfileEmailsEmailTypeEmailIdGet200Response result = apiInstance.call2profileEmailsEmailTypeEmailIdGet(emailType, emailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailsApi#call2profileEmailsEmailTypeEmailIdGet");
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
| **emailType** | **String**| The email type (email|email_request) to request. | |
| **emailId** | **Integer**| The unique identifier (ID) of the email to request. | |

### Return type

[**Model2ProfileEmailsEmailTypeEmailIdGet200Response**](Model2ProfileEmailsEmailTypeEmailIdGet200Response.md)

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


## call2profileEmailsGet

> Model2ProfileEmailsGet200Response call2profileEmailsGet()

List emails

Retrieve list of all email addresses of the current user&#39;s profile.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailsApi apiInstance = new EmailsApi(defaultClient);
        try {
            Model2ProfileEmailsGet200Response result = apiInstance.call2profileEmailsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailsApi#call2profileEmailsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Model2ProfileEmailsGet200Response**](Model2ProfileEmailsGet200Response.md)

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

