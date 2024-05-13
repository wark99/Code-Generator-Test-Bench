# RegistrationApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**idVerificationIdDocTypesGet**](RegistrationApi.md#idVerificationIdDocTypesGet) | **GET** /id-verification/id-doc-types | gets a list of allowed id document types |
| [**idVerificationUploadIdTypePost**](RegistrationApi.md#idVerificationUploadIdTypePost) | **POST** /id-verification/upload/{id-type} | uploads id document for id verification |
| [**registrationCreateAccountPost**](RegistrationApi.md#registrationCreateAccountPost) | **POST** /registration/create-account | create a user account |
| [**registrationCreateProfilePost**](RegistrationApi.md#registrationCreateProfilePost) | **POST** /registration/create-profile | creates a user profile |
| [**registrationVerifyMobilePost**](RegistrationApi.md#registrationVerifyMobilePost) | **POST** /registration/verify-mobile | Verifies that user mobile number |



## idVerificationIdDocTypesGet

> List&lt;IdVerificationIdDocTypesGet200ResponseInner&gt; idVerificationIdDocTypesGet()

gets a list of allowed id document types

list all official id documents allowed for the purpose of identity verification

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RegistrationApi apiInstance = new RegistrationApi(defaultClient);
        try {
            List<IdVerificationIdDocTypesGet200ResponseInner> result = apiInstance.idVerificationIdDocTypesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationApi#idVerificationIdDocTypesGet");
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

[**List&lt;IdVerificationIdDocTypesGet200ResponseInner&gt;**](IdVerificationIdDocTypesGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | retrieved id document types successfully |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## idVerificationUploadIdTypePost

> idVerificationUploadIdTypePost(idType, files)

uploads id document for id verification

This allows user to upload ID verification document to server. Only pdf,jpg,jpeg and png are allowed formats.  Maximum 2 files can be uploaded at a time and there are size restrictions of files 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RegistrationApi apiInstance = new RegistrationApi(defaultClient);
        String idType = "bank_statement"; // String | 
        List<File> files = Arrays.asList(); // List<File> | 
        try {
            apiInstance.idVerificationUploadIdTypePost(idType, files);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationApi#idVerificationUploadIdTypePost");
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
| **idType** | **String**|  | [enum: bank_statement, drivers_licence, passport] |
| **files** | **List&lt;File&gt;**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | document successfully uploaded |  -  |
| **400** | Unable to create profile. |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## registrationCreateAccountPost

> RegistrationCreateAccountPost201Response registrationCreateAccountPost(registrationCreateAccountPostRequest)

create a user account

This creates a basic user account with so you can login with access to basic features

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RegistrationApi apiInstance = new RegistrationApi(defaultClient);
        RegistrationCreateAccountPostRequest registrationCreateAccountPostRequest = new RegistrationCreateAccountPostRequest(); // RegistrationCreateAccountPostRequest | 
        try {
            RegistrationCreateAccountPost201Response result = apiInstance.registrationCreateAccountPost(registrationCreateAccountPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationApi#registrationCreateAccountPost");
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
| **registrationCreateAccountPostRequest** | [**RegistrationCreateAccountPostRequest**](RegistrationCreateAccountPostRequest.md)|  | [optional] |

### Return type

[**RegistrationCreateAccountPost201Response**](RegistrationCreateAccountPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Account successfully created |  -  |
| **400** | Account could not be created due to an error |  -  |
| **0** | Unexpected Error |  -  |


## registrationCreateProfilePost

> registrationCreateProfilePost(registrationCreateProfilePostRequest)

creates a user profile

creates a user profile and associates it to an account already created with /registration/create-account 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RegistrationApi apiInstance = new RegistrationApi(defaultClient);
        RegistrationCreateProfilePostRequest registrationCreateProfilePostRequest = new RegistrationCreateProfilePostRequest(); // RegistrationCreateProfilePostRequest | 
        try {
            apiInstance.registrationCreateProfilePost(registrationCreateProfilePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationApi#registrationCreateProfilePost");
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
| **registrationCreateProfilePostRequest** | [**RegistrationCreateProfilePostRequest**](RegistrationCreateProfilePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | user profile successfully created |  -  |
| **400** | Unable to create profile. |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## registrationVerifyMobilePost

> registrationVerifyMobilePost(registrationVerifyMobilePostRequest)

Verifies that user mobile number

Verifies that user has access to mobile number the supplied during registration process

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RegistrationApi apiInstance = new RegistrationApi(defaultClient);
        RegistrationVerifyMobilePostRequest registrationVerifyMobilePostRequest = new RegistrationVerifyMobilePostRequest(); // RegistrationVerifyMobilePostRequest | 
        try {
            apiInstance.registrationVerifyMobilePost(registrationVerifyMobilePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationApi#registrationVerifyMobilePost");
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
| **registrationVerifyMobilePostRequest** | [**RegistrationVerifyMobilePostRequest**](RegistrationVerifyMobilePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | pin code was successfully verified |  -  |
| **400** | We were unable to verify your pin code |  -  |
| **0** | Unexpected Error |  -  |

