# DishApi

All URIs are relative to *https://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dishesDishIdGet**](DishApi.md#dishesDishIdGet) | **GET** /dishes/{dishId} | Get dish details |
| [**searchDishesGet**](DishApi.md#searchDishesGet) | **GET** /search/dishes | Search for dishes |



## dishesDishIdGet

> DishesDishIdGet200Response dishesDishIdGet(dishId)

Get dish details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DishApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        DishApi apiInstance = new DishApi(defaultClient);
        Integer dishId = 56; // Integer | 
        try {
            DishesDishIdGet200Response result = apiInstance.dishesDishIdGet(dishId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DishApi#dishesDishIdGet");
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
| **dishId** | **Integer**|  | |

### Return type

[**DishesDishIdGet200Response**](DishesDishIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |


## searchDishesGet

> SearchDishesGet200Response searchDishesGet(q, cuisine, foodType)

Search for dishes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DishApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        DishApi apiInstance = new DishApi(defaultClient);
        String q = "q_example"; // String | 
        String cuisine = "cuisine_example"; // String | 
        String foodType = "foodType_example"; // String | 
        try {
            SearchDishesGet200Response result = apiInstance.searchDishesGet(q, cuisine, foodType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DishApi#searchDishesGet");
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
| **q** | **String**|  | [optional] |
| **cuisine** | **String**|  | [optional] |
| **foodType** | **String**|  | [optional] |

### Return type

[**SearchDishesGet200Response**](SearchDishesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

