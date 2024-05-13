# SlotsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1swissBackupsSwissBackupIdSlotsGet**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsGet) | **GET** /1/swiss_backups/{swiss_backup_id}/slots | List all slots |
| [**call1swissBackupsSwissBackupIdSlotsPost**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsPost) | **POST** /1/swiss_backups/{swiss_backup_id}/slots | Create |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdDelete**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdDelete) | **DELETE** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id} | Delete |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost) | **POST** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/disable | Disable |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost) | **POST** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/enable | Enable |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdGet**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdGet) | **GET** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id} | Slot information |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdPut**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdPut) | **PUT** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id} | Update |
| [**call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet**](SlotsApi.md#call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet) | **GET** /1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/rclone | RClone details |



## call1swissBackupsSwissBackupIdSlotsGet

> Model1SwissBackupsSwissBackupIdSlotsGet200Response call1swissBackupsSwissBackupIdSlotsGet(swissBackupId)

List all slots

Get all slots for the given Swiss Backup product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsGet200Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsGet(swissBackupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsGet");
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

[**Model1SwissBackupsSwissBackupIdSlotsGet200Response**](Model1SwissBackupsSwissBackupIdSlotsGet200Response.md)

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


## call1swissBackupsSwissBackupIdSlotsPost

> Model1SwissBackupsSwissBackupIdSlotsPost201Response call1swissBackupsSwissBackupIdSlotsPost(swissBackupId, requestBody1)

Create

Create a new slot via a job, for the given Swiss Backup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        RequestBody1 requestBody1 = new RequestBody1(); // RequestBody1 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsPost201Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsPost(swissBackupId, requestBody1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsPost");
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
| **requestBody1** | [**RequestBody1**](RequestBody1.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsPost201Response**](Model1SwissBackupsSwissBackupIdSlotsPost201Response.md)

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


## call1swissBackupsSwissBackupIdSlotsSlotIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response call1swissBackupsSwissBackupIdSlotsSlotIdDelete(swissBackupId, slotId)

Delete

Delete a slot for the given Swiss Backup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdDelete(swissBackupId, slotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsSlotIdDelete");
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

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response.md)

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
| **500** | Internal Server Error |  -  |


## call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost(swissBackupId, slotId)

Disable

Disable a slot via a job, for the given Swiss Backup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost(swissBackupId, slotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost");
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


## call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost(swissBackupId, slotId)

Enable

Enable a slot via a job, for the given Swiss Backup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost(swissBackupId, slotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost");
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


## call1swissBackupsSwissBackupIdSlotsSlotIdGet

> Model1SwissBackupsSwissBackupIdSlotsPost201Response call1swissBackupsSwissBackupIdSlotsSlotIdGet(swissBackupId, slotId)

Slot information

Get more details about the given slot

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsPost201Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdGet(swissBackupId, slotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsSlotIdGet");
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

[**Model1SwissBackupsSwissBackupIdSlotsPost201Response**](Model1SwissBackupsSwissBackupIdSlotsPost201Response.md)

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


## call1swissBackupsSwissBackupIdSlotsSlotIdPut

> Model1SwissBackupsSwissBackupIdSlotsPost201Response call1swissBackupsSwissBackupIdSlotsSlotIdPut(swissBackupId, slotId, requestBody3)

Update

Update a slot via a job, for the given Swiss Backup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        RequestBody3 requestBody3 = new RequestBody3(); // RequestBody3 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsPost201Response result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdPut(swissBackupId, slotId, requestBody3);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsSlotIdPut");
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
| **requestBody3** | [**RequestBody3**](RequestBody3.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsPost201Response**](Model1SwissBackupsSwissBackupIdSlotsPost201Response.md)

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
| **500** | Internal Server Error |  -  |


## call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet

> Object call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet(swissBackupId, slotId)

RClone details

Get RClone details about the given slot

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SlotsApi apiInstance = new SlotsApi(defaultClient);
        Integer swissBackupId = 56; // Integer | Unique identifier of the Swiss Backup to request.
        Integer slotId = 56; // Integer | Unique identifier of the Slot to request.
        try {
            Object result = apiInstance.call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet(swissBackupId, slotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlotsApi#call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet");
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

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

