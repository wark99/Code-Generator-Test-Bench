# DecisionTreeApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createdtMetadata**](DecisionTreeApi.md#createdtMetadata) | **POST** /api/v1/projects/{project_id}/skills/dt | Create a Decision Tree |
| [**deleteDt**](DecisionTreeApi.md#deleteDt) | **DELETE** /api/v1/projects/{project_id}/dt/{dt_id} | Delete a dt |
| [**getAllDts**](DecisionTreeApi.md#getAllDts) | **GET** /api/v1/projects/{project_id}/skills/dt | Get all  dts for a Project |
| [**getDt**](DecisionTreeApi.md#getDt) | **GET** /api/v1/projects/{project_id}/dt/{dt_id} | Get dt Details |
| [**lockDt**](DecisionTreeApi.md#lockDt) | **POST** /api/v1/projects/{project_id}/dt/{dt_id}/lock | Lock a dt |
| [**updateDt**](DecisionTreeApi.md#updateDt) | **PUT** /api/v1/projects/{project_id}/dt/{dt_id}/{action} | Update a dt |
| [**updateDtMetadata**](DecisionTreeApi.md#updateDtMetadata) | **PATCH** /api/v1/projects/{project_id}/dt/{dt_id} | Update dt Metadata |



## createdtMetadata

> CreatedtMetadata201Response createdtMetadata(projectId, createdtMetadataRequest)

Create a Decision Tree

Create a new Decision Tree within a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project in which to create the dt.
        CreatedtMetadataRequest createdtMetadataRequest = new CreatedtMetadataRequest(); // CreatedtMetadataRequest | 
        try {
            CreatedtMetadata201Response result = apiInstance.createdtMetadata(projectId, createdtMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#createdtMetadata");
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
| **projectId** | **String**| The ID of the project in which to create the dt. | |
| **createdtMetadataRequest** | [**CreatedtMetadataRequest**](CreatedtMetadataRequest.md)|  | |

### Return type

[**CreatedtMetadata201Response**](CreatedtMetadata201Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | dt created successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## deleteDt

> deleteDt(projectId, dtId)

Delete a dt

Delete a specific dt within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the dt.
        String dtId = "dtId_example"; // String | The ID of the dt to delete.
        try {
            apiInstance.deleteDt(projectId, dtId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#deleteDt");
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
| **projectId** | **String**| The ID of the project containing the dt. | |
| **dtId** | **String**| The ID of the dt to delete. | |

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
| **204** | dt deleted successfully. |  -  |
| **404** | Not Found. The project or dt with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getAllDts

> List&lt;SkillMetadataResponse&gt; getAllDts(projectId, page, limit, sortBy, sortOrder)

Get all  dts for a Project

Retrieve a list of choreographs for a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project to retrieve choreographs for.
        Integer page = 56; // Integer | The page number for pagination (default: 0). 
        Integer limit = 56; // Integer | The maximum number of dts to return per page (default: 10). 
        String sortBy = "sortBy_example"; // String | Sort by field (default: modifiedOn). 
        String sortOrder = "asc"; // String | Sort order (default: desc). 
        try {
            List<SkillMetadataResponse> result = apiInstance.getAllDts(projectId, page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#getAllDts");
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
| **201** | Successfully retrieved dts for the project.  |  -  |
| **404** | Not Found. The project with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getDt

> SkillDetails getDt(projectId, dtId)

Get dt Details

Retrieve details of a specific dt within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the dt.
        String dtId = "dtId_example"; // String | The ID of the dt to retrieve.
        try {
            SkillDetails result = apiInstance.getDt(projectId, dtId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#getDt");
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
| **projectId** | **String**| The ID of the project containing the dt. | |
| **dtId** | **String**| The ID of the dt to retrieve. | |

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
| **200** | dt details retrieved successfully. |  -  |
| **404** | Not Found. The project or dt with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## lockDt

> LockResponse lockDt(projectId, dtId, lockRequest)

Lock a dt

Lock a specific dt within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the dt.
        String dtId = "dtId_example"; // String | The ID of the dt to lock.
        LockRequest lockRequest = new LockRequest(); // LockRequest | Lock request payload.
        try {
            LockResponse result = apiInstance.lockDt(projectId, dtId, lockRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#lockDt");
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
| **projectId** | **String**| The ID of the project containing the dt. | |
| **dtId** | **String**| The ID of the dt to lock. | |
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
| **200** | dt locked successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or dt with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## updateDt

> UpdateOntologyMetadata200Response updateDt(projectId, dtId, action, skillDetails)

Update a dt

Update a specific dt within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the dt.
        String dtId = "dtId_example"; // String | The ID of the dt to update.
        String action = "draft"; // String | The action to perform (\"draft\" or \"published\").
        SkillDetails skillDetails = new SkillDetails(); // SkillDetails | Update request payload.
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateDt(projectId, dtId, action, skillDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#updateDt");
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
| **projectId** | **String**| The ID of the project containing the dt. | |
| **dtId** | **String**| The ID of the dt to update. | |
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
| **201** | dt updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or dt with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## updateDtMetadata

> UpdateOntologyMetadata200Response updateDtMetadata(projectId, dtId, createdtMetadataRequest)

Update dt Metadata

Update the metadata (name and description) of a specific dt within a project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecisionTreeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DecisionTreeApi apiInstance = new DecisionTreeApi(defaultClient);
        String projectId = "projectId_example"; // String | The ID of the project containing the dt.
        String dtId = "dtId_example"; // String | The ID of the dt to update.
        CreatedtMetadataRequest createdtMetadataRequest = new CreatedtMetadataRequest(); // CreatedtMetadataRequest | 
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateDtMetadata(projectId, dtId, createdtMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecisionTreeApi#updateDtMetadata");
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
| **projectId** | **String**| The ID of the project containing the dt. | |
| **dtId** | **String**| The ID of the dt to update. | |
| **createdtMetadataRequest** | [**CreatedtMetadataRequest**](CreatedtMetadataRequest.md)|  | |

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
| **201** | dt metadata updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The project or dt with the specified IDs was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |

