# ApplicationsPasswordsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call2profileApplicationsPasswordsGet**](ApplicationsPasswordsApi.md#call2profileApplicationsPasswordsGet) | **GET** /2/profile/applications/passwords | List applications passwords |
| [**call2profileApplicationsPasswordsPasswordIdGet**](ApplicationsPasswordsApi.md#call2profileApplicationsPasswordsPasswordIdGet) | **GET** /2/profile/applications/passwords/{password_id} | Display an application password |
| [**call2profileApplicationsPasswordsPost**](ApplicationsPasswordsApi.md#call2profileApplicationsPasswordsPost) | **POST** /2/profile/applications/passwords | Add an application password |



## call2profileApplicationsPasswordsGet

> Model2ProfileApplicationsPasswordsGet200Response call2profileApplicationsPasswordsGet()

List applications passwords

This endpoint allows you to retrieve all the application password of the current user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsPasswordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApplicationsPasswordsApi apiInstance = new ApplicationsPasswordsApi(defaultClient);
        try {
            Model2ProfileApplicationsPasswordsGet200Response result = apiInstance.call2profileApplicationsPasswordsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsPasswordsApi#call2profileApplicationsPasswordsGet");
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

[**Model2ProfileApplicationsPasswordsGet200Response**](Model2ProfileApplicationsPasswordsGet200Response.md)

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


## call2profileApplicationsPasswordsPasswordIdGet

> Model2ProfileApplicationsPasswordsPasswordIdGet200Response call2profileApplicationsPasswordsPasswordIdGet(passwordId)

Display an application password

Returns a variety of information about a single application password specified by the requested unique identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsPasswordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApplicationsPasswordsApi apiInstance = new ApplicationsPasswordsApi(defaultClient);
        Integer passwordId = 56; // Integer | The unique identifier (ID) of the password to request.
        try {
            Model2ProfileApplicationsPasswordsPasswordIdGet200Response result = apiInstance.call2profileApplicationsPasswordsPasswordIdGet(passwordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsPasswordsApi#call2profileApplicationsPasswordsPasswordIdGet");
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
| **passwordId** | **Integer**| The unique identifier (ID) of the password to request. | |

### Return type

[**Model2ProfileApplicationsPasswordsPasswordIdGet200Response**](Model2ProfileApplicationsPasswordsPasswordIdGet200Response.md)

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


## call2profileApplicationsPasswordsPost

> Model2ProfileApplicationsPasswordsPost201Response call2profileApplicationsPasswordsPost()

Add an application password

Add a profile specific password Warning: password given in response cannot be retrieved later, so store / show it immediately

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationsPasswordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApplicationsPasswordsApi apiInstance = new ApplicationsPasswordsApi(defaultClient);
        try {
            Model2ProfileApplicationsPasswordsPost201Response result = apiInstance.call2profileApplicationsPasswordsPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsPasswordsApi#call2profileApplicationsPasswordsPost");
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

[**Model2ProfileApplicationsPasswordsPost201Response**](Model2ProfileApplicationsPasswordsPost201Response.md)

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
| **422** | Unprocessable Entity |  -  |

