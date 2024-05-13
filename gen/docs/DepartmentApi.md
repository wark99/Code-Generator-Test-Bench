# DepartmentApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDepartmentPost**](DepartmentApi.md#apiDepartmentPost) | **POST** /api/department |  |
| [**apiDepartmentTargetIdDelete**](DepartmentApi.md#apiDepartmentTargetIdDelete) | **DELETE** /api/department/{target_id} |  |
| [**apiDepartmentTargetIdPut**](DepartmentApi.md#apiDepartmentTargetIdPut) | **PUT** /api/department/{target_id} |  |



## apiDepartmentPost

> BaseHttpActionPostCorrectResponseModel apiDepartmentPost(departmentPostDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DepartmentApi apiInstance = new DepartmentApi(defaultClient);
        DepartmentPostDTO departmentPostDTO = new DepartmentPostDTO(); // DepartmentPostDTO | 
        try {
            BaseHttpActionPostCorrectResponseModel result = apiInstance.apiDepartmentPost(departmentPostDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepartmentApi#apiDepartmentPost");
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
| **departmentPostDTO** | [**DepartmentPostDTO**](DepartmentPostDTO.md)|  | |

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


## apiDepartmentTargetIdDelete

> BaseHttpActionDeleteCorrectResponseModel apiDepartmentTargetIdDelete(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DepartmentApi apiInstance = new DepartmentApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            BaseHttpActionDeleteCorrectResponseModel result = apiInstance.apiDepartmentTargetIdDelete(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepartmentApi#apiDepartmentTargetIdDelete");
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


## apiDepartmentTargetIdPut

> BaseHttpActionPutCorrectResponseModel apiDepartmentTargetIdPut(targetId, departmentPutDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DepartmentApi apiInstance = new DepartmentApi(defaultClient);
        Integer targetId = 56; // Integer | 
        DepartmentPutDTO departmentPutDTO = new DepartmentPutDTO(); // DepartmentPutDTO | 
        try {
            BaseHttpActionPutCorrectResponseModel result = apiInstance.apiDepartmentTargetIdPut(targetId, departmentPutDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepartmentApi#apiDepartmentTargetIdPut");
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
| **departmentPutDTO** | [**DepartmentPutDTO**](DepartmentPutDTO.md)|  | |

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

