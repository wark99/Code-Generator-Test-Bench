# UserRoleAccessLevelApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiUserRoleAccessLevelPost**](UserRoleAccessLevelApi.md#apiUserRoleAccessLevelPost) | **POST** /api/user-role-access-level |  |
| [**apiUserRoleAccessLevelTargetIdDelete**](UserRoleAccessLevelApi.md#apiUserRoleAccessLevelTargetIdDelete) | **DELETE** /api/user-role-access-level/{target_id} |  |
| [**apiUserRoleAccessLevelTargetIdPut**](UserRoleAccessLevelApi.md#apiUserRoleAccessLevelTargetIdPut) | **PUT** /api/user-role-access-level/{target_id} |  |



## apiUserRoleAccessLevelPost

> BaseHttpActionPostCorrectResponseModel apiUserRoleAccessLevelPost(userRoleAccessLevelPostDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoleAccessLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserRoleAccessLevelApi apiInstance = new UserRoleAccessLevelApi(defaultClient);
        UserRoleAccessLevelPostDTO userRoleAccessLevelPostDTO = new UserRoleAccessLevelPostDTO(); // UserRoleAccessLevelPostDTO | 
        try {
            BaseHttpActionPostCorrectResponseModel result = apiInstance.apiUserRoleAccessLevelPost(userRoleAccessLevelPostDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleAccessLevelApi#apiUserRoleAccessLevelPost");
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
| **userRoleAccessLevelPostDTO** | [**UserRoleAccessLevelPostDTO**](UserRoleAccessLevelPostDTO.md)|  | |

### Return type

[**BaseHttpActionPostCorrectResponseModel**](BaseHttpActionPostCorrectResponseModel.md)

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


## apiUserRoleAccessLevelTargetIdDelete

> BaseHttpActionDeleteCorrectResponseModel apiUserRoleAccessLevelTargetIdDelete(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoleAccessLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserRoleAccessLevelApi apiInstance = new UserRoleAccessLevelApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            BaseHttpActionDeleteCorrectResponseModel result = apiInstance.apiUserRoleAccessLevelTargetIdDelete(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleAccessLevelApi#apiUserRoleAccessLevelTargetIdDelete");
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
| **targetId** | **Integer**|  | |

### Return type

[**BaseHttpActionDeleteCorrectResponseModel**](BaseHttpActionDeleteCorrectResponseModel.md)

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


## apiUserRoleAccessLevelTargetIdPut

> BaseHttpActionPutCorrectResponseModel apiUserRoleAccessLevelTargetIdPut(targetId, userRoleAccessLevelPutDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoleAccessLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserRoleAccessLevelApi apiInstance = new UserRoleAccessLevelApi(defaultClient);
        Integer targetId = 56; // Integer | 
        UserRoleAccessLevelPutDTO userRoleAccessLevelPutDTO = new UserRoleAccessLevelPutDTO(); // UserRoleAccessLevelPutDTO | 
        try {
            BaseHttpActionPutCorrectResponseModel result = apiInstance.apiUserRoleAccessLevelTargetIdPut(targetId, userRoleAccessLevelPutDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleAccessLevelApi#apiUserRoleAccessLevelTargetIdPut");
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
| **targetId** | **Integer**|  | |
| **userRoleAccessLevelPutDTO** | [**UserRoleAccessLevelPutDTO**](UserRoleAccessLevelPutDTO.md)|  | |

### Return type

[**BaseHttpActionPutCorrectResponseModel**](BaseHttpActionPutCorrectResponseModel.md)

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

