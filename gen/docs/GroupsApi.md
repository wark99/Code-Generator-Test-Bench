# GroupsApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGroup**](GroupsApi.md#addGroup) | **POST** /groups/{type}/ | Add group |
| [**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{type}/{id}/ | Delete group by id |
| [**getGroup**](GroupsApi.md#getGroup) | **GET** /groups/{type}/{id}/ | Get group by id |
| [**getGroups**](GroupsApi.md#getGroups) | **GET** /groups/{type}/ | Get a list of groups |
| [**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{type}/{id}/ | Update group by id |



## addGroup

> GroupFullStructScheme addGroup(type, createGroupScheme)

Add group

Add group

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        GroupType type = GroupType.fromValue("1"); // GroupType | Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup   
        CreateGroupScheme createGroupScheme = new CreateGroupScheme(); // CreateGroupScheme | 
        try {
            GroupFullStructScheme result = apiInstance.addGroup(type, createGroupScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#addGroup");
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
| **type** | [**GroupType**](.md)| Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup    | [enum: 1, 2, 3] |
| **createGroupScheme** | [**CreateGroupScheme**](CreateGroupScheme.md)|  | |

### Return type

[**GroupFullStructScheme**](GroupFullStructScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## deleteGroup

> deleteGroup(type, id)

Delete group by id

Delete group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        GroupType type = GroupType.fromValue("1"); // GroupType | Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup   
        Integer id = 56; // Integer | unique group id
        try {
            apiInstance.deleteGroup(type, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#deleteGroup");
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
| **type** | [**GroupType**](.md)| Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup    | [enum: 1, 2, 3] |
| **id** | **Integer**| unique group id | |

### Return type

null (empty response body)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## getGroup

> GroupFullStructScheme getGroup(id, type)

Get group by id

Get group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Integer id = 56; // Integer | 
        GroupType type = GroupType.fromValue("1"); // GroupType | Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup   
        try {
            GroupFullStructScheme result = apiInstance.getGroup(id, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroup");
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
| **id** | **Integer**|  | |
| **type** | [**GroupType**](.md)| Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup    | [enum: 1, 2, 3] |

### Return type

[**GroupFullStructScheme**](GroupFullStructScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## getGroups

> PageGroupScheme getGroups(type, status, text, perPage, page)

Get a list of groups

Get a list of groups

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        GroupType type = GroupType.fromValue("1"); // GroupType | Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup   
        Status status = Status.fromValue("1"); // Status | Status:   * 1 - Inactive     * 2 - Active   
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageGroupScheme result = apiInstance.getGroups(type, status, text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroups");
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
| **type** | [**GroupType**](.md)| Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup    | [enum: 1, 2, 3] |
| **status** | [**Status**](.md)| Status:   * 1 - Inactive     * 2 - Active    | [optional] [enum: 1, 2] |
| **text** | **String**| text value for search by name | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageGroupScheme**](PageGroupScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## updateGroup

> Object updateGroup(id, type)

Update group by id

Update group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Integer id = 56; // Integer | unique group id
        GroupType type = GroupType.fromValue("1"); // GroupType | Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup   
        try {
            Object result = apiInstance.updateGroup(id, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#updateGroup");
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
| **id** | **Integer**| unique group id | |
| **type** | [**GroupType**](.md)| Group type:   * 1 - DeviceGroup     * 2 - ObjectGroup     * 3 - ObjectMetricGroup    | [enum: 1, 2, 3] |

### Return type

**Object**

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |

