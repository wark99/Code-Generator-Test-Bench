# DataApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataDevice**](DataApi.md#getDataDevice) | **GET** /data/device/{id}/ | Get device data |
| [**getDataObject**](DataApi.md#getDataObject) | **GET** /data/object/ | Get object data |
| [**getLastDataObject**](DataApi.md#getLastDataObject) | **GET** /data/object/last-data/ | Get object last data |



## getDataDevice

> PageDeviceDataScheme getDataDevice(id, startDate, endDate, period, perPage, page)

Get device data

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");

        DataApi apiInstance = new DataApi(defaultClient);
        Integer id = 56; // Integer | unique device id
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start date of filtering period (format YYYY-MM-DDThh:mm:ss)
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end date of filtering period (format YYYY-MM-DDThh:mm:ss)
        Period period = Period.fromValue("0"); // Period | Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month    
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageDeviceDataScheme result = apiInstance.getDataDevice(id, startDate, endDate, period, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#getDataDevice");
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
| **id** | **Integer**| unique device id | |
| **startDate** | **OffsetDateTime**| start date of filtering period (format YYYY-MM-DDThh:mm:ss) | [optional] |
| **endDate** | **OffsetDateTime**| end date of filtering period (format YYYY-MM-DDThh:mm:ss) | [optional] |
| **period** | [**Period**](.md)| Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month     | [optional] [default to 0] [enum: 0, 1, 2, 3, 4] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageDeviceDataScheme**](PageDeviceDataScheme.md)

### Authorization

No authorization required

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


## getDataObject

> PageObjectDataScheme getDataObject(objIds, startDate, endDate, datePeriod, perPage, page)

Get object data

Get object data

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataApi apiInstance = new DataApi(defaultClient);
        List<Integer> objIds = Arrays.asList(); // List<Integer> | Unique object ids
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start date of filtering period (format YYYY-MM-DDThh:mm:ss)
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | start date of filtering period (format YYYY-MM-DDThh:mm:ss)
        Period datePeriod = Period.fromValue("0"); // Period | Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month    
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageObjectDataScheme result = apiInstance.getDataObject(objIds, startDate, endDate, datePeriod, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#getDataObject");
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
| **objIds** | [**List&lt;Integer&gt;**](Integer.md)| Unique object ids | |
| **startDate** | **OffsetDateTime**| start date of filtering period (format YYYY-MM-DDThh:mm:ss) | |
| **endDate** | **OffsetDateTime**| start date of filtering period (format YYYY-MM-DDThh:mm:ss) | |
| **datePeriod** | [**Period**](.md)| Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month     | [optional] [default to 0] [enum: 0, 1, 2, 3, 4] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageObjectDataScheme**](PageObjectDataScheme.md)

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


## getLastDataObject

> PageObjectLastDataScheme getLastDataObject(objIds, perPage, page)

Get object last data

Get object last data

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataApi apiInstance = new DataApi(defaultClient);
        List<Integer> objIds = Arrays.asList(); // List<Integer> | Unique object ids
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageObjectLastDataScheme result = apiInstance.getLastDataObject(objIds, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#getLastDataObject");
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
| **objIds** | [**List&lt;Integer&gt;**](Integer.md)| Unique object ids | |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageObjectLastDataScheme**](PageObjectLastDataScheme.md)

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

