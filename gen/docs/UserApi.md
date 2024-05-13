# UserApi

All URIs are relative to *https://api.perch.fit*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /users/create | Create a user |
| [**filterUsers**](UserApi.md#filterUsers) | **POST** /v2/users | Filter users |
| [**getUser**](UserApi.md#getUser) | **GET** /v2/user | Get user |
| [**updateUser**](UserApi.md#updateUser) | **POST** /v2/users/update | Update a user |



## createUser

> CreateUserResponse createUser(createUserParams)

Create a user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        CreateUserParams createUserParams = new CreateUserParams(); // CreateUserParams | Create a new user
        try {
            CreateUserResponse result = apiInstance.createUser(createUserParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
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
| **createUserParams** | [**CreateUserParams**](CreateUserParams.md)| Create a new user | [optional] |

### Return type

[**CreateUserResponse**](CreateUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, user created. |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |


## filterUsers

> FilterUsersResponse filterUsers(filterUsersParams)

Filter users

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        FilterUsersParams filterUsersParams = new FilterUsersParams(); // FilterUsersParams | Filters on users. Requires at least one of `id` or `group_id`.
        try {
            FilterUsersResponse result = apiInstance.filterUsers(filterUsersParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#filterUsers");
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
| **filterUsersParams** | [**FilterUsersParams**](FilterUsersParams.md)| Filters on users. Requires at least one of &#x60;id&#x60; or &#x60;group_id&#x60;. | [optional] |

### Return type

[**FilterUsersResponse**](FilterUsersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, here are matching users. |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |


## getUser

> GetUserResponse getUser()

Get user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            GetUserResponse result = apiInstance.getUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUser");
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

[**GetUserResponse**](GetUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, here is your user. |  -  |
| **429** |  |  -  |


## updateUser

> GenericSuccessResponse updateUser(updateUserParams)

Update a user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        UpdateUserParams updateUserParams = new UpdateUserParams(); // UpdateUserParams | Update a user. All fields are optional except `id`, this endpoint acts as a PATCH.
        try {
            GenericSuccessResponse result = apiInstance.updateUser(updateUserParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUser");
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
| **updateUserParams** | [**UpdateUserParams**](UpdateUserParams.md)| Update a user. All fields are optional except &#x60;id&#x60;, this endpoint acts as a PATCH. | [optional] |

### Return type

[**GenericSuccessResponse**](GenericSuccessResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, user updated. |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |

