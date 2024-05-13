# PipelinesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPipelineApiV1PipelinesPost**](PipelinesApi.md#createPipelineApiV1PipelinesPost) | **POST** /api/v1/pipelines/ | Create Pipeline |
| [**listPipelinePhasesApiV1PipelinesPipelineIdPhasesGet**](PipelinesApi.md#listPipelinePhasesApiV1PipelinesPipelineIdPhasesGet) | **GET** /api/v1/pipelines/{pipelineId}/phases/ | List Pipeline Phases |



## createPipelineApiV1PipelinesPost

> Object createPipelineApiV1PipelinesPost(bodyCreatePipelineApiV1PipelinesPost)

Create Pipeline

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        PipelinesApi apiInstance = new PipelinesApi(defaultClient);
        BodyCreatePipelineApiV1PipelinesPost bodyCreatePipelineApiV1PipelinesPost = new BodyCreatePipelineApiV1PipelinesPost(); // BodyCreatePipelineApiV1PipelinesPost | 
        try {
            Object result = apiInstance.createPipelineApiV1PipelinesPost(bodyCreatePipelineApiV1PipelinesPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelinesApi#createPipelineApiV1PipelinesPost");
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
| **bodyCreatePipelineApiV1PipelinesPost** | [**BodyCreatePipelineApiV1PipelinesPost**](BodyCreatePipelineApiV1PipelinesPost.md)|  | |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listPipelinePhasesApiV1PipelinesPipelineIdPhasesGet

> Object listPipelinePhasesApiV1PipelinesPipelineIdPhasesGet(pipelineId)

List Pipeline Phases

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        PipelinesApi apiInstance = new PipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | 
        try {
            Object result = apiInstance.listPipelinePhasesApiV1PipelinesPipelineIdPhasesGet(pipelineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelinesApi#listPipelinePhasesApiV1PipelinesPipelineIdPhasesGet");
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
| **pipelineId** | **String**|  | |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

