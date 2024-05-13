# AccountApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountChangeMobilePut**](AccountApi.md#accountChangeMobilePut) | **PUT** /account/change-mobile | Change mobile number |
| [**accountChangePasswordPut**](AccountApi.md#accountChangePasswordPut) | **PUT** /account/change-password | Change user password |
| [**accountEditAboutFamilyPut**](AccountApi.md#accountEditAboutFamilyPut) | **PUT** /account/edit-about-family | Edits About Family |
| [**accountGet**](AccountApi.md#accountGet) | **GET** /account | Get user profile |
| [**accountGetImageDimensionGet**](AccountApi.md#accountGetImageDimensionGet) | **GET** /account/get-image/{dimension} | get profile image |
| [**accountUpdateProfileSettingPut**](AccountApi.md#accountUpdateProfileSettingPut) | **PUT** /account/update-profile-setting | update user profile setting |
| [**accountUploadImagePut**](AccountApi.md#accountUploadImagePut) | **PUT** /account/upload-image | uploads user profile images |



## accountChangeMobilePut

> accountChangeMobilePut(accountChangeMobilePutRequest)

Change mobile number

Updates user mobile number, you can use it to change which mobile is your primary and alternate phone number

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountChangeMobilePutRequest accountChangeMobilePutRequest = new AccountChangeMobilePutRequest(); // AccountChangeMobilePutRequest | 
        try {
            apiInstance.accountChangeMobilePut(accountChangeMobilePutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountChangeMobilePut");
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
| **accountChangeMobilePutRequest** | [**AccountChangeMobilePutRequest**](AccountChangeMobilePutRequest.md)|  | [optional] |

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
| **204** | No content. Update succeeded |  -  |
| **400** | Invalid request |  -  |
| **403** | Unauthorized |  -  |
| **0** | Unexpected Error |  -  |


## accountChangePasswordPut

> accountChangePasswordPut(accountChangePasswordPutRequest)

Change user password

Allows user to change their password

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountChangePasswordPutRequest accountChangePasswordPutRequest = new AccountChangePasswordPutRequest(); // AccountChangePasswordPutRequest | 
        try {
            apiInstance.accountChangePasswordPut(accountChangePasswordPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountChangePasswordPut");
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
| **accountChangePasswordPutRequest** | [**AccountChangePasswordPutRequest**](AccountChangePasswordPutRequest.md)|  | [optional] |

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
| **204** | No content. Password changed |  -  |
| **400** | Invalid request |  -  |
| **403** | Unauthorized |  -  |
| **0** | Unexpected Error |  -  |


## accountEditAboutFamilyPut

> accountEditAboutFamilyPut(accountEditAboutFamilyPutRequest)

Edits About Family

Allows parent to edit about family details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountEditAboutFamilyPutRequest accountEditAboutFamilyPutRequest = new AccountEditAboutFamilyPutRequest(); // AccountEditAboutFamilyPutRequest | 
        try {
            apiInstance.accountEditAboutFamilyPut(accountEditAboutFamilyPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountEditAboutFamilyPut");
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
| **accountEditAboutFamilyPutRequest** | [**AccountEditAboutFamilyPutRequest**](AccountEditAboutFamilyPutRequest.md)|  | [optional] |

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
| **204** | No content |  -  |
| **400** | Unable to get requested images |  -  |
| **403** | Error occurred |  -  |
| **0** | Unexpected Error |  -  |


## accountGet

> AccountGet200Response accountGet(id)

Get user profile

If id is supplied it retrieves the profile matching the id. Where no id is supplied then it retrieves profile of the currently logged in user. If id is not supplied and no user is currently logged in, it will return an error

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        String id = "fere-get-trtre"; // String | 
        try {
            AccountGet200Response result = apiInstance.accountGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountGet");
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
| **id** | **String**|  | [optional] |

### Return type

[**AccountGet200Response**](AccountGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User profile retrieved successfully |  -  |
| **400** | Unable to create profile. |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## accountGetImageDimensionGet

> List&lt;String&gt; accountGetImageDimensionGet(dimension, id)

get profile image

Returns links to profile images matching the supplied dimensions. If id is supplied in addition, then images links returned will match profile images of user whose profile id was supplied else images returned will default to currently logged in user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        String dimension = "310x340"; // String | 
        String id = "id_example"; // String | 
        try {
            List<String> result = apiInstance.accountGetImageDimensionGet(dimension, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountGetImageDimensionGet");
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
| **dimension** | **String**|  | [enum: 310x340, 260x260, 240x220, 210x210, 160x160, 120x120, 70x70, 32x32, 18x18] |
| **id** | **String**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User profile retrieved successfully |  -  |
| **400** | Unable to get requested images |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## accountUpdateProfileSettingPut

> accountUpdateProfileSettingPut(accountUpdateProfileSettingPutRequest)

update user profile setting

Allow user to update their name, address, gender, date of birth and alternate mobile number. Note that user is not allowed to update their name if id verification has already been completed. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountUpdateProfileSettingPutRequest accountUpdateProfileSettingPutRequest = new AccountUpdateProfileSettingPutRequest(); // AccountUpdateProfileSettingPutRequest | 
        try {
            apiInstance.accountUpdateProfileSettingPut(accountUpdateProfileSettingPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountUpdateProfileSettingPut");
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
| **accountUpdateProfileSettingPutRequest** | [**AccountUpdateProfileSettingPutRequest**](AccountUpdateProfileSettingPutRequest.md)|  | [optional] |

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
| **400** | Unable to update profile settings. |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## accountUploadImagePut

> accountUploadImagePut(files)

uploads user profile images

Allows user to upload profile images. User can upload a maximum of 5 images. Each image can be PNG or JPG and exist no more than 1MB in size. Minimum dimensions allowed is 600x600 pixels

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AccountApi apiInstance = new AccountApi(defaultClient);
        List<File> files = Arrays.asList(); // List<File> | 
        try {
            apiInstance.accountUploadImagePut(files);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountUploadImagePut");
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
| **204** | profile images successfully uploaded |  -  |
| **400** | Unable to upload profile images |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

