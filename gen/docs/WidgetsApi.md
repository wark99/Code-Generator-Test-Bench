# WidgetsApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addWidget**](WidgetsApi.md#addWidget) | **POST** /widgets/ | Add widget |
| [**deleteWidget**](WidgetsApi.md#deleteWidget) | **DELETE** /widgets/{id}/ | Delete widget by id |
| [**favoriteWidget**](WidgetsApi.md#favoriteWidget) | **POST** /widgets/favorite/ | Add widget to dashboard |
| [**getWidget**](WidgetsApi.md#getWidget) | **GET** /widgets/{id}/ | Get widget by id |
| [**getWidgets**](WidgetsApi.md#getWidgets) | **GET** /widgets/{display_type}/ | Get list of widgets |
| [**updateWidget**](WidgetsApi.md#updateWidget) | **PUT** /widgets/{id}/ | Update widget |



## addWidget

> ObjectWidgetScheme addWidget(createObjectWidgetScheme)

Add widget

Add widget

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WidgetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        WidgetsApi apiInstance = new WidgetsApi(defaultClient);
        CreateObjectWidgetScheme createObjectWidgetScheme = new CreateObjectWidgetScheme(); // CreateObjectWidgetScheme | 
        try {
            ObjectWidgetScheme result = apiInstance.addWidget(createObjectWidgetScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WidgetsApi#addWidget");
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
| **createObjectWidgetScheme** | [**CreateObjectWidgetScheme**](CreateObjectWidgetScheme.md)|  | |

### Return type

[**ObjectWidgetScheme**](ObjectWidgetScheme.md)

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


## deleteWidget

> deleteWidget(id)

Delete widget by id

Delete widget by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WidgetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        WidgetsApi apiInstance = new WidgetsApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.deleteWidget(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WidgetsApi#deleteWidget");
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


## favoriteWidget

> Object favoriteWidget(widgetId, dashId)

Add widget to dashboard

Add widget to dashboard

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WidgetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        WidgetsApi apiInstance = new WidgetsApi(defaultClient);
        Integer widgetId = 56; // Integer | 
        Integer dashId = 56; // Integer | 
        try {
            Object result = apiInstance.favoriteWidget(widgetId, dashId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WidgetsApi#favoriteWidget");
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
| **widgetId** | **Integer**|  | |
| **dashId** | **Integer**|  | |

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


## getWidget

> ObjectWidgetScheme getWidget(id)

Get widget by id

Get widget by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WidgetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        WidgetsApi apiInstance = new WidgetsApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            ObjectWidgetScheme result = apiInstance.getWidget(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WidgetsApi#getWidget");
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

[**ObjectWidgetScheme**](ObjectWidgetScheme.md)

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


## getWidgets

> PageObjectWidgetScheme getWidgets(displayType, perPage, page)

Get list of widgets

Get list of widgets

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WidgetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        WidgetsApi apiInstance = new WidgetsApi(defaultClient);
        WidgetDisplayType displayType = WidgetDisplayType.fromValue("1"); // WidgetDisplayType | Status:   * 1 - Graphic     * 2 - Card   
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageObjectWidgetScheme result = apiInstance.getWidgets(displayType, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WidgetsApi#getWidgets");
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
| **displayType** | [**WidgetDisplayType**](.md)| Status:   * 1 - Graphic     * 2 - Card    | [enum: 1, 2] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageObjectWidgetScheme**](PageObjectWidgetScheme.md)

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


## updateWidget

> ObjectWidgetScheme updateWidget(id, updateObjectWidget)

Update widget

Update widget

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WidgetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        WidgetsApi apiInstance = new WidgetsApi(defaultClient);
        Integer id = 56; // Integer | 
        UpdateObjectWidget updateObjectWidget = new UpdateObjectWidget(); // UpdateObjectWidget | 
        try {
            ObjectWidgetScheme result = apiInstance.updateWidget(id, updateObjectWidget);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WidgetsApi#updateWidget");
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
| **updateObjectWidget** | [**UpdateObjectWidget**](UpdateObjectWidget.md)|  | |

### Return type

[**ObjectWidgetScheme**](ObjectWidgetScheme.md)

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

