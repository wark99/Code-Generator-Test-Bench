# BackupApi

All URIs are relative to *https://glusterfs1.sgx.io:8443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backupItemDeletePost**](BackupApi.md#backupItemDeletePost) | **POST** /backup/item/delete | Delete a save |
| [**backupItemListPost**](BackupApi.md#backupItemListPost) | **POST** /backup/item/list | Get the list of saves |
| [**backupItemRestorePost**](BackupApi.md#backupItemRestorePost) | **POST** /backup/item/restore | Restore a save |
| [**backupProfileListPost**](BackupApi.md#backupProfileListPost) | **POST** /backup/profile/list | Get the list of profiles |
| [**backupUserListPost**](BackupApi.md#backupUserListPost) | **POST** /backup/user/list | Get the list of players |



## backupItemDeletePost

> Object backupItemDeletePost(restoreDeleteParameters)

Delete a save

Delete a save for a profile for a given user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        BackupApi apiInstance = new BackupApi(defaultClient);
        RestoreDeleteParameters restoreDeleteParameters = new RestoreDeleteParameters(); // RestoreDeleteParameters | Request body to restore or delete a save of a profile for a given user
        try {
            Object result = apiInstance.backupItemDeletePost(restoreDeleteParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupApi#backupItemDeletePost");
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
| **restoreDeleteParameters** | [**RestoreDeleteParameters**](RestoreDeleteParameters.md)| Request body to restore or delete a save of a profile for a given user | |

### Return type

**Object**

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **500** | Request error |  -  |


## backupItemListPost

> UsersResponse backupItemListPost(requestItemParameters)

Get the list of saves

Get the list of saves for a profile for a given user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        BackupApi apiInstance = new BackupApi(defaultClient);
        RequestItemParameters requestItemParameters = new RequestItemParameters(); // RequestItemParameters | Request body to retrieve the list of saves of a profile for a given user
        try {
            UsersResponse result = apiInstance.backupItemListPost(requestItemParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupApi#backupItemListPost");
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
| **requestItemParameters** | [**RequestItemParameters**](RequestItemParameters.md)| Request body to retrieve the list of saves of a profile for a given user | |

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **500** | Request error |  -  |


## backupItemRestorePost

> RestoreResponse backupItemRestorePost(restoreDeleteParameters)

Restore a save

Restore a save for a profile for a given user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        BackupApi apiInstance = new BackupApi(defaultClient);
        RestoreDeleteParameters restoreDeleteParameters = new RestoreDeleteParameters(); // RestoreDeleteParameters | Request body to restore or delete a save of a profile for a given user
        try {
            RestoreResponse result = apiInstance.backupItemRestorePost(restoreDeleteParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupApi#backupItemRestorePost");
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
| **restoreDeleteParameters** | [**RestoreDeleteParameters**](RestoreDeleteParameters.md)| Request body to restore or delete a save of a profile for a given user | |

### Return type

[**RestoreResponse**](RestoreResponse.md)

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **500** | Request error |  -  |


## backupProfileListPost

> UsersResponse backupProfileListPost(requestProfileParameters)

Get the list of profiles

Get the list of profiles for a given user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        BackupApi apiInstance = new BackupApi(defaultClient);
        RequestProfileParameters requestProfileParameters = new RequestProfileParameters(); // RequestProfileParameters | Request body to retrieve the list of profiles for a given user
        try {
            UsersResponse result = apiInstance.backupProfileListPost(requestProfileParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupApi#backupProfileListPost");
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
| **requestProfileParameters** | [**RequestProfileParameters**](RequestProfileParameters.md)| Request body to retrieve the list of profiles for a given user | |

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **500** | Request error |  -  |


## backupUserListPost

> UsersResponse backupUserListPost(body)

Get the list of players

Get the list of players having at least one game save in the system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://glusterfs1.sgx.io:8443");
        
        // Configure API key authorization: sessionCookieAuth
        ApiKeyAuth sessionCookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("sessionCookieAuth");
        sessionCookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //sessionCookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        BackupApi apiInstance = new BackupApi(defaultClient);
        RequestUserSharedParameters body = new RequestUserSharedParameters(); // RequestUserSharedParameters | Request body to retrieve the list of users
        try {
            UsersResponse result = apiInstance.backupUserListPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupApi#backupUserListPost");
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
| **body** | **RequestUserSharedParameters**| Request body to retrieve the list of users | |

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[sessionCookieAuth](../README.md#sessionCookieAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **500** | Request error |  -  |

