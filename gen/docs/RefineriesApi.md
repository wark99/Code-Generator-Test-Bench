# RefineriesApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRefineriesAudits**](RefineriesApi.md#getRefineriesAudits) | **GET** /refineries_audits/ | Retrieve a list of all refinery audits submitted by Data Runners. |
| [**getRefineriesCapacities**](RefineriesApi.md#getRefineriesCapacities) | **GET** /refineries_capacities/ | Retrieve a list of the estimated capacity percentages for all refineries. |
| [**getRefineriesMethods**](RefineriesApi.md#getRefineriesMethods) | **GET** /refineries_methods/ | Retrieve a list of the refining methods used by all in-game refineries |
| [**getRefineriesYields**](RefineriesApi.md#getRefineriesYields) | **GET** /refineries_yields/ | Retrieve a list of all refineries yields bonuses per commodity |



## getRefineriesAudits

> GetRefineriesAuditsOkResponse getRefineriesAudits()

Retrieve a list of all refinery audits submitted by Data Runners.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefineriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        RefineriesApi apiInstance = new RefineriesApi(defaultClient);
        try {
            GetRefineriesAuditsOkResponse result = apiInstance.getRefineriesAudits();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefineriesApi#getRefineriesAudits");
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

[**GetRefineriesAuditsOkResponse**](GetRefineriesAuditsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getRefineriesCapacities

> GetRefineriesCapacitiesOkResponse getRefineriesCapacities()

Retrieve a list of the estimated capacity percentages for all refineries.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefineriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        RefineriesApi apiInstance = new RefineriesApi(defaultClient);
        try {
            GetRefineriesCapacitiesOkResponse result = apiInstance.getRefineriesCapacities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefineriesApi#getRefineriesCapacities");
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

[**GetRefineriesCapacitiesOkResponse**](GetRefineriesCapacitiesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getRefineriesMethods

> GetRefineriesMethodsOkResponse getRefineriesMethods()

Retrieve a list of the refining methods used by all in-game refineries

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefineriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        RefineriesApi apiInstance = new RefineriesApi(defaultClient);
        try {
            GetRefineriesMethodsOkResponse result = apiInstance.getRefineriesMethods();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefineriesApi#getRefineriesMethods");
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

[**GetRefineriesMethodsOkResponse**](GetRefineriesMethodsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getRefineriesYields

> GetRefineriesYieldsOkResponse getRefineriesYields()

Retrieve a list of all refineries yields bonuses per commodity

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefineriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        RefineriesApi apiInstance = new RefineriesApi(defaultClient);
        try {
            GetRefineriesYieldsOkResponse result = apiInstance.getRefineriesYields();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefineriesApi#getRefineriesYields");
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

[**GetRefineriesYieldsOkResponse**](GetRefineriesYieldsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

