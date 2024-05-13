# InferenceGraphApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIGMetadata**](InferenceGraphApi.md#createIGMetadata) | **POST** /api/v1/projects/{project_id}/skills/ig | Create a Inference Graph |
| [**deleteIg**](InferenceGraphApi.md#deleteIg) | **DELETE** /api/v1/projects/{project_id}/ig/{ig_id} | Delete a Inference Graph |
| [**getAllIgs**](InferenceGraphApi.md#getAllIgs) | **GET** /api/v1/projects/{project_id}/skills/ig | Get all ig&#39;s for a Project |
| [**getIg**](InferenceGraphApi.md#getIg) | **GET** /api/v1/projects/{project_id}/ig/{ig_id} | Get Inference Graph Details |
| [**lockIg**](InferenceGraphApi.md#lockIg) | **POST** /api/v1/projects/{project_id}/ig/{ig_id}/lock | Lock a Inference Graph |
| [**updateIGMetadata**](InferenceGraphApi.md#updateIGMetadata) | **PATCH** /api/v1/projects/{project_id}/ig/{ig_id} | Update Inference Graph Metadata |
| [**updateIg**](InferenceGraphApi.md#updateIg) | **PUT** /api/v1/projects/{project_id}/ig/{ig_id}/{action} | Update a Inference Graph |



## createIGMetadata

> CreateIGMetadata201Response createIGMetadata(projectId, createIGMetadataRequest)

Create a Inference Graph

Create a new Inference Graph within a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project in which to create the Inference Graph.
        CreateIGMetadataRequest createIGMetadataRequest = new CreateIGMetadataRequest(); // CreateIGMetadataRequest | 
        try {
            CreateIGMetadata201Response result = apiInstance.createIGMetadata(projectId, createIGMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#createIGMetadata");
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
| **projectId** | **String**| The ID of the project in which to create the Inference Graph. | |
| **createIGMetadataRequest** | [**CreateIGMetadataRequest**](CreateIGMetadataRequest.md)|  | |

### Return type

[**CreateIGMetadata201Response**](CreateIGMetadata201Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Inference Graph created successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## deleteIg

> deleteIg(projectId, igId)

Delete a Inference Graph

Delete a specific Inference Graph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the Inference Graph.
        String igId = "igId_example"; // String | The ID of the Inference Graph to delete.
        try {
            apiInstance.deleteIg(projectId, igId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#deleteIg");
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
| **projectId** | **String**| The ID of the project containing the Inference Graph. | |
| **igId** | **String**| The ID of the Inference Graph to delete. | |

### Return type

null (empty response body)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Inference Graph deleted successfully. |  -  |
| **404** | Not Found. The project or Inference Graph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getAllIgs

> List&lt;SkillMetadataResponse&gt; getAllIgs(projectId, page, limit, sortBy, sortOrder)

Get all ig&#39;s for a Project

Retrieve a list of Inference Graph for a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project to retrieve Inference Graph for.
        Integer page = 56; // Integer | The page number for pagination (default: 0). 
        Integer limit = 56; // Integer | The maximum number of dts to return per page (default: 10). 
        String sortBy = "sortBy_example"; // String | Sort by field (default: modifiedOn). 
        String sortOrder = "asc"; // String | Sort order (default: desc). 
        try {
            List<SkillMetadataResponse> result = apiInstance.getAllIgs(projectId, page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#getAllIgs");
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
| **projectId** | **String**| The ID of the project to retrieve Inference Graph for. | |
| **page** | **Integer**| The page number for pagination (default: 0).  | [optional] |
| **limit** | **Integer**| The maximum number of dts to return per page (default: 10).  | [optional] |
| **sortBy** | **String**| Sort by field (default: modifiedOn).  | [optional] |
| **sortOrder** | **String**| Sort order (default: desc).  | [optional] [enum: asc, desc] |

### Return type

[**List&lt;SkillMetadataResponse&gt;**](SkillMetadataResponse.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully retrieved igs for the project.  |  -  |
| **404** | Not Found. The project with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getIg

> SkillDetails getIg(projectId, igId)

Get Inference Graph Details

Retrieve details of a specific Inference Graph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the Inference Graph.
        String igId = "igId_example"; // String | The ID of the Inference Graph to retrieve.
        try {
            SkillDetails result = apiInstance.getIg(projectId, igId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#getIg");
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
| **projectId** | **String**| The ID of the project containing the Inference Graph. | |
| **igId** | **String**| The ID of the Inference Graph to retrieve. | |

### Return type

[**SkillDetails**](SkillDetails.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Inference Graph details retrieved successfully. |  -  |
| **404** | Not Found. The project or Inference Graph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## lockIg

> LockResponse lockIg(projectId, igId, lockRequest)

Lock a Inference Graph

Lock a specific Inference Graph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the Inference Graph.
        String igId = "igId_example"; // String | The ID of the Inference Graph to lock.
        LockRequest lockRequest = new LockRequest(); // LockRequest | Lock request payload.
        try {
            LockResponse result = apiInstance.lockIg(projectId, igId, lockRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#lockIg");
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
| **projectId** | **String**| The ID of the project containing the Inference Graph. | |
| **igId** | **String**| The ID of the Inference Graph to lock. | |
| **lockRequest** | [**LockRequest**](LockRequest.md)| Lock request payload. | |

### Return type

[**LockResponse**](LockResponse.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inference Graph locked successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or Inference Graph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## updateIGMetadata

> UpdateOntologyMetadata200Response updateIGMetadata(projectId, igId, createIGMetadataRequest)

Update Inference Graph Metadata

Update the metadata (name and description) of a specific Inference Graph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the Inference Graph.
        String igId = "igId_example"; // String | The ID of the Inference Graph to update.
        CreateIGMetadataRequest createIGMetadataRequest = new CreateIGMetadataRequest(); // CreateIGMetadataRequest | 
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateIGMetadata(projectId, igId, createIGMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#updateIGMetadata");
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
| **projectId** | **String**| The ID of the project containing the Inference Graph. | |
| **igId** | **String**| The ID of the Inference Graph to update. | |
| **createIGMetadataRequest** | [**CreateIGMetadataRequest**](CreateIGMetadataRequest.md)|  | |

### Return type

[**UpdateOntologyMetadata200Response**](UpdateOntologyMetadata200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Inference Graph metadata updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or Inference Graph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## updateIg

> UpdateOntologyMetadata200Response updateIg(projectId, igId, action, skillDetails)

Update a Inference Graph

Update a specific Inference Graph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InferenceGraphApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InferenceGraphApi apiInstance = new InferenceGraphApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the Inference Graph.
        String igId = "igId_example"; // String | The ID of the Inference Graph to update.
        String action = "draft"; // String | The action to perform (\"draft\" or \"published\").
        SkillDetails skillDetails = new SkillDetails(); // SkillDetails | Update request payload.
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateIg(projectId, igId, action, skillDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceGraphApi#updateIg");
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
| **projectId** | **String**| The ID of the project containing the Inference Graph. | |
| **igId** | **String**| The ID of the Inference Graph to update. | |
| **action** | **String**| The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). | [enum: draft, published] |
| **skillDetails** | [**SkillDetails**](SkillDetails.md)| Update request payload. | |

### Return type

[**UpdateOntologyMetadata200Response**](UpdateOntologyMetadata200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Inference Graph updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or Inference Graph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |

