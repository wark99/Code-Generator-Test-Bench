# UtilityResourcesApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConsumptionGroups**](UtilityResourcesApi.md#createConsumptionGroups) | **POST** /utility-resources/ | Add utility resource |
| [**deleteConsumptionGroup**](UtilityResourcesApi.md#deleteConsumptionGroup) | **DELETE** /utility-resources/{id}/ | Delete utility resource by id |
| [**getConsumptionGroup**](UtilityResourcesApi.md#getConsumptionGroup) | **GET** /utility-resources/{id}/ | Get utility resource by id |
| [**getConsumptionGroups**](UtilityResourcesApi.md#getConsumptionGroups) | **GET** /utility-resources/ | Get a list utility resources |
| [**updateConsumptionGroup**](UtilityResourcesApi.md#updateConsumptionGroup) | **PUT** /utility-resources/{id}/ | Update utility resource by id |



## createConsumptionGroups

> ConsumptionGroupBaseScheme createConsumptionGroups(createConsumptionGroupScheme)

Add utility resource

Add utility resource

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        UtilityResourcesApi apiInstance = new UtilityResourcesApi(defaultClient);
        CreateConsumptionGroupScheme createConsumptionGroupScheme = new CreateConsumptionGroupScheme(); // CreateConsumptionGroupScheme | 
        try {
            ConsumptionGroupBaseScheme result = apiInstance.createConsumptionGroups(createConsumptionGroupScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityResourcesApi#createConsumptionGroups");
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
| **createConsumptionGroupScheme** | [**CreateConsumptionGroupScheme**](CreateConsumptionGroupScheme.md)|  | |

### Return type

[**ConsumptionGroupBaseScheme**](ConsumptionGroupBaseScheme.md)

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


## deleteConsumptionGroup

> deleteConsumptionGroup(id)

Delete utility resource by id

Delete utility resource by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        UtilityResourcesApi apiInstance = new UtilityResourcesApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.deleteConsumptionGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityResourcesApi#deleteConsumptionGroup");
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


## getConsumptionGroup

> ConsumptionGroupBaseScheme getConsumptionGroup(id)

Get utility resource by id

Get utility resource by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        UtilityResourcesApi apiInstance = new UtilityResourcesApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            ConsumptionGroupBaseScheme result = apiInstance.getConsumptionGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityResourcesApi#getConsumptionGroup");
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

### Return type

[**ConsumptionGroupBaseScheme**](ConsumptionGroupBaseScheme.md)

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


## getConsumptionGroups

> PageConsumptionGroupBaseScheme getConsumptionGroups(status, text, perPage, page)

Get a list utility resources

Get a list utility resources

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        UtilityResourcesApi apiInstance = new UtilityResourcesApi(defaultClient);
        Status status = Status.fromValue("1"); // Status | Status:   * 1 - Inactive     * 2 - Active   
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageConsumptionGroupBaseScheme result = apiInstance.getConsumptionGroups(status, text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityResourcesApi#getConsumptionGroups");
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
| **status** | [**Status**](.md)| Status:   * 1 - Inactive     * 2 - Active    | [optional] [enum: 1, 2] |
| **text** | **String**| text value for search by name | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageConsumptionGroupBaseScheme**](PageConsumptionGroupBaseScheme.md)

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


## updateConsumptionGroup

> ConsumptionGroupBaseScheme updateConsumptionGroup(id, createConsumptionGroupScheme)

Update utility resource by id

Update utility resource by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        UtilityResourcesApi apiInstance = new UtilityResourcesApi(defaultClient);
        Integer id = 56; // Integer | 
        CreateConsumptionGroupScheme createConsumptionGroupScheme = new CreateConsumptionGroupScheme(); // CreateConsumptionGroupScheme | 
        try {
            ConsumptionGroupBaseScheme result = apiInstance.updateConsumptionGroup(id, createConsumptionGroupScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityResourcesApi#updateConsumptionGroup");
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
| **createConsumptionGroupScheme** | [**CreateConsumptionGroupScheme**](CreateConsumptionGroupScheme.md)|  | |

### Return type

[**ConsumptionGroupBaseScheme**](ConsumptionGroupBaseScheme.md)

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
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |

