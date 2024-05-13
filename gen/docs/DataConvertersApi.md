# DataConvertersApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyConvGroup**](DataConvertersApi.md#copyConvGroup) | **POST** /data-converters-group/{id}/copy/ | Copy converter group by id |
| [**createDataConverter**](DataConvertersApi.md#createDataConverter) | **POST** /data-converters-group/{conv_gr_id}/data-converters/ | Add data converter |
| [**createDataConverterGroup**](DataConvertersApi.md#createDataConverterGroup) | **POST** /data-converters-group/ | Add data converter group |
| [**deleteDataConverter**](DataConvertersApi.md#deleteDataConverter) | **DELETE** /data-converters-group/{conv_gr_id}/data-converters/{id}/ | Delete data converter by id |
| [**deleteDataConverterGroup**](DataConvertersApi.md#deleteDataConverterGroup) | **DELETE** /data-converters-group/{id}/ | Delete data converter group by id |
| [**getDataConverter**](DataConvertersApi.md#getDataConverter) | **GET** /data-converters-group/{conv_gr_id}/data-converters/{id}/ | Get data converter by id |
| [**getDataConverterGroup**](DataConvertersApi.md#getDataConverterGroup) | **GET** /data-converters-group/{id}/ | Get data converter group by id |
| [**getDataConverterGroups**](DataConvertersApi.md#getDataConverterGroups) | **GET** /data-converters-group/ | Get a list of data converter groups |
| [**getDataConverters**](DataConvertersApi.md#getDataConverters) | **GET** /data-converters-group/{conv_gr_id}/data-converters/ | Get a list of data converters |
| [**setFeatures**](DataConvertersApi.md#setFeatures) | **POST** /data-converters-group/{id}/features/ | Set features to converter group |
| [**updateDataConverter**](DataConvertersApi.md#updateDataConverter) | **PUT** /data-converters-group/{conv_gr_id}/data-converters/{id}/ | Update data converter by id |
| [**updateDataConverterGroup**](DataConvertersApi.md#updateDataConverterGroup) | **PUT** /data-converters-group/{id}/ | Update data converter group by id |



## copyConvGroup

> Object copyConvGroup(id)

Copy converter group by id

Copy converter group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.copyConvGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#copyConvGroup");
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
| **id** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## createDataConverter

> Object createDataConverter(convGrId)

Add data converter

Add data converter

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer convGrId = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.createDataConverter(convGrId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#createDataConverter");
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
| **convGrId** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## createDataConverterGroup

> ConverterGroupBaseSchemeOutput createDataConverterGroup(createConverterGroupScheme)

Add data converter group

Add data converter group

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        CreateConverterGroupScheme createConverterGroupScheme = new CreateConverterGroupScheme(); // CreateConverterGroupScheme | 
        try {
            ConverterGroupBaseSchemeOutput result = apiInstance.createDataConverterGroup(createConverterGroupScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#createDataConverterGroup");
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
| **createConverterGroupScheme** | [**CreateConverterGroupScheme**](CreateConverterGroupScheme.md)|  | |

### Return type

[**ConverterGroupBaseSchemeOutput**](ConverterGroupBaseSchemeOutput.md)

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


## deleteDataConverter

> Object deleteDataConverter(id, convGrId)

Delete data converter by id

Delete data converter by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | unique object type id
        Integer convGrId = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.deleteDataConverter(id, convGrId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#deleteDataConverter");
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
| **id** | **Integer**| unique object type id | |
| **convGrId** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## deleteDataConverterGroup

> deleteDataConverterGroup(id)

Delete data converter group by id

Delete data converter group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.deleteDataConverterGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#deleteDataConverterGroup");
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


## getDataConverter

> Object getDataConverter(id, convGrId)

Get data converter by id

Get data converter by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | unique object type id
        Integer convGrId = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.getDataConverter(id, convGrId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#getDataConverter");
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
| **id** | **Integer**| unique object type id | |
| **convGrId** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## getDataConverterGroup

> ConverterGroupBaseSchemeOutput getDataConverterGroup(id)

Get data converter group by id

Get data converter group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            ConverterGroupBaseSchemeOutput result = apiInstance.getDataConverterGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#getDataConverterGroup");
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

[**ConverterGroupBaseSchemeOutput**](ConverterGroupBaseSchemeOutput.md)

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


## getDataConverterGroups

> PageConverterGroupBaseScheme getDataConverterGroups(status, text, perPage, page)

Get a list of data converter groups

Get a list of data converter groups

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Status status = Status.fromValue("1"); // Status | Status:   * 1 - Inactive     * 2 - Active   
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageConverterGroupBaseScheme result = apiInstance.getDataConverterGroups(status, text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#getDataConverterGroups");
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

[**PageConverterGroupBaseScheme**](PageConverterGroupBaseScheme.md)

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


## getDataConverters

> Object getDataConverters(convGrId)

Get a list of data converters

Get a list of data converters

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer convGrId = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.getDataConverters(convGrId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#getDataConverters");
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
| **convGrId** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## setFeatures

> Object setFeatures(id)

Set features to converter group

Set features to converter group

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.setFeatures(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#setFeatures");
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
| **id** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## updateDataConverter

> Object updateDataConverter(id, convGrId)

Update data converter by id

Update data converter by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | unique object type id
        Integer convGrId = 56; // Integer | unique object type id
        try {
            Object result = apiInstance.updateDataConverter(id, convGrId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#updateDataConverter");
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
| **id** | **Integer**| unique object type id | |
| **convGrId** | **Integer**| unique object type id | |

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
| **422** | Validation Error |  -  |


## updateDataConverterGroup

> ConverterGroupBaseSchemeOutput updateDataConverterGroup(id, converterGroupBaseSchemeInput)

Update data converter group by id

Update data converter group by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataConvertersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DataConvertersApi apiInstance = new DataConvertersApi(defaultClient);
        Integer id = 56; // Integer | 
        ConverterGroupBaseSchemeInput converterGroupBaseSchemeInput = new ConverterGroupBaseSchemeInput(); // ConverterGroupBaseSchemeInput | 
        try {
            ConverterGroupBaseSchemeOutput result = apiInstance.updateDataConverterGroup(id, converterGroupBaseSchemeInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataConvertersApi#updateDataConverterGroup");
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
| **converterGroupBaseSchemeInput** | [**ConverterGroupBaseSchemeInput**](ConverterGroupBaseSchemeInput.md)|  | |

### Return type

[**ConverterGroupBaseSchemeOutput**](ConverterGroupBaseSchemeOutput.md)

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

