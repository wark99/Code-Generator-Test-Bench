# TasksApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1asyncTasksGet**](TasksApi.md#call1asyncTasksGet) | **GET** /1/async/tasks | List tasks |
| [**call1asyncTasksTaskUuidGet**](TasksApi.md#call1asyncTasksTaskUuidGet) | **GET** /1/async/tasks/{task_uuid} | Display a task |



## call1asyncTasksGet

> Model1AsyncTasksGet200Response call1asyncTasksGet(_return, limit, skip, page, perPage, orderBy, order, orderFor)

List tasks

This endpoint allows you to retrieve all the tasks.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer limit = 10; // Integer | *Optional parameter* that define the number of items to return<br /> Part of the `offset` capacity 
        Integer skip = 2; // Integer | *Optional parameter* that define the index of the first item to return (0 = first item)<br /> Part of the `offset` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1AsyncTasksGet200Response result = apiInstance.call1asyncTasksGet(_return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#call1asyncTasksGet");
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
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **limit** | **Integer**| *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **skip** | **Integer**| *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1AsyncTasksGet200Response**](Model1AsyncTasksGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1asyncTasksTaskUuidGet

> Model1AsyncTasksTaskUuidGet200Response call1asyncTasksTaskUuidGet(taskUuid)

Display a task

Returns a variety of information about a single Task specified by the requested unique identifier.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskUuid = "taskUuid_example"; // String | The unique identifier (UUID) of the task to request.
        try {
            Model1AsyncTasksTaskUuidGet200Response result = apiInstance.call1asyncTasksTaskUuidGet(taskUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#call1asyncTasksTaskUuidGet");
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
| **taskUuid** | **String**| The unique identifier (UUID) of the task to request. | |

### Return type

[**Model1AsyncTasksTaskUuidGet200Response**](Model1AsyncTasksTaskUuidGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

