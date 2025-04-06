# DishApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDishById**](DishApi.md#getDishById) | **GET** /dishes/{dishId} | Get dish details |
| [**searchDishes**](DishApi.md#searchDishes) | **GET** /search/dishes | Search for dishes |



## getDishById

> GetDishById200Response getDishById(dishId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        DishApi apiInstance = new DishApi(defaultClient);
        String dishId = "dishId_example"; // String | 
        try {
            GetDishById200Response result = apiInstance.getDishById(dishId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DishApi#getDishById");
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
| **dishId** | **String**|  | |

### Return type

[**GetDishById200Response**](GetDishById200Response.md)

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


## searchDishes

> SearchDishes200Response searchDishes(q, cuisine, foodType)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        DishApi apiInstance = new DishApi(defaultClient);
        String q = "q_example"; // String | 
        String cuisine = "cuisine_example"; // String | 
        String foodType = "foodType_example"; // String | 
        try {
            SearchDishes200Response result = apiInstance.searchDishes(q, cuisine, foodType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DishApi#searchDishes");
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

[**SearchDishes200Response**](SearchDishes200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |

