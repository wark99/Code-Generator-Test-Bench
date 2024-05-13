# UserApi

All URIs are relative to *http://localhost:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersGet**](UserApi.md#usersGet) | **GET** /users | Retrieve a list of all users |
| [**usersIdDelete**](UserApi.md#usersIdDelete) | **DELETE** /users/{id} | Delete a specific user by ID |
| [**usersIdGet**](UserApi.md#usersIdGet) | **GET** /users/{id} | Retrieve the details of a specific user by ID |
| [**usersIdPatch**](UserApi.md#usersIdPatch) | **PATCH** /users/{id} | Apply partial updates to a specific user by ID |
| [**usersIdPut**](UserApi.md#usersIdPut) | **PUT** /users/{id} | Update the details of a specific user by ID |
| [**usersPost**](UserApi.md#usersPost) | **POST** /users | Create a new user |



## usersGet

> usersGet()

Retrieve a list of all users

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
        defaultClient.setBasePath("http://localhost:8000");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            apiInstance.usersGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersGet");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful and the users are returned. |  -  |
| **400** | The request parameters are invalid. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## usersIdDelete

> usersIdDelete(id)

Delete a specific user by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer id = 2; // Integer | ID of the user to delete
        try {
            apiInstance.usersIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersIdDelete");
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
| **id** | **Integer**| ID of the user to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful and the user is deleted. |  -  |
| **400** | The request parameters are invalid. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## usersIdGet

> usersIdGet(id)

Retrieve the details of a specific user by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer id = 2; // Integer | ID of the user to delete
        try {
            apiInstance.usersIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersIdGet");
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
| **id** | **Integer**| ID of the user to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful and the user details are returned. |  -  |
| **400** | The request parameters are invalid. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## usersIdPatch

> usersIdPatch(id, usersIdPatchRequest)

Apply partial updates to a specific user by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer id = 2; // Integer | ID of the user to update
        UsersIdPatchRequest usersIdPatchRequest = new UsersIdPatchRequest(); // UsersIdPatchRequest | 
        try {
            apiInstance.usersIdPatch(id, usersIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersIdPatch");
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
| **id** | **Integer**| ID of the user to update | |
| **usersIdPatchRequest** | [**UsersIdPatchRequest**](UsersIdPatchRequest.md)|  | |

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
| **200** | The request was successful and the user details are updated. |  -  |
| **400** | The request parameters are invalid. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## usersIdPut

> usersIdPut(id, usersIdPutRequest)

Update the details of a specific user by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer id = 2; // Integer | ID of the user to update
        UsersIdPutRequest usersIdPutRequest = new UsersIdPutRequest(); // UsersIdPutRequest | 
        try {
            apiInstance.usersIdPut(id, usersIdPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersIdPut");
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
| **id** | **Integer**| ID of the user to update | |
| **usersIdPutRequest** | [**UsersIdPutRequest**](UsersIdPutRequest.md)|  | |

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
| **200** | The request was successful and the user details are updated. |  -  |
| **400** | The request parameters are invalid. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## usersPost

> usersPost(usersPostRequest)

Create a new user

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
        defaultClient.setBasePath("http://localhost:8000");

        UserApi apiInstance = new UserApi(defaultClient);
        UsersPostRequest usersPostRequest = new UsersPostRequest(); // UsersPostRequest | 
        try {
            apiInstance.usersPost(usersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#usersPost");
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
| **usersPostRequest** | [**UsersPostRequest**](UsersPostRequest.md)|  | |

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
| **100** | The server has received the initial part of the request and requires the client to continue with the remainder of the request. |  -  |
| **200** | The request was successful and the user was created. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |

