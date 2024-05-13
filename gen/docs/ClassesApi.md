# ClassesApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClass**](ClassesApi.md#getClass) | **GET** /classes/{classId} | Get a class |
| [**getClassCosts**](ClassesApi.md#getClassCosts) | **GET** /classes/costs | List class costs |
| [**getClasses**](ClassesApi.md#getClasses) | **GET** /classes | List classes |



## getClass

> GetClass200Response getClass(classId)

Get a class

Retrieve the class.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClassesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        ClassesApi apiInstance = new ClassesApi(defaultClient);
        String classId = "classId_example"; // String | 
        try {
            GetClass200Response result = apiInstance.getClass(classId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClassesApi#getClass");
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
| **classId** | **String**|  | |

### Return type

[**GetClass200Response**](GetClass200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Class object. |  -  |
| **404** | Class not found. |  -  |


## getClassCosts

> List&lt;Integer&gt; getClassCosts(filterTerm)

List class costs

Retrieve a list of class costs.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClassesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        ClassesApi apiInstance = new ClassesApi(defaultClient);
        Integer filterTerm = 56; // Integer | ID of the term
        try {
            List<Integer> result = apiInstance.getClassCosts(filterTerm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClassesApi#getClassCosts");
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
| **filterTerm** | **Integer**| ID of the term | [optional] |

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of lesson costs, in pence format, associated to the classes in the given term. |  -  |


## getClasses

> GetClasses200Response getClasses(filterOrganiser, filterTerm, filterVenue, filterStage, filterAgeInterval, filterAgeMin, filterAgeMax, filterAbility, filterActivity, filterDay, filterSearch, page, limit)

List classes

Retrieve a list of classes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClassesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        ClassesApi apiInstance = new ClassesApi(defaultClient);
        Integer filterOrganiser = 56; // Integer | ID of the organiser
        Integer filterTerm = 56; // Integer | ID of the term
        Integer filterVenue = 56; // Integer | ID of the venue
        Integer filterStage = 56; // Integer | ID of the stage
        String filterAgeInterval = "filterAgeInterval_example"; // String | Interval between the min and max age i.e. month, year
        Integer filterAgeMin = 56; // Integer | Minimum age threshold
        Integer filterAgeMax = 56; // Integer | Maximum age threshold
        Integer filterAbility = 56; // Integer | ID of the ability
        Integer filterActivity = 56; // Integer | ID of the activity
        String filterDay = "filterDay_example"; // String | Numerical day of the week i.e. 1 = Sunday, 2 = Monday etc.
        String filterSearch = "filterSearch_example"; // String | Phrase to match the class name, venue name and organiser name
        Integer page = 56; // Integer | Pagination page number
        Integer limit = 56; // Integer | Pagination page limit
        try {
            GetClasses200Response result = apiInstance.getClasses(filterOrganiser, filterTerm, filterVenue, filterStage, filterAgeInterval, filterAgeMin, filterAgeMax, filterAbility, filterActivity, filterDay, filterSearch, page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClassesApi#getClasses");
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
| **filterOrganiser** | **Integer**| ID of the organiser | [optional] |
| **filterTerm** | **Integer**| ID of the term | [optional] |
| **filterVenue** | **Integer**| ID of the venue | [optional] |
| **filterStage** | **Integer**| ID of the stage | [optional] |
| **filterAgeInterval** | **String**| Interval between the min and max age i.e. month, year | [optional] |
| **filterAgeMin** | **Integer**| Minimum age threshold | [optional] |
| **filterAgeMax** | **Integer**| Maximum age threshold | [optional] |
| **filterAbility** | **Integer**| ID of the ability | [optional] |
| **filterActivity** | **Integer**| ID of the activity | [optional] |
| **filterDay** | **String**| Numerical day of the week i.e. 1 &#x3D; Sunday, 2 &#x3D; Monday etc. | [optional] |
| **filterSearch** | **String**| Phrase to match the class name, venue name and organiser name | [optional] |
| **page** | **Integer**| Pagination page number | [optional] |
| **limit** | **Integer**| Pagination page limit | [optional] |

### Return type

[**GetClasses200Response**](GetClasses200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Class objects. |  -  |

