# PasswordsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1swissBackupsSwissBackupIdAdminRequestPasswordPost**](PasswordsApi.md#call1swissBackupsSwissBackupIdAdminRequestPasswordPost) | **POST** /1/swiss_backups/{swiss_backup_id}/admin/request_password | Request administrator password |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost**](PasswordsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost) | **POST** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/request_password | Request slot password |



## call1swissBackupsSwissBackupIdAdminRequestPasswordPost

> Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response call1swissBackupsSwissBackupIdAdminRequestPasswordPost(swissBackupId)

Request administrator password

Get a new token or send an email, to change the Acronis administrator password

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasswordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PasswordsApi apiInstance = new PasswordsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        try {
            Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response result = apiInstance.call1swissBackupsSwissBackupIdAdminRequestPasswordPost(swissBackupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordsApi#call1swissBackupsSwissBackupIdAdminRequestPasswordPost");
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

[**Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response**](Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response.md)

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


## call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost

> Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost(swissBackupId, slotId)

Request slot password

Get a new token or send the email, to change the password for a slot

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasswordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PasswordsApi apiInstance = new PasswordsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        try {
            Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost(swissBackupId, slotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordsApi#call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost");
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
| **slotId** | **Integer**| Unique identifier of the Slot to request. | |

### Return type

[**Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response**](Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response.md)

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

