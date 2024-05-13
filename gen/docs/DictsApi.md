# DictsApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approvedCompaniesUser**](DictsApi.md#approvedCompaniesUser) | **GET** /dicts/approved-companies/ | Get a list of companies available to the user |
| [**getAuthMethods**](DictsApi.md#getAuthMethods) | **GET** /dicts/auth-methods/ | Get a list of enabled auth methods from config |
| [**getLanguages**](DictsApi.md#getLanguages) | **GET** /dicts/languages/ | Get a list of user languages |
| [**getUserRoles**](DictsApi.md#getUserRoles) | **GET** /dicts/user-roles/ | Get a list of user roles |



## approvedCompaniesUser

> PageDictItemScheme approvedCompaniesUser(text, perPage, page)

Get a list of companies available to the user

Get a list of companies available to the user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DictsApi apiInstance = new DictsApi(defaultClient);
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageDictItemScheme result = apiInstance.approvedCompaniesUser(text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DictsApi#approvedCompaniesUser");
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
| **text** | **String**| text value for search by name | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageDictItemScheme**](PageDictItemScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## getAuthMethods

> AuthMethods getAuthMethods()

Get a list of enabled auth methods from config

Get a list of enabled auth methods from config

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        DictsApi apiInstance = new DictsApi(defaultClient);
        try {
            AuthMethods result = apiInstance.getAuthMethods();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DictsApi#getAuthMethods");
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

[**AuthMethods**](AuthMethods.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getLanguages

> ListDictItemScheme getLanguages()

Get a list of user languages

Get a list of user languages  Args:     curr_user: Data of the current user  Returns:     Data scheme of language list

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DictsApi apiInstance = new DictsApi(defaultClient);
        try {
            ListDictItemScheme result = apiInstance.getLanguages();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DictsApi#getLanguages");
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

[**ListDictItemScheme**](ListDictItemScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |


## getUserRoles

> ListDictItemScheme getUserRoles()

Get a list of user roles

Get a list of user roles

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DictsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DictsApi apiInstance = new DictsApi(defaultClient);
        try {
            ListDictItemScheme result = apiInstance.getUserRoles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DictsApi#getUserRoles");
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

[**ListDictItemScheme**](ListDictItemScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |

