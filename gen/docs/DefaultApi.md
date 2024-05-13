# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCommentBlogCommentBlogIdPatch**](DefaultApi.md#addCommentBlogCommentBlogIdPatch) | **PATCH** /blog/comment/{blog_id} | Add Comment |
| [**createBlogBlogCreatePost**](DefaultApi.md#createBlogBlogCreatePost) | **POST** /blog/create | Create Blog |
| [**deleteUserPostBlogDeleteBlogIdDelete**](DefaultApi.md#deleteUserPostBlogDeleteBlogIdDelete) | **DELETE** /blog/delete/{blog_id} | Delete User Post |
| [**getAllBlogBlogGet**](DefaultApi.md#getAllBlogBlogGet) | **GET** /blog/ | Get All Blog |
| [**getAllUserUserGet**](DefaultApi.md#getAllUserUserGet) | **GET** /user/ | Get All User |
| [**getBlogCommentsBlogCommentsBlogIdGet**](DefaultApi.md#getBlogCommentsBlogCommentsBlogIdGet) | **GET** /blog/comments/{blog_id} | Get Blog Comments |
| [**getUserPostBlogUserUserIdGet**](DefaultApi.md#getUserPostBlogUserUserIdGet) | **GET** /blog/user/{user_id} | Get User Post |
| [**updateBlogBlogUpdateUserIdPut**](DefaultApi.md#updateBlogBlogUpdateUserIdPut) | **PUT** /blog/update/{user_id} | Update Blog |
| [**userLoginUserLoginPost**](DefaultApi.md#userLoginUserLoginPost) | **POST** /user/login | User Login |
| [**userSignupUserSignupPost**](DefaultApi.md#userSignupUserSignupPost) | **POST** /user/signup | User Signup |



## addCommentBlogCommentBlogIdPatch

> Object addCommentBlogCommentBlogIdPatch(blogId, updateCommentRequest)

Add Comment

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String blogId = "blogId_example"; // String | 
        UpdateCommentRequest updateCommentRequest = new UpdateCommentRequest(); // UpdateCommentRequest | 
        try {
            Object result = apiInstance.addCommentBlogCommentBlogIdPatch(blogId, updateCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addCommentBlogCommentBlogIdPatch");
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
| **blogId** | **String**|  | |
| **updateCommentRequest** | [**UpdateCommentRequest**](UpdateCommentRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## createBlogBlogCreatePost

> Object createBlogBlogCreatePost(createBlogRequest)

Create Blog

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateBlogRequest createBlogRequest = new CreateBlogRequest(); // CreateBlogRequest | 
        try {
            Object result = apiInstance.createBlogBlogCreatePost(createBlogRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createBlogBlogCreatePost");
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
| **createBlogRequest** | [**CreateBlogRequest**](CreateBlogRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteUserPostBlogDeleteBlogIdDelete

> Object deleteUserPostBlogDeleteBlogIdDelete(blogId)

Delete User Post

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String blogId = "blogId_example"; // String | 
        try {
            Object result = apiInstance.deleteUserPostBlogDeleteBlogIdDelete(blogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteUserPostBlogDeleteBlogIdDelete");
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
| **blogId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getAllBlogBlogGet

> Object getAllBlogBlogGet()

Get All Blog

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            Object result = apiInstance.getAllBlogBlogGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAllBlogBlogGet");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAllUserUserGet

> Object getAllUserUserGet()

Get All User

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            Object result = apiInstance.getAllUserUserGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAllUserUserGet");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getBlogCommentsBlogCommentsBlogIdGet

> Object getBlogCommentsBlogCommentsBlogIdGet(blogId)

Get Blog Comments

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String blogId = "blogId_example"; // String | 
        try {
            Object result = apiInstance.getBlogCommentsBlogCommentsBlogIdGet(blogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getBlogCommentsBlogCommentsBlogIdGet");
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
| **blogId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getUserPostBlogUserUserIdGet

> Object getUserPostBlogUserUserIdGet(userId)

Get User Post

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String userId = "userId_example"; // String | 
        try {
            Object result = apiInstance.getUserPostBlogUserUserIdGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getUserPostBlogUserUserIdGet");
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
| **userId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateBlogBlogUpdateUserIdPut

> Object updateBlogBlogUpdateUserIdPut(updateBlogRequest)

Update Blog

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UpdateBlogRequest updateBlogRequest = new UpdateBlogRequest(); // UpdateBlogRequest | 
        try {
            Object result = apiInstance.updateBlogBlogUpdateUserIdPut(updateBlogRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateBlogBlogUpdateUserIdPut");
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
| **updateBlogRequest** | [**UpdateBlogRequest**](UpdateBlogRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## userLoginUserLoginPost

> Object userLoginUserLoginPost(userLoginSchema)

User Login

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UserLoginSchema userLoginSchema = new UserLoginSchema(); // UserLoginSchema | 
        try {
            Object result = apiInstance.userLoginUserLoginPost(userLoginSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#userLoginUserLoginPost");
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
| **userLoginSchema** | [**UserLoginSchema**](UserLoginSchema.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## userSignupUserSignupPost

> UserSchema userSignupUserSignupPost(userSchema)

User Signup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UserSchema userSchema = new UserSchema(); // UserSchema | 
        try {
            UserSchema result = apiInstance.userSignupUserSignupPost(userSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#userSignupUserSignupPost");
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
| **userSchema** | [**UserSchema**](UserSchema.md)|  | [optional] |

### Return type

[**UserSchema**](UserSchema.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

