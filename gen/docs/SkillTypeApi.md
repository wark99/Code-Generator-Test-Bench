# SkillTypeApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSkillType**](SkillTypeApi.md#createSkillType) | **POST** /api/v1/skill-types | Create Skill Type |
| [**deleteSkillTypes**](SkillTypeApi.md#deleteSkillTypes) | **DELETE** /api/v1/skill-types/{id} | Delete Skill Type by ID |
| [**getAllSkillTypes**](SkillTypeApi.md#getAllSkillTypes) | **GET** /api/v1/skill-types | Get Skill Types |
| [**updateSkillTypes**](SkillTypeApi.md#updateSkillTypes) | **PATCH** /api/v1/skill-types/{id} | Update Skill Type by ID |



## createSkillType

> SkillType createSkillType(skillTypeUpdate)

Create Skill Type

Create a new skill type.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SkillTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SkillTypeApi apiInstance = new SkillTypeApi(defaultClient);
        SkillTypeUpdate skillTypeUpdate = new SkillTypeUpdate(); // SkillTypeUpdate | 
        try {
            SkillType result = apiInstance.createSkillType(skillTypeUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SkillTypeApi#createSkillType");
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
| **skillTypeUpdate** | [**SkillTypeUpdate**](SkillTypeUpdate.md)|  | |

### Return type

[**SkillType**](SkillType.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Skill Type created successfully |  -  |
| **400** | Bad Request |  -  |


## deleteSkillTypes

> deleteSkillTypes(id)

Delete Skill Type by ID

Delete a skill type by its unique ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SkillTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SkillTypeApi apiInstance = new SkillTypeApi(defaultClient);
        String id = "id_example"; // String | ID of the skill type to delete
        try {
            apiInstance.deleteSkillTypes(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SkillTypeApi#deleteSkillTypes");
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
| **id** | **String**| ID of the skill type to delete | |

### Return type

null (empty response body)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Skill Type deleted successfully |  -  |
| **404** | Not Found |  -  |


## getAllSkillTypes

> List&lt;SkillType&gt; getAllSkillTypes(page, limit, sortBy, sortOrder)

Get Skill Types

Retrieve a list of skill types with optional filtering and pagination.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SkillTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SkillTypeApi apiInstance = new SkillTypeApi(defaultClient);
        Integer page = 1; // Integer | Page number (optional, default: 1, can't be negative). 
        Integer limit = 10; // Integer | Number of items per page (optional, default: 10, max: 100). 
        String sortBy = "modifiedOn"; // String | Field to sort by (optional, default: modifiedOn). 
        String sortOrder = "asc"; // String | Sort order (optional, default: desc). 
        try {
            List<SkillType> result = apiInstance.getAllSkillTypes(page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SkillTypeApi#getAllSkillTypes");
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
| **page** | **Integer**| Page number (optional, default: 1, can&#39;t be negative).  | [optional] [default to 1] |
| **limit** | **Integer**| Number of items per page (optional, default: 10, max: 100).  | [optional] [default to 10] |
| **sortBy** | **String**| Field to sort by (optional, default: modifiedOn).  | [optional] [default to modifiedOn] [enum: modifiedOn] |
| **sortOrder** | **String**| Sort order (optional, default: desc).  | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**List&lt;SkillType&gt;**](SkillType.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Skill Types retrieved successfully |  -  |
| **400** | Bad Request |  -  |


## updateSkillTypes

> SkillTypeUpdate updateSkillTypes(id, skillType)

Update Skill Type by ID

Update a skill type by its unique ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SkillTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SkillTypeApi apiInstance = new SkillTypeApi(defaultClient);
        String id = "id_example"; // String | ID of the skill type to update
        SkillType skillType = new SkillType(); // SkillType | 
        try {
            SkillTypeUpdate result = apiInstance.updateSkillTypes(id, skillType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SkillTypeApi#updateSkillTypes");
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
| **id** | **String**| ID of the skill type to update | |
| **skillType** | [**SkillType**](SkillType.md)|  | |

### Return type

[**SkillTypeUpdate**](SkillTypeUpdate.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Skill Type updated successfully |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

