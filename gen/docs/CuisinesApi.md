# CuisinesApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**followCuisine**](CuisinesApi.md#followCuisine) | **POST** /cuisines/{cuisineId}/follow | Follow a cuisine |
| [**getCuisineById**](CuisinesApi.md#getCuisineById) | **GET** /cuisines/{cuisineId} | Get cuisine details |



## followCuisine

> GetCuisineById200Response followCuisine(cuisineId)

Follow a cuisine

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CuisinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        CuisinesApi apiInstance = new CuisinesApi(defaultClient);
        Integer cuisineId = 56; // Integer | 
        try {
            GetCuisineById200Response result = apiInstance.followCuisine(cuisineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CuisinesApi#followCuisine");
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
| **cuisineId** | **Integer**|  | |

### Return type

[**GetCuisineById200Response**](GetCuisineById200Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - returning cuisine details |  -  |
| **400** |  |  -  |
| **404** |  |  -  |


## getCuisineById

> GetCuisineById200Response getCuisineById(cuisineId, includeDishes)

Get cuisine details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CuisinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        CuisinesApi apiInstance = new CuisinesApi(defaultClient);
        Integer cuisineId = 56; // Integer | 
        Boolean includeDishes = true; // Boolean | 
        try {
            GetCuisineById200Response result = apiInstance.getCuisineById(cuisineId, includeDishes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CuisinesApi#getCuisineById");
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
| **cuisineId** | **Integer**|  | |
| **includeDishes** | **Boolean**|  | [optional] |

### Return type

[**GetCuisineById200Response**](GetCuisineById200Response.md)

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

