# ProjectsApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProject**](ProjectsApi.md#addProject) | **POST** /api/v1/projects | Create a new project |
| [**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /api/v1/projects/{projectId} | Delete a project |
| [**findPetsByStatus**](ProjectsApi.md#findPetsByStatus) | **GET** /api/v1/projects | list all the projects in the tenant |
| [**updateProject**](ProjectsApi.md#updateProject) | **PATCH** /api/v1/projects/{projectId} | Update a project |



## addProject

> AddProject200Response addProject(addProjectRequest)

Create a new project

Add a new project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        AddProjectRequest addProjectRequest = new AddProjectRequest(); // AddProjectRequest | Project details
        try {
            AddProject200Response result = apiInstance.addProject(addProjectRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#addProject");
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
| **addProjectRequest** | [**AddProjectRequest**](AddProjectRequest.md)| Project details | |

### Return type

[**AddProject200Response**](AddProject200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project created successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |


## deleteProject

> deleteProject(projectId)

Delete a project

Delete a project by its unique ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String projectId = "projectId_example"; // String | ID of the project to delete
        try {
            apiInstance.deleteProject(projectId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#deleteProject");
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
| **projectId** | **String**| ID of the project to delete | |

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
| **200** | Project deleted successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Project not found |  -  |
| **500** | Internal Server Error |  -  |


## findPetsByStatus

> FindPetsByStatus200Response findPetsByStatus(page, limit, sortBy, sortOrder)

list all the projects in the tenant

Multiple status values can be provided with comma separated strings

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        Integer page = 56; // Integer | Page number (e.g., 0)
        Integer limit = 56; // Integer | Number of items per page (e.g., 10)
        String sortBy = "sortBy_example"; // String | Field to sort by (e.g., modifiedOn)
        String sortOrder = "sortOrder_example"; // String | Sort order (e.g., desc)
        try {
            FindPetsByStatus200Response result = apiInstance.findPetsByStatus(page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#findPetsByStatus");
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
| **page** | **Integer**| Page number (e.g., 0) | [optional] |
| **limit** | **Integer**| Number of items per page (e.g., 10) | [optional] |
| **sortBy** | **String**| Field to sort by (e.g., modifiedOn) | [optional] |
| **sortOrder** | **String**| Sort order (e.g., desc) | [optional] |

### Return type

[**FindPetsByStatus200Response**](FindPetsByStatus200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of projects |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |


## updateProject

> UpdateProject200Response updateProject(projectId, updateProjectRequest)

Update a project

Update specific fields of an existing project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String projectId = "projectId_example"; // String | ID of the project to update
        UpdateProjectRequest updateProjectRequest = new UpdateProjectRequest(); // UpdateProjectRequest | Fields to update
        try {
            UpdateProject200Response result = apiInstance.updateProject(projectId, updateProjectRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#updateProject");
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
| **projectId** | **String**| ID of the project to update | |
| **updateProjectRequest** | [**UpdateProjectRequest**](UpdateProjectRequest.md)| Fields to update | |

### Return type

[**UpdateProject200Response**](UpdateProject200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project updated successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Project not found |  -  |
| **500** | Internal Server Error |  -  |

