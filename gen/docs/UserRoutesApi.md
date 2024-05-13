# UserRoutesApi

All URIs are relative to *http://localhost:5001/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deactivateUser**](UserRoutesApi.md#deactivateUser) | **PUT** /profile/deactivate-user/user/{userid} | deactivate-user |
| [**getUserDetails**](UserRoutesApi.md#getUserDetails) | **GET** /profile/get-user-details/user/{userid} | get-user-details |
| [**profileGetUserProfilePictureUserUseridGet**](UserRoutesApi.md#profileGetUserProfilePictureUserUseridGet) | **GET** /profile/get-user-profile-picture/user/{userid} | get-user-profile-picture |
| [**profileGetUserStatusUserUseridGet**](UserRoutesApi.md#profileGetUserStatusUserUseridGet) | **GET** /profile/get-user-status/user/{userid} | get-user-status |
| [**profileUpdateUserProfilePictureUserUseridPut**](UserRoutesApi.md#profileUpdateUserProfilePictureUserUseridPut) | **PUT** /profile/update-user-profile-picture/user/{userid} | update-user-profile-picture |
| [**profileUpdateUserStatusUserUseridPut**](UserRoutesApi.md#profileUpdateUserStatusUserUseridPut) | **PUT** /profile/update-user-status/user/{userid} | update-user-status |



## deactivateUser

> deactivateUser(userid, authorization)

deactivate-user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        UserRoutesApi apiInstance = new UserRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            apiInstance.deactivateUser(userid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoutesApi#deactivateUser");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |


## getUserDetails

> getUserDetails(userid, authorization, contentType)

get-user-details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        UserRoutesApi apiInstance = new UserRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        String contentType = "contentType_example"; // String | 
        try {
            apiInstance.getUserDetails(userid, authorization, contentType);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoutesApi#getUserDetails");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |
| **contentType** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |


## profileGetUserProfilePictureUserUseridGet

> profileGetUserProfilePictureUserUseridGet(userid, authorization)

get-user-profile-picture

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        UserRoutesApi apiInstance = new UserRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            apiInstance.profileGetUserProfilePictureUserUseridGet(userid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoutesApi#profileGetUserProfilePictureUserUseridGet");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |

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
| **200** | Successful response |  -  |


## profileGetUserStatusUserUseridGet

> profileGetUserStatusUserUseridGet(userid, authorization)

get-user-status

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        UserRoutesApi apiInstance = new UserRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            apiInstance.profileGetUserStatusUserUseridGet(userid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoutesApi#profileGetUserStatusUserUseridGet");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |

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
| **200** | Successful response |  -  |


## profileUpdateUserProfilePictureUserUseridPut

> profileUpdateUserProfilePictureUserUseridPut(userid, authorization, body)

update-user-profile-picture

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        UserRoutesApi apiInstance = new UserRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        Object body = null; // Object | 
        try {
            apiInstance.profileUpdateUserProfilePictureUserUseridPut(userid, authorization, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoutesApi#profileUpdateUserProfilePictureUserUseridPut");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |
| **body** | **Object**|  | [optional] |

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
| **200** | Successful response |  -  |


## profileUpdateUserStatusUserUseridPut

> profileUpdateUserStatusUserUseridPut(userid, authorization, body)

update-user-status

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        UserRoutesApi apiInstance = new UserRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "authorization_example"; // String | 
        Object body = null; // Object | 
        try {
            apiInstance.profileUpdateUserStatusUserUseridPut(userid, authorization, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoutesApi#profileUpdateUserStatusUserUseridPut");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | |
| **body** | **Object**|  | [optional] |

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
| **200** | Successful response |  -  |

