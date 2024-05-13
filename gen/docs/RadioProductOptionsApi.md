# RadioProductOptionsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdOptionsGet**](RadioProductOptionsApi.md#call1radiosRadioProductIdOptionsGet) | **GET** /1/radios/{radio_product_id}/options | List radio product options |



## call1radiosRadioProductIdOptionsGet

> Model1RadiosRadioProductIdOptionsGet200Response call1radiosRadioProductIdOptionsGet(radioProductId)

List radio product options

This endpoint allows you to retrieve all the option attach to a radio product.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadioProductOptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RadioProductOptionsApi apiInstance = new RadioProductOptionsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        try {
            Model1RadiosRadioProductIdOptionsGet200Response result = apiInstance.call1radiosRadioProductIdOptionsGet(radioProductId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RadioProductOptionsApi#call1radiosRadioProductIdOptionsGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |

### Return type

[**Model1RadiosRadioProductIdOptionsGet200Response**](Model1RadiosRadioProductIdOptionsGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

