# DepartmentAccessLevelApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDepartmentAccessLevelPost**](DepartmentAccessLevelApi.md#apiDepartmentAccessLevelPost) | **POST** /api/department-access-level |  |
| [**apiDepartmentAccessLevelTargetIdDelete**](DepartmentAccessLevelApi.md#apiDepartmentAccessLevelTargetIdDelete) | **DELETE** /api/department-access-level/{target_id} |  |
| [**apiDepartmentAccessLevelTargetIdPut**](DepartmentAccessLevelApi.md#apiDepartmentAccessLevelTargetIdPut) | **PUT** /api/department-access-level/{target_id} |  |



## apiDepartmentAccessLevelPost

> BaseHttpActionPostCorrectResponseModel apiDepartmentAccessLevelPost(departmentAccessLevelPostDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentAccessLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DepartmentAccessLevelApi apiInstance = new DepartmentAccessLevelApi(defaultClient);
        DepartmentAccessLevelPostDTO departmentAccessLevelPostDTO = new DepartmentAccessLevelPostDTO(); // DepartmentAccessLevelPostDTO | 
        try {
            BaseHttpActionPostCorrectResponseModel result = apiInstance.apiDepartmentAccessLevelPost(departmentAccessLevelPostDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepartmentAccessLevelApi#apiDepartmentAccessLevelPost");
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
| **departmentAccessLevelPostDTO** | [**DepartmentAccessLevelPostDTO**](DepartmentAccessLevelPostDTO.md)|  | |

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


## apiDepartmentAccessLevelTargetIdDelete

> BaseHttpActionDeleteCorrectResponseModel apiDepartmentAccessLevelTargetIdDelete(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentAccessLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DepartmentAccessLevelApi apiInstance = new DepartmentAccessLevelApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            BaseHttpActionDeleteCorrectResponseModel result = apiInstance.apiDepartmentAccessLevelTargetIdDelete(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepartmentAccessLevelApi#apiDepartmentAccessLevelTargetIdDelete");
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


## apiDepartmentAccessLevelTargetIdPut

> BaseHttpActionPutCorrectResponseModel apiDepartmentAccessLevelTargetIdPut(targetId, departmentAccessLevelPutDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentAccessLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DepartmentAccessLevelApi apiInstance = new DepartmentAccessLevelApi(defaultClient);
        Integer targetId = 56; // Integer | 
        DepartmentAccessLevelPutDTO departmentAccessLevelPutDTO = new DepartmentAccessLevelPutDTO(); // DepartmentAccessLevelPutDTO | 
        try {
            BaseHttpActionPutCorrectResponseModel result = apiInstance.apiDepartmentAccessLevelTargetIdPut(targetId, departmentAccessLevelPutDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepartmentAccessLevelApi#apiDepartmentAccessLevelTargetIdPut");
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
| **departmentAccessLevelPutDTO** | [**DepartmentAccessLevelPutDTO**](DepartmentAccessLevelPutDTO.md)|  | |

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

