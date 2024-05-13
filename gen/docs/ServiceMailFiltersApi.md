# ServiceMailFiltersApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdFiltersFilterIdDelete**](ServiceMailFiltersApi.md#call1mailHostingsMailHostingIdFiltersFilterIdDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/filters/{filter_id} | Delete  filter |
| [**call1mailHostingsMailHostingIdFiltersFilterIdGet**](ServiceMailFiltersApi.md#call1mailHostingsMailHostingIdFiltersFilterIdGet) | **GET** /1/mail_hostings/{mail_hosting_id}/filters/{filter_id} | Show a specific service mail filter |
| [**call1mailHostingsMailHostingIdFiltersFilterIdPut**](ServiceMailFiltersApi.md#call1mailHostingsMailHostingIdFiltersFilterIdPut) | **PUT** /1/mail_hostings/{mail_hosting_id}/filters/{filter_id} | Update service mail filter |
| [**call1mailHostingsMailHostingIdFiltersGet**](ServiceMailFiltersApi.md#call1mailHostingsMailHostingIdFiltersGet) | **GET** /1/mail_hostings/{mail_hosting_id}/filters | List filters |
| [**call1mailHostingsMailHostingIdFiltersPost**](ServiceMailFiltersApi.md#call1mailHostingsMailHostingIdFiltersPost) | **POST** /1/mail_hostings/{mail_hosting_id}/filters | Create service mail filter |



## call1mailHostingsMailHostingIdFiltersFilterIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdFiltersFilterIdDelete(mailHostingId, filterId)

Delete  filter

Delete  filters for given Service Mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailFiltersApi apiInstance = new ServiceMailFiltersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        Integer filterId = 56; // Integer | Sieve filter identifier
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdFiltersFilterIdDelete(mailHostingId, filterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailFiltersApi#call1mailHostingsMailHostingIdFiltersFilterIdDelete");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |
| **filterId** | **Integer**| Sieve filter identifier | |

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


## call1mailHostingsMailHostingIdFiltersFilterIdGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdFiltersFilterIdGet(mailHostingId, filterId)

Show a specific service mail filter

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailFiltersApi apiInstance = new ServiceMailFiltersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        Integer filterId = 56; // Integer | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdFiltersFilterIdGet(mailHostingId, filterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailFiltersApi#call1mailHostingsMailHostingIdFiltersFilterIdGet");
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
| **mailHostingId** | **Integer**|  | |
| **filterId** | **Integer**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdFiltersFilterIdPut

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdFiltersFilterIdPut(mailHostingId, filterId)

Update service mail filter

Update filter for given Service Mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailFiltersApi apiInstance = new ServiceMailFiltersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        Integer filterId = 56; // Integer | Sieve filter identifier
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdFiltersFilterIdPut(mailHostingId, filterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailFiltersApi#call1mailHostingsMailHostingIdFiltersFilterIdPut");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |
| **filterId** | **Integer**| Sieve filter identifier | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1mailHostingsMailHostingIdFiltersGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1mailHostingsMailHostingIdFiltersGet(mailHostingId)

List filters

Returns filters for given Service Mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailFiltersApi apiInstance = new ServiceMailFiltersApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1mailHostingsMailHostingIdFiltersGet(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailFiltersApi#call1mailHostingsMailHostingIdFiltersGet");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |

### Return type

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdFiltersPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdFiltersPost(mailHostingId)

Create service mail filter

Create filters for given Service Mail  *

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailFiltersApi apiInstance = new ServiceMailFiltersApi(defaultClient);
        String mailHostingId = "mailHostingId_example"; // String | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdFiltersPost(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailFiltersApi#call1mailHostingsMailHostingIdFiltersPost");
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
| **mailHostingId** | **String**|  | |

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

