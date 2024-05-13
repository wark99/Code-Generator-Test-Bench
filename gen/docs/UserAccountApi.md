# UserAccountApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiUserAccountPost**](UserAccountApi.md#apiUserAccountPost) | **POST** /api/user-account |  |
| [**apiUserAccountTargetIdDelete**](UserAccountApi.md#apiUserAccountTargetIdDelete) | **DELETE** /api/user-account/{target_id} |  |
| [**apiUserAccountTargetIdPut**](UserAccountApi.md#apiUserAccountTargetIdPut) | **PUT** /api/user-account/{target_id} |  |



## apiUserAccountPost

> BaseHttpActionPostCorrectResponseModel apiUserAccountPost(userAccountPostDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserAccountApi apiInstance = new UserAccountApi(defaultClient);
        UserAccountPostDTO userAccountPostDTO = new UserAccountPostDTO(); // UserAccountPostDTO | 
        try {
            BaseHttpActionPostCorrectResponseModel result = apiInstance.apiUserAccountPost(userAccountPostDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAccountApi#apiUserAccountPost");
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
| **userAccountPostDTO** | [**UserAccountPostDTO**](UserAccountPostDTO.md)|  | |

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


## apiUserAccountTargetIdDelete

> BaseHttpActionDeleteCorrectResponseModel apiUserAccountTargetIdDelete(targetId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserAccountApi apiInstance = new UserAccountApi(defaultClient);
        Integer targetId = 56; // Integer | 
        try {
            BaseHttpActionDeleteCorrectResponseModel result = apiInstance.apiUserAccountTargetIdDelete(targetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAccountApi#apiUserAccountTargetIdDelete");
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


## apiUserAccountTargetIdPut

> BaseHttpActionPutCorrectResponseModel apiUserAccountTargetIdPut(targetId, userAccountPutDTO)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserAccountApi apiInstance = new UserAccountApi(defaultClient);
        Integer targetId = 56; // Integer | 
        UserAccountPutDTO userAccountPutDTO = new UserAccountPutDTO(); // UserAccountPutDTO | 
        try {
            BaseHttpActionPutCorrectResponseModel result = apiInstance.apiUserAccountTargetIdPut(targetId, userAccountPutDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAccountApi#apiUserAccountTargetIdPut");
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
| **userAccountPutDTO** | [**UserAccountPutDTO**](UserAccountPutDTO.md)|  | |

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

