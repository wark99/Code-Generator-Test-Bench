# UserApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**followUser**](UserApi.md#followUser) | **POST** /users/{userId}/follow | Follow a user |
| [**getFeed**](UserApi.md#getFeed) | **GET** /feed | Get user&#39;s feed |
| [**getMe**](UserApi.md#getMe) | **GET** /users/me | Get own profile |
| [**getUserById**](UserApi.md#getUserById) | **GET** /users/{userId} | Get user profile |
| [**getUserFollowers**](UserApi.md#getUserFollowers) | **GET** /users/{userId}/followers | Get user&#39;s followers |
| [**getUserFollowing**](UserApi.md#getUserFollowing) | **GET** /users/{userId}/following | Get users being followed |
| [**searchUsers**](UserApi.md#searchUsers) | **GET** /search/users | Search for users |
| [**unfollowUser**](UserApi.md#unfollowUser) | **DELETE** /users/{userId}/follow | Unfollow a user |
| [**updateUserById**](UserApi.md#updateUserById) | **PUT** /users/{userId} | Update user profile |



## followUser

> GetUserById200Response followUser(userId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            GetUserById200Response result = apiInstance.followUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#followUser");
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

[**GetUserById200Response**](GetUserById200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - returning new user profile |  -  |
| **400** |  |  -  |
| **404** |  |  -  |


## getFeed

> GetRecipesForEntity200Response getFeed(type)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String type = "explore"; // String | 
        try {
            GetRecipesForEntity200Response result = apiInstance.getFeed(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getFeed");
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

[**GetRecipesForEntity200Response**](GetRecipesForEntity200Response.md)

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


## getMe

> GetUserById200Response getMe()

Get own profile

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            GetUserById200Response result = apiInstance.getMe();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getMe");
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

[**GetUserById200Response**](GetUserById200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** |  |  -  |


## getUserById

> GetUserById200Response getUserById(userId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            GetUserById200Response result = apiInstance.getUserById(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserById");
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

[**GetUserById200Response**](GetUserById200Response.md)

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


## getUserFollowers

> GetUserFollowing200Response getUserFollowers(userId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            GetUserFollowing200Response result = apiInstance.getUserFollowers(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFollowers");
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

[**GetUserFollowing200Response**](GetUserFollowing200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## getUserFollowing

> GetUserFollowing200Response getUserFollowing(userId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            GetUserFollowing200Response result = apiInstance.getUserFollowing(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFollowing");
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

[**GetUserFollowing200Response**](GetUserFollowing200Response.md)

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


## searchUsers

> GetUserFollowing200Response searchUsers(q)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        String q = "q_example"; // String | 
        try {
            GetUserFollowing200Response result = apiInstance.searchUsers(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#searchUsers");
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

[**GetUserFollowing200Response**](GetUserFollowing200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## unfollowUser

> GetUserById200Response unfollowUser(userId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            GetUserById200Response result = apiInstance.unfollowUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#unfollowUser");
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

[**GetUserById200Response**](GetUserById200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - returning new user profile |  -  |
| **400** |  |  -  |
| **404** |  |  -  |


## updateUserById

> GetUserById200Response updateUserById(userId, userProfile)

Update user profile

Can only update own profile

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        UserProfile userProfile = new UserProfile(); // UserProfile | 
        try {
            GetUserById200Response result = apiInstance.updateUserById(userId, userProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUserById");
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

[**GetUserById200Response**](GetUserById200Response.md)

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

