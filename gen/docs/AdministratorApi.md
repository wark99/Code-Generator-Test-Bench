# AdministratorApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1swissBackupsSwissBackupIdAdminPost**](AdministratorApi.md#call1swissBackupsSwissBackupIdAdminPost) | **POST** /1/swiss_backups/{swiss_backup_id}/admin | Create administrator |
| [**call1swissBackupsSwissBackupIdAdminPut**](AdministratorApi.md#call1swissBackupsSwissBackupIdAdminPut) | **PUT** /1/swiss_backups/{swiss_backup_id}/admin | Update administrator |



## call1swissBackupsSwissBackupIdAdminPost

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1swissBackupsSwissBackupIdAdminPost(swissBackupId, requestBody)

Create administrator

Create an Acronis administrator

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdministratorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdministratorApi apiInstance = new AdministratorApi(defaultClient);
        Integer swissBackupId = 56; // Integer | 
        RequestBody requestBody = new RequestBody(); // RequestBody | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1swissBackupsSwissBackupIdAdminPost(swissBackupId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdministratorApi#call1swissBackupsSwissBackupIdAdminPost");
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
| **swissBackupId** | **Integer**|  | |
| **requestBody** | [**RequestBody**](RequestBody.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

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
| **403** | Forbidden |  -  |


## call1swissBackupsSwissBackupIdAdminPut

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1swissBackupsSwissBackupIdAdminPut(swissBackupId, requestBody)

Update administrator

Update the email address for the Acronis administrator user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdministratorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdministratorApi apiInstance = new AdministratorApi(defaultClient);
        Integer swissBackupId = 56; // Integer | 
        RequestBody requestBody = new RequestBody(); // RequestBody | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1swissBackupsSwissBackupIdAdminPut(swissBackupId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdministratorApi#call1swissBackupsSwissBackupIdAdminPut");
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
| **swissBackupId** | **Integer**|  | |
| **requestBody** | [**RequestBody**](RequestBody.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

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

