# PhonesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call2profilePhonesGet**](PhonesApi.md#call2profilePhonesGet) | **GET** /2/profile/phones | List phones |
| [**call2profilePhonesPhoneIdDelete**](PhonesApi.md#call2profilePhonesPhoneIdDelete) | **DELETE** /2/profile/phones/{phone_id} | Delete a phone |
| [**call2profilePhonesPhoneIdGet**](PhonesApi.md#call2profilePhonesPhoneIdGet) | **GET** /2/profile/phones/{phone_id} | Display a phone |



## call2profilePhonesGet

> Model2ProfilePhonesGet200Response call2profilePhonesGet()

List phones

This endpoint allows you to retrieve all the phones of the current user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhonesApi apiInstance = new PhonesApi(defaultClient);
        try {
            Model2ProfilePhonesGet200Response result = apiInstance.call2profilePhonesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhonesApi#call2profilePhonesGet");
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

[**Model2ProfilePhonesGet200Response**](Model2ProfilePhonesGet200Response.md)

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


## call2profilePhonesPhoneIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call2profilePhonesPhoneIdDelete(phoneId)

Delete a phone

Delete a current user profile phone

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhonesApi apiInstance = new PhonesApi(defaultClient);
        Integer phoneId = 56; // Integer | The unique identifier (ID) of the phone to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call2profilePhonesPhoneIdDelete(phoneId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhonesApi#call2profilePhonesPhoneIdDelete");
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
| **phoneId** | **Integer**| The unique identifier (ID) of the phone to request. | |

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


## call2profilePhonesPhoneIdGet

> Model2ProfilePhonesPhoneIdGet200Response call2profilePhonesPhoneIdGet(phoneId)

Display a phone

Returns a variety of information about a single phone specified by the requested unique identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhonesApi apiInstance = new PhonesApi(defaultClient);
        Integer phoneId = 56; // Integer | The unique identifier (ID) of the phone to request.
        try {
            Model2ProfilePhonesPhoneIdGet200Response result = apiInstance.call2profilePhonesPhoneIdGet(phoneId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhonesApi#call2profilePhonesPhoneIdGet");
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
| **phoneId** | **Integer**| The unique identifier (ID) of the phone to request. | |

### Return type

[**Model2ProfilePhonesPhoneIdGet200Response**](Model2ProfilePhonesPhoneIdGet200Response.md)

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

