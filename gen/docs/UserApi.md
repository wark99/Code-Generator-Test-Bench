# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiAuthNewPost**](UserApi.md#apiAuthNewPost) | **POST** /api/auth/new | Make new user |
| [**apiAuthPost**](UserApi.md#apiAuthPost) | **POST** /api/auth | Sign in |
| [**apiUsersDelete**](UserApi.md#apiUsersDelete) | **DELETE** /api/users | Delete your data |
| [**apiUsersIdGet**](UserApi.md#apiUsersIdGet) | **GET** /api/users/{id} | Read user infor from id |
| [**apiUsersPut**](UserApi.md#apiUsersPut) | **PUT** /api/users | Update your infor |



## apiAuthNewPost

> UserAll apiAuthNewPost(userAll)

Make new user

make new user

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
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        UserAll userAll = new HashMap(); // UserAll | Must have username, password
        try {
            UserAll result = apiInstance.apiAuthNewPost(userAll);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#apiAuthNewPost");
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
| **userAll** | [**UserAll**](UserAll.md)| Must have username, password | |

### Return type

[**UserAll**](UserAll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | new user |  -  |
| **400** | Password not match requirement/Username too short(6-) or too long(32+)/Username Exist |  -  |


## apiAuthPost

> Token apiAuthPost(user)

Sign in

return a token string

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
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        User user = new HashMap(); // User | Must have username, password
        try {
            Token result = apiInstance.apiAuthPost(user);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#apiAuthPost");
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
| **user** | [**User**](User.md)| Must have username, password | |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Signed in |  -  |
| **400** | Password not match requirement/Username too short(6-) or too long(32+) |  -  |


## apiUsersDelete

> MessageGood apiUsersDelete()

Delete your data

Delete username, password, comment, playlist

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
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            MessageGood result = apiInstance.apiUsersDelete();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#apiUsersDelete");
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

[**MessageGood**](MessageGood.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete |  -  |
| **404** | Dont have permission |  -  |


## apiUsersIdGet

> UserAll apiUsersIdGet(id)

Read user infor from id

Read user infor from id

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
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer id = 1; // Integer | id is 1+
        try {
            UserAll result = apiInstance.apiUsersIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#apiUsersIdGet");
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
| **id** | **Integer**| id is 1+ | |

### Return type

[**UserAll**](UserAll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User with id |  -  |
| **204** | No user |  -  |


## apiUsersPut

> MessageGood apiUsersPut(apiUsersPutRequest)

Update your infor

Edit your infors

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
        defaultClient.setBasePath("http://localhost");

        UserApi apiInstance = new UserApi(defaultClient);
        ApiUsersPutRequest apiUsersPutRequest = new ApiUsersPutRequest(); // ApiUsersPutRequest | Must have username, name ,password
        try {
            MessageGood result = apiInstance.apiUsersPut(apiUsersPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#apiUsersPut");
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
| **apiUsersPutRequest** | [**ApiUsersPutRequest**](ApiUsersPutRequest.md)| Must have username, name ,password | |

### Return type

[**MessageGood**](MessageGood.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated |  -  |
| **400** | Password not match requirement/Username too short(6-) or too long(32+) |  -  |
| **404** | Dont have permission |  -  |

