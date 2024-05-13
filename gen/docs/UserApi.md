# UserApi

All URIs are relative to *http://poosd.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pHPDeleteUserPhpDelete**](UserApi.md#pHPDeleteUserPhpDelete) | **DELETE** /PHP/deleteUser.php | Delete a user |
| [**pHPLoginUserPhpPost**](UserApi.md#pHPLoginUserPhpPost) | **POST** /PHP/loginUser.php | Log in a user |
| [**pHPRegisterUserPhpPost**](UserApi.md#pHPRegisterUserPhpPost) | **POST** /PHP/registerUser.php | Register a new user |



## pHPDeleteUserPhpDelete

> pHPDeleteUserPhpDelete(userid)

Delete a user

This endpoint allows for the deletion of a user by providing the user&#39;s ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userid = 56; // Integer | The ID of the user to be deleted.
        try {
            apiInstance.pHPDeleteUserPhpDelete(userid);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#pHPDeleteUserPhpDelete");
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
| **userid** | **Integer**| The ID of the user to be deleted. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user has been successfully deleted. |  -  |


## pHPLoginUserPhpPost

> pHPLoginUserPhpPost(phPLoginUserPhpPostRequest)

Log in a user

This endpoint allows users to log in by providing their login credentials.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        PHPLoginUserPhpPostRequest phPLoginUserPhpPostRequest = new PHPLoginUserPhpPostRequest(); // PHPLoginUserPhpPostRequest | 
        try {
            apiInstance.pHPLoginUserPhpPost(phPLoginUserPhpPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#pHPLoginUserPhpPost");
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
| **phPLoginUserPhpPostRequest** | [**PHPLoginUserPhpPostRequest**](PHPLoginUserPhpPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user has been successfully logged in. |  -  |


## pHPRegisterUserPhpPost

> pHPRegisterUserPhpPost(phPRegisterUserPhpPostRequest)

Register a new user

This endpoint allows for the registration of a new user by providing the necessary details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        PHPRegisterUserPhpPostRequest phPRegisterUserPhpPostRequest = new PHPRegisterUserPhpPostRequest(); // PHPRegisterUserPhpPostRequest | 
        try {
            apiInstance.pHPRegisterUserPhpPost(phPRegisterUserPhpPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#pHPRegisterUserPhpPost");
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
| **phPRegisterUserPhpPostRequest** | [**PHPRegisterUserPhpPostRequest**](PHPRegisterUserPhpPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user has been successfully registered. |  -  |

