# GetUserInfoApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicApiV1UsersMyProfileGet**](GetUserInfoApi.md#publicApiV1UsersMyProfileGet) | **GET** /public-api/v1/users/my-profile | Get My Profile |
| [**publicApiV1UsersUseridGet**](GetUserInfoApi.md#publicApiV1UsersUseridGet) | **GET** /public-api/v1/users/{userid} | Get User by ID |
| [**publicApiV1UsersUsernameGet**](GetUserInfoApi.md#publicApiV1UsersUsernameGet) | **GET** /public-api/v1/users/{username} | Get User by Username |



## publicApiV1UsersMyProfileGet

> PublicApiV1UsersMyProfileGet200Response publicApiV1UsersMyProfileGet()

Get My Profile

Retrieve the profile for the authenticated user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetUserInfoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        GetUserInfoApi apiInstance = new GetUserInfoApi(defaultClient);
        try {
            PublicApiV1UsersMyProfileGet200Response result = apiInstance.publicApiV1UsersMyProfileGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GetUserInfoApi#publicApiV1UsersMyProfileGet");
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

[**PublicApiV1UsersMyProfileGet200Response**](PublicApiV1UsersMyProfileGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Not Logged In |  -  |


## publicApiV1UsersUseridGet

> PublicApiV1UsersUseridGet200Response publicApiV1UsersUseridGet(userid)

Get User by ID

Retrieve user information by user ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetUserInfoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        GetUserInfoApi apiInstance = new GetUserInfoApi(defaultClient);
        Integer userid = 56; // Integer | The ID of the user.
        try {
            PublicApiV1UsersUseridGet200Response result = apiInstance.publicApiV1UsersUseridGet(userid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GetUserInfoApi#publicApiV1UsersUseridGet");
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
| **userid** | **Integer**| The ID of the user. | |

### Return type

[**PublicApiV1UsersUseridGet200Response**](PublicApiV1UsersUseridGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | User Not Found |  -  |


## publicApiV1UsersUsernameGet

> PublicApiV1UsersUseridGet200Response publicApiV1UsersUsernameGet(username)

Get User by Username

Retrieve user information by username.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetUserInfoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        GetUserInfoApi apiInstance = new GetUserInfoApi(defaultClient);
        String username = "username_example"; // String | The username of the user.
        try {
            PublicApiV1UsersUseridGet200Response result = apiInstance.publicApiV1UsersUsernameGet(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GetUserInfoApi#publicApiV1UsersUsernameGet");
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
| **username** | **String**| The username of the user. | |

### Return type

[**PublicApiV1UsersUseridGet200Response**](PublicApiV1UsersUseridGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | User Not Found |  -  |

