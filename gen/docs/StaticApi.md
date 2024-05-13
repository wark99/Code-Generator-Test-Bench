# StaticApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCategories**](StaticApi.md#getCategories) | **GET** /categories/ | Get a list of item and service categories. |
| [**getDataParameters**](StaticApi.md#getDataParameters) | **GET** /data_parameters/ | Retrieve a list of specific parameters that UEX uses for managing prices and updates. |
| [**getTerminals**](StaticApi.md#getTerminals) | **GET** /terminals/ | Retrieve a comprehensive list of all terminals in the game, including trade terminals, item terminals, vehicle rentals, and more. |



## getCategories

> GetCategoriesOkResponse getCategories(type)

Get a list of item and service categories.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        StaticApi apiInstance = new StaticApi(defaultClient);
        String type = "type_example"; // String | 
        try {
            GetCategoriesOkResponse result = apiInstance.getCategories(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticApi#getCategories");
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
| **type** | **String**|  | [optional] |

### Return type

[**GetCategoriesOkResponse**](GetCategoriesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getDataParameters

> GetDataParametersOkResponse getDataParameters()

Retrieve a list of specific parameters that UEX uses for managing prices and updates.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        StaticApi apiInstance = new StaticApi(defaultClient);
        try {
            GetDataParametersOkResponse result = apiInstance.getDataParameters();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticApi#getDataParameters");
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

[**GetDataParametersOkResponse**](GetDataParametersOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTerminals

> GetTerminalsOkResponse getTerminals(type)

Retrieve a comprehensive list of all terminals in the game, including trade terminals, item terminals, vehicle rentals, and more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        StaticApi apiInstance = new StaticApi(defaultClient);
        String type = "type_example"; // String | 
        try {
            GetTerminalsOkResponse result = apiInstance.getTerminals(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticApi#getTerminals");
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
| **type** | **String**|  | [optional] |

### Return type

[**GetTerminalsOkResponse**](GetTerminalsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

