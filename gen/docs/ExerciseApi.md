# ExerciseApi

All URIs are relative to *https://api.perch.fit*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filterExercises**](ExerciseApi.md#filterExercises) | **POST** /v3/exercises | Filter exercises |
| [**getExercises**](ExerciseApi.md#getExercises) | **GET** /v3/exercises | Get Exercises |



## filterExercises

> FilterExercisesResponse filterExercises(filterExercisesParams)

Filter exercises

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExerciseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        ExerciseApi apiInstance = new ExerciseApi(defaultClient);
        FilterExercisesParams filterExercisesParams = new FilterExercisesParams(); // FilterExercisesParams | Parameters on which to filter exercises. Without any filters, Exercises returned implicity include all those available to the requester.
        try {
            FilterExercisesResponse result = apiInstance.filterExercises(filterExercisesParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseApi#filterExercises");
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
| **filterExercisesParams** | [**FilterExercisesParams**](FilterExercisesParams.md)| Parameters on which to filter exercises. Without any filters, Exercises returned implicity include all those available to the requester. | [optional] |

### Return type

[**FilterExercisesResponse**](FilterExercisesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |


## getExercises

> FilterExercisesResponse getExercises()

Get Exercises

Get all Exercises for the requester&#39;s organization. Same effect as POST /v3/exercises with an empty body.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExerciseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.perch.fit");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        ExerciseApi apiInstance = new ExerciseApi(defaultClient);
        try {
            FilterExercisesResponse result = apiInstance.getExercises();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExerciseApi#getExercises");
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

[**FilterExercisesResponse**](FilterExercisesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **429** |  |  -  |

