# UserApi

All URIs are relative to *https://api.staging-test.fun/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /user | Create user |
| [**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array |
| [**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user |
| [**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name |
| [**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system |
| [**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session |
| [**updateUser**](UserApi.md#updateUser) | **PUT** /user/{username} | Update user |



## createUser

> CreateUserRequest createUser(createUserRequest)

Create user

This can only be done by the logged in user.

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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | Created user object
        try {
            CreateUserRequest result = apiInstance.createUser(createUserRequest);
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| Created user object | [optional] |

### Return type

[**CreateUserRequest**](CreateUserRequest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## createUsersWithListInput

> CreateUserRequest createUsersWithListInput(createUserRequest)

Creates list of users with given input array

Creates list of users with given input array

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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        List<CreateUserRequest> createUserRequest = Arrays.asList(); // List<CreateUserRequest> | 
        try {
            CreateUserRequest result = apiInstance.createUsersWithListInput(createUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUsersWithListInput");
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
| **createUserRequest** | [**List&lt;CreateUserRequest&gt;**](CreateUserRequest.md)|  | [optional] |

### Return type

[**CreateUserRequest**](CreateUserRequest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **0** | successful operation |  -  |


## deleteUser

> deleteUser(username)

Delete user

This can only be done by the logged in user.

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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be deleted
        try {
            apiInstance.deleteUser(username);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#deleteUser");
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
| **username** | **String**| The name that needs to be deleted | |

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
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## getUserByName

> CreateUserRequest getUserByName(username)

Get user by user name



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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
        try {
            CreateUserRequest result = apiInstance.getUserByName(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserByName");
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
| **username** | **String**| The name that needs to be fetched. Use user1 for testing.  | |

### Return type

[**CreateUserRequest**](CreateUserRequest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## loginUser

> String loginUser(username, password)

Logs user into the system



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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The user name for login
        String password = "password_example"; // String | The password for login in clear text
        try {
            String result = apiInstance.loginUser(username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#loginUser");
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
| **username** | **String**| The user name for login | [optional] |
| **password** | **String**| The password for login in clear text | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-Rate-Limit - calls per hour allowed by the user <br>  * X-Expires-After - date in UTC when token expires <br>  |
| **400** | Invalid username/password supplied |  -  |


## logoutUser

> logoutUser()

Logs out current logged in user session



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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            apiInstance.logoutUser();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#logoutUser");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## updateUser

> updateUser(username, createUserRequest)

Update user

This can only be done by the logged in user.

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
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | name that need to be deleted
        CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | Update an existent user in the store
        try {
            apiInstance.updateUser(username, createUserRequest);
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
| **username** | **String**| name that need to be deleted | |
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| Update an existent user in the store | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

