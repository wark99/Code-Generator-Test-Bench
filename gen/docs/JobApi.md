# JobApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**jobApplicationIdRejectPut**](JobApi.md#jobApplicationIdRejectPut) | **PUT** /job/application/{id}/reject | Reject a job application |
| [**jobApplicationIdWithdrawPut**](JobApi.md#jobApplicationIdWithdrawPut) | **PUT** /job/application/{id}/withdraw | Withdraw a job application |
| [**jobCreatePost**](JobApi.md#jobCreatePost) | **POST** /job/create | Post a job ad |
| [**jobGet**](JobApi.md#jobGet) | **GET** /job | Get all job posts by currently logged in user |
| [**jobIdAppGet**](JobApi.md#jobIdAppGet) | **GET** /job/{id}/{app} | get job post |
| [**jobIdApplyPost**](JobApi.md#jobIdApplyPost) | **POST** /job/{id}/apply | process job application |
| [**jobIdEditPut**](JobApi.md#jobIdEditPut) | **PUT** /job/{id}/edit | edit a job post |
| [**jobIdStatsGet**](JobApi.md#jobIdStatsGet) | **GET** /job/{id}/stats | get stats for a job post |
| [**jobIdTerminatePut**](JobApi.md#jobIdTerminatePut) | **PUT** /job/{id}/terminate | Ends a job advert |
| [**jobIdViewedPut**](JobApi.md#jobIdViewedPut) | **PUT** /job/{id}/viewed | keeps track of job views |



## jobApplicationIdRejectPut

> jobApplicationIdRejectPut(id)

Reject a job application

allows a parent to reject job application from a provider

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        try {
            apiInstance.jobApplicationIdRejectPut(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobApplicationIdRejectPut");
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
| **id** | **String**|  | |

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
| **204** | Job application successfully rejected |  -  |
| **400** | Unable to reject job application |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobApplicationIdWithdrawPut

> jobApplicationIdWithdrawPut(id)

Withdraw a job application

Allows a provider to withdraw a job application

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        try {
            apiInstance.jobApplicationIdWithdrawPut(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobApplicationIdWithdrawPut");
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
| **id** | **String**|  | |

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
| **204** | Job application successfully withdrawn |  -  |
| **400** | Unable to withdraw job application |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobCreatePost

> jobCreatePost(jobIdEditPutRequest)

Post a job ad

Posts a job ad. This feature is available to parent account

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        JobIdEditPutRequest jobIdEditPutRequest = new JobIdEditPutRequest(); // JobIdEditPutRequest | 
        try {
            apiInstance.jobCreatePost(jobIdEditPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobCreatePost");
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
| **jobIdEditPutRequest** | [**JobIdEditPutRequest**](JobIdEditPutRequest.md)|  | [optional] |

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
| **201** | Job Add posted successfully |  -  |
| **400** | Unable to create profile. |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobGet

> List&lt;JobIdAppGet200Response&gt; jobGet()

Get all job posts by currently logged in user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        try {
            List<JobIdAppGet200Response> result = apiInstance.jobGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobGet");
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

[**List&lt;JobIdAppGet200Response&gt;**](JobIdAppGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job posts retrieved successfully |  -  |
| **400** | Unable to create profile. |  -  |
| **0** | Unexpected Error |  -  |


## jobIdAppGet

> JobIdAppGet200Response jobIdAppGet(id, app)

get job post

This retrieves a job post and may include information about applications to that job

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        Boolean app = false; // Boolean | When true job applications are retrieved with the job post otherwise set false to retrieve only job post details 
        try {
            JobIdAppGet200Response result = apiInstance.jobIdAppGet(id, app);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobIdAppGet");
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
| **id** | **String**|  | |
| **app** | **Boolean**| When true job applications are retrieved with the job post otherwise set false to retrieve only job post details  | |

### Return type

[**JobIdAppGet200Response**](JobIdAppGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job post retrieved successfully |  -  |
| **400** | Unable to retrieve job post |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobIdApplyPost

> jobIdApplyPost(id, jobIdApplyPostRequest)

process job application

This processes job application and parent who posted the job is notified

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        JobIdApplyPostRequest jobIdApplyPostRequest = new JobIdApplyPostRequest(); // JobIdApplyPostRequest | 
        try {
            apiInstance.jobIdApplyPost(id, jobIdApplyPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobIdApplyPost");
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
| **id** | **String**|  | |
| **jobIdApplyPostRequest** | [**JobIdApplyPostRequest**](JobIdApplyPostRequest.md)|  | [optional] |

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
| **201** | Job application successfully submitted |  -  |
| **400** | Unable to submit job application |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobIdEditPut

> jobIdEditPut(id, jobIdEditPutRequest)

edit a job post

This allows a parent to edit a job post. A job post can&#39;t be edited if the status is &#x60;expired&#x60; or &#x60;abandoned&#x60;. If someone has already applied to the job, then title and description can&#39;t be edited. If your job post isn&#39;t already active, as in it is in a &#x60;draft&#x60; state and the start date is in future then you are allowed to change the start date. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        JobIdEditPutRequest jobIdEditPutRequest = new JobIdEditPutRequest(); // JobIdEditPutRequest | 
        try {
            apiInstance.jobIdEditPut(id, jobIdEditPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobIdEditPut");
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
| **id** | **String**|  | |
| **jobIdEditPutRequest** | [**JobIdEditPutRequest**](JobIdEditPutRequest.md)|  | [optional] |

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
| **201** | Job post updated successfully |  -  |
| **400** | Unable to update job post |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobIdStatsGet

> JobIdStatsGet200Response jobIdStatsGet(id)

get stats for a job post

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        try {
            JobIdStatsGet200Response result = apiInstance.jobIdStatsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobIdStatsGet");
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
| **id** | **String**|  | |

### Return type

[**JobIdStatsGet200Response**](JobIdStatsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully returns job stats |  -  |
| **400** | Unable to update job post |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## jobIdTerminatePut

> jobIdTerminatePut(id)

Ends a job advert

This terminates a job ad. The job Ad must be live before user can terminate it.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.jobIdTerminatePut(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobIdTerminatePut");
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
| **id** | **String**|  | |

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
| **204** | No Content. Job Terminated |  -  |
| **400** | Unable to create profile. |  -  |
| **0** | Unexpected Error |  -  |


## jobIdViewedPut

> jobIdViewedPut(id)

keeps track of job views

keeps track of how many times a job has been viewed

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        JobApi apiInstance = new JobApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        try {
            apiInstance.jobIdViewedPut(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#jobIdViewedPut");
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
| **id** | **String**|  | |

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
| **204** | Job successfully marked a viewed |  -  |
| **400** | Unable to mark job as viewed |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

