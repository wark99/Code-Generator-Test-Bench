# ChoreographApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChoreograpghMetadata**](ChoreographApi.md#createChoreograpghMetadata) | **POST** /api/v1/projects/{project_id}/choreographs | Create a Choreograph |
| [**deleteChoreograph**](ChoreographApi.md#deleteChoreograph) | **DELETE** /api/v1/projects/{project_id}/choreographs/{choreograph_id} | Delete a Choreograph |
| [**getAllChoreographs**](ChoreographApi.md#getAllChoreographs) | **GET** /api/v1/projects/{project_id}/choreographs | Get all  Choreographs for a Project |
| [**getChoreograph**](ChoreographApi.md#getChoreograph) | **GET** /api/v1/projects/{project_id}/choreographs/{choreograph_id} | Get Choreograph Details |
| [**lockChoreograph**](ChoreographApi.md#lockChoreograph) | **POST** /api/v1/projects/{project_id}/choreographs/{choreograph_id}/lock | Lock a Choreograph |
| [**updateChoreograph**](ChoreographApi.md#updateChoreograph) | **PUT** /api/v1/projects/{project_id}/choreographs/{choreograph_id}/{action} | Update a Choreograph |
| [**updateChoreographMetadata**](ChoreographApi.md#updateChoreographMetadata) | **PATCH** /api/v1/projects/{project_id}/choreographs/{choreograph_id} | Update Choreograph Metadata |



## createChoreograpghMetadata

> CreateChoreograpghMetadata201Response createChoreograpghMetadata(projectId, createChoreograpghMetadataRequest)

Create a Choreograph

Create a new choreograph within a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project in which to create the choreograph.
        CreateChoreograpghMetadataRequest createChoreograpghMetadataRequest = new CreateChoreograpghMetadataRequest(); // CreateChoreograpghMetadataRequest | 
        try {
            CreateChoreograpghMetadata201Response result = apiInstance.createChoreograpghMetadata(projectId, createChoreograpghMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#createChoreograpghMetadata");
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
| **projectId** | **String**| The ID of the project in which to create the choreograph. | |
| **createChoreograpghMetadataRequest** | [**CreateChoreograpghMetadataRequest**](CreateChoreograpghMetadataRequest.md)|  | |

### Return type

[**CreateChoreograpghMetadata201Response**](CreateChoreograpghMetadata201Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Choreograph created successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## deleteChoreograph

> deleteChoreograph(projectId, choreographId)

Delete a Choreograph

Delete a specific choreograph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the choreograph.
        String choreographId = "choreographId_example"; // String | The ID of the choreograph to delete.
        try {
            apiInstance.deleteChoreograph(projectId, choreographId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#deleteChoreograph");
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
| **projectId** | **String**| The ID of the project containing the choreograph. | |
| **choreographId** | **String**| The ID of the choreograph to delete. | |

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
| **204** | Choreograph deleted successfully. |  -  |
| **404** | Not Found. The project or choreograph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getAllChoreographs

> List&lt;Choreograph&gt; getAllChoreographs(projectId, page, limit, sortBy, sortOrder)

Get all  Choreographs for a Project

Retrieve a list of choreographs for a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project to retrieve choreographs for.
        Integer page = 56; // Integer | The page number for pagination (default: 0). 
        Integer limit = 56; // Integer | The maximum number of choreographs to return per page (default: 10). 
        String sortBy = "sortBy_example"; // String | Sort by field (default: modifiedOn). 
        String sortOrder = "asc"; // String | Sort order (default: desc). 
        try {
            List<Choreograph> result = apiInstance.getAllChoreographs(projectId, page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#getAllChoreographs");
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
| **projectId** | **String**| The ID of the project to retrieve choreographs for. | |
| **page** | **Integer**| The page number for pagination (default: 0).  | [optional] |
| **limit** | **Integer**| The maximum number of choreographs to return per page (default: 10).  | [optional] |
| **sortBy** | **String**| Sort by field (default: modifiedOn).  | [optional] |
| **sortOrder** | **String**| Sort order (default: desc).  | [optional] [enum: asc, desc] |

### Return type

[**List&lt;Choreograph&gt;**](Choreograph.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully retrieved choreographs for the project.  |  -  |
| **404** | Not Found. The project with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getChoreograph

> ChoreographDetails getChoreograph(projectId, choreographId)

Get Choreograph Details

Retrieve details of a specific choreograph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the choreograph.
        String choreographId = "choreographId_example"; // String | The ID of the choreograph to retrieve.
        try {
            ChoreographDetails result = apiInstance.getChoreograph(projectId, choreographId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#getChoreograph");
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
| **projectId** | **String**| The ID of the project containing the choreograph. | |
| **choreographId** | **String**| The ID of the choreograph to retrieve. | |

### Return type

[**ChoreographDetails**](ChoreographDetails.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Choreograph details retrieved successfully. |  -  |
| **404** | Not Found. The project or choreograph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## lockChoreograph

> LockResponse lockChoreograph(projectId, choreographId, lockRequest)

Lock a Choreograph

Lock a specific choreograph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the choreograph.
        String choreographId = "choreographId_example"; // String | The ID of the choreograph to lock.
        LockRequest lockRequest = new LockRequest(); // LockRequest | Lock request payload.
        try {
            LockResponse result = apiInstance.lockChoreograph(projectId, choreographId, lockRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#lockChoreograph");
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
| **projectId** | **String**| The ID of the project containing the choreograph. | |
| **choreographId** | **String**| The ID of the choreograph to lock. | |
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
| **200** | Choreograph locked successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or choreograph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## updateChoreograph

> UpdateOntologyMetadata200Response updateChoreograph(projectId, choreographId, action, choreographUpdate)

Update a Choreograph

Update a specific choreograph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the choreograph.
        String choreographId = "choreographId_example"; // String | The ID of the choreograph to update.
        String action = "draft"; // String | The action to perform (\"draft\" or \"published\").
        ChoreographUpdate choreographUpdate = new ChoreographUpdate(); // ChoreographUpdate | Update request payload.
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateChoreograph(projectId, choreographId, action, choreographUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#updateChoreograph");
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
| **projectId** | **String**| The ID of the project containing the choreograph. | |
| **choreographId** | **String**| The ID of the choreograph to update. | |
| **action** | **String**| The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). | [enum: draft, published] |
| **choreographUpdate** | [**ChoreographUpdate**](ChoreographUpdate.md)| Update request payload. | |

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
| **201** | Choreograph updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or choreograph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## updateChoreographMetadata

> UpdateOntologyMetadata200Response updateChoreographMetadata(projectId, choreographId, createChoreograpghMetadataRequest)

Update Choreograph Metadata

Update the metadata (name and description) of a specific choreograph within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChoreographApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ChoreographApi apiInstance = new ChoreographApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the choreograph.
        String choreographId = "choreographId_example"; // String | The ID of the choreograph to update.
        CreateChoreograpghMetadataRequest createChoreograpghMetadataRequest = new CreateChoreograpghMetadataRequest(); // CreateChoreograpghMetadataRequest | 
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateChoreographMetadata(projectId, choreographId, createChoreograpghMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChoreographApi#updateChoreographMetadata");
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
| **projectId** | **String**| The ID of the project containing the choreograph. | |
| **choreographId** | **String**| The ID of the choreograph to update. | |
| **createChoreograpghMetadataRequest** | [**CreateChoreograpghMetadataRequest**](CreateChoreograpghMetadataRequest.md)|  | |

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
| **201** | Choreograph metadata updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or choreograph with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |

