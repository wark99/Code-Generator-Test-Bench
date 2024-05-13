# RetrieveApi

All URIs are relative to *https://api-eseg.mindlogix.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllAreas**](RetrieveApi.md#getAllAreas) | **GET** /areas/{framework_id} |  |
| [**getAllFacts**](RetrieveApi.md#getAllFacts) | **GET** /facts/{subarea_id}/{nace} |  |
| [**getAllFrameworks**](RetrieveApi.md#getAllFrameworks) | **GET** /frameworks |  |
| [**getAllSubAreas**](RetrieveApi.md#getAllSubAreas) | **GET** /subareas/{area_id} |  |
| [**getArea**](RetrieveApi.md#getArea) | **GET** /area/{id} |  |
| [**getFact**](RetrieveApi.md#getFact) | **GET** /fact/{id} |  |
| [**getFramework**](RetrieveApi.md#getFramework) | **GET** /framework/{id} |  |
| [**getSubArea**](RetrieveApi.md#getSubArea) | **GET** /subarea/{id} |  |



## getAllAreas

> AllAreasModel getAllAreas(frameworkId)



Endpoint to get all areas

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        Integer frameworkId = 56; // Integer | ID of a framework
        try {
            AllAreasModel result = apiInstance.getAllAreas(frameworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getAllAreas");
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
| **frameworkId** | **Integer**| ID of a framework | |

### Return type

[**AllAreasModel**](AllAreasModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all areas available |  -  |


## getAllFacts

> AllFactsModel getAllFacts(nace, subareaId)



Endpoint to get all facts for a specific nace. If you dont provide nace you will get all the facts

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        String nace = "nace_example"; // String | nace code. if provided gives all facts for the given nace. otherwise gives you all facts
        String subareaId = "subareaId_example"; // String | subarea ID
        try {
            AllFactsModel result = apiInstance.getAllFacts(nace, subareaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getAllFacts");
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
| **nace** | **String**| nace code. if provided gives all facts for the given nace. otherwise gives you all facts | |
| **subareaId** | **String**| subarea ID | |

### Return type

[**AllFactsModel**](AllFactsModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all facts available |  -  |


## getAllFrameworks

> AllFrameworkModel getAllFrameworks()



Endpoint to get all available framework

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        try {
            AllFrameworkModel result = apiInstance.getAllFrameworks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getAllFrameworks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AllFrameworkModel**](AllFrameworkModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all frameworks available |  -  |


## getAllSubAreas

> AllSubAreasModel getAllSubAreas(areaId)



Endpoint to get all subareas

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        Integer areaId = 56; // Integer | ID of a framework
        try {
            AllSubAreasModel result = apiInstance.getAllSubAreas(areaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getAllSubAreas");
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
| **areaId** | **Integer**| ID of a framework | |

### Return type

[**AllSubAreasModel**](AllSubAreasModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all areas available |  -  |


## getArea

> AreaResponseModel getArea(id)



Endpoint to get specific area by ID. You find the right ID with previous endpoint

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        Integer id = 56; // Integer | ID of area.
        try {
            AreaResponseModel result = apiInstance.getArea(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getArea");
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
| **id** | **Integer**| ID of area. | |

### Return type

[**AreaResponseModel**](AreaResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all areas available |  -  |


## getFact

> FactResponseModel getFact(id)



Endpoint to get specific fact by ID. You find the right ID with previous endpoint

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        Integer id = 56; // Integer | ID of fact.
        try {
            FactResponseModel result = apiInstance.getFact(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getFact");
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
| **id** | **Integer**| ID of fact. | |

### Return type

[**FactResponseModel**](FactResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all areas available |  -  |


## getFramework

> FrameworkResponseModel getFramework(id)



Endpoint to get specific framework by ID. You find the right ID with previous endpoint

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        Integer id = 56; // Integer | ID of framework.
        try {
            FrameworkResponseModel result = apiInstance.getFramework(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getFramework");
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
| **id** | **Integer**| ID of framework. | |

### Return type

[**FrameworkResponseModel**](FrameworkResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | framework |  -  |


## getSubArea

> SubAreaResponseModel getSubArea(id)



Endpoint to get specific subarea by ID. You find the right ID with previous endpoint

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        RetrieveApi apiInstance = new RetrieveApi(defaultClient);
        Integer id = 56; // Integer | ID of subarea.
        try {
            SubAreaResponseModel result = apiInstance.getSubArea(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveApi#getSubArea");
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
| **id** | **Integer**| ID of subarea. | |

### Return type

[**SubAreaResponseModel**](SubAreaResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all areas available |  -  |

