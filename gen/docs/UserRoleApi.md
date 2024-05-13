# UserRoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiUserRolePost**](UserRoleApi.md#apiUserRolePost) | **POST** /api/user-role |  |
| [**apiUserRoleTargetIdDelete**](UserRoleApi.md#apiUserRoleTargetIdDelete) | **DELETE** /api/user-role/{target_id} |  |
| [**apiUserRoleTargetIdPut**](UserRoleApi.md#apiUserRoleTargetIdPut) | **PUT** /api/user-role/{target_id} |  |



## apiUserRolePost

> BaseHttpActionPostCorrectResponseModel apiUserRolePost(userRolePostDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserRoleApi apiInstance = new UserRoleApi(defaultClient);
        UserRolePostDTO userRolePostDTO = new UserRolePostDTO(); // UserRolePostDTO | 
        try {
            BaseHttpActionPostCorrectResponseModel result = apiInstance.apiUserRolePost(userRolePostDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleApi#apiUserRolePost");
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
| **userRolePostDTO** | [**UserRolePostDTO**](UserRolePostDTO.md)|  | |

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


## apiUserRoleTargetIdDelete

> BaseHttpActionDeleteCorrectResponseModel apiUserRoleTargetIdDelete(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserRoleApi apiInstance = new UserRoleApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            BaseHttpActionDeleteCorrectResponseModel result = apiInstance.apiUserRoleTargetIdDelete(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleApi#apiUserRoleTargetIdDelete");
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


## apiUserRoleTargetIdPut

> BaseHttpActionPutCorrectResponseModel apiUserRoleTargetIdPut(targetId, userRolePutDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserRoleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserRoleApi apiInstance = new UserRoleApi(defaultClient);
        Integer targetId = 56; // Integer | 
        UserRolePutDTO userRolePutDTO = new UserRolePutDTO(); // UserRolePutDTO | 
        try {
            BaseHttpActionPutCorrectResponseModel result = apiInstance.apiUserRoleTargetIdPut(targetId, userRolePutDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleApi#apiUserRoleTargetIdPut");
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
| **userRolePutDTO** | [**UserRolePutDTO**](UserRolePutDTO.md)|  | |

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

