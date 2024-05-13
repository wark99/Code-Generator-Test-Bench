# UserApi

All URIs are relative to *https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UserApi.md#deleteUser) | **DELETE** /User/{Customer_Id} | Deletes a User |
| [**getuser**](UserApi.md#getuser) | **GET** /user |  |
| [**registered**](UserApi.md#registered) | **POST** /user |  |
| [**update**](UserApi.md#update) | **PUT** /User/{Customer_Id} | Update an existing user |
| [**updateUserPatch**](UserApi.md#updateUserPatch) | **PATCH** /User/{Customer_Id} | Update an existing user |
| [**userCustomerIdGet**](UserApi.md#userCustomerIdGet) | **GET** /User/{Customer_Id} | Get user by ID |



## deleteUser

> deleteUser(customerId)

Deletes a User

Delete a user

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        UserApi apiInstance = new UserApi(defaultClient);
        Long customerId = 56L; // Long | User ID to delete
        try {
            apiInstance.deleteUser(customerId);
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
| **customerId** | **Long**| User ID to delete | |

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
| **200** | User Deleted |  -  |
| **400** | Invalid user value |  -  |
| **403** | Forbidden |  -  |


## getuser

> List&lt;UserInput&gt; getuser()



Returns all registered users

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            List<UserInput> result = apiInstance.getuser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getuser");
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

[**List&lt;UserInput&gt;**](UserInput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All the users |  -  |


## registered

> List&lt;UserInput&gt; registered()



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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            List<UserInput> result = apiInstance.registered();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#registered");
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

[**List&lt;UserInput&gt;**](UserInput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **201** | Successfully created a new user |  -  |


## update

> Object update(userInput)

Update an existing user

Update an existing user by ID

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        UserApi apiInstance = new UserApi(defaultClient);
        UserInput userInput = new UserInput(); // UserInput | Update an existing user
        try {
            Object result = apiInstance.update(userInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#update");
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
| **userInput** | [**UserInput**](UserInput.md)| Update an existing user | [optional] |

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
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | User not found |  -  |
| **409** | conflict |  -  |


## updateUserPatch

> updateUserPatch(customerId, userInput)

Update an existing user

Update an existing user by ID using PATCH method

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer customerId = 56; // Integer | ID of the Customer to update
        UserInput userInput = new UserInput(); // UserInput | Updated user information
        try {
            apiInstance.updateUserPatch(customerId, userInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUserPatch");
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
| **customerId** | **Integer**| ID of the Customer to update | |
| **userInput** | [**UserInput**](UserInput.md)| Updated user information | |

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
| **200** | User updated successfully |  -  |
| **204** | No Content |  -  |
| **404** | User not found |  -  |
| **409** | There is a conflict with the current state of the user |  -  |


## userCustomerIdGet

> UserInput userCustomerIdGet(customerId)

Get user by ID

Returns a single user based on the provided ID.

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer customerId = 56; // Integer | 
        try {
            UserInput result = apiInstance.userCustomerIdGet(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userCustomerIdGet");
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
| **customerId** | **Integer**|  | |

### Return type

[**UserInput**](UserInput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | User not found |  -  |

