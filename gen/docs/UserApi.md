# UserApi

All URIs are relative to *https://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**feedGet**](UserApi.md#feedGet) | **GET** /feed | Get user&#39;s feed |
| [**searchUsersGet**](UserApi.md#searchUsersGet) | **GET** /search/users | Search for users |
| [**usersFollowPost**](UserApi.md#usersFollowPost) | **POST** /users/follow | Follow a user |
| [**usersUnfollowPost**](UserApi.md#usersUnfollowPost) | **POST** /users/unfollow | Unfollow a user |
| [**usersUserIdFollowersGet**](UserApi.md#usersUserIdFollowersGet) | **GET** /users/{userId}/followers | Get user&#39;s followers |
| [**usersUserIdFollowingGet**](UserApi.md#usersUserIdFollowingGet) | **GET** /users/{userId}/following | Get users being followed |
| [**usersUserIdGet**](UserApi.md#usersUserIdGet) | **GET** /users/{userId} | Get user profile |
| [**usersUserIdPut**](UserApi.md#usersUserIdPut) | **PUT** /users/{userId} | Update user profile |



## feedGet

> RecipesGet200Response feedGet(type)

Get user&#39;s feed

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
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String type = "explore"; // String | 
        try {
            RecipesGet200Response result = apiInstance.feedGet(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#feedGet");
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
| **type** | **String**|  | [enum: explore, following] |

### Return type

[**RecipesGet200Response**](RecipesGet200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## searchUsersGet

> SearchUsersGet200Response searchUsersGet(q)

Search for users

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
        defaultClient.setBasePath("https://localhost:3000");

        UserApi apiInstance = new UserApi(defaultClient);
        String q = "q_example"; // String | 
        try {
            SearchUsersGet200Response result = apiInstance.searchUsersGet(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#searchUsersGet");
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
| **q** | **String**|  | [optional] |

### Return type

[**SearchUsersGet200Response**](SearchUsersGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## usersFollowPost

> Object usersFollowPost(usersFollowPostRequest)

Follow a user

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
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        UsersFollowPostRequest usersFollowPostRequest = new UsersFollowPostRequest(); // UsersFollowPostRequest | 
        try {
            Object result = apiInstance.usersFollowPost(usersFollowPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersFollowPost");
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
| **usersFollowPostRequest** | [**UsersFollowPostRequest**](UsersFollowPostRequest.md)|  | |

### Return type

**Object**

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **404** |  |  -  |


## usersUnfollowPost

> Object usersUnfollowPost(usersFollowPostRequest)

Unfollow a user

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
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        UsersFollowPostRequest usersFollowPostRequest = new UsersFollowPostRequest(); // UsersFollowPostRequest | 
        try {
            Object result = apiInstance.usersUnfollowPost(usersFollowPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersUnfollowPost");
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
| **usersFollowPostRequest** | [**UsersFollowPostRequest**](UsersFollowPostRequest.md)|  | |

### Return type

**Object**

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **404** |  |  -  |


## usersUserIdFollowersGet

> UsersUserIdFollowingGet200Response usersUserIdFollowersGet(userId)

Get user&#39;s followers

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
        defaultClient.setBasePath("https://localhost:3000");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            UsersUserIdFollowingGet200Response result = apiInstance.usersUserIdFollowersGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersUserIdFollowersGet");
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
| **userId** | **Integer**|  | |

### Return type

[**UsersUserIdFollowingGet200Response**](UsersUserIdFollowingGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## usersUserIdFollowingGet

> UsersUserIdFollowingGet200Response usersUserIdFollowingGet(userId)

Get users being followed

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
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            UsersUserIdFollowingGet200Response result = apiInstance.usersUserIdFollowingGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersUserIdFollowingGet");
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
| **userId** | **Integer**|  | |

### Return type

[**UsersUserIdFollowingGet200Response**](UsersUserIdFollowingGet200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## usersUserIdGet

> UsersUserIdGet200Response usersUserIdGet(userId)

Get user profile

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
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            UsersUserIdGet200Response result = apiInstance.usersUserIdGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersUserIdGet");
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
| **userId** | **Integer**|  | |

### Return type

[**UsersUserIdGet200Response**](UsersUserIdGet200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |


## usersUserIdPut

> UsersUserIdGet200Response usersUserIdPut(userId, userProfile)

Update user profile

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
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        UserProfile userProfile = new UserProfile(); // UserProfile | 
        try {
            UsersUserIdGet200Response result = apiInstance.usersUserIdPut(userId, userProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersUserIdPut");
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
| **userId** | **Integer**|  | |
| **userProfile** | [**UserProfile**](UserProfile.md)|  | |

### Return type

[**UsersUserIdGet200Response**](UsersUserIdGet200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |

